package org.sqlproc.engine.type;

import java.util.Calendar;
import java.util.Date;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * The META type TODATE.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlToDateType extends SqlProviderType {

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
    public void addScalar(SqlQuery query, String dbName, Class<?> attributeType) {
        query.addScalar(dbName, getProviderSqlType());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(Object pojo, String attributeName, Object resultValue, boolean ingoreError) {
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameter(SqlQuery query, String paramName, Object inputValue, Class<?> inputType,
            boolean ingoreError) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setParameter " + getMetaTypes()[0] + ": paramName=" + paramName + ", inputValue="
                    + inputValue + ", inputType=" + inputType);
        }
        if (inputValue == null) {
            query.setParameter(paramName, inputValue, getProviderSqlNullType());
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
        } else if (inputValue instanceof Date) {
            Calendar cal = Calendar.getInstance();
            cal.setTime((Date) inputValue);
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.MILLISECOND, 0);
            cal.getTime();
            cal.add(Calendar.DAY_OF_MONTH, 1);
            query.setParameter(paramName, cal.getTime(), getProviderSqlType());
        } else if (ingoreError) {
            logger.error("Incorrect todate " + inputValue + " for " + paramName);
        } else {
            throw new SqlRuntimeException("Incorrect todate " + inputValue + " for " + paramName);
        }
    }
}
