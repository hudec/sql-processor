package org.sqlproc.sample.simple.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;

public class BaseDao {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    private SqlEngineFactory sqlFactory;
    protected SqlSession session;

    static {
        try {
            DriverManager.registerDriver(new org.hsqldb.jdbcDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public BaseDao(SqlEngineFactory sqlFactory, SqlSession session) {
        this.sqlFactory = sqlFactory;
        this.session = session;
    }

    protected SqlCrudEngine getCrudEngine(String name) {
        SqlCrudEngine queryEngine = sqlFactory.getCrudEngine(name);
        if (queryEngine == null)
            throw new RuntimeException("Missing SqlQueryEngine " + name);
        return queryEngine;
    }

    protected SqlQueryEngine getQueryEngine(String name) {
        SqlQueryEngine queryEngine = sqlFactory.getQueryEngine(name);
        if (queryEngine == null)
            throw new RuntimeException("Missing SqlQueryEngine " + name);
        return queryEngine;
    }

}
