package org.sqlproc.engine.impl;

import static org.sqlproc.engine.SqlOrder.getDescOrder;

import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.model.Person;

public class TestOrder extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/BasicTest.xml";
    }

    @Test
    public void testOrder() {
        SqlQueryEngine sqlEngine = getSqlEngine("ORDER");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql,
                "p.ID, p.NAME_FIRST as first, p.NAME_LAST as last, p.SSN_NUMBER ssn, p.SSN_COUNTRY country,");
        assertContains(sql, "p.BIRTHDATE, p.SEX, p.CREATEDDATE, p.CREATEDBY, p.LASTUPDATED, p.LASTUPDATEDBY, p.VERSION");
        assertContains(sql, "from PERSON p");
        assertContains(sql, "order by id ASC");
        List<Person> list = sqlEngine.query(session, Person.class, new Object(), SqlQueryEngine.ASC_ORDER);
        assertEquals(2, list.size());

        sql = sqlEngine.getSql(null, null, getDescOrder(2));
        logger.info(sql);
        assertContains(sql,
                "p.ID, p.NAME_FIRST as first, p.NAME_LAST as last, p.SSN_NUMBER ssn, p.SSN_COUNTRY country,");
        assertContains(sql, "p.BIRTHDATE, p.SEX, p.CREATEDDATE, p.CREATEDBY, p.LASTUPDATED, p.LASTUPDATEDBY, p.VERSION");
        assertContains(sql, "from PERSON p");
        assertContains(sql, "order by first DESC");
        list = sqlEngine.query(session, Person.class, null, null, getDescOrder(2), 0, 0, 0);
        assertEquals(2, list.size());

        sql = sqlEngine.getSql(null, null, getDescOrder(1).addAscOrder(4));
        logger.info(sql);
        assertContains(sql,
                "p.ID, p.NAME_FIRST as first, p.NAME_LAST as last, p.SSN_NUMBER ssn, p.SSN_COUNTRY country,");
        assertContains(sql, "p.BIRTHDATE, p.SEX, p.CREATEDDATE, p.CREATEDBY, p.LASTUPDATED, p.LASTUPDATEDBY, p.VERSION");
        assertContains(sql, "from PERSON p");
        assertContains(sql, "order by id DESC, ssn ASC");
        list = sqlEngine.query(session, Person.class, null, null, getDescOrder(1).addAscOrder(4), 0, 0, 0);
        assertEquals(2, list.size());

        sql = sqlEngine.getSql(null, null, getDescOrder(1).addAscOrder(4).addDescOrder(3));
        logger.info(sql);
        assertContains(sql,
                "p.ID, p.NAME_FIRST as first, p.NAME_LAST as last, p.SSN_NUMBER ssn, p.SSN_COUNTRY country,");
        assertContains(sql, "p.BIRTHDATE, p.SEX, p.CREATEDDATE, p.CREATEDBY, p.LASTUPDATED, p.LASTUPDATEDBY, p.VERSION");
        assertContains(sql, "from PERSON p");
        assertContains(sql, "order by id DESC, ssn ASC, last DESC");
        list = sqlEngine.query(session, Person.class, null, null, getDescOrder(1).addAscOrder(4).addDescOrder(3), 0, 0,
                0);
        assertEquals(2, list.size());
    }
}
