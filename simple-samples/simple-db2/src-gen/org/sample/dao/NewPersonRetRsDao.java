package org.sample.dao;

import java.util.List;
import org.sample.model.NewPersonRetRs;
import org.sample.model.Person;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

@SuppressWarnings("all")
public class NewPersonRetRsDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public NewPersonRetRsDao() {
  }
  
  public NewPersonRetRsDao(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public NewPersonRetRsDao(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public List<Person> newPersonRetRs(final SqlSession sqlSession, final NewPersonRetRs NewPersonRetRs, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql newPersonRetRs: " + NewPersonRetRs + " " + sqlControl);
    }
    org.sqlproc.engine.SqlProcedureEngine sqlProcNewPersonRetRsDao = sqlEngineFactory.getCheckedProcedureEngine("PROC_NEW_PERSON_RET_RS");
    List<Person> list = sqlProcNewPersonRetRsDao.callQuery(sqlSession, Person.class, NewPersonRetRs, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql newPersonRetRs result: " + list);
    }
    return list;
  }
  
  public List<Person> newPersonRetRs(final NewPersonRetRs NewPersonRetRs, SqlControl sqlControl) {
    return newPersonRetRs(sqlSessionFactory.getSqlSession(), NewPersonRetRs, sqlControl);
  }
  
  public List<Person> newPersonRetRs(final SqlSession sqlSession, final NewPersonRetRs NewPersonRetRs) {
    return newPersonRetRs(sqlSession, NewPersonRetRs, null);
  }
  
  public List<Person> newPersonRetRs(final NewPersonRetRs NewPersonRetRs) {
    return newPersonRetRs(NewPersonRetRs, null);
  }
}
