package org.sqlproc.engine.jdbc.type;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Blob;
import java.sql.Clob;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.impl.BeanUtils;
import org.sqlproc.engine.impl.SqlProcessContext;
import org.sqlproc.engine.impl.SqlUtils;
import org.sqlproc.engine.type.SqlMetaType;

/**
 * The default META type for the JDBC stack. It's used in the case there's no explicit META type declaration in the META
 * SQL statements.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcDefaultType extends SqlMetaType {

    /**
     * The map between the Java types and the META types.
     */
    static Map<Class<?>, Object> jdbcTypes = new HashMap<Class<?>, Object>();
    /**
     * Static initialization.
     */
    static {
        jdbcTypes.put(int.class, JdbcTypeFactory.INTEGER);
        jdbcTypes.put(Integer.class, JdbcTypeFactory.INTEGER);
        jdbcTypes.put(long.class, JdbcTypeFactory.LONG);
        jdbcTypes.put(Long.class, JdbcTypeFactory.LONG);
        jdbcTypes.put(short.class, JdbcTypeFactory.SHORT);
        jdbcTypes.put(Short.class, JdbcTypeFactory.SHORT);
        jdbcTypes.put(byte.class, JdbcTypeFactory.BYTE);
        jdbcTypes.put(Byte.class, JdbcTypeFactory.BYTE);
        jdbcTypes.put(float.class, JdbcTypeFactory.FLOAT);
        jdbcTypes.put(Float.class, JdbcTypeFactory.FLOAT);
        jdbcTypes.put(double.class, JdbcTypeFactory.DOUBLE);
        jdbcTypes.put(Double.class, JdbcTypeFactory.DOUBLE);
        jdbcTypes.put(char.class, JdbcTypeFactory.CHAR);
        jdbcTypes.put(Character.class, JdbcTypeFactory.CHAR);
        jdbcTypes.put(String.class, JdbcTypeFactory.STRING);
        jdbcTypes.put(java.util.Date.class, JdbcTypeFactory.TIMESTAMP);
        jdbcTypes.put(java.sql.Timestamp.class, JdbcTypeFactory.TIMESTAMP);
        jdbcTypes.put(java.sql.Date.class, JdbcTypeFactory.DATE);
        jdbcTypes.put(java.sql.Time.class, JdbcTypeFactory.TIME);
        jdbcTypes.put(boolean.class, JdbcTypeFactory.BOOLEAN);
        jdbcTypes.put(Boolean.class, JdbcTypeFactory.BOOLEAN);
        jdbcTypes.put(BigInteger.class, JdbcTypeFactory.BIG_INTEGER);
        jdbcTypes.put(BigDecimal.class, JdbcTypeFactory.BIG_DECIMAL);
        jdbcTypes.put(byte[].class, JdbcTypeFactory.BYTE_ARRAY);
        jdbcTypes.put(Byte[].class, JdbcTypeFactory.BYTE_ARRAY_WRAPPER);
        jdbcTypes.put(Blob.class, JdbcTypeFactory.BLOB);
        jdbcTypes.put(Clob.class, JdbcTypeFactory.CLOB);
    }

    /**
     * {@inheritDoc}
     */
    public void addScalar(SqlQuery query, String dbName, Class<?> attributeType) {
        Object type = jdbcTypes.get(attributeType);
        if (type != null)
            query.addScalar(dbName, type);
        else
            query.addScalar(dbName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setResult(Object resultInstance, String attributeName, Object resultValue, boolean ingoreError)
            throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setResult DEFAULT: resultInstance=" + resultInstance + ", attributeName=" + attributeName
                    + ", resultValue=" + resultValue + ", resultType"
                    + ((resultValue != null) ? resultValue.getClass() : null));
        }
        Class<?> attributeType = BeanUtils.getFieldType(resultInstance.getClass(), attributeName);
        if (attributeType == null) {
            if (ingoreError) {
                logger.error("There's problem with attribute type for '" + attributeName + "' in " + resultInstance
                        + ", META type is DEFAULT");
                return;
            } else {
                throw new SqlRuntimeException("There's problem with attribute type for '" + attributeName + "' in "
                        + resultInstance + ", META type is DEFAULT");
            }
        }
        if (attributeType.isEnum()) {
            Method m = BeanUtils.getSetter(resultInstance, attributeName, attributeType);
            if (m != null) {
                if (resultValue != null && resultValue instanceof BigDecimal)
                    resultValue = (Integer) ((BigDecimal) resultValue).intValue();
                Object enumInstance = SqlUtils.getValueToEnum(attributeType, resultValue);
                BeanUtils.simpleInvokeMethod(m, resultInstance, enumInstance);
            } else if (ingoreError) {
                logger.error("There's no getter for '" + attributeName + "' in " + resultInstance
                        + ", META type is DEFAULT");
            } else {
                throw new SqlRuntimeException("There's no setter for '" + attributeName + "' in " + resultInstance
                        + ", META type is DEFAULT");
            }
        } else {
            Method m = BeanUtils.getSetter(resultInstance, attributeName, attributeType);
            if (resultValue != null && resultValue instanceof BigDecimal)
                resultValue = handleBigDecimal(attributeType, resultValue);
            if (m != null) {
                BeanUtils.simpleInvokeMethod(m, resultInstance, resultValue);
            } else if (ingoreError) {
                logger.error("There's no getter for '" + attributeName + "' in " + resultInstance
                        + ", META type is DEFAULT");
            } else {
                throw new SqlRuntimeException("There's no setter for '" + attributeName + "' in " + resultInstance
                        + ", META type is DEFAULT");
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setParameter(SqlQuery query, String paramName, Object inputValue, Class<?> inputType,
            boolean ingoreError) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setParameter DEFAULT: paramName=" + paramName + ", inputValue=" + inputValue
                    + ", inputType=" + inputType);
        }
        if (!(inputValue instanceof Collection)) {
            if (inputType.isEnum()) {
                Object o = SqlUtils.getEnumToValue(inputValue);
                if (o != null && o instanceof Integer) {
                    JdbcTypeFactory.INTEGER.setParameter(query, paramName, o, Integer.class, ingoreError);
                } else if (o != null && o instanceof String) {
                    JdbcTypeFactory.STRING.setParameter(query, paramName, o, String.class, ingoreError);
                } else {
                    if (ingoreError) {
                        logger.error("Incorrect type based enum " + inputValue + " for " + paramName);
                    } else {
                        throw new SqlRuntimeException("Incorrect type based enum " + inputValue + " for " + paramName);
                    }
                }
            } else {
                SqlMetaType type = SqlProcessContext.getTypeFactory().getMetaType(inputType);
                if (type != null) {
                    type.setParameter(query, paramName, inputValue, inputType, ingoreError);
                } else {
                    if (ingoreError) {
                        logger.error("Incorrect default type " + inputValue + " for " + paramName);
                    } else {
                        throw new SqlRuntimeException("Incorrect default type " + inputValue + " for " + paramName);
                    }
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
                Object o = SqlUtils.getEnumToValue(val);
                if (o != null) {
                    vals.add(o);
                } else {
                    if (ingoreError) {
                        logger.error("Incorrect type based enum item value " + o + " for " + paramName);
                    } else {
                        throw new SqlRuntimeException("Incorrect type based enum item value " + o + " for " + paramName);
                    }
                }
            }
            if (isEnum) {
                query.setParameterList(paramName, vals.toArray());
            } else {
                query.setParameterList(paramName, ((Collection) inputValue).toArray());
            }
        }
    }

    // special Oracle feature
    private Object handleBigDecimal(Class<?> attributeType, Object resultValue) {
        if (resultValue == null || !(resultValue instanceof BigDecimal))
            return resultValue;
        BigDecimal result = (BigDecimal) resultValue;
        if (attributeType == Byte.class || attributeType == byte.class) {
            return result.byteValue();
        } else if (attributeType == Integer.class || attributeType == int.class) {
            return result.intValue();
        } else if (attributeType == Long.class || attributeType == long.class) {
            return result.longValue();
        } else if (attributeType == Short.class || attributeType == short.class) {
            return result.shortValue();
        }
        return result;
    }
}
