package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.sample.simple.model.Media;

public interface MediaDao {
  
  public Media insert(SqlSession sqlSession, Media media, SqlControl sqlControl);
  
  public Media insert(Media media, SqlControl sqlControl);
  
  public Media insert(SqlSession sqlSession, Media media);
  
  public Media insert(Media media);
  
  public Media get(SqlSession sqlSession, Media media, SqlControl sqlControl);
  	
  public Media get(Media media, SqlControl sqlControl);
  	
  public Media get(SqlSession sqlSession, Media media);
  	
  public Media get(Media media);
  
  public int update(SqlSession sqlSession, Media media, SqlControl sqlControl);
  
  public int update(Media media, SqlControl sqlControl);
  
  public int update(SqlSession sqlSession, Media media);
  
  public int update(Media media);
  
  public int delete(SqlSession sqlSession, Media media, SqlControl sqlControl);
  
  public int delete(Media media, SqlControl sqlControl);
  
  public int delete(SqlSession sqlSession, Media media);
  
  public int delete(Media media);
  
  public List<Media> list(SqlSession sqlSession, Media media, SqlControl sqlControl);
  
  public List<Media> list(Media media, SqlControl sqlControl);
  
  public List<Media> list(SqlSession sqlSession, Media media);
  
  public List<Media> list(Media media);
  
  public int count(SqlSession sqlSession, Media media, SqlControl sqlControl);
  
  public int count(Media media, SqlControl sqlControl);
  
  public int count(SqlSession sqlSession, Media media);
  
  public int count(Media media);
}
