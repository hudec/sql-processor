package org.sqlproc.engine.jdbc;

import java.sql.Connection;

import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlProcessorException;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;

/**
 * The JDBC stack implementation of the SQL Engine session contract. In fact it's a simple wrapper for the
 * {@link java.sql.Connection}.
 * 
 * It's the first parameter to all primary methods in the {@link SqlQueryEngine} and {@link SqlCrudEngine}.
 * 
 * <p>
 * The primary contract is the method for the {@link SqlQuery} instance creation.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcSimpleSession implements SqlSession {

    /**
     * The connection to the database. It should be opened.
     */
    private Connection connection;

    /**
     * The name of the database related to this session. It's usage is implementation specific.
     */
    private String name;

    /**
     * Creates a new instance.
     * 
     * @param connection
     *            the connection to the database
     */
    public JdbcSimpleSession(Connection connection) {
        super();
        this.connection = connection;
    }

    /**
     * Creates a new instance of this dynamic proxy.
     * 
     * @param connection
     *            the connection to the database
     * @param name
     *            the name of the database
     */
    public JdbcSimpleSession(Connection connection, String name) {
        this(connection);
        this.name = name;
    }

    /**
     * Returns the internal connection to the database.
     * 
     * @return the connection to the database
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery createSqlQuery(String queryString) throws SqlProcessorException {
        return new JdbcQuery(connection, queryString);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int[] executeBatch(String... statements) throws SqlProcessorException {
        SqlQuery sqlQuery = createSqlQuery(null);
        return sqlQuery.executeBatch(statements);
    }

    /**
     * @return the name of the database related to this session. It's usage is implementation specific.
     */
    public String getName() {
        return name;
    }
}
