package org.sqlproc.dsl.ui.templates;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Types;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.sqlproc.dsl.processorDsl.DatabaseSqlType;
import org.sqlproc.dsl.resolver.DbColumn;
import org.sqlproc.dsl.resolver.DbExport;
import org.sqlproc.dsl.resolver.DbImport;

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

    private Map<String, PojoAttrType> definitions;
    private Map<String, Map<String, PojoAttribute>> pojos = new HashMap<String, Map<String, PojoAttribute>>();

    public TablePojoConverter() {
    }

    public TablePojoConverter(List<DatabaseSqlType> sqlTypes) {
        this.definitions = new HashMap<String, PojoAttrType>();
        if (sqlTypes != null) {
            for (DatabaseSqlType sqlType : sqlTypes) {
                PojoAttrType type = new PojoAttrType(sqlType);
                this.definitions.put(type.getName(), type);
            }
        }
    }

    public void addTableTefinition(String table, List<DbColumn> dbColumns, List<DbExport> dbExports,
            List<DbImport> dbImports) {
        if (table == null || dbColumns == null)
            return;
        Map<String, PojoAttribute> attributes = new LinkedHashMap<String, PojoAttribute>();
        for (DbColumn dbColumn : dbColumns) {
            PojoAttribute attribute = convertDbColumnDefinition(dbColumn);
            if (attribute != null) {
                attributes.put(dbColumn.getName(), attribute);
            } else {
                attribute = convertDbColumnDefault(dbColumn);
                if (attribute != null)
                    attributes.put(dbColumn.getName(), attribute);
            }
        }
        pojos.put(tableToCamelCase(table), attributes);
        for (DbImport dbImport : dbImports) {
            PojoAttribute attribute = attributes.get(dbImport.getFkColumn());
            attribute.setPkTable(tableToCamelCase(dbImport.getPkTable()));
        }
        for (DbExport dbExport : dbExports) {
            PojoAttribute attribute = attributes.get(dbExport.getPkColumn());
            attribute.getFkTables().add(tableToCamelCase(dbExport.getFkTable()));
        }
    }

    public void resolveReferencesOnKeys() {
        // refences or dependencies between pojos (1 : N)
        for (String pojo : pojos.keySet()) {
            Map<String, PojoAttribute> newAttributes = new HashMap<String, PojoAttribute>();
            for (PojoAttribute attribute : pojos.get(pojo).values()) {
                if (attribute.getPkTable() != null) {
                    // System.out.println("XXXXXXXXXX " + attribute.getName() + " " + attribute.getPkTable());
                    if (pojos.containsKey(attribute.getPkTable())) {
                        attribute.setDependencyClassName(attribute.getPkTable());
                    }
                }
                for (String fkTable : attribute.getFkTables()) {
                    // System.out.println("YYYYYYYYYY " + attribute.getName() + " " + attribute.getFkTables());
                    if (pojos.containsKey(fkTable)) {
                        String referName = fkTable.substring(0, 1).toLowerCase();
                        referName += fkTable.substring(1);
                        if (!referName.endsWith("s")) {
                            if (referName.endsWith("y")) {
                                referName = referName.substring(0, referName.length() - 1);
                                referName += "ies";
                            } else {
                                referName += "s";
                            }
                        }
                        PojoAttribute attrib = new PojoAttribute();
                        attrib.setName(referName);
                        attrib.setClassName("java.util.List <:" + fkTable + ">");
                        newAttributes.put(attrib.getName(), attrib);
                    }
                }
            }
            if (!newAttributes.isEmpty())
                pojos.get(pojo).putAll(newAttributes);
        }
    }

    public void resolveReferencesOnConvention() {
        // refences or dependencies between pojos (1 : N)
        for (String pojo : pojos.keySet()) {
            for (PojoAttribute attribute : pojos.get(pojo).values()) {
                if (attribute.getName().startsWith("id") && attribute.getName().length() > 2) {
                    String className = attribute.getName().substring(2);
                    if (pojo.equals(className))
                        continue;
                    Map<String, PojoAttribute> referPojoAttr = pojos.get(className);
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
                        referPojoAttr.put(attrib.getName(), attrib);
                    }
                }
            }
        }
    }

    public String getPojoDefinitions() {
        StringBuilder buffer = new StringBuilder();
        for (String pojo : pojos.keySet()) {
            buffer.append("\n  pojo ").append(pojo).append(" {");
            for (PojoAttribute attribute : pojos.get(pojo).values()) {
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
        PojoAttrType definition = definitions.get(dbColumn.getType());
        if (definition == null)
            return null;
        if (definition.getSize() != null) {
            if (dbColumn.getSize() != definition.getSize())
                return null;
        }
        PojoAttribute attribute = new PojoAttribute();
        attribute.setName(columnToCamelCase(dbColumn.getName()));
        attribute.setRequired(!dbColumn.isNullable());
        if (definition.getNativeType() != null) {
            attribute.setPrimitive(true);
            attribute.setClassName(definition.getNativeType().substring(1) + (definition.isArray() ? " []" : ""));
        } else {
            attribute.setPrimitive(false);
            attribute.setClassName(definition.getType().getIdentifier());
        }
        attribute.setDbName(dbColumn.getName());
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
        attribute.setDbName(dbColumn.getName());
        return attribute;
    }
}
