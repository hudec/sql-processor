package org.sqlproc.engine.type;

import java.lang.reflect.Method;
import java.util.Collection;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.impl.BeanUtils;

/**
 * The META type CHARACTER.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlCharType extends SqlProviderType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getClassTypes() {
        return new Class[] { Character.class, char.class };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getMetaTypes() {
        return new String[] { "CHARACTER", "CHAR" };
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
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setResult " + getMetaTypes()[0] + ": resultInstance=" + resultInstance
                    + ", attributeName=" + attributeName + ", resultValue=" + resultValue + ", resultType"
                    + ((resultValue != null) ? resultValue.getClass() : null));
        }
        Method m = BeanUtils.getSetter(resultInstance, attributeName, getClassTypes());
        if (m != null)
            BeanUtils.simpleInvokeMethod(m, resultInstance, resultValue);
        else if (ingoreError) {
            logger.error("There's no getter for " + attributeName + " in " + resultInstance + ", META type is "
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
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object inputValue,
            Class<?> inputType, boolean ingoreError) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setParameter " + getMetaTypes()[0] + ": paramName=" + paramName + ", inputValue="
                    + inputValue + ", inputType=" + inputType);
        }
        if (inputValue == null) {
            query.setParameter(paramName, inputValue, getProviderSqlNullType());
        } else if (inputValue instanceof Collection) {
            query.setParameterList(paramName, ((Collection) inputValue).toArray(), getProviderSqlType());
        } else {
            query.setParameter(paramName, inputValue, getProviderSqlType());
        }
    }
}
