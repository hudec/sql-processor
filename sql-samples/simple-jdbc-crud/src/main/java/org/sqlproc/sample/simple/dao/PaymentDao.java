package org.sqlproc.sample.simple.dao;

import java.util.HashMap;
import java.util.Map;

import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.model.BankAccount;
import org.sqlproc.sample.simple.model.CreditCard;
import org.sqlproc.sample.simple.model.Payment;

public class PaymentDao extends BaseDao {

    public PaymentDao(SqlSession session, SqlEngineFactory sqlFactory) {
        super(sqlFactory, session);
    }

    public Payment insertPayment(Payment payment) {
        SqlCrudEngine sqlInsertPayment = getCrudEngine("INSERT_PAYMENT");
        int count = sqlInsertPayment.insert(session, payment);
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
        Payment s = sqlEngine.get(session, Payment.class, payment, null, moreResultClasses);
        logger.info("get payment: " + s);
        return s;
    }

    public Payment updatePayment(Payment payment) {
        SqlCrudEngine sqlEngine = getCrudEngine("UPDATE_PAYMENT");
        int count = sqlEngine.update(session, payment);
        logger.info("update payment: " + count);
        return (count > 0) ? payment : null;
    }

    public boolean deletePayment(Payment payment) {
        SqlCrudEngine sqlEngine = getCrudEngine("DELETE_PAYMENT");
        int count = sqlEngine.delete(session, payment);
        logger.info("delete payment: " + count);
        return (count > 0);
    }

}
