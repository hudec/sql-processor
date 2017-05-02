package org.sqlproc.engine.type;

import java.util.Calendar;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * The META type TODATE.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlToDateType extends SqlDefaultType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] {};
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "TODATE" };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(SqlRuntimeContext runtimeCtx, Object pojo, String attributeName, Object resultValue,
            boolean ingoreError) {
        throw new UnsupportedOperationException();
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
        } else if (inputValue instanceof java.sql.Timestamp) {
            Calendar cal = Calendar.getInstance();
            cal.setTime((java.sql.Timestamp) inputValue);
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.MILLISECOND, 0);
            cal.getTime();
            cal.add(Calendar.DAY_OF_MONTH, 1);
            query.setParameter(paramName, cal.getTime(), getProviderSqlType());
        } else if (inputValue instanceof java.util.Date) {
            Calendar cal = Calendar.getInstance();
            cal.setTime((java.util.Date) inputValue);
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.MILLISECOND, 0);
            cal.getTime();
            cal.add(Calendar.DAY_OF_MONTH, 1);
            query.setParameter(paramName, cal.getTime(), getProviderSqlType());
        } else {
            error(logger, ingoreError, "Incorrect todate " + inputValue + " for " + paramName);
        }
    }
}
