package org.sqlproc.sample.simple.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.sample.simple.model.CreditCard;

public class CreditCardDao extends BaseDaoImpl {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public CreditCard insertCreditCard(CreditCard creditCard) {
        SqlCrudEngine sqlInsertCreditCard = getCrudEngine("INSERT_CREDIT_CARD");
        int count = sqlInsertCreditCard.insert(getSqlSession(), creditCard);
        logger.info("insert credit card: " + count + ": " + creditCard);
        if (count > 0)
            creditCard.getSubscriber().getBillingDetails().add(creditCard);
        return (count > 0) ? creditCard : null;
    }

    public CreditCard getCreditCard(CreditCard creditCard) {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_CREDIT_CARD");
        CreditCard c = sqlEngine.get(getSqlSession(), CreditCard.class, creditCard);
        logger.info("get credit card: " + c);
        return c;
    }

    public CreditCard updateCreditCard(CreditCard creditCard) {
        SqlCrudEngine sqlEngine = getCrudEngine("UPDATE_CREDIT_CARD");
        int count = sqlEngine.update(getSqlSession(), creditCard);
        logger.info("update credit card: " + count);
        return (count > 0) ? creditCard : null;
    }

    public boolean deleteCreditCard(CreditCard creditCard) {
        SqlCrudEngine sqlEngine = getCrudEngine("DELETE_CREDIT_CARD");
        int count = sqlEngine.delete(getSqlSession(), creditCard);
        logger.info("delete contact: " + count);
        return (count > 0);
    }
}
