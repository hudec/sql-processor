package org.sqlproc.sample.simple.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.sample.simple.model.BankAccount;
import org.sqlproc.sample.simple.model.CreditCard;
import org.sqlproc.sample.simple.model.Payment;

public class PaymentDao1 extends BaseDaoImpl {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public Payment insertPayment(Payment payment) {
        SqlCrudEngine sqlInsertPayment = getCrudEngine("INSERT_PAYMENT");
        int count = sqlInsertPayment.insert(getSqlSession(), payment);
        logger.info("insert payment: " + count + ": " + payment);
        return (count > 0) ? payment : null;
    }

    public Payment getPayment(Payment payment) {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_PAYMENT");
        Map<String, Class<?>> moreResultClasses = null;
        if (payment.toInit(Payment.Association.billingDetails)) {
            moreResultClasses = new HashMap<String, Class<?>>();
            moreResultClasses.put("BA", BankAccount.class);
            moreResultClasses.put("CC", CreditCard.class);
        }
        Payment s = sqlEngine.get(getSqlSession(), Payment.class, payment, null, moreResultClasses);
        logger.info("get payment: " + s);
        return s;
    }

    public Payment updatePayment(Payment payment) {
        SqlCrudEngine sqlEngine = getCrudEngine("UPDATE_PAYMENT");
        int count = sqlEngine.update(getSqlSession(), payment);
        logger.info("update payment: " + count);
        return (count > 0) ? payment : null;
    }

    public boolean deletePayment(Payment payment) {
        SqlCrudEngine sqlEngine = getCrudEngine("DELETE_PAYMENT");
        int count = sqlEngine.delete(getSqlSession(), payment);
        logger.info("delete payment: " + count);
        return (count > 0);
    }

}
