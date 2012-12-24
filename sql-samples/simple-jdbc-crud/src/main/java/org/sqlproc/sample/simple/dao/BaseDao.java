package org.sqlproc.sample.simple.dao;

import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlProcedureEngine;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;

public interface BaseDao {

    public SqlSession getSqlSession();

    public SqlCrudEngine getCrudEngine(String name);

    public SqlQueryEngine getQueryEngine(String name);

    public SqlProcedureEngine getProcedureEngine(String name);
}
