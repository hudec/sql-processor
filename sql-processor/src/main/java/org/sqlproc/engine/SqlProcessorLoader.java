package org.sqlproc.engine;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.impl.SqlMappingRule;
import org.sqlproc.engine.impl.SqlMetaStatement;
import org.sqlproc.engine.impl.SqlProcessor;
import org.sqlproc.engine.impl.SqlUtils;
import org.sqlproc.engine.type.SqlComposedTypeFactory;
import org.sqlproc.engine.type.SqlInternalType;
import org.sqlproc.engine.type.SqlTypeFactory;

/**
 * The helper class for the META SQL statements and mapping rules parsing. These statements and rules are taken from the
 * {@link java.util.Properties}.<br>
 * 
 * The purpose of this class is to load and analyze (=parse) the META SQL statements and mapping rules located in the
 * properties repository. The standard properties repository is the external properties file with the name
 * <code>queries.properties</code>.
 * 
 * <p>
 * This is rather a low level helper class. For more simple approach please see {@link SqlSimpleFactory}
 * 
 * <p>
 * All the properties with the key <code>QRY_...</code> are parsed as the META SQL queries using the ANTLR based
 * grammar. <br>
 * All the properties with the key <code>CRUD_...</code> are parsed as the META SQL CRUD statements using the ANTLR
 * based grammar. <br>
 * All the properties with the key <code>OUT_...</code> are parsed as the mapping rules using the ANTLR based grammar.<br>
 * A pair of the META SQL statement and the (optional) mapping rule forms one named SQL Engine instance.<br>
 * All the properties with the key <code>SET_...</code> are taken as the optional features used in the process of the
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
 *   &lt;bean id="typeFactory" class="org.sqlproc.engine.jdbc.type.JdbcTypeFactory" factory-method="getInstance" /&gt;
 * 
 *   &lt;bean id="sqlQueries" class="org.springframework.beans.factory.config.PropertiesFactoryBean"&gt;
 *     &lt;property name="location"&gt;
 *       &lt;value>classpath:queries.properties&lt;/value&gt;
 *     &lt;/property&gt;
 *   &lt;/bean&gt;
 *   
 *   &lt;bean id="sqlLoader" class="org.sqlproc.engine.SqlProcessorLoader"&gt;
 *     &lt;constructor-arg ref="sqlQueries" /&gt;
 *     &lt;constructor-arg ref="typeFactory" /&gt;
 *   &lt;/bean&gt;
 * &lt;/beans&gt;
 * </pre>
 * 
 * and use the next code to obtain an instance of the SQL Query engine
 * 
 * <pre>
 * SqlQueryEngine sqlEngine = sqlLoader.getQueryEngine(&quot;ALL&quot;);
 * </pre>
 * 
 * or the next code to obtain an instance of the SQL CRUD engine
 * 
 * <pre>
 * SqlCrudEngine sqlEngine = sqlLoader.getCrudEngine(&quot;ALL&quot;);
 * </pre>
 * <p>
 * Another possibility is to utilize SqlPropertiesLoader.
 * 
 * <pre>
 * SqlPropertiesLoader loader = new SqlPropertiesLoader(&quot;queries.properties&quot;, this.getClass());
 * SqlProcessorLoader sqlLoader = new SqlProcessorLoader(loader.getProperties(), JdbcTypeFactory.getInstance());
 * SqlEngine sqlEngine = sqlLoader.getQueryEngine(&quot;ALL&quot;);
 * </pre>
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlProcessorLoader implements SqlEngineFactory {

    /**
     * The internal slf4j logger.
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * The combined factory for the META types construction.
     */
    private SqlTypeFactory composedTypeFactory;
    /**
     * The collection of named SQL Engine (the primary SQL Processor class) instances.
     */
    private Map<String, SqlEngine> engines = new HashMap<String, SqlEngine>();
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
    private Map<String, SqlMappingRule> fields;
    /**
     * The collection of the SQL Processor optional features.
     */
    private Map<String, Object> features;

    /**
     * Creates a new instance of the SqlProcessorLoader from the properties repository (which is in fact a collection of
     * the META SQL statements, mapping rules and optional features. During the instance construction all the statements
     * are parsed and the collection of named SQL Engine instances is established. Later these instances are used for
     * the SQL queries/statements execution. For the purpose of the META types construction (located inside the META SQL
     * statements and mapping rules) a factory instance has to be supplied.
     * 
     * @param sbStatements
     *            String representation of the META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlProcessorLoader(StringBuilder sbStatements, SqlTypeFactory typeFactory) throws SqlEngineException {
        this(sbStatements, typeFactory, null, null, null, (String[]) null);
    }

    /**
     * Creates a new instance of the SqlProcessorLoader from the properties repository (which is in fact a collection of
     * the META SQL statements, mapping rules and optional features. During the instance construction all the statements
     * are parsed and the collection of named SQL Engine instances is established. Later these instances are used for
     * the SQL queries/statements execution. For the purpose of the META types construction (located inside the META SQL
     * statements and mapping rules) a factory instance has to be supplied.
     * 
     * @param sbStatements
     *            String representation of the META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @param filter
     *            the properties name prefix to filter the META SQL statements, mapping rules and optional features
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlProcessorLoader(StringBuilder sbStatements, SqlTypeFactory typeFactory, String filter)
            throws SqlEngineException {
        this(sbStatements, typeFactory, filter, null, null, (String[]) null);
    }

    /**
     * Creates a new instance of the SqlProcessorLoader from the properties repository (which is in fact a collection of
     * the META SQL statements, mapping rules and optional features. During the instance construction all the statements
     * are parsed and the collection of named SQL Engine instances is established. Later these instances are used for
     * the SQL queries/statements execution. For the purpose of the META types construction (located inside the META SQL
     * statements and mapping rules) a factory instance has to be supplied. Every instance of the SQL Engine is
     * accompanied with the SQL Monitor for the runtime statistics gathering. For the creation of these monitors the SQL
     * Monitor Factory can be used.
     * 
     * @param sbStatements
     *            String representation of the META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @param filter
     *            the properties name prefix to filter the META SQL statements, mapping rules and optional features
     * @param monitorFactory
     *            the monitor factory used in the process of the SQL Monitor instances creation
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlProcessorLoader(StringBuilder sbStatements, SqlTypeFactory typeFactory, String filter,
            SqlMonitorFactory monitorFactory) throws SqlEngineException {
        this(sbStatements, typeFactory, filter, monitorFactory, null, (String[]) null);
    }

    /**
     * Creates a new instance of the SqlProcessorLoader from the properties repository (which is in fact a collection of
     * the META SQL statements, mapping rules and optional features. During the instance construction all the statements
     * are parsed and the collection of named SQL Engine instances is established. Later these instances are used for
     * the SQL queries/statements execution. For the purpose of the META types construction (located inside the META SQL
     * statements and mapping rules) a factory instance has to be supplied. Every instance of the SQL Engine is
     * accompanied with the SQL Monitor for the runtime statistics gathering. For the creation of these monitors the SQL
     * Monitor Factory can be used.
     * 
     * @param sbStatements
     *            String representation of the META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @param filter
     *            the properties name prefix to filter the META SQL statements, mapping rules and optional features
     * @param monitorFactory
     *            the monitor factory used in the process of the SQL Monitor instances creation
     * @param selectQueries
     *            only statements and rules with the names in this set are picked up from the properties repository
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlProcessorLoader(StringBuilder sbStatements, SqlTypeFactory typeFactory, String filter,
            SqlMonitorFactory monitorFactory, String... selectQueries) {
        this(sbStatements, typeFactory, filter, monitorFactory, null, selectQueries);
    }

    /**
     * Creates a new instance of the SqlProcessorLoader from the properties repository (which is in fact a collection of
     * the META SQL statements, mapping rules and optional features. During the instance construction all the statements
     * are parsed and the collection of named SQL Engine instances is established. Later these instances are used for
     * the SQL queries/statements execution. For the purpose of the META types construction (located inside the META SQL
     * statements and mapping rules) a factory instance has to be supplied. Every instance of the SQL Engine is
     * accompanied with the SQL Monitor for the runtime statistics gathering. For the creation of these monitors the SQL
     * Monitor Factory can be used.
     * 
     * @param sbStatements
     *            String representation of the META SQL queries/statements/output mappings
     * @param typeFactory
     *            the factory for the META types construction
     * @param filter
     *            the properties name prefix to filter the META SQL statements, mapping rules and optional features
     * @param monitorFactory
     *            the monitor factory used in the process of the SQL Monitor instances creation
     * @param customTypes
     *            the custom META types
     * @param selectQueries
     *            only statements and rules with the names in this set are picked up from the properties repository
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlProcessorLoader(StringBuilder sbStatements, SqlTypeFactory typeFactory, String filter,
            SqlMonitorFactory monitorFactory, List<SqlInternalType> customTypes, String... selectQueries)
            throws SqlEngineException {
        if (logger.isTraceEnabled()) {
            logger.trace(">> SqlProcessorLoader, sbStatements=" + sbStatements + ", typeFactory=" + typeFactory
                    + ", monitorFactory=" + monitorFactory + ", filter=" + filter + ", customTypes=" + customTypes
                    + ", selectQueries=" + selectQueries);
        }

        if (sbStatements == null)
            throw new SqlEngineException("Missing SQL META queries/statements/output mappings");
        if (typeFactory == null)
            throw new SqlEngineException("Missing the META types factory");

        this.composedTypeFactory = new SqlComposedTypeFactory(typeFactory, customTypes);

        try {
            Set<String> setSelectQueries = (selectQueries != null && selectQueries.length > 0) ? new HashSet<String>(
                    Arrays.asList(selectQueries)) : null;

            filter = (filter != null) ? filter.toUpperCase() : null;

            StringBuilder errors = new StringBuilder();
            SqlProcessor processor = null;

            try {
                processor = SqlProcessor.getInstance(sbStatements, composedTypeFactory, setSelectQueries, filter);
            } catch (SqlEngineException see) {
                errors.append(see.getMessage());
            }

            if (errors.length() > 0)
                throw new SqlEngineException(errors.toString());

            sqls = processor.getMetaStatements(SqlProcessor.StatementType.QRY);
            cruds = processor.getMetaStatements(SqlProcessor.StatementType.CRUD);
            calls = processor.getMetaStatements(SqlProcessor.StatementType.CALL);
            fields = processor.getMappingRules(SqlProcessor.MappingType.OUT);
            features = processor.getFeatures();

            Map<String, Object> defaultFeatures = SqlUtils.getDefaultFeatures(filter);
            for (String featureName : defaultFeatures.keySet()) {
                if (!features.containsKey(featureName))
                    features.put(featureName, defaultFeatures.get(featureName));
            }

            for (String name : fields.keySet()) {
                if (!sqls.containsKey(name) && !calls.containsKey(name))
                    errors.append("For the OUT/FIELDS there's no QRY: ").append(name).append("\n");
            }

            if (errors.length() > 0)
                throw new SqlEngineException(errors.toString());

            for (String name : sqls.keySet()) {
                SqlMetaStatement stmt = sqls.get(name);

                SqlMappingRule mapping = null;
                if (!stmt.isHasOutputMapping() && !fields.containsKey(name)) {
                    errors.append("For the QRY there's no OUT: ").append(name).append("\n");
                } else if (fields.containsKey(name)) {
                    mapping = fields.get(name);
                } else {
                    mapping = new SqlMappingRule();
                }
                SqlMonitor monitor = (monitorFactory != null) ? monitorFactory.getSqlMonitor(name, features) : null;
                if (stmt != null) {
                    engines.put(name, new SqlQueryEngine(name, stmt, mapping, monitor, features,
                            this.composedTypeFactory));
                }
            }

            for (String name : cruds.keySet()) {
                SqlMetaStatement stmt = cruds.get(name);
                SqlMonitor monitor = (monitorFactory != null) ? monitorFactory.getSqlMonitor(name, features) : null;
                if (stmt != null) {
                    engines.put(name, new SqlCrudEngine(name, stmt, monitor, features, this.composedTypeFactory));
                }
            }

            for (String name : calls.keySet()) {
                SqlMetaStatement stmt = calls.get(name);
                SqlMappingRule mapping = null;
                if (fields.containsKey(name)) {
                    mapping = fields.get(name);
                } else {
                    mapping = new SqlMappingRule();
                }
                SqlMonitor monitor = (monitorFactory != null) ? monitorFactory.getSqlMonitor(name, features) : null;
                if (stmt != null) {
                    engines.put(name, new SqlProcedureEngine(name, stmt, mapping, monitor, features,
                            this.composedTypeFactory));
                }
            }

            if (errors.length() > 0)
                throw new SqlEngineException(errors.toString());
        } finally {
            if (logger.isDebugEnabled()) {
                logger.debug("<< SqlProcessorLoader, engines=" + engines + ", sqls=" + sqls + ", cruds=" + cruds
                        + ", fields=" + fields + ", features=" + features);
            }
        }
    }

    /**
     * Returns the collection of names of all initialized/constructed SQL Engine instances.
     * 
     * @return Collection of all initialized SQL Engine instances' names
     */
    public Collection<String> getNames() {
        return engines.keySet();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQueryEngine getQueryEngine(String name) {
        Object o = engines.get(name);
        if (o != null && o instanceof SqlQueryEngine)
            return (SqlQueryEngine) o;
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlCrudEngine getCrudEngine(String name) {
        Object o = engines.get(name);
        if (o != null && o instanceof SqlCrudEngine)
            return (SqlCrudEngine) o;
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlProcedureEngine getProcedureEngine(String name) {
        Object o = engines.get(name);
        if (o != null && o instanceof SqlProcedureEngine)
            return (SqlProcedureEngine) o;
        return null;
    }
}
