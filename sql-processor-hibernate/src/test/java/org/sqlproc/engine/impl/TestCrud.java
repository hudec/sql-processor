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

public class TestCrud extends TestDatabase {

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
        p.getSsn().setNumber("");
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

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_8");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);

        int count = crudEngine.insert(session, p);
        assertEquals(1, count);
        logger.info("new id: " + p.getId());
        assertNotNull(p.getId());

        Person p2 = new Person();
        p2.setId(p.getId());
        list = sqlEngine.query(session, Person.class, p2);
        assertEquals(1, list.size());
        Person p3 = list.get(0);
        assertEquals("", p3.getName().getFirst());
        assertEquals("Stephens", p3.getName().getLast());
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
        p.getSsn().setNumber("");
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

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);

        int count = crudEngine.insert(session, p);
        assertEquals(1, count);
        logger.info("new id: " + p.getId());
        assertNotNull(p.getId());

        Person p2 = new Person();
        p2.setId(p.getId());
        list = sqlEngine.query(session, Person.class, p2);
        assertEquals(1, list.size());
        Person p3 = list.get(0);
        assertEquals("", p3.getName().getFirst());
        assertEquals("Stephens", p3.getName().getLast());
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
        assertContains(sql, "WHERE SSN_NUMBER = :ssn_number", "WHERE SSN_NUMBER = ?");
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
        Engagement e = new Engagement();
        e.setId(1L);
        e.setRole("Writes");
        SqlCrudEngine crudEngine = getCrudEngine("UPDATE_ENGAGEMENT_3");

        String sql = crudEngine.getUpdateSql(e, null);
        logger.info(sql);
        assertContains(sql, "update ENGAGEMENT");
        assertContains(sql, "SET");
        assertContains(sql, "ROLE = :role", "ROLE = ?");
        assertDoNotContain(sql, "UUID = ");
        assertDoNotContain(sql, "PERSON = ");

        e.setPerson(new Person());
        sql = crudEngine.getUpdateSql(e, null);
        logger.info(sql);
        assertContains(sql, "update ENGAGEMENT");
        assertContains(sql, "SET");
        assertContains(sql, "ROLE = :role", "ROLE = ?");
        assertDoNotContain(sql, "UUID = ");
        assertDoNotContain(sql, "PERSON = ");

        int count = crudEngine.update(session, e);
        assertEquals(1, count);

        e.getPerson().setId(01L);
        sql = crudEngine.getUpdateSql(e, null);
        logger.info(sql);
        assertContains(sql, "update ENGAGEMENT");
        assertContains(sql, "SET");
        assertContains(sql, "ROLE = :role", "ROLE = ?");
        assertDoNotContain(sql, "UUID = ");
        assertContains(sql, "PERSON = :person", "PERSON = ?");

        count = crudEngine.update(session, e);
        assertEquals(1, count);
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

        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.setCreatedDate(null);

        SqlCrudEngine crudEngine = getCrudEngine("UPDATE_PERSON_2");

        String sql = crudEngine.getUpdateSql(p, null);
        logger.info(sql);
        assertContains(sql, "update PERSON");
        assertContains(sql, "SET");
        assertContains(sql, "NAME_FIRST = :name_first", "NAME_FIRST = ?");
        assertContains(sql, "CREATEDDATE = :createdDate", "CREATEDDATE = ?");
        assertContains(sql, "WHERE");
        assertContains(sql, "ID = :id", "ID = ?");

        int count = crudEngine.update(session, p);
        assertEquals(1, count);

        list = sqlEngine.query(session, Person.class, p);
        assertEquals(1, list.size());
        assertEquals("Toby", list.get(0).getName().getFirst());
        if ("MYSQL".equalsIgnoreCase(dbType))
            assertNotNull(list.get(0).getCreatedDate());
        else
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
        int count = crudEngine.update(session, p, sqc);
        assertEquals(0, count);
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

        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.setCreatedDate(null);

        SqlCrudEngine crudEngine = getCrudEngine("UPDATE_PERSON");

        String sql = crudEngine.getUpdateSql(p, null);
        logger.info(sql);
        assertContains(sql, "update PERSON");
        assertContains(sql, "SET");
        assertContains(sql, "NAME_FIRST = :name_first", "NAME_FIRST = ?");
        assertContains(sql, "CREATEDDATE = :createdDate", "CREATEDDATE = ?");
        assertContains(sql, "WHERE");
        assertContains(sql, "ID = :id", "ID = ?");

        int count = crudEngine.update(session, p);
        assertEquals(1, count);

        list = sqlEngine.query(session, Person.class, p);
        assertEquals(1, list.size());
        assertEquals("Toby", list.get(0).getName().getFirst());
        if ("MYSQL".equalsIgnoreCase(dbType))
            assertNotNull(list.get(0).getCreatedDate());
        else
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
        // p.setId(3L);
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        // p.setCreatedDate(new Date());
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_7");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);
        assertContains(sql, "VALUES");
        assertContains(sql,
                ":ssn_number, :ssn_country, :name_first, :name_last, :birthDate, :sex, :createdDate, :createdBy, :version, :clothesSize)",
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        int count = crudEngine.insert(session, p);
        assertEquals(1, count);
        logger.info("new id: " + p.getId());
        assertNotNull(p.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(3, list.size());
    }

    @Test
    public void testInsert6() {
        if ("ORACLE".equalsIgnoreCase(dbType) || "MSSQL".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        // p.setId(3L);
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        // p.setCreatedDate(new Date());
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_6");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);
        assertContains(sql, "VALUES");
        assertContains(sql,
                ":ssn_number, :ssn_country, :name_first, :name_last, :birthDate, :sex, :createdDate, :createdBy, :version, :clothesSize)",
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        int count = crudEngine.insert(session, p);
        assertEquals(1, count);
        logger.info("new id: " + p.getId());
        assertNotNull(p.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(3, list.size());
    }

    @Test
    public void testInsert6A() {
        if ("ORACLE".equalsIgnoreCase(dbType) || "MSSQL".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        // p.setId(3L);
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        // p.setCreatedDate(new Date());
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_6A");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);
        assertContains(sql, "VALUES");
        assertContains(sql,
                ":ssn_number, :ssn_country, :name_first, :name_last, :birthDate, :sex, :createdDate, :createdBy, :version, :clothesSize)",
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        int count = crudEngine.insert(session, p);
        assertEquals(1, count);
        logger.info("new id: " + p.getId());
        assertNotNull(p.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(3, list.size());
    }

    @Test
    public void testInsert5() {
        if ("ORACLE".equalsIgnoreCase(dbType) || "POSTGRESQL".equalsIgnoreCase(dbType)
                || "MSSQL".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        // p.setId(3L);
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        // p.setCreatedDate(new Date());
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_5");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);
        assertContains(sql, "VALUES");
        assertContains(sql,
                ":ssn_number, :ssn_country, :name_first, :name_last, :birthDate, :sex, :createdDate, :createdBy, :version, :clothesSize)",
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        int count = crudEngine.insert(session, p);
        assertEquals(1, count);
        logger.info("new id: " + p.getId());
        assertNotNull(p.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(3, list.size());
    }

    @Test
    public void testInsert5A() {
        if ("ORACLE".equalsIgnoreCase(dbType) || "POSTGRESQL".equalsIgnoreCase(dbType)
                || "MSSQL".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        // p.setId(3L);
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        // p.setCreatedDate(new Date());
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_5A");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);
        assertContains(sql, "VALUES");
        assertContains(sql,
                ":ssn_number, :ssn_country, :name_first, :name_last, :birthDate, :sex, :createdDate, :createdBy, :version, :clothesSize)",
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        int count = crudEngine.insert(session, p);
        assertEquals(1, count);
        logger.info("new id: " + p.getId());
        assertNotNull(p.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(3, list.size());
    }

    @Test
    public void testInsert4() {
        if ("MYSQL".equalsIgnoreCase(dbType) || "MSSQL".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        // p.setId(3L);
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        // p.setCreatedDate(new Date());
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_4");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);
        assertContains(sql, "VALUES");
        assertContains(sql,
                ":ssn_number, :ssn_country, :name_first, :name_last, :birthDate, :sex, :createdDate, :createdBy, :version, :clothesSize)",
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        int count = crudEngine.insert(session, p);
        assertEquals(1, count);
        logger.info("new id: " + p.getId());
        assertNotNull(p.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(3, list.size());
    }

    @Test
    public void testInsert3() {
        if ("MYSQL".equalsIgnoreCase(dbType) || "MSSQL".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        // p.setId(3L);
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        // p.setCreatedDate(new Date());
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_3");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);
        assertContains(sql, "VALUES");
        assertContains(sql,
                ":ssn_number, :ssn_country, :name_first, :name_last, :birthDate, :sex, :createdDate, :createdBy, :version, :clothesSize)",
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        int count = crudEngine.insert(session, p);
        assertEquals(1, count);
        logger.info("new id: " + p.getId());
        assertNotNull(p.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(3, list.size());
    }

    @Test
    public void testInsert2() {
        if ("MYSQL".equalsIgnoreCase(dbType) || "MSSQL".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        // p.setId(3L);
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        // p.setCreatedDate(new Date());
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_2");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);

        int count = crudEngine.insert(session, p);
        assertEquals(1, count);

        list = sqlEngine.query(session, Person.class);
        assertEquals(3, list.size());
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

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);

        int count = crudEngine.insert(session, p);
        assertEquals(1, count);
        logger.info("new id: " + p.getId());
        assertNotNull(p.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(3, list.size());
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

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_OPT");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);

        int count = crudEngine.insert(session, p);
        assertEquals(1, count);
        logger.info("new id: " + p.getId());
        assertNotNull(p.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(3, list.size());
    }

    @Test
    public void testInsert101() {
        if ("MYSQL".equalsIgnoreCase(dbType) || "MSSQL".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        // p.setId(3L);
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

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_101");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);

        int count = crudEngine.insert(session, p);
        assertEquals(1, count);

        list = sqlEngine.query(session, Person.class);
        assertEquals(3, list.size());
    }

    @Test
    public void testInsert102() {
        if ("MSSQL".equalsIgnoreCase(dbType) || "oracle".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        // p.setId(3L);
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

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_102");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);

        int count = crudEngine.insert(session, p);
        assertEquals(1, count);

        list = sqlEngine.query(session, Person.class);
        assertEquals(3, list.size());
    }

    @Test
    public void testInsert103() {
        if ("MSSQL".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        // p.setId(3L);
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

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_103");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);

        int count = crudEngine.insert(session, p);
        assertEquals(1, count);

        list = sqlEngine.query(session, Person.class);
        assertEquals(3, list.size());
    }
}
