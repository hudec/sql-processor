package org.sqlproc.engine.jdbc.jmx;


public interface SqlEngineFactoryMXBean {

    public String initQueryEngine(String name);

    public String initCrudEngine(String name);

    public String initProcedureEngine(String name);

    public String resetQueryEngine(String name);

    public String resetCrudEngine(String name);

    public String resetProcedureEngine(String name);

    public String newQueryEngine(String name, String sqlStatement);

    public String newCrudEngine(String name, String sqlStatement);

    public String newProcedureEngine(String name, String sqlStatement);
}
