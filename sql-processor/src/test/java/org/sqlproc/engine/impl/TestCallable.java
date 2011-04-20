package org.sqlproc.engine.impl;

import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlCallableEngine;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.model.Country;
import org.sqlproc.engine.model.Gender;
import org.sqlproc.engine.model.Person;
import org.sqlproc.engine.model.PersonName;
import org.sqlproc.engine.model.Ssn;

public class TestCallable extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/JoinsTest.xml";
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
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);

        SqlCallableEngine callableEngine = getCallableEngine("INSERT_PERSON_CALL");

        String sql = callableEngine.getCallSql(p, null);
        logger.info(sql);

        int count = callableEngine.call(session, p, null, 0);
        assertEquals(0, count);
        logger.info("new id: " + p.getId());
        assertNotNull(p.getId());

        list = sqlEngine.query(session, Person.class);
        assertEquals(3, list.size());
    }
}
