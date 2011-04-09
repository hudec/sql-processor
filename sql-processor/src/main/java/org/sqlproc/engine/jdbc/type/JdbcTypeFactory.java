package org.sqlproc.engine.jdbc.type;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.type.SqlIdentityType;
import org.sqlproc.engine.type.SqlInternalType;
import org.sqlproc.engine.type.SqlMetaType;
import org.sqlproc.engine.type.SqlTypeFactory;

/**
 * The factory definition for the JDBC stack, which can be used to construct the {@link SqlMetaType} instances.
 * 
 * In the process of the META SQL statements and mapping rules parsing the input/output values META types have to be
 * established. For this purpose a factory class responsible for these META types construction has to be supplied.<br>
 * 
 * The implementation is based on the Singleton design pattern.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcTypeFactory implements SqlTypeFactory {

    /**
     * The private static instance of this factory.
     */
    private static JdbcTypeFactory factory = new JdbcTypeFactory();

    /**
     * The private constructor.
     */
    private JdbcTypeFactory() {
    }

    /**
     * The main method to obtain the singleton instance of this factory.
     * 
     * @return the META types factory for the JDBC stack
     */
    public static JdbcTypeFactory getInstance() {
        return factory;
    }

    /**
     * Singleton instance of Integer based enumeration type.
     */
    static final SqlMetaType ENUM_INT = new JdbcEnumIntegerType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType ENUM_STRING = new JdbcEnumStringType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType BIG_DECIMAL = new JdbcBigDecimalType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType BIG_INTEGER = new JdbcBigIntegerType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType BOOLEAN = new JdbcBooleanType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType BYTE_ARRAY = new JdbcByteArrayType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType BYTE_ARRAY_WRAPPER = new JdbcByteArrayWrapperType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType BYTE = new JdbcByteType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType CHAR = new JdbcCharType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType DATE_TIME = new JdbcDateTimeType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType DATE = new JdbcDateType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType DOUBLE = new JdbcDoubleType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType FLOAT = new JdbcFloatType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType FROM_DATE = new JdbcFromDateType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType INTEGER = new JdbcIntegerType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType LONG = new JdbcLongType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType SHORT = new JdbcShortType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType STRING = new JdbcStringType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType TIMESTAMP = new JdbcTimestampType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType TIME = new JdbcTimeType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType TO_DATE = new JdbcToDateType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType TEXT = new JdbcTextType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType BLOB = new JdbcBlobType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType CLOB = new JdbcClobType();
    /**
     * Singleton instance of String based enumeration type.
     */
    static final SqlMetaType IDENTITY = new SqlIdentityType() {
        @Override
        public Object getProviderSqlType() {
            return null;
        }

        @Override
        public Object getProviderSqlNullType() {
            return null;
        }
    };
    /**
     * Singleton instance of default type.
     */
    static final SqlMetaType DEFAULT = new JdbcDefaultType();
    /**
     * Singleton instances of generic types.
     */
    static final SqlMetaType[] TYPES = { BIG_DECIMAL, BIG_INTEGER, BOOLEAN, BYTE_ARRAY, BYTE, CHAR, DATE_TIME, DATE,
            DOUBLE, ENUM_INT, ENUM_STRING, FLOAT, FROM_DATE, INTEGER, LONG, SHORT, STRING, TIMESTAMP, TIME, TO_DATE,
            TEXT, BLOB, CLOB };

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
            if (type instanceof SqlInternalType) {
                for (Class<?> classType : ((SqlInternalType) type).getClassTypes())
                    CLASS_TO_TYPE_MAP.put(classType, type);
                for (String metaType : ((SqlInternalType) type).getMetaTypes())
                    META_TO_TYPE_MAP.put(metaType.toUpperCase(), type);
            }
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
            throw new UnsupportedOperationException(); // new SqlHibernateType(name.substring(2));
        } else {
            SqlMetaType metaType = META_TO_TYPE_MAP.get(name.toUpperCase());
            if (metaType == null)
                throw new SqlRuntimeException("Unsupported Meta Type " + name);
            return metaType;
        }
    }
}
