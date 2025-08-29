package org.sqlproc.engine.impl;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.model.Country;
import org.sqlproc.engine.model.Engagement;
import org.sqlproc.engine.model.Gender;
import org.sqlproc.engine.model.Person;
import org.sqlproc.engine.model.Person2;
import org.sqlproc.engine.model.PersonName;
import org.sqlproc.engine.model.Size;
import org.sqlproc.engine.model.Ssn;

public class TestBatch extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/JoinsTest.xml";
    }

    @Test
    public void testInsertEmpty2() {
        if ("oracle".equalsIgnoreCase(dbType) || "mssql".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setId(3L);
        p.setSsn(new Ssn());
        p.getSsn().setNumber("111");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        p.setCreatedDate(new Date());
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);
        Person pp = new Person();
        pp.setId(4L);
        pp.setSsn(new Ssn());
        pp.getSsn().setNumber("222");
        pp.getSsn().setCountry(Country.UNITED_STATES);
        pp.setName(new PersonName());
        pp.getName().setFirst("");
        pp.getName().setLast("Stephens2");
        pp.setAge(1969, 4, 21);
        pp.setSex(Gender.MALE);
        pp.setCreatedDate(new Date());
        pp.setCreatedBy("wlado");
        pp.setVersion(1L);
        pp.setClothesSize(Size.MIDDLE);
        List<Person> ps = java.util.Arrays.asList(p, pp);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_8");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);

        Integer[] count = crudEngine.batchInsert(session, ps);
        assertEquals(2, count.length);
        assertEquals(1, count[0].intValue());
        assertEquals(1, count[1].intValue());
        logger.info("new id: " + p.getId());
        assertNotNull(p.getId());

        Person p2 = new Person();
        p2.setId(p.getId());
        list = sqlEngine.query(session, Person.class, p2);
        assertEquals(1, list.size());
        Person p3 = list.get(0);
        assertEquals("", p3.getName().getFirst());
        assertEquals("Stephens", p3.getName().getLast());
        p2 = new Person();
        p2.setId(pp.getId());
        list = sqlEngine.query(session, Person.class, p2);
        assertEquals(1, list.size());
        p3 = list.get(0);
        assertEquals("", p3.getName().getFirst());
        assertEquals("Stephens2", p3.getName().getLast());
    }

    @Test
    public void testInsertEmpty() {
        if ("oracle".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setId(3L);
        p.setSsn(new Ssn());
        p.getSsn().setNumber("111");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        p.setCreatedDate(new Date());
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        Person pp = new Person();
        pp.setId(4L);
        pp.setSsn(new Ssn());
        pp.getSsn().setNumber("222");
        pp.getSsn().setCountry(Country.UNITED_STATES);
        pp.setName(new PersonName());
        pp.getName().setFirst("");
        pp.getName().setLast("Stephens2");
        pp.setAge(1969, 4, 21);
        pp.setSex(Gender.MALE);
        pp.setCreatedDate(new Date());
        pp.setCreatedBy("wlado");
        pp.setVersion(1L);
        pp.setClothesSize(Size.MIDDLE);

        List<Person> ps = java.util.Arrays.asList(p, pp);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);

        Integer[] count = crudEngine.batchInsert(session, ps);
        assertEquals(2, count.length);
        assertEquals(1, count[0].intValue());
        assertEquals(1, count[1].intValue());
        logger.info("new id p: " + p.getId());
        logger.info("new id pp: " + pp.getId());
        assertNotNull(p.getId());
        assertNotNull(pp.getId());

        // Verify first person
        Person p2 = new Person();
        p2.setId(p.getId());
        list = sqlEngine.query(session, Person.class, p2);
        assertEquals(1, list.size());
        Person p3 = list.get(0);
        assertEquals("", p3.getName().getFirst());
        assertEquals("Stephens", p3.getName().getLast());

        // Verify second person
        p2 = new Person();
        p2.setId(pp.getId());
        list = sqlEngine.query(session, Person.class, p2);
        assertEquals(1, list.size());
        p3 = list.get(0);
        assertEquals("", p3.getName().getFirst());
        assertEquals("Stephens2", p3.getName().getLast());
    }

    @Test
    public void testGetNull() {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_PERSON");

        Person p = new Person();
        p.setId(9999L);

        Person person2 = sqlEngine.get(session, Person.class, p);
        assertNull(person2);
    }

    @Test
    public void testDelete3() {
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        Person p = new Person();

        List<Person> list = sqlEngine.query(session, Person.class, p);
        assertEquals(2, list.size());

        SqlCrudEngine crudEngine = getCrudEngine("DELETE_PERSON_3");

        p.setId(list.get(0).getId());
        String sql = crudEngine.getDeleteSql(p, p);
        logger.info(sql);
        assertContains(sql, "delete from PERSON");
        assertContains(sql, "WHERE ID = :id", "WHERE ID = ?");
        assertContains(sql, "AND LASTUPDATEDBY is null");

        int count = crudEngine.delete(session, p);
        assertEquals(1, count);

        list = sqlEngine.query(session, Person.class);
        assertEquals(1, list.size());

        try {
            count = crudEngine.delete(session, null);
            fail();
        } catch (IllegalArgumentException e) {
            assertContains(e.getMessage(), "notnull");
        }
    }

    @Test
    public void testDelete4() {
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        Person p = new Person();

        List<Person> list = sqlEngine.query(session, Person.class, p);
        assertEquals(2, list.size());

        SqlCrudEngine crudEngine = getCrudEngine("DELETE_PERSON_4");

        p.setId(list.get(0).getId());
        String sql = crudEngine.getDeleteSql(p, p);
        logger.info(sql);
        assertContains(sql, "delete from PERSON");
        assertContains(sql, "WHERE ID = :id", "WHERE ID = ?");
        assertContains(sql, "AND LASTUPDATEDBY is null");

        int count = crudEngine.delete(session, p);
        assertEquals(1, count);

        list = sqlEngine.query(session, Person.class);
        assertEquals(1, list.size());

        try {
            count = crudEngine.delete(session, null);
            fail();
        } catch (IllegalArgumentException e) {
            assertContains(e.getMessage(), "notnull");
        }
    }

    @Test
    public void testDelete5() {
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        Person p = new Person();

        List<Person> list = sqlEngine.query(session, Person.class, p);
        assertEquals(2, list.size());

        SqlCrudEngine crudEngine = getCrudEngine("DELETE_PERSON_5");

        p.setId(list.get(0).getId());
        String sql = crudEngine.getDeleteSql(p, p);
        logger.info(sql);
        assertContains(sql, "delete from PERSON");
        assertContains(sql, "WHERE ID = :id", "WHERE ID = ?");
        assertContains(sql, "AND LASTUPDATEDBY is null");

        int count = crudEngine.delete(session, p);
        assertEquals(1, count);

        list = sqlEngine.query(session, Person.class);
        assertEquals(1, list.size());

        try {
            count = crudEngine.delete(session, null);
            fail();
        } catch (IllegalArgumentException e) {
            assertContains(e.getMessage(), "notempty");
        }
    }

    @Test
    public void testDelete6() {
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        Person p = new Person();

        List<Person> list = sqlEngine.query(session, Person.class, p);
        assertEquals(2, list.size());

        SqlCrudEngine crudEngine = getCrudEngine("DELETE_PERSON_6");

        p.setId(list.get(0).getId());
        String sql = crudEngine.getDeleteSql(p, p);
        logger.info(sql);
        assertContains(sql, "delete from PERSON");
        assertContains(sql, "WHERE ID = :id", "WHERE ID = ?");
        assertContains(sql, "AND LASTUPDATEDBY is null");

        int count = crudEngine.delete(session, p);
        assertEquals(1, count);

        list = sqlEngine.query(session, Person.class);
        assertEquals(1, list.size());

        try {
            count = crudEngine.delete(session, null);
            fail();
        } catch (IllegalArgumentException e) {
            assertContains(e.getMessage(), "notempty");
        }
    }

    @Test
    public void testDelete7() {
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        Person p = new Person();

        List<Person> list = sqlEngine.query(session, Person.class, p);
        assertEquals(2, list.size());

        SqlCrudEngine crudEngine = getCrudEngine("DELETE_PERSON_7");

        p.setSsn(new Ssn());
        p.getSsn().setNumber("123456");
        p.setSex(Gender.MALE);
        String sql = crudEngine.getDeleteSql(p, p);
        logger.info(sql);
        assertContains(sql, "delete from PERSON");
        assertContains(sql, "WHERE SSN_NUMBER = :ssn.number", "WHERE SSN_NUMBER = ?");
        assertContains(sql, "SEX = :sex", "SEX = ?");

        int count = crudEngine.delete(session, p);
        assertEquals(1, count);

        list = sqlEngine.query(session, Person.class);
        assertEquals(1, list.size());

        try {
            count = crudEngine.delete(session, null);
            fail();
        } catch (IllegalArgumentException e) {
            assertContains(e.getMessage(), "notempty");
        }

        try {
            p = new Person();
            p.setSsn(new Ssn());
            p.getSsn().setNumber("123456");
            count = crudEngine.delete(session, p);
            fail();
        } catch (IllegalArgumentException e) {
            assertContains(e.getMessage(), "notempty");
        }
    }

    @Test
    public void testGet2() {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_PERSON_2");

        Person p = new Person();
        p.setName(new PersonName());
        p.getName().setFirst("Halle");
        p.getName().setLast("Berry");

        Person person2 = sqlEngine.get(session, Person.class, p);
        assertNotNull(person2);
        assertEquals("Halle", person2.getName().getFirst());
        assertEquals("Berry", person2.getName().getLast());
    }

    @Test
    public void testGet() {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_PERSON");

        Person p = new Person();
        p.setId(2L);

        Person person2 = sqlEngine.get(session, Person.class, p);
        assertNotNull(person2);
        assertEquals("Halle", person2.getName().getFirst());
        assertEquals("Berry", person2.getName().getLast());
    }

    @Test
    public void testDelete2() {
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        Person p = new Person();

        List<Person> list = sqlEngine.query(session, Person.class, p);
        assertEquals(2, list.size());

        SqlCrudEngine crudEngine = getCrudEngine("DELETE_PERSON_2");

        String sql = crudEngine.getDeleteSql(p, null);
        logger.info(sql);
        assertContains(sql, "delete from PERSON");
        assertContains(sql, "WHERE LASTUPDATEDBY is null");

        int count = crudEngine.delete(session, p);
        assertEquals(2, count);

        list = sqlEngine.query(session, Person.class, p);
        assertEquals(0, list.size());
    }

    @Test
    public void testDelete() {
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        Person p = new Person();
        p.setId(2L);

        List<Person> list = sqlEngine.query(session, Person.class, p);
        assertEquals(1, list.size());
        assertEquals("Halle", list.get(0).getName().getFirst());
        assertNotSame(null, list.get(0).getCreatedDate());

        SqlCrudEngine crudEngine = getCrudEngine("DELETE_PERSON");

        String sql = crudEngine.getDeleteSql(p, null);
        logger.info(sql);
        assertContains(sql, "delete from PERSON");
        assertContains(sql, "WHERE ID = :id", "WHERE ID = ?");

        int count = crudEngine.delete(session, p);
        assertEquals(1, count);

        list = sqlEngine.query(session, Person.class, p);
        assertEquals(0, list.size());
    }

    @Test
    public void testUpdate3() {
        Engagement e1 = new Engagement();
        e1.setId(1L);
        e1.setRole("Writes");
        SqlCrudEngine crudEngine = getCrudEngine("UPDATE_ENGAGEMENT_3");

        // Assert SQL for e1 without PERSON
        String sql = crudEngine.getUpdateSql(e1, null);
        logger.info(sql);
        assertContains(sql, "update ENGAGEMENT");
        assertContains(sql, "SET");
        assertContains(sql, "ROLE = :role", "ROLE = ?");
        assertDoNotContain(sql, "UUID = ");
        assertDoNotContain(sql, "PERSON = ");

        // Add empty PERSON to e1 (still should not include PERSON in SQL)
        e1.setPerson(new Person());
        sql = crudEngine.getUpdateSql(e1, null);
        logger.info(sql);
        assertContains(sql, "update ENGAGEMENT");
        assertContains(sql, "SET");
        assertContains(sql, "ROLE = :role", "ROLE = ?");
        assertDoNotContain(sql, "UUID = ");
        assertDoNotContain(sql, "PERSON = ");

        // Create e2 with PERSON id set (PERSON should be in SQL)
        Engagement e2 = new Engagement();
        e2.setId(1L);
        e2.setRole("Writes");
        e2.setPerson(new Person());
        e2.getPerson().setId(1L);
        sql = crudEngine.getUpdateSql(e2, null);
        logger.info(sql);
        assertContains(sql, "update ENGAGEMENT");
        assertContains(sql, "SET");
        assertContains(sql, "ROLE = :role", "ROLE = ?");
        assertDoNotContain(sql, "UUID = ");
        assertContains(sql, "PERSON = :person", "PERSON = ?");

        Integer[] count = crudEngine.batchUpdate(session, java.util.Arrays.asList(e1, e2));
        assertEquals(2, count.length);
        assertEquals(1, count[0].intValue());
        assertEquals(1, count[1].intValue());
    }

    @Test
    public void testUpdate2() {
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        Person p = new Person();
        p.setId(2L);

        List<Person> list = sqlEngine.query(session, Person.class, p);
        assertEquals(1, list.size());
        assertEquals("Halle", list.get(0).getName().getFirst());
        assertNotSame(null, list.get(0).getCreatedDate());

        // First update target
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.setCreatedDate(null);

        // Second update target
        Person pp = new Person();
        pp.setId(1L);
        pp.setName(new PersonName());
        pp.getName().setFirst("Michael");
        pp.setCreatedDate(null);

        SqlCrudEngine crudEngine = getCrudEngine("UPDATE_PERSON_2");

        String sql = crudEngine.getUpdateSql(p, null);
        logger.info(sql);
        assertContains(sql, "update PERSON");
        assertContains(sql, "SET");
        assertContains(sql, "NAME_FIRST = :name_first", "NAME_FIRST = ?");
        assertContains(sql, "CREATEDDATE = :createdDate", "CREATEDDATE = ?");
        assertContains(sql, "WHERE");
        assertContains(sql, "ID = :id", "ID = ?");

        Integer[] count = crudEngine.batchUpdate(session, java.util.Arrays.asList(p, pp));
        assertEquals(2, count.length);
        assertEquals(1, count[0].intValue());
        assertEquals(1, count[1].intValue());

        // Verify first
        list = sqlEngine.query(session, Person.class, p);
        assertEquals(1, list.size());
        assertEquals("Toby", list.get(0).getName().getFirst());
        assertEquals(null, list.get(0).getCreatedDate());

        // Verify second
        list = sqlEngine.query(session, Person.class, pp);
        assertEquals(1, list.size());
        assertEquals("Michael", list.get(0).getName().getFirst());
        assertEquals(null, list.get(0).getCreatedDate());
    }

    @Test
    public void testUpdate2b() {
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        Person2 p = new Person2();
        p.setId(2L);

        List<Person> list = sqlEngine.query(session, Person.class, p);
        assertEquals(1, list.size());
        assertEquals("Halle", list.get(0).getName().getFirst());
        assertNotSame(null, list.get(0).getCreatedDate());

        SqlCrudEngine crudEngine = getCrudEngine("UPDATE_PERSON_2");

        String sql = crudEngine.getUpdateSql(p, null);
        logger.info(sql);
        assertContains(sql, "update PERSON");
        assertContains(sql, "SET");
        assertContains(sql, "WHERE");
        assertContains(sql, "ID = :id", "ID = ?");

        SqlStandardControl sqc = new SqlStandardControl();
        sqc.setSkipEmptyStatement(true);

        Integer[] count = crudEngine.batchUpdate(session, java.util.Arrays.asList(p), sqc);
        assertEquals(0, count.length);
    }

    @Test
    public void testUpdate1() {
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        Person p = new Person();
        p.setId(2L);

        List<Person> list = sqlEngine.query(session, Person.class, p);
        assertEquals(1, list.size());
        assertEquals("Halle", list.get(0).getName().getFirst());
        assertNotSame(null, list.get(0).getCreatedDate());

        // First update target
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.setCreatedDate(null);

        // Second update target
        Person pp = new Person();
        pp.setId(1L);
        pp.setName(new PersonName());
        pp.getName().setFirst("Michael");
        pp.setCreatedDate(null);

        SqlCrudEngine crudEngine = getCrudEngine("UPDATE_PERSON");

        String sql = crudEngine.getUpdateSql(p, null);
        logger.info(sql);
        assertContains(sql, "update PERSON");
        assertContains(sql, "SET");
        assertContains(sql, "NAME_FIRST = :name_first", "NAME_FIRST = ?");
        assertContains(sql, "CREATEDDATE = :createdDate", "CREATEDDATE = ?");
        assertContains(sql, "WHERE");
        assertContains(sql, "ID = :id", "ID = ?");

        Integer[] count = crudEngine.batchUpdate(session, java.util.Arrays.asList(p, pp));
        assertEquals(2, count.length);
        assertEquals(1, count[0].intValue());
        assertEquals(1, count[1].intValue());

        // Verify first
        list = sqlEngine.query(session, Person.class, p);
        assertEquals(1, list.size());
        assertEquals("Toby", list.get(0).getName().getFirst());
        assertEquals(null, list.get(0).getCreatedDate());

        // Verify second
        list = sqlEngine.query(session, Person.class, pp);
        assertEquals(1, list.size());
        assertEquals("Michael", list.get(0).getName().getFirst());
        assertEquals(null, list.get(0).getCreatedDate());
    }

    @Test
    public void testInsert7() {
        if ("mysql".equalsIgnoreCase(dbType) || "mssql".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        Person pp = new Person();
        pp.setSsn(new Ssn());
        pp.getSsn().setNumber("987654");
        pp.getSsn().setCountry(Country.UNITED_STATES);
        pp.setName(new PersonName());
        pp.getName().setFirst("Michael");
        pp.getName().setLast("Johnson");
        pp.setAge(1975, 8, 15);
        pp.setSex(Gender.MALE);
        pp.setCreatedBy("wlado");
        pp.setVersion(1L);
        pp.setClothesSize(Size.BIG);

        List<Person> ps = java.util.Arrays.asList(p, pp);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_7");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);
        assertContains(sql, "VALUES");
        assertContains(sql,
                ":ssn_number, :ssn_country, :name_first, :name_last, :birthDate, :sex, :createdDate, :createdBy, :version, :clothesSize)",
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        Integer[] count = crudEngine.batchInsert(session, ps);
        assertEquals(2, count.length);
        assertEquals(1, count[0].intValue());
        assertEquals(1, count[1].intValue());
        assertNull(p.getId());
        assertNull(pp.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(4, list.size());
    }

    @Test
    public void testInsert6() {
        if ("ORACLE".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        Person pp = new Person();
        pp.setSsn(new Ssn());
        pp.getSsn().setNumber("987654");
        pp.getSsn().setCountry(Country.UNITED_STATES);
        pp.setName(new PersonName());
        pp.getName().setFirst("Michael");
        pp.getName().setLast("Johnson");
        pp.setAge(1975, 8, 15);
        pp.setSex(Gender.MALE);
        pp.setCreatedBy("wlado");
        pp.setVersion(1L);
        pp.setClothesSize(Size.BIG);

        List<Person> ps = java.util.Arrays.asList(p, pp);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_6");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);
        assertContains(sql, "VALUES");
        assertContains(sql,
                ":ssn_number, :ssn_country, :name_first, :name_last, :birthDate, :sex, :createdDate, :createdBy, :version, :clothesSize)",
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        Integer[] count = crudEngine.batchInsert(session, ps);
        assertEquals(2, count.length);
        assertEquals(1, count[0].intValue());
        assertEquals(1, count[1].intValue());
        assertNull(p.getId());
        assertNull(pp.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(4, list.size());
    }

    @Test
    public void testInsert6A() {
        if ("ORACLE".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        Person pp = new Person();
        pp.setSsn(new Ssn());
        pp.getSsn().setNumber("987654");
        pp.getSsn().setCountry(Country.UNITED_STATES);
        pp.setName(new PersonName());
        pp.getName().setFirst("Michael");
        pp.getName().setLast("Johnson");
        pp.setAge(1975, 8, 15);
        pp.setSex(Gender.MALE);
        pp.setCreatedBy("wlado");
        pp.setVersion(1L);
        pp.setClothesSize(Size.BIG);

        List<Person> ps = java.util.Arrays.asList(p, pp);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_6A");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);
        assertContains(sql, "VALUES");
        assertContains(sql,
                ":ssn_number, :ssn_country, :name_first, :name_last, :birthDate, :sex, :createdDate, :createdBy, :version, :clothesSize)",
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        Integer[] count = crudEngine.batchInsert(session, ps);
        assertEquals(2, count.length);
        assertEquals(1, count[0].intValue());
        assertEquals(1, count[1].intValue());
        assertNull(p.getId());
        assertNull(pp.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(4, list.size());
    }

    @Test
    public void testInsert5() {
        if ("ORACLE".equalsIgnoreCase(dbType) || "POSTGRESQL".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        Person pp = new Person();
        pp.setSsn(new Ssn());
        pp.getSsn().setNumber("987654");
        pp.getSsn().setCountry(Country.UNITED_STATES);
        pp.setName(new PersonName());
        pp.getName().setFirst("Michael");
        pp.getName().setLast("Johnson");
        pp.setAge(1975, 8, 15);
        pp.setSex(Gender.MALE);
        pp.setCreatedBy("wlado");
        pp.setVersion(1L);
        pp.setClothesSize(Size.BIG);

        List<Person> ps = java.util.Arrays.asList(p, pp);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_5");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);
        assertContains(sql, "VALUES");
        assertContains(sql,
                ":ssn_number, :ssn_country, :name_first, :name_last, :birthDate, :sex, :createdDate, :createdBy, :version, :clothesSize)",
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        Integer[] count = crudEngine.batchInsert(session, ps);
        assertEquals(2, count.length);
        assertEquals(1, count[0].intValue());
        assertEquals(1, count[1].intValue());
        assertNull(p.getId());
        assertNull(pp.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(4, list.size());
    }

    @Test
    public void testInsert5A() {
        if ("ORACLE".equalsIgnoreCase(dbType) || "POSTGRESQL".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        Person pp = new Person();
        pp.setSsn(new Ssn());
        pp.getSsn().setNumber("987654");
        pp.getSsn().setCountry(Country.UNITED_STATES);
        pp.setName(new PersonName());
        pp.getName().setFirst("Michael");
        pp.getName().setLast("Johnson");
        pp.setAge(1975, 8, 15);
        pp.setSex(Gender.MALE);
        pp.setCreatedBy("wlado");
        pp.setVersion(1L);
        pp.setClothesSize(Size.BIG);

        List<Person> ps = java.util.Arrays.asList(p, pp);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_5A");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);
        assertContains(sql, "VALUES");
        assertContains(sql,
                ":ssn_number, :ssn_country, :name_first, :name_last, :birthDate, :sex, :createdDate, :createdBy, :version, :clothesSize)",
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        Integer[] count = crudEngine.batchInsert(session, ps);
        assertEquals(2, count.length);
        assertEquals(1, count[0].intValue());
        assertEquals(1, count[1].intValue());
        assertNull(p.getId());
        assertNull(pp.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(4, list.size());
    }

    @Test
    public void testInsert4() {
        if ("MYSQL".equalsIgnoreCase(dbType) || "MSSQL".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        Person pp = new Person();
        pp.setSsn(new Ssn());
        pp.getSsn().setNumber("987654");
        pp.getSsn().setCountry(Country.UNITED_STATES);
        pp.setName(new PersonName());
        pp.getName().setFirst("Michael");
        pp.getName().setLast("Johnson");
        pp.setAge(1975, 8, 15);
        pp.setSex(Gender.MALE);
        pp.setCreatedBy("wlado");
        pp.setVersion(1L);
        pp.setClothesSize(Size.BIG);

        List<Person> ps = java.util.Arrays.asList(p, pp);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_4");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);
        assertContains(sql, "VALUES");
        assertContains(sql,
                ":ssn_number, :ssn_country, :name_first, :name_last, :birthDate, :sex, :createdDate, :createdBy, :version, :clothesSize)",
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        Integer[] count = crudEngine.batchInsert(session, ps);
        assertEquals(2, count.length);
        assertEquals(1, count[0].intValue());
        assertEquals(1, count[1].intValue());
        assertNull(p.getId());
        assertNull(pp.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(4, list.size());
    }

    @Test
    public void testInsert3() {
        if ("MYSQL".equalsIgnoreCase(dbType) || "MSSQL".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        Person pp = new Person();
        pp.setSsn(new Ssn());
        pp.getSsn().setNumber("987654");
        pp.getSsn().setCountry(Country.UNITED_STATES);
        pp.setName(new PersonName());
        pp.getName().setFirst("Michael");
        pp.getName().setLast("Johnson");
        pp.setAge(1975, 8, 15);
        pp.setSex(Gender.MALE);
        pp.setCreatedBy("wlado");
        pp.setVersion(1L);
        pp.setClothesSize(Size.BIG);

        List<Person> ps = java.util.Arrays.asList(p, pp);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_3");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);
        assertContains(sql, "VALUES");
        assertContains(sql,
                ":ssn_number, :ssn_country, :name_first, :name_last, :birthDate, :sex, :createdDate, :createdBy, :version, :clothesSize)",
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        Integer[] count = crudEngine.batchInsert(session, ps);
        assertEquals(2, count.length);
        assertEquals(1, count[0].intValue());
        assertEquals(1, count[1].intValue());
        assertNull(p.getId());
        assertNull(pp.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(4, list.size());
    }

    @Test
    public void testInsert2() {
        if ("MYSQL".equalsIgnoreCase(dbType) || "MSSQL".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        Person pp = new Person();
        pp.setSsn(new Ssn());
        pp.getSsn().setNumber("987654");
        pp.getSsn().setCountry(Country.UNITED_STATES);
        pp.setName(new PersonName());
        pp.getName().setFirst("Michael");
        pp.getName().setLast("Johnson");
        pp.setAge(1975, 8, 15);
        pp.setSex(Gender.MALE);
        pp.setCreatedBy("wlado");
        pp.setVersion(1L);
        pp.setClothesSize(Size.BIG);

        List<Person> ps = java.util.Arrays.asList(p, pp);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_2");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);

        Integer[] count = crudEngine.batchInsert(session, ps);
        assertEquals(2, count.length);
        assertEquals(1, count[0].intValue());
        assertEquals(1, count[1].intValue());

        list = sqlEngine.query(session, Person.class);
        assertEquals(4, list.size());
    }

    @Test
    public void testInsert() {
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setId(3L);
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        p.setCreatedDate(new Date());
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        Person pp = new Person();
        pp.setId(4L);
        pp.setSsn(new Ssn());
        pp.getSsn().setNumber("987654");
        pp.getSsn().setCountry(Country.UNITED_STATES);
        pp.setName(new PersonName());
        pp.getName().setFirst("Michael");
        pp.getName().setLast("Johnson");
        pp.setAge(1975, 8, 15);
        pp.setSex(Gender.MALE);
        pp.setCreatedDate(new Date());
        pp.setCreatedBy("wlado");
        pp.setVersion(1L);
        pp.setClothesSize(Size.BIG);

        List<Person> ps = java.util.Arrays.asList(p, pp);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);

        Integer[] count = crudEngine.batchInsert(session, ps);
        assertEquals(2, count.length);
        assertEquals(1, count[0].intValue());
        assertEquals(1, count[1].intValue());
        assertNotNull(p.getId());
        assertNotNull(pp.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(4, list.size());
    }

    @Test
    public void testInsertOptimized() {
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setId(3L);
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        p.setCreatedDate(new Date());
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        Person pp = new Person();
        pp.setId(4L);
        pp.setSsn(new Ssn());
        pp.getSsn().setNumber("987654");
        pp.getSsn().setCountry(Country.UNITED_STATES);
        pp.setName(new PersonName());
        pp.getName().setFirst("Michael");
        pp.getName().setLast("Johnson");
        pp.setAge(1975, 8, 15);
        pp.setSex(Gender.MALE);
        pp.setCreatedDate(new Date());
        pp.setCreatedBy("wlado");
        pp.setVersion(1L);
        pp.setClothesSize(Size.BIG);

        List<Person> ps = java.util.Arrays.asList(p, pp);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_OPT");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);

        Integer[] count = crudEngine.batchInsert(session, ps);
        assertEquals(2, count.length);
        assertEquals(1, count[0].intValue());
        assertEquals(1, count[1].intValue());
        assertNotNull(p.getId());
        assertNotNull(pp.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(4, list.size());
    }

    @Test
    public void testInsert101() {
        if ("MYSQL".equalsIgnoreCase(dbType) || "mssql".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        p.setCreatedDate(new Date());
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        Person pp = new Person();
        pp.setSsn(new Ssn());
        pp.getSsn().setNumber("987654");
        pp.getSsn().setCountry(Country.UNITED_STATES);
        pp.setName(new PersonName());
        pp.getName().setFirst("Michael");
        pp.getName().setLast("Johnson");
        pp.setAge(1975, 8, 15);
        pp.setSex(Gender.MALE);
        pp.setCreatedDate(new Date());
        pp.setCreatedBy("wlado");
        pp.setVersion(1L);
        pp.setClothesSize(Size.BIG);

        List<Person> ps = java.util.Arrays.asList(p, pp);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_101");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);

        Integer[] count = crudEngine.batchInsert(session, ps);
        assertEquals(2, count.length);
        assertEquals(1, count[0].intValue());
        assertEquals(1, count[1].intValue());

        list = sqlEngine.query(session, Person.class);
        assertEquals(4, list.size());
    }

    @Test
    public void testInsert102() {
        if ("oracle".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        p.setCreatedDate(new Date());
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        Person pp = new Person();
        pp.setSsn(new Ssn());
        pp.getSsn().setNumber("987654");
        pp.getSsn().setCountry(Country.UNITED_STATES);
        pp.setName(new PersonName());
        pp.getName().setFirst("Michael");
        pp.getName().setLast("Johnson");
        pp.setAge(1975, 8, 15);
        pp.setSex(Gender.MALE);
        pp.setCreatedDate(new Date());
        pp.setCreatedBy("wlado");
        pp.setVersion(1L);
        pp.setClothesSize(Size.BIG);

        List<Person> ps = java.util.Arrays.asList(p, pp);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_102");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);

        Integer[] count = crudEngine.batchInsert(session, ps);
        assertEquals(2, count.length);
        assertEquals(1, count[0].intValue());
        assertEquals(1, count[1].intValue());

        list = sqlEngine.query(session, Person.class);
        assertEquals(4, list.size());
    }

    @Test
    public void testInsert103() {
        if ("mssql".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        p.setCreatedDate(new Date());
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        Person pp = new Person();
        pp.setSsn(new Ssn());
        pp.getSsn().setNumber("987654");
        pp.getSsn().setCountry(Country.UNITED_STATES);
        pp.setName(new PersonName());
        pp.getName().setFirst("Michael");
        pp.getName().setLast("Johnson");
        pp.setAge(1975, 8, 15);
        pp.setSex(Gender.MALE);
        pp.setCreatedDate(new Date());
        pp.setCreatedBy("wlado");
        pp.setVersion(1L);
        pp.setClothesSize(Size.BIG);

        List<Person> ps = java.util.Arrays.asList(p, pp);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_103");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);

        Integer[] count = crudEngine.batchInsert(session, ps);
        assertEquals(2, count.length);
        assertEquals(1, count[0].intValue());
        assertEquals(1, count[1].intValue());

        list = sqlEngine.query(session, Person.class);
        assertEquals(4, list.size());
    }
}
