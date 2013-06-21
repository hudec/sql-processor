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
import org.sample.auth.model.Session;

public class SessionDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public SessionDao(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public SessionDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Session insert(SqlSession sqlSession, Session session, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert session: " + session + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertSession = sqlEngineFactory.getCheckedCrudEngine("INSERT_SESSION");
    int count = sqlInsertSession.insert(sqlSession, session, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("insert session result: " + count + " " + session);
    }
    return (count > 0) ? session : null;
  }
  
  public Session insert(Session session, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), session, sqlControl);
  }
  
  public Session insert(SqlSession sqlSession, Session session) {
    return insert(sqlSession, session, null);
  }
  
  public Session insert(Session session) {
    return insert(session, null);
  }
  
  public Session get(SqlSession sqlSession, Session session, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + session + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineSession = sqlEngineFactory.getCheckedCrudEngine("GET_SESSION");
    //sqlControl = getMoreResultClasses(session, sqlControl);
    Session sessionGot = sqlGetEngineSession.get(sqlSession, Session.class, session, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get session result: " + sessionGot);
    }
    return sessionGot;
  }
  	
  public Session get(Session session, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), session, sqlControl);
  }
  
  public Session get(SqlSession sqlSession, Session session) {
    return get(sqlSession, session, null);
  }
  
  public Session get(Session session) {
    return get(session, null);
  }
  
  public int update(SqlSession sqlSession, Session session, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update session: " + session + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineSession = sqlEngineFactory.getCheckedCrudEngine("UPDATE_SESSION");
    int count = sqlUpdateEngineSession.update(sqlSession, session, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("update session result count: " + count);
    }
    return count;
  }
  
  public int update(Session session, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), session, sqlControl);
  }
  
  public int update(SqlSession sqlSession, Session session) {
    return update(sqlSession, session, null);
  }
  
  public int update(Session session) {
    return update(session, null);
  }
  
  public int delete(SqlSession sqlSession, Session session, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete session: " + session + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineSession = sqlEngineFactory.getCheckedCrudEngine("DELETE_SESSION");
    int count = sqlDeleteEngineSession.delete(sqlSession, session, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("delete session result count: " + count);
    }
    return count;
  }
  
  public int delete(Session session, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), session, sqlControl);
  }
  
  public int delete(SqlSession sqlSession, Session session) {
    return delete(sqlSession, session, null);
  }
  
  public int delete(Session session) {
    return delete(session, null);
  }
  
  public List<Session> list(SqlSession sqlSession, Session session, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list session: " + session + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineSession = sqlEngineFactory.getCheckedQueryEngine("SELECT_SESSION");
    //sqlControl = getMoreResultClasses(session, sqlControl);
    List<Session> sessionList = sqlEngineSession.query(sqlSession, Session.class, session, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list session size: " + ((sessionList != null) ? sessionList.size() : "null"));
    }
    return sessionList;
  }
  
  public List<Session> list(Session session, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), session, sqlControl);
  }
  
  public List<Session> list(SqlSession sqlSession, Session session) {
    return list(sqlSession, session, null);
  }
  
  public List<Session> list(Session session) {
    return list(session, null);
  }
  
  public int count(SqlSession sqlSession, Session session, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("count session: " + session + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineSession = sqlEngineFactory.getCheckedQueryEngine("SELECT_SESSION");
    //sqlControl = getMoreResultClasses(session, sqlControl);
    int count = sqlEngineSession.queryCount(sqlSession, session, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(Session session, SqlControl sqlControl) {
  	return count(sqlSessionFactory.getSqlSession(), session, sqlControl);
  }
  
  public int count(SqlSession sqlSession, Session session) {
    return count(sqlSession, session, null);
  }
  
  public int count(Session session) {
    return count(session, null);
  }
}
