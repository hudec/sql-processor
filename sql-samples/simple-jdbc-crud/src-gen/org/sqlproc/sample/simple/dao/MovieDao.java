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
    SqlCrudEngine sqlInsertMedia = sqlEngineFactory.getCrudEngine("INSERT_MEDIA");
    int count = sqlInsertMedia.insert(sqlSessionFactory.getSqlSession(), movie);
    if (count > 0) {
      sqlInsertMovie.insert(sqlSessionFactory.getSqlSession(), movie);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("insert movie result: " + count + " " + movie);
    }
    return (count > 0) ? movie : null;
  }
  
  public Movie insert(Movie movie) {
    return insert(movie, null);
  }
  
  public Movie get(Movie movie, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + movie + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineMovie = sqlEngineFactory.getCrudEngine("GET_MOVIE");
    //sqlControl = getMoreResultClasses(movie, sqlControl);
    Movie movieGot = sqlGetEngineMovie.get(sqlSessionFactory.getSqlSession(), Movie.class, movie, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get movie result: " + movieGot);
    }
    return movieGot;
  }
  	
  public Movie get(Movie movie) {
    return get(movie, null);
  }
  
  public int update(Movie movie, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update movie: " + movie + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineMovie = sqlEngineFactory.getCrudEngine("UPDATE_MOVIE");
    SqlCrudEngine sqlUpdateMedia = sqlEngineFactory.getCrudEngine("UPDATE_MEDIA");
    int count = sqlUpdateEngineMovie.update(sqlSessionFactory.getSqlSession(), movie);
    if (count > 0) {
    	sqlUpdateMedia.update(sqlSessionFactory.getSqlSession(), movie);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("update movie result count: " + count);
    }
    return count;
  }
  
  public int update(Movie movie) {
    return update(movie, null);
  }
  
  public int delete(Movie movie, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete movie: " + movie + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineMovie = sqlEngineFactory.getCrudEngine("DELETE_MOVIE");
    SqlCrudEngine sqlDeleteMedia = sqlEngineFactory.getCrudEngine("UPDATE_MEDIA");
    int count = sqlDeleteEngineMovie.delete(sqlSessionFactory.getSqlSession(), movie);
    if (count > 0) {
    	sqlDeleteMedia.delete(sqlSessionFactory.getSqlSession(), movie);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("delete movie result count: " + count);
    }
    return count;
  }
  
  public int delete(Movie movie) {
    return delete(movie, null);
  }
  
  public List<Movie> list(Movie movie, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list movie: " + movie + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineMovie = sqlEngineFactory.getQueryEngine("SELECT_MOVIE");
    //sqlControl = getMoreResultClasses(movie, sqlControl);
    List<Movie> movieList = sqlEngineMovie.query(sqlSessionFactory.getSqlSession(), Movie.class, movie, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list movie size: " + ((movieList != null) ? movieList.size() : "null"));
    }
    return movieList;
  }
  
  public List<Movie> list(Movie movie) {
    return list(movie, null);
  }
}
