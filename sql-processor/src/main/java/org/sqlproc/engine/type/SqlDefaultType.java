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
public abstract class SqlDefaultType implements SqlTaggedMetaType {

    /**
     * The internal slf4j logger.
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Returns the list of Java class types related to this META type for SqlDefaultType processing.
     * 
     * @return the list of Java class types related to this META type for SqlDefaultType processing
     */
    public Class<?>[] getClassTypesForDefault() {
        return getClassTypes();
    }

    /**
     * {@inheritDoc}
     */
    public void addScalar(SqlTypeFactory typeFactory, SqlQuery query, String dbName, Class<?>... attributeTypes) {
        addScalarEntryLog(logger, this, typeFactory, query, dbName, attributeTypes);

        if (getProviderSqlType() != null) {
            query.addScalar(dbName, getProviderSqlType());
        } else {
            SqlMetaType type = (attributeTypes.length > 0) ? typeFactory.getMetaType(attributeTypes[0]) : null;
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
        setResultEntryLog(logger, this, runtimeCtx, resultInstance, attributeName, resultValue, ingoreError);

        if (getClassTypesForDefault() != null && getClassTypesForDefault().length > 0) {
            if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, resultValue, getClassTypesForDefault()))
                return;
            error(logger, ingoreError, "There's no default setter for '" + attributeName + "' in " + resultInstance
                    + ", META type is " + this);
            return;
        }

        Class<?> attributeType = runtimeCtx.getAttributeType(resultInstance.getClass(), attributeName);
        if (attributeType == null) {
            error(logger, ingoreError, "There's problem with attribute type for '" + attributeName + "' in "
                    + resultInstance + ", META type is " + this);
            return;
        }

        if (resultValue != null && resultValue instanceof BigDecimal && attributeType != BigDecimal.class)
            resultValue = (Integer) ((BigDecimal) resultValue).intValue();
        else if (resultValue != null && resultValue instanceof BigInteger && attributeType != BigInteger.class)
            resultValue = (Integer) ((BigInteger) resultValue).intValue();

        if (attributeType.isEnum()) {
            Class enumType = runtimeCtx.getEnumToClass(attributeType);
            if (enumType == Integer.class || enumType == int.class)
                runtimeCtx.getTypeFactory().getEnumIntegerType().setResult(runtimeCtx, resultInstance, attributeName,
                        resultValue, ingoreError);
            else if (enumType == String.class)
                runtimeCtx.getTypeFactory().getEnumStringType().setResult(runtimeCtx, resultInstance, attributeName,
                        resultValue, ingoreError);
            else {
                error(logger, ingoreError, "There's no enum setter for '" + attributeName + "' in " + resultInstance
                        + ", META type is " + this);
                return;
            }
        } else {
            if (getProviderSqlType() == null) {
                SqlMetaType type = runtimeCtx.getTypeFactory().getMetaType(attributeType);
                if (type != null) {
                    type.setResult(runtimeCtx, resultInstance, attributeName, resultValue, ingoreError);
                    return;
                }
            }
            error(logger, ingoreError,
                    "There's no setter for '" + attributeName + "' in " + resultInstance + ", META type is " + this);
            return;
            // if (runtimeCtx.simpleSetAttribute(resultInstance, attributeName, resultValue, attributeType))
            // return;
            // else {
            // error(logger, ingoreError, "There's no setter for '" + attributeName + "' in " + resultInstance
            // + ", META type is " + this);
            // return;
            // }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object inputValue,
            boolean ingoreError, Class<?>... inputTypes) throws SqlRuntimeException {
        setParameterEntryLog(logger, this, runtimeCtx, query, paramName, inputValue, ingoreError, inputTypes);

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
            if (inputTypes[0].isEnum()) {
                Class clazz = runtimeCtx.getEnumToClass(inputTypes[0]);
                if (clazz == String.class) {
                    runtimeCtx.getTypeFactory().getEnumStringType().setParameter(runtimeCtx, query, paramName,
                            inputValue, ingoreError, inputTypes);
                } else if (clazz == Integer.class) {
                    runtimeCtx.getTypeFactory().getEnumIntegerType().setParameter(runtimeCtx, query, paramName,
                            inputValue, ingoreError, inputTypes);
                } else {
                    error(logger, ingoreError, "Incorrect type based enum " + inputValue + " for " + paramName
                            + ", META type is DEFAULT" + this);
                    return;
                }
            } else {
                SqlMetaType type = runtimeCtx.getTypeFactory().getMetaType(inputTypes[0]);
                if (type != null) {
                    type.setParameter(runtimeCtx, query, paramName, inputValue, ingoreError, inputTypes);
                } else {
                    error(logger, ingoreError, "Incorrect default type " + inputValue + " for " + paramName
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
                    error(logger, ingoreError, "Incorrect type based enum item value " + o + " for " + paramName
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
}
