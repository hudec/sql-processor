package org.sqlproc.engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.sqlproc.engine.jdbc.JdbcEngineFactory;
import org.sqlproc.engine.type.SqlInternalType;
import org.sqlproc.engine.type.SqlTypeFactory;

/**
 * The simple implementation of the {@link SqlEngineFactory}.
 * 
 * <p>
 * It's suitable mainly for the Spring DI based configuration, like the next one for the new loader
 * {@link SqlProcessorLoader}:<br>
 * 
 * <pre>
 * &lt;beans ...&gt;
 *   ...
 *   &lt;bean id="typeFactory" class="org.sqlproc.engine.jdbc.type.JdbcTypeFactory" factory-method="getInstance" /&gt;
 * 
 *   &lt;bean id="sqlFactory" class="org.sqlproc.engine.SqlSimpleFactory" init-method="init"&gt;
 *     <property name="metaFilesNames">
 *       <list>
 *         <value>statements.qry</value>
 *       </list>
 *     </property>
 *     &lt;property name="typeFactory" ref="typeFactory" /&gt;
 *   &lt;/bean&gt;
 * &lt;/beans&gt;
 * </pre>
 * 
 * or like the next one for the old loader {@link SqlEngineLoader}:<br>
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
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlSimpleFactory implements SqlEngineFactory {

    /**
     * The platform based line separator.
     */
    private static final String LINESEP = System.getProperty("line.separator");
    /**
     * Default value for {@link SqlSimpleFactory#metaPropsNames}.
     */
    protected static final String DEFAULT_META_PROPS_NAME = "queries.properties";
    /**
     * The names of property files, which hold a collection of the SQL Processor artifacts (META SQL statements, mapping
     * rules and optional features).
     */
    private List<String> metaPropsNames = new ArrayList<String>();
    /**
     * The names of files, which hold a collection of the SQL Processor artifacts (META SQL statements, mapping rules
     * and optional features).
     */
    private List<String> metaFilesNames = new ArrayList<String>();
    /**
     * The collection of all SQL Processor artifacts (META SQL statements, mapping rules and optional features).
     */
    private Properties metaProps;
    /**
     * The String representation of all SQL Processor artifacts (META SQL statements, mapping rules and optional
     * features).
     */
    private StringBuilder metaStatements;
    /**
     * The factory for the META types construction.
     */
    private SqlTypeFactory typeFactory;
    /**
     * The name of the filter to filter the META SQL statements, mapping rules and optional features.
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
    private String[] onlyStatements;
    /**
     * The indicator the JDBC stack is used.
     */
    private boolean jdbc;
    /**
     * The helper class for the META SQL statements and mapping rules parsing. All artifacts are loaded from properties.
     */
    private SqlEngineLoader loader;
    /**
     * The helper class for the META SQL statements and mapping rules parsing. All artifacts are loaded from new grammar
     * based files.
     */
    private SqlProcessorLoader processorLoader;

    /**
     * Creates a new instance with no default values.
     */
    public SqlSimpleFactory() {
    }

    /**
     * Dynamic initialization, called mainly from the Spring configuration initialization.
     */
    synchronized public void init() {
        if (loader == null && processorLoader == null) {
            synchronized (this) {
                if (loader == null && processorLoader == null) {
                    if (metaStatements != null || (metaFilesNames != null && !metaFilesNames.isEmpty())) {
                        if (metaStatements == null) {
                            metaStatements = SqlFilesLoader.getStatements(this.getClass(),
                                    metaFilesNames.toArray(new String[0]));
                        }
                        if (jdbc)
                            metaStatements.append(LINESEP).append("JDBC(BOPT)=true;");

                        processorLoader = new SqlProcessorLoader(metaStatements, typeFactory, filter, monitorFactory,
                                customTypes, onlyStatements);
                    } else {
                        Properties metaProperties = metaProps;
                        if (metaProperties == null) {
                            SqlPropertiesLoader loader;
                            if (metaPropsNames != null && !metaPropsNames.isEmpty())
                                loader = new SqlPropertiesLoader(metaPropsNames, this.getClass());
                            else
                                loader = new SqlPropertiesLoader(DEFAULT_META_PROPS_NAME, this.getClass());
                            metaProperties = loader.getProperties();
                        }
                        if (jdbc)
                            metaProperties.setProperty("SET_" + SqlFeature.JDBC, "true");
                        loader = new SqlEngineLoader(metaProperties, typeFactory, filter, monitorFactory, customTypes,
                                onlyStatements);
                        metaProps = metaProperties;
                    }
                }
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlQueryEngine getQueryEngine(String name) {
        if (getLoader() == null) {
            init();
        }
        return getLoader().getQueryEngine(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlCrudEngine getCrudEngine(String name) {
        if (getLoader() == null) {
            init();
        }
        return getLoader().getCrudEngine(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlProcedureEngine getProcedureEngine(String name) {
        if (getLoader() == null) {
            init();
        }
        return getLoader().getProcedureEngine(name);
    }

    /**
     * Returns the names of property files, which holds a collection of META SQL statements, mapping rules and optional
     * features.
     * 
     * @return the names of property files, which holds a collection of META SQL statements, mapping rules and optional
     *         features
     */
    public List<String> getMetaPropsNames() {
        return metaPropsNames;
    }

    /**
     * Sets the names of property files, which holds a collection of META SQL statements, mapping rules and optional
     * features.
     * 
     * @param propsNames
     *            the names of property files, which holds a collection of META SQL statements, mapping rules and
     *            optional features
     */
    public void setMetaPropsNames(List<String> propsNames) {
        this.metaPropsNames = propsNames;
    }

    /**
     * Sets the names of property files, which holds a collection of META SQL statements, mapping rules and optional
     * features.
     * 
     * @param propsNames
     *            the names of property files, which holds a collection of META SQL statements, mapping rules and
     *            optional features
     */
    public void setMetaPropsNames(String... propsNames) {
        this.metaPropsNames = new ArrayList<String>();
        Collections.addAll(metaPropsNames, propsNames);
    }

    /**
     * Returns the names of files, which holds a collection of META SQL statements, mapping rules and optional features.
     * 
     * @return the names of files, which holds a collection of META SQL statements, mapping rules and optional features
     */
    public List<String> getMetaFilesNames() {
        return metaFilesNames;
    }

    /**
     * Sets the names of files, which holds a collection of META SQL statements, mapping rules and optional features.
     * 
     * @param metaFilesNames
     *            the names of files, which holds a collection of META SQL statements, mapping rules and optional
     *            features
     */
    public void setMetaFilesNames(List<String> metaFilesNames) {
        this.metaFilesNames = metaFilesNames;
    }

    /**
     * Sets the names of files, which holds a collection of META SQL statements, mapping rules and optional features.
     * 
     * @param metaFilesNames
     *            the names of files, which holds a collection of META SQL statements, mapping rules and optional
     *            features
     */
    public void setMetaFilesNames(String... metaFilesNames) {
        this.metaFilesNames = new ArrayList<String>();
        Collections.addAll(this.metaFilesNames, metaFilesNames);
    }

    /**
     * Returns the collection of the META SQL statements, mapping rules and optional features.
     * 
     * @return the collection of the META SQL statements, mapping rules and optional features
     */
    public Properties getMetaProps() {
        return metaProps;
    }

    /**
     * Sets the collection of the META SQL statements, mapping rules and optional features.
     * 
     * @param props
     *            the collection of the META SQL statements, mapping rules and optional features
     */
    public void setMetaProps(Properties props) {
        this.metaProps = props;
    }

    /**
     * Returns the String representation of the META SQL statements, mapping rules and optional features.
     * 
     * @return the String representation of the META SQL statements, mapping rules and optional features
     */
    public StringBuilder getMetaStatements() {
        return metaStatements;
    }

    /**
     * Sets the String representation of the META SQL statements, mapping rules and optional features.
     * 
     * @param metaStatements
     *            the String representation of the META SQL statements, mapping rules and optional features
     */
    public void setMetaStatements(StringBuilder metaStatements) {
        this.metaStatements = metaStatements;
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
     * Returns the name of the filter to filter the META SQL statements, mapping rules and optional features.
     * 
     * @return the name of the filter to filter the META SQL statements, mapping rules and optional features
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Sets the name of the filter to filter the META SQL statements, mapping rules and optional features.
     * 
     * @param filter
     *            the name of the filter to filter the META SQL statements, mapping rules and optional features
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
     * Sets the custom META types.
     * 
     * @param customTypes
     *            the custom META types
     */
    public void setCustomTypes(SqlInternalType... customTypes) {
        this.customTypes = new ArrayList<SqlInternalType>();
        Collections.addAll(this.customTypes, customTypes);
    }

    /**
     * Adds a new custom META type.
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
    public String[] getOnlyStatements() {
        return onlyStatements;
    }

    /**
     * Sets the only statements and rules, which are picked up from the properties repository.
     * 
     * @param selectQueries
     *            the only statements and rules, which are picked up from the properties repository
     */
    public void setOnlyStatements(String[] selectQueries) {
        if (selectQueries != null)
            this.onlyStatements = Arrays.copyOf(selectQueries, selectQueries.length);
        else
            this.onlyStatements = null;
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
     * Returns the internal SQL engine or processor loader.
     * 
     * @return the internal SQL engine or processor loader
     */
    public SqlEngineFactory getLoader() {
        if (loader != null)
            return loader;
        else
            return processorLoader;
    }
}
