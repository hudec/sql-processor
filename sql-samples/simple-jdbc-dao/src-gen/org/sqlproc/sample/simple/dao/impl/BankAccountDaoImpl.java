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
import org.sqlproc.engine.SqlProcedureEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.sqlproc.sample.simple.model.BankAccount;

public class BankAccountDaoImpl extends BaseDaoImpl implements BaseDao, BankAccountDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public BankAccountDaoImpl() {
  }
    	
  public BankAccountDaoImpl(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public BankAccountDaoImpl(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public BankAccount insert(SqlSession sqlSession, BankAccount bankAccount, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert bankAccount: " + bankAccount + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertBankAccount = sqlEngineFactory.getCheckedCrudEngine("INSERT_BANK_ACCOUNT");
    int count = sqlInsertBankAccount.insert(sqlSession, bankAccount, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("insert bankAccount result: " + count + " " + bankAccount);
    }
    return (count > 0) ? bankAccount : null;
  }
  public BankAccount insert(BankAccount bankAccount, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), bankAccount, sqlControl);
  }
  public BankAccount insert(SqlSession sqlSession, BankAccount bankAccount) {
    return insert(sqlSession, bankAccount, null);
  }
  public BankAccount insert(BankAccount bankAccount) {
    return insert(bankAccount, null);
  }
  
  public BankAccount get(SqlSession sqlSession, BankAccount bankAccount, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + bankAccount + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineBankAccount = sqlEngineFactory.getCheckedCrudEngine("GET_BANK_ACCOUNT");
    //sqlControl = getMoreResultClasses(bankAccount, sqlControl);
    BankAccount bankAccountGot = sqlGetEngineBankAccount.get(sqlSession, BankAccount.class, bankAccount, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get bankAccount result: " + bankAccountGot);
    }
    return bankAccountGot;
  }
  public BankAccount get(BankAccount bankAccount, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), bankAccount, sqlControl);
  }
  public BankAccount get(SqlSession sqlSession, BankAccount bankAccount) {
    return get(sqlSession, bankAccount, null);
  }
  public BankAccount get(BankAccount bankAccount) {
    return get(bankAccount, null);
  }
  
  public int update(SqlSession sqlSession, BankAccount bankAccount, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update bankAccount: " + bankAccount + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineBankAccount = sqlEngineFactory.getCheckedCrudEngine("UPDATE_BANK_ACCOUNT");
    int count = sqlUpdateEngineBankAccount.update(sqlSession, bankAccount, sqlControl);
    if (count > 0) {
    	bankAccount.setVersion(bankAccount.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("update bankAccount result count: " + count);
    }
    return count;
  }
  public int update(BankAccount bankAccount, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), bankAccount, sqlControl);
  }
  public int update(SqlSession sqlSession, BankAccount bankAccount) {
    return update(sqlSession, bankAccount, null);
  }
  public int update(BankAccount bankAccount) {
    return update(bankAccount, null);
  }
  
  public int delete(SqlSession sqlSession, BankAccount bankAccount, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete bankAccount: " + bankAccount + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineBankAccount = sqlEngineFactory.getCheckedCrudEngine("DELETE_BANK_ACCOUNT");
    int count = sqlDeleteEngineBankAccount.delete(sqlSession, bankAccount, sqlControl);
    if (count > 0) {
    	bankAccount.setVersion(bankAccount.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("delete bankAccount result count: " + count);
    }
    return count;
  }
  public int delete(BankAccount bankAccount, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), bankAccount, sqlControl);
  }
  public int delete(SqlSession sqlSession, BankAccount bankAccount) {
    return delete(sqlSession, bankAccount, null);
  }
  public int delete(BankAccount bankAccount) {
    return delete(bankAccount, null);
  }
  
  public List<BankAccount> list(SqlSession sqlSession, BankAccount bankAccount, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list bankAccount: " + bankAccount + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineBankAccount = sqlEngineFactory.getCheckedQueryEngine("SELECT_BANK_ACCOUNT");
    //sqlControl = getMoreResultClasses(bankAccount, sqlControl);
    List<BankAccount> bankAccountList = sqlEngineBankAccount.query(sqlSession, BankAccount.class, bankAccount, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list bankAccount size: " + ((bankAccountList != null) ? bankAccountList.size() : "null"));
    }
    return bankAccountList;
  }
  public List<BankAccount> list(BankAccount bankAccount, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), bankAccount, sqlControl);
  }
      public List<BankAccount> list(SqlSession sqlSession, BankAccount bankAccount) {
    return list(sqlSession, bankAccount, null);
  }
  public List<BankAccount> list(BankAccount bankAccount) {
    return list(bankAccount, null);
  }
  
  public int count(SqlSession sqlSession, BankAccount bankAccount, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("count bankAccount: " + bankAccount + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineBankAccount = sqlEngineFactory.getCheckedQueryEngine("SELECT_BANK_ACCOUNT");
    //sqlControl = getMoreResultClasses(bankAccount, sqlControl);
    int count = sqlEngineBankAccount.queryCount(sqlSession, bankAccount, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("count: " + count);
    }
    return count;
  }
  public int count(BankAccount bankAccount, SqlControl sqlControl) {
  	return count(sqlSessionFactory.getSqlSession(), bankAccount, sqlControl);
  }
      public int count(SqlSession sqlSession, BankAccount bankAccount) {
    return count(sqlSession, bankAccount, null);
  }
  public int count(BankAccount bankAccount) {
    return count(bankAccount, null);
  }
}
