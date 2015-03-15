package org.sample.dao.person;

import java.util.List;
import org.sample.model.person.Relative;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

@SuppressWarnings("all")
public class RelativeDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public RelativeDao() {
  }
  
  public RelativeDao(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public RelativeDao(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public Relative insert(final SqlSession sqlSession, final Relative relative, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert relative: " + relative + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertRelative = sqlEngineFactory.getCheckedCrudEngine("INSERT_RELATIVE");
    int count = sqlInsertRelative.insert(sqlSession, relative, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert relative result: " + count + " " + relative);
    }
    return (count > 0) ? relative : null;
  }
  
  public Relative insert(final Relative relative, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), relative, sqlControl);
  }
  
  public Relative insert(final SqlSession sqlSession, final Relative relative) {
    return insert(sqlSession, relative, null);
  }
  
  public Relative insert(final Relative relative) {
    return insert(relative, null);
  }
  
  public Relative get(final SqlSession sqlSession, final Relative relative, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + relative + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineRelative = sqlEngineFactory.getCheckedCrudEngine("GET_RELATIVE");
    //sqlControl = getMoreResultClasses(relative, sqlControl);
    Relative relativeGot = sqlGetEngineRelative.get(sqlSession, Relative.class, relative, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get relative result: " + relativeGot);
    }
    return relativeGot;
  }
  
  public Relative get(final Relative relative, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), relative, sqlControl);
  }
  
  public Relative get(final SqlSession sqlSession, final Relative relative) {
    return get(sqlSession, relative, null);
  }
  
  public Relative get(final Relative relative) {
    return get(relative, null);
  }
  
  public int update(final SqlSession sqlSession, final Relative relative, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update relative: " + relative + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineRelative = sqlEngineFactory.getCheckedCrudEngine("UPDATE_RELATIVE");
    int count = sqlUpdateEngineRelative.update(sqlSession, relative, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update relative result count: " + count);
    }
    return count;
  }
  
  public int update(final Relative relative, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), relative, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final Relative relative) {
    return update(sqlSession, relative, null);
  }
  
  public int update(final Relative relative) {
    return update(relative, null);
  }
  
  public int delete(final SqlSession sqlSession, final Relative relative, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete relative: " + relative + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineRelative = sqlEngineFactory.getCheckedCrudEngine("DELETE_RELATIVE");
    int count = sqlDeleteEngineRelative.delete(sqlSession, relative, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete relative result count: " + count);
    }
    return count;
  }
  
  public int delete(final Relative relative, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), relative, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final Relative relative) {
    return delete(sqlSession, relative, null);
  }
  
  public int delete(final Relative relative) {
    return delete(relative, null);
  }
  
  public List<Relative> list(final SqlSession sqlSession, final Relative relative, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list relative: " + relative + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineRelative = sqlEngineFactory.getCheckedQueryEngine("SELECT_RELATIVE");
    //sqlControl = getMoreResultClasses(relative, sqlControl);
    List<Relative> relativeList = sqlEngineRelative.query(sqlSession, Relative.class, relative, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list relative size: " + ((relativeList != null) ? relativeList.size() : "null"));
    }
    return relativeList;
  }
  
  public List<Relative> list(final Relative relative, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), relative, sqlControl);
  }
  
  public List<Relative> list(final SqlSession sqlSession, final Relative relative) {
    return list(sqlSession, relative, null);
  }
  
  public List<Relative> list(final Relative relative) {
    return list(relative, null);
  }
  
  public int count(final SqlSession sqlSession, final Relative relative, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count relative: " + relative + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineRelative = sqlEngineFactory.getCheckedQueryEngine("SELECT_RELATIVE");
    //sqlControl = getMoreResultClasses(relative, sqlControl);
    int count = sqlEngineRelative.queryCount(sqlSession, relative, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final Relative relative, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), relative, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final Relative relative) {
    return count(sqlSession, relative, null);
  }
  
  public int count(final Relative relative) {
    return count(relative, null);
  }
}
