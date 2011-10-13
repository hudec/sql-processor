package org.sqlproc.engine.impl;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.model.Contact;
import org.sqlproc.engine.model.PhoneNumber;

public class TestCustomTypes extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/MoreJoinsTest.xml";
    }

    @Test
    public void testInsert() {
        if ("MYSQL".equalsIgnoreCase(dbType))
            return;

        Contact c = new Contact();
        c.setAddress("Janského 2438");
        c.setCity("Prague");
        c.setZip("15500");
        c.setState(null);
        c.setUuid("2");
        c.setCreatedDate(new Date());
        c.setCreatedBy("wlado");
        c.setVersion(1L);
        c.setPhone(new PhoneNumber(111, 222, 3333));

        SqlCrudEngine insertEngine = getCrudEngine("CUSTOM_TYPE_INSERT");

        String sql = insertEngine.getInsertSql(c, null);
        logger.info(sql);

        int count = insertEngine.insert(session, c);
        assertEquals(1, count);

        SqlCrudEngine getEngine = getCrudEngine("CUSTOM_TYPE_GET");
        Contact form = new Contact();
        form.setPhone(new PhoneNumber(111, 222, 3333));

        Contact cc = getEngine.get(session, Contact.class, form);
        assertNotNull(cc);
        assertEquals("111-222-3333", cc.getPhone().toString());
    }

    @Test
    public void testInsert2() {
        if ("ORACLE".equalsIgnoreCase(dbType))
            return;

        Contact c = new Contact();
        c.setAddress("Janského 2438");
        c.setCity("Prague");
        c.setZip("15500");
        c.setState(null);
        c.setUuid("2");
        c.setCreatedDate(new Date());
        c.setCreatedBy("wlado");
        c.setVersion(1L);
        c.setPhone(new PhoneNumber(111, 222, 3333));

        SqlCrudEngine insertEngine = getCrudEngine("CUSTOM_TYPE_INSERT_2");

        String sql = insertEngine.getInsertSql(c, null);
        logger.info(sql);

        int count = insertEngine.insert(session, c);
        assertEquals(1, count);

        SqlCrudEngine getEngine = getCrudEngine("CUSTOM_TYPE_GET");
        Contact form = new Contact();
        form.setPhone(new PhoneNumber(111, 222, 3333));

        Contact cc = getEngine.get(session, Contact.class, form);
        assertNotNull(cc);
        assertEquals("111-222-3333", cc.getPhone().toString());
    }

    @Test
    public void testCustomInDynamic() {
        SqlQueryEngine selectEngine = getSqlEngine("CUSTOM_TYPE_IN_OUT");

        String sql = selectEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        Contact form = new Contact();
        form.setPhone(new PhoneNumber(111, 222, 3333));

        List<Contact> list = selectEngine.query(session, Contact.class, form, SqlQueryEngine.ASC_ORDER);
        assertEquals(0, list.size());

        form.setPhone(new PhoneNumber(555, 478, 1123));

        list = selectEngine.query(session, Contact.class, form, SqlQueryEngine.ASC_ORDER);
        assertEquals(1, list.size());
    }

    @Test
    public void testCustomOut() {
        SqlQueryEngine selectEngine = getSqlEngine("CUSTOM_TYPE_IN_OUT");

        String sql = selectEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        List<Contact> list = selectEngine.query(session, Contact.class, null, SqlQueryEngine.ASC_ORDER);

        assertEquals(1, list.size());
        Contact c = list.get(0);
        assertEquals(new Long(1), c.getId());
        assertNotNull(c.getPhone());
        assertEquals("555-478-1123", c.getPhone().toString());
    }
}