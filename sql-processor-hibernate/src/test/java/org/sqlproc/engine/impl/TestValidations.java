package org.sqlproc.engine.impl;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.junit.Test;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.model.Country;
import org.sqlproc.engine.model.Gender;
import org.sqlproc.engine.model.Person;
import org.sqlproc.engine.model.PersonName;
import org.sqlproc.engine.model.Size;
import org.sqlproc.engine.model.Ssn;
import org.sqlproc.engine.validation.SqlValidationException;
import org.sqlproc.engine.validation.SqlValidationResult;

public class TestValidations extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/JoinsTest.xml";
    }

    @Test
    public void testInsert() {
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

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

        try {
            int count = crudEngine.insert(session, p);
            assertEquals(1, count);
            logger.info("new id: " + p.getId());
            assertNotNull(p.getId());
            List<Person> list = sqlEngine.query(session, Person.class);
            assertEquals(3, list.size());
        } catch (SqlValidationException e) {
            SqlValidationResult<Set<ConstraintViolation<Person>>> result = e.getResult();
            for (ConstraintViolation<Person> violation : result.getResult()) {
                logger.info(violation.toString());
            }
            fail(e.getMessage());
        }
    }

    @Test
    public void testInsertNullViolation() {
        Person p = new Person();
        p.setId(3L);
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        // p.getName().setFirst("Toby");
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

        try {
            crudEngine.insert(session, p);
            fail("Must be violation exception for attribute first in pojo person");
        } catch (SqlValidationException e) {
            SqlValidationResult<Set<ConstraintViolation<Person>>> result = e.getResult();
            for (ConstraintViolation<Person> violation : result.getResult()) {
                logger.info(violation.toString());
            }
        }
    }

    @Test
    public void testInsertSizeViolation() {
        Person p = new Person();
        p.setId(3L);
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName()
                .setFirst(
                        "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
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

        try {
            crudEngine.insert(session, p);
            fail("Must be violation exception for attribute first in pojo person");
        } catch (SqlValidationException e) {
            SqlValidationResult<Set<ConstraintViolation<Person>>> result = e.getResult();
            for (ConstraintViolation<Person> violation : result.getResult()) {
                logger.info(violation.toString());
            }
        }
    }

    @Test
    public void testUpdate() {
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

        try {
            int count = crudEngine.update(session, p);
            assertEquals(1, count);
            list = sqlEngine.query(session, Person.class, p);
            assertEquals(1, list.size());
            assertEquals("Toby", list.get(0).getName().getFirst());
            if ("MYSQL".equalsIgnoreCase(dbType))
                assertNotNull(list.get(0).getCreatedDate());
            else
                assertEquals(null, list.get(0).getCreatedDate());
        } catch (SqlValidationException e) {
            SqlValidationResult<Set<ConstraintViolation<Person>>> result = e.getResult();
            for (ConstraintViolation<Person> violation : result.getResult()) {
                logger.info(violation.toString());
            }
            fail(e.getMessage());
        }
    }

    @Test
    public void testUpdateNullViolation() {
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        Person p = new Person();
        p.setId(2L);

        List<Person> list = sqlEngine.query(session, Person.class, p);
        assertEquals(1, list.size());
        assertEquals("Halle", list.get(0).getName().getFirst());
        assertNotSame(null, list.get(0).getCreatedDate());

        p.setName(new PersonName());
        p.getName().setFirst(null);
        p.setCreatedDate(null);
        p.setBirthDate(null);

        SqlCrudEngine crudEngine = getCrudEngine("UPDATE_PERSON_3");

        try {
            crudEngine.update(session, p);
            fail("Must be violation exception for attributes birthdate firstname in pojo person");
        } catch (SqlValidationException e) {
            SqlValidationResult<Set<ConstraintViolation<Person>>> result = e.getResult();
            for (ConstraintViolation<Person> violation : result.getResult()) {
                logger.info(violation.toString());
            }
        }
    }

    @Test
    public void testUpdateSizeViolation() {
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        Person p = new Person();
        p.setId(2L);

        List<Person> list = sqlEngine.query(session, Person.class, p);
        assertEquals(1, list.size());
        assertEquals("Halle", list.get(0).getName().getFirst());
        assertNotSame(null, list.get(0).getCreatedDate());

        p.setName(new PersonName());
        p.getName()
                .setFirst(
                        "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        SqlCrudEngine crudEngine = getCrudEngine("UPDATE_PERSON_3");

        try {
            crudEngine.update(session, p);
            fail("Must be violation exception for attributes birthdate firstname in pojo person");
        } catch (SqlValidationException e) {
            SqlValidationResult<Set<ConstraintViolation<Person>>> result = e.getResult();
            for (ConstraintViolation<Person> violation : result.getResult()) {
                logger.info(violation.toString());
            }
        }
    }
}
