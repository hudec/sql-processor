package org.sqlproc.engine.hibernate;

import org.hibernate.Session;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlProcessorException;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;

/**
 * The Hibernate stack implementation of the SQL Engine session contract. In fact it's a simple wrapper for the
 * {@link org.hibernate.Session}.
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
public class HibernateSimpleSession implements SqlSession {

    /**
     * The Hibernate Session, the first level cache and the context for all database operations.
     */
    private final Session session;

    /**
     * Creates a new instance of this dynamic proxy.
     * 
     * @param session
     *            the Hibernate Session instance
     */
    public HibernateSimpleSession(Session session) {
        this.session = session;
    }

    /**
     * Returns the internal Hibernate Session instance.
     * 
     * @return the internal Hibernate Session instance
     */
    public Session getSession() {
        return session;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery createSqlQuery(String queryString) throws SqlProcessorException {
        return new HibernateQuery(session, session.createSQLQuery(queryString));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int[] executeBatch(String[] statements) throws SqlProcessorException {
        SqlQuery sqlQuery = createSqlQuery(null);
        return sqlQuery.executeBatch(statements);
    }
}
