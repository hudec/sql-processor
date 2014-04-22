package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.sample.simple.model.Movie;

public interface MovieDao {
  
  public Movie insert(SqlSession sqlSession, Movie movie, SqlControl sqlControl);
  public Movie insert(Movie movie, SqlControl sqlControl);
  public Movie insert(SqlSession sqlSession, Movie movie);
  public Movie insert(Movie movie);
  
  public Movie get(SqlSession sqlSession, Movie movie, SqlControl sqlControl);
  public Movie get(Movie movie, SqlControl sqlControl);
  	    public Movie get(SqlSession sqlSession, Movie movie);
  public Movie get(Movie movie);
  
  public int update(SqlSession sqlSession, Movie movie, SqlControl sqlControl);
  public int update(Movie movie, SqlControl sqlControl);
  public int update(SqlSession sqlSession, Movie movie);
  public int update(Movie movie);
  
  public int delete(SqlSession sqlSession, Movie movie, SqlControl sqlControl);
  public int delete(Movie movie, SqlControl sqlControl);
  public int delete(SqlSession sqlSession, Movie movie);
  public int delete(Movie movie);
  
  public List<Movie> list(SqlSession sqlSession, Movie movie, SqlControl sqlControl);
  public List<Movie> list(Movie movie, SqlControl sqlControl);
  public List<Movie> list(SqlSession sqlSession, Movie movie);
  public List<Movie> list(Movie movie);
  
  public int count(SqlSession sqlSession, Movie movie, SqlControl sqlControl);
  public int count(Movie movie, SqlControl sqlControl);
  public int count(SqlSession sqlSession, Movie movie);
  public int count(Movie movie);
}
