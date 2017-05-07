package org.sample.dao;

import java.time.LocalDateTime;
import org.sample.model.AnHourBefore;
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
  
  public LocalDateTime anHourBefore(final SqlSession sqlSession, final AnHourBefore anHourBefore, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql anHourBefore: " + anHourBefore + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlFunAnHourBeforeDao = sqlEngineFactory.getCheckedQueryEngine("FUN_AN_HOUR_BEFORE");
    java.util.List<AnHourBefore> list = sqlFunAnHourBeforeDao.query(sqlSession, AnHourBefore.class, anHourBefore, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql anHourBefore result: " + list);
    }
    return (list != null && !list.isEmpty()) ? list.get(0).getResult() : null;
  }
  
  public LocalDateTime anHourBefore(final AnHourBefore anHourBefore, SqlControl sqlControl) {
    return anHourBefore(sqlSessionFactory.getSqlSession(), anHourBefore, sqlControl);
  }
  
  public LocalDateTime anHourBefore(final SqlSession sqlSession, final AnHourBefore anHourBefore) {
    return anHourBefore(sqlSession, anHourBefore, null);
  }
  
  public LocalDateTime anHourBefore(final AnHourBefore anHourBefore) {
    return anHourBefore(anHourBefore, null);
  }
}
