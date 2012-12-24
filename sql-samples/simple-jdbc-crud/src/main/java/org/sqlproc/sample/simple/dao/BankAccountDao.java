package org.sqlproc.sample.simple.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.sample.simple.model.BankAccount;

public class BankAccountDao extends BaseDaoImpl {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public BankAccount insertBankAccount(BankAccount bankAccount) {
        SqlCrudEngine sqlInsertBankAccount = getCrudEngine("INSERT_BANK_ACCOUNT");
        int count = sqlInsertBankAccount.insert(getSqlSession(), bankAccount);
        logger.info("insert bank account: " + count + ": " + bankAccount);
        if (count > 0)
            bankAccount.getSubscriber().getBillingDetails().add(bankAccount);
        return (count > 0) ? bankAccount : null;
    }

    public BankAccount getBankAccount(BankAccount bankAccount) {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_BANK_ACCOUNT");
        BankAccount b = sqlEngine.get(getSqlSession(), BankAccount.class, bankAccount);
        logger.info("get bank account: " + b);
        return b;
    }

    public BankAccount updateBankAccount(BankAccount bankAccount) {
        SqlCrudEngine sqlEngine = getCrudEngine("UPDATE_BANK_ACCOUNT");
        int count = sqlEngine.update(getSqlSession(), bankAccount);
        logger.info("update bank account: " + count);
        if (count > 0) {
            bankAccount.getSubscriber().getBillingDetails().remove(bankAccount);
            bankAccount.getSubscriber().getBillingDetails().add(bankAccount);
        }
        return (count > 0) ? bankAccount : null;
    }

    public boolean deleteBankAccount(BankAccount bankAccount) {
        SqlCrudEngine sqlEngine = getCrudEngine("DELETE_BANK_ACCOUNT");
        int count = sqlEngine.delete(getSqlSession(), bankAccount);
        logger.info("delete bank account: " + count);
        if (count > 0)
            bankAccount.getSubscriber().getBillingDetails().remove(bankAccount);
        return (count > 0);
    }
}
