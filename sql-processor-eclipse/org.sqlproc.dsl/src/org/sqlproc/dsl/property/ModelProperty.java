package org.sqlproc.dsl.property;

import org.eclipse.emf.common.notify.Adapter;

public interface ModelProperty extends Adapter {

    public void setNextReset();

    public boolean isDoResolvePojo();

    public boolean isDoResolveDb();

    public String getDbDriver();

    public String getDbUrl();

    public String getDbUsername();

    public String getDbPassword();

    public String getDbSchema();
}
