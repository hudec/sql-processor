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
import org.sqlproc.sample.simple.model.Payment;

public class PaymentDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  private SqlEngineFactory sqlEngineFactory;
  private SqlSessionFactory sqlSessionFactory;
    	
  public PaymentDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Payment insert(Payment payment, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert payment: " + payment + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertPayment = sqlEngineFactory.getCrudEngine("INSERT_PAYMENT");
    int count = sqlInsertPayment.insert(sqlSessionFactory.getSqlSession(), payment);
    if (logger.isTraceEnabled()) {
      logger.trace("insert payment result: " + count + " " + payment);
    }
    return (count > 0) ? payment : null;
  }
  
  public Payment insert(Payment payment) {
    return insert(payment, null);
  }
}
