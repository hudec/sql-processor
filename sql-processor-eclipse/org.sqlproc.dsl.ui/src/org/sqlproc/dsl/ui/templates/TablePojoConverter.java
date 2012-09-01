package org.sqlproc.dsl.ui.templates;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.sqlproc.dsl.processorDsl.TypeDefinition;
import org.sqlproc.dsl.resolver.DbColumn;

public class TablePojoConverter {

    public enum PrimitiveType {
        BOOLEAN, BYTE, SHORT, INT, LONG, FLOAT, DOUBLE, CHAR, BYTE_ARRAY, CHAR_ARRAY;

        public String getName() {
            if (this == BYTE_ARRAY)
                return "byte []";
            if (this == CHAR_ARRAY)
                return "char []";
            return name().toLowerCase();
        }
    }

    private Map<String, TypeDefinition> definitions;
    private Map<String, List<PojoAttribute>> pojos = new HashMap<String, List<PojoAttribute>>();

    public TablePojoConverter() {
    }

    public TablePojoConverter(List<TypeDefinition> definitions) {
        this.definitions = new HashMap<String, TypeDefinition>();
        if (definitions != null) {
            for (TypeDefinition definition : definitions) {
                this.definitions.put(definition.getName(), definition);
            }
        }
    }

    public void addTableTefinition(String table, List<DbColumn> dbColumns) {
        if (table == null || dbColumns == null)
            return;
        List<PojoAttribute> attributes = new ArrayList<PojoAttribute>();
        for (DbColumn dbColumn : dbColumns) {
            PojoAttribute attribute = convertDbColumnDefinition(dbColumn);
            if (attribute != null) {
                attributes.add(attribute);
            } else {
                attribute = convertDbColumnDefault(dbColumn);
                if (attribute != null)
                    attributes.add(attribute);
            }
        }
        pojos.put(tableToCamelCase(table), attributes);
    }

    public void postProcessing() {
        // refences or dependencies between pojos (1 : N)
        for (String pojo : pojos.keySet()) {
            List<PojoAttribute> attributes = pojos.get(pojo);
            if (attributes != null) {
                for (PojoAttribute attribute : attributes) {
                    if (attribute.getName().startsWith("id") && attribute.getName().length() > 2) {
                        String className = attribute.getName().substring(2);
                        if (pojo.equals(className))
                            continue;
                        List<PojoAttribute> referPojoAttr = pojos.get(className);
                        if (referPojoAttr != null) {
                            String name = className.substring(0, 1).toLowerCase();
                            if (className.length() > 1)
                                name += className.substring(1);
                            attribute.setName(name);
                            attribute.setPrimitive(false);
                            attribute.setDependencyClassName(className);
                            // reverse dependency
                            String referName = pojo.substring(0, 1).toLowerCase();
                            if (className.length() > 1)
                                referName += pojo.substring(1);
                            PojoAttribute attrib = new PojoAttribute();
                            attrib.setName(referName + "s");
                            attrib.setClassName("java.util.List <:" + pojo + ">");
                            referPojoAttr.add(attrib);
                        }
                    }
                }
            }
        }
    }

    public String getPojoDefinitions() {
        StringBuilder buffer = new StringBuilder();
        for (String pojo : pojos.keySet()) {
            buffer.append("\n  pojo ").append(pojo).append(" {");
            List<PojoAttribute> attributes = pojos.get(pojo);
            if (attributes != null) {
                for (PojoAttribute attribute : attributes) {
                    buffer.append("\n    ").append(attribute.getName()).append(' ');
                    if (attribute.isPrimitive()) {
                        buffer.append('_').append(attribute.getClassName());
                    } else if (attribute.getDependencyClassName() != null) {
                        buffer.append(":: ").append(attribute.getDependencyClassName());
                    } else {
                        buffer.append(": ").append(attribute.getClassName());
                    }
                    if (attribute.isRequired()) {
                        buffer.append(" required");
                    }
                }
            }
            buffer.append("\n  }\n");
        }
        return buffer.toString();
    }

    private String tableToCamelCase(String value) {
        if (value == null)
            return null;
        String[] parts = value.split("_");
        String camelCaseString = "";
        for (String part : parts) {
            if (camelCaseString.length() == 0)
                if (part.length() > 1)
                    camelCaseString = camelCaseString + part.substring(0, 1).toUpperCase()
                            + part.substring(1).toLowerCase();
                else
                    camelCaseString = camelCaseString + part.toUpperCase();
            else if (part.length() == 1)
                camelCaseString = camelCaseString + part.toUpperCase();
            else if (part.length() > 1)
                camelCaseString = camelCaseString + part.substring(0, 1).toUpperCase()
                        + part.substring(1).toLowerCase();
        }
        return camelCaseString;
    }

    private String columnToCamelCase(String value) {
        if (value == null)
            return null;
        String[] parts = value.split("_");
        String camelCaseString = "";
        for (String part : parts) {
            if (camelCaseString.length() == 0)
                camelCaseString = camelCaseString + part.toLowerCase();
            else if (part.length() == 1)
                camelCaseString = camelCaseString + part.toUpperCase();
            else if (part.length() > 1)
                camelCaseString = camelCaseString + part.substring(0, 1).toUpperCase()
                        + part.substring(1).toLowerCase();
        }
        return camelCaseString;
    }

    private PojoAttribute convertDbColumnDefinition(DbColumn dbColumn) {
        if (dbColumn == null)
            return null;
        TypeDefinition definition = definitions.get(dbColumn.getType());
        if (definition == null)
            return null;
        PojoAttribute attribute = new PojoAttribute();
        attribute.setName(columnToCamelCase(dbColumn.getName()));
        attribute.setRequired(!dbColumn.isNullable());
        if (definition.getNative() != null) {
            attribute.setPrimitive(true);
            attribute.setClassName(definition.getNative().substring(1) + (definition.isArray() ? " []" : ""));
        } else {
            attribute.setPrimitive(false);
            attribute.setClassName(definition.getType().getIdentifier());
        }
        return attribute;
    }

    private PojoAttribute convertDbColumnDefault(DbColumn dbColumn) {
        if (dbColumn == null)
            return null;
        PojoAttribute attribute = new PojoAttribute();
        attribute.setName(columnToCamelCase(dbColumn.getName()));
        attribute.setRequired(!dbColumn.isNullable());
        switch (dbColumn.getSqlType()) {
        case Types.BIT:
        case Types.BOOLEAN:
            if (!dbColumn.isNullable()) {
                attribute.setPrimitive(true);
                attribute.setClassName(PrimitiveType.BOOLEAN.getName());
            } else {
                attribute.setPrimitive(false);
                attribute.setClassName(Boolean.class.getName());
            }
            break;
        case Types.TINYINT:
            if (!dbColumn.isNullable()) {
                attribute.setPrimitive(true);
                attribute.setClassName(PrimitiveType.BYTE.getName());
            } else {
                attribute.setPrimitive(false);
                attribute.setClassName(Byte.class.getName());
            }
            break;
        case Types.SMALLINT:
            if (!dbColumn.isNullable()) {
                attribute.setPrimitive(true);
                attribute.setClassName(PrimitiveType.SHORT.getName());
            } else {
                attribute.setPrimitive(false);
                attribute.setClassName(Short.class.getName());
            }
            break;
        case Types.INTEGER:
            if (!dbColumn.isNullable()) {
                attribute.setPrimitive(true);
                attribute.setClassName(PrimitiveType.INT.getName());
            } else {
                attribute.setPrimitive(false);
                attribute.setClassName(Integer.class.getName());
            }
            break;
        case Types.BIGINT:
            if (!dbColumn.isNullable()) {
                attribute.setPrimitive(true);
                attribute.setClassName(PrimitiveType.LONG.getName());
            } else {
                attribute.setPrimitive(false);
                attribute.setClassName(Long.class.getName());
            }
            break;
        case Types.FLOAT:
        case Types.REAL:
            if (!dbColumn.isNullable()) {
                attribute.setPrimitive(true);
                attribute.setClassName(PrimitiveType.FLOAT.getName());
            } else {
                attribute.setPrimitive(false);
                attribute.setClassName(Float.class.getName());
            }
            break;
        case Types.DOUBLE:
            if (!dbColumn.isNullable()) {
                attribute.setPrimitive(true);
                attribute.setClassName(PrimitiveType.DOUBLE.getName());
            } else {
                attribute.setPrimitive(false);
                attribute.setClassName(Double.class.getName());
            }
            break;
        case Types.NUMERIC:
            attribute.setPrimitive(false);
            attribute.setClassName(BigDecimal.class.getName());
            break;
        case Types.DECIMAL:
            attribute.setPrimitive(false);
            if (dbColumn.getSize() < 3)
                attribute.setClassName(Byte.class.getName());
            else if (dbColumn.getSize() < 5)
                attribute.setClassName(Short.class.getName());
            else if (dbColumn.getSize() < 10)
                attribute.setClassName(Integer.class.getName());
            else if (dbColumn.getSize() < 20)
                attribute.setClassName(Long.class.getName());
            else
                attribute.setClassName(BigInteger.class.getName());
            break;
        case Types.CHAR:
        case Types.NCHAR:
            if (!dbColumn.isNullable() && dbColumn.getSize() == 1) {
                attribute.setPrimitive(true);
                attribute.setClassName(PrimitiveType.CHAR.getName());
            } else {
                attribute.setPrimitive(false);
                attribute.setClassName(String.class.getName());
            }
            break;
        case Types.VARCHAR:
        case Types.LONGNVARCHAR:
        case Types.NVARCHAR:
            attribute.setPrimitive(false);
            attribute.setClassName(String.class.getName());
            break;
        case Types.DATE:
            // java.util.Date or java.sql.Date ?
            attribute.setPrimitive(false);
            attribute.setClassName(java.util.Date.class.getName());
            break;
        case Types.TIME:
            attribute.setPrimitive(false);
            attribute.setClassName(java.sql.Time.class.getName());
            break;
        case Types.TIMESTAMP:
            // java.util.Date or java.sql.Timestamp ?
            attribute.setPrimitive(false);
            attribute.setClassName(java.sql.Timestamp.class.getName());
            break;
        case Types.BINARY:
        case Types.VARBINARY:
        case Types.LONGVARBINARY:
        case Types.BLOB:
            attribute.setPrimitive(true);
            attribute.setClassName(PrimitiveType.BYTE_ARRAY.getName());
            break;
        case Types.CLOB:
            attribute.setPrimitive(false);
            attribute.setClassName(String.class.getName());
            break;
        default:
            // todo what type?
            attribute.setPrimitive(false);
            if (dbColumn.getType().indexOf("TIMESTAMP") == 0 || dbColumn.getType().indexOf("timestamp") == 0)
                attribute.setClassName(java.sql.Timestamp.class.getName());
            else
                attribute.setClassName("java.lang.Object");
        }
        return attribute;
    }
}
