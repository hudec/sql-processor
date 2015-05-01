package org.sqlproc.sample.simple.dao.impl;

import java.util.List;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.dao.SubscriberDao;
import org.sqlproc.sample.simple.dao.impl.BaseDaoImpl;
import org.sqlproc.sample.simple.model.BankAccount;
import org.sqlproc.sample.simple.model.CreditCard;
import org.sqlproc.sample.simple.model.Subscriber;

@SuppressWarnings("all")
public class SubscriberDaoImpl extends BaseDaoImpl implements SubscriberDao, BaseDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public SubscriberDaoImpl() {
  }
  
  public SubscriberDaoImpl(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public SubscriberDaoImpl(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public Subscriber insert(final SqlSession sqlSession, final Subscriber subscriber, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert subscriber: " + subscriber + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertSubscriber = sqlEngineFactory.getCheckedCrudEngine("INSERT_SUBSCRIBER");
    int count = sqlInsertSubscriber.insert(sqlSession, subscriber, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert subscriber result: " + count + " " + subscriber);
    }
    return (count > 0) ? subscriber : null;
  }
  
  public Subscriber insert(final Subscriber subscriber, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), subscriber, sqlControl);
  }
  
  public Subscriber insert(final SqlSession sqlSession, final Subscriber subscriber) {
    return insert(sqlSession, subscriber, null);
  }
  
  public Subscriber insert(final Subscriber subscriber) {
    return insert(subscriber, null);
  }
  
  public Subscriber get(final SqlSession sqlSession, final Subscriber subscriber, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + subscriber + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineSubscriber = sqlEngineFactory.getCheckedCrudEngine("GET_SUBSCRIBER");
    sqlControl = getMoreResultClasses(subscriber, sqlControl);
    Subscriber subscriberGot = sqlGetEngineSubscriber.get(sqlSession, Subscriber.class, subscriber, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get subscriber result: " + subscriberGot);
    }
    return subscriberGot;
  }
  
  public Subscriber get(final Subscriber subscriber, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), subscriber, sqlControl);
  }
  
  public Subscriber get(final SqlSession sqlSession, final Subscriber subscriber) {
    return get(sqlSession, subscriber, null);
  }
  
  public Subscriber get(final Subscriber subscriber) {
    return get(subscriber, null);
  }
  
  public int update(final SqlSession sqlSession, final Subscriber subscriber, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update subscriber: " + subscriber + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineSubscriber = sqlEngineFactory.getCheckedCrudEngine("UPDATE_SUBSCRIBER");
    int count = sqlUpdateEngineSubscriber.update(sqlSession, subscriber, sqlControl);
    if (count > 0) {
    	subscriber.setVersion(subscriber.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update subscriber result count: " + count);
    }
    return count;
  }
  
  public int update(final Subscriber subscriber, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), subscriber, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final Subscriber subscriber) {
    return update(sqlSession, subscriber, null);
  }
  
  public int update(final Subscriber subscriber) {
    return update(subscriber, null);
  }
  
  public int delete(final SqlSession sqlSession, final Subscriber subscriber, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete subscriber: " + subscriber + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineSubscriber = sqlEngineFactory.getCheckedCrudEngine("DELETE_SUBSCRIBER");
    int count = sqlDeleteEngineSubscriber.delete(sqlSession, subscriber, sqlControl);
    if (count > 0) {
    	subscriber.setVersion(subscriber.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete subscriber result count: " + count);
    }
    return count;
  }
  
  public int delete(final Subscriber subscriber, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), subscriber, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final Subscriber subscriber) {
    return delete(sqlSession, subscriber, null);
  }
  
  public int delete(final Subscriber subscriber) {
    return delete(subscriber, null);
  }
  
  public List<Subscriber> list(final SqlSession sqlSession, final Subscriber subscriber, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list subscriber: " + subscriber + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineSubscriber = sqlEngineFactory.getCheckedQueryEngine("SELECT_SUBSCRIBER");
    sqlControl = getMoreResultClasses(subscriber, sqlControl);
    List<Subscriber> subscriberList = sqlEngineSubscriber.query(sqlSession, Subscriber.class, subscriber, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list subscriber size: " + ((subscriberList != null) ? subscriberList.size() : "null"));
    }
    return subscriberList;
  }
  
  public List<Subscriber> list(final Subscriber subscriber, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), subscriber, sqlControl);
  }
  
  public List<Subscriber> list(final SqlSession sqlSession, final Subscriber subscriber) {
    return list(sqlSession, subscriber, null);
  }
  
  public List<Subscriber> list(final Subscriber subscriber) {
    return list(subscriber, null);
  }
  
  public int query(final SqlSession sqlSession, final Subscriber subscriber, SqlControl sqlControl, final SqlRowProcessor<Subscriber> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query subscriber: " + subscriber + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineSubscriber = sqlEngineFactory.getCheckedQueryEngine("SELECT_SUBSCRIBER");
    sqlControl = getMoreResultClasses(subscriber, sqlControl);
    int rownums = sqlEngineSubscriber.query(sqlSession, Subscriber.class, subscriber, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query subscriber size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final Subscriber subscriber, SqlControl sqlControl, final SqlRowProcessor<Subscriber> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), subscriber, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final Subscriber subscriber, final SqlRowProcessor<Subscriber> sqlRowProcessor) {
    return query(sqlSession, subscriber, null, sqlRowProcessor);
  }
  
  public int query(final Subscriber subscriber, final SqlRowProcessor<Subscriber> sqlRowProcessor) {
    return query(subscriber, null, sqlRowProcessor);
  }
  
  public int count(final SqlSession sqlSession, final Subscriber subscriber, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count subscriber: " + subscriber + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineSubscriber = sqlEngineFactory.getCheckedQueryEngine("SELECT_SUBSCRIBER");
    sqlControl = getMoreResultClasses(subscriber, sqlControl);
    int count = sqlEngineSubscriber.queryCount(sqlSession, subscriber, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final Subscriber subscriber, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), subscriber, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final Subscriber subscriber) {
    return count(sqlSession, subscriber, null);
  }
  
  public int count(final Subscriber subscriber) {
    return count(subscriber, null);
  }
  
  public SqlControl getMoreResultClasses(final Subscriber subscriber, SqlControl sqlControl) {
    if (sqlControl != null && sqlControl.getMoreResultClasses() != null)
    	return sqlControl;
    java.util.Map<String, Class<?>> moreResultClasses = null;
    if (subscriber != null && subscriber.toInit(Subscriber.Association.billingDetails.name())) {
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
