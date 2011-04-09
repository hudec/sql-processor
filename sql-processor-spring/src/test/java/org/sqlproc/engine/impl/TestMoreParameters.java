package org.sqlproc.engine.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.form.PersonForm;
import org.sqlproc.engine.form.PersonNameForm;
import org.sqlproc.engine.form.SsnForm;
import org.sqlproc.engine.model.Country;
import org.sqlproc.engine.model.Gender;
import org.sqlproc.engine.model.Person;

public class TestMoreParameters extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/BasicTest.xml";
    }

    @Test
    public void testParametersMore() {
        SqlQueryEngine sqlEngine = getSqlEngine("PARAMETERS_MORE");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(
                sql,
                "AND  p.id = :id AND  p.NAME_FIRST = :name_first  AND  p.SSN_COUNTRY = :ssn_country  AND  p.CREATEDDATE = :createdDate  AND  p.CREATEDBY = :createdBy AND  p.VERSION = :version",
                "AND  p.id = ? AND  p.NAME_FIRST = ?  AND  p.SSN_COUNTRY = ?  AND  p.CREATEDDATE = ?  AND  p.CREATEDBY = ? AND  p.VERSION = ?");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(0, list.size());

        PersonForm pf = new PersonForm();
        pf.setId(2L);
        pf.setName(new PersonNameForm());
        pf.getName().setFirst("A");
        pf.setSsn(new SsnForm());
        pf.getSsn().setCountry(Country.UNITED_STATES);
        try {
            pf.setCreatedDate(sdf.parse("2006-12-08 00:00:00"));
        } catch (Exception ex) {
            fail();
        }
        pf.setCreatedBy("A");
        pf.setVersion(1L);

        sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql,
                "AND  p.NAME_LAST = :name_last  AND  p.BIRTHDATE = :birthDate  AND  p.LASTUPDATEDBY = :lastUpdatedBy",
                "AND  p.NAME_LAST = ?  AND  p.BIRTHDATE = ?  AND  p.LASTUPDATEDBY = ?");

        list = sqlEngine.query(session, Person.class, pf);
        assertEquals(0, list.size());

        pf.getName().setLast("A");
        pf.setLastUpdatedBy("A");
        try {
            pf.setBirthDate(sdf.parse("2006-12-08 00:00:00"));
        } catch (Exception ex) {
            fail();
        }

        sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND  p.SSN_NUMBER = :ssn_number AND  p.SEX = :sex AND  p.LASTUPDATED = :lastUpdated",
                "AND  p.SSN_NUMBER = ? AND  p.SEX = ? AND  p.LASTUPDATED = ?");

        list = sqlEngine.query(session, Person.class, pf);
        assertEquals(0, list.size());

        pf.getSsn().setNumber("A");
        pf.setSex(Gender.FEMALE);
        try {
            pf.setLastUpdated(sdf.parse("2006-12-08 00:00:00"));
        } catch (Exception ex) {
            fail();
        }

        sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "where 1=1       order by id ASC");

        list = sqlEngine.query(session, Person.class, pf);
        assertEquals(2, list.size());
    }

    @Test
    public void testParametersTop() {
        SqlQueryEngine sqlEngine = getSqlEngine("PARAMETERS_TOP");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "where p.id = :id  AND p.CREATEDBY is null", "where p.id = ?  AND p.CREATEDBY is null");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(0, list.size());

        PersonForm pf = new PersonForm();
        pf.setId(2L);

        sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "where p.id = :id  AND p.CREATEDBY is null", "where p.id = ?  AND p.CREATEDBY is null");

        list = sqlEngine.query(session, Person.class, pf);
        assertEquals(1, list.size());
        assertEquals(2L, list.get(0).getId().longValue());

        pf.setCreatedBy("kukuc");

        sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "where p.id = :id  AND p.CREATEDBY=:createdBy", "where p.id = ?  AND p.CREATEDBY=?");

        list = sqlEngine.query(session, Person.class, pf);
        assertEquals(0, list.size());
    }
}
