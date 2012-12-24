package org.sqlproc.engine;

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
 * The primary SQL Processor class for the META SQL CRUD statement execution.
 * 
 * <p>
 * Instance of this class holds one META SQL statement.
 * <p>
 * For example there's a table PERSON with two columns - ID and NAME. <br>
 * In the meta statements file statements.qry there's the next definition:
 * 
 * <pre>
 * UPDATE_PERSON(CRUD)=
 *   update PERSON
 *   {= set name = :name}
 *   {= where {& id = :id^long^notnull}}
 * ;
 * </pre>
 * 
 * <p>
 * In the case of the SQL Processor initialization
 * 
 * <pre>
 * JdbcEngineFactory sqlFactory = new JdbcEngineFactory();
 * sqlFactory.setMetaFilesNames(&quot;statements.qry&quot;); // the meta statements file
 * SqlCrudEngine sqlEngine = sqlFactory.getCrudEngine(&quot;UPDATE_PERSON&quot;);
 * 
 * // for the case it runs on the top of the JDBC stack
 * Connection connection = DriverManager.getConnection(&quot;jdbc:hsqldb:mem:sqlproc&quot;, &quot;sa&quot;, &quot;&quot;);
 * SqlSession session = new JdbcSimpleSession(connection);
 * </pre>
 * 
 * there's created an instance of SqlCrudEngine with the name <code>UPDATE_PERSON</code>.
 * 
 * <p>
 * Next the query can be executed with one of the <code>updateXXX</code> methods. For example there's a Java bean class
 * Person with attributes id and name. The invocation
 * 
 * <pre>
 * Person person = new Person();
 * person.setId(1);
 * person.setName(&quot;Bozena&quot;);
 * 
 * int count = sqlEngine.update(session, person);
 * </pre>
 * 
 * produces the next SQL execution
 * 
 * <pre>
 * update PERSON SET name = ? WHERE id = ?
 * </pre>
 * 
 * <p>
 * and returns the number of updated rows.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlCrudEngine extends SqlEngine {

    /**
     * Creates a new instance of the SqlCrudEngine from one META SQL statement string. Constructor will call the
     * internal ANTLR parser for the CRUD statement construction. This constructor is devoted to manual META SQL
     * statements construction. More obvious is to put the META SQL statements definitions into the meta statements file
     * and engage the {@link SqlProcessorLoader} for the SqlCrudEngine instances construction.
     * 
     * @param name
     *            the name of this SQL Engine instance
     * @param statement
     *            the META SQL CRUD statement
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     * @throws SqlEngineException
     *             in the case the provided statements are not compliant with the ANTLR grammar
     */
    public SqlCrudEngine(String name, String statement, SqlTypeFactory typeFactory, SqlPluginFactory pluginFactory)
            throws SqlEngineException {

        super(name, SqlMetaStatement.getInstance(name, statement, typeFactory), null, null, null, typeFactory,
                pluginFactory);
    }

    /**
     * Creates a new instance of the SqlCrudEngine from one META SQL statement string. Constructor will call the
     * internal ANTLR parser for the CRUD statement instances construction. Compared to the previous constructor, an
     * external SQL Monitor for the runtime statistics gathering is engaged and the optional features can be involved.
     * This constructor is devoted to manual META SQL statements construction. More obvious is to put the META SQL
     * statements definitions into the meta statements file and engage the {@link SqlProcessorLoader} for the
     * SqlCrudEngine instances construction.
     * 
     * @param name
     *            the name of this SQL Engine instance
     * @param statement
     *            the META SQL CRUD statement
     * @param monitor
     *            the SQL Monitor for the runtime statistics gathering
     * @param features
     *            the optional SQL Processor features
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     * @throws SqlEngineException
     *             in the case the provided statements are not compliant with the ANTLR grammar
     */
    public SqlCrudEngine(String name, String statement, SqlMonitor monitor, Map<String, Object> features,
            SqlTypeFactory typeFactory, SqlPluginFactory pluginFactory) throws SqlEngineException {

        super(name, SqlMetaStatement.getInstance(name, statement, typeFactory), null, monitor, features, typeFactory,
                pluginFactory);
    }

    /**
     * Creates a new instance of the SqlCrudEngine from one META SQL statement instance. This instance is already
     * pre-compiled using the ANTLR parser. This is the recommended usage for the runtime performance optimization. This
     * constructor is devoted to be used from the custom loader, which is able to read all statements definitions from
     * an external meta statements file and create the named SqlCrudEngine instances.
     * 
     * @param name
     *            the name of this SQL Engine instance
     * @param statement
     *            the pre-compiled META SQL CRUD statement
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     */
    public SqlCrudEngine(String name, SqlMetaStatement statement, SqlTypeFactory typeFactory,
            SqlPluginFactory pluginFactory) {

        super(name, statement, null, null, null, typeFactory, pluginFactory);
    }

    /**
     * Creates a new instance of the SqlCrudEngine from one META SQL statement instance. This instance is already
     * pre-compiled using the ANTLR parsers. This is the recommended usage for the runtime performance optimization.
     * This constructor is devoted to be used from the custom loader, which is able to read all statements definitions
     * from an external meta statements file and create the named SqlCrudEngine instances. Compared to the previous
     * constructor, an external SQL Monitor for the runtime statistics gathering is engaged and the optional features
     * can be involved.
     * 
     * @param name
     *            the name of this SQL Engine instance
     * @param statement
     *            the pre-compiled META SQL CRUD statement
     * @param monitor
     *            the SQL Monitor for the runtime statistics gathering
     * @param features
     *            the optional SQL Processor features
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     */
    public SqlCrudEngine(String name, SqlMetaStatement statement, SqlMonitor monitor, Map<String, Object> features,
            SqlTypeFactory typeFactory, SqlPluginFactory pluginFactory) {
        super(name, statement, null, monitor, features, typeFactory, pluginFactory);
    }

    /**
     * Creates a new instance of the SqlCrudEngine from one META SQL statement instance. This instance is already
     * pre-compiled using the ANTLR parsers. This is the recommended usage for the runtime performance optimization.
     * This constructor is devoted to be used from the custom loader, which is able to read all statements definitions
     * from an external meta statements file and create the named SqlCrudEngine instances. Compared to the previous
     * constructor, an external SQL Monitor for the runtime statistics gathering is engaged and the optional features
     * can be involved.
     * 
     * @param name
     *            the name of this SQL Engine instance
     * @param statement
     *            the pre-compiled META SQL CRUD statement
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
    public SqlCrudEngine(String name, SqlMetaStatement statement, SqlMappingRule mapping, SqlMonitor monitor,
            Map<String, Object> features, SqlTypeFactory typeFactory, SqlPluginFactory pluginFactory) {
        super(name, statement, mapping, monitor, features, typeFactory, pluginFactory);
    }

    /**
     * Runs the META SQL insert statement to persist a database row. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #insert(SqlSession, Object, Object, int)} .
     */
    public int insert(final SqlSession session, final Object dynamicInputValues) throws SqlProcessorException,
            SqlRuntimeException {
        return insert(session, dynamicInputValues, null, 0);
    }

    /**
     * Runs the META SQL insert statement to persist a database row. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #insert(SqlSession, Object, Object, int)} .
     */
    public int insert(final SqlSession session, final Object dynamicInputValues, final Object staticInputValues)
            throws SqlProcessorException, SqlRuntimeException {
        return insert(session, dynamicInputValues, staticInputValues, 0);
    }

    /**
     * Runs the META SQL insert statement to persist a database row. This is the primary and the most complex SQL
     * Processor execution method to persist an instance of input values.
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
     * @param maxTimeout
     *            The max SQL execution time. This parameter can help to protect production system against ineffective
     *            SQL query commands. The value is in milliseconds.
     * @return The number of persisted database rows.
     * @throws org.hibernate.SqlProcessorException
     *             in the case of any problem with ORM or JDBC stack
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the input/output values handling
     */
    public int insert(final SqlSession session, final Object dynamicInputValues, final Object staticInputValues,
            final int maxTimeout) throws SqlProcessorException, SqlRuntimeException {
        return insert(session, dynamicInputValues, new SqlStandardControl().setStaticInputValues(staticInputValues)
                .setMaxTimeout(maxTimeout));

    }

    /**
     * Runs the META SQL insert statement to persist a database row. This is the primary and the most complex SQL
     * Processor execution method to persist an instance of input values.
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
     * @return The number of persisted database rows.
     * @throws org.hibernate.SqlProcessorException
     *             in the case of any problem with ORM or JDBC stack
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the input/output values handling
     */
    public int insert(final SqlSession session, final Object dynamicInputValues, final SqlControl sqlControl)
            throws SqlProcessorException, SqlRuntimeException {
        if (logger.isDebugEnabled()) {
            logger.debug(">> insert, session=" + session + ", dynamicInputValues=" + dynamicInputValues
                    + ", sqlControl=" + sqlControl);
        }

        Integer count = null;

        try {
            count = monitor.run(new SqlMonitor.Runner() {
                public Integer run() {
                    SqlProcessResult processResult = statement.process(SqlMetaStatement.Type.CREATE,
                            dynamicInputValues, sqlControl.getStaticInputValues(), null, features, typeFactory,
                            pluginFactory);
                    SqlQuery query = session.createSqlQuery(processResult.getSql().toString());
                    if (sqlControl.getMaxTimeout() > 0)
                        query.setTimeout(sqlControl.getMaxTimeout());
                    processResult.setQueryParams(session, query);

                    Integer count = query.update();
                    processResult.postProcess();
                    return count;
                }
            }, Integer.class);
            return count;
        } finally {
            if (logger.isDebugEnabled()) {
                logger.debug("<< insert, result=" + count);
            }
        }
    }

    /**
     * Runs the META SQL query to obtain a unique database row. This is one of the overriden methods. For the parameters
     * description please see the most complex execution method
     * {@link #get(SqlSession, Class, Object, Object, int, Map)} .
     */
    public <E> E get(final SqlSession session, final Class<E> resultClass, final Object dynamicInputValues)
            throws SqlProcessorException, SqlRuntimeException {
        return get(session, resultClass, dynamicInputValues, null, 0);
    }

    /**
     * Runs the META SQL query to obtain a unique database row. This is one of the overriden methods. For the parameters
     * description please see the most complex execution method
     * {@link #get(SqlSession, Class, Object, Object, int, Map)} .
     */
    public <E> E get(final SqlSession session, final Class<E> resultClass, final Object dynamicInputValues,
            final Object staticInputValues) throws SqlProcessorException, SqlRuntimeException {
        return get(session, resultClass, dynamicInputValues, staticInputValues, 0);
    }

    /**
     * Runs the META SQL query to obtain a unique database row. This is one of the overriden methods. For the parameters
     * description please see the most complex execution method
     * {@link #get(SqlSession, Class, Object, Object, int, Map)} .
     */
    public <E> E get(final SqlSession session, final Class<E> resultClass, final Object dynamicInputValues,
            final Object staticInputValues, final Map<String, Class<?>> moreResultClasses)
            throws SqlProcessorException, SqlRuntimeException {
        return get(session, resultClass, dynamicInputValues, staticInputValues, 0, moreResultClasses);
    }

    /**
     * Runs the META SQL query to obtain a unique database row. This is one of the overriden methods. For the parameters
     * description please see the most complex execution method
     * {@link #get(SqlSession, Class, Object, Object, int, Map)} .
     */
    public <E> E get(final SqlSession session, final Class<E> resultClass, final Object dynamicInputValues,
            final Object staticInputValues, final int maxTimeout) throws SqlProcessorException, SqlRuntimeException {
        return get(session, resultClass, dynamicInputValues, staticInputValues, maxTimeout, null);
    }

    /**
     * Runs the META SQL query to obtain a unique database row. This is the primary and the most complex SQL Processor
     * execution method to obtain an unique instance of the result class. Criteria to pickup the correct database row
     * are taken from input values.
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
     * @param maxTimeout
     *            The max SQL execution time. This parameter can help to protect production system against ineffective
     *            SQL query commands. The value is in milliseconds.
     * @param moreResultClasses
     *            More result classes used for the return values, like the collections classes or the collections items.
     *            They are used mainly for the one-to-one, one-to-many and many-to-many associations.
     * @return The instance of the resultClass.
     * @throws org.hibernate.SqlProcessorException
     *             in the case of any problem with ORM or JDBC stack
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the input/output values handling
     */
    public <E> E get(final SqlSession session, final Class<E> resultClass, final Object dynamicInputValues,
            final Object staticInputValues, final int maxTimeout, final Map<String, Class<?>> moreResultClasses)
            throws SqlProcessorException, SqlRuntimeException {
        return get(session, resultClass, dynamicInputValues,
                new SqlStandardControl().setStaticInputValues(staticInputValues).setMaxTimeout(maxTimeout)
                        .setMoreResultClasses(moreResultClasses));
    }

    /**
     * Runs the META SQL query to obtain a unique database row. This is the primary and the most complex SQL Processor
     * execution method to obtain an unique instance of the result class. Criteria to pickup the correct database row
     * are taken from input values.
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
     * @return The instance of the resultClass.
     * @throws org.hibernate.SqlProcessorException
     *             in the case of any problem with ORM or JDBC stack
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the input/output values handling
     */
    public <E> E get(final SqlSession session, final Class<E> resultClass, final Object dynamicInputValues,
            final SqlControl sqlControl) throws SqlProcessorException, SqlRuntimeException {
        if (logger.isDebugEnabled()) {
            logger.debug(">> get, session=" + session + ", resultClass=" + resultClass + ", dynamicInputValues="
                    + dynamicInputValues + ", sqlControl=" + sqlControl);
        }

        E result = null;

        try {
            result = monitor.run(new SqlMonitor.Runner() {
                public E run() {
                    SqlProcessResult processResult = statement.process(SqlMetaStatement.Type.RETRIEVE,
                            dynamicInputValues, sqlControl.getStaticInputValues(), null, features, typeFactory,
                            pluginFactory);
                    SqlQuery query = session.createSqlQuery(processResult.getSql().toString());
                    if (sqlControl.getMaxTimeout() > 0)
                        query.setTimeout(sqlControl.getMaxTimeout());
                    processResult.setQueryParams(session, query);
                    SqlMappingResult mappingResult = SqlMappingRule.merge(mapping, processResult);
                    mappingResult.setQueryResultMapping(resultClass, sqlControl.getMoreResultClasses(), query);

                    @SuppressWarnings("rawtypes")
                    List list = query.list();
                    E resultInstance = null;
                    Object[] resultValue = null;
                    Map<String, Object> ids = mappingResult.getIds();

                    for (@SuppressWarnings("rawtypes")
                    Iterator i$ = list.iterator(); i$.hasNext();) {
                        Object resultRow = i$.next();
                        resultValue = (resultRow instanceof Object[]) ? (Object[]) resultRow
                                : (new Object[] { resultRow });

                        boolean changedIdentity = true;
                        if (ids != null) {
                            String idsKey = SqlUtils.getIdsKey(resultValue, mappingResult.getMainIdentityIndex());
                            if (ids.containsKey(idsKey))
                                changedIdentity = false;
                        }

                        if (changedIdentity) {
                            if (resultInstance != null) {
                                throw new SqlProcessorException("There's no unique result");
                            }
                            resultInstance = BeanUtils.getInstance(resultClass);
                            if (resultInstance == null) {
                                throw new SqlRuntimeException("There's problem to instantiate " + resultClass);
                            }
                        }

                        mappingResult.setQueryResultData(resultInstance, resultValue, ids,
                                sqlControl.getMoreResultClasses());
                        if (changedIdentity) {
                            if (ids != null) {
                                String idsKey = SqlUtils.getIdsKey(resultValue, mappingResult.getMainIdentityIndex());
                                ids.put(idsKey, resultInstance);
                            }
                        }
                    }
                    return resultInstance;
                }
            }, resultClass);
            return result;
        } finally {
            if (logger.isDebugEnabled()) {
                logger.debug("<< get, result=" + result);
            }
        }
    }

    /**
     * Runs the META SQL update statement to persist a database row. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #update(SqlSession, Object, Object, int)} .
     */
    public int update(final SqlSession session, final Object dynamicInputValues) throws SqlProcessorException,
            SqlRuntimeException {
        return update(session, dynamicInputValues, null, 0);
    }

    /**
     * Runs the META SQL update statement to persist a database row. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #update(SqlSession, Object, Object, int)} .
     */
    public int update(final SqlSession session, final Object dynamicInputValues, final Object staticInputValues)
            throws SqlProcessorException, SqlRuntimeException {
        return update(session, dynamicInputValues, staticInputValues, 0);
    }

    /**
     * Runs the META SQL update statement to persist a database row. This is the primary and the most complex SQL
     * Processor execution method to persist an instance of input values. Changed values are taken from the input
     * values. At the same time criteria to pickup the correct database rows(s) are taken from the input values too.
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
     * @param maxTimeout
     *            The max SQL execution time. This parameter can help to protect production system against ineffective
     *            SQL query commands. The value is in milliseconds.
     * @return The number of updated database rows.
     * @throws org.hibernate.SqlProcessorException
     *             in the case of any problem with ORM or JDBC stack
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the input/output values handling
     */
    public int update(final SqlSession session, final Object dynamicInputValues, final Object staticInputValues,
            final int maxTimeout) throws SqlProcessorException, SqlRuntimeException {
        return update(session, dynamicInputValues, new SqlStandardControl().setStaticInputValues(staticInputValues)
                .setMaxTimeout(maxTimeout));
    }

    /**
     * Runs the META SQL update statement to persist a database row. This is the primary and the most complex SQL
     * Processor execution method to persist an instance of input values. Changed values are taken from the input
     * values. At the same time criteria to pickup the correct database rows(s) are taken from the input values too.
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
     * @return The number of updated database rows.
     * @throws org.hibernate.SqlProcessorException
     *             in the case of any problem with ORM or JDBC stack
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the input/output values handling
     */
    public int update(final SqlSession session, final Object dynamicInputValues, final SqlControl sqlControl)
            throws SqlProcessorException, SqlRuntimeException {
        if (logger.isDebugEnabled()) {
            logger.debug(">> update, session=" + session + ", dynamicInputValues=" + dynamicInputValues
                    + ", sqlControl=" + sqlControl);
        }

        Integer count = null;

        try {
            count = monitor.run(new SqlMonitor.Runner() {
                public Integer run() {
                    SqlProcessResult processResult = statement.process(SqlMetaStatement.Type.UPDATE,
                            dynamicInputValues, sqlControl.getStaticInputValues(), null, features, typeFactory,
                            pluginFactory);
                    SqlQuery query = session.createSqlQuery(processResult.getSql().toString());
                    if (sqlControl.getMaxTimeout() > 0)
                        query.setTimeout(sqlControl.getMaxTimeout());
                    processResult.setQueryParams(session, query);

                    return query.update();
                }
            }, Integer.class);
            return count;
        } finally {
            if (logger.isDebugEnabled()) {
                logger.debug("<< update, result=" + count);
            }
        }
    }

    /**
     * Runs the META SQL delete statement to delete a database row. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #delete(SqlSession, Object, Object, int)} .
     */
    public int delete(final SqlSession session, final Object dynamicInputValues) throws SqlProcessorException,
            SqlRuntimeException {
        return delete(session, dynamicInputValues, null, 0);
    }

    /**
     * Runs the META SQL delete statement to delete a database row. This is one of the overriden methods. For the
     * parameters description please see the most complex execution method
     * {@link #delete(SqlSession, Object, Object, int)} .
     */
    public int delete(final SqlSession session, final Object dynamicInputValues, final Object staticInputValues)
            throws SqlProcessorException, SqlRuntimeException {
        return delete(session, dynamicInputValues, staticInputValues, 0);
    }

    /**
     * Runs the META SQL delete statement to delete a database row. This is the primary and the most complex SQL
     * Processor execution method to delete the database row(s) based on criteria from the input values.
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
     * @param maxTimeout
     *            The max SQL execution time. This parameter can help to protect production system against ineffective
     *            SQL query commands. The value is in milliseconds.
     * @return The number of updated database rows.
     * @throws org.hibernate.SqlProcessorException
     *             in the case of any problem with ORM or JDBC stack
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the input/output values handling
     */
    public int delete(final SqlSession session, final Object dynamicInputValues, final Object staticInputValues,
            final int maxTimeout) throws SqlProcessorException, SqlRuntimeException {
        return delete(session, dynamicInputValues, new SqlStandardControl().setStaticInputValues(staticInputValues)
                .setMaxTimeout(maxTimeout));
    }

    /**
     * Runs the META SQL delete statement to delete a database row. This is the primary and the most complex SQL
     * Processor execution method to delete the database row(s) based on criteria from the input values.
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
     * @return The number of updated database rows.
     * @throws org.hibernate.SqlProcessorException
     *             in the case of any problem with ORM or JDBC stack
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the input/output values handling
     */
    public int delete(final SqlSession session, final Object dynamicInputValues, final SqlControl sqlControl)
            throws SqlProcessorException, SqlRuntimeException {
        if (logger.isDebugEnabled()) {
            logger.debug(">> delete, session=" + session + ", dynamicInputValues=" + dynamicInputValues
                    + ", sqlControl=" + sqlControl);
        }

        Integer count = null;

        try {
            count = monitor.run(new SqlMonitor.Runner() {
                public Integer run() {
                    SqlProcessResult processResult = statement.process(SqlMetaStatement.Type.DELETE,
                            dynamicInputValues, sqlControl.getStaticInputValues(), null, features, typeFactory,
                            pluginFactory);
                    SqlQuery query = session.createSqlQuery(processResult.getSql().toString());
                    if (sqlControl.getMaxTimeout() > 0)
                        query.setTimeout(sqlControl.getMaxTimeout());
                    processResult.setQueryParams(session, query);

                    return query.update();
                }
            }, Integer.class);
            return count;
        } finally {
            if (logger.isDebugEnabled()) {
                logger.debug("<< delete, result=" + count);
            }
        }
    }

    /**
     * Returns the insert statement derived from the META SQL statement. For the parameters description please see the
     * most complex execution method {@link #getSql(Object, Object, org.sqlproc.engine.impl.SqlMetaStatement.Type)} .
     */
    public String getInsertSql(final Object dynamicInputValues, final Object staticInputValues)
            throws SqlProcessorException, SqlRuntimeException {
        return getSql(dynamicInputValues, staticInputValues, SqlMetaStatement.Type.CREATE);
    }

    /**
     * Returns the query select statement derived from the META SQL statement. For the parameters description please see
     * the most complex execution method {@link #getSql(Object, Object, org.sqlproc.engine.impl.SqlMetaStatement.Type)}
     * .
     */
    public String getGetSql(final Object dynamicInputValues, final Object staticInputValues)
            throws SqlProcessorException, SqlRuntimeException {
        return getSql(dynamicInputValues, staticInputValues, SqlMetaStatement.Type.RETRIEVE);
    }

    /**
     * Returns the update statement derived from the META SQL statement. For the parameters description please see the
     * most complex execution method {@link #getSql(Object, Object, org.sqlproc.engine.impl.SqlMetaStatement.Type)} .
     */
    public String getUpdateSql(final Object dynamicInputValues, final Object staticInputValues)
            throws SqlProcessorException, SqlRuntimeException {
        return getSql(dynamicInputValues, staticInputValues, SqlMetaStatement.Type.UPDATE);
    }

    /**
     * Returns the delete statement derived from the META SQL statement. For the parameters description please see the
     * most complex execution method {@link #getSql(Object, Object, org.sqlproc.engine.impl.SqlMetaStatement.Type)} .
     */
    public String getDeleteSql(final Object dynamicInputValues, final Object staticInputValues)
            throws SqlProcessorException, SqlRuntimeException {
        return getSql(dynamicInputValues, staticInputValues, SqlMetaStatement.Type.DELETE);
    }

    /**
     * Because SQL Processor is Data Driven Query engine, every input parameters can produce in fact different SQL
     * statement command. This method can help to identify the exact SQL statement command, which is produced in the
     * background of the SQL Processor execution. The statement is derived from the META SQL statement.
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
     * @param statementType
     *            The type of the statement under consideration. It can be CREATE, RETRIEVE, UPDATE or DELETE.
     * @return The SQL statement command derived from the META SQL statement based on the input parameters.
     * @throws org.hibernate.SqlProcessorException
     *             in the case of any problem with ORM or JDBC stack
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the input/output values handling
     */
    public String getSql(final Object dynamicInputValues, final Object staticInputValues,
            final SqlMetaStatement.Type statementType) throws SqlProcessorException, SqlRuntimeException {
        if (logger.isDebugEnabled()) {
            logger.debug(">> getSql, dynamicInputValues=" + dynamicInputValues + ", staticInputValues="
                    + staticInputValues);
        }

        String sql = null;

        try {
            sql = monitor.run(new SqlMonitor.Runner() {

                public String run() {
                    SqlProcessResult processResult = statement.process(statementType, dynamicInputValues,
                            staticInputValues, null, features, typeFactory, pluginFactory);
                    return processResult.getSql().toString();
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
     * Returns the name of this META SQL, which uniquely identifies the instance. In the case the META SQL statement is
     * located in the meta statements file, this name is the unique part of the keys in this file. For example for the
     * name ALL in the meta statements file there's the META SQL statement with the name ALL(CRUD).
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
