package org.sqlproc.engine.hibernate;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.hibernate.Session;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;

/**
 * The Hibernate stack implementation of the SQL Engine session contract. In fact it's a proxy to the
 * {@link org.hibernate.Session}.
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
public class HibernateSession implements InvocationHandler {

    /**
     * The contracts implemented by this dynamic proxy.
     */
    private static final Class[] PROXY_INTERFACES = new Class[] { Session.class, SqlSession.class };

    /**
     * The Hibernate Session, the first level cache and the context for all database operations.
     */
    private Session session;

    /**
     * The name of the database related to this session. It's usage is implementation specific.
     */
    private String name;

    /**
     * Creates a new instance of this dynamic proxy.
     * 
     * @param session
     *            the Hibernate Session instance
     */
    private HibernateSession(Session session) {
        this.session = session;
    }

    /**
     * Creates a new instance of this dynamic proxy.
     * 
     * @param session
     *            the Hibernate Session instance
     * @param name
     *            the name of the database
     */
    public HibernateSession(Session session, String name) {
        this(session);
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("close".equals(method.getName())) {
            session.close();
            return null;
        }

        if ("createSqlQuery".equals(method.getName())) {
            String queryString = (String) args[0];
            return new HibernateQuery(session, session.createSQLQuery(queryString));
        }

        if ("executeBatch".equals(method.getName())) {
            String[] statements = (String[]) args[0];
            HibernateQuery hibernateQuery = new HibernateQuery(session, null);
            return hibernateQuery.executeBatch(statements);
        }

        if ("getName".equals(method.getName())) {
            return name;
        }

        if ("setSession".equals(method.getName())) {
            this.session = (Session) args[0];
            return null;
        }

        try {
            return method.invoke(session, args);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        }
    }

    /**
     * The factory method to obtain this dynamic proxy.
     * 
     * @param session
     *            the Hibernate Session instance
     * @return the Hibernate stack implementation of the SQL Engine session contract
     */
    public static SqlSession generateProxy(Session session) {
        HibernateSession handler = new HibernateSession(session);
        return (SqlSession) Proxy.newProxyInstance(getProxyClassLoader(), PROXY_INTERFACES, handler);
    }

    /**
     * The factory method to obtain this dynamic proxy.
     * 
     * @param session
     *            the Hibernate Session instance
     * @param name
     *            the name of the database
     * @return the Hibernate stack implementation of the SQL Engine session contract
     */
    public static SqlSession generateProxy(Session session, String name) {
        HibernateSession handler = new HibernateSession(session, name);
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
