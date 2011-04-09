package org.sqlproc.engine.hibernate.type;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Hibernate;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.hibernate.type.Type;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.impl.BeanUtils;
import org.sqlproc.engine.impl.SqlProcessContext;
import org.sqlproc.engine.impl.SqlUtils;
import org.sqlproc.engine.type.SqlMetaType;

/**
 * The default META type for the Hibernate stack. It's used in the case there's no explicit META type declaration in the
 * META SQL statements.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateDefaultType extends SqlMetaType {

    /**
     * The map between the Java types and the Hibernate types.
     */
    static Map<Class<?>, Type> hibernateTypes = new HashMap<Class<?>, Type>();
    /**
     * The extended Hibernate type INTEGER.
     */
    static IntegerType INTEGER = new IntegerType() {
        @Override
        public Object get(ResultSet rs, String name) throws SQLException {
            if (Character.isDigit(name.charAt(0))) {
                return new Integer(rs.getInt(Integer.parseInt(name)));
            } else {
                return new Integer(rs.getInt(name));
            }
        }
    };
    /**
     * The extended Hibernate type LONG.
     */
    static LongType LONG = new LongType() {
        @Override
        public Object get(ResultSet rs, String name) throws SQLException {
            if (Character.isDigit(name.charAt(0))) {
                return new Long(rs.getLong(Integer.parseInt(name)));
            } else {
                return new Long(rs.getLong(name));
            }
        }
    };
    /**
     * Static initialization.
     */
    static {
        hibernateTypes.put(int.class, INTEGER);
        hibernateTypes.put(Integer.class, INTEGER);
        hibernateTypes.put(long.class, LONG);
        hibernateTypes.put(Long.class, LONG);
        hibernateTypes.put(short.class, Hibernate.SHORT);
        hibernateTypes.put(Short.class, Hibernate.SHORT);
        hibernateTypes.put(byte.class, Hibernate.BYTE);
        hibernateTypes.put(Byte.class, Hibernate.BYTE);
        hibernateTypes.put(float.class, Hibernate.FLOAT);
        hibernateTypes.put(Float.class, Hibernate.FLOAT);
        hibernateTypes.put(double.class, Hibernate.DOUBLE);
        hibernateTypes.put(Double.class, Hibernate.DOUBLE);
        hibernateTypes.put(char.class, Hibernate.CHARACTER);
        hibernateTypes.put(Character.class, Hibernate.CHARACTER);
        hibernateTypes.put(String.class, Hibernate.STRING);
        hibernateTypes.put(java.util.Date.class, Hibernate.TIMESTAMP);
        hibernateTypes.put(java.sql.Timestamp.class, Hibernate.TIMESTAMP);
        hibernateTypes.put(java.sql.Date.class, Hibernate.DATE);
        hibernateTypes.put(java.sql.Time.class, Hibernate.TIME);
        hibernateTypes.put(boolean.class, Hibernate.BOOLEAN);
        hibernateTypes.put(Boolean.class, Hibernate.BOOLEAN);
        hibernateTypes.put(BigInteger.class, Hibernate.BIG_INTEGER);
        hibernateTypes.put(BigDecimal.class, Hibernate.BIG_DECIMAL);
        hibernateTypes.put(byte[].class, Hibernate.BINARY);
        hibernateTypes.put(Byte[].class, Hibernate.WRAPPER_BINARY);
        hibernateTypes.put(Blob.class, Hibernate.BLOB);
        hibernateTypes.put(Clob.class, Hibernate.CLOB);
    }

    /**
     * {@inheritDoc}
     */
    public void addScalar(SqlQuery query, String dbName, Class<?> attributeType) {
        Type hibernateType = hibernateTypes.get(attributeType);
        if (hibernateType != null)
            query.addScalar(dbName, hibernateType);
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
                    query.setParameter(paramName, (Integer) o, Hibernate.INTEGER);
                } else if (o != null && o instanceof String) {
                    query.setParameter(paramName, (String) o, Hibernate.STRING);
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
