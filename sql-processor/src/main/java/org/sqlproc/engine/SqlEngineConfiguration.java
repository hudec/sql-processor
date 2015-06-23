package org.sqlproc.engine;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * The configuration of the SQL Processor.
 * 
 * <p>
 * The primary goal of this configuration is the eager initialization of the selected SQL Engines. The overall
 * configuration can be also persisted using the sql-processor-spring.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlEngineConfiguration {

    private ConcurrentHashMap<String, AtomicInteger> queryEngines = new ConcurrentHashMap<String, AtomicInteger>();
    private ConcurrentHashMap<String, AtomicInteger> crudEngines = new ConcurrentHashMap<String, AtomicInteger>();
    private ConcurrentHashMap<String, AtomicInteger> procedureEngines = new ConcurrentHashMap<String, AtomicInteger>();
    private ConcurrentHashMap<String, String> dynamicQueryEngines = new ConcurrentHashMap<String, String>();
    private ConcurrentHashMap<String, String> dynamicCrudEngines = new ConcurrentHashMap<String, String>();
    private ConcurrentHashMap<String, String> dynamicProcedureEngines = new ConcurrentHashMap<String, String>();
    private Boolean lazyInit;
    private Boolean asyncInit;

    protected int addEngine(String name, ConcurrentHashMap<String, AtomicInteger> engines) {
        AtomicInteger counter = null;
        if (!engines.containsKey(name))
            counter = engines.putIfAbsent(name, new AtomicInteger(1));
        if (counter == null)
            return 1;
        else
            return counter.addAndGet(1);
    }

    protected int removeEngine(String name, ConcurrentHashMap<String, AtomicInteger> engines) {
        synchronized (engines) {
            AtomicInteger counter = engines.remove(name);
            return (counter == null) ? 0 : counter.get();
        }
    }

    public int addQueryEngine(String name) {
        return addEngine(name, queryEngines);
    }

    public int addCrudEngine(String name) {
        return addEngine(name, crudEngines);
    }

    public int addProcedureEngine(String name) {
        return addEngine(name, procedureEngines);
    }

    public int removeQueryEngine(String name) {
        return addEngine(name, queryEngines);
    }

    public int removeCrudEngine(String name) {
        return addEngine(name, crudEngines);
    }

    public int removeProcedureEngine(String name) {
        return addEngine(name, procedureEngines);
    }

    public int addDynamicQueryEngine(String name, String sqlStatement) {
        dynamicQueryEngines.put(name, sqlStatement);
        return addQueryEngine(name);
    }

    public int addDynamicCrudEngine(String name, String sqlStatement) {
        dynamicCrudEngines.put(name, sqlStatement);
        return addCrudEngine(name);
    }

    public int addDynamicProcedureEngine(String name, String sqlStatement) {
        dynamicProcedureEngines.put(name, sqlStatement);
        return addProcedureEngine(name);
    }

    public void removeDynamicQueryEngine(String name) {
        dynamicQueryEngines.remove(name);
    }

    public void removeDynamicCrudEngine(String name) {
        dynamicCrudEngines.remove(name);
    }

    public void removeDynamicProcedureEngine(String name) {
        dynamicProcedureEngines.remove(name);
    }

    public ConcurrentHashMap<String, AtomicInteger> getQueryEngines() {
        return queryEngines;
    }

    public ConcurrentHashMap<String, AtomicInteger> getCrudEngines() {
        return crudEngines;
    }

    public ConcurrentHashMap<String, AtomicInteger> getProcedureEngines() {
        return procedureEngines;
    }

    public ConcurrentHashMap<String, String> getDynamicQueryEngines() {
        return dynamicQueryEngines;
    }

    public ConcurrentHashMap<String, String> getDynamicCrudEngines() {
        return dynamicCrudEngines;
    }

    public ConcurrentHashMap<String, String> getDynamicProcedureEngines() {
        return dynamicProcedureEngines;
    }

    public void setQueryEngines(ConcurrentHashMap<String, AtomicInteger> queryEngines) {
        this.queryEngines = queryEngines;
    }

    public void setCrudEngines(ConcurrentHashMap<String, AtomicInteger> crudEngines) {
        this.crudEngines = crudEngines;
    }

    public void setProcedureEngines(ConcurrentHashMap<String, AtomicInteger> procedureEngines) {
        this.procedureEngines = procedureEngines;
    }

    public void setDynamicQueryEngines(ConcurrentHashMap<String, String> dynamicQueryEngines) {
        this.dynamicQueryEngines = dynamicQueryEngines;
    }

    public void setDynamicCrudEngines(ConcurrentHashMap<String, String> dynamicCrudEngines) {
        this.dynamicCrudEngines = dynamicCrudEngines;
    }

    public void setDynamicProcedureEngines(ConcurrentHashMap<String, String> dynamicProcedureEngines) {
        this.dynamicProcedureEngines = dynamicProcedureEngines;
    }

    public Boolean getLazyInit() {
        return lazyInit;
    }

    public void setLazyInit(Boolean lazyInit) {
        this.lazyInit = lazyInit;
    }

    public Boolean getAsyncInit() {
        return asyncInit;
    }

    public void setAsyncInit(Boolean asyncInit) {
        this.asyncInit = asyncInit;
    }
}
