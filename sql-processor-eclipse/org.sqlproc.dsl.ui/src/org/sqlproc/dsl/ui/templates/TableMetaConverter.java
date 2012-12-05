package org.sqlproc.dsl.ui.templates;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
            buffer.append(getMetaInsertDefinition(pojo));
            buffer.append(getMetaGetDefinition(pojo));
            buffer.append(getMetaUpdateDefinition(pojo));
        }
        return buffer.toString();
    }

    StringBuilder getMetaInsertDefinition(String pojo) {
        StringBuilder buffer = new StringBuilder();
        Names names = getStatementHeader(pojo, buffer, Names.StatementType.INSERT);
        buffer.append("\n  insert into %%").append(names.realTableName);
        buffer.append(" (");
        String parentPojo = pojoDiscriminators.containsKey(names.tableName) ? pojoExtends.get(names.tableName) : null;
        boolean first = insertColumns(buffer, pojo, true);
        if (parentPojo != null)
            insertColumns(buffer, parentPojo, first);
        buffer.append(")\n  {= values (");
        first = insertIdentity(buffer, pojo, true);
        if (parentPojo != null)
            first = insertIdentity(buffer, parentPojo, first);
        first = pojoColumns(buffer, pojo, first, names.statementName);
        if (parentPojo != null)
            pojoColumns(buffer, parentPojo, first, names.statementName);
        buffer.append(") }");
        buffer.append("\n;\n");
        return buffer;
    }

    StringBuilder getMetaGetDefinition(String pojo) {
        StringBuilder buffer = new StringBuilder();
        Names names = getStatementHeader(pojo, buffer, Names.StatementType.GET);
        buffer.append("\n  select ");
        String parentPojo = pojoDiscriminators.containsKey(names.tableName) ? pojoExtends.get(names.tableName) : null;
        boolean first = selectColumns(buffer, pojo, true, names.statementName);
        if (parentPojo != null)
            selectColumns(buffer, parentPojo, first, names.statementName);
        buffer.append("\n  from %%").append(names.realTableName);
        buffer.append("\n  {= where");
        first = whereColumns(buffer, pojo, first, names.statementName);
        if (parentPojo != null)
            whereColumns(buffer, parentPojo, first, names.statementName);
        buffer.append("\n  }");
        buffer.append("\n;\n");
        return buffer;
    }

    StringBuilder getMetaUpdateDefinition(String pojo) {
        StringBuilder buffer = new StringBuilder();
        Names names = getStatementHeader(pojo, buffer, Names.StatementType.UPDATE);
        buffer.append("\n  update %%").append(names.realTableName);
        buffer.append("\n  {= set\n    ");
        String parentPojo = pojoDiscriminators.containsKey(names.tableName) ? pojoExtends.get(names.tableName) : null;
        boolean first = updateColumns(buffer, pojo, true, names.statementName);
        if (parentPojo != null)
            updateColumns(buffer, parentPojo, first, names.statementName);
        buffer.append("\n  }\n  {= where");
        first = whereColumns(buffer, pojo, first, names.statementName);
        if (parentPojo != null)
            whereColumns(buffer, parentPojo, first, names.statementName);
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
            if (createColumns.containsKey(pojo) && createColumns.get(pojo).containsKey(pentry.getKey()))
                continue;
            if (getIdentity(pojo, pentry.getValue()) != null)
                continue;
            PairValues sequence = getSequence(pojo, pentry.getValue());
            String tableName = null;
            String attributeName = null;
            PojoAttribute attribute = null;
            if (ignoreColumns.containsKey(pojo) && ignoreColumns.get(pojo).contains(pentry.getKey())) {
                boolean ignore = true;
                if (inheritImports.containsKey(pojo) && inheritImports.get(pojo).containsKey(pentry.getKey())) {
                    ignore = false;
                    for (Map.Entry<String, String> pentry2 : inheritImports.get(pojo).get(pentry.getKey()).entrySet()) {
                        tableName = pentry2.getKey();
                        attributeName = pentry2.getValue();
                        attribute = pojos.get(tableName).get(attributeName);
                        break;
                    }
                }
                if (ignore)
                    continue;
            }
            if (tableName == null)
                tableName = pojo;
            if (attributeName == null)
                attributeName = pentry.getKey();
            if (attribute == null)
                attribute = pentry.getValue();
            if (attribute.getClassName().startsWith(COLLECTION_LIST))
                continue;
            String name = (columnNames.containsKey(tableName)) ? columnNames.get(tableName).get(attributeName) : null;
            if (name == null)
                name = attribute.getName();
            else
                name = columnToCamelCase(name);
            if (!first)
                buffer.append(", :");
            else
                buffer.append(":");
            buffer.append(name);
            if (sequence != null) {
                buffer.append("^");
                if (sequence.value2 != null)
                    buffer.append(sequence.value2);
                buffer.append("^seq=").append(sequence.value1);
            }
            if (attribute.getPkTable() != null) {
                buffer.append(".").append(columnToCamelCase(attribute.getPkColumn()));
            }
            if (columnsMetaTypes.containsKey(tableName) && columnsMetaTypes.get(tableName).containsKey(attributeName)) {
                PairValues metaType = columnsMetaTypes.get(tableName).get(attributeName);
                buffer.append("^");
                if (!"null".equalsIgnoreCase(metaType.value1))
                    buffer.append(metaType.value1);
                if (metaType.value2 != null) {
                    buffer.append("^").append(metaType.value2);
                }
            } else if (statementsMetaTypes.containsKey(statementName)
                    && statementsMetaTypes.get(statementName).containsKey(attributeName)) {
                PairValues metaType = statementsMetaTypes.get(statementName).get(attributeName);
                buffer.append("^");
                if (!"null".equalsIgnoreCase(metaType.value1))
                    buffer.append(metaType.value1);
                if (metaType.value2 != null) {
                    buffer.append("^").append(metaType.value2);
                }
            }
            first = false;
        }
        return first;
    }

    boolean selectColumns(StringBuilder buffer, String pojo, boolean first, String statementName) {
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            if (createColumns.containsKey(pojo) && createColumns.get(pojo).containsKey(pentry.getKey()))
                continue;
            String tableName = null;
            String attributeName = null;
            PojoAttribute attribute = null;
            if (ignoreColumns.containsKey(pojo) && ignoreColumns.get(pojo).contains(pentry.getKey())) {
                boolean ignore = true;
                if (inheritImports.containsKey(pojo) && inheritImports.get(pojo).containsKey(pentry.getKey())) {
                    ignore = false;
                    for (Map.Entry<String, String> pentry2 : inheritImports.get(pojo).get(pentry.getKey()).entrySet()) {
                        tableName = pentry2.getKey();
                        attributeName = pentry2.getValue();
                        attribute = pojos.get(tableName).get(attributeName);
                        break;
                    }
                }
                if (ignore)
                    continue;
            }
            if (tableName == null)
                tableName = pojo;
            if (attributeName == null)
                attributeName = pentry.getKey();
            if (attribute == null)
                attribute = pentry.getValue();
            if (attribute.getClassName().startsWith(COLLECTION_LIST))
                continue;
            String name = (columnNames.containsKey(tableName)) ? columnNames.get(tableName).get(attributeName) : null;
            if (name == null)
                name = attribute.getName();
            else
                name = columnToCamelCase(name);
            if (!first)
                buffer.append(", %");
            else
                buffer.append("%");
            buffer.append(pentry.getKey());
            buffer.append(" @").append(name);
            if (attribute.getPkTable() != null) {
                buffer.append(".").append(columnToCamelCase(attribute.getPkColumn()));
            }
            if (columnsMetaTypes.containsKey(tableName) && columnsMetaTypes.get(tableName).containsKey(attributeName)) {
                PairValues metaType = columnsMetaTypes.get(tableName).get(attributeName);
                buffer.append("^");
                if (!"null".equalsIgnoreCase(metaType.value1))
                    buffer.append(metaType.value1);
                if (metaType.value2 != null) {
                    buffer.append("^").append(metaType.value2);
                }
            } else if (statementsMetaTypes.containsKey(statementName)
                    && statementsMetaTypes.get(statementName).containsKey(attributeName)) {
                PairValues metaType = statementsMetaTypes.get(statementName).get(attributeName);
                buffer.append("^");
                if (!"null".equalsIgnoreCase(metaType.value1))
                    buffer.append(metaType.value1);
                if (metaType.value2 != null) {
                    buffer.append("^").append(metaType.value2);
                }
            }
            first = false;
        }
        return first;
    }

    boolean whereColumns(StringBuilder buffer, String pojo, boolean first, String statementName) {
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            if (createColumns.containsKey(pojo) && createColumns.get(pojo).containsKey(pentry.getKey()))
                continue;
            String tableName = null;
            String attributeName = null;
            PojoAttribute attribute = null;
            if (ignoreColumns.containsKey(pojo) && ignoreColumns.get(pojo).contains(pentry.getKey())) {
                boolean ignore = true;
                if (inheritImports.containsKey(pojo) && inheritImports.get(pojo).containsKey(pentry.getKey())) {
                    ignore = false;
                    for (Map.Entry<String, String> pentry2 : inheritImports.get(pojo).get(pentry.getKey()).entrySet()) {
                        tableName = pentry2.getKey();
                        attributeName = pentry2.getValue();
                        attribute = pojos.get(tableName).get(attributeName);
                        break;
                    }
                }
                if (ignore)
                    continue;
            }
            if (tableName == null)
                tableName = pojo;
            if (attributeName == null)
                attributeName = pentry.getKey();
            if (attribute == null)
                attribute = pentry.getValue();
            if (attribute.getClassName().startsWith(COLLECTION_LIST))
                continue;
            String name = (columnNames.containsKey(tableName)) ? columnNames.get(tableName).get(attributeName) : null;
            if (name == null)
                name = attribute.getName();
            else
                name = columnToCamelCase(name);
            buffer.append("\n    {& %").append(pentry.getKey());
            buffer.append(" = :").append(name);
            if (attribute.getPkTable() != null) {
                buffer.append(".").append(columnToCamelCase(attribute.getPkColumn()));
            }
            if (columnsMetaTypes.containsKey(tableName) && columnsMetaTypes.get(tableName).containsKey(attributeName)) {
                PairValues metaType = columnsMetaTypes.get(tableName).get(attributeName);
                buffer.append("^");
                if (!"null".equalsIgnoreCase(metaType.value1))
                    buffer.append(metaType.value1);
                if (metaType.value2 != null) {
                    buffer.append("^").append(metaType.value2);
                }
            } else if (statementsMetaTypes.containsKey(statementName)
                    && statementsMetaTypes.get(statementName).containsKey(attributeName)) {
                PairValues metaType = statementsMetaTypes.get(statementName).get(attributeName);
                buffer.append("^");
                if (!"null".equalsIgnoreCase(metaType.value1))
                    buffer.append(metaType.value1);
                if (metaType.value2 != null) {
                    buffer.append("^").append(metaType.value2);
                }
            }
            buffer.append(" }");
            first = false;
        }
        return first;
    }

    boolean updateColumns(StringBuilder buffer, String pojo, boolean first, String statementName) {
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            if (createColumns.containsKey(pojo) && createColumns.get(pojo).containsKey(pentry.getKey()))
                continue;
            String tableName = null;
            String attributeName = null;
            PojoAttribute attribute = null;
            if (ignoreColumns.containsKey(pojo) && ignoreColumns.get(pojo).contains(pentry.getKey())) {
                boolean ignore = true;
                if (inheritImports.containsKey(pojo) && inheritImports.get(pojo).containsKey(pentry.getKey())) {
                    ignore = false;
                    for (Map.Entry<String, String> pentry2 : inheritImports.get(pojo).get(pentry.getKey()).entrySet()) {
                        tableName = pentry2.getKey();
                        attributeName = pentry2.getValue();
                        attribute = pojos.get(tableName).get(attributeName);
                        break;
                    }
                }
                if (ignore)
                    continue;
            }
            if (tableName == null)
                tableName = pojo;
            if (attributeName == null)
                attributeName = pentry.getKey();
            if (attribute == null)
                attribute = pentry.getValue();
            if (attribute.getClassName().startsWith(COLLECTION_LIST))
                continue;
            if (attribute.isPrimaryKey())
                continue;
            String name = (columnNames.containsKey(tableName)) ? columnNames.get(tableName).get(attributeName) : null;
            if (name == null)
                name = attribute.getName();
            else
                name = columnToCamelCase(name);
            if (!first)
                buffer.append(", %");
            else
                buffer.append("%");
            buffer.append(pentry.getKey());
            buffer.append(" = :").append(name);
            if (attribute.getPkTable() != null) {
                buffer.append(".").append(columnToCamelCase(attribute.getPkColumn()));
            }
            if (columnsMetaTypes.containsKey(tableName) && columnsMetaTypes.get(tableName).containsKey(attributeName)) {
                PairValues metaType = columnsMetaTypes.get(tableName).get(attributeName);
                buffer.append("^");
                if (!"null".equalsIgnoreCase(metaType.value1))
                    buffer.append(metaType.value1);
                if (metaType.value2 != null) {
                    buffer.append("^").append(metaType.value2);
                }
            } else if (statementsMetaTypes.containsKey(statementName)
                    && statementsMetaTypes.get(statementName).containsKey(attributeName)) {
                PairValues metaType = statementsMetaTypes.get(statementName).get(attributeName);
                buffer.append("^");
                if (!"null".equalsIgnoreCase(metaType.value1))
                    buffer.append(metaType.value1);
                if (metaType.value2 != null) {
                    buffer.append("^").append(metaType.value2);
                }
            }
            first = false;
        }
        return first;
    }

    // StringBuilder getMetaSelectDefinition(String pojo) {
    // StringBuilder buffer = new StringBuilder();
    // String tableName = tableNames.get(pojo);
    // if (tableName == null)
    // tableName = pojo;
    // buffer.append("\n");
    // buffer.append("SELECT_").append(tableName).append("(QRY,");
    // buffer.append("identx=").append(tableToCamelCase(tableName));
    // buffer.append(",colx=").append(tableToCamelCase(tableName));
    // buffer.append(",dbcol=");
    // TableDefinition tableDefinition = getTableDefinition(tableName);
    // if (tableDefinition != null)
    // buffer.append(tableDefinition.getName());
    // else
    // buffer.append(tableName);
    // buffer.append(")=");
    // buffer.append("\n;\n");
    // return buffer;
    // }

    static class Names {
        enum StatementType {
            INSERT, GET, UPDATE, DELETE, SELECT
        }

        String tableName;
        String realTableName;
        String statementName;
    }

    Names getStatementHeader(String pojo, StringBuilder buffer, Names.StatementType type) {
        Names names = new Names();
        names.tableName = tableNames.get(pojo);
        if (names.tableName == null)
            names.tableName = pojo;
        names.realTableName = pojo;
        if (pojoDiscriminators.containsKey(names.tableName))
            names.realTableName = pojoExtends.get(names.tableName);
        if (type == Names.StatementType.INSERT)
            names.statementName = "INSERT_";
        else if (type == Names.StatementType.GET)
            names.statementName = "GET_";
        else if (type == Names.StatementType.UPDATE)
            names.statementName = "UPDATE_";
        else if (type == Names.StatementType.DELETE)
            names.statementName = "DELETE_";
        else if (type == Names.StatementType.SELECT)
            names.statementName = "SELECT_";
        names.statementName = names.statementName + names.tableName;
        buffer.append("\n").append(names.statementName).append("(CRUD,");
        buffer.append("identx=").append(tableToCamelCase(names.tableName));
        buffer.append(",colx=").append(tableToCamelCase(names.tableName));
        buffer.append(",dbcol=");
        TableDefinition tableDefinition = getTableDefinition(names.realTableName);
        if (tableDefinition != null)
            buffer.append(tableDefinition.getName());
        else
            buffer.append(names.tableName);
        buffer.append(")=");
        return names;
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
