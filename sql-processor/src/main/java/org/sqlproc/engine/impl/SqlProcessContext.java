package org.sqlproc.engine.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngine;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlOrder;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.impl.SqlMetaSqlFragment.Type;
import org.sqlproc.engine.plugin.BeanUtilsPlugin.GetterType;
import org.sqlproc.engine.plugin.SqlPluginFactory;
import org.sqlproc.engine.type.SqlTypeFactory;

/**
 * The crate (design pattern) for all input parameters for the
 * {@link SqlMetaStatement#process(org.sqlproc.engine.impl.SqlMetaStatement.Type, Object, SqlControl, SqlEngine)}
 * 
 * Also can work as a context for a dynamic ANSI SQL query generation. This processing is based on the contract
 * {@link SqlMetaElement#process(SqlProcessContext)}.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlProcessContext implements SqlRuntimeContext {

    /**
     * The SQL command type.
     */
    private SqlMetaStatement.Type sqlStatementType;
    /**
     * The SQL statement dynamic parameters.
     */
    private Object dynamicInputValues;
    /**
     * The compound parameters controlling the META SQL execution.
     */
    private SqlControl sqlControl;
    /**
     * The primary SQL Processor class for the META SQL execution.
     */
    private SqlEngine sqlEngine;
    /**
     * The type of the META SQL fragment.
     */
    private Type sqlFragmentType;
    /**
     * Unset features in the runtime.
     */
    private Set<String> oppositeNames = new HashSet<String>();

    /**
     * Creates a new instance.
     * 
     * @param sqlStatementType
     *            the type of the SQL command
     * @param dynamicInputValues
     *            the dynamic input parameters
     * @param sqlControl
     *            the compound parameters controlling the META SQL execution
     * @param sqlEngine
     *            the primary SQL Processor class for the META SQL execution
     */
    SqlProcessContext(SqlMetaStatement.Type sqlStatementType, Object dynamicInputValues, SqlControl sqlControl,
            SqlEngine sqlEngine) {
        this.sqlStatementType = sqlStatementType;
        this.dynamicInputValues = dynamicInputValues;
        this.sqlControl = sqlControl;
        this.sqlEngine = sqlEngine;
        initFeatures();
    }

    /**
     * Creates a new instance.
     * 
     * @param ctx
     *            the crate for all input parameters and the context of processing
     * @param dynamicInputValues
     *            the dynamic input parameters
     * @param sqlControl
     *            the compound parameters controlling the META SQL execution
     */
    SqlProcessContext(SqlProcessContext ctx, Object dynamicInputValues, SqlControl sqlControl) {
        this.sqlStatementType = ctx.sqlStatementType;
        this.dynamicInputValues = dynamicInputValues;
        this.sqlControl = sqlControl;
        this.sqlEngine = ctx.sqlEngine;
        initFeatures();
    }

    /**
     * Initialize the optional features.
     */
    private void initFeatures() {
        final Map<String, Object> runtimeFeatures = SqlEngine.getFeatures(sqlControl);
        if (runtimeFeatures != null) {
            for (Entry<String, Object> entry : runtimeFeatures.entrySet()) {
                Set<String> oppositeNames = SqlUtils.oppositeFeatures(entry.getKey());
                if (oppositeNames != null)
                    this.oppositeNames.addAll(oppositeNames);
            }
        }
    }

    /**
     * Returns the SQL command type.
     * 
     * @return the SQL command type
     */
    SqlMetaStatement.Type getSqlStatementType() {
        return sqlStatementType;
    }

    /**
     * Returns the SQL statement dynamic parameters.
     * 
     * @return the SQL statement dynamic parameters
     */
    public Object getDynamicInputValues() {
        if (sqlFragmentType != Type.SET)
            return dynamicInputValues;
        Object dynamicUpdateValues = SqlEngine.getDynamicUpdateValues(sqlControl);
        if (dynamicUpdateValues != null)
            return dynamicUpdateValues;
        return dynamicInputValues;
    }

    /**
     * Returns the SQL statement static parameters.
     * 
     * @return the SQL statement static parameters
     */
    public Object getStaticInputValues() {
        return SqlEngine.getStaticInputValues(sqlControl);
    }

    /**
     * Returns the compound parameters controlling the META SQL execution.
     * 
     * @return the compound parameters controlling the META SQL execution
     */
    public Map<String, Class<?>> getMoreResultClasses() {
        return SqlEngine.getMoreResultClasses(sqlControl);
    }

    /**
     * Sets the type of the META SQL fragment.
     * 
     * @param sqlFragmentType
     *            the type of the META SQL fragment
     */
    public void setSqlFragmentType(Type sqlFragmentType) {
        this.sqlFragmentType = sqlFragmentType;
    }

    /**
     * Returns the indicator the SET or VALUES fragment of META SQL is in process
     * 
     * @return the indicator the SET or VALUES fragment of META SQL is in process
     */
    public boolean isInSetOrInsert() {
        return sqlFragmentType == Type.SET || sqlFragmentType == Type.VALUES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getFeature(String name) {
        Object o = getRawFeature(name);
        return (o != null && o instanceof String) ? (String) o : null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getFeature(SqlFeature feature) {
        Object o = getRawFeature(feature);
        return (o != null && o instanceof String) ? (String) o : null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getFeature(SqlFeature feature, String specName) {
        Object o = getRawFeature(feature.name() + "###" + specName);
        return (o != null && o instanceof String) ? (String) o : null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] getFeatures(String name) {
        Object o = getRawFeature(name);
        if (o != null && o instanceof String[])
            return (String[]) o;
        if (o != null && o instanceof String)
            return new String[] { (String) o };
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isFeature(SqlFeature feature) {
        Object o = getRawFeature(feature.name());
        return (o != null && o instanceof Boolean && ((Boolean) o)) ? true : false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getFeatureAsInt(SqlFeature feature) {
        Object o = getRawFeature(feature.name());
        // if (o == null)
        // o = getRawFeature("DEFAULT_" + name);
        if (o == null || !(o instanceof String))
            return null;
        try {
            return Integer.parseInt((String) o);
        } catch (NumberFormatException nfe) {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getFeatureAsObject(SqlFeature feature) {
        Object o = getRawFeature(feature.name());
        // if (o == null)
        // o = getRawFeature("DEFAULT_" + name);
        return o;
    }

    /**
     * Convenient method to obtain a feature based on the name.
     * 
     * @param feature
     *            the feature
     * @return value of the feature
     */
    protected Object getRawFeature(SqlFeature feature) {
        return getRawFeature(feature.name());
    }

    /**
     * Convenient method to obtain a feature based on the name.
     * 
     * @param name
     *            name of the feature
     * @return value of the feature
     */
    protected Object getRawFeature(String name) {
        Map<String, Object> runtimeFeatures = SqlEngine.getFeatures(sqlControl);
        if (runtimeFeatures != null && runtimeFeatures.containsKey(name))
            return runtimeFeatures.get(name);
        if (oppositeNames.contains(name))
            return null;
        return sqlEngine.getFeatures().get(name);
    }

    /**
     * Returns the list of ordering directives.
     * 
     * @return the list of ordering directives
     */
    List<SqlOrder> getOrder() {
        return SqlEngine.getOrder(sqlControl).getOrders();
    }

    /**
     * Convenient method to obtain the index of the ordering directive.
     * 
     * @param orderId
     *            the order number
     * @return the index of the ordering directive
     */
    int getOrderIndex(String orderId) {
        List<SqlOrder> order = getOrder();
        if (order == null || order.isEmpty())
            return -1;
        for (int i = 0; i < order.size(); i++) {
            SqlOrder sqlOrder = order.get(i);
            if (sqlOrder.getOrderId().equals(orderId))
                return i;
        }
        return -1;
    }

    /**
     * Convenient method to obtain the ordering directive based on the index.
     * 
     * @param orderIndex
     *            the index of the ordering rule
     * @return the ordering directive
     */
    SqlOrder.Order getOrder(int orderIndex) {
        List<SqlOrder> order = getOrder();
        if (orderIndex < 0 || orderIndex >= order.size())
            return SqlOrder.Order.NONE;
        return order.get(orderIndex).getOrderDirection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlTypeFactory getTypeFactory() {
        return sqlEngine.getTypeFactory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlPluginFactory getPluginFactory() {
        return sqlEngine.getPluginFactory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getInstance(Class<?> clazz) {
        return getPluginFactory().getSqlBeansPlugin().getInstance(this, clazz);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?> getAttributeType(Class<?> clazz, String attrName) {
        return getPluginFactory().getSqlBeansPlugin().getAttributeType(this, clazz, attrName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?>[] getAttributeParameterizedTypes(Class<?> clazz, String attrName) {
        return getPluginFactory().getSqlBeansPlugin().getAttributeParameterizedTypes(this, clazz, attrName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetterType getGetterType(Class<?> clazz, String attrName) {
        return getPluginFactory().getSqlBeansPlugin().getGetterType(this, clazz, attrName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetterType getGetterType(Object bean, String attrName) {
        return getPluginFactory().getSqlBeansPlugin().getGetterType(this, bean, attrName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean checkAttribute(Object bean, String attrName) {
        return getPluginFactory().getSqlBeansPlugin().checkAttribute(this, bean, attrName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getAttribute(Object bean, String attrName) {
        return getPluginFactory().getSqlBeansPlugin().getAttribute(this, bean, attrName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean simpleSetAttribute(Object bean, String attrName, Object attrValue, Class<?>... attrTypes) {
        return getPluginFactory().getSqlBeansPlugin().simpleSetAttribute(this, bean, attrName, attrValue, attrTypes);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setAttribute(Object bean, String attrName, Object attrValue) {
        getPluginFactory().getSqlBeansPlugin().setAttribute(this, bean, attrName, attrValue);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean checkMethod(Class<?> clazz, String methodName, Class<?>... args) {
        return getPluginFactory().getSqlBeansPlugin().checkMethod(this, clazz, methodName, args);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean checkMethod(Object bean, String methodName, Object... args) {
        return getPluginFactory().getSqlBeansPlugin().checkMethod(this, bean, methodName, args);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object invokeMethod(Class<?> clazz, String methodName, Object... args) {
        return getPluginFactory().getSqlBeansPlugin().invokeMethod(this, clazz, methodName, args);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object invokeMethod(Object bean, String methodName, Object... args) {
        return getPluginFactory().getSqlBeansPlugin().invokeMethod(this, bean, methodName, args);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getEnumToValue(Object bean) {
        return getPluginFactory().getSqlBeansPlugin().getEnumToValue(this, bean);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?> getEnumToClass(Class<?> clazz) {
        return getPluginFactory().getSqlBeansPlugin().getEnumToClass(this, clazz);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getValueToEnum(Class<?> objClass, Object val) {
        return getPluginFactory().getSqlBeansPlugin().getValueToEnum(this, objClass, val);
    }

    /**
     * For debug purposes.
     * 
     * @return a String representation for a debug output
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("SqlProcessContext[");
        sb.append(" sqlStatementType=").append(sqlStatementType);
        sb.append(", dynamicInputValues=").append(dynamicInputValues);
        sb.append(", sqlControl=").append((sqlControl != null) ? sqlControl.toString() : null);
        sb.append(", sqlEngine=").append(sqlEngine);
        return sb.append("]").toString();
    }
}
