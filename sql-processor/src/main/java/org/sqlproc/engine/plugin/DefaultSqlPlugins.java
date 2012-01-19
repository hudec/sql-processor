package org.sqlproc.engine.plugin;

import java.util.Collection;

import org.sqlproc.engine.impl.SqlProcessContext;
import org.sqlproc.engine.impl.SqlUtils;
import org.sqlproc.engine.type.SqlMetaType;

/**
 * The SQL Processor plugins standard implementation.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class DefaultSqlPlugins implements IsEmptyPlugin, IsTruePlugin {

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
     * {@inheritDoc}
     */
    @Override
    public boolean isEmpty(Object obj, SqlMetaType sqlMetaType, String sqlMetaTypeExt, boolean inSqlSetOrInsert)
            throws IllegalArgumentException {
        String value = (sqlMetaTypeExt != null) ? sqlMetaTypeExt.toLowerCase() : null;

        if (SUPPVAL_NOTNULL.equalsIgnoreCase(value)) {
            if (obj == null)
                throw new IllegalArgumentException(SUPPVAL_NOTNULL);
        }

        if (inSqlSetOrInsert) {
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
    public boolean isTrue(Object obj, SqlMetaType sqlMetaType, String sqlMetaTypeExt) {
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
