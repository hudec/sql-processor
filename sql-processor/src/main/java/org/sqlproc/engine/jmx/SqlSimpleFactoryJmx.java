package org.sqlproc.engine.jmx;

import java.util.Map;

import org.sqlproc.engine.SqlEngine;
import org.sqlproc.engine.SqlEngineException;
import org.sqlproc.engine.SqlEngineFactory;

/**
 * The implementation of the simplified JMX interface for the SQL Engine factory.
 * 
 * <p>
 * The factory can be based on Spring DI framework for example.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlSimpleFactoryJmx implements SqlSimpleFactoryMXBean {

    /**
     * The SQL Engine factory instance
     */
    private SqlEngineFactory sqlEngineFactory;

    public static final String OK = "OK";

    /**
     * {@inheritDoc}
     */
    @Override
    public String initQueryEngines(String names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names.split(",")) {
            try {
                sqlEngineFactory.getCheckedQueryEngine(name);
            } catch (SqlEngineException ex) {
                errors.append(ex.getMessage()).append("\n");
            }
        }
        return errors.length() == 0 ? OK : errors.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String initCrudEngines(String names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names.split(",")) {
            try {
                sqlEngineFactory.getCheckedCrudEngine(name);
            } catch (SqlEngineException ex) {
                errors.append(ex.getMessage()).append("\n");
            }
        }
        return errors.length() == 0 ? OK : errors.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String initProcedureEngines(String names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names.split(",")) {
            try {
                sqlEngineFactory.getCheckedProcedureEngine(name);
            } catch (SqlEngineException ex) {
                errors.append(ex.getMessage()).append("\n");
            }
        }
        return errors.length() == 0 ? OK : errors.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String resetQueryEngines(String names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names.split(",")) {
            try {
                sqlEngineFactory.getCheckedStaticQueryEngine(name);
            } catch (SqlEngineException ex) {
                errors.append(ex.getMessage()).append("\n");
            }
        }
        return errors.length() == 0 ? OK : errors.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String resetCrudEngines(String names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names.split(",")) {
            try {
                sqlEngineFactory.getCheckedStaticCrudEngine(name);
            } catch (SqlEngineException ex) {
                errors.append(ex.getMessage()).append("\n");
            }
        }
        return errors.length() == 0 ? OK : errors.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String resetProcedureEngines(String names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names.split(",")) {
            try {
                sqlEngineFactory.getCheckedStaticProcedureEngine(name);
            } catch (SqlEngineException ex) {
                errors.append(ex.getMessage()).append("\n");
            }
        }
        return errors.length() == 0 ? OK : errors.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String newQueryEngine(String name, String sqlStatement) throws SqlEngineException {
        try {
            sqlEngineFactory.getDynamicQueryEngine(name, sqlStatement);
        } catch (SqlEngineException ex) {
            return ex.getMessage();
        }
        return OK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String newCrudEngine(String name, String sqlStatement) {
        try {
            sqlEngineFactory.getDynamicCrudEngine(name, sqlStatement);
        } catch (SqlEngineException ex) {
            return ex.getMessage();
        }
        return OK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String newProcedureEngine(String name, String sqlStatement) {
        try {
            sqlEngineFactory.getDynamicProcedureEngine(name, sqlStatement);
        } catch (SqlEngineException ex) {
            return ex.getMessage();
        }
        return OK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getNames() {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (String name : sqlEngineFactory.getNames()) {
            if (first)
                first = false;
            else
                sb.append(",");
            sb.append(name);
        }
        return sb.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDynamicNames() {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (String name : sqlEngineFactory.getDynamicNames()) {
            if (first)
                first = false;
            else
                sb.append(",");
            sb.append(name);
        }
        return sb.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isLazyInit() {
        return sqlEngineFactory.isLazyInit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean setTrace(String name, Integer trace) {
        Map<String, SqlEngine> dynamicEngines = sqlEngineFactory.getDynamicEngines();
        if (dynamicEngines.containsKey(name)) {
            dynamicEngines.get(name).setTrace(trace);
            return true;
        }
        Map<String, SqlEngine> engines = sqlEngineFactory.getEngines();
        if (engines.containsKey(name)) {
            engines.get(name).setTrace(trace);
            return true;
        }
        return false;
    }

    /**
     * Sets the SQL Engine factory instance
     * 
     * @param sqlEngineFactory
     *            the SQL Engine factory instance
     */
    public void setSqlEngineFactory(SqlEngineFactory sqlEngineFactory) {
        this.sqlEngineFactory = sqlEngineFactory;
    }
}
