package org.sqlproc.engine.plugin;

import java.util.Collection;
import java.util.Map;

import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.impl.SqlProcessContext;
import org.sqlproc.engine.impl.SqlUtils;
import org.sqlproc.engine.type.SqlMetaType;

/**
 * The SQL Processor plugins test implementation.
 * 
 * @author <a href="mailto:ondrej.kotek@gmail.com">Ondřej Kotek</a>
 */
public class CustomizedSqlPlugins implements IsEmptyPlugin, IsTruePlugin {

    /**
     * The supplement value used to detect the empty value and true value. For the usage please see the Wiki Tutorials.
     */
    public static final String SUPPVAL_NOTNULL = "notnull";
    /**
     * The supplement value used to detect the empty value and true value. For the usage please see the Wiki Tutorials.
     */
    public static final String SUPPVAL_ANY = "any";
    /**
     * The supplement value used to detect the empty value and true value. For the usage please see the Wiki Tutorials.
     */
    public static final String SUPPVAL_NULL = "null";
    /**
     * The test supplement value used to detect the empty value and true value.
     */
    private static final String SUPPVAL_ZERO = "zero";

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isNotEmpty(String attributeName, Object obj, Object parentObj, SqlMetaType sqlMetaType,
            String sqlMetaTypeExt, boolean inSqlSetOrInsert, Map<String, Object> features)
            throws IllegalArgumentException {
        String value = (sqlMetaTypeExt != null) ? sqlMetaTypeExt.toLowerCase() : null;

        if (SUPPVAL_ZERO.equalsIgnoreCase(value)) {
            if (obj != null) {
                if (obj instanceof String) {
                    final String str = ((String) obj).trim();
                    return (!str.isEmpty() && !str.equalsIgnoreCase("0"));
                }
            } else {
                throw new IllegalArgumentException("obj with sqlMetaTypeExt '" + SUPPVAL_ZERO + "' should not be null");
            }
        }

        if (SUPPVAL_NOTNULL.equalsIgnoreCase(value)) {
            if (obj == null)
                throw new IllegalArgumentException(SUPPVAL_NOTNULL);
        }

        if (inSqlSetOrInsert) {
            Object o = features.get(SqlFeature.EMPTY_FOR_NULL);
            if (o == null || !(o instanceof Boolean) || !((Boolean) o))
                if (obj == null)
                    return true;
        }

        if (SUPPVAL_ANY.equalsIgnoreCase(value)) {
            return true;
        } else if (SUPPVAL_NULL.equalsIgnoreCase(value)) {
            if (obj == null)
                return true;
            else
                return false;
        } else {
            if (obj == null) {
                return false;
            } else if (obj instanceof Collection<?>) {
                if (((Collection<?>) obj).isEmpty())
                    return false;
            } else if (obj.toString().length() <= 0) {
                return false;
            }
            return true;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isTrue(String attributeName, Object obj, Object parentObj, SqlMetaType sqlMetaType,
            String sqlMetaTypeExt, Map<String, Object> features) {
        if (SUPPVAL_ZERO.equalsIgnoreCase(sqlMetaTypeExt)) {
            if (obj != null) {
                if (obj instanceof String) {
                    final String str = ((String) obj).trim();
                    return (str.length() > 0 && !str.equalsIgnoreCase("0"));
                }
            } else {
                throw new IllegalArgumentException("obj with sqlMetaTypeExt '" + SUPPVAL_ZERO + "' should not be null");
            }
        }
        if (sqlMetaTypeExt == null) {
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
                if (sqlMetaTypeExt.toLowerCase().equalsIgnoreCase(SUPPVAL_NULL))
                    return true;
                else
                    return false;
            } else {
                if (obj.getClass().isEnum()) {
                    if (obj.toString().equals(sqlMetaTypeExt)) {
                        return true;
                    } else if (sqlMetaType == SqlProcessContext.getTypeFactory().getEnumStringType()) {
                        return sqlMetaTypeExt.equals(SqlUtils.getEnumToValue(obj));
                    } else if (sqlMetaType == SqlProcessContext.getTypeFactory().getEnumIntegerType()) {
                        return sqlMetaTypeExt.equals(SqlUtils.getEnumToValue(obj).toString());
                    } else {
                        Object enumVal = SqlUtils.getEnumToValue(obj);
                        if (enumVal.toString().equals(sqlMetaTypeExt))
                            return true;
                        return false;
                    }
                } else {
                    if (obj.toString().equals(sqlMetaTypeExt))
                        return true;
                    else
                        return false;
                }
            }
        }
    }

}
