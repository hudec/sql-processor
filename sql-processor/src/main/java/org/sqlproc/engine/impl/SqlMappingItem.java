package org.sqlproc.engine.impl;

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
import org.sqlproc.engine.plugin.BeanUtilsPlugin.GetterType;
import org.sqlproc.engine.plugin.Modifiers;
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
     * The map of all partial attribute names in the result class.
     */
    private Map<String, SqlMappingAttribute> attributesMap;
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
        this.attributesMap = new HashMap<String, SqlMappingAttribute>();
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
            attr.setValues(Modifiers.MODIFIER_TYPE, names[1]);
        if (names.length > 2)
            attr.setValues(Modifiers.MODIFIER_GTYPE, names[2]);
        attributes.add(attr);
        attributesMap.put(fullName.toString(), attr);
        return attr;
    }

    /**
     * Injects value to the named attribute.
     * 
     * @param attrName
     *            the attribute name
     * @param value
     *            value for the named attribute
     */
    SqlMappingAttribute setAttributeValue(String attrName, String value) {
        String[] values = value.split("=");
        SqlMappingAttribute attr = attributesMap.get(attrName);
        if (values.length > 1)
            attr.setValues(Modifiers.MODIFIER_GTYPE, values[1]);
        else
            attr.setValues(Modifiers.MODIFIER_TYPE, values[0]);
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
     *            the list of all partial attribute names
     */
    void setAttributes(List<SqlMappingAttribute> attributes) {
        this.attributes = attributes;
    }

    /**
     * Sets the map of all partial attribute names in the result class.
     * 
     * @param attributesMap
     *            the map of all partial attribute names
     */
    void setAttributesMap(Map<String, SqlMappingAttribute> attributesMap) {
        this.attributesMap = attributesMap;
    }

    /**
     * Returns the indicator this is an identity column.
     * 
     * @param ctx
     *            the crate for all input parameters and the context of processing
     * @return the indicator this is an identity column
     */
    boolean isIdentity(SqlProcessContext ctx) {
        if (identity)
            return true;
        String id = ctx.getFeature(SqlFeature.ID);
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
     * Sets the modifiers. They are used to identify an identity column or the partial attribute type.
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
     * Sets the modifiers. They are used to identify an identity column or the partial attribute type.
     * 
     * @param name
     *            the partial name in the case this modifier is related to it
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
            if (Modifiers.MODIFIER_ID.equalsIgnoreCase(value))
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
     * @param ctx
     *            the crate for all input parameters and the context of processing
     * @param resultClass
     *            the class used for the return values, the SQL execution output
     * @param moreResultClasses
     *            more classes used for the return values, like the classes for the collections or the collections items
     * @param query
     *            the SQL Engine query, an adapter or proxy to the internal JDBC or ORM staff
     * @throws org.sqlproc.engine.SqlRuntimeException
     *             in the case of any problem with output values preparation
     */
    void setQueryResultMapping(SqlProcessContext ctx, Class<?> resultClass, Map<String, Class<?>> moreResultClasses,
            SqlQuery query) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>>  setQueryResultMapping, fullName=" + getFullName() + ", resultClass=" + resultClass
                    + ", moreResultClasses=" + moreResultClasses);
        }

        if (sqlType.getMetaType(ctx).getProviderSqlType() != null) {
            Object o = sqlType.getMetaType(ctx);
            if (logger.isTraceEnabled()) {
                logger.trace("<<<  setQueryResultMapping, fullName=" + getFullName() + ", dbName=" + dbName
                        + ", metaType=" + sqlType.getMetaType(ctx));
            }
            sqlType.getMetaType(ctx).addScalar(ctx.getTypeFactory(), query, dbName, null);
        } else {
            int count = attributes.size();
            boolean exit = false;
            Class<?> objClass = resultClass;
            for (int i = 0; i < count - 1 && !exit; i++) {
                SqlMappingAttribute attr = attributes.get(i);
                String name = attr.getName();

                GetterType rt = ctx.getGetterType(objClass, name);
                if (rt != null) {
                    objClass = rt.type;
                } else if (ctx.isFeature(SqlFeature.IGNORE_INPROPER_OUT)) {
                    logger.error("There's no getter for '" + name + "' in " + objClass
                            + ", complete attribute name is '" + attr.getFullName() + "'");
                    exit = true;
                } else {
                    throw new SqlRuntimeException("There's no getter for '" + name + "' in " + objClass
                            + ", complete attribute name is '" + attr.getFullName() + "'");
                }

                if (!exit) {
                    if (isCollection(objClass)) {
                        String typeName = (moreResultClasses != null)
                                ? values.get(attr.getFullName() + Modifiers.MODIFIER_GTYPE) : null;
                        Class<?> typeClass = (typeName != null) ? moreResultClasses.get(typeName) : null;
                        if (typeClass == null)
                            typeClass = rt.typeClass;
                        if (typeClass != null) {
                            objClass = typeClass;
                        } else if (ctx.isFeature(SqlFeature.IGNORE_INPROPER_OUT)) {
                            logger.error("There's no generic type defined for collection " + objClass
                                    + ", complete attribute name is '" + attr.getFullName()
                                    + "', possible type name is " + typeName);
                            exit = true;
                        } else {
                            throw new SqlRuntimeException("There's no generic type defined for collection " + objClass
                                    + ", complete attribute name is '" + attr.getFullName()
                                    + "', possible type name is " + typeName);
                        }
                    } else if (moreResultClasses != null) {
                        String typeName = (moreResultClasses != null)
                                ? values.get(attr.getFullName() + Modifiers.MODIFIER_GTYPE) : null;
                        Class<?> typeClass = (typeName != null) ? moreResultClasses.get(typeName) : null;
                        if (typeClass != null)
                            objClass = typeClass;
                    }
                }
            }
            boolean isPrimitiveWrapper = SqlUtils.isPrimitiveWrapper(resultClass);
            Class<?> attributeType = null;
            Class<?> attributeGenericType = null;
            if (isPrimitiveWrapper) {
                attributeType = objClass;
            } else {
                attributeType = ctx.getAttributeType(objClass, getName());
            }
            if (isCollection(attributeType) && ctx.isFeature(SqlFeature.COLLECTIONS_ARE_STANDARD_TYPES)
                    && attributes.size() == 1) {
                String typeName = values.get(getFullName() + Modifiers.MODIFIER_GTYPE);
                if (typeName != null && moreResultClasses != null)
                    attributeGenericType = moreResultClasses.get(typeName);
                if (typeName != null && attributeGenericType == null)
                    attributeGenericType = getStandardModeResultClass(typeName);

            }
            if (logger.isTraceEnabled()) {
                logger.trace("<<<  setQueryResultMapping, fullName=" + getFullName() + ", dbName=" + dbName
                        + ", attributeType=" + attributeType);
            }
            if (!exit) {
                if (attributeGenericType != null)
                    sqlType.getMetaType(ctx).addScalar(ctx.getTypeFactory(), query, dbName, attributeType,
                            attributeGenericType);
                else
                    sqlType.getMetaType(ctx).addScalar(ctx.getTypeFactory(), query, dbName, attributeType);
            }
        }
    }

    private boolean isCollection(Class<?> clazz) {
        if (clazz == null || clazz.getInterfaces() == null)
            return false;
        for (Class<?> clazz1 : clazz.getInterfaces()) {
            if (clazz1 == Collection.class) {
                return true;
            }
        }
        return false;
    }

    private Class<?> getStandardModeResultClass(String typeName) {
        switch (typeName) {
        case "string":
            return String.class;
        default:
            return null;
        }
    }

    /**
     * Initializes the attribute of the result class with the output value from the SQL query execution.
     * 
     * @param ctx
     *            the crate for all input parameters and the context of processing
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
    void setQueryResultData(SqlProcessContext ctx, Object resultInstance, int resultIndex, Object[] resultValues,
            Map<String, Object> ids, Map<String, Object> idsProcessed, Map<String, SqlMappingIdentity> identities,
            Map<String, Class<?>> moreResultClasses) throws SqlRuntimeException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> setQueryResultData, fullName=" + getFullName() + ", resultInstance=" + resultInstance
                    + ", resultValue=" + resultValues[resultIndex]);
        }
        if (resultValues[resultIndex] == null) {
            return;
        }
        if (ids != null) {
            String idsKey = SqlUtils.getIdsKey(resultValues, identities, getFullName());
            boolean alreadyProcessed = ids.containsKey(idsKey);
            if (logger.isTraceEnabled()) {
                logger.trace("=== setQueryResultData, fullName=" + getFullName() + ", idsKey=" + idsKey
                        + ", alreadyProcessed=" + alreadyProcessed);
            }
            if (alreadyProcessed)
                return;
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

            GetterType rt = ctx.getGetterType(obj, name);
            if (rt != null) {
                Object nextObj = ctx.invokeMethod(obj, rt.methodName, null);
                if (nextObj == null) {
                    String typeName = values.get(attr.getFullName() + Modifiers.MODIFIER_TYPE);
                    Class<?> typeClass = (typeName != null) ? moreResultClasses.get(typeName) : null;
                    if (typeClass == null) {
                        Class<?> clazz = rt.type;
                        if (clazz.isInterface()) {
                            if (clazz == List.class) {
                                typeClass = ArrayList.class;
                            } else if (clazz == Set.class) {
                                typeClass = HashSet.class;
                            } else if (ctx.isFeature(SqlFeature.IGNORE_INPROPER_OUT)) {
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
                        Class<?> typeClass2 = null;
                        if (moreResultClasses != null) {
                            String typeName2 = values.get(attr.getFullName() + Modifiers.MODIFIER_GTYPE);
                            if (typeName2 != null) {
                                if (typeName2.toLowerCase().startsWith(Modifiers.MODIFIER_DISCRIMINATOR))
                                    typeClass2 = moreResultClasses.get(resultValues[resultIndex]);
                                else
                                    typeClass2 = moreResultClasses.get(typeName2);
                            }
                        }
                        if (typeClass2 != null && typeClass.isAssignableFrom(typeClass2))
                            nextObj = ctx.getInstance(typeClass2);
                        else
                            nextObj = ctx.getInstance(typeClass);
                        if (nextObj != null) {
                            ctx.setAttribute(obj, name, nextObj);
                        } else if (ctx.isFeature(SqlFeature.IGNORE_INPROPER_OUT)) {
                            logger.error(
                                    "There's problem to instantiate " + typeClass + ", complete attribute name is '"
                                            + attr.getFullName() + "', possible type name is " + typeName);
                            exit = true;
                        } else {
                            throw new SqlRuntimeException(
                                    "There's problem to instantiate " + typeClass + ", complete attribute name is '"
                                            + attr.getFullName() + "', possible type name is " + typeName);
                        }
                    }
                }
                if (!exit && nextObj instanceof Collection) {
                    String idsKey = SqlUtils.getIdsKey(resultValues, identities, attr.getFullName());
                    if (ids.containsKey(idsKey)) {
                        nextObj = ids.get(idsKey);
                    } else if (idsProcessed.containsKey(idsKey)) {
                        nextObj = idsProcessed.get(idsKey);
                    } else {
                        String typeName = (moreResultClasses != null)
                                ? values.get(attr.getFullName() + Modifiers.MODIFIER_GTYPE) : null;
                        Class<?> typeClass = null;
                        if (typeName != null) {
                            if (typeName.toLowerCase().startsWith(Modifiers.MODIFIER_DISCRIMINATOR))
                                typeClass = moreResultClasses.get(resultValues[resultIndex]);
                            else
                                typeClass = moreResultClasses.get(typeName);
                        }
                        if (typeClass == null)
                            typeClass = rt.typeClass;
                        if (typeClass != null) {
                            Object itemObj = ctx.getInstance(typeClass);
                            if (itemObj != null) {
                                ((Collection) nextObj).add(itemObj);
                                idsProcessed.put(idsKey, itemObj);
                                nextObj = itemObj;
                            } else if (ctx.isFeature(SqlFeature.IGNORE_INPROPER_OUT)) {
                                logger.error(
                                        "There's problem to instantiate " + typeClass + ", complete attribute name is "
                                                + attr.getFullName() + ", possible type name is " + typeName);
                                exit = true;
                            } else {
                                throw new SqlRuntimeException(
                                        "There's problem to instantiate " + typeClass + ", complete attribute name is "
                                                + attr.getFullName() + ", possible type name is " + typeName);
                            }
                        } else if (ctx.isFeature(SqlFeature.IGNORE_INPROPER_OUT)) {
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
            } else if (ctx.isFeature(SqlFeature.IGNORE_INPROPER_OUT)) {
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
        sqlType.setResult(ctx, obj, getName(), resultValues[resultIndex]);
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
            resultMappingItem.setAttributesMap(attributesMap);
            resultMappingItem.fullName = fullName;
            resultMappingItem.identity = identity;
            resultMappingItem.values = values;
        } else {
            resultMappingItem.setAttributes(outputMapping.getAttributes());
            resultMappingItem.setAttributesMap(attributesMap);
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

        SqlProcessResult result = new SqlProcessResult(ctx, dbName);
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
