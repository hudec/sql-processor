package org.sqlproc.engine.impl;

import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.form.PersonForm;
import org.sqlproc.engine.form.PersonNameForm;
import org.sqlproc.engine.model.Person;

public class TestSqlEscaped extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/BasicTest.xml";
    }

    @Test
    public void testSimpleEscaped() {
        SqlQueryEngine sqlEngine = getSqlEngine("SIMPLE_ESCAPED");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);

        List<Person> list = sqlEngine.query(session, Person.class, new Object());

        assertEquals(2, list.size());
        Person p = list.get(0);
        assertEquals(new Long(2), p.getId());
        assertNotNull(p.getName());
        assertEquals(":$@}|", p.getName().getFirst());
        assertEquals("Brosnan", p.getName().getLast());
    }

    @Test
    public void testInMetaEscaped() {
        SqlQueryEngine sqlEngine = getSqlEngine("IN_META_ESCAPED");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);

        PersonForm pf = new PersonForm();
        pf.setName(new PersonNameForm());
        pf.getName().setLast("Brosnan");
        List<Person> list = sqlEngine.query(session, Person.class, new Object(), pf);

        assertEquals(2, list.size());
        Person p = list.get(0);
        assertEquals(new Long(2), p.getId());
        assertNotNull(p.getName());
        assertEquals(":$@}|", p.getName().getFirst());
        assertEquals("brosnan", p.getName().getLast());
    }
}
