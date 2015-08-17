package org.sqlproc.engine;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.config.SqlEngineConfiguration;
import org.sqlproc.engine.impl.SqlEmptyMonitor;
import org.sqlproc.engine.impl.SqlMappingRule;
import org.sqlproc.engine.impl.SqlMetaStatement;
import org.sqlproc.engine.impl.SqlMetaStatement.Type;
import org.sqlproc.engine.impl.SqlProcessResult;
import org.sqlproc.engine.impl.SqlUtils;
import org.sqlproc.engine.plugin.SimpleSqlPluginFactory;
import org.sqlproc.engine.plugin.SqlPluginFactory;
import org.sqlproc.engine.type.SqlTypeFactory;
import org.sqlproc.engine.validation.SqlValidator;

/**
 * Common ancestor for {@link SqlQueryEngine}, {@link SqlCrudEngine} and {@link SqlProcedureEngine}.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlEngine {

    /**
     * The internal slf4j logger.
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Name of the META SQL query or statement, which uniquely identifies this instance.
     */
    protected String name;

    /**
     * The pre-compiled META SQL query or statement. The META SQL is an ANSI SQL extension using the ANTLR defined
     * grammar.
     */
    protected SqlMetaStatement statement;

    /**
     * The pre-compiled mapping rule, which is an SQL execution result to Java output classes mapping prescription.
     */
    protected SqlMappingRule mapping;

    /**
     * Configuration of the SQL Processor using map of features. Optional features can alter the SQL Processor runtime
     * behavior.
     */
    protected Map<String, Object> features = new HashMap<String, Object>();

    /**
     * Monitor for the runtime statistics gathering.
     */
    protected SqlMonitor monitor;

    /**
     * The injected validator. It validates dynamic input values.
     */
    protected SqlValidator validator;

    /**
     * The factory for the META types construction. The META type defines the mapping between a Java class type and a
     * JDBC datatype. For the default META type factory, please see {@link org.sqlproc.engine.jdbc.type.JdbcTypeFactory}
     * .
     */
    protected SqlTypeFactory typeFactory;

    /**
     * The factory for the SQL Processor plugins. This is the basic facility to alter the SQL Processor processing.
     */
    protected SqlPluginFactory pluginFactory;

    /**
     * The processing cache used for {@link SqlProcessResult} instances.
     */
    protected Map<String, SqlProcessResult> processingCache = new ConcurrentHashMap<String, SqlProcessResult>();
    /**
     * The overall configuration, which can be persisted.
     */
    private SqlEngineConfiguration configuration;

    /**
     * Creates a new instance of the SqlEngine from one META SQL statement and one SQL Mapping rule instance. Both
     * parameters are already pre-compiled instances using the ANTLR parsers. This is the recommended usage for the
     * runtime performance optimization. This constructor is devoted to be used from the {@link SqlProcessorLoader},
     * which is able to read all statements definitions from an external meta statements file and create the named
     * SqlEngine instances. Also an external SQL Monitor for the runtime statistics gathering can be engaged.
     * 
     * @param name
     *            the name of this SQL Engine instance
     * @param statement
     *            the pre-compiled META SQL statement
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
    public SqlEngine(String name, SqlMetaStatement statement, SqlMappingRule mapping, SqlMonitor monitor,
            Map<String, Object> features, SqlTypeFactory typeFactory, SqlPluginFactory pluginFactory,
            SqlEngineConfiguration configuration) {
        this.name = name;
        this.statement = statement;
        this.mapping = mapping;
        if (features != null) {
            for (Entry<String, Object> feature : features.entrySet())
                setFeature(feature.getKey(), feature.getValue());
        }
        this.monitor = (monitor != null) ? monitor : new SqlEmptyMonitor();
        this.typeFactory = typeFactory;
        this.pluginFactory = (pluginFactory != null) ? pluginFactory : SimpleSqlPluginFactory.getInstance();
        this.configuration = configuration;
    }

    /**
     * Injects a validator. It validates dynamic input values.
     * 
     * @param validator
     *            a generir validator instance
     */
    public void setValidator(SqlValidator validator) {
        this.validator = validator;
    }

    /**
     * Sets the optional feature in the stament's or global scope.
     * 
     * @param name
     *            the name of the optional feature
     * @param value
     *            the value of the optional feature
     */
    public void setFeature(String name, Object value) {
        features.put(name, value);
        unsetFeatures(SqlUtils.oppositeFeatures(name));
    }

    /**
     * Clears the optional features in the stament's or global scope.
     * 
     * @param names
     *            the names of the optional features
     */
    public void unsetFeatures(Set<String> names) {
        if (names != null) {
            for (String name : names)
                features.remove(name);
        }
    }

    /**
     * The helper to prevent the NPE
     * 
     * @param sqlControl
     *            the compound parameters controlling the META SQL execution
     * @return the object used for the SQL statement static input values
     */
    public static Object getStaticInputValues(SqlControl sqlControl) {
        if (sqlControl == null)
            return null;
        else
            return sqlControl.getStaticInputValues();
    }

    /**
     * The helper to prevent the NPE
     * 
     * @param sqlControl
     *            the compound parameters controlling the META SQL execution
     * @return the max SQL execution time
     */
    public static Integer getMaxTimeout(SqlControl sqlControl) {
        if (sqlControl == null)
            return null;
        else
            return sqlControl.getMaxTimeout();
    }

    /**
     * The helper to prevent the NPE
     * 
     * @param sqlControl
     *            the compound parameters controlling the META SQL execution
     * @return the first SQL execution output row
     */
    public static Integer getFirstResult(SqlControl sqlControl) {
        if (sqlControl == null)
            return null;
        else
            return sqlControl.getFirstResult();
    }

    /**
     * The helper to prevent the NPE
     * 
     * @param sqlControl
     *            the compound parameters controlling the META SQL execution
     * @return the max number of SQL execution output rows
     */
    public static Integer getMaxResults(SqlControl sqlControl) {
        if (sqlControl == null)
            return null;
        else
            return sqlControl.getMaxResults();
    }

    /**
     * The helper to prevent the NPE
     * 
     * @param sqlControl
     *            the compound parameters controlling the META SQL execution
     * @return the ordering directive list
     */
    public static SqlOrder getOrder(SqlControl sqlControl) {
        if (sqlControl == null || sqlControl.getOrder() == null)
            return SqlQueryEngine.NO_ORDER;
        else
            return sqlControl.getOrder();
    }

    /**
     * The helper to prevent the NPE
     * 
     * @param sqlControl
     *            the compound parameters controlling the META SQL execution
     * @return more result classes used for the return values
     */
    public static Map<String, Class<?>> getMoreResultClasses(SqlControl sqlControl) {
        if (sqlControl == null)
            return null;
        else
            return sqlControl.getMoreResultClasses();
    }

    /**
     * The helper to prevent the NPE
     * 
     * @param sqlControl
     *            the compound parameters controlling the META SQL execution
     * @return the optiona features
     */
    public static Map<String, Object> getFeatures(SqlControl sqlControl) {
        if (sqlControl == null)
            return null;
        else
            return sqlControl.getFeatures();
    }

    /**
     * The helper to prevent the NPE
     * 
     * @param sqlControl
     *            the compound parameters controlling the META SQL execution
     * @return the unique ID of the executed statement based on the input values combination
     */
    public static String getProcessingId(SqlControl sqlControl) {
        if (sqlControl == null)
            return null;
        else
            return sqlControl.getProcessingId();
    }

    /**
     * The helper to prevent the NPE
     *
     * @param sqlControl
     *            the compound parameters controlling the META SQL execution
     * @return the fetch size of SQL statement
     */
    public static Integer getFetchSize(SqlControl sqlControl) {
        if (sqlControl == null)
            return null;
        else
            return sqlControl.getFetchSize();
    }

    /**
     * Check the input parameters.
     * 
     * @param dynamicInputValues
     *            The object used for the SQL statement dynamic input values. The class of this object is also named as
     *            the input class or the dynamic parameters class. The exact class type isn't important, all the
     *            parameters settled into the SQL prepared statement are picked up using the reflection API.
     * @throws InvalidParameterException
     *             in the case the incorrect classes used for dynamic input values
     */
    void checkDynamicInputValues(final Object dynamicInputValues) {
        if (dynamicInputValues == null)
            return;
        if (dynamicInputValues instanceof SqlOrder)
            throw new InvalidParameterException("SqlOrder used as dynamic input values");
        if (dynamicInputValues instanceof SqlControl)
            throw new InvalidParameterException("SqlControl used as dynamic input values");
    }

    /**
     * Check the input parameters.
     * 
     * @param staticInputValues
     *            The object used for the SQL statement static input values. The class of this object is also named as
     *            the input class or the static parameters class. The exact class type isn't important, all the
     *            parameters injected into the SQL query command are picked up using the reflection API. Compared to
     *            dynamicInputValues input parameters, parameters in this class should't be produced by an end user to
     *            prevent SQL injection threat!
     * @throws InvalidParameterException
     *             in the case the incorrect classes used for static input values
     */
    void checkStaticInputValues(final Object staticInputValues) {
        if (staticInputValues == null)
            return;
        if (staticInputValues instanceof SqlOrder)
            throw new InvalidParameterException("SqlOrder used as static input values");
        if (staticInputValues instanceof SqlControl)
            throw new InvalidParameterException("SqlControl used as static input values");
    }

    /**
     * Returns the optional features, which can alter the SQL Processor runtime behavior.
     * 
     * @return the optional features, which can alter the SQL Processor runtime behavior
     */
    public Map<String, Object> getFeatures() {
        return features;
    }

    /**
     * Returns the factory for the META types construction. The META type defines the mapping between a Java class type
     * and a JDBC datatype. For the default META type factory, please see
     * {@link org.sqlproc.engine.jdbc.type.JdbcTypeFactory}
     * 
     * @return the factory for the META types construction
     */
    public SqlTypeFactory getTypeFactory() {
        return typeFactory;
    }

    /**
     * Returns the factory for the SQL Processor plugins. This is the basic facility to alter the SQL Processor
     * processing.
     * 
     * @return the factory for the SQL Processor plugins
     */
    public SqlPluginFactory getPluginFactory() {
        return pluginFactory;
    }

    /**
     * Returns the processing cache used for {@link SqlProcessResult} instances.
     * 
     * @return the processing cache used for {@link SqlProcessResult} instances.
     */
    public Map<String, SqlProcessResult> getProcessingCache() {
        return processingCache;
    }

    /**
     * Sets the processing cache used for {@link SqlProcessResult} instances.
     * 
     * @param processingCache
     *            the processing cache used for {@link SqlProcessResult} instances.
     */
    public void setProcessingCache(Map<String, SqlProcessResult> processingCache) {
        this.processingCache = processingCache;
    }

    /**
     * The main contract for a dynamic ANSI SQL Query generation.
     * 
     * The ANSI SQL Query creation is based on
     * <ul>
     * <li>META SQL
     * <li>dynamic input values
     * <li>static input values
     * <li>ordering list directive
     * <li>optional features
     * <ul>
     * 
     * @param sqlStatementType
     *            the SQL command type
     * @param dynamicInputValues
     *            the SQL statement dynamic parameters (input values)
     * @param sqlControl
     *            The compound parameters controlling the META SQL execution
     * @return the crate for ANSI SQL and other attributes, which control the SQL statement itself
     */
    protected SqlProcessResult process(Type sqlStatementType, Object dynamicInputValues, SqlControl sqlControl) {
        SqlProcessResult processResult = null;
        String processingId = null;
        if (configuration != null && configuration.getUseProcessingCache() != null
                && configuration.getUseProcessingCache()) {
            if (!configuration.getDoProcessingCacheEngines().isEmpty()) {
                if (configuration.getDoProcessingCacheEngines().contains(name))
                    processingId = getProcessingId(sqlControl);
            } else if (!configuration.getDontProcessingCacheEngines().isEmpty()) {
                if (!configuration.getDontProcessingCacheEngines().contains(name))
                    processingId = getProcessingId(sqlControl);
            } else {
                processingId = getProcessingId(sqlControl);
            }
        }
        if (processingId != null)
            processResult = processingCache.get(processingId);
        if (processResult != null) {
            return new SqlProcessResult(processResult, dynamicInputValues, sqlControl);
        }
        processResult = statement.process(sqlStatementType, dynamicInputValues, sqlControl, this);
        if (processingId != null)
            processingCache.put(processingId, processResult);
        return processResult;

    }
}