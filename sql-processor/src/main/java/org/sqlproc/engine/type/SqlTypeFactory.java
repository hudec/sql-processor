package org.sqlproc.engine.type;

/**
 * The factory definition, which can be used to construct the {@link SqlMetaType} instances.
 * 
 * In the process of the META SQL statements and mapping rules parsing the input/output values META types have to be
 * established. For this purpose a factory class responsible for these META types construction has to be supplied.<br>
 * 
 * The implementation depends the stack on top of which the SQL Processor works. It can be a singleton or a registry.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlTypeFactory {

    /**
     * Returns the default META type. It's used in the case there's no explicit META type declaration in the META SQL
     * statements.
     * 
     * @return the default META type
     */
    public SqlMetaType getDefaultType();

    /**
     * Returns the META type for the enumerations based on Integer internal type.
     * 
     * @return the META type for the enumerations based on Integer internal type
     */
    public SqlMetaType getEnumIntegerType();

    /**
     * Returns the META type for the enumerations based on String internal type.
     * 
     * @return the META type for the enumerations based on String internal type
     */
    public SqlMetaType getEnumStringType();

    /**
     * Returns the META type for an auto-generated identity.
     * 
     * @return the META type for an auto-generated identity
     */
    public SqlMetaType getIdentityType();

    /**
     * Returns the collection of all the META types provided by this factory.
     * 
     * @return the collection of all the META types
     */
    public SqlMetaType[] getAllTypes();

    /**
     * Returns the META type, which can be used to handle input/output values of provided Java type.
     * 
     * @param clazz
     *            the input/output value Java type
     * @return the META type
     */
    public SqlMetaType getMetaType(Class<?> clazz);

    /**
     * Returns the META type with the provided name.
     * 
     * @param name
     *            the name of the META SQL type
     * @return the META type
     */
    public SqlMetaType getMetaType(String name);
}
