package org.sqlproc.dsl.property;

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.sqlproc.dsl.processorDsl.DatabaseSqlType;
import org.sqlproc.dsl.property.ModelPropertyBean.ModelValues;

public interface ModelProperty extends Adapter {

    public boolean isDoResolvePojo(EObject model);

    public boolean isDoResolveDb(EObject model);

    public List<DatabaseSqlType> getSqlTypes(EObject model);

    public ModelValues getModelValues(EObject model);
}
