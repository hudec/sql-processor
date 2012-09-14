package org.sqlproc.dsl.ui.templates;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Types;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.property.ModelProperty;
import org.sqlproc.dsl.property.PojoAttrType;
import org.sqlproc.dsl.property.PojoAttribute;
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

    private String suffix;
    private Set<String> finalEntities;
    private Map<String, PojoAttrType> sqlTypes = new HashMap<String, PojoAttrType>();
    private Map<String, Map<String, PojoAttrType>> tableTypes = new HashMap<String, Map<String, PojoAttrType>>();
    private Map<String, Map<String, PojoAttrType>> columnTypes = new HashMap<String, Map<String, PojoAttrType>>();
    private Map<String, String> tableNames = new HashMap<String, String>();
    private Map<String, Map<String, String>> columnNames = new HashMap<String, Map<String, String>>();
    private Set<String> ignoreTables = new HashSet<String>();
    private Map<String, Set<String>> ignoreColumns = new HashMap<String, Set<String>>();
    private Map<String, Set<String>> requiredColumns = new HashMap<String, Set<String>>();
    private Map<String, Set<String>> notRequiredColumns = new HashMap<String, Set<String>>();
    private Map<String, Map<String, PojoAttrType>> createColumns = new HashMap<String, Map<String, PojoAttrType>>();
    private Map<String, Map<String, Map<String, String>>> ignoreExports = new HashMap<String, Map<String, Map<String, String>>>();
    private Map<String, Map<String, Map<String, String>>> ignoreImports = new HashMap<String, Map<String, Map<String, String>>>();
    private Map<String, Map<String, Map<String, String>>> createExports = new HashMap<String, Map<String, Map<String, String>>>();
    private Map<String, Map<String, Map<String, String>>> createImports = new HashMap<String, Map<String, Map<String, String>>>();
    private Map<String, Map<String, Map<String, String>>> inheritImports = new HashMap<String, Map<String, Map<String, String>>>();
    private Map<String, Map<String, Map<String, String>>> manyToManyExports = new HashMap<String, Map<String, Map<String, String>>>();
    private Map<String, Map<String, Map<String, List<String>>>> inheritance = new HashMap<String, Map<String, Map<String, List<String>>>>();

    private Map<String, Map<String, PojoAttribute>> pojos = new TreeMap<String, Map<String, PojoAttribute>>();
    private Map<String, String> pojoExtends = new HashMap<String, String>();
    private Set<String> pojoAbstracts = new HashSet<String>();
    private Map<String, String> pojoDiscriminators = new HashMap<String, String>();

    public TablePojoConverter() {
    }

    public TablePojoConverter(ModelProperty modelProperty, Artifacts artifacts, String suffix, Set<String> finalEntities) {

        this.suffix = (suffix != null) ? suffix : "";
        this.finalEntities = finalEntities;

        Map<String, PojoAttrType> sqlTypes = modelProperty.getSqlTypes(artifacts);
        if (sqlTypes != null) {
            for (PojoAttrType sqlType : sqlTypes.values()) {
                this.sqlTypes.put(sqlType.getName() + sqlType.getSize(), sqlType);
            }
        }
        Map<String, Map<String, PojoAttrType>> tableTypes = modelProperty.getTableTypes(artifacts);
        if (tableTypes != null) {
            for (Map.Entry<String, Map<String, PojoAttrType>> tableType : tableTypes.entrySet()) {
                String table = tableType.getKey(); // tableToCamelCase(tableType.getKey());
                if (!this.tableTypes.containsKey(table))
                    this.tableTypes.put(table, new HashMap<String, PojoAttrType>());
                for (PojoAttrType sqlType : tableType.getValue().values()) {
                    this.tableTypes.get(table).put(sqlType.getName() + sqlType.getSize(), sqlType);
                }
            }
        }
        Map<String, Map<String, PojoAttrType>> columnTypes = modelProperty.getColumnTypes(artifacts);
        if (columnTypes != null) {
            for (Map.Entry<String, Map<String, PojoAttrType>> columnType : columnTypes.entrySet()) {
                String table = columnType.getKey(); // tableToCamelCase(columnType.getKey());
                if (!this.columnTypes.containsKey(table))
                    this.columnTypes.put(table, new HashMap<String, PojoAttrType>());
                for (PojoAttrType sqlType : columnType.getValue().values()) {
                    this.columnTypes.get(table).put(sqlType.getName(), sqlType);
                }
            }
        }
        Map<String, String> tableNames = modelProperty.getTableNames(artifacts);
        if (tableNames != null) {
            this.tableNames.putAll(tableNames);
        }
        Map<String, Map<String, String>> columnNames = modelProperty.getColumnNames(artifacts);
        if (columnNames != null) {
            for (Map.Entry<String, Map<String, String>> columnName : columnNames.entrySet()) {
                String table = columnName.getKey(); // tableToCamelCase(columnName.getKey());
                if (!this.columnNames.containsKey(table))
                    this.columnNames.put(table, new HashMap<String, String>());
                this.columnNames.get(table).putAll(columnName.getValue());
            }
        }
        Set<String> ignoreTables = modelProperty.getIgnoreTables(artifacts);
        if (ignoreTables != null) {
            this.ignoreTables.addAll(ignoreTables);
        }
        Map<String, Set<String>> ignoreColumns = modelProperty.getIgnoreColumns(artifacts);
        if (ignoreColumns != null) {
            for (Map.Entry<String, Set<String>> ignoreColumn : ignoreColumns.entrySet()) {
                this.ignoreColumns.put(ignoreColumn.getKey(), new HashSet<String>());
                this.ignoreColumns.get(ignoreColumn.getKey()).addAll(ignoreColumn.getValue());
            }
        }
        Map<String, Set<String>> requiredColumns = modelProperty.getRequiredColumns(artifacts);
        if (requiredColumns != null) {
            for (Map.Entry<String, Set<String>> requiredColumn : requiredColumns.entrySet()) {
                this.requiredColumns.put(requiredColumn.getKey(), new HashSet<String>());
                this.requiredColumns.get(requiredColumn.getKey()).addAll(requiredColumn.getValue());
            }
        }
        Map<String, Set<String>> notRequiredColumns = modelProperty.getNotRequiredColumns(artifacts);
        if (notRequiredColumns != null) {
            for (Map.Entry<String, Set<String>> notRequiredColumn : notRequiredColumns.entrySet()) {
                this.notRequiredColumns.put(notRequiredColumn.getKey(), new HashSet<String>());
                this.notRequiredColumns.get(notRequiredColumn.getKey()).addAll(notRequiredColumn.getValue());
            }
        }
        Map<String, Map<String, PojoAttrType>> createColumns = modelProperty.getCreateColumns(artifacts);
        if (createColumns != null) {
            for (Map.Entry<String, Map<String, PojoAttrType>> columnType : createColumns.entrySet()) {
                String table = columnType.getKey(); // tableToCamelCase(columnType.getKey());
                if (!this.createColumns.containsKey(table))
                    this.createColumns.put(table, new HashMap<String, PojoAttrType>());
                for (PojoAttrType sqlType : columnType.getValue().values()) {
                    this.createColumns.get(table).put(sqlType.getName(), sqlType);
                }
            }
        }
        Map<String, Map<String, Map<String, String>>> ignoreExports = modelProperty.getIgnoreExports(artifacts);
        if (ignoreExports != null) {
            for (Map.Entry<String, Map<String, Map<String, String>>> ignoreExport : ignoreExports.entrySet()) {
                String table = ignoreExport.getKey(); // tableToCamelCase(columnName.getKey());
                if (!this.ignoreExports.containsKey(table))
                    this.ignoreExports.put(table, new HashMap<String, Map<String, String>>());
                this.ignoreExports.get(table).putAll(ignoreExport.getValue());
            }
        }
        Map<String, Map<String, Map<String, String>>> ignoreImports = modelProperty.getIgnoreImports(artifacts);
        if (ignoreImports != null) {
            for (Map.Entry<String, Map<String, Map<String, String>>> ignoreImport : ignoreImports.entrySet()) {
                String table = ignoreImport.getKey(); // tableToCamelCase(columnName.getKey());
                if (!this.ignoreImports.containsKey(table))
                    this.ignoreImports.put(table, new HashMap<String, Map<String, String>>());
                this.ignoreImports.get(table).putAll(ignoreImport.getValue());
            }
        }
        Map<String, Map<String, Map<String, String>>> createExports = modelProperty.getCreateExports(artifacts);
        if (createExports != null) {
            for (Map.Entry<String, Map<String, Map<String, String>>> createExport : createExports.entrySet()) {
                String table = createExport.getKey(); // tableToCamelCase(columnName.getKey());
                if (!this.createExports.containsKey(table))
                    this.createExports.put(table, new HashMap<String, Map<String, String>>());
                this.createExports.get(table).putAll(createExport.getValue());
            }
        }
        Map<String, Map<String, Map<String, String>>> createImports = modelProperty.getCreateImports(artifacts);
        if (createImports != null) {
            for (Map.Entry<String, Map<String, Map<String, String>>> createImport : createImports.entrySet()) {
                String table = createImport.getKey(); // tableToCamelCase(columnName.getKey());
                if (!this.createImports.containsKey(table))
                    this.createImports.put(table, new HashMap<String, Map<String, String>>());
                this.createImports.get(table).putAll(createImport.getValue());
            }
        }
        Map<String, Map<String, Map<String, String>>> inheritImports = modelProperty.getInheritImports(artifacts);
        if (inheritImports != null) {
            for (Map.Entry<String, Map<String, Map<String, String>>> inheritImport : inheritImports.entrySet()) {
                String table = inheritImport.getKey(); // tableToCamelCase(columnName.getKey());
                if (!this.inheritImports.containsKey(table))
                    this.inheritImports.put(table, new HashMap<String, Map<String, String>>());
                this.inheritImports.get(table).putAll(inheritImport.getValue());
            }
        }
        Map<String, Map<String, Map<String, String>>> manyToManyExports = modelProperty.getManyToManyExports(artifacts);
        if (manyToManyExports != null) {
            for (Map.Entry<String, Map<String, Map<String, String>>> manyToManyExport : manyToManyExports.entrySet()) {
                String table = manyToManyExport.getKey(); // tableToCamelCase(columnName.getKey());
                if (!this.manyToManyExports.containsKey(table))
                    this.manyToManyExports.put(table, new HashMap<String, Map<String, String>>());
                this.manyToManyExports.get(table).putAll(manyToManyExport.getValue());
            }
        }
        Map<String, Map<String, Map<String, List<String>>>> inheritance = modelProperty.getInheritance(artifacts);
        if (inheritance != null) {
            for (Map.Entry<String, Map<String, Map<String, List<String>>>> inheritance1 : inheritance.entrySet()) {
                String table = inheritance1.getKey(); // tableToCamelCase(columnName.getKey());
                if (!this.inheritance.containsKey(table))
                    this.inheritance.put(table, new HashMap<String, Map<String, List<String>>>());
                this.inheritance.get(table).putAll(inheritance1.getValue());
            }
        }

        for (Map.Entry<String, Map<String, Map<String, String>>> inheritImport : this.inheritImports.entrySet()) {
            for (Map.Entry<String, Map<String, String>> inherit : inheritImport.getValue().entrySet()) {
                for (Map.Entry<String, String> tabcol : inherit.getValue().entrySet()) {
                    if (!this.ignoreExports.containsKey(tabcol.getKey()))
                        this.ignoreExports.put(tabcol.getKey(), new HashMap<String, Map<String, String>>());
                    if (!this.ignoreExports.get(tabcol.getKey()).containsKey(tabcol.getValue()))
                        this.ignoreExports.get(tabcol.getKey()).put(tabcol.getValue(), new HashMap<String, String>());
                    this.ignoreExports.get(tabcol.getKey()).get(tabcol.getValue()).put(inheritImport.getKey(), null);
                    if (!this.ignoreColumns.containsKey(inheritImport.getKey()))
                        this.ignoreColumns.put(inheritImport.getKey(), new HashSet<String>());
                    this.ignoreColumns.get(inheritImport.getKey()).add(inherit.getKey());
                }
            }
        }

        for (Map.Entry<String, Map<String, Map<String, String>>> manyToManyExport : this.manyToManyExports.entrySet()) {
            String table = manyToManyExport.getKey(); // tableToCamelCase(columnName.getKey());
            if (!this.ignoreImports.containsKey(table))
                this.ignoreImports.put(table, null);
        }

        // System.out.println("sqlTypes " + this.sqlTypes);
        // System.out.println("tableTypes " + this.tableTypes);
        // System.out.println("columnTypes " + this.columnTypes);
        // System.out.println("tableNames " + this.tableNames);
        // System.out.println("columnNames " + this.columnNames);
        // System.out.println("ignoreTables " + this.ignoreTables);
        // System.out.println("ignoreColumns " + this.ignoreColumns);
        // System.out.println("createColumns " + this.createColumns);
        // System.out.println("ignoreExports " + this.ignoreExports);
        // System.out.println("ignoreImports " + this.ignoreImports);
        // System.out.println("createExports " + this.createExports);
        // System.out.println("createImports " + this.createImports);
        // System.out.println("inheritImports " + this.inheritImports);
        // System.out.println("manyToManyExports " + this.manyToManyExports);
        // System.out.println("inheritance " + this.inheritance);
    }

    public void addTableDefinition(String table, List<DbColumn> dbColumns, List<String> dbPrimaryKeys,
            List<DbExport> dbExports, List<DbImport> dbImports) {
        if (table == null || dbColumns == null)
            return;
        Map<String, PojoAttribute> attributes = new LinkedHashMap<String, PojoAttribute>();
        for (DbColumn dbColumn : dbColumns) {
            PojoAttribute attribute = convertDbColumnDefinition(table, dbColumn);
            if (attribute != null) {
                attributes.put(dbColumn.getName(), attribute);
            } else {
                attribute = convertDbColumnDefault(table, dbColumn);
                if (attribute != null)
                    attributes.put(dbColumn.getName(), attribute);
            }
            if (dbPrimaryKeys.contains(dbColumn.getName())) {
                attribute.setPrimaryKey(true);
            }

        }
        if (createColumns.containsKey(table)) {
            for (Map.Entry<String, PojoAttrType> createColumn : createColumns.get(table).entrySet()) {
                PojoAttribute attribute = convertDbColumnDefinition(createColumn.getKey(), createColumn.getValue());
                attributes.put(createColumn.getKey(), attribute);
            }
        }
        pojos.put(table, attributes);
        for (DbImport dbImport : dbImports) {
            if (ignoreImports.containsKey(table)
                    && (ignoreImports.get(table) == null || ignoreImports.get(table)
                            .containsKey(dbImport.getFkColumn())
                            && ignoreImports.get(table).get(dbImport.getFkColumn()).containsKey(dbImport.getPkTable())))
                continue;
            if (inheritImports.containsKey(table) && inheritImports.get(table).containsKey(dbImport.getFkColumn())
                    && inheritImports.get(table).get(dbImport.getFkColumn()).containsKey(dbImport.getPkTable())) {
                PojoAttribute attribute = attributes.get(dbImport.getFkColumn());
                attribute.setParentTable(dbImport.getPkTable());
            } else {
                PojoAttribute attribute = attributes.get(dbImport.getFkColumn());
                attribute.setPkTable(dbImport.getPkTable());
            }
        }
        if (createImports.containsKey(table)) {
            for (Map.Entry<String, Map<String, String>> pentry : createImports.get(table).entrySet()) {
                PojoAttribute attribute = attributes.get(pentry.getKey());
                for (String pkTable : pentry.getValue().keySet())
                    attribute.setPkTable(pkTable);
            }
        }
        for (DbExport dbExport : dbExports) {
            // AAA1 PERSON_LIBRARY MEDIA_ID MEDIA_ID MEDIA
            // AAA1 PERSON_LIBRARY PERSON_ID PERSON_ID PERSON
            // AAA3 PERSON PERSON ID PERSON_LIBRARY PERSON_ID
            // AAA3 MEDIA MEDIA ID PERSON_LIBRARY MEDIA_ID
            // pojogen table many-to-many PERSON_LIBRARY ID->MEDIA->LIBRARY;
            // System.out.println("AAA3 " + table + " " + dbExport.getPkTable() + " " + dbExport.getPkColumn() + " " +
            // dbExport.getFkTable() + " " + dbExport.getFkColumn());
            if (ignoreExports.containsKey(table) && ignoreExports.get(table).containsKey(dbExport.getPkColumn())
                    && ignoreExports.get(table).get(dbExport.getPkColumn()).containsKey(dbExport.getFkTable()))
                continue;
            if (manyToManyExports.containsKey(dbExport.getFkTable())) {
                if (manyToManyExports.get(dbExport.getFkTable()).containsKey(dbExport.getPkColumn())) {
                    for (Map.Entry<String, String> manyToMany : manyToManyExports.get(dbExport.getFkTable())
                            .get(dbExport.getPkColumn()).entrySet()) {
                        String fkTable = manyToMany.getKey();
                        String fkColumn = manyToMany.getValue();
                        if (!dbExport.getPkTable().equals(fkTable)) {
                            PojoAttribute attribute = attributes.get(dbExport.getPkColumn());
                            attribute.getFkTables().put(fkTable, fkColumn);
                        }
                    }
                }
            } else {
                PojoAttribute attribute = attributes.get(dbExport.getPkColumn());
                attribute.getFkTables().put(dbExport.getFkTable(), null);
            }
        }
        if (createExports.containsKey(table)) {
            for (Map.Entry<String, Map<String, String>> pentry : createExports.get(table).entrySet()) {
                PojoAttribute attribute = attributes.get(pentry.getKey());
                for (Map.Entry<String, String> fk : pentry.getValue().entrySet())
                    attribute.getFkTables().put(fk.getKey(), fk.getValue());
            }
        }
        if (inheritance.containsKey(table)) {
            // pojogen inherit discriminator BILLING_DETAILS BA->BANK_ACCOUNT->BA_ACCOUNT CC->CREDIT_CARD->CC_NUMBER;
            // pojogen rename columns BANK_ACCOUNT BA_ACCOUNT->ACCOUNT;
            // pojogen rename columns CREDIT_CARD CC_NUMBER->NUMBER;
            Map<String, PojoAttribute> allInheritedAttributes = new LinkedHashMap<String, PojoAttribute>();
            for (Map.Entry<String, Map<String, List<String>>> inheritance1 : inheritance.get(table).entrySet()) {
                String discriminator = inheritance1.getKey();
                Map<String, PojoAttribute> inheritedAttributes = new LinkedHashMap<String, PojoAttribute>();
                for (Map.Entry<String, List<String>> tabcols : inheritance1.getValue().entrySet()) {
                    String inheritedTable = tabcols.getKey();
                    for (String dbColumn : tabcols.getValue()) {
                        if (attributes.containsKey(dbColumn)) {
                            inheritedAttributes.put(dbColumn, attributes.get(dbColumn));
                        }
                    }
                    allInheritedAttributes.putAll(inheritedAttributes);
                    pojos.put(inheritedTable, inheritedAttributes);
                    pojoDiscriminators.put(inheritedTable, discriminator);
                    pojoExtends.put(inheritedTable, tableToCamelCase(table));
                    break;
                }
            }
            for (String dbColumn : allInheritedAttributes.keySet()) {
                attributes.remove(dbColumn);
            }
            pojoAbstracts.add(table);
        }
    }

    public void resolveReferencesOnKeys() {
        for (String pojo : pojos.keySet()) {
            Map<String, PojoAttribute> newAttributes = new HashMap<String, PojoAttribute>();
            for (PojoAttribute attribute : pojos.get(pojo).values()) {
                if (attribute.getPkTable() != null) {
                    if (pojos.containsKey(attribute.getPkTable())) {
                        attribute.setDependencyClassName(tableToCamelCase(attribute.getPkTable()));
                        if (attribute.getName().length() >= 3) {
                            if (attribute.getName().startsWith("id")) {
                                attribute.setName(lowerFirstChar(attribute.getName().substring(2)));
                            } else if (attribute.getName().endsWith("Id")) {
                                attribute.setName(attribute.getName().substring(0, attribute.getName().length() - 2));
                            }
                        }
                    }
                }
                if (attribute.getParentTable() != null) {
                    if (pojos.containsKey(attribute.getParentTable())) {
                        pojoExtends.put(pojo, tableToCamelCase(attribute.getParentTable()));
                        pojoAbstracts.add(attribute.getParentTable());
                    }
                }
                for (Map.Entry<String, String> fk : attribute.getFkTables().entrySet()) {
                    if (pojos.containsKey(fk.getKey())) {
                        String referName = null;
                        if (fk.getValue() != null)
                            referName = columnToCamelCase(fk.getValue());
                        else {
                            referName = lowerFirstChar(tableToCamelCase(fk.getKey()));
                            if (!referName.endsWith("s")) {
                                if (referName.endsWith("y")) {
                                    referName = referName.substring(0, referName.length() - 1);
                                    referName += "ies";
                                } else {
                                    referName += "s";
                                }
                            }
                        }
                        PojoAttribute attrib = new PojoAttribute();
                        attrib.setName(referName);
                        attrib.setClassName("java.util.List <:" + tableToCamelCase(fk.getKey()) + ">");
                        newAttributes.put(attrib.getName(), attrib);
                    }
                }
            }
            if (!newAttributes.isEmpty())
                pojos.get(pojo).putAll(newAttributes);
        }
    }

    private String lowerFirstChar(String s) {
        if (s == null)
            return null;
        String ss = s.substring(0, 1).toLowerCase();
        if (s.length() == 1)
            return ss;
        ss += s.substring(1);
        return ss;
    }

    public void resolveReferencesOnConvention() {
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
            if (ignoreTables.contains(pojo))
                continue;
            if (finalEntities.contains(tableToCamelCase(pojo)))
                continue;
            String pojoName = tableNames.get(pojo);
            if (pojoName == null)
                pojoName = pojo;
            buffer.append("\n  pojo ");
            if (pojoAbstracts.contains(pojo))
                buffer.append("abstract ");
            buffer.append(tableToCamelCase(pojoName));
            if (pojoExtends.containsKey(pojo))
                buffer.append(" extends ").append(pojoExtends.get(pojo));
            if (pojoDiscriminators.containsKey(pojo))
                buffer.append(" discriminator ").append(pojoDiscriminators.get(pojo));
            buffer.append(" {");
            for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
                if (ignoreColumns.containsKey(pojo) && ignoreColumns.get(pojo).contains(pentry.getKey()))
                    continue;
                PojoAttribute attribute = pentry.getValue();
                String name = (columnNames.containsKey(pojo)) ? columnNames.get(pojo).get(pentry.getKey()) : null;
                if (name == null)
                    name = attribute.getName();
                else
                    name = columnToCamelCase(name);
                buffer.append("\n    ").append(name).append(' ');
                if (attribute.getDependencyClassName() != null) {
                    buffer.append(":: ").append(attribute.getDependencyClassName());
                } else if (attribute.isPrimitive()) {
                    buffer.append('_').append(attribute.getClassName());
                } else {
                    buffer.append(": ").append(attribute.getClassName());
                }
                if ((requiredColumns.containsKey(pojo) && requiredColumns.get(pojo).contains(pentry.getKey()))
                        || (attribute.isRequired() && !attribute.isPrimaryKey())) {
                    if (!notRequiredColumns.containsKey(pojo)
                            || !notRequiredColumns.get(pojo).contains(pentry.getKey()))
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
        return camelCaseString + suffix;
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

    private PojoAttribute convertDbColumnDefinition(String dbName, PojoAttrType sqlType) {
        PojoAttribute attribute = new PojoAttribute();
        attribute.setName(columnToCamelCase(dbName));
        if (sqlType.getNativeType() != null) {
            attribute.setPrimitive(true);
            attribute.setClassName(sqlType.getNativeType().substring(1) + (sqlType.isArray() ? " []" : ""));
        } else if (sqlType.getRef() != null) {
            attribute.setPrimitive(false);
            attribute.setDependencyClassName(sqlType.getRef().getName());
        } else {
            attribute.setPrimitive(false);
            attribute.setClassName(sqlType.getType().getIdentifier());
        }
        return attribute;
    }

    private PojoAttribute convertDbColumnDefinition(String table, DbColumn dbColumn) {
        if (dbColumn == null)
            return null;
        PojoAttrType sqlType = columnTypes.containsKey(table) ? columnTypes.get(table).get(dbColumn.getName()) : null;
        if (sqlType == null)
            sqlType = tableTypes.containsKey(table) ? tableTypes.get(table)
                    .get(dbColumn.getType() + dbColumn.getSize()) : null;
        if (sqlType == null)
            sqlType = sqlTypes.get(dbColumn.getType() + dbColumn.getSize());
        if (sqlType == null)
            return null;
        PojoAttribute attribute = new PojoAttribute();
        attribute.setName(columnToCamelCase(dbColumn.getName()));
        attribute.setRequired(!dbColumn.isNullable());
        if (sqlType.getRef() != null) {
            attribute.setPrimitive(false);
            attribute.setDependencyClassName(sqlType.getRef().getName());
            // System.out.println("222 " + table + " " + dbColumn.getName() + " " + attribute.getDependencyClassName());
        } else if (sqlType.getNativeType() != null) {
            attribute.setPrimitive(true);
            attribute.setClassName(sqlType.getNativeType().substring(1) + (sqlType.isArray() ? " []" : ""));
            // System.out.println("333 " + table + " " + dbColumn.getName() + " " + attribute.getClassName());
        } else {
            attribute.setPrimitive(false);
            attribute.setClassName(sqlType.getType().getIdentifier());
            // System.out.println("444 " + table + " " + dbColumn.getName() + " " + attribute.getClassName());
        }
        return attribute;
    }

    private PojoAttribute convertDbColumnDefault(String table, DbColumn dbColumn) {
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
        // System.out.println("555 " + table + " " + dbColumn.getName() + " " + attribute.getClassName());
        return attribute;
    }
}
