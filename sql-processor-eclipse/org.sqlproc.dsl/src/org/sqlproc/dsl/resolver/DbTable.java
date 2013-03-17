package org.sqlproc.dsl.resolver;

public class DbTable {

    private String name;
    private String remarks;
    private String type;
    private short ftype;
    private short ptype;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public short getFtype() {
        return ftype;
    }

    public void setFtype(short ftype) {
        this.ftype = ftype;
    }

    public short getPtype() {
        return ptype;
    }

    public void setPtype(short ptype) {
        this.ptype = ptype;
    }

    @Override
    public String toString() {
        return "DbTable [name=" + name + ", remarks=" + remarks + ", type=" + type + ", ftype=" + ftype + ", ptype="
                + ptype + "]";
    }
}
