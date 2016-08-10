package org.sqlproc.engine.plugin;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * Bean utilities API for the SQL Processor.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public interface BeanUtilsPlugin {

    /**
     * Holder for the getter types (standard and generic ones).
     * 
     * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
     */
    public class GetterType {
        public Class<?> type;
        public Type genericType;
        public Class<?> typeClass;
        public String methodName;

        public GetterType(Method m) {
            methodName = m.getName();
            type = m.getReturnType();
            genericType = m.getGenericReturnType();
            if (genericType != null && genericType instanceof ParameterizedType)
                typeClass = (Class<?>) ((ParameterizedType) genericType).getActualTypeArguments()[0];
        }
    }

    /**
     * Returns the new class instance
     * 
     * @param runtimeCtx
     *            the public runtime context
     * @param clazz
     *            the class to be constructed
     * @return the new class instance. Null in the case of any error.
     */
    public Object getInstance(SqlRuntimeContext runtimeCtx, Class<?> clazz);

    /**
     * Returns the Java type info for the attribute, if there is one.
     * 
     * @param runtimeCtx
     *            the public runtime context
     * @param clazz
     *            the class for which the attribute type is requested
     * @param attrName
     *            the name of the attribute which type is requested
     * @return the object that represents the Java type info. Null in the case there's no such attribute.
     */
    public Class<?> getAttributeType(SqlRuntimeContext runtimeCtx, Class<?> clazz, String attrName);

    /**
     * Returns the Java parameterized type info for the attribute, if there is one.
     * 
     * @param runtimeCtx
     *            the public runtime context
     * @param clazz
     *            the class for which the attribute type is requested
     * @param attrName
     *            the name of the attribute which type is requested
     * @return the object that represents the Java parameterized type info. Null in the case there's no such attribute.
     */
    public Class<?> getAttributeParameterizedType(SqlRuntimeContext runtimeCtx, Class<?> clazz, String attrName);

    /**
     * Returns the attribute getter method types, if there is one.
     * 
     * @param runtimeCtx
     *            the public runtime context
     * @param clazz
     *            the class for which the getter is requested
     * @param attrName
     *            the name of the attribute which getter is requested
     * @return The method that should be used to read the property value. Null in the case there's no such attribute's
     *         getter.
     */
    public GetterType getGetterType(SqlRuntimeContext runtimeCtx, Class<?> clazz, String attrName);

    /**
     * Returns the attribute getter method types, if there is one.
     * 
     * @param runtimeCtx
     *            the public runtime context
     * @param bean
     *            the bean for which the getter is requested
     * @param attrName
     *            the name of the attribute which getter is requested
     * @return The getter method types that should be used to read the property value. Null in the case there's no such
     *         attribute's getter.
     */
    public GetterType getGetterType(SqlRuntimeContext runtimeCtx, Object bean, String attrName);

    /**
     * Checks the attribute getter method existence.
     * 
     * @param runtimeCtx
     *            the public runtime context
     * @param bean
     *            the bean for which the getter is checked
     * @param attrName
     *            the name of the attribute which getter is checked
     * @return True if there's the attribute getter method
     */
    public boolean checkAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName);

    /**
     * Returns the value of the specified simple attribute of the specified bean.
     * 
     * @param runtimeCtx
     *            the public runtime context
     * @param bean
     *            the bean for which the attribute value is requested
     * @param attrName
     *            the name of the attribute which value is requested
     * @return the attribute value
     * @exception SqlRuntimeException
     *                in the case of any error
     */
    public Object getAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName) throws SqlRuntimeException;

    /**
     * Sets the value of the specified simple attribute of the specified bean, if there is one.
     * 
     * @param runtimeCtx
     *            the public runtime context
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
    public boolean simpleSetAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName, Object attrValue,
            Class<?>... attrTypes);

    /**
     * Sets the value of the specified simple attribute of the specified bean.
     * 
     * @param runtimeCtx
     *            the public runtime context
     * @param bean
     *            the bean for which the attribute value is to be modified
     * @param attrName
     *            the name of the attribute to be modified
     * @param attrValue
     *            the value to which the attribute should be set
     * @exception SqlRuntimeException
     *                in the case of any error
     */
    public void setAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName, Object attrValue)
            throws SqlRuntimeException;

    /**
     * Checks the class method existence.
     * 
     * @param runtimeCtx
     *            the public runtime context
     * @param clazz
     *            the class for which the method existence is checked
     * @param methodName
     *            the name of the method to be checked
     * @param argTypes
     *            the method parameters types
     * @return True if there's such a method
     */
    public boolean checkMethod(SqlRuntimeContext runtimeCtx, Class<?> clazz, String methodName, Class<?>... argTypes);

    /**
     * Checks the bean method existence.
     * 
     * @param runtimeCtx
     *            the public runtime context
     * @param bean
     *            the bean for which the method existence is checked
     * @param methodName
     *            the name of the method to be checked
     * @param args
     *            the method parameters
     * @return True if there's such a method
     */
    public boolean checkMethod(SqlRuntimeContext runtimeCtx, Object bean, String methodName, Object... args);

    /**
     * Invokes the class method with the specified name and parameters. The method can be a static one.
     * 
     * @param runtimeCtx
     *            the public runtime context
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
    public Object invokeMethod(SqlRuntimeContext runtimeCtx, Class<?> clazz, String methodName, Object... args)
            throws SqlRuntimeException;

    /**
     * Invokes the bean method with the specified name and parameters.
     * 
     * @param runtimeCtx
     *            the public runtime context
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
    public Object invokeMethod(SqlRuntimeContext runtimeCtx, Object bean, String methodName, Object... args)
            throws SqlRuntimeException;

    /**
     * Returns the bean enumeration value.
     * 
     * @param runtimeCtx
     *            the public runtime context
     * @param bean
     *            the bean of the enumeration type
     * @return the enumeration value. Null in the case of any error.
     */
    public Object getEnumToValue(SqlRuntimeContext runtimeCtx, Object bean);

    /**
     * Returns the bean enumeration type.
     * 
     * @param runtimeCtx
     *            the public runtime context
     * @param clazz
     *            the class of the enumeration type
     * @return the enumeration type. Null in the case of any error.
     */
    public Class<?> getEnumToClass(SqlRuntimeContext runtimeCtx, Class<?> clazz);

    /**
     * Returns the enumeration instance for the enumeration value
     * 
     * @param runtimeCtx
     *            the public runtime context
     * @param clazz
     *            the class of the enumeration type
     * @param val
     *            the enumeration value
     * @return the enumeration instance. Null in the case of any error.
     */
    public Object getValueToEnum(SqlRuntimeContext runtimeCtx, Class<?> clazz, Object val);
}
