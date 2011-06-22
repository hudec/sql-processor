package org.sqlproc.engine.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlOrder;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.form.PersonForm;
import org.sqlproc.engine.form.PersonNameForm;
import org.sqlproc.engine.model.Country;
import org.sqlproc.engine.model.Gender;
import org.sqlproc.engine.model.Person;

public class TestBasic extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/BasicTest.xml";
    }

    @Test
    public void testAnsiBasic() {
        SqlQueryEngine sqlEngine = getSqlEngine("ANSI_BASIC");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "p.ID, p.NAME_FIRST first, p.NAME_LAST last, p.SSN_NUMBER ssn, p.SSN_COUNTRY country");
        assertContains(sql, "p.BIRTHDATE, p.SEX, p.CREATEDDATE, p.CREATEDBY, p.LASTUPDATED, p.LASTUPDATEDBY, p.VERSION");
        assertContains(sql, "from PERSON p");
        assertContains(sql, "order by p.ID");

        List<Person> list = sqlEngine.query(session, Person.class);

        assertEquals(2, list.size());
        Person p = list.get(0);
        assertEquals(new Long(2), p.getId());
        assertEquals("1953-05-16", p.getBirthDate().toString());
        assertEquals(null, p.getCreatedDate());
        assertEquals(null, p.getCreatedBy());
        assertEquals("2006-12-08", p.getLastUpdated().toString());
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
    public void testAnsiSqlExtBasic() {
        SqlQueryEngine sqlEngine = getSqlEngine("SQL_EXT_BASIC");

        PersonForm pf = new PersonForm();
        pf.setName(new PersonNameForm());
        pf.getName().setLast("Brosnan");

        PersonForm pfc = new PersonForm();
        pfc.setName(new PersonNameForm());
        pfc.getName().setFirst("Pierce");

        String sql = sqlEngine.getSql(pf, pfc, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "'pierce' first");
        assertContains(sql, ":name_last last", " last");

        List<Person> list = sqlEngine.query(session, Person.class, pf, pfc, 0, 0);

        assertEquals(2, list.size());
        Person p = list.get(0);
        assertEquals(new Long(2), p.getId());
        assertEquals("pierce", p.getName().getFirst());
        assertEquals("BROSNAN", p.getName().getLast());
    }

    @Test
    public void testBasic() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "p.ID, p.NAME_FIRST first, p.NAME_LAST last, p.SSN_NUMBER ssn, p.SSN_COUNTRY country,");
        assertContains(sql, "p.BIRTHDATE, p.SEX, p.CREATEDDATE, p.CREATEDBY, p.LASTUPDATED, p.LASTUPDATEDBY, p.VERSION");
        assertContains(sql, "from PERSON p");
        assertContains(sql, "order by id ASC");

        List<Person> list = sqlEngine.query(session, Person.class, null, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(2, list.size());
        Person p = list.get(0);
        assertEquals(new Long(2), p.getId());
        assertEquals("1953-05-16", p.getBirthDate().toString());
        assertEquals(null, p.getCreatedDate());
        assertEquals(null, p.getCreatedBy());
        assertEquals("2006-12-08", p.getLastUpdated().toString());
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
    public void testFormBasic() {
        SqlQueryEngine sqlEngine = getSqlEngine("FORM_BASIC");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
        pf.setId(2L);
        pf.setName(new PersonNameForm());
        pf.getName().setFirst("Pierce");
        // pf.getName().setLast("Brosnan");
        // pf.setSsn(new Ssn());
        // pf.getSsn().setNumber("123456");
        // pf.getSsn().setCountry("us");
        // try { pf.setBirthDate(sdf.parse("1953-05-16 00:00:00"); } catch
        // (Exception ex) {fail();}
        pf.setSex(Gender.MALE);
        pf.setLastUpdatedBy("dbunit");
        try {
            pf.setLastUpdated(sdf.parse("2006-12-08 00:00:00"));
        } catch (Exception ex) {
            fail();
        }
        pf.setVersion(1L);

        String sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND  p.id =");
        assertContains(sql, "AND  p.NAME_FIRST =");
        // assertContains(sql, "AND  p.NAME_LAST =");
        // assertContains(sql, "AND  p.SSN_NUMBER =");
        // assertContains(sql, "p.SSN_COUNTRY =");
        assertContains(sql, "AND  p.SEX =");
        // assertContains(sql, "AND  p.LASTUPDATED =");
        assertContains(sql, "AND  p.LASTUPDATEDBY =");
        // assertContains(sql, "AND  p.BIRTHDATE =");
        assertContains(sql, "AND  p.VERSION =");
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
    }

    @Test
    public void testFormBasicNull() {
        SqlQueryEngine sqlEngine = getSqlEngine("FORM_BASIC");

        PersonForm pf = new PersonForm();
        pf.setId(9999L);
        String sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        List<Person> list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(0, list.size());
    }

    @Test
    public void testFormOrBasic() {
        SqlQueryEngine sqlEngine = getSqlEngine("FORM_OR_BASIC");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
        pf.setId(2L);
        pf.setName(new PersonNameForm());
        pf.getName().setFirst("Jan");
        // pf.getName().setLast("Brosnan");
        // pf.setSsn(new Ssn());
        // pf.getSsn().setNumber("123456");
        // pf.getSsn().setCountry("us");
        // try { pf.setBirthDate(sdf.parse("1953-05-16 00:00:00"); } catch
        // (Exception ex) {fail();}
        pf.setSex(Gender.MALE);
        pf.setLastUpdatedBy("dbunit");
        try {
            pf.setLastUpdated(sdf.parse("2006-12-08 00:00:00"));
        } catch (Exception ex) {
            fail();
        }
        pf.setVersion(1L);

        String sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND  p.id =");
        assertContains(sql, "OR  p.NAME_FIRST =");
        // assertContains(sql, "AND  p.NAME_LAST =");
        // assertContains(sql, "AND  p.SSN_NUMBER =");
        // assertContains(sql, "p.SSN_COUNTRY =");
        assertContains(sql, "OR  p.SEX =");
        // assertContains(sql, "AND  p.LASTUPDATED =");
        assertContains(sql, "OR  p.LASTUPDATEDBY =");
        // assertContains(sql, "AND  p.BIRTHDATE =");
        // assertContains(sql, "AND  p.VERSION =");
        assertContains(sql, "order by id ASC");

        List<Person> list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(2, list.size());
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
    public void testConstantBasic() {
        SqlQueryEngine sqlEngine = getSqlEngine("CONSTANT_BASIC");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
        pf.setId(2L);
        pf.setName(new PersonNameForm());
        pf.getName().setFirst("Pierce");
        // pf.getName().setLast("Brosnan");
        // pf.setSsn(new Ssn());
        // pf.getSsn().setNumber("123456");
        // pf.getSsn().setCountry("us");
        // try { pf.setBirthDate(sdf.parse("1953-05-16 00:00:00"); } catch
        // (Exception ex) {fail();}
        pf.setSex(Gender.MALE);
        pf.setLastUpdatedBy("dbunit");
        try {
            pf.setLastUpdated(sdf.parse("2006-12-08 00:00:00"));
        } catch (Exception ex) {
            fail();
        }
        pf.setVersion(1L);

        String sql = sqlEngine.getSql(new Object(), pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND  p.id =");
        assertContains(sql, "AND  p.NAME_FIRST =");
        // assertContains(sql, "AND  p.NAME_LAST =");
        // assertContains(sql, "AND  p.SSN_NUMBER =");
        // assertContains(sql, "p.SSN_COUNTRY =");
        assertContains(sql, "AND  p.SEX =");
        // assertContains(sql, "AND  p.LASTUPDATED =");
        assertContains(sql, "AND  p.LASTUPDATEDBY =");
        // assertContains(sql, "AND  p.BIRTHDATE =");
        assertContains(sql, "AND  p.VERSION =");
        assertContains(sql, "order by id ASC");

        List<Person> list = sqlEngine.query(session, Person.class, new Object(), pf, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

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
    public void testConstantOrBasic() {
        SqlQueryEngine sqlEngine = getSqlEngine("CONSTANT_OR_BASIC");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
        pf.setId(2L);
        pf.setName(new PersonNameForm());
        pf.getName().setFirst("Jan");
        // pf.getName().setLast("Brosnan");
        // pf.setSsn(new Ssn());
        // pf.getSsn().setNumber("123456");
        // pf.getSsn().setCountry("us");
        // try { pf.setBirthDate(sdf.parse("1953-05-16 00:00:00"); } catch
        // (Exception ex) {fail();}
        pf.setSex(Gender.MALE);
        pf.setLastUpdatedBy("dbunit");
        try {
            pf.setLastUpdated(sdf.parse("2006-12-08 00:00:00"));
        } catch (Exception ex) {
            fail();
        }
        pf.setVersion(1L);

        String sql = sqlEngine.getSql(new Object(), pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND  p.id =");
        assertContains(sql, "OR  p.NAME_FIRST =");
        // assertContains(sql, "AND  p.NAME_LAST =");
        // assertContains(sql, "AND  p.SSN_NUMBER =");
        // assertContains(sql, "p.SSN_COUNTRY =");
        assertContains(sql, "OR  p.SEX =");
        // assertContains(sql, "AND  p.LASTUPDATED =");
        assertContains(sql, "OR  p.LASTUPDATEDBY =");
        // assertContains(sql, "AND  p.BIRTHDATE =");
        // assertContains(sql, "AND  p.VERSION =");
        assertContains(sql, "order by id ASC");

        List<Person> list = sqlEngine.query(session, Person.class, new Object(), pf, SqlQueryEngine.ASC_ORDER, 0, 0, 0);

        assertEquals(2, list.size());
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
    public void testConstantInAndOrderBasic() {
        SqlQueryEngine sqlEngine = getSqlEngine("CONSTANT_IN_ORDER_BASIC");

        PersonForm pf = new PersonForm();
        pf.setIdSet(new HashSet<Long>());
        pf.getIdSet().add(1L);
        pf.getIdSet().add(2L);

        String sql = sqlEngine.getSql(new Object(), pf, SqlOrder.getAscOrder(2));
        logger.info(sql);
        assertContains(sql, "AND  p.id in (1,2)");
        assertContains(sql, "order by NAME_FIRST ASC");

        List<Person> list = sqlEngine.query(session, Person.class, new Object(), pf, SqlOrder.getAscOrder(2), 0, 0, 0);

        assertEquals(1, list.size());
        Person p = list.get(0);
        assertEquals(new Long(2), p.getId());
    }

    @Test
    public void testIdentifierAndConstantOutOfMetaSqlBasic() {
        SqlQueryEngine sqlEngine = getSqlEngine("INDENT_AND_CONSTANT_OUT_OF_META_SQL_BASIC");

        PersonForm pf = new PersonForm();
        pf.setName(new PersonNameForm());
        pf.getName().setLast("Brosnan");

        PersonForm pfc = new PersonForm();
        pfc.setName(new PersonNameForm());
        pfc.getName().setFirst("Pierce");

        String sql = sqlEngine.getSql(pf, pfc, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "'Pierce' first");
        assertContains(sql, ":name_last last", " last");
        assertContains(sql, "order by id ASC");

        List<Person> list = sqlEngine.query(session, Person.class, pf, pfc, 0, 0);

        assertEquals(2, list.size());
        Person p = list.get(0);
        assertEquals(new Long(2), p.getId());
        assertEquals("Pierce", p.getName().getFirst());
        assertEquals("Brosnan", p.getName().getLast());
    }

    @Test
    public void testSqlInBracesBasic() {
        SqlQueryEngine sqlEngine = getSqlEngine("SQL_IN_BRACES_BASIC");

        PersonForm pf = new PersonForm();
        pf.setName(new PersonNameForm());
        pf.getName().setLast("Brosnan");

        PersonForm pfc = new PersonForm();
        pfc.setName(new PersonNameForm());
        pfc.getName().setFirst("Pierce");

        String sql = sqlEngine.getSql(pf, pfc, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "'Pierce' first");
        assertContains(sql, ":name_last last", " last");
        assertContains(sql, "p.SSN_NUMBER");
        assertContains(sql, "p.BIRTHDATE");

        List<Person> list = sqlEngine.query(session, Person.class, pf, pfc, 0, 0);

        assertEquals(2, list.size());
        Person p = list.get(0);
        assertEquals(new Long(2), p.getId());
        assertEquals("Pierce", p.getName().getFirst());
        assertEquals("BROSNAN", p.getName().getLast());

        sql = sqlEngine.getSql(null, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertDoNotContain(sql, "'Pierce' first");
        assertDoNotContain(sql, ":name_last last");
        assertEquals("Pierce", p.getName().getFirst());
        assertEquals("BROSNAN", p.getName().getLast());

        list = sqlEngine.query(session, Person.class, null, null, 0, 0);

        assertEquals(2, list.size());
        p = list.get(0);
        assertEquals(new Long(2), p.getId());
        if (p.getName() != null) {
            assertEquals("", p.getName().getFirst());
            assertEquals("", p.getName().getLast());
        }
        assertEquals("123456", p.getSsn().getNumber());
        assertTrue(p.getAge().intValue() >= 57);
    }

    @Test
    public void testNullFormBasic() {
        SqlQueryEngine sqlEngine = getSqlEngine("ANSI_BASIC");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "p.ID, p.NAME_FIRST first, p.NAME_LAST last, p.SSN_NUMBER ssn, p.SSN_COUNTRY country");
        assertContains(sql, "p.BIRTHDATE, p.SEX, p.CREATEDDATE, p.CREATEDBY, p.LASTUPDATED, p.LASTUPDATEDBY, p.VERSION");
        assertContains(sql, "from PERSON p");
        assertContains(sql, "order by p.ID");

        List<Person> list = sqlEngine.query(session, Person.class, null);

        assertEquals(2, list.size());
        Person p = list.get(0);
        assertEquals(new Long(2), p.getId());
        assertEquals("1953-05-16", p.getBirthDate().toString());
        assertEquals(null, p.getCreatedDate());
        assertEquals(null, p.getCreatedBy());
        assertEquals("2006-12-08", p.getLastUpdated().toString());
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
