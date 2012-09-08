package org.sqlproc.dsl.property;

import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.sqlproc.dsl.property.ModelPropertyBean.ModelValues;

public interface ModelProperty extends Adapter {

    boolean isDoResolvePojo(EObject model);

    boolean isDoResolveDb(EObject model);

    Map<String, PojoAttrType> getSqlTypes(EObject model);

    Map<String, Map<String, PojoAttrType>> getTableTypes(EObject model);

    Map<String, Map<String, PojoAttrType>> getColumnTypes(EObject model);

    Map<String, Map<String, String>> getColumnNames(EObject model);

    ModelValues getModelValues(EObject model);

    Map<String, String> getTableNames(EObject model);

    Set<String> getIgnoreTables(EObject model);

    Map<String, Set<String>> getIgnoreColumns(EObject model);
}
