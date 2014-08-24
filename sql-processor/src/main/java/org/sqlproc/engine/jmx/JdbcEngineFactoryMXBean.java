package org.sqlproc.engine.jmx;

import org.sqlproc.engine.SqlEngineException;
import org.sqlproc.engine.jdbc.JdbcEngineFactory;
import org.sqlproc.engine.jdbc.jmx.SqlEngineFactoryMXBean;

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
    public String initQueryEngine(String name) {
        try {
            getCheckedQueryEngine(name);
        } catch (SqlEngineException ex) {
            return ex.getMessage();
        }
        return OK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String initCrudEngine(String name) {
        try {
            getCheckedCrudEngine(name);
        } catch (SqlEngineException ex) {
            return ex.getMessage();
        }
        return OK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String initProcedureEngine(String name) {
        try {
            getCheckedProcedureEngine(name);
        } catch (SqlEngineException ex) {
            return ex.getMessage();
        }
        return OK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String resetQueryEngine(String name) {
        try {
            getCheckedStaticQueryEngine(name);
        } catch (SqlEngineException ex) {
            return ex.getMessage();
        }
        return OK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String resetCrudEngine(String name) {
        try {
            getCheckedStaticCrudEngine(name);
        } catch (SqlEngineException ex) {
            return ex.getMessage();
        }
        return OK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String resetProcedureEngine(String name) {
        try {
            getCheckedStaticProcedureEngine(name);
        } catch (SqlEngineException ex) {
            return ex.getMessage();
        }
        return OK;
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
