package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.sample.simple.model.NewBook;

public interface NewBookDao {
  
  public NewBook insert(SqlSession sqlSession, NewBook newBook, SqlControl sqlControl);
  
  public NewBook insert(NewBook newBook, SqlControl sqlControl);
  
  public NewBook insert(SqlSession sqlSession, NewBook newBook);
  
  public NewBook insert(NewBook newBook);
  
  public NewBook get(SqlSession sqlSession, NewBook newBook, SqlControl sqlControl);
  	
  public NewBook get(NewBook newBook, SqlControl sqlControl);
  	
  public NewBook get(SqlSession sqlSession, NewBook newBook);
  	
  public NewBook get(NewBook newBook);
  
  public int update(SqlSession sqlSession, NewBook newBook, SqlControl sqlControl);
  
  public int update(NewBook newBook, SqlControl sqlControl);
  
  public int update(SqlSession sqlSession, NewBook newBook);
  
  public int update(NewBook newBook);
  
  public int delete(SqlSession sqlSession, NewBook newBook, SqlControl sqlControl);
  
  public int delete(NewBook newBook, SqlControl sqlControl);
  
  public int delete(SqlSession sqlSession, NewBook newBook);
  
  public int delete(NewBook newBook);
  
  public List<NewBook> list(SqlSession sqlSession, NewBook newBook, SqlControl sqlControl);
  
  public List<NewBook> list(NewBook newBook, SqlControl sqlControl);
  
  public List<NewBook> list(SqlSession sqlSession, NewBook newBook);
  
  public List<NewBook> list(NewBook newBook);
  
  public int count(SqlSession sqlSession, NewBook newBook, SqlControl sqlControl);
  
  public int count(NewBook newBook, SqlControl sqlControl);
  
  public int count(SqlSession sqlSession, NewBook newBook);
  
  public int count(NewBook newBook);
}
