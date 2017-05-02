package org.sqlproc.engine.type;

import java.sql.Time;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * The META type LOCALTIME.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlLocalTimeType extends SqlDefaultType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { java.time.LocalTime.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "LOCALTIME" };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException {
        setResultEntryLog(logger, this, runtimeCtx, resultInstance, attributeName, resultValue, ingoreError);

        if (resultValue instanceof java.sql.Time) {
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName,
                    ((java.sql.Time) resultValue).toLocalTime(), java.time.LocalTime.class))
                return;
            error(logger, ingoreError, "There's no setter for " + attributeName + " in " + resultInstance
                    + ", META type is " + getMetaTypes()[0]);
            return;
        }
        error(logger, ingoreError,
                "Incorrect localtime " + resultValue + " for " + attributeName + " in " + resultInstance);
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
        } else if (inputValue instanceof java.time.LocalTime) {
            Time value = Time.valueOf((java.time.LocalTime) inputValue);
            query.setParameter(paramName, value, getProviderSqlType());
        } else {
            error(logger, ingoreError, "Incorrect localtime " + inputValue + " for " + paramName);
        }
    }
}
