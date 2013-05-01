package org.sqlproc.engine.impl;

import java.util.List;

import org.sqlproc.engine.impl.SqlInputValue.Code;

/**
 * A META SQL sub-element. It represents a dynamic SQL operator.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlMetaOperator extends SqlMetaConst {

    /**
     * An indicator the dynamic input values are used.
     */
    boolean dynamicInputValue;

    /**
     * {@inheritDoc}
     */
    public SqlMetaOperator(Code caseConversion, boolean not, SqlType type) {
        super(caseConversion, not, type);
    }

    /**
     * {@inheritDoc}
     */
    public SqlMetaOperator(Code caseConversion, boolean not) {
        super(caseConversion, not);
    }

    /**
     * {@inheritDoc}
     */
    public SqlMetaOperator(Code caseConversion) {
        super(caseConversion);
    }

    /**
     * Creates a new instance of this entity using the list of sub-elements.
     * 
     * @param dynamicInputValue
     *            an indicator the dynamic input values are used
     * @param elements
     *            the list of sub-elements
     */
    public SqlMetaOperator(boolean dynamicInputValue, List<String> elements) {
        super(SqlInputValue.Code.NONE);
        this.dynamicInputValue = dynamicInputValue;
        setElements(elements);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    Object getInputValues(SqlProcessContext ctx) {
        if (dynamicInputValue)
            return ctx.dynamicInputValues;
        else
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
    Class<?> getFieldType(SqlProcessContext ctx, Class<?> attributeType, String attributeName) {
        if (attributeName.indexOf("@") >= 0)
            return String.class;
        return BeanUtils.getFieldType(attributeType, attributeName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    Object getProperty(SqlProcessContext ctx, Object obj, String item) {
        int ix = item.indexOf("@");
        if (ix >= 0)
            item = item.substring(0, ix) + SqlProcessContext.getFeature(item.substring(ix + 1));
        Object result = (BeanUtils.checkProperty(obj, item)) ? BeanUtils.getProperty(obj, item) : null;
        // if (result != null)
        // System.out.println(item + " " + result);
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    String getData(Object obj) {
        if (obj instanceof String)
            return (String) obj;
        return obj.toString();
    }
}
