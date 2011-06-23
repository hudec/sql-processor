package org.sqlproc.dsl.resolver;

public interface ModelProperty {

    public boolean resolvingPojo();

    public boolean resolvingDb();

    public String getDbDriver();

    public String getDbUrl();

    public String getDbUsername();

    public String getDbPassword();

    public String getDbSchema();
}
