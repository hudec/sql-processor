package org.sqlproc.sample.simple.dao;
  
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
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.sqlproc.sample.simple.model.PersonLibrary;

public class PersonLibraryDao extends BaseDaoImpl implements BaseDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  private SqlEngineFactory sqlEngineFactory;
  private SqlSessionFactory sqlSessionFactory;
    	
  public PersonLibraryDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public PersonLibrary insert(PersonLibrary personLibrary, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert personLibrary: " + personLibrary + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertPersonLibrary = sqlEngineFactory.getCrudEngine("INSERT_PERSON_LIBRARY");
    int count = sqlInsertPersonLibrary.insert(sqlSessionFactory.getSqlSession(), personLibrary);
    if (logger.isTraceEnabled()) {
      logger.trace("insert personLibrary result: " + count + " " + personLibrary);
    }
    return (count > 0) ? personLibrary : null;
  }
  
  public PersonLibrary insert(PersonLibrary personLibrary) {
    return insert(personLibrary, null);
  }
  
  public PersonLibrary get(PersonLibrary personLibrary, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + personLibrary + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEnginePersonLibrary = sqlEngineFactory.getCrudEngine("GET_PERSON_LIBRARY");
    //sqlControl = getMoreResultClasses(personLibrary, sqlControl);
    PersonLibrary personLibraryGot = sqlGetEnginePersonLibrary.get(sqlSessionFactory.getSqlSession(), PersonLibrary.class, personLibrary, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get personLibrary result: " + personLibraryGot);
    }
    return personLibraryGot;
  }
  	
  public PersonLibrary get(PersonLibrary personLibrary) {
    return get(personLibrary, null);
  }
  
  public int update(PersonLibrary personLibrary, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update personLibrary: " + personLibrary + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEnginePersonLibrary = sqlEngineFactory.getCrudEngine("UPDATE_PERSON_LIBRARY");
    int count = sqlUpdateEnginePersonLibrary.update(sqlSessionFactory.getSqlSession(), personLibrary);
    if (logger.isTraceEnabled()) {
      logger.trace("update personLibrary result count: " + count);
    }
    return count;
  }
  
  public int update(PersonLibrary personLibrary) {
    return update(personLibrary, null);
  }
  
  public int delete(PersonLibrary personLibrary, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete personLibrary: " + personLibrary + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEnginePersonLibrary = sqlEngineFactory.getCrudEngine("DELETE_PERSON_LIBRARY");
    int count = sqlDeleteEnginePersonLibrary.delete(sqlSessionFactory.getSqlSession(), personLibrary);
    if (logger.isTraceEnabled()) {
      logger.trace("delete personLibrary result count: " + count);
    }
    return count;
  }
  
  public int delete(PersonLibrary personLibrary) {
    return delete(personLibrary, null);
  }
  
  public List<PersonLibrary> list(PersonLibrary personLibrary, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list personLibrary: " + personLibrary + " " + sqlControl);
    }
    SqlQueryEngine sqlEnginePersonLibrary = sqlEngineFactory.getQueryEngine("SELECT_PERSON_LIBRARY");
    //sqlControl = getMoreResultClasses(personLibrary, sqlControl);
    List<PersonLibrary> personLibraryList = sqlEnginePersonLibrary.query(sqlSessionFactory.getSqlSession(), PersonLibrary.class, personLibrary, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list personLibrary size: " + ((personLibraryList != null) ? personLibraryList.size() : "null"));
    }
    return personLibraryList;
  }
  
  public List<PersonLibrary> list(PersonLibrary personLibrary) {
    return list(personLibrary, null);
  }
}
