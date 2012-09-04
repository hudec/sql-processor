package org.sqlproc.dsl.property;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.sqlproc.dsl.processorDsl.PojoType;
import org.sqlproc.dsl.property.ModelPropertyBean.ModelValues;

public interface ModelProperty extends Adapter {

    public boolean isDoResolvePojo(EObject model);

    public boolean isDoResolveDb(EObject model);

    public Map<String, PojoType> getSqlTypes(EObject model);

    public Map<String, Map<String, PojoType>> getTableTypes(EObject model);

    public Map<String, Map<String, PojoType>> getColumnTypes(EObject model);

    public Map<String, Map<String, String>> getColumnNames(EObject model);

    public ModelValues getModelValues(EObject model);
}
