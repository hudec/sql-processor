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
import org.sqlproc.sample.simple.model.Movie;

public class MovieDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  private SqlEngineFactory sqlEngineFactory;
  private SqlSessionFactory sqlSessionFactory;
    	
  public MovieDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Movie insert(Movie movie, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert movie: " + movie + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertMovie = sqlEngineFactory.getCrudEngine("INSERT_MOVIE");
    int count = sqlInsertMovie.insert(sqlSessionFactory.getSqlSession(), movie);
    if (logger.isTraceEnabled()) {
      logger.trace("insert movie result: " + count + " " + movie);
    }
    return (count > 0) ? movie : null;
  }
  
  public Movie insert(Movie movie) {
    return insert(movie, null);
  }
}
