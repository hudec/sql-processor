package org.sample.dao.auth;

import java.util.List;
import org.sample.model.auth.UserSession;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

@SuppressWarnings("all")
public class UserSessionDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public UserSessionDao() {
  }
  
  public UserSessionDao(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public UserSessionDao(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public UserSession insert(final SqlSession sqlSession, final UserSession userSession, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert userSession: " + userSession + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertUserSession = sqlEngineFactory.getCheckedCrudEngine("INSERT_USER_SESSION");
    int count = sqlInsertUserSession.insert(sqlSession, userSession, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert userSession result: " + count + " " + userSession);
    }
    return (count > 0) ? userSession : null;
  }
  
  public UserSession insert(final UserSession userSession, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), userSession, sqlControl);
  }
  
  public UserSession insert(final SqlSession sqlSession, final UserSession userSession) {
    return insert(sqlSession, userSession, null);
  }
  
  public UserSession insert(final UserSession userSession) {
    return insert(userSession, null);
  }
  
  public UserSession get(final SqlSession sqlSession, final UserSession userSession, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + userSession + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineUserSession = sqlEngineFactory.getCheckedCrudEngine("GET_USER_SESSION");
    //sqlControl = getMoreResultClasses(userSession, sqlControl);
    UserSession userSessionGot = sqlGetEngineUserSession.get(sqlSession, UserSession.class, userSession, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get userSession result: " + userSessionGot);
    }
    return userSessionGot;
  }
  
  public UserSession get(final UserSession userSession, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), userSession, sqlControl);
  }
  
  public UserSession get(final SqlSession sqlSession, final UserSession userSession) {
    return get(sqlSession, userSession, null);
  }
  
  public UserSession get(final UserSession userSession) {
    return get(userSession, null);
  }
  
  public int update(final SqlSession sqlSession, final UserSession userSession, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update userSession: " + userSession + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineUserSession = sqlEngineFactory.getCheckedCrudEngine("UPDATE_USER_SESSION");
    int count = sqlUpdateEngineUserSession.update(sqlSession, userSession, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update userSession result count: " + count);
    }
    return count;
  }
  
  public int update(final UserSession userSession, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), userSession, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final UserSession userSession) {
    return update(sqlSession, userSession, null);
  }
  
  public int update(final UserSession userSession) {
    return update(userSession, null);
  }
  
  public int delete(final SqlSession sqlSession, final UserSession userSession, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete userSession: " + userSession + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineUserSession = sqlEngineFactory.getCheckedCrudEngine("DELETE_USER_SESSION");
    int count = sqlDeleteEngineUserSession.delete(sqlSession, userSession, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete userSession result count: " + count);
    }
    return count;
  }
  
  public int delete(final UserSession userSession, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), userSession, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final UserSession userSession) {
    return delete(sqlSession, userSession, null);
  }
  
  public int delete(final UserSession userSession) {
    return delete(userSession, null);
  }
  
  public List<UserSession> list(final SqlSession sqlSession, final UserSession userSession, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list userSession: " + userSession + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineUserSession = sqlEngineFactory.getCheckedQueryEngine("SELECT_USER_SESSION");
    //sqlControl = getMoreResultClasses(userSession, sqlControl);
    List<UserSession> userSessionList = sqlEngineUserSession.query(sqlSession, UserSession.class, userSession, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list userSession size: " + ((userSessionList != null) ? userSessionList.size() : "null"));
    }
    return userSessionList;
  }
  
  public List<UserSession> list(final UserSession userSession, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), userSession, sqlControl);
  }
  
  public List<UserSession> list(final SqlSession sqlSession, final UserSession userSession) {
    return list(sqlSession, userSession, null);
  }
  
  public List<UserSession> list(final UserSession userSession) {
    return list(userSession, null);
  }
  
  public int query(final SqlSession sqlSession, final UserSession userSession, SqlControl sqlControl, final SqlRowProcessor<UserSession> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query userSession: " + userSession + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineUserSession = sqlEngineFactory.getCheckedQueryEngine("SELECT_USER_SESSION");
    //sqlControl = getMoreResultClasses(userSession, sqlControl);
    int rownums = sqlEngineUserSession.query(sqlSession, UserSession.class, userSession, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query userSession size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final UserSession userSession, SqlControl sqlControl, final SqlRowProcessor<UserSession> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), userSession, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final UserSession userSession, final SqlRowProcessor<UserSession> sqlRowProcessor) {
    return query(sqlSession, userSession, null, sqlRowProcessor);
  }
  
  public int query(final UserSession userSession, final SqlRowProcessor<UserSession> sqlRowProcessor) {
    return query(userSession, null, sqlRowProcessor);
  }
  
  public int count(final SqlSession sqlSession, final UserSession userSession, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count userSession: " + userSession + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineUserSession = sqlEngineFactory.getCheckedQueryEngine("SELECT_USER_SESSION");
    //sqlControl = getMoreResultClasses(userSession, sqlControl);
    int count = sqlEngineUserSession.queryCount(sqlSession, userSession, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final UserSession userSession, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), userSession, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final UserSession userSession) {
    return count(sqlSession, userSession, null);
  }
  
  public int count(final UserSession userSession) {
    return count(userSession, null);
  }
}
