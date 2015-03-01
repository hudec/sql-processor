package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.sample.simple.model.Movie;
import org.sqlproc.sample.simple.model.NewBook;
import org.sqlproc.sample.simple.model.Performer;

@SuppressWarnings("all")
public class PerformerDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public PerformerDao() {
  }
  
  public PerformerDao(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public PerformerDao(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public Performer insert(final SqlSession sqlSession, final Performer performer, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert performer: " + performer + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertPerformer = sqlEngineFactory.getCheckedCrudEngine("INSERT_PERFORMER");
    int count = sqlInsertPerformer.insert(sqlSession, performer, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert performer result: " + count + " " + performer);
    }
    return (count > 0) ? performer : null;
  }
  
  public Performer insert(final Performer performer, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), performer, sqlControl);
  }
  
  public Performer insert(final SqlSession sqlSession, final Performer performer) {
    return insert(sqlSession, performer, null);
  }
  
  public Performer insert(final Performer performer) {
    return insert(performer, null);
  }
  
  public Performer get(final SqlSession sqlSession, final Performer performer, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + performer + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEnginePerformer = sqlEngineFactory.getCheckedCrudEngine("GET_PERFORMER");
    sqlControl = getMoreResultClasses(performer, sqlControl);
    Performer performerGot = sqlGetEnginePerformer.get(sqlSession, Performer.class, performer, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get performer result: " + performerGot);
    }
    return performerGot;
  }
  
  public Performer get(final Performer performer, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), performer, sqlControl);
  }
  
  public Performer get(final SqlSession sqlSession, final Performer performer) {
    return get(sqlSession, performer, null);
  }
  
  public Performer get(final Performer performer) {
    return get(performer, null);
  }
  
  public int update(final SqlSession sqlSession, final Performer performer, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update performer: " + performer + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEnginePerformer = sqlEngineFactory.getCheckedCrudEngine("UPDATE_PERFORMER");
    int count = sqlUpdateEnginePerformer.update(sqlSession, performer, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update performer result count: " + count);
    }
    return count;
  }
  
  public int update(final Performer performer, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), performer, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final Performer performer) {
    return update(sqlSession, performer, null);
  }
  
  public int update(final Performer performer) {
    return update(performer, null);
  }
  
  public int delete(final SqlSession sqlSession, final Performer performer, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete performer: " + performer + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEnginePerformer = sqlEngineFactory.getCheckedCrudEngine("DELETE_PERFORMER");
    int count = sqlDeleteEnginePerformer.delete(sqlSession, performer, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete performer result count: " + count);
    }
    return count;
  }
  
  public int delete(final Performer performer, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), performer, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final Performer performer) {
    return delete(sqlSession, performer, null);
  }
  
  public int delete(final Performer performer) {
    return delete(performer, null);
  }
  
  public List<Performer> list(final SqlSession sqlSession, final Performer performer, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list performer: " + performer + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePerformer = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERFORMER");
    sqlControl = getMoreResultClasses(performer, sqlControl);
    List<Performer> performerList = sqlEnginePerformer.query(sqlSession, Performer.class, performer, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list performer size: " + ((performerList != null) ? performerList.size() : "null"));
    }
    return performerList;
  }
  
  public List<Performer> list(final Performer performer, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), performer, sqlControl);
  }
  
  public List<Performer> list(final SqlSession sqlSession, final Performer performer) {
    return list(sqlSession, performer, null);
  }
  
  public List<Performer> list(final Performer performer) {
    return list(performer, null);
  }
  
  public int count(final SqlSession sqlSession, final Performer performer, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count performer: " + performer + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePerformer = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERFORMER");
    sqlControl = getMoreResultClasses(performer, sqlControl);
    int count = sqlEnginePerformer.queryCount(sqlSession, performer, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final Performer performer, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), performer, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final Performer performer) {
    return count(sqlSession, performer, null);
  }
  
  public int count(final Performer performer) {
    return count(performer, null);
  }
  
  public SqlControl getMoreResultClasses(final Performer performer, SqlControl sqlControl) {
    if (sqlControl != null && sqlControl.getMoreResultClasses() != null)
    	return sqlControl;
    java.util.Map<String, Class<?>> moreResultClasses = null;
    if (performer != null && performer.toInit(Performer.Association.work.name())) {
    	if (moreResultClasses == null)
    		moreResultClasses = new java.util.HashMap<String, Class<?>>();
    	moreResultClasses.put("book", NewBook.class);
    	moreResultClasses.put("movie", Movie.class);
    }
    if (moreResultClasses != null) {
    	sqlControl = new org.sqlproc.engine.impl.SqlStandardControl(sqlControl);
    	((org.sqlproc.engine.impl.SqlStandardControl) sqlControl).setMoreResultClasses(moreResultClasses);
    }
    return sqlControl;
  }
}
