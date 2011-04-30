package org.sqlproc.engine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.sqlproc.engine.impl.BeanUtils;
import org.sqlproc.engine.impl.SqlMappingResult;
import org.sqlproc.engine.impl.SqlMappingRule;
import org.sqlproc.engine.impl.SqlMetaStatement;
import org.sqlproc.engine.impl.SqlProcessResult;
import org.sqlproc.engine.type.SqlTypeFactory;

/**
 * The primary SQL Processor class for the META SQL callable statement execution.
 * 
 * <p>
 * Instance of this class holds one META SQL statement.
 * <p>
 * For example there's a table PERSON with two columns - ID and NAME. <br>
 * In queries.properties there's the next definition:
 * 
 * <pre>
 * CRUD_UPDATE_PERSON= \
 *  update PERSON \
 *  {= set name = :name} \
 *  {= where {& id = :id^long^notnull}}
 * </pre>
 * 
 * <p>
 * In the case of the SQL Processor initialization
 * 
 * <pre>
 * // by default it loads &quot;queries.properties&quot; file
 * SqlEngineFactory sqlFactory = new JdbcEngineFactory();
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
 * For more info please see the Reference Guide or the <a
 * href="http://code.google.com/p/sql-processor/w/list">tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlProcedureEngine extends SqlEngine {

    /**
     * Creates a new instance of the SqlQueryEngine from one META SQL query string and one SQL mapping rule string.
     * Constructor will call the internal ANTLR parsers for the query and the mapping rule instances construction. This
     * constructor is devoted to manual META SQL queries and mapping rules construction. More obvious is to put these
     * definitions into queries.properties file and engage the SqlEngineLoader for the SqlQueryEngine instances
     * construction.
     * 
     * @param name
     *            the name of this SQL Engine instance
     * @param statement
     *            the META SQL query statement
     * @param mapping
     *            the SQL mapping rule
     * @param typeFactory
     *            the factory for the META types construction
     * @throws SqlEngineException
     *             in the case the provided statements are not compliant with the ANTLR grammar
     */
    public SqlProcedureEngine(String name, String statement, String mapping, SqlTypeFactory typeFactory)
            throws SqlEngineException {

        super(name, SqlMetaStatement.getInstance(statement, typeFactory), (mapping != null) ? SqlMappingRule
                .getInstance(mapping, typeFactory) : null, null, null, typeFactory);
    }

    /**
     * Creates a new instance of the SqlQueryEngine from one META SQL statement string and one SQL Mapping rule string.
     * Constructor will call the internal ANTLR parsers for the statement and the mapping rule instances construction.
     * Compared to the previous constructor, an external SQL Monitor for the runtime statistics gathering is engaged and
     * the optional features can be involved. This constructor is devoted to manual META SQL queries and mapping rules
     * construction. More obvious is to put these definitions into queries.properties file and engage the
     * SqlEngineLoader for instances construction.
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
     * @throws SqlEngineException
     *             mainly in the case the provided statements are not compliant with the ANTLR grammar
     */
    public SqlProcedureEngine(String name, String statement, String mapping, SqlMonitor monitor,
            Map<String, Object> features, SqlTypeFactory typeFactory) throws SqlEngineException {

        super(name, SqlMetaStatement.getInstance(statement, typeFactory), (mapping != null) ? SqlMappingRule
                .getInstance(mapping, typeFactory) : null, monitor, features, typeFactory);
    }

    /**
     * Creates a new instance of the SqlQueryEngine from one META SQL statement and one SQL mapping rule instances. Both
     * parameters are already pre-compiled instances using the ANTLR parsers. This is the recommended usage for the
     * runtime performance optimization. This constructor is devoted to be used from the SqlEngineLoader, which is able
     * to read all statements and mapping rules definitions from an external queries.properties and create the named
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
     */
    public SqlProcedureEngine(String name, SqlMetaStatement statement, SqlMappingRule mapping,
            SqlTypeFactory typeFactory) {

        super(name, statement, mapping, null, null, typeFactory);
    }

    /**
     * Creates a new instance of the SqlQueryEngine from one META SQL statement and one SQL mapping rule instances. Both
     * parameters are already pre-compiled instances using the ANTLR parsers. This is the recommended usage for the
     * runtime performance optimization. This constructor is devoted to be used from the SqlEngineLoader, which is able
     * to read all statements and mapping rules definitions from an external queries.properties and create the named
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
     */
    public SqlProcedureEngine(String name, SqlMetaStatement statement, SqlMappingRule mapping, SqlMonitor monitor,
            Map<String, Object> features, SqlTypeFactory typeFactory) {
        super(name, statement, mapping, monitor, features, typeFactory);
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
     * @param maxTimeout
     *            The max SQL execution time. This parameter can help to protect production system against ineffective
     *            SQL query commands. The value is in milliseconds.
     * @return The list of the resultClass instances.
     * @throws org.hibernate.SqlProcessorException
     *             in the case of any problem with ORM or JDBC stack
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with the input/output values handling
     */
    @SuppressWarnings("unchecked")
    public <E> List<E> callQuery(final SqlSession session, final Class<E> resultClass, final Object dynamicInputValues,
            final Object staticInputValues, final int maxTimeout) throws SqlProcessorException, SqlRuntimeException {
        if (logger.isDebugEnabled()) {
            logger.debug(">> query, session=" + session + ", resultClass=" + resultClass + ", dynamicInputValues="
                    + dynamicInputValues + ", staticInputValues=" + staticInputValues + ", maxTimeout=" + maxTimeout);
        }

        List<E> result = null;

        try {
            result = monitor.runList(new SqlMonitor.Runner() {
                public List<E> run() {
                    SqlProcessResult processResult = statement.process(SqlMetaStatement.Type.CALL, dynamicInputValues,
                            staticInputValues, null, features, typeFactory);
                    SqlQuery query = session.createSqlQuery(processResult.getSql().toString());
                    if (maxTimeout > 0)
                        query.setTimeout(maxTimeout);
                    processResult.setQueryParams(session, query);
                    SqlMappingResult mappingResult = SqlMappingRule.merge(mapping, processResult);
                    mappingResult.setQueryResultMapping(resultClass, null, query);

                    List list = query.callList();
                    List<E> result = new ArrayList<E>();
                    E resultInstance = null;
                    Object[] resultValue = null;
                    Map<String, Object> instances = new HashMap<String, Object>();

                    for (Iterator i$ = list.iterator(); i$.hasNext();) {
                        Object resultRow = i$.next();
                        resultValue = (resultRow instanceof Object[]) ? (Object[]) resultRow
                                : (new Object[] { resultRow });
                        resultInstance = BeanUtils.getInstance(resultClass);
                        if (resultInstance == null) {
                            throw new SqlRuntimeException("There's problem to instantiate " + resultClass);
                        }
                        mappingResult.setQueryResultData(resultInstance, resultValue, instances, null, null);
                        result.add(resultInstance);
                    }
                    return result;
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
    @SuppressWarnings("unchecked")
    public int callUpdate(final SqlSession session, final Object dynamicInputValues, final Object staticInputValues,
            final int maxTimeout) throws SqlProcessorException, SqlRuntimeException {
        if (logger.isDebugEnabled()) {
            logger.debug(">> callUpdate, session=" + session + ", dynamicInputValues=" + dynamicInputValues
                    + ", staticInputValues=" + staticInputValues + ", maxTimeout=" + maxTimeout);
        }

        Integer count = null;

        try {
            count = monitor.run(new SqlMonitor.Runner() {
                public Integer run() {
                    SqlProcessResult processResult = statement.process(SqlMetaStatement.Type.CALL, dynamicInputValues,
                            staticInputValues, null, features, typeFactory);
                    SqlQuery query = session.createSqlQuery(processResult.getSql().toString());
                    if (maxTimeout > 0)
                        query.setTimeout(maxTimeout);
                    processResult.setQueryParams(session, query);

                    Integer count = query.callUpdate();
                    processResult.postProcess();
                    return count;
                }
            }, Integer.class);
            return count;
        } finally {
            if (logger.isDebugEnabled()) {
                logger.debug("<< callUpdate, result=" + count);
            }
        }
    }

    /**
     * Returns the insert statement derived from the META SQL statement. For the parameters description please see the
     * most complex execution method {@link #getSql(Object, Object, org.sqlproc.engine.impl.SqlMetaStatement.Type)} .
     */
    public String getCallSql(final Object dynamicInputValues, final Object staticInputValues)
            throws SqlProcessorException, SqlRuntimeException {
        return getSql(dynamicInputValues, staticInputValues, SqlMetaStatement.Type.CALL);
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
                            staticInputValues, null, features, typeFactory);
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
     * located in the queries.properties file, this name is the unique part of the keys in this file. For example for
     * the name ALL in the queries.properties file there's the META SQL statement with the name CRUD_ALL.
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
