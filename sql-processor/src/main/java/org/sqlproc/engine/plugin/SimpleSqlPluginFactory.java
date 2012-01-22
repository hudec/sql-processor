package org.sqlproc.engine.plugin;

import org.sqlproc.engine.SqlProcessorLoader;

/**
 * The simple implementation of the {@link SqlPluginFactory}.
 * 
 * <p>
 * It's suitable mainly for the Spring DI based configuration, like the next one for the new loader
 * {@link SqlProcessorLoader}:<br>
 * 
 * <pre>
 * &lt;beans ...&gt;
 *   ...
 *   &lt;bean id="pluginFactory" class="org.sqlproc.engine.plugin.SimpleSqlPluginFactory" factory-method="getInstance" &gt;
 *     &lt;property name="isTruePlugin" ref="..." /&gt;
 *   &lt;/bean&gt;
 * 
 *   &lt;bean id="typeFactory" class="org.sqlproc.engine.jdbc.type.JdbcTypeFactory" factory-method="getInstance" /&gt;
 * 
 *   &lt;bean id="sqlFactory" class="org.sqlproc.engine.SqlSimpleFactory" init-method="init"&gt;
 *     &lt;property name="metaFilesNames">
 *       &lt;list>
 *         &lt;value>statements.qry&lt;/value>
 *       &lt;/list>
 *     &lt;/property>
 *     &lt;property name="pluginFactory" ref="pluginFactory" /&gt;
 *     &lt;property name="typeFactory" ref="typeFactory" /&gt;
 *   &lt;/bean&gt;
 * &lt;/beans&gt;
 * </pre>
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SimpleSqlPluginFactory implements SqlPluginFactory {

    /**
     * The private static instance of this factory.
     */
    private static SqlPluginFactory factory = new SimpleSqlPluginFactory();

    /**
     * The SQL Processor plugins standard implementation.
     */
    private DefaultSqlPlugins defaultSqlPlugins;

    /**
     * The SQL Processor plugin devoted to evaluate the boolean value of the logical expression.
     */
    private IsTruePlugin isTruePlugin;

    /**
     * The SQL Processor plugin devoted to evaluate the emptiness of the input value.
     */
    private IsEmptyPlugin isEmptyPlugin;

    /**
     * The SQL Processor plugin devoted to the COUNT SQL construction.
     */
    private SqlCountPlugin sqlCountPlugin;

    /**
     * The SQL Processor plugin devoted to the FROM-TO SQL construction.
     */
    private SqlFromToPlugin sqlFromToPlugin;

    /**
     * The SQL Processor plugin devoted to the sequence SELECT SQL construction.
     */
    private SqlSequencePlugin sqlSequencePlugin;

    /**
     * The SQL Processor plugin devoted to the identity SELECT SQL construction.
     */
    private SqlIdentityPlugin sqlIdentityPlugin;

    /**
     * The private constructor.
     */
    private SimpleSqlPluginFactory() {
        defaultSqlPlugins = new DefaultSqlPlugins();
    }

    /**
     * The main method to obtain the singleton instance of this factory.
     * 
     * @return the META types factory for the JDBC stack
     */
    public static SqlPluginFactory getInstance() {
        return factory;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IsEmptyPlugin getIsEmptyPlugin() {
        return (isEmptyPlugin != null) ? isEmptyPlugin : defaultSqlPlugins;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IsTruePlugin getIsTruePlugin() {
        return (isTruePlugin != null) ? isTruePlugin : defaultSqlPlugins;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlCountPlugin getSqlCountPlugin() {
        return (sqlCountPlugin != null) ? sqlCountPlugin : defaultSqlPlugins;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlFromToPlugin getSqlFromToPlugin() {
        return (sqlFromToPlugin != null) ? sqlFromToPlugin : defaultSqlPlugins;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSequencePlugin getSqlSequencePlugin() {
        return (sqlSequencePlugin != null) ? sqlSequencePlugin : defaultSqlPlugins;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlIdentityPlugin getSqlIdentityPlugin() {
        return (sqlIdentityPlugin != null) ? sqlIdentityPlugin : defaultSqlPlugins;
    }

    /**
     * Sets the SQL Processor plugin devoted to evaluate the boolean value of the logical expression.
     * 
     * @param isTruePlugin
     *            the SQL Processor plugin devoted to evaluate the boolean value of the logical expression
     */
    public void setIsTruePlugin(IsTruePlugin isTruePlugin) {
        this.isTruePlugin = isTruePlugin;
    }

    /**
     * Sets the SQL Processor plugin devoted to evaluate the emptiness of the input value.
     * 
     * @param isEmptyPlugin
     *            the SQL Processor plugin devoted to evaluate the emptiness of the input value
     */
    public void setIsEmptyPlugin(IsEmptyPlugin isEmptyPlugin) {
        this.isEmptyPlugin = isEmptyPlugin;
    }

    /**
     * Sets the SQL Processor plugin devoted to the COUNT SQL construction.
     * 
     * @param sqlCountPlugin
     *            the SQL Processor plugin devoted to the COUNT SQL construction
     */
    public void setSqlCountPlugin(SqlCountPlugin sqlCountPlugin) {
        this.sqlCountPlugin = sqlCountPlugin;
    }

    /**
     * Sets the SQL Processor plugin devoted to the FROM-TO SQL construction.
     * 
     * @param sqlFromToPlugin
     *            the SQL Processor plugin devoted to the FROM-TO SQL construction
     */
    public void setSqlFromToPlugin(SqlFromToPlugin sqlFromToPlugin) {
        this.sqlFromToPlugin = sqlFromToPlugin;
    }

    /**
     * Sets the SQL Processor plugin devoted to the sequence SELECT SQL construction.
     * 
     * @param sqlSequencePlugin
     *            the SQL Processor plugin devoted to the sequence SELECT SQL construction
     */
    public void setSqlSequencePlugin(SqlSequencePlugin sqlSequencePlugin) {
        this.sqlSequencePlugin = sqlSequencePlugin;
    }

    /**
     * Sets the SQL Processor plugin devoted to the identity SELECT SQL construction.
     * 
     * @param sqlIdentityPlugin
     *            the SQL Processor plugin devoted to the identity SELECT SQL construction
     */
    public void setSqlIdentityPlugin(SqlIdentityPlugin sqlIdentityPlugin) {
        this.sqlIdentityPlugin = sqlIdentityPlugin;
    }
}
