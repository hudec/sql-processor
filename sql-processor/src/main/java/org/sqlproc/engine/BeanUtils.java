package org.sqlproc.engine;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.beanutils.ConstructorUtils;
import org.apache.commons.beanutils.MethodUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Bean utilities.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class BeanUtils {

    private static ConcurrentHashMap<String, Class<?>> attrsType = new ConcurrentHashMap<String, Class<?>>();
    private static ConcurrentHashMap<String, Method> beansGetter = new ConcurrentHashMap<String, Method>();
    private static ConcurrentHashMap<String, GetterType> beansGetterType = new ConcurrentHashMap<String, GetterType>();
    private static ConcurrentHashMap<String, Method> beansSetter = new ConcurrentHashMap<String, Method>();

    /**
     * The internal slf4j logger.
     */
    static final Logger logger = LoggerFactory.getLogger(BeanUtils.class);

    // instances

    public static <E> E getInstance(Class<E> clazz) {
        try {
            int isAstract = clazz.getModifiers() & 0x0400;
            if (isAstract != 0) {
                logger.warn("getInstance: " + clazz + " is abstract");
                return null;
            }
            Object o = ConstructorUtils.invokeConstructor(clazz, (Object[]) null);
            return (E) o;
        } catch (NoSuchMethodException e) {
            logger.error("getInstance", e);
            return null;
        } catch (IllegalAccessException e) {
            logger.error("getInstance", e);
            return null;
        } catch (InvocationTargetException e) {
            logger.error("getInstance", e);
            return null;
        } catch (InstantiationException e) {
            logger.error("getInstance", e);
            return null;
        }
    }

    // descriptor

    public static PropertyDescriptor getAttributeDescriptor(Class<?> clazz, String attrName, String calledFrom) {
        PropertyDescriptor[] descriptors = PropertyUtils.getPropertyDescriptors(clazz);
        PropertyDescriptor descriptor = null;
        if (descriptors != null) {
            for (PropertyDescriptor _descriptor : descriptors) {
                if (_descriptor.getName().equalsIgnoreCase(attrName)) {
                    descriptor = _descriptor;
                    break;
                }
            }
        }
        if (descriptor == null)
            logger.error("There's no attribute " + attrName + " in " + clazz.getName());
        return descriptor;
    }

    // attributes

    public static Class<?> getAttributeType(SqlRuntimeContext runtimeCtx, Class<?> clazz, String attrName) {
        String keyName = clazz.getName() + "." + attrName;
        Class<?> attrType = attrsType.get(keyName);
        if (attrType != null)
            return attrType;

        PropertyDescriptor descriptor = getAttributeDescriptor(clazz, attrName, "getAttributeType");
        if (descriptor == null)
            return null;

        attrType = descriptor.getPropertyType();
        Class<?> attrTypePrev = attrsType.putIfAbsent(keyName, attrType);
        if (attrTypePrev != null)
            return attrTypePrev;
        return attrType;
    }

    public static boolean checkAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName) {
        if (getAttributeType(runtimeCtx, bean.getClass(), attrName) != null)
            return true;
        return false;
    }

    // getters

    private static Method getGetter(SqlRuntimeContext runtimeCtx, Class<?> clazz, String attrName) {
        String keyName = clazz.getName() + "." + attrName;
        Method getter = beansGetter.get(keyName);
        if (getter != null)
            return getter;

        PropertyDescriptor descriptor = getAttributeDescriptor(clazz, attrName, "getGetter");
        if (descriptor == null)
            return null;

        getter = PropertyUtils.getReadMethod(descriptor);
        if (getter == null)
            return null;

        Method getterPrev = beansGetter.putIfAbsent(keyName, getter);
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
        GetterType getterType = beansGetterType.get(keyName);
        if (getterType != null)
            return getterType;

        Method m = getGetter(runtimeCtx, clazz, attrName);
        if (m == null)
            return null;

        getterType = new GetterType(m);
        GetterType getterTypePrev = beansGetterType.putIfAbsent(keyName, getterType);
        if (getterTypePrev != null)
            return getterTypePrev;
        return getterType;
    }

    public static GetterType getGetterType(SqlRuntimeContext runtimeCtx, Object bean, String attrName) {
        return getGetterType(runtimeCtx, bean.getClass(), attrName);
    }

    public static Object getAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName) {
        try {
            return PropertyUtils.getSimpleProperty(bean, attrName);
        } catch (IllegalAccessException e) {
            throw new SqlRuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new SqlRuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new SqlRuntimeException(e);
        }
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
        Method _setter = beansSetter.get(keyName);
        if (_setter != null)
            return _setter;

        PropertyDescriptor descriptor = getAttributeDescriptor(clazz, attrName, "getSetter");
        if (descriptor == null)
            return null;

        _setter = PropertyUtils.getWriteMethod(descriptor);
        if (_setter == null)
            return null;
        if (_setter.getParameterTypes() == null || _setter.getParameterTypes().length != 1)
            return null;

        Method setter = null;
        if (attrTypes == null) {
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

        Method setterPrev = beansSetter.putIfAbsent(keyName, setter);
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
            simpleInvokeMethod(runtimeCtx, bean, m, attrValue);
            return true;
        } else {
            return false;
        }
    }

    public static void setAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName, Object attrValue) {
        try {
            PropertyUtils.setSimpleProperty(bean, attrName, attrValue);
        } catch (IllegalAccessException e) {
            throw new SqlRuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new SqlRuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new SqlRuntimeException(e);
        }
    }

    // methods invocation

    public static Object simpleInvokeMethod(SqlRuntimeContext runtimeCtx, Object bean, Method m, Object arg) {
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
