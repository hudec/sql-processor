package org.sqlproc.engine;

import java.beans.BeanInfo;
import java.beans.IndexedPropertyDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.beanutils.MethodUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Bean utilities.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class BeanUtils {

    private static ConcurrentHashMap<String, Constructor<?>> constructors = new ConcurrentHashMap<String, Constructor<?>>();
    private static ConcurrentHashMap<String, PropertyDescriptor[]> descriptors = new ConcurrentHashMap<String, PropertyDescriptor[]>();
    private static ConcurrentHashMap<String, Class<?>> types = new ConcurrentHashMap<String, Class<?>>();
    private static ConcurrentHashMap<String, Method> getters = new ConcurrentHashMap<String, Method>();
    private static ConcurrentHashMap<String, GetterType> typeGetters = new ConcurrentHashMap<String, GetterType>();
    private static ConcurrentHashMap<String, Method> setters = new ConcurrentHashMap<String, Method>();

    /**
     * The internal slf4j logger.
     */
    static final Logger logger = LoggerFactory.getLogger(BeanUtils.class);

    // instances

    private static Constructor<?> getInstanceConstructor(SqlRuntimeContext runtimeCtx, Class<?> clazz) {
        String keyName = clazz.getName();
        Constructor<?> ctor = constructors.get(keyName);
        if (ctor != null)
            return ctor;

        if ((clazz.getModifiers() & 0x0400) != 0) {
            logger.warn("getInstance: " + clazz + " is abstract");
            return null;
        }
        try {
            ctor = clazz.getConstructor();
            try {
                ctor.setAccessible(true);
            } catch (SecurityException se) {
                logger.warn("getInstance: " + clazz + " " + se.getMessage());
            }
        } catch (NoSuchMethodException e) {
            logger.warn("getInstance: " + clazz + " " + e.getMessage());
        } catch (SecurityException e) {
            logger.warn("getInstance: " + clazz + " " + e.getMessage());
        }
        if (ctor == null) {
            Constructor<?>[] ctors = clazz.getConstructors();
            for (int i = 0, size = ctors.length; i < size; i++) {
                Class<?>[] ctorParams = ctors[i].getParameterTypes();
                if (ctorParams.length == 0) {
                    if (Modifier.isPublic(ctor.getModifiers())) {
                        Class<?> _clazz = ctor.getDeclaringClass();
                        if (Modifier.isPublic(_clazz.getModifiers()))
                            ctor = ctors[i];
                    }
                    if (ctor != null) {
                        try {
                            ctor.setAccessible(true);
                        } catch (SecurityException se) {
                            logger.warn("getInstance: " + clazz + " " + se.getMessage());
                        }
                    }
                }
            }
        }
        if (ctor == null)
            return null;

        Constructor<?> ctorPrev = constructors.putIfAbsent(keyName, ctor);
        if (ctorPrev != null)
            return ctorPrev;
        return ctor;
    }

    public static Object getInstance(SqlRuntimeContext runtimeCtx, Class<?> clazz) {
        Constructor<?> ctor = getInstanceConstructor(runtimeCtx, clazz);
        if (ctor == null) {
            logger.warn("getInstance: " + clazz + " can't get constructor");
        }

        try {
            return ctor.newInstance();
        } catch (InstantiationException e) {
            logger.error("getInstance: " + clazz, e);
            return null;
        } catch (IllegalAccessException e) {
            logger.error("getInstance: " + clazz, e);
            return null;
        } catch (IllegalArgumentException e) {
            logger.error("getInstance: " + clazz, e);
            return null;
        } catch (InvocationTargetException e) {
            logger.error("getInstance: " + clazz, e);
            return null;
        }
    }

    private static PropertyDescriptor[] getDescriptors(Class<?> clazz) {
        String keyName = clazz.getName();
        PropertyDescriptor[] _descriptors = descriptors.get(keyName);
        if (_descriptors != null)
            return _descriptors;

        BeanInfo beanInfo = null;
        try {
            beanInfo = Introspector.getBeanInfo(clazz);
        } catch (IntrospectionException e) {
            logger.error("getDescriptors: " + clazz, e);
            return null;
        }

        _descriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor pd : _descriptors) {
            if (pd instanceof IndexedPropertyDescriptor) {
                logger.warn("getDescriptors: " + clazz + " unsupported IndexedPropertyDescriptor "
                        + pd.getDisplayName());
            }
        }

        PropertyDescriptor[] _descriptorsPrev = descriptors.putIfAbsent(keyName, _descriptors);
        if (_descriptorsPrev != null)
            return _descriptorsPrev;
        return _descriptors;
    }

    private static PropertyDescriptor getAttributeDescriptor(Class<?> clazz, String attrName) {
        PropertyDescriptor descriptor = null;
        PropertyDescriptor[] descriptors = getDescriptors(clazz);
        if (descriptors != null) {
            for (PropertyDescriptor _descriptor : descriptors) {
                if (_descriptor.getName().equalsIgnoreCase(attrName)) {
                    descriptor = _descriptor;
                    break;
                }
            }
        }
        return descriptor;
    }

    // attributes

    public static Class<?> getAttributeType(SqlRuntimeContext runtimeCtx, Class<?> clazz, String attrName) {
        return getAttributeType(runtimeCtx, clazz, attrName, false);
    }

    private static Class<?> getAttributeType(SqlRuntimeContext runtimeCtx, Class<?> clazz, String attrName,
            boolean onlyCheck) {
        String keyName = clazz.getName() + "." + attrName;
        Class<?> attrType = types.get(keyName);
        if (attrType != null)
            return attrType;

        PropertyDescriptor descriptor = getAttributeDescriptor(clazz, attrName);
        if (descriptor == null) {
            if (!onlyCheck)
                logger.error("getAttributeType: there's no attribute " + attrName + " in " + clazz.getName());
            return null;
        }

        attrType = descriptor.getPropertyType();
        Class<?> attrTypePrev = types.putIfAbsent(keyName, attrType);
        if (attrTypePrev != null)
            return attrTypePrev;
        return attrType;
    }

    public static boolean checkAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName) {
        if (getAttributeType(runtimeCtx, bean.getClass(), attrName, true) != null)
            return true;
        return false;
    }

    // getters

    private static Method getGetter(SqlRuntimeContext runtimeCtx, Class<?> clazz, String attrName) {
        String keyName = clazz.getName() + "." + attrName;
        Method getter = getters.get(keyName);
        if (getter != null)
            return getter;

        PropertyDescriptor descriptor = getAttributeDescriptor(clazz, attrName);
        if (descriptor == null) {
            logger.error("getGetter: there's no attribute " + attrName + " in " + clazz.getName());
            return null;
        }

        getter = getMethod(clazz, descriptor.getReadMethod());
        if (getter == null)
            return null;

        Method getterPrev = getters.putIfAbsent(keyName, getter);
        if (getterPrev != null)
            return getterPrev;
        return getter;
    }

    public static class GetterType {
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

    public static GetterType getGetterType(SqlRuntimeContext runtimeCtx, Class<?> clazz, String attrName) {
        String keyName = clazz.getName() + "." + attrName;
        GetterType getterType = typeGetters.get(keyName);
        if (getterType != null)
            return getterType;

        Method m = getGetter(runtimeCtx, clazz, attrName);
        if (m == null)
            return null;

        getterType = new GetterType(m);
        GetterType getterTypePrev = typeGetters.putIfAbsent(keyName, getterType);
        if (getterTypePrev != null)
            return getterTypePrev;
        return getterType;
    }

    public static GetterType getGetterType(SqlRuntimeContext runtimeCtx, Object bean, String attrName) {
        return getGetterType(runtimeCtx, bean.getClass(), attrName);
    }

    private static final Object[] GETTER_ARG = new Object[0];

    public static Object getAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName) {
        Method getter = getGetter(runtimeCtx, bean.getClass(), attrName);
        if (getter == null)
            throw new SqlRuntimeException("getAttribute NoSuchMethodException: there's no getter for '" + attrName
                    + "' in " + bean.getClass());
        return simpleInvokeMethod(runtimeCtx, bean, getter, GETTER_ARG);
    }

    // setters

    private static String attrTypes2String(Class<?>... attrTypes) {
        if (attrTypes == null || attrTypes.length == 0)
            return "";
        StringBuilder sb = new StringBuilder(".");
        boolean first = true;
        for (Class<?> attrType : attrTypes) {
            if (first)
                first = false;
            else
                sb.append(",");
            sb.append(attrType.getName());
        }
        return sb.toString();
    }

    public static Method getSetter(SqlRuntimeContext runtimeCtx, Class<?> clazz, String attrName, Class<?>... attrTypes) {
        String keyName = clazz.getName() + "." + attrName + attrTypes2String(attrTypes);
        Method _setter = setters.get(keyName);
        if (_setter != null)
            return _setter;

        PropertyDescriptor descriptor = getAttributeDescriptor(clazz, attrName);
        if (descriptor == null)
            return null;

        _setter = getMethod(clazz, descriptor.getWriteMethod());
        if (_setter == null)
            return null;
        if (_setter.getParameterTypes() == null || _setter.getParameterTypes().length != 1)
            return null;

        Method setter = null;
        if (attrTypes == null || attrTypes.length == 0) {
            setter = _setter;
        } else {
            Class<?> setterType = _setter.getParameterTypes()[0];
            for (Class<?> _clazz : attrTypes) {
                if (_clazz.isAssignableFrom(setterType))
                    setter = _setter;
            }
        }
        if (setter == null)
            return null;

        Method setterPrev = setters.putIfAbsent(keyName, setter);
        if (setterPrev != null)
            return setterPrev;
        return setter;
    }

    public static Method getSetter(SqlRuntimeContext runtimeCtx, Object bean, String attrName, Class<?>... attrTypes) {
        return getSetter(runtimeCtx, bean.getClass(), attrName, attrTypes);
    }

    public static boolean simpleSetAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName,
            Object attrValue, Class<?>... attrTypes) {
        Method m = getSetter(runtimeCtx, bean, attrName, attrTypes);
        if (m != null) {
            simpleInvokeMethod(runtimeCtx, bean, m, toArray(attrValue));
            return true;
        } else {
            return false;
        }
    }

    public static void setAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName, Object attrValue) {
        Method setter = getSetter(runtimeCtx, bean, attrName);
        if (setter == null)
            throw new SqlRuntimeException("setAttribute NoSuchMethodException: there's no setter for '" + attrName
                    + "' in " + bean.getClass());
        simpleInvokeMethod(runtimeCtx, bean, setter, toArray(attrValue));
    }

    // methods invocation

    private static Method getMethod(Class<?> clazz, Method method) {

        if (method == null)
            return null;

        if (!Modifier.isPublic(method.getModifiers())) {
            return (null);
        }

        boolean sameClass = true;
        if (clazz == null) {
            clazz = method.getDeclaringClass();
        } else {
            sameClass = clazz.equals(method.getDeclaringClass());
            if (!method.getDeclaringClass().isAssignableFrom(clazz)) {
                logger.error("getMethod: " + clazz.getName() + " is not assignable from "
                        + method.getDeclaringClass().getName());
                return null;
            }
        }

        if (Modifier.isPublic(clazz.getModifiers())) {
            if (!sameClass && !Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
                try {
                    method.setAccessible(true);
                } catch (SecurityException se) {
                    logger.warn("getMethod: " + clazz + " " + se.getMessage());
                }
            }
            return method;
        }

        String methodName = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();

        method = getInterfaceMethod(clazz, methodName, parameterTypes);

        if (method == null) {
            method = getSuperclassMethod(clazz, methodName, parameterTypes);
        }

        return method;
    }

    private static Method getInterfaceMethod(Class<?> clazz, String methodName, Class<?>[] parameterTypes) {

        Method method = null;

        for (; clazz != null; clazz = clazz.getSuperclass()) {

            Class<?>[] interfaces = clazz.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                if (!Modifier.isPublic(interfaces[i].getModifiers())) {
                    continue;
                }
                try {
                    method = interfaces[i].getDeclaredMethod(methodName, parameterTypes);
                } catch (NoSuchMethodException e) {
                }
                if (method != null) {
                    return method;
                }
                method = getInterfaceMethod(interfaces[i], methodName, parameterTypes);
                if (method != null) {
                    return method;
                }
            }
        }
        return null;
    }

    private static Method getSuperclassMethod(Class<?> clazz, String methodName, Class<?>[] parameterTypes) {

        Class<?> parentClazz = clazz.getSuperclass();
        while (parentClazz != null) {
            if (Modifier.isPublic(parentClazz.getModifiers())) {
                try {
                    return parentClazz.getMethod(methodName, parameterTypes);
                } catch (NoSuchMethodException e) {
                    return null;
                }
            }
            parentClazz = parentClazz.getSuperclass();
        }
        return null;
    }

    private static Object[] toArray(Object arg) {
        Object[] args = null;
        if (arg != null) {
            args = new Object[] { arg };
        }
        return args;
    }

    public static Object simpleInvokeMethod(SqlRuntimeContext runtimeCtx, Object bean, Method m, Object[] arg) {
        Object result = null;
        try {
            if (!m.isAccessible())
                m.setAccessible(true);
            result = m.invoke(bean, arg);
        } catch (IllegalAccessException e) {
            throw new SqlRuntimeException(e);
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder("Not compatible output value of type ").append((arg != null) ? arg
                    .getClass() : "null");
            sb.append(". The result class of type ").append((bean != null) ? bean.getClass() : "null");
            sb.append(" for the method ").append(m.getName());
            sb.append(" is expecting the paramater(s) of type(s) ").append(
                    (m.getParameterTypes() != null) ? Arrays.asList(m.getParameterTypes()) : "empty");
            sb.append(".");
            throw new SqlRuntimeException(sb.toString(), e);
        } catch (InvocationTargetException e) {
            throw new SqlRuntimeException(e);
        }
        return result;
    }

    public static Object simpleInvokeMethod(SqlRuntimeContext runtimeCtx, Object bean, String methodName, Object arg) {
        try {
            return MethodUtils.invokeMethod(bean, methodName, arg);
        } catch (NoSuchMethodException e) {
            return null;
        } catch (IllegalAccessException e) {
            throw new SqlRuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new SqlRuntimeException(e);
        }
    }

    public static Object invokeMethod(SqlRuntimeContext runtimeCtx, Object bean, String methodName, Object[] args) {
        try {
            return MethodUtils.invokeMethod(bean, methodName, args);
        } catch (NoSuchMethodException e) {
            throw new SqlRuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new SqlRuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new SqlRuntimeException(e);
        }
    }

    // enums

    public static Object getEnumToValue(SqlRuntimeContext runtimeCtx, Object bean) {
        if (bean == null)
            return null;
        for (String methodName : runtimeCtx.getFeatures(SqlFeature.METHODS_ENUM_IN)) {
            try {
                return MethodUtils.invokeMethod(bean, methodName, null);
            } catch (NoSuchMethodException e) {
                continue;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    public static Class<?> getEnumToClass(SqlRuntimeContext runtimeCtx, Class<?> clazz) {
        if (clazz == null)
            return null;
        for (String methodName : runtimeCtx.getFeatures(SqlFeature.METHODS_ENUM_IN)) {
            Method m = MethodUtils.getMatchingAccessibleMethod(clazz, methodName, new Class[] {});
            if (m != null)
                return m.getReturnType();
        }
        return null;
    }

    public static Object getValueToEnum(SqlRuntimeContext runtimeCtx, Class<?> objClass, Object val) {
        if (val == null)
            return null;
        for (String methodName : runtimeCtx.getFeatures(SqlFeature.METHODS_ENUM_OUT)) {
            try {
                return MethodUtils.invokeStaticMethod(objClass, methodName, val);
            } catch (NoSuchMethodException e) {
                continue;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}
