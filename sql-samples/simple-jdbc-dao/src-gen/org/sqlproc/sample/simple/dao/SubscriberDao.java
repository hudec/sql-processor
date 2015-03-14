package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.model.Subscriber;

@SuppressWarnings("all")
public interface SubscriberDao extends BaseDao {
  public Subscriber insert(final SqlSession sqlSession, final Subscriber subscriber, SqlControl sqlControl);
  
  public Subscriber insert(final Subscriber subscriber, SqlControl sqlControl);
  
  public Subscriber insert(final SqlSession sqlSession, final Subscriber subscriber);
  
  public Subscriber insert(final Subscriber subscriber);
  
  public Subscriber get(final SqlSession sqlSession, final Subscriber subscriber, SqlControl sqlControl);
  
  public Subscriber get(final Subscriber subscriber, SqlControl sqlControl);
  
  public Subscriber get(final SqlSession sqlSession, final Subscriber subscriber);
  
  public Subscriber get(final Subscriber subscriber);
  
  public int update(final SqlSession sqlSession, final Subscriber subscriber, SqlControl sqlControl);
  
  public int update(final Subscriber subscriber, SqlControl sqlControl);
  
  public int update(final SqlSession sqlSession, final Subscriber subscriber);
  
  public int update(final Subscriber subscriber);
  
  public int delete(final SqlSession sqlSession, final Subscriber subscriber, SqlControl sqlControl);
  
  public int delete(final Subscriber subscriber, SqlControl sqlControl);
  
  public int delete(final SqlSession sqlSession, final Subscriber subscriber);
  
  public int delete(final Subscriber subscriber);
  
  public List<Subscriber> list(final SqlSession sqlSession, final Subscriber subscriber, SqlControl sqlControl);
  
  public List<Subscriber> list(final Subscriber subscriber, SqlControl sqlControl);
  
  public List<Subscriber> list(final SqlSession sqlSession, final Subscriber subscriber);
  
  public List<Subscriber> list(final Subscriber subscriber);
  
  public int count(final SqlSession sqlSession, final Subscriber subscriber, SqlControl sqlControl);
  
  public int count(final Subscriber subscriber, SqlControl sqlControl);
  
  public int count(final SqlSession sqlSession, final Subscriber subscriber);
  
  public int count(final Subscriber subscriber);
  
  public SqlControl getMoreResultClasses(final Subscriber subscriber, SqlControl sqlControl);
}
