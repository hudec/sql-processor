package org.sample.dao.auth;

import java.util.List;
import org.sample.model.auth.AuthRole;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

@SuppressWarnings("all")
public class AuthRoleDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public AuthRoleDao() {
  }
  
  public AuthRoleDao(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public AuthRoleDao(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public AuthRole insert(final SqlSession sqlSession, final AuthRole authRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert authRole: " + authRole + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertAuthRole = sqlEngineFactory.getCheckedCrudEngine("INSERT_AUTH_ROLE");
    int count = sqlInsertAuthRole.insert(sqlSession, authRole, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert authRole result: " + count + " " + authRole);
    }
    return (count > 0) ? authRole : null;
  }
  
  public AuthRole insert(final AuthRole authRole, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), authRole, sqlControl);
  }
  
  public AuthRole insert(final SqlSession sqlSession, final AuthRole authRole) {
    return insert(sqlSession, authRole, null);
  }
  
  public AuthRole insert(final AuthRole authRole) {
    return insert(authRole, null);
  }
  
  public AuthRole get(final SqlSession sqlSession, final AuthRole authRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + authRole + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineAuthRole = sqlEngineFactory.getCheckedCrudEngine("GET_AUTH_ROLE");
    //sqlControl = getMoreResultClasses(authRole, sqlControl);
    AuthRole authRoleGot = sqlGetEngineAuthRole.get(sqlSession, AuthRole.class, authRole, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get authRole result: " + authRoleGot);
    }
    return authRoleGot;
  }
  
  public AuthRole get(final AuthRole authRole, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), authRole, sqlControl);
  }
  
  public AuthRole get(final SqlSession sqlSession, final AuthRole authRole) {
    return get(sqlSession, authRole, null);
  }
  
  public AuthRole get(final AuthRole authRole) {
    return get(authRole, null);
  }
  
  public int update(final SqlSession sqlSession, final AuthRole authRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update authRole: " + authRole + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineAuthRole = sqlEngineFactory.getCheckedCrudEngine("UPDATE_AUTH_ROLE");
    int count = sqlUpdateEngineAuthRole.update(sqlSession, authRole, sqlControl);
    if (count > 0) {
    	authRole.setVersion(authRole.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update authRole result count: " + count);
    }
    return count;
  }
  
  public int update(final AuthRole authRole, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), authRole, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final AuthRole authRole) {
    return update(sqlSession, authRole, null);
  }
  
  public int update(final AuthRole authRole) {
    return update(authRole, null);
  }
  
  public int delete(final SqlSession sqlSession, final AuthRole authRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete authRole: " + authRole + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineAuthRole = sqlEngineFactory.getCheckedCrudEngine("DELETE_AUTH_ROLE");
    int count = sqlDeleteEngineAuthRole.delete(sqlSession, authRole, sqlControl);
    if (count > 0) {
    	authRole.setVersion(authRole.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete authRole result count: " + count);
    }
    return count;
  }
  
  public int delete(final AuthRole authRole, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), authRole, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final AuthRole authRole) {
    return delete(sqlSession, authRole, null);
  }
  
  public int delete(final AuthRole authRole) {
    return delete(authRole, null);
  }
  
  public List<AuthRole> list(final SqlSession sqlSession, final AuthRole authRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list authRole: " + authRole + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineAuthRole = sqlEngineFactory.getCheckedQueryEngine("SELECT_AUTH_ROLE");
    //sqlControl = getMoreResultClasses(authRole, sqlControl);
    List<AuthRole> authRoleList = sqlEngineAuthRole.query(sqlSession, AuthRole.class, authRole, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list authRole size: " + ((authRoleList != null) ? authRoleList.size() : "null"));
    }
    return authRoleList;
  }
  
  public List<AuthRole> list(final AuthRole authRole, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), authRole, sqlControl);
  }
  
  public List<AuthRole> list(final SqlSession sqlSession, final AuthRole authRole) {
    return list(sqlSession, authRole, null);
  }
  
  public List<AuthRole> list(final AuthRole authRole) {
    return list(authRole, null);
  }
  
  public int count(final SqlSession sqlSession, final AuthRole authRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count authRole: " + authRole + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineAuthRole = sqlEngineFactory.getCheckedQueryEngine("SELECT_AUTH_ROLE");
    //sqlControl = getMoreResultClasses(authRole, sqlControl);
    int count = sqlEngineAuthRole.queryCount(sqlSession, authRole, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final AuthRole authRole, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), authRole, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final AuthRole authRole) {
    return count(sqlSession, authRole, null);
  }
  
  public int count(final AuthRole authRole) {
    return count(authRole, null);
  }
}
