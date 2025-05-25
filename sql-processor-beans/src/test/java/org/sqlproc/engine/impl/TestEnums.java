package org.sqlproc.engine.impl;

import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.form.PersonForm;
import org.sqlproc.engine.form.SsnForm;
import org.sqlproc.engine.model.Country;
import org.sqlproc.engine.model.Gender;
import org.sqlproc.engine.model.Person;
import org.sqlproc.engine.model.Size;

public class TestEnums extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/AdvancedTest.xml";
    }

    @Test
    public void testEnums() {
        SqlQueryEngine sqlEngine = getSqlEngine("ENUM");

        PersonForm pf = new PersonForm();
        pf.setSex(Gender.MALE);
        pf.setSsn(new SsnForm());
        pf.getSsn().setCountry(Country.UNITED_STATES);
        pf.setClothesSize(Size.MIDDLE);

        String sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND  p.SEX =");
        assertContains(sql, "AND  p.SSN_COUNTRY =");
        assertContains(sql, "AND  p.CLOTHES_SIZE =");

        List<Person> list = sqlEngine.query(session, Person.class, pf, pf, SqlQueryEngine.ASC_ORDER);

        assertTrue(list.size() > 0);
        Person p = list.get(0);
        assertEquals(Long.valueOf(2), p.getId());
        assertEquals(Gender.MALE, p.getSex());
        assertNotNull(p.getSsn());
        assertEquals("123456", p.getSsn().getNumber());
        assertEquals(Country.UNITED_STATES, p.getSsn().getCountry());
        assertEquals(Size.MIDDLE, p.getClothesSize());

        pf = new PersonForm();

        sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertDoNotContain(sql, "AND  p.SEX =");
        assertDoNotContain(sql, "AND  p.SSN_COUNTRY =");
        assertDoNotContain(sql, "AND  p.CLOTHES_SIZE =");

        list = sqlEngine.query(session, Person.class, pf, pf, SqlQueryEngine.ASC_ORDER);
    }

    @Test
    public void testEnums2() {
        SqlQueryEngine sqlEngine = getSqlEngine("ENUM_2");

        PersonForm pf = new PersonForm();
        pf.setSex(Gender.MALE);
        pf.setSsn(new SsnForm());
        pf.getSsn().setCountry(Country.UNITED_STATES);
        pf.setClothesSize(Size.MIDDLE);

        String sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND  p.SEX =");
        assertContains(sql, "AND  p.SSN_COUNTRY =");
        assertContains(sql, "AND  p.CLOTHES_SIZE =");

        List<Person> list = sqlEngine.query(session, Person.class, pf, pf, SqlQueryEngine.ASC_ORDER);

        assertTrue(list.size() > 0);
        Person p = list.get(0);
        assertEquals(Long.valueOf(2), p.getId());
        assertEquals(Gender.MALE, p.getSex());
        assertNotNull(p.getSsn());
        assertEquals("123456", p.getSsn().getNumber());
        assertEquals(Country.UNITED_STATES, p.getSsn().getCountry());
        assertEquals(Size.MIDDLE, p.getClothesSize());

        pf = new PersonForm();

        sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertDoNotContain(sql, "AND  p.SEX =");
        assertDoNotContain(sql, "AND  p.SSN_COUNTRY =");
        assertDoNotContain(sql, "AND  p.CLOTHES_SIZE =");

        list = sqlEngine.query(session, Person.class, pf, pf, SqlQueryEngine.ASC_ORDER);
    }

    @Test
    public void testEnumsIn() {
        SqlQueryEngine sqlEngine = getSqlEngine("ENUM_IN");

        PersonForm pf = new PersonForm();
        pf.setSexs(new HashSet<Gender>());
        pf.getSexs().add(Gender.MALE);
        pf.getSexs().add(Gender.FEMALE);
        pf.setSsn(new SsnForm());
        pf.getSsn().setCountries(new HashSet<Country>());
        pf.getSsn().getCountries().add(Country.CZECH_REPUBLIC);
        pf.getSsn().getCountries().add(Country.UNITED_STATES);
        pf.setClothesSizes(new HashSet<Size>());
        pf.getClothesSizes().add(Size.SMALL);
        pf.getClothesSizes().add(Size.MIDDLE);

        String sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND  p.SEX in ");
        assertContains(sql, "AND  p.SSN_COUNTRY in");
        assertContains(sql, "AND  p.CLOTHES_SIZE in");

        List<Person> list = sqlEngine.query(session, Person.class, pf, pf, SqlQueryEngine.ASC_ORDER);

        assertTrue(list.size() > 0);
        Person p = list.get(0);
        assertEquals(Long.valueOf(2), p.getId());
        assertEquals(Gender.MALE, p.getSex());
        assertNotNull(p.getSsn());
        assertEquals("123456", p.getSsn().getNumber());
        assertEquals(Country.UNITED_STATES, p.getSsn().getCountry());
        assertEquals(Size.MIDDLE, p.getClothesSize());

        pf = new PersonForm();

        sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertDoNotContain(sql, "AND  p.SEX in ");
        assertDoNotContain(sql, "AND  p.SSN_COUNTRY in");
        assertDoNotContain(sql, "AND  p.CLOTHES_SIZE in");

        list = sqlEngine.query(session, Person.class, pf, pf, SqlQueryEngine.ASC_ORDER);

        pf = new PersonForm();
        pf.setSexs(new HashSet<Gender>());
        pf.setSsn(new SsnForm());
        pf.getSsn().setCountries(new HashSet<Country>());
        pf.setClothesSizes(new HashSet<Size>());

        sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertDoNotContain(sql, "AND  p.SEX in ");
        assertDoNotContain(sql, "AND  p.SSN_COUNTRY in");
        assertDoNotContain(sql, "AND  p.CLOTHES_SIZE in");

        list = sqlEngine.query(session, Person.class, pf, pf, SqlQueryEngine.ASC_ORDER);
    }

    @Test
    public void testEnumsIn2() {
        SqlQueryEngine sqlEngine = getSqlEngine("ENUM_IN_2");

        PersonForm pf = new PersonForm();
        pf.setSexs(new HashSet<Gender>());
        pf.getSexs().add(Gender.MALE);
        pf.getSexs().add(Gender.FEMALE);
        pf.setSsn(new SsnForm());
        pf.getSsn().setCountries(new HashSet<Country>());
        pf.getSsn().getCountries().add(Country.CZECH_REPUBLIC);
        pf.getSsn().getCountries().add(Country.UNITED_STATES);
        pf.setClothesSizes(new HashSet<Size>());
        pf.getClothesSizes().add(Size.SMALL);
        pf.getClothesSizes().add(Size.MIDDLE);

        String sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "AND  p.SEX in ");
        assertContains(sql, "AND  p.SSN_COUNTRY in");
        assertContains(sql, "AND  p.CLOTHES_SIZE in");

        List<Person> list = sqlEngine.query(session, Person.class, pf, pf, SqlQueryEngine.ASC_ORDER);

        assertTrue(list.size() > 0);
        Person p = list.get(0);
        assertEquals(Long.valueOf(2), p.getId());
        assertEquals(Gender.MALE, p.getSex());
        assertNotNull(p.getSsn());
        assertEquals("123456", p.getSsn().getNumber());
        assertEquals(Country.UNITED_STATES, p.getSsn().getCountry());
        assertEquals(Size.MIDDLE, p.getClothesSize());

        pf = new PersonForm();

        sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertDoNotContain(sql, "AND  p.SEX in ");
        assertDoNotContain(sql, "AND  p.SSN_COUNTRY in");
        assertDoNotContain(sql, "AND  p.CLOTHES_SIZE in");

        list = sqlEngine.query(session, Person.class, pf, pf, SqlQueryEngine.ASC_ORDER);

        pf = new PersonForm();
        pf.setSexs(new HashSet<Gender>());
        pf.setSsn(new SsnForm());
        pf.getSsn().setCountries(new HashSet<Country>());
        pf.setClothesSizes(new HashSet<Size>());

        sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertDoNotContain(sql, "AND  p.SEX in ");
        assertDoNotContain(sql, "AND  p.SSN_COUNTRY in");
        assertDoNotContain(sql, "AND  p.CLOTHES_SIZE in");

        list = sqlEngine.query(session, Person.class, pf, pf, SqlQueryEngine.ASC_ORDER);
    }

    @Test
    public void testEnumsCondition() {
        SqlQueryEngine sqlEngine = getSqlEngine("ENUM_CONDITION");

        PersonForm pf = new PersonForm();
        pf.setSex(Gender.MALE);
        pf.setSsn(new SsnForm());
        pf.getSsn().setCountry(Country.UNITED_STATES);
        pf.setClothesSize(Size.MIDDLE);

        String sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "and p.SEX =");
        assertContains(sql, "and p.SSN_COUNTRY =");
        assertContains(sql, "and p.CLOTHES_SIZE =");

        List<Person> list = sqlEngine.query(session, Person.class, pf, pf, SqlQueryEngine.ASC_ORDER);

        assertTrue(list.size() > 0);
        Person p = list.get(0);
        assertEquals(Long.valueOf(2), p.getId());
        assertEquals(Gender.MALE, p.getSex());
        assertNotNull(p.getSsn());
        assertEquals("123456", p.getSsn().getNumber());
        assertEquals(Country.UNITED_STATES, p.getSsn().getCountry());
        assertEquals(Size.MIDDLE, p.getClothesSize());

        pf = new PersonForm();

        sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertDoNotContain(sql, "and p.SEX =");
        assertDoNotContain(sql, "and p.SSN_COUNTRY =");
        assertDoNotContain(sql, "and p.CLOTHES_SIZE =");

        list = sqlEngine.query(session, Person.class, pf, pf, SqlQueryEngine.ASC_ORDER);

        pf = new PersonForm();
        pf.setSex(Gender.FEMALE);
        pf.setSsn(new SsnForm());
        pf.getSsn().setCountry(Country.CZECH_REPUBLIC);
        pf.setClothesSize(Size.SMALL);

        sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertDoNotContain(sql, "and p.SEX =");
        assertDoNotContain(sql, "and p.SSN_COUNTRY =");
        assertDoNotContain(sql, "and p.CLOTHES_SIZE =");

        list = sqlEngine.query(session, Person.class, pf, pf, SqlQueryEngine.ASC_ORDER);
    }

    @Test
    public void testEnumsCondition2() {
        SqlQueryEngine sqlEngine = getSqlEngine("ENUM_CONDITION_2");

        PersonForm pf = new PersonForm();
        pf.setSex(Gender.MALE);
        pf.setSsn(new SsnForm());
        pf.getSsn().setCountry(Country.UNITED_STATES);
        pf.setClothesSize(Size.MIDDLE);

        String sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "and p.SEX =");
        assertContains(sql, "and p.SSN_COUNTRY =");
        assertContains(sql, "and p.CLOTHES_SIZE =");

        List<Person> list = sqlEngine.query(session, Person.class, pf, pf, SqlQueryEngine.ASC_ORDER);

        assertTrue(list.size() > 0);
        Person p = list.get(0);
        assertEquals(Long.valueOf(2), p.getId());
        assertEquals(Gender.MALE, p.getSex());
        assertNotNull(p.getSsn());
        assertEquals("123456", p.getSsn().getNumber());
        assertEquals(Country.UNITED_STATES, p.getSsn().getCountry());
        assertEquals(Size.MIDDLE, p.getClothesSize());

        pf = new PersonForm();

        sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertDoNotContain(sql, "and p.SEX =");
        assertDoNotContain(sql, "and p.SSN_COUNTRY =");
        assertDoNotContain(sql, "and p.CLOTHES_SIZE =");

        list = sqlEngine.query(session, Person.class, pf, pf, SqlQueryEngine.ASC_ORDER);

        pf = new PersonForm();
        pf.setSex(Gender.FEMALE);
        pf.setSsn(new SsnForm());
        pf.getSsn().setCountry(Country.CZECH_REPUBLIC);
        pf.setClothesSize(Size.SMALL);

        sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertDoNotContain(sql, "and p.SEX =");
        assertDoNotContain(sql, "and p.SSN_COUNTRY =");
        assertDoNotContain(sql, "and p.CLOTHES_SIZE =");

        list = sqlEngine.query(session, Person.class, pf, pf, SqlQueryEngine.ASC_ORDER);
    }

    @Test
    public void testEnumsCondition3() {
        SqlQueryEngine sqlEngine = getSqlEngine("ENUM_CONDITION_3");

        PersonForm pf = new PersonForm();
        pf.setSex(Gender.MALE);
        pf.setSsn(new SsnForm());
        pf.getSsn().setCountry(Country.UNITED_STATES);
        pf.setClothesSize(Size.MIDDLE);

        String sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "and p.SEX =");
        assertContains(sql, "and p.SSN_COUNTRY =");
        assertContains(sql, "and p.CLOTHES_SIZE =");

        List<Person> list = sqlEngine.query(session, Person.class, pf, pf, SqlQueryEngine.ASC_ORDER);

        assertTrue(list.size() > 0);
        Person p = list.get(0);
        assertEquals(Long.valueOf(2), p.getId());
        assertEquals(Gender.MALE, p.getSex());
        assertNotNull(p.getSsn());
        assertEquals("123456", p.getSsn().getNumber());
        assertEquals(Country.UNITED_STATES, p.getSsn().getCountry());
        assertEquals(Size.MIDDLE, p.getClothesSize());

        pf = new PersonForm();

        sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertDoNotContain(sql, "and p.SEX =");
        assertDoNotContain(sql, "and p.SSN_COUNTRY =");
        assertDoNotContain(sql, "and p.CLOTHES_SIZE =");

        list = sqlEngine.query(session, Person.class, pf, pf, SqlQueryEngine.ASC_ORDER);

        pf = new PersonForm();
        pf.setSex(Gender.FEMALE);
        pf.setSsn(new SsnForm());
        pf.getSsn().setCountry(Country.CZECH_REPUBLIC);
        pf.setClothesSize(Size.SMALL);

        sql = sqlEngine.getSql(pf, pf, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertDoNotContain(sql, "and p.SEX =");
        assertDoNotContain(sql, "and p.SSN_COUNTRY =");
        assertDoNotContain(sql, "and p.CLOTHES_SIZE =");

        list = sqlEngine.query(session, Person.class, pf, pf, SqlQueryEngine.ASC_ORDER);
    }
}
