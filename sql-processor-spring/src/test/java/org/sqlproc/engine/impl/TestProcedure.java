package org.sqlproc.engine.impl;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlProcedureEngine;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.form.FormSimpleFunction;
import org.sqlproc.engine.model.Country;
import org.sqlproc.engine.model.Gender;
import org.sqlproc.engine.model.Person;
import org.sqlproc.engine.model.PersonName;
import org.sqlproc.engine.model.Ssn;

public class TestProcedure extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/JoinsTest.xml";
    }

    @Test
    public void testSimpleFunctionToInForm() {
        if ("hsqldb".equalsIgnoreCase(dbType) || "informix".equalsIgnoreCase(dbType))
            return;

        SqlProcedureEngine callableEngine = getProcedureEngine("SIMPLE_FUNCION_TO_IN_FORM");

        FormSimpleFunction f = new FormSimpleFunction();
        f.setTime(new java.sql.Timestamp(new Date().getTime()));
        String sql = callableEngine.getCallSql(f, null);
        logger.info(sql);

        java.sql.Timestamp result = (java.sql.Timestamp) callableEngine.callFunction(session, f);
        assertNotNull(result);
        assertNotNull(f.getTime2());
        logger.info("New date is " + f.getTime2());
    }

    @Test
    public void testSimpleFunction() {
        SqlProcedureEngine callableEngine = getProcedureEngine("SIMPLE_FUNCION");

        FormSimpleFunction f = new FormSimpleFunction();
        f.setTime(new java.sql.Timestamp(new Date().getTime()));
        String sql = callableEngine.getCallSql(f, null);
        logger.info(sql);

        Object result = callableEngine.callFunction(session, f);
        assertNotNull(result);
        assertNull(f.getTime2());
        logger.info("New date is " + result);
    }

    @Test
    public void testCallableInsertResultProcDefaultTypes() {
        if (!"oracle".equalsIgnoreCase(dbType))
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

        SqlProcedureEngine callableEngine = getProcedureEngine("INSERT_PERSON_CALL_RESULT_SET_PROC");

        String sql = callableEngine.getCallSql(p, null);
        logger.info(sql);

        list = callableEngine.callQuery(session, Person.class, p);
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
    public void testCallableInsertResultDefaultTypes() {
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        final Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby6");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);

        final SqlProcedureEngine callableEngine = getProcedureEngine("INSERT_PERSON_CALL_RESULT_SET_2");

        String sql = callableEngine.getCallSql(p, null);
        logger.info(sql);

        list = doInTransaction(new TestOperation<List<Person>>() {
            @Override
            public List<Person> doTest() {
                return callableEngine.callQuery(session, Person.class, p);
            }
        }, "postgresql");
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
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        final Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby5");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);

        final SqlProcedureEngine callableEngine = getProcedureEngine("INSERT_PERSON_CALL_RESULT_SET");

        String sql = callableEngine.getCallSql(p, null);
        logger.info(sql);

        list = doInTransaction(new TestOperation<List<Person>>() {
            @Override
            public List<Person> doTest() {
                return callableEngine.callQuery(session, Person.class, p);
            }
        }, "postgresql");
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
        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        final Person p = new Person();
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby4");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.FEMALE);

        final SqlProcedureEngine callableEngine = getProcedureEngine("INSERT_PERSON_CALL_RESULT_SET");

        String sql = callableEngine.getCallSql(p, null);
        logger.info(sql);

        list = doInTransaction(new TestOperation<List<Person>>() {
            @Override
            public List<Person> doTest() {
                return callableEngine.callQuery(session, Person.class, p);
            }
        }, "postgresql");
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

        SqlProcedureEngine callableEngine = getProcedureEngine("INSERT_PERSON_CALL_2");

        String sql = callableEngine.getCallSql(p, null);
        logger.info(sql);

        int count = callableEngine.callUpdate(session, p);
        if ("mssql".equalsIgnoreCase(dbType)) {
            assertTrue("Number of updated rows is not 1", count == 1);
        } else {
            assertTrue("Number of updated rows is not 0 or -1", count == 0 || count == -1);
        }
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

        SqlProcedureEngine callableEngine = getProcedureEngine("INSERT_PERSON_CALL_2");

        String sql = callableEngine.getCallSql(p, null);
        logger.info(sql);

        int count = callableEngine.callUpdate(session, p);
        if ("mssql".equalsIgnoreCase(dbType)) {
            assertTrue("Number of updated rows is not 1", count == 1);
        } else {
            assertTrue("Number of updated rows is not 0 or -1", count == 0 || count == -1);
        }
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

        SqlProcedureEngine callableEngine = getProcedureEngine("INSERT_PERSON_CALL");

        String sql = callableEngine.getCallSql(p, null);
        logger.info(sql);

        int count = callableEngine.callUpdate(session, p);
        if ("mssql".equalsIgnoreCase(dbType)) {
            assertTrue("Number of updated rows is not 1", count == 1);
        } else {
            assertTrue("Number of updated rows is not 0 or -1", count == 0 || count == -1);
        }
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

        SqlProcedureEngine callableEngine = getProcedureEngine("INSERT_PERSON_CALL");

        String sql = callableEngine.getCallSql(p, null);
        logger.info(sql);

        int count = callableEngine.callUpdate(session, p);
        if ("mssql".equalsIgnoreCase(dbType)) {
            assertTrue("Number of updated rows is not 1", count == 1);
        } else {
            assertTrue("Number of updated rows is not 0 or -1", count == 0 || count == -1);
        }
        logger.info("new id: " + p.getId());
        assertNotNull(p.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(3, list.size());
    }
}
