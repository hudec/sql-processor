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
import org.sqlproc.sample.simple.model.Library;

public class LibraryDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  private SqlEngineFactory sqlEngineFactory;
  private SqlSessionFactory sqlSessionFactory;
    	
  public LibraryDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Library insert(Library library, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert library: " + library + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertLibrary = sqlEngineFactory.getCrudEngine("INSERT_LIBRARY");
    int count = sqlInsertLibrary.insert(sqlSessionFactory.getSqlSession(), library);
    if (logger.isTraceEnabled()) {
      logger.trace("insert library result: " + count + " " + library);
    }
    return (count > 0) ? library : null;
  }
  
  public Library insert(Library library) {
    return insert(library, null);
  }
}
