package org.sqlproc.engine.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.type.Type;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlProcessorException;
import org.sqlproc.engine.SqlQuery;
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
public class HibernateQuery implements SqlQuery {

    /**
     * The Hibernate Session instance.
     */
    Session session;
    /**
     * The Hibernate SQLQuery instance.
     */
    SQLQuery query;
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
     * Creates a new instance of this adapter.
     * 
     * @param session
     *            the Hibernate Session instance
     * @param query
     *            the Hibernate SQLQuery instance
     */
    public HibernateQuery(Session session, SQLQuery query) {
        this.session = session;
        this.query = query;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getQuery() {
        return query;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setTimeout(int timeout) {
        query.setTimeout(timeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setFirstResult(int firstResult) {
        query.setFirstResult(firstResult);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setMaxResults(int maxResults) {
        query.setMaxResults(maxResults);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setOrdered(boolean ordered) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List list() throws SqlProcessorException {
        try {
            return query.list();
        } catch (HibernateException he) {
            throw new SqlProcessorException(he);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object unique() throws SqlProcessorException {
        try {
            return query.uniqueResult();
        } catch (HibernateException he) {
            throw new SqlProcessorException(he);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int update() throws SqlProcessorException {
        if (isSetJDBCIdentity()) {
            throw new UnsupportedOperationException(
                    "JDBC identity select (IDSEL_JDBC) not supported in Hibernate stack.");
        }
        try {
            int updated = query.executeUpdate();
            if (!identities.isEmpty()) {
                String identityName = identities.get(0);
                doIdentitySelect(identityName);
            }
            return updated;
        } catch (HibernateException he) {
            throw new SqlProcessorException(he);
        }
    }

    private boolean isSetJDBCIdentity() {
        for (String identityName : identities) {
            IdentitySetter identitySetter = identitySetters.get(identityName);
            if (identitySetter.getIdentitySelect().equals(SqlFeature.IDSEL_JDBC)) {
                return true;
            }
        }
        return false;
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
        SQLQuery query2 = session.createSQLQuery(identitySetter.getIdentitySelect());
        query2.addScalar("1", (Type) identityType);
        Object identityValue = query2.uniqueResult();
        identitySetter.setIdentity(identityValue);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery addScalar(String columnAlias) {
        query.addScalar(columnAlias);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery addScalar(String columnAlias, Object type) {
        query.addScalar(columnAlias, (Type) type);
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
        } catch (HibernateException he) {
            throw new SqlProcessorException(he);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setParameter(String name, Object val, Object type) throws SqlProcessorException {
        if (val != null && val instanceof IdentitySetter) {
            identities.add(name);
            identitySetters.put(name, (IdentitySetter) val);
            identityTypes.put(name, type);
        } else {
            try {
                query.setParameter(name, val, (Type) type);
            } catch (HibernateException he) {
                throw new SqlProcessorException(he);
            }
        }
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setParameterList(String name, Object[] vals) throws SqlProcessorException {
        try {
            query.setParameterList(name, vals);
            return this;
        } catch (HibernateException he) {
            throw new SqlProcessorException(he);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setParameterList(String name, Object[] vals, Object type) throws SqlProcessorException {
        try {
            query.setParameterList(name, vals, (Type) type);
            return this;
        } catch (HibernateException he) {
            throw new SqlProcessorException(he);
        }
    }

    @Override
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
