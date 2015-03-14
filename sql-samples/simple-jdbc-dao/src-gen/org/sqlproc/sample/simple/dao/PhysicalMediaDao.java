package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.model.PhysicalMedia;

@SuppressWarnings("all")
public interface PhysicalMediaDao extends BaseDao {
  public PhysicalMedia insert(final SqlSession sqlSession, final PhysicalMedia physicalMedia, SqlControl sqlControl);
  
  public PhysicalMedia insert(final PhysicalMedia physicalMedia, SqlControl sqlControl);
  
  public PhysicalMedia insert(final SqlSession sqlSession, final PhysicalMedia physicalMedia);
  
  public PhysicalMedia insert(final PhysicalMedia physicalMedia);
  
  public PhysicalMedia get(final SqlSession sqlSession, final PhysicalMedia physicalMedia, SqlControl sqlControl);
  
  public PhysicalMedia get(final PhysicalMedia physicalMedia, SqlControl sqlControl);
  
  public PhysicalMedia get(final SqlSession sqlSession, final PhysicalMedia physicalMedia);
  
  public PhysicalMedia get(final PhysicalMedia physicalMedia);
  
  public int update(final SqlSession sqlSession, final PhysicalMedia physicalMedia, SqlControl sqlControl);
  
  public int update(final PhysicalMedia physicalMedia, SqlControl sqlControl);
  
  public int update(final SqlSession sqlSession, final PhysicalMedia physicalMedia);
  
  public int update(final PhysicalMedia physicalMedia);
  
  public int delete(final SqlSession sqlSession, final PhysicalMedia physicalMedia, SqlControl sqlControl);
  
  public int delete(final PhysicalMedia physicalMedia, SqlControl sqlControl);
  
  public int delete(final SqlSession sqlSession, final PhysicalMedia physicalMedia);
  
  public int delete(final PhysicalMedia physicalMedia);
  
  public List<PhysicalMedia> list(final SqlSession sqlSession, final PhysicalMedia physicalMedia, SqlControl sqlControl);
  
  public List<PhysicalMedia> list(final PhysicalMedia physicalMedia, SqlControl sqlControl);
  
  public List<PhysicalMedia> list(final SqlSession sqlSession, final PhysicalMedia physicalMedia);
  
  public List<PhysicalMedia> list(final PhysicalMedia physicalMedia);
  
  public int count(final SqlSession sqlSession, final PhysicalMedia physicalMedia, SqlControl sqlControl);
  
  public int count(final PhysicalMedia physicalMedia, SqlControl sqlControl);
  
  public int count(final SqlSession sqlSession, final PhysicalMedia physicalMedia);
  
  public int count(final PhysicalMedia physicalMedia);
  
  public SqlControl getMoreResultClasses(final PhysicalMedia physicalMedia, SqlControl sqlControl);
}
