package org.sqlproc.engine;

import java.util.Map;

/**
 * The factory definition, which can be used to construct the {@link SqlMonitor} instances.
 * 
 * <p>
 * The factory can be based on Spring DI framework for example.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlMonitorFactory {

    /**
     * The main contract of this factory.
     * 
     * @param name
     *            the name of a META SQL in the queries.properties file, which can be used to identify also the monitor
     *            instance itself
     * @param features
     *            the optional configuration of the SQL Processor using a Map of features
     * @return the instance of the SqlMonitor
     */
    SqlMonitor getSqlMonitor(String name, Map<String, Object> features);
}
