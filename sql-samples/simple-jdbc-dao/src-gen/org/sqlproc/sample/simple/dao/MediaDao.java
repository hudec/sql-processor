package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.model.Media;

@SuppressWarnings("all")
public interface MediaDao {
  public Media insert(final SqlSession sqlSession, final Media media, SqlControl sqlControl);
  
  public Media insert(final Media media, SqlControl sqlControl);
  
  public Media insert(final SqlSession sqlSession, final Media media);
  
  public Media insert(final Media media);
  
  public Media get(final SqlSession sqlSession, final Media media, SqlControl sqlControl);
  
  public Media get(final Media media, SqlControl sqlControl);
  
  public Media get(final SqlSession sqlSession, final Media media);
  
  public Media get(final Media media);
  
  public int update(final SqlSession sqlSession, final Media media, SqlControl sqlControl);
  
  public int update(final Media media, SqlControl sqlControl);
  
  public int update(final SqlSession sqlSession, final Media media);
  
  public int update(final Media media);
  
  public int delete(final SqlSession sqlSession, final Media media, SqlControl sqlControl);
  
  public int delete(final Media media, SqlControl sqlControl);
  
  public int delete(final SqlSession sqlSession, final Media media);
  
  public int delete(final Media media);
  
  public List<Media> list(final SqlSession sqlSession, final Media media, SqlControl sqlControl);
  
  public List<Media> list(final Media media, SqlControl sqlControl);
  
  public List<Media> list(final SqlSession sqlSession, final Media media);
  
  public List<Media> list(final Media media);
  
  public int count(final SqlSession sqlSession, final Media media, SqlControl sqlControl);
  
  public int count(final Media media, SqlControl sqlControl);
  
  public int count(final SqlSession sqlSession, final Media media);
  
  public int count(final Media media);
}
