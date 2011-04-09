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
 * <p>
 * For more info please see the Reference Guide or the <a
 * href="http://code.google.com/p/sql-processor/w/list">tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcSimpleSession implements SqlSession {

    /**
     * The connection to the database. It should be opened.
     */
    Connection connection;

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
}
