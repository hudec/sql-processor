package org.sqlproc.engine.config;

import java.util.Map;
import java.util.Set;

import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlProcedureEngine;
import org.sqlproc.engine.SqlQueryEngine;

public interface SqlEngineConfiguration {

    public int addEngine(SqlQueryEngine sqlEngine);

    public int addEngine(SqlCrudEngine sqlEngine);

    public int addEngine(SqlProcedureEngine sqlEngine);

    public int removeEngine(SqlQueryEngine sqlEngine);

    public int removeEngine(SqlCrudEngine sqlEngine);

    public int removeEngine(SqlProcedureEngine sqlEngine);

    public int addDynamicEngine(SqlQueryEngine sqlEngine, String sqlStatement);

    public int addDynamicEngine(SqlCrudEngine sqlEngine, String sqlStatement);

    public int addDynamicEngine(SqlProcedureEngine sqlEngine, String sqlStatement);

    public int removeDynamicEngine(SqlQueryEngine sqlEngine);

    public int removeDynamicEngine(SqlCrudEngine sqlEngine);

    public int removeDynamicEngine(SqlProcedureEngine sqlEngine);

    public Set<String> getStaticSqlQueryEngines();

    public Set<String> getStaticSqlCrudEngines();

    public Set<String> getStaticSqlProcedureEngines();

    public Map<String, String> getDynamicSqlQueryEngines();

    public Map<String, String> getDynamicSqlCrudEngines();

    public Map<String, String> getDynamicSqlProcedureEngines();

    public Boolean getLazyInit();

    public void setLazyInit(Boolean lazyInit);

    public Boolean getAsyncInit();

    public void setAsyncInit(Boolean asyncInit);
}
