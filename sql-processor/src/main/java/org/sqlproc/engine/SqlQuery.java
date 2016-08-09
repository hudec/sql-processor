package org.sqlproc.engine;

import java.util.List;

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
     * Sets a timeout for the underlying query.
     * 
     * @param timeout
     *            the timeout in seconds
     * @return this instance to enable the methods chaining
     */
    SqlQuery setTimeout(int timeout);

    /**
     * Sets the first row to retrieve. If not set, rows will be retrieved beginning from row 0.
     * 
     * @param firstResult
     *            a row number, numbered from 0
     * @return this instance to enable the methods chaining
     */
    SqlQuery setFirstResult(int firstResult);

    /**
     * Sets the maximum number of rows to retrieve. If not set, there is no limit to the number of rows retrieved.
     * 
     * @param maxResults
     *            the maximum number of rows
     * @return this instance to enable the methods chaining
     */
    SqlQuery setMaxResults(int maxResults);

    /**
     * Sets the fetch size of rows to retrieve. If not set, there is no limit to the number of rows retrieved.
     *
     * @param fetchSize
     *            the fetch size of rows
     * @return this instance to enable the methods chaining
     */
    SqlQuery setFetchSize(int fetchSize);

    /**
     * Sets the indicator the SQL output is sorted.
     * 
     * @param ordered
     *            the indicator the SQL output is sorted
     * @return this instance to enable the methods chaining
     */
    SqlQuery setOrdered(boolean ordered);

    /**
     * Returns the query results as a <tt>List</tt>. If the query contains multiple results per row, the results are
     * returned in an instance of <tt>Object[]</tt>.
     * 
     * @param runtime
     *            the public runtime context
     * @return the result list
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    @SuppressWarnings("rawtypes")
    List list(SqlRuntimeContext runtime) throws SqlProcessorException;

    /**
     * Convenience method to return a single instance that matches the query, or null if the query returns no results.
     * 
     * @param runtime
     *            the public runtime context
     * @return the single result or <tt>null</tt>
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    Object unique(SqlRuntimeContext runtime) throws SqlProcessorException;

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
    @Beta
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
     * Returns the stored procedure execution results as a <tt>List</tt>. If the query contains multiple results per
     * row, the results are returned in an instance of <tt>Object[]</tt>. It's based on the CallableStatement
     * invocation.
     * 
     * @param runtime
     *            the public runtime context
     * @return the result list
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    @SuppressWarnings("rawtypes")
    List callList(SqlRuntimeContext runtime) throws SqlProcessorException;

    /**
     * Convenience method to return a single instance that matches the stored procedure execution, or null if the stored
     * procedure execution returns no results. It's based on the CallableStatement invocation.
     * 
     * @param runtime
     *            the public runtime context
     * @return the single result or <tt>null</tt>
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    Object callUnique(SqlRuntimeContext runtime) throws SqlProcessorException;

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
    Object callFunction() throws SqlProcessorException;

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
    SqlQuery setParameter(String name, Object val, Object type) throws SqlProcessorException;

    /**
     * Binds multiple values to a named query parameter. This is useful for binding a list of values to the query
     * fragment <tt>in (:value_list)</tt>.
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
     * fragment <tt>in (:value_list)</tt>.
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
    SqlQuery setParameterList(String name, Object[] vals, Object type) throws SqlProcessorException;

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
        boolean processRow(Object resultRow, int rownum) throws SqlRuntimeException;
    }
}
