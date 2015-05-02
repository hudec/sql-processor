package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.sample.simple.model.BankAccount;
import org.sqlproc.sample.simple.model.CreditCard;
import org.sqlproc.sample.simple.model.Payment;

@SuppressWarnings("all")
public class PaymentDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public PaymentDao() {
  }
  
  public PaymentDao(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public PaymentDao(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public Payment insert(final SqlSession sqlSession, final Payment payment, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert payment: " + payment + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertPayment = sqlEngineFactory.getCheckedCrudEngine("INSERT_PAYMENT");
    int count = sqlInsertPayment.insert(sqlSession, payment, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert payment result: " + count + " " + payment);
    }
    return (count > 0) ? payment : null;
  }
  
  public Payment insert(final Payment payment, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), payment, sqlControl);
  }
  
  public Payment insert(final SqlSession sqlSession, final Payment payment) {
    return insert(sqlSession, payment, null);
  }
  
  public Payment insert(final Payment payment) {
    return insert(payment, null);
  }
  
  public Payment get(final SqlSession sqlSession, final Payment payment, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + payment + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEnginePayment = sqlEngineFactory.getCheckedCrudEngine("GET_PAYMENT");
    sqlControl = getMoreResultClasses(payment, sqlControl);
    Payment paymentGot = sqlGetEnginePayment.get(sqlSession, Payment.class, payment, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get payment result: " + paymentGot);
    }
    return paymentGot;
  }
  
  public Payment get(final Payment payment, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), payment, sqlControl);
  }
  
  public Payment get(final SqlSession sqlSession, final Payment payment) {
    return get(sqlSession, payment, null);
  }
  
  public Payment get(final Payment payment) {
    return get(payment, null);
  }
  
  public int update(final SqlSession sqlSession, final Payment payment, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update payment: " + payment + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEnginePayment = sqlEngineFactory.getCheckedCrudEngine("UPDATE_PAYMENT");
    int count = sqlUpdateEnginePayment.update(sqlSession, payment, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update payment result count: " + count);
    }
    return count;
  }
  
  public int update(final Payment payment, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), payment, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final Payment payment) {
    return update(sqlSession, payment, null);
  }
  
  public int update(final Payment payment) {
    return update(payment, null);
  }
  
  public int delete(final SqlSession sqlSession, final Payment payment, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete payment: " + payment + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEnginePayment = sqlEngineFactory.getCheckedCrudEngine("DELETE_PAYMENT");
    int count = sqlDeleteEnginePayment.delete(sqlSession, payment, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete payment result count: " + count);
    }
    return count;
  }
  
  public int delete(final Payment payment, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), payment, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final Payment payment) {
    return delete(sqlSession, payment, null);
  }
  
  public int delete(final Payment payment) {
    return delete(payment, null);
  }
  
  public List<Payment> list(final SqlSession sqlSession, final Payment payment, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list payment: " + payment + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePayment = sqlEngineFactory.getCheckedQueryEngine("SELECT_PAYMENT");
    sqlControl = getMoreResultClasses(payment, sqlControl);
    List<Payment> paymentList = sqlEnginePayment.query(sqlSession, Payment.class, payment, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list payment size: " + ((paymentList != null) ? paymentList.size() : "null"));
    }
    return paymentList;
  }
  
  public List<Payment> list(final Payment payment, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), payment, sqlControl);
  }
  
  public List<Payment> list(final SqlSession sqlSession, final Payment payment) {
    return list(sqlSession, payment, null);
  }
  
  public List<Payment> list(final Payment payment) {
    return list(payment, null);
  }
  
  public int query(final SqlSession sqlSession, final Payment payment, SqlControl sqlControl, final SqlRowProcessor<Payment> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query payment: " + payment + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePayment = sqlEngineFactory.getCheckedQueryEngine("SELECT_PAYMENT");
    sqlControl = getMoreResultClasses(payment, sqlControl);
    int rownums = sqlEnginePayment.query(sqlSession, Payment.class, payment, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query payment size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final Payment payment, SqlControl sqlControl, final SqlRowProcessor<Payment> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), payment, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final Payment payment, final SqlRowProcessor<Payment> sqlRowProcessor) {
    return query(sqlSession, payment, null, sqlRowProcessor);
  }
  
  public int query(final Payment payment, final SqlRowProcessor<Payment> sqlRowProcessor) {
    return query(payment, null, sqlRowProcessor);
  }
  
  public int count(final SqlSession sqlSession, final Payment payment, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count payment: " + payment + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePayment = sqlEngineFactory.getCheckedQueryEngine("SELECT_PAYMENT");
    sqlControl = getMoreResultClasses(payment, sqlControl);
    int count = sqlEnginePayment.queryCount(sqlSession, payment, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final Payment payment, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), payment, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final Payment payment) {
    return count(sqlSession, payment, null);
  }
  
  public int count(final Payment payment) {
    return count(payment, null);
  }
  
  public SqlControl getMoreResultClasses(final Payment payment, SqlControl sqlControl) {
    if (sqlControl != null && sqlControl.getMoreResultClasses() != null)
    	return sqlControl;
    java.util.Map<String, Class<?>> moreResultClasses = null;
    if (payment != null && payment.toInit(Payment.Association.billingDetails.name())) {
    	if (moreResultClasses == null)
    		moreResultClasses = new java.util.HashMap<String, Class<?>>();
    	moreResultClasses.put("BA", BankAccount.class);
    	moreResultClasses.put("CC", CreditCard.class);
    }
    if (moreResultClasses != null) {
    	sqlControl = new org.sqlproc.engine.impl.SqlStandardControl(sqlControl);
    	((org.sqlproc.engine.impl.SqlStandardControl) sqlControl).setMoreResultClasses(moreResultClasses);
    }
    return sqlControl;
  }
}
