package org.sqlproc.sample.simple.dao.impl;

import org.sqlproc.sample.simple.dao.PerformerDao;
	
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
import org.sqlproc.sample.simple.model.Performer;
import org.sqlproc.sample.simple.model.NewBook;
		import org.sqlproc.sample.simple.model.Movie;

public class PerformerDaoImpl extends BaseDaoImpl implements BaseDao, PerformerDao {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected SqlEngineFactory sqlEngineFactory;
	protected SqlSessionFactory sqlSessionFactory;
			
	public PerformerDaoImpl() {
	}
			
	public PerformerDaoImpl(SqlEngineFactory sqlEngineFactory) {
		this.sqlEngineFactory = sqlEngineFactory;
	}
			
	public PerformerDaoImpl(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
		this.sqlEngineFactory = sqlEngineFactory;
		this.sqlSessionFactory = sqlSessionFactory;
	}
	

	public Performer insert(SqlSession sqlSession, Performer performer, SqlControl sqlControl) {
		if (logger.isTraceEnabled()) {
			logger.trace("insert performer: " + performer + " " + sqlControl);
		}
		SqlCrudEngine sqlInsertPerformer = sqlEngineFactory.getCheckedCrudEngine("INSERT_PERFORMER");
		int count = sqlInsertPerformer.insert(sqlSession, performer, sqlControl);
		if (logger.isTraceEnabled()) {
			logger.trace("insert performer result: " + count + " " + performer);
		}
		return (count > 0) ? performer : null;
	}
	public Performer insert(Performer performer, SqlControl sqlControl) {
		return insert(sqlSessionFactory.getSqlSession(), performer, sqlControl);
	}
	public Performer insert(SqlSession sqlSession, Performer performer) {
		return insert(sqlSession, performer, null);
	}
	public Performer insert(Performer performer) {
		return insert(performer, null);
	}

	public Performer get(SqlSession sqlSession, Performer performer, SqlControl sqlControl) {
		if (logger.isTraceEnabled()) {
			logger.trace("get get: " + performer + " " + sqlControl);
		}
		SqlCrudEngine sqlGetEnginePerformer = sqlEngineFactory.getCheckedCrudEngine("GET_PERFORMER");
		sqlControl = getMoreResultClasses(performer, sqlControl);
		Performer performerGot = sqlGetEnginePerformer.get(sqlSession, Performer.class, performer, sqlControl);
		if (logger.isTraceEnabled()) {
			logger.trace("get performer result: " + performerGot);
		}
		return performerGot;
	}
	public Performer get(Performer performer, SqlControl sqlControl) {
		return get(sqlSessionFactory.getSqlSession(), performer, sqlControl);
	}
	public Performer get(SqlSession sqlSession, Performer performer) {
		return get(sqlSession, performer, null);
	}
	public Performer get(Performer performer) {
		return get(performer, null);
	}

	public int update(SqlSession sqlSession, Performer performer, SqlControl sqlControl) {
		if (logger.isTraceEnabled()) {
			logger.trace("update performer: " + performer + " " + sqlControl);
		}
		SqlCrudEngine sqlUpdateEnginePerformer = sqlEngineFactory.getCheckedCrudEngine("UPDATE_PERFORMER");
		int count = sqlUpdateEnginePerformer.update(sqlSession, performer, sqlControl);
		if (count > 0) {
			performer.setVer(performer.getVer() + 1);
		}
		if (logger.isTraceEnabled()) {
			logger.trace("update performer result count: " + count);
		}
		return count;
	}
	public int update(Performer performer, SqlControl sqlControl) {
		return update(sqlSessionFactory.getSqlSession(), performer, sqlControl);
	}
	public int update(SqlSession sqlSession, Performer performer) {
		return update(sqlSession, performer, null);
	}
	public int update(Performer performer) {
		return update(performer, null);
	}

	public int delete(SqlSession sqlSession, Performer performer, SqlControl sqlControl) {
		if (logger.isTraceEnabled()) {
			logger.trace("delete performer: " + performer + " " + sqlControl);
		}
		SqlCrudEngine sqlDeleteEnginePerformer = sqlEngineFactory.getCheckedCrudEngine("DELETE_PERFORMER");
		int count = sqlDeleteEnginePerformer.delete(sqlSession, performer, sqlControl);
		if (count > 0) {
			performer.setVer(performer.getVer() + 1);
		}
		if (logger.isTraceEnabled()) {
			logger.trace("delete performer result count: " + count);
		}
		return count;
	}
	public int delete(Performer performer, SqlControl sqlControl) {
		return delete(sqlSessionFactory.getSqlSession(), performer, sqlControl);
	}
	public int delete(SqlSession sqlSession, Performer performer) {
		return delete(sqlSession, performer, null);
	}
	public int delete(Performer performer) {
		return delete(performer, null);
	}

	public List<Performer> list(SqlSession sqlSession, Performer performer, SqlControl sqlControl) {
		if (logger.isTraceEnabled()) {
			logger.trace("list performer: " + performer + " " + sqlControl);
		}
		SqlQueryEngine sqlEnginePerformer = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERFORMER");
		sqlControl = getMoreResultClasses(performer, sqlControl);
		List<Performer> performerList = sqlEnginePerformer.query(sqlSession, Performer.class, performer, sqlControl);
		if (logger.isTraceEnabled()) {
			logger.trace("list performer size: " + ((performerList != null) ? performerList.size() : "null"));
		}
		return performerList;
	}
	public List<Performer> list(Performer performer, SqlControl sqlControl) {
		return list(sqlSessionFactory.getSqlSession(), performer, sqlControl);
	}
	public List<Performer> list(SqlSession sqlSession, Performer performer) {
		return list(sqlSession, performer, null);
	}
	public List<Performer> list(Performer performer) {
		return list(performer, null);
	}

	public int count(SqlSession sqlSession, Performer performer, SqlControl sqlControl) {
		if (logger.isTraceEnabled()) {
			logger.trace("count performer: " + performer + " " + sqlControl);
		}
		SqlQueryEngine sqlEnginePerformer = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERFORMER");
		sqlControl = getMoreResultClasses(performer, sqlControl);
		int count = sqlEnginePerformer.queryCount(sqlSession, performer, sqlControl);
		if (logger.isTraceEnabled()) {
			logger.trace("count: " + count);
		}
		return count;
	}
	public int count(Performer performer, SqlControl sqlControl) {
		return count(sqlSessionFactory.getSqlSession(), performer, sqlControl);
	}
	public int count(SqlSession sqlSession, Performer performer) {
		return count(sqlSession, performer, null);
	}
	public int count(Performer performer) {
		return count(performer, null);
	}

	SqlControl getMoreResultClasses(Performer performer, SqlControl sqlControl) {
		if (sqlControl != null && sqlControl.getMoreResultClasses() != null)
			return sqlControl;
		Map<String, Class<?>> moreResultClasses = null;
				if (performer != null && performer.toInit(Performer.Association.work.name())) {
			if (moreResultClasses == null)
				moreResultClasses = new HashMap<String, Class<?>>();
				moreResultClasses.put("book", NewBook.class);
					moreResultClasses.put("movie", Movie.class);
		}
		if (moreResultClasses != null) {
			sqlControl = new SqlStandardControl(sqlControl);
			((SqlStandardControl) sqlControl).setMoreResultClasses(moreResultClasses);
		}
		return sqlControl;
	}
}
