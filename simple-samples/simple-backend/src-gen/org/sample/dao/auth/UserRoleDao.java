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
import org.sample.model.auth.UserRole;

public class UserRoleDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public UserRoleDao(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public UserRoleDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public UserRole insert(SqlSession sqlSession, UserRole userRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert userRole: " + userRole + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertUserRole = sqlEngineFactory.getCheckedCrudEngine("INSERT_USER_ROLE");
    int count = sqlInsertUserRole.insert(sqlSession, userRole, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("insert userRole result: " + count + " " + userRole);
    }
    return (count > 0) ? userRole : null;
  }
  
  public UserRole insert(UserRole userRole, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), userRole, sqlControl);
  }
  
  public UserRole insert(SqlSession sqlSession, UserRole userRole) {
    return insert(sqlSession, userRole, null);
  }
  
  public UserRole insert(UserRole userRole) {
    return insert(userRole, null);
  }
  
  public UserRole get(SqlSession sqlSession, UserRole userRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + userRole + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineUserRole = sqlEngineFactory.getCheckedCrudEngine("GET_USER_ROLE");
    //sqlControl = getMoreResultClasses(userRole, sqlControl);
    UserRole userRoleGot = sqlGetEngineUserRole.get(sqlSession, UserRole.class, userRole, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get userRole result: " + userRoleGot);
    }
    return userRoleGot;
  }
  	
  public UserRole get(UserRole userRole, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), userRole, sqlControl);
  }
  
  public UserRole get(SqlSession sqlSession, UserRole userRole) {
    return get(sqlSession, userRole, null);
  }
  
  public UserRole get(UserRole userRole) {
    return get(userRole, null);
  }
  
  public int update(SqlSession sqlSession, UserRole userRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update userRole: " + userRole + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineUserRole = sqlEngineFactory.getCheckedCrudEngine("UPDATE_USER_ROLE");
    int count = sqlUpdateEngineUserRole.update(sqlSession, userRole, sqlControl);
    if (count > 0) {
    	userRole.setVersion(userRole.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("update userRole result count: " + count);
    }
    return count;
  }
  
  public int update(UserRole userRole, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), userRole, sqlControl);
  }
  
  public int update(SqlSession sqlSession, UserRole userRole) {
    return update(sqlSession, userRole, null);
  }
  
  public int update(UserRole userRole) {
    return update(userRole, null);
  }
  
  public int delete(SqlSession sqlSession, UserRole userRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete userRole: " + userRole + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineUserRole = sqlEngineFactory.getCheckedCrudEngine("DELETE_USER_ROLE");
    int count = sqlDeleteEngineUserRole.delete(sqlSession, userRole, sqlControl);
    if (count > 0) {
    	userRole.setVersion(userRole.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("delete userRole result count: " + count);
    }
    return count;
  }
  
  public int delete(UserRole userRole, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), userRole, sqlControl);
  }
  
  public int delete(SqlSession sqlSession, UserRole userRole) {
    return delete(sqlSession, userRole, null);
  }
  
  public int delete(UserRole userRole) {
    return delete(userRole, null);
  }
  
  public List<UserRole> list(SqlSession sqlSession, UserRole userRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list userRole: " + userRole + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineUserRole = sqlEngineFactory.getCheckedQueryEngine("SELECT_USER_ROLE");
    //sqlControl = getMoreResultClasses(userRole, sqlControl);
    List<UserRole> userRoleList = sqlEngineUserRole.query(sqlSession, UserRole.class, userRole, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list userRole size: " + ((userRoleList != null) ? userRoleList.size() : "null"));
    }
    return userRoleList;
  }
  
  public List<UserRole> list(UserRole userRole, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), userRole, sqlControl);
  }
  
  public List<UserRole> list(SqlSession sqlSession, UserRole userRole) {
    return list(sqlSession, userRole, null);
  }
  
  public List<UserRole> list(UserRole userRole) {
    return list(userRole, null);
  }
  
  public int count(SqlSession sqlSession, UserRole userRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("count userRole: " + userRole + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineUserRole = sqlEngineFactory.getCheckedQueryEngine("SELECT_USER_ROLE");
    //sqlControl = getMoreResultClasses(userRole, sqlControl);
    int count = sqlEngineUserRole.queryCount(sqlSession, userRole, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(UserRole userRole, SqlControl sqlControl) {
  	return count(sqlSessionFactory.getSqlSession(), userRole, sqlControl);
  }
  
  public int count(SqlSession sqlSession, UserRole userRole) {
    return count(sqlSession, userRole, null);
  }
  
  public int count(UserRole userRole) {
    return count(userRole, null);
  }
}
