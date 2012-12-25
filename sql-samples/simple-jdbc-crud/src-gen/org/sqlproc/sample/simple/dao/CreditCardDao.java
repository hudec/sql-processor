package org.sqlproc.sample.simple.dao;

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

public class CreditCardDao {
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
}
