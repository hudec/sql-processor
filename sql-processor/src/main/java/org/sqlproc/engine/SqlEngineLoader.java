package org.sqlproc.engine;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.impl.SqlMappingRule;
import org.sqlproc.engine.impl.SqlMetaStatement;
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
 * To initialize the SqlEngineLoader, Spring DI configuration can be utilized, like the next one:<br>
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
 *   &lt;bean id="sqlLoader" class="org.sqlproc.engine.SqlEngineLoader"&gt;
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
 * SqlEngineLoader sqlLoader = new SqlEngineLoader(loader.getProperties(), JdbcTypeFactory.getInstance());
 * SqlEngine sqlEngine = sqlLoader.getQueryEngine(&quot;ALL&quot;);
 * </pre>
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlEngineLoader implements SqlEngineFactory {

    /**
     * The internal slf4j logger.
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    private static final String SET_PREFIX = "SET_";
    private static final int lSET_PREFIX = SET_PREFIX.length();
    private static final String FIELDS_REFERENCE = "#";
    private static final int lFIELDS_REFERENCE = FIELDS_REFERENCE.length();
    private static final String QUERY_PREFIX = "QRY_";
    private static final int lQUERY_PREFIX = QUERY_PREFIX.length();
    private static final String INPUT_MAPPING_PREFIX = "IN_";
    private static final int lINPUT_MAPPING_PREFIX = INPUT_MAPPING_PREFIX.length();
    private static final String OUTPUT_MAPPING_PREFIX = "OUT_";
    private static final int lOUTPUT_MAPPING_PREFIX = OUTPUT_MAPPING_PREFIX.length();
    private static final String CRUD_PREFIX = "CRUD_";
    private static final int lCRUD_PREFIX = CRUD_PREFIX.length();
    private static final String CALL_PREFIX = "CALL_";
    private static final int lCALL_PREFIX = CALL_PREFIX.length();

    private SqlTypeFactory composedTypeFactory;

    /**
     * The collection of named SQL Engine (the primary SQL Processor class) instances.
     */
    private Map<String, SqlEngine> engines = new HashMap<String, SqlEngine>();
    /**
     * The collection of named META SQL queries.
     */
    private Map<String, String> sqls = new HashMap<String, String>();
    /**
     * The collection of named META SQL CRUD statements.
     */
    private Map<String, String> cruds = new HashMap<String, String>();
    /**
     * The collection of named META SQL CALLABLE statements.
     */
    private Map<String, String> calls = new HashMap<String, String>();
    /**
     * The collection of named explicitly defined mapping rules.
     */
    private Map<String, String> fields = new HashMap<String, String>();
    /**
     * The collection of the SQL Processor optional features.
     */
    private Map<String, Object> features = new HashMap<String, Object>();

    /**
     * Creates a new instance of the SqlEngineLoader from the properties repository (which is in fact a collection of
     * the META SQL statements, mapping rules and optional features. During the instance construction all the statements
     * are parsed and the collection of named SQL Engine instances is established. Later these instances are used for
     * the SQL queries/statements execution. For the purpose of the META types construction (located inside the META SQL
     * statements and mapping rules) a factory instance has to be supplied.
     * 
     * @param props
     *            the collection of META SQL statements, mapping rules and optional features located in the properties
     *            repository
     * @param typeFactory
     *            the factory for the META types construction
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlEngineLoader(Properties props, SqlTypeFactory typeFactory) throws SqlEngineException {
        this(props, typeFactory, null, null, null, (String[]) null);
    }

    /**
     * Creates a new instance of the SqlEngineLoader from the properties repository (which is in fact a collection of
     * the META SQL statements, mapping rules and optional features. During the instance construction all the statements
     * are parsed and the collection of named SQL Engine instances is established. Later these instances are used for
     * the SQL queries/statements execution. For the purpose of the META types construction (located inside the META SQL
     * statements and mapping rules) a factory instance has to be supplied.
     * 
     * @param props
     *            the collection of META SQL statements, mapping rules and optional features
     * @param typeFactory
     *            the factory for the META types construction
     * @param filter
     *            the properties name prefix to filter the META SQL statements, mapping rules and optional features
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlEngineLoader(Properties props, SqlTypeFactory typeFactory, String filter) throws SqlEngineException {
        this(props, typeFactory, filter, null, null, (String[]) null);
    }

    /**
     * Creates a new instance of the SqlEngineLoader from the properties repository (which is in fact a collection of
     * the META SQL statements, mapping rules and optional features. During the instance construction all the statements
     * are parsed and the collection of named SQL Engine instances is established. Later these instances are used for
     * the SQL queries/statements execution. For the purpose of the META types construction (located inside the META SQL
     * statements and mapping rules) a factory instance has to be supplied. Every instance of the SQL Engine is
     * accompanied with the SQL Monitor for the runtime statistics gathering. For the creation of these monitors the SQL
     * Monitor Factory can be used.
     * 
     * @param props
     *            the collection of META SQL statements, mapping rules and optional features
     * @param typeFactory
     *            the factory for the META types construction
     * @param filter
     *            the properties name prefix to filter the META SQL statements, mapping rules and optional features
     * @param monitorFactory
     *            the monitor factory used in the process of the SQL Monitor instances creation
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlEngineLoader(Properties props, SqlTypeFactory typeFactory, String filter, SqlMonitorFactory monitorFactory)
            throws SqlEngineException {
        this(props, typeFactory, filter, monitorFactory, null, (String[]) null);
    }

    /**
     * Creates a new instance of the SqlEngineLoader from the properties repository (which is in fact a collection of
     * the META SQL statements, mapping rules and optional features. During the instance construction all the statements
     * are parsed and the collection of named SQL Engine instances is established. Later these instances are used for
     * the SQL queries/statements execution. For the purpose of the META types construction (located inside the META SQL
     * statements and mapping rules) a factory instance has to be supplied. Every instance of the SQL Engine is
     * accompanied with the SQL Monitor for the runtime statistics gathering. For the creation of these monitors the SQL
     * Monitor Factory can be used.
     * 
     * @param props
     *            the collection of META SQL statements, mapping rules and optional features
     * @param typeFactory
     *            the factory for the META types construction
     * @param filter
     *            the properties name prefix to filter the META SQL statements, mapping rules and optional features
     * @param monitorFactory
     *            the monitor factory used in the process of the SQL Monitor instances creation
     * @param onlyStatements
     *            only statements and rules with the names in this set are picked up from the properties repository
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlEngineLoader(Properties props, SqlTypeFactory typeFactory, String filter,
            SqlMonitorFactory monitorFactory, String... onlyStatements) {
        this(props, typeFactory, filter, monitorFactory, null, onlyStatements);
    }

    /**
     * Creates a new instance of the SqlEngineLoader from the properties repository (which is in fact a collection of
     * the META SQL statements, mapping rules and optional features. During the instance construction all the statements
     * are parsed and the collection of named SQL Engine instances is established. Later these instances are used for
     * the SQL queries/statements execution. For the purpose of the META types construction (located inside the META SQL
     * statements and mapping rules) a factory instance has to be supplied. Every instance of the SQL Engine is
     * accompanied with the SQL Monitor for the runtime statistics gathering. For the creation of these monitors the SQL
     * Monitor Factory can be used.
     * 
     * @param props
     *            the collection of META SQL statements, mapping rules and optional features
     * @param typeFactory
     *            the factory for the META types construction
     * @param filter
     *            the properties name prefix to filter the META SQL statements, mapping rules and optional features
     * @param monitorFactory
     *            the monitor factory used in the process of the SQL Monitor instances creation
     * @param customTypes
     *            the custom META types
     * @param onlyStatements
     *            only statements and rules with the names in this set are picked up from the properties repository
     * @throws SqlEngineException
     *             mainly in the case the provided statements or rules are not compliant with the ANTLR based grammar
     */
    public SqlEngineLoader(Properties props, SqlTypeFactory typeFactory, String filter,
            SqlMonitorFactory monitorFactory, List<SqlInternalType> customTypes, String... onlyStatements)
            throws SqlEngineException {
        if (logger.isTraceEnabled()) {
            logger.trace(">> SqlEngineLoader, props=" + props + ", typeFactory=" + typeFactory + ", monitorFactory="
                    + monitorFactory + ", filter=" + filter + ", customTypes=" + customTypes + ", onlyStatements="
                    + onlyStatements);
        }

        if (props == null)
            throw new SqlEngineException("Missing SQL META queries");
        if (typeFactory == null)
            throw new SqlEngineException("Missing META types factory");

        this.composedTypeFactory = new SqlComposedTypeFactory(typeFactory, customTypes);

        try {
            Set<String> setSelectQueries = (onlyStatements != null && onlyStatements.length > 0) ? new HashSet<String>(
                    Arrays.asList(onlyStatements)) : null;

            String filterPrefix = (filter != null) ? filter.toUpperCase() : null;
            if (filterPrefix != null && !filterPrefix.endsWith("_"))
                filterPrefix = filterPrefix + "_";
            if (filterPrefix != null
                    && (filterPrefix.equals(QUERY_PREFIX) || filterPrefix.equals(CRUD_PREFIX)
                            || filterPrefix.equals(CALL_PREFIX) || filterPrefix.equals(OUTPUT_MAPPING_PREFIX)
                            || filterPrefix.equals(INPUT_MAPPING_PREFIX) || filterPrefix.equals(SET_PREFIX)))
                filterPrefix = null;
            int filterPrefixLength = (filterPrefix != null) ? filterPrefix.length() : 0;

            String fullPrefix = filterPrefix != null ? filterPrefix + "DEFAULT_" : null;
            int fullPrefixLength = fullPrefix != null ? fullPrefix.length() : 0;
            String shortPrefix = "DEFAULT_";
            int shortPrefixLength = shortPrefix.length();
            for (Field f : SqlFeature.class.getDeclaredFields()) {
                if (fullPrefix != null) {
                    if (f.getName().startsWith(fullPrefix)) {
                        String featureName = f.getName().substring(fullPrefixLength);
                        if (features.get(featureName) == null) {
                            try {
                                features.put(featureName, f.get(null));
                            } catch (IllegalArgumentException e) {
                            } catch (IllegalAccessException e) {
                            }
                        }
                    }
                }
                if (f.getName().startsWith(shortPrefix)) {
                    String featureName = f.getName().substring(shortPrefixLength);
                    if (features.get(featureName) == null) {
                        try {
                            features.put(featureName, f.get(null));
                        } catch (IllegalArgumentException e) {
                        } catch (IllegalAccessException e) {
                        }
                    }
                }
            }

            StringBuilder errors = new StringBuilder();

            Map<String, String> mapAll = new HashMap<String, String>();
            // TODO - control duplicate statements, not finished

            for (Entry<Object, Object> entry : props.entrySet()) {
                String key = ((String) entry.getKey()).toUpperCase();
                String value = (String) entry.getValue();
                String name = null;
                boolean keyWithFilterPrefix = false;

                if (filterPrefix != null && key.startsWith(filterPrefix)) {
                    key = key.substring(filterPrefixLength);
                    keyWithFilterPrefix = true;
                }

                if (key.startsWith(QUERY_PREFIX)) {
                    name = key.substring(lQUERY_PREFIX);
                    if (setSelectQueries == null || setSelectQueries.contains(name)) {
                        if (mapAll.containsKey(key)) {
                            errors.append("Duplicate QRY: ").append(key).append("\n");
                        } else if (!sqls.containsKey(name) || keyWithFilterPrefix) {
                            sqls.put(name, value);
                        }
                    }
                } else if (key.startsWith(CRUD_PREFIX)) {
                    name = key.substring(lCRUD_PREFIX);
                    if (setSelectQueries == null || setSelectQueries.contains(name)) {
                        if (mapAll.containsKey(key)) {
                            errors.append("Duplicate CRUD: ").append(key).append("\n");
                        } else if (!cruds.containsKey(name) || keyWithFilterPrefix) {
                            cruds.put(name, value);
                        }
                    }
                } else if (key.startsWith(CALL_PREFIX)) {
                    name = key.substring(lCALL_PREFIX);
                    if (setSelectQueries == null || setSelectQueries.contains(name)) {
                        if (mapAll.containsKey(key)) {
                            errors.append("Duplicate CALL: ").append(key).append("\n");
                        } else if (!calls.containsKey(name) || keyWithFilterPrefix) {
                            calls.put(name, value);
                        }
                    }
                } else if (key.startsWith(OUTPUT_MAPPING_PREFIX)) {
                    name = key.substring(lOUTPUT_MAPPING_PREFIX);
                    if (setSelectQueries == null || setSelectQueries.contains(name)) {
                        if (mapAll.containsKey(key)) {
                            errors.append("Duplicate OUT: ").append(key).append("\n");
                        } else if (!fields.containsKey(name) || keyWithFilterPrefix) {
                            fields.put(name, value);
                        }
                    }
                } else if (key.startsWith(SET_PREFIX)) {
                    name = key.substring(lSET_PREFIX);
                    if ("true".equalsIgnoreCase(value))
                        features.put(name, Boolean.TRUE);
                    else if ("false".equalsIgnoreCase(value))
                        features.put(name, Boolean.FALSE);
                    else
                        features.put(name, value);
                } else {
                    // ignore the rest
                    continue;
                }
            }

            for (String name : fields.keySet()) {
                if (!sqls.containsKey(name) && !calls.containsKey(name))
                    errors.append("For the OUT/FIELDS there's no QRY: ").append(name).append("\n");
            }

            if (errors.length() > 0)
                throw new SqlEngineException(errors.toString());

            for (String name : sqls.keySet()) {
                SqlMetaStatement stmt = null;
                try {
                    stmt = SqlMetaStatement.getInstance(sqls.get(name), this.composedTypeFactory);
                } catch (SqlEngineException see) {
                    errors.append(name + ":" + see.getMessage());
                    continue;
                }
                SqlMappingRule mapping = null;
                if (!stmt.isHasOutputMapping() && !fields.containsKey(name)) {
                    errors.append("For the QRY there's no OUT: ").append(name).append("\n");
                } else if (fields.containsKey(name)) {
                    try {
                        String sMapping = fields.get(name).trim();
                        if (sMapping.startsWith(FIELDS_REFERENCE)) {
                            String sRealMapping = props.getProperty(sMapping.substring(lFIELDS_REFERENCE).trim());
                            if (sRealMapping == null)
                                errors.append("For IN/OUT doesn't exist reference: ").append(name).append("->")
                                        .append(sMapping).append("\n");
                            else
                                mapping = SqlMappingRule.getInstance(sRealMapping, this.composedTypeFactory);
                        } else if (!sMapping.isEmpty()) {
                            mapping = SqlMappingRule.getInstance(sMapping, this.composedTypeFactory);
                        } else {
                            mapping = new SqlMappingRule();
                        }
                    } catch (SqlEngineException see) {
                        errors.append(see.getMessage());
                    }
                }
                SqlMonitor monitor = (monitorFactory != null) ? monitorFactory.getSqlMonitor(name, features) : null;
                if (stmt != null) {
                    engines.put(name, new SqlQueryEngine(name, stmt, mapping, monitor, features,
                            this.composedTypeFactory));
                }
            }

            for (String name : cruds.keySet()) {
                SqlMetaStatement stmt = null;
                try {
                    stmt = SqlMetaStatement.getInstance(cruds.get(name), this.composedTypeFactory);
                } catch (SqlEngineException see) {
                    errors.append(see.getMessage());
                    continue;
                }
                SqlMonitor monitor = (monitorFactory != null) ? monitorFactory.getSqlMonitor(name, features) : null;
                if (stmt != null) {
                    engines.put(name, new SqlCrudEngine(name, stmt, monitor, features, this.composedTypeFactory));
                }
            }

            for (String name : calls.keySet()) {
                SqlMetaStatement stmt = null;
                try {
                    stmt = SqlMetaStatement.getInstance(calls.get(name), this.composedTypeFactory);
                } catch (SqlEngineException see) {
                    errors.append(name + ":" + see.getMessage());
                    continue;
                }
                SqlMappingRule mapping = null;
                if (fields.containsKey(name)) {
                    try {
                        String sMapping = fields.get(name).trim();
                        if (sMapping.startsWith(FIELDS_REFERENCE)) {
                            String sRealMapping = props.getProperty(sMapping.substring(lFIELDS_REFERENCE).trim());
                            if (sRealMapping == null)
                                errors.append("For IN/OUT doesn't exist reference: ").append(name).append("->")
                                        .append(sMapping).append("\n");
                            else
                                mapping = SqlMappingRule.getInstance(sRealMapping, this.composedTypeFactory);
                        } else if (!sMapping.isEmpty()) {
                            mapping = SqlMappingRule.getInstance(sMapping, this.composedTypeFactory);
                        } else {
                            mapping = new SqlMappingRule();
                        }
                    } catch (SqlEngineException see) {
                        errors.append(see.getMessage());
                    }
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
                logger.debug("<< SqlEngineLoader, engines=" + engines + ", sqls=" + sqls + ", cruds=" + cruds
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
     * Returns the named META SQL query/statement.
     * 
     * @param name
     *            the name of the required META SQL query/statement
     * @return the META SQL query/statement
     */
    public String getMetaSql(String name) {
        return sqls.get(name);
    }

    /**
     * Returns the named mapping rule.
     * 
     * @param name
     *            the name of the required mapping rule
     * @return the mapping rule
     */
    public String getMappingRule(String name) {
        return fields.get(name);
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
