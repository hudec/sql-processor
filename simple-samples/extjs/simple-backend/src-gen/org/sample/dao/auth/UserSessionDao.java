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
import org.sample.model.auth.UserSession;

public class UserSessionDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public UserSessionDao(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public UserSessionDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public UserSession insert(SqlSession sqlSession, UserSession userSession, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert userSession: " + userSession + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertUserSession = sqlEngineFactory.getCheckedCrudEngine("INSERT_USER_SESSION");
    int count = sqlInsertUserSession.insert(sqlSession, userSession, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("insert userSession result: " + count + " " + userSession);
    }
    return (count > 0) ? userSession : null;
  }
  
  public UserSession insert(UserSession userSession, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), userSession, sqlControl);
  }
  
  public UserSession insert(SqlSession sqlSession, UserSession userSession) {
    return insert(sqlSession, userSession, null);
  }
  
  public UserSession insert(UserSession userSession) {
    return insert(userSession, null);
  }
  
  public UserSession get(SqlSession sqlSession, UserSession userSession, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + userSession + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineUserSession = sqlEngineFactory.getCheckedCrudEngine("GET_USER_SESSION");
    //sqlControl = getMoreResultClasses(userSession, sqlControl);
    UserSession userSessionGot = sqlGetEngineUserSession.get(sqlSession, UserSession.class, userSession, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get userSession result: " + userSessionGot);
    }
    return userSessionGot;
  }
  	
  public UserSession get(UserSession userSession, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), userSession, sqlControl);
  }
  
  public UserSession get(SqlSession sqlSession, UserSession userSession) {
    return get(sqlSession, userSession, null);
  }
  
  public UserSession get(UserSession userSession) {
    return get(userSession, null);
  }
  
  public int update(SqlSession sqlSession, UserSession userSession, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update userSession: " + userSession + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineUserSession = sqlEngineFactory.getCheckedCrudEngine("UPDATE_USER_SESSION");
    int count = sqlUpdateEngineUserSession.update(sqlSession, userSession, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("update userSession result count: " + count);
    }
    return count;
  }
  
  public int update(UserSession userSession, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), userSession, sqlControl);
  }
  
  public int update(SqlSession sqlSession, UserSession userSession) {
    return update(sqlSession, userSession, null);
  }
  
  public int update(UserSession userSession) {
    return update(userSession, null);
  }
  
  public int delete(SqlSession sqlSession, UserSession userSession, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete userSession: " + userSession + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineUserSession = sqlEngineFactory.getCheckedCrudEngine("DELETE_USER_SESSION");
    int count = sqlDeleteEngineUserSession.delete(sqlSession, userSession, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("delete userSession result count: " + count);
    }
    return count;
  }
  
  public int delete(UserSession userSession, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), userSession, sqlControl);
  }
  
  public int delete(SqlSession sqlSession, UserSession userSession) {
    return delete(sqlSession, userSession, null);
  }
  
  public int delete(UserSession userSession) {
    return delete(userSession, null);
  }
  
  public List<UserSession> list(SqlSession sqlSession, UserSession userSession, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list userSession: " + userSession + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineUserSession = sqlEngineFactory.getCheckedQueryEngine("SELECT_USER_SESSION");
    //sqlControl = getMoreResultClasses(userSession, sqlControl);
    List<UserSession> userSessionList = sqlEngineUserSession.query(sqlSession, UserSession.class, userSession, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list userSession size: " + ((userSessionList != null) ? userSessionList.size() : "null"));
    }
    return userSessionList;
  }
  
  public List<UserSession> list(UserSession userSession, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), userSession, sqlControl);
  }
  
  public List<UserSession> list(SqlSession sqlSession, UserSession userSession) {
    return list(sqlSession, userSession, null);
  }
  
  public List<UserSession> list(UserSession userSession) {
    return list(userSession, null);
  }
  
  public int count(SqlSession sqlSession, UserSession userSession, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("count userSession: " + userSession + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineUserSession = sqlEngineFactory.getCheckedQueryEngine("SELECT_USER_SESSION");
    //sqlControl = getMoreResultClasses(userSession, sqlControl);
    int count = sqlEngineUserSession.queryCount(sqlSession, userSession, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(UserSession userSession, SqlControl sqlControl) {
  	return count(sqlSessionFactory.getSqlSession(), userSession, sqlControl);
  }
  
  public int count(SqlSession sqlSession, UserSession userSession) {
    return count(sqlSession, userSession, null);
  }
  
  public int count(UserSession userSession) {
    return count(userSession, null);
  }
}
