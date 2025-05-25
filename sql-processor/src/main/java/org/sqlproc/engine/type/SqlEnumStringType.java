package org.sqlproc.engine.type;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * The META type ENUMSTRING.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlEnumStringType extends SqlDefaultType {

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
    @Override
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName, Object resultValue,
            boolean ingoreError) throws SqlRuntimeException {
        setResultEntryLog(logger, this, runtimeCtx, resultInstance, attributeName, resultValue, ingoreError);

        Class<?> attributeType = runtimeCtx.getAttributeType(resultInstance.getClass(), attributeName);
        Object enumInstance = runtimeCtx.getValueToEnum(attributeType, resultValue);
        if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, enumInstance, attributeType))
            return;
        error(logger, ingoreError, "There's no getter for " + attributeName + " in " + resultInstance
                + ", META type is " + getMetaTypes()[0]);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, final Object inputValue,
            boolean ingoreError, Class<?>... inputTypes) throws SqlRuntimeException {
        setParameterEntryLog(logger, this, runtimeCtx, query, paramName, inputValue, ingoreError, inputTypes);

        if (inputValue == null) {
            query.setParameter(paramName, inputValue, getProviderSqlType());
        } else if (!inputValue.getClass().isEnum()) {
            if (!(inputValue instanceof Collection)) {
                if (inputValue instanceof OutValueSetter) {
                    query.setParameter(paramName, inputValue, getProviderSqlType());
                } else {
                    error(logger, ingoreError, "Incorrect string based enum " + inputValue + " for " + paramName);
                    return;
                }
            } else {
                List<String> vals = new ArrayList<String>();
                for (Iterator<?> iter = ((Collection<?>) inputValue).iterator(); iter.hasNext();) {
                    Object val = iter.next();
                    if (!val.getClass().isEnum()) {
                        error(logger, ingoreError, "Incorrect string based enum item " + val + " for " + paramName);
                        return;
                    } else {
                        Object o = runtimeCtx.getEnumToValue(val);
                        if (o != null && o instanceof String) {
                            vals.add((String) o);
                        } else {
                            error(logger, ingoreError,
                                    "Incorrect string based enum item value " + o + " for " + paramName);
                            return;
                        }
                    }
                }
                query.setParameterList(paramName, vals.toArray());
            }
        } else {
            Object o = runtimeCtx.getEnumToValue(inputValue);
            if (o != null && o instanceof String) {
                query.setParameter(paramName, (String) o, getProviderSqlType());
            } else
                error(logger, ingoreError, "ENUM_STRING parameter " + paramName + " " + inputValue + " "
                        + inputValue.getClass() + " " + o);
        }
    }
}
