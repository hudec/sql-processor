package org.sqlproc.dsl.property;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;

public interface ModelProperty extends Adapter {

    public boolean isDoResolvePojo(EObject model);

    public boolean isDoResolveDb(EObject model);

    public String getDbDriver(EObject model);

    public String getDbUrl(EObject model);

    public String getDbUsername(EObject model);

    public String getDbPassword(EObject model);

    public String getDbSchema(EObject model);
}
