package org.sqlproc.engine.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.type.SqlMetaType;

/**
 * A META SQL sub-element. It represents a static input value.
 * 
 * <p>
 * Schematically:
 * 
 * <pre>
 * SqlMetaConst
 *     +-SqlMetaConstItem.SqlMetaConstItem...^SqlMyType^value
 * </pre>
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlMetaConst implements SqlMetaSimple, SqlMetaLogOperand {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Which conversion should be done on input value.
     */
    private SqlInputValue.Code caseConversion;
    /**
     * An indicator, which is used to control, how the input value is added to the final ANSI SQL. A standard behavior
     * is to add an input value only in the case it's not empty. The definition of the emptiness depends on the type of
     * the input value.
     */
    private boolean not;
    /**
     * The list of sub-elements. Every sub-element represents the name of an attribute in the input class (the static
     * parameters class). In case there're more names, the input classes are embedded one in other.
     */
    private List<SqlMetaConstItem> elements;
    /**
     * The type of this input value. It can be Hibernate or an internal type.
     */
    private SqlType sqlType;

    /**
     * Creates a new instance of this entity. Used from inside ANTLR parser.
     * 
     * @param caseConversion
     *            which conversion should be done on inputValue
     */
    SqlMetaConst(SqlInputValue.Code caseConversion) {
        this(caseConversion, false);
    }

    /**
     * Creates a new instance of this entity. Used from inside ANTLR parser.
     * 
     * @param caseConversion
     *            which conversion should be done on inputValue
     * @param not
     *            an indicator, which is used to control, how the input value is added to the final ANSI SQL
     */
    SqlMetaConst(SqlInputValue.Code caseConversion, boolean not) {
        this(caseConversion, false, new SqlType());
    }

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
    SqlMetaConst(SqlInputValue.Code caseConversion, boolean not, SqlType type) {
        this.elements = new ArrayList<SqlMetaConstItem>();
        this.caseConversion = caseConversion;
        this.not = not;
        this.sqlType = type;
    }

    /**
     * Adds a new name. This is the name of an attribute in the input class (the static parameters class). In case
     * there're more names, the input classes are embedded one in other.
     * 
     * @param name
     *            the next name in the list of names
     */
    void addConst(String name) {
        String[] names = name.split("=");
        int size = elements.size();
        SqlMetaConstItem lastItem = (SqlMetaConstItem) (size > 0 ? elements.get(size - 1) : null);
        if (lastItem != null)
            lastItem.setType(SqlMetaConstItem.Type.REF);
        elements.add(new SqlMetaConstItem(names[0], SqlMetaConstItem.Type.VAL));
    }

    /**
     * Adds a new name. This is the name of an attribute in the input class (the static parameters class). In case
     * there're more names, the input classes are embedded one in other.
     * 
     * @param element
     *            an object representation of the next name in the list of names
     */
    void addConst(SqlMetaConstItem element) {
        elements.add(element);
    }

    /**
     * Sets the internal type of this input value.
     * 
     * @param metaType
     *            an internal type
     */
    void setMetaType(SqlMetaType metaType) {
        sqlType = new SqlType(metaType);
    }

    /**
     * Sets the values. Right now only for the special of the enumeration type of the input value. The logical
     * evaluation of the input value is based on the comparison to this value.
     * 
     * @param value
     *            the value for special treatment, might be an identifier of value2
     * @param value2
     *            the value for special treatment
     */
    public void setValues(String value, String value2) {
        int ix = -1;
        if (value2 == null && (ix = value.indexOf('=')) >= 0) {
            value2 = value.substring(ix + 1);
            value = value.substring(0, ix);
        }
        if (value2 == null)
            sqlType.setValue(value);
    }

    /**
     * Returns the type of this input value. It can be Hibernate or an internal type.
     * 
     * @return the type of this input value
     */
    SqlType getSqlType() {
        return this.sqlType;
    }

    /**
     * Sets the indicator, which is used to control, how the input value is added to the final ANSI SQL. A standard
     * behavior is to add an input value only in the case it's not empty. The definition of the emptiness depends on the
     * type of the input value.
     * 
     * @param not
     *            a new indicator value
     */
    void setNot(boolean not) {
        this.not = not;
    }

    /**
     * Returns the indicator, which is used to control, how the input value is added to the final ANSI SQL. A standard
     * behavior is to add an input value only in the case it's not empty. The definition of the emptiness depends on the
     * type of the input value.
     * 
     * @return the indicator value
     */
    boolean isNot() {
        return not;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlProcessResult process(SqlProcessContext ctx) {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> process : staticInputValues=" + ctx.staticInputValues + ", class="
                    + ((ctx.staticInputValues != null) ? ctx.staticInputValues.getClass() : null) + ", sqlType="
                    + sqlType);
        }

        SqlProcessResult result = new SqlProcessResult();
        Object obj = null;
        String attributeName = null;

        if (ctx.staticInputValues != null) {
            obj = ctx.staticInputValues;
            Class<?> attributeType = (obj != null) ? obj.getClass() : null;

            for (SqlMetaConstItem item : this.elements) {
                attributeName = item.getName();
                if (attributeType != null) {
                    Class<?> origAttributeType = attributeType;
                    attributeType = BeanUtils.getFieldType(attributeType, attributeName);
                    if (attributeType == null) {
                        if (SqlProcessContext.isFeature(SqlFeature.IGNORE_INPROPER_IN)) {
                            logger.error("There's no attribute '" + attributeName + "' for " + origAttributeType);
                        } else {
                            throw new SqlRuntimeException("There's no attribute '" + attributeName + "' for "
                                    + origAttributeType);
                        }
                    }
                }
                if (obj != null) {
                    obj = BeanUtils.getProperty(obj, item.getName());
                }
            }
        }

        try {
            result.add(SqlUtils.isEmpty(obj, sqlType, ctx.inSqlSetOrInsert));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Input value " + attributeName + ", failed reason" + e.getMessage());
        }

        if (obj != null) {
            if (obj instanceof Collection) {
                boolean notEmpty = !((Collection<?>) obj).isEmpty();
                StringBuilder s = new StringBuilder(notEmpty ? "(" : "");

                for (Iterator<?> i = ((Collection<?>) obj).iterator(); i.hasNext();) {
                    Object objItem = i.next();

                    if (objItem != null) {
                        s.append(getData(objItem));
                    } else
                        s.append("null");

                    if (i.hasNext())
                        s.append(',');
                }
                if (notEmpty)
                    s.append(')');
                result.setSql(s);
            } else {
                result.setSql(new StringBuilder(getData(obj)));
            }
        } else
            result.setSql(new StringBuilder(""));
        return result;
    }

    /**
     * Returns a String representation of input values, after a possible transformation process.
     * 
     * @param obj
     *            a raw input value
     * @return the transformed input value
     */
    private String getData(Object obj) {
        // obj is not null
        if (obj instanceof String) {
            if (caseConversion == SqlInputValue.Code.UPPER) {
                return "'" + obj.toString().toUpperCase() + "'";
            } else if (caseConversion == SqlInputValue.Code.LOWER) {
                return "'" + obj.toString().toLowerCase() + "'";
            } else {
                return "'" + obj.toString() + "'";
            }
        } else if (obj.getClass().isEnum() && this.sqlType != null) {
            if (sqlType.getMetaType() == SqlProcessContext.getTypeFactory().getEnumStringType()) {
                Object o = SqlUtils.getEnumToValue(obj);
                if (o != null && o instanceof String)
                    return "'" + (String) o + "'";
                else
                    return "'" + obj.toString() + "'";
            } else if (sqlType.getMetaType() == SqlProcessContext.getTypeFactory().getEnumIntegerType()) {
                Object o = SqlUtils.getEnumToValue(obj);
                if (o != null)
                    return o.toString();
                else
                    return obj.toString();
            } else if (sqlType.getMetaType() == SqlProcessContext.getTypeFactory().getDefaultType()) {
                Object o = SqlUtils.getEnumToValue(obj);
                if (o != null && o instanceof Integer) {
                    return o.toString();
                } else if (o != null && o instanceof String) {
                    return "'" + o + "'";
                } else
                    return obj.toString();
            } else {
                return obj.toString();
            }
        } else {
            return obj.toString();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean processExpression(SqlProcessContext ctx) {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> processExpression : staticInputValues=" + ctx.staticInputValues + ", class="
                    + ((ctx.staticInputValues != null) ? ctx.staticInputValues.getClass() : null) + ", sqlType="
                    + sqlType);
        }

        Object obj = null;
        if (ctx.staticInputValues != null) {
            obj = ctx.staticInputValues;

            for (SqlMetaConstItem item : this.elements) {
                if (obj != null) {
                    obj = BeanUtils.getProperty(obj, item.getName());
                }
            }
        }

        boolean result = SqlUtils.isTrue(obj, sqlType);
        return (this.not ? !result : result);
    }
}
