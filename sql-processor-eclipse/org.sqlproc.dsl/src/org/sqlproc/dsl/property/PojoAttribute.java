package org.sqlproc.dsl.property;

import java.util.HashMap;
import java.util.Map;

public class PojoAttribute {

    private boolean primitive;
    private boolean required;
    private boolean primaryKey;
    private String name;
    private String className;
    private String dependencyClassName;
    private String pkTable;
    private String parentTable;
    private Map<String, String> fkTables = new HashMap<String, String>();

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

    public boolean isPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(boolean primaryKey) {
        this.primaryKey = primaryKey;
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

    public String getPkTable() {
        return pkTable;
    }

    public void setPkTable(String pkTable) {
        this.pkTable = pkTable;
    }

    public String getParentTable() {
        return parentTable;
    }

    public void setParentTable(String parentTable) {
        this.parentTable = parentTable;
    }

    public Map<String, String> getFkTables() {
        return fkTables;
    }

    public void setFkTables(Map<String, String> fkTables) {
        this.fkTables = fkTables;
    }

    @Override
    public String toString() {
        return "PojoAttribute [primitive=" + primitive + ", required=" + required + ", primaryKey=" + primaryKey
                + ", name=" + name + ", className=" + className + ", dependencyClassName=" + dependencyClassName
                + ", pkTable=" + pkTable + ", parentTable=" + parentTable + ", fkTables=" + fkTables + "]";
    }
}
