package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.model.NewBook;

@SuppressWarnings("all")
public interface NewBookDao extends BaseDao {
  public NewBook insert(final SqlSession sqlSession, final NewBook newBook, SqlControl sqlControl);
  
  public NewBook insert(final NewBook newBook, SqlControl sqlControl);
  
  public NewBook insert(final SqlSession sqlSession, final NewBook newBook);
  
  public NewBook insert(final NewBook newBook);
  
  public NewBook get(final SqlSession sqlSession, final NewBook newBook, SqlControl sqlControl);
  
  public NewBook get(final NewBook newBook, SqlControl sqlControl);
  
  public NewBook get(final SqlSession sqlSession, final NewBook newBook);
  
  public NewBook get(final NewBook newBook);
  
  public int update(final SqlSession sqlSession, final NewBook newBook, SqlControl sqlControl);
  
  public int update(final NewBook newBook, SqlControl sqlControl);
  
  public int update(final SqlSession sqlSession, final NewBook newBook);
  
  public int update(final NewBook newBook);
  
  public int delete(final SqlSession sqlSession, final NewBook newBook, SqlControl sqlControl);
  
  public int delete(final NewBook newBook, SqlControl sqlControl);
  
  public int delete(final SqlSession sqlSession, final NewBook newBook);
  
  public int delete(final NewBook newBook);
  
  public List<NewBook> list(final SqlSession sqlSession, final NewBook newBook, SqlControl sqlControl);
  
  public List<NewBook> list(final NewBook newBook, SqlControl sqlControl);
  
  public List<NewBook> list(final SqlSession sqlSession, final NewBook newBook);
  
  public List<NewBook> list(final NewBook newBook);
  
  public int count(final SqlSession sqlSession, final NewBook newBook, SqlControl sqlControl);
  
  public int count(final NewBook newBook, SqlControl sqlControl);
  
  public int count(final SqlSession sqlSession, final NewBook newBook);
  
  public int count(final NewBook newBook);
}
