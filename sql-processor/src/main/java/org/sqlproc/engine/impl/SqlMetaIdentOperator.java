package org.sqlproc.engine.impl;

import java.util.List;

import org.sqlproc.engine.impl.SqlInputValue.Code;

/**
 * A META SQL sub-element. It represents a dynamic SQL operator.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlMetaIdentOperator extends SqlMetaConst {

    /**
     * {@inheritDoc}
     */
    public SqlMetaIdentOperator(Code caseConversion, boolean not, SqlType type) {
        super(caseConversion, not, type);
    }

    /**
     * {@inheritDoc}
     */
    public SqlMetaIdentOperator(Code caseConversion, boolean not) {
        super(caseConversion, not);
    }

    /**
     * {@inheritDoc}
     */
    public SqlMetaIdentOperator(Code caseConversion) {
        super(caseConversion);
    }

    /**
     * Creates a new instance of this entity using the list of sub-elements.
     * 
     * @param elements
     *            the list of sub-elements
     */
    public SqlMetaIdentOperator(List<String> elements) {
        super(SqlInputValue.Code.NONE);
        setElements(elements);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    Object getInputValues(SqlProcessContext ctx) {
        return ctx.dynamicInputValues;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    String getDefaultData() {
        return "=";
    }
}
