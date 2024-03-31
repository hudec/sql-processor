package org.sqlproc.engine;

import java.util.List;
import java.util.Map;

import org.sqlproc.engine.annotation.Beta;

/**
 * The SQL Engine query contract definition. In fact it's an adapter or a proxy to an internal stuff in one of the
 * stacks on top of which the SQL Processor works.
 * 
 * <p>
 * For the concrete implementation please see for example {@link org.sqlproc.engine.jdbc.JdbcQuery}.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlQuery {

    /**
     * Returns the internal representation of this query. This implementation depends on the stack on top of which the
     * SQL Processor works. It can be for example the Hibernate SQLQuery instance.
     * 
     * @return the internal representation of this query
     */
    Object getQuery();

    /**
     * Sets the compound parameters controlling the META SQL execution.
     * 
     * @param sqlControl
     *            the compound parameters controlling the META SQL execution
     * @return this instance to enable the methods chaining
     */
    SqlQuery setSqlControl(SqlControl sqlControl);

    /**
     * Sets the indicator the SQL output is sorted.
     * 
     * @param ordered
     *            the indicator the SQL output is sorted
     * @return this instance to enable the methods chaining
     */
    SqlQuery setOrdered(boolean ordered);

    /**
     * Returns the query results as a <code>List</code>. If the query contains multiple results per row, the results are
     * returned in an instance of <code>Object[]</code>.
     * 
     * @param runtime
     *            the public runtime context
     * @return the result list
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    List<Map<String, Object>> list(SqlRuntimeContext runtime) throws SqlProcessorException;

    /**
     * Convenience method to return a single instance that matches the query, or null if the query returns no results.
     * 
     * @param runtime
     *            the public runtime context
     * @return the single result or <code>null</code>
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    Map<String, Object> unique(SqlRuntimeContext runtime) throws SqlProcessorException;

    /**
     * Process the query output using the {@link SqlQueryRowProcessor}.
     * 
     * @param runtime
     *            the public runtime context
     * @param sqlQueryRowProcessor
     *            the callback designated to process every database row
     * @return the total number of processed database rows
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    int query(SqlRuntimeContext runtime, SqlQueryRowProcessor sqlQueryRowProcessor) throws SqlProcessorException;

    /**
     * Executes the update, delete or insert statement.
     * 
     * @param runtime
     *            the public runtime context
     * @return the number of affected rows
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    int update(SqlRuntimeContext runtime) throws SqlProcessorException;

    /**
     * Returns the stored procedure execution results as a <code>List</code>. If the query contains multiple results per
     * row, the results are returned in an instance of <code>Object[]</code>. It's based on the CallableStatement
     * invocation.
     * 
     * @param runtime
     *            the public runtime context
     * @return the result list
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    List<Map<String, Object>> callList(SqlRuntimeContext runtime) throws SqlProcessorException;

    /**
     * Convenience method to return a single instance that matches the stored procedure execution, or null if the stored
     * procedure execution returns no results. It's based on the CallableStatement invocation.
     * 
     * @param runtime
     *            the public runtime context
     * @return the single result or <code>null</code>
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    Map<String, Object> callUnique(SqlRuntimeContext runtime) throws SqlProcessorException;

    /**
     * Executes the update, delete, insert statement or other statements in the stored procedure, which don't return the
     * result set. It's based on the CallableStatement invocation.
     * 
     * @param runtime
     *            the public runtime context
     * @return the number of affected rows
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    int callUpdate(SqlRuntimeContext runtime) throws SqlProcessorException;

    /**
     * Executes the statements in the stored function, which return value of any type but the result set. It's based on
     * the CallableStatement invocation.
     * 
     * @return the result of the stored function invocation
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    Map<String, Object> callFunction() throws SqlProcessorException;

    /**
     * Declares a scalar query result, which is an SQL query execution output value.
     * 
     * @param columnAlias
     *            the name of the database column or the alias in the result set
     * @return this instance to enable the methods chaining
     */
    SqlQuery addScalar(String columnAlias);

    /**
     * Declares a scalar query result, which is an SQL query execution output value.
     * 
     * @param columnAlias
     *            the name of the database column or the alias in the result set
     * @param type
     *            the (META) type of the parameter
     * @return this instance to enable the methods chaining
     */
    SqlQuery addScalar(String columnAlias, Object type, Class<?>... moreTypes);

    /**
     * Binds a value to a named query parameter.
     * 
     * @param name
     *            the name of the parameter
     * @param val
     *            the not-null parameter value
     * @return this instance to enable the methods chaining
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    SqlQuery setParameter(String name, Object val) throws SqlProcessorException;

    /**
     * Binds a value to a named query parameter.
     * 
     * @param name
     *            the name of the parameter
     * @param val
     *            the possibly-null parameter value
     * @param type
     *            the (META) type of the parameter
     * @return this instance to enable the methods chaining
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    SqlQuery setParameter(String name, Object val, Object type, Class<?>... moreTypes) throws SqlProcessorException;

    /**
     * Binds multiple values to a named query parameter. This is useful for binding a list of values to the query
     * fragment <code>in (:value_list)</code>.
     * 
     * @param name
     *            the name of the parameter
     * @param vals
     *            a collection of values
     * @return this instance to enable the methods chaining
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    SqlQuery setParameterList(String name, Object[] vals) throws SqlProcessorException;

    /**
     * Binds multiple values to a named query parameter. This is useful for binding a list of values to the query
     * fragment <code>in (:value_list)</code>.
     * 
     * @param name
     *            the name of the parameter
     * @param vals
     *            a collection of values
     * @param type
     *            the (META) type of the parameter
     * @return this instance to enable the methods chaining
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    SqlQuery setParameterList(String name, Object[] vals, Object type, Class<?>... moreTypes)
            throws SqlProcessorException;

    /**
     * Submits a batch of commands to the database for execution and if all commands execute successfully, returns an
     * array of update counts.
     * 
     * @param statements
     *            SQL statements to be executed in batch
     * @return an array of update counts containing one element for each command in the batch
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    int[] executeBatch(String[] statements) throws SqlProcessorException;

    /**
     * Sets an indicator the failed SQL command should be logged
     * 
     * @param logError
     *            an indicator the failed SQL command should be logged
     */
    public void setLogError(boolean logError);

    /**
     * A low level callback to be used with the cursor based queries.
     * 
     * <p>
     * {@link #processRow} will be called for each database row that is read, and should return {@code false} when you
     * want to stop processing. It is utilized by {@link SqlQuery#query(SqlRuntimeContext, SqlQueryRowProcessor)}.
     * 
     * <p>
     * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
     * 
     * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
     */
    @Beta
    public interface SqlQueryRowProcessor {

        /**
         * This method will be called once for database row.
         *
         * @param resultRow
         *            The object representation of the database row.
         * @param rownum
         *            The database row number starting from 1.
         * @return True to continue processing, false to stop.
         */
        boolean processRow(Map<String, Object> resultRow, int rownum) throws SqlRuntimeException;
    }
}
