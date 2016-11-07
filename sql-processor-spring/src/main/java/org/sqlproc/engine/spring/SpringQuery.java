package org.sqlproc.engine.spring;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.CallableStatementCreator;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterDisposer;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.support.JdbcUtils;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlProcessorException;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.impl.SqlUtils;
import org.sqlproc.engine.jdbc.type.JdbcSqlType;
import org.sqlproc.engine.plugin.SqlFromToPlugin;
import org.sqlproc.engine.type.IdentitySetter;
import org.sqlproc.engine.type.OutValueSetter;

/**
 * The Spring stack implementation of the SQL Engine query contract. In fact it's an adapter the internal Spring stuff.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
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
     * The collection of all parameters types for output values.
     */
    Map<String, Object> parameterOutValueTypes = new HashMap<String, Object>();
    /**
     * The collection of all parameters output value setters.
     */
    Map<String, OutValueSetter> parameterOutValueSetters = new HashMap<String, OutValueSetter>();
    /**
     * The collection of all parameters, which have to be picked-up.
     */
    Map<Integer, Integer> parameterOutValuesToPickup = new LinkedHashMap<Integer, Integer>();
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
     * The compound parameters controlling the META SQL execution.
     */
    SqlControl sqlControl;
    /**
     * A timeout for the underlying query.
     */
    Integer timeout;
    /**
     * The first row to retrieve. -
     */
    Integer firstResult;
    /**
     * - * The maximum number of rows to retrieve. -
     */
    Integer maxResults;
    /**
     * - * The fetch size of rows to retrieve in one SQL. -
     */
    Integer fetchSize;
    /**
     * The SQL output is sorted.
     */
    boolean ordered;
    /**
     * The failed SQL command should be logged.
     */
    boolean logError;

    /**
     * The indicator there are no more data in ResultSet.
     */
    private static final Map<String, Object> NO_MORE_DATA = new LinkedHashMap<>();

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
    public SqlQuery setSqlControl(SqlControl sqlControl) {
        this.sqlControl = sqlControl;
        if (sqlControl != null) {
            timeout = sqlControl.getMaxTimeout();
            firstResult = sqlControl.getFirstResult();
            maxResults = sqlControl.getMaxResults();
            fetchSize = sqlControl.getFetchSize();
        } else {
            timeout = null;
            firstResult = null;
            maxResults = null;
            fetchSize = null;
        }
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setOrdered(boolean ordered) {
        this.ordered = ordered;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Map<String, Object>> list(final SqlRuntimeContext runtimeCtx) throws SqlProcessorException {
        final StringBuilder queryResult = (maxResults != null) ? new StringBuilder(queryString.length() + 100) : null;
        final SqlFromToPlugin.LimitType limitType = (maxResults != null) ? runtimeCtx.getPluginFactory()
                .getSqlFromToPlugin().limitQuery(runtimeCtx, queryString, queryResult, firstResult, maxResults, ordered)
                : null;
        String _query = limitType != null ? queryResult.toString() : queryString;
        if (logger.isDebugEnabled()) {
            logger.debug("list, query=" + _query);
        }
        if (sqlControl != null && sqlControl.getLowLevelSqlCallback() != null) {
            String sql = sqlControl.getLowLevelSqlCallback().handleInputValues(_query, parameterValues);
            if (sql != null)
                _query = sql;
        }
        final String query = _query;

        PreparedStatementCreator psc = new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement ps = con.prepareStatement(query);
                if (sqlControl != null && sqlControl.getMaxTimeout() != null)
                    ps.setQueryTimeout(timeout);
                if (fetchSize != null)
                    ps.setFetchSize(fetchSize);
                return ps;
            }
        };
        PreparedStatementSetter pss = new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                setParameters(ps, limitType, 1);
            }
        };
        ResultSetExtractor<List<Map<String, Object>>> rse = new ResultSetExtractor<List<Map<String, Object>>>() {
            @Override
            public List<Map<String, Object>> extractData(ResultSet rs) throws SQLException, DataAccessException {
                if (fetchSize != null)
                    rs.setFetchSize(fetchSize);
                return getResults(rs);
            }
        };

        try {
            List<Map<String, Object>> list = jdbcTemplate.query(psc, pss, rse);
            if (logger.isDebugEnabled()) {
                logger.debug("list, number of returned rows=" + ((list != null) ? list.size() : "null"));
            }
            return list;
        } catch (DataAccessException ex) {
            throw newSqlProcessorException(ex, query);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, Object> unique(final SqlRuntimeContext runtimeCtx) throws SqlProcessorException {
        List<Map<String, Object>> list = list(runtimeCtx);
        int size = list.size();
        if (size == 0)
            return null;
        Map<String, Object> first = list.get(0);
        for (int i = 1; i < size; i++) {
            throw new RuntimeException("TODO UNIQUE");
            // if (list.get(i) != first) {
            // throw new SqlProcessorException(
            // "There's no unique result, the number of returned rows is " + list.size());
            // }
        }
        return first;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int query(final SqlRuntimeContext runtimeCtx, final SqlQueryRowProcessor sqlQueryRowProcessor)
            throws SqlProcessorException {
        final StringBuilder queryResult = (maxResults != null) ? new StringBuilder(queryString.length() + 100) : null;
        final SqlFromToPlugin.LimitType limitType = (maxResults != null) ? runtimeCtx.getPluginFactory()
                .getSqlFromToPlugin().limitQuery(runtimeCtx, queryString, queryResult, firstResult, maxResults, ordered)
                : null;
        String _query = limitType != null ? queryResult.toString() : queryString;
        if (logger.isDebugEnabled()) {
            logger.debug("list, query=" + _query);
        }
        if (sqlControl != null && sqlControl.getLowLevelSqlCallback() != null) {
            String sql = sqlControl.getLowLevelSqlCallback().handleInputValues(_query, parameterValues);
            if (sql != null)
                _query = sql;
        }
        final String query = _query;

        PreparedStatementCreator psc = new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement ps = con.prepareStatement(query);
                if (sqlControl != null && sqlControl.getMaxTimeout() != null)
                    ps.setQueryTimeout(timeout);
                if (fetchSize != null)
                    ps.setFetchSize(fetchSize);
                return ps;
            }
        };
        PreparedStatementSetter pss = new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                setParameters(ps, limitType, 1);
            }
        };
        ResultSetExtractor<Integer> rse = new ResultSetExtractor<Integer>() {
            @Override
            public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
                if (fetchSize != null)
                    rs.setFetchSize(fetchSize);
                int rownum = 0;
                for (Map<String, Object> row = getOneResult(rs); row != NO_MORE_DATA; row = getOneResult(rs)) {
                    ++rownum;
                    if (!sqlQueryRowProcessor.processRow(row, rownum))
                        break;
                }
                return rownum;
            }
        };

        try {
            Integer rownums = jdbcTemplate.query(psc, pss, rse);
            if (logger.isDebugEnabled()) {
                logger.debug("list, number of returned rows=" + rownums);
            }
            return rownums;
        } catch (DataAccessException ex) {
            throw newSqlProcessorException(ex, query);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int update(final SqlRuntimeContext runtimeCtx) throws SqlProcessorException {
        if (logger.isDebugEnabled()) {
            logger.debug("update, query=" + queryString);
        }
        if (sqlControl != null && sqlControl.getLowLevelSqlCallback() != null) {
            String sql = sqlControl.getLowLevelSqlCallback().handleInputValues(queryString, parameterValues);
            if (sql != null)
                queryString = sql;
        }

        PreparedStatementCreator psc = new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement ps;
                if (isSetJDBCIdentity()) {
                    ps = con.prepareStatement(queryString, Statement.RETURN_GENERATED_KEYS);
                } else {
                    ps = con.prepareStatement(queryString);
                }
                if (sqlControl != null && sqlControl.getMaxTimeout() != null)
                    ps.setQueryTimeout(timeout);
                return ps;
            }
        };
        PreparedStatementSetter pss = new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                setParameters(ps, null, 1);
            }
        };

        try {
            int updated = 0;
            if (!identities.isEmpty()) {
                String identityName = identities.get(0);
                if (isSetJDBCIdentity()) {
                    updated = updateWithGenKeys(psc, pss, identityName);
                } else {
                    updated = updateWithoutGenKeys(psc, pss);
                    doIdentitySelect(identityName);
                }
            } else {
                updated = updateWithoutGenKeys(psc, pss);
            }
            if (logger.isDebugEnabled()) {
                logger.debug("update, number of updated rows=" + updated);
            }
            return updated;
        } catch (DataAccessException ex) {
            throw newSqlProcessorException(ex, queryString);
        }
    }

    private boolean isSetJDBCIdentity() {
        for (String identityName : identities) {
            IdentitySetter identitySetter = identitySetters.get(identityName);
            if (identitySetter.getIdentitySelect().equals(SqlFeature.JDBC.name())) {
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
        } catch (DataAccessException ex) {
            throw new SqlProcessorException("Identity select failed.", ex);
        }
    }

    /**
     * Retrieves the value of auto-generated identity from executed prepared statement.
     * 
     * @param identityName
     *            the identity name from the META SQL statement
     * @param statement
     *            statement to retrieve auto-generated keys from
     */
    private void getGeneratedKeys(final String identityName, final Statement statement) {
        IdentitySetter identitySetter = identitySetters.get(identityName);
        Object identityType = identityTypes.get(identityName);
        if (logger.isDebugEnabled()) {
            logger.debug("identity, name=" + identityName + ", getGeneratedKeys(), identityType=" + identityType);
        }

        ResultSet rs = null;
        Object identityValue = null;
        try {
            rs = statement.getGeneratedKeys();
            while (rs.next()) {
                if (identityType != null && identityType instanceof JdbcSqlType) {
                    identityValue = ((JdbcSqlType) identityType).get(rs, identityName);
                } else {
                    identityValue = rs.getObject(1);
                }
                if (rs.wasNull())
                    identityValue = null;
            }
            identitySetter.setIdentity(identityValue);
            if (logger.isDebugEnabled()) {
                logger.debug("identity, result=" + identityValue);
            }
        } catch (SQLException he) {
            throw new SqlProcessorException("Statement.getGeneratedKeys() failed.", he);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignore) {
                }
            }
        }
    }

    /**
     * This is a workaround, as this method is not visible in JdbcTemplate.
     * <p/>
     * It executes the prepared SQL statement and retrieves the values of generated identities from the statement. The
     * generated identities cannot be obtained later because the ResultSet {@link PreparedStatement#getGeneratedKeys()}
     * is closed after this method finishes.
     */
    protected int updateWithGenKeys(final PreparedStatementCreator psc, final PreparedStatementSetter pss,
            final String identityName) throws DataAccessException {

        logger.debug("Executing prepared SQL update with generated keys retrieval");
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
                    if (identityName != null) {
                        getGeneratedKeys(identityName, ps);
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
     * This is a workaround, as this method is not visible in JdbcTemplate.
     */
    protected int updateWithoutGenKeys(final PreparedStatementCreator psc, final PreparedStatementSetter pss)
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

    static final Pattern CALL = Pattern.compile("\\s*\\{?\\s*(\\?)?\\s*=?\\s*call\\s*(.*?)\\s*}?\\s*");

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Map<String, Object>> callList(final SqlRuntimeContext runtimeCtx) throws SqlProcessorException {
        if (logger.isDebugEnabled()) {
            logger.debug("callList, query=" + queryString);
        }

        CallableStatementCreator psc = new CallableStatementCreator() {
            @Override
            public CallableStatement createCallableStatement(Connection con) throws SQLException {
                Matcher matcher = CALL.matcher(queryString);
                if (!matcher.matches())
                    throw new SqlProcessorException("'" + queryString + "' isn't the correct call statement");
                String query = (matcher.group(1) != null) ? "{? = call " + matcher.group(2) + "}"
                        : "{ call " + matcher.group(2) + "}";

                CallableStatement cs = con.prepareCall(query);
                if (sqlControl != null && sqlControl.getMaxTimeout() != null)
                    cs.setQueryTimeout(timeout);
                if (fetchSize != null)
                    cs.setFetchSize(fetchSize);
                return cs;
            }
        };

        CallableStatementCallback<List<Map<String, Object>>> csc = new CallableStatementCallback<List<Map<String, Object>>>() {
            public List<Map<String, Object>> doInCallableStatement(CallableStatement cs) throws SQLException {
                ResultSet rs = null;
                List<Map<String, Object>> list = null;

                try {
                    setParameters(cs, null, 1);
                    boolean hasResultSet = cs.execute();
                    if (hasResultSet || cs.getMoreResults()) {
                        rs = cs.getResultSet();
                        ResultSet rsToUse = rs;
                        if (fetchSize != null)
                            rs.setFetchSize(fetchSize);
                        if (jdbcTemplate.getNativeJdbcExtractor() != null) {
                            rsToUse = jdbcTemplate.getNativeJdbcExtractor().getNativeResultSet(rs);
                        }
                        list = getResults(rsToUse);
                        getParameters(cs, false);
                    } else {
                        rs = (ResultSet) getParameters(cs, true).values().toArray()[0];
                        ResultSet rsToUse = rs;
                        if (fetchSize != null)
                            rs.setFetchSize(fetchSize);
                        if (jdbcTemplate.getNativeJdbcExtractor() != null) {
                            rsToUse = jdbcTemplate.getNativeJdbcExtractor().getNativeResultSet(rs);
                        }
                        list = getResults(rsToUse);
                    }
                } finally {
                    JdbcUtils.closeResultSet(rs);
                }
                return list;
            }
        };

        try {
            List<Map<String, Object>> list = jdbcTemplate.execute(psc, csc);
            if (logger.isDebugEnabled()) {
                logger.debug("callList, number of returned rows=" + ((list != null) ? list.size() : "null"));
            }
            return list;
        } catch (DataAccessException ex) {
            throw newSqlProcessorException(ex, queryString);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, Object> callUnique(final SqlRuntimeContext runtimeCtx) throws SqlProcessorException {
        List<Map<String, Object>> list = callList(runtimeCtx);
        int size = list.size();
        if (size == 0)
            return null;
        Map<String, Object> first = list.get(0);
        for (int i = 1; i < size; i++) {
            throw new RuntimeException("TODO UNIQUE");
            // if (list.get(i) != first) {
            // throw new SqlProcessorException(
            // "There's no unique result, the number of returned rows is " + list.size());
            // }
        }
        return first;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int callUpdate(final SqlRuntimeContext runtimeCtx) throws SqlProcessorException {
        if (logger.isDebugEnabled()) {
            logger.debug("callUpdate, query=" + queryString);
        }

        CallableStatementCreator psc = new CallableStatementCreator() {
            @Override
            public CallableStatement createCallableStatement(Connection con) throws SQLException {
                Matcher matcher = CALL.matcher(queryString);
                if (!matcher.matches())
                    throw new SqlProcessorException("'" + queryString + "' isn't the correct call statement");
                String query = (matcher.group(1) != null) ? "{? = call " + matcher.group(2) + "}"
                        : "{ call " + matcher.group(2) + "}";

                CallableStatement cs = con.prepareCall(query);
                if (sqlControl != null && sqlControl.getMaxTimeout() != null)
                    cs.setQueryTimeout(timeout);
                return cs;
            }
        };

        CallableStatementCallback<Integer> csc = new CallableStatementCallback<Integer>() {
            public Integer doInCallableStatement(CallableStatement cs) throws SQLException {
                setParameters(cs, null, 1);
                cs.execute();
                Integer updated = cs.getUpdateCount();
                getParameters(cs, false);
                return updated;
            }
        };

        try {
            Integer updated = jdbcTemplate.execute(psc, csc);
            if (logger.isDebugEnabled()) {
                logger.debug("callUpdate, number of updated rows=" + updated);
            }
            return updated;
        } catch (DataAccessException ex) {
            throw newSqlProcessorException(ex, queryString);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, Object> callFunction() throws SqlProcessorException {
        if (logger.isDebugEnabled()) {
            logger.debug("callList, query=" + queryString);
        }

        CallableStatementCreator psc = new CallableStatementCreator() {
            @Override
            public CallableStatement createCallableStatement(Connection con) throws SQLException {
                Matcher matcher = CALL.matcher(queryString);
                if (!matcher.matches())
                    throw new SqlProcessorException("'" + queryString + "' isn't the correct call statement");
                String query = (matcher.group(1) != null) ? "{? = call " + matcher.group(2) + "}"
                        : "{ call " + matcher.group(2) + "}";

                CallableStatement cs = con.prepareCall(query);
                if (sqlControl != null && sqlControl.getMaxTimeout() != null)
                    cs.setQueryTimeout(timeout);
                return cs;
            }
        };

        CallableStatementCallback<Map<String, Object>> csc = new CallableStatementCallback<Map<String, Object>>() {
            public Map<String, Object> doInCallableStatement(CallableStatement cs) throws SQLException {
                ResultSet rs = null;
                List<Map<String, Object>> list = null;
                Map<String, Object> result = null;

                try {
                    setParameters(cs, null, 1);
                    boolean hasResultSet = cs.execute();
                    if (hasResultSet) {
                        rs = cs.getResultSet();
                        ResultSet rsToUse = rs;
                        if (fetchSize != null)
                            rs.setFetchSize(fetchSize);
                        if (jdbcTemplate.getNativeJdbcExtractor() != null) {
                            rsToUse = jdbcTemplate.getNativeJdbcExtractor().getNativeResultSet(rs);
                        }
                        list = getResults(rsToUse);
                        if (list != null && !list.isEmpty())
                            result = list.get(0);
                        getParameters(cs, false);
                    } else {
                        result = getParameters(cs, true);
                    }
                } finally {
                    JdbcUtils.closeResultSet(rs);
                }
                return result;
            }
        };

        try {
            Map<String, Object> result = jdbcTemplate.execute(psc, csc);
            if (logger.isDebugEnabled()) {
                logger.debug("callFunction, result=" + result);
            }
            return result;
        } catch (DataAccessException ex) {
            throw newSqlProcessorException(ex, queryString);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery addScalar(final String columnAlias) {
        scalars.add(columnAlias);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery addScalar(final String columnAlias, final Object type, Class<?>... moreTypes) {
        // TODO, right now just a workaround
        if (type != null && !(type instanceof JdbcSqlType) && !(type instanceof Integer))
            throw new IllegalArgumentException();
        scalars.add(columnAlias);
        scalarTypes.put(columnAlias, type);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setParameter(final String name, final Object val) throws SqlProcessorException {
        parameters.add(name);
        parameterValues.put(name, val);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setParameter(final String name, final Object val, final Object type, Class<?>... moreTypes)
            throws SqlProcessorException {
        // TODO, right now just a workaround
        if (type != null && !(type instanceof JdbcSqlType) && !(type instanceof Integer))
            throw new IllegalArgumentException();
        if (val != null && val instanceof IdentitySetter) {
            identities.add(name);
            identitySetters.put(name, (IdentitySetter) val);
            identityTypes.put(name, type);
        } else if (val != null && val instanceof OutValueSetter) {
            if (!parameterTypes.containsKey(name)) {
                parameters.add(name);
                parameterTypes.put(name, type);
            }
            parameterOutValueTypes.put(name, type);
            parameterOutValueSetters.put(name, (OutValueSetter) val);
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
    public SqlQuery setParameterList(final String name, final Object[] vals) throws SqlProcessorException {
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setParameterList(final String name, final Object[] vals, final Object type, Class<?>... moreTypes)
            throws SqlProcessorException {
        throw new UnsupportedOperationException();
    }

    /**
     * Sets the value of the designated parameters.
     * 
     * @param ps
     *            an instance of PreparedStatement
     * @param limitType
     *            the limit type to restrict the number of rows in the result set
     * @param start
     *            the index of the first parameter to bind to prepared statement
     * @throws SQLException
     *             if a database access error occurs or this method is called on a closed <code>PreparedStatement</code>
     */
    protected void setParameters(final PreparedStatement ps, final SqlFromToPlugin.LimitType limitType, final int start)
            throws SQLException {
        int ix = start;
        ix = setLimits(ps, limitType, ix, false);
        for (int i = 0, n = parameters.size(); i < n; i++) {
            String name = parameters.get(i);
            Object type = parameterTypes.get(name);
            if (parameterValues.containsKey(name)) {
                Object value = parameterValues.get(name);
                if (type != null) {
                    if (type instanceof JdbcSqlType) {
                        if (value == null)
                            ps.setNull(ix + i, ((JdbcSqlType) type).getDatabaseSqlType());
                        else
                            ((JdbcSqlType) type).set(ps, ix + i, value);
                    } else if (value == null) {
                        ps.setNull(ix + i, (Integer) type);
                    } else {
                        ps.setObject(ix + i, value, (Integer) type);
                    }
                } else {
                    ps.setObject(ix + i, value);
                }
            }
            if (parameterOutValueSetters.containsKey(name)) {
                CallableStatement cs = (CallableStatement) ps;
                if (type != null) {
                    if (type instanceof JdbcSqlType) {
                        cs.registerOutParameter(ix + i, ((JdbcSqlType) type).getDatabaseSqlType());
                    } else {
                        cs.registerOutParameter(ix + i, (Integer) type);
                    }
                } else {
                    throw new SqlProcessorException("OUT parameter type for callable statement is null");
                }
                parameterOutValuesToPickup.put(i, ix + i);
            }
        }
        ix = setLimits(ps, limitType, ix + parameters.size(), true);
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
    protected int setLimits(final PreparedStatement ps, final SqlFromToPlugin.LimitType limitType, int ix,
            boolean afterSql) throws SQLException {
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
     * Gets the value of the designated OUT parameters.
     * 
     * @param cs
     *            an instance of CallableStatement
     * @throws SQLException
     *             if a database access error occurs or this method is called on a closed <code>CallableStatement</code>
     */
    protected Map<String, Object> getParameters(final CallableStatement cs, boolean isFunction) throws SQLException {

        Map<String, Object> result = new LinkedHashMap<>();
        boolean resultInited = false;

        for (Iterator<Integer> iter = parameterOutValuesToPickup.keySet().iterator(); iter.hasNext();) {
            int i = iter.next();
            int ix = parameterOutValuesToPickup.get(i);
            String name = parameters.get(i);
            Object type = parameterOutValueTypes.get(name);
            if (type == null)
                type = parameterTypes.get(name);
            OutValueSetter outValueSetter = parameterOutValueSetters.get(name);
            Object outValue = null;

            if (type != null && type instanceof JdbcSqlType) {
                outValue = ((JdbcSqlType) type).get(cs, ix);
            } else {
                outValue = cs.getObject(ix);
            }
            outValueSetter.setOutValue(outValue);
            if (!resultInited) {
                result.put(name, outValue);
                resultInited = true;
            }
        }

        return result;
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
    protected List<Map<String, Object>> getResults(final ResultSet rs) throws SQLException {
        List<Map<String, Object>> result = new ArrayList<>();
        if (rs == null)
            return result;
        for (Map<String, Object> row = getOneResult(rs); row != NO_MORE_DATA; row = getOneResult(rs)) {
            if (sqlControl != null && sqlControl.getLowLevelSqlCallback() != null)
                sqlControl.getLowLevelSqlCallback().handleOutputValues(row);
            result.add(row);
        }
        return result;
    }

    /**
     * Gets the value of the designated columns for one database row as the object in the Java programming language.
     * 
     * @param rs
     *            an instance of ResultSet
     * @return the result object for one row
     * @throws SQLException
     *             if a database access error occurs or this method is called on a closed <code>ResultSet</code>
     */
    protected Map<String, Object> getOneResult(final ResultSet rs) throws SQLException {
        if (rs == null)
            return NO_MORE_DATA;
        if (rs.next()) {
            Map<String, Object> row = new LinkedHashMap<>();
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
                row.put(name, value);
            }
            return row;
        }
        return NO_MORE_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int[] executeBatch(final String[] statements) throws SqlProcessorException {
        try {
            int[] result = jdbcTemplate.batchUpdate(statements);
            if (logger.isDebugEnabled()) {
                logger.debug("executeBatch, result " + SqlUtils.asList(result));
            }
            return result;
        } catch (DataAccessException ex) {
            throw new SqlProcessorException(ex);
        }
    }

    protected SqlProcessorException newSqlProcessorException(DataAccessException ex, String query) {
        if (logError) {
            logger.error("Failed SQL command '" + query + "': " + ex.getMessage());
            return new SqlProcessorException(ex);
        } else {
            return new SqlProcessorException(ex, query);
        }
    }

    /**
     * Sets an indicator the failed SQL command should be logged
     * 
     * @param logError
     *            an indicator the failed SQL command should be logged
     */
    public void setLogError(boolean logError) {
        this.logError = logError;
    }
}
