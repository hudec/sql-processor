package org.sample.dao;

import java.util.List;
import org.sample.model.Digidata;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

@SuppressWarnings("all")
public class DigidataDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public DigidataDao() {
  }
  
  public DigidataDao(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public DigidataDao(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public Digidata insert(final SqlSession sqlSession, final Digidata digidata, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert digidata: " + digidata + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertDigidata = sqlEngineFactory.getCheckedCrudEngine("INSERT_DIGIDATA");
    int count = sqlInsertDigidata.insert(sqlSession, digidata, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert digidata result: " + count + " " + digidata);
    }
    return (count > 0) ? digidata : null;
  }
  
  public Digidata insert(final Digidata digidata, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), digidata, sqlControl);
  }
  
  public Digidata insert(final SqlSession sqlSession, final Digidata digidata) {
    return insert(sqlSession, digidata, null);
  }
  
  public Digidata insert(final Digidata digidata) {
    return insert(digidata, null);
  }
  
  public Digidata get(final SqlSession sqlSession, final Digidata digidata, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + digidata + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineDigidata = sqlEngineFactory.getCheckedCrudEngine("GET_DIGIDATA");
    //sqlControl = getMoreResultClasses(digidata, sqlControl);
    Digidata digidataGot = sqlGetEngineDigidata.get(sqlSession, Digidata.class, digidata, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get digidata result: " + digidataGot);
    }
    return digidataGot;
  }
  
  public Digidata get(final Digidata digidata, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), digidata, sqlControl);
  }
  
  public Digidata get(final SqlSession sqlSession, final Digidata digidata) {
    return get(sqlSession, digidata, null);
  }
  
  public Digidata get(final Digidata digidata) {
    return get(digidata, null);
  }
  
  public int update(final SqlSession sqlSession, final Digidata digidata, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update digidata: " + digidata + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineDigidata = sqlEngineFactory.getCheckedCrudEngine("UPDATE_DIGIDATA");
    int count = sqlUpdateEngineDigidata.update(sqlSession, digidata, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update digidata result count: " + count);
    }
    return count;
  }
  
  public int update(final Digidata digidata, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), digidata, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final Digidata digidata) {
    return update(sqlSession, digidata, null);
  }
  
  public int update(final Digidata digidata) {
    return update(digidata, null);
  }
  
  public int delete(final SqlSession sqlSession, final Digidata digidata, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete digidata: " + digidata + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineDigidata = sqlEngineFactory.getCheckedCrudEngine("DELETE_DIGIDATA");
    int count = sqlDeleteEngineDigidata.delete(sqlSession, digidata, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete digidata result count: " + count);
    }
    return count;
  }
  
  public int delete(final Digidata digidata, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), digidata, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final Digidata digidata) {
    return delete(sqlSession, digidata, null);
  }
  
  public int delete(final Digidata digidata) {
    return delete(digidata, null);
  }
  
  public List<Digidata> list(final SqlSession sqlSession, final Digidata digidata, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list digidata: " + digidata + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineDigidata = sqlEngineFactory.getCheckedQueryEngine("SELECT_DIGIDATA");
    //sqlControl = getMoreResultClasses(digidata, sqlControl);
    List<Digidata> digidataList = sqlEngineDigidata.query(sqlSession, Digidata.class, digidata, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list digidata size: " + ((digidataList != null) ? digidataList.size() : "null"));
    }
    return digidataList;
  }
  
  public List<Digidata> list(final Digidata digidata, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), digidata, sqlControl);
  }
  
  public List<Digidata> list(final SqlSession sqlSession, final Digidata digidata) {
    return list(sqlSession, digidata, null);
  }
  
  public List<Digidata> list(final Digidata digidata) {
    return list(digidata, null);
  }
  
  public int count(final SqlSession sqlSession, final Digidata digidata, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count digidata: " + digidata + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineDigidata = sqlEngineFactory.getCheckedQueryEngine("SELECT_DIGIDATA");
    //sqlControl = getMoreResultClasses(digidata, sqlControl);
    int count = sqlEngineDigidata.queryCount(sqlSession, digidata, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final Digidata digidata, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), digidata, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final Digidata digidata) {
    return count(sqlSession, digidata, null);
  }
  
  public int count(final Digidata digidata) {
    return count(digidata, null);
  }
}
