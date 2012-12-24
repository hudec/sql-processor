package org.sqlproc.sample.simple.dao;

import java.sql.Connection;

import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlProcedureEngine;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.jdbc.JdbcSimpleSession;

public class BaseDaoImpl implements BaseDao {

    private Connection connection;
    private SqlEngineFactory sqlFactory;

    public SqlSession getSqlSession() {
        return new JdbcSimpleSession(connection);
    }

    public SqlCrudEngine getCrudEngine(String name) {
        SqlCrudEngine queryEngine = sqlFactory.getCrudEngine(name);
        if (queryEngine == null)
            throw new RuntimeException("Missing SqlQueryEngine " + name);
        return queryEngine;
    }

    public SqlQueryEngine getQueryEngine(String name) {
        SqlQueryEngine queryEngine = sqlFactory.getQueryEngine(name);
        if (queryEngine == null)
            throw new RuntimeException("Missing SqlQueryEngine " + name);
        return queryEngine;
    }

    public SqlProcedureEngine getProcedureEngine(String name) {
        SqlProcedureEngine procedureEngine = sqlFactory.getProcedureEngine(name);
        if (procedureEngine == null)
            throw new RuntimeException("Missing SqlQueryEngine " + name);
        return procedureEngine;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public SqlEngineFactory getSqlFactory() {
        return sqlFactory;
    }

    public void setSqlFactory(SqlEngineFactory sqlFactory) {
        this.sqlFactory = sqlFactory;
    }
}
