package org.sqlproc.engine.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A META SQL sub-element.
 * 
 * <p>
 * Schematically:
 * 
 * <pre>
 * SqlMetaSqlFragment 
 *     {= IDENT SqlMetaIfItem}
 * </pre>
 * 
 * where IDENT can be
 * <ul>
 * <li> <code>where</code> for WHERE fragment of the final SQL query/statement
 * <li> <code>set</code> for WHERE fragment of the final SQL update statement
 * <li> <code>values</code> for WHERE fragment of the final SQL insert statement
 * </ul>
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlMetaSqlFragment implements SqlMetaElement {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());
    static final Pattern patternWhere = Pattern.compile("\\s*(and|AND|or|OR)?\\s*(.*)\\s*");
    static final Pattern patternValues = Pattern.compile("\\s*\\(?\\s*,?\\s*(.*?)\\s*,?\\s*\\)?\\s*");
    static final Pattern patternSet = Pattern.compile("\\s*,?\\s*(.*?)\\s*,?\\s*");

    /**
     * The enumeration of types. These types are based on the prefix if this element: <code>{==</code> and
     * <code>{=</code>.
     */
    static enum Type {
        /**
         * The type for the element prefix <code>{= where</code>.
         */
        WHERE,
        /**
         * The type for the element prefix <code>{= set</code>.
         */
        SET,
        /**
         * The type for the element prefix <code>{= values</code>.
         */
        VALUES
    };

    /**
     * The list of sub-elements based on ANTLR grammar.
     */
    List<SqlMetaIfItem> elements;
    /**
     * The type if this element. It controls, how the related ANSI SQL fragment is added to the final ANSI SQL.
     */
    Type type = null;

    /**
     * Creates a new instance. It's used from inside ANTLR parser.
     * 
     * @param type
     *            the type, which is used to control, how the related ANSI SQL fragment is added to the final ANSI SQL.
     */
    SqlMetaSqlFragment(Type type) {
        this.elements = new ArrayList<SqlMetaIfItem>();
        this.type = type;
    }

    /**
     * Creates a new instance. It's used from inside ANTLR parser.
     * 
     * @param type
     *            the type, which is used to control, how the related ANSI SQL fragment is added to the final ANSI SQL.
     */
    SqlMetaSqlFragment(String type) {
        this(Type.valueOf(type.toUpperCase()));
    }

    /**
     * Adds a new sub-element. It's used from inside ANTLR parser.
     * 
     * @param element
     *            new sub-element, based on ANTLR grammar
     */
    void addElement(SqlMetaIfItem element) {
        elements.add(element);
    }

    /**
     * Handle the SQL fragment based on the statement type and/or the {@link Type}.
     * 
     * @param s
     *            a buffer for the generated SQL statement
     * @param ctx
     *            the crate for all input parameters and the context of processing
     */
    void handleSqlFragment(StringBuilder s, SqlProcessContext ctx) {
        if (type == Type.WHERE) {
            Matcher matcher = patternWhere.matcher(s);
            if (!matcher.matches()) {
                return;
            }
            String rest = matcher.group(2);
            s.delete(0, s.length());
            s.append(WHERE_PREFIX).append(rest);

        } else if (type == Type.SET && ctx.sqlStatementType == SqlMetaStatement.Type.UPDATE) {
            Matcher matcher = patternSet.matcher(s);
            String fragment = (matcher.matches()) ? matcher.group(1) : s.toString();
            s.delete(0, s.length());
            s.append(SET_PREFIX).append(fragment);

        } else if (type == Type.VALUES && ctx.sqlStatementType == SqlMetaStatement.Type.CREATE) {
            Matcher matcher = patternValues.matcher(s);
            String fragment = (matcher.matches()) ? matcher.group(1) : s.toString();
            s.delete(0, s.length());
            s.append(VALUES_PREFIX).append("(").append(fragment).append(")");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlProcessResult process(SqlProcessContext ctx) {
        SqlProcessResult result = new SqlProcessResult();
        result.setSql(new StringBuilder());
        if (type == Type.SET || type == Type.VALUES)
            ctx.inSqlSetOrInsert = true;
        for (SqlMetaIfItem item : this.elements) {
            SqlProcessResult itemResult = item.process(ctx);
            if (itemResult.isAdd()) {
                result.getSql().append(itemResult.getSql());
                result.addInputValues(itemResult.getInputValues());
                result.addMappedInputValues(itemResult.getMappedInputValues());
                result.addOutputValues(itemResult.getOutputValues());
                result.addIdentities(itemResult.getIdentities());
                result.addOutValues(itemResult.getOutValues());
                result.addTrue();
            }
        }
        if (result.isAdd()) {
            handleSqlFragment(result.getSql(), ctx);
        }
        ctx.inSqlSetOrInsert = false;
        return result;
    }
}
