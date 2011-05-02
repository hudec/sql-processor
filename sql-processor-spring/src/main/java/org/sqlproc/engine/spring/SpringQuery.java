package org.sqlproc.engine.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterDisposer;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.sqlproc.engine.SqlProcessorException;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.impl.SqlUtils;
import org.sqlproc.engine.jdbc.type.JdbcSqlType;
import org.sqlproc.engine.type.IdentitySetter;

/**
 * The Spring stack implementation of the SQL Engine query contract. In fact it's an adapter the internal Spring stuff.
 * 
 * <p>
 * For more info please see the Reference Guide or the <a
 * href="http://code.google.com/p/sql-processor/w/list">tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SpringQuery implements SqlQuery {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * The Spring JdbcTemplate, the central class for all Spring database operations.
     */
    JdbcTemplate jdbcTemplate;
    /**
     * The SQL query/statement command.
     */
    String queryString;
    /**
     * The collection of all scalars (output values declarations).
     */
    List<String> scalars = new ArrayList<String>();
    /**
     * The collection of all scalars types.
     */
    Map<String, Object> scalarTypes = new HashMap<String, Object>();
    /**
     * The collection of all parameters (input value declarations).
     */
    List<String> parameters = new ArrayList<String>();
    /**
     * The collection of all parameters values.
     */
    Map<String, Object> parameterValues = new HashMap<String, Object>();
    /**
     * The collection of all parameters types.
     */
    Map<String, Object> parameterTypes = new HashMap<String, Object>();
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
     * A timeout for the underlying query.
     */
    Integer timeout;
    /**
     * The first row to retrieve.
     */
    Integer firstResult;
    /**
     * The maximum number of rows to retrieve.
     */
    Integer maxResults;

    /**
     * Creates a new instance of this adapter.
     * 
     * @param jdbcTemplate
     *            the Spring JdbcTemplate instance
     * @param queryString
     *            the SQL query/statement command
     */
    public SpringQuery(JdbcTemplate jdbcTemplate, String queryString) {
        this.jdbcTemplate = jdbcTemplate;
        this.queryString = queryString;
        // logger.info("query: " + queryString);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getQuery() {
        return jdbcTemplate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setTimeout(int timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setFirstResult(int firstResult) {
        this.firstResult = firstResult;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setMaxResults(int maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List list() throws SqlProcessorException {
        final StringBuilder queryResult = (maxResults != null) ? new StringBuilder(queryString.length() + 100) : null;
        final SqlUtils.LimitType limitType = (maxResults != null) ? SqlUtils.limitQuery(queryString, queryResult,
                firstResult, maxResults) : null;
        final String query = limitType != null ? queryResult.toString() : queryString;
        if (logger.isDebugEnabled()) {
            logger.debug("list, query=" + query);
        }

        PreparedStatementCreator psc = new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement ps = con.prepareStatement(query);
                if (timeout != null)
                    ps.setQueryTimeout(timeout);
                return ps;
            }
        };
        PreparedStatementSetter pss = new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                setParameters(ps, limitType);
            }
        };
        ResultSetExtractor<List> rse = new ResultSetExtractor<List>() {
            @Override
            public List extractData(ResultSet rs) throws SQLException, DataAccessException {
                return getResults(rs);
            }
        };

        try {
            List list = jdbcTemplate.query(psc, pss, rse);
            if (logger.isDebugEnabled()) {
                logger.debug("list, number of returned rows=" + ((list != null) ? list.size() : "null"));
            }
            return list;
        } catch (DataAccessException dae) {
            throw new SqlProcessorException(dae);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object unique() throws SqlProcessorException {
        List list = list();
        int size = list.size();
        if (size == 0)
            return null;
        Object first = list.get(0);
        for (int i = 1; i < size; i++) {
            if (list.get(i) != first) {
                throw new SqlProcessorException("There's no unique result, the number of returned rows is "
                        + list.size());
            }
        }
        return first;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int update() throws SqlProcessorException {
        if (logger.isDebugEnabled()) {
            logger.debug("update, query=" + queryString);
        }

        PreparedStatementCreator psc = new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement ps = con.prepareStatement(queryString);
                if (timeout != null)
                    ps.setQueryTimeout(timeout);
                return ps;
            }
        };
        PreparedStatementSetter pss = new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                setParameters(ps, null);
            }
        };

        try {
            int updated = update(psc, pss);
            if (!identities.isEmpty()) {
                String identityName = identities.get(0);
                doIdentitySelect(identityName);
            }
            if (logger.isDebugEnabled()) {
                logger.debug("update, number of updated rows=" + updated);
            }
            return updated;
        } catch (DataAccessException dae) {
            throw new SqlProcessorException(dae);
        }
    }

    /**
     * Runs the select to obtain the value of auto-generated identity.
     * 
     * @param identityName
     *            the identity name from the META SQL statement
     */
    private void doIdentitySelect(final String identityName) {
        final IdentitySetter identitySetter = identitySetters.get(identityName);
        final Object identityType = identityTypes.get(identityName);
        if (logger.isDebugEnabled()) {
            logger.debug("identity, name=" + identityName + ", select=" + identitySetter.getIdentitySelect()
                    + ", identityType=" + identityType);
        }

        PreparedStatementCreator psc = new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement ps = con.prepareStatement(identitySetter.getIdentitySelect());
                return ps;
            }
        };
        ResultSetExtractor<Object> rse = new ResultSetExtractor<Object>() {
            @Override
            public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
                Object identityValue = null;
                while (rs.next()) {
                    if (identityType != null && identityType instanceof JdbcSqlType) {
                        identityValue = ((JdbcSqlType) identityType).get(rs, identityName);
                    } else {
                        identityValue = rs.getObject(1);
                    }
                    if (rs.wasNull())
                        identityValue = null;
                }
                return identityValue;
            }
        };

        try {
            Object identityValue = jdbcTemplate.query(psc, null, rse);
            identitySetter.setIdentity(identityValue);
            if (logger.isDebugEnabled()) {
                logger.debug("identity, result=" + identityValue);
            }
        } catch (DataAccessException dae) {
            throw new SqlProcessorException(dae);
        }
    }

    /**
     * This is a workaround, as this method is not visible in JdbcTemplate.
     */
    protected int update(final PreparedStatementCreator psc, final PreparedStatementSetter pss)
            throws DataAccessException {

        logger.debug("Executing prepared SQL update");
        return jdbcTemplate.execute(psc, new PreparedStatementCallback<Integer>() {
            public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException {
                try {
                    if (pss != null) {
                        pss.setValues(ps);
                    }
                    int rows = ps.executeUpdate();
                    if (logger.isDebugEnabled()) {
                        logger.debug("SQL update affected " + rows + " rows");
                    }
                    return rows;
                } finally {
                    if (pss instanceof ParameterDisposer) {
                        ((ParameterDisposer) pss).cleanupParameters();
                    }
                }
            }
        });
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
        parameters.add(name);
        parameterValues.put(name, val);
        return this;
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
            parameters.add(name);
            parameterValues.put(name, val);
            parameterTypes.put(name, type);
        }
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setParameterList(String name, Object[] vals) throws SqlProcessorException {
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setParameterList(String name, Object[] vals, Object type) throws SqlProcessorException {
        throw new UnsupportedOperationException();
    }

    /**
     * Sets the value of the designated parameters.
     * 
     * @param ps
     *            an instance of PreparedStatement
     * @param limitType
     *            the limit type to restrict the number of rows in the result set
     * @throws SQLException
     *             if a database access error occurs or this method is called on a closed <code>PreparedStatement</code>
     */
    protected void setParameters(PreparedStatement ps, SqlUtils.LimitType limitType) throws SQLException {
        int ix = 1;
        ix = setLimits(ps, limitType, ix, false);
        for (int i = 0, n = parameters.size(); i < n; i++) {
            String name = parameters.get(i);
            Object value = parameterValues.get(name);
            Object type = parameterTypes.get(name);
            if (type != null) {
                if (type instanceof JdbcSqlType) {
                    ((JdbcSqlType) type).set(ps, ix++, value);
                } else {
                    ps.setObject(ix++, value, (Integer) type);
                }
            } else {
                ps.setObject(ix++, value);
            }
        }
        ix = setLimits(ps, limitType, ix, true);
    }

    /**
     * Sets the limit related parameters.
     * 
     * @param ps
     *            an instance of PreparedStatement
     * @param limitType
     *            the limit type to restrict the number of rows in the result set
     * @param ix
     *            a column index
     * @param afterSql
     *            an indicator it's done after the main SQL statement execution
     * @return the updated column index
     * @throws SQLException
     *             if a database access error occurs or this method is called on a closed <code>PreparedStatement</code>
     */
    protected int setLimits(PreparedStatement ps, SqlUtils.LimitType limitType, int ix, boolean afterSql)
            throws SQLException {
        if (limitType == null)
            return ix;
        if (afterSql && !limitType.afterSql)
            return ix;
        if (!afterSql && limitType.afterSql)
            return ix;
        if (limitType.maxBeforeFirst) {
            if (limitType.rowidBasedMax && limitType.alsoFirst)
                ps.setInt(ix++, firstResult + maxResults);
            else
                ps.setInt(ix++, maxResults);
        }
        if (limitType.alsoFirst) {
            if (limitType.zeroBasedFirst)
                ps.setInt(ix++, firstResult);
            else
                ps.setInt(ix++, firstResult);
        }
        if (!limitType.maxBeforeFirst) {
            if (limitType.rowidBasedMax && limitType.alsoFirst)
                ps.setInt(ix++, firstResult + maxResults);
            else
                ps.setInt(ix++, maxResults);
        }
        return ix;
    }

    /**
     * Gets the value of the designated columns as the objects in the Java programming language.
     * 
     * @param rs
     *            an instance of ResultSet
     * @return the result list
     * @throws SQLException
     *             if a database access error occurs or this method is called on a closed <code>ResultSet</code>
     */
    protected List getResults(ResultSet rs) throws SQLException {
        List result = new ArrayList();
        while (rs.next()) {
            List<Object> row = new ArrayList<Object>();
            for (int i = 0, n = scalars.size(); i < n; i++) {
                String name = scalars.get(i);
                Object type = scalarTypes.get(name);
                Object value = null;
                if (type != null && type instanceof JdbcSqlType) {
                    value = ((JdbcSqlType) type).get(rs, name);
                } else {
                    value = rs.getObject(name);
                }
                if (rs.wasNull())
                    value = null;
                row.add(value);
            }
            Object[] oo = row.toArray();
            if (oo.length == 1)
                result.add(oo[0]);
            else
                result.add(oo);
        }
        return result;
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
