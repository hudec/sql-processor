package org.sqlproc.sample.simple.dao.impl;

import java.util.List;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.dao.PhysicalMediaDao;
import org.sqlproc.sample.simple.dao.impl.BaseDaoImpl;
import org.sqlproc.sample.simple.model.Movie;
import org.sqlproc.sample.simple.model.NewBook;
import org.sqlproc.sample.simple.model.PhysicalMedia;

@SuppressWarnings("all")
public class PhysicalMediaDaoImpl extends BaseDaoImpl implements PhysicalMediaDao, BaseDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public PhysicalMediaDaoImpl() {
  }
  
  public PhysicalMediaDaoImpl(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public PhysicalMediaDaoImpl(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public PhysicalMedia insert(final SqlSession sqlSession, final PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert physicalMedia: " + physicalMedia + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertPhysicalMedia = sqlEngineFactory.getCheckedCrudEngine("INSERT_PHYSICAL_MEDIA");
    int count = sqlInsertPhysicalMedia.insert(sqlSession, physicalMedia, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert physicalMedia result: " + count + " " + physicalMedia);
    }
    return (count > 0) ? physicalMedia : null;
  }
  
  public PhysicalMedia insert(final PhysicalMedia physicalMedia, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), physicalMedia, sqlControl);
  }
  
  public PhysicalMedia insert(final SqlSession sqlSession, final PhysicalMedia physicalMedia) {
    return insert(sqlSession, physicalMedia, null);
  }
  
  public PhysicalMedia insert(final PhysicalMedia physicalMedia) {
    return insert(physicalMedia, null);
  }
  
  public PhysicalMedia get(final SqlSession sqlSession, final PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + physicalMedia + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEnginePhysicalMedia = sqlEngineFactory.getCheckedCrudEngine("GET_PHYSICAL_MEDIA");
    sqlControl = getMoreResultClasses(physicalMedia, sqlControl);
    PhysicalMedia physicalMediaGot = sqlGetEnginePhysicalMedia.get(sqlSession, PhysicalMedia.class, physicalMedia, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get physicalMedia result: " + physicalMediaGot);
    }
    return physicalMediaGot;
  }
  
  public PhysicalMedia get(final PhysicalMedia physicalMedia, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), physicalMedia, sqlControl);
  }
  
  public PhysicalMedia get(final SqlSession sqlSession, final PhysicalMedia physicalMedia) {
    return get(sqlSession, physicalMedia, null);
  }
  
  public PhysicalMedia get(final PhysicalMedia physicalMedia) {
    return get(physicalMedia, null);
  }
  
  public int update(final SqlSession sqlSession, final PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update physicalMedia: " + physicalMedia + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEnginePhysicalMedia = sqlEngineFactory.getCheckedCrudEngine("UPDATE_PHYSICAL_MEDIA");
    int count = sqlUpdateEnginePhysicalMedia.update(sqlSession, physicalMedia, sqlControl);
    if (count > 0) {
    	physicalMedia.setVersion(physicalMedia.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update physicalMedia result count: " + count);
    }
    return count;
  }
  
  public int update(final PhysicalMedia physicalMedia, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), physicalMedia, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final PhysicalMedia physicalMedia) {
    return update(sqlSession, physicalMedia, null);
  }
  
  public int update(final PhysicalMedia physicalMedia) {
    return update(physicalMedia, null);
  }
  
  public int delete(final SqlSession sqlSession, final PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete physicalMedia: " + physicalMedia + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEnginePhysicalMedia = sqlEngineFactory.getCheckedCrudEngine("DELETE_PHYSICAL_MEDIA");
    int count = sqlDeleteEnginePhysicalMedia.delete(sqlSession, physicalMedia, sqlControl);
    if (count > 0) {
    	physicalMedia.setVersion(physicalMedia.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete physicalMedia result count: " + count);
    }
    return count;
  }
  
  public int delete(final PhysicalMedia physicalMedia, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), physicalMedia, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final PhysicalMedia physicalMedia) {
    return delete(sqlSession, physicalMedia, null);
  }
  
  public int delete(final PhysicalMedia physicalMedia) {
    return delete(physicalMedia, null);
  }
  
  public List<PhysicalMedia> list(final SqlSession sqlSession, final PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list physicalMedia: " + physicalMedia + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePhysicalMedia = sqlEngineFactory.getCheckedQueryEngine("SELECT_PHYSICAL_MEDIA");
    sqlControl = getMoreResultClasses(physicalMedia, sqlControl);
    List<PhysicalMedia> physicalMediaList = sqlEnginePhysicalMedia.query(sqlSession, PhysicalMedia.class, physicalMedia, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list physicalMedia size: " + ((physicalMediaList != null) ? physicalMediaList.size() : "null"));
    }
    return physicalMediaList;
  }
  
  public List<PhysicalMedia> list(final PhysicalMedia physicalMedia, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), physicalMedia, sqlControl);
  }
  
  public List<PhysicalMedia> list(final SqlSession sqlSession, final PhysicalMedia physicalMedia) {
    return list(sqlSession, physicalMedia, null);
  }
  
  public List<PhysicalMedia> list(final PhysicalMedia physicalMedia) {
    return list(physicalMedia, null);
  }
  
  public int count(final SqlSession sqlSession, final PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count physicalMedia: " + physicalMedia + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePhysicalMedia = sqlEngineFactory.getCheckedQueryEngine("SELECT_PHYSICAL_MEDIA");
    sqlControl = getMoreResultClasses(physicalMedia, sqlControl);
    int count = sqlEnginePhysicalMedia.queryCount(sqlSession, physicalMedia, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final PhysicalMedia physicalMedia, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), physicalMedia, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final PhysicalMedia physicalMedia) {
    return count(sqlSession, physicalMedia, null);
  }
  
  public int count(final PhysicalMedia physicalMedia) {
    return count(physicalMedia, null);
  }
  
  public SqlControl getMoreResultClasses(final PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (sqlControl != null && sqlControl.getMoreResultClasses() != null)
    	return sqlControl;
    java.util.Map<String, Class<?>> moreResultClasses = null;
    if (physicalMedia != null && physicalMedia.toInit(PhysicalMedia.Association.media.name())) {
    	if (moreResultClasses == null)
    		moreResultClasses = new java.util.HashMap<String, Class<?>>();
    	moreResultClasses.put("book", NewBook.class);
    	moreResultClasses.put("movie", Movie.class);
    }
    if (moreResultClasses != null) {
    	sqlControl = new org.sqlproc.engine.impl.SqlStandardControl(sqlControl);
    	((org.sqlproc.engine.impl.SqlStandardControl) sqlControl).setMoreResultClasses(moreResultClasses);
    }
    return sqlControl;
  }
}
