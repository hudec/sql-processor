package org.sqlproc.dsl.property;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Level;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmType;
import org.sqlproc.dsl.processorDsl.PojoType;
import org.sqlproc.dsl.property.ModelPropertyBean.ModelValues;
import org.sqlproc.dsl.property.ModelPropertyBean.PairValues;

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

    boolean isDoGenerateWrappers(EObject model);

    PairValues getMetaGlobalIdentity(EObject model);

    PairValues getMetaGlobalSequence(EObject model);

    Map<String, PairValues> getMetaTablesIdentity(EObject model);

    Map<String, PairValues> getMetaTablesSequence(EObject model);

    Map<String, Map<String, PairValues>> getMetaColumnsMetaTypes(EObject model);

    Map<String, Map<String, PairValues>> getMetaStatementsMetaTypes(EObject model);

    Set<String> getNotAbstractTables(EObject model);

    Set<String> getDaoIgnoreTables(EObject model);

    Set<String> getDaoOnlyTables(EObject model);

    JvmType getDaoToExtends(EObject model);

    Map<String, JvmType> getDaoToImplements(EObject model);

    String getDaoImplementationPackage(EObject model);

    String getImplementationPackage(EObject model);

    boolean isMakeItFinal(EObject model);

    boolean isDaoMakeItFinal(EObject model);

    boolean isMetaMakeItFinal(EObject model);

    Map<String, String> getVersionColumns(EObject model);

    String getVersionColumn(EObject model);

    Map<String, Set<String>> getMetaLikeColumns(EObject model);

    Map<String, Set<String>> getMetaNotLikeColumns(EObject model);

    boolean isMetaGenerateIdentities(EObject model);

    boolean isMetaGenerateSequences(EObject model);

    Map<String, String> getMetaFunctionsResult(EObject model);

    Map<String, String> getMetaFunctionsResultSet(EObject model);

    Map<String, String> getMetaProceduresResultSet(EObject model);

    Map<String, PojoType> getDaoFunctionsResult(EObject model);

    Level getDebugLevel(EObject model);

    Level getMetaDebugLevel(EObject model);

    Level getDaoDebugLevel(EObject model);
}
