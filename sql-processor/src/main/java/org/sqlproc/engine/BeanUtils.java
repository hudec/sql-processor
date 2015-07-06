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

    // attributes

    public static Class<?> getAttributeType(Class<?> clazz, String attrName) {
        String keyName = clazz.getName() + "." + attrName;
        Class<?> attrType = attrsType.get(keyName);
        if (attrType != null)
            return attrType;

        PropertyDescriptor[] descriptors = PropertyUtils.getPropertyDescriptors(clazz);
        if (descriptors != null) {
            for (int i = 0; i < descriptors.length; i++) {
                if (attrName.equals(descriptors[i].getName())) {
                    attrType = (descriptors[i].getPropertyType());
                    break;
                }
            }
        }
        if (attrType == null)
            return null;

        Class<?> attrTypePrev = attrsType.putIfAbsent(keyName, attrType);
        if (attrTypePrev != null)
            return attrTypePrev;
        return attrType;
    }

    public static boolean checkAttribute(Object bean, String attrName) {
        if (getAttributeType(bean.getClass(), attrName) != null)
            return true;
        return false;
    }

    // getters

    private static Method getGetter(Class<?> clazz, String attrName) {
        String keyName = clazz.getName() + "." + attrName;
        Method getter = beansGetter.get(keyName);
        if (getter != null)
            return getter;

        PropertyDescriptor[] descriptors = PropertyUtils.getPropertyDescriptors(clazz);
        if (descriptors != null) {
            for (int i = 0; i < descriptors.length; i++) {
                if (attrName.equals(descriptors[i].getName())) {
                    getter = PropertyUtils.getReadMethod(descriptors[i]);
                    break;
                }
            }
        }
        if (getter == null)
            return null;

        Method getterPrev = beansGetter.putIfAbsent(keyName, getter);
        if (getterPrev != null)
            return getterPrev;
        return getter;
    }

    public static Method getGetter(Object bean, String attrName) {
        return getGetter(bean.getClass(), attrName);
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

    public static GetterType getGetterType(Class<?> clazz, String attrName) {
        String keyName = clazz.getName() + "." + attrName;
        GetterType getterType = beansGetterType.get(keyName);
        if (getterType != null)
            return getterType;

        Method m = getGetter(clazz, attrName);
        if (m == null)
            return null;

        getterType = new GetterType(m);
        GetterType getterTypePrev = beansGetterType.putIfAbsent(keyName, getterType);
        if (getterTypePrev != null)
            return getterTypePrev;
        return getterType;
    }

    public static GetterType getGetterType(Object bean, String attrName) {
        return getGetterType(bean.getClass(), attrName);
    }

    public static Object getAttribute(Object bean, String attrName) {
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

    public static void setProperty(Object bean, String name, Object value) {
        try {
            PropertyUtils.setSimpleProperty(bean, name, value);
        } catch (IllegalAccessException e) {
            throw new SqlRuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new SqlRuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new SqlRuntimeException(e);
        }
    }

    // used only for the output values handling, it's tested for the result null
    public static Method getSetter(Object bean, String attrName, Class<?>... attrTypes) {
        PropertyDescriptor descriptor;
        try {
            descriptor = PropertyUtils.getPropertyDescriptor(bean, attrName);
        } catch (IllegalAccessException e) {
            logger.error("getProperty", e);
            return null;
        } catch (InvocationTargetException e) {
            logger.error("getProperty", e);
            return null;
        } catch (NoSuchMethodException e) {
            logger.error("getProperty", e);
            return null;
        }
        if (descriptor == null)
            return null;
        Method m = PropertyUtils.getWriteMethod(descriptor);
        if (m == null)
            return null;
        if (m.getParameterTypes() == null || m.getParameterTypes().length != 1)
            return null;
        Class<?> parameterClass = m.getParameterTypes()[0];
        if (attrTypes == null)
            return m;
        for (Class<?> clazz : attrTypes) {
            if (clazz.isAssignableFrom(parameterClass))
                return m;
        }
        return null;
    }

    public static Object simpleInvokeMethod(Method m, Object obj, Object param) {
        Object result;
        if (m != null) {
            try {
                if (!m.isAccessible())
                    m.setAccessible(true);
                result = m.invoke(obj, param);
            } catch (IllegalAccessException e) {
                throw new SqlRuntimeException(e);
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder("Not compatible output value of type ")
                        .append((param != null) ? param.getClass() : "null");
                sb.append(". The result class of type ").append((obj != null) ? obj.getClass() : "null");
                sb.append(" for the method ").append(m.getName());
                sb.append(" is expecting the paramater(s) of type(s) ").append(
                        (m.getParameterTypes() != null) ? Arrays.asList(m.getParameterTypes()) : "empty");
                sb.append(".");
                throw new SqlRuntimeException(sb.toString(), e);
            } catch (InvocationTargetException e) {
                throw new SqlRuntimeException(e);
            }
        } else
            result = null;
        return result;
    }

    public static boolean simpleInvokeSetter(Object bean, String attrName, Object attrValue, Class<?>... attrTypes) {
        Method m = getSetter(bean, attrName, attrTypes);
        if (m != null) {
            simpleInvokeMethod(m, bean, attrValue);
            return true;
        } else {
            return false;
        }
    }

    public static Object invokeMethod(Object obj, String methodName, Object[] args) {
        try {
            return MethodUtils.invokeMethod(obj, methodName, args);
        } catch (NoSuchMethodException e) {
            throw new SqlRuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new SqlRuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new SqlRuntimeException(e);
        }
    }

    public static Object invokeMethodIgnoreNoSuchMethod(Object obj, String methodName, Object arg) {
        try {
            return MethodUtils.invokeMethod(obj, methodName, arg);
        } catch (NoSuchMethodException e) {
            return null;
        } catch (IllegalAccessException e) {
            throw new SqlRuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new SqlRuntimeException(e);
        }
    }

    // enums

    public static Object getEnumToValue(SqlRuntimeContext runtimeCtx, Object obj) {
        if (obj == null)
            return null;
        for (String methodName : runtimeCtx.getFeatures(SqlFeature.METHODS_ENUM_IN)) {
            try {
                return MethodUtils.invokeMethod(obj, methodName, null);
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

    @SuppressWarnings("rawtypes")
    public static Class getEnumToClass(SqlRuntimeContext runtimeCtx, Class clazz) {
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
