/*
 * SqlMetaIf.java
 *
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */

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
 * SqlMetaIf 
 *     {? SqlMetaLogExpr | SqlMetaIfItem | SqlMetaIfItem...}
 * </pre>
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlMetaIf implements SqlMetaElement {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * The list of maximum 2 sub-elements based on ANTLR grammar.
     */
    List<SqlMetaIfItem> elements;
    /**
     * The logical expression. Based on the value of this expression the first or the second sub-element will become a
     * part of the final ANSI SQL.
     */
    SqlMetaLogExpr expression;

    /**
     * Creates a new instance. It's used from inside ANTLR parser.
     */
    SqlMetaIf() {
        this.elements = new ArrayList<SqlMetaIfItem>();
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
     * Sets a logical expression. It's used from inside ANTLR parser. Based on the value of this expression the first or
     * the second sub-element will become a part of the final ANSI SQL.
     * 
     * @param expression
     *            the new value of logical expression
     */
    void setExpression(SqlMetaLogExpr expression) {
        this.expression = expression;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlProcessResult process(SqlProcessContext ctx) {
        SqlProcessResult result = new SqlProcessResult(ctx);
        result.addFalse();
        StringBuilder s = new StringBuilder();
        result.setSql(s);
        SqlMetaIfItem item = null;
        if (this.expression.processExpression(ctx)) {
            if (this.elements.size() > 0)
                item = this.elements.get(0);
        } else {
            if (this.elements.size() > 1)
                item = this.elements.get(1);
        }

        if (item != null) {
            SqlProcessResult itemResult = item.process(ctx);
            if (itemResult.isAdd()) {
                s.append(itemResult.getSql());
                result.addInputValues(itemResult.getInputValues());
                result.addMappedInputValues(itemResult.getMappedInputValues());
                result.addOutputValues(itemResult.getOutputValues());
                result.addIdentities(itemResult.getIdentities());
                result.addOutValues(itemResult.getOutValues());
                result.addTrue();
            }
        }
        return result;
    }
}
