package org.sqlproc.engine.impl;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.form.PersonForm;
import org.sqlproc.engine.form.PersonNameForm;
import org.sqlproc.engine.model.Person;

public class TestDynamicEngine extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/BasicTest.xml";
    }

    static String ANSI_BASIC_2_DYN = "select %p.ID @id, %p.NAME_LAST as @last, %p.SSN_NUMBER @ssn, %p.SSN_COUNTRY @country, "
            + "%p.BIRTHDATE @birthDate, %p.SEX @sex, %p.CREATEDDATE @createdDate, %p.CREATEDBY @createdBy, "
            + "%p.LASTUPDATED @lastUpdated, %p.LASTUPDATEDBY @lastUpdatedBy, %p.VERSION as @version "
            + "from %%PERSON p " + "order by %p.ID";

    @Test
    public void testDynamicEngineLoading() {
        SqlEngineFactory factory = getEngineFactory("ANSI_BASIC_2");
        SqlQueryEngine sqlDefaultEngine = getDefaultQueryEngine("ANSI_BASIC_2", factory);

        SqlQueryEngine sqlStaticEngine = getStaticQueryEngine("ANSI_BASIC_2", factory);
        Assert.assertSame(sqlDefaultEngine, sqlStaticEngine);

        SqlQueryEngine sqlDynamicEngine = getDynamicQueryEngine("ANSI_BASIC_2", ANSI_BASIC_2_DYN, factory);
        Assert.assertNotSame(sqlDefaultEngine, sqlDynamicEngine);
        Assert.assertSame(getDefaultQueryEngine("ANSI_BASIC_2", factory), sqlDynamicEngine);

        SqlQueryEngine sqlStaticEngine2 = getStaticQueryEngine("ANSI_BASIC_2", factory);
        Assert.assertSame(sqlStaticEngine, sqlStaticEngine2);
        Assert.assertSame(getDefaultQueryEngine("ANSI_BASIC_2", factory), sqlStaticEngine2);

        SqlQueryEngine sqlDynamicEngine2 = getDynamicQueryEngine("ANSI_BASIC_2", ANSI_BASIC_2_DYN, factory);
        Assert.assertNotSame(sqlDynamicEngine, sqlDynamicEngine2);
    }

    @Test
    public void testDynamicEngineSelect() {
        SqlEngineFactory factory = getEngineFactory("ANSI_BASIC_2");
        SqlQueryEngine sqlEngine = getDefaultQueryEngine("ANSI_BASIC_2", factory);

        PersonForm pf = new PersonForm();
        pf.setName(new PersonNameForm());
        pf.getName().setLast("Brosnan");
        List<Person> list = sqlEngine.query(session, Person.class, pf);
        Person p = list.get(0);
        assertEquals("Pierce", p.getName().getFirst());

        sqlEngine = getStaticQueryEngine("ANSI_BASIC_2", factory);

        list = sqlEngine.query(session, Person.class, pf);
        p = list.get(0);
        assertEquals("Pierce", p.getName().getFirst());

        sqlEngine = getDefaultQueryEngine("ANSI_BASIC_2", factory);

        list = sqlEngine.query(session, Person.class, pf);
        p = list.get(0);
        assertEquals("Pierce", p.getName().getFirst());

        sqlEngine = getDynamicQueryEngine("ANSI_BASIC_2", ANSI_BASIC_2_DYN, factory);

        list = sqlEngine.query(session, Person.class, pf);
        p = list.get(0);
        assertNull(p.getName().getFirst());

        sqlEngine = getDefaultQueryEngine("ANSI_BASIC_2", factory);

        list = sqlEngine.query(session, Person.class, pf);
        p = list.get(0);
        assertNull(p.getName().getFirst());

        sqlEngine = getStaticQueryEngine("ANSI_BASIC_2", factory);

        list = sqlEngine.query(session, Person.class, pf);
        p = list.get(0);
        assertEquals("Pierce", p.getName().getFirst());

        sqlEngine = getDefaultQueryEngine("ANSI_BASIC_2", factory);

        list = sqlEngine.query(session, Person.class, pf);
        p = list.get(0);
        assertEquals("Pierce", p.getName().getFirst());

        sqlEngine = getDynamicQueryEngine("ANSI_BASIC_2", ANSI_BASIC_2_DYN, factory);

        list = sqlEngine.query(session, Person.class, pf);
        p = list.get(0);
        assertNull(p.getName().getFirst());

        sqlEngine = getDefaultQueryEngine("ANSI_BASIC_2", factory);

        list = sqlEngine.query(session, Person.class, pf);
        p = list.get(0);
        assertNull(p.getName().getFirst());
    }
}
