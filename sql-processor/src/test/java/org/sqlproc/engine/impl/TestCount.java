package org.sqlproc.engine.impl;

import org.junit.Test;
import org.sqlproc.engine.SqlQueryEngine;

public class TestCount extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/BasicTest.xml";
    }

    @Test
    public void testOrder() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC");

        int rows = sqlEngine.queryCount(session);
        assertTrue(rows > 0);
        logger.info("Rows: " + rows);
    }

}
