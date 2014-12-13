package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.sample.simple.model.PhysicalMedia;

public interface PhysicalMediaDao {
  
  public PhysicalMedia insert(SqlSession sqlSession, PhysicalMedia physicalMedia, SqlControl sqlControl);
  public PhysicalMedia insert(PhysicalMedia physicalMedia, SqlControl sqlControl);
  public PhysicalMedia insert(SqlSession sqlSession, PhysicalMedia physicalMedia);
  public PhysicalMedia insert(PhysicalMedia physicalMedia);
  
  public PhysicalMedia get(SqlSession sqlSession, PhysicalMedia physicalMedia, SqlControl sqlControl);
  public PhysicalMedia get(PhysicalMedia physicalMedia, SqlControl sqlControl);
  	    public PhysicalMedia get(SqlSession sqlSession, PhysicalMedia physicalMedia);
  public PhysicalMedia get(PhysicalMedia physicalMedia);
  
  public int update(SqlSession sqlSession, PhysicalMedia physicalMedia, SqlControl sqlControl);
  public int update(PhysicalMedia physicalMedia, SqlControl sqlControl);
  public int update(SqlSession sqlSession, PhysicalMedia physicalMedia);
  public int update(PhysicalMedia physicalMedia);
  
  public int delete(SqlSession sqlSession, PhysicalMedia physicalMedia, SqlControl sqlControl);
  public int delete(PhysicalMedia physicalMedia, SqlControl sqlControl);
  public int delete(SqlSession sqlSession, PhysicalMedia physicalMedia);
  public int delete(PhysicalMedia physicalMedia);
  
  public List<PhysicalMedia> list(SqlSession sqlSession, PhysicalMedia physicalMedia, SqlControl sqlControl);
  public List<PhysicalMedia> list(PhysicalMedia physicalMedia, SqlControl sqlControl);
  public List<PhysicalMedia> list(SqlSession sqlSession, PhysicalMedia physicalMedia);
  public List<PhysicalMedia> list(PhysicalMedia physicalMedia);
  
  public int count(SqlSession sqlSession, PhysicalMedia physicalMedia, SqlControl sqlControl);
  public int count(PhysicalMedia physicalMedia, SqlControl sqlControl);
  public int count(SqlSession sqlSession, PhysicalMedia physicalMedia);
  public int count(PhysicalMedia physicalMedia);
}
