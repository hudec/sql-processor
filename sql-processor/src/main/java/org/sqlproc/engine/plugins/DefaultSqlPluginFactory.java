package org.sqlproc.engine.plugins;

public class DefaultSqlPluginFactory implements SqlPluginFactory {

    /**
     * The private static instance of this factory.
     */
    private static SqlPluginFactory factory = new DefaultSqlPluginFactory();

    private DefaultSqlPluginAdapter defaultSqlPluginAdapter;

    /**
     * The private constructor.
     */
    private DefaultSqlPluginFactory() {
        defaultSqlPluginAdapter = new DefaultSqlPluginAdapter();
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
        return defaultSqlPluginAdapter;
    }

    @Override
    public IsTruePlugin getIsTruePlugin() {
        return defaultSqlPluginAdapter;
    }

}
