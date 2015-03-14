package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.model.Performer;

@SuppressWarnings("all")
public interface PerformerDao extends BaseDao {
  public Performer insert(final SqlSession sqlSession, final Performer performer, SqlControl sqlControl);
  
  public Performer insert(final Performer performer, SqlControl sqlControl);
  
  public Performer insert(final SqlSession sqlSession, final Performer performer);
  
  public Performer insert(final Performer performer);
  
  public Performer get(final SqlSession sqlSession, final Performer performer, SqlControl sqlControl);
  
  public Performer get(final Performer performer, SqlControl sqlControl);
  
  public Performer get(final SqlSession sqlSession, final Performer performer);
  
  public Performer get(final Performer performer);
  
  public int update(final SqlSession sqlSession, final Performer performer, SqlControl sqlControl);
  
  public int update(final Performer performer, SqlControl sqlControl);
  
  public int update(final SqlSession sqlSession, final Performer performer);
  
  public int update(final Performer performer);
  
  public int delete(final SqlSession sqlSession, final Performer performer, SqlControl sqlControl);
  
  public int delete(final Performer performer, SqlControl sqlControl);
  
  public int delete(final SqlSession sqlSession, final Performer performer);
  
  public int delete(final Performer performer);
  
  public List<Performer> list(final SqlSession sqlSession, final Performer performer, SqlControl sqlControl);
  
  public List<Performer> list(final Performer performer, SqlControl sqlControl);
  
  public List<Performer> list(final SqlSession sqlSession, final Performer performer);
  
  public List<Performer> list(final Performer performer);
  
  public int count(final SqlSession sqlSession, final Performer performer, SqlControl sqlControl);
  
  public int count(final Performer performer, SqlControl sqlControl);
  
  public int count(final SqlSession sqlSession, final Performer performer);
  
  public int count(final Performer performer);
  
  public SqlControl getMoreResultClasses(final Performer performer, SqlControl sqlControl);
}
