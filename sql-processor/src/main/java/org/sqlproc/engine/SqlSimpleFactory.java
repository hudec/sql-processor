package org.sqlproc.engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.sqlproc.engine.jdbc.JdbcEngineFactory;
import org.sqlproc.engine.type.SqlInternalType;
import org.sqlproc.engine.type.SqlTypeFactory;

/**
 * The simple implementation of the {@link SqlEngineFactory}.
 * 
 * <p>
 * It's suitable mainly for the Spring DI based configuration, like the next one:<br>
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
 *   &lt;bean id="sqlFactory" class="org.sqlproc.engine.SqlSimpleFactory" init-method="init"&gt;
 *     &lt;property name="metaProps" ref="sqlQueries" /&gt;
 *     &lt;property name="typeFactory" ref="typeFactory" /&gt;
 *   &lt;/bean&gt;
 * &lt;/beans&gt;
 * </pre>
 * 
 * and use the next code to obtain an instance of the SQL Query engine
 * 
 * <pre>
 * SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine(&quot;ALL&quot;);
 * </pre>
 * 
 * or the next code to obtain an instance of the SQL CRUD engine
 * 
 * <pre>
 * SqlCrudEngine sqlEngine = sqlFactory.getCrudEngine(&quot;ALL&quot;);
 * </pre>
 * <p>
 * In the case the SQL Processor runs on the top of the JDBC stack, there's more suitable {@link JdbcEngineFactory}.
 * <p>
 * For more info please see the Reference Guide or the <a
 * href="http://code.google.com/p/sql-processor/w/list">tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlSimpleFactory implements SqlEngineFactory {

    /**
     * Default value for {@link SqlSimpleFactory#metaPropsName}.
     */
    protected static final String DEFAULT_META_PROPS_NAME = "queries.properties";
    /**
     * The name of file, which holds a collection of META SQL statements, mapping rules and optional features.
     */
    private String metaPropsName;
    /**
     * The collection of META SQL statements, mapping rules and optional features.
     */
    private Properties metaProps;
    /**
     * The factory for the META types construction.
     */
    private SqlTypeFactory typeFactory;
    /**
     * The properties name prefix to filter the META SQL statements, mapping rules and optional features.
     */
    private String filter;
    /**
     * The monitor factory used in the process of the SQL Monitor instances creation.
     */
    private SqlMonitorFactory monitorFactory;
    /**
     * The custom META types.
     */
    private List<SqlInternalType> customTypes;
    /**
     * Only statements and rules with the names in this set are picked up from the properties repository.
     */
    private String[] selectQueries;
    /**
     * The indicator the JDBC stack is used.
     */
    private boolean jdbc;
    /**
     * The helper class for the META SQL statements and mapping rules parsing.
     */
    private SqlEngineLoader loader;

    /**
     * Creates a new instance with no default values.
     */
    public SqlSimpleFactory() {
    }

    /**
     * Dynamic init, called mainly from the Spring configuration initialization.
     */
    synchronized public void init() {
        if (loader == null) {
            Properties metaProperties = metaProps;
            if (metaProperties == null) {
                SqlPropertiesLoader loader = new SqlPropertiesLoader(metaPropsName != null ? metaPropsName
                        : DEFAULT_META_PROPS_NAME, this.getClass());
                metaProperties = loader.getProperties();
            }
            if (jdbc)
                metaProperties.setProperty("SET_" + SqlFeature.JDBC, "true");
            loader = new SqlEngineLoader(metaProperties, typeFactory, filter, monitorFactory, customTypes,
                    selectQueries);
            metaProps = metaProperties;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQueryEngine getQueryEngine(String name) {
        if (loader == null) {
            init();
        }
        return loader.getQueryEngine(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlCrudEngine getCrudEngine(String name) {
        if (loader == null) {
            init();
        }
        return loader.getCrudEngine(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlProcedureEngine getProcedureEngine(String name) {
        if (loader == null) {
            init();
        }
        return loader.getProcedureEngine(name);
    }

    /**
     * Returns the name of file, which holds a collection of META SQL statements, mapping rules and optional features.
     * 
     * @return the name of file, which holds a collection of META SQL statements, mapping rules and optional features
     */
    public String getMetaPropsName() {
        return metaPropsName;
    }

    /**
     * Sets the name of file, which holds a collection of META SQL statements, mapping rules and optional features.
     * 
     * @param propsName
     *            the name of file, which holds a collection of META SQL statements, mapping rules and optional features
     */
    public void setMetaPropsName(String propsName) {
        this.metaPropsName = propsName;
    }

    /**
     * Returns the collection of META SQL statements, mapping rules and optional features.
     * 
     * @return the collection of META SQL statements, mapping rules and optional features
     */
    public Properties getMetaProps() {
        return metaProps;
    }

    /**
     * Sets the collection of META SQL statements, mapping rules and optional features.
     * 
     * @param props
     *            the collection of META SQL statements, mapping rules and optional features
     */
    public void setMetaProps(Properties props) {
        this.metaProps = props;
    }

    /**
     * Returns the factory for the META types construction.
     * 
     * @return the factory for the META types construction
     */
    public SqlTypeFactory getTypeFactory() {
        return typeFactory;
    }

    /**
     * Sets the factory for the META types construction.
     * 
     * @param typeFactory
     *            the factory for the META types construction
     */
    public void setTypeFactory(SqlTypeFactory typeFactory) {
        this.typeFactory = typeFactory;
    }

    /**
     * Returns the properties name prefix to filter the META SQL statements, mapping rules and optional features.
     * 
     * @return the properties name prefix to filter the META SQL statements, mapping rules and optional features
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Sets the properties name prefix to filter the META SQL statements, mapping rules and optional features.
     * 
     * @param filter
     *            the properties name prefix to filter the META SQL statements, mapping rules and optional features
     */
    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * Returns the monitor factory used in the process of the SQL Monitor instances creation.
     * 
     * @return the monitor factory used in the process of the SQL Monitor instances creation
     */
    public SqlMonitorFactory getMonitorFactory() {
        return monitorFactory;
    }

    /**
     * Sets the monitor factory used in the process of the SQL Monitor instances creation.
     * 
     * @param monitorFactory
     *            the monitor factory used in the process of the SQL Monitor instances creation
     */
    public void setMonitorFactory(SqlMonitorFactory monitorFactory) {
        this.monitorFactory = monitorFactory;
    }

    /**
     * Returns the custom META types.
     * 
     * @return the custom META types
     */
    public List<SqlInternalType> getCustomTypes() {
        return customTypes;
    }

    /**
     * Sets the custom META types.
     * 
     * @param customTypes
     *            the custom META types
     */
    public void setCustomTypes(List<SqlInternalType> customTypes) {
        this.customTypes = customTypes;
    }

    /**
     * Adds a new custom META types.
     * 
     * @param customType
     *            the custom META type
     */
    public void addCustomType(SqlInternalType customType) {
        if (customTypes == null)
            customTypes = new ArrayList<SqlInternalType>();
        customTypes.add(customType);
    }

    /**
     * Returns the only statements and rules, which are picked up from the properties repository.
     * 
     * @return the only statements and rules, which are picked up from the properties repository
     */
    public String[] getSelectQueries() {
        return selectQueries;
    }

    /**
     * Sets the only statements and rules, which are picked up from the properties repository.
     * 
     * @param selectQueries
     *            the only statements and rules, which are picked up from the properties repository
     */
    public void setSelectQueries(String[] selectQueries) {
        if (selectQueries != null)
            this.selectQueries = Arrays.copyOf(selectQueries, selectQueries.length);
        else
            this.selectQueries = null;
    }

    /**
     * Return the indicator the JDBC stack is used.
     * 
     * @return the indicator the JDBC stack is used
     */
    public boolean isJdbc() {
        return jdbc;
    }

    /**
     * Sets the indicator the JDBC stack is used.
     * 
     * @param jdbc
     *            the indicator the JDBC stack is used
     */
    public void setJdbc(boolean jdbc) {
        this.jdbc = jdbc;
    }

    /**
     * Returns the internal SQL Engine loader.
     * 
     * @return the internal SQL Engine loader
     */
    public SqlEngineLoader getLoader() {
        return loader;
    }
}
