package org.sqlproc.engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.sqlproc.engine.annotation.Beta;
import org.sqlproc.engine.config.SqlEngineConfiguration;
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
    @Deprecated
    public static final SqlOrder ASC_ORDER = SqlOrder.getAscOrder(1);

    /**
     * The ordering directive list with one descending ordering rule.
     */
    @Deprecated
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

        super(name, SqlMetaStatement.getInstance(name, statement, typeFactory),
                (mapping != null) ? SqlMappingRule.getInstance(name, mapping, typeFactory) : null, null, null,
                typeFactory, pluginFactory, null);
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

        super(name, SqlMetaStatement.getInstance(name, statement, typeFactory),
                (mapping != null) ? SqlMappingRule.getInstance(name, mapping, typeFactory) : null, monitor, features,
                typeFactory, pluginFactory, null);
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

        super(name, statement, mapping, null, null, typeFactory, pluginFactory, null);
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
        super(name, statement, mapping, monitor, features, typeFactory, pluginFactory, null);
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
     * @param configuration
     *            the overall configuration, which can be persisted
     */
    public SqlQueryEngine(String name, SqlMetaStatement statement, SqlMappingRule mapping, SqlMonitor monitor,
            Map<String, Object> features, SqlTypeFactory typeFactory, SqlPluginFactory pluginFactory,
            SqlEngineConfiguration configuration) {
        super(name, statement, mapping, monitor, features, typeFactory, pluginFactory, configuration);
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method {@link #query(SqlSession, Class resultClass,
     * Object, Object, SqlOrder, Integer, Integer, Integer, Map)} .
     */
    public <E> List<E> query(SqlSession session, Class<E> resultClass)
            throws SqlProcessorException, SqlRuntimeException {
        return query(session, resultClass, null, (SqlStandardControl) null);
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method {@link #query(SqlSession, Class resultClass,
     * Object, Object, SqlOrder, Integer, Integer, Integer, Map)} .
     */
    public <E> List<E> query(SqlSession session, Class<E> resultClass, Object dynamicInputValues)
            throws SqlProcessorException, SqlRuntimeException {
        return query(session, resultClass, dynamicInputValues, (SqlStandardControl) null);
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method {@link #query(SqlSession, Class resultClass,
     * Object, Object, SqlOrder, Integer, Integer, Integer, Map)} .
     */
    public <E> List<E> query(SqlSession session, Class<E> resultClass, Object dynamicInputValues, SqlOrder order)
            throws SqlProcessorException, SqlRuntimeException {
        return query(session, resultClass, dynamicInputValues, new SqlStandardControl().setOrder(order));
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method {@link #query(SqlSession, Class resultClass,
     * Object, Object, SqlOrder, Integer, Integer, Integer, Map)} .
     */
    public <E> List<E> query(SqlSession session, Class<E> resultClass, Object dynamicInputValues,
            Object staticInputValues) throws SqlProcessorException, SqlRuntimeException {
        checkStaticInputValues(staticInputValues);
        return query(session, resultClass, dynamicInputValues,
                new SqlStandardControl().setStaticInputValues(staticInputValues));
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method {@link #query(SqlSession, Class resultClass,
     * Object, Object, SqlOrder, Integer, Integer, Integer, Map)} .
     */
    public <E> List<E> query(SqlSession session, Class<E> resultClass, Object dynamicInputValues,
            Object staticInputValues, final Map<String, Class<?>> moreResultClasses)
            throws SqlProcessorException, SqlRuntimeException {
        checkStaticInputValues(staticInputValues);
        return query(session, resultClass, dynamicInputValues, new SqlStandardControl()
                .setStaticInputValues(staticInputValues).setMoreResultClasses(moreResultClasses));
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method {@link #query(SqlSession, Class resultClass,
     * Object, Object, SqlOrder, Integer, Integer, Integer, Map)} .
     */
    public <E> List<E> query(SqlSession session, Class<E> resultClass, Object dynamicInputValues,
            Object staticInputValues, SqlOrder order) throws SqlProcessorException, SqlRuntimeException {
        checkStaticInputValues(staticInputValues);
        return query(session, resultClass, dynamicInputValues,
                new SqlStandardControl().setStaticInputValues(staticInputValues).setOrder(order));
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method {@link #query(SqlSession, Class resultClass,
     * Object, Object, SqlOrder, Integer, Integer, Integer, Map)} .
     */
    public <E> List<E> query(SqlSession session, Class<E> resultClass, Object dynamicInputValues,
            Object staticInputValues, SqlOrder order, final Map<String, Class<?>> moreResultClasses)
            throws SqlProcessorException, SqlRuntimeException {
        checkStaticInputValues(staticInputValues);
        return query(session, resultClass, dynamicInputValues, new SqlStandardControl()
                .setStaticInputValues(staticInputValues).setOrder(order).setMoreResultClasses(moreResultClasses));
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method {@link #query(SqlSession, Class resultClass,
     * Object, Object, SqlOrder, Integer, Integer, Integer, Map)} .
     */
    public <E> List<E> query(SqlSession session, Class<E> resultClass, Object dynamicInputValues, Integer firstResult,
            Integer maxResults) throws SqlProcessorException, SqlRuntimeException {
        return query(session, resultClass, dynamicInputValues,
                new SqlStandardControl().setMaxResults(maxResults).setFirstResult(firstResult));
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method {@link #query(SqlSession, Class resultClass,
     * Object, Object, SqlOrder, Integer, Integer, Integer, Map)} .
     */
    public <E> List<E> query(SqlSession session, Class<E> resultClass, Object dynamicInputValues,
            Object staticInputValues, Integer firstResult, Integer maxResults)
            throws SqlProcessorException, SqlRuntimeException {
        checkStaticInputValues(staticInputValues);
        return query(session, resultClass, dynamicInputValues, new SqlStandardControl()
                .setStaticInputValues(staticInputValues).setMaxResults(maxResults).setFirstResult(firstResult));
    }

    /**
     * Runs the META SQL query to obtain a list of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method {@link #query(SqlSession, Class resultClass,
     * Object, Object, SqlOrder, Integer, Integer, Integer, Map)} .
     */
    public <E> List<E> query(final SqlSession session, final Class<E> resultClass, final Object dynamicInputValues,
            final Object staticInputValues, final SqlOrder order, final Integer maxTimeout, final Integer maxResults,
            final Integer firstResult) throws SqlProcessorException, SqlRuntimeException {
        checkStaticInputValues(staticInputValues);
        return query(session, resultClass, dynamicInputValues,
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
            final Object staticInputValues, final SqlOrder order, final Integer maxTimeout, final Integer maxResults,
            final Integer firstResult, final Map<String, Class<?>> moreResultClasses)
            throws SqlProcessorException, SqlRuntimeException {
        checkStaticInputValues(staticInputValues);
        return query(session, resultClass, dynamicInputValues,
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

        final QueryExecutor<E> executor = new QueryExecutor<E>(new ArrayList<E>());
        List<E> rows = null;

        try {
            rows = monitor.runList(new SqlMonitor.Runner() {
                public List<E> run() {

                    final SqlRuntimeContext runtimeContext = executor.prepareQuery(session, resultClass,
                            dynamicInputValues, sqlControl);

                    if (monitor instanceof SqlExtendedMonitor) {
                        SqlExtendedMonitor monitorExt = (SqlExtendedMonitor) monitor;
                        return monitorExt.runListSql(new SqlMonitor.Runner() {
                            public List<E> run() {
                                return executor.execute(resultClass, sqlControl, runtimeContext);
                            }
                        }, resultClass);
                    } else {
                        return executor.execute(resultClass, sqlControl, runtimeContext);
                    }
                }
            }, resultClass);
            return rows;
        } finally {
            if (logger.isDebugEnabled()) {
                logger.debug("<< query, result rownums=" + ((rows != null) ? rows.size() : -1));
            }
        }
    }

    /**
     * Runs the META SQL query to process the query output using {@link SqlRowProcessor}. This is the primary and the
     * most complex SQL Processor execution method to obtain result class instance for every database row and process
     * this output. Criteria to pickup the correct database rows are taken from the input values.
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
     * @param sqlRowProcessor
     *            The callback designated to process every database row after transformation into result class instance
     * @return The total number of processed database rows.
     * @throws org.sqlproc.engine.SqlProcessorException
     *             in the case of any problem with ORM or JDBC stack
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the input/output values handling
     */
    @Beta
    public <E> Integer query(final SqlSession session, final Class<E> resultClass, final Object dynamicInputValues,
            final SqlControl sqlControl, final SqlRowProcessor<E> sqlRowProcessor)
            throws SqlProcessorException, SqlRuntimeException {
        if (logger.isDebugEnabled()) {
            logger.debug(">> query, session=" + session + ", resultClass=" + resultClass + ", dynamicInputValues="
                    + dynamicInputValues + ", sqlControl=" + sqlControl);
        }
        checkDynamicInputValues(dynamicInputValues);

        final QueryExecutor<E> executor = new QueryExecutor<E>(0);
        Integer rownums = null;

        try {
            rownums = monitor.run(new SqlMonitor.Runner() {
                public Integer run() {

                    final SqlRuntimeContext runtimeContext = executor.prepareQuery(session, resultClass,
                            dynamicInputValues, sqlControl);

                    if (monitor instanceof SqlExtendedMonitor) {
                        SqlExtendedMonitor monitorExt = (SqlExtendedMonitor) monitor;
                        return monitorExt.runSql(new SqlMonitor.Runner() {
                            public Integer run() {
                                return executor.execute(resultClass, sqlControl, sqlRowProcessor, runtimeContext);
                            }
                        }, Integer.class);
                    } else {
                        return executor.execute(resultClass, sqlControl, sqlRowProcessor, runtimeContext);
                    }
                }
            }, Integer.class);
            return rownums;
        } finally {
            if (logger.isDebugEnabled()) {
                logger.debug("<< query, result rownums=" + rownums);
            }
        }
    }

    /**
     * Runs the META SQL query to obtain the number of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #queryCount(SqlSession, Object, Object, SqlOrder, Integer)} .
     */
    public int queryCount(SqlSession session) throws SqlProcessorException, SqlRuntimeException {
        return queryCount(session, null, (SqlStandardControl) null);
    }

    /**
     * Runs the META SQL query to obtain the number of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #queryCount(SqlSession, Object, Object, SqlOrder, Integer)} .
     */
    public int queryCount(SqlSession session, Object dynamicInputValues)
            throws SqlProcessorException, SqlRuntimeException {
        return queryCount(session, dynamicInputValues, (SqlStandardControl) null);
    }

    /**
     * Runs the META SQL query to obtain the number of database rows. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #queryCount(SqlSession, Object, Object, SqlOrder, Integer)} .
     */
    public int queryCount(SqlSession session, Object dynamicInputValues, Object staticInputValues)
            throws SqlProcessorException, SqlRuntimeException {
        checkStaticInputValues(staticInputValues);
        return queryCount(session, dynamicInputValues,
                new SqlStandardControl().setStaticInputValues(staticInputValues));
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
            final SqlOrder order, final Integer maxTimeout) throws SqlProcessorException, SqlRuntimeException {
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

        final QueryExecutor<Object> executor = new QueryExecutor<Object>(0);
        Integer count = null;

        try {
            count = monitor.run(new SqlMonitor.Runner() {
                public Integer run() {

                    final SqlRuntimeContext runtimeContext = executor.prepareQueryCount(session, dynamicInputValues,
                            sqlControl);

                    if (monitor instanceof SqlExtendedMonitor) {
                        SqlExtendedMonitor monitorExt = (SqlExtendedMonitor) monitor;
                        return monitorExt.runSql(new SqlMonitor.Runner() {
                            public Integer run() {
                                return executor.executeCount(runtimeContext);
                            }
                        }, Integer.class);
                    } else {
                        return executor.executeCount(runtimeContext);
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
    public String getSql(final Object dynamicInputValues, final SqlControl sqlControl)
            throws SqlProcessorException, SqlRuntimeException {
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

    /*
     * Internal query execution implementation.
     */
    private class QueryExecutor<E> {
        private Integer rownums;
        private List<E> rows;
        private SqlQuery query;
        private SqlMappingResult mappingResult;

        QueryExecutor(final List<E> rows) {
            this.rows = rows;
        }

        QueryExecutor(final Integer rownums) {
            this.rownums = rownums;
        }

        SqlRuntimeContext prepareQuery(final SqlSession session, final Class<E> resultClass,
                final Object dynamicInputValues, final SqlControl sqlControl) {
            final SqlProcessResult processResult = process(SqlMetaStatement.Type.QUERY, dynamicInputValues, sqlControl);
            String sql = pluginFactory.getSqlExecutionPlugin().beforeSqlExecution(name,
                    processResult.getSql().toString());
            query = session.createSqlQuery(sql);
            query.setLogError(processResult.isLogError());
            query.setSqlControl(sqlControl);
            query.setOrdered(getOrder(sqlControl) != null && getOrder(sqlControl) != NO_ORDER);
            processResult.setQueryParams(session, query);
            mappingResult = SqlMappingRule.merge(mapping, processResult);
            mappingResult.setQueryResultMapping(resultClass, getMoreResultClasses(sqlControl), query);
            return mappingResult.getRuntimeContext();
        }

        SqlRuntimeContext prepareQueryCount(final SqlSession session, final Object dynamicInputValues,
                final SqlControl sqlControl) {
            final SqlProcessResult processResult = process(SqlMetaStatement.Type.QUERY, dynamicInputValues, sqlControl);
            String[] sql = pluginFactory.getSqlCountPlugin().sqlCount(name, processResult.getSql());
            query = session.createSqlQuery(sql[0]);
            query.setLogError(processResult.isLogError());
            query.setSqlControl(sqlControl);
            typeFactory.getDefaultType().addScalar(processResult.getRuntimeContext().getTypeFactory(), query, sql[1],
                    sql[2].equals("long") ? Long.class : Integer.class);
            query.setOrdered(getOrder(sqlControl) != null && getOrder(sqlControl) != NO_ORDER);
            processResult.setQueryParams(session, query);
            return processResult.getRuntimeContext();
        }

        List<E> execute(final Class<E> resultClass, final SqlControl sqlControl,
                final SqlRuntimeContext runtimeContext) {

            Map<String, Object> ids = mappingResult.getIds();

            List<Map<String, Object>> list = query.list(runtimeContext);
            boolean isPrimitiveWrapper = SqlUtils.isPrimitiveWrapper(resultClass);
            for (Map<String, Object> resultRow : list) {
                execute(runtimeContext, resultRow, resultClass, sqlControl, null, ids, isPrimitiveWrapper);
            }
            return rows;
        }

        Integer execute(final Class<E> resultClass, final SqlControl sqlControl,
                final SqlRowProcessor<E> sqlRowProcessor, final SqlRuntimeContext runtimeContext) {
            final Map<String, Object> ids = mappingResult.getIds();

            final boolean isPrimitiveWrapper = SqlUtils.isPrimitiveWrapper(resultClass);
            query.query(runtimeContext, new SqlQuery.SqlQueryRowProcessor() {

                @Override
                public boolean processRow(Map<String, Object> resultRow, int rownum) throws SqlRuntimeException {
                    return execute(runtimeContext, resultRow, resultClass, sqlControl, sqlRowProcessor, ids,
                            isPrimitiveWrapper);
                }

            });
            return rownums;

        }

        Integer executeCount(final SqlRuntimeContext runtimeContext) {

            Object result = query.unique(runtimeContext).values().toArray()[0];
            if (result instanceof Long)
                return ((Long) result).intValue();
            return (Integer) result;
        }

        boolean execute(final SqlRuntimeContext runtimeContext, Map<String, Object> resultRow,
                final Class<E> resultClass, final SqlControl sqlControl, final SqlRowProcessor<E> sqlRowProcessor,
                Map<String, Object> ids, boolean isPrimitiveWrapper) {

            E resultInstance = null;
            Object[] resultValues = SqlUtils.getResultValues(resultRow);

            if (logger.isTraceEnabled()) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < resultValues.length; i++)
                    sb.append("'").append(resultValues[i]).append("' ");
                logger.trace("== SQL execution partial result " + sb.toString());
            }

            boolean changedIdentity = true;
            if (ids != null) {
                String idsKey = SqlUtils.getIdsKey(resultValues, mappingResult.getMainIdentityIndex());
                if (ids.containsKey(idsKey)) {
                    resultInstance = (E) ids.get(idsKey);
                    changedIdentity = false;
                }
            }

            if (changedIdentity) {
                if (!isPrimitiveWrapper) {
                    resultInstance = (E) runtimeContext.getInstance(resultClass);
                    if (resultInstance == null) {
                        throw new SqlRuntimeException("There's problem to instantiate " + resultClass);
                    }
                } else {
                    resultInstance = (E) resultValues[0];
                }
            }

            if (!isPrimitiveWrapper) {
                mappingResult.setQueryResultData(resultInstance, resultValues, ids, getMoreResultClasses(sqlControl));
            }

            if (changedIdentity) {
                if (sqlRowProcessor != null) {
                    ++rownums;
                    if (!sqlRowProcessor.processRow(resultInstance, rownums))
                        return false;
                } else {
                    rows.add(resultInstance);
                }
                if (ids != null) {
                    String idsKey = SqlUtils.getIdsKey(resultValues, mappingResult.getMainIdentityIndex());
                    ids.put(idsKey, resultInstance);
                }
            }

            return true;
        }
    }
}
