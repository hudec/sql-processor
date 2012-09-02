package org.sqlproc.dsl.ui.templates;

import org.eclipse.xtext.common.types.JvmType;
import org.sqlproc.dsl.processorDsl.DatabaseSqlType;

public class PojoAttrType {
    String name;
    Integer size;
    String nativeType;
    JvmType type;
    boolean array;

    public PojoAttrType(DatabaseSqlType sqlType) {
        setNativeType(sqlType.getNative());
        setType(sqlType.getType());
        setArray(sqlType.isArray());
        String name = sqlType.getTypeName();
        int ix = name.indexOf('(');
        int ix2 = (ix >= 0) ? name.indexOf(')', ix + 1) : -1;
        if (ix >= 0 && ix2 >= 0) {
            String num = name.substring(ix + 1, ix2);
            name = name.substring(0, ix);
            try {
                size = Integer.parseInt(num);
            } catch (NumberFormatException ignore) {
            }
        }
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getNativeType() {
        return nativeType;
    }

    public void setNativeType(String nativeType) {
        this.nativeType = nativeType;
    }

    public JvmType getType() {
        return type;
    }

    public void setType(JvmType type) {
        this.type = type;
    }

    public boolean isArray() {
        return array;
    }

    public void setArray(boolean array) {
        this.array = array;
    }
}
