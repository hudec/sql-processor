package org.sqlproc.engine;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.annotation.Beta;
import org.sqlproc.engine.impl.SqlDefaultFeatures;
import org.sqlproc.engine.impl.SqlMappingRule;
import org.sqlproc.engine.impl.SqlMetaStatement;
import org.sqlproc.engine.impl.SqlProcessResult;
import org.sqlproc.engine.impl.SqlProcessor;
import org.sqlproc.engine.plugin.SqlPluginFactory;
import org.sqlproc.engine.type.SqlComposedTypeFactory;
import org.sqlproc.engine.type.SqlInternalType;
import org.sqlproc.engine.type.SqlTypeFactory;
import org.sqlproc.engine.validation.SqlValidatorFactory;

/**
 * The helper class for the META SQL statements and mapping rules parsing. These statements and rules are taken from the
 * file repository based on the provided ANTLR grammar.<br>
 * 
 * The purpose of this class is to load and analyze (=parse) the SQL Processor artifacts:
 * <ul>
 * <li>the META SQL statements</li>
 * <li>the mapping rules</li>
 * <li>the optional features</li>
 * </ul>
 * 
 * <p>
 * This is rather a low level helper class. For more simple approach please see {@link SqlSimpleFactory}
 * 
 * <p>
 * All the statements with the name <code>name(QRY)</code> are parsed as the META SQL queries using the ANTLR based
 * grammar. <br>
 * All the statements with the name <code>name(CRUD)</code> are parsed as the META SQL CRUD statements using the ANTLR
 * based grammar. <br>
 * All the statements with the name <code>name(CALL)</code> are parsed as the META SQL CALL statements using the ANTLR
 * based grammar. These are used to call the stored procedures.<br>
 * All the statements with the name <code>name(OUT)</code> are parsed as the mapping rules using the ANTLR based
 * grammar.<br>
 * A pair of the META SQL statement and the (optional) mapping rule forms one named SQL Engine instance.<br>
 * All the statements with the name <code>name(OPT)</code> are taken as the optional features used in the process of the
 * SQL query/statement generation and execution.<br>
 * <p>
 * In the process of ANTLR based parsing different kinds of incorrect stuff can cause the {@link SqlEngineException} to
 * be raised.
 * 
 * <p>
 * In the process of the META SQL statements and mapping rules parsing the input/output values META types have to be
 * established. For this purpose a factory class responsible for these META types construction has to be supplied.<br>
 * 
 * <p>
 * To initialize the SqlProcessorLoader, Spring DI configuration can be utilized, like the next one:<br>
 * 
 * <pre>
 * &lt;beans ...&gt;
 *   ...
 *     &lt;bean id="sqlFactory" class="org.sqlproc.engine.jdbc.JdbcEngineFactory" init-method="init"&gt;
 *         &lt;property name="metaFilesNames"&gt;
 *             &lt;list&gt;
 *                 &lt;value&gt;statements.qry&lt;/value&gt;
 *             &lt;/list&gt;
 *         &lt;/property&gt;
 *     &lt;/bean&gt;
 * &lt;/beans&gt;
 * </pre>
 * 
 * and use the next code to obtain an instance of the SQL Query engine
 * 
 * <pre>
 * SqlEngineFactory sqlFactory = context.getBean(&quot;sqlFactory&quot;, SqlEngineFactory.class);
 * SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine(&quot;ALL&quot;);
 * </pre>
 * 
 * or the next code to obtain an instance of the SQL CRUD engine
 * 
 * <pre>
 * SqlEngineFactory sqlFactory = context.getBean(&quot;sqlFactory&quot;, SqlEngineFactory.class);
 * SqlCrudEngine sqlEngine = sqlFactory.getCrudEngine(&quot;ALL&quot;);
 * </pre>
 * <p>
 * Another possibility is to utilize {@link SqlFilesLoader}.
 * 
 * <pre>
 * SqlFilesLoader loader = new SqlFilesLoader(&quot;statements.qry&quot;, this.getClass());
 * SqlProcessorLoader sqlLoader = new SqlProcessorLoader(loader.getStatements(), JdbcTypeFactory.getInstance());
 * SqlQueryEngine sqlEngine = sqlLoader.getQueryEngine(&quot;ALL&quot;);
 * </pre>
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlProcessorLoader {

    /**
     * The SQL Engine types
     */
    public enum EngineType {
        Query, Crud, Procedure
    }

    /**
     * The SQL Processor initialized engines
     */
    static class Engine {
        ConcurrentHashMap<String, SqlEngine> sqls = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, SqlEngine> cruds = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, SqlEngine> calls = new ConcurrentHashMap<>();

        ConcurrentHashMap<String, SqlEngine> get(EngineType type) {
            if (type == EngineType.Query)
                return sqls;
            if (type == EngineType.Crud)
                return cruds;
            return calls;
        }
    }

    /**
     * The SQL Processor processing cache
     */
    static class Cache {
        ConcurrentHashMap<String, Map<String, SqlProcessResult>> sqls = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, Map<String, SqlProcessResult>> cruds = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, Map<String, SqlProcessResult>> calls = new ConcurrentHashMap<>();

        ConcurrentHashMap<String, Map<String, SqlProcessResult>> get(EngineType type) {
            if (type == EngineType.Query)
                return sqls;
            if (type == EngineType.Crud)
                return cruds;
            return calls;
        }
    }

    /**
     * The internal slf4j logger.
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * The combined factory for the META types construction.
     */
    private SqlTypeFactory composedTypeFactory;
    /**
     * The factory for the SQL Processor plugins. This is the basic facility to alter the SQL Processor processing.
     */
    private SqlPluginFactory pluginFactory;
    /**
     * The monitor factory used in the process of the SQL Monitor instances creation
     */
    private SqlMonitorFactory monitorFactory;
    /**
     * The validator factory used in the process of the SQL Monitor instances creation
     */
    private SqlValidatorFactory validatorFactory;
    /**
     * The collection of named SQL Engines (the primary SQL Processor class) instances.
     */
    private Engine engines = new Engine();
    /**
     * The collection of named dynamic SQL Engines (the primary SQL Processor class) instances.
     */
    private Engine dynamicEngines = new Engine();
    /**
     * The collection of named META SQL queries.
     */
    private Map<String, SqlMetaStatement> sqls;
    /**
     * The collection of named META SQL CRUD statements.
     */
    private Map<String, SqlMetaStatement> cruds;
    /**
     * The collection of named META SQL CALLABLE statements.
     */
    private Map<String, SqlMetaStatement> calls;
    /**
     * The collection of named explicitly defined mapping rules.
     */
    private Map<String, SqlMappingRule> outs;
    /**
     * The collection of the SQL Processor optional features.
     */
    private Map<String, Object> features;
    /**
     * The collection of the SQL Processor optional features in the statement context.
     */
    private Map<String, Map<String, Object>> statementsFeatures;
    /**
     * The collection of the SQL Processor optional features to be cleared in the statement context.
     */
    private Map<String, Set<String>> statementsFeaturesUnset;
    /**
     * This flag indicates to speed up the initialization process.
     */
    private Boolean lazyInit;
    /**
     * The processing cache used for {@link SqlProcessResult} instances.
     */
    private Cache processingCache = new Cache();

    /**
     * Creates a new instance of the SqlProcessorLoader from the String content repository (which is in fact a
     * collection of the META SQL statements, mapping rules and optional features. During the instance construction all
     * the statements are parsed and the collection of named SQL Engine instances is established. Later these instances
     * are used for the SQL queries/statements execution. For the purpose of the META types construction (located inside
     * the META SQL statements and mapping rules) a factory instance has to be supplied.
     * 
     * @param sbStatements
     *            the String representation of the META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlProcessorLoader(StringBuilder sbStatements, SqlTypeFactory typeFactory, SqlPluginFactory pluginFactory)
            throws SqlEngineException {
        this(sbStatements, typeFactory, pluginFactory, null, null, null, (String[]) null);
    }

    /**
     * Creates a new instance of the SqlProcessorLoader from the String content repository (which is in fact a
     * collection of the META SQL statements, mapping rules and optional features. During the instance construction all
     * the statements are parsed and the collection of named SQL Engine instances is established. Later these instances
     * are used for the SQL queries/statements execution. For the purpose of the META types construction (located inside
     * the META SQL statements and mapping rules) a factory instance has to be supplied.
     * 
     * @param sbStatements
     *            the String representation of the META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     * @param filter
     *            the properties name prefix to filter the META SQL statements, mapping rules and optional features
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlProcessorLoader(StringBuilder sbStatements, SqlTypeFactory typeFactory, SqlPluginFactory pluginFactory,
            String filter) throws SqlEngineException {
        this(sbStatements, typeFactory, pluginFactory, filter, null, null, (String[]) null);
    }

    /**
     * Creates a new instance of the SqlProcessorLoader from the String content repository (which is in fact a
     * collection of the META SQL statements, mapping rules and optional features. During the instance construction all
     * the statements are parsed and the collection of named SQL Engine instances is established. Later these instances
     * are used for the SQL queries/statements execution. For the purpose of the META types construction (located inside
     * the META SQL statements and mapping rules) a factory instance has to be supplied. Every instance of the SQL
     * Engine is accompanied with the SQL Monitor for the runtime statistics gathering. For the creation of these
     * monitors the SQL Monitor Factory can be used.
     * 
     * @param sbStatements
     *            the String representation of the META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     * @param filter
     *            the properties name prefix to filter the META SQL statements, mapping rules and optional features
     * @param monitorFactory
     *            the monitor factory used in the process of the SQL Monitor instances creation
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlProcessorLoader(StringBuilder sbStatements, SqlTypeFactory typeFactory, SqlPluginFactory pluginFactory,
            String filter, SqlMonitorFactory monitorFactory) throws SqlEngineException {
        this(sbStatements, typeFactory, pluginFactory, filter, monitorFactory, null, (String[]) null);
    }

    /**
     * Creates a new instance of the SqlProcessorLoader from the String content repository (which is in fact a
     * collection of the META SQL statements, mapping rules and optional features. During the instance construction all
     * the statements are parsed and the collection of named SQL Engine instances is established. Later these instances
     * are used for the SQL queries/statements execution. For the purpose of the META types construction (located inside
     * the META SQL statements and mapping rules) a factory instance has to be supplied. Every instance of the SQL
     * Engine is accompanied with the SQL Monitor for the runtime statistics gathering. For the creation of these
     * monitors the SQL Monitor Factory can be used.
     * 
     * @param sbStatements
     *            the String representation of the META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     * @param filter
     *            the properties name prefix to filter the META SQL statements, mapping rules and optional features
     * @param monitorFactory
     *            the monitor factory used in the process of the SQL Monitor instances creation
     * @param onlyStatements
     *            only statements and rules with the names in this container are picked up from the properties
     *            repository
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlProcessorLoader(StringBuilder sbStatements, SqlTypeFactory typeFactory, SqlPluginFactory pluginFactory,
            String filter, SqlMonitorFactory monitorFactory, String... onlyStatements) {
        this(sbStatements, typeFactory, pluginFactory, filter, monitorFactory, null, onlyStatements);
    }

    /**
     * Creates a new instance of the SqlProcessorLoader from the String content repository (which is in fact a
     * collection of the META SQL statements, mapping rules and optional features. During the instance construction all
     * the statements are parsed and the collection of named SQL Engine instances is established. Later these instances
     * are used for the SQL queries/statements execution. For the purpose of the META types construction (located inside
     * the META SQL statements and mapping rules) a factory instance has to be supplied. Every instance of the SQL
     * Engine is accompanied with the SQL Monitor for the runtime statistics gathering. For the creation of these
     * monitors the SQL Monitor Factory can be used.
     * 
     * @param sbStatements
     *            the String representation of the META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     * @param filter
     *            the properties name prefix to filter the META SQL statements, mapping rules and optional features
     * @param monitorFactory
     *            the monitor factory used in the process of the SQL Monitor instances creation
     * @param customTypes
     *            the custom META types
     * @param onlyStatements
     *            only statements and rules with the names in this container are picked up from the properties
     *            repository
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlProcessorLoader(StringBuilder sbStatements, SqlTypeFactory typeFactory, SqlPluginFactory pluginFactory,
            String filter, SqlMonitorFactory monitorFactory, List<SqlInternalType> customTypes,
            String... onlyStatements) throws SqlEngineException {
        this(sbStatements, typeFactory, pluginFactory, filter, monitorFactory, null, customTypes, onlyStatements);
    }

    /**
     * Creates a new instance of the SqlProcessorLoader from the String content repository (which is in fact a
     * collection of the META SQL statements, mapping rules and optional features. During the instance construction all
     * the statements are parsed and the collection of named SQL Engine instances is established. Later these instances
     * are used for the SQL queries/statements execution. For the purpose of the META types construction (located inside
     * the META SQL statements and mapping rules) a factory instance has to be supplied. Every instance of the SQL
     * Engine is accompanied with the SQL Monitor for the runtime statistics gathering. For the creation of these
     * monitors the SQL Monitor Factory can be used.
     * 
     * @param sbStatements
     *            the String representation of the META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     * @param filter
     *            the properties name prefix to filter the META SQL statements, mapping rules and optional features
     * @param monitorFactory
     *            the monitor factory used in the process of the SQL Monitor instances creation
     * @param validatorFactory
     *            the validator factory used in the process of the SQL Monitor instances creation
     * @param customTypes
     *            the custom META types
     * @param onlyStatements
     *            only statements and rules with the names in this container are picked up from the properties
     *            repository
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlProcessorLoader(StringBuilder sbStatements, SqlTypeFactory typeFactory, SqlPluginFactory pluginFactory,
            String filter, SqlMonitorFactory monitorFactory, SqlValidatorFactory validatorFactory,
            List<SqlInternalType> customTypes, String... onlyStatements) throws SqlEngineException {
        this(sbStatements, typeFactory, pluginFactory, filter, monitorFactory, validatorFactory, customTypes, false,
                onlyStatements);
    }

    /**
     * Creates a new instance of the SqlProcessorLoader from the String content repository (which is in fact a
     * collection of the META SQL statements, mapping rules and optional features. During the instance construction all
     * the statements are parsed and the collection of named SQL Engine instances is established. Later these instances
     * are used for the SQL queries/statements execution. For the purpose of the META types construction (located inside
     * the META SQL statements and mapping rules) a factory instance has to be supplied. Every instance of the SQL
     * Engine is accompanied with the SQL Monitor for the runtime statistics gathering. For the creation of these
     * monitors the SQL Monitor Factory can be used.
     * 
     * @param sbStatements
     *            the String representation of the META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     * @param filter
     *            the properties name prefix to filter the META SQL statements, mapping rules and optional features
     * @param monitorFactory
     *            the monitor factory used in the process of the SQL Monitor instances creation
     * @param validatorFactory
     *            the validator factory used in the process of the SQL Monitor instances creation
     * @param customTypes
     *            the custom META types
     * @param lazyInit
     *            this flag indicates to speed up the initialization process
     * @param onlyStatements
     *            only statements and rules with the names in this container are picked up from the properties
     *            repository
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlProcessorLoader(StringBuilder sbStatements, SqlTypeFactory typeFactory, SqlPluginFactory pluginFactory,
            String filter, SqlMonitorFactory monitorFactory, SqlValidatorFactory validatorFactory,
            List<SqlInternalType> customTypes, Boolean lazyInit, String... onlyStatements) throws SqlEngineException {
        if (logger.isTraceEnabled()) {
            logger.trace(">> SqlProcessorLoader, sbStatements=" + sbStatements + ", typeFactory=" + typeFactory
                    + ", pluginFactory=" + pluginFactory + ", monitorFactory=" + monitorFactory + ", validatorFactory="
                    + validatorFactory + ", filter=" + filter + ", customTypes=" + customTypes + ", lazyInit="
                    + lazyInit + ", onlyStatements=" + onlyStatements);
        }

        long start = System.currentTimeMillis();

        if (sbStatements == null)
            throw new SqlEngineException("Missing SQL META queries/statements/output mappings");
        if (typeFactory == null)
            throw new SqlEngineException("Missing the META types factory");

        this.composedTypeFactory = new SqlComposedTypeFactory(typeFactory, customTypes);
        this.pluginFactory = pluginFactory;
        this.validatorFactory = validatorFactory;
        this.monitorFactory = monitorFactory;
        this.lazyInit = lazyInit;

        try {
            Set<String> setSelectQueries = (onlyStatements != null && onlyStatements.length > 0) ? new HashSet<String>(
                    Arrays.asList(onlyStatements)) : null;

            filter = (filter != null) ? filter.toUpperCase() : null;
            Map<String, Object> defaultFeatures = SqlDefaultFeatures.getFilteredFeatures(filter);

            StringBuilder errors = new StringBuilder();
            SqlProcessor processor = null;

            try {
                processor = (isLazyInit()) ? SqlProcessor.getLazyInstance(sbStatements, composedTypeFactory,
                        defaultFeatures, setSelectQueries, filter) : SqlProcessor.getInstance(sbStatements,
                        composedTypeFactory, defaultFeatures, setSelectQueries, filter);
            } catch (SqlEngineException see) {
                errors.append(see.getMessage());
            }

            if (errors.length() > 0)
                throw new SqlEngineException(errors.toString());

            if (!processor.getWarnings().isEmpty()) {
                logger.warn("There're warnings in the process of statements parsing: " + processor.getWarnings());
            }

            sqls = processor.getMetaStatements(SqlProcessor.StatementType.QRY);
            cruds = processor.getMetaStatements(SqlProcessor.StatementType.CRUD);
            calls = processor.getMetaStatements(SqlProcessor.StatementType.CALL);
            outs = processor.getMappingRules(SqlProcessor.MappingType.OUT);
            features = processor.getFeatures();
            statementsFeatures = processor.getStatementsFeatures();
            statementsFeaturesUnset = processor.getStatementsFeaturesUnset();

            for (String name : outs.keySet()) {
                if (!sqls.containsKey(name) && !calls.containsKey(name) && !cruds.containsKey(name))
                    errors.append("For the OUT/FIELDS there's no QRY: ").append(name).append("\n");
            }

            if (errors.length() > 0)
                throw new SqlEngineException(errors.toString());

        } finally {
            if (logger.isDebugEnabled()) {
                long end = System.currentTimeMillis();
                logger.debug("== SqlProcessorLoader, lazyInit=" + lazyInit + ", duration in ms=" + (end - start));
            }
            if (logger.isTraceEnabled()) {
                logger.trace("<< SqlProcessorLoader, engines=" + engines + ", sqls=" + sqls + ", cruds=" + cruds
                        + ", fields=" + outs + ", features=" + features);
            }
        }
    }

    /**
     * Initializes all SQL Processor engines. It can be done synchronously or asynchronously. For every engine, for
     * which there's error in the initialization process there a error message.
     * 
     * @param executor
     *            The asynchronous executor. In the case it is null, the initialization is provided in synchronous mode.
     * @param sqlsToInit
     *            The SQL engine names to initialize.
     * @param crudsToInit
     *            The CRUD engine names to initialize.
     * @param callsToInit
     *            The Procedure engine names to initialize.
     */
    public void init(Executor executor, Set<String> sqlsToInit, Set<String> crudsToInit, Set<String> callsToInit) {
        if (logger.isTraceEnabled()) {
            logger.trace(">> init, executor=" + executor);
        }
        long start = System.currentTimeMillis();

        try {
            if (executor != null) {
                Set<String> names = (sqlsToInit != null) ? sqlsToInit : sqls.keySet();
                for (String name : names) {
                    AsyncEngineInit aei = new AsyncEngineInit(name, EngineType.Query, enginesInitErrors);
                    executor.execute(aei);
                }
                names = (crudsToInit != null) ? crudsToInit : cruds.keySet();
                for (String name : names) {
                    AsyncEngineInit aei = new AsyncEngineInit(name, EngineType.Crud, enginesInitErrors);
                    executor.execute(aei);
                }
                names = (callsToInit != null) ? callsToInit : calls.keySet();
                for (String name : names) {
                    AsyncEngineInit aei = new AsyncEngineInit(name, EngineType.Procedure, enginesInitErrors);
                    executor.execute(aei);
                }
            } else {
                Set<String> names = (sqlsToInit != null) ? sqlsToInit : sqls.keySet();
                for (String name : names) {
                    try {
                        logger.info("== sync init, name={}, type={} in {}", name, EngineType.Query, Thread
                                .currentThread().getName());
                        getEngine(name, EngineType.Query);
                    } catch (SqlEngineException ex) {
                        String msg = ex.getMessage();
                        enginesInitErrors.put(EngineType.Query.name() + ":" + name, msg);
                        logger.warn("!! init, name={}, error={}", name, msg);
                    }
                }
                names = (crudsToInit != null) ? crudsToInit : cruds.keySet();
                for (String name : names) {
                    try {
                        logger.info("== sync init, name={}, type={} in {}", name, EngineType.Crud, Thread
                                .currentThread().getName());
                        getEngine(name, EngineType.Crud);
                    } catch (SqlEngineException ex) {
                        String msg = ex.getMessage();
                        enginesInitErrors.put(EngineType.Crud.name() + ":" + name, msg);
                        logger.warn("!! init, name={}, error={}", name, msg);
                    }
                }
                names = (callsToInit != null) ? callsToInit : calls.keySet();
                for (String name : names) {
                    try {
                        logger.info("== sync init, name={}, type={} in {}", name, EngineType.Procedure, Thread
                                .currentThread().getName());
                        getEngine(name, EngineType.Procedure);
                    } catch (SqlEngineException ex) {
                        String msg = ex.getMessage();
                        enginesInitErrors.put(EngineType.Procedure.name() + ":" + name, msg);
                        logger.warn("!! init, name={}, error={}", name, msg);
                    }
                }
            }

        } finally {
            if (logger.isDebugEnabled()) {
                long end = System.currentTimeMillis();
                logger.debug("== init, duration in ms=" + (end - start));
            }
            if (logger.isTraceEnabled()) {
                logger.trace("<< init");
            }
        }
    }

    /**
     * The result of initialization. For every engine, for which there's error in the initialization process there a
     * error message.
     */
    private ConcurrentHashMap<String, String> enginesInitErrors = new ConcurrentHashMap<String, String>();

    /**
     * Returns the result of engines initialization process. For every engine, for which there's error in the
     * initialization process there a error message. In the case there's no error, the result message is null.
     * 
     * @return the result of engines initialization process
     */
    public ConcurrentHashMap<String, String> getEnginesInitErrors() {
        return enginesInitErrors;
    }

    /**
     * Returns the result of engines initialization process. For every engine, for which there's error in the
     * initialization process there a error message. In the case there's no error, the result message is null.
     * 
     * @return the result of engines initialization process
     */
    public String getEnginesInitErrorsMsg() {
        StringBuilder sb = new StringBuilder();
        boolean isError = false;
        for (Entry<String, String> e : enginesInitErrors.entrySet()) {
            if (e.getValue() != null) {
                if (isError)
                    sb.append("\n");
                sb.append(e.getKey() + ": " + e.getValue());
                isError = true;
            }
        }
        if (isError)
            return sb.toString();
        return null;
    }

    @Beta
    private class AsyncEngineInit implements Runnable {

        private String name;
        private EngineType engineType;
        private ConcurrentHashMap<String, String> enginesInitErrors;

        public AsyncEngineInit(String name, EngineType engineType, ConcurrentHashMap<String, String> enginesInitErrors) {
            this.name = name;
            this.engineType = engineType;
            this.enginesInitErrors = enginesInitErrors;
        }

        @Override
        public void run() {
            logger.info("== async init, name={}, type={} in {}", name, engineType, Thread.currentThread().getName());
            try {
                getEngine(name, engineType);
            } catch (SqlEngineException ex) {
                String msg = ex.getMessage();
                enginesInitErrors.put(engineType.name() + ":" + name, msg);
                logger.warn("!! init, name={}, error={}", name, msg);
            }
        }
    }

    /**
     * Some filters can be the optional features in the statement context.
     * 
     * @param name
     *            the name of the META SQL statement
     */
    private void loadStatementFeatures(String name, SqlEngine sqlEngine) {
        Map<String, Object> statementFeatures = statementsFeatures.get(name);
        if (statementFeatures != null) {
            for (Map.Entry<String, Object> entry : statementFeatures.entrySet()) {
                sqlEngine.setFeature(entry.getKey(), entry.getValue());
            }
        }
        Set<String> statementFeaturesUnset = statementsFeaturesUnset.get(name);
        if (statementFeaturesUnset != null) {
            sqlEngine.unsetFeatures(statementFeaturesUnset);
        }
    }

    /**
     * Returns all static engines of the required type
     * 
     * @param engineType
     *            the required SQL Engine type
     * @return a container of initialized engines
     */
    public Map<String, SqlEngine> getEngines(EngineType engineType) {
        return engines.get(engineType);
    }

    /**
     * Returns all dynamic engines of the required type
     * 
     * @param engineType
     *            the required SQL Engine type
     * @return a container of initialized engines
     */
    public Map<String, SqlEngine> getDynamicEngines(EngineType engineType) {
        return dynamicEngines.get(engineType);
    }

    /**
     * Creates a new instance of the SQL Engine instance (the primary SQL Processor class).
     * 
     * @param name
     *            the name of the required SQL Procedure Engine instance
     * @param engineType
     *            the required SQL Engine type
     * @param stmt
     *            the new SQL META statement instance for the case of static SQL Engine instance
     * @param sqlStatement
     *            the new SQL statement for the case of dynamic SQL Engine instance
     * @return the new SQL Engine instance
     * @throws SqlEngineException
     *             in the case the instance can't be created
     */
    private SqlEngine createEngine(String name, EngineType engineType, SqlMetaStatement stmt, String sqlStatement) {
        SqlMetaStatement stmt2 = null;
        if (sqlStatement != null)
            stmt2 = SqlMetaStatement.getInstance(name, sqlStatement, composedTypeFactory);
        else if (isLazyInit())
            stmt2 = SqlMetaStatement.getInstance(name, stmt.getRaw(), composedTypeFactory);
        else
            stmt2 = stmt;

        if (engineType == EngineType.Query && !stmt2.isHasOutputMapping() && !outs.containsKey(name))
            throw new SqlEngineException("For the QRY there's no OUT: " + name);
        SqlMappingRule mapping = null;
        if (outs.containsKey(name)) {
            mapping = outs.get(name);
            if (isLazyInit())
                mapping = SqlMappingRule.getInstance(name, mapping.getRaw(), composedTypeFactory);
        } else {
            mapping = new SqlMappingRule();
        }

        SqlMonitor monitor = (monitorFactory != null) ? monitorFactory.getSqlMonitor(name, features) : null;
        SqlEngine sqlEngine;
        if (engineType == EngineType.Query)
            sqlEngine = new SqlQueryEngine(name, stmt2, mapping, monitor, features, this.composedTypeFactory,
                    this.pluginFactory);
        else if (engineType == EngineType.Crud)
            sqlEngine = new SqlCrudEngine(name, stmt2, mapping, monitor, features, this.composedTypeFactory,
                    this.pluginFactory);
        else
            sqlEngine = new SqlProcedureEngine(name, stmt2, mapping, monitor, features, this.composedTypeFactory,
                    this.pluginFactory);
        sqlEngine.setValidator((validatorFactory != null) ? validatorFactory.getSqlValidator() : null);
        loadStatementFeatures(name, sqlEngine);
        return sqlEngine;
    }

    /**
     * Returns the named static SQL Engine instance (the primary SQL Processor class).
     * 
     * @param name
     *            the name of the required SQL Procedure Engine instance
     * @param engineType
     *            the required SQL Engine type
     * @return the SQL Engine instance
     * @throws SqlEngineException
     *             in the case the instance can't be created
     */
    public SqlEngine getStaticEngine(String name, EngineType engineType) {
        dynamicEngines.get(engineType).remove(name);
        SqlEngine sqlEngine = engines.get(engineType).get(name);

        if (sqlEngine == null) {
            SqlMetaStatement stmt = getStatements(engineType).get(name);

            if (stmt != null) {
                sqlEngine = createEngine(name, engineType, stmt, null);
                SqlEngine sqlEnginePrev = engines.get(engineType).putIfAbsent(name, sqlEngine);
                if (sqlEnginePrev != null) {
                    sqlEngine = sqlEnginePrev;
                } else {
                    Map<String, SqlProcessResult> _processingCache;
                    processingCache.get(engineType).put(name,
                            _processingCache = new ConcurrentHashMap<String, SqlProcessResult>());
                    sqlEngine.setProcessingCache(_processingCache);
                }
            }
        }
        return sqlEngine;
    }

    /**
     * Returns the named dynamic SQL Engine instance (the primary SQL Processor class).
     * 
     * @param name
     *            the name of the required SQL Procedure Engine instance
     * @param engineType
     *            the required SQL Engine type
     * @param sqlStatement
     *            the new SQL statement
     * @return the SQL Engine instance
     * @throws SqlEngineException
     *             in the case the instance can't be created
     */
    public SqlEngine getDynamicEngine(String name, EngineType engineType, String sqlStatement) {
        Map<String, SqlMetaStatement> stmts = getStatements(engineType);
        if (!stmts.containsKey(name))
            throw new SqlEngineException("Missing SQL Engine " + name);
        if (sqlStatement == null)
            throw new SqlEngineException("SQL statement for SQL Engine " + name + " is null");
        SqlEngine sqlEngine = createEngine(name, engineType, null, sqlStatement);
        dynamicEngines.get(engineType).put(name, sqlEngine);
        processingCache.get(engineType).put(name, new ConcurrentHashMap<String, SqlProcessResult>());
        sqlEngine.setProcessingCache(processingCache.get(engineType).get(name));
        return sqlEngine;
    }

    /**
     * Returns the named static or dynamic SQL Engine instance (the primary SQL Processor class).
     * 
     * @param name
     *            the name of the required SQL Procedure Engine instance
     * @param engineType
     *            the required SQL Engine type
     * @return the SQL Engine instance
     * @throws SqlEngineException
     *             in the case the instance can't be created
     */
    public SqlEngine getEngine(String name, EngineType engineType) {
        SqlEngine sqlEngine = dynamicEngines.get(engineType).get(name);
        if (sqlEngine != null)
            return sqlEngine;
        return getStaticEngine(name, engineType);
    }

    /**
     * Returns the static statements container based on required SQL Engine type
     * 
     * @param engineType
     *            the required SQL Engine type
     * @return the static statements container
     */
    private Map<String, SqlMetaStatement> getStatements(EngineType engineType) {
        if (engineType == EngineType.Query)
            return sqls;
        else if (engineType == EngineType.Crud)
            return cruds;
        else
            return calls;
    }

    /**
     * Returns a flag which indicates the lazy initialization mode.
     * 
     * @return a flag which indicates the lazy initialization mode.
     */
    public boolean isLazyInit() {
        return lazyInit != null && lazyInit;
    }
}
