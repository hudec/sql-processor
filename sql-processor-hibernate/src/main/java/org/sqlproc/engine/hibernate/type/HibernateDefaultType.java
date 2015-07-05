package org.sqlproc.engine.hibernate.type;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.dialect.Dialect;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.type.BigDecimalType;
import org.hibernate.type.BigIntegerType;
import org.hibernate.type.BinaryType;
import org.hibernate.type.BlobType;
import org.hibernate.type.BooleanType;
import org.hibernate.type.ByteType;
import org.hibernate.type.CharacterType;
import org.hibernate.type.ClobType;
import org.hibernate.type.DateType;
import org.hibernate.type.DiscriminatorType;
import org.hibernate.type.DoubleType;
import org.hibernate.type.FloatType;
import org.hibernate.type.PrimitiveType;
import org.hibernate.type.ShortType;
import org.hibernate.type.StringType;
import org.hibernate.type.TimeType;
import org.hibernate.type.TimestampType;
import org.hibernate.type.Type;
import org.hibernate.type.VersionType;
import org.hibernate.type.WrapperBinaryType;
import org.hibernate.type.descriptor.ValueExtractor;
import org.hibernate.type.descriptor.WrapperOptions;
import org.hibernate.type.descriptor.java.JavaTypeDescriptor;
import org.hibernate.type.descriptor.java.LongTypeDescriptor;
import org.hibernate.type.descriptor.sql.BasicExtractor;
import org.hibernate.type.descriptor.sql.BigIntTypeDescriptor;
import org.hibernate.type.descriptor.sql.IntegerTypeDescriptor;
import org.sqlproc.engine.BeanUtils;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;
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
    static public class MyIntegerTypeDescriptor extends IntegerTypeDescriptor {
        public static final MyIntegerTypeDescriptor INSTANCE = new MyIntegerTypeDescriptor();

        @Override
        public <X> ValueExtractor<X> getExtractor(final JavaTypeDescriptor<X> javaTypeDescriptor) {
            return new BasicExtractor<X>(javaTypeDescriptor, this) {
                @Override
                protected X doExtract(ResultSet rs, String name, WrapperOptions options) throws SQLException {
                    if (Character.isDigit(name.charAt(0))) {
                        return javaTypeDescriptor.wrap(rs.getInt(Integer.parseInt(name)), options);
                    } else {
                        return javaTypeDescriptor.wrap(rs.getInt(name), options);
                    }
                }
            };
        }
    }

    static public class MyIntegerType extends AbstractSingleColumnStandardBasicType<Integer> implements
            PrimitiveType<Integer>, DiscriminatorType<Integer>, VersionType<Integer> {

        public static final MyIntegerType INSTANCE = new MyIntegerType();

        @SuppressWarnings({ "UnnecessaryBoxing" })
        public static final Integer ZERO = Integer.valueOf(0);

        public MyIntegerType() {
            super(MyIntegerTypeDescriptor.INSTANCE, org.hibernate.type.descriptor.java.IntegerTypeDescriptor.INSTANCE);
        }

        public String getName() {
            return "integer";
        }

        @Override
        public String[] getRegistrationKeys() {
            return new String[] { getName(), int.class.getName(), Integer.class.getName() };
        }

        public Serializable getDefaultValue() {
            return ZERO;
        }

        public Class getPrimitiveClass() {
            return int.class;
        }

        public String objectToSQLString(Integer value, Dialect dialect) throws Exception {
            return toString(value);
        }

        public Integer stringToObject(String xml) {
            return fromString(xml);
        }

        public Integer seed(SessionImplementor session) {
            return ZERO;
        }

        @SuppressWarnings({ "UnnecessaryBoxing", "UnnecessaryUnboxing" })
        public Integer next(Integer current, SessionImplementor session) {
            return Integer.valueOf(current.intValue() + 1);
        }

        public Comparator<Integer> getComparator() {
            return getJavaTypeDescriptor().getComparator();
        }
    }

    /**
     * The extended Hibernate type LONG.
     */
    static public class MyBigIntTypeDescriptor extends BigIntTypeDescriptor {
        public static final MyBigIntTypeDescriptor INSTANCE = new MyBigIntTypeDescriptor();

        @Override
        public <X> ValueExtractor<X> getExtractor(final JavaTypeDescriptor<X> javaTypeDescriptor) {
            return new BasicExtractor<X>(javaTypeDescriptor, this) {
                @Override
                protected X doExtract(ResultSet rs, String name, WrapperOptions options) throws SQLException {
                    if (Character.isDigit(name.charAt(0))) {
                        return javaTypeDescriptor.wrap(rs.getLong(Integer.parseInt(name)), options);
                    } else {
                        return javaTypeDescriptor.wrap(rs.getLong(name), options);
                    }
                }
            };
        }
    };

    static public class MyLongType extends AbstractSingleColumnStandardBasicType<Long> implements PrimitiveType<Long>,
            DiscriminatorType<Long>, VersionType<Long> {

        public static final MyLongType INSTANCE = new MyLongType();

        @SuppressWarnings({ "UnnecessaryBoxing" })
        private static final Long ZERO = Long.valueOf(0);

        public MyLongType() {
            super(MyBigIntTypeDescriptor.INSTANCE, LongTypeDescriptor.INSTANCE);
        }

        public String getName() {
            return "long";
        }

        @Override
        public String[] getRegistrationKeys() {
            return new String[] { getName(), long.class.getName(), Long.class.getName() };
        }

        public Serializable getDefaultValue() {
            return ZERO;
        }

        public Class getPrimitiveClass() {
            return long.class;
        }

        public Long stringToObject(String xml) throws Exception {
            return new Long(xml);
        }

        @SuppressWarnings({ "UnnecessaryBoxing", "UnnecessaryUnboxing" })
        public Long next(Long current, SessionImplementor session) {
            return Long.valueOf(current.longValue() + 1);
        }

        public Long seed(SessionImplementor session) {
            return ZERO;
        }

        public Comparator<Long> getComparator() {
            return getJavaTypeDescriptor().getComparator();
        }

        public String objectToSQLString(Long value, Dialect dialect) throws Exception {
            return value.toString();
        }
    }

    /**
     * Static initialization.
     */
    static {
        hibernateTypes.put(int.class, MyIntegerType.INSTANCE);
        hibernateTypes.put(Integer.class, MyIntegerType.INSTANCE);
        hibernateTypes.put(long.class, MyLongType.INSTANCE);
        hibernateTypes.put(Long.class, MyLongType.INSTANCE);
        hibernateTypes.put(short.class, ShortType.INSTANCE);
        hibernateTypes.put(Short.class, ShortType.INSTANCE);
        hibernateTypes.put(byte.class, ByteType.INSTANCE);
        hibernateTypes.put(Byte.class, ByteType.INSTANCE);
        hibernateTypes.put(float.class, FloatType.INSTANCE);
        hibernateTypes.put(Float.class, FloatType.INSTANCE);
        hibernateTypes.put(double.class, DoubleType.INSTANCE);
        hibernateTypes.put(Double.class, DoubleType.INSTANCE);
        hibernateTypes.put(char.class, CharacterType.INSTANCE);
        hibernateTypes.put(Character.class, CharacterType.INSTANCE);
        hibernateTypes.put(String.class, StringType.INSTANCE);
        hibernateTypes.put(java.util.Date.class, TimestampType.INSTANCE);
        hibernateTypes.put(java.sql.Timestamp.class, TimestampType.INSTANCE);
        hibernateTypes.put(java.sql.Date.class, DateType.INSTANCE);
        hibernateTypes.put(java.sql.Time.class, TimeType.INSTANCE);
        hibernateTypes.put(boolean.class, BooleanType.INSTANCE);
        hibernateTypes.put(Boolean.class, BooleanType.INSTANCE);
        hibernateTypes.put(BigInteger.class, BigIntegerType.INSTANCE);
        hibernateTypes.put(BigDecimal.class, BigDecimalType.INSTANCE);
        hibernateTypes.put(byte[].class, BinaryType.INSTANCE);
        hibernateTypes.put(Byte[].class, WrapperBinaryType.INSTANCE);
        hibernateTypes.put(Blob.class, BlobType.INSTANCE);
        hibernateTypes.put(Clob.class, ClobType.INSTANCE);
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
    public void setResult(SqlRuntimeContext runtimeCtx, Object resultInstance, String attributeName,
            Object resultValue, boolean ingoreError) throws SqlRuntimeException {
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
            if (resultValue != null && resultValue instanceof BigDecimal)
                resultValue = (Integer) ((BigDecimal) resultValue).intValue();
            else if (resultValue != null && resultValue instanceof BigInteger)
                resultValue = (Integer) ((BigInteger) resultValue).intValue();
            Object enumInstance = BeanUtils.getValueToEnum(runtimeCtx, attributeType, resultValue);

            if (BeanUtils.simpleInvokeSetter(resultInstance, attributeName, enumInstance, attributeType))
                return;
            if (ingoreError) {
                logger.error("There's no getter for '" + attributeName + "' in " + resultInstance
                        + ", META type is DEFAULT");
            } else {
                throw new SqlRuntimeException("There's no setter for '" + attributeName + "' in " + resultInstance
                        + ", META type is DEFAULT");
            }
        } else {
            if (resultValue != null) {
                if (resultValue instanceof BigDecimal)
                    resultValue = SqlUtils.convertBigDecimal(attributeType, resultValue);
                else if (resultValue instanceof BigInteger)
                    resultValue = SqlUtils.convertBigInteger(attributeType, resultValue);
            }

            if (BeanUtils.simpleInvokeSetter(resultInstance, attributeName, resultValue, attributeType))
                return;
            if (ingoreError) {
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
    public void setParameter(SqlRuntimeContext runtimeCtx, SqlQuery query, String paramName, Object inputValue,
            Class<?> inputType, boolean ingoreError) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setParameter DEFAULT: paramName=" + paramName + ", inputValue=" + inputValue
                    + ", inputType=" + inputType);
        }
        if (!(inputValue instanceof Collection)) {
            if (inputType.isEnum()) {
                Class clazz = BeanUtils.getEnumToClass(runtimeCtx, inputType);
                if (clazz == String.class) {
                    HibernateTypeFactory.ENUM_STRING.setParameter(runtimeCtx, query, paramName, inputValue, inputType,
                            ingoreError);
                } else if (clazz == Integer.class) {
                    HibernateTypeFactory.ENUM_INT.setParameter(runtimeCtx, query, paramName, inputValue, inputType,
                            ingoreError);
                } else {
                    if (ingoreError) {
                        logger.error("Incorrect type based enum " + inputValue + " for " + paramName);
                    } else {
                        throw new SqlRuntimeException("Incorrect type based enum " + inputValue + " for " + paramName);
                    }
                }
            } else {
                SqlMetaType type = runtimeCtx.getTypeFactory().getMetaType(inputType);
                if (type != null) {
                    type.setParameter(runtimeCtx, query, paramName, inputValue, inputType, ingoreError);
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
                Object o = BeanUtils.getEnumToValue(runtimeCtx, val);
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
