package org.sqlproc.dsl.property;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmType;
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

    Map<String, Map<String, Map<String, String>>> getIgnoreExports(EObject model);

    Map<String, Map<String, Map<String, String>>> getIgnoreImports(EObject model);

    Map<String, Map<String, Map<String, String>>> getCreateExports(EObject model);

    Map<String, Map<String, Map<String, String>>> getCreateImports(EObject model);

    Map<String, Map<String, PojoAttrType>> getCreateColumns(EObject model);

    Map<String, Map<String, Map<String, String>>> getInheritImports(EObject model);

    Map<String, Map<String, Map<String, String>>> getManyToManyImports(EObject model);

    Map<String, Map<String, Map<String, List<String>>>> getInheritance(EObject model);

    Map<String, Set<String>> getRequiredColumns(EObject model);

    Map<String, Set<String>> getNotRequiredColumns(EObject model);

    Map<String, String> getInheritanceColumns(EObject model);

    Set<String> getGenerateMethods(EObject model);

    Map<String, JvmType> getToImplements(EObject model);

    JvmType getToExtends(EObject model);

    Set<String> getOnlyTables(EObject model);

    Map<String, List<String>> getJoinTables(EObject model);
}
