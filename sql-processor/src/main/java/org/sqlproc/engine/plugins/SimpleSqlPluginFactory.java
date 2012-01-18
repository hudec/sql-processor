package org.sqlproc.engine.plugins;

public class SimpleSqlPluginFactory implements SqlPluginFactory {

    /**
     * The private static instance of this factory.
     */
    private static SqlPluginFactory factory = new SimpleSqlPluginFactory();

    private DefaultSqlPlugins defaultSqlPlugins;

    private IsTruePlugin isTruePlugin;

    private IsEmptyPlugin isEmptyPlugin;

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

    @Override
    public IsEmptyPlugin getIsEmptyPlugin() {
        return (isEmptyPlugin != null) ? isEmptyPlugin : defaultSqlPlugins;
    }

    @Override
    public IsTruePlugin getIsTruePlugin() {
        return (isTruePlugin != null) ? isTruePlugin : defaultSqlPlugins;
    }

    public void setIsTruePlugin(IsTruePlugin isTruePlugin) {
        this.isTruePlugin = isTruePlugin;
    }

    public void setIsEmptyPlugin(IsEmptyPlugin isEmptyPlugin) {
        this.isEmptyPlugin = isEmptyPlugin;
    }
}
