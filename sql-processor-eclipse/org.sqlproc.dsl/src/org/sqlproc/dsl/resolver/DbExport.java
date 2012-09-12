package org.sqlproc.dsl.resolver;

public class DbExport {

    String pkTable;
    String pkColumn;
    String fkTable;
    String fkColumn;
    String fkName;
    String pkName;

    public String getPkTable() {
        return pkTable;
    }

    public void setPkTable(String pkTable) {
        this.pkTable = pkTable;
    }

    public String getPkColumn() {
        return pkColumn;
    }

    public void setPkColumn(String pkColumn) {
        this.pkColumn = pkColumn;
    }

    public String getFkTable() {
        return fkTable;
    }

    public void setFkTable(String fkTable) {
        this.fkTable = fkTable;
    }

    public String getFkColumn() {
        return fkColumn;
    }

    public void setFkColumn(String fkColumn) {
        this.fkColumn = fkColumn;
    }

    public String getFkName() {
        return fkName;
    }

    public void setFkName(String fkName) {
        this.fkName = fkName;
    }

    public String getPkName() {
        return pkName;
    }

    public void setPkName(String pkName) {
        this.pkName = pkName;
    }

    @Override
    public String toString() {
        return "DbExport [pkTable=" + pkTable + ", pkColumn=" + pkColumn + ", fkTable=" + fkTable + ", fkColumn="
                + fkColumn + ", fkName=" + fkName + ", pkName=" + pkName + "]";
    }

}
