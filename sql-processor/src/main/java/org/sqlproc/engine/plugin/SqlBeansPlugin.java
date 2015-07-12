package org.sqlproc.engine.plugin;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.sqlproc.engine.SqlRuntimeContext;

public interface SqlBeansPlugin {

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

    public Object getInstance(SqlRuntimeContext runtimeCtx, Class<?> clazz);

    public Class<?> getAttributeType(SqlRuntimeContext runtimeCtx, Class<?> clazz, String attrName);

    public GetterType getGetterType(SqlRuntimeContext runtimeCtx, Class<?> clazz, String attrName);

    public GetterType getGetterType(SqlRuntimeContext runtimeCtx, Object bean, String attrName);

    public boolean checkAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName);

    public Object getAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName);

    public boolean simpleSetAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName, Object attrValue,
            Class<?>... attrTypes);

    public void setAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName, Object attrValue);

    public boolean checkMethod(SqlRuntimeContext runtimeCtx, Class<?> clazz, String methodName, Class<?>... argTypes);

    public boolean checkMethod(SqlRuntimeContext runtimeCtx, Object bean, String methodName, Object... args);

    public Object invokeMethod(SqlRuntimeContext runtimeCtx, Class<?> clazz, String methodName, Object... args);

    public Object invokeMethod(SqlRuntimeContext runtimeCtx, Object bean, String methodName, Object... args);

    public Object getEnumToValue(SqlRuntimeContext runtimeCtx, Object bean);

    public Class<?> getEnumToClass(SqlRuntimeContext runtimeCtx, Class<?> clazz);

    public Object getValueToEnum(SqlRuntimeContext runtimeCtx, Class<?> clazz, Object val);
}
