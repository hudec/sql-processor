package org.sqlproc.engine;

import org.sqlproc.engine.plugin.SqlBeansPlugin.GetterType;
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
     * Convenient method to obtain a String array features based on the name.
     * 
     * @param name
     *            name of the feature
     * @return the array of the feature values
     */
    String[] getFeatures(String name);

    /**
     * Convenient method to obtain a boolean feature based on the name.
     * 
     * @param name
     *            name of the feature
     * @return value of the feature
     */
    boolean isFeature(String name);

    /**
     * Convenient method to obtain an Integer feature based on the name.
     * 
     * @param name
     *            name of the feature
     * @return value of the feature
     */
    Integer getFeatureAsInt(String name);

    /**
     * Convenient method to obtain an Object feature based on the name.
     * 
     * @param name
     *            name of the feature
     * @return value of the feature
     */
    Object getFeatureAsObject(String name);

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

    Object getInstance(Class<?> clazz);

    Class<?> getAttributeType(Class<?> clazz, String attrName);

    GetterType getGetterType(Class<?> clazz, String attrName);

    GetterType getGetterType(Object bean, String attrName);

    boolean checkAttribute(Object bean, String attrName);

    Object getAttribute(Object bean, String attrName);

    boolean simpleSetAttribute(Object bean, String attrName, Object attrValue, Class<?>... attrTypes);

    void setAttribute(Object bean, String attrName, Object attrValue);

    boolean checkMethod(Class<?> clazz, String methodName, Class<?>... argTypes);

    boolean checkMethod(Object bean, String methodName, Object... args);

    Object invokeMethod(Class<?> clazz, String methodName, Object... args);

    Object invokeMethod(Object bean, String methodName, Object... args);

    Object getEnumToValue(Object bean);

    Class<?> getEnumToClass(Class<?> clazz);

    Object getValueToEnum(Class<?> objClass, Object val);
}
