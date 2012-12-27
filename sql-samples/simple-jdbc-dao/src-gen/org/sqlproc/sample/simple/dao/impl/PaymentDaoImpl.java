package org.sqlproc.sample.simple.dao.impl;

import org.sqlproc.sample.simple.dao.PaymentDao;
  
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
import org.sqlproc.sample.simple.model.Payment;
import org.sqlproc.sample.simple.model.BankAccount;
import org.sqlproc.sample.simple.model.CreditCard;

public class PaymentDaoImpl extends BaseDaoImpl implements BaseDao, PaymentDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  private SqlEngineFactory sqlEngineFactory;
  private SqlSessionFactory sqlSessionFactory;
    	
  public PaymentDaoImpl(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
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
  
  public Payment get(Payment payment, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + payment + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEnginePayment = sqlEngineFactory.getCrudEngine("GET_PAYMENT");
    sqlControl = getMoreResultClasses(payment, sqlControl);
    Payment paymentGot = sqlGetEnginePayment.get(sqlSessionFactory.getSqlSession(), Payment.class, payment, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get payment result: " + paymentGot);
    }
    return paymentGot;
  }
  	
  public Payment get(Payment payment) {
    return get(payment, null);
  }
  
  public int update(Payment payment, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update payment: " + payment + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEnginePayment = sqlEngineFactory.getCrudEngine("UPDATE_PAYMENT");
    int count = sqlUpdateEnginePayment.update(sqlSessionFactory.getSqlSession(), payment);
    if (logger.isTraceEnabled()) {
      logger.trace("update payment result count: " + count);
    }
    return count;
  }
  
  public int update(Payment payment) {
    return update(payment, null);
  }
  
  public int delete(Payment payment, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete payment: " + payment + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEnginePayment = sqlEngineFactory.getCrudEngine("DELETE_PAYMENT");
    int count = sqlDeleteEnginePayment.delete(sqlSessionFactory.getSqlSession(), payment);
    if (logger.isTraceEnabled()) {
      logger.trace("delete payment result count: " + count);
    }
    return count;
  }
  
  public int delete(Payment payment) {
    return delete(payment, null);
  }
  
  public List<Payment> list(Payment payment, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list payment: " + payment + " " + sqlControl);
    }
    SqlQueryEngine sqlEnginePayment = sqlEngineFactory.getQueryEngine("SELECT_PAYMENT");
    sqlControl = getMoreResultClasses(payment, sqlControl);
    List<Payment> paymentList = sqlEnginePayment.query(sqlSessionFactory.getSqlSession(), Payment.class, payment, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list payment size: " + ((paymentList != null) ? paymentList.size() : "null"));
    }
    return paymentList;
  }
  
  public List<Payment> list(Payment payment) {
    return list(payment, null);
  }
  
  SqlControl getMoreResultClasses(Payment payment, SqlControl sqlControl) {
    if (sqlControl != null && sqlControl.getMoreResultClasses() != null)
      return sqlControl;
    Map<String, Class<?>> moreResultClasses = null;
    if (payment != null && payment.toInit(Payment.Association.billingDetails.name())) {
      if (moreResultClasses == null)
        moreResultClasses = new HashMap<String, Class<?>>();
      moreResultClasses.put("BA", BankAccount.class);
      moreResultClasses.put("CC", CreditCard.class);
    }
    if (moreResultClasses != null) {
      sqlControl = new SqlStandardControl(sqlControl);
      ((SqlStandardControl) sqlControl).setMoreResultClasses(moreResultClasses);
    }
    return sqlControl;
  }
}
