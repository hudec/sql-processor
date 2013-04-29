package org.sqlproc.engine.impl;

import java.util.List;

import org.sqlproc.engine.impl.SqlInputValue.Code;

/**
 * A META SQL sub-element. It represents a static SQL operator.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlMetaConstOperator extends SqlMetaConst {

    /**
     * {@inheritDoc}
     */
    public SqlMetaConstOperator(Code caseConversion, boolean not, SqlType type) {
        super(caseConversion, not, type);
    }

    /**
     * {@inheritDoc}
     */
    public SqlMetaConstOperator(Code caseConversion, boolean not) {
        super(caseConversion, not);
    }

    /**
     * {@inheritDoc}
     */
    public SqlMetaConstOperator(Code caseConversion) {
        super(caseConversion);
    }

    /**
     * Creates a new instance of this entity using the list of sub-elements.
     * 
     * @param elements
     *            the list of sub-elements
     */
    public SqlMetaConstOperator(List<String> elements) {
        super(SqlInputValue.Code.NONE);
        setElements(elements);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    Object getInputValues(SqlProcessContext ctx) {
        return ctx.staticInputValues;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    String getDefaultData() {
        return "=";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    Object getProperty(SqlProcessContext ctx, Object obj, String item) {
        if (item.startsWith("@"))
            item = SqlProcessContext.getFeature(item.substring(1));
        return BeanUtils.getProperty(obj, item);
    }
}
