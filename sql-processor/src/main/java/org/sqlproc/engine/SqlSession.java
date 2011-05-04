package org.sqlproc.engine;

/**
 * The SQL Engine session contract definition. In fact it's an adapter or a proxy to an internal stuff in one of the
 * stacks on top of which the SQL Processor works.
 * 
 * It's the first parameter to all primary methods in the {@link SqlQueryEngine} and {@link SqlCrudEngine}.
 * 
 * The implementation depends on the stack, on top of which the SQL Processor works. In this SQL Processor version the
 * next stacks can be used:
 * <ul>
 * <li>raw JDBC (default option)</li>
 * <li>Hibernate ORM</li>
 * <li>Spring DAO</li>
 * </ul>
 * For these stacks the next session objects can be utilized:
 * <ul>
 * <li>For the raw JDBC stack the session is a wrapper around a {@link java.sql.Connection} instance.</li>
 * <li>For the Hibernate ORM the session is a wrapper around a Hibernate Session instance.</li>
 * <li>For the Spring DAO the session is a wrapper around a Spring JdbcTemplate instance.</li>
 * </ul>
 * 
 * <p>
 * The primary contract is the method for the {@link SqlQuery} instance creation.
 * <p>
 * For the concrete implementation please see for example {@link org.sqlproc.engine.jdbc.JdbcSession} or
 * {@link org.sqlproc.engine.jdbc.JdbcSimpleSession}.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlSession {

    /**
     * Creates a new instance of {@link SqlQuery}, which is a wrapper around the SQL query command.
     * 
     * @param queryString
     *            the SQL query command
     * @return a new instance of a wrapper around the SQL query command
     * @throws SqlProcessorException
     *             in the case of any problem in ORM or JDBC stack
     */
    SqlQuery createSqlQuery(String queryString) throws SqlProcessorException;
}
