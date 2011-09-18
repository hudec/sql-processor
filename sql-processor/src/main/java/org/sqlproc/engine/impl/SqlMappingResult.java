package org.sqlproc.engine.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeException;

/**
 * Holds the results of an explicit and an implicit mapping rules merging.
 * 
 * In the case of explicit mapping rule the grammar itself is defined in SqlMapping.g. In the case of implicit mapping
 * rule the grammar itself is defined in SqlStatement.g. The internal mapping rule is a dynamic one, and it's finalized
 * in the process of the final ANSI SQL query generation.
 * 
 * For the purpose of correct left join handling, the identities are identified. They are used to prevent the repeated
 * rows in the output result set. This is used for the associations (one-to-one, one-to-many and many-to-many).
 * 
 * The main runtime contracts are {@link #setQueryResultMapping(Class, Map, SqlQuery)} and
 * {@link SqlMappingResult#setQueryResultData(Object, Object[], Map, boolean[], Map)}.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlMappingResult {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * All sub-elements based on ANTLR grammar defined in SqlMapping.g or SqlStatement.g. Every sub-element is one
     * Mapping item.
     */
    private Map<String, SqlMappingItem> mappings;

    /**
     * The collection of identities related to all output columns.
     */
    Map<String, SqlMappingIdentity> identities;
    /**
     * The list of identities indexes in the list of output values.
     */
    List<Integer> identitiesIndexes;
    /**
     * The main identity index in the list of output values. The main identity is related to the top level result class.
     */
    Integer mainIdentityIndex;

    /**
     * Creates a new instance. This instances is based on the merging of an explicit and an implicit mapping rules.
     * 
     * @param mapping
     *            mapping rule based on SqlMapping.g or the empty one
     * @param outputMappings
     *            mapping rule items based on SqlStatement.g
     */
    SqlMappingResult(SqlMappingRule mapping, Map<String, SqlMappingItem> outputMappings) {
        mappings = new LinkedHashMap<String, SqlMappingItem>();
        identities = new LinkedHashMap<String, SqlMappingIdentity>();
        identitiesIndexes = new ArrayList<Integer>();
        merge(mapping, outputMappings);
    }

    /**
     * Returns the main identity index in the list of output values. The main identity is related to the top level
     * result class.
     * 
     * @return the main identity index in the list of output values
     */
    public Integer getMainIdentityIndex() {
        return mainIdentityIndex;
    }

    /**
     * Return the list of identities indexes in the list of output values
     * 
     * @return the list of identities indexes in the list of output values
     */
    public List<Integer> getIdentitiesIndexes() {
        return identitiesIndexes;
    }

    /**
     * Adds a new mapping rule item in the merging process.
     * 
     * @param item
     *            a new mapping rule item
     */
    void addMapping(SqlMappingItem item) {
        mappings.put(item.getDbName(), item);
        if (item.getAttributes().isEmpty()) {
            String name = item.getName();
            if (!identities.containsKey(name)) {
                SqlMappingIdentity ident = new SqlMappingIdentity(item);
                identities.put(name, ident);
            }
        } else {
            for (SqlMappingAttribute attr : item.getAttributes()) {
                if (!identities.containsKey(attr.getFullName())) {
                    SqlMappingIdentity ident = new SqlMappingIdentity(item, attr);
                    identities.put(attr.getFullName(), ident);
                }
            }
        }
    }

    /**
     * Calculates all identities related information. They are used to prevent the repeated rows in the output result
     * set. This is used for the associations (one-to-one, one-to-many and many-to-many).
     */
    void calculateIdentities() {
        int identityIndex = 0;
        for (SqlMappingItem item : mappings.values()) {
            if (item.isIdentity()) {
                identitiesIndexes.add(identityIndex);
                if (item.getName().equals(item.getFullName())) {
                    SqlMappingIdentity ident = identities.get(item.getName());
                    ident.addIdentityIndex(identityIndex, true);
                    ident.idenityDistance = 0;
                    mainIdentityIndex = identityIndex;
                } else {
                    int size = item.getAttributes().size();
                    int distance = 0;
                    for (int i = size - 1; i >= 0; --i, ++distance) {
                        SqlMappingAttribute attr = item.getAttributes().get(i);
                        SqlMappingIdentity ident = identities.get(attr.getFullName());
                        if (ident.identityIndexes != null && ident.idenityDistance < distance)
                            continue;
                        if (ident.identityIndexes != null && ident.idenityDistance == distance) {
                            ident.addIdentityIndex(identityIndex, false);
                            continue;
                        }
                        ident.addIdentityIndex(identityIndex, true);
                        ident.idenityDistance = distance;
                    }

                }
            }
            identityIndex++;
        }
        if (logger.isTraceEnabled()) {
            logger.trace("===  calculateIdentities, identities=" + identities);
        }
        if (identitiesIndexes.isEmpty())
            return;
        for (SqlMappingItem item : mappings.values()) {
            if (!item.isIdentity()) {
                if (item.getAttributes().isEmpty()) {
                    SqlMappingIdentity ident = identities.get(item.getName());
                    ident.addIdentityIndex(mainIdentityIndex, true);
                } else {
                    int size = item.getAttributes().size();
                    for (int i = size - 1; i >= 0; --i) {
                        SqlMappingAttribute attr = item.getAttributes().get(i);
                        SqlMappingIdentity ident = identities.get(attr.getFullName());
                        if (ident.identityIndexes == null && i > 0) {
                            for (int j = i - 1; j >= 0; --j) {
                                SqlMappingAttribute attr2 = item.getAttributes().get(j);
                                SqlMappingIdentity ident2 = identities.get(attr2.getFullName());
                                if (ident2.identityIndexes != null) {
                                    ident.identityIndexes = ident2.identityIndexes;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (logger.isTraceEnabled()) {
            logger.trace("<<<  calculateIdentities, identities=" + identities + ", identitiesIndexes="
                    + identitiesIndexes + ", mainIdentityIndex=" + mainIdentityIndex);
        }
    }

    /**
     * Declares a scalar query results for all mapping rule items.
     * 
     * @param resultClass
     *            the class used for the return values
     * @param moreResultClasses
     *            more result classes used for the return values, like the collections classes or the collections items
     * @param query
     *            the SQL Engine query, an adapter or proxy to the internal JDBC or ORM staff
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with output values preparation
     */
    public void setQueryResultMapping(Class<?> resultClass, Map<String, Class<?>> moreResultClasses, SqlQuery query)
            throws SqlRuntimeException {
        for (SqlMappingItem item : mappings.values()) {
            item.setQueryResultMapping(resultClass, moreResultClasses, query);
        }
    }

    /**
     * Fills the instance of the result class with output values from the SQL query execution.
     * 
     * @param resultInstance
     *            the instance of the result class
     * @param resultValues
     *            the query execution output values
     * @param ids
     *            the instances of all already used identities together with the related result instances based on
     *            identities indices
     * @param moreResultClasses
     *            more result classes used for the return values, like the collections classes or the collections items
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with output values handling
     */
    public void setQueryResultData(Object resultInstance, Object[] resultValues, Map<Integer, Map<Object, Object>> ids,
            Map<String, Class<?>> moreResultClasses) throws SqlRuntimeException {
        int i = 0;
        Map<Integer, Map<Object, Object>> idsProcessed = getIds();

        for (SqlMappingItem item : mappings.values()) {
            item.setQueryResultData(resultInstance, i, resultValues, ids, idsProcessed, identities, moreResultClasses);
            i++;
        }

        if (ids != null) {
            for (Integer idx : getIdentitiesIndexes()) {
                ids.get(idx).putAll(idsProcessed.get(idx));
            }
        }
    }

    /**
     * Merge mapping rule for one META SQL query based on SqlMapping.g and SqlStatement.g. The external mapping rule has
     * the higher priority. The internal mapping rule holds the list of real output values.
     * 
     * @param mapping
     *            mapping rule based on SqlMapping.g or the empty one
     * @param outputMappings
     *            mapping rule items based on SqlStatement.g
     */
    private void merge(SqlMappingRule mapping, Map<String, SqlMappingItem> outputMappings) {
        if (outputMappings == null || outputMappings.isEmpty()) {
            for (SqlMappingItem mappingItem : mapping.getMappings().values()) {
                addMapping(mappingItem);
            }
        } else {
            for (SqlMappingItem mappingItem : outputMappings.values()) {
                if (mapping != null && mapping.getMappings().containsKey(mappingItem.getDbName())) {
                    addMapping(mapping.getMappings().get(mappingItem.getDbName()).merge(mappingItem));
                } else {
                    addMapping(mappingItem);
                }
            }
        }
        calculateIdentities();
    }

    /**
     * Construct the empty structure used for the instances of all already used identities together with the related
     * result instances based on identities indices.
     * 
     * @return the empty structure used for the instances of all already used identities together with the related
     *         result instances based on identities indices
     */
    public Map<Integer, Map<Object, Object>> getIds() {
        if (getMainIdentityIndex() == null || getIdentitiesIndexes() == null)
            return null;
        Map<Integer, Map<Object, Object>> ids = new HashMap<Integer, Map<Object, Object>>();
        for (Integer idx : getIdentitiesIndexes()) {
            ids.put(idx, new HashMap<Object, Object>());
        }
        return ids;
    }
}
