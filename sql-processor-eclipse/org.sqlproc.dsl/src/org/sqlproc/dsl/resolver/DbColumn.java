package org.sqlproc.dsl.resolver;

public class DbColumn implements Comparable<DbColumn> {

    private String name;
    private String type;
    private int size;
    private int sqlType;
    private boolean nullable;
    private int position;
    private short columnType;

    public DbColumn() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSqlType() {
        return sqlType;
    }

    public void setSqlType(int sqlType) {
        this.sqlType = sqlType;
    }

    public boolean isNullable() {
        return nullable;
    }

    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public int compareTo(DbColumn dbColumn) {
        return position - dbColumn.getPosition();
    }

    public short getColumnType() {
        return columnType;
    }

    public void setColumnType(short columnType) {
        this.columnType = columnType;
    }

    @Override
    public String toString() {
        return "DbColumn [name=" + name + ", type=" + type + ", size=" + size + ", sqlType=" + sqlType + ", nullable="
                + nullable + ", position=" + position + ", columnType=" + columnType + "]";
    }
}
