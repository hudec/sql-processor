package org.sqlproc.engine.impl;

import java.util.List;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.sqlproc.engine.SqlProcessorLoader;
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
        SqlProcessorLoader loader = getProcessorLoader("ANSI_BASIC_2");
        SqlQueryEngine sqlDefaultEngine = getDefaultQueryEngine("ANSI_BASIC_2", loader);

        SqlQueryEngine sqlStaticEngine = getStaticQueryEngine("ANSI_BASIC_2", loader);
        Assertions.assertSame(sqlDefaultEngine, sqlStaticEngine);

        SqlQueryEngine sqlDynamicEngine = getDynamicQueryEngine("ANSI_BASIC_2", ANSI_BASIC_2_DYN, loader);
        Assertions.assertNotSame(sqlDefaultEngine, sqlDynamicEngine);
        Assertions.assertSame(getDefaultQueryEngine("ANSI_BASIC_2", loader), sqlDynamicEngine);

        SqlQueryEngine sqlStaticEngine2 = getStaticQueryEngine("ANSI_BASIC_2", loader);
        Assertions.assertSame(sqlStaticEngine, sqlStaticEngine2);
        Assertions.assertSame(getDefaultQueryEngine("ANSI_BASIC_2", loader), sqlStaticEngine2);

        SqlQueryEngine sqlDynamicEngine2 = getDynamicQueryEngine("ANSI_BASIC_2", ANSI_BASIC_2_DYN, loader);
        Assertions.assertNotSame(sqlDynamicEngine, sqlDynamicEngine2);
    }

    @Test
    public void testDynamicEngineSelect() {
        SqlProcessorLoader loader = getProcessorLoader("ANSI_BASIC_2");
        SqlQueryEngine sqlEngine = getDefaultQueryEngine("ANSI_BASIC_2", loader);

        PersonForm pf = new PersonForm();
        pf.setName(new PersonNameForm());
        pf.getName().setLast("Brosnan");
        List<Person> list = sqlEngine.query(session, Person.class, pf);
        Person p = list.get(0);
        assertEquals("Pierce", p.getName().getFirst());

        sqlEngine = getStaticQueryEngine("ANSI_BASIC_2", loader);

        list = sqlEngine.query(session, Person.class, pf);
        p = list.get(0);
        assertEquals("Pierce", p.getName().getFirst());

        sqlEngine = getDefaultQueryEngine("ANSI_BASIC_2", loader);

        list = sqlEngine.query(session, Person.class, pf);
        p = list.get(0);
        assertEquals("Pierce", p.getName().getFirst());

        sqlEngine = getDynamicQueryEngine("ANSI_BASIC_2", ANSI_BASIC_2_DYN, loader);

        list = sqlEngine.query(session, Person.class, pf);
        p = list.get(0);
        assertNull(p.getName().getFirst());

        sqlEngine = getDefaultQueryEngine("ANSI_BASIC_2", loader);

        list = sqlEngine.query(session, Person.class, pf);
        p = list.get(0);
        assertNull(p.getName().getFirst());

        sqlEngine = getStaticQueryEngine("ANSI_BASIC_2", loader);

        list = sqlEngine.query(session, Person.class, pf);
        p = list.get(0);
        assertEquals("Pierce", p.getName().getFirst());

        sqlEngine = getDefaultQueryEngine("ANSI_BASIC_2", loader);

        list = sqlEngine.query(session, Person.class, pf);
        p = list.get(0);
        assertEquals("Pierce", p.getName().getFirst());

        sqlEngine = getDynamicQueryEngine("ANSI_BASIC_2", ANSI_BASIC_2_DYN, loader);

        list = sqlEngine.query(session, Person.class, pf);
        p = list.get(0);
        assertNull(p.getName().getFirst());

        sqlEngine = getDefaultQueryEngine("ANSI_BASIC_2", loader);

        list = sqlEngine.query(session, Person.class, pf);
        p = list.get(0);
        assertNull(p.getName().getFirst());
    }
}
