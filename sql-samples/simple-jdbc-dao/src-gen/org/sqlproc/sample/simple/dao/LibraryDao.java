package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.model.Library;

@SuppressWarnings("all")
public interface LibraryDao extends BaseDao {
  public Library insert(final SqlSession sqlSession, final Library library, SqlControl sqlControl);
  
  public Library insert(final Library library, SqlControl sqlControl);
  
  public Library insert(final SqlSession sqlSession, final Library library);
  
  public Library insert(final Library library);
  
  public Library get(final SqlSession sqlSession, final Library library, SqlControl sqlControl);
  
  public Library get(final Library library, SqlControl sqlControl);
  
  public Library get(final SqlSession sqlSession, final Library library);
  
  public Library get(final Library library);
  
  public int update(final SqlSession sqlSession, final Library library, SqlControl sqlControl);
  
  public int update(final Library library, SqlControl sqlControl);
  
  public int update(final SqlSession sqlSession, final Library library);
  
  public int update(final Library library);
  
  public int delete(final SqlSession sqlSession, final Library library, SqlControl sqlControl);
  
  public int delete(final Library library, SqlControl sqlControl);
  
  public int delete(final SqlSession sqlSession, final Library library);
  
  public int delete(final Library library);
  
  public List<Library> list(final SqlSession sqlSession, final Library library, SqlControl sqlControl);
  
  public List<Library> list(final Library library, SqlControl sqlControl);
  
  public List<Library> list(final SqlSession sqlSession, final Library library);
  
  public List<Library> list(final Library library);
  
  public int query(final SqlSession sqlSession, final Library library, SqlControl sqlControl, final SqlRowProcessor<Library> sqlRowProcessor);
  
  public int query(final Library library, SqlControl sqlControl, final SqlRowProcessor<Library> sqlRowProcessor);
  
  public int query(final SqlSession sqlSession, final Library library, final SqlRowProcessor<Library> sqlRowProcessor);
  
  public int query(final Library library, final SqlRowProcessor<Library> sqlRowProcessor);
  
  public int count(final SqlSession sqlSession, final Library library, SqlControl sqlControl);
  
  public int count(final Library library, SqlControl sqlControl);
  
  public int count(final SqlSession sqlSession, final Library library);
  
  public int count(final Library library);
}
