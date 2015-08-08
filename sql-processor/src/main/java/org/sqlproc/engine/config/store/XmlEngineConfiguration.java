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

    @XmlElementWrapper(name = "queries")
    private List<EngineUsage> queryEngines;
    @XmlElementWrapper(name = "cruds")
    private List<EngineUsage> crudEngines;
    @XmlElementWrapper(name = "procedures")
    private List<EngineUsage> procedureEngines;

    @XmlElementWrapper(name = "dynamicQueries")
    private List<EngineSql> dynamicQueryEngines;
    @XmlElementWrapper(name = "dynamicCruds")
    private List<EngineSql> dynamicCrudEngines;
    @XmlElementWrapper(name = "dynamicProcedures")
    private List<EngineSql> dynamicProcedureEngines;

    @XmlElement
    private Boolean lazyInit;
    @XmlElement
    private Integer asyncInitThreads;
    @XmlElement
    private Integer initTreshold;
    @XmlElement
    private Boolean initInUsageOrder;
    @XmlElement
    private Boolean initClearUsage;

    public XmlEngineConfiguration() {
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

    public ConcurrentHashMap<String, AtomicInteger> getQueryEngines() {
        return copyEng(queryEngines);
    }

    public ConcurrentHashMap<String, AtomicInteger> getCrudEngines() {
        return copyEng(crudEngines);
    }

    public ConcurrentHashMap<String, AtomicInteger> getProcedureEngines() {
        return copyEng(procedureEngines);
    }

    public ConcurrentHashMap<String, String> getDynamicQueryEngines() {
        return copyDyn(dynamicQueryEngines);
    }

    public ConcurrentHashMap<String, String> getDynamicCrudEngines() {
        return copyDyn(dynamicCrudEngines);
    }

    public ConcurrentHashMap<String, String> getDynamicProcedureEngines() {
        return copyDyn(dynamicProcedureEngines);
    }

    public Boolean getLazyInit() {
        return lazyInit;
    }

    public Integer getAsyncInitThreads() {
        return asyncInitThreads;
    }

    public Integer getInitTreshold() {
        return initTreshold;
    }

    public Boolean getInitInUsageOrder() {
        return initInUsageOrder;
    }

    public Boolean getInitClearUsage() {
        return initClearUsage;
    }

    @XmlRootElement(name = "usage")
    public static class EngineUsage {
        @XmlElement
        private String name;

        @XmlAttribute
        private int usage;

        public EngineUsage() {
        }

        public EngineUsage(String name, AtomicInteger usage) {
            this.name = name;
            this.usage = usage.get();
        }

        public String getName() {
            return name;
        }

        public int getUsage() {
            return usage;
        }
    }

    @XmlRootElement(name = "sql")
    public static class EngineSql {
        @XmlElement
        private String name;

        @XmlAttribute
        private String sql;

        public EngineSql() {
        }

        public EngineSql(String name, String sql) {
            this.name = name;
            this.sql = sql;
        }

        public String getName() {
            return name;
        }

        public String getSql() {
            return sql;
        }
    }
}
