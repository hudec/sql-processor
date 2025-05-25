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

public class TestCache extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/BasicTest.xml";
    }

    private static final String ID_FIRST_NAME_SEX_LAST_UPDATED_VERSION = "111";
    private static final String ID_FIRST_LAST_SSN_NAME_SEX_LAST_UPDATED_VERSION = "222";

    @Test
    public void testFormBasicCache() {
        SqlQueryEngine sqlEngine = getSqlEngine("FORM_BASIC_CACHE");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
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

        String sql = sqlEngine.getSql(
                pf,
                new SqlStandardControl().setOrder(SqlQueryEngine.ASC_ORDER).setProcessingId(
                        ID_FIRST_NAME_SEX_LAST_UPDATED_VERSION));
        logger.info(sql);
        assertContains(sql, "p.id =");
        assertContains(sql, "AND  p.NAME_FIRST =");
        assertContains(sql, "AND  p.SEX =");
        assertContains(sql, "AND  p.LASTUPDATEDBY =");
        assertContains(sql, "AND  p.VERSION =");
        assertContains(sql, "order by id ASC");

        List<Person> list = sqlEngine.query(
                session,
                Person.class,
                pf,
                new SqlStandardControl().setOrder(SqlQueryEngine.ASC_ORDER).setProcessingId(
                        ID_FIRST_NAME_SEX_LAST_UPDATED_VERSION));

        assertEquals(1, list.size());
        Person p = list.get(0);
        assertEquals(Long.valueOf(2), p.getId());
        assertEquals("1953-05-16", p.getBirthDate().toString());
        assertEquals(null, p.getCreatedDate());
        assertEquals(null, p.getCreatedBy());
        assertEquals("2006-12-08 00:00:00", sdf.format(p.getLastUpdated()));
        assertEquals("dbunit", p.getLastUpdatedBy());
        assertEquals(Long.valueOf(1), p.getVersion());
        assertEquals(Gender.MALE, p.getSex());
        assertNotNull(p.getSsn());
        assertEquals("123456", p.getSsn().getNumber());
        assertEquals(Country.UNITED_STATES, p.getSsn().getCountry());
        assertNotNull(p.getName());
        assertEquals("Pierce", p.getName().getFirst());
        assertEquals("Brosnan", p.getName().getLast());

        pf = new PersonForm();
        pf.setId(3L);
        pf.setName(new PersonNameForm());
        pf.getName().setFirst("Jan");
        pf.getName().setLast("Werich");
        pf.setSsn(new SsnForm());
        pf.getSsn().setNumber("234567");
        pf.setSex(Gender.MALE);
        pf.setLastUpdatedBy("dbunit");
        try {
            pf.setLastUpdated(sdf.parse("2006-12-09 00:00:00"));
        } catch (Exception ex) {
            fail();
        }
        pf.setVersion(1L);

        sql = sqlEngine.getSql(
                pf,
                new SqlStandardControl().setOrder(SqlQueryEngine.ASC_ORDER).setProcessingId(
                        ID_FIRST_LAST_SSN_NAME_SEX_LAST_UPDATED_VERSION));
        logger.info(sql);
        assertContains(sql, "p.id =");
        assertContains(sql, "AND  p.NAME_FIRST =");
        assertContains(sql, "AND  p.NAME_LAST =");
        assertContains(sql, "AND  p.SSN_NUMBER =");
        assertContains(sql, "AND  p.SEX =");
        assertContains(sql, "AND  p.LASTUPDATEDBY =");
        assertContains(sql, "AND  p.VERSION =");
        assertContains(sql, "order by id ASC");

        list = sqlEngine.query(session, Person.class, pf, new SqlStandardControl().setOrder(SqlQueryEngine.ASC_ORDER)
                .setProcessingId(ID_FIRST_LAST_SSN_NAME_SEX_LAST_UPDATED_VERSION));

        assertEquals(1, list.size());
        p = list.get(0);
        assertEquals(Long.valueOf(3), p.getId());
        assertEquals("1905-02-06", p.getBirthDate().toString());
        assertEquals(null, p.getCreatedDate());
        assertEquals(null, p.getCreatedBy());
        assertEquals("2006-12-09 00:00:00", sdf.format(p.getLastUpdated()));
        assertEquals("dbunit", p.getLastUpdatedBy());
        assertEquals(Long.valueOf(1), p.getVersion());
        assertEquals(Gender.MALE, p.getSex());
        assertNotNull(p.getSsn());
        assertEquals("234567", p.getSsn().getNumber());
        assertEquals(Country.CZECH_REPUBLIC, p.getSsn().getCountry());
        assertNotNull(p.getName());
        assertEquals("Jan", p.getName().getFirst());
        assertEquals("Werich", p.getName().getLast());
    }

    @Test
    public void testFormBasicCache2() {
        SqlQueryEngine sqlEngine = getSqlEngine("FORM_BASIC_2_CACHE");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
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

        String sql = sqlEngine.getSql(
                pf,
                new SqlStandardControl().setOrder(SqlQueryEngine.ASC_ORDER).setProcessingId(
                        ID_FIRST_NAME_SEX_LAST_UPDATED_VERSION));
        logger.info(sql);
        assertContains(sql, "p.id =");
        assertContains(sql, "AND  p.NAME_FIRST =");
        assertContains(sql, "AND  p.SEX =");
        assertContains(sql, "AND  p.LASTUPDATEDBY =");
        assertContains(sql, "AND  p.VERSION =");
        assertContains(sql, "order by id ASC");

        List<Person> list = sqlEngine.query(
                session,
                Person.class,
                pf,
                new SqlStandardControl().setOrder(SqlQueryEngine.ASC_ORDER).setProcessingId(
                        ID_FIRST_NAME_SEX_LAST_UPDATED_VERSION));

        assertEquals(1, list.size());
        Person p = list.get(0);
        assertEquals(Long.valueOf(2), p.getId());
        assertEquals("1953-05-16", p.getBirthDate().toString());
        assertEquals(null, p.getCreatedDate());
        assertEquals(null, p.getCreatedBy());
        assertEquals("2006-12-08 00:00:00", sdf.format(p.getLastUpdated()));
        assertEquals("dbunit", p.getLastUpdatedBy());
        assertEquals(Long.valueOf(1), p.getVersion());
        assertEquals(Gender.MALE, p.getSex());
        assertNotNull(p.getSsn());
        assertEquals("123456", p.getSsn().getNumber());
        assertEquals(Country.UNITED_STATES, p.getSsn().getCountry());
        assertNotNull(p.getName());
        assertEquals("Pierce", p.getName().getFirst());
        assertEquals("Brosnan", p.getName().getLast());

        pf = new PersonForm();
        pf.setId(3L);
        pf.setName(new PersonNameForm());
        pf.getName().setFirst("Jan");
        pf.getName().setLast("Werich");
        pf.setSsn(new SsnForm());
        pf.getSsn().setNumber("234567");
        pf.setSex(Gender.MALE);
        pf.setLastUpdatedBy("dbunit");
        try {
            pf.setLastUpdated(sdf.parse("2006-12-09 00:00:00"));
        } catch (Exception ex) {
            fail();
        }
        pf.setVersion(1L);

        sql = sqlEngine.getSql(
                pf,
                new SqlStandardControl().setOrder(SqlQueryEngine.ASC_ORDER).setProcessingId(
                        ID_FIRST_LAST_SSN_NAME_SEX_LAST_UPDATED_VERSION));
        logger.info(sql);
        assertContains(sql, "p.id =");
        assertContains(sql, "AND  p.NAME_FIRST =");
        assertContains(sql, "AND  p.NAME_LAST =");
        assertContains(sql, "AND  p.SSN_NUMBER =");
        assertContains(sql, "AND  p.SEX =");
        assertContains(sql, "AND  p.LASTUPDATEDBY =");
        assertContains(sql, "AND  p.VERSION =");
        assertContains(sql, "order by id ASC");

        list = sqlEngine.query(session, Person.class, pf, new SqlStandardControl().setOrder(SqlQueryEngine.ASC_ORDER)
                .setProcessingId(ID_FIRST_LAST_SSN_NAME_SEX_LAST_UPDATED_VERSION));

        assertEquals(1, list.size());
        p = list.get(0);
        assertEquals(Long.valueOf(3), p.getId());
        assertEquals("1905-02-06", p.getBirthDate().toString());
        assertEquals(null, p.getCreatedDate());
        assertEquals(null, p.getCreatedBy());
        assertEquals("2006-12-09 00:00:00", sdf.format(p.getLastUpdated()));
        assertEquals("dbunit", p.getLastUpdatedBy());
        assertEquals(Long.valueOf(1), p.getVersion());
        assertEquals(Gender.MALE, p.getSex());
        assertNotNull(p.getSsn());
        assertEquals("234567", p.getSsn().getNumber());
        assertEquals(Country.CZECH_REPUBLIC, p.getSsn().getCountry());
        assertNotNull(p.getName());
        assertEquals("Jan", p.getName().getFirst());
        assertEquals("Werich", p.getName().getLast());
    }
}
