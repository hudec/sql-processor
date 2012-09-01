package org.sqlproc.dsl.resolver;

import java.util.Collections;
import java.util.List;

public class DbModel {

    List<DbColumn> dbColumns;

    List<DbExport> dbExports;

    List<DbImport> dbImports;

    public DbModel() {
        dbColumns = Collections.emptyList();
        dbExports = Collections.emptyList();
        dbImports = Collections.emptyList();
    }

    public List<DbColumn> getDbColumns() {
        return dbColumns;
    }

    public void setDbColumns(List<DbColumn> dbColumns) {
        this.dbColumns = dbColumns;
    }

    public List<DbExport> getDbExports() {
        return dbExports;
    }

    public void setDbExports(List<DbExport> dbExports) {
        this.dbExports = dbExports;
    }

    public List<DbImport> getDbImports() {
        return dbImports;
    }

    public void setDbImports(List<DbImport> dbImports) {
        this.dbImports = dbImports;
    }
}
