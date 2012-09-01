package org.sqlproc.dsl.ui.templates;

import java.util.ArrayList;
import java.util.List;

public class PojoAttribute {

    private boolean primitive;
    private boolean required;
    private String name;
    private String className;
    private String dependencyClassName;
    private String dbName;
    private String pkTable;
    private List<String> fkTables = new ArrayList<String>();

    public PojoAttribute() {
    }

    public boolean isPrimitive() {
        return primitive;
    }

    public void setPrimitive(boolean primitive) {
        this.primitive = primitive;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDependencyClassName() {
        return dependencyClassName;
    }

    public void setDependencyClassName(String dependencyClassName) {
        this.dependencyClassName = dependencyClassName;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getPkTable() {
        return pkTable;
    }

    public void setPkTable(String pkTable) {
        this.pkTable = pkTable;
    }

    public List<String> getFkTables() {
        return fkTables;
    }

    public void setFkTables(List<String> fkTables) {
        this.fkTables = fkTables;
    }
}
