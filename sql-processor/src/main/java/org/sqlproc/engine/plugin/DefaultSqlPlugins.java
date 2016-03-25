package org.sqlproc.engine.plugin;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlRuntimeContext;
import org.sqlproc.engine.type.SqlMetaType;

/**
 * The SQL Processor plugins standard implementation.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class DefaultSqlPlugins implements IsEmptyPlugin, IsTruePlugin, SqlCountPlugin, SqlFromToPlugin,
        SqlSequencePlugin, SqlIdentityPlugin, SqlExecutionPlugin, SqlProcessingIdPlugin {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());

    protected static final String METHOD_IS_NULL = "isNull";
    protected static final String METHOD_IS_NULL_ = METHOD_IS_NULL + "_";
    protected static final String METHOD_IS_DEF = "isDef";
    protected static final String METHOD_IS_DEF_ = METHOD_IS_DEF + "_";
    protected static final String METHOD_TO_INIT = "toInit";
    protected static final String METHOD_TO_INIT_ = METHOD_TO_INIT + "_";
    protected static final String METHOD_GET_OP = "getOp";
    protected static final String METHOD_GET_OP_ = METHOD_GET_OP + "_";
    protected static final Map<String, String[]> METHODS = new HashMap<>();
    static {
        METHODS.put(METHOD_IS_NULL, new String[] { METHOD_IS_NULL_, METHOD_IS_NULL });
        METHODS.put(METHOD_IS_NULL_, new String[] { METHOD_IS_NULL_ });
        METHODS.put(METHOD_IS_DEF, new String[] { METHOD_IS_DEF_, METHOD_IS_DEF });
        METHODS.put(METHOD_IS_DEF_, new String[] { METHOD_IS_DEF_ });
        METHODS.put(METHOD_TO_INIT, new String[] { METHOD_TO_INIT_, METHOD_TO_INIT });
        METHODS.put(METHOD_TO_INIT_, new String[] { METHOD_TO_INIT_ });
        METHODS.put(METHOD_GET_OP, new String[] { METHOD_GET_OP_, METHOD_GET_OP });
        METHODS.put(METHOD_GET_OP_, new String[] { METHOD_GET_OP_ });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isNotEmpty(SqlRuntimeContext runtimeCtx, String attributeName, Object obj, Object parentObj,
            SqlMetaType sqlMetaType, String inOutModifier, boolean inSqlSetOrInsert, Map<String, String> values)
            throws IllegalArgumentException {
        if (logger.isTraceEnabled()) {
            logger.trace(">>> isNotEmpty attributeName=" + attributeName + ", obj=" + obj + ", parentObj=" + parentObj
                    + ", inSqlSetOrInsert=" + inSqlSetOrInsert);
        }

        Boolean delegatedResult = callMethod(runtimeCtx, attributeName, Boolean.class, parentObj, values);
        if (delegatedResult != null) {
            return delegatedResult;
        }

        String value = (inOutModifier != null) ? inOutModifier.toLowerCase() : null;

        boolean result = isNotEmptyInternal(runtimeCtx, attributeName, obj, parentObj, sqlMetaType, value,
                inSqlSetOrInsert, values);
        if (result)
            return result;
        if (MODIFIER_NOTEMPTY.equalsIgnoreCase(value)) {
            throw new IllegalArgumentException(MODIFIER_NOTEMPTY);
        }
        return result;
    }

    /**
     * Used for the evaluation of the emptiness in the META SQL fragments.
     * 
     * @param runtimeCtx
     *            the public runtime context
     * @param attributeName
     *            the name of the input value
     * @param obj
     *            the input value
     * @param parentObj
     *            the parent of the input value
     * @param sqlMetaType
     *            the internal type (= META type) devoted for the special processing of the input values
     * @param inOutModifier
     *            the input/output value modifier devoted to extend the processing of the input/output values
     * @param inSqlSetOrInsert
     *            an indicator the input value is evaluated in the CRUD statement (INSERT or SET)
     * @param values
     *            values for a special identifier handling, for example a sequence for an identity
     * @return the non-emptiness of the input value
     */
    protected boolean isNotEmptyInternal(SqlRuntimeContext runtimeCtx, String attributeName, Object obj,
            Object parentObj, SqlMetaType sqlMetaType, String inOutModifier, boolean inSqlSetOrInsert,
            Map<String, String> values) throws IllegalArgumentException {

        if (MODIFIER_NOTNULL.equalsIgnoreCase(inOutModifier)) {
            if (obj == null)
                throw new IllegalArgumentException(MODIFIER_NOTNULL);
        }

        if (inSqlSetOrInsert) {
            boolean isEmptyUseMethodIsNull = false;
            if (obj == null && attributeName != null && parentObj != null) {
                Object o = runtimeCtx.getFeatureAsObject(SqlFeature.EMPTY_USE_METHOD_IS_NULL);
                if (o != null && o instanceof Boolean && ((Boolean) o))
                    isEmptyUseMethodIsNull = true;
            }
            Object isNullObj = null;
            if (isEmptyUseMethodIsNull) {
                isNullObj = (runtimeCtx.checkMethod(parentObj.getClass(), METHOD_IS_NULL_, String.class))
                        ? runtimeCtx.invokeMethod(parentObj, METHOD_IS_NULL_, attributeName)
                        : ((runtimeCtx.checkMethod(parentObj.getClass(), METHOD_IS_NULL, String.class))
                                ? runtimeCtx.invokeMethod(parentObj, METHOD_IS_NULL, attributeName) : null);
            }
            if (isNullObj != null && isNullObj instanceof Boolean && ((Boolean) isNullObj)) {
                return true;
            }
            boolean isEmptyForNull = isEmptyUseMethodIsNull;
            if (isEmpty(obj, values)) {
                Object o = runtimeCtx.getFeatureAsObject(SqlFeature.EMPTY_FOR_NULL);
                if (o != null && o instanceof Boolean && ((Boolean) o))
                    isEmptyForNull = true;
                if (!isEmptyForNull)
                    return true;
            }
        }

        if (MODIFIER_ANY.equalsIgnoreCase(inOutModifier)) {
            return true;
        } else if (MODIFIER_NULL.equalsIgnoreCase(inOutModifier)) {
            if (obj == null)
                return true;
            else
                return false;
        } else {
            return !isEmpty(obj, values);
        }
    }

    protected boolean isEmpty(Object obj, Map<String, String> values) {
        if (obj == null) {
            return true;
        } else if (obj instanceof Collection<?>) {
            if (((Collection<?>) obj).isEmpty()) {
                if (values.containsKey(MODIFIER_ANYSET))
                    return false;
                else
                    return true;
            }
        } else if (obj.toString().length() <= 0) {
            return true;
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isTrue(SqlRuntimeContext runtimeCtx, String attributeName, Object obj, Object parentObj,
            SqlMetaType sqlMetaType, String inOutModifier, Map<String, String> values) {

        Boolean delegatedResult = callMethod(runtimeCtx, attributeName, Boolean.class, parentObj, values);
        if (delegatedResult != null) {
            return delegatedResult;
        }

        if (inOutModifier == null) {
            if (obj != null) {
                if (obj instanceof Boolean) {
                    return ((Boolean) obj).booleanValue();
                } else if (obj instanceof String) {
                    String str = ((String) obj).trim();
                    return (str.length() > 0 && !str.equalsIgnoreCase("false"));
                } else if (obj instanceof Number) {
                    return ((Number) obj).longValue() > 0;
                } else if (obj.getClass().isEnum()) {
                    return true;
                } else {
                    return true; // not null
                }
            }
            return false;
        } else {
            if (obj == null) {
                if (inOutModifier.toLowerCase().equalsIgnoreCase(MODIFIER_NULL))
                    return true;
                else
                    return false;
            } else {
                if (obj.getClass().isEnum()) {
                    if (obj.toString().equals(inOutModifier)) {
                        return true;
                    } else if (sqlMetaType == runtimeCtx.getTypeFactory().getEnumStringType()) {
                        return inOutModifier.equals(runtimeCtx.getEnumToValue(obj));
                    } else if (sqlMetaType == runtimeCtx.getTypeFactory().getEnumIntegerType()) {
                        return inOutModifier.equals(runtimeCtx.getEnumToValue(obj).toString());
                    } else {
                        Object enumVal = runtimeCtx.getEnumToValue(obj);
                        if (enumVal.toString().equals(inOutModifier))
                            return true;
                        return false;
                    }
                } else {
                    if (obj.toString().equals(inOutModifier))
                        return true;
                    else
                        return false;
                }
            }
        }
    }

    boolean debug = false;

    private static final String ID = "ID";
    private static final int L_ID = ID.length();
    private static final String FROM = "FROM";
    private static final String SELECT = "SELECT";
    private static final int L_SELECT = SELECT.length();
    private static final String DISTINCT = "DISTINCT";
    private static final String CMD_DISTINCT = "distinct ";

    /**
     * {@inheritDoc}
     */
    @Override
    public String sqlCount(String name, StringBuilder sql) {
        String sqlStr = sql.toString();
        String sqlUpper = sqlStr.toUpperCase();
        int ixID = sqlUpper.indexOf(ID);
        int ixFROM = sqlUpper.indexOf(FROM);
        if (ixID < 0 || ixFROM < 0 || ixID > ixFROM)
            return "select count(*) as vysledek from (" + sqlStr + ") derived";

        int ixAfterID = ixID + L_ID;
        for (; ixAfterID < ixFROM; ixAfterID++) {
            char c = sqlUpper.charAt(ixAfterID);
            if (c == '_')
                continue;
            if (c >= 'A' && c <= 'Z')
                continue;
            break;
        }
        String sqlSelectID = sqlStr.substring(0, ixAfterID);
        String sqlFROM = sqlStr.substring(ixFROM);
        int ixSELECT = sqlSelectID.toUpperCase().indexOf(SELECT);
        if (ixSELECT < 0)
            return "select count(*) as vysledek from (" + sqlStr + ") derived";

        String sqlBeforeSELECT = sqlSelectID.substring(0, ixSELECT);
        int ixCOMMA = sqlSelectID.indexOf(",");
        int ixAfterSELECTBeforeCOMMA = (ixCOMMA < 0) ? ixSELECT + L_SELECT : ixCOMMA + 1;
        String sqlID = sqlSelectID.substring(ixAfterSELECTBeforeCOMMA);

        String distinct = CMD_DISTINCT;
        int ixDISTINCT = sqlID.toUpperCase().indexOf(DISTINCT);
        if (ixDISTINCT >= 0) {
            distinct = "";
            if (ixDISTINCT > 0) {
                for (int i = 0; i < ixDISTINCT; i++) {
                    char c = sqlID.charAt(i);
                    if (!Character.isWhitespace(c)) {
                        distinct = CMD_DISTINCT;
                        break;
                    }
                }
            }
        }
        String result = sqlBeforeSELECT + "select count(" + distinct + sqlID + ") as vysledek " + sqlFROM;
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LimitType limitQuery(SqlRuntimeContext runtimeCtx, String queryString, StringBuilder queryResult,
            Integer firstResult, Integer maxResults, boolean ordered) {
        LimitType limitType = new LimitType();

        if (maxResults == null || maxResults <= 0)
            return null;
        if (firstResult != null && firstResult > 0) {
            limitType.alsoFirst = true;
            String limitPattern = (ordered) ? runtimeCtx.getFeature(SqlFeature.LIMIT_FROM_TO_ORDERED)
                    : runtimeCtx.getFeature(SqlFeature.LIMIT_FROM_TO);
            if (limitPattern == null && ordered)
                limitPattern = runtimeCtx.getFeature(SqlFeature.LIMIT_FROM_TO);
            limitType = limitQuery(limitPattern, limitType, queryString, queryResult, firstResult, maxResults);
            return limitType;
        } else {
            String limitPattern = (ordered) ? runtimeCtx.getFeature(SqlFeature.LIMIT_TO_ORDERED)
                    : runtimeCtx.getFeature(SqlFeature.LIMIT_TO);
            if (limitPattern == null && ordered)
                limitPattern = runtimeCtx.getFeature(SqlFeature.LIMIT_TO);
            limitType = limitQuery(limitPattern, limitType, queryString, queryResult, firstResult, maxResults);
            return limitType;
        }
    }

    public static <E> E callMethod(SqlRuntimeContext runtimeCtx, String attributeName, Class<E> attributeClass,
            Object parentObj, Map<String, String> values) {
        if (attributeName == null || parentObj == null || values == null)
            return null;
        String methodName = values.get(MODIFIER_CALL);
        if (methodName == null)
            return null;
        Object result = null;
        String[] methods = METHODS.get(methodName);
        if (methods == null) {
            result = (runtimeCtx.checkMethod(parentObj.getClass(), methodName, String.class))
                    ? runtimeCtx.invokeMethod(parentObj, methodName, attributeName) : null;
        } else {
            for (String method : methods) {
                if (method.startsWith(METHOD_IS_DEF)) {
                    if (runtimeCtx.checkMethod(parentObj.getClass(), method, String.class, Boolean.class)) {
                        Boolean isAttributeNotNull = runtimeCtx.checkAttribute(parentObj, attributeName)
                                ? runtimeCtx.getAttribute(parentObj, attributeName) != null : null;
                        result = runtimeCtx.invokeMethod(parentObj, method, attributeName, isAttributeNotNull);
                        break;
                    } else if (runtimeCtx.checkMethod(parentObj.getClass(), method, String.class)) {
                        // to support old SQLMOP generated POJOs
                        result = runtimeCtx.invokeMethod(parentObj, method, attributeName);
                        break;
                    }
                } else {
                    Class<?> clazz = method.startsWith("is") ? Boolean.class : String.class;
                    if (runtimeCtx.checkMethod(parentObj.getClass(), method, clazz)) {
                        result = runtimeCtx.invokeMethod(parentObj, method, attributeName);
                        break;
                    }
                }
            }
        }
        if (result == null || !(result.getClass() != attributeClass)) {
            return null;
        }
        return (E) result;
    }

    private LimitType limitQuery(String limitPattern, LimitType limitType, String queryString,
            StringBuilder queryResult, Integer firstResult, Integer maxResults) {
        if (limitPattern == null)
            return null;
        int ix = limitPattern.indexOf("$S");
        if (ix >= 0) {
            limitType.afterSql = limitPattern.indexOf("$", ix + 1) > 0;
            queryResult.append(limitPattern.substring(0, ix));
            queryResult.append(queryString);
            queryResult.append(limitPattern.substring(ix + 2));
        } else {
            ix = limitPattern.indexOf("$s");
            if (ix >= 0) {
                limitType.afterSql = limitPattern.indexOf("$", ix + 1) > 0;
                int ix2 = queryString.toLowerCase().indexOf("select");
                if (ix2 < 0)
                    return null;
                queryResult.append(limitPattern.substring(0, ix));
                queryResult.append(queryString.substring(ix2 + 6));
                queryResult.append(limitPattern.substring(ix + 2));
            } else {
                return null;
            }
        }
        if (limitType.alsoFirst) {
            ix = queryResult.indexOf("$F");
            if (ix >= 0) {
                if (queryResult.indexOf("$m", ix) < 0 && queryResult.indexOf("$M", ix) < 0)
                    limitType.maxBeforeFirst = true;
                queryResult.replace(ix, ix + 2, "?");
            } else {
                ix = queryResult.indexOf("$f");
                if (ix >= 0) {
                    limitType.zeroBasedFirst = true;
                    if (queryResult.indexOf("$m", ix) < 0 && queryResult.indexOf("$M", ix) < 0)
                        limitType.maxBeforeFirst = true;
                    queryResult.replace(ix, ix + 2, "?");
                } else {
                    return null;
                }
            }
        }
        ix = queryResult.indexOf("$M");
        if (ix >= 0) {
            queryResult.replace(ix, ix + 2, "?");
        } else {
            ix = queryResult.indexOf("$m");
            if (ix >= 0) {
                limitType.rowidBasedMax = true;
                queryResult.replace(ix, ix + 2, "?");
            } else {
                return null;
            }
        }
        return limitType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String identitySelect(SqlRuntimeContext runtimeCtx, String identitySelectName, Class<?> inputValueType) {
        // TODO - refactor
        String identityName = (SqlIdentityPlugin.MODIFIER_IDENTITY_SELECT.equals(identitySelectName))
                ? SqlFeature.IDSEL.name() : identitySelectName;
        String identitySelect = null;
        if (inputValueType != null)
            identitySelect = runtimeCtx.getFeature(identityName + "_" + inputValueType.getSimpleName());
        if (identitySelect != null)
            return identitySelect;
        if (inputValueType != null)
            identitySelect = runtimeCtx.getFeature(SqlFeature.IDSEL,
                    identityName + "_" + inputValueType.getSimpleName());
        if (identitySelect != null)
            return identitySelect;
        identitySelect = runtimeCtx.getFeature(identityName);
        if (identitySelect != null)
            return identitySelect;
        return runtimeCtx.getFeature(SqlFeature.IDSEL, identityName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String sequenceSelect(SqlRuntimeContext runtimeCtx, String sequenceName) {
        // TODO - refactor
        String sequence = runtimeCtx.getFeature(sequenceName);
        if (sequence == null)
            sequence = runtimeCtx.getFeature(SqlFeature.SEQ, sequenceName);
        if (sequence == null)
            sequence = runtimeCtx.getFeature(SqlFeature.SEQ);
        if (sequence == null)
            return null;
        int ix = sequence.indexOf("$n");
        if (ix < 0)
            return sequence;
        if (SqlSequencePlugin.MODIFIER_SEQUENCE.equals(sequenceName))
            return sequence.substring(0, ix) + runtimeCtx.getFeature(SqlFeature.SEQ_NAME) + sequence.substring(ix + 2);
        else
            return sequence.substring(0, ix) + sequenceName + sequence.substring(ix + 2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String beforeSqlExecution(String name, String queryString) {
        if (queryString == null)
            return null;
        return queryString.trim();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getProcessingId(String name, Object dynamicInputValues, SqlControl sqlControl,
            Boolean useDynamicProcessingCache) {
        if (sqlControl == null)
            return null;
        else
            return sqlControl.getProcessingId();
    }
}
