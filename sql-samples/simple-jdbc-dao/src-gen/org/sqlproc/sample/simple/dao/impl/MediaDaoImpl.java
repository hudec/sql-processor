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
import org.sqlproc.engine.SqlProcedureEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.sqlproc.sample.simple.model.Media;

public class MediaDaoImpl extends BaseDaoImpl implements BaseDao, MediaDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public MediaDaoImpl(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public MediaDaoImpl(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Media insert(SqlSession sqlSession, Media media, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert media: " + media + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertMedia = sqlEngineFactory.getCheckedCrudEngine("INSERT_MEDIA");
    int count = sqlInsertMedia.insert(sqlSession, media, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("insert media result: " + count + " " + media);
    }
    return (count > 0) ? media : null;
  }
  
  public Media insert(Media media, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), media, sqlControl);
  }
  
  public Media insert(SqlSession sqlSession, Media media) {
    return insert(sqlSession, media, null);
  }
  
  public Media insert(Media media) {
    return insert(media, null);
  }
  
  public Media get(SqlSession sqlSession, Media media, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + media + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineMedia = sqlEngineFactory.getCheckedCrudEngine("GET_MEDIA");
    //sqlControl = getMoreResultClasses(media, sqlControl);
    Media mediaGot = sqlGetEngineMedia.get(sqlSession, Media.class, media, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get media result: " + mediaGot);
    }
    return mediaGot;
  }
  	
  public Media get(Media media, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), media, sqlControl);
  }
  
  public Media get(SqlSession sqlSession, Media media) {
    return get(sqlSession, media, null);
  }
  
  public Media get(Media media) {
    return get(media, null);
  }
  
  public int update(SqlSession sqlSession, Media media, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update media: " + media + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineMedia = sqlEngineFactory.getCheckedCrudEngine("UPDATE_MEDIA");
    int count = sqlUpdateEngineMedia.update(sqlSession, media);
    if (count > 0) {
    	media.setVersion(media.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("update media result count: " + count);
    }
    return count;
  }
  
  public int update(Media media, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), media, sqlControl);
  }
  
  public int update(SqlSession sqlSession, Media media) {
    return update(sqlSession, media, null);
  }
  
  public int update(Media media) {
    return update(media, null);
  }
  
  public int delete(SqlSession sqlSession, Media media, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete media: " + media + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineMedia = sqlEngineFactory.getCheckedCrudEngine("DELETE_MEDIA");
    int count = sqlDeleteEngineMedia.delete(sqlSession, media);
    if (count > 0) {
    	media.setVersion(media.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("delete media result count: " + count);
    }
    return count;
  }
  
  public int delete(Media media, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), media, sqlControl);
  }
  
  public int delete(SqlSession sqlSession, Media media) {
    return delete(sqlSession, media, null);
  }
  
  public int delete(Media media) {
    return delete(media, null);
  }
  
  public List<Media> list(SqlSession sqlSession, Media media, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list media: " + media + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineMedia = sqlEngineFactory.getCheckedQueryEngine("SELECT_MEDIA");
    //sqlControl = getMoreResultClasses(media, sqlControl);
    List<Media> mediaList = sqlEngineMedia.query(sqlSession, Media.class, media, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list media size: " + ((mediaList != null) ? mediaList.size() : "null"));
    }
    return mediaList;
  }
  
  public List<Media> list(Media media, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), media, sqlControl);
  }
  
  public List<Media> list(SqlSession sqlSession, Media media) {
    return list(sqlSession, media, null);
  }
  
  public List<Media> list(Media media) {
    return list(media, null);
  }
  
  public int count(SqlSession sqlSession, Media media, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("count media: " + media + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineMedia = sqlEngineFactory.getCheckedQueryEngine("SELECT_MEDIA");
    //sqlControl = getMoreResultClasses(media, sqlControl);
    int count = sqlEngineMedia.queryCount(sqlSession, media, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(Media media, SqlControl sqlControl) {
  	return count(sqlSessionFactory.getSqlSession(), media, sqlControl);
  }
  
  public int count(SqlSession sqlSession, Media media) {
    return count(sqlSession, media, null);
  }
  
  public int count(Media media) {
    return count(media, null);
  }
}
