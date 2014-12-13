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
import org.sqlproc.engine.SqlProcedureEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.sqlproc.sample.simple.model.PersonLibrary;

public class PersonLibraryDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public PersonLibraryDao() {
  }
    	
  public PersonLibraryDao(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public PersonLibraryDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public PersonLibrary insert(SqlSession sqlSession, PersonLibrary personLibrary, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert personLibrary: " + personLibrary + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertPersonLibrary = sqlEngineFactory.getCheckedCrudEngine("INSERT_PERSON_LIBRARY");
    int count = sqlInsertPersonLibrary.insert(sqlSession, personLibrary, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("insert personLibrary result: " + count + " " + personLibrary);
    }
    return (count > 0) ? personLibrary : null;
  }
  public PersonLibrary insert(PersonLibrary personLibrary, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), personLibrary, sqlControl);
  }
  public PersonLibrary insert(SqlSession sqlSession, PersonLibrary personLibrary) {
    return insert(sqlSession, personLibrary, null);
  }
  public PersonLibrary insert(PersonLibrary personLibrary) {
    return insert(personLibrary, null);
  }
  
  public PersonLibrary get(SqlSession sqlSession, PersonLibrary personLibrary, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + personLibrary + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEnginePersonLibrary = sqlEngineFactory.getCheckedCrudEngine("GET_PERSON_LIBRARY");
    //sqlControl = getMoreResultClasses(personLibrary, sqlControl);
    PersonLibrary personLibraryGot = sqlGetEnginePersonLibrary.get(sqlSession, PersonLibrary.class, personLibrary, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get personLibrary result: " + personLibraryGot);
    }
    return personLibraryGot;
  }
  public PersonLibrary get(PersonLibrary personLibrary, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), personLibrary, sqlControl);
  }
  public PersonLibrary get(SqlSession sqlSession, PersonLibrary personLibrary) {
    return get(sqlSession, personLibrary, null);
  }
  public PersonLibrary get(PersonLibrary personLibrary) {
    return get(personLibrary, null);
  }
  
  public int update(SqlSession sqlSession, PersonLibrary personLibrary, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update personLibrary: " + personLibrary + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEnginePersonLibrary = sqlEngineFactory.getCheckedCrudEngine("UPDATE_PERSON_LIBRARY");
    int count = sqlUpdateEnginePersonLibrary.update(sqlSession, personLibrary, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("update personLibrary result count: " + count);
    }
    return count;
  }
  public int update(PersonLibrary personLibrary, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), personLibrary, sqlControl);
  }
  public int update(SqlSession sqlSession, PersonLibrary personLibrary) {
    return update(sqlSession, personLibrary, null);
  }
  public int update(PersonLibrary personLibrary) {
    return update(personLibrary, null);
  }
  
  public int delete(SqlSession sqlSession, PersonLibrary personLibrary, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete personLibrary: " + personLibrary + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEnginePersonLibrary = sqlEngineFactory.getCheckedCrudEngine("DELETE_PERSON_LIBRARY");
    int count = sqlDeleteEnginePersonLibrary.delete(sqlSession, personLibrary, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("delete personLibrary result count: " + count);
    }
    return count;
  }
  public int delete(PersonLibrary personLibrary, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), personLibrary, sqlControl);
  }
  public int delete(SqlSession sqlSession, PersonLibrary personLibrary) {
    return delete(sqlSession, personLibrary, null);
  }
  public int delete(PersonLibrary personLibrary) {
    return delete(personLibrary, null);
  }
  
  public List<PersonLibrary> list(SqlSession sqlSession, PersonLibrary personLibrary, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list personLibrary: " + personLibrary + " " + sqlControl);
    }
    SqlQueryEngine sqlEnginePersonLibrary = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERSON_LIBRARY");
    //sqlControl = getMoreResultClasses(personLibrary, sqlControl);
    List<PersonLibrary> personLibraryList = sqlEnginePersonLibrary.query(sqlSession, PersonLibrary.class, personLibrary, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list personLibrary size: " + ((personLibraryList != null) ? personLibraryList.size() : "null"));
    }
    return personLibraryList;
  }
  public List<PersonLibrary> list(PersonLibrary personLibrary, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), personLibrary, sqlControl);
  }
      public List<PersonLibrary> list(SqlSession sqlSession, PersonLibrary personLibrary) {
    return list(sqlSession, personLibrary, null);
  }
  public List<PersonLibrary> list(PersonLibrary personLibrary) {
    return list(personLibrary, null);
  }
  
  public int count(SqlSession sqlSession, PersonLibrary personLibrary, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("count personLibrary: " + personLibrary + " " + sqlControl);
    }
    SqlQueryEngine sqlEnginePersonLibrary = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERSON_LIBRARY");
    //sqlControl = getMoreResultClasses(personLibrary, sqlControl);
    int count = sqlEnginePersonLibrary.queryCount(sqlSession, personLibrary, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("count: " + count);
    }
    return count;
  }
  public int count(PersonLibrary personLibrary, SqlControl sqlControl) {
  	return count(sqlSessionFactory.getSqlSession(), personLibrary, sqlControl);
  }
      public int count(SqlSession sqlSession, PersonLibrary personLibrary) {
    return count(sqlSession, personLibrary, null);
  }
  public int count(PersonLibrary personLibrary) {
    return count(personLibrary, null);
  }
}
