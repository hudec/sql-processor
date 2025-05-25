package org.sqlproc.engine.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.form.NameCollectionsForm;
import org.sqlproc.engine.form.PersonCollectionsForm;
import org.sqlproc.engine.model.Person;

public class TestCollections extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/BasicTest.xml";
    }

    @Test
    public void testCollectionsEmpty() {
        if ("db2".equalsIgnoreCase(dbType)) {
            return;
        }
        SqlQueryEngine sqlEngine = getSqlEngine("COLLECTIONS_EMPTY");

        PersonCollectionsForm pf = new PersonCollectionsForm();
        pf.setIdSet(new HashSet<Long>());

        String sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "p.ID in (null)");
        assertDoNotContain(sql, "p.LASTUPDATEDBY in ");

        List<Person> list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
        assertEquals(0, list.size());
    }

    @Test
    public void testCollectionsEmpty2() {
        if ("db2".equalsIgnoreCase(dbType)) {
            return;
        }
        SqlQueryEngine sqlEngine = getSqlEngine("COLLECTIONS_EMPTY2");

        PersonCollectionsForm pf = new PersonCollectionsForm();
        pf.setIdSet(new HashSet<Long>());

        String sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "p.ID in (null)");
        assertDoNotContain(sql, "p.LASTUPDATEDBY in ");

        List<Person> list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
        assertEquals(0, list.size());

        try {
            list = sqlEngine.query(session, Person.class, null, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testCollectionsNotEmpty() {
        if ("db2".equalsIgnoreCase(dbType)) {
            return;
        }
        SqlQueryEngine sqlEngine = getSqlEngine("COLLECTIONS_NOT_EMPTY");

        PersonCollectionsForm pf = new PersonCollectionsForm();
        pf.setIdSet(new HashSet<Long>());

        try {
            sqlEngine.query(session, Person.class, null, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertContains(e.getMessage(), "notempty");
        }
        try {
            sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertContains(e.getMessage(), "notempty");
        }
    }

    @Test
    public void testCollectionsUndefined() {
        SqlQueryEngine sqlEngine = getSqlEngine("COLLECTIONS_UNDEFINED");

        PersonCollectionsForm pf = new PersonCollectionsForm();
        pf.setIdSet(new HashSet<Long>());
        pf.getIdSet().add(2L);
        pf.getIdSet().add(3L);

        String sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "p.ID in (:idSet_1,:idSet_2)", "p.ID in (?,?)");
        assertDoNotContain(sql, "p.LASTUPDATEDBY in ");
        assertDoNotContain(sql, "p.NAME_LAST in ");

        List<Person> list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
        assertEquals(2, list.size());
        Person p = list.get(0);
        assertEquals(Long.valueOf(2), p.getId());
        assertEquals("dbunit", p.getLastUpdatedBy());
        assertNotNull(p.getName());
        assertEquals("Pierce", p.getName().getFirst());
        assertEquals("Brosnan", p.getName().getLast());

        pf.setUpdatedBySet(new HashSet<String>());
        pf.getUpdatedBySet().add("janek");

        sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "p.ID in (:idSet_1,:idSet_2)", "p.ID in (?,?)");
        assertContains(sql, "p.LASTUPDATEDBY in (:updatedBySet_1)", "p.LASTUPDATEDBY in (?)");
        assertDoNotContain(sql, "p.NAME_LAST in ");

        list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
        assertEquals(0, list.size());

        pf.getUpdatedBySet().add("dbunit");
        list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
        assertEquals(2, list.size());

        pf.setNames(new NameCollectionsForm());

        list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
        assertEquals(2, list.size());

        pf.getNames().setFirstList(new ArrayList<String>());
        pf.getNames().setLastList(new ArrayList<String>());

        list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
        assertEquals(2, list.size());

        pf.getNames().getLastList().add("pepa");

        sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "p.ID in (:idSet_1,:idSet_2)", "p.ID in (?,?)");
        assertContains(sql, "p.LASTUPDATEDBY in (:updatedBySet_1,:updatedBySet_2)", "p.LASTUPDATEDBY in (?,?)");
        assertContains(sql, "p.NAME_LAST in (:names_lastList_1)", "p.NAME_LAST in (?)");

        list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
        assertEquals(0, list.size());

        pf.getNames().getLastList().add("Brosnan");

        list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
        assertEquals(1, list.size());
    }

    @Test
    public void testCollectionsStandard() {
        SqlQueryEngine sqlEngine = getSqlEngine("COLLECTIONS_STANDARD");

        PersonCollectionsForm pf = new PersonCollectionsForm();
        pf.setIdSet(new HashSet<Long>());
        pf.getIdSet().add(2L);
        pf.getIdSet().add(3L);

        String sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "p.ID in (:idSet_1,:idSet_2)", "p.ID in (?,?)");
        assertDoNotContain(sql, "p.LASTUPDATEDBY in ");
        assertDoNotContain(sql, "p.NAME_LAST in ");

        List<Person> list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
        assertEquals(2, list.size());
        Person p = list.get(0);
        assertEquals(Long.valueOf(2), p.getId());
        assertEquals("dbunit", p.getLastUpdatedBy());
        assertNotNull(p.getName());
        assertEquals("Pierce", p.getName().getFirst());
        assertEquals("Brosnan", p.getName().getLast());

        pf.setUpdatedBySet(new HashSet<String>());
        pf.getUpdatedBySet().add("janek");

        sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "p.ID in (:idSet_1,:idSet_2)", "p.ID in (?,?)");
        assertContains(sql, "p.LASTUPDATEDBY in (:updatedBySet_1)", "p.LASTUPDATEDBY in (?)");
        assertDoNotContain(sql, "p.NAME_LAST in ");

        list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
        assertEquals(0, list.size());

        pf.getUpdatedBySet().add("dbunit");
        list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
        assertEquals(2, list.size());

        pf.setNames(new NameCollectionsForm());

        list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
        assertEquals(2, list.size());

        pf.getNames().setFirstList(new ArrayList<String>());
        pf.getNames().setLastList(new ArrayList<String>());

        list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
        assertEquals(2, list.size());

        pf.getNames().getLastList().add("pepa");

        sql = sqlEngine.getSql(pf, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);
        assertContains(sql, "p.ID in (:idSet_1,:idSet_2)", "p.ID in (?,?)");
        assertContains(sql, "p.LASTUPDATEDBY in (:updatedBySet_1,:updatedBySet_2)", "p.LASTUPDATEDBY in (?,?)");
        assertContains(sql, "p.NAME_LAST in (:names_lastList_1)", "p.NAME_LAST in (?)");

        list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
        assertEquals(0, list.size());

        pf.getNames().getLastList().add("Brosnan");

        list = sqlEngine.query(session, Person.class, pf, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
        assertEquals(1, list.size());
    }
}
