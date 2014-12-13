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
import org.sample.model.auth.AuthRole;

public class AuthRoleDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public AuthRoleDao() {
  }
    	
  public AuthRoleDao(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public AuthRoleDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public AuthRole insert(SqlSession sqlSession, AuthRole authRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert authRole: " + authRole + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertAuthRole = sqlEngineFactory.getCheckedCrudEngine("INSERT_AUTH_ROLE");
    int count = sqlInsertAuthRole.insert(sqlSession, authRole, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("insert authRole result: " + count + " " + authRole);
    }
    return (count > 0) ? authRole : null;
  }
  
  public AuthRole insert(AuthRole authRole, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), authRole, sqlControl);
  }
  
  public AuthRole insert(SqlSession sqlSession, AuthRole authRole) {
    return insert(sqlSession, authRole, null);
  }
  
  public AuthRole insert(AuthRole authRole) {
    return insert(authRole, null);
  }
  
  public AuthRole get(SqlSession sqlSession, AuthRole authRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + authRole + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineAuthRole = sqlEngineFactory.getCheckedCrudEngine("GET_AUTH_ROLE");
    //sqlControl = getMoreResultClasses(authRole, sqlControl);
    AuthRole authRoleGot = sqlGetEngineAuthRole.get(sqlSession, AuthRole.class, authRole, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get authRole result: " + authRoleGot);
    }
    return authRoleGot;
  }
  	
  public AuthRole get(AuthRole authRole, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), authRole, sqlControl);
  }
  
  public AuthRole get(SqlSession sqlSession, AuthRole authRole) {
    return get(sqlSession, authRole, null);
  }
  
  public AuthRole get(AuthRole authRole) {
    return get(authRole, null);
  }
  
  public int update(SqlSession sqlSession, AuthRole authRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update authRole: " + authRole + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineAuthRole = sqlEngineFactory.getCheckedCrudEngine("UPDATE_AUTH_ROLE");
    int count = sqlUpdateEngineAuthRole.update(sqlSession, authRole, sqlControl);
    if (count > 0) {
    	authRole.setVersion(authRole.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("update authRole result count: " + count);
    }
    return count;
  }
  
  public int update(AuthRole authRole, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), authRole, sqlControl);
  }
  
  public int update(SqlSession sqlSession, AuthRole authRole) {
    return update(sqlSession, authRole, null);
  }
  
  public int update(AuthRole authRole) {
    return update(authRole, null);
  }
  
  public int delete(SqlSession sqlSession, AuthRole authRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete authRole: " + authRole + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineAuthRole = sqlEngineFactory.getCheckedCrudEngine("DELETE_AUTH_ROLE");
    int count = sqlDeleteEngineAuthRole.delete(sqlSession, authRole, sqlControl);
    if (count > 0) {
    	authRole.setVersion(authRole.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("delete authRole result count: " + count);
    }
    return count;
  }
  
  public int delete(AuthRole authRole, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), authRole, sqlControl);
  }
  
  public int delete(SqlSession sqlSession, AuthRole authRole) {
    return delete(sqlSession, authRole, null);
  }
  
  public int delete(AuthRole authRole) {
    return delete(authRole, null);
  }
  
  public List<AuthRole> list(SqlSession sqlSession, AuthRole authRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list authRole: " + authRole + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineAuthRole = sqlEngineFactory.getCheckedQueryEngine("SELECT_AUTH_ROLE");
    //sqlControl = getMoreResultClasses(authRole, sqlControl);
    List<AuthRole> authRoleList = sqlEngineAuthRole.query(sqlSession, AuthRole.class, authRole, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list authRole size: " + ((authRoleList != null) ? authRoleList.size() : "null"));
    }
    return authRoleList;
  }
  
  public List<AuthRole> list(AuthRole authRole, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), authRole, sqlControl);
  }
  
  public List<AuthRole> list(SqlSession sqlSession, AuthRole authRole) {
    return list(sqlSession, authRole, null);
  }
  
  public List<AuthRole> list(AuthRole authRole) {
    return list(authRole, null);
  }
  
  public int count(SqlSession sqlSession, AuthRole authRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("count authRole: " + authRole + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineAuthRole = sqlEngineFactory.getCheckedQueryEngine("SELECT_AUTH_ROLE");
    //sqlControl = getMoreResultClasses(authRole, sqlControl);
    int count = sqlEngineAuthRole.queryCount(sqlSession, authRole, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(AuthRole authRole, SqlControl sqlControl) {
  	return count(sqlSessionFactory.getSqlSession(), authRole, sqlControl);
  }
  
  public int count(SqlSession sqlSession, AuthRole authRole) {
    return count(sqlSession, authRole, null);
  }
  
  public int count(AuthRole authRole) {
    return count(authRole, null);
  }
}
