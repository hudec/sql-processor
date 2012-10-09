package org.sqlproc.dsl.resolver;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

public interface DbResolver {

    boolean isResolveDb(EObject model);

    List<String> getTables(EObject model);

    boolean checkTable(EObject model, String table);

    List<String> getColumns(EObject model, String table);

    boolean checkColumn(EObject model, String table, String column);

    List<DbColumn> getDbColumns(EObject model, String table);

    List<DbExport> getDbExports(EObject model, String table);

    List<DbImport> getDbImports(EObject model, String table);

    List<String> getDbPrimaryKeys(EObject model, String table);

    String getType(EObject model, String table, String column);
}
