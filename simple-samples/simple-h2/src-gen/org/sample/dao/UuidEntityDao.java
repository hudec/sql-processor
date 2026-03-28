package org.sample.dao;

import java.util.List;
import org.sample.model.UuidEntity;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

@SuppressWarnings("all")
public class UuidEntityDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());

  public UuidEntityDao() {
  }

  public UuidEntityDao(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }

  public UuidEntityDao(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }

  protected SqlEngineFactory sqlEngineFactory;

  protected SqlSessionFactory sqlSessionFactory;

  public UuidEntity insert(final SqlSession sqlSession, final UuidEntity uuidEntity, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert uuidEntity: " + uuidEntity + " " + sqlControl);
    }
    String sqlName = (sqlControl != null && sqlControl.getSqlName() != null) ? sqlControl.getSqlName() : "INSERT_UUID_ENTITY";
    org.sqlproc.engine.SqlCrudEngine sqlInsertUuidEntity = sqlEngineFactory.getCheckedCrudEngine(sqlName);
    int count = sqlInsertUuidEntity.insert(sqlSession, uuidEntity, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert uuidEntity result: " + count + " " + uuidEntity);
    }
    return (count > 0) ? uuidEntity : null;
  }

  public UuidEntity insert(final UuidEntity uuidEntity, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), uuidEntity, sqlControl);
  }

  public UuidEntity insert(final SqlSession sqlSession, final UuidEntity uuidEntity) {
    return insert(sqlSession, uuidEntity, null);
  }

  public UuidEntity insert(final UuidEntity uuidEntity) {
    return insert(uuidEntity, null);
  }

  public UuidEntity get(final SqlSession sqlSession, final UuidEntity uuidEntity, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + uuidEntity + " " + sqlControl);
    }
    String sqlName = (sqlControl != null && sqlControl.getSqlName() != null) ? sqlControl.getSqlName() : "GET_UUID_ENTITY";
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineUuidEntity = sqlEngineFactory.getCheckedCrudEngine(sqlName);
    //sqlControl = getMoreResultClasses(uuidEntity, sqlControl);
    UuidEntity uuidEntityGot = sqlGetEngineUuidEntity.get(sqlSession, UuidEntity.class, uuidEntity, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get uuidEntity result: " + uuidEntityGot);
    }
    return uuidEntityGot;
  }

  public UuidEntity get(final UuidEntity uuidEntity, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), uuidEntity, sqlControl);
  }

  public UuidEntity get(final SqlSession sqlSession, final UuidEntity uuidEntity) {
    return get(sqlSession, uuidEntity, null);
  }

  public UuidEntity get(final UuidEntity uuidEntity) {
    return get(uuidEntity, null);
  }

  public int update(final SqlSession sqlSession, final UuidEntity uuidEntity, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update uuidEntity: " + uuidEntity + " " + sqlControl);
    }
    String sqlName = (sqlControl != null && sqlControl.getSqlName() != null) ? sqlControl.getSqlName() : "UPDATE_UUID_ENTITY";
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineUuidEntity = sqlEngineFactory.getCheckedCrudEngine(sqlName);
    int count = sqlUpdateEngineUuidEntity.update(sqlSession, uuidEntity, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update uuidEntity result count: " + count);
    }
    return count;
  }

  public int update(final UuidEntity uuidEntity, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), uuidEntity, sqlControl);
  }

  public int update(final SqlSession sqlSession, final UuidEntity uuidEntity) {
    return update(sqlSession, uuidEntity, null);
  }

  public int update(final UuidEntity uuidEntity) {
    return update(uuidEntity, null);
  }

  public int delete(final SqlSession sqlSession, final UuidEntity uuidEntity, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete uuidEntity: " + uuidEntity + " " + sqlControl);
    }
    String sqlName = (sqlControl != null && sqlControl.getSqlName() != null) ? sqlControl.getSqlName() : "DELETE_UUID_ENTITY";
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineUuidEntity = sqlEngineFactory.getCheckedCrudEngine(sqlName);
    int count = sqlDeleteEngineUuidEntity.delete(sqlSession, uuidEntity, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete uuidEntity result count: " + count);
    }
    return count;
  }

  public int delete(final UuidEntity uuidEntity, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), uuidEntity, sqlControl);
  }

  public int delete(final SqlSession sqlSession, final UuidEntity uuidEntity) {
    return delete(sqlSession, uuidEntity, null);
  }

  public int delete(final UuidEntity uuidEntity) {
    return delete(uuidEntity, null);
  }

  public List<UuidEntity> list(final SqlSession sqlSession, final UuidEntity uuidEntity, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list uuidEntity: " + uuidEntity + " " + sqlControl);
    }
    String sqlName = (sqlControl != null && sqlControl.getSqlName() != null) ? sqlControl.getSqlName() : "SELECT_UUID_ENTITY";
    org.sqlproc.engine.SqlQueryEngine sqlEngineUuidEntity = sqlEngineFactory.getCheckedQueryEngine(sqlName);
    //sqlControl = getMoreResultClasses(uuidEntity, sqlControl);
    List<UuidEntity> uuidEntityList = sqlEngineUuidEntity.query(sqlSession, UuidEntity.class, uuidEntity, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list uuidEntity size: " + ((uuidEntityList != null) ? uuidEntityList.size() : "null"));
    }
    return uuidEntityList;
  }

  public List<UuidEntity> list(final UuidEntity uuidEntity, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), uuidEntity, sqlControl);
  }

  public List<UuidEntity> list(final SqlSession sqlSession, final UuidEntity uuidEntity) {
    return list(sqlSession, uuidEntity, null);
  }

  public List<UuidEntity> list(final UuidEntity uuidEntity) {
    return list(uuidEntity, null);
  }

  public int query(final SqlSession sqlSession, final UuidEntity uuidEntity, SqlControl sqlControl, final SqlRowProcessor<UuidEntity> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query uuidEntity: " + uuidEntity + " " + sqlControl);
    }
    String sqlName = (sqlControl != null && sqlControl.getSqlName() != null) ? sqlControl.getSqlName() : "SELECT_UUID_ENTITY";
    org.sqlproc.engine.SqlQueryEngine sqlEngineUuidEntity = sqlEngineFactory.getCheckedQueryEngine(sqlName);
    //sqlControl = getMoreResultClasses(uuidEntity, sqlControl);
    int rownums = sqlEngineUuidEntity.query(sqlSession, UuidEntity.class, uuidEntity, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query uuidEntity size: " + rownums);
    }
    return rownums;
  }

  public int query(final UuidEntity uuidEntity, SqlControl sqlControl, final SqlRowProcessor<UuidEntity> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), uuidEntity, sqlControl, sqlRowProcessor);
  }

  public int query(final SqlSession sqlSession, final UuidEntity uuidEntity, final SqlRowProcessor<UuidEntity> sqlRowProcessor) {
    return query(sqlSession, uuidEntity, null, sqlRowProcessor);
  }

  public int query(final UuidEntity uuidEntity, final SqlRowProcessor<UuidEntity> sqlRowProcessor) {
    return query(uuidEntity, null, sqlRowProcessor);
  }

  public int count(final SqlSession sqlSession, final UuidEntity uuidEntity, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count uuidEntity: " + uuidEntity + " " + sqlControl);
    }
    String sqlName = (sqlControl != null && sqlControl.getSqlName() != null) ? sqlControl.getSqlName() : "SELECT_UUID_ENTITY";
    org.sqlproc.engine.SqlQueryEngine sqlEngineUuidEntity = sqlEngineFactory.getCheckedQueryEngine(sqlName);
    //sqlControl = getMoreResultClasses(uuidEntity, sqlControl);
    int count = sqlEngineUuidEntity.queryCount(sqlSession, uuidEntity, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }

  public int count(final UuidEntity uuidEntity, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), uuidEntity, sqlControl);
  }

  public int count(final SqlSession sqlSession, final UuidEntity uuidEntity) {
    return count(sqlSession, uuidEntity, null);
  }

  public int count(final UuidEntity uuidEntity) {
    return count(uuidEntity, null);
  }
}
