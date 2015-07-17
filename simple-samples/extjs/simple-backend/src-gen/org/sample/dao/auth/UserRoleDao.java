package org.sample.dao.auth;

import java.util.List;
import org.sample.model.auth.UserRole;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

@SuppressWarnings("all")
public class UserRoleDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public UserRoleDao() {
  }
  
  public UserRoleDao(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public UserRoleDao(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public UserRole insert(final SqlSession sqlSession, final UserRole userRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert userRole: " + userRole + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertUserRole = sqlEngineFactory.getCheckedCrudEngine("INSERT_USER_ROLE");
    int count = sqlInsertUserRole.insert(sqlSession, userRole, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert userRole result: " + count + " " + userRole);
    }
    return (count > 0) ? userRole : null;
  }
  
  public UserRole insert(final UserRole userRole, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), userRole, sqlControl);
  }
  
  public UserRole insert(final SqlSession sqlSession, final UserRole userRole) {
    return insert(sqlSession, userRole, null);
  }
  
  public UserRole insert(final UserRole userRole) {
    return insert(userRole, null);
  }
  
  public UserRole get(final SqlSession sqlSession, final UserRole userRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + userRole + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineUserRole = sqlEngineFactory.getCheckedCrudEngine("GET_USER_ROLE");
    //sqlControl = getMoreResultClasses(userRole, sqlControl);
    UserRole userRoleGot = sqlGetEngineUserRole.get(sqlSession, UserRole.class, userRole, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get userRole result: " + userRoleGot);
    }
    return userRoleGot;
  }
  
  public UserRole get(final UserRole userRole, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), userRole, sqlControl);
  }
  
  public UserRole get(final SqlSession sqlSession, final UserRole userRole) {
    return get(sqlSession, userRole, null);
  }
  
  public UserRole get(final UserRole userRole) {
    return get(userRole, null);
  }
  
  public int update(final SqlSession sqlSession, final UserRole userRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update userRole: " + userRole + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineUserRole = sqlEngineFactory.getCheckedCrudEngine("UPDATE_USER_ROLE");
    int count = sqlUpdateEngineUserRole.update(sqlSession, userRole, sqlControl);
    if (count > 0) {
    	userRole.setVersion(userRole.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update userRole result count: " + count);
    }
    return count;
  }
  
  public int update(final UserRole userRole, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), userRole, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final UserRole userRole) {
    return update(sqlSession, userRole, null);
  }
  
  public int update(final UserRole userRole) {
    return update(userRole, null);
  }
  
  public int delete(final SqlSession sqlSession, final UserRole userRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete userRole: " + userRole + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineUserRole = sqlEngineFactory.getCheckedCrudEngine("DELETE_USER_ROLE");
    int count = sqlDeleteEngineUserRole.delete(sqlSession, userRole, sqlControl);
    if (count > 0) {
    	userRole.setVersion(userRole.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete userRole result count: " + count);
    }
    return count;
  }
  
  public int delete(final UserRole userRole, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), userRole, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final UserRole userRole) {
    return delete(sqlSession, userRole, null);
  }
  
  public int delete(final UserRole userRole) {
    return delete(userRole, null);
  }
  
  public List<UserRole> list(final SqlSession sqlSession, final UserRole userRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list userRole: " + userRole + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineUserRole = sqlEngineFactory.getCheckedQueryEngine("SELECT_USER_ROLE");
    //sqlControl = getMoreResultClasses(userRole, sqlControl);
    List<UserRole> userRoleList = sqlEngineUserRole.query(sqlSession, UserRole.class, userRole, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list userRole size: " + ((userRoleList != null) ? userRoleList.size() : "null"));
    }
    return userRoleList;
  }
  
  public List<UserRole> list(final UserRole userRole, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), userRole, sqlControl);
  }
  
  public List<UserRole> list(final SqlSession sqlSession, final UserRole userRole) {
    return list(sqlSession, userRole, null);
  }
  
  public List<UserRole> list(final UserRole userRole) {
    return list(userRole, null);
  }
  
  public int query(final SqlSession sqlSession, final UserRole userRole, SqlControl sqlControl, final SqlRowProcessor<UserRole> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query userRole: " + userRole + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineUserRole = sqlEngineFactory.getCheckedQueryEngine("SELECT_USER_ROLE");
    //sqlControl = getMoreResultClasses(userRole, sqlControl);
    int rownums = sqlEngineUserRole.query(sqlSession, UserRole.class, userRole, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query userRole size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final UserRole userRole, SqlControl sqlControl, final SqlRowProcessor<UserRole> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), userRole, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final UserRole userRole, final SqlRowProcessor<UserRole> sqlRowProcessor) {
    return query(sqlSession, userRole, null, sqlRowProcessor);
  }
  
  public int query(final UserRole userRole, final SqlRowProcessor<UserRole> sqlRowProcessor) {
    return query(userRole, null, sqlRowProcessor);
  }
  
  public int count(final SqlSession sqlSession, final UserRole userRole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count userRole: " + userRole + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineUserRole = sqlEngineFactory.getCheckedQueryEngine("SELECT_USER_ROLE");
    //sqlControl = getMoreResultClasses(userRole, sqlControl);
    int count = sqlEngineUserRole.queryCount(sqlSession, userRole, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final UserRole userRole, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), userRole, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final UserRole userRole) {
    return count(sqlSession, userRole, null);
  }
  
  public int count(final UserRole userRole) {
    return count(userRole, null);
  }
}
