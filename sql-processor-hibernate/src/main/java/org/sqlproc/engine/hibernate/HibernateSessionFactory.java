package org.sqlproc.engine.hibernate;

import org.hibernate.SessionFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

/**
 * The simple implementation of the factory {@link SqlSessionFactory} for the Hibernate stack.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateSessionFactory implements SqlSessionFactory {

    /**
     * The Hibernate session factory.
     */
    private SessionFactory sessionFactory;

    /**
     * The name of the database related to this session. It's usage is implementation specific.
     */
    private String name;

    /**
     * Creates a new instance.
     * 
     * @param sessionFactory
     *            the Hibernate session factory
     */
    public HibernateSessionFactory(SessionFactory sessionFactory) {
        super();
        this.sessionFactory = sessionFactory;
    }

    /**
     * Creates a new instance.
     * 
     * @param sessionFactory
     *            the Hibernate session factory
     * @param name
     *            the name of the database related to this session
     */
    public HibernateSessionFactory(SessionFactory sessionFactory, String name) {
        super();
        this.sessionFactory = sessionFactory;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSession getSqlSession() {
        return HibernateSession.generateProxy(sessionFactory.openSession(), name);
    }
}
