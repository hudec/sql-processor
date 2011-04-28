package org.sqlproc.engine.impl;

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
            Code caseConversion, Mode inOutMode, SqlType type) {
        this.valueType = valueType;
        this.inputValue = inputValue;
        this.parentInputValue = parentInputValue;
        this.inputValueType = inputValueType;
        this.caseConversion = caseConversion;
        this.inOutMode = inOutMode;
        this.type = type;
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
            String sequenceOrIdentitySelect, SqlType type) {
        this.valueType = valueType;
        this.inputValue = inputValue;
        this.parentInputValue = parentInputValue;
        this.inputValueType = inputValueType;
        if (valueType == Type.SEQUENCE_BASED)
            this.sequence = sequenceOrIdentitySelect;
        else
            this.identitySelect = sequenceOrIdentitySelect;
        this.type = type;
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
                    SqlInputValue.this.identity = identity;
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
                    o = processLike(this.inputValue);
                } else if (caseConversion == Code.LOWER) {
                    o = inputValue != null ? processLike(inputValue).toLowerCase() : (String) null;
                } else if (caseConversion == Code.UPPER) {
                    o = inputValue != null ? processLike(inputValue).toUpperCase() : (String) null;
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
        type.setResult(parentInputValue, paramName, outValue);
    }

    /**
     * Sets a special treatment of dynamic input value.
     * 
     * @param likeChar
     *            a wildcard character
     * @param minLikeLength
     *            the minimum length of inputValue to enable likeChar special treatment
     */
    void setLike(String likeChar, Integer minLikeLength) {
        this.likeChar = likeChar;
        this.minLikeLength = (minLikeLength == null) ? 1 : minLikeLength.intValue();
    }

    /**
     * A special treatment of dynamic input value for SQL comman <code>LIKE</code>.
     * 
     * @param val
     *            a dynamic input value
     * @return a dynamic input value with a likeChar as a prefix and/or suffix
     */
    private String processLike(Object val) {
        String param = (String) val;
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
        return param;
    }

    /**
     * For debug purposes.
     * 
     * @return a String representation for a debug output
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("SqlInputValue:");
        sb.append(" caseConversion=").append(caseConversion);
        sb.append(" value='").append(inputValue).append("'");

        return sb.toString();
    }
}
