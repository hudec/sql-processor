package org.sqlproc.engine.type;

import java.util.Calendar;
import java.util.Date;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * The META type DATETIME.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlDateTimeType extends SqlDefaultType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypesForDefault() {
        return new Class[] { java.sql.Timestamp.class, java.util.Date.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "DATETIME" };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setResult for META type " + this + ": resultInstance=" + resultInstance
                    + ", attributeName=" + attributeName + ", resultValue=" + resultValue + ", resultType"
                    + ((resultValue != null) ? resultValue.getClass() : null));
        }

        if (resultValue instanceof java.sql.Timestamp)
            ((java.sql.Timestamp) resultValue).setNanos(0);
        super.setResult(runtimeCtx, resultInstance, attributeName, resultValue, ingoreError);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object inputValue,
            boolean ingoreError, Class<?>... inputTypes) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setParameter for META type " + this + ": paramName=" + paramName + ", inputValue="
                    + inputValue + ", inputTypes=" + inputTypes);
        }

        if (inputValue == null) {
            query.setParameter(paramName, inputValue, getProviderSqlType());
        } else if (inputValue instanceof java.sql.Timestamp) {
            Calendar cal = Calendar.getInstance();
            cal.setTime((java.sql.Timestamp) inputValue);
            cal.set(Calendar.MILLISECOND, 0);
            query.setParameter(paramName, cal.getTime(), getProviderSqlType());
        } else if (inputValue instanceof Date) {
            Calendar cal = Calendar.getInstance();
            cal.setTime((Date) inputValue);
            cal.set(Calendar.MILLISECOND, 0);
            query.setParameter(paramName, cal.getTime(), getProviderSqlType());
        } else {
            error(ingoreError, "Incorrect datetime " + inputValue + " for " + paramName);
        }
    }
}
