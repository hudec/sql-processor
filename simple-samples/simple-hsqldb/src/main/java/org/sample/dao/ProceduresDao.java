package org.sample.dao;

import org.sample.model.NewPerson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlProcedureEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

public class ProceduresDao {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected SqlEngineFactory sqlEngineFactory;
    protected SqlSessionFactory sqlSessionFactory;

    public ProceduresDao(SqlEngineFactory sqlEngineFactory) {
        this.sqlEngineFactory = sqlEngineFactory;
    }

    public ProceduresDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
        this.sqlEngineFactory = sqlEngineFactory;
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public void newPerson(SqlSession sqlSession, NewPerson newPerson, SqlControl sqlControl) {
        if (logger.isTraceEnabled()) {
            logger.trace("newPerson: " + newPerson + " " + sqlControl);
        }
        SqlProcedureEngine sqlProcNewPerson = sqlEngineFactory.getCheckedProcedureEngine("PROC_NEW_PERSON");
        int count = sqlProcNewPerson.callUpdate(sqlSession, newPerson, sqlControl);
        if (logger.isTraceEnabled()) {
            logger.trace("anHourBefore: " + count);
        }
    }

    public void newPerson(NewPerson newPerson, SqlControl sqlControl) {
        newPerson(sqlSessionFactory.getSqlSession(), newPerson, sqlControl);
    }

    public void newPerson(SqlSession sqlSession, NewPerson newPerson) {
        newPerson(sqlSession, newPerson, null);
    }

    public void newPerson(NewPerson newPerson) {
        newPerson(newPerson, null);
    }
}
