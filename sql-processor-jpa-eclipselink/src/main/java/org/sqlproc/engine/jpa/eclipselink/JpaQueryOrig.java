package org.sqlproc.engine.jpa.eclipselink;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.eclipse.persistence.config.QueryHints;
import org.eclipse.persistence.config.ResultType;
import org.eclipse.persistence.sessions.DatabaseRecord;
import org.sqlproc.engine.SqlProcessorException;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.impl.SqlMetaStatement.Type;
import org.sqlproc.engine.jdbc.type.JdbcSqlType;
import org.sqlproc.engine.type.IdentitySetter;

/**
 * The Hibernate stack implementation of the SQL Engine query contract. In fact it's an adapter the internal Hibernate
 * stuff.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JpaQueryOrig implements SqlQuery {

    private static final String TIMEOUT_HINT = "javax.persistence.query.timeout";

    /**
     * The EntityManager instance.
     */
    EntityManager entityManager;
    /**
     * The EclipseLink Connection instance.
     */
    Connection connection;
    /**
     * The EntityManager Query instance.
     */
    Query query;
    /**
     * The collection of all (auto-generated) identities.
     */
    List<String> identities = new ArrayList<String>();
    /**
     * The collection of all identities setters.
     */
    Map<String, IdentitySetter> identitySetters = new HashMap<String, IdentitySetter>();
    /**
     * The collection of all identities types.
     */
    Map<String, Object> identityTypes = new HashMap<String, Object>();
    /**
     * The collection of all scalars (output values declarations).
     */
    List<String> scalars = new ArrayList<String>();
    /**
     * The collection of all scalars types.
     */
    Map<String, Object> scalarTypes = new HashMap<String, Object>();

    /**
     * Creates a new instance of this adapter.
     * 
     * @param connection
     *            the Hibernate Session instance
     * @param query
     *            the Hibernate SQLQuery instance
     */
    public JpaQueryOrig(final EntityManager entityManager, final String query) {
        this.entityManager = entityManager;
        this.connection = this.entityManager.unwrap(Connection.class);
        this.query = this.entityManager.createNativeQuery(query);
        this.query.setHint(QueryHints.RESULT_TYPE, ResultType.Map);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getQuery() {
        return this.query;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setTimeout(int timeout) {
        this.query.setHint(TIMEOUT_HINT, timeout * 1000); // hint sets timeout in milliseconds
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setFirstResult(int firstResult) {
        this.query.setFirstResult(firstResult);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setMaxResults(int maxResults) {
        this.query.setMaxResults(maxResults);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List list() throws SqlProcessorException {
        try {
            return this.processResults(this.query.getResultList());
        } catch (SQLException e) {
            throw new SqlProcessorException(e);
        } catch (PersistenceException e) {
            throw new SqlProcessorException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object unique() throws SqlProcessorException {
        try {
            return this.query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } catch (PersistenceException e) {
            throw new SqlProcessorException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int update() throws SqlProcessorException {
        try {
            int updated = this.query.executeUpdate();
            if (!identities.isEmpty()) {
                String identityName = identities.get(0);
                this.doIdentitySelect(identityName);
            }
            return updated;
        } catch (PersistenceException e) {
            throw new SqlProcessorException(e);
        }
    }

    /**
     * Runs the select to obtain the value of auto-generated identity.
     * 
     * @param identityName
     *            the identity name from the META SQL statement
     */
    private void doIdentitySelect(String identityName) {
        IdentitySetter identitySetter = identitySetters.get(identityName);
        Object identityType = identityTypes.get(identityName);
        JpaQueryOrig query2 = new JpaQueryOrig(this.entityManager, identitySetter.getIdentitySelect());
        query2.addScalar("1", (Type) identityType);
        // TODO check returned value
        Object identityValue = query2.unique();
        identitySetter.setIdentity(identityValue);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery addScalar(String columnAlias) {
        scalars.add(columnAlias);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery addScalar(String columnAlias, Object type) {
        scalars.add(columnAlias);
        scalarTypes.put(columnAlias, type);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setParameter(String name, Object val) throws SqlProcessorException {
        try {
            query.setParameter(name, val);
            return this;
        } catch (PersistenceException e) {
            throw new SqlProcessorException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setParameter(String name, Object val, Object type) throws SqlProcessorException {
        throw new UnsupportedOperationException("Not implemented yet");
        /*
         * if (val != null && val instanceof IdentitySetter) { identities.add(name); identitySetters.put(name,
         * (IdentitySetter) val); identityTypes.put(name, type); } else { try { query.setParameter(name, val, (Type)
         * type); } catch (HibernateException he) { throw new SqlProcessorException(he); } } return this;
         */
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setParameterList(String name, Object[] vals) throws SqlProcessorException {
        throw new UnsupportedOperationException("Not implemented yet");
        /*
         * try { query.setParameterList(name, vals); return this; } catch (HibernateException he) { throw new
         * SqlProcessorException(he); }
         */
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setParameterList(String name, Object[] vals, Object type) throws SqlProcessorException {
        throw new UnsupportedOperationException("Not implemented yet");
        /*
         * try { query.setParameterList(name, vals, (Type) type); return this; } catch (HibernateException he) { throw
         * new SqlProcessorException(he); }
         */
    }

    /**
     * Gets the value of the designated columns as the objects in the Java programming language.
     * 
     * @param results
     *            an instance of ResultSet
     * @return the result list
     * @throws SQLException
     *             if a database access error occurs or this method is called on a closed <code>ResultSet</code>
     */
    protected List<Object> processResults(List<Object> results) throws SQLException {
        List<Object> processedResults = new ArrayList<Object>();
        if (results == null)
            return processedResults;
        for (Object record : results) {
            Object[] row = this.processResultRow(record);
            if (row.length == 1) {
                processedResults.add(row[0]);
            } else {
                processedResults.add(row);
            }
        }
        return processedResults;
    }

    private Object[] processResultRow(final Object recordAsObject) {
        final DatabaseRecord record = (DatabaseRecord) recordAsObject;

        List<Object> row = new ArrayList<Object>();
        for (int i = 0, n = scalars.size(); i < n; i++) {
            String name = scalars.get(i);
            Object type = scalarTypes.get(name);
            Object value = null;
            if (type != null && type instanceof JdbcSqlType) {
                // value = ((JdbcSqlType) type).get(rs, name);
                System.err.println("Warning: JdbcSqlType conversion called but ignored: " + type.getClass().getName()
                        + "; " + name);
                value = record.get(name.toUpperCase());
            } else {
                value = record.get(name.toUpperCase());
            }
            row.add(value);
        }
        return row.toArray();
    }

    @Override
    @SuppressWarnings("rawtypes")
    public List callList() throws SqlProcessorException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object callUnique() throws SqlProcessorException {
        throw new UnsupportedOperationException();
    }

    @Override
    public int callUpdate() throws SqlProcessorException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object callFunction() throws SqlProcessorException {
        throw new UnsupportedOperationException();
    }
}
