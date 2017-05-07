package org.sqlproc.engine.type;

import org.slf4j.Logger;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * The common ancestor of all META types. These internal types are devoted for the special processing of the
 * input/output values.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlMetaType {

    /**
     * Returns the type provided by the stack on top of which the SQL Processor works.
     * 
     * @return the provided type
     */
    Object getProviderSqlType();

    /**
     * Declares a scalar query result, which is an SQL query execution output value.
     * 
     * @param typeFactory
     *            the SQL Type factory
     * @param query
     *            the SQL Engine query, an adapter or proxy to the internal JDBC or ORM staff
     * @param dbName
     *            the name of a database query output, it can be the column name or the alias name
     * @param attributeTypes
     *            the Java types of of the attribute in the result class
     */
    void addScalar(SqlTypeFactory typeFactory, SqlQuery query, String dbName, Class<?>... attributeTypes);

    /*
     * DEBUG
     */
    default void addScalarEntryLog(Logger logger, SqlMetaType sqlMetaType, SqlTypeFactory typeFactory, SqlQuery query,
            String dbName, Class<?>... attributeTypes) {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> addScalar for META type " + this + ": query=" + query + ", dbName=" + dbName
                    + ", attributeTypes=" + attributeTypes);
        }
    }

    /**
     * Initializes the attribute of the result class with output value from the SQL query execution.
     * 
     * @param runtimeCtx
     *            the runtimeCtx context
     * @param resultInstance
     *            the instance of the result class
     * @param attributeName
     *            the name of the attribute in the result class
     * @param resultValue
     *            the query execution output value
     * @param ingoreError
     *            ignore improper output value handling
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the output values handling
     */
    void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException;

    /**
     * Returns the attribute's result value (with possible conversion).
     * 
     * @param runtimeCtx
     *            the runtimeCtx context
     * @param attributeName
     *            the name of the attribute in the result class
     * @param resultValue
     *            the query execution output value
     * @param ingoreError
     *            ignore improper output value handling
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the output values handling
     */
    default Object getResult(SqlRuntimeContext runtimeCtx, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException {
        return resultValue;
    }

    /*
     * DEBUG
     */
    default void setResultEntryLog(Logger logger, SqlMetaType sqlMetaType, SqlRuntimeContext runtimeCtx,
            Object resultInstance, String attributeName, Object resultValue, boolean ingoreError) {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setResult for META type " + sqlMetaType + ": resultInstance=" + resultInstance
                    + ", attributeName=" + attributeName + ", resultValue=" + resultValue + ", resultType"
                    + ((resultValue != null) ? resultValue.getClass() : null));
        }
    }

    /**
     * Binds an input value to a named query parameter.
     * 
     * @param runtimeCtx
     *            the runtimeCtx context
     * @param query
     *            the SQL Engine query, an adapter or proxy to the internal JDBC or ORM staff
     * @param paramName
     *            the name of the parameter
     * @param ingoreError
     *            ignore improper input value handling
     * @param inputTypes
     *            the Java types of the attribute in the input POJO
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the input values handling
     */
    void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object inputValue,
            boolean ingoreError, Class<?>... inputTypes) throws SqlRuntimeException;

    /*
     * DEBUG
     */
    default void setParameterEntryLog(Logger logger, SqlMetaType sqlMetaType, SqlRuntimeContext runtimeCtx,
            SqlQuery query, String paramName, Object inputValue, boolean ingoreError, Class<?>... inputTypes) {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setParameter for META type " + this + ": paramName=" + paramName + ", inputValue="
                    + inputValue + ", inputTypes=" + inputTypes);
        }
    }

    /**
     * Log or throw error.
     * 
     * @param logger
     *            the internal slf4j logger
     * @param ingoreError
     *            ignore improper input value handling
     * @param msg
     *            the error message
     */
    default void error(Logger logger, boolean ingoreError, String msg) {
        if (ingoreError) {
            logger.error(msg);
        } else {
            throw new SqlRuntimeException(msg);
        }
    }
}
