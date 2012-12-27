package org.sqlproc.sample.simple.dao.impl;
import org.sqlproc.sample.simple.dao.PhysicalMediaDao;
  
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.dao.impl.BaseDaoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.sqlproc.sample.simple.model.PhysicalMedia;
import org.sqlproc.sample.simple.model.Movie;
import org.sqlproc.sample.simple.model.NewBook;

public class PhysicalMediaDaoImpl extends BaseDaoImpl implements BaseDao, PhysicalMediaDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  private SqlEngineFactory sqlEngineFactory;
  private SqlSessionFactory sqlSessionFactory;
    	
  public PhysicalMediaDaoImpl(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public PhysicalMedia insert(PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert physicalMedia: " + physicalMedia + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertPhysicalMedia = sqlEngineFactory.getCrudEngine("INSERT_PHYSICAL_MEDIA");
    int count = sqlInsertPhysicalMedia.insert(sqlSessionFactory.getSqlSession(), physicalMedia);
    if (logger.isTraceEnabled()) {
      logger.trace("insert physicalMedia result: " + count + " " + physicalMedia);
    }
    return (count > 0) ? physicalMedia : null;
  }
  
  public PhysicalMedia insert(PhysicalMedia physicalMedia) {
    return insert(physicalMedia, null);
  }
  
  public PhysicalMedia get(PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + physicalMedia + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEnginePhysicalMedia = sqlEngineFactory.getCrudEngine("GET_PHYSICAL_MEDIA");
    sqlControl = getMoreResultClasses(physicalMedia, sqlControl);
    PhysicalMedia physicalMediaGot = sqlGetEnginePhysicalMedia.get(sqlSessionFactory.getSqlSession(), PhysicalMedia.class, physicalMedia, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get physicalMedia result: " + physicalMediaGot);
    }
    return physicalMediaGot;
  }
  	
  public PhysicalMedia get(PhysicalMedia physicalMedia) {
    return get(physicalMedia, null);
  }
  
  public int update(PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update physicalMedia: " + physicalMedia + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEnginePhysicalMedia = sqlEngineFactory.getCrudEngine("UPDATE_PHYSICAL_MEDIA");
    int count = sqlUpdateEnginePhysicalMedia.update(sqlSessionFactory.getSqlSession(), physicalMedia);
    if (logger.isTraceEnabled()) {
      logger.trace("update physicalMedia result count: " + count);
    }
    return count;
  }
  
  public int update(PhysicalMedia physicalMedia) {
    return update(physicalMedia, null);
  }
  
  public int delete(PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete physicalMedia: " + physicalMedia + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEnginePhysicalMedia = sqlEngineFactory.getCrudEngine("DELETE_PHYSICAL_MEDIA");
    int count = sqlDeleteEnginePhysicalMedia.delete(sqlSessionFactory.getSqlSession(), physicalMedia);
    if (logger.isTraceEnabled()) {
      logger.trace("delete physicalMedia result count: " + count);
    }
    return count;
  }
  
  public int delete(PhysicalMedia physicalMedia) {
    return delete(physicalMedia, null);
  }
  
  public List<PhysicalMedia> list(PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list physicalMedia: " + physicalMedia + " " + sqlControl);
    }
    SqlQueryEngine sqlEnginePhysicalMedia = sqlEngineFactory.getQueryEngine("SELECT_PHYSICAL_MEDIA");
    sqlControl = getMoreResultClasses(physicalMedia, sqlControl);
    List<PhysicalMedia> physicalMediaList = sqlEnginePhysicalMedia.query(sqlSessionFactory.getSqlSession(), PhysicalMedia.class, physicalMedia, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list physicalMedia size: " + ((physicalMediaList != null) ? physicalMediaList.size() : "null"));
    }
    return physicalMediaList;
  }
  
  public List<PhysicalMedia> list(PhysicalMedia physicalMedia) {
    return list(physicalMedia, null);
  }
  
  SqlControl getMoreResultClasses(PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (sqlControl != null && sqlControl.getMoreResultClasses() != null)
      return sqlControl;
    Map<String, Class<?>> moreResultClasses = null;
    if (physicalMedia != null && physicalMedia.toInit(PhysicalMedia.Association.media)) {
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
