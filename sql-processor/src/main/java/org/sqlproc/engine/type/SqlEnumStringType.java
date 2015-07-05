package org.sqlproc.engine.type;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.impl.BeanUtils;

/**
 * The META type ENUMSTRING.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlEnumStringType extends SqlProviderType {

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
        return new String[] { "ENUMSTRING", "ESTRING" };
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
        Class<?> attributeType = BeanUtils.getFieldType(resultInstance.getClass(), attributeName);
        Method m = BeanUtils.getSetter(resultInstance, attributeName, attributeType);
        if (m != null) {
            Object enumInstance = BeanUtils.getValueToEnum(runtimeCtx, attributeType, resultValue);
            BeanUtils.simpleInvokeMethod(m, resultInstance, enumInstance);
        } else if (ingoreError) {
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
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, final Object inputValue,
            final Class<?> inputType, boolean ingoreError) throws SqlRuntimeException {
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
                    logger.error("Incorrect string based enum " + inputValue + " for " + paramName);
                } else {
                    throw new SqlRuntimeException("Incorrect string based enum " + inputValue + " for " + paramName);
                }
            } else {
                List<String> vals = new ArrayList<String>();
                for (Iterator iter = ((Collection) inputValue).iterator(); iter.hasNext();) {
                    Object val = iter.next();
                    if (!val.getClass().isEnum()) {
                        if (ingoreError) {
                            logger.error("Incorrect string based enum item " + val + " for " + paramName);
                        } else {
                            throw new SqlRuntimeException("Incorrect string based enum item " + val + " for "
                                    + paramName);
                        }
                    } else {
                        Object o = BeanUtils.getEnumToValue(runtimeCtx, val);
                        if (o != null && o instanceof String) {
                            vals.add((String) o);
                        } else {
                            if (ingoreError) {
                                logger.error("Incorrect string based enum item value " + o + " for " + paramName);
                            } else {
                                throw new SqlRuntimeException("Incorrect string based enum item value " + o + " for "
                                        + paramName);
                            }
                        }
                    }
                }
                query.setParameterList(paramName, vals.toArray());
            }
        } else {
            Object o = BeanUtils.getEnumToValue(runtimeCtx, inputValue);
            if (o != null && o instanceof String) {
                query.setParameter(paramName, (String) o, getProviderSqlType());
            } else
                logger.error("ENUM_STRING parameter " + paramName + " " + inputValue + " " + inputValue.getClass()
                        + " " + o);
        }
    }
}
