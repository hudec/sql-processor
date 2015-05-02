package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.sample.simple.model.Movie;

@SuppressWarnings("all")
public class MovieDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public MovieDao() {
  }
  
  public MovieDao(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public MovieDao(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public Movie insert(final SqlSession sqlSession, final Movie movie, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert movie: " + movie + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertMovie = sqlEngineFactory.getCheckedCrudEngine("INSERT_MOVIE");
    org.sqlproc.engine.SqlCrudEngine sqlInsertMedia = sqlEngineFactory.getCheckedCrudEngine("INSERT_MEDIA");
    int count = sqlInsertMedia.insert(sqlSession, movie, sqlControl);
    if (count > 0) {
    	sqlInsertMovie.insert(sqlSession, movie, sqlControl);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert movie result: " + count + " " + movie);
    }
    return (count > 0) ? movie : null;
  }
  
  public Movie insert(final Movie movie, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), movie, sqlControl);
  }
  
  public Movie insert(final SqlSession sqlSession, final Movie movie) {
    return insert(sqlSession, movie, null);
  }
  
  public Movie insert(final Movie movie) {
    return insert(movie, null);
  }
  
  public Movie get(final SqlSession sqlSession, final Movie movie, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + movie + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineMovie = sqlEngineFactory.getCheckedCrudEngine("GET_MOVIE");
    //sqlControl = getMoreResultClasses(movie, sqlControl);
    Movie movieGot = sqlGetEngineMovie.get(sqlSession, Movie.class, movie, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get movie result: " + movieGot);
    }
    return movieGot;
  }
  
  public Movie get(final Movie movie, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), movie, sqlControl);
  }
  
  public Movie get(final SqlSession sqlSession, final Movie movie) {
    return get(sqlSession, movie, null);
  }
  
  public Movie get(final Movie movie) {
    return get(movie, null);
  }
  
  public int update(final SqlSession sqlSession, final Movie movie, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update movie: " + movie + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineMovie = sqlEngineFactory.getCheckedCrudEngine("UPDATE_MOVIE");
    org.sqlproc.engine.SqlCrudEngine sqlUpdateMedia = sqlEngineFactory.getCheckedCrudEngine("UPDATE_MEDIA");
    int count = sqlUpdateEngineMovie.update(sqlSession, movie, sqlControl);
    if (count > 0) {
    	sqlUpdateMedia.update(sqlSession, movie, sqlControl);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update movie result count: " + count);
    }
    return count;
  }
  
  public int update(final Movie movie, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), movie, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final Movie movie) {
    return update(sqlSession, movie, null);
  }
  
  public int update(final Movie movie) {
    return update(movie, null);
  }
  
  public int delete(final SqlSession sqlSession, final Movie movie, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete movie: " + movie + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineMovie = sqlEngineFactory.getCheckedCrudEngine("DELETE_MOVIE");
    org.sqlproc.engine.SqlCrudEngine sqlDeleteMedia = sqlEngineFactory.getCheckedCrudEngine("DELETE_MEDIA");
    int count = sqlDeleteEngineMovie.delete(sqlSession, movie, sqlControl);
    if (count > 0) {
    	sqlDeleteMedia.delete(sqlSession, movie, sqlControl);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete movie result count: " + count);
    }
    return count;
  }
  
  public int delete(final Movie movie, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), movie, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final Movie movie) {
    return delete(sqlSession, movie, null);
  }
  
  public int delete(final Movie movie) {
    return delete(movie, null);
  }
  
  public List<Movie> list(final SqlSession sqlSession, final Movie movie, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list movie: " + movie + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineMovie = sqlEngineFactory.getCheckedQueryEngine("SELECT_MOVIE");
    //sqlControl = getMoreResultClasses(movie, sqlControl);
    List<Movie> movieList = sqlEngineMovie.query(sqlSession, Movie.class, movie, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list movie size: " + ((movieList != null) ? movieList.size() : "null"));
    }
    return movieList;
  }
  
  public List<Movie> list(final Movie movie, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), movie, sqlControl);
  }
  
  public List<Movie> list(final SqlSession sqlSession, final Movie movie) {
    return list(sqlSession, movie, null);
  }
  
  public List<Movie> list(final Movie movie) {
    return list(movie, null);
  }
  
  public int query(final SqlSession sqlSession, final Movie movie, SqlControl sqlControl, final SqlRowProcessor<Movie> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query movie: " + movie + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineMovie = sqlEngineFactory.getCheckedQueryEngine("SELECT_MOVIE");
    //sqlControl = getMoreResultClasses(movie, sqlControl);
    int rownums = sqlEngineMovie.query(sqlSession, Movie.class, movie, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query movie size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final Movie movie, SqlControl sqlControl, final SqlRowProcessor<Movie> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), movie, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final Movie movie, final SqlRowProcessor<Movie> sqlRowProcessor) {
    return query(sqlSession, movie, null, sqlRowProcessor);
  }
  
  public int query(final Movie movie, final SqlRowProcessor<Movie> sqlRowProcessor) {
    return query(movie, null, sqlRowProcessor);
  }
  
  public int count(final SqlSession sqlSession, final Movie movie, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count movie: " + movie + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineMovie = sqlEngineFactory.getCheckedQueryEngine("SELECT_MOVIE");
    //sqlControl = getMoreResultClasses(movie, sqlControl);
    int count = sqlEngineMovie.queryCount(sqlSession, movie, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final Movie movie, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), movie, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final Movie movie) {
    return count(sqlSession, movie, null);
  }
  
  public int count(final Movie movie) {
    return count(movie, null);
  }
}
