package org.sqlproc.dsl.property;

import java.util.HashMap;
import java.util.Map;

public class PojoAttribute {

    protected static final String COLLECTION_LIST = "java.util.List";

    private boolean primitive;
    private boolean required;
    private boolean primaryKey;
    private String name;
    private String className;
    private String dependencyClassName;
    private String pkTable;
    private String pkColumn;
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

    public String getPkColumn() {
        return pkColumn;
    }

    public void setPkColumn(String pkColumn) {
        this.pkColumn = pkColumn;
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

    public boolean isDef() {
        if (getDependencyClassName() != null) {
            if (!isRequired())
                return true;
        } else if (isPrimitive()) {
            if (!isRequired())
                return true;
        } else {
            if (!getClassName().startsWith(COLLECTION_LIST)) {
                if (!isRequired())
                    return true;
            }
        }
        return false;
    }

    public boolean toInit() {
        if (getDependencyClassName() != null) {
            if (getPkTable() != null) {
                return true;
            }
        } else {
            if (!getClassName().startsWith(COLLECTION_LIST)) {
                if (getPkTable() != null) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "PojoAttribute [primitive=" + primitive + ", required=" + required + ", primaryKey=" + primaryKey
                + ", name=" + name + ", className=" + className + ", dependencyClassName=" + dependencyClassName
                + ", pkTable=" + pkTable + ", pkColumn=" + pkColumn + ", parentTable=" + parentTable + ", fkTables="
                + fkTables + "]";
    }
}
