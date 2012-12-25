package org.sqlproc.sample.simple.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.sample.simple.model.BankAccount;

public class BankAccountDao1 {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    private SqlEngineFactory sqlEngineFactory;
    private SqlSessionFactory sqlSessionFactory;

    public BankAccountDao1(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
        this.sqlEngineFactory = sqlEngineFactory;
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public BankAccount insertBankAccount(BankAccount bankAccount) {
        SqlCrudEngine sqlInsertBankAccount = sqlEngineFactory.getCrudEngine("INSERT_BANK_ACCOUNT");
        int count = sqlInsertBankAccount.insert(sqlSessionFactory.getSqlSession(), bankAccount);
        logger.info("insert bank account: " + count + ": " + bankAccount);
        if (count > 0)
            bankAccount.getSubscriber().getBillingDetails().add(bankAccount);
        return (count > 0) ? bankAccount : null;
    }

    public BankAccount getBankAccount(BankAccount bankAccount) {
        SqlCrudEngine sqlEngine = sqlEngineFactory.getCrudEngine("GET_BANK_ACCOUNT");
        BankAccount b = sqlEngine.get(sqlSessionFactory.getSqlSession(), BankAccount.class, bankAccount);
        logger.info("get bank account: " + b);
        return b;
    }

    public BankAccount updateBankAccount(BankAccount bankAccount) {
        SqlCrudEngine sqlEngine = sqlEngineFactory.getCrudEngine("UPDATE_BANK_ACCOUNT");
        int count = sqlEngine.update(sqlSessionFactory.getSqlSession(), bankAccount);
        logger.info("update bank account: " + count);
        if (count > 0) {
            bankAccount.getSubscriber().getBillingDetails().remove(bankAccount);
            bankAccount.getSubscriber().getBillingDetails().add(bankAccount);
        }
        return (count > 0) ? bankAccount : null;
    }

    public boolean deleteBankAccount(BankAccount bankAccount) {
        SqlCrudEngine sqlEngine = sqlEngineFactory.getCrudEngine("DELETE_BANK_ACCOUNT");
        int count = sqlEngine.delete(sqlSessionFactory.getSqlSession(), bankAccount);
        logger.info("delete bank account: " + count);
        if (count > 0)
            bankAccount.getSubscriber().getBillingDetails().remove(bankAccount);
        return (count > 0);
    }
}
