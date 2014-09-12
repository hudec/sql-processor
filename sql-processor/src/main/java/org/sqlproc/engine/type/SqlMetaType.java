package org.sqlproc.engine.type;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * The common ancestor of all META types. These internal types are devoted for the special processing of the
 * input/output values.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlMetaType {

    /**
     * The internal slf4j logger.
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Declares a scalar query result, which is an SQL query execution output value.
     * 
     * @param query
     *            the SQL Engine query, an adapter or proxy to the internal JDBC or ORM staff
     * @param dbName
     *            the name of a database query output, it can be the column name or the alias name
     * @param attributeType
     *            the Java type of of the attribute in the result class
     */
    public abstract void addScalar(SqlQuery query, String dbName, Class<?> attributeType);

    /**
     * Initializes the attribute of the result class with output value from the SQL query execution.
     * 
     * @param runtime
     *            the public runtime context
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
    public abstract void setResult(SqlRuntimeContext runtime, Object resultInstance, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException;

    /**
     * Binds an input value to a named query parameter.
     * 
     * @param runtime
     *            the public runtime context
     * @param query
     *            the SQL Engine query, an adapter or proxy to the internal JDBC or ORM staff
     * @param paramName
     *            the name of the parameter
     * @param inputValue
     *            the possibly-null parameter value, a dynamic input value
     * @param ingoreError
     *            ignore improper input value handling
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the input values handling
     */
    public abstract void setParameter(SqlRuntimeContext runtime, SqlQuery query, String paramName, Object inputValue,
            Class<?> inputType, boolean ingoreError) throws SqlRuntimeException;
}
