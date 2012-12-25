package org.sqlproc.sample.simple.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.sqlproc.sample.simple.model.NewBook;

public class NewBookDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  private SqlEngineFactory sqlEngineFactory;
  private SqlSessionFactory sqlSessionFactory;
    	
  public NewBookDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public NewBook insert(NewBook newBook, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert newBook: " + newBook + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertNewBook = sqlEngineFactory.getCrudEngine("INSERT_NEW_BOOK");
    int count = sqlInsertNewBook.insert(sqlSessionFactory.getSqlSession(), newBook);
    if (logger.isTraceEnabled()) {
      logger.trace("insert newBook result: " + count + " " + newBook);
    }
    return (count > 0) ? newBook : null;
  }
  
  public NewBook insert(NewBook newBook) {
    return insert(newBook, null);
  }
  
  public NewBook get(NewBook newBook, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + newBook + " " + sqlControl);
    }
    SqlCrudEngine sqlEngineNewBook = sqlEngineFactory.getCrudEngine("GET_NEW_BOOK");
    //sqlControl = getMoreResultClasses(newBook, sqlControl);
    NewBook newBookGot = sqlEngineNewBook.get(sqlSessionFactory.getSqlSession(), NewBook.class, newBook, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get newBook result: " + newBookGot);
    }
    return newBookGot;
  }
  	
  public NewBook get(NewBook newBook) {
    return get(newBook, null);
  }
  
  public int update(NewBook newBook, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update newBook: " + newBook + " " + sqlControl);
    }
    SqlCrudEngine sqlEngineNewBook = sqlEngineFactory.getCrudEngine("UPDATE_NEW_BOOK");
    int count = sqlEngineNewBook.update(sqlSessionFactory.getSqlSession(), newBook);
    if (logger.isTraceEnabled()) {
      logger.trace("update newBook result count: " + count);
    }
    return count;
  }
  
  public int update(NewBook newBook) {
    return update(newBook, null);
  }
  
  public int delete(NewBook newBook, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete newBook: " + newBook + " " + sqlControl);
    }
    SqlCrudEngine sqlEngineNewBook = sqlEngineFactory.getCrudEngine("DELETE_NEW_BOOK");
    int count = sqlEngineNewBook.delete(sqlSessionFactory.getSqlSession(), newBook);
    if (logger.isTraceEnabled()) {
      logger.trace("delete newBook result count: " + count);
    }
    return count;
  }
  
  public int delete(NewBook newBook) {
    return delete(newBook, null);
  }
  
  public List<NewBook> list(NewBook newBook, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list newBook: " + newBook + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineNewBook = sqlEngineFactory.getQueryEngine("SELECT_NEW_BOOK");
    //sqlControl = getMoreResultClasses(newBook, sqlControl);
    List<NewBook> newBookList = sqlEngineNewBook.query(sqlSessionFactory.getSqlSession(), NewBook.class, newBook, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list newBook size: " + ((newBookList != null) ? newBookList.size() : "null"));
    }
    return newBookList;
  }
  
  public List<NewBook> list(NewBook newBook) {
    return list(newBook, null);
  }
}
