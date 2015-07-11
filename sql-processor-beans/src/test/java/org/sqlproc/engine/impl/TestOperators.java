package org.sqlproc.engine.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.form.PersonForm;
import org.sqlproc.engine.form.PersonNameForm;
import org.sqlproc.engine.form.SsnForm;
import org.sqlproc.engine.model.Country;
import org.sqlproc.engine.model.Gender;
import org.sqlproc.engine.model.Person;

public class TestOperators extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/BasicTest.xml";
    }

    @Test
    public void testUndefinedOperators() {
        SqlQueryEngine sqlEngine = getSqlEngine("FORM_BASIC_OPERATOR");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();

        String sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        assertDoNotContain(sql, "WHERE");
        assertDoNotContain(sql, "AND");

        List<Person> list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(2, list.size());

        pf.setId(2L);
        pf.setName(new PersonNameForm());
        pf.getName().setFirst("Pierce");
        pf.setSex(Gender.MALE);
        pf.setLastUpdatedBy("dbunit");
        try {
            pf.setLastUpdated(sdf.parse("2006-12-08 00:00:00"));
        } catch (Exception ex) {
            fail();
        }
        pf.setVersion(1L);

        sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "p.id =");
        assertContains(sql, "AND  p.NAME_FIRST =");
        assertContains(sql, "AND  p.SEX =");
        assertContains(sql, "AND  p.LASTUPDATEDBY =");
        assertContains(sql, "AND  p.VERSION =");
        assertContains(sql, "order by id ASC");

        list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

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

    @Test
    public void testDefaultOperators() {
        SqlQueryEngine sqlEngine = getSqlEngine("FORM_BASIC_OPERATOR");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
        PersonForm spf = new PersonForm();

        String sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        assertDoNotContain(sql, "WHERE");
        assertDoNotContain(sql, "AND");

        List<Person> list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(2, list.size());
        // for (Person p : list)
        // System.out.println(p.toString());

        pf.setId(2L);
        pf.setName(new PersonNameForm());
        pf.getName().setFirst("PierceX");
        pf.getName().setFirstOp("<>");
        pf.setSsn(new SsnForm());
        pf.getSsn().setCountry(Country.CZECH_REPUBLIC);
        spf.setSsn(new SsnForm());
        spf.getSsn().setCountryOp("<>");
        pf.setLastUpdatedBy("dbunit");
        try {
            pf.setLastUpdated(sdf.parse("2006-12-08 00:00:00"));
        } catch (Exception ex) {
            fail();
        }
        pf.setVersion(1L);

        sql = sqlEngine.getSql(pf, spf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "p.id =");
        assertContains(sql, "AND  p.NAME_FIRST <>");
        assertContains(sql, "AND  p.SSN_COUNTRY <>");
        assertContains(sql, "AND  p.LASTUPDATEDBY =");
        assertContains(sql, "AND  p.VERSION =");
        assertContains(sql, "order by id ASC");

        list = sqlEngine.query(session, Person.class, pf, spf, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

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

    @Test
    public void testSpecifiedOperators() {
        SqlQueryEngine sqlEngine = getSqlEngine("FORM_BASIC_OPERATOR_2");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
        PersonForm spf = new PersonForm();

        String sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        assertDoNotContain(sql, "WHERE");
        assertDoNotContain(sql, "AND");

        List<Person> list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(2, list.size());
        // for (Person p : list)
        // System.out.println(p.toString());

        pf.setId(2L);
        pf.setName(new PersonNameForm());
        pf.setSsn(new SsnForm());
        pf.getSsn().setNumber("1234567");
        pf.getSsn().setNumberOp1("<>");
        pf.setSex(Gender.FEMALE);
        spf.setSexOp1("<>");
        pf.setLastUpdatedBy("dbunit");
        try {
            pf.setLastUpdated(sdf.parse("2006-12-08 00:00:00"));
        } catch (Exception ex) {
            fail();
        }
        pf.setVersion(1L);

        sql = sqlEngine.getSql(pf, spf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "p.id =");
        assertContains(sql, "AND  p.SEX <>");
        assertContains(sql, "AND  p.SSN_NUMBER <>");
        assertContains(sql, "AND  p.LASTUPDATEDBY =");
        assertContains(sql, "AND  p.VERSION =");
        assertContains(sql, "order by id ASC");

        list = sqlEngine.query(session, Person.class, pf, spf, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

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

    @Test
    public void testDefaultMapOperators() {
        SqlQueryEngine sqlEngine = getSqlEngine("FORM_BASIC_OPERATOR");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
        PersonForm spf = new PersonForm();

        String sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        assertDoNotContain(sql, "WHERE");
        assertDoNotContain(sql, "AND");

        List<Person> list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(2, list.size());
        // for (Person p : list)
        // System.out.println(p.toString());

        pf.setId(2L);
        pf.setName(new PersonNameForm());
        pf.getName().setFirst("PierceX");
        pf.getName().setOp(new HashMap<String, String>());
        pf.getName().getOp().put("first", "<>");
        pf.setSsn(new SsnForm());
        pf.getSsn().setCountry(Country.CZECH_REPUBLIC);
        spf.setSsn(new SsnForm());
        spf.getSsn().setOp(new HashMap<String, String>());
        spf.getSsn().getOp().put("country", "<>");
        pf.setLastUpdatedBy("dbunit");
        try {
            pf.setLastUpdated(sdf.parse("2006-12-08 00:00:00"));
        } catch (Exception ex) {
            fail();
        }
        pf.setVersion(1L);

        sql = sqlEngine.getSql(pf, spf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "p.id =");
        assertContains(sql, "AND  p.NAME_FIRST <>");
        assertContains(sql, "AND  p.SSN_COUNTRY <>");
        assertContains(sql, "AND  p.LASTUPDATEDBY =");
        assertContains(sql, "AND  p.VERSION =");
        assertContains(sql, "order by id ASC");

        list = sqlEngine.query(session, Person.class, pf, spf, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

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

    @Test
    public void testSpecifiedMapOperators() {
        SqlQueryEngine sqlEngine = getSqlEngine("FORM_BASIC_OPERATOR_2");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
        PersonForm spf = new PersonForm();

        String sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        assertDoNotContain(sql, "WHERE");
        assertDoNotContain(sql, "AND");

        List<Person> list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(2, list.size());
        // for (Person p : list)
        // System.out.println(p.toString());

        pf.setId(2L);
        pf.setName(new PersonNameForm());
        pf.setSsn(new SsnForm());
        pf.getSsn().setNumber("1234567");
        pf.getSsn().setOp1(new HashMap<String, String>());
        pf.getSsn().getOp1().put("number", "<>");
        pf.setSex(Gender.FEMALE);
        spf.setOp1(new HashMap<String, String>());
        spf.getOp1().put("sex", "<>");
        pf.setLastUpdatedBy("dbunit");
        try {
            pf.setLastUpdated(sdf.parse("2006-12-08 00:00:00"));
        } catch (Exception ex) {
            fail();
        }
        pf.setVersion(1L);

        sql = sqlEngine.getSql(pf, spf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "p.id =");
        assertContains(sql, "AND  p.SEX <>");
        assertContains(sql, "AND  p.SSN_NUMBER <>");
        assertContains(sql, "AND  p.LASTUPDATEDBY =");
        assertContains(sql, "AND  p.VERSION =");
        assertContains(sql, "order by id ASC");

        list = sqlEngine.query(session, Person.class, pf, spf, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

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

    @Test
    public void testDefaultMapDefaultOperators() {
        SqlQueryEngine sqlEngine = getSqlEngine("FORM_BASIC_OPERATOR");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
        PersonForm spf = new PersonForm();

        String sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        assertDoNotContain(sql, "WHERE");
        assertDoNotContain(sql, "AND");

        List<Person> list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(2, list.size());
        // for (Person p : list)
        // System.out.println(p.toString());

        pf.setId(2L);
        pf.setName(new PersonNameForm());
        pf.getName().setFirst("PierceX");
        pf.getName().setOperators(new HashMap<String, String>());
        pf.getName().getOperators().put("first", "<>");
        pf.setSsn(new SsnForm());
        pf.getSsn().setCountry(Country.CZECH_REPUBLIC);
        spf.setSsn(new SsnForm());
        spf.getSsn().setOperators(new HashMap<String, String>());
        spf.getSsn().getOperators().put("country", "<>");
        pf.setLastUpdatedBy("dbunit");
        try {
            pf.setLastUpdated(sdf.parse("2006-12-08 00:00:00"));
        } catch (Exception ex) {
            fail();
        }
        pf.setVersion(1L);

        sql = sqlEngine.getSql(pf, spf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "p.id =");
        assertContains(sql, "AND  p.NAME_FIRST <>");
        assertContains(sql, "AND  p.SSN_COUNTRY <>");
        assertContains(sql, "AND  p.LASTUPDATEDBY =");
        assertContains(sql, "AND  p.VERSION =");
        assertContains(sql, "order by id ASC");

        list = sqlEngine.query(session, Person.class, pf, spf, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

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

    @Test
    public void testSpecifiedMapDefaultOperators() {
        SqlQueryEngine sqlEngine = getSqlEngine("FORM_BASIC_OPERATOR_2");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
        PersonForm spf = new PersonForm();

        String sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        assertDoNotContain(sql, "WHERE");
        assertDoNotContain(sql, "AND");

        List<Person> list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(2, list.size());
        // for (Person p : list)
        // System.out.println(p.toString());

        pf.setId(2L);
        pf.setName(new PersonNameForm());
        pf.setSsn(new SsnForm());
        pf.getSsn().setNumber("1234567");
        pf.getSsn().setOperators(new HashMap<String, String>());
        pf.getSsn().getOperators().put("number", "<>");
        pf.setSex(Gender.FEMALE);
        spf.setOperators(new HashMap<String, String>());
        spf.getOperators().put("sex", "<>");
        pf.setLastUpdatedBy("dbunit");
        try {
            pf.setLastUpdated(sdf.parse("2006-12-08 00:00:00"));
        } catch (Exception ex) {
            fail();
        }
        pf.setVersion(1L);

        sql = sqlEngine.getSql(pf, spf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "p.id =");
        assertContains(sql, "AND  p.SEX <>");
        assertContains(sql, "AND  p.SSN_NUMBER <>");
        assertContains(sql, "AND  p.LASTUPDATEDBY =");
        assertContains(sql, "AND  p.VERSION =");
        assertContains(sql, "order by id ASC");

        list = sqlEngine.query(session, Person.class, pf, spf, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

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

    @Test
    public void testDefaultNullOperators() {
        SqlQueryEngine sqlEngine = getSqlEngine("FORM_BASIC_OPERATOR");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
        PersonForm spf = new PersonForm();

        String sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        assertDoNotContain(sql, "WHERE");
        assertDoNotContain(sql, "AND");

        List<Person> list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(2, list.size());
        // for (Person p : list)
        // System.out.println(p.toString());

        pf.setId(2L);
        pf.setName(new PersonNameForm());
        // pf.getName().setFirst("PierceX");
        pf.getName().setFirstOp("is null");
        pf.setSsn(new SsnForm());
        // pf.getSsn().setCountry(Country.CZECH_REPUBLIC);
        spf.setSsn(new SsnForm());
        spf.getSsn().setCountryOp("is null");
        pf.setLastUpdatedBy("dbunit");
        try {
            pf.setLastUpdated(sdf.parse("2006-12-08 00:00:00"));
        } catch (Exception ex) {
            fail();
        }
        pf.setVersion(1L);

        sql = sqlEngine.getSql(pf, spf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "p.id =");
        assertContains(sql, "AND  p.NAME_FIRST is null");
        assertContains(sql, "AND  p.SSN_COUNTRY is null");
        assertContains(sql, "AND  p.LASTUPDATEDBY =");
        assertContains(sql, "AND  p.VERSION =");
        assertContains(sql, "order by id ASC");

        list = sqlEngine.query(session, Person.class, pf, spf, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(0, list.size());
    }

    @Test
    public void testDefaultMapNullOperators() {
        SqlQueryEngine sqlEngine = getSqlEngine("FORM_BASIC_OPERATOR");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
        PersonForm spf = new PersonForm();

        String sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        assertDoNotContain(sql, "WHERE");
        assertDoNotContain(sql, "AND");

        List<Person> list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(2, list.size());
        // for (Person p : list)
        // System.out.println(p.toString());

        pf.setId(2L);
        pf.setName(new PersonNameForm());
        // pf.getName().setFirst("PierceX");
        pf.getName().setOp(new HashMap<String, String>());
        pf.getName().getOp().put("first", "is null");
        pf.setSsn(new SsnForm());
        // pf.getSsn().setCountry(Country.CZECH_REPUBLIC);
        spf.setSsn(new SsnForm());
        spf.getSsn().setOp(new HashMap<String, String>());
        spf.getSsn().getOp().put("country", "is null");
        pf.setLastUpdatedBy("dbunit");
        try {
            pf.setLastUpdated(sdf.parse("2006-12-08 00:00:00"));
        } catch (Exception ex) {
            fail();
        }
        pf.setVersion(1L);

        sql = sqlEngine.getSql(pf, spf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "p.id =");
        assertContains(sql, "AND  p.NAME_FIRST is null");
        assertContains(sql, "AND  p.SSN_COUNTRY is null");
        assertContains(sql, "AND  p.LASTUPDATEDBY =");
        assertContains(sql, "AND  p.VERSION =");
        assertContains(sql, "order by id ASC");

        list = sqlEngine.query(session, Person.class, pf, spf, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(0, list.size());
    }
}
