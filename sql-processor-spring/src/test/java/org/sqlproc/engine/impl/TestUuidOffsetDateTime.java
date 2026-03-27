package org.sqlproc.engine.impl;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.form.TypesExtTransport;

public class TestUuidOffsetDateTime extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/TypesExtTest.xml";
    }

    @Test
    public void testUuidType() {
        SqlQueryEngine sqlEngine = getSqlEngine("UUID_OFFSET_DATE_TIME_TYPES");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);

        List<TypesExtTransport> list = sqlEngine.query(session, TypesExtTransport.class, null, null,
                SqlQueryEngine.NO_ORDER, 0, 0, 0);

        assertEquals(2, list.size());
        TypesExtTransport t = list.get(0);

        assertNotNull(t.getT_uuid());
        assertEquals(UUID.fromString("a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11"), t.getT_uuid());
    }

    @Test
    public void testOffsetDateTimeType() {
        SqlQueryEngine sqlEngine = getSqlEngine("UUID_OFFSET_DATE_TIME_TYPES");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);

        List<TypesExtTransport> list = sqlEngine.query(session, TypesExtTransport.class, null, null,
                SqlQueryEngine.NO_ORDER, 0, 0, 0);

        assertEquals(2, list.size());
        TypesExtTransport t = list.get(0);

        assertNotNull(t.getT_offset_date_time());
        OffsetDateTime odt = t.getT_offset_date_time();
        assertEquals(2024, odt.getYear());
        assertEquals(6, odt.getMonthValue());
        assertEquals(15, odt.getDayOfMonth());
        assertEquals(10, odt.getHour());
        assertEquals(30, odt.getMinute());
        assertEquals(0, odt.getSecond());
    }

    @Test
    public void testUuidTypeInlineMapping() {
        SqlQueryEngine sqlEngine = getSqlEngine("UUID_OFFSET_DATE_TIME_TYPES_2");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);

        List<TypesExtTransport> list = sqlEngine.query(session, TypesExtTransport.class, null, null,
                SqlQueryEngine.NO_ORDER, 0, 0, 0);

        assertEquals(2, list.size());
        TypesExtTransport t = list.get(0);

        assertNotNull(t.getT_uuid());
        assertEquals(UUID.fromString("a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11"), t.getT_uuid());

        assertNotNull(t.getT_offset_date_time());
        OffsetDateTime odt = t.getT_offset_date_time();
        assertEquals(2024, odt.getYear());
        assertEquals(6, odt.getMonthValue());
        assertEquals(15, odt.getDayOfMonth());
    }

    @Test
    public void testInsertAndQueryUuid() {
        SqlCrudEngine crudEngine = getCrudEngine("INSERT_TYPES_EXT");

        UUID testUuid = UUID.fromString("c2aabb11-de2d-6fa0-dd8f-8ddade502c33");
        OffsetDateTime testOdt = OffsetDateTime.parse("2026-03-27T12:00:00+02:00");

        TypesExtTransport insert = new TypesExtTransport();
        insert.setId(3L);
        insert.setT_uuid(testUuid);
        insert.setT_offset_date_time(testOdt);

        int count = crudEngine.insert(session, insert);
        assertEquals(1, count);

        // Query back by UUID
        SqlQueryEngine sqlEngine = getSqlEngine("SELECT_TYPES_EXT_BY_UUID");

        TypesExtTransport filter = new TypesExtTransport();
        filter.setT_uuid(testUuid);

        List<TypesExtTransport> list = sqlEngine.query(session, TypesExtTransport.class, filter);

        assertEquals(1, list.size());
        TypesExtTransport result = list.get(0);
        assertEquals(Long.valueOf(3), result.getId());
        assertEquals(testUuid, result.getT_uuid());
        assertNotNull(result.getT_offset_date_time());
        assertEquals(2026, result.getT_offset_date_time().getYear());
        assertEquals(3, result.getT_offset_date_time().getMonthValue());
        assertEquals(27, result.getT_offset_date_time().getDayOfMonth());
    }

    @Test
    public void testQueryWithUuidFilter() {
        SqlQueryEngine sqlEngine = getSqlEngine("SELECT_TYPES_EXT_BY_UUID");

        TypesExtTransport filter = new TypesExtTransport();
        filter.setT_uuid(UUID.fromString("a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11"));

        String sql = sqlEngine.getSql(filter, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "T_UUID");

        List<TypesExtTransport> list = sqlEngine.query(session, TypesExtTransport.class, filter);

        assertEquals(1, list.size());
        TypesExtTransport t = list.get(0);
        assertEquals(Long.valueOf(1), t.getId());
        assertEquals(UUID.fromString("a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11"), t.getT_uuid());
    }

    @Test
    public void testQueryWithIdFilter() {
        SqlQueryEngine sqlEngine = getSqlEngine("UUID_OFFSET_DATE_TIME_TYPES");

        TypesExtTransport filter = new TypesExtTransport();
        filter.setId(2L);

        String sql = sqlEngine.getSql(filter, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "t.ID");

        List<TypesExtTransport> list = sqlEngine.query(session, TypesExtTransport.class, filter, null,
                SqlQueryEngine.NO_ORDER, 0, 0, 0);

        assertEquals(1, list.size());
        TypesExtTransport t = list.get(0);
        assertEquals(Long.valueOf(2), t.getId());
        assertEquals(UUID.fromString("b1ffcd00-ad1c-5fa9-cc7e-7ccace491b22"), t.getT_uuid());
        assertNotNull(t.getT_offset_date_time());
        assertEquals(2025, t.getT_offset_date_time().getYear());
        assertEquals(1, t.getT_offset_date_time().getMonthValue());
        assertEquals(20, t.getT_offset_date_time().getDayOfMonth());
    }

    @Test
    public void testNullUuidAndOffsetDateTime() {
        // Insert a row with null UUID and null OffsetDateTime
        SqlCrudEngine crudEngine = getCrudEngine("INSERT_TYPES_EXT");

        TypesExtTransport insert = new TypesExtTransport();
        insert.setId(4L);
        insert.setT_uuid(null);
        insert.setT_offset_date_time(null);

        int count = crudEngine.insert(session, insert);
        assertEquals(1, count);

        // Query it back
        SqlQueryEngine sqlEngine = getSqlEngine("UUID_OFFSET_DATE_TIME_TYPES");

        TypesExtTransport filter = new TypesExtTransport();
        filter.setId(4L);

        List<TypesExtTransport> list = sqlEngine.query(session, TypesExtTransport.class, filter, null,
                SqlQueryEngine.NO_ORDER, 0, 0, 0);

        assertEquals(1, list.size());
        TypesExtTransport t = list.get(0);
        assertEquals(Long.valueOf(4), t.getId());
        assertNull(t.getT_uuid());
        assertNull(t.getT_offset_date_time());
    }
}
