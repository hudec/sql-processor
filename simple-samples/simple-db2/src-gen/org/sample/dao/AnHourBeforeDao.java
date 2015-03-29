package org.sample.dao;

import java.sql.Timestamp;

import org.sample.model.AnHourBefore;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

@SuppressWarnings("all")
public class AnHourBeforeDao {
    protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());

    public AnHourBeforeDao() {
    }

    public AnHourBeforeDao(final SqlEngineFactory sqlEngineFactory) {
        this.sqlEngineFactory = sqlEngineFactory;
    }

    public AnHourBeforeDao(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
        this.sqlEngineFactory = sqlEngineFactory;
        this.sqlSessionFactory = sqlSessionFactory;
    }

    protected SqlEngineFactory sqlEngineFactory;

    protected SqlSessionFactory sqlSessionFactory;

    public Timestamp anHourBefore(final SqlSession sqlSession, final AnHourBefore AnHourBefore, SqlControl sqlControl) {
        if (logger.isTraceEnabled()) {
            logger.trace("sql anHourBefore: " + AnHourBefore + " " + sqlControl);
        }
        SqlQueryEngine sqlFunAnHourBeforeDao = sqlEngineFactory.getCheckedQueryEngine("FUN_AN_HOUR_BEFORE");
        java.util.List<AnHourBefore> list = sqlFunAnHourBeforeDao.query(sqlSession, AnHourBefore.class, AnHourBefore,
                sqlControl);
        // org.sqlproc.engine.SqlProcedureEngine sqlProcAnHourBeforeDao =
        // sqlEngineFactory.getCheckedProcedureEngine("FUN_AN_HOUR_BEFORE");
        // java.util.List<AnHourBefore> list = sqlFunAnHourBeforeDao.query(sqlSession, AnHourBefore.class, AnHourBefore,
        // sqlControl);
        if (logger.isTraceEnabled()) {
            logger.trace("sql anHourBefore result: " + list);
        }
        return (list != null && !list.isEmpty()) ? list.get(0).getResult() : null;
    }

    public Timestamp anHourBefore(final AnHourBefore AnHourBefore, SqlControl sqlControl) {
        return anHourBefore(sqlSessionFactory.getSqlSession(), AnHourBefore, sqlControl);
    }

    public Timestamp anHourBefore(final SqlSession sqlSession, final AnHourBefore AnHourBefore) {
        return anHourBefore(sqlSession, AnHourBefore, null);
    }

    public Timestamp anHourBefore(final AnHourBefore AnHourBefore) {
        return anHourBefore(AnHourBefore, null);
    }
}
