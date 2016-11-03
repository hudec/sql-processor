package org.sqlproc.engine.jdbc;

import java.sql.Connection;

import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

/**
 * The simple implementation of the factory {@link SqlSessionFactory} for the JDBC stack.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcSessionFactory implements SqlSessionFactory {

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
    public JdbcSessionFactory(Connection connection) {
        super();
        this.connection = connection;
    }

    /**
     * Creates a new instance.
     * 
     * @param connection
     *            the connection to the database
     * @param name
     *            the name of the database related to this session
     */
    public JdbcSessionFactory(Connection connection, String name) {
        super();
        this.connection = connection;
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSession getSqlSession() {
        return JdbcSession.generateProxy(connection, name);
    }
}
