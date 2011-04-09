package org.sqlproc.engine.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A META SQL sub-element.
 * 
 * <p>
 * Schematically:
 * 
 * <pre>
 * SqlMetaAndOr 
 *     { SqlMetaIfItem | SqlMetaIfItem...}
 *     {& SqlMetaIfItem | SqlMetaIfItem...}
 *     {| SqlMetaIfItem | SqlMetaIfItem...}
 * </pre>
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlMetaAndOr implements SqlMetaElement {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * The enumeration of types. These types are based on the prefix if this element: <code>{</code>, <code>{&</code>
     * and <code>{|</code>.
     */
    static enum Type {
        /**
         * The type for the element prefix <code>{</code>.
         */
        NO,
        /**
         * The type for the element prefix <code>{&</code>.
         */
        AND,
        /**
         * The type for the element prefix <code>{|</code>.
         */
        OR
    };

    /**
     * The list of sub-elements based on ANTLR grammar.
     */
    List<SqlMetaIfItem> elements;
    /**
     * The type if this element. It controls, how the related ANSI SQL fragment is added to the final ANSI SQL.
     */
    Type type = Type.NO;

    /**
     * Creates a new instance. It's used from inside ANTLR parser.
     * 
     * @param type
     *            the type, which is used to control, how the related ANSI SQL fragment is added to the final ANSI SQL.
     */
    SqlMetaAndOr(Type type) {
        this.elements = new ArrayList<SqlMetaIfItem>();
        this.type = type;
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
     * Returns one of the next ANSI SQL fragments: <code> </code>, <code>AND</code> or <code>OR</code>.
     * 
     * @return the ANSI SQL fragment based on the type of this element
     */
    String getPrefix() {
        String operator = "";
        if (type == Type.AND) {
            operator = AND_PREFIX;
        } else if (type == Type.OR) {
            operator = OR_PREFIX;
        }
        return operator;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlProcessResult process(SqlProcessContext ctx) {
        SqlProcessResult result = new SqlProcessResult();
        result.addFalse();
        StringBuilder s = new StringBuilder(this.getPrefix());
        result.setSql(s);
        for (SqlMetaIfItem item : this.elements) {
            if (!result.isAdd()) {
                SqlProcessResult itemResult = item.process(ctx);
                if (itemResult.isAdd()) {
                    s.append(itemResult.getSql());
                    result.addInputValues(itemResult.getInputValues());
                    result.addMappedInputValues(itemResult.getMappedInputValues());
                    result.addOutputValues(itemResult.getOutputValues());
                    result.addIdentities(itemResult.getIdentities());
                    result.addTrue();
                }
            }
        }
        return result;
    }
}
