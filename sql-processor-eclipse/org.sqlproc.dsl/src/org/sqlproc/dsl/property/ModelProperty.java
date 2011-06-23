package org.sqlproc.dsl.property;

import org.eclipse.emf.common.notify.Adapter;

public interface ModelProperty {

    public boolean isResolvePojo();

    public boolean isResolveDb();

    public String getDbDriver();

    public String getDbUrl();

    public String getDbUsername();

    public String getDbPassword();

    public String getDbSchema();

    public void setResolvePojo(boolean resolvePojo);

    public void setResolveDb(boolean resolveDb);

    public void setDbDriver(String dbDriver);

    public void setDbUrl(String dbUrl);

    public void setDbUsername(String dbUsername);

    public void setDbPassword(String dbPassword);

    public void setDbSchema(String dbSchema);

    public void setNextReset();

    public boolean isNextReset();

    public Adapter getAdapter();

    void reset();
}
