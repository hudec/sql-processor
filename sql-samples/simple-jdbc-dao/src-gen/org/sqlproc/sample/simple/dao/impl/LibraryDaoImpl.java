package org.sqlproc.sample.simple.dao.impl;

import org.sqlproc.sample.simple.dao.LibraryDao;
  
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.dao.impl.BaseDaoImpl;

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
import org.sqlproc.sample.simple.model.Library;

public class LibraryDaoImpl extends BaseDaoImpl implements BaseDao, LibraryDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public LibraryDaoImpl(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public LibraryDaoImpl(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Library insert(SqlSession sqlSession, Library library, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert library: " + library + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertLibrary = sqlEngineFactory.getCheckedCrudEngine("INSERT_LIBRARY");
    int count = sqlInsertLibrary.insert(sqlSession, library, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("insert library result: " + count + " " + library);
    }
    return (count > 0) ? library : null;
  }
  
  public Library insert(Library library, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), library, sqlControl);
  }
  
  public Library insert(SqlSession sqlSession, Library library) {
    return insert(sqlSession, library, null);
  }
  
  public Library insert(Library library) {
    return insert(library, null);
  }
  
  public Library get(SqlSession sqlSession, Library library, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + library + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineLibrary = sqlEngineFactory.getCheckedCrudEngine("GET_LIBRARY");
    //sqlControl = getMoreResultClasses(library, sqlControl);
    Library libraryGot = sqlGetEngineLibrary.get(sqlSession, Library.class, library, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get library result: " + libraryGot);
    }
    return libraryGot;
  }
  	
  public Library get(Library library, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), library, sqlControl);
  }
  
  public Library get(SqlSession sqlSession, Library library) {
    return get(sqlSession, library, null);
  }
  
  public Library get(Library library) {
    return get(library, null);
  }
  
  public int update(SqlSession sqlSession, Library library, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update library: " + library + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineLibrary = sqlEngineFactory.getCheckedCrudEngine("UPDATE_LIBRARY");
    int count = sqlUpdateEngineLibrary.update(sqlSession, library, sqlControl);
    if (count > 0) {
    	library.setVersion(library.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("update library result count: " + count);
    }
    return count;
  }
  
  public int update(Library library, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), library, sqlControl);
  }
  
  public int update(SqlSession sqlSession, Library library) {
    return update(sqlSession, library, null);
  }
  
  public int update(Library library) {
    return update(library, null);
  }
  
  public int delete(SqlSession sqlSession, Library library, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete library: " + library + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineLibrary = sqlEngineFactory.getCheckedCrudEngine("DELETE_LIBRARY");
    int count = sqlDeleteEngineLibrary.delete(sqlSession, library, sqlControl);
    if (count > 0) {
    	library.setVersion(library.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("delete library result count: " + count);
    }
    return count;
  }
  
  public int delete(Library library, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), library, sqlControl);
  }
  
  public int delete(SqlSession sqlSession, Library library) {
    return delete(sqlSession, library, null);
  }
  
  public int delete(Library library) {
    return delete(library, null);
  }
  
  public List<Library> list(SqlSession sqlSession, Library library, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list library: " + library + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineLibrary = sqlEngineFactory.getCheckedQueryEngine("SELECT_LIBRARY");
    //sqlControl = getMoreResultClasses(library, sqlControl);
    List<Library> libraryList = sqlEngineLibrary.query(sqlSession, Library.class, library, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list library size: " + ((libraryList != null) ? libraryList.size() : "null"));
    }
    return libraryList;
  }
  
  public List<Library> list(Library library, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), library, sqlControl);
  }
  
  public List<Library> list(SqlSession sqlSession, Library library) {
    return list(sqlSession, library, null);
  }
  
  public List<Library> list(Library library) {
    return list(library, null);
  }
  
  public int count(SqlSession sqlSession, Library library, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("count library: " + library + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineLibrary = sqlEngineFactory.getCheckedQueryEngine("SELECT_LIBRARY");
    //sqlControl = getMoreResultClasses(library, sqlControl);
    int count = sqlEngineLibrary.queryCount(sqlSession, library, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(Library library, SqlControl sqlControl) {
  	return count(sqlSessionFactory.getSqlSession(), library, sqlControl);
  }
  
  public int count(SqlSession sqlSession, Library library) {
    return count(sqlSession, library, null);
  }
  
  public int count(Library library) {
    return count(library, null);
  }
}
