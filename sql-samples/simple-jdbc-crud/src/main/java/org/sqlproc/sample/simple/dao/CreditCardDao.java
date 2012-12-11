package org.sqlproc.sample.simple.dao;

import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.model.CreditCard;

public class CreditCardDao extends BaseDao {

    public CreditCardDao(SqlSession session, SqlEngineFactory sqlFactory) {
        super(sqlFactory, session);
    }

    public CreditCard insertCreditCard(CreditCard creditCard) {
        SqlCrudEngine sqlInsertCreditCard = getCrudEngine("INSERT_CREDIT_CARD");
        int count = sqlInsertCreditCard.insert(session, creditCard);
        logger.info("insert credit card: " + count + ": " + creditCard);
        if (count > 0)
            creditCard.getSubscriber().getBillingDetails().add(creditCard);
        return (count > 0) ? creditCard : null;
    }

    public CreditCard getCreditCard(CreditCard creditCard) {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_CREDIT_CARD");
        CreditCard c = sqlEngine.get(session, CreditCard.class, creditCard);
        logger.info("get credit card: " + c);
        return c;
    }

    public CreditCard updateCreditCard(CreditCard creditCard) {
        SqlCrudEngine sqlEngine = getCrudEngine("UPDATE_CREDIT_CARD");
        int count = sqlEngine.update(session, creditCard);
        logger.info("update credit card: " + count);
        return (count > 0) ? creditCard : null;
    }

    public boolean deleteCreditCard(CreditCard creditCard) {
        SqlCrudEngine sqlEngine = getCrudEngine("DELETE_CREDIT_CARD");
        int count = sqlEngine.delete(session, creditCard);
        logger.info("delete contact: " + count);
        return (count > 0);
    }
}
