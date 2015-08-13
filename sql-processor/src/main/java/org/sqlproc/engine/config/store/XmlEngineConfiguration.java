package org.sqlproc.engine.config.store;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.sqlproc.engine.config.SqlEngineConfiguration;

/**
 * This class is used only for the SQL Processor dynamic configuration serialization/deserialization.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
@XmlRootElement(name = "sqlp-configuration")
public class XmlEngineConfiguration {

    private List<EngineUsage> queryEngines;
    private List<EngineUsage> crudEngines;
    private List<EngineUsage> procedureEngines;

    private List<EngineSql> dynamicQueryEngines;
    private List<EngineSql> dynamicCrudEngines;
    private List<EngineSql> dynamicProcedureEngines;

    private Boolean lazyInit;
    private Integer asyncInitThreads;
    private Integer initTreshold;
    private Boolean initInUsageOrder;
    private Boolean initClearUsage;

    public XmlEngineConfiguration() {
        queryEngines = new ArrayList<EngineUsage>();
        crudEngines = new ArrayList<EngineUsage>();
        procedureEngines = new ArrayList<EngineUsage>();

        dynamicQueryEngines = new ArrayList<EngineSql>();
        dynamicCrudEngines = new ArrayList<EngineSql>();
        dynamicProcedureEngines = new ArrayList<EngineSql>();
    }

    private void copyEng(ConcurrentHashMap<String, AtomicInteger> from, List<EngineUsage> to) {
        for (Entry<String, AtomicInteger> e : from.entrySet())
            to.add(new EngineUsage(e.getKey(), e.getValue()));
    }

    private void copyDyn(ConcurrentHashMap<String, String> from, List<EngineSql> to) {
        for (Entry<String, String> e : from.entrySet())
            to.add(new EngineSql(e.getKey(), e.getValue()));
    }

    public XmlEngineConfiguration(SqlEngineConfiguration config) {
        copyEng(config.getQueryEngines(), queryEngines = new ArrayList<EngineUsage>());
        copyEng(config.getCrudEngines(), crudEngines = new ArrayList<EngineUsage>());
        copyEng(config.getProcedureEngines(), procedureEngines = new ArrayList<EngineUsage>());

        copyDyn(config.getDynamicQueryEngines(), dynamicQueryEngines = new ArrayList<EngineSql>());
        copyDyn(config.getDynamicCrudEngines(), dynamicCrudEngines = new ArrayList<EngineSql>());
        copyDyn(config.getDynamicProcedureEngines(), dynamicProcedureEngines = new ArrayList<EngineSql>());

        lazyInit = config.getLazyInit();
        asyncInitThreads = config.getAsyncInitThreads();
        initTreshold = config.getInitTreshold();
        initInUsageOrder = config.getInitInUsageOrder();
        initClearUsage = config.getInitClearUsage();
    }

    public void toConfig(SqlEngineConfiguration config) {
        config.setQueryEngines(copyEng(queryEngines));
        config.setCrudEngines(copyEng(crudEngines));
        config.setProcedureEngines(copyEng(procedureEngines));
        config.setDynamicQueryEngines(copyDyn(dynamicQueryEngines));
        config.setDynamicCrudEngines(copyDyn(dynamicCrudEngines));
        config.setDynamicProcedureEngines(copyDyn(dynamicProcedureEngines));
        config.setLazyInit(getLazyInit());
        config.setAsyncInitThreads(getAsyncInitThreads());
        config.setInitTreshold(getInitTreshold());
        config.setInitInUsageOrder(getInitInUsageOrder());
        config.setInitClearUsage(getInitClearUsage());

    }

    private ConcurrentHashMap<String, AtomicInteger> copyEng(List<EngineUsage> from) {
        ConcurrentHashMap<String, AtomicInteger> engines = new ConcurrentHashMap<String, AtomicInteger>();
        if (from == null)
            return engines;
        for (EngineUsage e : from)
            engines.put(e.getName(), new AtomicInteger(e.getUsage()));
        return engines;
    }

    private ConcurrentHashMap<String, String> copyDyn(List<EngineSql> from) {
        ConcurrentHashMap<String, String> engines = new ConcurrentHashMap<String, String>();
        if (from == null)
            return engines;
        for (EngineSql e : from)
            engines.put(e.getName(), e.getSql());
        return engines;
    }

    @XmlRootElement(name = "usage")
    public static class EngineUsage {

        private String name;
        private int usage;

        public EngineUsage() {
        }

        public EngineUsage(String name, AtomicInteger usage) {
            this.name = name;
            this.usage = usage.get();
        }

        @XmlElement
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @XmlAttribute
        public int getUsage() {
            return usage;
        }

        public void setUsage(int usage) {
            this.usage = usage;
        }

        @Override
        public String toString() {
            return "EngineUsage [name=" + name + ", usage=" + usage + "]";
        }
    }

    @XmlRootElement(name = "sql")
    public static class EngineSql {

        private String name;
        private String sql;

        public EngineSql() {
        }

        public EngineSql(String name, String sql) {
            this.name = name;
            this.sql = sql;
        }

        @XmlElement
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @XmlAttribute
        public String getSql() {
            return sql;
        }

        public void setSql(String sql) {
            this.sql = sql;
        }

        @Override
        public String toString() {
            return "EngineSql [name=" + name + ", sql=" + sql + "]";
        }
    }

    @XmlElementWrapper(name = "queries")
    public List<EngineUsage> getQueryEngines() {
        return queryEngines;
    }

    public void setQueryEngines(List<EngineUsage> queryEngines) {
        this.queryEngines = queryEngines;
    }

    @XmlElementWrapper(name = "cruds")
    public List<EngineUsage> getCrudEngines() {
        return crudEngines;
    }

    public void setCrudEngines(List<EngineUsage> crudEngines) {
        this.crudEngines = crudEngines;
    }

    @XmlElementWrapper(name = "procedures")
    public List<EngineUsage> getProcedureEngines() {
        return procedureEngines;
    }

    public void setProcedureEngines(List<EngineUsage> procedureEngines) {
        this.procedureEngines = procedureEngines;
    }

    @XmlElementWrapper(name = "dynamicQueries")
    public List<EngineSql> getDynamicQueryEngines() {
        return dynamicQueryEngines;
    }

    public void setDynamicQueryEngines(List<EngineSql> dynamicQueryEngines) {
        this.dynamicQueryEngines = dynamicQueryEngines;
    }

    @XmlElementWrapper(name = "dynamicCruds")
    public List<EngineSql> getDynamicCrudEngines() {
        return dynamicCrudEngines;
    }

    public void setDynamicCrudEngines(List<EngineSql> dynamicCrudEngines) {
        this.dynamicCrudEngines = dynamicCrudEngines;
    }

    @XmlElementWrapper(name = "dynamicProcedures")
    public List<EngineSql> getDynamicProcedureEngines() {
        return dynamicProcedureEngines;
    }

    public void setDynamicProcedureEngines(List<EngineSql> dynamicProcedureEngines) {
        this.dynamicProcedureEngines = dynamicProcedureEngines;
    }

    @XmlElement
    public Boolean getLazyInit() {
        return lazyInit;
    }

    public void setLazyInit(Boolean lazyInit) {
        this.lazyInit = lazyInit;
    }

    @XmlElement
    public Integer getAsyncInitThreads() {
        return asyncInitThreads;
    }

    public void setAsyncInitThreads(Integer asyncInitThreads) {
        this.asyncInitThreads = asyncInitThreads;
    }

    @XmlElement
    public Integer getInitTreshold() {
        return initTreshold;
    }

    public void setInitTreshold(Integer initTreshold) {
        this.initTreshold = initTreshold;
    }

    @XmlElement
    public Boolean getInitInUsageOrder() {
        return initInUsageOrder;
    }

    public void setInitInUsageOrder(Boolean initInUsageOrder) {
        this.initInUsageOrder = initInUsageOrder;
    }

    @XmlElement
    public Boolean getInitClearUsage() {
        return initClearUsage;
    }

    public void setInitClearUsage(Boolean initClearUsage) {
        this.initClearUsage = initClearUsage;
    }

    @Override
    public String toString() {
        return "XmlEngineConfiguration [queryEngines=" + queryEngines + ", crudEngines=" + crudEngines
                + ", procedureEngines=" + procedureEngines + ", dynamicQueryEngines=" + dynamicQueryEngines
                + ", dynamicCrudEngines=" + dynamicCrudEngines + ", dynamicProcedureEngines=" + dynamicProcedureEngines
                + ", lazyInit=" + lazyInit + ", asyncInitThreads=" + asyncInitThreads + ", initTreshold="
                + initTreshold + ", initInUsageOrder=" + initInUsageOrder + ", initClearUsage=" + initClearUsage + "]";
    }
}
