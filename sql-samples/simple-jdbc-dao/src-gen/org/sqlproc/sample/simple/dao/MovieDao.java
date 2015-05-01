package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.model.Movie;

@SuppressWarnings("all")
public interface MovieDao extends BaseDao {
  public Movie insert(final SqlSession sqlSession, final Movie movie, SqlControl sqlControl);
  
  public Movie insert(final Movie movie, SqlControl sqlControl);
  
  public Movie insert(final SqlSession sqlSession, final Movie movie);
  
  public Movie insert(final Movie movie);
  
  public Movie get(final SqlSession sqlSession, final Movie movie, SqlControl sqlControl);
  
  public Movie get(final Movie movie, SqlControl sqlControl);
  
  public Movie get(final SqlSession sqlSession, final Movie movie);
  
  public Movie get(final Movie movie);
  
  public int update(final SqlSession sqlSession, final Movie movie, SqlControl sqlControl);
  
  public int update(final Movie movie, SqlControl sqlControl);
  
  public int update(final SqlSession sqlSession, final Movie movie);
  
  public int update(final Movie movie);
  
  public int delete(final SqlSession sqlSession, final Movie movie, SqlControl sqlControl);
  
  public int delete(final Movie movie, SqlControl sqlControl);
  
  public int delete(final SqlSession sqlSession, final Movie movie);
  
  public int delete(final Movie movie);
  
  public List<Movie> list(final SqlSession sqlSession, final Movie movie, SqlControl sqlControl);
  
  public List<Movie> list(final Movie movie, SqlControl sqlControl);
  
  public List<Movie> list(final SqlSession sqlSession, final Movie movie);
  
  public List<Movie> list(final Movie movie);
  
  public int query(final SqlSession sqlSession, final Movie movie, SqlControl sqlControl, final SqlRowProcessor<Movie> sqlRowProcessor);
  
  public int query(final Movie movie, SqlControl sqlControl, final SqlRowProcessor<Movie> sqlRowProcessor);
  
  public int query(final SqlSession sqlSession, final Movie movie, final SqlRowProcessor<Movie> sqlRowProcessor);
  
  public int query(final Movie movie, final SqlRowProcessor<Movie> sqlRowProcessor);
  
  public int count(final SqlSession sqlSession, final Movie movie, SqlControl sqlControl);
  
  public int count(final Movie movie, SqlControl sqlControl);
  
  public int count(final SqlSession sqlSession, final Movie movie);
  
  public int count(final Movie movie);
}
