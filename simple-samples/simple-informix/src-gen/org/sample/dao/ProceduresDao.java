package org.sample.dao;
	
import org.sample.model.NewPerson;

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

public class ProceduresDao {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected SqlEngineFactory sqlEngineFactory;
	protected SqlSessionFactory sqlSessionFactory;
			
	public ProceduresDao() {
	}
			
	public ProceduresDao(SqlEngineFactory sqlEngineFactory) {
		this.sqlEngineFactory = sqlEngineFactory;
	}
			
	public ProceduresDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
		this.sqlEngineFactory = sqlEngineFactory;
		this.sqlSessionFactory = sqlSessionFactory;
	}
	

	public int newPerson(SqlSession sqlSession, NewPerson newPerson, SqlControl sqlControl) {
		if (logger.isTraceEnabled()) {
			logger.trace("newPerson: " + newPerson + " " + sqlControl);
		}
		SqlProcedureEngine sqlProcNewPerson = sqlEngineFactory.getCheckedProcedureEngine("PROC_NEW_PERSON");
		int count = sqlProcNewPerson.callUpdate(sqlSession, newPerson, sqlControl);
		if (logger.isTraceEnabled()) {
			logger.trace("newPerson result: " + count);
		}
		return count;
	}
	public int newPerson(NewPerson newPerson, SqlControl sqlControl) {
		return newPerson(sqlSessionFactory.getSqlSession(), newPerson, sqlControl);
	}
	public int newPerson(SqlSession sqlSession, NewPerson newPerson) {
		return newPerson(sqlSession, newPerson, null);
	}
	public int newPerson(NewPerson newPerson) {
		return newPerson(newPerson, null);
	}
}
