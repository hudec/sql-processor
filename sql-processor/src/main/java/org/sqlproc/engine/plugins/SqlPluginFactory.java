package org.sqlproc.engine.plugins;

public interface SqlPluginFactory {

    public IsEmptyPlugin getIsEmptyPlugin();

    public IsTruePlugin getIsTruePlugin();

}
