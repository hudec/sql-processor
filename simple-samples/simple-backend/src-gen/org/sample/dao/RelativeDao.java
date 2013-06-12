package org.sample.dao;

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
import org.sample.model.Relative;

public class RelativeDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public RelativeDao(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public RelativeDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Relative insert(SqlSession sqlSession, Relative relative, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert relative: " + relative + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertRelative = sqlEngineFactory.getCheckedCrudEngine("INSERT_RELATIVE");
    int count = sqlInsertRelative.insert(sqlSession, relative, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("insert relative result: " + count + " " + relative);
    }
    return (count > 0) ? relative : null;
  }
  
  public Relative insert(Relative relative, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), relative, sqlControl);
  }
  
  public Relative insert(SqlSession sqlSession, Relative relative) {
    return insert(sqlSession, relative, null);
  }
  
  public Relative insert(Relative relative) {
    return insert(relative, null);
  }
  
  public Relative get(SqlSession sqlSession, Relative relative, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + relative + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineRelative = sqlEngineFactory.getCheckedCrudEngine("GET_RELATIVE");
    //sqlControl = getMoreResultClasses(relative, sqlControl);
    Relative relativeGot = sqlGetEngineRelative.get(sqlSession, Relative.class, relative, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get relative result: " + relativeGot);
    }
    return relativeGot;
  }
  	
  public Relative get(Relative relative, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), relative, sqlControl);
  }
  
  public Relative get(SqlSession sqlSession, Relative relative) {
    return get(sqlSession, relative, null);
  }
  
  public Relative get(Relative relative) {
    return get(relative, null);
  }
  
  public int update(SqlSession sqlSession, Relative relative, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update relative: " + relative + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineRelative = sqlEngineFactory.getCheckedCrudEngine("UPDATE_RELATIVE");
    int count = sqlUpdateEngineRelative.update(sqlSession, relative, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("update relative result count: " + count);
    }
    return count;
  }
  
  public int update(Relative relative, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), relative, sqlControl);
  }
  
  public int update(SqlSession sqlSession, Relative relative) {
    return update(sqlSession, relative, null);
  }
  
  public int update(Relative relative) {
    return update(relative, null);
  }
  
  public int delete(SqlSession sqlSession, Relative relative, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete relative: " + relative + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineRelative = sqlEngineFactory.getCheckedCrudEngine("DELETE_RELATIVE");
    int count = sqlDeleteEngineRelative.delete(sqlSession, relative, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("delete relative result count: " + count);
    }
    return count;
  }
  
  public int delete(Relative relative, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), relative, sqlControl);
  }
  
  public int delete(SqlSession sqlSession, Relative relative) {
    return delete(sqlSession, relative, null);
  }
  
  public int delete(Relative relative) {
    return delete(relative, null);
  }
  
  public List<Relative> list(SqlSession sqlSession, Relative relative, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list relative: " + relative + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineRelative = sqlEngineFactory.getCheckedQueryEngine("SELECT_RELATIVE");
    //sqlControl = getMoreResultClasses(relative, sqlControl);
    List<Relative> relativeList = sqlEngineRelative.query(sqlSession, Relative.class, relative, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list relative size: " + ((relativeList != null) ? relativeList.size() : "null"));
    }
    return relativeList;
  }
  
  public List<Relative> list(Relative relative, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), relative, sqlControl);
  }
  
  public List<Relative> list(SqlSession sqlSession, Relative relative) {
    return list(sqlSession, relative, null);
  }
  
  public List<Relative> list(Relative relative) {
    return list(relative, null);
  }
  
  public int count(SqlSession sqlSession, Relative relative, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("count relative: " + relative + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineRelative = sqlEngineFactory.getCheckedQueryEngine("SELECT_RELATIVE");
    //sqlControl = getMoreResultClasses(relative, sqlControl);
    int count = sqlEngineRelative.queryCount(sqlSession, relative, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(Relative relative, SqlControl sqlControl) {
  	return count(sqlSessionFactory.getSqlSession(), relative, sqlControl);
  }
  
  public int count(SqlSession sqlSession, Relative relative) {
    return count(sqlSession, relative, null);
  }
  
  public int count(Relative relative) {
    return count(relative, null);
  }
}
