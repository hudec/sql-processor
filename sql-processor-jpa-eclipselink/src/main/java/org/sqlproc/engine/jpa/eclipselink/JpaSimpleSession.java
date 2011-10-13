package org.sqlproc.engine.jpa.eclipselink;

import javax.persistence.EntityManager;

import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlProcessorException;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;

/**
 * The JPA 2 with EclipseLink stack implementation of the SQL Engine session contract. In fact it's a simple wrapper for
 * the JDBC connection obtained from the {@link javax.persistence.EntityManager}.
 * <p/>
 * The primary contract is the method for the {@link SqlQuery} instance creation.
 * <p/>
 * It's the first parameter to all primary methods in the {@link SqlQueryEngine} and {@link SqlCrudEngine}.
 * <p/>
 * The EntityManager is used only to enable convenient JPA-style configuration, the SQL Engine uses only the
 * {@link java.sql.Connection} provided by EntityManager.
 * <p/>
 * It is strongly recommended that the EntityManager instance used to create the SqlSession instance should be used
 * exclusively by the SQL Processor, i.e. it should NOT be used for querying/persisting entities, construction of JPQL
 * or native SQL queries, etc.
 * <p/>
 * Also note, that when the EntityManager is bound to a transaction, so are the SQL Processor operations using the
 * {@link SqlSession} constructed from this EntityManager.
 * <p/>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:winkler.marek@gmail.com">Marek Winkler</a>
 * @author <a href="mailto:ondrej.kotek@gmail.com">Ondrej Kotek</a>
 */
public class JpaSimpleSession implements SqlSession {

    /**
     * The EntityManager, the first level cache and the context for all database operations.
     */
    private final EntityManager entityManager;

    /**
     * Creates a new instance of this session.
     * 
     * @param entityManager
     *            the EntityManager instance which will provide the database connection, must not be null
     */
    public JpaSimpleSession(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Returns the internal EntityManager instance whose database connection is used by SQL Processor.
     * 
     * @return the EntityManager instance
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
