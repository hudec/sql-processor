package org.sqlproc.sample.simple.dao.impl;

import java.util.List;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.dao.MediaDao;
import org.sqlproc.sample.simple.dao.impl.BaseDaoImpl;
import org.sqlproc.sample.simple.model.Media;

@SuppressWarnings("all")
public class MediaDaoImpl extends BaseDaoImpl implements MediaDao, BaseDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public MediaDaoImpl() {
  }
  
  public MediaDaoImpl(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public MediaDaoImpl(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public Media insert(final SqlSession sqlSession, final Media media, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert media: " + media + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertMedia = sqlEngineFactory.getCheckedCrudEngine("INSERT_MEDIA");
    int count = sqlInsertMedia.insert(sqlSession, media, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert media result: " + count + " " + media);
    }
    return (count > 0) ? media : null;
  }
  
  public Media insert(final Media media, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), media, sqlControl);
  }
  
  public Media insert(final SqlSession sqlSession, final Media media) {
    return insert(sqlSession, media, null);
  }
  
  public Media insert(final Media media) {
    return insert(media, null);
  }
  
  public Media get(final SqlSession sqlSession, final Media media, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + media + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineMedia = sqlEngineFactory.getCheckedCrudEngine("GET_MEDIA");
    //sqlControl = getMoreResultClasses(media, sqlControl);
    Media mediaGot = sqlGetEngineMedia.get(sqlSession, Media.class, media, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get media result: " + mediaGot);
    }
    return mediaGot;
  }
  
  public Media get(final Media media, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), media, sqlControl);
  }
  
  public Media get(final SqlSession sqlSession, final Media media) {
    return get(sqlSession, media, null);
  }
  
  public Media get(final Media media) {
    return get(media, null);
  }
  
  public int update(final SqlSession sqlSession, final Media media, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update media: " + media + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineMedia = sqlEngineFactory.getCheckedCrudEngine("UPDATE_MEDIA");
    int count = sqlUpdateEngineMedia.update(sqlSession, media, sqlControl);
    if (count > 0) {
    	media.setVersion(media.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update media result count: " + count);
    }
    return count;
  }
  
  public int update(final Media media, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), media, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final Media media) {
    return update(sqlSession, media, null);
  }
  
  public int update(final Media media) {
    return update(media, null);
  }
  
  public int delete(final SqlSession sqlSession, final Media media, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete media: " + media + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineMedia = sqlEngineFactory.getCheckedCrudEngine("DELETE_MEDIA");
    int count = sqlDeleteEngineMedia.delete(sqlSession, media, sqlControl);
    if (count > 0) {
    	media.setVersion(media.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete media result count: " + count);
    }
    return count;
  }
  
  public int delete(final Media media, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), media, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final Media media) {
    return delete(sqlSession, media, null);
  }
  
  public int delete(final Media media) {
    return delete(media, null);
  }
  
  public List<Media> list(final SqlSession sqlSession, final Media media, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list media: " + media + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineMedia = sqlEngineFactory.getCheckedQueryEngine("SELECT_MEDIA");
    //sqlControl = getMoreResultClasses(media, sqlControl);
    List<Media> mediaList = sqlEngineMedia.query(sqlSession, Media.class, media, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list media size: " + ((mediaList != null) ? mediaList.size() : "null"));
    }
    return mediaList;
  }
  
  public List<Media> list(final Media media, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), media, sqlControl);
  }
  
  public List<Media> list(final SqlSession sqlSession, final Media media) {
    return list(sqlSession, media, null);
  }
  
  public List<Media> list(final Media media) {
    return list(media, null);
  }
  
  public int query(final SqlSession sqlSession, final Media media, SqlControl sqlControl, final SqlRowProcessor<Media> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query media: " + media + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineMedia = sqlEngineFactory.getCheckedQueryEngine("SELECT_MEDIA");
    //sqlControl = getMoreResultClasses(media, sqlControl);
    int rownums = sqlEngineMedia.query(sqlSession, Media.class, media, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query media size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final Media media, SqlControl sqlControl, final SqlRowProcessor<Media> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), media, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final Media media, final SqlRowProcessor<Media> sqlRowProcessor) {
    return query(sqlSession, media, null, sqlRowProcessor);
  }
  
  public int query(final Media media, final SqlRowProcessor<Media> sqlRowProcessor) {
    return query(media, null, sqlRowProcessor);
  }
  
  public int count(final SqlSession sqlSession, final Media media, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count media: " + media + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineMedia = sqlEngineFactory.getCheckedQueryEngine("SELECT_MEDIA");
    //sqlControl = getMoreResultClasses(media, sqlControl);
    int count = sqlEngineMedia.queryCount(sqlSession, media, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final Media media, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), media, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final Media media) {
    return count(sqlSession, media, null);
  }
  
  public int count(final Media media) {
    return count(media, null);
  }
}
