package org.sqlproc.engine.impl;

import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.model.Engagement;
import org.sqlproc.engine.model.Person;
import org.sqlproc.engine.model.PersonName;

public class TestUpdate extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/JoinsTest.xml";
    }

    @Test
    public void testUpdate3() {
        Engagement engagementWhere = new Engagement();
        engagementWhere.setId(1L);
        Engagement engagementUpdate = new Engagement();
        engagementUpdate.setRole("Writes");
        SqlStandardControl sqc = new SqlStandardControl();
        sqc.setDynamicUpdateValues(engagementUpdate);

        SqlCrudEngine crudEngine = getCrudEngine("UPDATE_ENGAGEMENT_3");

        String sql = crudEngine.getSql(engagementWhere, sqc, SqlMetaStatement.Type.UPDATE);
        logger.info(sql);
        assertContains(sql, "update ENGAGEMENT");
        assertContains(sql, "SET");
        assertContains(sql, "ROLE = :role", "ROLE = ?");
        assertDoNotContain(sql, "UUID = ");
        assertDoNotContain(sql, "PERSON = ");

        engagementUpdate.setPerson(new Person());
        sql = crudEngine.getSql(engagementWhere, sqc, SqlMetaStatement.Type.UPDATE);
        logger.info(sql);
        assertContains(sql, "update ENGAGEMENT");
        assertContains(sql, "SET");
        assertContains(sql, "ROLE = :role", "ROLE = ?");
        assertDoNotContain(sql, "UUID = ");
        assertDoNotContain(sql, "PERSON = ");

        int count = crudEngine.update(session, engagementWhere, sqc);
        assertEquals(1, count);

        engagementUpdate.getPerson().setId(01L);
        sql = crudEngine.getSql(engagementWhere, sqc, SqlMetaStatement.Type.UPDATE);
        logger.info(sql);
        assertContains(sql, "update ENGAGEMENT");
        assertContains(sql, "SET");
        assertContains(sql, "ROLE = :role", "ROLE = ?");
        assertDoNotContain(sql, "UUID = ");
        assertContains(sql, "PERSON = :person", "PERSON = ?");

        count = crudEngine.update(session, engagementWhere, sqc);
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

        Person personUpdate = new Person();
        personUpdate.setName(new PersonName());
        personUpdate.getName().setFirst("Toby");
        personUpdate.setCreatedDate(null);
        SqlStandardControl sqc = new SqlStandardControl();
        sqc.setDynamicUpdateValues(personUpdate);

        Person personWhere = new Person();
        personWhere.setId(p.getId());

        SqlCrudEngine crudEngine = getCrudEngine("UPDATE_PERSON_2");

        String sql = crudEngine.getSql(personWhere, sqc, SqlMetaStatement.Type.UPDATE);
        logger.info(sql);
        assertContains(sql, "update PERSON");
        assertContains(sql, "SET");
        assertContains(sql, "NAME_FIRST = :name_first", "NAME_FIRST = ?");
        assertContains(sql, "CREATEDDATE = :createdDate", "CREATEDDATE = ?");
        assertContains(sql, "WHERE");
        assertContains(sql, "ID = :id", "ID = ?");

        int count = crudEngine.update(session, personWhere, sqc);
        assertEquals(1, count);

        list = sqlEngine.query(session, Person.class, p);
        assertEquals(1, list.size());
        assertEquals("Toby", list.get(0).getName().getFirst());
//        if ("MYSQL".equalsIgnoreCase(dbType))
//            assertNotNull(list.get(0).getCreatedDate());
//        else
        assertEquals(null, list.get(0).getCreatedDate());
    }
}
