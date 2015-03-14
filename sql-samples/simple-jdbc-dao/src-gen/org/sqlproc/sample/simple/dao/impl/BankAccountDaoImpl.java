package org.sqlproc.sample.simple.dao.impl;

import java.util.List;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.sample.simple.dao.BankAccountDao;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.dao.impl.BaseDaoImpl;
import org.sqlproc.sample.simple.model.BankAccount;

@SuppressWarnings("all")
public class BankAccountDaoImpl extends BaseDaoImpl implements BankAccountDao, BaseDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public BankAccountDaoImpl() {
  }
  
  public BankAccountDaoImpl(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public BankAccountDaoImpl(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public BankAccount insert(final SqlSession sqlSession, final BankAccount bankAccount, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert bankAccount: " + bankAccount + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertBankAccount = sqlEngineFactory.getCheckedCrudEngine("INSERT_BANK_ACCOUNT");
    int count = sqlInsertBankAccount.insert(sqlSession, bankAccount, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert bankAccount result: " + count + " " + bankAccount);
    }
    return (count > 0) ? bankAccount : null;
  }
  
  public BankAccount insert(final BankAccount bankAccount, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), bankAccount, sqlControl);
  }
  
  public BankAccount insert(final SqlSession sqlSession, final BankAccount bankAccount) {
    return insert(sqlSession, bankAccount, null);
  }
  
  public BankAccount insert(final BankAccount bankAccount) {
    return insert(bankAccount, null);
  }
  
  public BankAccount get(final SqlSession sqlSession, final BankAccount bankAccount, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + bankAccount + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineBankAccount = sqlEngineFactory.getCheckedCrudEngine("GET_BANK_ACCOUNT");
    //sqlControl = getMoreResultClasses(bankAccount, sqlControl);
    BankAccount bankAccountGot = sqlGetEngineBankAccount.get(sqlSession, BankAccount.class, bankAccount, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get bankAccount result: " + bankAccountGot);
    }
    return bankAccountGot;
  }
  
  public BankAccount get(final BankAccount bankAccount, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), bankAccount, sqlControl);
  }
  
  public BankAccount get(final SqlSession sqlSession, final BankAccount bankAccount) {
    return get(sqlSession, bankAccount, null);
  }
  
  public BankAccount get(final BankAccount bankAccount) {
    return get(bankAccount, null);
  }
  
  public int update(final SqlSession sqlSession, final BankAccount bankAccount, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update bankAccount: " + bankAccount + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineBankAccount = sqlEngineFactory.getCheckedCrudEngine("UPDATE_BANK_ACCOUNT");
    int count = sqlUpdateEngineBankAccount.update(sqlSession, bankAccount, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update bankAccount result count: " + count);
    }
    return count;
  }
  
  public int update(final BankAccount bankAccount, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), bankAccount, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final BankAccount bankAccount) {
    return update(sqlSession, bankAccount, null);
  }
  
  public int update(final BankAccount bankAccount) {
    return update(bankAccount, null);
  }
  
  public int delete(final SqlSession sqlSession, final BankAccount bankAccount, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete bankAccount: " + bankAccount + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineBankAccount = sqlEngineFactory.getCheckedCrudEngine("DELETE_BANK_ACCOUNT");
    int count = sqlDeleteEngineBankAccount.delete(sqlSession, bankAccount, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete bankAccount result count: " + count);
    }
    return count;
  }
  
  public int delete(final BankAccount bankAccount, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), bankAccount, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final BankAccount bankAccount) {
    return delete(sqlSession, bankAccount, null);
  }
  
  public int delete(final BankAccount bankAccount) {
    return delete(bankAccount, null);
  }
  
  public List<BankAccount> list(final SqlSession sqlSession, final BankAccount bankAccount, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list bankAccount: " + bankAccount + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineBankAccount = sqlEngineFactory.getCheckedQueryEngine("SELECT_BANK_ACCOUNT");
    //sqlControl = getMoreResultClasses(bankAccount, sqlControl);
    List<BankAccount> bankAccountList = sqlEngineBankAccount.query(sqlSession, BankAccount.class, bankAccount, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list bankAccount size: " + ((bankAccountList != null) ? bankAccountList.size() : "null"));
    }
    return bankAccountList;
  }
  
  public List<BankAccount> list(final BankAccount bankAccount, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), bankAccount, sqlControl);
  }
  
  public List<BankAccount> list(final SqlSession sqlSession, final BankAccount bankAccount) {
    return list(sqlSession, bankAccount, null);
  }
  
  public List<BankAccount> list(final BankAccount bankAccount) {
    return list(bankAccount, null);
  }
  
  public int count(final SqlSession sqlSession, final BankAccount bankAccount, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count bankAccount: " + bankAccount + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineBankAccount = sqlEngineFactory.getCheckedQueryEngine("SELECT_BANK_ACCOUNT");
    //sqlControl = getMoreResultClasses(bankAccount, sqlControl);
    int count = sqlEngineBankAccount.queryCount(sqlSession, bankAccount, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final BankAccount bankAccount, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), bankAccount, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final BankAccount bankAccount) {
    return count(sqlSession, bankAccount, null);
  }
  
  public int count(final BankAccount bankAccount) {
    return count(bankAccount, null);
  }
}
