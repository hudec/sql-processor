package org.sample.auth.dao;

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
import org.sample.auth.model.Authuser;

public class AuthuserDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public AuthuserDao(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public AuthuserDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Authuser insert(SqlSession sqlSession, Authuser authuser, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert authuser: " + authuser + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertAuthuser = sqlEngineFactory.getCheckedCrudEngine("INSERT_AUTHUSER");
    int count = sqlInsertAuthuser.insert(sqlSession, authuser, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("insert authuser result: " + count + " " + authuser);
    }
    return (count > 0) ? authuser : null;
  }
  
  public Authuser insert(Authuser authuser, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), authuser, sqlControl);
  }
  
  public Authuser insert(SqlSession sqlSession, Authuser authuser) {
    return insert(sqlSession, authuser, null);
  }
  
  public Authuser insert(Authuser authuser) {
    return insert(authuser, null);
  }
  
  public Authuser get(SqlSession sqlSession, Authuser authuser, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + authuser + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineAuthuser = sqlEngineFactory.getCheckedCrudEngine("GET_AUTHUSER");
    //sqlControl = getMoreResultClasses(authuser, sqlControl);
    Authuser authuserGot = sqlGetEngineAuthuser.get(sqlSession, Authuser.class, authuser, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get authuser result: " + authuserGot);
    }
    return authuserGot;
  }
  	
  public Authuser get(Authuser authuser, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), authuser, sqlControl);
  }
  
  public Authuser get(SqlSession sqlSession, Authuser authuser) {
    return get(sqlSession, authuser, null);
  }
  
  public Authuser get(Authuser authuser) {
    return get(authuser, null);
  }
  
  public int update(SqlSession sqlSession, Authuser authuser, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update authuser: " + authuser + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineAuthuser = sqlEngineFactory.getCheckedCrudEngine("UPDATE_AUTHUSER");
    int count = sqlUpdateEngineAuthuser.update(sqlSession, authuser, sqlControl);
    if (count > 0) {
    	authuser.setVersion(authuser.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("update authuser result count: " + count);
    }
    return count;
  }
  
  public int update(Authuser authuser, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), authuser, sqlControl);
  }
  
  public int update(SqlSession sqlSession, Authuser authuser) {
    return update(sqlSession, authuser, null);
  }
  
  public int update(Authuser authuser) {
    return update(authuser, null);
  }
  
  public int delete(SqlSession sqlSession, Authuser authuser, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete authuser: " + authuser + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineAuthuser = sqlEngineFactory.getCheckedCrudEngine("DELETE_AUTHUSER");
    int count = sqlDeleteEngineAuthuser.delete(sqlSession, authuser, sqlControl);
    if (count > 0) {
    	authuser.setVersion(authuser.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("delete authuser result count: " + count);
    }
    return count;
  }
  
  public int delete(Authuser authuser, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), authuser, sqlControl);
  }
  
  public int delete(SqlSession sqlSession, Authuser authuser) {
    return delete(sqlSession, authuser, null);
  }
  
  public int delete(Authuser authuser) {
    return delete(authuser, null);
  }
  
  public List<Authuser> list(SqlSession sqlSession, Authuser authuser, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list authuser: " + authuser + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineAuthuser = sqlEngineFactory.getCheckedQueryEngine("SELECT_AUTHUSER");
    //sqlControl = getMoreResultClasses(authuser, sqlControl);
    List<Authuser> authuserList = sqlEngineAuthuser.query(sqlSession, Authuser.class, authuser, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list authuser size: " + ((authuserList != null) ? authuserList.size() : "null"));
    }
    return authuserList;
  }
  
  public List<Authuser> list(Authuser authuser, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), authuser, sqlControl);
  }
  
  public List<Authuser> list(SqlSession sqlSession, Authuser authuser) {
    return list(sqlSession, authuser, null);
  }
  
  public List<Authuser> list(Authuser authuser) {
    return list(authuser, null);
  }
  
  public int count(SqlSession sqlSession, Authuser authuser, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("count authuser: " + authuser + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineAuthuser = sqlEngineFactory.getCheckedQueryEngine("SELECT_AUTHUSER");
    //sqlControl = getMoreResultClasses(authuser, sqlControl);
    int count = sqlEngineAuthuser.queryCount(sqlSession, authuser, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(Authuser authuser, SqlControl sqlControl) {
  	return count(sqlSessionFactory.getSqlSession(), authuser, sqlControl);
  }
  
  public int count(SqlSession sqlSession, Authuser authuser) {
    return count(sqlSession, authuser, null);
  }
  
  public int count(Authuser authuser) {
    return count(authuser, null);
  }
}
