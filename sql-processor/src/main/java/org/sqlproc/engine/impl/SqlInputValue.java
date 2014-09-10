package org.sqlproc.engine.impl;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.type.IdentitySetter;
import org.sqlproc.engine.type.OutValueSetter;

/**
 * The entity for a dynamic input value.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlInputValue {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Enumeration for the type of input value.
     * 
     */
    static enum Type {
        /**
         * Provided value.
         */
        PROVIDED,
        /**
         * Value based on a sequence.
         */
        SEQUENCE_BASED,
        /**
         * Value based on identity select.
         */
        IDENTITY_SELECT
    };

    /**
     * Enumeration for no/upper/lower case conversion. This is done on dynamic/static input values.
     * 
     */
    static enum Code {
        /**
         * No case conversion.
         */
        NONE,
        /**
         * Upper case conversion.
         */
        UPPER,
        /**
         * Lower case conversion.
         */
        LOWER
    };

    /**
     * Enumeration for IN/OUT/INOUT mode of callable statement parameter.
     * 
     */
    static enum Mode {
        /**
         * By default it's input parameter.
         */
        IN,
        /**
         * It's used for output parameter.
         */
        OUT,
        /**
         * It's used for input/output parameter.
         */
        INOUT
    };

    /**
     * The type of the input value, please see {@link Type}.
     */
    private Type valueType;
    /**
     * Which conversion should be done on inputValue.
     */
    private Code caseConversion;
    /**
     * Which mode of callable statement parameter it is.
     */
    private Mode inOutMode;
    /**
     * A dynamic input value.
     */
    private Object inputValue;
    /**
     * A input attribute name.
     */
    private String inputName;
    /**
     * A input attribute full name.
     */
    private String fullInputName;
    /**
     * A parent of a dynamic input value.
     */
    private Object parentInputValue;
    /**
     * The input value Java type.
     */
    Class<?> inputValueType;
    /**
     * A wildcard character for the SQL command <code>LIKE</code>. It can be added to inputValue as a prefix and/or as a
     * suffix.
     */
    private String likeChar;
    /**
     * The minimum length of inputValue to enable likeChar special treatment.
     */
    private int minLikeLength;
    /**
     * a wildcard character is going to be only a postfix
     */
    private boolean partialLike;
    /**
     * The input value META type.
     */
    private SqlType type;
    /**
     * A database sequence for an identity column.
     */
    private String sequence;
    /**
     * An SQL select for an identity column.
     */
    private String identitySelect;
    /**
     * A calculated identity.
     */
    private Object identity;
    /**
     * A dynamic input value can be also an output value.
     */
    private Object outValue;
    /**
     * A map of characters to be replaced in input value;
     */
    private Map<String, String> replaceChars;
    /**
     * A database identity column name
     */
    private String dbIdentityName;

    /**
     * Creates a new instance of this entity. Used from inside ANTLR parser.
     * 
     * @param valueType
     *            a value type
     * @param inputValue
     *            a dynamic input value
     * @param inputValueType
     *            a dynamic input value Java type
     * @param caseConversion
     *            which conversion should be done on inputValue
     * @param inOutMode
     *            Which mode of callable statement parameter it is
     * @param type
     *            a dynamic input value META type
     */
    SqlInputValue(Type valueType, Object inputValue, Object parentInputValue, Class<?> inputValueType,
            Code caseConversion, Mode inOutMode, SqlType type, String inputName, String fullInputName) {
        this.valueType = valueType;
        this.inputValue = inputValue;
        this.parentInputValue = parentInputValue;
        this.inputValueType = inputValueType;
        this.caseConversion = caseConversion;
        this.inOutMode = inOutMode;
        this.type = type;
        this.inputName = inputName;
        this.fullInputName = fullInputName;
    }

    /**
     * Creates a new instance of this entity. Used from inside ANTLR parser.
     * 
     * @param valueType
     *            a value type
     * @param inputValue
     *            a dynamic input value
     * @param inputValueType
     *            a dynamic input value Java type
     * @param sequenceOrIdentitySelect
     *            a sequence or select command used to generate an identity value
     * @param type
     *            a dynamic input value META type
     */
    SqlInputValue(Type valueType, Object inputValue, Object parentInputValue, Class<?> inputValueType,
            String sequenceOrIdentitySelect, SqlType type, String dbIdentityName) {
        this.valueType = valueType;
        this.inputValue = inputValue;
        this.parentInputValue = parentInputValue;
        this.inputValueType = inputValueType;
        if (this.valueType == Type.SEQUENCE_BASED)
            this.sequence = sequenceOrIdentitySelect;
        else
            this.identitySelect = sequenceOrIdentitySelect;
        this.type = type;
        this.dbIdentityName = dbIdentityName;
    }

    /**
     * Creates a new instance of this entity.
     * 
     * @param name
     *            the name og the attribute
     * @param sqlInputValue
     *            SqlInputValue instance to clone
     * @param dynamicInputValues
     *            the SQL statement dynamic parameters (input values)
     */
    SqlInputValue(String name, SqlInputValue sqlInputValue, Object dynamicInputValues) {
        this.valueType = sqlInputValue.valueType;
        this.caseConversion = sqlInputValue.caseConversion;
        this.inOutMode = sqlInputValue.inOutMode;
        String[] ss = (sqlInputValue.fullInputName != null) ? sqlInputValue.fullInputName.split(",")
                : new String[] { sqlInputValue.inputName };
        for (int i = 0; i < ss.length; i++) {
            this.inputValue = BeanUtils.getProperty((i == 0) ? dynamicInputValues : this.inputValue, ss[i]);
        }
        this.inputName = sqlInputValue.inputName;
        this.fullInputName = sqlInputValue.fullInputName;
        this.inputValueType = sqlInputValue.inputValueType;
        this.likeChar = sqlInputValue.likeChar;
        this.minLikeLength = sqlInputValue.minLikeLength;
        this.partialLike = sqlInputValue.partialLike;
        this.type = sqlInputValue.type;
        this.sequence = sqlInputValue.sequence;
        this.identitySelect = sqlInputValue.identitySelect;
        this.identity = sqlInputValue.identity;
        this.outValue = sqlInputValue.outValue;
        this.replaceChars = sqlInputValue.replaceChars;
        this.dbIdentityName = sqlInputValue.dbIdentityName;
    }

    /**
     * Bind a dynamic input value to a named query parameter.
     * 
     * @param session
     *            the SQL Engine session, an adapter or proxy to the internal JDBC or ORM staff
     * @param query
     *            the SQL Engine query, an adapter or proxy to the internal JDBC or ORM staff
     * @param paramName
     *            the name of the parameter (= the attribute name)
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with input values handling
     */
    void setQueryParam(final SqlSession session, SqlQuery query, String paramName) throws SqlRuntimeException {
        if (sequence != null) {
            SqlQuery seqQuery = session.createSqlQuery(sequence);
            SqlProcessContext.getTypeFactory().getDefaultType().addScalar(seqQuery, "1", inputValueType);
            identity = seqQuery.unique();
            type.setParameter(query, paramName, identity, inputValueType);
        } else if (identitySelect != null) {
            SqlProcessContext.getTypeFactory().getIdentityType().setParameter(query, paramName, new IdentitySetter() {
                @Override
                public void setIdentity(Object identity) {
                    if (identity != null && identity instanceof BigDecimal)
                        SqlInputValue.this.identity = SqlUtils.convertBigDecimal(SqlInputValue.this.inputValueType,
                                identity);
                    else
                        SqlInputValue.this.identity = SqlUtils.convertBigInteger(SqlInputValue.this.inputValueType,
                                identity);
                }

                @Override
                public String getIdentitySelect() {
                    return SqlInputValue.this.identitySelect;
                }
            }, inputValueType, SqlProcessContext.isFeature(SqlFeature.IGNORE_INPROPER_IN));
        } else if (inOutMode == Mode.IN || inOutMode == Mode.INOUT) {
            Object o = this.inputValue;
            if (inputValue instanceof String) {
                if (caseConversion == Code.NONE) {
                    o = processReplaceChars(processLike(this.inputValue));
                } else if (caseConversion == Code.LOWER) {
                    o = inputValue != null ? processReplaceChars(processLike(inputValue)).toLowerCase() : (String) null;
                } else if (caseConversion == Code.UPPER) {
                    o = inputValue != null ? processReplaceChars(processLike(inputValue)).toUpperCase() : (String) null;
                }
            }
            type.setParameter(query, paramName, o, inputValueType);
            if (inOutMode == Mode.INOUT) {
                type.setParameter(query, paramName, new OutValueSetter() {
                    @Override
                    public void setOutValue(Object outValue) {
                        SqlInputValue.this.outValue = outValue;
                    }
                }, inputValueType);
            }
        } else if (inOutMode == Mode.OUT) {
            type.setParameter(query, paramName, new OutValueSetter() {
                @Override
                public void setOutValue(Object outValue) {
                    SqlInputValue.this.outValue = outValue;
                }
            }, inputValueType);
        }
    }

    /**
     * Sets the generated identity value to an input value attribute.
     * 
     * @param paramName
     *            the name of the parameter (= the attribute name)
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with output values handling
     */
    void setIdentityResult(String paramName) throws SqlRuntimeException {
        type.setResult(parentInputValue, paramName, identity);
    }

    /**
     * Sets the OUT/INOUT value to an input value attribute.
     * 
     * @param paramName
     *            the name of the parameter (= the attribute name)
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with output values handling
     */
    void setOutValueResult(String paramName) throws SqlRuntimeException {
        if (Character.isDigit(paramName.charAt(0)))
            return;
        type.setResult(parentInputValue, paramName, outValue);
    }

    /**
     * Sets a special treatment of a dynamic input value.
     * 
     * @param likeChar
     *            a wildcard character
     * @param minLikeLength
     *            the minimum length of inputValue to enable likeChar special treatment
     * @param partialLike
     *            a wildcard character is going to be only a postfix
     */
    void setLike(String likeChar, Integer minLikeLength, boolean partialLike) {
        this.likeChar = likeChar;
        this.minLikeLength = (minLikeLength == null) ? 1 : minLikeLength.intValue();
        this.partialLike = partialLike;
    }

    /**
     * Sets a special treatment of a dynamic input value.
     * 
     * @param replaceChars
     *            a map of characters to be replaced in input value
     */
    void setReplaceChars(Map<String, String> replaceChars) {
        this.replaceChars = replaceChars;
    }

    /**
     * A special treatment of dynamic input value for SQL command <code>LIKE</code>.
     * 
     * @param val
     *            a dynamic input value
     * @return a dynamic input value with a likeChar as a prefix and/or suffix
     */
    private String processLike(Object val) {
        String param = (String) val;
        if (partialLike) {
            if (likeChar != null && param != null) {
                param = param.trim();
                int length = param.length();
                boolean endsWith = param.endsWith(this.likeChar);
                if (endsWith)
                    return param;
                else {
                    if (length >= minLikeLength)
                        return param + likeChar;
                    else
                        return param;
                }
            }
        } else {
            if (likeChar != null && param != null) {
                param = param.trim();
                int length = param.length();
                boolean startsWith = param.startsWith(this.likeChar);
                boolean endsWith = param.endsWith(this.likeChar);
                if (startsWith && endsWith)
                    return param;
                else if (startsWith) {
                    if (length >= minLikeLength + 1)
                        return param + likeChar;
                    else
                        return param;
                } else if (endsWith) {
                    if (length >= minLikeLength + 1)
                        return likeChar + param;
                    else
                        return param;
                } else {
                    if (length >= minLikeLength)
                        return likeChar + param + likeChar;
                    else
                        return param;
                }
            }
        }
        return param;
    }

    /**
     * A special treatment of dynamic input value for SQL command <code>LIKE</code>.
     * 
     * @param val
     *            a dynamic input value
     * @return a dynamic input value with replaced characters
     */
    private String processReplaceChars(Object val) {
        String param = (String) val;
        if (replaceChars == null || replaceChars.isEmpty())
            return param;
        for (Entry<String, String> entry : replaceChars.entrySet()) {
            param = param.replace(entry.getKey(), entry.getValue());
        }
        return param;
    }

    /**
     * Returns a dynamic input value.
     * 
     * @return a dynamic input value
     */
    Object getInputValue() {
        return inputValue;
    }

    /**
     * Returns a input attribute name.
     * 
     * @return a input attribute name
     */
    String getInputName() {
        return inputName;
    }

    /**
     * Returns a parent of a dynamic input value.
     * 
     * @return a parent of a dynamic input value
     */
    Object getParentInputValue() {
        return parentInputValue;
    }

    /**
     * Returns the type of the input value, please see {@link Type}.
     * 
     * @return the type of the input value, please see {@link Type}
     */
    public Type getValueType() {
        return valueType;
    }

    /**
     * Returns a database identity column name.
     * 
     * @return a database identity column name
     */
    public String getDbIdentityName() {
        return dbIdentityName;
    }

    /**
     * For debug purposes.
     * 
     * @return a String representation for a debug output
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("SqlInputValue[");
        sb.append(" valueType=").append(valueType);
        sb.append(", caseConversion=").append(caseConversion);
        sb.append(", inOutMode=").append(inOutMode);
        sb.append(", inputValue=").append(inputValue);
        sb.append(", inputName=").append(inputName);
        sb.append(", fullInputName=").append(fullInputName);
        sb.append(", parentInputValue=").append(parentInputValue);
        sb.append(", inputValueType=").append(inputValueType);
        sb.append(", likeChar=").append(likeChar);
        sb.append(", minLikeLength=").append(minLikeLength);
        sb.append(", partialLike=").append(partialLike);
        sb.append(", type=").append(type);
        sb.append(", sequence=").append(sequence);
        sb.append(", identitySelect=").append(identitySelect);
        sb.append(", identity=").append(identity);
        sb.append(", outValue=").append(outValue);
        sb.append(", replaceChars=").append((replaceChars != null) ? replaceChars : null);
        sb.append(", dbIdentityName=").append(dbIdentityName);
        return sb.append("]").toString();
    }
}
