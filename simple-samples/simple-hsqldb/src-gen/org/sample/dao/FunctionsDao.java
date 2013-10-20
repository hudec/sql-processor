package org.sample.dao;
  
import java.sql.Timestamp;
import org.sample.model.AnHourBefore;

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

public class FunctionsDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public FunctionsDao() {
  }
    	
  public FunctionsDao(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public FunctionsDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Timestamp anHourBefore(SqlSession sqlSession, AnHourBefore anHourBefore, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("anHourBefore: " + anHourBefore + " " + sqlControl);
    }
    SqlProcedureEngine sqlFunAnHourBefore = sqlEngineFactory.getCheckedProcedureEngine("FUN_AN_HOUR_BEFORE");
    Object result = sqlFunAnHourBefore.callFunction(sqlSession, anHourBefore, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("anHourBefore result: " + result);
    }
    return (Timestamp) result;
  }
  
  public Timestamp anHourBefore(AnHourBefore anHourBefore, SqlControl sqlControl) {
  	return anHourBefore(sqlSessionFactory.getSqlSession(), anHourBefore, sqlControl);
  }
  
  public Timestamp anHourBefore(SqlSession sqlSession, AnHourBefore anHourBefore) {
    return anHourBefore(sqlSession, anHourBefore, null);
  }
  
  public Timestamp anHourBefore(AnHourBefore anHourBefore) {
    return anHourBefore(anHourBefore, null);
  }
}
