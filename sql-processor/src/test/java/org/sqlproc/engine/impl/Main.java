package org.sqlproc.engine.impl;

import org.sqlproc.engine.SqlStatementsLoader;
import org.sqlproc.engine.jdbc.type.JdbcTypeFactory;

public class Main {

    public static void main(String[] args) {

        StringBuilder sb = SqlStatementsLoader.getStatements(Main.class, "basic.qry");
        System.out.println("sb: " + sb);
        SqlProcessor processor = SqlProcessor.getInstance(sb, JdbcTypeFactory.getInstance());
        System.out.println("statements: " + processor.getStatements());
        System.out.println("mappings: " + processor.getMappingRules());
    }

}
