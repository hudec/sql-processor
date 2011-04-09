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
 * SqlMetaLogExpr
 *     SqlMetaIdent
 *     SqlMetaConst
 *     SqlMetaLogOperator
 *     SqlMetaLogExpr for embedded ()
 * </pre>
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlMetaLogExpr implements SqlMetaElement, SqlMetaLogOperand {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * The indicator, which reverses the final logical value.
     */
    private boolean not;
    /**
     * The list of sub-elements based on ANTLR grammar. The evaluation of these sub-elements is little bit different
     * compared to the evaluation of sub-elements in other SqlMetaXXX components. Every sub-element must bu true, not
     * not-empty.
     */
    List<SqlMetaLogOperand> elements;

    /**
     * Creates a new instance. It's used from inside ANTLR parser.
     */
    SqlMetaLogExpr() {
        this.elements = new ArrayList<SqlMetaLogOperand>();
        this.not = false;
    }

    /**
     * Creates a new instance of this entity. Used from inside ANTLR parser.
     * 
     * @param not
     *            the indicator, which reverses the final logical value
     */
    SqlMetaLogExpr(boolean not) {
        this.elements = new ArrayList<SqlMetaLogOperand>();
        this.not = not;
    }

    /**
     * Adds a new sub-element. It's used from inside ANTLR parser.
     * 
     * @param element
     *            new sub-element, based on ANTLR grammar
     */
    void addElement(SqlMetaLogOperand element) {
        elements.add(element);
    }

    /**
     * Returns the indicator, which reverses the final logical value.
     * 
     * @return the indicator value
     */
    boolean isNot() {
        return not;
    }

    /**
     * Sets the indicator, which reverses the final logical value.
     * 
     * @param not
     *            a new value of the indicator
     */
    void setNot(boolean not) {
        this.not = not;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean processExpression(SqlProcessContext ctx) {
        SqlMetaLogOperator operator = null;
        boolean result = (this.elements != null && this.elements.size() > 0);
        int state = 0;
        for (SqlMetaLogOperand item : this.elements) {
            if (logger.isDebugEnabled())
                logger.debug("LogDataExpression process " + item + " in state " + state);
            switch (state) {
            case 0:
                boolean operand = item.processExpression(ctx);
                if (operator == null) {
                    result = operand;
                } else if (operator.getType() == SqlMetaLogOperator.Type.AND) {
                    result = (result && operand);
                } else if (operator.getType() == SqlMetaLogOperator.Type.OR) {
                    result = (result || operand);
                }
                state = 1;
                break;
            case 1:
                operator = (SqlMetaLogOperator) item;
                state = 0;
                break;
            }
        }
        return (this.not ? !result : result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlProcessResult process(SqlProcessContext ctx) {
        SqlProcessResult result = new SqlProcessResult();
        if (this.processExpression(ctx))
            result.addTrue();
        else
            result.addFalse();
        return result;
    }
}
