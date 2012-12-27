package org.sqlproc.sample.simple.dao;
  
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
import org.sqlproc.sample.simple.model.CreditCard;

public class CreditCardDao extends BaseDaoImpl implements BaseDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  private SqlEngineFactory sqlEngineFactory;
  private SqlSessionFactory sqlSessionFactory;
    	
  public CreditCardDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public CreditCard insert(CreditCard creditCard, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert creditCard: " + creditCard + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertCreditCard = sqlEngineFactory.getCrudEngine("INSERT_CREDIT_CARD");
    int count = sqlInsertCreditCard.insert(sqlSessionFactory.getSqlSession(), creditCard);
    if (logger.isTraceEnabled()) {
      logger.trace("insert creditCard result: " + count + " " + creditCard);
    }
    return (count > 0) ? creditCard : null;
  }
  
  public CreditCard insert(CreditCard creditCard) {
    return insert(creditCard, null);
  }
  
  public CreditCard get(CreditCard creditCard, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + creditCard + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineCreditCard = sqlEngineFactory.getCrudEngine("GET_CREDIT_CARD");
    //sqlControl = getMoreResultClasses(creditCard, sqlControl);
    CreditCard creditCardGot = sqlGetEngineCreditCard.get(sqlSessionFactory.getSqlSession(), CreditCard.class, creditCard, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get creditCard result: " + creditCardGot);
    }
    return creditCardGot;
  }
  	
  public CreditCard get(CreditCard creditCard) {
    return get(creditCard, null);
  }
  
  public int update(CreditCard creditCard, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update creditCard: " + creditCard + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineCreditCard = sqlEngineFactory.getCrudEngine("UPDATE_CREDIT_CARD");
    int count = sqlUpdateEngineCreditCard.update(sqlSessionFactory.getSqlSession(), creditCard);
    if (logger.isTraceEnabled()) {
      logger.trace("update creditCard result count: " + count);
    }
    return count;
  }
  
  public int update(CreditCard creditCard) {
    return update(creditCard, null);
  }
  
  public int delete(CreditCard creditCard, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete creditCard: " + creditCard + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineCreditCard = sqlEngineFactory.getCrudEngine("DELETE_CREDIT_CARD");
    int count = sqlDeleteEngineCreditCard.delete(sqlSessionFactory.getSqlSession(), creditCard);
    if (logger.isTraceEnabled()) {
      logger.trace("delete creditCard result count: " + count);
    }
    return count;
  }
  
  public int delete(CreditCard creditCard) {
    return delete(creditCard, null);
  }
  
  public List<CreditCard> list(CreditCard creditCard, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list creditCard: " + creditCard + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineCreditCard = sqlEngineFactory.getQueryEngine("SELECT_CREDIT_CARD");
    //sqlControl = getMoreResultClasses(creditCard, sqlControl);
    List<CreditCard> creditCardList = sqlEngineCreditCard.query(sqlSessionFactory.getSqlSession(), CreditCard.class, creditCard, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list creditCard size: " + ((creditCardList != null) ? creditCardList.size() : "null"));
    }
    return creditCardList;
  }
  
  public List<CreditCard> list(CreditCard creditCard) {
    return list(creditCard, null);
  }
}
