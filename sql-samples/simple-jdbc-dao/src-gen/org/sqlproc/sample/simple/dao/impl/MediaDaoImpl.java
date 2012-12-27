package org.sqlproc.sample.simple.dao.impl;

import org.sqlproc.sample.simple.dao.MediaDao;
  
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
import org.sqlproc.sample.simple.model.Media;

public class MediaDaoImpl extends BaseDaoImpl implements BaseDao, MediaDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  private SqlEngineFactory sqlEngineFactory;
  private SqlSessionFactory sqlSessionFactory;
    	
  public MediaDaoImpl(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Media insert(Media media, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert media: " + media + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertMedia = sqlEngineFactory.getCrudEngine("INSERT_MEDIA");
    int count = sqlInsertMedia.insert(sqlSessionFactory.getSqlSession(), media);
    if (logger.isTraceEnabled()) {
      logger.trace("insert media result: " + count + " " + media);
    }
    return (count > 0) ? media : null;
  }
  
  public Media insert(Media media) {
    return insert(media, null);
  }
  
  public Media get(Media media, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + media + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineMedia = sqlEngineFactory.getCrudEngine("GET_MEDIA");
    //sqlControl = getMoreResultClasses(media, sqlControl);
    Media mediaGot = sqlGetEngineMedia.get(sqlSessionFactory.getSqlSession(), Media.class, media, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get media result: " + mediaGot);
    }
    return mediaGot;
  }
  	
  public Media get(Media media) {
    return get(media, null);
  }
  
  public int update(Media media, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update media: " + media + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineMedia = sqlEngineFactory.getCrudEngine("UPDATE_MEDIA");
    int count = sqlUpdateEngineMedia.update(sqlSessionFactory.getSqlSession(), media);
    if (logger.isTraceEnabled()) {
      logger.trace("update media result count: " + count);
    }
    return count;
  }
  
  public int update(Media media) {
    return update(media, null);
  }
  
  public int delete(Media media, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete media: " + media + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineMedia = sqlEngineFactory.getCrudEngine("DELETE_MEDIA");
    int count = sqlDeleteEngineMedia.delete(sqlSessionFactory.getSqlSession(), media);
    if (logger.isTraceEnabled()) {
      logger.trace("delete media result count: " + count);
    }
    return count;
  }
  
  public int delete(Media media) {
    return delete(media, null);
  }
  
  public List<Media> list(Media media, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list media: " + media + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineMedia = sqlEngineFactory.getQueryEngine("SELECT_MEDIA");
    //sqlControl = getMoreResultClasses(media, sqlControl);
    List<Media> mediaList = sqlEngineMedia.query(sqlSessionFactory.getSqlSession(), Media.class, media, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list media size: " + ((mediaList != null) ? mediaList.size() : "null"));
    }
    return mediaList;
  }
  
  public List<Media> list(Media media) {
    return list(media, null);
  }
}
