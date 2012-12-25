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
import org.sqlproc.sample.simple.model.Subscriber;

public class SubscriberDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  private SqlEngineFactory sqlEngineFactory;
  private SqlSessionFactory sqlSessionFactory;
    	
  public SubscriberDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
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
}
