package org.sqlproc.engine;

import org.sqlproc.engine.plugin.BeanUtilsPlugin.GetterType;
import org.sqlproc.engine.plugin.SqlPluginFactory;
import org.sqlproc.engine.type.SqlTypeFactory;

/**
 * The public runtime context.
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface SqlRuntimeContext {

    /**
     * Convenient method to obtain a String feature based on the name.
     * 
     * @param name
     *            name of the feature
     * @return value of the feature
     */
    String getFeature(String name);

    /**
     * Convenient method to obtain a String feature based on the name.
     * 
     * @param feature
     *            the feature
     * @return value of the feature
     */
    String getFeature(SqlFeature feature);

    /**
     * Convenient method to obtain a String array features based on the name.
     * 
     * @param feature
     *            the feature
     * @return the array of the feature values
     */
    String[] getFeatures(String feature);

    /**
     * Convenient method to obtain a boolean feature based on the name.
     * 
     * @param feature
     *            the feature
     * @return value of the feature
     */
    boolean isFeature(SqlFeature feature);

    /**
     * Convenient method to obtain an Integer feature based on the name.
     * 
     * @param feature
     *            the feature
     * @return value of the feature
     */
    Integer getFeatureAsInt(SqlFeature feature);

    /**
     * Convenient method to obtain an Object feature based on the name.
     * 
     * @param feature
     *            the feature
     * @return value of the feature
     */
    Object getFeatureAsObject(SqlFeature feature);

    /**
     * Convenient method to obtain a feature based on the name.
     * 
     * @param feature
     *            the feature
     * @return value of the feature
     */
    Object getRawFeature(SqlFeature feature);

    /**
     * Convenient method to obtain a feature based on the name.
     * 
     * @param name
     *            name of the feature
     * @return value of the feature
     */
    Object getRawFeature(String name);

    /**
     * Returns the factory responsible for the META types construction.
     * 
     * @return the factory for the META types construction
     */
    SqlTypeFactory getTypeFactory();

    /**
     * Returns the factory responsible for the SQL Processor plugins.
     * 
     * @return the factory for the SQL Processor plugins
     */
    SqlPluginFactory getPluginFactory();

    /**
     * Returns the new class instance
     * 
     * @param clazz
     *            the class to be constructed
     * @return the new class instance. Null in the case of any error.
     */
    public Object getInstance(Class<?> clazz);

    /**
     * Returns the Java type info for the attribute, if there is one.
     * 
     * @param clazz
     *            the class for which the attribute type is requested
     * @param attrName
     *            the name of the attribute which type is requested
     * @return the object that represents the Java type info. Null in the case there's no such attribute.
     */
    public Class<?> getAttributeType(Class<?> clazz, String attrName);

    /**
     * Returns the attribute getter method types, if there is one.
     * 
     * @param clazz
     *            the class for which the getter is requested
     * @param attrName
     *            the name of the attribute which getter is requested
     * @return The method that should be used to read the property value. Null in the case there's no such attribute's
     *         getter.
     */
    public GetterType getGetterType(Class<?> clazz, String attrName);

    /**
     * Returns the attribute getter method types, if there is one.
     * 
     * @param bean
     *            the bean for which the getter is requested
     * @param attrName
     *            the name of the attribute which getter is requested
     * @return The getter method types that should be used to read the property value. Null in the case there's no such
     *         attribute's getter.
     */
    public GetterType getGetterType(Object bean, String attrName);

    /**
     * Checks the attribute getter method existence.
     * 
     * @param bean
     *            the bean for which the getter is checked
     * @param attrName
     *            the name of the attribute which getter is checked
     * @return True if there's the attribute getter method
     */
    public boolean checkAttribute(Object bean, String attrName);

    /**
     * Returns the value of the specified simple attribute of the specified bean.
     * 
     * @param bean
     *            the bean for which the attribute value is requested
     * @param attrName
     *            the name of the attribute which value is requested
     * @return the attribute value
     * @exception SqlRuntimeException
     *                in the case of any error
     */
    public Object getAttribute(Object bean, String attrName) throws SqlRuntimeException;

    /**
     * Sets the value of the specified simple attribute of the specified bean, if there is one.
     * 
     * @param bean
     *            the bean for which the attribute value is to be modified
     * @param attrName
     *            the name of the attribute to be modified
     * @param attrValue
     *            the value to which the attribute should be set
     * @param attrTypes
     *            the possible attribute types
     * @return True if the attribute was successfully modified
     */
    public boolean simpleSetAttribute(Object bean, String attrName, Object attrValue, Class<?>... attrTypes);

    /**
     * Sets the value of the specified simple attribute of the specified bean.
     * 
     * @param bean
     *            the bean for which the attribute value is to be modified
     * @param attrName
     *            the name of the attribute to be modified
     * @param attrValue
     *            the value to which the attribute should be set
     * @exception SqlRuntimeException
     *                in the case of any error
     */
    public void setAttribute(Object bean, String attrName, Object attrValue) throws SqlRuntimeException;

    /**
     * Checks the class method existence.
     * 
     * @param clazz
     *            the class for which the method existence is checked
     * @param methodName
     *            the name of the method to be checked
     * @param argTypes
     *            the method parameters types
     * @return True if there's such a method
     */
    public boolean checkMethod(Class<?> clazz, String methodName, Class<?>... argTypes);

    /**
     * Checks the bean method existence.
     * 
     * @param bean
     *            the bean for which the method existence is checked
     * @param methodName
     *            the name of the method to be checked
     * @param args
     *            the method parameters
     * @return True if there's such a method
     */
    public boolean checkMethod(Object bean, String methodName, Object... args);

    /**
     * Invokes the class method with the specified name and parameters. The method can be a static one.
     * 
     * @param clazz
     *            the class which method is going to be invoked
     * @param methodName
     *            the requested method name
     * @param args
     *            the method parameters
     * @return the result of the method invocation
     * @exception SqlRuntimeException
     *                in the case of any error
     */
    public Object invokeMethod(Class<?> clazz, String methodName, Object... args) throws SqlRuntimeException;

    /**
     * Invokes the bean method with the specified name and parameters.
     * 
     * @param bean
     *            the bean which method is going to be invoked
     * @param methodName
     *            the requested method name
     * @param args
     *            the method parameters
     * @return the result of the method invocation
     * @exception SqlRuntimeException
     *                in the case of any error
     */
    public Object invokeMethod(Object bean, String methodName, Object... args) throws SqlRuntimeException;

    /**
     * Returns the bean enumeration value.
     * 
     * @param bean
     *            the bean of the enumeration type
     * @return the enumeration value. Null in the case of any error.
     */
    public Object getEnumToValue(Object bean);

    /**
     * Returns the bean enumeration type.
     * 
     * @param clazz
     *            the class of the enumeration type
     * @return the enumeration type. Null in the case of any error.
     */
    public Class<?> getEnumToClass(Class<?> clazz);

    /**
     * Returns the enumeration instance for the enumeration value
     * 
     * @param clazz
     *            the class of the enumeration type
     * @param val
     *            the enumeration value
     * @return the enumeration instance. Null in the case of any error.
     */
    public Object getValueToEnum(Class<?> clazz, Object val);
}
