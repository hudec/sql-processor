package org.sqlproc.engine.plugin;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.beanutils.ConstructorUtils;
import org.apache.commons.beanutils.MethodUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * Bean utilities.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class CommonsSqlBeansPlugin implements SqlBeansPlugin {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(CommonsSqlBeansPlugin.class);

    // instances

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getInstance(SqlRuntimeContext runtimeCtx, Class<?> clazz) {
        try {
            int isAstract = clazz.getModifiers() & 0x0400;
            if (isAstract != 0) {
                logger.warn("getInstance: " + clazz + " is abstract");
                return null;
            }
            return ConstructorUtils.invokeConstructor(clazz, (Object[]) null);
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

    protected PropertyDescriptor getAttributeDescriptor(Class<?> clazz, String attrName) {
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

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?> getAttributeType(SqlRuntimeContext runtimeCtx, Class<?> clazz, String attrName) {
        PropertyDescriptor descriptor = getAttributeDescriptor(clazz, attrName);
        if (descriptor == null) {
            logger.error("getAttributeType: there's no attribute " + attrName + " in " + clazz.getName());
            return null;
        }

        return descriptor.getPropertyType();
    }

    // getters

    protected Method getGetter(SqlRuntimeContext runtimeCtx, Class<?> clazz, String attrName, boolean onlyCheck) {
        PropertyDescriptor descriptor = getAttributeDescriptor(clazz, attrName);
        if (descriptor == null) {
            if (!onlyCheck)
                logger.error("getGetter: there's no attribute " + attrName + " in " + clazz.getName());
            return null;
        }

        Method getter = PropertyUtils.getReadMethod(descriptor);
        if (getter == null) {
            if (!onlyCheck)
                logger.error("getGetter: there's no getter " + attrName + " in " + clazz.getName());
            return null;
        }

        return getter;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetterType getGetterType(SqlRuntimeContext runtimeCtx, Class<?> clazz, String attrName) {
        Method m = getGetter(runtimeCtx, clazz, attrName, false);
        if (m == null)
            return null;

        return new GetterType(m);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetterType getGetterType(SqlRuntimeContext runtimeCtx, Object bean, String attrName) {
        return getGetterType(runtimeCtx, bean.getClass(), attrName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean checkAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName) {
        return getGetter(runtimeCtx, bean.getClass(), attrName, true) != null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName) {
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

    protected Method getSetter(SqlRuntimeContext runtimeCtx, Class<?> clazz, String attrName, boolean onlyCheck,
            Class<?>... attrTypes) {
        PropertyDescriptor descriptor = getAttributeDescriptor(clazz, attrName);
        if (descriptor == null) {
            if (!onlyCheck)
                logger.error("getSetter: there's no attribute " + attrName + " in " + clazz.getName());
        }

        Method _setter = PropertyUtils.getWriteMethod(descriptor);
        if (_setter == null) {
            if (!onlyCheck)
                logger.error("getSetter: there's no setter " + attrName + " in " + clazz.getName());
        }
        if (_setter.getParameterTypes() == null || _setter.getParameterTypes().length != 1) {
            if (!onlyCheck)
                logger.error("getSetter: there's no setter " + attrName + " in " + clazz.getName());
            return null;
        }

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
        if (setter == null) {
            if (!onlyCheck)
                logger.error("getSetter: there's no setter " + attrName + " in " + clazz.getName());
            return null;
        }

        return setter;
    }

    protected Method getSetter(SqlRuntimeContext runtimeCtx, Object bean, String attrName, Class<?>... attrTypes) {
        return getSetter(runtimeCtx, bean.getClass(), attrName, attrTypes);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean simpleSetAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName, Object attrValue,
            Class<?>... attrTypes) {
        Method setter = getSetter(runtimeCtx, bean, attrName, attrTypes);
        if (setter != null) {
            invokeMethod(runtimeCtx, bean, setter, attrValue);
            return true;
        } else {
            return false;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName, Object attrValue) {
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

    protected Object invokeMethod(SqlRuntimeContext runtimeCtx, Object bean, Method method, Object... args) {
        try {
            if (!method.isAccessible())
                try {
                    method.setAccessible(true);
                } catch (SecurityException se) {
                    logger.warn("invokeMethod: " + bean.getClass() + " " + se.getMessage());
                }
            return method.invoke(bean, args);
        } catch (IllegalAccessException e) {
            throw new SqlRuntimeException(debugInfo("invokeMethod", bean, method, args), e);
        } catch (IllegalArgumentException e) {
            throw new SqlRuntimeException(debugInfo("invokeMethod", bean, method, args), e);
        } catch (InvocationTargetException e) {
            throw new SqlRuntimeException(debugInfo("invokeMethod", bean, method, args), e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean checkMethod(SqlRuntimeContext runtimeCtx, Class<?> clazz, String methodName, Object... args) {
        Class<?>[] parameterTypes = toParameterTypes(args);
        return MethodUtils.getMatchingAccessibleMethod(clazz, methodName, parameterTypes) != null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean checkMethod(SqlRuntimeContext runtimeCtx, Object bean, String methodName, Object... args) {
        return checkMethod(runtimeCtx, bean.getClass(), methodName, args);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object invokeMethod(SqlRuntimeContext runtimeCtx, Class<?> clazz, String methodName, Object... args) {
        return invokeMethod(runtimeCtx, clazz, null, methodName, args);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object invokeMethod(SqlRuntimeContext runtimeCtx, Object bean, String methodName, Object... args) {
        return invokeMethod(runtimeCtx, bean.getClass(), bean, methodName, args);
    }

    protected Object invokeMethod(SqlRuntimeContext runtimeCtx, Class<?> clazz, Object bean, String methodName,
            Object... args) {
        try {
            if (bean == null)
                return MethodUtils.invokeStaticMethod(clazz, methodName, args);
            else
                return MethodUtils.invokeMethod(bean, methodName, args);
        } catch (IllegalAccessException e) {
            throw new SqlRuntimeException(debugInfo("invokeMethod", bean, methodName, null, args), e);
        } catch (IllegalArgumentException e) {
            throw new SqlRuntimeException(debugInfo("invokeMethod", bean, methodName, null, args), e);
        } catch (InvocationTargetException e) {
            throw new SqlRuntimeException(debugInfo("invokeMethod", bean, methodName, null, args), e);
        } catch (NoSuchMethodException e) {
            throw new SqlRuntimeException(debugInfo("invokeMethod", bean, methodName, null, args), e);
        }
    }

    // enums

    public Object getEnumToValue(SqlRuntimeContext runtimeCtx, Object bean) {
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

    public Class<?> getEnumToClass(SqlRuntimeContext runtimeCtx, Class<?> clazz) {
        if (clazz == null)
            return null;
        for (String methodName : runtimeCtx.getFeatures(SqlFeature.METHODS_ENUM_IN)) {
            Method m = MethodUtils.getMatchingAccessibleMethod(clazz, methodName, new Class[] {});
            if (m != null)
                return m.getReturnType();
        }
        return null;
    }

    public Object getValueToEnum(SqlRuntimeContext runtimeCtx, Class<?> objClass, Object val) {
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

    // misc

    protected String attrTypes2String(Class<?>... attrTypes) {
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

    protected Object[] toArray(Object arg) {
        Object[] args = null;
        if (arg != null) {
            args = new Object[] { arg };
        }
        return args;
    }

    protected Class<?>[] toParameterTypes(Object[] args) {
        if (args == null)
            return new Class[0];
        Class<?>[] parameterTypes = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            parameterTypes[i] = args[i].getClass();
        }
        return parameterTypes;
    }

    protected String debugInfo(String msg, Object bean, Method method, Object... args) {
        return debugInfo(msg, bean, (method != null) ? method.getName() : null, method, args);
    }

    protected String debugInfo(String msg, Object bean, String methodName, Method method, Object... args) {
        StringBuilder sb = new StringBuilder(msg);
        sb.append(": bean=").append((bean != null) ? bean.getClass() : "null");
        sb.append(", method=").append(methodName);
        if (args != null) {
            Class<?>[] parameterTypes = toParameterTypes(args);
            sb.append(", args=").append(attrTypes2String(parameterTypes));
        }
        if (method != null)
            sb.append(", method params=").append(
                    (method.getParameterTypes() != null) ? Arrays.asList(method.getParameterTypes()) : "empty");
        return sb.toString();
    }
}
