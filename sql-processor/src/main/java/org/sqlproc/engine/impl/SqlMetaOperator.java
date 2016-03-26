package org.sqlproc.engine.impl;

import java.util.List;
import java.util.Map;

import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.impl.SqlInputValue.Code;

/**
 * A META SQL sub-element. It represents a dynamic SQL operator.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlMetaOperator extends SqlMetaConst {

    public static final String SEPARATOR = "@";

    /**
     * An indicator the dynamic input values are used.
     */
    boolean dynamicInputValue;

    /**
     * Creates a new instance of this entity. Used from inside ANTLR parser.
     * 
     * @param caseConversion
     *            which conversion should be done on inputValue
     * @param not
     *            an indicator, which is used to control, how the input value is added to the final ANSI SQL
     * @param type
     *            the type of this input value, which can be Hibernate or an internal type
     */
    public SqlMetaOperator(Code caseConversion, boolean not, SqlType type) {
        super(caseConversion, not, type);
    }

    /**
     * Creates a new instance of this entity. Used from inside ANTLR parser.
     * 
     * @param caseConversion
     *            which conversion should be done on inputValue
     * @param not
     *            an indicator, which is used to control, how the input value is added to the final ANSI SQL
     */
    public SqlMetaOperator(Code caseConversion, boolean not) {
        super(caseConversion, not);
    }

    /**
     * Creates a new instance of this entity. Used from inside ANTLR parser.
     * 
     * @param caseConversion
     *            which conversion should be done on inputValue
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
            return ctx.getDynamicInputValues();
        else
            return ctx.getStaticInputValues();
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
        if (attributeName.indexOf("@") >= 0 || attributeName.indexOf("?") >= 0)
            return String.class;
        return ctx.getAttributeType(attributeType, attributeName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    Object getProperty(SqlProcessContext ctx, Object obj, String item) {
        String prefix = null;
        String suffix = null;
        String name = null;
        int ix = item.indexOf(SEPARATOR);
        if (ix >= 0) {
            if (ix < item.length() - 1) {
                prefix = item.substring(0, ix);
                suffix = item.substring(ix + 1);
                name = prefix + suffix;
            } else {
                prefix = item.substring(0, ix);
                suffix = ctx.getFeature(SqlFeature.OPERATOR_ATTRIBUTE);
                name = prefix + suffix;
            }
        } else {
            return (ctx.checkAttribute(obj, item)) ? ctx.getAttribute(obj, item) : null;
        }
        System.out
                .println("obj=" + obj + " item=" + item + " prefix=" + prefix + " suffix=" + suffix + " name=" + name);
        Object result = (ctx.checkAttribute(obj, name)) ? ctx.getAttribute(obj, name) : null;
        if (result != null) {
            System.out.println("result=" + result);
            return result;
        }

        String op = ctx.getFeature(SqlFeature.OPERATOR_ATTRIBUTE_IN_MAP);
        result = (ctx.checkAttribute(obj, op + "_")) ? ctx.getAttribute(obj, op + "_")
                : ((ctx.checkAttribute(obj, op)) ? ctx.getAttribute(obj, op) : null);
        if (result == null || !(result instanceof Map)) {
            op = SqlUtils.firstLowerCase(suffix);
            result = (ctx.checkAttribute(obj, op + "_")) ? ctx.getAttribute(obj, op + "_")
                    : ((ctx.checkAttribute(obj, op)) ? ctx.getAttribute(obj, op) : null);
            if (result == null || !(result instanceof Map)) {
                System.out.println("result2=null");
                return null;
            }
        }
        Map map = (Map) result;
        System.out.println("result3=" + map.get(prefix));
        return map.get(prefix);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    String getData(SqlProcessContext ctx, Object obj) {
        if (obj instanceof String)
            return (String) obj;
        return obj.toString();
    }
}
