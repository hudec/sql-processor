package org.sqlproc.engine.impl;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.MethodUtils;
import org.sqlproc.engine.SqlFeature;

/**
 * SQL Processor utilities.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlUtils {

    static final String SUPPVAL_SEQUENCE = "seq";
    static final String SUPPVAL_IDENTITY_SELECT = "idsel";
    static final String SUPPVAL_ID = "id";
    static final String SUPPVAL_GTYPE = "gtype";
    static final String SUPPVAL_TYPE = "type";
    static final String SUPPVAL_DISCRIMINATOR = "discr";

    // enums

    public static Object getEnumToValue(Object obj) {
        if (obj == null)
            return null;
        for (String methodName : SqlProcessContext.getFeatures(SqlFeature.METHODS_ENUM_IN)) {
            try {
                return MethodUtils.invokeMethod(obj, methodName, null);
            } catch (NoSuchMethodException e) {
                continue;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    @SuppressWarnings("rawtypes")
    public static Class getEnumToClass(Class clazz) {
        if (clazz == null)
            return null;
        for (String methodName : SqlProcessContext.getFeatures(SqlFeature.METHODS_ENUM_IN)) {
            Method m = MethodUtils.getMatchingAccessibleMethod(clazz, methodName, new Class[] {});
            if (m != null)
                return m.getReturnType();
        }
        return null;
    }

    public static Object getValueToEnum(Class<?> objClass, Object val) {
        if (val == null)
            return null;
        for (String methodName : SqlProcessContext.getFeatures(SqlFeature.METHODS_ENUM_OUT)) {
            try {
                return MethodUtils.invokeStaticMethod(objClass, methodName, val);
            } catch (NoSuchMethodException e) {
                continue;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    // miscs

    public static Byte[] toBytes(byte[] barr) {
        if (barr == null)
            return null;
        Byte[] res = new Byte[barr.length];
        for (int i = 0; i < barr.length; i++)
            res[i] = new Byte(barr[i]);
        return res;
    }

    public static byte[] toBytes(Byte[] barr) {
        if (barr == null)
            return null;
        byte[] res = new byte[barr.length];
        for (int i = 0; i < barr.length; i++)
            res[i] = (barr[i] != null) ? barr[i].byteValue() : (byte) 0;
        return res;
    }

    public static boolean isEmpty(StringBuilder sb) {
        if (sb == null)
            return true;
        String s = sb.toString().trim();
        if (s.length() == 0)
            return true;
        return false;
    }

    // date, time

    public static java.sql.Date getDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        return new java.sql.Date(cal.getTime().getTime());
    }

    public static java.sql.Time getTime(int hour, int minute, int second) {
        Calendar cal = Calendar.getInstance();
        cal.clear(Calendar.YEAR);
        cal.clear(Calendar.MONTH);
        cal.clear(Calendar.DAY_OF_MONTH);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);
        cal.set(Calendar.SECOND, second);
        return new java.sql.Time(cal.getTime().getTime());
    }

    public static Date getDateTime(int year, int month, int day, int hour, int minute, int second) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);
        cal.set(Calendar.SECOND, second);
        return cal.getTime();
    }

    // limit query

    public static class LimitType {
        public boolean alsoFirst;
        public boolean afterSql;
        public boolean maxBeforeFirst;
        public boolean zeroBasedFirst;
        public boolean rowidBasedMax;
    }

    public static LimitType limitQuery(String queryString, StringBuilder queryResult, Integer firstResult,
            Integer maxResults) {
        LimitType limitType = new LimitType();

        if (maxResults == null || maxResults <= 0)
            return null;
        if (firstResult != null && firstResult > 0) {
            limitType.alsoFirst = true;
            String limitPattern = SqlProcessContext.getFeature(SqlFeature.LIMIT_FROM_TO);
            limitType = limitQuery(limitPattern, limitType, queryString, queryResult, firstResult, maxResults);
            return limitType;
        } else {
            String limitPattern = SqlProcessContext.getFeature(SqlFeature.LIMIT_TO);
            limitType = limitQuery(limitPattern, limitType, queryString, queryResult, firstResult, maxResults);
            return limitType;
        }
    }

    public static LimitType limitQuery(String limitPattern, LimitType limitType, String queryString,
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
                ix = queryResult.indexOf("$F");
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

    // sequence

    public static String sequence(String sequenceName) {
        String sequence = SqlProcessContext.getFeature(sequenceName);
        if (sequence != null)
            return sequence;
        String sequencePattern = SqlProcessContext.getFeature(SqlFeature.SEQ);
        if (sequencePattern == null)
            return null;
        int ix = sequencePattern.indexOf("$n");
        if (ix < 0)
            return sequencePattern;
        if (SqlUtils.SUPPVAL_SEQUENCE.equals(sequenceName))
            return sequencePattern.substring(0, ix) + SqlFeature.DEFAULT_SEQ_NAME + sequencePattern.substring(ix + 2);
        else
            return sequencePattern.substring(0, ix) + sequenceName + sequencePattern.substring(ix + 2);
    }

    // identity select

    public static String identitySelect(String identitySelectName) {
        String identitySelect = (SqlUtils.SUPPVAL_IDENTITY_SELECT.equals(identitySelectName)) ? null
                : SqlProcessContext.getFeature(identitySelectName);
        if (identitySelect != null)
            return identitySelect;
        return SqlProcessContext.getFeature(SqlFeature.IDSEL);
    }

    // default features
    public static Map<String, Object> getDefaultFeatures(String filterPrefix) {
        Map<String, Object> features = new HashMap<String, Object>();

        if (filterPrefix != null && !filterPrefix.endsWith("_"))
            filterPrefix = filterPrefix + "_";
        String fullPrefix = filterPrefix != null ? filterPrefix + "DEFAULT_" : null;
        int fullPrefixLength = fullPrefix != null ? fullPrefix.length() : 0;
        String shortPrefix = "DEFAULT_";
        int shortPrefixLength = shortPrefix.length();
        for (Field f : SqlFeature.class.getDeclaredFields()) {
            if (fullPrefix != null) {
                if (f.getName().startsWith(fullPrefix)) {
                    String featureName = f.getName().substring(fullPrefixLength);
                    if (features.get(featureName) == null) {
                        try {
                            features.put(featureName, f.get(null));
                        } catch (IllegalArgumentException e) {
                        } catch (IllegalAccessException e) {
                        }
                    }
                }
            }
            if (f.getName().startsWith(shortPrefix)) {
                String featureName = f.getName().substring(shortPrefixLength);
                if (features.get(featureName) == null) {
                    try {
                        features.put(featureName, f.get(null));
                    } catch (IllegalArgumentException e) {
                    } catch (IllegalAccessException e) {
                    }
                }
            }
        }
        return features;
    }

    // identifiers
    public static String getIdsKey(Object[] resultValues, Map<String, SqlMappingIdentity> identities, String fullName) {
        String idsKey = "";
        int i = 0;

        SqlMappingIdentity ident = identities.get(fullName);
        for (List<Integer> identityIndexes : ident.allIdentityIndexes) {
            for (Integer identityIndex : identityIndexes) {
                Object o = resultValues[identityIndex];
                if (o != null) {
                    if (i > 0)
                        idsKey += '-';
                    idsKey += identityIndex;
                    idsKey += '-';
                    idsKey += o;
                    break;
                }
            }
            ++i;
        }
        return idsKey;
    }

    public static String getIdsKey(Object[] resultValues, Integer mainIdentityIndex) {
        String idsKey = "" + mainIdentityIndex + "-" + resultValues[mainIdentityIndex];
        return idsKey;
    }
}
