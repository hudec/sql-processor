package org.sqlproc.engine.impl;

/**
 * A META SQL sub-element. It represents a logical operator in {@link org.sqlproc.engine.impl.SqlMetaLogExpr}.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlMetaLogOperator implements SqlMetaLogOperand {

    /**
     * The enumeration of the logical operator types.
     */
    static enum Type {
        /**
         * The logical operator is a conjunction.
         */
        AND,
        /**
         * The logical operator is a disjunction.
         */
        OR
    };

    /**
     * The type of the logical operator. It work as a operator between two sub-elements in
     * {@link org.sqlproc.engine.impl.SqlMetaLogExpr}.
     */
    private Type type;

    /**
     * Creates a new instance. It's used from inside ANTLR parser.
     * 
     * @param type
     *            the type of the logical operator
     */
    SqlMetaLogOperator(Type type) {
        this.type = type;
    }

    /**
     * Returns the type of the logical operator.
     * 
     * @return the type of the logical operator
     */
    Type getType() {
        return type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean processExpression(SqlProcessContext ctx) {
        return true;
    }
}
