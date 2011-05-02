package org.sqlproc.engine;

import java.util.List;

/**
 * The SQL Engine query contract definition. In fact it's an adapter or a proxy to an internal stuff in one of the
 * stacks on top of which the SQL Processor works.
 * 
 * <p>
 * For the concrete implementation please see for example {@link org.sqlproc.engine.jdbc.JdbcQuery}.
 * <p>
 * For more info please see the Reference Guide or the <a
 * href="http://code.google.com/p/sql-processor/w/list">tutorials</a>.
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
     * Returns the query results as a <tt>List</tt>. If the query contains multiple results per row, the results are
     * returned in an instance of <tt>Object[]</tt>.
     * 
     * @return the result list
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    List list() throws SqlProcessorException;

    /**
     * Convenience method to return a single instance that matches the query, or null if the query returns no results.
     * 
     * @return the single result or <tt>null</tt>
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    Object unique() throws SqlProcessorException;

    /**
     * Executes the update, delete or insert statement.
     * 
     * @return the number of affected rows
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    int update() throws SqlProcessorException;

    /**
     * Returns the query results as a <tt>List</tt>. If the query contains multiple results per row, the results are
     * returned in an instance of <tt>Object[]</tt>. It's based on the callableStatement invocation.
     * 
     * @return the result list
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    List callList() throws SqlProcessorException;

    /**
     * Convenience method to return a single instance that matches the query, or null if the query returns no results.
     * It's based on the callableStatement invocation.
     * 
     * @return the single result or <tt>null</tt>
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    Object callUnique() throws SqlProcessorException;

    /**
     * Executes the update, delete or insert statement. It's based on the callableStatement invocation.
     * 
     * @return the number of affected rows
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    int callUpdate() throws SqlProcessorException;

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
    SqlQuery addScalar(String columnAlias, Object type);

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
}
