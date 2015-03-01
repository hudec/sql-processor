package org.sqlproc.sample.simple.dao.impl;

import java.util.List;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.sample.simple.dao.PersonLibraryDao;
import org.sqlproc.sample.simple.model.PersonLibrary;

@SuppressWarnings("all")
public class PersonLibraryDaoImpl implements PersonLibraryDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public PersonLibraryDaoImpl() {
  }
  
  public PersonLibraryDaoImpl(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public PersonLibraryDaoImpl(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public PersonLibrary insert(final SqlSession sqlSession, final PersonLibrary personLibrary, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert personLibrary: " + personLibrary + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertPersonLibrary = sqlEngineFactory.getCheckedCrudEngine("INSERT_PERSON_LIBRARY");
    int count = sqlInsertPersonLibrary.insert(sqlSession, personLibrary, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert personLibrary result: " + count + " " + personLibrary);
    }
    return (count > 0) ? personLibrary : null;
  }
  
  public PersonLibrary insert(final PersonLibrary personLibrary, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), personLibrary, sqlControl);
  }
  
  public PersonLibrary insert(final SqlSession sqlSession, final PersonLibrary personLibrary) {
    return insert(sqlSession, personLibrary, null);
  }
  
  public PersonLibrary insert(final PersonLibrary personLibrary) {
    return insert(personLibrary, null);
  }
  
  public PersonLibrary get(final SqlSession sqlSession, final PersonLibrary personLibrary, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + personLibrary + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEnginePersonLibrary = sqlEngineFactory.getCheckedCrudEngine("GET_PERSON_LIBRARY");
    //sqlControl = getMoreResultClasses(personLibrary, sqlControl);
    PersonLibrary personLibraryGot = sqlGetEnginePersonLibrary.get(sqlSession, PersonLibrary.class, personLibrary, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get personLibrary result: " + personLibraryGot);
    }
    return personLibraryGot;
  }
  
  public PersonLibrary get(final PersonLibrary personLibrary, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), personLibrary, sqlControl);
  }
  
  public PersonLibrary get(final SqlSession sqlSession, final PersonLibrary personLibrary) {
    return get(sqlSession, personLibrary, null);
  }
  
  public PersonLibrary get(final PersonLibrary personLibrary) {
    return get(personLibrary, null);
  }
  
  public int update(final SqlSession sqlSession, final PersonLibrary personLibrary, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update personLibrary: " + personLibrary + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEnginePersonLibrary = sqlEngineFactory.getCheckedCrudEngine("UPDATE_PERSON_LIBRARY");
    int count = sqlUpdateEnginePersonLibrary.update(sqlSession, personLibrary, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update personLibrary result count: " + count);
    }
    return count;
  }
  
  public int update(final PersonLibrary personLibrary, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), personLibrary, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final PersonLibrary personLibrary) {
    return update(sqlSession, personLibrary, null);
  }
  
  public int update(final PersonLibrary personLibrary) {
    return update(personLibrary, null);
  }
  
  public int delete(final SqlSession sqlSession, final PersonLibrary personLibrary, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete personLibrary: " + personLibrary + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEnginePersonLibrary = sqlEngineFactory.getCheckedCrudEngine("DELETE_PERSON_LIBRARY");
    int count = sqlDeleteEnginePersonLibrary.delete(sqlSession, personLibrary, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete personLibrary result count: " + count);
    }
    return count;
  }
  
  public int delete(final PersonLibrary personLibrary, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), personLibrary, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final PersonLibrary personLibrary) {
    return delete(sqlSession, personLibrary, null);
  }
  
  public int delete(final PersonLibrary personLibrary) {
    return delete(personLibrary, null);
  }
  
  public List<PersonLibrary> list(final SqlSession sqlSession, final PersonLibrary personLibrary, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list personLibrary: " + personLibrary + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePersonLibrary = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERSON_LIBRARY");
    //sqlControl = getMoreResultClasses(personLibrary, sqlControl);
    List<PersonLibrary> personLibraryList = sqlEnginePersonLibrary.query(sqlSession, PersonLibrary.class, personLibrary, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list personLibrary size: " + ((personLibraryList != null) ? personLibraryList.size() : "null"));
    }
    return personLibraryList;
  }
  
  public List<PersonLibrary> list(final PersonLibrary personLibrary, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), personLibrary, sqlControl);
  }
  
  public List<PersonLibrary> list(final SqlSession sqlSession, final PersonLibrary personLibrary) {
    return list(sqlSession, personLibrary, null);
  }
  
  public List<PersonLibrary> list(final PersonLibrary personLibrary) {
    return list(personLibrary, null);
  }
  
  public int count(final SqlSession sqlSession, final PersonLibrary personLibrary, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count personLibrary: " + personLibrary + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePersonLibrary = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERSON_LIBRARY");
    //sqlControl = getMoreResultClasses(personLibrary, sqlControl);
    int count = sqlEnginePersonLibrary.queryCount(sqlSession, personLibrary, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final PersonLibrary personLibrary, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), personLibrary, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final PersonLibrary personLibrary) {
    return count(sqlSession, personLibrary, null);
  }
  
  public int count(final PersonLibrary personLibrary) {
    return count(personLibrary, null);
  }
}
