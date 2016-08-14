package org.sqlproc.engine.jdbc;

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
 * The JDBC stack implementation of the SQL Engine query contract. In fact it's an adapter the internal JDBC stuff.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcQuery implements SqlQuery {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * The connection to the database. It should be opened.
     */
    Connection connection;
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
    private static final Object NO_MORE_DATA = new Object();

    /**
     * Creates a new instance of this adapter.
     * 
     * @param connection
     *            the connection to the database
     * @param queryString
     *            the SQL query/statement command
     */
    public JdbcQuery(Connection connection, String queryString) {
        this.connection = connection;
        this.queryString = queryString;
        // logger.info("query: " + queryString);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getQuery() {
        return connection;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setSqlControl(SqlControl sqlControl) {
        this.sqlControl = sqlControl;
        return this;
    }

    private Integer getTimeout() {
        return sqlControl != null ? sqlControl.getMaxTimeout() : null;
    }

    private Integer getFetchSize() {
        return sqlControl != null ? sqlControl.getFetchSize() : null;
    }

    private Integer getFirstResult() {
        return sqlControl != null && sqlControl.getMaxResults() != null ? sqlControl.getFirstResult() : null;
    }

    private Integer getMaxResults() {
        return sqlControl != null ? sqlControl.getMaxResults() : null;
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
    public List list(final SqlRuntimeContext runtimeCtx) throws SqlProcessorException {
        StringBuilder queryResult = (getMaxResults() != null) ? new StringBuilder(queryString.length() + 100) : null;
        final SqlFromToPlugin.LimitType limitType = (getMaxResults() != null)
                ? runtimeCtx.getPluginFactory().getSqlFromToPlugin().limitQuery(runtimeCtx, queryString, queryResult,
                        getFirstResult(), getMaxResults(), ordered)
                : null;
        final String query = limitType != null ? queryResult.toString() : queryString;
        if (logger.isDebugEnabled()) {
            logger.debug("list, query=" + query);
        }

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = connection.prepareStatement(query);
            if (sqlControl != null && sqlControl.getMaxTimeout() != null)
                ps.setQueryTimeout(getTimeout());
            if (getFetchSize() != null)
                ps.setFetchSize(getFetchSize());
            setParameters(ps, limitType, 1);
            rs = ps.executeQuery();
            if (getFetchSize() != null)
                rs.setFetchSize(getFetchSize());
            List list = getResults(rs);
            if (logger.isDebugEnabled()) {
                logger.debug("list, number of returned rows=" + ((list != null) ? list.size() : "null"));
            }
            return list;
        } catch (SQLException ex) {
            throw newSqlProcessorException(ex, query);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignore) {
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ignore) {
                }
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object unique(final SqlRuntimeContext runtimeCtx) throws SqlProcessorException {
        List list = list(runtimeCtx);
        int size = list.size();
        if (size == 0)
            return null;
        Object first = list.get(0);
        for (int i = 1; i < size; i++) {
            if (list.get(i) != first) {
                throw new SqlProcessorException(
                        "There's no unique result, the number of returned rows is " + list.size());
            }
        }
        return first;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int query(final SqlRuntimeContext runtimeCtx, SqlQueryRowProcessor sqlQueryRowProcessor)
            throws SqlProcessorException {
        StringBuilder queryResult = (getMaxResults() != null) ? new StringBuilder(queryString.length() + 100) : null;
        final SqlFromToPlugin.LimitType limitType = (getMaxResults() != null)
                ? runtimeCtx.getPluginFactory().getSqlFromToPlugin().limitQuery(runtimeCtx, queryString, queryResult,
                        getFirstResult(), getMaxResults(), ordered)
                : null;
        final String query = limitType != null ? queryResult.toString() : queryString;
        if (logger.isDebugEnabled()) {
            logger.debug("list, query=" + query);
        }

        PreparedStatement ps = null;
        ResultSet rs = null;
        int rownum = 0;
        try {
            ps = connection.prepareStatement(query);
            if (sqlControl != null && sqlControl.getMaxTimeout() != null)
                ps.setQueryTimeout(getTimeout());
            if (getFetchSize() != null)
                ps.setFetchSize(getFetchSize());
            setParameters(ps, limitType, 1);
            rs = ps.executeQuery();
            if (getFetchSize() != null)
                rs.setFetchSize(getFetchSize());
            for (Object oo = getOneResult(rs); oo != NO_MORE_DATA; oo = getOneResult(rs)) {
                ++rownum;
                if (!sqlQueryRowProcessor.processRow(oo, rownum))
                    break;
            }
            if (logger.isDebugEnabled()) {
                logger.debug("list, number of returned rows=" + rownum);
            }
            return rownum;
        } catch (SQLException ex) {
            throw newSqlProcessorException(ex, query);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignore) {
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ignore) {
                }
            }
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
        PreparedStatement ps = null;
        try {
            final boolean retrieveIdentityFromStatement = isSetJDBCIdentity();

            if (retrieveIdentityFromStatement) {
                ps = connection.prepareStatement(queryString, Statement.RETURN_GENERATED_KEYS);
            } else {
                ps = connection.prepareStatement(queryString);
            }
            if (sqlControl != null && sqlControl.getMaxTimeout() != null)
                ps.setQueryTimeout(getTimeout());
            setParameters(ps, null, 1);
            int updated = ps.executeUpdate();
            if (logger.isDebugEnabled()) {
                logger.debug("update, number of updated rows=" + updated);
            }
            if (!identities.isEmpty()) {
                String identityName = identities.get(0);
                if (retrieveIdentityFromStatement) {
                    getGeneratedKeys(identityName, ps);
                } else {
                    doIdentitySelect(identityName);
                }
            }
            return updated;
        } catch (SQLException ex) {
            throw newSqlProcessorException(ex, queryString);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ignore) {
                }
            }
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
     * Retrieves the value of auto-generated identity from executed prepared statement.
     * 
     * @param identityName
     *            the identity name from the META SQL statement
     * @param statement
     *            statement to retrieve auto-generated keys from
     */
    protected void getGeneratedKeys(String identityName, Statement statement) {
        IdentitySetter identitySetter = identitySetters.get(identityName);
        Object identityType = identityTypes.get(identityName);
        if (identityType == null) {
            identityType = parameterTypes.get(identityName);
        }
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
        } catch (SQLException ex) {
            throw new SqlProcessorException("Statement.getGeneratedKeys() failed.", ex);
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
     * Runs the select to obtain the value of auto-generated identity.
     * 
     * @param identityName
     *            the identity name from the META SQL statement
     */
    protected void doIdentitySelect(String identityName) {
        IdentitySetter identitySetter = identitySetters.get(identityName);
        Object identityType = identityTypes.get(identityName);
        if (logger.isDebugEnabled()) {
            logger.debug("identity, name=" + identityName + ", select=" + identitySetter.getIdentitySelect()
                    + ", identityType=" + identityType);
        }

        PreparedStatement ps = null;
        ResultSet rs = null;
        Object identityValue = null;
        try {
            ps = connection.prepareStatement(identitySetter.getIdentitySelect());
            rs = ps.executeQuery();
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
        } catch (SQLException ex) {
            throw new SqlProcessorException("Identity select failed.", ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignore) {
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ignore) {
                }
            }
        }
    }

    static final Pattern CALL = Pattern.compile("\\s*\\{?\\s*(\\?)?\\s*=?\\s*call\\s*(.*?)\\s*}?\\s*");

    /**
     * {@inheritDoc}
     */
    @Override
    public List callList(final SqlRuntimeContext runtimeCtx) throws SqlProcessorException {
        if (logger.isDebugEnabled()) {
            logger.debug("callList, query=" + queryString);
        }
        CallableStatement cs = null;
        ResultSet rs = null;
        List list = null;
        boolean hasResultSet = false;
        String query = null;

        try {
            Matcher matcher = CALL.matcher(queryString);
            if (!matcher.matches())
                throw new SqlProcessorException("'" + queryString + "' isn't the correct call statement");
            query = (matcher.group(1) != null) ? "{? = call " + matcher.group(2) + "}"
                    : "{ call " + matcher.group(2) + "}";
            cs = connection.prepareCall(query);
            if (sqlControl != null && sqlControl.getMaxTimeout() != null)
                cs.setQueryTimeout(getTimeout());
            if (getFetchSize() != null)
                cs.setFetchSize(getFetchSize());
            setParameters(cs, null, 1);
            hasResultSet = cs.execute();
            if (hasResultSet || cs.getMoreResults()) {
                rs = cs.getResultSet();
                if (getFetchSize() != null)
                    rs.setFetchSize(getFetchSize());
                list = getResults(rs);
                getParameters(cs, false);
            } else {
                rs = (ResultSet) getParameters(cs, true);
                if (getFetchSize() != null)
                    rs.setFetchSize(getFetchSize());
                list = getResults(rs);
            }
            if (logger.isDebugEnabled()) {
                logger.debug("list, number of returned rows=" + ((list != null) ? list.size() : "null"));
            }
            return list;
        } catch (SQLException ex) {
            throw newSqlProcessorException(ex, query);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignore) {
                }
            }
            if (cs != null) {
                try {
                    cs.close();
                } catch (SQLException ignore) {
                }
            }
        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object callUnique(final SqlRuntimeContext runtimeCtx) throws SqlProcessorException {
        List list = callList(runtimeCtx);
        int size = list.size();
        if (size == 0)
            return null;
        Object first = list.get(0);
        for (int i = 1; i < size; i++) {
            if (list.get(i) != first) {
                throw new SqlProcessorException(
                        "There's no unique result, the number of returned rows is " + list.size());
            }
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
        CallableStatement cs = null;
        ResultSet rs = null;
        String query = null;

        try {
            Matcher matcher = CALL.matcher(queryString);
            if (!matcher.matches())
                throw new SqlProcessorException("'" + queryString + "' isn't the correct call statement");
            query = (matcher.group(1) != null) ? "{? = call " + matcher.group(2) + "}"
                    : "{ call " + matcher.group(2) + "}";
            cs = connection.prepareCall(query);
            if (sqlControl != null && sqlControl.getMaxTimeout() != null)
                cs.setQueryTimeout(getTimeout());
            setParameters(cs, null, 1);
            cs.execute();
            int updated = cs.getUpdateCount();
            if (logger.isDebugEnabled()) {
                logger.debug("callUpdate, number of updated rows=" + updated);
            }
            getParameters(cs, false);
            return updated;
        } catch (SQLException ex) {
            throw newSqlProcessorException(ex, query);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignore) {
                }
            }
            if (cs != null) {
                try {
                    cs.close();
                } catch (SQLException ignore) {
                }
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object callFunction() throws SqlProcessorException {
        if (logger.isDebugEnabled()) {
            logger.debug("callFunction, query=" + queryString);
        }
        CallableStatement cs = null;
        ResultSet rs = null;
        List list = null;
        Object result = null;
        boolean hasResultSet = false;
        String query = null;

        try {
            Matcher matcher = CALL.matcher(queryString);
            if (!matcher.matches())
                throw new SqlProcessorException("'" + queryString + "' isn't the correct call statement");
            query = (matcher.group(1) != null) ? "{? = call " + matcher.group(2) + "}"
                    : "{call " + matcher.group(2) + "}";
            cs = connection.prepareCall(query);
            if (sqlControl != null && sqlControl.getMaxTimeout() != null)
                cs.setQueryTimeout(getTimeout());
            if (getFetchSize() != null)
                cs.setFetchSize(getFetchSize());
            setParameters(cs, null, 1);
            hasResultSet = cs.execute();
            if (hasResultSet) {
                rs = cs.getResultSet();
                if (getFetchSize() != null)
                    rs.setFetchSize(getFetchSize());
                list = getResults(rs);
                if (list != null && !list.isEmpty())
                    result = list.get(0);
                getParameters(cs, false);
            } else {
                result = getParameters(cs, true);
            }
            if (logger.isDebugEnabled()) {
                logger.debug("callFunction, result=" + result);
            }
            return result;
        } catch (SQLException ex) {
            throw newSqlProcessorException(ex, query);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignore) {
                }
            }
            if (cs != null) {
                try {
                    cs.close();
                } catch (SQLException ignore) {
                }
            }
        }

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
    public SqlQuery addScalar(String columnAlias, Object type, Class<?>... moreTypes) {
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
    public SqlQuery setParameter(String name, Object val) throws SqlProcessorException {
        parameters.add(name);
        parameterValues.put(name, val);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setParameter(String name, Object val, Object type, Class<?>... moreTypes)
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
    public SqlQuery setParameterList(String name, Object[] vals) throws SqlProcessorException {
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQuery setParameterList(String name, Object[] vals, Object type, Class<?>... moreTypes)
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
    protected void setParameters(PreparedStatement ps, SqlFromToPlugin.LimitType limitType, int start)
            throws SQLException, SqlProcessorException {
        int ix = start;
        ix = setLimits(ps, limitType, ix, false);
        for (int i = 0, n = parameters.size(); i < n; i++) {
            String name = parameters.get(i);
            Object type = parameterTypes.get(name);
            if (parameterValues.containsKey(name)) {
                Object value = parameterValues.get(name);
                if (type != null) {
                    if (type instanceof JdbcSqlType) {
                        JdbcSqlType sqlType = (JdbcSqlType) type;
                        try {
                            if (value == null) {
                                if (logger.isTraceEnabled()) {
                                    logger.trace("setNull, ix=" + (ix + i) + ", type=" + type);
                                }
                                ps.setNull(ix + i, sqlType.getDatabaseSqlType());
                            } else {
                                if (logger.isTraceEnabled()) {
                                    logger.trace("setParameters, ix=" + (ix + i) + ", value=" + value);
                                }
                                sqlType.set(ps, ix + i, value);
                            }
                        } catch (ClassCastException cce) {
                            StringBuilder sb = new StringBuilder("Not compatible input value of type ")
                                    .append((value != null) ? value.getClass() : "null");
                            sb.append(". The JDBC type for ").append(name).append(" is ")
                                    .append((sqlType != null) ? sqlType.getClass() : "null");
                            sb.append(".");
                            throw new SqlProcessorException(sb.toString(), cce);
                        }
                    } else if (value == null) {
                        if (logger.isTraceEnabled()) {
                            logger.trace("setNull, ix=" + (ix + i) + ", type=" + type);
                        }
                        ps.setNull(ix + i, (Integer) type);
                    } else {
                        if (logger.isTraceEnabled()) {
                            logger.trace("setNull, ix=" + (ix + i) + ", type=" + type);
                        }
                        ps.setObject(ix + i, value, (Integer) type);
                    }
                } else {
                    if (logger.isTraceEnabled()) {
                        logger.trace("setObject, ix=" + (ix + i) + ", type=" + type);
                    }
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
    protected int setLimits(PreparedStatement ps, SqlFromToPlugin.LimitType limitType, int ix, boolean afterSql)
            throws SQLException {
        if (limitType == null)
            return ix;
        if (afterSql && !limitType.afterSql)
            return ix;
        if (!afterSql && limitType.afterSql)
            return ix;
        if (limitType.maxBeforeFirst) {
            if (limitType.rowidBasedMax && limitType.alsoFirst)
                ps.setInt(ix++, getFirstResult() + getMaxResults());
            else
                ps.setInt(ix++, getMaxResults());
        }
        if (limitType.alsoFirst) {
            if (limitType.zeroBasedFirst)
                ps.setInt(ix++, getFirstResult());
            else
                ps.setInt(ix++, getFirstResult());
        }
        if (!limitType.maxBeforeFirst) {
            if (limitType.rowidBasedMax && limitType.alsoFirst)
                ps.setInt(ix++, getFirstResult() + getMaxResults());
            else
                ps.setInt(ix++, getMaxResults());
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
    protected Object getParameters(CallableStatement cs, boolean isFunction) throws SQLException {

        Object result = null;
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
                result = outValue;
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
    protected List getResults(ResultSet rs) throws SQLException {
        List result = new ArrayList();
        if (rs == null)
            return result;
        for (Object oo = getOneResult(rs); oo != NO_MORE_DATA; oo = getOneResult(rs))
            result.add(oo);
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
    protected Object getOneResult(ResultSet rs) throws SQLException {
        if (rs == null)
            return NO_MORE_DATA;
        if (rs.next()) {
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
                return oo[0];
            else
                return oo;
        }
        return NO_MORE_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int[] executeBatch(String[] statements) throws SqlProcessorException {

        if (statements == null)
            return null;

        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            for (String statement : statements) {
                if (statement == null)
                    continue;
                if (logger.isDebugEnabled()) {
                    logger.debug("executeBatch, add " + statement);
                }
                stmt.addBatch(statement);
            }
            int[] result = stmt.executeBatch();
            if (logger.isDebugEnabled()) {
                logger.debug("executeBatch, result " + SqlUtils.asList(result));
            }
            return result;

        } catch (SQLException ex) {
            throw new SqlProcessorException(ex);
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ignore) {
                }
            }
        }
    }

    protected SqlProcessorException newSqlProcessorException(SQLException ex, String query) {
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
