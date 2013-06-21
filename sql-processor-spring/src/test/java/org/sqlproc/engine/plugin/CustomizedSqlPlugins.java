package org.sqlproc.engine.plugin;

import java.util.Map;

import org.sqlproc.engine.type.SqlMetaType;

/**
 * The SQL Processor plugins test implementation.
 * 
 * @author <a href="mailto:ondrej.kotek@gmail.com">Ondřej Kotek</a>
 */
public class CustomizedSqlPlugins extends DefaultSqlPlugins {

    /**
     * The test supplement value used to detect the empty value and true value.
     */
    private static final String MODIFIER_ZERO = "zero";
    private static final String MODIFIER_NOTZERO = "notzero";

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isNotEmpty(String attributeName, Object obj, Object parentObj, SqlMetaType sqlMetaType,
            String inOutModifier, boolean inSqlSetOrInsert, Map<String, String> values, Map<String, Object> features)
            throws IllegalArgumentException {

        if (MODIFIER_ZERO.equalsIgnoreCase(inOutModifier)) {
            if (obj != null) {
                if (obj instanceof String) {
                    final String str = ((String) obj).trim();
                    return ("0".equals(str));
                }
            } else {
                throw new IllegalArgumentException("obj with sqlMetaTypeExt '" + MODIFIER_ZERO + "' should not be null");
            }
        }
        if (MODIFIER_NOTZERO.equalsIgnoreCase(inOutModifier)) {
            if (obj != null) {
                if (obj instanceof String) {
                    final String str = ((String) obj).trim();
                    return (!"0".equals(str));
                }
            } else {
                throw new IllegalArgumentException("obj with sqlMetaTypeExt '" + MODIFIER_ZERO + "' should not be null");
            }
        }

        return super.isNotEmpty(attributeName, obj, parentObj, sqlMetaType, inOutModifier, inSqlSetOrInsert, values,
                features);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isTrue(String attributeName, Object obj, Object parentObj, SqlMetaType sqlMetaType,
            String inOutModifier, Map<String, String> values, Map<String, Object> features) {

        if (MODIFIER_ZERO.equalsIgnoreCase(inOutModifier)) {
            if (obj != null) {
                if (obj instanceof String) {
                    final String str = ((String) obj).trim();
                    return ("0".equals(str));
                }
            } else {
                throw new IllegalArgumentException("obj with sqlMetaTypeExt '" + MODIFIER_ZERO + "' should not be null");
            }
        }
        if (MODIFIER_NOTZERO.equalsIgnoreCase(inOutModifier)) {
            if (obj != null) {
                if (obj instanceof String) {
                    final String str = ((String) obj).trim();
                    return (!"0".equals(str));
                }
            } else {
                throw new IllegalArgumentException("obj with sqlMetaTypeExt '" + MODIFIER_ZERO + "' should not be null");
            }
        }

        return super.isTrue(attributeName, obj, parentObj, sqlMetaType, inOutModifier, values, features);
    }
}
