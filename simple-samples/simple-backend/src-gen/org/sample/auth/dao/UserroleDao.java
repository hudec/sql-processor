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
import org.sample.auth.model.Userrole;

public class UserroleDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public UserroleDao(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public UserroleDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Userrole insert(SqlSession sqlSession, Userrole userrole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert userrole: " + userrole + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertUserrole = sqlEngineFactory.getCheckedCrudEngine("INSERT_USERROLE");
    int count = sqlInsertUserrole.insert(sqlSession, userrole, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("insert userrole result: " + count + " " + userrole);
    }
    return (count > 0) ? userrole : null;
  }
  
  public Userrole insert(Userrole userrole, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), userrole, sqlControl);
  }
  
  public Userrole insert(SqlSession sqlSession, Userrole userrole) {
    return insert(sqlSession, userrole, null);
  }
  
  public Userrole insert(Userrole userrole) {
    return insert(userrole, null);
  }
  
  public Userrole get(SqlSession sqlSession, Userrole userrole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + userrole + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineUserrole = sqlEngineFactory.getCheckedCrudEngine("GET_USERROLE");
    //sqlControl = getMoreResultClasses(userrole, sqlControl);
    Userrole userroleGot = sqlGetEngineUserrole.get(sqlSession, Userrole.class, userrole, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get userrole result: " + userroleGot);
    }
    return userroleGot;
  }
  	
  public Userrole get(Userrole userrole, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), userrole, sqlControl);
  }
  
  public Userrole get(SqlSession sqlSession, Userrole userrole) {
    return get(sqlSession, userrole, null);
  }
  
  public Userrole get(Userrole userrole) {
    return get(userrole, null);
  }
  
  public int update(SqlSession sqlSession, Userrole userrole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update userrole: " + userrole + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineUserrole = sqlEngineFactory.getCheckedCrudEngine("UPDATE_USERROLE");
    int count = sqlUpdateEngineUserrole.update(sqlSession, userrole, sqlControl);
    if (count > 0) {
    	userrole.setVersion(userrole.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("update userrole result count: " + count);
    }
    return count;
  }
  
  public int update(Userrole userrole, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), userrole, sqlControl);
  }
  
  public int update(SqlSession sqlSession, Userrole userrole) {
    return update(sqlSession, userrole, null);
  }
  
  public int update(Userrole userrole) {
    return update(userrole, null);
  }
  
  public int delete(SqlSession sqlSession, Userrole userrole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete userrole: " + userrole + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineUserrole = sqlEngineFactory.getCheckedCrudEngine("DELETE_USERROLE");
    int count = sqlDeleteEngineUserrole.delete(sqlSession, userrole, sqlControl);
    if (count > 0) {
    	userrole.setVersion(userrole.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("delete userrole result count: " + count);
    }
    return count;
  }
  
  public int delete(Userrole userrole, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), userrole, sqlControl);
  }
  
  public int delete(SqlSession sqlSession, Userrole userrole) {
    return delete(sqlSession, userrole, null);
  }
  
  public int delete(Userrole userrole) {
    return delete(userrole, null);
  }
  
  public List<Userrole> list(SqlSession sqlSession, Userrole userrole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list userrole: " + userrole + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineUserrole = sqlEngineFactory.getCheckedQueryEngine("SELECT_USERROLE");
    //sqlControl = getMoreResultClasses(userrole, sqlControl);
    List<Userrole> userroleList = sqlEngineUserrole.query(sqlSession, Userrole.class, userrole, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list userrole size: " + ((userroleList != null) ? userroleList.size() : "null"));
    }
    return userroleList;
  }
  
  public List<Userrole> list(Userrole userrole, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), userrole, sqlControl);
  }
  
  public List<Userrole> list(SqlSession sqlSession, Userrole userrole) {
    return list(sqlSession, userrole, null);
  }
  
  public List<Userrole> list(Userrole userrole) {
    return list(userrole, null);
  }
  
  public int count(SqlSession sqlSession, Userrole userrole, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("count userrole: " + userrole + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineUserrole = sqlEngineFactory.getCheckedQueryEngine("SELECT_USERROLE");
    //sqlControl = getMoreResultClasses(userrole, sqlControl);
    int count = sqlEngineUserrole.queryCount(sqlSession, userrole, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(Userrole userrole, SqlControl sqlControl) {
  	return count(sqlSessionFactory.getSqlSession(), userrole, sqlControl);
  }
  
  public int count(SqlSession sqlSession, Userrole userrole) {
    return count(sqlSession, userrole, null);
  }
  
  public int count(Userrole userrole) {
    return count(userrole, null);
  }
}
