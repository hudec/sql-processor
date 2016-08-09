package org.sqlproc.engine.type;

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
    public Object getProviderSqlType();

    /**
     * Declares a scalar query result, which is an SQL query execution output value.
     * 
     * @param typeFactory
     *            the SQL Type factory
     * @param query
     *            the SQL Engine query, an adapter or proxy to the internal JDBC or ORM staff
     * @param dbName
     *            the name of a database query output, it can be the column name or the alias name
     * @param attributeType
     *            the Java type of of the attribute in the result class
     */
    public void addScalar(SqlTypeFactory typeFactory, SqlQuery query, String dbName, Class<?>... attributeTypes);

    /**
     * Initializes the attribute of the result class with output value from the SQL query execution.
     * 
     * @param runtimeCtx
     *            the public runtimeCtx context
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
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException;

    /**
     * Binds an input value to a named query parameter.
     * 
     * @param runtimeCtx
     *            the public runtimeCtx context
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
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object inputValue,
            Class<?> inputType, boolean ingoreError) throws SqlRuntimeException;
}
