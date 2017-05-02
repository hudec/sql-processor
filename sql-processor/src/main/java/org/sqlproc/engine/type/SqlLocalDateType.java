package org.sqlproc.engine.type;

import java.sql.Date;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * The META type LOCALDATE.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlLocalDateType extends SqlDefaultType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { java.time.LocalDate.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "LOCALDATE" };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException {
        setResultEntryLog(logger, this, runtimeCtx, resultInstance, attributeName, resultValue, ingoreError);

        if (resultValue instanceof java.sql.Date) {
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName,
                    ((java.sql.Date) resultValue).toLocalDate(), java.time.LocalDate.class))
                return;
            error(logger, ingoreError, "There's no setter for " + attributeName + " in " + resultInstance
                    + ", META type is " + getMetaTypes()[0]);
            return;
        }
        error(logger, ingoreError,
                "Incorrect localdate " + resultValue + " for " + attributeName + " in " + resultInstance);
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
        } else if (inputValue instanceof java.time.LocalDate) {
            Date value = Date.valueOf((java.time.LocalDate) inputValue);
            query.setParameter(paramName, value, getProviderSqlType());
        } else {
            error(logger, ingoreError, "Incorrect localdate " + inputValue + " for " + paramName);
        }
    }
}
