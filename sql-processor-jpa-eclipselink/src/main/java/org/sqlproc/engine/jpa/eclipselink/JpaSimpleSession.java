package org.sqlproc.engine.jpa.eclipselink;

import javax.persistence.EntityManager;

import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlProcessorException;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;

/**
 * The JPA stack implementation of the SQL Engine session contract. In fact it's a simple wrapper for the
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
public class JpaSimpleSession implements SqlSession {

    /**
     * The Hibernate Session, the first level cache and the context for all database operations.
     */
    private final EntityManager entityManager;

    /**
     * Creates a new instance of this dynamic proxy.
     * 
     * @param entityManager
     *            the Hibernate Session instance
     */
    public JpaSimpleSession(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Returns the internal Hibernate Session instance.
     * 
     * @return the internal Hibernate Session instance
     */
    public EntityManager getEntityManager() {
        return this.entityManager;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery createSqlQuery(final String queryString) throws SqlProcessorException {
        return new JpaQuery(this.entityManager, queryString);
    }
}
