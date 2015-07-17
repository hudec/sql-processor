package org.sample.dao.auth;

import java.util.List;
import org.sample.model.auth.AuthUser;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

@SuppressWarnings("all")
public class AuthUserDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public AuthUserDao() {
  }
  
  public AuthUserDao(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public AuthUserDao(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public AuthUser insert(final SqlSession sqlSession, final AuthUser authUser, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert authUser: " + authUser + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertAuthUser = sqlEngineFactory.getCheckedCrudEngine("INSERT_AUTH_USER");
    int count = sqlInsertAuthUser.insert(sqlSession, authUser, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert authUser result: " + count + " " + authUser);
    }
    return (count > 0) ? authUser : null;
  }
  
  public AuthUser insert(final AuthUser authUser, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), authUser, sqlControl);
  }
  
  public AuthUser insert(final SqlSession sqlSession, final AuthUser authUser) {
    return insert(sqlSession, authUser, null);
  }
  
  public AuthUser insert(final AuthUser authUser) {
    return insert(authUser, null);
  }
  
  public AuthUser get(final SqlSession sqlSession, final AuthUser authUser, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + authUser + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineAuthUser = sqlEngineFactory.getCheckedCrudEngine("GET_AUTH_USER");
    //sqlControl = getMoreResultClasses(authUser, sqlControl);
    AuthUser authUserGot = sqlGetEngineAuthUser.get(sqlSession, AuthUser.class, authUser, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get authUser result: " + authUserGot);
    }
    return authUserGot;
  }
  
  public AuthUser get(final AuthUser authUser, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), authUser, sqlControl);
  }
  
  public AuthUser get(final SqlSession sqlSession, final AuthUser authUser) {
    return get(sqlSession, authUser, null);
  }
  
  public AuthUser get(final AuthUser authUser) {
    return get(authUser, null);
  }
  
  public int update(final SqlSession sqlSession, final AuthUser authUser, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update authUser: " + authUser + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineAuthUser = sqlEngineFactory.getCheckedCrudEngine("UPDATE_AUTH_USER");
    int count = sqlUpdateEngineAuthUser.update(sqlSession, authUser, sqlControl);
    if (count > 0) {
    	authUser.setVersion(authUser.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update authUser result count: " + count);
    }
    return count;
  }
  
  public int update(final AuthUser authUser, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), authUser, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final AuthUser authUser) {
    return update(sqlSession, authUser, null);
  }
  
  public int update(final AuthUser authUser) {
    return update(authUser, null);
  }
  
  public int delete(final SqlSession sqlSession, final AuthUser authUser, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete authUser: " + authUser + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineAuthUser = sqlEngineFactory.getCheckedCrudEngine("DELETE_AUTH_USER");
    int count = sqlDeleteEngineAuthUser.delete(sqlSession, authUser, sqlControl);
    if (count > 0) {
    	authUser.setVersion(authUser.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete authUser result count: " + count);
    }
    return count;
  }
  
  public int delete(final AuthUser authUser, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), authUser, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final AuthUser authUser) {
    return delete(sqlSession, authUser, null);
  }
  
  public int delete(final AuthUser authUser) {
    return delete(authUser, null);
  }
  
  public List<AuthUser> list(final SqlSession sqlSession, final AuthUser authUser, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list authUser: " + authUser + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineAuthUser = sqlEngineFactory.getCheckedQueryEngine("SELECT_AUTH_USER");
    //sqlControl = getMoreResultClasses(authUser, sqlControl);
    List<AuthUser> authUserList = sqlEngineAuthUser.query(sqlSession, AuthUser.class, authUser, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list authUser size: " + ((authUserList != null) ? authUserList.size() : "null"));
    }
    return authUserList;
  }
  
  public List<AuthUser> list(final AuthUser authUser, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), authUser, sqlControl);
  }
  
  public List<AuthUser> list(final SqlSession sqlSession, final AuthUser authUser) {
    return list(sqlSession, authUser, null);
  }
  
  public List<AuthUser> list(final AuthUser authUser) {
    return list(authUser, null);
  }
  
  public int query(final SqlSession sqlSession, final AuthUser authUser, SqlControl sqlControl, final SqlRowProcessor<AuthUser> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query authUser: " + authUser + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineAuthUser = sqlEngineFactory.getCheckedQueryEngine("SELECT_AUTH_USER");
    //sqlControl = getMoreResultClasses(authUser, sqlControl);
    int rownums = sqlEngineAuthUser.query(sqlSession, AuthUser.class, authUser, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query authUser size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final AuthUser authUser, SqlControl sqlControl, final SqlRowProcessor<AuthUser> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), authUser, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final AuthUser authUser, final SqlRowProcessor<AuthUser> sqlRowProcessor) {
    return query(sqlSession, authUser, null, sqlRowProcessor);
  }
  
  public int query(final AuthUser authUser, final SqlRowProcessor<AuthUser> sqlRowProcessor) {
    return query(authUser, null, sqlRowProcessor);
  }
  
  public int count(final SqlSession sqlSession, final AuthUser authUser, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count authUser: " + authUser + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineAuthUser = sqlEngineFactory.getCheckedQueryEngine("SELECT_AUTH_USER");
    //sqlControl = getMoreResultClasses(authUser, sqlControl);
    int count = sqlEngineAuthUser.queryCount(sqlSession, authUser, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final AuthUser authUser, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), authUser, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final AuthUser authUser) {
    return count(sqlSession, authUser, null);
  }
  
  public int count(final AuthUser authUser) {
    return count(authUser, null);
  }
}
