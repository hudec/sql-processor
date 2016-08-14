package org.sqlproc.engine.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlOrder;
import org.sqlproc.engine.SqlSession;

/**
 * The compound parameters controlling the META SQL execution.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlStandardControl implements SqlControl {

    /**
     * The object used for the SQL statement dynamic input values. The class of this object is also named as the input
     * class or the dynamic parameters class. The exact class type isn't important, all the parameters settled into the
     * SQL prepared statement are picked up using the reflection API.
     */
    private Object staticInputValues;
    /**
     * The object used for the SQL update statement dynamic input values. This enables to split input values into value
     * used for WHERE fragment and for UPDATE fragment of the SQL statement. In the case this parameter is null, the
     * dynamicInputValues parameter for {@link SqlCrudEngine#update(SqlSession, Object, SqlControl)} holds all input
     * values.
     */
    private Object dynamicUpdateValues;
    /**
     * The max SQL execution time. This parameter can help to protect production system against ineffective SQL query
     * commands. The value is in milliseconds.
     */
    private Integer maxTimeout;
    /**
     * The first SQL execution output row to be returned in the case we need to skip some rows in the result set. The
     * primary usage is to support the pagination.
     */
    private Integer firstResult;
    /**
     * The max number of SQL execution output rows, which can be returned in the result list. The primary usage is to
     * support the pagination.
     */
    private Integer maxResults;
    /**
     * The ordering directive list. Using the class SqlOrder the ordering rules can be chained. Every ordering rule in
     * this chain should correspond to one META SQL ordering statement.
     */
    private SqlOrder order;
    /**
     * More result classes used for the return values, like the collections classes or the collections items. They are
     * used mainly for the one-to-one, one-to-many and many-to-many associations.
     */
    private Map<String, Class<?>> moreResultClasses;

    /**
     * The optional features. These features are defined in the statement execution scope. In the case of conflict with
     * the optional features defined in sthe statement/global scope, their priority is higher.
     */
    private Map<String, Object> features = new HashMap<String, Object>();

    /**
     * The unique ID of the executed statement based on input values combination. This ID can be used for the caching
     * purposes to optimize the
     * {@link org.sqlproc.engine.impl.SqlMetaStatement#process(org.sqlproc.engine.impl.SqlMetaStatement.Type, Object, SqlControl, org.sqlproc.engine.SqlEngine)}
     * 
     * The generation of the final ANSI SQL statement from the META SQL statement is influenced by the input values
     * combination. This ID is an indicator of the uniqueness these input values. For more info please see the
     * tutorials.
     */
    private String processingId;

    /**
     * Returns the fetch size of SQL execution output rows, which can be returned in one SQL statement.
     */
    private Integer fetchSize;

    /**
     * The indicator, that an empty INSERT or UPDATE statement execution should be ignored (for example update statement
     * without any bounded input values).
     */
    private Boolean skipEmptyStatement;

    /**
     * Standard constructor.
     */
    public SqlStandardControl() {
    }

    /**
     * Merging constructor.
     */
    public SqlStandardControl(SqlControl sqlControl) {
        if (sqlControl != null) {
            setStaticInputValues(sqlControl.getStaticInputValues());
            setDynamicUpdateValues(sqlControl.getDynamicUpdateValues());
            setFirstResult(sqlControl.getFirstResult());
            setMaxResults(sqlControl.getMaxResults());
            setMaxTimeout(sqlControl.getMaxTimeout());
            setMoreResultClasses(sqlControl.getMoreResultClasses());
            setOrder(sqlControl.getOrder());
            setFeatures(sqlControl.getFeatures());
            setProcessingId(sqlControl.getProcessingId());
            setFetchSize(sqlControl.getFetchSize());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getStaticInputValues() {
        return staticInputValues;
    }

    /**
     * Sets the object used for the SQL statement static input values. The class of this object is also named as the
     * input class or the static parameters class. The exact class type isn't important, all the parameters injected
     * into the SQL query command are picked up using the reflection API. Compared to dynamicInputValues input
     * parameters, parameters in this class should't be produced by an end user to prevent SQL injection threat!
     * 
     * @param staticInputValues
     *            the object used for the SQL statement static input values
     * @return this instance
     */
    public SqlStandardControl setStaticInputValues(Object staticInputValues) {
        this.staticInputValues = staticInputValues;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getDynamicUpdateValues() {
        return dynamicUpdateValues;
    }

    /**
     * Sets the object used for the SQL update statement dynamic input values. This enables to split input values into
     * value used for WHERE fragment and for UPDATE fragment of the SQL statement. In the case this parameter is null,
     * the dynamicInputValues parameter for {@link SqlCrudEngine#update(SqlSession, Object, SqlControl)} holds all input
     * values.
     * 
     * @param dynamicUpdateValues
     *            the object used for the SQL update statement dynamic input values (UPDATE fragment)
     * @return this instance
     */
    public SqlStandardControl setDynamicUpdateValues(Object dynamicUpdateValues) {
        this.dynamicUpdateValues = dynamicUpdateValues;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getMaxTimeout() {
        return maxTimeout;
    }

    /**
     * Sets the max SQL execution time. This parameter can help to protect production system against ineffective SQL
     * query commands. The value is in milliseconds.
     * 
     * @param maxTimeout
     *            the max SQL execution time
     * @return this instance
     */
    public SqlStandardControl setMaxTimeout(Integer maxTimeout) {
        this.maxTimeout = maxTimeout;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getFirstResult() {
        return firstResult;
    }

    /**
     * Sets the first SQL execution output row to be returned in the case we need to skip some rows in the result set.
     * The primary usage is to support the pagination.
     * 
     * @param firstResult
     *            the first SQL execution output row
     * @return this instance
     */
    public SqlStandardControl setFirstResult(Integer firstResult) {
        this.firstResult = firstResult;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the max number of SQL execution output rows, which can be returned in the result list. The primary usage is
     * to support the pagination.
     * 
     * @param maxResults
     *            the max number of SQL execution output rows
     * @return this instance
     */
    public SqlStandardControl setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlOrder getOrder() {
        return order;
    }

    /**
     * Sets the ordering directive list. Using the class SqlOrder the ordering rules can be chained. Every ordering rule
     * in this chain should correspond to one META SQL ordering statement.
     * 
     * @param order
     *            the ordering directive list
     * @return this instance
     */
    public SqlStandardControl setOrder(SqlOrder order) {
        this.order = order;
        return this;
    }

    /**
     * Sets the ordering directive list. Using the class SqlOrder the ordering rules can be chained. Every ordering rule
     * in this chain should correspond to one META SQL ordering statement.
     * 
     * @param order
     *            the ordering directive
     * @return this instance
     */
    public SqlStandardControl setAscOrder(int order) {
        this.order = SqlOrder.getAscOrder(order);
        return this;
    }

    /**
     * Sets the ordering directive list. Using the class SqlOrder the ordering rules can be chained. Every ordering rule
     * in this chain should correspond to one META SQL ordering statement.
     * 
     * @param order
     *            the ordering directive
     * @return this instance
     */
    public SqlStandardControl setAscOrderNullsLast(int order) {
        this.order = SqlOrder.getAscOrderNullsLast(order);
        return this;
    }

    /**
     * Sets the ordering directive list. Using the class SqlOrder the ordering rules can be chained. Every ordering rule
     * in this chain should correspond to one META SQL ordering statement.
     * 
     * @param order
     *            the ordering directive
     * @return this instance
     */
    public SqlStandardControl setAscOrder(String order) {
        this.order = SqlOrder.getAscOrder(order);
        return this;
    }

    /**
     * Sets the ordering directive list. Using the class SqlOrder the ordering rules can be chained. Every ordering rule
     * in this chain should correspond to one META SQL ordering statement.
     * 
     * @param order
     *            the ordering directive
     * @return this instance
     */
    public SqlStandardControl setAscOrderNullsLast(String order) {
        this.order = SqlOrder.getAscOrderNullsLast(order);
        return this;
    }

    /**
     * Sets the ordering directive list. Using the class SqlOrder the ordering rules can be chained. Every ordering rule
     * in this chain should correspond to one META SQL ordering statement.
     * 
     * @param order
     *            the ordering directive
     * @return this instance
     */
    public SqlStandardControl setDescOrder(int order) {
        this.order = SqlOrder.getDescOrder(order);
        return this;
    }

    /**
     * Sets the ordering directive list. Using the class SqlOrder the ordering rules can be chained. Every ordering rule
     * in this chain should correspond to one META SQL ordering statement.
     * 
     * @param order
     *            the ordering directive
     * @return this instance
     */
    public SqlStandardControl setDescOrderNullsFirst(int order) {
        this.order = SqlOrder.getDescOrderNullsFirst(order);
        return this;
    }

    /**
     * Sets the ordering directive list. Using the class SqlOrder the ordering rules can be chained. Every ordering rule
     * in this chain should correspond to one META SQL ordering statement.
     * 
     * @param order
     *            the ordering directive
     * @return this instance
     */
    public SqlStandardControl setDescOrder(String order) {
        this.order = SqlOrder.getDescOrder(order);
        return this;
    }

    /**
     * Sets the ordering directive list. Using the class SqlOrder the ordering rules can be chained. Every ordering rule
     * in this chain should correspond to one META SQL ordering statement.
     * 
     * @param order
     *            the ordering directive
     * @return this instance
     */
    public SqlStandardControl setDescOrderNullsFirst(String order) {
        this.order = SqlOrder.getDescOrderNullsFirst(order);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, Class<?>> getMoreResultClasses() {
        return moreResultClasses;
    }

    /**
     * Sets more result classes used for the return values, like the collections classes or the collections items. They
     * are used mainly for the one-to-one, one-to-many and many-to-many associations.
     * 
     * @param moreResultClasses
     *            more result classes used for the return values
     * @return this instance
     */
    public SqlStandardControl setMoreResultClasses(Map<String, Class<?>> moreResultClasses) {
        this.moreResultClasses = moreResultClasses;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, Object> getFeatures() {
        return features;
    }

    /**
     * Sets the optional features. These features are defined in the statement execution scope. In the case of conflict
     * with the optional features defined in sthe statement/global scope, their priority is higher.
     * 
     * @param features
     *            the optional features
     */
    public SqlStandardControl setFeatures(Map<String, Object> features) {
        this.features = features;
        return this;
    }

    /**
     * Sets the optional feature in the stament's execution scope.
     * 
     * @param name
     *            the name of the optional feature
     * @param value
     *            the value of the optional feature
     */
    public SqlStandardControl setFeature(String name, Object value) {
        features.put(name, value);
        unsetFeatures(SqlUtils.oppositeFeatures(name));
        return this;
    }

    /**
     * Clears the optional features in the stament's or execution scope.
     * 
     * @param names
     *            the names of the optional features
     */
    public SqlStandardControl unsetFeatures(Set<String> names) {
        if (names != null) {
            for (String name : names)
                features.remove(name);
        }
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getProcessingId() {
        return processingId;
    }

    /**
     * Sets the unique ID of the executed statement based on input values combination. This ID can be used for the
     * caching purposes to optimize the
     * {@link org.sqlproc.engine.impl.SqlMetaStatement#process(org.sqlproc.engine.impl.SqlMetaStatement.Type, Object, SqlControl, org.sqlproc.engine.SqlEngine)}
     * 
     * The generation of the final ANSI SQL statement from the META SQL statement is influenced by the input values.
     * This ID is an indicator of the uniqueness these input values. For more info please see the tutorials.
     * 
     * @param processingId
     *            the unique ID of the executed statement based on input values combination
     */
    public SqlStandardControl setProcessingId(String processingId) {
        this.processingId = processingId;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getFetchSize() {
        return fetchSize;
    }

    /**
     * Sets the fetch size of SQL execution output rows, which can be returned in one SQL statement.
     *
     * @param fetchSize
     *            the fetch size of SQL execution output rows
     * @return this instance
     */
    public SqlStandardControl setFetchSize(Integer fetchSize) {
        this.fetchSize = fetchSize;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean getSkipEmptyStatement() {
        return skipEmptyStatement;
    }

    /**
     * Sets the indicator, that an empty INSERT or UPDATE statement execution should be ignored (for example update
     * statement without any bounded input values).
     * 
     * @param skipEmptyStatement
     *            the indicator, that an empty INSERT or UPDATE statement execution should be ignored
     */
    public void setSkipEmptyStatement(Boolean skipEmptyStatement) {
        this.skipEmptyStatement = skipEmptyStatement;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "SqlStandardControl [staticInputValues=" + staticInputValues + ", dynamicUpdateValues="
                + dynamicUpdateValues + ", maxTimeout=" + maxTimeout + ", firstResult=" + firstResult + ", maxResults="
                + maxResults + ", order=" + order + ", moreResultClasses=" + moreResultClasses + ", features="
                + features + ", processingId=" + processingId + ", fetchSize=" + fetchSize + ", skipEmptyStatement="
                + skipEmptyStatement + "]";
    }
}
