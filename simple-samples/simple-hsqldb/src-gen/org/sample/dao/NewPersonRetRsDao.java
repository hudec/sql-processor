package org.sample.dao;
	
import java.util.List;
import org.sample.Dao;
import org.sample.model.NewPersonRetRs;
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

public class NewPersonRetRsDao {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected SqlEngineFactory sqlEngineFactory;
	protected SqlSessionFactory sqlSessionFactory;
			
	public NewPersonRetRsDao() {
	}
			
	public NewPersonRetRsDao(SqlEngineFactory sqlEngineFactory) {
		this.sqlEngineFactory = sqlEngineFactory;
	}
			
	public NewPersonRetRsDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
		this.sqlEngineFactory = sqlEngineFactory;
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	public List<Person> newPersonRetRs(SqlSession sqlSession, NewPersonRetRs newPersonRetRs, SqlControl sqlControl) {
		if (logger.isTraceEnabled()) {
			logger.trace("newPersonRetRs: " + newPersonRetRs + " " + sqlControl);
		}
		SqlProcedureEngine sqlProcNewPersonRetRsDao = sqlEngineFactory.getCheckedProcedureEngine("PROC_NEW_PERSON_RET_RS");
		List<Person> list = sqlProcNewPersonRetRsDao.callQuery(sqlSession, Person.class, newPersonRetRs, sqlControl);
		if (logger.isTraceEnabled()) {
			logger.trace("newPersonRetRs result: " + list);
		}
		return list;
	}
	public List<Person> newPersonRetRs(NewPersonRetRs newPersonRetRs, SqlControl sqlControl) {
		return newPersonRetRs(sqlSessionFactory.getSqlSession(), newPersonRetRs, sqlControl);
	}
	public List<Person> newPersonRetRs(SqlSession sqlSession, NewPersonRetRs newPersonRetRs) {
		return newPersonRetRs(sqlSession, newPersonRetRs, null);
	}
	public List<Person> newPersonRetRs(NewPersonRetRs newPersonRetRs) {
		return newPersonRetRs(newPersonRetRs, null);
	}
}
