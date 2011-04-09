package org.sqlproc.engine.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.type.IdentitySetter;

/**
 * The entity for a dynamic input value.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlInputValue implements IdentitySetter {

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
    static enum Case {
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
     * The type of the input value, please see {@link Type}.
     */
    private Type valueType;
    /**
     * Which conversion should be done on inputValue.
     */
    private Case caseConversion;
    /**
     * A dynamic input value.
     */
    private Object inputValue;
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
     * @param type
     *            a dynamic input value META type
     */
    SqlInputValue(Type valueType, Object inputValue, Class<?> inputValueType, Case caseConversion, SqlType type) {
        this.valueType = valueType;
        this.inputValue = inputValue;
        this.inputValueType = inputValueType;
        this.caseConversion = caseConversion;
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
    SqlInputValue(Type valueType, Object inputValue, Class<?> inputValueType, String sequenceOrIdentitySelect,
            SqlType type) {
        this.valueType = valueType;
        this.inputValue = inputValue;
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
            identity = seqQuery.uniqueResult();
            type.setParameter(query, paramName, identity, inputValueType);
        } else if (identitySelect != null) {
            SqlProcessContext
                    .getTypeFactory()
                    .getIdentityType()
                    .setParameter(query, paramName, this, inputValueType,
                            SqlProcessContext.isFeature(SqlFeature.IGNORE_INPROPER_IN));
        } else {
            Object o = this.inputValue;
            if (this.inputValue instanceof String) {
                if (caseConversion == Case.NONE) {
                    o = processLike(this.inputValue);
                } else if (caseConversion == Case.LOWER) {
                    o = this.inputValue != null ? processLike(this.inputValue).toLowerCase() : (String) null;
                } else if (caseConversion == Case.UPPER) {
                    o = this.inputValue != null ? processLike(this.inputValue).toUpperCase() : (String) null;
                }
            }
            type.setParameter(query, paramName, o, inputValueType);
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
        type.setResult(inputValue, paramName, identity);
    }

    /**
     * Sets the result of select command for the generated identity value.
     * 
     * @param identity
     *            the generated identity value
     */
    public void setIdentity(Object identity) {
        this.identity = identity;
    }

    /**
     * Returns the select command used to obtain the generated identity value.
     */
    public String getIdentitySelect() {
        return identitySelect;
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
