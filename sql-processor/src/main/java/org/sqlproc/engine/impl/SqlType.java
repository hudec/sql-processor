package org.sqlproc.engine.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.type.SqlMetaType;

/**
 * The SQL type of a dynamic input value (SQL statement parameter) or an output value (SQL query scalar).
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlType {

    /**
     * The internal type, which means special processing of the input/output value.
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * The internal META type, which means special processing of the input/output value.
     */
    private SqlMetaType metaType;
    /**
     * Right now only for the special of the enumeration type of the input value. The logical evaluation of the input
     * value is based on the comparison to this value.
     */
    private String value;

    /**
     * Creates a new instance with unspecified internal type.
     */
    SqlType() {
        this.metaType = null;

    }

    /**
     * Creates a new instance with specified internal type.
     * 
     * @param metaType
     *            the internal type
     */
    SqlType(SqlMetaType metaType) {
        this.metaType = metaType;
    }

    /**
     * Returns the internal type.
     * 
     * @return the internal type
     */
    SqlMetaType getMetaType() {
        if (metaType == null)
            return SqlProcessContext.getTypeFactory().getDefaultType();
        return metaType;
    }

    /**
     * Initializes the attribute of the result class with output values from SQL query execution.
     * 
     * @param resultInstance
     *            the instance of the result class
     * @param attributeName
     *            the name of the attribute in the result class
     * @param resultValue
     *            Query execution output value
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with output values handling
     */
    void setResult(Object resultInstance, String attributeName, Object resultValue) throws SqlRuntimeException {
        if (logger.isDebugEnabled())
            logger.debug("setResult " + metaType + " " + attributeName + " " + resultValue);
        getMetaType().setResult(resultInstance, attributeName, resultValue,
                SqlProcessContext.isFeature(SqlFeature.IGNORE_INPROPER_OUT));
    }

    /**
     * Bind an input value to a named query parameter.
     * 
     * @param query
     *            the SQL Engine query, an adapter or proxy to the internal JDBC or ORM staff
     * @param paramName
     *            the name of the parameter
     * @param inputValue
     *            the possibly-null parameter value, a dynamic input value
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with input values handling
     */
    void setParameter(SqlQuery query, String paramName, Object inputValue, Class<?> inputType)
            throws SqlRuntimeException {
        if (logger.isDebugEnabled())
            logger.debug("setParameter " + metaType + " " + paramName + " " + inputValue);
        getMetaType().setParameter(query, paramName, inputValue, inputType,
                SqlProcessContext.isFeature(SqlFeature.IGNORE_INPROPER_IN));
    }

    /**
     * Returns the value. Right now only for the special of the enumeration type of the input value. The logical
     * evaluation of the input value is based on the comparison to this value.
     * 
     * @return the value for special enumeration treatment
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value. Right now only for the special of the enumeration type of the input value. The logical evaluation
     * of the input value is based on the comparison to this value.
     * 
     * @param value
     *            the value for special enumeration treatment
     */
    public void setValue(String value) {
        this.value = value;
    }
    //
    // /**
    // * Returns the indicator the value is the correct one.
    // *
    // * @param values
    // * the set of correct values
    // * @return the indicator the value is the correct one
    // */
    // public boolean hasValue(String... values) {
    // if (this.value == null)
    // return false;
    // for (String v : values) {
    // if (this.value.equalsIgnoreCase(v))
    // return true;
    // }
    // return false;
    // }
}
