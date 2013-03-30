package org.sample.dao;

import org.sample.model.AnHourBefore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlProcedureEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

public class FunctionsDao {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected SqlEngineFactory sqlEngineFactory;
    protected SqlSessionFactory sqlSessionFactory;

    public FunctionsDao(SqlEngineFactory sqlEngineFactory) {
        this.sqlEngineFactory = sqlEngineFactory;
    }

    public FunctionsDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
        this.sqlEngineFactory = sqlEngineFactory;
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public java.sql.Timestamp anHourBefore(SqlSession sqlSession, AnHourBefore anHourBefore, SqlControl sqlControl) {
        if (logger.isTraceEnabled()) {
            logger.trace("anHourBefore: " + anHourBefore + " " + sqlControl);
        }
        SqlProcedureEngine sqlFunAnHourBefore = sqlEngineFactory.getCheckedProcedureEngine("FUN_AN_HOUR_BEFORE");
        Object result = sqlFunAnHourBefore.callFunction(sqlSession, anHourBefore, sqlControl);
        if (logger.isTraceEnabled()) {
            logger.trace("anHourBefore: " + result);
        }
        return (java.sql.Timestamp) result;
    }

    public java.sql.Timestamp anHourBefore(AnHourBefore anHourBefore, SqlControl sqlControl) {
        return anHourBefore(sqlSessionFactory.getSqlSession(), anHourBefore, sqlControl);
    }

    public java.sql.Timestamp anHourBefore(SqlSession sqlSession, AnHourBefore anHourBefore) {
        return anHourBefore(sqlSession, anHourBefore, null);
    }

    public java.sql.Timestamp anHourBefore(AnHourBefore anHourBefore) {
        return anHourBefore(anHourBefore, null);
    }
}
