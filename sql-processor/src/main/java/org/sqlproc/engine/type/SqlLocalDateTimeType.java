package org.sqlproc.engine.type;

import java.sql.Timestamp;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * The META type LOCALDATETIME.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlLocalDateTimeType extends SqlDefaultType {

    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { java.time.LocalDateTime.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "LOCALDATETIME" };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException {
        setResultEntryLog(logger, this, runtimeCtx, resultInstance, attributeName, resultValue, ingoreError);

        if (resultValue instanceof java.sql.Timestamp) {
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName,
                    ((java.sql.Timestamp) resultValue).toLocalDateTime(), java.time.LocalDateTime.class))
                return;
            error(logger, ingoreError, "There's no setter for " + attributeName + " in " + resultInstance
                    + ", META type is " + getMetaTypes()[0]);
            return;
        }
        error(logger, ingoreError,
                "Incorrect localdatetime " + resultValue + " for " + attributeName + " in " + resultInstance);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object inputValue,
            boolean ingoreError, Class<?>... inputTypes) throws SqlRuntimeException {
        setParameterEntryLog(logger, this, runtimeCtx, query, paramName, inputValue, ingoreError, inputTypes);

        if (inputValue == null) {
            query.setParameter(paramName, inputValue, getProviderSqlType());
        } else if (inputValue instanceof java.time.LocalDateTime) {
            Timestamp value = Timestamp.valueOf((java.time.LocalDateTime) inputValue);
            query.setParameter(paramName, value, getProviderSqlType());
        }
    }
}
