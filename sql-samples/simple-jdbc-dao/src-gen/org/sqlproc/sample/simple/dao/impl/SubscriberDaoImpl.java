package org.sqlproc.sample.simple.dao.impl;

import org.sqlproc.sample.simple.dao.SubscriberDao;
  
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
import org.sqlproc.sample.simple.model.Subscriber;
import org.sqlproc.sample.simple.model.BankAccount;
import org.sqlproc.sample.simple.model.CreditCard;

public class SubscriberDaoImpl extends BaseDaoImpl implements BaseDao, SubscriberDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  private SqlEngineFactory sqlEngineFactory;
  private SqlSessionFactory sqlSessionFactory;
    	
  public SubscriberDaoImpl(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Subscriber insert(Subscriber subscriber, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert subscriber: " + subscriber + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertSubscriber = sqlEngineFactory.getCrudEngine("INSERT_SUBSCRIBER");
    int count = sqlInsertSubscriber.insert(sqlSessionFactory.getSqlSession(), subscriber);
    if (logger.isTraceEnabled()) {
      logger.trace("insert subscriber result: " + count + " " + subscriber);
    }
    return (count > 0) ? subscriber : null;
  }
  
  public Subscriber insert(Subscriber subscriber) {
    return insert(subscriber, null);
  }
  
  public Subscriber get(Subscriber subscriber, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + subscriber + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineSubscriber = sqlEngineFactory.getCrudEngine("GET_SUBSCRIBER");
    sqlControl = getMoreResultClasses(subscriber, sqlControl);
    Subscriber subscriberGot = sqlGetEngineSubscriber.get(sqlSessionFactory.getSqlSession(), Subscriber.class, subscriber, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get subscriber result: " + subscriberGot);
    }
    return subscriberGot;
  }
  	
  public Subscriber get(Subscriber subscriber) {
    return get(subscriber, null);
  }
  
  public int update(Subscriber subscriber, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update subscriber: " + subscriber + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineSubscriber = sqlEngineFactory.getCrudEngine("UPDATE_SUBSCRIBER");
    int count = sqlUpdateEngineSubscriber.update(sqlSessionFactory.getSqlSession(), subscriber);
    if (logger.isTraceEnabled()) {
      logger.trace("update subscriber result count: " + count);
    }
    return count;
  }
  
  public int update(Subscriber subscriber) {
    return update(subscriber, null);
  }
  
  public int delete(Subscriber subscriber, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete subscriber: " + subscriber + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineSubscriber = sqlEngineFactory.getCrudEngine("DELETE_SUBSCRIBER");
    int count = sqlDeleteEngineSubscriber.delete(sqlSessionFactory.getSqlSession(), subscriber);
    if (logger.isTraceEnabled()) {
      logger.trace("delete subscriber result count: " + count);
    }
    return count;
  }
  
  public int delete(Subscriber subscriber) {
    return delete(subscriber, null);
  }
  
  public List<Subscriber> list(Subscriber subscriber, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list subscriber: " + subscriber + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineSubscriber = sqlEngineFactory.getQueryEngine("SELECT_SUBSCRIBER");
    sqlControl = getMoreResultClasses(subscriber, sqlControl);
    List<Subscriber> subscriberList = sqlEngineSubscriber.query(sqlSessionFactory.getSqlSession(), Subscriber.class, subscriber, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list subscriber size: " + ((subscriberList != null) ? subscriberList.size() : "null"));
    }
    return subscriberList;
  }
  
  public List<Subscriber> list(Subscriber subscriber) {
    return list(subscriber, null);
  }
  
  SqlControl getMoreResultClasses(Subscriber subscriber, SqlControl sqlControl) {
    if (sqlControl != null && sqlControl.getMoreResultClasses() != null)
      return sqlControl;
    Map<String, Class<?>> moreResultClasses = null;
    if (subscriber != null && subscriber.toInit(Subscriber.Association.billingDetails)) {
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
