package org.sqlproc.engine.impl;

import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.model.Country;
import org.sqlproc.engine.model.Gender;
import org.sqlproc.engine.model.Person;

public class TestAsterisk extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/BasicTest.xml";
    }

    @Test
    public void testAnsiBasicAsterisk() {
        SqlQueryEngine sqlEngine = getSqlEngine("ANSI_BASIC_ASTERISK");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "p.*");
        assertContains(sql, "from PERSON p");
        assertContains(sql, "order by p.ID");

        List<Person> list = sqlEngine.query(session, Person.class);

        assertEquals(2, list.size());
        Person p = list.get(0);
        assertEquals(Long.valueOf(2), p.getId());
        assertEquals("1953-05-16", p.getBirthDate().toString());
        assertEquals(null, p.getCreatedDate());
        assertEquals(null, p.getCreatedBy());
        assertEquals("2006-12-08", p.getLastUpdated().toString());
        assertEquals("dbunit", p.getLastUpdatedBy());
        assertEquals(Long.valueOf(1), p.getVersion());
        assertEquals(Gender.MALE, p.getSex());
        assertNotNull(p.getSsn());
        assertEquals("123456", p.getSsn().getNumber());
        assertEquals(Country.UNITED_STATES, p.getSsn().getCountry());
        assertNotNull(p.getName());
        assertEquals("Pierce", p.getName().getFirst());
        assertEquals("Brosnan", p.getName().getLast());
    }
}