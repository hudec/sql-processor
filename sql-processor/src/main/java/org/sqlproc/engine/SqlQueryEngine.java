package org.sqlproc.engine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.sqlproc.engine.impl.BeanUtils;
import org.sqlproc.engine.impl.SqlMappingResult;
import org.sqlproc.engine.impl.SqlMappingRule;
import org.sqlproc.engine.impl.SqlMetaStatement;
import org.sqlproc.engine.impl.SqlProcessResult;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.sqlproc.engine.impl.SqlUtils;
import org.sqlproc.engine.plugin.SqlPluginFactory;
import org.sqlproc.engine.type.SqlTypeFactory;

/**
 * The primary SQL Processor class for the META SQL query execution.
 * 
 * <p>
 * Instance of this class holds one META SQL query and one optional Mapping rule.
 * <p>
 * For example there's a table PERSON with two columns - ID and NAME. <br>
 * In the meta statements file statements.qry there's the next definition:
 * 
 * <pre>
 * ALL_PEOPLE(QRY)=
 *   select ID @id, NAME @name
 *   from PERSON
 *   {= where
 *    {& id=:id}
 *    {& UPPER(name)=:+name}
 *   }
 *   {#1 order by ID}
 *   {#2 order by NAME}
 * ;
 * </pre>
 * 
 * <p>
 * In the case of SQL Processor initialization
 * 
 * <pre>
 * JdbcEngineFactory sqlFactory = new JdbcEngineFactory();
 * sqlFactory.setMetaFilesNames(&quot;statements.qry&quot;); // the meta statements file
 * SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine(&quot;ALL_PEOPLE&quot;);
 * 
 * // for the case it runs on the top of the JDBC stack
 * Connection connection = DriverManager.getConnection(&quot;jdbc:hsqldb:mem:sqlproc&quot;, &quot;sa&quot;, &quot;&quot;);
 * SqlSession session = new JdbcSimpleSession(connection);
 * </pre>
 * 
 * there's created an instance of SqlQueryEngine with the name <code>ALL_PEOPLE</code>.
 * 
 * <p>
 * Next the query can be executed with one of the <code>queryXXX</code> methods. For example there's a Java bean class
 * Person with attributes id and name. The invocation
 * 
 * <pre>
 * List&lt;Person&gt; list = sqlEngine.query(session, Person.class, null, SqlQueryEngine.ASC_ORDER);
 * </pre>
 * 
 * produces the next SQL execution
 * 
 * <pre>
 * select p.ID id, p.NAME name from PERSON p order by ID ASC
 * </pre>
 * 
 * <p>
 * Next there's an instance person of the class Person with the value <code>Jan</code> for the attribute name. The
 * invocation
 * 
 * <pre>
 * List&lt;Person&gt; list = sqlEngine.query(session, Person.class, person, SqlOrder.getDescOrder(2));
 * </pre>
 * 
 * produces the next SQL execution
 * 
 * <pre>
 * select p.ID id, p.NAME name from PERSON p where UPPER(name)=? order by NAME DESC
 * </pre>
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlQueryEngine extends SqlEngine {

    /**
     * The ordering directive list with no ordering rule.
     */
    public static final SqlOrder NO_ORDER = SqlOrder.getOrder();

    /**
     * The ordering directive list with one ascending ordering rule.
     */
    public static final SqlOrder ASC_ORDER = SqlOrder.getAscOrder(1);

    /**
     * The ordering directive list with one descending ordering rule.
     */
    public static final SqlOrder DESC_ORDER = SqlOrder.getDescOrder(1);

    /**
     * Creates a new instance of the SqlQueryEngine from one META SQL query string and one SQL mapping rule string.
     * Constructor will call the internal ANTLR parsers for the query and the mapping rule instances construction. This
     * constructor is devoted to manual META SQL queries and mapping rules construction. More obvious is to put these
     * definitions into the meta statements file and engage the {@link SqlProcessorLoader} for the SqlQueryEngine
     * instances construction.
     * 
     * @param name
     *            the name of this SQL Engine instance
     * @param statement
     *            the META SQL query statement
     * @param mapping
     *            the SQL mapping rule
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     * @throws SqlEngineException
     *             in the case the provided statements are not compliant with the ANTLR grammar
     */
    public SqlQueryEngine(String name, String statement, String mapping, SqlTypeFactory typeFactory,
            SqlPluginFactory pluginFactory) throws SqlEngineException {

        super(name, SqlMetaStatement.getInstance(name, statement, typeFactory), (mapping != null) ? SqlMappingRule
                .getInstance(name, mapping, typeFactory) : null, null, null, typeFactory, pluginFactory);
    }

    /**
     * Creates a new instance of the SqlQueryEngine from one META SQL statement string and one SQL Mapping rule string.
     * Constructor will call the internal ANTLR parsers for the statement and the mapping rule instances construction.
     * Compared to the previous constructor, an external SQL Monitor for the runtime statistics gathering is engaged and
     * the optional features can be involved. This constructor is devoted to manual META SQL queries and mapping rules
     * construction. More obvious is to put these definitions into the meta statements file and engage the
     * {@link SqlProcessorLoader} for the SqlQueryEngine instances construction.
     * 
     * @param name
     *            the name of this SQL Engine instance
     * @param statement
     *            the META SQL query statement
     * @param mapping
     *            the SQL mapping rule
     * @param monitor
     *            the SQL Monitor for the runtime statistics gathering
     * @param features
     *            the optional SQL Processor features
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     * @throws SqlEngineException
     *             mainly in the case the provided statements are not compliant with the ANTLR grammar
     */
    public SqlQueryEngine(String name, String statement, String mapping, SqlMonitor monitor,
            Map<String, Object> features, SqlTypeFactory typeFactory, SqlPluginFactory pluginFactory)
            throws SqlEngineException {

        super(name, SqlMetaStatement.getInstance(name, statement, typeFactory), (mapping != null) ? SqlMappingRule
                .getInstance(name, mapping, typeFactory) : null, monitor, features, typeFactory, pluginFactory);
    }

    /**
     * Creates a new instance of the SqlQueryEngine from one META SQL statement and one SQL mapping rule instances. Both
     * parameters are already pre-compiled instances using the ANTLR parsers. This is the recommended usage for the
     * runtime performance optimization. This constructor is devoted to be used from the custom loader, which is able to
     * read all statements and mapping rules definitions from an external meta statements file and create the named
     * SqlQueryEngine instances.
     * 
     * @param name
     *            the name of this SQL Engine instance
     * @param statement
     *            the pre-compiled META SQL query statement
     * @param mapping
     *            the pre-compiled SQL mapping rule
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     */
    public SqlQueryEngine(String name, SqlMetaStatement statement, SqlMappingRule mapping, SqlTypeFactory typeFactory,
            SqlPluginFactory pluginFactory) {

        super(name, statement, mapping, null, null, typeFactory, pluginFactory);
    }

    /**
     * Creates a new instance of the SqlQueryEngine from one META SQL statement and one SQL mapping rule instances. Both
     * parameters are already pre-compiled instances using the ANTLR parsers. This is the recommended usage for the
     * runtime performance optimization. This constructor is devoted to be used from the custom loader, which is able to
     * read all statements and mapping rules definitions from an external meta statements file and create the named
     * instances. Compared to the previous constructor, an external SQL Monitor for the runtime statistics gathering is
     * engaged and the optional features can be involved.
     * 
     * @param name
     *            the name of this SQL Engine instance
     * @param statement
     *            the pre-compiled META SQL query statement
     * @param mapping
     *            the pre-compiled SQL mapping rule
     * @param monitor
     *            the SQL Monitor for the runtime statistics gathering
     * @param features
     *            the optional SQL Processor features
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     */
    public SqlQueryEngine(String name, SqlMetaStatement statement, SqlMappingRule mapping, SqlMonitor monitor,
            Map<String, Object> features, SqlTypeFactory typeFactory, SqlPluginFactory pluginFactory) {
        super(name, statement, mapping, monitor, features, typeFactory, pluginFactory);
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #query(SqlSession, Class, Object, Object, SqlOrder, int, int, int, Map)} .
     */
    public <E> List<E> query(SqlSession session, Class<E> resultClass) throws SqlProcessorException,
            SqlRuntimeException {
        return query(session, resultClass, null, (SqlStandardControl) null);
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #query(SqlSession, Class, Object, Object, SqlOrder, int, int, int, Map)} .
     */
    public <E> List<E> query(SqlSession session, Class<E> resultClass, Object dynamicInputValues)
            throws SqlProcessorException, SqlRuntimeException {
        return query(session, resultClass, dynamicInputValues, (SqlStandardControl) null);
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #query(SqlSession, Class, Object, Object, SqlOrder, int, int, int, Map)} .
     */
    public <E> List<E> query(SqlSession session, Class<E> resultClass, Object dynamicInputValues, SqlOrder order)
            throws SqlProcessorException, SqlRuntimeException {
        return query(session, resultClass, dynamicInputValues, new SqlStandardControl().setOrder(order));
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #query(SqlSession, Class, Object, Object, SqlOrder, int, int, int, Map)} .
     */
    public <E> List<E> query(SqlSession session, Class<E> resultClass, Object dynamicInputValues,
            Object staticInputValues) throws SqlProcessorException, SqlRuntimeException {
        checkStaticInputValues(staticInputValues);
        return query(session, resultClass, dynamicInputValues,
                new SqlStandardControl().setStaticInputValues(staticInputValues));
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #query(SqlSession, Class, Object, Object, SqlOrder, int, int, int, Map)} .
     */
    public <E> List<E> query(SqlSession session, Class<E> resultClass, Object dynamicInputValues,
            Object staticInputValues, final Map<String, Class<?>> moreResultClasses) throws SqlProcessorException,
            SqlRuntimeException {
        checkStaticInputValues(staticInputValues);
        return query(session, resultClass, dynamicInputValues,
                new SqlStandardControl().setStaticInputValues(staticInputValues)
                        .setMoreResultClasses(moreResultClasses));
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #query(SqlSession, Class, Object, Object, SqlOrder, int, int, int, Map)} .
     */
    public <E> List<E> query(SqlSession session, Class<E> resultClass, Object dynamicInputValues,
            Object staticInputValues, SqlOrder order) throws SqlProcessorException, SqlRuntimeException {
        checkStaticInputValues(staticInputValues);
        return query(session, resultClass, dynamicInputValues,
                new SqlStandardControl().setStaticInputValues(staticInputValues).setOrder(order));
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #query(SqlSession, Class, Object, Object, SqlOrder, int, int, int, Map)} .
     */
    public <E> List<E> query(SqlSession session, Class<E> resultClass, Object dynamicInputValues,
            Object staticInputValues, SqlOrder order, final Map<String, Class<?>> moreResultClasses)
            throws SqlProcessorException, SqlRuntimeException {
        checkStaticInputValues(staticInputValues);
        return query(
                session,
                resultClass,
                dynamicInputValues,
                new SqlStandardControl().setStaticInputValues(staticInputValues).setOrder(order)
                        .setMoreResultClasses(moreResultClasses));
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #query(SqlSession, Class, Object, Object, SqlOrder, int, int, int, Map)} .
     */
    public <E> List<E> query(SqlSession session, Class<E> resultClass, Object dynamicInputValues, int firstResult,
            int maxResults) throws SqlProcessorException, SqlRuntimeException {
        return query(session, resultClass, dynamicInputValues, new SqlStandardControl().setMaxResults(maxResults)
                .setFirstResult(firstResult));
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #query(SqlSession, Class, Object, Object, SqlOrder, int, int, int, Map)} .
     */
    public <E> List<E> query(SqlSession session, Class<E> resultClass, Object dynamicInputValues,
            Object staticInputValues, int firstResult, int maxResults) throws SqlProcessorException,
            SqlRuntimeException {
        checkStaticInputValues(staticInputValues);
        return query(session, resultClass, dynamicInputValues,
                new SqlStandardControl().setStaticInputValues(staticInputValues).setMaxResults(maxResults)
                        .setFirstResult(firstResult));
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #query(SqlSession, Class, Object, Object, SqlOrder, int, int, int, Map)} .
     */
    public <E> List<E> query(final SqlSession session, final Class<E> resultClass, final Object dynamicInputValues,
            final Object staticInputValues, final SqlOrder order, final int maxTimeout, final int maxResults,
            final int firstResult) throws SqlProcessorException, SqlRuntimeException {
        checkStaticInputValues(staticInputValues);
        return query(
                session,
                resultClass,
                dynamicInputValues,
                new SqlStandardControl().setStaticInputValues(staticInputValues).setOrder(order)
                        .setMaxTimeout(maxTimeout).setMaxResults(maxResults).setFirstResult(firstResult));
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is the primary and the most complex SQL Processor
     * execution method to obtain a list of result class instances. Criteria to pickup the correct database rows are
     * taken from the input values.
     * 
     * @param session
     *            The SQL Engine session. It can work as a first level cache and the SQL query execution context. The
     *            implementation depends on the stack, on top of which the SQL Processor works. For example it can be an
     *            Hibernate session.
     * @param resultClass
     *            The class used for the return values, the SQL query execution output. This class is also named as the
     *            output class or the transport class, In fact it's a standard POJO class, which must include all the
     *            attributes described in the mapping rule statement. This class itself and all its subclasses must have
     *            public constructors without any parameters. All the attributes used in the mapping rule statement must
     *            be accessible using public getters and setters. The instances of this class are created on the fly in
     *            the process of query execution using the reflection API.
     * @param dynamicInputValues
     *            The object used for the SQL statement dynamic input values. The class of this object is also named as
     *            the input class or the dynamic parameters class. The exact class type isn't important, all the
     *            parameters settled into the SQL prepared statement are picked up using the reflection API.
     * @param staticInputValues
     *            The object used for the SQL statement static input values. The class of this object is also named as
     *            the input class or the static parameters class. The exact class type isn't important, all the
     *            parameters injected into the SQL query command are picked up using the reflection API. Compared to
     *            dynamicInputValues input parameters, parameters in this class should't be produced by an end user to
     *            prevent SQL injection threat!
     * @param order
     *            The ordering directive list. Using the class SqlOrder the ordering rules can be chained. Every
     *            ordering rule in this chain should correspond to one META SQL ordering statement.
     * @param maxTimeout
     *            The max SQL execution time. This parameter can help to protect production system against ineffective
     *            SQL query commands. The value is in milliseconds.
     * @param maxResults
     *            The max number of SQL execution output rows, which can be returned in the result list. The primary
     *            usage is to support the pagination.
     * @param firstResult
     *            The first SQL execution output row to be returned in the case we need to skip some rows in the result
     *            set. The primary usage is to support the pagination.
     * @param moreResultClasses
     *            More result classes used for the return values, like the collections classes or the collections items.
     *            They are used mainly for the one-to-one, one-to-many and many-to-many associations.
     * @return The list of the resultClass instances.
     * @throws org.sqlproc.engine.SqlProcessorException
     *             in the case of any problem with ORM or JDBC stack
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the input/output values handling
     */
    public <E> List<E> query(final SqlSession session, final Class<E> resultClass, final Object dynamicInputValues,
            final Object staticInputValues, final SqlOrder order, final int maxTimeout, final int maxResults,
            final int firstResult, final Map<String, Class<?>> moreResultClasses) throws SqlProcessorException,
            SqlRuntimeException {
        checkStaticInputValues(staticInputValues);
        return query(
                session,
                resultClass,
                dynamicInputValues,
                new SqlStandardControl().setStaticInputValues(staticInputValues).setOrder(order)
                        .setMaxTimeout(maxTimeout).setMaxResults(maxResults).setFirstResult(firstResult)
                        .setMoreResultClasses(moreResultClasses));
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is the primary and the most complex SQL Processor
     * execution method to obtain a list of result class instances. Criteria to pickup the correct database rows are
     * taken from the input values.
     * 
     * @param session
     *            The SQL Engine session. It can work as a first level cache and the SQL query execution context. The
     *            implementation depends on the stack, on top of which the SQL Processor works. For example it can be an
     *            Hibernate session.
     * @param resultClass
     *            The class used for the return values, the SQL query execution output. This class is also named as the
     *            output class or the transport class, In fact it's a standard POJO class, which must include all the
     *            attributes described in the mapping rule statement. This class itself and all its subclasses must have
     *            public constructors without any parameters. All the attributes used in the mapping rule statement must
     *            be accessible using public getters and setters. The instances of this class are created on the fly in
     *            the process of query execution using the reflection API.
     * @param dynamicInputValues
     *            The object used for the SQL statement dynamic input values. The class of this object is also named as
     *            the input class or the dynamic parameters class. The exact class type isn't important, all the
     *            parameters settled into the SQL prepared statement are picked up using the reflection API.
     * @param sqlControl
     *            The compound parameters controlling the META SQL execution
     * @return The list of the resultClass instances.
     * @throws org.sqlproc.engine.SqlProcessorException
     *             in the case of any problem with ORM or JDBC stack
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the input/output values handling
     */
    public <E> List<E> query(final SqlSession session, final Class<E> resultClass, final Object dynamicInputValues,
            final SqlControl sqlControl) throws SqlProcessorException, SqlRuntimeException {
        if (logger.isDebugEnabled()) {
            logger.debug(">> query, session=" + session + ", resultClass=" + resultClass + ", dynamicInputValues="
                    + dynamicInputValues + ", sqlControl=" + sqlControl);
        }
        checkDynamicInputValues(dynamicInputValues);

        List<E> result = null;

        try {
            result = monitor.runList(new SqlMonitor.Runner() {
                public List<E> run() {
                    final SqlProcessResult processResult = process(SqlMetaStatement.Type.QUERY, dynamicInputValues,
                            sqlControl);
                    String sql = pluginFactory.getSqlExecutionPlugin().beforeSqlExecution(name,
                            processResult.getSql().toString());
                    final SqlQuery query = session.createSqlQuery(sql);
                    query.setLogError(processResult.isLogError());
                    if (getMaxTimeout(sqlControl) > 0)
                        query.setTimeout(getMaxTimeout(sqlControl));
                    if (getFetchSize(sqlControl) > 0)
                        query.setFetchSize(getFetchSize(sqlControl));
                    query.setOrdered(getOrder(sqlControl) != null && getOrder(sqlControl) != NO_ORDER);
                    processResult.setQueryParams(session, query);
                    final SqlMappingResult mappingResult = SqlMappingRule.merge(mapping, processResult);
                    mappingResult.setQueryResultMapping(resultClass, getMoreResultClasses(sqlControl), query);

                    if (getFirstResult(sqlControl) > 0) {
                        query.setFirstResult(getFirstResult(sqlControl));
                        query.setMaxResults(getMaxResults(sqlControl));
                    } else if (getMaxResults(sqlControl) > 0) {
                        query.setMaxResults(getMaxResults(sqlControl));
                    }

                    if (monitor instanceof SqlExtendedMonitor) {
                        SqlExtendedMonitor monitorExt = (SqlExtendedMonitor) monitor;
                        return monitorExt.runListSql(new SqlMonitor.Runner() {
                            public List<E> run() {
                                return query(query, mappingResult, resultClass, sqlControl);
                            }
                        }, resultClass);
                    } else {
                        return query(query, mappingResult, resultClass, sqlControl);
                    }
                }
            }, resultClass);
            return result;
        } finally {
            if (logger.isDebugEnabled()) {
                logger.debug("<< query, result=" + result);
            }
        }
    }

    /**
     * Internal query implementation
     * 
     * @param query
     *            query
     * @param mappingResult
     *            mappingResult
     * @param resultClass
     *            resultClass
     * @param sqlControl
     *            sqlCOntrol
     * @return the result
     */
    private <E> List<E> query(final SqlQuery query, final SqlMappingResult mappingResult, final Class<E> resultClass,
            final SqlControl sqlControl) {
        List list = query.list(mappingResult.getRuntimeContext());
        List<E> result = new ArrayList<E>();
        E resultInstance = null;
        Object[] resultValue = null;
        Map<String, Object> ids = mappingResult.getIds();

        for (@SuppressWarnings("rawtypes")
        Iterator i$ = list.iterator(); i$.hasNext();) {
            Object resultRow = i$.next();
            resultValue = (resultRow instanceof Object[]) ? (Object[]) resultRow : (new Object[] { resultRow });

            boolean changedIdentity = true;
            if (ids != null) {
                String idsKey = SqlUtils.getIdsKey(resultValue, mappingResult.getMainIdentityIndex());
                if (ids.containsKey(idsKey)) {
                    resultInstance = (E) ids.get(idsKey);
                    changedIdentity = false;
                }
            }

            if (changedIdentity) {
                resultInstance = BeanUtils.getInstance(resultClass);
                if (resultInstance == null) {
                    throw new SqlRuntimeException("There's problem to instantiate " + resultClass);
                }
            }

            mappingResult.setQueryResultData(resultInstance, resultValue, ids, getMoreResultClasses(sqlControl));

            if (changedIdentity) {
                result.add(resultInstance);
                if (ids != null) {
                    String idsKey = SqlUtils.getIdsKey(resultValue, mappingResult.getMainIdentityIndex());
                    ids.put(idsKey, resultInstance);
                }
            }
        }
        return result;
    }

    /**
     * Runs the META SQL query to obtain the number of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #queryCount(SqlSession, Object, Object, SqlOrder, int)} .
     */
    public int queryCount(SqlSession session) throws SqlProcessorException, SqlRuntimeException {
        return queryCount(session, null, (SqlStandardControl) null);
    }

    /**
     * Runs the META SQL query to obtain the number of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #queryCount(SqlSession, Object, Object, SqlOrder, int)} .
     */
    public int queryCount(SqlSession session, Object dynamicInputValues) throws SqlProcessorException,
            SqlRuntimeException {
        return queryCount(session, dynamicInputValues, (SqlStandardControl) null);
    }

    /**
     * Runs the META SQL query to obtain the number of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #queryCount(SqlSession, Object, Object, SqlOrder, int)} .
     */
    public int queryCount(SqlSession session, Object dynamicInputValues, Object staticInputValues)
            throws SqlProcessorException, SqlRuntimeException {
        checkStaticInputValues(staticInputValues);
        return queryCount(session, dynamicInputValues, new SqlStandardControl().setStaticInputValues(staticInputValues));
    }

    /**
     * Runs META SQL query to obtain the number of database rows. This is the primary and the most complex SQL Processor
     * execution method to count the rows in database, which match the criteria. These criteria are taken from the input
     * values. The primary usage is to support the pagination.
     * 
     * @param session
     *            The SQL Engine session. It can work as a first level cache and the SQL query execution context. The
     *            implementation depends on the stack, on top of which the SQL Processor works. For example it can be an
     *            Hibernate session.
     * @param dynamicInputValues
     *            The object used for the SQL statement dynamic input values. The class of this object is also named as
     *            the input class or the dynamic parameters class. The exact class type isn't important, all the
     *            parameters settled into the SQL prepared statement are picked up using the reflection API.
     * @param staticInputValues
     *            The object used for the SQL statement static input values. The class of this object is also named as
     *            the input class or the static parameters class. The exact class type isn't important, all the
     *            parameters injected into the SQL query command are picked up using the reflection API. Compared to
     *            dynamicInputValues input parameters, parameters in this class should't be produced by an end user to
     *            prevent SQL injection threat!
     * @param order
     *            The ordering directive list. Using the class SqlOrder the ordering rules can be chained. Every
     *            ordering rule in this chain should correspond to one META SQL ordering statement.
     * @param maxTimeout
     *            The max SQL execution time. This parameter can help to protect production system against ineffective
     *            SQL query commands. The value is in milliseconds.
     * @return The size of potential list of resultClass instances.
     * @throws org.sqlproc.engine.SqlProcessorException
     *             in the case of any problem with ORM or JDBC stack stack
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the input/output values handling
     */
    public int queryCount(final SqlSession session, final Object dynamicInputValues, final Object staticInputValues,
            final SqlOrder order, final int maxTimeout) throws SqlProcessorException, SqlRuntimeException {
        checkStaticInputValues(staticInputValues);
        return queryCount(session, dynamicInputValues, new SqlStandardControl().setStaticInputValues(staticInputValues)
                .setOrder(order).setMaxTimeout(maxTimeout));
    }

    /**
     * Runs META SQL query to obtain the number of database rows. This is the primary and the most complex SQL Processor
     * execution method to count the rows in database, which match the criteria. These criteria are taken from the input
     * values. The primary usage is to support the pagination.
     * 
     * @param session
     *            The SQL Engine session. It can work as a first level cache and the SQL query execution context. The
     *            implementation depends on the stack, on top of which the SQL Processor works. For example it can be an
     *            Hibernate session.
     * @param dynamicInputValues
     *            The object used for the SQL statement dynamic input values. The class of this object is also named as
     *            the input class or the dynamic parameters class. The exact class type isn't important, all the
     *            parameters settled into the SQL prepared statement are picked up using the reflection API.
     * @param sqlControl
     *            The compound parameters controlling the META SQL execution
     * @return The size of potential list of resultClass instances.
     * @throws org.sqlproc.engine.SqlProcessorException
     *             in the case of any problem with ORM or JDBC stack stack
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the input/output values handling
     */
    public int queryCount(final SqlSession session, final Object dynamicInputValues, final SqlControl sqlControl)
            throws SqlProcessorException, SqlRuntimeException {
        if (logger.isDebugEnabled()) {
            logger.debug(">> queryCount, session=" + session + ", dynamicInputValues=" + dynamicInputValues
                    + ", sqlControl=" + sqlControl);
        }
        checkDynamicInputValues(dynamicInputValues);

        Integer count = null;

        try {
            count = monitor.run(new SqlMonitor.Runner() {
                public Integer run() {
                    final SqlProcessResult processResult = process(SqlMetaStatement.Type.QUERY, dynamicInputValues,
                            sqlControl);
                    final SqlQuery queryCount = session.createSqlQuery(pluginFactory.getSqlCountPlugin().sqlCount(
                            processResult.getSql()));
                    queryCount.setLogError(processResult.isLogError());
                    typeFactory.getDefaultType().addScalar(queryCount, "vysledek", Integer.class);
                    if (getMaxTimeout(sqlControl) > 0)
                        queryCount.setTimeout(getMaxTimeout(sqlControl));
                    queryCount.setOrdered(getOrder(sqlControl) != null && getOrder(sqlControl) != NO_ORDER);
                    processResult.setQueryParams(session, queryCount);

                    if (monitor instanceof SqlExtendedMonitor) {
                        SqlExtendedMonitor monitorExt = (SqlExtendedMonitor) monitor;
                        return monitorExt.runSql(new SqlMonitor.Runner() {
                            public Integer run() {
                                return queryCount(queryCount, processResult);
                            }
                        }, Integer.class);
                    } else {
                        return queryCount(queryCount, processResult);
                    }
                }
            }, Integer.class);
            return count;
        } finally {
            if (logger.isDebugEnabled()) {
                logger.debug("<< queryCount, count=" + count);
            }
        }
    }

    /**
     * Internal delete implementation
     * 
     * @param queryCount
     *            query
     * @return the result
     */
    private Integer queryCount(final SqlQuery queryCount, final SqlProcessResult processResult) {
        return (Integer) queryCount.unique(processResult.getRuntimeContext());
    }

    /**
     * Because the SQL Processor is Data Driven Query engine, every input parameters can produce in fact different SQL
     * query command. This method can help to identify the exact SQL query command, which is generated in the background
     * of the SQL Processor execution. The query is derived from the META SQL query.
     * 
     * @param dynamicInputValues
     *            The object used for the SQL statement dynamic input values. The class of this object is also named as
     *            the input class or the dynamic parameters class. The exact class type isn't important, all the
     *            parameters settled into the SQL prepared statement are picked up using the reflection API.
     * @param staticInputValues
     *            The object used for the SQL statement static input values. The class of this object is also named as
     *            the input class or the static parameters class. The exact class type isn't important, all the
     *            parameters injected into the SQL query command are picked up using the reflection API. Compared to
     *            dynamicInputValues input parameters, parameters in this class should't be produced by an end user to
     *            prevent SQL injection threat!
     * @param order
     *            The ordering directive list. Using the class SqlOrder the ordering rules can be chained. Every
     *            ordering rule in this chain should correspond to one META SQL ordering statement.
     * @return The SQL query command derived from the META SQL query based on the input parameters.
     * @throws org.sqlproc.engine.SqlProcessorException
     *             in the case of any problem with ORM or JDBC stack
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the input/output values handling
     */
    public String getSql(final Object dynamicInputValues, final Object staticInputValues, final SqlOrder order)
            throws SqlProcessorException, SqlRuntimeException {
        return getSql(dynamicInputValues,
                new SqlStandardControl().setStaticInputValues(staticInputValues).setOrder(order));
    }

    /**
     * Because the SQL Processor is Data Driven Query engine, every input parameters can produce in fact different SQL
     * query command. This method can help to identify the exact SQL query command, which is generated in the background
     * of the SQL Processor execution. The query is derived from the META SQL query.
     * 
     * @param dynamicInputValues
     *            The object used for the SQL statement dynamic input values. The class of this object is also named as
     *            the input class or the dynamic parameters class. The exact class type isn't important, all the
     *            parameters settled into the SQL prepared statement are picked up using the reflection API.
     * @param sqlControl
     *            The compound parameters controlling the META SQL execution
     * @return The SQL query command derived from the META SQL query based on the input parameters.
     * @throws org.sqlproc.engine.SqlProcessorException
     *             in the case of any problem with ORM or JDBC stack
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the input/output values handling
     */
    public String getSql(final Object dynamicInputValues, final SqlControl sqlControl) throws SqlProcessorException,
            SqlRuntimeException {
        if (logger.isDebugEnabled()) {
            logger.debug(">> getSql, dynamicInputValues=" + dynamicInputValues + ", sqlControl=" + sqlControl);
        }

        String sql = null;

        try {
            sql = monitor.run(new SqlMonitor.Runner() {

                public String run() {
                    SqlProcessResult processResult = process(SqlMetaStatement.Type.QUERY, dynamicInputValues,
                            sqlControl);
                    String sql = pluginFactory.getSqlExecutionPlugin().beforeSqlExecution(name,
                            processResult.getSql().toString());
                    return sql;
                }
            }, String.class);
            return sql;
        } finally {
            if (logger.isDebugEnabled()) {
                logger.debug("<< getSql, sql=" + sql);
            }
        }
    }

    /**
     * Returns the name of this META SQL, which uniquely identifies this instance. In the case the META SQL query and
     * mapping rule are located in the meta statements file, this name is the unique part of the keys in this file. For
     * example for the name ALL in the meta statements file there's the META SQL query with the name ALL(QRY) and the
     * mapping rule with the name ALL(OUT).
     * 
     * @return The name of the SQL engine instance.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the SQL Monitor instance for the runtime statistics gathering. By default no runtime statistics gathering
     * is active. So this SQL Monitor is implied in SQL engine constructor in the case the statistics gathering should
     * be engaged.
     * 
     * @return The SQL Monitor instance, which is active for this SQL engine instance.
     */
    public SqlMonitor getMonitor() {
        return monitor;
    }
}
