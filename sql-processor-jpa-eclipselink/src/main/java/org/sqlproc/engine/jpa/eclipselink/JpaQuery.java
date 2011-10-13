package org.sqlproc.engine.jpa.eclipselink;

import java.sql.Connection;

import javax.persistence.EntityManager;

import org.sqlproc.engine.jdbc.JdbcQuery;

/**
 * The JPA - EclipseLink stack implementation of the SQL Engine query contract. In fact it's an adapter obtaining the
 * database connection from JPA EntityManager in an EclipseLink specific {@link EntityManager#unwrap(Class)} call.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JpaQuery extends JdbcQuery {

    /**
     * Creates a new instance of this adapter.
     * 
     * @param EntityManager
     *            the JPA EntityManager which is unwrapped to obtain JDBC Connection to the database
     * @param queryString
     *            the SQL query/statement command
     */
    public JpaQuery(final EntityManager entityManager, final String query) {
        super(entityManager.unwrap(Connection.class), query);
    }
}
