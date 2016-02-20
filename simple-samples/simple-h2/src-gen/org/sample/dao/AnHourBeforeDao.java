package org.sample.dao;

import java.util.List;
import org.sample.model.AnHourBefore;
import org.sample.model.AnHourBeforeResult;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

@SuppressWarnings("all")
public class AnHourBeforeDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public AnHourBeforeDao() {
  }
  
  public AnHourBeforeDao(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public AnHourBeforeDao(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public List<AnHourBeforeResult> anHourBefore(final SqlSession sqlSession, final AnHourBefore anHourBefore, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql anHourBefore: " + anHourBefore + " " + sqlControl);
    }
    org.sqlproc.engine.SqlProcedureEngine sqlProcAnHourBeforeDao = sqlEngineFactory.getCheckedProcedureEngine("PROC_AN_HOUR_BEFORE");
    List<AnHourBeforeResult> list = sqlProcAnHourBeforeDao.callQuery(sqlSession, AnHourBeforeResult.class, anHourBefore, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql anHourBefore result: " + list);
    }
    return list;
  }
  
  public List<AnHourBeforeResult> anHourBefore(final AnHourBefore anHourBefore, SqlControl sqlControl) {
    return anHourBefore(sqlSessionFactory.getSqlSession(), anHourBefore, sqlControl);
  }
  
  public List<AnHourBeforeResult> anHourBefore(final SqlSession sqlSession, final AnHourBefore anHourBefore) {
    return anHourBefore(sqlSession, anHourBefore, null);
  }
  
  public List<AnHourBeforeResult> anHourBefore(final AnHourBefore anHourBefore) {
    return anHourBefore(anHourBefore, null);
  }
}
