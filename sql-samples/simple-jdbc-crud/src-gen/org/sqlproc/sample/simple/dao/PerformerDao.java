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
import org.sqlproc.sample.simple.model.Performer;

public class PerformerDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  private SqlEngineFactory sqlEngineFactory;
  private SqlSessionFactory sqlSessionFactory;
    	
  public PerformerDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Performer insert(Performer performer, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert performer: " + performer + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertPerformer = sqlEngineFactory.getCrudEngine("INSERT_PERFORMER");
    int count = sqlInsertPerformer.insert(sqlSessionFactory.getSqlSession(), performer);
    if (logger.isTraceEnabled()) {
      logger.trace("insert performer result: " + count + " " + performer);
    }
    return (count > 0) ? performer : null;
  }
  
  public Performer insert(Performer performer) {
    return insert(performer, null);
  }
}
