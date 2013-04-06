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
import org.sqlproc.engine.SqlProcedureEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.sqlproc.sample.simple.model.Subscriber;
import org.sqlproc.sample.simple.model.BankAccount;
import org.sqlproc.sample.simple.model.CreditCard;

public class SubscriberDaoImpl extends BaseDaoImpl implements BaseDao, SubscriberDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public SubscriberDaoImpl(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public SubscriberDaoImpl(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Subscriber insert(SqlSession sqlSession, Subscriber subscriber, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert subscriber: " + subscriber + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertSubscriber = sqlEngineFactory.getCheckedCrudEngine("INSERT_SUBSCRIBER");
    int count = sqlInsertSubscriber.insert(sqlSession, subscriber, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("insert subscriber result: " + count + " " + subscriber);
    }
    return (count > 0) ? subscriber : null;
  }
  
  public Subscriber insert(Subscriber subscriber, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), subscriber, sqlControl);
  }
  
  public Subscriber insert(SqlSession sqlSession, Subscriber subscriber) {
    return insert(sqlSession, subscriber, null);
  }
  
  public Subscriber insert(Subscriber subscriber) {
    return insert(subscriber, null);
  }
  
  public Subscriber get(SqlSession sqlSession, Subscriber subscriber, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + subscriber + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineSubscriber = sqlEngineFactory.getCheckedCrudEngine("GET_SUBSCRIBER");
    sqlControl = getMoreResultClasses(subscriber, sqlControl);
    Subscriber subscriberGot = sqlGetEngineSubscriber.get(sqlSession, Subscriber.class, subscriber, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get subscriber result: " + subscriberGot);
    }
    return subscriberGot;
  }
  	
  public Subscriber get(Subscriber subscriber, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), subscriber, sqlControl);
  }
  
  public Subscriber get(SqlSession sqlSession, Subscriber subscriber) {
    return get(sqlSession, subscriber, null);
  }
  
  public Subscriber get(Subscriber subscriber) {
    return get(subscriber, null);
  }
  
  public int update(SqlSession sqlSession, Subscriber subscriber, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update subscriber: " + subscriber + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineSubscriber = sqlEngineFactory.getCheckedCrudEngine("UPDATE_SUBSCRIBER");
    int count = sqlUpdateEngineSubscriber.update(sqlSession, subscriber);
    if (count > 0) {
    	subscriber.setVersion(subscriber.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("update subscriber result count: " + count);
    }
    return count;
  }
  
  public int update(Subscriber subscriber, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), subscriber, sqlControl);
  }
  
  public int update(SqlSession sqlSession, Subscriber subscriber) {
    return update(sqlSession, subscriber, null);
  }
  
  public int update(Subscriber subscriber) {
    return update(subscriber, null);
  }
  
  public int delete(SqlSession sqlSession, Subscriber subscriber, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete subscriber: " + subscriber + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineSubscriber = sqlEngineFactory.getCheckedCrudEngine("DELETE_SUBSCRIBER");
    int count = sqlDeleteEngineSubscriber.delete(sqlSession, subscriber);
    if (count > 0) {
    	subscriber.setVersion(subscriber.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("delete subscriber result count: " + count);
    }
    return count;
  }
  
  public int delete(Subscriber subscriber, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), subscriber, sqlControl);
  }
  
  public int delete(SqlSession sqlSession, Subscriber subscriber) {
    return delete(sqlSession, subscriber, null);
  }
  
  public int delete(Subscriber subscriber) {
    return delete(subscriber, null);
  }
  
  public List<Subscriber> list(SqlSession sqlSession, Subscriber subscriber, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list subscriber: " + subscriber + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineSubscriber = sqlEngineFactory.getCheckedQueryEngine("SELECT_SUBSCRIBER");
    sqlControl = getMoreResultClasses(subscriber, sqlControl);
    List<Subscriber> subscriberList = sqlEngineSubscriber.query(sqlSession, Subscriber.class, subscriber, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list subscriber size: " + ((subscriberList != null) ? subscriberList.size() : "null"));
    }
    return subscriberList;
  }
  
  public List<Subscriber> list(Subscriber subscriber, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), subscriber, sqlControl);
  }
  
  public List<Subscriber> list(SqlSession sqlSession, Subscriber subscriber) {
    return list(sqlSession, subscriber, null);
  }
  
  public List<Subscriber> list(Subscriber subscriber) {
    return list(subscriber, null);
  }
  
  public int count(SqlSession sqlSession, Subscriber subscriber, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("count subscriber: " + subscriber + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineSubscriber = sqlEngineFactory.getCheckedQueryEngine("SELECT_SUBSCRIBER");
    sqlControl = getMoreResultClasses(subscriber, sqlControl);
    int count = sqlEngineSubscriber.queryCount(sqlSession, subscriber, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(Subscriber subscriber, SqlControl sqlControl) {
  	return count(sqlSessionFactory.getSqlSession(), subscriber, sqlControl);
  }
  
  public int count(SqlSession sqlSession, Subscriber subscriber) {
    return count(sqlSession, subscriber, null);
  }
  
  public int count(Subscriber subscriber) {
    return count(subscriber, null);
  }
  
  SqlControl getMoreResultClasses(Subscriber subscriber, SqlControl sqlControl) {
    if (sqlControl != null && sqlControl.getMoreResultClasses() != null)
      return sqlControl;
    Map<String, Class<?>> moreResultClasses = null;
    if (subscriber != null && subscriber.toInit(Subscriber.Association.billingDetails.name())) {
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
