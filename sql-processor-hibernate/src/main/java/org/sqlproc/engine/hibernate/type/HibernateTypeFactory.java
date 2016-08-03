package org.sqlproc.engine.hibernate.type;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.type.SqlMetaType;
import org.sqlproc.engine.type.SqlTypeFactory;

/**
 * The factory definition for the Hibernate stack, which can be used to construct the {@link SqlMetaType} instances.
 * 
 * In the process of the META SQL statements and mapping rules parsing the input/output values META types have to be
 * established. For this purpose a factory class responsible for these META types construction has to be supplied.<br>
 * 
 * The implementation is based on the Singleton design pattern.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class HibernateTypeFactory implements SqlTypeFactory {

    /**
     * The private static instance of this factory.
     */
    private static HibernateTypeFactory factory = new HibernateTypeFactory();

    /**
     * The private constructor.
     */
    private HibernateTypeFactory() {
    }

    /**
     * The main method to obtain the singleton instance of this factory.
     * 
     * @return the META types factory for the Hibernate stack
     */
    public static HibernateTypeFactory getInstance() {
        return factory;
    }

    /**
     * Singleton instance of Integer based enumeration type.
     */
    static final SqlMetaType ENUM_INT = new HibernateEnumIntegerType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType ENUM_STRING = new HibernateEnumStringType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType BIG_DECIMAL = new HibernateBigDecimalType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType BIG_INTEGER = new HibernateBigIntegerType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType BOOLEAN = new HibernateBooleanType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType BYTE_ARRAY = new HibernateByteArrayType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType BYTE_ARRAY_WRAPPER = new HibernateByteArrayWrapperType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType BYTE = new HibernateByteType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType CHAR = new HibernateCharType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType DATE_TIME = new HibernateDateTimeType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType DATE = new HibernateDateType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType DOUBLE = new HibernateDoubleType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType FLOAT = new HibernateFloatType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType FROM_DATE = new HibernateFromDateType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType INTEGER = new HibernateIntegerType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType LONG = new HibernateLongType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType SHORT = new HibernateShortType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType TEXT = new HibernateTextType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType STRING = new HibernateStringType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType TIMESTAMP = new HibernateTimestampType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType TIME = new HibernateTimeType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType TO_DATE = new HibernateToDateType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType BLOB = new HibernateBlobType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType CLOB = new HibernateClobType();
    /**
     * Singleton instance of auto-generated identity type.
     */
    static final SqlMetaType IDENTITY = new HibernateIdentityType();

    /**
     * Singleton instance of default type.
     */
    static final SqlMetaType DEFAULT = new HibernateDefaultType();
    /**
     * Singleton instances of generic types.
     */
    static final SqlMetaType[] TYPES = { BIG_DECIMAL, BIG_INTEGER, BOOLEAN, BYTE_ARRAY, BYTE_ARRAY_WRAPPER, BYTE, CHAR,
            DATE_TIME, DATE, DOUBLE, ENUM_INT, ENUM_STRING, FLOAT, FROM_DATE, INTEGER, LONG, SHORT, STRING, TIMESTAMP,
            TIME, TO_DATE, TEXT, BLOB, CLOB };

    /**
     * The immutable map between the Java class types and the internal types.
     */
    static Map<Class<?>, SqlMetaType> CLASS_TO_TYPE_MAP = new HashMap<Class<?>, SqlMetaType>();
    /**
     * The immutable map between the META types name and the internal types.
     */
    static Map<String, SqlMetaType> META_TO_TYPE_MAP = new HashMap<String, SqlMetaType>();

    /**
     * Static init.
     */
    static {
        for (SqlMetaType type : TYPES) {
            for (Class<?> classType : type.getClassTypes())
                CLASS_TO_TYPE_MAP.put(classType, type);
            for (String metaType : type.getMetaTypes())
                META_TO_TYPE_MAP.put(metaType.toUpperCase(), type);
        }
        CLASS_TO_TYPE_MAP = Collections.unmodifiableMap(CLASS_TO_TYPE_MAP);
        META_TO_TYPE_MAP = Collections.unmodifiableMap(META_TO_TYPE_MAP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlMetaType getDefaultType() {
        return DEFAULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlMetaType getEnumIntegerType() {
        return ENUM_INT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlMetaType getEnumStringType() {
        return ENUM_STRING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlMetaType getIdentityType() {
        return IDENTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlMetaType[] getAllTypes() {
        return TYPES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlMetaType getMetaType(Class<?> clazz) {
        return CLASS_TO_TYPE_MAP.get(clazz);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlMetaType getMetaType(String name) {

        if (name.startsWith("h_")) {
            return new HibernateType(name.substring(2));
        } else {
            SqlMetaType metaType = META_TO_TYPE_MAP.get(name.toUpperCase());
            if (metaType == null)
                throw new SqlRuntimeException("Unsupported Meta Type " + name);
            return metaType;
        }
    }
}
