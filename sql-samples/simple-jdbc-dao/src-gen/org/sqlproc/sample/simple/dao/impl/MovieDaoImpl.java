package org.sqlproc.sample.simple.dao.impl;

import org.sqlproc.sample.simple.dao.MovieDao;
  
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
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.sqlproc.sample.simple.model.Movie;

public class MovieDaoImpl extends BaseDaoImpl implements BaseDao, MovieDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  private SqlEngineFactory sqlEngineFactory;
  private SqlSessionFactory sqlSessionFactory;
    	
  public MovieDaoImpl(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public MovieDaoImpl(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Movie insert(SqlSession sqlSession, Movie movie, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert movie: " + movie + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertMovie = sqlEngineFactory.getCheckedCrudEngine("INSERT_MOVIE");
    SqlCrudEngine sqlInsertMedia = sqlEngineFactory.getCheckedCrudEngine("INSERT_MEDIA");
    int count = sqlInsertMedia.insert(sqlSession, movie);
    if (count > 0) {
      sqlInsertMovie.insert(sqlSession, movie);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("insert movie result: " + count + " " + movie);
    }
    return (count > 0) ? movie : null;
  }
  
  public Movie insert(Movie movie, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), movie, sqlControl);
  }
  
  public Movie insert(SqlSession sqlSession, Movie movie) {
    return insert(sqlSession, movie, null);
  }
  
  public Movie insert(Movie movie) {
    return insert(movie, null);
  }
  
  public Movie get(SqlSession sqlSession, Movie movie, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + movie + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineMovie = sqlEngineFactory.getCheckedCrudEngine("GET_MOVIE");
    //sqlControl = getMoreResultClasses(movie, sqlControl);
    Movie movieGot = sqlGetEngineMovie.get(sqlSession, Movie.class, movie, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get movie result: " + movieGot);
    }
    return movieGot;
  }
  	
  public Movie get(Movie movie, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), movie, sqlControl);
  }
  
  public Movie get(SqlSession sqlSession, Movie movie) {
    return get(sqlSession, movie, null);
  }
  
  public Movie get(Movie movie) {
    return get(movie, null);
  }
  
  public int update(SqlSession sqlSession, Movie movie, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update movie: " + movie + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineMovie = sqlEngineFactory.getCheckedCrudEngine("UPDATE_MOVIE");
    SqlCrudEngine sqlUpdateMedia = sqlEngineFactory.getCheckedCrudEngine("UPDATE_MEDIA");
    int count = sqlUpdateEngineMovie.update(sqlSession, movie);
    if (count > 0) {
    	sqlUpdateMedia.update(sqlSession, movie);
    }
    if (count > 0) {
    	movie.setVersion(movie.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("update movie result count: " + count);
    }
    return count;
  }
  
  public int update(Movie movie, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), movie, sqlControl);
  }
  
  public int update(SqlSession sqlSession, Movie movie) {
    return update(sqlSession, movie, null);
  }
  
  public int update(Movie movie) {
    return update(movie, null);
  }
  
  public int delete(SqlSession sqlSession, Movie movie, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete movie: " + movie + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineMovie = sqlEngineFactory.getCheckedCrudEngine("DELETE_MOVIE");
    SqlCrudEngine sqlDeleteMedia = sqlEngineFactory.getCheckedCrudEngine("DELETE_MEDIA");
    int count = sqlDeleteEngineMovie.delete(sqlSession, movie);
    if (count > 0) {
    	sqlDeleteMedia.delete(sqlSession, movie);
    }
    if (count > 0) {
    	movie.setVersion(movie.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("delete movie result count: " + count);
    }
    return count;
  }
  
  public int delete(Movie movie, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), movie, sqlControl);
  }
  
  public int delete(SqlSession sqlSession, Movie movie) {
    return delete(sqlSession, movie, null);
  }
  
  public int delete(Movie movie) {
    return delete(movie, null);
  }
  
  public List<Movie> list(SqlSession sqlSession, Movie movie, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list movie: " + movie + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineMovie = sqlEngineFactory.getCheckedQueryEngine("SELECT_MOVIE");
    //sqlControl = getMoreResultClasses(movie, sqlControl);
    List<Movie> movieList = sqlEngineMovie.query(sqlSession, Movie.class, movie, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list movie size: " + ((movieList != null) ? movieList.size() : "null"));
    }
    return movieList;
  }
  
  public List<Movie> list(Movie movie, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), movie, sqlControl);
  }
  
  public List<Movie> list(SqlSession sqlSession, Movie movie) {
    return list(sqlSession, movie, null);
  }
  
  public List<Movie> list(Movie movie) {
    return list(movie, null);
  }
}
