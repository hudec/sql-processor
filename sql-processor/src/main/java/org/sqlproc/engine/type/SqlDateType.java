package org.sqlproc.engine.type;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * The META type DATE.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlDateType extends SqlDefaultType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { java.sql.Date.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "DATE" };
    }

    private static final Class[] CLASS_TYPES = { java.sql.Date.class, java.util.Date.class };

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException {
        runtimeCtx.simpleSetAttribute(resultInstance, attributeName, resultValue, CLASS_TYPES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object inputValue,
            boolean ingoreError, Class<?>... inputTypes) throws SqlRuntimeException {
        setParameterEntryLog(logger, this, runtimeCtx, query, paramName, inputValue, ingoreError, inputTypes);

        if (inputValue == null) {
            query.setParameter(paramName, null, getProviderSqlType());
        } else if (inputValue instanceof java.sql.Date) {
            query.setParameter(paramName, (java.sql.Date) inputValue, getProviderSqlType());
        } else if (inputValue instanceof java.util.Date) {
            query.setParameter(paramName, (java.util.Date) inputValue, getProviderSqlType());
        } else {
            error(logger, ingoreError, "Incorrect date " + inputValue + " for " + paramName);
        }
    }
}
