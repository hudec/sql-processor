package org.sqlproc.sample.simple.dao.impl;

import java.util.List;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.sample.simple.dao.LibraryDao;
import org.sqlproc.sample.simple.model.Library;

@SuppressWarnings("all")
public class LibraryDaoImpl implements LibraryDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public LibraryDaoImpl() {
  }
  
  public LibraryDaoImpl(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public LibraryDaoImpl(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public Library insert(final SqlSession sqlSession, final Library library, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert library: " + library + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertLibrary = sqlEngineFactory.getCheckedCrudEngine("INSERT_LIBRARY");
    int count = sqlInsertLibrary.insert(sqlSession, library, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert library result: " + count + " " + library);
    }
    return (count > 0) ? library : null;
  }
  
  public Library insert(final Library library, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), library, sqlControl);
  }
  
  public Library insert(final SqlSession sqlSession, final Library library) {
    return insert(sqlSession, library, null);
  }
  
  public Library insert(final Library library) {
    return insert(library, null);
  }
  
  public Library get(final SqlSession sqlSession, final Library library, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + library + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineLibrary = sqlEngineFactory.getCheckedCrudEngine("GET_LIBRARY");
    //sqlControl = getMoreResultClasses(library, sqlControl);
    Library libraryGot = sqlGetEngineLibrary.get(sqlSession, Library.class, library, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get library result: " + libraryGot);
    }
    return libraryGot;
  }
  
  public Library get(final Library library, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), library, sqlControl);
  }
  
  public Library get(final SqlSession sqlSession, final Library library) {
    return get(sqlSession, library, null);
  }
  
  public Library get(final Library library) {
    return get(library, null);
  }
  
  public int update(final SqlSession sqlSession, final Library library, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update library: " + library + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineLibrary = sqlEngineFactory.getCheckedCrudEngine("UPDATE_LIBRARY");
    int count = sqlUpdateEngineLibrary.update(sqlSession, library, sqlControl);
    if (count > 0) {
    	library.setVersion(library.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update library result count: " + count);
    }
    return count;
  }
  
  public int update(final Library library, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), library, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final Library library) {
    return update(sqlSession, library, null);
  }
  
  public int update(final Library library) {
    return update(library, null);
  }
  
  public int delete(final SqlSession sqlSession, final Library library, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete library: " + library + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineLibrary = sqlEngineFactory.getCheckedCrudEngine("DELETE_LIBRARY");
    int count = sqlDeleteEngineLibrary.delete(sqlSession, library, sqlControl);
    if (count > 0) {
    	library.setVersion(library.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete library result count: " + count);
    }
    return count;
  }
  
  public int delete(final Library library, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), library, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final Library library) {
    return delete(sqlSession, library, null);
  }
  
  public int delete(final Library library) {
    return delete(library, null);
  }
  
  public List<Library> list(final SqlSession sqlSession, final Library library, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list library: " + library + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineLibrary = sqlEngineFactory.getCheckedQueryEngine("SELECT_LIBRARY");
    //sqlControl = getMoreResultClasses(library, sqlControl);
    List<Library> libraryList = sqlEngineLibrary.query(sqlSession, Library.class, library, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list library size: " + ((libraryList != null) ? libraryList.size() : "null"));
    }
    return libraryList;
  }
  
  public List<Library> list(final Library library, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), library, sqlControl);
  }
  
  public List<Library> list(final SqlSession sqlSession, final Library library) {
    return list(sqlSession, library, null);
  }
  
  public List<Library> list(final Library library) {
    return list(library, null);
  }
  
  public int count(final SqlSession sqlSession, final Library library, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count library: " + library + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineLibrary = sqlEngineFactory.getCheckedQueryEngine("SELECT_LIBRARY");
    //sqlControl = getMoreResultClasses(library, sqlControl);
    int count = sqlEngineLibrary.queryCount(sqlSession, library, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final Library library, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), library, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final Library library) {
    return count(sqlSession, library, null);
  }
  
  public int count(final Library library) {
    return count(library, null);
  }
}
