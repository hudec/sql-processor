package org.sqlproc.dsl.ui.templates;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;
import org.sqlproc.dsl.processorDsl.TableDefinition;
import org.sqlproc.dsl.property.ModelProperty;
import org.sqlproc.dsl.property.ModelPropertyBean.PairValues;
import org.sqlproc.dsl.property.PojoAttribute;

public class TableMetaConverter extends TablePojoConverter {

    protected Artifacts artifacts;
    protected IScopeProvider scopeProvider;

    protected PairValues globalSequence;
    protected Map<String, PairValues> tablesSequence = new HashMap<String, PairValues>();
    protected PairValues globalIdentity;
    protected Map<String, PairValues> tablesIdentity = new HashMap<String, PairValues>();
    protected Map<String, Map<String, PairValues>> columnsMetaTypes = new HashMap<String, Map<String, PairValues>>();
    protected Map<String, Map<String, PairValues>> statementsMetaTypes = new HashMap<String, Map<String, PairValues>>();

    enum StatementType {
        INSERT, GET, UPDATE, DELETE, SELECT
    }

    public TableMetaConverter() {
        super();
    }

    public TableMetaConverter(ModelProperty modelProperty, Artifacts artifacts, IScopeProvider scopeProvider) {
        super(modelProperty, artifacts, null, Collections.<String> emptySet());
        this.scopeProvider = scopeProvider;
        this.artifacts = artifacts;

        this.globalSequence = modelProperty.getGlobalSequence(artifacts);
        Map<String, PairValues> tablesSequence = modelProperty.getTablesSequence(artifacts);
        if (tablesSequence != null) {
            this.tablesSequence.putAll(tablesSequence);
        }
        this.globalIdentity = modelProperty.getGlobalIdentity(artifacts);
        Map<String, PairValues> tablesIdentity = modelProperty.getTablesIdentity(artifacts);
        if (tablesIdentity != null) {
            this.tablesIdentity.putAll(tablesIdentity);
        }
        Map<String, Map<String, PairValues>> columnsMetaTypes = modelProperty.getColumnsMetaTypes(artifacts);
        if (columnsMetaTypes != null) {
            this.columnsMetaTypes.putAll(columnsMetaTypes);
        }
        Map<String, Map<String, PairValues>> statementsMetaTypes = modelProperty.getStatementsMetaTypes(artifacts);
        if (statementsMetaTypes != null) {
            this.statementsMetaTypes.putAll(statementsMetaTypes);
        }
    }

    public String getMetaDefinitions() {
        StringBuilder buffer = new StringBuilder();
        for (String pojo : pojos.keySet()) {
            if (!onlyTables.isEmpty() && !onlyTables.contains(pojo))
                continue;
            if (ignoreTables.contains(pojo))
                continue;
            if (pojoInheritanceDiscriminator.contains(pojo))
                continue;
            buffer.append(metaInsertDefinition(pojo));
            buffer.append(metaGetDefinition(pojo));
            buffer.append(metaUpdateDefinition(pojo));
            buffer.append(metaDeleteDefinition(pojo));
        }
        return buffer.toString();
    }

    StringBuilder metaInsertDefinition(String pojo) {
        StringBuilder buffer = new StringBuilder();
        Header header = getStatementHeader(pojo, buffer, StatementType.INSERT, null);
        buffer.append("\n  insert into %%").append(header.table.realTableName);
        buffer.append(" (");
        String parentPojo = pojoDiscriminators.containsKey(header.table.tableName) ? pojoExtends
                .get(header.table.tableName) : null;
        boolean first = insertColumns(buffer, pojo, true);
        if (parentPojo != null)
            insertColumns(buffer, parentPojo, first);
        buffer.append(")\n  {= values (");
        first = insertIdentity(buffer, pojo, true);
        if (parentPojo != null)
            first = insertIdentity(buffer, parentPojo, first);
        first = pojoColumns(buffer, pojo, first, header.statementName);
        if (parentPojo != null)
            pojoColumns(buffer, parentPojo, first, header.statementName);
        buffer.append(") }");
        buffer.append("\n;\n");
        return buffer;
    }

    StringBuilder metaGetDefinition(String pojo) {
        StringBuilder buffer = new StringBuilder();
        Header header = getStatementHeader(pojo, buffer, StatementType.GET, null);
        buffer.append("\n  select ");
        String parentPojo = pojoDiscriminators.containsKey(header.table.tableName) ? pojoExtends
                .get(header.table.tableName) : null;
        boolean first = selectColumns(buffer, pojo, true, header.statementName, header.table.tablePrefix, null, false);
        if (parentPojo != null)
            first = selectColumns(buffer, parentPojo, first, header.statementName, header.table.tablePrefix, null,
                    false);
        if (header.table.tablePrefix != null) {
            if (header.extendTable.tableName != null) {
                if (!first)
                    buffer.append("\n         ");
                first = selectColumns(buffer, header.extendTable.tableName, first, header.statementName,
                        header.extendTable.tablePrefix, null, true);
            }
            if (!header.pkTables.isEmpty()) {
                for (Table table : header.pkTables.values()) {
                    if (!first)
                        buffer.append("\n         ");
                    first = selectColumns(buffer, table.tableName, first, header.statementName, table.tablePrefix,
                            table.attrName, true);
                }
            }
        }
        buffer.append("\n  from %%").append(header.table.realTableName);

        if (header.table.tablePrefix != null) {
            buffer.append(" ").append(header.table.tablePrefix);
            if (header.extendTable.tableName != null) {
                buffer.append("\n  join %%").append(header.extendTable.tableName);
                buffer.append(" ").append(header.extendTable.tablePrefix);
                buffer.append(" on %").append(header.table.tablePrefix).append(".");
                buffer.append(header.extendTable.primaryKey);
                buffer.append(" = %").append(header.extendTable.tablePrefix).append(".");
                buffer.append(header.extendTable.tableKey);
            }
            if (!header.pkTables.isEmpty()) {
                for (Table table : header.pkTables.values()) {
                    buffer.append("\n  left join %%").append(table.tableName);
                    buffer.append(" ").append(table.tablePrefix);
                    buffer.append(" on %").append(table.oppositePrefix).append(".");
                    buffer.append(table.primaryKey);
                    buffer.append(" = %").append(table.tablePrefix).append(".");
                    buffer.append(table.tableKey);
                }
            }
        }
        buffer.append("\n  {= where");
        first = whereColumns(buffer, pojo, first, header.statementName, header.table.tablePrefix, false);
        if (parentPojo != null)
            whereColumns(buffer, parentPojo, first, header.statementName, header.table.tablePrefix, false);
        else if (header.extendTable.tableName != null)
            whereColumns(buffer, header.extendTable.tableName, first, header.statementName,
                    header.extendTable.tablePrefix, true);
        buffer.append("\n  }");
        buffer.append("\n;\n");
        return buffer;
    }

    StringBuilder metaUpdateDefinition(String pojo) {
        StringBuilder buffer = new StringBuilder();
        Header header = getStatementHeader(pojo, buffer, StatementType.UPDATE, null);
        buffer.append("\n  update %%").append(header.table.realTableName);
        buffer.append("\n  {= set");
        String parentPojo = pojoDiscriminators.containsKey(header.table.tableName) ? pojoExtends
                .get(header.table.tableName) : null;
        boolean first = updateColumns(buffer, pojo, true, header.statementName);
        if (parentPojo != null)
            updateColumns(buffer, parentPojo, first, header.statementName);
        buffer.append("\n  }\n  {= where");
        first = wherePrimaryKeys(buffer, pojo, first, header.statementName);
        if (parentPojo != null)
            wherePrimaryKeys(buffer, parentPojo, first, header.statementName);
        buffer.append("\n  }");
        buffer.append("\n;\n");
        return buffer;
    }

    StringBuilder metaDeleteDefinition(String pojo) {
        StringBuilder buffer = new StringBuilder();
        Header header = getStatementHeader(pojo, buffer, StatementType.DELETE, null);
        buffer.append("\n  delete from %%").append(header.table.realTableName);
        buffer.append("\n  {= where");
        String parentPojo = pojoDiscriminators.containsKey(header.table.tableName) ? pojoExtends
                .get(header.table.tableName) : null;
        boolean first = wherePrimaryKeys(buffer, pojo, true, header.statementName);
        if (parentPojo != null)
            wherePrimaryKeys(buffer, parentPojo, first, header.statementName);
        buffer.append("\n  }");
        buffer.append("\n;\n");
        return buffer;
    }

    boolean insertColumns(StringBuilder buffer, String pojo, boolean first) {
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            if (createColumns.containsKey(pojo) && createColumns.get(pojo).containsKey(pentry.getKey()))
                continue;
            if (ignoreColumns.containsKey(pojo) && ignoreColumns.get(pojo).contains(pentry.getKey())) {
                boolean ignore = true;
                if (inheritImports.containsKey(pojo) && inheritImports.get(pojo).containsKey(pentry.getKey())) {
                    ignore = false;
                }
                if (ignore)
                    continue;
            }
            PairValues identity = getIdentity(pojo, pentry.getValue());
            if (identity != null)
                continue;
            PojoAttribute attribute = pentry.getValue();
            if (attribute.getClassName().startsWith(COLLECTION_LIST))
                continue;
            if (!first)
                buffer.append(", %");
            else
                buffer.append("%");
            buffer.append(pentry.getKey());
            first = false;
        }
        return first;
    }

    boolean insertIdentity(StringBuilder buffer, String pojo, boolean first) {
        PairValues identity = null;
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            if (createColumns.containsKey(pojo) && createColumns.get(pojo).containsKey(pentry.getKey()))
                continue;
            identity = getIdentity(pojo, pentry.getValue());
            if (identity != null) {
                String name = (columnNames.containsKey(pojo)) ? columnNames.get(pojo).get(pentry.getKey()) : null;
                if (name == null)
                    name = pentry.getValue().getName();
                else
                    name = columnToCamelCase(name);
                buffer.append(":");
                buffer.append(name);
                buffer.append("^");
                if (identity.value2 != null)
                    buffer.append(identity.value2);
                buffer.append("^idsel=").append(identity.value1);
                first = false;
                break;
            }
        }
        return first;
    }

    boolean pojoColumns(StringBuilder buffer, String pojo, boolean first, String statementName) {
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            Attribute attr = getStatementAttribute(pojo, pentry, true);
            if (attr == null)
                continue;
            String name = (columnNames.containsKey(attr.tableName)) ? columnNames.get(attr.tableName).get(
                    attr.attributeName) : null;
            if (name == null)
                name = attr.attribute.getName();
            else
                name = columnToCamelCase(name);
            if (!first)
                buffer.append(", :");
            else
                buffer.append(":");
            buffer.append(name);
            if (attr.sequence != null) {
                buffer.append("^");
                if (attr.sequence.value2 != null)
                    buffer.append(attr.sequence.value2);
                buffer.append("^seq=").append(attr.sequence.value1);
            }
            if (attr.attribute.getPkTable() != null) {
                buffer.append(".").append(columnToCamelCase(attr.attribute.getPkColumn()));
            }
            metaTypes(buffer, attr.tableName, attr.attributeName, statementName);
            first = false;
        }
        return first;
    }

    boolean selectColumns(StringBuilder buffer, String pojo, boolean first, String statementName, String tablePrefix,
            String pojoPrefix, boolean notPrimaryKeys) {
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            Attribute attr = getStatementAttribute(pojo, pentry, false);
            if (attr == null)
                continue;
            if (attr.attribute.isPrimaryKey() && notPrimaryKeys)
                continue;
            String name = (columnNames.containsKey(attr.tableName)) ? columnNames.get(attr.tableName).get(
                    attr.attributeName) : null;
            if (name == null)
                name = attr.attribute.getName();
            else
                name = columnToCamelCase(name);
            if (!first)
                buffer.append(", %");
            else
                buffer.append("%");
            if (tablePrefix != null)
                buffer.append(tablePrefix).append(".");
            buffer.append(pentry.getKey());
            buffer.append(" @");
            if (pojoPrefix != null)
                buffer.append(pojoPrefix).append(".");
            buffer.append(name);
            if (attr.attribute.getPkTable() != null) {
                buffer.append(".").append(columnToCamelCase(attr.attribute.getPkColumn()));
            }
            metaTypes(buffer, attr.tableName, attr.attributeName, statementName);
            first = false;
        }
        return first;
    }

    boolean whereColumns(StringBuilder buffer, String pojo, boolean first, String statementName, String prefix,
            boolean notPrimaryKeys) {
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            Attribute attr = getStatementAttribute(pojo, pentry, false);
            if (attr == null)
                continue;
            if (attr.attribute.isPrimaryKey() && notPrimaryKeys)
                continue;
            String name = (columnNames.containsKey(attr.tableName)) ? columnNames.get(attr.tableName).get(
                    attr.attributeName) : null;
            if (name == null)
                name = attr.attribute.getName();
            else
                name = columnToCamelCase(name);
            buffer.append("\n    {& %");
            if (prefix != null)
                buffer.append(prefix).append(".");
            buffer.append(pentry.getKey());
            buffer.append(" = :").append(name);
            if (attr.attribute.getPkTable() != null) {
                buffer.append(".").append(columnToCamelCase(attr.attribute.getPkColumn()));
            }
            metaTypes(buffer, attr.tableName, attr.attributeName, statementName);
            buffer.append(" }");
            first = false;
        }
        return first;
    }

    boolean wherePrimaryKeys(StringBuilder buffer, String pojo, boolean first, String statementName) {
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            Attribute attr = getStatementAttribute(pojo, pentry, false);
            if (attr == null)
                continue;
            if (!attr.attribute.isPrimaryKey())
                continue;
            String name = (columnNames.containsKey(attr.tableName)) ? columnNames.get(attr.tableName).get(
                    attr.attributeName) : null;
            if (name == null)
                name = attr.attribute.getName();
            else
                name = columnToCamelCase(name);
            buffer.append("\n    {& %").append(pentry.getKey());
            buffer.append(" = :").append(name);
            if (attr.attribute.getPkTable() != null) {
                buffer.append(".").append(columnToCamelCase(attr.attribute.getPkColumn()));
            }
            if (!metaTypes(buffer, attr.tableName, attr.attributeName, statementName)) {
                buffer.append("^^notnull");
            }
            buffer.append(" }");
            first = false;
        }
        return first;
    }

    boolean updateColumns(StringBuilder buffer, String pojo, boolean first, String statementName) {
        boolean isDef = false;
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            if (pentry.getValue().isDef()) {
                isDef = true;
                break;
            }
        }
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            Attribute attr = getStatementAttribute(pojo, pentry, false);
            if (attr == null)
                continue;
            if (attr.attribute.isPrimaryKey())
                continue;
            String name = (columnNames.containsKey(attr.tableName)) ? columnNames.get(attr.tableName).get(
                    attr.attributeName) : null;
            if (name == null)
                name = attr.attribute.getName();
            else
                name = columnToCamelCase(name);
            buffer.append("\n    { ,%").append(pentry.getKey());
            buffer.append(" = :").append(name);
            if (attr.attribute.getPkTable() != null) {
                buffer.append(".").append(columnToCamelCase(attr.attribute.getPkColumn()));
            }
            boolean hasMetaType = metaTypes(buffer, attr.tableName, attr.attributeName, statementName);
            if (isDef) {
                if (!hasMetaType)
                    buffer.append("^");
                buffer.append("^call=isDef");
            }
            buffer.append(" }");
            first = false;
        }
        return first;
    }

    boolean metaTypes(StringBuilder buffer, String tableName, String attributeName, String statementName) {
        if (columnsMetaTypes.containsKey(tableName) && columnsMetaTypes.get(tableName).containsKey(attributeName)) {
            PairValues metaType = columnsMetaTypes.get(tableName).get(attributeName);
            buffer.append("^");
            if (!"null".equalsIgnoreCase(metaType.value1))
                buffer.append(metaType.value1);
            if (metaType.value2 != null) {
                buffer.append("^").append(metaType.value2);
            }
            return true;
        } else if (statementsMetaTypes.containsKey(statementName)
                && statementsMetaTypes.get(statementName).containsKey(attributeName)) {
            PairValues metaType = statementsMetaTypes.get(statementName).get(attributeName);
            buffer.append("^");
            if (!"null".equalsIgnoreCase(metaType.value1))
                buffer.append(metaType.value1);
            if (metaType.value2 != null) {
                buffer.append("^").append(metaType.value2);
            }
            return true;
        }
        return false;
    }

    class Table {

        String tableName;
        String realTableName;
        String tablePrefix;
        String primaryKey;
        String tableKey;
        String attrName;
        String oppositePrefix;

        void setNames(String pojo) {
            tableName = tableNames.get(pojo);
            if (tableName == null)
                tableName = pojo;
            realTableName = pojo;
        }

        String getTableName() {
            TableDefinition tableDefinition = getTableDefinition((realTableName != null) ? realTableName : tableName);
            if (tableDefinition != null)
                return tableDefinition.getName();
            else
                return tableName;
        }
    }

    class Header {
        Table table = new Table();
        Table extendTable = new Table();
        String statementName;
        Map<String, Table> pkTables = new HashMap<String, Table>();
    }

    Header getStatementHeader(String pojo, StringBuilder buffer, StatementType type, String suffix) {
        Header header = new Header();
        Set<String> prefixes = new HashSet<String>();
        header.table.setNames(pojo);
        if (pojoDiscriminators.containsKey(header.table.tableName))
            header.table.realTableName = pojoExtends.get(header.table.tableName);
        else if (pojoExtends.containsKey(header.table.realTableName)
                && pojoInheritanceSimple.contains(pojoExtends.get(header.table.realTableName))) {
            header.extendTable.setNames(pojoExtends.get(header.table.realTableName));
            header.table.tablePrefix = newPrefix(prefixes, header.table);
            header.extendTable.tablePrefix = newPrefix(prefixes, header.extendTable);

            outerloop: for (Entry<String, Map<String, String>> e1 : inheritImports.get(header.table.realTableName)
                    .entrySet()) {
                for (Entry<String, String> e2 : e1.getValue().entrySet()) {
                    if (e2.getKey().equals(header.extendTable.tableName)) {
                        header.extendTable.primaryKey = e1.getKey();
                        header.extendTable.tableKey = e2.getValue();
                    }
                    break outerloop;
                }
            }
        }
        if (type == StatementType.GET || type == StatementType.SELECT) {
            for (Map.Entry<String, PojoAttribute> pentry : pojos.get(header.table.realTableName).entrySet()) {
                PojoAttribute attr = pentry.getValue();
                if (attr.getPkTable() != null) {
                    if (header.table.tablePrefix == null)
                        header.table.tablePrefix = newPrefix(prefixes, header.table);
                    Table table = new Table();
                    table.setNames(attr.getPkTable());
                    table.primaryKey = pentry.getKey();
                    table.tableKey = attr.getPkColumn();
                    table.tablePrefix = newPrefix(prefixes, table);
                    table.attrName = attr.getName();
                    table.oppositePrefix = header.table.tablePrefix;
                    header.pkTables.put(pentry.getKey(), table);
                }
            }
            if (header.extendTable.tableName != null) {
                for (Map.Entry<String, PojoAttribute> pentry : pojos.get(header.extendTable.realTableName).entrySet()) {
                    PojoAttribute attr = pentry.getValue();
                    if (attr.getPkTable() != null) {
                        if (header.extendTable.tablePrefix == null)
                            header.extendTable.tablePrefix = newPrefix(prefixes, header.extendTable);
                        Table table = new Table();
                        table.setNames(attr.getPkTable());
                        table.primaryKey = pentry.getKey();
                        table.tableKey = attr.getPkColumn();
                        table.tablePrefix = newPrefix(prefixes, table);
                        table.attrName = attr.getName();
                        table.oppositePrefix = header.extendTable.tablePrefix;
                        header.pkTables.put(pentry.getKey(), table);
                    }
                }
            }
        }
        if (type == StatementType.INSERT)
            header.statementName = "INSERT_";
        else if (type == StatementType.GET)
            header.statementName = "GET_";
        else if (type == StatementType.UPDATE)
            header.statementName = "UPDATE_";
        else if (type == StatementType.DELETE)
            header.statementName = "DELETE_";
        else if (type == StatementType.SELECT)
            header.statementName = "SELECT_";
        header.statementName = header.statementName + header.table.tableName;
        if (suffix != null) {
            header.statementName = header.statementName + "_" + suffix;
        }
        buffer.append("\n").append(header.statementName).append("(CRUD,");
        buffer.append("identx=").append(tableToCamelCase(header.table.tableName));
        buffer.append(",colx=").append(tableToCamelCase(header.table.tableName));
        buffer.append(",dbcol=");
        buffer.append(header.table.getTableName());

        if (header.table.tablePrefix != null && (type == StatementType.GET || type == StatementType.SELECT)) {
            buffer.append("=").append(header.table.tablePrefix);
            if (header.extendTable.tableName != null) {
                buffer.append(",dbcol=");
                buffer.append(header.extendTable.getTableName());
                buffer.append("=").append(header.extendTable.tablePrefix);
            }
            if (!header.pkTables.isEmpty()) {
                for (Table table : header.pkTables.values()) {
                    buffer.append(",dbcol=");
                    buffer.append(table.getTableName());
                    buffer.append("=").append(table.tablePrefix);
                }
            }
        }
        buffer.append(")=");
        return header;
    }

    String newPrefix(Set<String> prefixes, Table table) {
        String pp = table.realTableName.substring(0, 1).toLowerCase();
        String p = pp;
        for (int i = 0; i < 1000; i++) {
            if (i > 0)
                p = pp + i;
            if (!prefixes.contains(p)) {
                prefixes.add(p);
                return p;
            }
        }
        return pp;
    }

    static class Attribute {
        String tableName;
        String attributeName;
        PojoAttribute attribute;
        PairValues sequence;
    }

    Attribute getStatementAttribute(String pojo, Map.Entry<String, PojoAttribute> pentry, boolean checkIdentity) {
        Attribute attr = new Attribute();
        if (createColumns.containsKey(pojo) && createColumns.get(pojo).containsKey(pentry.getKey()))
            return null;
        if (checkIdentity) {
            if (getIdentity(pojo, pentry.getValue()) != null)
                return null;
            attr.sequence = getSequence(pojo, pentry.getValue());
        }
        attr.tableName = null;
        attr.attributeName = null;
        attr.attribute = null;
        if (ignoreColumns.containsKey(pojo) && ignoreColumns.get(pojo).contains(pentry.getKey())) {
            boolean ignore = true;
            if (inheritImports.containsKey(pojo) && inheritImports.get(pojo).containsKey(pentry.getKey())) {
                ignore = false;
                for (Map.Entry<String, String> pentry2 : inheritImports.get(pojo).get(pentry.getKey()).entrySet()) {
                    attr.tableName = pentry2.getKey();
                    attr.attributeName = pentry2.getValue();
                    attr.attribute = pojos.get(attr.tableName).get(attr.attributeName);
                    break;
                }
            }
            if (ignore)
                return null;
        }
        if (attr.tableName == null)
            attr.tableName = pojo;
        if (attr.attributeName == null)
            attr.attributeName = pentry.getKey();
        if (attr.attribute == null)
            attr.attribute = pentry.getValue();
        if (attr.attribute.getClassName().startsWith(COLLECTION_LIST))
            return null;
        return attr;
    }

    PairValues getIdentity(String pojo, PojoAttribute attribute) {
        if (attribute.isPrimaryKey()) {
            if (tablesIdentity.containsKey(pojo))
                return tablesIdentity.get(pojo);
            else if (globalIdentity != null)
                return globalIdentity;
        }
        return null;
    }

    PairValues getSequence(String pojo, PojoAttribute attribute) {
        if (attribute.isPrimaryKey()) {
            if (tablesSequence.containsKey(pojo))
                return tablesSequence.get(pojo);
            else if (globalSequence != null)
                return globalSequence;
        }
        return null;
    }

    TableDefinition getTableDefinition(String tableName) {
        IScope scope = scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__TABLES);
        Iterable<IEObjectDescription> iterable = scope.getAllElements();
        for (Iterator<IEObjectDescription> iter = iterable.iterator(); iter.hasNext();) {
            IEObjectDescription description = iter.next();
            if (ProcessorDslPackage.Literals.TABLE_DEFINITION.getName().equals(description.getEClass().getName())) {
                TableDefinition tableDefinition = (TableDefinition) artifacts.eResource().getResourceSet()
                        .getEObject(description.getEObjectURI(), true);
                if (tableName.equals(tableDefinition.getTable())) {
                    return tableDefinition;
                }
            }
        }
        return null;
    }
}
