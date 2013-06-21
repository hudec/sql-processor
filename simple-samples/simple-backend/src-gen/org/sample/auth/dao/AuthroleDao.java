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
import org.sample.auth.model.Authrole;

public class AuthroleDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public AuthroleDao(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public AuthroleDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Authrole insert(SqlSession sqlSession, Authrole authrole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert authrole: " + authrole + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertAuthrole = sqlEngineFactory.getCheckedCrudEngine("INSERT_AUTHROLE");
    int count = sqlInsertAuthrole.insert(sqlSession, authrole, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("insert authrole result: " + count + " " + authrole);
    }
    return (count > 0) ? authrole : null;
  }
  
  public Authrole insert(Authrole authrole, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), authrole, sqlControl);
  }
  
  public Authrole insert(SqlSession sqlSession, Authrole authrole) {
    return insert(sqlSession, authrole, null);
  }
  
  public Authrole insert(Authrole authrole) {
    return insert(authrole, null);
  }
  
  public Authrole get(SqlSession sqlSession, Authrole authrole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + authrole + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineAuthrole = sqlEngineFactory.getCheckedCrudEngine("GET_AUTHROLE");
    //sqlControl = getMoreResultClasses(authrole, sqlControl);
    Authrole authroleGot = sqlGetEngineAuthrole.get(sqlSession, Authrole.class, authrole, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get authrole result: " + authroleGot);
    }
    return authroleGot;
  }
  	
  public Authrole get(Authrole authrole, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), authrole, sqlControl);
  }
  
  public Authrole get(SqlSession sqlSession, Authrole authrole) {
    return get(sqlSession, authrole, null);
  }
  
  public Authrole get(Authrole authrole) {
    return get(authrole, null);
  }
  
  public int update(SqlSession sqlSession, Authrole authrole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update authrole: " + authrole + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineAuthrole = sqlEngineFactory.getCheckedCrudEngine("UPDATE_AUTHROLE");
    int count = sqlUpdateEngineAuthrole.update(sqlSession, authrole, sqlControl);
    if (count > 0) {
    	authrole.setVersion(authrole.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("update authrole result count: " + count);
    }
    return count;
  }
  
  public int update(Authrole authrole, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), authrole, sqlControl);
  }
  
  public int update(SqlSession sqlSession, Authrole authrole) {
    return update(sqlSession, authrole, null);
  }
  
  public int update(Authrole authrole) {
    return update(authrole, null);
  }
  
  public int delete(SqlSession sqlSession, Authrole authrole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete authrole: " + authrole + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineAuthrole = sqlEngineFactory.getCheckedCrudEngine("DELETE_AUTHROLE");
    int count = sqlDeleteEngineAuthrole.delete(sqlSession, authrole, sqlControl);
    if (count > 0) {
    	authrole.setVersion(authrole.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("delete authrole result count: " + count);
    }
    return count;
  }
  
  public int delete(Authrole authrole, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), authrole, sqlControl);
  }
  
  public int delete(SqlSession sqlSession, Authrole authrole) {
    return delete(sqlSession, authrole, null);
  }
  
  public int delete(Authrole authrole) {
    return delete(authrole, null);
  }
  
  public List<Authrole> list(SqlSession sqlSession, Authrole authrole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list authrole: " + authrole + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineAuthrole = sqlEngineFactory.getCheckedQueryEngine("SELECT_AUTHROLE");
    //sqlControl = getMoreResultClasses(authrole, sqlControl);
    List<Authrole> authroleList = sqlEngineAuthrole.query(sqlSession, Authrole.class, authrole, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list authrole size: " + ((authroleList != null) ? authroleList.size() : "null"));
    }
    return authroleList;
  }
  
  public List<Authrole> list(Authrole authrole, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), authrole, sqlControl);
  }
  
  public List<Authrole> list(SqlSession sqlSession, Authrole authrole) {
    return list(sqlSession, authrole, null);
  }
  
  public List<Authrole> list(Authrole authrole) {
    return list(authrole, null);
  }
  
  public int count(SqlSession sqlSession, Authrole authrole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("count authrole: " + authrole + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineAuthrole = sqlEngineFactory.getCheckedQueryEngine("SELECT_AUTHROLE");
    //sqlControl = getMoreResultClasses(authrole, sqlControl);
    int count = sqlEngineAuthrole.queryCount(sqlSession, authrole, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(Authrole authrole, SqlControl sqlControl) {
  	return count(sqlSessionFactory.getSqlSession(), authrole, sqlControl);
  }
  
  public int count(SqlSession sqlSession, Authrole authrole) {
    return count(sqlSession, authrole, null);
  }
  
  public int count(Authrole authrole) {
    return count(authrole, null);
  }
}
