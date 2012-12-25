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
import org.sqlproc.sample.simple.model.PersonLibrary;

public class PersonLibraryDao {
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
}
