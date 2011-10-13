package org.sqlproc.engine.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.model.BankAccount;
import org.sqlproc.engine.model.BillingDetails;
import org.sqlproc.engine.model.CreditCard;
import org.sqlproc.engine.model.Subscriber;

public class TestMoreInhertance extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/MoreJoinsTest.xml";
    }

    @Test
    public void testNextInheritance() {
        SqlQueryEngine sqlEngine = getSqlEngine("INHERITANCE2_BASIC");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("CC", CreditCard.class);
        moreResultClasses.put("BA", BankAccount.class);
        List<Subscriber> list = sqlEngine.query(session, Subscriber.class, null, null, SqlQueryEngine.ASC_ORDER, 0, 0,
                0, moreResultClasses);

        Subscriber s;
        BillingDetails bd;
        CreditCard cc;
        BankAccount ba;

        assertEquals(2, list.size());
        s = list.get(0);
        assertEquals(new Long(1), s.getId());
        assertEquals("John", s.getName().getFirst());
        assertEquals("Updike", s.getName().getLast());
        assertEquals(new Long(1), s.getLibrary().getId());
        assertNotNull(s.getBillingDetails());
        assertEquals(2, s.getBillingDetails().size());
        bd = s.getBillingDetails().get(0);
        assertEquals(new Long(1), bd.getId());
        assertEquals("CC", bd.getType());
        assertTrue(bd instanceof CreditCard);
        cc = (CreditCard) bd;
        assertEquals(new Long(123456L), cc.getNumber());
        assertEquals(new Short((short) 11), cc.getExpMonth());
        assertEquals(new Short((short) 12), cc.getExpYear());
        bd = s.getBillingDetails().get(1);
        assertEquals(new Long(2), bd.getId());
        assertEquals("BA", bd.getType());
        assertTrue(bd instanceof BankAccount);
        ba = (BankAccount) bd;
        assertEquals("987654", ba.getAccountNumber());
        assertEquals("Bank of Tramtaria", ba.getBankName());
        assertEquals("234", ba.getSwift());
        s = list.get(1);
        assertEquals(new Long(2), s.getId());
        assertEquals("Peter", s.getName().getFirst());
        assertEquals("Pan", s.getName().getLast());
        assertEquals(new Long(1), s.getLibrary().getId());
        assertNotNull(s.getBillingDetails());
        assertEquals(2, s.getBillingDetails().size());
        bd = s.getBillingDetails().get(0);
        assertEquals(new Long(3), bd.getId());
        assertEquals("CC", bd.getType());
        assertTrue(bd instanceof CreditCard);
        cc = (CreditCard) bd;
        assertEquals(new Long(234567), cc.getNumber());
        assertEquals(new Short((short) 10), cc.getExpMonth());
        assertEquals(new Short((short) 11), cc.getExpYear());
        bd = s.getBillingDetails().get(1);
        assertEquals(new Long(4), bd.getId());
        assertEquals("BA", bd.getType());
        assertTrue(bd instanceof BankAccount);
        ba = (BankAccount) bd;
        assertEquals("876543", ba.getAccountNumber());
        assertEquals("Strong bank", ba.getBankName());
        assertEquals("567", ba.getSwift());
    }
}