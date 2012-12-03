package org.sqlproc.dsl.ui.templates;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;
import org.sqlproc.dsl.processorDsl.TableDefinition;
import org.sqlproc.dsl.property.ModelProperty;
import org.sqlproc.dsl.property.PojoAttribute;

public class TableMetaConverter extends TablePojoConverter {

    protected Artifacts artifacts;
    protected IScopeProvider scopeProvider;

    public TableMetaConverter() {
        super();
    }

    public TableMetaConverter(ModelProperty modelProperty, Artifacts artifacts, IScopeProvider scopeProvider) {
        super(modelProperty, artifacts, null, Collections.<String> emptySet());
        this.scopeProvider = scopeProvider;
        this.artifacts = artifacts;
    }

    public String getMetaDefinitions() {
        StringBuilder buffer = new StringBuilder();
        for (String pojo : pojos.keySet()) {
            if (!onlyTables.isEmpty() && !onlyTables.contains(pojo))
                continue;
            if (ignoreTables.contains(pojo))
                continue;
            if (pojoAbstracts.contains(pojo))
                continue;
            buffer.append(getMetaInsertDefinition(pojo));
        }
        return buffer.toString();
    }

    public StringBuilder getMetaSelectDefinition(String pojo) {
        StringBuilder buffer = new StringBuilder();
        String tableName = tableNames.get(pojo);
        if (tableName == null)
            tableName = pojo;
        buffer.append("\n");
        buffer.append("SELECT_").append(tableName).append("(QRY,");
        buffer.append("identx=").append(tableToCamelCase(tableName));
        buffer.append(",colx=").append(tableToCamelCase(tableName));
        buffer.append(",dbcol=");
        TableDefinition tableDefinition = getTableDefinition(tableName);
        if (tableDefinition != null)
            buffer.append(tableDefinition.getName());
        else
            buffer.append(tableName);
        buffer.append(")=");
        buffer.append("\n;\n");
        return buffer;
    }

    public StringBuilder getMetaInsertDefinition(String pojo) {
        StringBuilder buffer = new StringBuilder();
        String tableName = tableNames.get(pojo);
        if (tableName == null)
            tableName = pojo;
        String realTableName = tableName;
        if (pojoDiscriminators.containsKey(tableName))
            realTableName = pojoExtends.get(tableName);
        buffer.append("\nINSERT_").append(tableName).append("(CRUD,");
        buffer.append("identx=").append(tableToCamelCase(tableName));
        buffer.append(",colx=").append(tableToCamelCase(tableName));
        buffer.append(",dbcol=");
        TableDefinition tableDefinition = getTableDefinition(realTableName);
        if (tableDefinition != null)
            buffer.append(tableDefinition.getName());
        else
            buffer.append(tableName);
        buffer.append(")=");
        buffer.append("\n  insert into %%").append(realTableName);
        buffer.append("\n    (");
        String parentPojo = pojoDiscriminators.containsKey(tableName) ? pojoExtends.get(tableName) : null;
        boolean first = insertColumns(buffer, pojo, true);
        if (parentPojo != null)
            insertColumns(buffer, parentPojo, first);
        buffer.append(")\n    {= values (");
        first = insertValues(buffer, pojo, true);
        if (parentPojo != null)
            insertValues(buffer, parentPojo, first);
        buffer.append(") }");
        buffer.append("\n;\n");
        return buffer;
    }

    private boolean insertColumns(StringBuilder buffer, String pojo, boolean first) {
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            if (ignoreColumns.containsKey(pojo) && ignoreColumns.get(pojo).contains(pentry.getKey())) {
                boolean ignore = true;
                if (inheritImports.containsKey(pojo) && ignoreColumns.get(pojo).contains(pentry.getKey())) {
                    ignore = false;
                }
                if (ignore)
                    continue;
            }
            PojoAttribute attribute = pentry.getValue();
            if (attribute.getClassName().startsWith(COLLECTION_LIST))
                continue;
            String name = (columnNames.containsKey(pojo)) ? columnNames.get(pojo).get(pentry.getKey()) : pentry
                    .getKey();
            if (!first)
                buffer.append(", %");
            else
                buffer.append("%");
            buffer.append(name);
            first = false;
        }
        return first;
    }

    private boolean insertValues(StringBuilder buffer, String pojo, boolean first) {
        if ("BOOK".equals(pojo))
            System.out.println("aha");
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            if (ignoreColumns.containsKey(pojo) && ignoreColumns.get(pojo).contains(pentry.getKey())) {
                boolean ignore = true;
                if (inheritImports.containsKey(pojo) && ignoreColumns.get(pojo).contains(pentry.getKey())) {
                    ignore = false;
                }
                if (ignore)
                    continue;
            }
            PojoAttribute attribute = pentry.getValue();
            if (attribute.getClassName().startsWith(COLLECTION_LIST))
                continue;
            String name = (columnNames.containsKey(pojo)) ? columnNames.get(pojo).get(pentry.getKey()) : null;
            if (name == null)
                name = attribute.getName();
            else
                name = columnToCamelCase(name);
            if (!first)
                buffer.append(", :");
            else
                buffer.append(":");
            buffer.append(name);
            if (attribute.getPkTable() != null) {
                buffer.append(".").append(columnToCamelCase(attribute.getPkColumn()));
            }
            first = false;
        }
        return first;
    }

    protected TableDefinition getTableDefinition(String tableName) {
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
