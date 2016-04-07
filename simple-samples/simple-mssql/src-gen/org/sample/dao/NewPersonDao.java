package org.sample.dao;

import org.sample.model.NewPerson;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

@SuppressWarnings("all")
public class NewPersonDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public NewPersonDao() {
  }
  
  public NewPersonDao(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public NewPersonDao(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public int newPerson(final SqlSession sqlSession, final NewPerson newPerson, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql newPerson: " + newPerson + " " + sqlControl);
    }
    org.sqlproc.engine.SqlProcedureEngine sqlProcNewPersonDao = sqlEngineFactory.getCheckedProcedureEngine("PROC_NEW_PERSON");
    int count = sqlProcNewPersonDao.callUpdate(sqlSession, newPerson, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql newPerson result: " + count);
    }
    return count;
  }
  
  public int newPerson(final NewPerson newPerson, SqlControl sqlControl) {
    return newPerson(sqlSessionFactory.getSqlSession(), newPerson, sqlControl);
  }
  
  public int newPerson(final SqlSession sqlSession, final NewPerson newPerson) {
    return newPerson(sqlSession, newPerson, null);
  }
  
  public int newPerson(final NewPerson newPerson) {
    return newPerson(newPerson, null);
  }
}
