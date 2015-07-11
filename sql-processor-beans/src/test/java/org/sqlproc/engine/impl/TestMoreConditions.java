package org.sqlproc.engine.impl;

import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.form.PersonForm;
import org.sqlproc.engine.model.Person;

public class TestMoreConditions extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/BasicTest.xml";
    }

    @Test
    public void testConditionsMore() {
        SqlQueryEngine sqlEngine = getSqlEngine("CONDITIONS_MORE");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND p.ID is null");
        assertContains(sql, "AND p.LASTUPDATEDBY like '%'");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(0, list.size());

        PersonForm pf = new PersonForm();
        pf.setId(2L);
        pf.setVersion(1L);

        sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND p.ID = :id", "AND p.ID = ?");
        assertContains(sql, "AND (p.VERSION = 1 OR p.VERSION is null)", "AND (p.VERSION = 1 OR p.VERSION is null)");
        assertContains(sql, "AND p.LASTUPDATEDBY like '%'", "AND p.LASTUPDATEDBY like '%'");

        list = sqlEngine.query(session, Person.class, pf, pf);
        assertEquals(1, list.size());

        pf.setLastUpdatedBy("xxx");

        sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND p.ID = :id", "AND p.ID = ?");
        assertContains(sql, "AND (p.VERSION = 1 OR p.VERSION is null)", "AND (p.VERSION = 1 OR p.VERSION is null)");
        assertContains(sql, "AND p.LASTUPDATEDBY like '%'", "AND p.LASTUPDATEDBY like '%'");

        list = sqlEngine.query(session, Person.class, pf, pf);
        assertEquals(1, list.size());

        pf.setLastUpdatedBy("pes");

        sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND p.ID = :id", "AND p.ID = ?");
        assertContains(sql, "AND (p.VERSION = 1 OR p.VERSION is null)", "AND (p.VERSION = 1 OR p.VERSION is null)");
        assertContains(sql, "AND p.LASTUPDATEDBY = 'dbunit'", "AND p.LASTUPDATEDBY = 'dbunit'");

        list = sqlEngine.query(session, Person.class, pf, pf);
        assertEquals(1, list.size());
    }

    @Test
    public void testConditionsMore2() {
        SqlQueryEngine sqlEngine = getSqlEngine("CONDITIONS_MORE_2");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND p.ID is null");
        assertContains(sql, "AND p.LASTUPDATEDBY like '%'");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(0, list.size());

        PersonForm pf = new PersonForm();
        pf.setId(2L);
        pf.setVersion(1L);

        sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND p.ID = :id", "AND p.ID = ?");
        assertContains(sql, "AND (p.VERSION = 1 OR p.VERSION is null)", "AND (p.VERSION = 1 OR p.VERSION is null)");
        assertContains(sql, "AND p.LASTUPDATEDBY like '%'", "AND p.LASTUPDATEDBY like '%'");

        list = sqlEngine.query(session, Person.class, pf, pf);
        assertEquals(1, list.size());

        pf.setLastUpdatedBy("xxx");

        sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND p.ID = :id", "AND p.ID = ?");
        assertContains(sql, "AND (p.VERSION = 1 OR p.VERSION is null)", "AND (p.VERSION = 1 OR p.VERSION is null)");
        assertContains(sql, "AND p.LASTUPDATEDBY like '%'", "AND p.LASTUPDATEDBY like '%'");

        list = sqlEngine.query(session, Person.class, pf, pf);
        assertEquals(1, list.size());

        pf.setLastUpdatedBy("pes");

        sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND p.ID = :id", "AND p.ID = ?");
        assertContains(sql, "AND (p.VERSION = 1 OR p.VERSION is null)", "AND (p.VERSION = 1 OR p.VERSION is null)");
        assertContains(sql, "AND p.LASTUPDATEDBY = 'dbunit'", "AND p.LASTUPDATEDBY = 'dbunit'");

        list = sqlEngine.query(session, Person.class, pf, pf);
        assertEquals(1, list.size());
    }
}
