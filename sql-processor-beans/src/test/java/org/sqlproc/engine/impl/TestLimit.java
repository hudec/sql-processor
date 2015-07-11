package org.sqlproc.engine.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.model.Person;

public class TestLimit extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/LimitTest.xml";
    }

    @Test
    public void testNoLimit() {
        SqlQueryEngine sqlEngine = getSqlEngine("FORM_BASIC_2");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        List<Person> list = sqlEngine.query(session, Person.class, null, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(7, list.size());
        for (int i = 0, n = list.size(); i < n; i++)
            assertEquals(list.get(i).getId(), new Long(2 + i));
    }

    @Test
    public void testLimitMax() {
        SqlQueryEngine sqlEngine = getSqlEngine("FORM_BASIC_2");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // PersonForm pf = new PersonForm();
        // pf.setId(2L);

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        List<Person> list = sqlEngine.query(session, Person.class, null, null, SqlQueryEngine.ASC_ORDER, 0, 3, 0);

        assertEquals(3, list.size());
        for (int i = 0, n = list.size(); i < n; i++)
            assertEquals(list.get(i).getId(), new Long(2 + i));
    }

    @Test
    public void testLimitMinMax() {
        // if ("mssql".equalsIgnoreCase(dbType))
        // return;

        SqlQueryEngine sqlEngine = getSqlEngine("FORM_BASIC_2");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // PersonForm pf = new PersonForm();
        // pf.setId(2L);

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        List<Person> list = sqlEngine.query(session, Person.class, null, null, SqlQueryEngine.ASC_ORDER, 0, 3, 2);

        assertEquals(3, list.size());
        for (int i = 0, n = list.size(); i < n; i++)
            assertEquals(list.get(i).getId(), new Long(4 + i));
    }
}
