package org.sqlproc.engine.jdbc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;

import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;

/**
 * The JDBC stack implementation of the SQL Engine session contract. In fact it's a proxy to the
 * {@link java.sql.Connection}.
 * 
 * It's the first parameter to all primary methods in the {@link SqlQueryEngine} and {@link SqlCrudEngine}.
 * 
 * <p>
 * The implementation is based on the dynamic proxy design pattern provided by the Java API.
 * <p>
 * The primary contract is the method for the {@link SqlQuery} instance creation.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcSession implements InvocationHandler {

    /**
     * The contracts implemented by this dynamic proxy.
     */
    private static final Class<?>[] PROXY_INTERFACES = new Class<?>[] { Connection.class, SqlSession.class };

    /**
     * The connection to the database. It should be opened.
     */
    private Connection connection;

    /**
     * The name of the database related to this session. It's usage is implementation specific.
     */
    private String name;

    /**
     * Creates a new instance of this dynamic proxy.
     * 
     * @param connection
     *            the connection to the database
     */
    private JdbcSession(Connection connection) {
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
    public JdbcSession(Connection connection, String name) {
        this(connection);
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("close".equals(method.getName())) {
            connection.close();
            return null;
        }

        if ("createSqlQuery".equals(method.getName())) {
            String queryString = (String) args[0];
            return new JdbcQuery(connection, queryString);
        }

        if ("executeBatch".equals(method.getName())) {
            String[] statements = (String[]) args[0];
            JdbcQuery jdbcQuery = new JdbcQuery(connection, null);
            return jdbcQuery.executeBatch(statements);
        }

        if ("getName".equals(method.getName())) {
            return name;
        }

        if ("setConnection".equals(method.getName())) {
            this.connection = (Connection) args[0];
            return null;
        }

        try {
            return method.invoke(connection, args);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        }
    }

    /**
     * The factory method to obtain this dynamic proxy.
     * 
     * @param connection
     *            the connection to the database
     * @return the JDBC stack implementation of the SQL Engine session contract
     */
    public static SqlSession generateProxy(Connection connection) {
        JdbcSession handler = new JdbcSession(connection);
        return (SqlSession) Proxy.newProxyInstance(getProxyClassLoader(), PROXY_INTERFACES, handler);
    }

    /**
     * The factory method to obtain this dynamic proxy.
     * 
     * @param connection
     *            the connection to the database
     * @param name
     *            the name of the database
     * @return the JDBC stack implementation of the SQL Engine session contract
     */
    public static SqlSession generateProxy(Connection connection, String name) {
        JdbcSession handler = new JdbcSession(connection, name);
        return (SqlSession) Proxy.newProxyInstance(getProxyClassLoader(), PROXY_INTERFACES, handler);
    }

    /**
     * Returns the class loader instance.
     * 
     * @return the class loader instance
     */
    public static ClassLoader getProxyClassLoader() {
        return SqlSession.class.getClassLoader();
    }
}
