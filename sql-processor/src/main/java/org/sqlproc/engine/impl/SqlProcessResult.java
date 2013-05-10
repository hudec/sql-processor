package org.sqlproc.engine.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.SqlSession;

/**
 * Holds the results of ANSI SQL query generation.
 * 
 * The result is related to the overall ANSI SQL Query generation in {@link org.sqlproc.engine.impl.SqlMetaStatement} or
 * the partial processing result in {@link org.sqlproc.engine.impl.SqlMetaElement#process(SqlProcessContext)}.
 * 
 * The main runtime contract is {@link #setQueryParams(SqlSession, SqlQuery)}.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlProcessResult implements Comparable<SqlProcessResult> {

    /**
     * The indicator that a partial processing result (of ANSI SQL Query generation) is going to be part of a final ANSI
     * SQL.
     */
    private boolean add;
    /**
     * The list of dynamic input values. These parameters have to be binded to SQL statement.
     */
    private List<String> allInputValues;
    /**
     * The map of dynamic input values. These parameters have to be binded to SQL statement.
     */
    private Map<String, SqlInputValue> inputValues;
    /**
     * The list of output values. Every sub-element is one Mapping item. These parameters are scalars for SQL statement.
     */
    private Map<String, SqlMappingItem> outputValues;
    /**
     * List of all identities, which have values generated using sequences.
     */
    private Map<String, SqlInputValue> identities;
    /**
     * List of all input values, which are in fact OUT or INOUT parameters.
     */
    private Map<String, SqlInputValue> outValues;
    /**
     * The final ANSI SQL or the fragment of ANSI SQL, which is dynamically generated from the META SQL based on input
     * values.
     */
    private StringBuilder sql;
    /**
     * The index of selected ordering rule (from the list of ordering directives).
     */
    private Integer orderIndex;
    /**
     * The indicator that a the next possible text has to be skipped. It's used for the identity based on select.
     */
    private boolean skipNextText;
    /**
     * The failed SQL command should be logged.
     */
    boolean logError;

    /**
     * Creates a new instance.
     */
    SqlProcessResult() {
        allInputValues = new ArrayList<String>();
        inputValues = new LinkedHashMap<String, SqlInputValue>();
        outputValues = new LinkedHashMap<String, SqlMappingItem>();
        identities = new HashMap<String, SqlInputValue>();
        outValues = new HashMap<String, SqlInputValue>();
        sql = new StringBuilder();
    }

    /**
     * Creates a new instance with a SQL fragment from SqlMetaText.
     * 
     * @param sql
     *            a SQL fragment
     */
    SqlProcessResult(String sql) {
        allInputValues = new ArrayList<String>();
        inputValues = new HashMap<String, SqlInputValue>();
        outputValues = new LinkedHashMap<String, SqlMappingItem>();
        identities = new HashMap<String, SqlInputValue>();
        outValues = new HashMap<String, SqlInputValue>();
        if (sql != null) {
            this.sql = new StringBuilder(sql);
            this.add = true;
        } else {
            this.sql = null;
            this.add = false;
        }
    }

    /**
     * Sets an indicator that a partial processing result is going to be part of a final ANSI SQL.
     */
    void addFalse() {
        this.add = false;
    }

    /**
     * Sets an indicator that a partial processing result isn't going to be part of a final ANSI SQL.
     */
    void addTrue() {
        this.add = true;
    }

    /**
     * Sets an indicator if a partial processing result will be part of a final ANSI SQL.
     * 
     * @param add
     *            a new indicator value
     */
    void add(boolean add) {
        this.add = add;
    }

    /**
     * Returns the indicator if a partial processing result will be part of a final ANSI SQL.
     * 
     * @return the indicator value
     */
    boolean isAdd() {
        return add;
    }

    /**
     * Adds a new dynamic input value. This parameter have to be binded to SQL statement.
     * 
     * @param key
     *            the name of a dynamic input value
     * @param value
     *            a new dynamic input value
     */
    void addInputValue(String key, SqlInputValue value) {
        allInputValues.add(key);
        if (!this.inputValues.containsKey(key))
            this.inputValues.put(key, value);
    }

    /**
     * Adds a new collection of dynamic input values. These parameters have to be binded to SQL statement.
     * 
     * @param inputValues
     *            a new collection of dynamic input values
     */
    void addInputValues(List<String> inputValues) {
        if (inputValues != null)
            allInputValues.addAll(inputValues);
    }

    /**
     * Adds a new collection of dynamic input values. These parameters have to be binded to SQL statement.
     * 
     * @param inputValues
     *            a new collection of dynamic input values
     */
    void addMappedInputValues(Map<String, SqlInputValue> inputValues) {
        if (inputValues != null)
            this.inputValues.putAll(inputValues);
    }

    /**
     * Returns the collection of dynamic input values. These parameters have to be binded to SQL statement.
     * 
     * @return the collection of dynamic input values
     */
    List<String> getInputValues() {
        return allInputValues;
    }

    /**
     * Returns the collection of dynamic input values. These parameters have to be binded to SQL statement.
     * 
     * @return the collection of dynamic input values
     */
    Map<String, SqlInputValue> getMappedInputValues() {
        return inputValues;
    }

    /**
     * Returns the input value . This parameter has to be binded to SQL statement.
     * 
     * @param name
     *            the name of the parameter
     * @return the input value
     */
    SqlInputValue getInputValue(String name) {
        return inputValues.get(name);
    }

    /**
     * Adds a new output value. This parameter is a scalar for SQL statement.
     * 
     * @param key
     *            the name of an output value
     * @param value
     *            a new output value
     */
    void addOutputValue(String key, SqlMappingItem value) {
        if (!this.outputValues.containsKey(key))
            this.outputValues.put(key, value);
    }

    /**
     * Adds a new collection of output values. These parameters are scalars for SQL statement.
     * 
     * @param outputValues
     *            a new collection of output values
     */
    void addOutputValues(Map<String, SqlMappingItem> outputValues) {
        if (outputValues != null)
            this.outputValues.putAll(outputValues);
    }

    /**
     * Returns the collection of output values. These parameters are scalars for SQL statement.
     * 
     * @return the collection of output values
     */
    Map<String, SqlMappingItem> getOutputValues() {
        return outputValues;
    }

    /**
     * Adds a new identity.
     * 
     * @param key
     *            the name of an identity column/attribute
     * @param value
     *            a new identity value
     */
    void addIdentity(String key, SqlInputValue value) {
        if (!this.identities.containsKey(key))
            this.identities.put(key, value);
    }

    /**
     * Adds a new collection of identities.
     * 
     * @param identities
     *            a new collection of identities
     */
    void addIdentities(Map<String, SqlInputValue> identities) {
        if (identities != null)
            this.identities.putAll(identities);
    }

    /**
     * Returns the collection of identities.
     * 
     * @return the collection of identities
     */
    Map<String, SqlInputValue> getIdentities() {
        return identities;
    }

    /**
     * Adds a new OUT/INOUT value.
     * 
     * @param key
     *            the name of an OUT/INOUT column/attribute
     * @param value
     *            a new OUT/INOUT value
     */
    void addOutValue(String key, SqlInputValue value) {
        if (!this.outValues.containsKey(key))
            this.outValues.put(key, value);
    }

    /**
     * Adds a new collection of OUT/INOUT values.
     * 
     * @param outValues
     *            a new collection of OUT/INOUT values
     */
    void addOutValues(Map<String, SqlInputValue> outValues) {
        if (outValues != null)
            this.outValues.putAll(outValues);
    }

    /**
     * Returns the collection of OUT/INOUT values.
     * 
     * @return the collection of OUT/INOUT values
     */
    Map<String, SqlInputValue> getOutValues() {
        return outValues;
    }

    /**
     * Sets the final ANSI SQL or a fragment of ANSI SQL, which is dynamically generated from the META SQL based on
     * input values.
     * 
     * @param sql
     *            the final ANSI SQL or a fragment of ANSI SQL
     */
    void setSql(StringBuilder sql) {
        this.sql = sql;
    }

    /**
     * Returns the final ANSI SQL or a fragment of ANSI SQL, which is dynamically generated from the META SQL based on
     * input values.
     * 
     * @return the final ANSI SQL or a fragment of ANSI SQL
     */
    public StringBuilder getSql() {
        return sql;
    }

    /**
     * Sets an index of selected ordering rule (from the list of ordering directives).
     * 
     * @param orderIndex
     *            a new index of selected ordering rule
     */
    void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    /**
     * Returns the index of selected ordering rule (from the list of ordering directives).
     * 
     * @return the index of selected ordering rule
     */
    Integer getOrderIndex() {
        return orderIndex;
    }

    /**
     * Sets an indicator the failed SQL command should be logged
     * 
     * @param logError
     *            an indicator the failed SQL command should be logged
     */
    public void setLogError(boolean logError) {
        this.logError = logError;
    }

    /**
     * Returns an indicator the failed SQL command should be logged
     * 
     * @return an indicator the failed SQL command should be logged
     */
    public boolean isLogError() {
        return logError;
    }

    /**
     * Returns the indicator the next possible SQL statement fragment should be skipped. It's used for the identities
     * settled into the input value attributes.
     * 
     * @return an indicator the next possible SQL statement fragment should be skipped
     */
    boolean isSkipNextText() {
        return skipNextText;
    }

    /**
     * Sets the indicator the next possible SQL statement fragment should be skipped. It's used for the identities
     * settled into the input value attributes.
     * 
     * @param skipNextText
     *            an indicator the next possible SQL statement fragment should be skipped
     */
    void setSkipNextText(boolean skipNextText) {
        this.skipNextText = skipNextText;
    }

    /**
     * Bind an input values to a named query parameters.
     * 
     * @param session
     *            the SQL Engine session, an adapter or proxy to the internal JDBC or ORM staff
     * @param query
     *            the SQL Engine query, an adapter or proxy to the internal JDBC or ORM staff
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with input values handling
     */
    public void setQueryParams(final SqlSession session, SqlQuery query) throws SqlRuntimeException {
        for (String paramName : this.allInputValues) {
            SqlInputValue inputValue = this.inputValues.get(paramName);
            inputValue.setQueryParam(session, query, paramName);
        }
    }

    /**
     * Post processing, like identities setting into a result class.
     * 
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with output values handling
     */
    public void postProcess() throws SqlRuntimeException {
        for (String paramName : this.identities.keySet()) {
            SqlInputValue inputValue = this.identities.get(paramName);
            inputValue.setIdentityResult(paramName);
        }
        for (String paramName : this.outValues.keySet()) {
            SqlInputValue inputValue = this.outValues.get(paramName);
            inputValue.setOutValueResult(paramName);
        }
    }

    /**
     * For debug purposes.
     * 
     * @return a String representation for a debug output
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("SqlProcessResult:");
        sb.append(" add=").append(add);
        if (inputValues != null) {
            for (String paramName : this.inputValues.keySet()) {
                SqlInputValue value = this.inputValues.get(paramName);
                sb.append(", ident=").append(paramName).append(", value=").append(value);
            }
        }
        sb.append(" s='").append(sql).append("'");

        return sb.toString();
    }

    /**
     * In case there're several ordering rules in the final generated ANSI SQL, they should be ordered.
     * 
     * {@inheritDoc}
     */
    @Override
    public int compareTo(SqlProcessResult o) {
        if (getOrderIndex() == null || o.getOrderIndex() == null)
            throw new RuntimeException("Compared non-order processing results");
        return getOrderIndex().compareTo(o.getOrderIndex());
    }
}
