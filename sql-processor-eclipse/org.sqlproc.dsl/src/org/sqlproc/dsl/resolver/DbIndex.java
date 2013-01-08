package org.sqlproc.dsl.resolver;

import java.util.ArrayList;
import java.util.List;

public class DbIndex {

    public static class DbIndexDetail {
        private String colname;
        private boolean desc;

        public String getColname() {
            return colname;
        }

        public void setColname(String colname) {
            this.colname = colname;
        }

        public boolean isDesc() {
            return desc;
        }

        public void setDesc(boolean desc) {
            this.desc = desc;
        }

        @Override
        public String toString() {
            return "DbIndexDetail [colname=" + colname + ", desc=" + desc + "]";
        }
    }

    private String name;
    private List<DbIndexDetail> columns = new ArrayList<DbIndexDetail>();

    public DbIndex() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DbIndexDetail> getColumns() {
        return columns;
    }

    public void setColumns(List<DbIndexDetail> columns) {
        this.columns = columns;
    }

    @Override
    public String toString() {
        return "DbIndex [name=" + name + ", columns=" + columns + "]";
    }
}
