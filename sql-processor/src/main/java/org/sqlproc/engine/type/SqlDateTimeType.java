package org.sqlproc.engine.type;

import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.impl.BeanUtils;

/**
 * The META type DATETIME.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlDateTimeType extends SqlProviderType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { java.util.Date.class };
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
    public void addScalar(SqlQuery query, String dbName, Class<?> attributeType) {
        query.addScalar(dbName, getProviderSqlType());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(SqlRuntimeContext runtime, Object resultInstance, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setResult " + getMetaTypes()[0] + ": resultInstance=" + resultInstance
                    + ", attributeName=" + attributeName + ", resultValue=" + resultValue + ", resultType"
                    + ((resultValue != null) ? resultValue.getClass() : null));
        }
        Method m = BeanUtils.getSetter(resultInstance, attributeName, java.sql.Timestamp.class, java.util.Date.class);
        if (m != null) {
            if (resultValue instanceof java.sql.Timestamp) {
                ((java.sql.Timestamp) resultValue).setNanos(0);
                BeanUtils.simpleInvokeMethod(m, resultInstance, resultValue);
            } else if (resultValue instanceof java.util.Date) {
                BeanUtils.simpleInvokeMethod(m, resultInstance, resultValue);
            } else if (ingoreError) {
                logger.error("Incorrect datetime " + resultValue + " for " + attributeName + " in " + resultInstance);
            } else {
                throw new SqlRuntimeException("Incorrect datetime " + resultValue + " for " + attributeName + " in "
                        + resultInstance);
            }
        } else if (ingoreError) {
            logger.error("There's no setter for " + attributeName + " in " + resultInstance + ", META type is "
                    + getMetaTypes()[0]);
        } else {
            throw new SqlRuntimeException("There's no setter for " + attributeName + " in " + resultInstance
                    + ", META type is " + getMetaTypes()[0]);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameter(SqlRuntimeContext runtime, SqlQuery query, String paramName, Object inputValue,
            Class<?> inputType, boolean ingoreError) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setParameter " + getMetaTypes()[0] + ": paramName=" + paramName + ", inputValue="
                    + inputValue + ", inputType=" + inputType);
        }
        if (inputValue == null) {
            query.setParameter(paramName, inputValue, getProviderSqlNullType());
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
        } else if (ingoreError) {
            logger.error("Incorrect datetime " + inputValue + " for " + paramName);
        } else {
            throw new SqlRuntimeException("Incorrect datetime " + inputValue + " for " + paramName);
        }
    }
}
