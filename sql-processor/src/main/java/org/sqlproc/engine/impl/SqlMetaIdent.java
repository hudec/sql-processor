package org.sqlproc.engine.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.plugin.Modifiers;
import org.sqlproc.engine.plugin.SqlIdentityPlugin;
import org.sqlproc.engine.plugin.SqlSequencePlugin;
import org.sqlproc.engine.type.SqlMetaType;

/**
 * A META SQL sub-element. It represents a dynamic input value.
 * 
 * <p>
 * Schematically:
 * 
 * <pre>
 * SqlMetaIdent
 *     +-SqlMetaIdentItem.SqlMetaIdentItem...^SqlMyType^value
 * </pre>
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlMetaIdent implements SqlMetaSimple, SqlMetaLogOperand {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Which conversion should be done on input value.
     */
    private SqlInputValue.Code caseConversion;
    /**
     * Which mode of callable statement parameter it is.
     */
    private SqlInputValue.Mode inOutMode;
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
    private List<String> elements;
    /**
     * The type of this input value. It can be Hibernate or an internal type.
     */
    private SqlType sqlType;

    /**
     * Values for a special identifier handling, for example a sequence for an identity.
     */
    Map<String, String> values = new HashMap<String, String>();

    /**
     * Creates a new instance of this entity. Used from inside ANTLR parser.
     * 
     * @param caseConversion
     *            which conversion should be done on inputValue
     */
    SqlMetaIdent(SqlInputValue.Code caseConversion, SqlInputValue.Mode inOutMode) {
        this(caseConversion, inOutMode, false);
    }

    /**
     * Creates a new instance of this entity. Used from inside ANTLR parser.
     * 
     * @param caseConversion
     *            which conversion should be done on inputValue
     * @param not
     *            an indicator, which is used to control, how the input value is added to the final ANSI SQL
     */
    SqlMetaIdent(SqlInputValue.Code caseConversion, SqlInputValue.Mode inOutMode, boolean not) {
        this(caseConversion, inOutMode, false, new SqlType());
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
    SqlMetaIdent(SqlInputValue.Code caseConversion, SqlInputValue.Mode inOutMode, boolean not, SqlType type) {
        this.elements = new ArrayList<String>();
        this.caseConversion = caseConversion;
        this.inOutMode = inOutMode;
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
    void addIdent(String name) {
        String[] names = name.split("=");
        elements.add(names[0]);
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
     * Sets the values for a special identifier handling, for example a sequence for an identity. Or it can used be for
     * the special handling of the enumeration type of the input value. The logical evaluation of the input value is
     * based on the comparison to this value.
     * 
     * @param value
     *            the value for a special treatment, might be an identifier of value2 or a value for a comparison
     * @param value2
     *            the value for a special treatment, might be a sequence name for an identity column
     */
    public void setValues(String value, String value2) {
        int ix = -1;
        if (value2 == null && (ix = value.indexOf('=')) >= 0) {
            value2 = value.substring(ix + 1);
            value = value.substring(0, ix);
        }
        if (value2 == null) {
            if (value.equals(Modifiers.MODIFIER_IDENTITY_SELECT))
                values.put(value, Modifiers.MODIFIER_IDENTITY_SELECT);
            else if (value.equals(Modifiers.MODIFIER_SEQUENCE))
                values.put(value, Modifiers.MODIFIER_SEQUENCE);
            else if (value.equals(Modifiers.MODIFIER_ANYSET))
                values.put(value, null);
            else
                sqlType.setValue(value);
        } else {
            values.put(value, value2);
        }
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
     * Returns the list of sub-elements.
     * 
     * @return the list of sub-elements
     */
    public List<String> getElements() {
        return elements;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlProcessResult process(SqlProcessContext ctx) {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> process : dynamicInputValues=" + ctx.dynamicInputValues + ", class="
                    + ((ctx.dynamicInputValues != null) ? ctx.dynamicInputValues.getClass() : null) + ", sqlType="
                    + sqlType);
        }

        SqlProcessResult result = new SqlProcessResult(ctx);
        Object obj = ctx.dynamicInputValues;
        Object parentObj = null;
        StringBuilder sname = new StringBuilder(elements.size() * 32);
        StringBuilder fname = new StringBuilder(elements.size() * 32);
        sname.append(IDENT_PREFIX);

        String sequenceName = values.get(SqlSequencePlugin.MODIFIER_SEQUENCE);
        String identitySelectName = values.get(SqlIdentityPlugin.MODIFIER_IDENTITY_SELECT);
        String identityGenerator = values.get(SqlIdentityPlugin.MODIFIER_IDENTITY_GENERATOR);
        String identityGeneratorValue = (identityGenerator != null) ? ctx.getFeature(SqlFeature.IDGEN + "_"
                + identityGenerator) : null;
        if (identityGeneratorValue != null) {
            int ix = identityGeneratorValue.indexOf("=");
            if (ix >= 0) {
                String value = identityGeneratorValue.substring(0, ix);
                if (value.equals(Modifiers.MODIFIER_SEQUENCE)) {
                    sequenceName = identityGeneratorValue.substring(ix + 1);
                    identityGenerator = null;
                } else if (value.equals(Modifiers.MODIFIER_IDENTITY_SELECT)) {
                    identitySelectName = identityGeneratorValue.substring(ix + 1);
                    identityGenerator = null;
                }
            } else {
                if (identityGeneratorValue.equals(Modifiers.MODIFIER_SEQUENCE)) {
                    sequenceName = Modifiers.MODIFIER_SEQUENCE;
                    identityGenerator = null;
                } else if (identityGeneratorValue.equals(Modifiers.MODIFIER_IDENTITY_SELECT)) {
                    identitySelectName = Modifiers.MODIFIER_IDENTITY_SELECT;
                    identityGenerator = null;
                }
            }
        }

        int count = 1;
        String attributeName = null;
        String lastAttributeName = null;
        Class<?> attributeType = (obj != null) ? obj.getClass() : null;

        for (String item : this.elements) {
            attributeName = item;
            if (Character.isDigit(attributeName.charAt(0))) {
                sname.append(attributeName);
                fname.append(attributeName);
                if (obj != null) {
                    parentObj = obj;
                    obj = null;
                }
                break;

            } else if (attributeType != null) {
                Class<?> origAttributeType = attributeType;
                attributeType = ctx.getAttributeType(attributeType, attributeName);
                if (attributeType == null) {
                    if (ctx.isFeature(SqlFeature.IGNORE_INPROPER_IN.name())) {
                        logger.error("There's no attribute '" + attributeName + "' for " + origAttributeType);
                    } else {
                        throw new SqlRuntimeException("There's no attribute '" + attributeName + "' for "
                                + origAttributeType);
                    }
                }
            }
            if (count > 1) {
                sname.append(IDENT_SEPARATOR);
                fname.append(",");
            }
            sname.append(attributeName);
            fname.append(attributeName);
            // if ((sequenceName != null || identitySelectName != null) && count == size)
            // break;
            if (obj != null) {
                parentObj = obj;
                obj = ctx.getAttribute(obj, item);
            }
            if (obj == null && lastAttributeName == null) {
                lastAttributeName = attributeName;
            }
            count++;
        }
        if (lastAttributeName == null) {
            lastAttributeName = attributeName;
        }

        String sequence = null;
        String identitySelect = null;
        if (identityGenerator != null) {
            identitySelect = ctx.getPluginFactory().getSqlIdentityPlugin()
                    .identitySelect(ctx, identityGenerator, attributeType);
            if (identitySelect == null)
                sequence = ctx.getPluginFactory().getSqlSequencePlugin().sequenceSelect(ctx, identityGenerator);
            if (sequence == null && identitySelect == null) {
                throw new SqlRuntimeException("Missing identity generator " + identityGenerator);
            }
        } else if (sequenceName != null) {
            sequence = ctx.getPluginFactory().getSqlSequencePlugin().sequenceSelect(ctx, sequenceName);
            if (sequence == null) {
                throw new SqlRuntimeException("Missing sequence " + sequenceName);
            }
        } else if (identitySelectName != null) {
            identitySelect = ctx.getPluginFactory().getSqlIdentityPlugin()
                    .identitySelect(ctx, identitySelectName, attributeType);
            if (identitySelect == null) {
                throw new SqlRuntimeException("Missing identity select " + identitySelectName);
            }
        }

        if (sequence != null) {
            result.add(true);
            SqlInputValue identityInputValue = new SqlInputValue(ctx, SqlInputValue.Type.SEQUENCE_BASED, obj,
                    parentObj, attributeType, sequence, this.sqlType, values.get(Modifiers.MODIFIER_ID));
            result.addInputValue(sname.substring(lIDENT_PREFIX), identityInputValue);
            result.addIdentity(attributeName, identityInputValue);
            result.setSql(new StringBuilder(ctx.isFeature(SqlFeature.JDBC.name()) ? "?" : sname.toString()));
        } else if (identitySelect != null) {
            result.add(true);
            SqlInputValue identityInputValue = new SqlInputValue(ctx, SqlInputValue.Type.IDENTITY_SELECT, obj,
                    parentObj, attributeType, identitySelect, this.sqlType, values.get(Modifiers.MODIFIER_ID));
            result.addInputValue(sname.substring(lIDENT_PREFIX), identityInputValue);
            result.addIdentity(attributeName, identityInputValue);
            result.setSkipNextText(true);
        } else {
            try {
                result.add(ctx
                        .getPluginFactory()
                        .getIsEmptyPlugin()
                        .isNotEmpty(ctx, lastAttributeName, obj, parentObj,
                                (sqlType == null) ? null : sqlType.getMetaType(ctx),
                                (sqlType == null) ? null : sqlType.getValue(),
                                ctx.inSqlSetOrInsert || ctx.sqlStatementType == SqlMetaStatement.Type.CALL, values));
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Input value " + attributeName + ", failed reason" + e.getMessage());
            }
            if (obj != null && obj instanceof Collection<?>) {
                boolean notEmpty = !((Collection<?>) obj).isEmpty();
                if (!notEmpty && values.containsKey(Modifiers.MODIFIER_ANYSET)) {
                    result.setSql(new StringBuilder("(null)"));
                } else {
                    StringBuilder ss = new StringBuilder(notEmpty ? "(" : "");

                    int i = 1;
                    for (Iterator<?> iter = ((Collection<?>) obj).iterator(); iter.hasNext();) {
                        Object objItem = iter.next();

                        if (objItem != null) {
                            String attributeNameItem = sname.toString() + "_" + (i++);
                            ss.append(ctx.isFeature(SqlFeature.JDBC.name()) ? "?" : attributeNameItem);
                            result.addInputValue(attributeNameItem.substring(lIDENT_PREFIX), new SqlInputValue(ctx,
                                    SqlInputValue.Type.PROVIDED, objItem, parentObj, objItem.getClass(),
                                    caseConversion, inOutMode, sqlType, null, null));
                        } else
                            ss.append("null");

                        if (iter.hasNext())
                            ss.append(',');
                    }
                    if (notEmpty)
                        ss.append(')');
                    result.setSql(ss);
                }
            } else {
                SqlInputValue sqlInputValue = new SqlInputValue(ctx, SqlInputValue.Type.PROVIDED, obj, parentObj,
                        attributeType, caseConversion, inOutMode, sqlType, lastAttributeName, fname.toString());
                result.addInputValue(sname.substring(lIDENT_PREFIX), sqlInputValue);
                if (inOutMode == SqlInputValue.Mode.OUT || inOutMode == SqlInputValue.Mode.INOUT) {
                    result.addOutValue(attributeName, sqlInputValue);
                }
                result.setSql(new StringBuilder(ctx.isFeature(SqlFeature.JDBC.name()) ? "?" : sname.toString()));
            }
        }

        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean processExpression(SqlProcessContext ctx) {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> processExpression : dynamicInputValues=" + ctx.dynamicInputValues + ", class="
                    + ((ctx.dynamicInputValues != null) ? ctx.dynamicInputValues.getClass() : null) + ", sqlType="
                    + sqlType);
        }

        Object parentObj = null;
        Object obj = ctx.dynamicInputValues;
        String attributeName = null;

        for (String item : this.elements) {
            attributeName = item;
            if (obj != null) {
                parentObj = obj;
                obj = ctx.getAttribute(obj, item);
            }
        }

        boolean result = ctx
                .getPluginFactory()
                .getIsTruePlugin()
                .isTrue(ctx, attributeName, obj, parentObj, (sqlType == null) ? null : sqlType.getMetaType(ctx),
                        (sqlType == null) ? null : sqlType.getValue(), values);
        return (this.not ? !result : result);
    }
}
