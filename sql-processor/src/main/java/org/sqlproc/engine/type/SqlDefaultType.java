package org.sqlproc.engine.type;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * The default META type for the JDBC stack. It's used in the case there's no explicit META type declaration in the META
 * SQL statements.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public abstract class SqlDefaultType implements SqlMetaType {

    /**
     * The internal slf4j logger.
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Returns the list of Java class types related to this META type for SqlDefaultType processing.
     * 
     * @return the list of Java class types related to this META type for SqlDefaultType processing
     */
    public abstract Class<?>[] getClassTypesForDefault();

    /**
     * {@inheritDoc}
     */
    public void addScalar(SqlTypeFactory typeFactory, SqlQuery query, String dbName, Class<?> attributeType) {
        if (getProviderSqlType() != null) {
            query.addScalar(dbName, getProviderSqlType());
        } else {
            Object type = typeFactory.getMetaType(attributeType);
            if (type != null)
                query.addScalar(dbName, type);
            else
                query.addScalar(dbName);
        }
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

        if (getClassTypesForDefault() != null && getClassTypesForDefault().length >= 0) {
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, resultValue, getClassTypesForDefault()))
                return;
            error(ingoreError,
                    "There's no getter for " + attributeName + " in " + resultInstance + ", META type is " + this);
            return;
        }

        Class<?> attributeType = runtimeCtx.getAttributeType(resultInstance.getClass(), attributeName);
        if (attributeType == null) {
            error(ingoreError, "There's problem with attribute type for '" + attributeName + "' in " + resultInstance
                    + ", META type is " + this);
            return;
        }

        if (resultValue != null && resultValue instanceof BigDecimal && attributeType != BigDecimal.class)
            resultValue = (Integer) ((BigDecimal) resultValue).intValue();
        else if (resultValue != null && resultValue instanceof BigInteger && attributeType != BigInteger.class)
            resultValue = (Integer) ((BigInteger) resultValue).intValue();

        if (attributeType.isEnum()) {
            Object enumInstance = runtimeCtx.getValueToEnum(attributeType, resultValue);
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, enumInstance, attributeType))
                return;
            else {
                error(ingoreError, "There's no getter for '" + attributeName + "' in " + resultInstance
                        + ", META type is " + this);
                return;
            }
        } else {
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, resultValue, attributeType))
                return;
            else {
                error(ingoreError, "There's no getter for '" + attributeName + "' in " + resultInstance
                        + ", META type is " + this);
                return;
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object inputValue,
            Class<?> inputType, boolean ingoreError) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setParameter for META type " + this + ": paramName=" + paramName + ", inputValue="
                    + inputValue + ", inputType=" + inputType);
        }

        if (getProviderSqlType() != null) {
            if (inputValue == null) {
                query.setParameter(paramName, inputValue, getProviderSqlType());
            } else if (inputValue instanceof Collection) {
                query.setParameterList(paramName, ((Collection) inputValue).toArray(), getProviderSqlType());
            } else {
                query.setParameter(paramName, inputValue, getProviderSqlType());
            }
            return;
        }

        if (!(inputValue instanceof Collection)) {
            if (inputType.isEnum()) {
                Class clazz = runtimeCtx.getEnumToClass(inputType);
                if (clazz == String.class) {
                    runtimeCtx.getTypeFactory().getEnumStringType().setParameter(runtimeCtx, query, paramName,
                            inputValue, inputType, ingoreError);
                } else if (clazz == Integer.class) {
                    runtimeCtx.getTypeFactory().getEnumIntegerType().setParameter(runtimeCtx, query, paramName,
                            inputValue, inputType, ingoreError);
                } else {
                    error(ingoreError, "Incorrect type based enum " + inputValue + " for " + paramName
                            + ", META type is DEFAULT" + this);
                    return;
                }
            } else {
                SqlMetaType type = runtimeCtx.getTypeFactory().getMetaType(inputType);
                if (type != null) {
                    type.setParameter(runtimeCtx, query, paramName, inputValue, inputType, ingoreError);
                } else {
                    error(ingoreError, "Incorrect default type " + inputValue + " for " + paramName
                            + ", META type is DEFAULT" + this);
                    return;
                }
            }
        } else {
            List<Object> vals = new ArrayList<Object>();
            boolean isEnum = false;
            for (Iterator iter = ((Collection) inputValue).iterator(); iter.hasNext();) {
                Object val = iter.next();
                if (!val.getClass().isEnum())
                    break;
                else
                    isEnum = true;
                Object o = runtimeCtx.getEnumToValue(val);
                if (o != null) {
                    vals.add(o);
                } else {
                    error(ingoreError, "Incorrect type based enum item value " + o + " for " + paramName
                            + ", META type is DEFAULT" + this);
                    return;
                }
            }
            if (isEnum) {
                query.setParameterList(paramName, vals.toArray());
            } else {
                query.setParameterList(paramName, ((Collection) inputValue).toArray());
            }
        }
    }

    protected void error(boolean ingoreError, String msg) {
        if (ingoreError) {
            logger.error(msg);
        } else {
            throw new SqlRuntimeException(msg);
        }
    }
}
