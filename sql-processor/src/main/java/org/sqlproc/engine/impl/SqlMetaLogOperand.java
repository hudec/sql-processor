package org.sqlproc.engine.impl;

/**
 * The ancestor of META SQL sub-elements, which can be used in {@link org.sqlproc.engine.impl.SqlMetaLogExpr}.
 * 
 * In fact it's a marker interface for
 * <ul>
 * <li>{@link org.sqlproc.engine.impl.SqlMetaIdent}
 * <li>{@link org.sqlproc.engine.impl.SqlMetaConst}
 * </ul>
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
interface SqlMetaLogOperand {

    /**
     * The main contract to evaluate a logical value of META SQL sub-elements.
     * 
     * @param ctx
     *            the context for a dynamic ANSI SQL Query generation
     * @return a logical value
     */
    boolean processExpression(SqlProcessContext ctx);
}
