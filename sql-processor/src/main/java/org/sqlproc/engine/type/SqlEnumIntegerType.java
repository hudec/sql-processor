package org.sqlproc.engine.type;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.sqlproc.engine.BeanUtils;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * The META type ENUMINTEGER.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlEnumIntegerType extends SqlProviderType {

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
        return new String[] { "EINTEGER", "EINT" };
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
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName,
            Object resultValue, boolean ingoreError) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setResult " + getMetaTypes()[0] + ": resultInstance=" + resultInstance
                    + ", attributeName=" + attributeName + ", resultValue=" + resultValue);
        }
        Class<?> attributeType = BeanUtils.getAttributeType(resultInstance.getClass(), attributeName);
        Object enumInstance = BeanUtils.getValueToEnum(runtimeCtx, attributeType, resultValue);
        if (BeanUtils.simpleInvokeSetter(resultInstance, attributeName, enumInstance, attributeType))
            return;
        if (ingoreError) {
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
        } else if (!inputValue.getClass().isEnum()) {
            if (!(inputValue instanceof Collection)) {
                if (inputValue instanceof OutValueSetter) {
                    query.setParameter(paramName, inputValue, getProviderSqlType());
                } else if (ingoreError) {
                    logger.error("Incorrect integer based enum " + inputValue + " for " + paramName);
                } else {
                    throw new SqlRuntimeException("Incorrect integer based enum " + inputValue + " for " + paramName);
                }
            } else {
                List<Integer> vals = new ArrayList<Integer>();
                for (Iterator iter = ((Collection) inputValue).iterator(); iter.hasNext();) {
                    Object val = iter.next();
                    if (!val.getClass().isEnum()) {
                        if (ingoreError) {
                            logger.error("Incorrect integer based enum item " + val + " for " + paramName);
                        } else {
                            throw new SqlRuntimeException("Incorrect integer based enum item " + val + " for "
                                    + paramName);
                        }
                    } else {
                        Object o = BeanUtils.getEnumToValue(runtimeCtx, val);
                        if (o != null && o instanceof Integer) {
                            vals.add((Integer) o);
                        } else {
                            if (ingoreError) {
                                logger.error("Incorrect integer based enum item value " + o + " for " + paramName);
                            } else {
                                throw new SqlRuntimeException("Incorrect integer based enum item value " + o + " for "
                                        + paramName);
                            }
                        }
                    }
                }
                query.setParameterList(paramName, vals.toArray());
            }
        } else {
            Object o = BeanUtils.getEnumToValue(runtimeCtx, inputValue);
            if (o != null && o instanceof Integer) {
                query.setParameter(paramName, (Integer) o, getProviderSqlType());
            } else {
                if (ingoreError) {
                    logger.error("Incorrect integer based enum value " + o + " for " + paramName);
                } else {
                    throw new SqlRuntimeException("Incorrect integer based enum value " + o + " for " + paramName);
                }
            }
        }
    }
}
