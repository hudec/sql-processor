package org.sqlproc.sample.simple.dao.impl;

import org.sqlproc.sample.simple.dao.NewBookDao;
  
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
import org.sqlproc.sample.simple.model.NewBook;

public class NewBookDaoImpl extends BaseDaoImpl implements BaseDao, NewBookDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public NewBookDaoImpl() {
  }
    	
  public NewBookDaoImpl(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public NewBookDaoImpl(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public NewBook insert(SqlSession sqlSession, NewBook newBook, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert newBook: " + newBook + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertNewBook = sqlEngineFactory.getCheckedCrudEngine("INSERT_NEW_BOOK");
    SqlCrudEngine sqlInsertMedia = sqlEngineFactory.getCheckedCrudEngine("INSERT_MEDIA");
    int count = sqlInsertMedia.insert(sqlSession, newBook, sqlControl);
    if (count > 0) {
      sqlInsertNewBook.insert(sqlSession, newBook, sqlControl);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("insert newBook result: " + count + " " + newBook);
    }
    return (count > 0) ? newBook : null;
  }
  
  public NewBook insert(NewBook newBook, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), newBook, sqlControl);
  }
  
  public NewBook insert(SqlSession sqlSession, NewBook newBook) {
    return insert(sqlSession, newBook, null);
  }
  
  public NewBook insert(NewBook newBook) {
    return insert(newBook, null);
  }
  
  public NewBook get(SqlSession sqlSession, NewBook newBook, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + newBook + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineNewBook = sqlEngineFactory.getCheckedCrudEngine("GET_NEW_BOOK");
    //sqlControl = getMoreResultClasses(newBook, sqlControl);
    NewBook newBookGot = sqlGetEngineNewBook.get(sqlSession, NewBook.class, newBook, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get newBook result: " + newBookGot);
    }
    return newBookGot;
  }
  	
  public NewBook get(NewBook newBook, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), newBook, sqlControl);
  }
  
  public NewBook get(SqlSession sqlSession, NewBook newBook) {
    return get(sqlSession, newBook, null);
  }
  
  public NewBook get(NewBook newBook) {
    return get(newBook, null);
  }
  
  public int update(SqlSession sqlSession, NewBook newBook, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update newBook: " + newBook + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineNewBook = sqlEngineFactory.getCheckedCrudEngine("UPDATE_NEW_BOOK");
    SqlCrudEngine sqlUpdateMedia = sqlEngineFactory.getCheckedCrudEngine("UPDATE_MEDIA");
    int count = sqlUpdateEngineNewBook.update(sqlSession, newBook, sqlControl);
    if (count > 0) {
    	sqlUpdateMedia.update(sqlSession, newBook, sqlControl);
    }
    if (count > 0) {
    	newBook.setVersion(newBook.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("update newBook result count: " + count);
    }
    return count;
  }
  
  public int update(NewBook newBook, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), newBook, sqlControl);
  }
  
  public int update(SqlSession sqlSession, NewBook newBook) {
    return update(sqlSession, newBook, null);
  }
  
  public int update(NewBook newBook) {
    return update(newBook, null);
  }
  
  public int delete(SqlSession sqlSession, NewBook newBook, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete newBook: " + newBook + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineNewBook = sqlEngineFactory.getCheckedCrudEngine("DELETE_NEW_BOOK");
    SqlCrudEngine sqlDeleteMedia = sqlEngineFactory.getCheckedCrudEngine("DELETE_MEDIA");
    int count = sqlDeleteEngineNewBook.delete(sqlSession, newBook, sqlControl);
    if (count > 0) {
    	sqlDeleteMedia.delete(sqlSession, newBook, sqlControl);
    }
    if (count > 0) {
    	newBook.setVersion(newBook.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("delete newBook result count: " + count);
    }
    return count;
  }
  
  public int delete(NewBook newBook, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), newBook, sqlControl);
  }
  
  public int delete(SqlSession sqlSession, NewBook newBook) {
    return delete(sqlSession, newBook, null);
  }
  
  public int delete(NewBook newBook) {
    return delete(newBook, null);
  }
  
  public List<NewBook> list(SqlSession sqlSession, NewBook newBook, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list newBook: " + newBook + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineNewBook = sqlEngineFactory.getCheckedQueryEngine("SELECT_NEW_BOOK");
    //sqlControl = getMoreResultClasses(newBook, sqlControl);
    List<NewBook> newBookList = sqlEngineNewBook.query(sqlSession, NewBook.class, newBook, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list newBook size: " + ((newBookList != null) ? newBookList.size() : "null"));
    }
    return newBookList;
  }
  
  public List<NewBook> list(NewBook newBook, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), newBook, sqlControl);
  }
  
  public List<NewBook> list(SqlSession sqlSession, NewBook newBook) {
    return list(sqlSession, newBook, null);
  }
  
  public List<NewBook> list(NewBook newBook) {
    return list(newBook, null);
  }
  
  public int count(SqlSession sqlSession, NewBook newBook, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("count newBook: " + newBook + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineNewBook = sqlEngineFactory.getCheckedQueryEngine("SELECT_NEW_BOOK");
    //sqlControl = getMoreResultClasses(newBook, sqlControl);
    int count = sqlEngineNewBook.queryCount(sqlSession, newBook, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(NewBook newBook, SqlControl sqlControl) {
  	return count(sqlSessionFactory.getSqlSession(), newBook, sqlControl);
  }
  
  public int count(SqlSession sqlSession, NewBook newBook) {
    return count(sqlSession, newBook, null);
  }
  
  public int count(NewBook newBook) {
    return count(newBook, null);
  }
}
