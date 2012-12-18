package org.sqlproc.dsl.property;

import java.util.LinkedHashMap;
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
    private String m2mTable;
    private Map<String, String> fkTables = new LinkedHashMap<String, String>();
    private Map<String, String> m2Tables = new LinkedHashMap<String, String>();
    private Map<String, String> fkColumns = new LinkedHashMap<String, String>();
    private String oneToManyColumn;
    private String oneToManyTable;
    private String manyToManyColumn;
    private String manyToManyTable;

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

    public String getM2mTable() {
        return m2mTable;
    }

    public void setM2mTable(String m2mTable) {
        this.m2mTable = m2mTable;
    }

    public Map<String, String> getFkTables() {
        return fkTables;
    }

    public void setFkTables(Map<String, String> fkTables) {
        this.fkTables = fkTables;
    }

    public Map<String, String> getM2Tables() {
        return m2Tables;
    }

    public void setM2Tables(Map<String, String> m2Tables) {
        this.m2Tables = m2Tables;
    }

    public Map<String, String> getFkColumns() {
        return fkColumns;
    }

    public void setFkColumns(Map<String, String> fkColumns) {
        this.fkColumns = fkColumns;
    }

    public String getOneToManyColumn() {
        return oneToManyColumn;
    }

    public void setOneToManyColumn(String oneToManyColumn) {
        this.oneToManyColumn = oneToManyColumn;
    }

    public String getOneToManyTable() {
        return oneToManyTable;
    }

    public void setOneToManyTable(String oneToManyTable) {
        this.oneToManyTable = oneToManyTable;
    }

    public String getManyToManyColumn() {
        return manyToManyColumn;
    }

    public void setManyToManyColumn(String manyToManyColumn) {
        this.manyToManyColumn = manyToManyColumn;
    }

    public String getManyToManyTable() {
        return manyToManyTable;
    }

    public void setManyToManyTable(String manyToManyTable) {
        this.manyToManyTable = manyToManyTable;
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

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "PojoAttribute [primitive=" + primitive + ", required=" + required + ", primaryKey=" + primaryKey
                + ", name=" + name + ", className=" + className + ", dependencyClassName=" + dependencyClassName
                + ", pkTable=" + pkTable + ", pkColumn=" + pkColumn + ", parentTable=" + parentTable + ", m2mTable="
                + m2mTable + ", fkTables=" + fkTables + ", m2Tables=" + m2Tables + ", fkColumns=" + fkColumns
                + ", oneToManyColumn=" + oneToManyColumn + ", oneToManyTable=" + oneToManyTable + ", manyToManyColumn="
                + manyToManyColumn + ", manyToManyTable=" + manyToManyTable + "]";
    }
}
