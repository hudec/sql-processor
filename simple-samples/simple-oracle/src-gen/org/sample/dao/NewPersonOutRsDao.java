package org.sample.dao;
	
import java.util.List;
import org.sample.model.NewPersonOutRs;
import org.sample.model.Person;

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
import org.sample.model.NewPersonOutRs;

public class NewPersonOutRsDao {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected SqlEngineFactory sqlEngineFactory;
	protected SqlSessionFactory sqlSessionFactory;
			
	public NewPersonOutRsDao() {
	}
			
	public NewPersonOutRsDao(SqlEngineFactory sqlEngineFactory) {
		this.sqlEngineFactory = sqlEngineFactory;
	}
			
	public NewPersonOutRsDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
		this.sqlEngineFactory = sqlEngineFactory;
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	public List<Person> newPersonOutRs(SqlSession sqlSession, NewPersonOutRs newPersonOutRs, SqlControl sqlControl) {
		if (logger.isTraceEnabled()) {
			logger.trace("newPersonOutRs: " + newPersonOutRs + " " + sqlControl);
		}
		SqlProcedureEngine sqlProcNewPersonOutRsDao = sqlEngineFactory.getCheckedProcedureEngine("PROC_NEW_PERSON_OUT_RS");
		List<Person> list = sqlProcNewPersonOutRsDao.callQuery(sqlSession, Person.class, newPersonOutRs, sqlControl);
		if (logger.isTraceEnabled()) {
			logger.trace("newPersonOutRs result: " + list);
		}
		return list;
	}
	public List<Person> newPersonOutRs(NewPersonOutRs newPersonOutRs, SqlControl sqlControl) {
		return newPersonOutRs(sqlSessionFactory.getSqlSession(), newPersonOutRs, sqlControl);
	}
	public List<Person> newPersonOutRs(SqlSession sqlSession, NewPersonOutRs newPersonOutRs) {
		return newPersonOutRs(sqlSession, newPersonOutRs, null);
	}
	public List<Person> newPersonOutRs(NewPersonOutRs newPersonOutRs) {
		return newPersonOutRs(newPersonOutRs, null);
	}
}
