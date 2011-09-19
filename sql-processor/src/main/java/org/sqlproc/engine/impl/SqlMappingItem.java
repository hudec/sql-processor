package org.sqlproc.engine.impl;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlQuery;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.type.SqlInternalType;
import org.sqlproc.engine.type.SqlMetaType;

/**
 * The mapping rule element for one output attribute, which is a mapping item.
 * 
 * Instance of this class is created by the ANTLR parser. In the case of explicit mapping rule the grammar itself is
 * defined in SqlMapping.g. In the case of implicit mapping rule the grammar itself is defined in SqlStatement.g.
 * 
 * This instance can be also created in the process of merging the explicit and implicit mapping rule in the runtime,
 * see {@link #process(SqlProcessContext)}.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
class SqlMappingItem implements SqlMetaElement {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * The list of all partial attribute names in the result class. This list has more items in the case of embedded
     * classes, where names are in the form name1.name2...nameX. This list can be empty. In this case the name of the
     * attribute is the same as the name of the query column or alias output.
     */
    private List<SqlMappingAttribute> attributes;
    /**
     * The name of a database query output. It can be the column name or the alias name.
     */
    private String dbName;
    /**
     * The full name of the attribute in the result class in the form name1.name2...nameX.
     */
    private StringBuilder fullName;
    /**
     * The (META) type of an attribute in the result class and/or the database column type.
     */
    private SqlType sqlType;
    /**
     * The indicator this is an identity column.
     */
    private boolean identity;
    /**
     * Supplements values for a special handling, for example the identification of an identity column or the partial
     * attribute type.
     */
    Map<String, String> values = new HashMap<String, String>();

    /**
     * Creates a new instance. It's used from inside ANTLR parser or in the process of merging.
     * 
     * @param dbName
     *            the name of a database query output
     */
    SqlMappingItem(String dbName) {
        this.attributes = new ArrayList<SqlMappingAttribute>();
        this.sqlType = new SqlType();
        this.dbName = dbName;
        this.fullName = new StringBuilder();
    }

    /**
     * Returns the name of a database query output. It can be the column name or the alias name.
     * 
     * @return the name of a database query output
     */
    String getDbName() {
        return dbName;
    }

    /**
     * Adds a partial name of an attribute.
     * 
     * @param name
     *            the partial name of an attribute in the result class
     */
    SqlMappingAttribute addAttributeName(String name) {
        String[] names = name.split("=");
        if (fullName.length() > 0)
            fullName.append(".");
        fullName.append(names[0]);
        SqlMappingAttribute attr = new SqlMappingAttribute(this, fullName.toString(), names[0]);
        if (names.length > 1)
            attr.setValues(SqlUtils.SUPPVAL_TYPE, names[1]);
        if (names.length > 2)
            attr.setValues(SqlUtils.SUPPVAL_GTYPE, names[2]);
        attributes.add(attr);
        return attr;
    }

    /**
     * Returns the list of all partial attribute names in the result class.
     * 
     * @return the list of all partial attribute names
     */
    List<SqlMappingAttribute> getAttributes() {
        return attributes;
    }

    /**
     * Sets the list of all partial attribute names in the result class.
     * 
     * @param attributes
     *            te list of all partial attribute names
     */
    void setAttributes(List<SqlMappingAttribute> attributes) {
        this.attributes = attributes;
    }

    /**
     * Returns the indicator this is an identity column.
     * 
     * @return the indicator this is an identity column
     */
    boolean isIdentity() {
        if (identity)
            return true;
        String id = SqlProcessContext.getFeature(SqlFeature.ID);
        if (id != null && id.equalsIgnoreCase(getName()))
            return true;
        return false;
    }

    /**
     * Returns the full attribute name.
     * 
     * @return the full attribute name
     */
    String getFullName() {
        if (fullName.length() > 0)
            return fullName.toString();
        else
            return dbName;
    }

    /**
     * Returns the last attribute name.
     * 
     * @return the last attribute name
     */
    String getName() {
        return (attributes.isEmpty()) ? dbName : attributes.get(attributes.size() - 1).getName();
    }

    /**
     * Assigns the internal type. This type it's used in a conversion process of SQL query output values. It can be a
     * META type or an Hibernate type.
     * 
     * @param metaType
     *            an internal type for this mapping rule item
     */
    void setMetaType(SqlMetaType metaType) {
        this.sqlType = new SqlType(metaType);
    }

    /**
     * Returns the internal type of an attribute in the result class.
     * 
     * @return the internal type of an attribute in the result class
     */
    SqlType getSqlType() {
        return sqlType;
    }

    /**
     * Sets the internal type of an attribute in the result class.
     * 
     * @param sqlType
     *            the internal type of an attribute in the result class
     */
    void setSqlType(SqlType sqlType) {
        this.sqlType = sqlType;
    }

    /**
     * Sets the supplement values. They are used to identify an identity column or the partial attribute type.
     * 
     * @param value
     *            the value for a special treatment, might be an identifier of value2
     * @param value2
     *            the value for a special treatment, might be an attribute type
     */
    void setValues(String value, String value2) {
        setValues(null, value, value2);
    }

    /**
     * Sets the supplement values. They are used to identify an identity column or the partial attribute type.
     * 
     * @param name
     *            the partial name in the case this supplement value is related to it
     * @param value
     *            the value for a special treatment, might be an identifier of value2
     * @param value2
     *            the value for a special treatment, might be an attribute type
     */
    void setValues(String name, String value, String value2) {
        int ix = -1;
        if (value2 == null && (ix = value.indexOf('=')) >= 0) {
            value2 = value.substring(ix + 1);
            value = value.substring(0, ix);
        }
        if (value2 == null) {
            if (SqlUtils.SUPPVAL_ID.equalsIgnoreCase(value))
                this.identity = true;
            else
                sqlType.setValue(value);
        } else {
            if (name == null)
                values.put(value, value2);
            else
                values.put(name + value, value2);
        }
    }

    /**
     * Declares a scalar query result for this mapping rule item.
     * 
     * @param resultClass
     *            the class used for the return values, the SQL execution output
     * @param moreResultClasses
     *            more classes used for the return values, like the classes for the collections or the collections items
     * @param query
     *            the SQL Engine query, an adapter or proxy to the internal JDBC or ORM staff
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with output values preparation
     */
    void setQueryResultMapping(Class<?> resultClass, Map<String, Class<?>> moreResultClasses, SqlQuery query)
            throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>>  setQueryResultMapping, fullName=" + getFullName() + ", resultClass=" + resultClass
                    + ", moreResultClasses=" + moreResultClasses);
        }

        if (sqlType.getMetaType() instanceof SqlInternalType) {
            if (logger.isTraceEnabled()) {
                logger.trace("<<<  setQueryResultMapping, fullName=" + getFullName() + ", dbName=" + dbName
                        + ", metaType=" + sqlType.getMetaType());
            }
            ((SqlInternalType) sqlType.getMetaType()).addScalar(query, dbName, null);
        } else {
            int count = attributes.size();
            boolean exit = false;
            Class<?> objClass = resultClass;
            for (int i = 0; i < count - 1 && !exit; i++) {
                SqlMappingAttribute attr = attributes.get(i);
                String name = attr.getName();

                Method m = BeanUtils.getGetter(objClass, name);
                if (m != null) {
                    objClass = m.getReturnType();
                } else if (SqlProcessContext.isFeature(SqlFeature.IGNORE_INPROPER_OUT)) {
                    logger.error("There's no getter for '" + name + "' in " + objClass
                            + ", complete attribute name is '" + attr.getFullName() + "'");
                    exit = true;
                } else {
                    throw new SqlRuntimeException("There's no getter for '" + name + "' in " + objClass
                            + ", complete attribute name is '" + attr.getFullName() + "'");
                }

                if (!exit) {
                    boolean isCollection = false;
                    for (Class<?> clazz : objClass.getInterfaces()) {
                        if (clazz == Collection.class) {
                            isCollection = true;
                            break;
                        }
                    }
                    if (isCollection) {
                        String typeName = (moreResultClasses != null) ? values.get(attr.getFullName()
                                + SqlUtils.SUPPVAL_GTYPE) : null;
                        Class<?> typeClass = (typeName != null) ? moreResultClasses.get(typeName) : null;
                        if (typeClass == null) {
                            ParameterizedType paramType = (ParameterizedType) m.getGenericReturnType();
                            typeClass = (Class<?>) paramType.getActualTypeArguments()[0];
                        }
                        if (typeClass != null) {
                            objClass = typeClass;
                        } else if (SqlProcessContext.isFeature(SqlFeature.IGNORE_INPROPER_OUT)) {
                            logger.error("There's no generic type defined for collection " + objClass
                                    + ", complete attribute name is '" + attr.getFullName()
                                    + "', possible type name is " + typeName);
                            exit = true;
                        } else {
                            throw new SqlRuntimeException("There's no generic type defined for collection " + objClass
                                    + ", complete attribute name is '" + attr.getFullName()
                                    + "', possible type name is " + typeName);
                        }
                    }
                }
            }
            Class<?> attributeType = BeanUtils.getFieldType(objClass, getName());
            if (logger.isTraceEnabled()) {
                logger.trace("<<<  setQueryResultMapping, fullName=" + getFullName() + ", dbName=" + dbName
                        + ", attributeType=" + attributeType);
            }
            if (!exit) {
                sqlType.getMetaType().addScalar(query, dbName, attributeType);
            }
        }
    }

    /**
     * Returns the index of the identity column identified by fullName
     * 
     * @param resultValues
     *            the query execution output values
     * @param identities
     *            the collection of identities related to all output columns
     * @param fullName
     *            the identity attribute name
     * @return the index of the identity column identified by fullName
     */
    private Integer getIdIndex(Object[] resultValues, Map<String, SqlMappingIdentity> identities, String fullName) {
        if (identities.get(fullName).identityIndexes != null) {
            for (Integer i : identities.get(fullName).identityIndexes) {
                Object o = resultValues[i];
                if (o != null) {
                    return i;
                }
            }
        }
        return null;
    }

    /**
     * Returns the parent index of the identity column identified by fullName
     * 
     * @param resultValues
     *            the query execution output values
     * @param identities
     *            the collection of identities related to all output columns
     * @param fullName
     *            the identity attribute name
     * @return the parent index of the identity column identified by fullName
     */
    private Integer getParentIdIndex(Object[] resultValues, Map<String, SqlMappingIdentity> identities, String fullName) {
        if (identities.get(fullName).parentIdentityIndexes != null) {
            for (Integer i : identities.get(fullName).parentIdentityIndexes) {
                Object o = resultValues[i];
                if (o != null) {
                    return i;
                }
            }
        }
        return null;
    }

    /**
     * Initializes the attribute of the result class with the output value from the SQL query execution.
     * 
     * @param resultInstance
     *            the instance of the result class
     * @param resultIndex
     *            the index of the processed query execution output value
     * @param resultValues
     *            the query execution output values
     * @param ids
     *            the instances of all already used identities together with the related result instances based on
     *            identities indices
     * @param idsProcessed
     *            the instances of all already used identities together with the related result instances based on
     *            identities indices - the working copy
     * @param identities
     *            the collection of identities related to all output columns
     * @param moreResultClasses
     *            more result classes used for the return values, like the classes for the collections or the
     *            collections items
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with output values handling
     */
    void setQueryResultData(Object resultInstance, int resultIndex, Object[] resultValues,
            Map<Integer, Map<Object, Object>> ids, Map<Integer, Map<Object, Object>> idsProcessed,
            Map<String, SqlMappingIdentity> identities, Map<String, Class<?>> moreResultClasses)
            throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setQueryResultData, fullName=" + getFullName() + ", resultInstance=" + resultInstance
                    + ", resultValue=" + resultValues[resultIndex]);
        }
        if (resultValues[resultIndex] == null) {
            return;
        }

        Integer idIndex = getIdIndex(resultValues, identities, getFullName());
        Object id = (idIndex != null) ? resultValues[idIndex] : null;
        Integer parentIdIndex = null;
        Object parentId = null;
        String parentName = null;
        if (logger.isTraceEnabled()) {
            logger.trace("=== setQueryResultData, fullName=" + getFullName() + ", id=" + id + ", idIndex=" + idIndex);
        }
        if (idIndex != null && id != null && ids != null) {
            if (ids.get(idIndex).containsKey(id)) {
                Integer idDistance = identities.get(getFullName()).idenityDistance;
                if (idDistance == null || idDistance != 0)
                    return;
                parentIdIndex = getParentIdIndex(resultValues, identities, getFullName());
                if (parentIdIndex == null)
                    return;
                parentId = resultValues[parentIdIndex];
                parentName = getFullName().substring(0, getFullName().lastIndexOf("."));
            }
        }

        boolean exit = false;
        Object obj = resultInstance;
        int count = attributes.size();

        for (int i = 0; i < count - 1 && !exit; i++) {
            SqlMappingAttribute attr = attributes.get(i);
            String name = attr.getName();

            if (logger.isTraceEnabled()) {
                logger.trace("=== setQueryResultData, fullName=" + getFullName() + ", name=" + name + ", identities="
                        + identities.get(attr.getFullName()));
            }

            Method m = BeanUtils.getGetter(obj, name);
            if (m != null) {
                Object nextObj = BeanUtils.invokeMethod(obj, m.getName(), null);
                if (nextObj == null) {
                    String typeName = values.get(attr.getFullName() + SqlUtils.SUPPVAL_TYPE);
                    Class<?> typeClass = (typeName != null) ? moreResultClasses.get(typeName) : null;
                    if (typeClass == null) {
                        Class<?> clazz = m.getReturnType();
                        if (clazz.isInterface()) {
                            if (clazz == List.class) {
                                typeClass = ArrayList.class;
                            } else if (clazz == Set.class) {
                                typeClass = HashSet.class;
                            } else if (SqlProcessContext.isFeature(SqlFeature.IGNORE_INPROPER_OUT)) {
                                logger.error("There's no type defined for collection " + clazz
                                        + ", complete attribute name is '" + attr.getFullName()
                                        + "', possible type name is " + typeName);
                                exit = true;
                            } else {
                                throw new SqlRuntimeException("There's no type defined for collection " + clazz
                                        + ", complete attribute name is '" + attr.getFullName()
                                        + "', possible type name is " + typeName);
                            }
                        } else {
                            typeClass = clazz;
                        }
                    }
                    if (!exit) {
                        nextObj = BeanUtils.getInstance(typeClass);
                        if (nextObj != null) {
                            BeanUtils.setProperty(obj, name, nextObj);
                            if (!(nextObj instanceof Collection)) {
                                Integer idIndexAttr = getIdIndex(resultValues, identities, attr.getFullName());
                                Object idAttr = (idIndexAttr != null) ? resultValues[idIndexAttr] : null;
                                if (idIndexAttr != null && idAttr != null
                                        && !idsProcessed.get(idIndexAttr).containsKey(idAttr)) {
                                    idsProcessed.get(idIndexAttr).put(idAttr, nextObj);
                                }
                            }
                        } else if (SqlProcessContext.isFeature(SqlFeature.IGNORE_INPROPER_OUT)) {
                            logger.error("There's problem to instantiate " + typeClass
                                    + ", complete attribute name is '" + attr.getFullName()
                                    + "', possible type name is " + typeName);
                            exit = true;
                        } else {
                            throw new SqlRuntimeException("There's problem to instantiate " + typeClass
                                    + ", complete attribute name is '" + attr.getFullName()
                                    + "', possible type name is " + typeName);
                        }
                    }
                }
                if (!exit && nextObj instanceof Collection) {
                    Integer idIndexAttr = getIdIndex(resultValues, identities, attr.getFullName());
                    Object idAttr = (idIndexAttr != null) ? resultValues[idIndexAttr] : null;
                    if (ids.get(idIndexAttr).containsKey(idAttr)) {
                        if (parentIdIndex != null && parentName.equals(attr.getFullName())) {
                            Object itemObj = ids.get(idIndexAttr).get(idAttr);
                            logger.info("=== setQueryResultData, handling many-to-many, itemObj=" + itemObj + " for "
                                    + parentName);
                            ((Collection) nextObj).add(itemObj);
                            idsProcessed.get(idIndexAttr).put(idAttr, itemObj);
                            nextObj = itemObj;
                        } else {
                            nextObj = ids.get(idIndexAttr).get(idAttr);
                        }
                    } else if (idsProcessed.get(idIndexAttr).containsKey(idAttr)) {
                        nextObj = idsProcessed.get(idIndexAttr).get(idAttr);
                    } else {
                        String typeName = (moreResultClasses != null) ? values.get(attr.getFullName()
                                + SqlUtils.SUPPVAL_GTYPE) : null;
                        Class<?> typeClass = null;
                        if (typeName != null) {
                            if (typeName.toLowerCase().startsWith(SqlUtils.SUPPVAL_DISCRIMINATOR))
                                typeClass = moreResultClasses.get(resultValues[resultIndex]);
                            else
                                typeClass = moreResultClasses.get(typeName);
                        }
                        if (typeClass == null) {
                            ParameterizedType paramType = (ParameterizedType) m.getGenericReturnType();
                            typeClass = (Class<?>) paramType.getActualTypeArguments()[0];
                        }
                        if (typeClass != null) {
                            Object itemObj = BeanUtils.getInstance(typeClass);
                            if (itemObj != null) {
                                ((Collection) nextObj).add(itemObj);
                                idsProcessed.get(idIndexAttr).put(idAttr, itemObj);
                                nextObj = itemObj;
                                // instances.put(attr.getFullName(), nextObj);
                            } else if (SqlProcessContext.isFeature(SqlFeature.IGNORE_INPROPER_OUT)) {
                                logger.error("There's problem to instantiate " + typeClass
                                        + ", complete attribute name is " + attr.getFullName()
                                        + ", possible type name is " + typeName);
                                exit = true;
                            } else {
                                throw new SqlRuntimeException("There's problem to instantiate " + typeClass
                                        + ", complete attribute name is " + attr.getFullName()
                                        + ", possible type name is " + typeName);
                            }
                        } else if (SqlProcessContext.isFeature(SqlFeature.IGNORE_INPROPER_OUT)) {
                            logger.error("There's no generic type defined for collection " + nextObj
                                    + ", complete attribute name is " + attr.getFullName() + ", possible type name is "
                                    + typeName);
                            exit = true;
                        } else {
                            throw new SqlRuntimeException("There's no generic type defined for collection " + nextObj
                                    + ", complete attribute name is " + attr.getFullName() + ", possible type name is "
                                    + typeName);
                        }
                    }
                }
                obj = nextObj;
            } else if (SqlProcessContext.isFeature(SqlFeature.IGNORE_INPROPER_OUT)) {
                logger.error("There's no getter for " + name + " in " + obj + ", complete attribute name is "
                        + attr.getFullName());
                exit = true;
            } else {
                throw new SqlRuntimeException("There's no getter for " + name + " in " + obj
                        + ", complete attribute name is " + attr.getFullName());
            }
        }

        if (logger.isTraceEnabled()) {
            logger.trace("<<< setQueryResultData, fullName=" + getFullName() + ", name=" + getName() + ", obj=" + obj
                    + ", resultValue=" + resultValues[resultIndex]);
        }
        sqlType.setResult(obj, getName(), resultValues[resultIndex]);
    }

    /**
     * Merge mapping rules for one output column based on SqlMapping.g and SqlStatement.g. This mapping rule has the
     * higher priority.
     * 
     * @param outputMapping
     *            the mapping rule based on SqlStatement.g
     * @return a new merged mapping rule item
     */
    SqlMappingItem merge(SqlMappingItem outputMapping) {
        SqlMappingItem resultMappingItem = new SqlMappingItem(dbName);
        if (attributes != null && attributes.size() > 0) {
            resultMappingItem.setAttributes(attributes);
            resultMappingItem.fullName = fullName;
            resultMappingItem.identity = identity;
            resultMappingItem.values = values;
        } else {
            resultMappingItem.setAttributes(outputMapping.getAttributes());
            resultMappingItem.fullName = outputMapping.fullName;
            resultMappingItem.identity = outputMapping.identity;
            resultMappingItem.values = outputMapping.values;
        }
        if (sqlType != null)
            resultMappingItem.setSqlType(sqlType);
        else
            resultMappingItem.setSqlType(outputMapping.getSqlType());
        return resultMappingItem;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlProcessResult process(SqlProcessContext ctx) {

        SqlProcessResult result = new SqlProcessResult(dbName);
        result.addOutputValue(dbName, this);
        return result;
    }

    /**
     * For debug purposes.
     * 
     * @return a String representation for a debug output
     */
    @Override
    public String toString() {
        return "SqlMappingItem [attributes=" + attributes + ", dbName=" + dbName + ", fullName=" + fullName
                + ", sqlType=" + sqlType + ", identity=" + identity + "]";
    }

}
