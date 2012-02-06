package org.sqlproc.sample.catalog.monitor;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.sqlproc.engine.SqlMonitor;
import org.sqlproc.engine.SqlMonitorFactory;

public class SimonSqlMonitorFactory implements SqlMonitorFactory {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private MonitoringManager manager;
    private String monitorName;

    @Override
    public SqlMonitor getSqlMonitor(String name, Map<String, Object> features) {
        if (logger.isDebugEnabled()) {
            logger.debug("SQLF " + name);
        }
        return new SimonSqlMonitor(name, manager, monitorName);
    }

    @Required
    public void setManager(MonitoringManager manager) {
        this.manager = manager;
    }

    @Required
    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

}
