package org.sqlproc.engine.impl;

import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.model.Country;
import org.sqlproc.engine.model.Gender;
import org.sqlproc.engine.model.Person;
import org.sqlproc.engine.model.PersonName;
import org.sqlproc.engine.model.Size;
import org.sqlproc.engine.model.Ssn;

public class TestIdSelJdbc extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/JoinsTest.xml";
    }

    /**
     * Hibernate stack does not support retrieving generated identity value directly using JDBC. This test expects
     * throwing UnsupportedOperationException.
     */
    @Test
    public void testInsertUsingJdbcIdentities() {
        if ("ORACLE".equalsIgnoreCase(dbType))
            return;

        SqlQueryEngine sqlEngine = getQueryEngine("CRUD_PERSON_SELECT");

        List<Person> list = sqlEngine.query(session, Person.class);
        assertEquals(2, list.size());

        Person p = new Person();
        // p.setId(3L);
        p.setSsn(new Ssn());
        p.getSsn().setNumber("345678");
        p.getSsn().setCountry(Country.UNITED_STATES);
        p.setName(new PersonName());
        p.getName().setFirst("Toby");
        p.getName().setLast("Stephens");
        p.setAge(1969, 4, 21);
        p.setSex(Gender.MALE);
        // p.setCreatedDate(new Date());
        p.setCreatedBy("wlado");
        p.setVersion(1L);
        p.setClothesSize(Size.MIDDLE);

        SqlCrudEngine crudEngine = getCrudEngine("INSERT_PERSON_6", "IDSEL_JDBC_TRUE");

        String sql = crudEngine.getInsertSql(p, null);
        logger.info(sql);
        assertContains(sql, "VALUES");
        assertContains(
                sql,
                ":ssn_number, :ssn_country, :name_first, :name_last, :birthDate, :sex, :createdDate, :createdBy, :version, :clothesSize)",
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        try {
            crudEngine.insert(session, p);
        } catch (UnsupportedOperationException e) {
            assertEquals("Unexpected exception.",
                    "JDBC identity select (IDSEL_JDBC) not supported in Hibernate stack.", e.getMessage());
            return;
        }
        fail("Test exception was not thrown.");
    }

}
