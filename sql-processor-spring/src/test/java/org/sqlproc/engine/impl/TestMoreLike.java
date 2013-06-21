package org.sqlproc.engine.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.form.PersonForm;
import org.sqlproc.engine.form.PersonNameForm;
import org.sqlproc.engine.model.Country;
import org.sqlproc.engine.model.Gender;
import org.sqlproc.engine.model.Person;

public class TestMoreLike extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/AdvancedTest.xml";
    }

    @Test
    public void testMoreLike() {
        SqlQueryEngine sqlEngine = getSqlEngine("LIKE_BASIC");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
        pf.setId(2L);
        pf.setName(new PersonNameForm());
        pf.getName().setFirst("ie");
        pf.getName().setLast("ro");

        String sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND  p.id =");
        assertContains(sql, "AND  UPPER(p.NAME_FIRST) like");
        assertContains(sql, "and UPPER(p.NAME_LAST) like");
        assertContains(sql, "order by id ASC");

        List<Person> list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(1, list.size());
        Person p = list.get(0);
        assertEquals(new Long(2), p.getId());
        assertEquals("1953-05-16", p.getBirthDate().toString());
        assertEquals(null, p.getCreatedDate());
        assertEquals(null, p.getCreatedBy());
        assertEquals("2006-12-08 00:00:00", sdf.format(p.getLastUpdated()));
        assertEquals("dbunit", p.getLastUpdatedBy());
        assertEquals(new Long(1), p.getVersion());
        assertEquals(Gender.MALE, p.getSex());
        assertNotNull(p.getSsn());
        assertEquals("123456", p.getSsn().getNumber());
        assertEquals(Country.UNITED_STATES, p.getSsn().getCountry());
        assertNotNull(p.getName());
        assertEquals("Pierce", p.getName().getFirst());
        assertEquals("Brosnan", p.getName().getLast());

        sqlEngine.setFeature(SqlFeature.SURROUND_QUERY_LIKE_FULL, Boolean.TRUE);
        list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
        assertEquals(1, list.size());
    }

    @Test
    public void testMoreLike2() {
        SqlQueryEngine sqlEngine = getSqlEngine("LIKE_BASIC_2");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
        pf.setId(2L);
        pf.setName(new PersonNameForm());
        pf.getName().setFirst("ie");
        pf.getName().setLast("ro");

        String sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND  p.id =");
        assertContains(sql, "AND  UPPER(p.NAME_FIRST) like");
        assertContains(sql, "and UPPER(p.NAME_LAST) like");
        assertContains(sql, "order by id ASC");

        List<Person> list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(1, list.size());
        Person p = list.get(0);
        assertEquals(new Long(2), p.getId());
        assertEquals("1953-05-16", p.getBirthDate().toString());
        assertEquals(null, p.getCreatedDate());
        assertEquals(null, p.getCreatedBy());
        assertEquals("2006-12-08 00:00:00", sdf.format(p.getLastUpdated()));
        assertEquals("dbunit", p.getLastUpdatedBy());
        assertEquals(new Long(1), p.getVersion());
        assertEquals(Gender.MALE, p.getSex());
        assertNotNull(p.getSsn());
        assertEquals("123456", p.getSsn().getNumber());
        assertEquals(Country.UNITED_STATES, p.getSsn().getCountry());
        assertNotNull(p.getName());
        assertEquals("Pierce", p.getName().getFirst());
        assertEquals("Brosnan", p.getName().getLast());

        sqlEngine.setFeature(SqlFeature.SURROUND_QUERY_LIKE_FULL, Boolean.TRUE);
        list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
        assertEquals(1, list.size());
    }

    @Test
    public void testMoreLikePartial() {
        SqlQueryEngine sqlEngine = getSqlEngine("LIKE_BASIC_PARTIAL");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
        pf.setId(2L);
        pf.setName(new PersonNameForm());
        pf.getName().setFirst("pie");
        pf.getName().setLast("bro");

        String sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND  p.id =");
        assertContains(sql, "AND  UPPER(p.NAME_FIRST) like");
        assertContains(sql, "and UPPER(p.NAME_LAST) like");
        assertContains(sql, "order by id ASC");

        List<Person> list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(1, list.size());
        Person p = list.get(0);
        assertEquals(new Long(2), p.getId());
        assertEquals("1953-05-16", p.getBirthDate().toString());
        assertEquals(null, p.getCreatedDate());
        assertEquals(null, p.getCreatedBy());
        assertEquals("2006-12-08 00:00:00", sdf.format(p.getLastUpdated()));
        assertEquals("dbunit", p.getLastUpdatedBy());
        assertEquals(new Long(1), p.getVersion());
        assertEquals(Gender.MALE, p.getSex());
        assertNotNull(p.getSsn());
        assertEquals("123456", p.getSsn().getNumber());
        assertEquals(Country.UNITED_STATES, p.getSsn().getCountry());
        assertNotNull(p.getName());
        assertEquals("Pierce", p.getName().getFirst());
        assertEquals("Brosnan", p.getName().getLast());

        pf.getName().setFirst("ie");
        pf.getName().setLast("ro");
        list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(0, list.size());
    }

    @Test
    public void testMoreLike2Partial() {
        SqlQueryEngine sqlEngine = getSqlEngine("LIKE_BASIC_2_PARTIAL");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
        pf.setId(2L);
        pf.setName(new PersonNameForm());
        pf.getName().setFirst("pie");
        pf.getName().setLast("bro");

        String sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND  p.id =");
        assertContains(sql, "AND  UPPER(p.NAME_FIRST) like");
        assertContains(sql, "and UPPER(p.NAME_LAST) like");
        assertContains(sql, "order by id ASC");

        List<Person> list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(1, list.size());
        Person p = list.get(0);
        assertEquals(new Long(2), p.getId());
        assertEquals("1953-05-16", p.getBirthDate().toString());
        assertEquals(null, p.getCreatedDate());
        assertEquals(null, p.getCreatedBy());
        assertEquals("2006-12-08 00:00:00", sdf.format(p.getLastUpdated()));
        assertEquals("dbunit", p.getLastUpdatedBy());
        assertEquals(new Long(1), p.getVersion());
        assertEquals(Gender.MALE, p.getSex());
        assertNotNull(p.getSsn());
        assertEquals("123456", p.getSsn().getNumber());
        assertEquals(Country.UNITED_STATES, p.getSsn().getCountry());
        assertNotNull(p.getName());
        assertEquals("Pierce", p.getName().getFirst());
        assertEquals("Brosnan", p.getName().getLast());

        pf.getName().setFirst("ie");
        pf.getName().setLast("ro");
        list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(0, list.size());
    }

    @Test
    public void testMoreLikeRuntimePartial() {
        SqlQueryEngine sqlEngine = getSqlEngine("LIKE_BASIC_2");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
        pf.setId(2L);
        pf.setName(new PersonNameForm());
        pf.getName().setFirst("ie");
        pf.getName().setLast("ro");
        SqlStandardControl sqlControl = new SqlStandardControl();
        sqlControl.setFeature(SqlFeature.SURROUND_QUERY_LIKE_PARTIAL, Boolean.TRUE);
        sqlControl.setAscOrder(1);

        String sql = sqlEngine.getSql(pf, sqlControl);
        logger.info(sql);
        assertContains(sql, "AND  p.id =");
        assertContains(sql, "AND  UPPER(p.NAME_FIRST) like");
        assertContains(sql, "and UPPER(p.NAME_LAST) like");
        assertContains(sql, "order by id ASC");

        List<Person> list = sqlEngine.query(session, Person.class, pf, sqlControl);
        assertEquals(0, list.size());

        pf.getName().setFirst("pie");
        pf.getName().setLast("bro");
        list = sqlEngine.query(session, Person.class, pf, sqlControl);

        assertEquals(1, list.size());
        Person p = list.get(0);
        assertEquals(new Long(2), p.getId());
        assertEquals("1953-05-16", p.getBirthDate().toString());
        assertEquals(null, p.getCreatedDate());
        assertEquals(null, p.getCreatedBy());
        assertEquals("2006-12-08 00:00:00", sdf.format(p.getLastUpdated()));
        assertEquals("dbunit", p.getLastUpdatedBy());
        assertEquals(new Long(1), p.getVersion());
        assertEquals(Gender.MALE, p.getSex());
        assertNotNull(p.getSsn());
        assertEquals("123456", p.getSsn().getNumber());
        assertEquals(Country.UNITED_STATES, p.getSsn().getCountry());
        assertNotNull(p.getName());
        assertEquals("Pierce", p.getName().getFirst());
        assertEquals("Brosnan", p.getName().getLast());

        sqlEngine.setFeature(SqlFeature.SURROUND_QUERY_LIKE_FULL, Boolean.TRUE);
        list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
        assertEquals(1, list.size());
    }

    @Test
    public void testMoreLike2RuntimeFull() {
        SqlQueryEngine sqlEngine = getSqlEngine("LIKE_BASIC_2_PARTIAL");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
        pf.setId(2L);
        pf.setName(new PersonNameForm());
        pf.getName().setFirst("ie");
        pf.getName().setLast("ro");
        SqlStandardControl sqlControl = new SqlStandardControl();
        sqlControl.setFeature(SqlFeature.SURROUND_QUERY_LIKE_FULL, Boolean.TRUE);
        sqlControl.setAscOrder(1);

        String sql = sqlEngine.getSql(pf, sqlControl);
        logger.info(sql);
        assertContains(sql, "AND  p.id =");
        assertContains(sql, "AND  UPPER(p.NAME_FIRST) like");
        assertContains(sql, "and UPPER(p.NAME_LAST) like");
        assertContains(sql, "order by id ASC");

        List<Person> list = sqlEngine.query(session, Person.class, pf, sqlControl);

        assertEquals(1, list.size());
        Person p = list.get(0);
        assertEquals(new Long(2), p.getId());
        assertEquals("1953-05-16", p.getBirthDate().toString());
        assertEquals(null, p.getCreatedDate());
        assertEquals(null, p.getCreatedBy());
        assertEquals("2006-12-08 00:00:00", sdf.format(p.getLastUpdated()));
        assertEquals("dbunit", p.getLastUpdatedBy());
        assertEquals(new Long(1), p.getVersion());
        assertEquals(Gender.MALE, p.getSex());
        assertNotNull(p.getSsn());
        assertEquals("123456", p.getSsn().getNumber());
        assertEquals(Country.UNITED_STATES, p.getSsn().getCountry());
        assertNotNull(p.getName());
        assertEquals("Pierce", p.getName().getFirst());
        assertEquals("Brosnan", p.getName().getLast());
    }
}
