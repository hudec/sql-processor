package org.sqlproc.sample.simple.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlProcedureEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.sqlproc.sample.simple.model.PhysicalMedia;
import org.sqlproc.sample.simple.model.Movie;
import org.sqlproc.sample.simple.model.NewBook;

public class PhysicalMediaDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public PhysicalMediaDao(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public PhysicalMediaDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public PhysicalMedia insert(SqlSession sqlSession, PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert physicalMedia: " + physicalMedia + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertPhysicalMedia = sqlEngineFactory.getCheckedCrudEngine("INSERT_PHYSICAL_MEDIA");
    int count = sqlInsertPhysicalMedia.insert(sqlSession, physicalMedia, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("insert physicalMedia result: " + count + " " + physicalMedia);
    }
    return (count > 0) ? physicalMedia : null;
  }
  
  public PhysicalMedia insert(PhysicalMedia physicalMedia, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), physicalMedia, sqlControl);
  }
  
  public PhysicalMedia insert(SqlSession sqlSession, PhysicalMedia physicalMedia) {
    return insert(sqlSession, physicalMedia, null);
  }
  
  public PhysicalMedia insert(PhysicalMedia physicalMedia) {
    return insert(physicalMedia, null);
  }
  
  public PhysicalMedia get(SqlSession sqlSession, PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + physicalMedia + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEnginePhysicalMedia = sqlEngineFactory.getCheckedCrudEngine("GET_PHYSICAL_MEDIA");
    sqlControl = getMoreResultClasses(physicalMedia, sqlControl);
    PhysicalMedia physicalMediaGot = sqlGetEnginePhysicalMedia.get(sqlSession, PhysicalMedia.class, physicalMedia, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get physicalMedia result: " + physicalMediaGot);
    }
    return physicalMediaGot;
  }
  	
  public PhysicalMedia get(PhysicalMedia physicalMedia, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), physicalMedia, sqlControl);
  }
  
  public PhysicalMedia get(SqlSession sqlSession, PhysicalMedia physicalMedia) {
    return get(sqlSession, physicalMedia, null);
  }
  
  public PhysicalMedia get(PhysicalMedia physicalMedia) {
    return get(physicalMedia, null);
  }
  
  public int update(SqlSession sqlSession, PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update physicalMedia: " + physicalMedia + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEnginePhysicalMedia = sqlEngineFactory.getCheckedCrudEngine("UPDATE_PHYSICAL_MEDIA");
    int count = sqlUpdateEnginePhysicalMedia.update(sqlSession, physicalMedia, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("update physicalMedia result count: " + count);
    }
    return count;
  }
  
  public int update(PhysicalMedia physicalMedia, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), physicalMedia, sqlControl);
  }
  
  public int update(SqlSession sqlSession, PhysicalMedia physicalMedia) {
    return update(sqlSession, physicalMedia, null);
  }
  
  public int update(PhysicalMedia physicalMedia) {
    return update(physicalMedia, null);
  }
  
  public int delete(SqlSession sqlSession, PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete physicalMedia: " + physicalMedia + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEnginePhysicalMedia = sqlEngineFactory.getCheckedCrudEngine("DELETE_PHYSICAL_MEDIA");
    int count = sqlDeleteEnginePhysicalMedia.delete(sqlSession, physicalMedia, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("delete physicalMedia result count: " + count);
    }
    return count;
  }
  
  public int delete(PhysicalMedia physicalMedia, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), physicalMedia, sqlControl);
  }
  
  public int delete(SqlSession sqlSession, PhysicalMedia physicalMedia) {
    return delete(sqlSession, physicalMedia, null);
  }
  
  public int delete(PhysicalMedia physicalMedia) {
    return delete(physicalMedia, null);
  }
  
  public List<PhysicalMedia> list(SqlSession sqlSession, PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list physicalMedia: " + physicalMedia + " " + sqlControl);
    }
    SqlQueryEngine sqlEnginePhysicalMedia = sqlEngineFactory.getCheckedQueryEngine("SELECT_PHYSICAL_MEDIA");
    sqlControl = getMoreResultClasses(physicalMedia, sqlControl);
    List<PhysicalMedia> physicalMediaList = sqlEnginePhysicalMedia.query(sqlSession, PhysicalMedia.class, physicalMedia, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list physicalMedia size: " + ((physicalMediaList != null) ? physicalMediaList.size() : "null"));
    }
    return physicalMediaList;
  }
  
  public List<PhysicalMedia> list(PhysicalMedia physicalMedia, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), physicalMedia, sqlControl);
  }
  
  public List<PhysicalMedia> list(SqlSession sqlSession, PhysicalMedia physicalMedia) {
    return list(sqlSession, physicalMedia, null);
  }
  
  public List<PhysicalMedia> list(PhysicalMedia physicalMedia) {
    return list(physicalMedia, null);
  }
  
  public int count(SqlSession sqlSession, PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("count physicalMedia: " + physicalMedia + " " + sqlControl);
    }
    SqlQueryEngine sqlEnginePhysicalMedia = sqlEngineFactory.getCheckedQueryEngine("SELECT_PHYSICAL_MEDIA");
    sqlControl = getMoreResultClasses(physicalMedia, sqlControl);
    int count = sqlEnginePhysicalMedia.queryCount(sqlSession, physicalMedia, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(PhysicalMedia physicalMedia, SqlControl sqlControl) {
  	return count(sqlSessionFactory.getSqlSession(), physicalMedia, sqlControl);
  }
  
  public int count(SqlSession sqlSession, PhysicalMedia physicalMedia) {
    return count(sqlSession, physicalMedia, null);
  }
  
  public int count(PhysicalMedia physicalMedia) {
    return count(physicalMedia, null);
  }
  
  SqlControl getMoreResultClasses(PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (sqlControl != null && sqlControl.getMoreResultClasses() != null)
      return sqlControl;
    Map<String, Class<?>> moreResultClasses = null;
    if (physicalMedia != null && physicalMedia.toInit(PhysicalMedia.Association.media.name())) {
      if (moreResultClasses == null)
        moreResultClasses = new HashMap<String, Class<?>>();
      moreResultClasses.put("movie", Movie.class);
      moreResultClasses.put("book", NewBook.class);
    }
    if (moreResultClasses != null) {
      sqlControl = new SqlStandardControl(sqlControl);
      ((SqlStandardControl) sqlControl).setMoreResultClasses(moreResultClasses);
    }
    return sqlControl;
  }
}
