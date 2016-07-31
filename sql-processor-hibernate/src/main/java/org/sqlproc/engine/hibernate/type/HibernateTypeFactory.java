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
     * Singleton instance of default type.
     */
    static final SqlMetaType DEFAULT = new HibernateDefaultType();
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
    static final SqlMetaType IDENTITY = new HibernateIdentityType();
    /**
     * Singleton instances of generic types.
     */
    static final SqlMetaType[] TYPES = { new HibernateBigDecimalType(), new HibernateBigIntegerType(),
            new HibernateBooleanType(), new HibernateByteArrayType(), new HibernateByteType(), new HibernateCharType(),
            new HibernateDateTimeType(), new HibernateDateType(), new HibernateDoubleType(), ENUM_INT, ENUM_STRING,
            new HibernateFloatType(), new HibernateFromDateType(), new HibernateIntegerType(), new HibernateLongType(),
            new HibernateShortType(), new HibernateStringType(), new HibernateTimestampType(), new HibernateTimeType(),
            new HibernateToDateType(), new HibernateTextType(), new HibernateBlobType(), new HibernateClobType() };

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
