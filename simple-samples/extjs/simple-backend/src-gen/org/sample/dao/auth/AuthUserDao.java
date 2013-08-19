package org.sample.dao.auth;

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
import org.sample.model.auth.AuthUser;

public class AuthUserDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public AuthUserDao(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public AuthUserDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public AuthUser insert(SqlSession sqlSession, AuthUser authUser, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert authUser: " + authUser + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertAuthUser = sqlEngineFactory.getCheckedCrudEngine("INSERT_AUTH_USER");
    int count = sqlInsertAuthUser.insert(sqlSession, authUser, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("insert authUser result: " + count + " " + authUser);
    }
    return (count > 0) ? authUser : null;
  }
  
  public AuthUser insert(AuthUser authUser, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), authUser, sqlControl);
  }
  
  public AuthUser insert(SqlSession sqlSession, AuthUser authUser) {
    return insert(sqlSession, authUser, null);
  }
  
  public AuthUser insert(AuthUser authUser) {
    return insert(authUser, null);
  }
  
  public AuthUser get(SqlSession sqlSession, AuthUser authUser, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + authUser + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineAuthUser = sqlEngineFactory.getCheckedCrudEngine("GET_AUTH_USER");
    //sqlControl = getMoreResultClasses(authUser, sqlControl);
    AuthUser authUserGot = sqlGetEngineAuthUser.get(sqlSession, AuthUser.class, authUser, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get authUser result: " + authUserGot);
    }
    return authUserGot;
  }
  	
  public AuthUser get(AuthUser authUser, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), authUser, sqlControl);
  }
  
  public AuthUser get(SqlSession sqlSession, AuthUser authUser) {
    return get(sqlSession, authUser, null);
  }
  
  public AuthUser get(AuthUser authUser) {
    return get(authUser, null);
  }
  
  public int update(SqlSession sqlSession, AuthUser authUser, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update authUser: " + authUser + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineAuthUser = sqlEngineFactory.getCheckedCrudEngine("UPDATE_AUTH_USER");
    int count = sqlUpdateEngineAuthUser.update(sqlSession, authUser, sqlControl);
    if (count > 0) {
    	authUser.setVersion(authUser.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("update authUser result count: " + count);
    }
    return count;
  }
  
  public int update(AuthUser authUser, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), authUser, sqlControl);
  }
  
  public int update(SqlSession sqlSession, AuthUser authUser) {
    return update(sqlSession, authUser, null);
  }
  
  public int update(AuthUser authUser) {
    return update(authUser, null);
  }
  
  public int delete(SqlSession sqlSession, AuthUser authUser, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete authUser: " + authUser + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineAuthUser = sqlEngineFactory.getCheckedCrudEngine("DELETE_AUTH_USER");
    int count = sqlDeleteEngineAuthUser.delete(sqlSession, authUser, sqlControl);
    if (count > 0) {
    	authUser.setVersion(authUser.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("delete authUser result count: " + count);
    }
    return count;
  }
  
  public int delete(AuthUser authUser, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), authUser, sqlControl);
  }
  
  public int delete(SqlSession sqlSession, AuthUser authUser) {
    return delete(sqlSession, authUser, null);
  }
  
  public int delete(AuthUser authUser) {
    return delete(authUser, null);
  }
  
  public List<AuthUser> list(SqlSession sqlSession, AuthUser authUser, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list authUser: " + authUser + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineAuthUser = sqlEngineFactory.getCheckedQueryEngine("SELECT_AUTH_USER");
    //sqlControl = getMoreResultClasses(authUser, sqlControl);
    List<AuthUser> authUserList = sqlEngineAuthUser.query(sqlSession, AuthUser.class, authUser, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list authUser size: " + ((authUserList != null) ? authUserList.size() : "null"));
    }
    return authUserList;
  }
  
  public List<AuthUser> list(AuthUser authUser, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), authUser, sqlControl);
  }
  
  public List<AuthUser> list(SqlSession sqlSession, AuthUser authUser) {
    return list(sqlSession, authUser, null);
  }
  
  public List<AuthUser> list(AuthUser authUser) {
    return list(authUser, null);
  }
  
  public int count(SqlSession sqlSession, AuthUser authUser, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("count authUser: " + authUser + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineAuthUser = sqlEngineFactory.getCheckedQueryEngine("SELECT_AUTH_USER");
    //sqlControl = getMoreResultClasses(authUser, sqlControl);
    int count = sqlEngineAuthUser.queryCount(sqlSession, authUser, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(AuthUser authUser, SqlControl sqlControl) {
  	return count(sqlSessionFactory.getSqlSession(), authUser, sqlControl);
  }
  
  public int count(SqlSession sqlSession, AuthUser authUser) {
    return count(sqlSession, authUser, null);
  }
  
  public int count(AuthUser authUser) {
    return count(authUser, null);
  }
}
