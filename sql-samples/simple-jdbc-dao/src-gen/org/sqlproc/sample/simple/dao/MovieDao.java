package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.sample.simple.model.Movie;

public interface MovieDao {
  
  public Movie insert(Movie movie, SqlControl sqlControl);
  
  public Movie insert(Movie movie);
  
  public Movie get(Movie movie, SqlControl sqlControl);
  	
  public Movie get(Movie movie);
  
  public int update(Movie movie, SqlControl sqlControl);
  
  public int update(Movie movie);
  
  public int delete(Movie movie, SqlControl sqlControl);
  
  public int delete(Movie movie);
  
  public List<Movie> list(Movie movie, SqlControl sqlControl);
  
  public List<Movie> list(Movie movie);
}
