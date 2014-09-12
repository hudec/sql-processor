package org.sqlproc.engine.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngine;
import org.sqlproc.engine.SqlOrder;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.plugin.SqlPluginFactory;
import org.sqlproc.engine.type.SqlTypeFactory;

/**
 * The crate (design pattern) for all input parameters for the
 * {@link SqlMetaStatement#process(org.sqlproc.engine.impl.SqlMetaStatement.Type, Object, Object, List, Map, Map, SqlTypeFactory, SqlPluginFactory)}
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
    SqlMetaStatement.Type sqlStatementType;
    /**
     * The SQL statement dynamic parameters.
     */
    Object dynamicInputValues;
    /**
     * The compound parameters controlling the META SQL execution.
     */
    SqlControl sqlControl;
    /**
     * The primary SQL Processor class for the META SQL execution.
     */
    SqlEngine sqlEngine;
    /**
     * An indicator, that the processing is inside of the special SQL fragment - SET or VALUES.
     */
    boolean inSqlSetOrInsert;
    /**
     * Unset features in the runtime.
     */
    Set<String> oppositeNames = new HashSet<String>();

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
        return dynamicInputValues;
    }

    /**
     * Returns the SQL statement static parameters.
     * 
     * @return the SQL statement static parameters
     */
    public Object getStaticInputValues() {
        return sqlEngine.getStaticInputValues(sqlControl);
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
    public boolean isFeature(String name) {
        Object o = getRawFeature(name);
        return (o != null && o instanceof Boolean && ((Boolean) o)) ? true : false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getFeatureAsInt(String name) {
        Object o = getRawFeature(name);
        if (o == null)
            o = getRawFeature("DEFAULT_" + name);
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
    public Object getFeatureAsObject(String name) {
        Object o = getRawFeature(name);
        if (o == null)
            o = getRawFeature("DEFAULT_" + name);
        return o;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getRawFeature(String name) {
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
    int getOrderIndex(int orderId) {
        List<SqlOrder> order = getOrder();
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
        List<SqlOrder> order = getOrder();
        if (orderIndex < 0 || orderIndex >= order.size())
            return SqlOrder.Order.NONE;
        return order.get(orderIndex).getOrderDirection();
    }

    /**
     * {@inheritDoc}
     */
    public SqlTypeFactory getTypeFactory() {
        return sqlEngine.getTypeFactory();
    }

    /**
     * {@inheritDoc}
     */
    public SqlPluginFactory getPluginFactory() {
        return sqlEngine.getPluginFactory();
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
