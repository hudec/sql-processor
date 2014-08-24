package org.sqlproc.engine.jmx;

import org.sqlproc.engine.SqlEngineException;
import org.sqlproc.engine.jdbc.JdbcEngineFactory;
import org.sqlproc.engine.jdbc.jmx.SqlEngineFactoryMXBean;

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
public class JdbcEngineFactoryMXBean extends JdbcEngineFactory implements SqlEngineFactoryMXBean {

    public JdbcEngineFactoryMXBean() {
        super();
    }

    public JdbcEngineFactoryMXBean(boolean lazyInit) {
        super(lazyInit);
    }

    public static final String OK = "OK";

    /**
     * {@inheritDoc}
     */
    @Override
    public String initQueryEngines(String... names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names) {
            try {
                getCheckedQueryEngine(name);
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
    public String initCrudEngines(String... names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names) {
            try {
                getCheckedCrudEngine(name);
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
    public String initProcedureEngines(String... names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names) {
            try {
                getCheckedProcedureEngine(name);
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
    public String resetQueryEngines(String... names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names) {
            try {
                getCheckedStaticQueryEngine(name);
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
    public String resetCrudEngines(String... names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names) {
            try {
                getCheckedStaticCrudEngine(name);
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
    public String resetProcedureEngines(String... names) {
        StringBuilder errors = new StringBuilder();
        for (String name : names) {
            try {
                getCheckedStaticProcedureEngine(name);
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
            getDynamicQueryEngine(name, sqlStatement);
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
            getDynamicCrudEngine(name, sqlStatement);
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
            getDynamicProcedureEngine(name, sqlStatement);
        } catch (SqlEngineException ex) {
            return ex.getMessage();
        }
        return OK;
    }
}
