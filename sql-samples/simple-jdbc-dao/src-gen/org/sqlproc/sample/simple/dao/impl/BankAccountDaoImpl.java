package org.sqlproc.sample.simple.dao.impl;

import org.sqlproc.sample.simple.dao.BankAccountDao;
  
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.dao.impl.BaseDaoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.sqlproc.sample.simple.model.BankAccount;

public class BankAccountDaoImpl extends BaseDaoImpl implements BaseDao, BankAccountDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  private SqlEngineFactory sqlEngineFactory;
  private SqlSessionFactory sqlSessionFactory;
    	
  public BankAccountDaoImpl(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public BankAccount insert(BankAccount bankAccount, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert bankAccount: " + bankAccount + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertBankAccount = sqlEngineFactory.getCrudEngine("INSERT_BANK_ACCOUNT");
    int count = sqlInsertBankAccount.insert(sqlSessionFactory.getSqlSession(), bankAccount);
    if (logger.isTraceEnabled()) {
      logger.trace("insert bankAccount result: " + count + " " + bankAccount);
    }
    return (count > 0) ? bankAccount : null;
  }
  
  public BankAccount insert(BankAccount bankAccount) {
    return insert(bankAccount, null);
  }
  
  public BankAccount get(BankAccount bankAccount, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + bankAccount + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineBankAccount = sqlEngineFactory.getCrudEngine("GET_BANK_ACCOUNT");
    //sqlControl = getMoreResultClasses(bankAccount, sqlControl);
    BankAccount bankAccountGot = sqlGetEngineBankAccount.get(sqlSessionFactory.getSqlSession(), BankAccount.class, bankAccount, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get bankAccount result: " + bankAccountGot);
    }
    return bankAccountGot;
  }
  	
  public BankAccount get(BankAccount bankAccount) {
    return get(bankAccount, null);
  }
  
  public int update(BankAccount bankAccount, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update bankAccount: " + bankAccount + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineBankAccount = sqlEngineFactory.getCrudEngine("UPDATE_BANK_ACCOUNT");
    int count = sqlUpdateEngineBankAccount.update(sqlSessionFactory.getSqlSession(), bankAccount);
    if (count > 0) {
    	bankAccount.setVersion(bankAccount.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("update bankAccount result count: " + count);
    }
    return count;
  }
  
  public int update(BankAccount bankAccount) {
    return update(bankAccount, null);
  }
  
  public int delete(BankAccount bankAccount, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete bankAccount: " + bankAccount + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineBankAccount = sqlEngineFactory.getCrudEngine("DELETE_BANK_ACCOUNT");
    int count = sqlDeleteEngineBankAccount.delete(sqlSessionFactory.getSqlSession(), bankAccount);
    if (count > 0) {
    	bankAccount.setVersion(bankAccount.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("delete bankAccount result count: " + count);
    }
    return count;
  }
  
  public int delete(BankAccount bankAccount) {
    return delete(bankAccount, null);
  }
  
  public List<BankAccount> list(BankAccount bankAccount, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list bankAccount: " + bankAccount + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineBankAccount = sqlEngineFactory.getQueryEngine("SELECT_BANK_ACCOUNT");
    //sqlControl = getMoreResultClasses(bankAccount, sqlControl);
    List<BankAccount> bankAccountList = sqlEngineBankAccount.query(sqlSessionFactory.getSqlSession(), BankAccount.class, bankAccount, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list bankAccount size: " + ((bankAccountList != null) ? bankAccountList.size() : "null"));
    }
    return bankAccountList;
  }
  
  public List<BankAccount> list(BankAccount bankAccount) {
    return list(bankAccount, null);
  }
}
