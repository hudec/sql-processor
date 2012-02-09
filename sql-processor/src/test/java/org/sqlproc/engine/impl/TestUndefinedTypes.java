package org.sqlproc.engine.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.form.TypesTransport;

public class TestUndefinedTypes extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        if (dbType.equalsIgnoreCase("oracle"))
            return "dbunit/TypesTest_oracle.xml";
        else if (dbType.equalsIgnoreCase("postgresql"))
            return "dbunit/TypesTest_postgresql.xml";
        else if (dbType.equalsIgnoreCase("informix"))
            return "dbunit/TypesTest_informix.xml";
        else if (dbType.equalsIgnoreCase("mssql"))
            return "dbunit/TypesTest_mssql.xml";
        else
            return "dbunit/TypesTest.xml";
    }

    @Test
    public void testUndefinedTypes() throws SQLException {
        SqlQueryEngine sqlEngine = getSqlEngine("UNDEFINED_TYPES");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);

        List<TypesTransport> list = sqlEngine.query(session, TypesTransport.class, null, null, SqlQueryEngine.NO_ORDER,
                0, 0, 0);

        assertEquals(1, list.size());
        TypesTransport t = list.get(0);

        assertEquals(2, t.getN_int());
        assertEquals(new Integer(2), t.getT_int());

        assertEquals(3, t.getN_long());
        assertEquals(new Long(3L), t.getT_long());

        assertEquals(4, t.getN_byte());
        assertEquals(new Byte((byte) 4), t.getT_byte());

        assertEquals(5, t.getN_short());
        assertEquals(new Short((short) 5), t.getT_short());

        assertEquals(6.1, t.getN_float(), 0.001);
        assertEquals(new Float(6.1), t.getT_float(), 0.001);

        assertEquals(7.2, t.getN_double(), 0.001);
        assertEquals(new Double(7.2), t.getT_double(), 0.001);

        assertEquals('x', t.getN_char());
        assertEquals(new Character('x'), t.getT_char());

        assertEquals("abc", t.getT_string());

        assertEquals("14:55:02", t.getT_time().toString());
        assertEquals("2009-08-31", t.getT_date().toString());
        assertEquals("2009-08-31 14:55:02.0", t.getT_datetime().toString());
        if ("mysql".equalsIgnoreCase(dbType))
            assertEquals("2009-08-31 14:55:02.0", t.getT_timestamp().toString());
        else if ("hsqldb".equalsIgnoreCase(dbType) || "postgresql".equalsIgnoreCase(dbType)
                || "db2".equalsIgnoreCase(dbType))
            assertEquals("2009-08-31 14:55:02.123456", t.getT_timestamp().toString());
        else if ("informix".equalsIgnoreCase(dbType) || "mssql".equalsIgnoreCase(dbType))
            assertEquals("2009-08-31 14:55:02.123", t.getT_timestamp().toString());
        else
            assertEquals("2009-08-31 14:55:02.123456789", t.getT_timestamp().toString());

        assertEquals(true, t.isN_boolean());
        assertEquals(Boolean.TRUE, t.getT_boolean());

        assertEquals(new BigInteger("8"), t.getT_big_integer());
        assertEquals(new BigDecimal("9.3"), t.getT_big_decimal());

        // BASE64Encoder code = new BASE64Encoder();
        // logger.info(code.encode("byebye".getBytes()));
        assertEquals("ahoj", new String(t.getAn_byte()));
        assertEquals(t.getAn_byte().length, t.getAt_byte().length);
        for (int i = 0; i < t.getAn_byte().length; i++)
            assertEquals(t.getAn_byte()[i], t.getAt_byte()[i].byteValue());
        assertEquals("hello", t.getA_text());

        if (!dbType.equalsIgnoreCase("postgresql")) {
            assertEquals("byebye", new String(t.getA_blob().getBytes(1L, (int) t.getA_blob().length())));
            assertEquals("dovi", t.getA_clob().getSubString(1L, (int) t.getA_clob().length()));
        }
    }

    @Test
    public void testUndefinedTypes2() throws SQLException {
        SqlQueryEngine sqlEngine = getSqlEngine("UNDEFINED_TYPES_2");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);

        List<TypesTransport> list = sqlEngine.query(session, TypesTransport.class, null, null, SqlQueryEngine.NO_ORDER,
                0, 0, 0);

        assertEquals(1, list.size());
        TypesTransport t = list.get(0);

        assertEquals(2, t.getN_int());
        assertEquals(new Integer(2), t.getT_int());

        assertEquals(3, t.getN_long());
        assertEquals(new Long(3L), t.getT_long());

        assertEquals(4, t.getN_byte());
        assertEquals(new Byte((byte) 4), t.getT_byte());

        assertEquals(5, t.getN_short());
        assertEquals(new Short((short) 5), t.getT_short());

        assertEquals(6.1, t.getN_float(), 0.001);
        assertEquals(new Float(6.1), t.getT_float(), 0.001);

        assertEquals(7.2, t.getN_double(), 0.001);
        assertEquals(new Double(7.2), t.getT_double(), 0.001);

        assertEquals('x', t.getN_char());
        assertEquals(new Character('x'), t.getT_char());

        assertEquals("abc", t.getT_string());

        assertEquals("14:55:02", t.getT_time().toString());
        assertEquals("2009-08-31", t.getT_date().toString());
        assertEquals("2009-08-31 14:55:02.0", t.getT_datetime().toString());
        if ("mysql".equalsIgnoreCase(dbType))
            assertEquals("2009-08-31 14:55:02.0", t.getT_timestamp().toString());
        else if ("hsqldb".equalsIgnoreCase(dbType) || "postgresql".equalsIgnoreCase(dbType)
                || "db2".equalsIgnoreCase(dbType))
            assertEquals("2009-08-31 14:55:02.123456", t.getT_timestamp().toString());
        else if ("informix".equalsIgnoreCase(dbType) || "mssql".equalsIgnoreCase(dbType))
            assertEquals("2009-08-31 14:55:02.123", t.getT_timestamp().toString());
        else
            assertEquals("2009-08-31 14:55:02.123456789", t.getT_timestamp().toString());

        assertEquals(true, t.isN_boolean());
        assertEquals(Boolean.TRUE, t.getT_boolean());

        assertEquals(new BigInteger("8"), t.getT_big_integer());
        assertEquals(new BigDecimal("9.3"), t.getT_big_decimal());

        // BASE64Encoder code = new BASE64Encoder();
        // logger.info(code.encode("byebye".getBytes()));
        assertEquals("ahoj", new String(t.getAn_byte()));
        assertEquals(t.getAn_byte().length, t.getAt_byte().length);
        for (int i = 0; i < t.getAn_byte().length; i++)
            assertEquals(t.getAn_byte()[i], t.getAt_byte()[i].byteValue());
        assertEquals("hello", t.getA_text());

        if (!dbType.equalsIgnoreCase("postgresql")) {
            assertEquals("byebye", new String(t.getA_blob().getBytes(1L, (int) t.getA_blob().length())));
            assertEquals("dovi", t.getA_clob().getSubString(1L, (int) t.getA_clob().length()));
        }
    }
}
