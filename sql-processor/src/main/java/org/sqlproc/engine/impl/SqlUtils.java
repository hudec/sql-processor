package org.sqlproc.engine.impl;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.beanutils.MethodUtils;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlRuntimeContext;

/**
 * SQL Processor utilities.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SqlUtils {

    // enums

    public static Object getEnumToValue(SqlRuntimeContext runtimeCtx, Object obj) {
        if (obj == null)
            return null;
        for (String methodName : runtimeCtx.getFeatures(SqlFeature.METHODS_ENUM_IN)) {
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
    public static Class getEnumToClass(SqlRuntimeContext runtimeCtx, Class clazz) {
        if (clazz == null)
            return null;
        for (String methodName : runtimeCtx.getFeatures(SqlFeature.METHODS_ENUM_IN)) {
            Method m = MethodUtils.getMatchingAccessibleMethod(clazz, methodName, new Class[] {});
            if (m != null)
                return m.getReturnType();
        }
        return null;
    }

    public static Object getValueToEnum(SqlRuntimeContext runtimeCtx, Class<?> objClass, Object val) {
        if (val == null)
            return null;
        for (String methodName : runtimeCtx.getFeatures(SqlFeature.METHODS_ENUM_OUT)) {
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

    public static Object convertBigDecimal(Class<?> attributeType, Object resultValue) {
        if (resultValue == null || !(resultValue instanceof BigDecimal))
            return resultValue;
        BigDecimal result = (BigDecimal) resultValue;
        if (attributeType == Byte.class || attributeType == byte.class) {
            return result.byteValue();
        } else if (attributeType == Integer.class || attributeType == int.class) {
            return result.intValue();
        } else if (attributeType == Long.class || attributeType == long.class) {
            return result.longValue();
        } else if (attributeType == Short.class || attributeType == short.class) {
            return result.shortValue();
        } else if (attributeType == BigInteger.class) {
            return result.toBigInteger();
        }
        return result;
    }

    public static Object convertBigInteger(Class<?> attributeType, Object resultValue) {
        if (resultValue == null || !(resultValue instanceof BigInteger))
            return resultValue;
        BigInteger result = (BigInteger) resultValue;
        if (attributeType == Byte.class || attributeType == byte.class) {
            return result.byteValue();
        } else if (attributeType == Integer.class || attributeType == int.class) {
            return result.intValue();
        } else if (attributeType == Long.class || attributeType == long.class) {
            return result.longValue();
        } else if (attributeType == Short.class || attributeType == short.class) {
            return result.shortValue();
        }
        return result;
    }

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

    public static String beforeChar(String s, char c) {
        int ix = s.indexOf(c);
        if (ix < 0)
            return s;
        else
            return s.substring(0, ix);
    }

    public static String afterChar(String s, char c) {
        int ix = s.indexOf(c);
        if (ix < 0)
            return null;
        else
            return s.substring(ix + 1);
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

    static final Pattern patternInsert = Pattern.compile("[^\\(]*\\(\\s*([^\\)]*)\\s*\\).*");

    public static String handleInsertSql(Map<String, SqlInputValue> identities, String sql) {
        if (identities == null || identities.isEmpty())
            return sql;
        Map<String, SqlInputValue> ids1 = new HashMap<String, SqlInputValue>();
        Map<String, SqlInputValue> ids2 = new HashMap<String, SqlInputValue>();
        for (Entry<String, SqlInputValue> e : identities.entrySet()) {
            if (e.getValue().getValueType() == SqlInputValue.Type.IDENTITY_SELECT) {
                ids1.put(e.getKey(), e.getValue());
                if (e.getValue().getDbIdentityName() != null) {
                    ids2.put(e.getValue().getDbIdentityName(), e.getValue());
                }
            }
        }
        if (ids1.isEmpty())
            return sql;
        Matcher matcher = patternInsert.matcher(sql);
        if (!matcher.matches())
            return sql;
        String fragment = matcher.group(1);
        String[] cols = fragment.split(",");
        int icol = -1;
        for (int i = 0; i < cols.length; i++) {
            String c = cols[i].trim();
            if (c.startsWith("%"))
                c = c.substring(1);
            if (ids2.containsKey(c)) {
                icol = i;
            } else if (ids2.containsKey(c.toLowerCase()))
                icol = i;
            else if (ids2.containsKey(c.toUpperCase()))
                icol = i;
            else if (ids1.containsKey(c))
                icol = i;
            else if (ids1.containsKey(c.toLowerCase()))
                icol = i;
            else if (ids1.containsKey(c.toUpperCase()))
                icol = i;
            if (icol >= 0)
                break;
        }
        if (icol < 0)
            return sql;
        int ix = sql.indexOf(cols[icol]);
        if (ix < 0)
            return sql;
        // System.out.println("XXXXXXXXXX " + ix + " '" + sql + "'");
        String sql1 = sql.substring(0, ix);
        String sql2 = sql.substring(ix + cols[icol].length());
        // System.out.println("YYYYYYYYYY '" + sql1 + "'" + sql2 + "'");
        if (sql1.trim().endsWith(",")) {
            ix = sql1.lastIndexOf(",");
            sql = sql.substring(0, ix) + sql2;
        } else if (sql2.trim().startsWith(",")) {
            ix = sql2.indexOf(",");
            sql = sql1 + sql2.substring(ix + 1);
        } else {
            sql = sql1 + sql2;
        }
        // System.out.println("ZZZZZZZZZZ '" + sql + "'");
        return sql;
    }

    public static List<Integer> asList(int[] array) {
        List<Integer> list = new ArrayList<Integer>();
        if (array == null)
            return list;
        for (int item : array)
            list.add(item);
        return list;
    }

    public static String firstLowerCase(String s) {
        if (s == null)
            return null;
        if (s.length() == 1)
            return s.toLowerCase();
        return s.substring(0, 1).toLowerCase() + s.substring(1);
    }

    public static Set<String> oppositeFeatures(String featureName) {
        Set<String> oppositeFeatures = new HashSet<String>();
        if (SqlFeature.SURROUND_QUERY_LIKE_FULL.equals(featureName)) {
            oppositeFeatures.add(SqlFeature.SURROUND_QUERY_LIKE_PARTIAL);
            oppositeFeatures.add(SqlFeature.REPLACE_LIKE_CHARS);
        } else if (SqlFeature.SURROUND_QUERY_LIKE_PARTIAL.equals(featureName)) {
            oppositeFeatures.add(SqlFeature.SURROUND_QUERY_LIKE_FULL);
            oppositeFeatures.add(SqlFeature.REPLACE_LIKE_CHARS);
        } else if (SqlFeature.REPLACE_LIKE_CHARS.equals(featureName)) {
            oppositeFeatures.add(SqlFeature.SURROUND_QUERY_LIKE_FULL);
            oppositeFeatures.add(SqlFeature.SURROUND_QUERY_LIKE_PARTIAL);
        } else if (SqlFeature.EMPTY_FOR_NULL.equals(featureName)) {
            oppositeFeatures.add(SqlFeature.EMPTY_USE_METHOD_IS_NULL);
        } else if (SqlFeature.EMPTY_USE_METHOD_IS_NULL.equals(featureName)) {
            oppositeFeatures.add(SqlFeature.EMPTY_FOR_NULL);
        }
        return oppositeFeatures;
    }
}
