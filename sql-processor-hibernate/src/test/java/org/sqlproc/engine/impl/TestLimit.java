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

    // MSSQL: WITH query AS (SELECT inner_query.*, ROW_NUMBER() OVER (ORDER BY CURRENT_TIMESTAMP) as
    // __hibernate_row_nr__ FROM ( select TOP(?) p.ID id as page0_, p.NAME_FIRST first_0 as page1_, p.NAME_LAST last_1
    // as page2_, p.SSN_NUMBER number_2 as page3_, p.SSN_COUNTRY country_3 as page4_, p.BIRTHDATE birthDate as page5_,
    // p.SEX sex as page6_, p.CREATEDDATE createdDate as page7_, p.CREATEDBY createdBy as page8_, p.LASTUPDATED
    // lastUpdated, p.LASTUPDATEDBY lastUpdatedBy, p.VERSION version as page9_ from PERSON p order by id ASC )
    // inner_query ) SELECT page0_, page1_, page2_, page3_, page4_, page5_, page6_, page7_, page8_, page9_ FROM query
    // WHERE __hibernate_row_nr__ >= ? AND __hibernate_row_nr__ < ?
    // the dialect SQLServer2005LimitHandler produces this SQL, which doesn't work

    @Test
    public void testLimitMinMax() {
        if ("mssql".equalsIgnoreCase(dbType))
            return;
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
