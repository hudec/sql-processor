package org.sqlproc.engine.jpa.eclipselink;

import java.sql.Connection;

import javax.persistence.EntityManager;

import org.sqlproc.engine.jdbc.JdbcQuery;

/**
 * The JPA 2 - EclipseLink stack implementation of the SQL Engine query contract.
 * <p/>
 * In fact it's an adapter obtaining the database connection from JPA {@link javax.persistence.EntityManager} with the
 * EclipseLink specific {@link EntityManager#unwrap(java.sql.Connection)} call. The obtained database connection is then
 * used to implement methods required by the {@link org.sqlproc.engine.SqlQuery} interface on top of the
 * {@link org.sqlproc.engine.jdbc.JdbcQuery}.
 * <p/>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:winkler.marek@gmail.com">Marek Winkler</a>
 * @author <a href="mailto:ondrej.kotek@gmail.com">Ondrej Kotek</a>
 */
public class JpaQuery extends JdbcQuery {

    /**
     * Creates a new instance of this Query adapter which will use the database connection provided by the given
     * {@link javax.persistence.EntityManager}.
     * <p/>
     * The EntityManager gets unwrapped to provide the database connection using the
     * {@link EntityManager#unwrap(java.sql.Connection)} method. The JPA spec does not prescribe what arguments must
     * persistence providers implement, therefore this is the part dependent on EclipseLink's JPA implementation.
     * 
     * @param EntityManager
     *            the JPA EntityManager which is unwrapped to obtain JDBC Connection to the database, must not be null
     * @param queryString
     *            the SQL query/statement command
     */
    public JpaQuery(final EntityManager entityManager, final String query) {
        super(entityManager.unwrap(Connection.class), query);
    }
}
