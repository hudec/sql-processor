package org.sqlproc.dsl.resolver;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

public interface DbResolver {

    public boolean isResolveDb(EObject model);

    public List<String> getTables(EObject model);

    public boolean checkTable(EObject model, String table);

    public List<String> getColumns(EObject model, String table);

    public boolean checkColumn(EObject model, String table, String column);

    public List<DbColumn> getDbColumns(EObject model, String table);
}
