package org.sqlproc.engine.type;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The factory definition, which can be used to construct the {@link SqlMetaType} instances.
 * 
 * It's used to combine the factory of the underlying stack (on top of which the SQL Processor works) and the custom
 * META types provided in the time of {@link org.sqlproc.engine.SqlEngineLoader} construction.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlComposedTypeFactory implements SqlTypeFactory {

    /**
     * The map between a Java class type and an internal type.
     */
    private Map<Class<?>, SqlMetaType> classToTypeMap = new HashMap<Class<?>, SqlMetaType>();

    /**
     * The map between a String representation of an internal type and an internal type.
     */
    private Map<String, SqlMetaType> metaToTypeMap = new HashMap<String, SqlMetaType>();

    /**
     * The factory of the underlying stack.
     */
    private SqlTypeFactory typeFactory;

    /**
     * Creates a new instance of this factory.
     * 
     * @param typeFactory
     *            the factory of the underlying stack
     */
    public SqlComposedTypeFactory(SqlTypeFactory typeFactory) {

        this(typeFactory, null);
    }

    /**
     * Creates a new instance of this factory.
     * 
     * @param typeFactory
     *            the factory of the underlying stack
     * @param customTypes
     *            a collection of the custom META types provided by an user
     */
    public SqlComposedTypeFactory(SqlTypeFactory typeFactory, List<SqlInternalType> customTypes) {

        this.typeFactory = typeFactory;

        if (customTypes != null && !customTypes.isEmpty()) {
            for (SqlInternalType type : customTypes) {
                for (Class<?> classType : ((SqlInternalType) type).getClassTypes())
                    classToTypeMap.put(classType, type);
                for (String metaType : ((SqlInternalType) type).getMetaTypes())
                    metaToTypeMap.put(metaType.toUpperCase(), type);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlMetaType getDefaultType() {
        return typeFactory.getDefaultType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlMetaType getEnumIntegerType() {
        return typeFactory.getEnumIntegerType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlMetaType getEnumStringType() {
        return typeFactory.getEnumStringType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlMetaType getIdentityType() {
        return typeFactory.getIdentityType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlMetaType[] getAllTypes() {
        throw new UnsupportedOperationException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlMetaType getMetaType(Class<?> clazz) {
        SqlMetaType metaType = classToTypeMap.get(clazz);
        if (metaType == null)
            metaType = typeFactory.getMetaType(clazz);
        return metaType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlMetaType getMetaType(String name) {
        SqlMetaType metaType = metaToTypeMap.get(name.toUpperCase());
        if (metaType == null)
            metaType = typeFactory.getMetaType(name);
        return metaType;
    }
}
