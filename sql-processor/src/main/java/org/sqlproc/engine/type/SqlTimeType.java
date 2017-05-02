package org.sqlproc.engine.type;

import java.util.Date;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * The META type TIME.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlTimeType extends SqlDefaultType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { java.sql.Time.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "TIME" };
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
        } else if (inputValue instanceof java.sql.Time) {
            query.setParameter(paramName, (java.sql.Time) inputValue, getProviderSqlType());
        } else if (inputValue instanceof Date) {
            query.setParameter(paramName, (Date) inputValue, getProviderSqlType());
        } else {
            error(logger, ingoreError, "Incorrect time " + inputValue + " for " + paramName);
        }
    }
}
