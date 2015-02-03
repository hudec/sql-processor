package org.sample.dao;
	
import java.util.List;
import org.sample.model.FunLong;

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
import org.sample.model.FunLong;

public class FunLongDao {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected SqlEngineFactory sqlEngineFactory;
	protected SqlSessionFactory sqlSessionFactory;
			
	public FunLongDao() {
	}
			
	public FunLongDao(SqlEngineFactory sqlEngineFactory) {
		this.sqlEngineFactory = sqlEngineFactory;
	}
			
	public FunLongDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
		this.sqlEngineFactory = sqlEngineFactory;
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	public List<Long> funLong(SqlSession sqlSession, FunLong funLong, SqlControl sqlControl) {
		if (logger.isTraceEnabled()) {
			logger.trace("funLong: " + funLong + " " + sqlControl);
		}
		SqlProcedureEngine sqlProcFunLongDao = sqlEngineFactory.getCheckedProcedureEngine("PROC_FUN_LONG");
		List<Long> list = sqlProcFunLongDao.callQuery(sqlSession, Long.class, funLong, sqlControl);
		if (logger.isTraceEnabled()) {
			logger.trace("funLong result: " + list);
		}
		return list;
	}
	public List<Long> funLong(FunLong funLong, SqlControl sqlControl) {
		return funLong(sqlSessionFactory.getSqlSession(), funLong, sqlControl);
	}
	public List<Long> funLong(SqlSession sqlSession, FunLong funLong) {
		return funLong(sqlSession, funLong, null);
	}
	public List<Long> funLong(FunLong funLong) {
		return funLong(funLong, null);
	}
}
