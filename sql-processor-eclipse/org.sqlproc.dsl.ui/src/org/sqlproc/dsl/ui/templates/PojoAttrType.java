package org.sqlproc.dsl.ui.templates;

import org.eclipse.xtext.common.types.JvmType;
import org.sqlproc.dsl.processorDsl.PojoEntity;
import org.sqlproc.dsl.processorDsl.PojoType;

public class PojoAttrType {
    String name;
    int size;
    String nativeType;
    JvmType type;
    boolean array;
    PojoEntity ref;

    public PojoAttrType(String typeName, PojoType pojoType) {
        setNativeType(pojoType.getNative());
        setType(pojoType.getType());
        setRef(pojoType.getRef());
        setArray(pojoType.isArray());
        String name = typeName;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
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

    public PojoEntity getRef() {
        return ref;
    }

    public void setRef(PojoEntity ref) {
        this.ref = ref;
    }
}
