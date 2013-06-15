package org.sqlproc.engine.impl;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.sqlproc.engine.SqlOrder;
import org.sqlproc.engine.plugin.SqlPluginFactory;
import org.sqlproc.engine.type.SqlTypeFactory;

/**
 * The crate (design pattern) for all input parameters for the
 * {@link SqlMetaStatement#process(org.sqlproc.engine.impl.SqlMetaStatement.Type, Object, Object, List, Map, SqlTypeFactory, SqlPluginFactory)}
 * 
 * Also can work as a context for a dynamic ANSI SQL query generation. This processing is based on the contract
 * {@link SqlMetaElement#process(SqlProcessContext)}.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlProcessContext {

    /**
     * The SQL command type.
     */
    SqlMetaStatement.Type sqlStatementType;
    /**
     * The SQL statement dynamic parameters.
     */
    Object dynamicInputValues;
    /**
     * The SQL statement static parameters.
     */
    Object staticInputValues;
    /**
     * The list of ordering directives.
     */
    List<SqlOrder> order;
    /**
     * An indicator, that the processing is inside of the special SQL fragment - SET or VALUES.
     */
    boolean inSqlSetOrInsert;

    /**
     * The thread local holder for the configuration object.
     */
    private static final ThreadLocal<Map<String, Object>> currentFeatures = new ThreadLocal<Map<String, Object>>();

    /**
     * The thread local holder for the factory responsible for the META types construction.
     */
    private static final ThreadLocal<SqlTypeFactory> currentTypeFactory = new ThreadLocal<SqlTypeFactory>();

    /**
     * The thread local holder for the factory for the SQL Processor plugins. This is the basic facility to alter the
     * SQL Processor processing.
     */
    private static final ThreadLocal<SqlPluginFactory> currentPluginFactory = new ThreadLocal<SqlPluginFactory>();

    /**
     * Creates a new instance.
     * 
     * @param sqlStatementType
     *            the type of the SQL command
     * @param dynamicInputValues
     *            the dynamic input parameters
     * @param staticInputValues
     *            the static input parameters
     * @param order
     *            the list of ordering directives
     * @param features
     *            the optional features in the statement/global scope
     * @param runtimeFeatures
     *            the optional features in the statement's exection scope
     * @param typeFactory
     *            the factory for the META types construction
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     */
    SqlProcessContext(SqlMetaStatement.Type sqlStatementType, Object dynamicInputValues, Object staticInputValues,
            List<SqlOrder> order, Map<String, Object> features, Map<String, Object> runtimeFeatures,
            SqlTypeFactory typeFactory, SqlPluginFactory pluginFactory) {
        this.sqlStatementType = sqlStatementType;
        this.dynamicInputValues = dynamicInputValues;
        this.staticInputValues = staticInputValues;
        this.order = order;
        setFeatures(features, runtimeFeatures);
        setTypeFactory(typeFactory);
        setPluginFactory(pluginFactory);
    }

    public SqlMetaStatement.Type getSqlStatementType() {
        return sqlStatementType;
    }

    /**
     * Convenient method to obtain a String feature based on the name.
     * 
     * @param name
     *            name of the feature
     * @return value of the feature
     */
    public static String getFeature(String name) {
        Object o = getFeatures().get(name);
        return (o != null && o instanceof String) ? (String) o : null;
    }

    /**
     * Convenient method to obtain a String array features based on the name.
     * 
     * @param name
     *            name of the feature
     * @return the array of the feature values
     */
    public static String[] getFeatures(String name) {
        Object o = getFeatures().get(name);
        if (o != null && o instanceof String[])
            return (String[]) o;
        if (o != null && o instanceof String)
            return new String[] { (String) o };
        return null;
    }

    /**
     * Convenient method to obtain a boolean feature based on the name.
     * 
     * @param name
     *            name of the feature
     * @return value of the feature
     */
    public static boolean isFeature(String name) {
        Object o = getFeatures().get(name);
        return (o != null && o instanceof Boolean && ((Boolean) o)) ? true : false;
    }

    /**
     * Convenient method to obtain an Integer feature based on the name.
     * 
     * @param name
     *            name of the feature
     * @return value of the feature
     */
    public static Integer getFeatureAsInt(String name) {
        Object o = getFeatures().get(name);
        if (o == null)
            o = getFeatures().get("DEFAULT_" + name);
        if (o == null || !(o instanceof String))
            return null;
        try {
            return Integer.parseInt((String) o);
        } catch (NumberFormatException nfe) {
            return null;
        }
    }

    /**
     * Convenient method to obtain the index of the ordering directive.
     * 
     * @param orderId
     *            the order number
     * @return the index of the ordering directive
     */
    int getOrderIndex(int orderId) {
        if (order == null || order.isEmpty())
            return -1;
        for (int i = 0; i < order.size(); i++) {
            SqlOrder sqlOrder = order.get(i);
            if (sqlOrder.getOrderId() == orderId)
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
        if (orderIndex < 0 || orderIndex >= order.size())
            return SqlOrder.Order.NONE;
        return order.get(orderIndex).getOrderDirection();
    }

    /**
     * Returns the features for the current thread.
     * 
     * @return the current thread's features
     */
    static Map<String, Object> getFeatures() {
        final Map<String, Object> features = currentFeatures.get();
        if (features == null) {
            throw new RuntimeException("There are no features attached to current thread "
                    + Thread.currentThread().getName());
        }
        return features;
    }

    /**
     * THIS METHOD IS NOT PART OF THE SQL PROCESSOR PUBLIC API. DO NOT USE IT.
     * 
     * @param features
     *            the optional features in the statement/global scope
     * @param runtimeFeatures
     *            the optional features in the statement's exection scope
     */
    static void setFeatures(final Map<String, Object> features, Map<String, Object> runtimeFeatures) {
        // if (currentFeatures.get() != null)
        // return;
        if (features == null) {
            throw new IllegalArgumentException("Argument features can not be null");
        }
        currentFeatures.set(features);
        if (runtimeFeatures == null)
            return;
        for (Entry<String, Object> entry : runtimeFeatures.entrySet()) {
            currentFeatures.get().put(entry.getKey(), entry.getValue());
            String oppositeName = SqlUtils.oppositeFeature(entry.getKey());
            if (oppositeName != null)
                currentFeatures.get().remove(oppositeName);
        }
    }

    /**
     * THIS METHOD IS NOT PART OF THE SQL PROCESSOR PUBLIC API. DO NOT USE IT. IT'S USED ONLY FROM JUNIT TESTS.
     */
    static void nullFeatures() {
        currentFeatures.set(null);
    }

    /**
     * Returns the factory for the current thread responsible for the META types construction.
     * 
     * @return the current thread's factory for the META types construction
     */
    public static SqlTypeFactory getTypeFactory() {
        final SqlTypeFactory typeFactory = currentTypeFactory.get();
        if (typeFactory == null) {
            throw new RuntimeException("There is no typeFactory attached to current thread "
                    + Thread.currentThread().getName());
        }
        return typeFactory;
    }

    /**
     * THIS METHOD IS NOT PART OF THE SQL PROCESSOR PUBLIC API. DO NOT USE IT.
     * 
     * @param typeFactory
     *            the factory for the META types construction
     */
    static void setTypeFactory(final SqlTypeFactory typeFactory) {
        // if (currentTypeFactory.get() != null)
        // return;
        if (typeFactory == null) {
            throw new IllegalArgumentException("Argument typeFactory can not be null");
        }
        currentTypeFactory.set(typeFactory);
    }

    /**
     * THIS METHOD IS NOT PART OF THE SQL PROCESSOR PUBLIC API. DO NOT USE IT. IT'S USED ONLY FROM JUNIT TESTS.
     */
    static void nullTypeFactory() {
        currentTypeFactory.set(null);
    }

    /**
     * Returns the factory for the current thread responsible for the SQL Processor plugins.
     * 
     * @return the current thread's factory for the SQL Processor plugins
     */
    public static SqlPluginFactory getPluginFactory() {
        final SqlPluginFactory pluginFactory = currentPluginFactory.get();
        if (pluginFactory == null) {
            throw new RuntimeException("There is no pluginFactory attached to current thread "
                    + Thread.currentThread().getName());
        }
        return pluginFactory;
    }

    /**
     * THIS METHOD IS NOT PART OF THE SQL PROCESSOR PUBLIC API. DO NOT USE IT.
     * 
     * @param pluginFactory
     *            the factory for the SQL Processor plugins
     */
    static void setPluginFactory(final SqlPluginFactory pluginFactory) {
        // if (currentPluginFactory.get() != null)
        // return;
        if (pluginFactory == null) {
            throw new IllegalArgumentException("Argument pluginFactory can not be null");
        }
        currentPluginFactory.set(pluginFactory);
    }

    /**
     * THIS METHOD IS NOT PART OF THE SQL PROCESSOR PUBLIC API. DO NOT USE IT. IT'S USED ONLY FROM JUNIT TESTS.
     */
    static void nullPluginFactory() {
        currentPluginFactory.set(null);
    }
}
