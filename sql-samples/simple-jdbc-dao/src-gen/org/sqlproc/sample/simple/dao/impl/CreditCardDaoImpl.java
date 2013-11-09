package org.sqlproc.sample.simple.dao.impl;

import org.sqlproc.sample.simple.dao.CreditCardDao;
  
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
import org.sqlproc.sample.simple.model.CreditCard;

public class CreditCardDaoImpl extends BaseDaoImpl implements BaseDao, CreditCardDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public CreditCardDaoImpl() {
  }
    	
  public CreditCardDaoImpl(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public CreditCardDaoImpl(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public CreditCard insert(SqlSession sqlSession, CreditCard creditCard, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert creditCard: " + creditCard + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertCreditCard = sqlEngineFactory.getCheckedCrudEngine("INSERT_CREDIT_CARD");
    int count = sqlInsertCreditCard.insert(sqlSession, creditCard, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("insert creditCard result: " + count + " " + creditCard);
    }
    return (count > 0) ? creditCard : null;
  }
  
  public CreditCard insert(CreditCard creditCard, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), creditCard, sqlControl);
  }
  
  public CreditCard insert(SqlSession sqlSession, CreditCard creditCard) {
    return insert(sqlSession, creditCard, null);
  }
  
  public CreditCard insert(CreditCard creditCard) {
    return insert(creditCard, null);
  }
  
  public CreditCard get(SqlSession sqlSession, CreditCard creditCard, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + creditCard + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineCreditCard = sqlEngineFactory.getCheckedCrudEngine("GET_CREDIT_CARD");
    //sqlControl = getMoreResultClasses(creditCard, sqlControl);
    CreditCard creditCardGot = sqlGetEngineCreditCard.get(sqlSession, CreditCard.class, creditCard, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get creditCard result: " + creditCardGot);
    }
    return creditCardGot;
  }
  	
  public CreditCard get(CreditCard creditCard, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), creditCard, sqlControl);
  }
  
  public CreditCard get(SqlSession sqlSession, CreditCard creditCard) {
    return get(sqlSession, creditCard, null);
  }
  
  public CreditCard get(CreditCard creditCard) {
    return get(creditCard, null);
  }
  
  public int update(SqlSession sqlSession, CreditCard creditCard, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update creditCard: " + creditCard + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineCreditCard = sqlEngineFactory.getCheckedCrudEngine("UPDATE_CREDIT_CARD");
    int count = sqlUpdateEngineCreditCard.update(sqlSession, creditCard, sqlControl);
    if (count > 0) {
    	creditCard.setVersion(creditCard.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("update creditCard result count: " + count);
    }
    return count;
  }
  
  public int update(CreditCard creditCard, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), creditCard, sqlControl);
  }
  
  public int update(SqlSession sqlSession, CreditCard creditCard) {
    return update(sqlSession, creditCard, null);
  }
  
  public int update(CreditCard creditCard) {
    return update(creditCard, null);
  }
  
  public int delete(SqlSession sqlSession, CreditCard creditCard, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete creditCard: " + creditCard + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineCreditCard = sqlEngineFactory.getCheckedCrudEngine("DELETE_CREDIT_CARD");
    int count = sqlDeleteEngineCreditCard.delete(sqlSession, creditCard, sqlControl);
    if (count > 0) {
    	creditCard.setVersion(creditCard.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("delete creditCard result count: " + count);
    }
    return count;
  }
  
  public int delete(CreditCard creditCard, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), creditCard, sqlControl);
  }
  
  public int delete(SqlSession sqlSession, CreditCard creditCard) {
    return delete(sqlSession, creditCard, null);
  }
  
  public int delete(CreditCard creditCard) {
    return delete(creditCard, null);
  }
  
  public List<CreditCard> list(SqlSession sqlSession, CreditCard creditCard, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list creditCard: " + creditCard + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineCreditCard = sqlEngineFactory.getCheckedQueryEngine("SELECT_CREDIT_CARD");
    //sqlControl = getMoreResultClasses(creditCard, sqlControl);
    List<CreditCard> creditCardList = sqlEngineCreditCard.query(sqlSession, CreditCard.class, creditCard, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list creditCard size: " + ((creditCardList != null) ? creditCardList.size() : "null"));
    }
    return creditCardList;
  }
  
  public List<CreditCard> list(CreditCard creditCard, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), creditCard, sqlControl);
  }
  
  public List<CreditCard> list(SqlSession sqlSession, CreditCard creditCard) {
    return list(sqlSession, creditCard, null);
  }
  
  public List<CreditCard> list(CreditCard creditCard) {
    return list(creditCard, null);
  }
  
  public int count(SqlSession sqlSession, CreditCard creditCard, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("count creditCard: " + creditCard + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineCreditCard = sqlEngineFactory.getCheckedQueryEngine("SELECT_CREDIT_CARD");
    //sqlControl = getMoreResultClasses(creditCard, sqlControl);
    int count = sqlEngineCreditCard.queryCount(sqlSession, creditCard, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(CreditCard creditCard, SqlControl sqlControl) {
  	return count(sqlSessionFactory.getSqlSession(), creditCard, sqlControl);
  }
  
  public int count(SqlSession sqlSession, CreditCard creditCard) {
    return count(sqlSession, creditCard, null);
  }
  
  public int count(CreditCard creditCard) {
    return count(creditCard, null);
  }
}
