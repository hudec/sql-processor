package org.sqlproc.dsl.ui.templates;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

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
            buffer.append(metaDeleteMoreDefinition(pojo));
        }
        return buffer.toString();
    }

    StringBuilder metaInsertDefinition(String pojo) {
        StringBuilder buffer = new StringBuilder();
        Header header = getStatementHeader(pojo, buffer, Header.StatementType.INSERT, null);
        buffer.append("\n  insert into %%").append(header.realTableName);
        buffer.append(" (");
        String parentPojo = pojoDiscriminators.containsKey(header.tableName) ? pojoExtends.get(header.tableName) : null;
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
        Header header = getStatementHeader(pojo, buffer, Header.StatementType.GET, null);
        buffer.append("\n  select ");
        String parentPojo = pojoDiscriminators.containsKey(header.tableName) ? pojoExtends.get(header.tableName) : null;
        boolean first = selectColumns(buffer, pojo, true, header.statementName, header.realTableNamePrefix, false);
        if (parentPojo != null)
            selectColumns(buffer, parentPojo, first, header.statementName, null, false);
        else if (header.extendedTableName != null)
            selectColumns(buffer, header.extendedTableName, first, header.statementName,
                    header.extendedTableNamePrefix, true);
        buffer.append("\n  from %%").append(header.realTableName);
        if (header.realTableNamePrefix != null) {
            buffer.append(" ").append(header.realTableNamePrefix);
            if (header.extendedTableName != null) {

                buffer.append(" join %%").append(header.extendedTableName);
                buffer.append(" ").append(header.extendedTableNamePrefix);
                buffer.append(" on %").append(header.realTableNamePrefix).append(".");
                buffer.append(header.tableKey);
                buffer.append(" = %").append(header.extendedTableNamePrefix).append(".");
                buffer.append(header.extendedTableKey);
            }
        }
        buffer.append("\n  {= where");
        first = whereColumns(buffer, pojo, first, header.statementName, header.realTableNamePrefix, false);
        if (parentPojo != null)
            whereColumns(buffer, parentPojo, first, header.statementName, null, false);
        else if (header.extendedTableName != null)
            whereColumns(buffer, header.extendedTableName, first, header.statementName, header.extendedTableNamePrefix,
                    true);
        buffer.append("\n  }");
        buffer.append("\n;\n");
        return buffer;
    }

    StringBuilder metaUpdateDefinition(String pojo) {
        StringBuilder buffer = new StringBuilder();
        Header header = getStatementHeader(pojo, buffer, Header.StatementType.UPDATE, null);
        buffer.append("\n  update %%").append(header.realTableName);
        buffer.append("\n  {= set");
        String parentPojo = pojoDiscriminators.containsKey(header.tableName) ? pojoExtends.get(header.tableName) : null;
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
        Header header = getStatementHeader(pojo, buffer, Header.StatementType.DELETE, null);
        buffer.append("\n  delete from %%").append(header.realTableName);
        buffer.append("\n  {= where");
        String parentPojo = pojoDiscriminators.containsKey(header.tableName) ? pojoExtends.get(header.tableName) : null;
        boolean first = wherePrimaryKeys(buffer, pojo, true, header.statementName);
        if (parentPojo != null)
            wherePrimaryKeys(buffer, parentPojo, first, header.statementName);
        buffer.append("\n  }");
        buffer.append("\n;\n");
        return buffer;
    }

    StringBuilder metaDeleteMoreDefinition(String pojo) {
        StringBuilder buffer = new StringBuilder();
        Header header = getStatementHeader(pojo, buffer, Header.StatementType.DELETE, "MORE");
        buffer.append("\n  delete from %%").append(header.realTableName);
        buffer.append("\n  {= where");
        String parentPojo = pojoDiscriminators.containsKey(header.tableName) ? pojoExtends.get(header.tableName) : null;
        boolean first = whereColumns(buffer, pojo, true, header.statementName, null, false);
        if (parentPojo != null)
            whereColumns(buffer, parentPojo, first, header.statementName, null, false);
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

    boolean selectColumns(StringBuilder buffer, String pojo, boolean first, String statementName, String prefix,
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
            if (!first)
                buffer.append(", %");
            else
                buffer.append("%");
            if (prefix != null)
                buffer.append(prefix).append(".");
            buffer.append(pentry.getKey());
            buffer.append(" @").append(name);
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
            buffer.append(" }");
            metaTypes(buffer, attr.tableName, attr.attributeName, statementName);
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

    static class Header {
        enum StatementType {
            INSERT, GET, UPDATE, DELETE, SELECT
        }

        String tableName;
        String realTableName;
        String extendedTableName;
        String realTableNamePrefix;
        String extendedTableNamePrefix;
        String tableKey;
        String extendedTableKey;
        String statementName;
    }

    Header getStatementHeader(String pojo, StringBuilder buffer, Header.StatementType type, String suffix) {
        Header header = new Header();
        header.tableName = tableNames.get(pojo);
        if (header.tableName == null)
            header.tableName = pojo;
        header.realTableName = pojo;
        if (pojoDiscriminators.containsKey(header.tableName))
            header.realTableName = pojoExtends.get(header.tableName);
        else if (pojoExtends.containsKey(header.tableName)
                && pojoInheritanceSimple.contains(pojoExtends.get(header.tableName))) {
            header.extendedTableName = pojoExtends.get(header.tableName);
            header.realTableNamePrefix = header.realTableName.substring(0, 1).toLowerCase();
            header.extendedTableNamePrefix = header.extendedTableName.substring(0, 1).toLowerCase();
            if (header.realTableNamePrefix.equals(header.extendedTableNamePrefix)) {
                header.extendedTableNamePrefix = header.extendedTableNamePrefix + "2";
            }
            outerloop: for (Entry<String, Map<String, String>> e1 : inheritImports.get(header.realTableName).entrySet()) {
                for (Entry<String, String> e2 : e1.getValue().entrySet()) {
                    if (e2.getKey().equals(header.extendedTableName)) {
                        header.tableKey = e1.getKey();
                        header.extendedTableKey = e2.getValue();
                    }
                    break outerloop;
                }
            }
        }
        if (type == Header.StatementType.INSERT)
            header.statementName = "INSERT_";
        else if (type == Header.StatementType.GET)
            header.statementName = "GET_";
        else if (type == Header.StatementType.UPDATE)
            header.statementName = "UPDATE_";
        else if (type == Header.StatementType.DELETE)
            header.statementName = "DELETE_";
        else if (type == Header.StatementType.SELECT)
            header.statementName = "SELECT_";
        header.statementName = header.statementName + header.tableName;
        if (suffix != null) {
            header.statementName = header.statementName + "_" + suffix;
        }
        buffer.append("\n").append(header.statementName).append("(CRUD,");
        buffer.append("identx=").append(tableToCamelCase(header.tableName));
        buffer.append(",colx=").append(tableToCamelCase(header.tableName));
        buffer.append(",dbcol=");
        TableDefinition tableDefinition = getTableDefinition(header.realTableName);
        if (tableDefinition != null)
            buffer.append(tableDefinition.getName());
        else
            buffer.append(header.tableName);
        if (header.extendedTableName != null && type == Header.StatementType.GET) {
            buffer.append("=").append(header.realTableNamePrefix);
            buffer.append(",dbcol=");
            TableDefinition tableDefinitionExtended = getTableDefinition(header.extendedTableName);
            if (tableDefinitionExtended != null)
                buffer.append(tableDefinitionExtended.getName());
            else
                buffer.append(header.extendedTableName);
            buffer.append("=").append(header.extendedTableNamePrefix);
        }
        buffer.append(")=");
        return header;
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
