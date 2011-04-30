package org.sqlproc.engine.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import org.sqlproc.engine.SqlProcessorException;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.impl.SqlUtils;
import org.sqlproc.engine.jdbc.type.JdbcSqlType;
import org.sqlproc.engine.type.IdentitySetter;
import org.sqlproc.engine.type.OutValueSetter;
import org.sqlproc.engine.type.SqlProviderType;

/**
 * The JDBC stack implementation of the SQL Engine query contract. In fact it's an adapter the internal JDBC stuff.
 * 
 * <p>
 * For more info please see the Reference Guide or the <a
 * href="http://code.google.com/p/sql-processor/w/list">tutorials</a>.
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
        StringBuilder queryResult = (maxResults != null) ? new StringBuilder(queryString.length() + 100) : null;
        final SqlUtils.LimitType limitType = (maxResults != null) ? SqlUtils.limitQuery(queryString, queryResult,
                firstResult, maxResults) : null;
        final String query = limitType != null ? queryResult.toString() : queryString;
        if (logger.isDebugEnabled()) {
            logger.debug("list, query=" + query);
        }

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = connection.prepareStatement(query);
            if (timeout != null)
                ps.setQueryTimeout(timeout);
            setParameters(ps, limitType, 1);
            rs = ps.executeQuery();
            List list = getResults(rs);
            if (logger.isDebugEnabled()) {
                logger.debug("list, number of returned rows=" + ((list != null) ? list.size() : "null"));
            }
            return list;
        } catch (SQLException he) {
            throw new SqlProcessorException(he);
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
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(queryString);
            if (timeout != null)
                ps.setQueryTimeout(timeout);
            setParameters(ps, null, 1);
            int updated = ps.executeUpdate();
            if (logger.isDebugEnabled()) {
                logger.debug("update, number of updated rows=" + updated);
            }
            if (!identities.isEmpty()) {
                String identityName = identities.get(0);
                doIdentitySelect(identityName);
            }
            return updated;
        } catch (SQLException he) {
            throw new SqlProcessorException(he);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
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
        } catch (SQLException he) {
            throw new SqlProcessorException(he);
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

    static final Pattern CALL = Pattern.compile("\\s*\\{?\\s*(\\?)?\\s*(-?\\d+)?\\s*=?\\s*call\\s*(.*?)\\s*}?\\s*");

    /**
     * {@inheritDoc}
     */
    @Override
    public List callList() throws SqlProcessorException {
        if (logger.isDebugEnabled()) {
            logger.debug("callList, query=" + queryString);
        }
        CallableStatement cs = null;
        ResultSet rs = null;
        List list = null;
        try {
            Matcher matcher = CALL.matcher(queryString);
            if (!matcher.matches())
                throw new SqlProcessorException("'" + queryString + "' isn't the correct call statement");
            Integer retType = (matcher.group(2) != null) ? retType = Integer.parseInt(matcher.group(2)) : null;
            String query = (matcher.group(1) != null) ? "{? = call " + matcher.group(3) + "}" : "{ call "
                    + matcher.group(3) + "}";
            cs = connection.prepareCall(query);
            if (timeout != null)
                cs.setQueryTimeout(timeout);
            if (retType != null) {
                cs.registerOutParameter(1, retType);
                setParameters(cs, null, 2);
                cs.executeQuery();
                rs = (ResultSet) cs.getObject(1);
            } else {
                setParameters(cs, null, 1);
                rs = cs.executeQuery();
            }
            list = getResults(rs);
            if (logger.isDebugEnabled()) {
                logger.debug("list, number of returned rows=" + ((list != null) ? list.size() : "null"));
            }
            getParameters(cs);
            return list;
        } catch (SQLException he) {
            throw new SqlProcessorException(he);
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
    public Object callUnique() throws SqlProcessorException {
        List list = callList();
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
    public int callUpdate() throws SqlProcessorException {
        if (logger.isDebugEnabled()) {
            logger.debug("callUpdate, query=" + queryString);
        }
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            cs = connection.prepareCall("{" + queryString + "}");
            if (timeout != null)
                cs.setQueryTimeout(timeout);
            setParameters(cs, null, 1);
            cs.execute();
            int updated = cs.getUpdateCount();
            if (logger.isDebugEnabled()) {
                logger.debug("callUpdate, number of updated rows=" + updated);
            }
            getParameters(cs);
            return updated;
        } catch (SQLException he) {
            throw new SqlProcessorException(he);
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
    protected void setParameters(PreparedStatement ps, SqlUtils.LimitType limitType, int start) throws SQLException {
        int ix = start;
        ix = setLimits(ps, limitType, ix, false);
        for (int i = 0, n = parameters.size(); i < n; i++) {
            String name = parameters.get(i);
            Object type = parameterTypes.get(name);
            if (parameterValues.containsKey(name)) {
                Object value = parameterValues.get(name);
                if (type != null) {
                    if (type instanceof JdbcSqlType) {
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
                    if (type instanceof SqlProviderType) {
                        cs.registerOutParameter(ix + i, (Integer) ((SqlProviderType) type).getProviderSqlNullType());
                    } else {
                        cs.registerOutParameter(ix + i, (Integer) type);
                    }
                } else {
                    throw new SqlProcessorException("OUT parameter type for callable statement is null");
                }
                parameterOutValuesToPickup.put(i, ix + i);
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
     * Gets the value of the designated OUT parameters.
     * 
     * @param cs
     *            an instance of CallableStatement
     * @throws SQLException
     *             if a database access error occurs or this method is called on a closed <code>CallableStatement</code>
     */
    protected void getParameters(CallableStatement cs) throws SQLException {

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
        }
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
}
