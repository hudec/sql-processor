package org.sqlproc.engine.impl;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlProcedureEngine;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.model.Country;
import org.sqlproc.engine.model.Gender;
import org.sqlproc.engine.model.Person;
import org.sqlproc.engine.model.PersonName;
import org.sqlproc.engine.model.Ssn;

public class TestProcedure extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/JoinsTest.xml";
    }

    public static class FormSimpleFunction {
        private java.sql.Timestamp time;
        private java.sql.Timestamp time2;

        public java.sql.Timestamp getTime() {
            return time;
        }

        public void setTime(java.sql.Timestamp time) {
            this.time = time;
        }

        public java.sql.Timestamp getTime2() {
            return time2;
        }

        public void setTime2(java.sql.Timestamp time2) {
            this.time2 = time2;
        }
    }

    @Test
    public void testSimpleFunctionToInForm() {
        if ("HSQLDB".equalsIgnoreCase(dbType))
            return;

        SqlProcedureEngine callableEngine = getCallableEngine("SIMPLE_FUNCION_TO_IN_FORM");

        FormSimpleFunction f = new FormSimpleFunction();
        f.setTime(new java.sql.Timestamp(new Date().getTime()));
        String sql = callableEngine.getCallSql(f, null);
        logger.info(sql);

        Object result = callableEngine.callFunction(session, f, null, 0);
        assertNotNull(result);
        assertNotNull(f.time2);
        logger.info("New date is " + f.time2);
    }

    @Test
    public void testSimpleFunction() {
        SqlProcedureEngine callableEngine = getCallableEngine("SIMPLE_FUNCION");

        FormSimpleFunction f = new FormSimpleFunction();
        f.setTime(new java.sql.Timestamp(new Date().getTime()));
        String sql = callableEngine.getCallSql(f, null);
        logger.info(sql);

        Object result = callableEngine.callFunction(session, f, null, 0);
        assertNotNull(result);
        assertNull(f.time2);
        logger.info("New date is " + result);
    }

    @Test
    public void testCallableInsertResultDefaultTypes() {
        if ("HSQLDB".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby6");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);

        SqlProcedureEngine callableEngine = getCallableEngine("INSERT_PERSON_CALL_RESULT_SET_2");

        String sql = callableEngine.getCallSql(p, null);
        logger.info(sql);

        list = callableEngine.callQuery(session, Person.class, p, null, 0);
        assertEquals(1, list.size());
        Person p2 = list.get(0);
        logger.info("New person is " + p2);

        assertNotNull(p2.getId());
        assertEquals(p.getSsn().getNumber(), p2.getSsn().getNumber());
        assertEquals(p.getSsn().getCountry(), p2.getSsn().getCountry());
        assertEquals(p.getName().getFirst(), p2.getName().getFirst());
        assertEquals(p.getName().getLast(), p2.getName().getLast());
        assertEquals(p.getAge(), p2.getAge());
        assertEquals(Gender.MALE, p2.getSex());
    }

    @Test
    public void testCallableInsertResultSetNull() {
        if ("HSQLDB".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby5");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);

        SqlProcedureEngine callableEngine = getCallableEngine("INSERT_PERSON_CALL_RESULT_SET");

        String sql = callableEngine.getCallSql(p, null);
        logger.info(sql);

        list = callableEngine.callQuery(session, Person.class, p, null, 0);
        assertEquals(1, list.size());
        Person p2 = list.get(0);
        logger.info("New person is " + p2);

        assertNotNull(p2.getId());
        assertEquals(p.getSsn().getNumber(), p2.getSsn().getNumber());
        assertEquals(p.getSsn().getCountry(), p2.getSsn().getCountry());
        assertEquals(p.getName().getFirst(), p2.getName().getFirst());
        assertEquals(p.getName().getLast(), p2.getName().getLast());
        assertEquals(p.getAge(), p2.getAge());
        assertEquals(Gender.MALE, p2.getSex());
    }

    @Test
    public void testCallableInsertResultSet() {
        if ("HSQLDB".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby4");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.FEMALE);

        SqlProcedureEngine callableEngine = getCallableEngine("INSERT_PERSON_CALL_RESULT_SET");

        String sql = callableEngine.getCallSql(p, null);
        logger.info(sql);

        list = callableEngine.callQuery(session, Person.class, p, null, 0);
        assertEquals(1, list.size());
        Person p2 = list.get(0);
        logger.info("New person is " + p2);

        assertNotNull(p2.getId());
        assertEquals(p.getSsn().getNumber(), p2.getSsn().getNumber());
        assertEquals(p.getSsn().getCountry(), p2.getSsn().getCountry());
        assertEquals(p.getName().getFirst(), p2.getName().getFirst());
        assertEquals(p.getName().getLast(), p2.getName().getLast());
        assertEquals(p.getAge(), p2.getAge());
        assertEquals(p.getSex(), p2.getSex());
    }

    @Test
    public void testCallableInsertMetaTypesNull() {
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby3");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);

        SqlProcedureEngine callableEngine = getCallableEngine("INSERT_PERSON_CALL_2");

        String sql = callableEngine.getCallSql(p, null);
        logger.info(sql);

        int count = callableEngine.callUpdate(session, p, null, 0);
        assertTrue("Number of updated rows is 0 or 1", count == 0 || count == -1);
        logger.info("new id: " + p.getId());
        assertNotNull(p.getId());
        assertEquals(Gender.MALE, p.getSex());

        list = sqlEngine.query(session, Person.class);
        assertEquals(3, list.size());
    }

    @Test
    public void testCallableInsertMetaTypes() {
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby2");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.FEMALE);

        SqlProcedureEngine callableEngine = getCallableEngine("INSERT_PERSON_CALL_2");

        String sql = callableEngine.getCallSql(p, null);
        logger.info(sql);

        int count = callableEngine.callUpdate(session, p, null, 0);
        assertTrue("Number of updated rows is 0 or 1", count == 0 || count == -1);
        logger.info("new id: " + p.getId());
        assertNotNull(p.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(3, list.size());
    }

    @Test
    public void testCallableInsertNull() {
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby1");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);

        SqlProcedureEngine callableEngine = getCallableEngine("INSERT_PERSON_CALL");

        String sql = callableEngine.getCallSql(p, null);
        logger.info(sql);

        int count = callableEngine.callUpdate(session, p, null, 0);
        assertTrue("Number of updated rows is 0 or 1", count == 0 || count == -1);
        logger.info("new id: " + p.getId());
        assertNotNull(p.getId());
        assertEquals(Gender.MALE, p.getSex());

        list = sqlEngine.query(session, Person.class);
        assertEquals(3, list.size());
    }

    @Test
    public void testCallableInsert() {
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby1");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.FEMALE);

        SqlProcedureEngine callableEngine = getCallableEngine("INSERT_PERSON_CALL");

        String sql = callableEngine.getCallSql(p, null);
        logger.info(sql);

        int count = callableEngine.callUpdate(session, p, null, 0);
        assertTrue("Number of updated rows is 0 or 1", count == 0 || count == -1);
        logger.info("new id: " + p.getId());
        assertNotNull(p.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(3, list.size());
    }
}
