package org.sqlproc.dsl.ui.templates;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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
import org.sqlproc.dsl.util.Constants;

public class TableMetaConverter extends TablePojoConverter {

    private boolean debug = false;

    protected Set<String> finalMetas;
    protected Artifacts artifacts;
    protected IScopeProvider scopeProvider;

    protected PairValues metaGlobalSequence;
    protected Map<String, PairValues> metaTablesSequence = new HashMap<String, PairValues>();
    protected PairValues metaGlobalIdentity;
    protected Map<String, PairValues> metaTablesIdentity = new HashMap<String, PairValues>();
    protected Map<String, Map<String, PairValues>> metaColumnsMetaTypes = new HashMap<String, Map<String, PairValues>>();
    protected Map<String, Map<String, PairValues>> metaStatementsMetaTypes = new HashMap<String, Map<String, PairValues>>();
    protected boolean metaMakeItFinal;

    enum StatementType {
        INSERT, GET, UPDATE, DELETE, SELECT
    }

    public TableMetaConverter() {
        super();
    }

    public TableMetaConverter(ModelProperty modelProperty, Artifacts artifacts, IScopeProvider scopeProvider,
            Set<String> finalMetas) {
        super(modelProperty, artifacts, null, Collections.<String> emptySet());
        this.scopeProvider = scopeProvider;
        this.artifacts = artifacts;
        this.finalMetas = finalMetas;

        this.metaGlobalSequence = modelProperty.getMetaGlobalSequence(artifacts);
        Map<String, PairValues> tablesSequence = modelProperty.getMetaTablesSequence(artifacts);
        if (tablesSequence != null) {
            this.metaTablesSequence.putAll(tablesSequence);
        }
        this.metaGlobalIdentity = modelProperty.getMetaGlobalIdentity(artifacts);
        Map<String, PairValues> tablesIdentity = modelProperty.getMetaTablesIdentity(artifacts);
        if (tablesIdentity != null) {
            this.metaTablesIdentity.putAll(tablesIdentity);
        }
        Map<String, Map<String, PairValues>> columnsMetaTypes = modelProperty.getMetaColumnsMetaTypes(artifacts);
        if (columnsMetaTypes != null) {
            this.metaColumnsMetaTypes.putAll(columnsMetaTypes);
        }
        Map<String, Map<String, PairValues>> statementsMetaTypes = modelProperty.getMetaStatementsMetaTypes(artifacts);
        if (statementsMetaTypes != null) {
            this.metaStatementsMetaTypes.putAll(statementsMetaTypes);
        }
        this.metaMakeItFinal = modelProperty.isMetaMakeItFinal(artifacts);

        if (debug) {
            System.out.println("finalMetas " + this.finalMetas);
            System.out.println("metaGlobalSequence " + this.metaGlobalSequence);
            System.out.println("metaTablesSequence " + this.metaTablesSequence);
            System.out.println("metaGlobalIdentity " + this.metaGlobalIdentity);
            System.out.println("metaTablesIdentity " + this.metaTablesIdentity);
            System.out.println("metaColumnsMetaTypes " + this.metaColumnsMetaTypes);
            System.out.println("metaStatementsMetaTypes " + this.metaStatementsMetaTypes);
            System.out.println("metaMakeItFinal " + this.metaMakeItFinal);
        }
    }

    public String getMetaDefinitions() {
        try {
            if (debug) {
                System.out.println("pojos " + this.pojos);
                System.out.println("pojoExtends " + this.pojoExtends);
                System.out.println("pojoInheritanceDiscriminator " + this.pojoInheritanceDiscriminator);
                System.out.println("pojoInheritanceSimple " + this.pojoInheritanceSimple);
                System.out.println("pojoDiscriminators " + this.pojoDiscriminators);
                System.out.println("indexes " + this.indexes);
            }

            StringBuilder buffer = new StringBuilder();
            for (String pojo : pojos.keySet()) {
                if (!onlyTables.isEmpty() && !onlyTables.contains(pojo))
                    continue;
                if (ignoreTables.contains(pojo))
                    continue;
                if (pojoInheritanceDiscriminator.containsKey(pojo))
                    continue;
                buffer.append(metaInsertDefinition(pojo));
                buffer.append(metaGetSelectDefinition(pojo, false));
                buffer.append(metaUpdateDefinition(pojo));
                buffer.append(metaDeleteDefinition(pojo));
                buffer.append(metaGetSelectDefinition(pojo, true));
            }
            return buffer.toString();
        } catch (RuntimeException ex) {
            Writer writer = new StringWriter();
            PrintWriter printWriter = new PrintWriter(writer);
            ex.printStackTrace(printWriter);
            String s = writer.toString();
            return s;
        }
    }

    StringBuilder metaInsertDefinition(String pojo) {
        StringBuilder buffer = new StringBuilder();
        Header header = getStatementHeader(pojo, buffer, StatementType.INSERT, null);
        if (header == null)
            return buffer;
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

    StringBuilder metaGetSelectDefinition(String pojo, boolean select) {
        StringBuilder buffer = new StringBuilder();
        Header header = getStatementHeader(pojo, buffer, (select) ? StatementType.SELECT : StatementType.GET, null);
        if (header == null)
            return buffer;
        buffer.append("\n  select ");
        String parentPojo = pojoDiscriminators.containsKey(header.table.tableName) ? pojoExtends
                .get(header.table.tableName) : null;
        boolean first = selectColumns(buffer, pojo, true, header.statementName, header.table.tablePrefix, null, false,
                header.assocTables, null, header.discrTables, header.inherTables, null);
        if (parentPojo != null)
            first = selectColumns(buffer, parentPojo, first, header.statementName, header.table.tablePrefix, null,
                    false, header.assocTables, null, header.discrTables, header.inherTables, null);
        if (header.table.tablePrefix != null) {
            if (header.extendTable.tableName != null) {
                if (!first)
                    buffer.append("\n         ");
                first = selectColumns(buffer, header.extendTable.tableName, first, header.statementName,
                        header.extendTable.tablePrefix, null, true, header.assocTables, null, header.discrTables,
                        header.inherTables, null);
            }
            if (!header.assocTables.isEmpty()) {
                for (Entry<String, Table> entry : header.assocTables.entrySet()) {
                    Table table = entry.getValue();
                    if (!first)
                        buffer.append("\n         ");
                    if (table.toInit)
                        buffer.append("{? :").append(table.attrName).append("(call=toInit) | ");
                    if (table.many2many) {
                        if (header.inherTables.containsKey(entry.getKey())) {
                            for (Table table2 : header.inherTables.get(entry.getKey())) {
                                first = selectColumns(buffer, table2.realTableName, first, header.statementName,
                                        table2.tablePrefix, table2.attrName, false, header.assocTables,
                                        table2.discriminator, Collections.EMPTY_MAP, Collections.EMPTY_MAP,
                                        table2.inheritance);
                            }
                        }
                        Table table2 = header.m2mTables.get(entry.getKey());
                        first = selectColumns(buffer, table2.realTableName, first, header.statementName,
                                table2.tablePrefix, table.attrName, false, Collections.EMPTY_MAP, null,
                                Collections.EMPTY_MAP, Collections.EMPTY_MAP, null);
                    } else {
                        if (header.inherTables.containsKey(entry.getKey())) {
                            for (Table table2 : header.inherTables.get(entry.getKey())) {
                                first = selectColumns(buffer, table2.realTableName, first, header.statementName,
                                        table2.tablePrefix, table2.attrName, false, header.assocTables,
                                        table2.discriminator, Collections.EMPTY_MAP, Collections.EMPTY_MAP,
                                        table2.inheritance);
                            }
                        }
                        first = selectColumns(buffer, table.realTableName, first, header.statementName,
                                table.tablePrefix, table.attrName, !table.one2many, header.assocTables,
                                table.discriminator, Collections.EMPTY_MAP, Collections.EMPTY_MAP, table.inheritance);
                    }
                    if (table.discriminator != null && inheritance.containsKey(table.tableName)) {
                        for (Entry<String, Map<String, List<String>>> ientry : inheritance.get(table.tableName)
                                .entrySet()) {
                            for (Entry<String, List<String>> tentry : ientry.getValue().entrySet()) {
                                String tableName = tentry.getKey();
                                first = selectColumns(buffer, tableName, first, header.statementName,
                                        table.tablePrefix, table.attrName, true, Collections.EMPTY_MAP, null,
                                        Collections.EMPTY_MAP, Collections.EMPTY_MAP, null);
                            }
                        }
                    }
                    if (table.toInit)
                        buffer.append(" }");
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
            if (!header.assocTables.isEmpty()) {
                for (Entry<String, Table> entry : header.assocTables.entrySet()) {
                    Table table = entry.getValue();
                    buffer.append("\n  ");
                    if (table.toInit)
                        buffer.append("{? :").append(table.attrName).append("(call=toInit) | ");
                    buffer.append("left join %%").append(table.realTableName);
                    buffer.append(" ").append(table.tablePrefix);
                    buffer.append(" on %").append(table.oppositePrefix).append(".");
                    buffer.append(table.primaryKey);
                    buffer.append(" = %").append(table.tablePrefix).append(".");
                    buffer.append(table.tableKey);
                    if (header.m2mTables.containsKey(entry.getKey())) {
                        Table table2 = header.m2mTables.get(entry.getKey());
                        buffer.append(" left join %%").append(table2.realTableName);
                        buffer.append(" ").append(table2.tablePrefix);
                        buffer.append(" on %").append(table2.oppositePrefix).append(".");
                        buffer.append(table2.primaryKey);
                        buffer.append(" = %").append(table2.tablePrefix).append(".");
                        buffer.append(table2.tableKey);
                    }
                    if (header.inherTables.containsKey(entry.getKey())) {
                        for (Table table2 : header.inherTables.get(entry.getKey())) {
                            buffer.append(" left join %%").append(table2.realTableName);
                            buffer.append(" ").append(table2.tablePrefix);
                            buffer.append(" on %").append(table2.oppositePrefix).append(".");
                            buffer.append(table2.primaryKey);
                            buffer.append(" = %").append(table2.tablePrefix).append(".");
                            buffer.append(table2.tableKey);
                        }
                    }
                    if (table.toInit)
                        buffer.append(" }");
                }
            }
        }
        buffer.append("\n  {= where");
        first = whereColumns(buffer, pojo, first, header.statementName, header.table.tablePrefix, false, select);
        if (parentPojo != null)
            whereColumns(buffer, parentPojo, first, header.statementName, header.table.tablePrefix, false, select);
        else if (header.extendTable.tableName != null)
            whereColumns(buffer, header.extendTable.tableName, first, header.statementName,
                    header.extendTable.tablePrefix, true, select);
        buffer.append("\n  }");
        if (select) {
            if (generateMethods.contains(METHOD_INDEX) && indexes.containsKey(pojo))
                first = index2Columns(buffer, pojo, first, header.statementName, header.table.tablePrefix);
            else
                first = indexColumns(buffer, pojo, first, header.statementName, header.table.tablePrefix);
        }
        buffer.append("\n;\n");
        return buffer;
    }

    StringBuilder metaUpdateDefinition(String pojo) {
        StringBuilder buffer = new StringBuilder();
        Header header = getStatementHeader(pojo, buffer, StatementType.UPDATE, null);
        if (header == null)
            return buffer;
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
        if (header == null)
            return buffer;
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
                buffer.append("(");
                if (identity.value2 != null)
                    buffer.append("type=").append(identity.value2).append(",");
                buffer.append("idsel=").append(identity.value1).append(")");
                first = false;
                break;
            }
        }
        return first;
    }

    boolean pojoColumns(StringBuilder buffer, String pojo, boolean first, String statementName) {
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            Attribute attr = getStatementAttribute(pojo, pentry.getKey(), pentry.getValue(), true);
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
            if (attr.attribute.getPkTable() != null) {
                buffer.append(".").append(columnToCamelCase(attr.attribute.getPkColumn()));
            }
            if (attr.sequence != null) {
                buffer.append("(");
                if (attr.sequence.value2 != null)
                    buffer.append("type=").append(attr.sequence.value2).append(",");
                buffer.append("seq=").append(attr.sequence.value1);
            }
            if (metaTypes(buffer, attr.tableName, attr.attributeName, statementName, attr.sequence == null)
                    || attr.sequence != null)
                buffer.append(")");
            first = false;
        }
        return first;
    }

    boolean selectColumns(StringBuilder buffer, String pojo, boolean first, String statementName, String tablePrefix,
            String pojoPrefix, boolean notPrimaryKeys, Map<String, Table> assocTables, String discriminator,
            Map<String, Table> discrTables, Map<String, List<Table>> inherTables, String inheritance) {
        if (discriminator != null) {
            Attribute attr = getStatementAttribute(pojo, discriminator, pojos.get(pojo).get(discriminator), false);
            first = selectColumn(discriminator, attr, buffer, pojo, first, statementName, tablePrefix, pojoPrefix,
                    notPrimaryKeys, assocTables, discriminator, inherTables, inheritance);
        }
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            if (discriminator != null && discriminator.equals(pentry.getKey()))
                continue;
            if (inherTables.containsKey(pentry.getValue().getPkTable()))
                continue;
            if (discrTables.containsKey(pentry.getValue().getPkTable()))
                continue;
            Attribute attr = getStatementAttribute(pojo, pentry.getKey(), pentry.getValue(), false);
            first = selectColumn(pentry.getKey(), attr, buffer, pojo, first, statementName, tablePrefix, pojoPrefix,
                    notPrimaryKeys, assocTables, null, inherTables, null);
        }
        return first;
    }

    boolean selectColumn(String colname, Attribute attr, StringBuilder buffer, String pojo, boolean first,
            String statementName, String tablePrefix, String pojoPrefix, boolean notPrimaryKeys,
            Map<String, Table> assocTables, String discriminator, Map<String, List<Table>> inherTables,
            String inheritance) {
        if (attr == null)
            return first;
        if (attr.attribute.isPrimaryKey() && notPrimaryKeys)
            return first;
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
        buffer.append(colname);
        buffer.append(" @");
        if (pojoPrefix != null)
            buffer.append(pojoPrefix);
        if (discriminator != null) {
            if (inheritance != null)
                buffer.append("(gtype=").append(inheritance).append(")");
            else
                buffer.append("(discr)");
        }
        if (pojoPrefix != null && discriminator == null)
            buffer.append(".");
        buffer.append(name);
        if (attr.attribute.getPkTable() != null) {
            buffer.append(".").append(columnToCamelCase(attr.attribute.getPkColumn()));
        }
        if (attr.attribute.isPrimaryKey() || assocTables.containsKey(colname))
            buffer.append("(id");
        if (metaTypes(buffer, attr.tableName, attr.attributeName, statementName, !attr.attribute.isPrimaryKey()
                && !assocTables.containsKey(colname))
                || attr.attribute.isPrimaryKey() || assocTables.containsKey(colname))
            buffer.append(")");
        return false;
    }

    boolean whereColumns(StringBuilder buffer, String pojo, boolean first, String statementName, String prefix,
            boolean notPrimaryKeys, boolean select) {
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            Attribute attr = getStatementAttribute(pojo, pentry.getKey(), pentry.getValue(), false);
            if (attr == null)
                continue;
            if (attr.attribute.isPrimaryKey() && notPrimaryKeys)
                continue;
            if (attr.attribute.isVersion())
                continue;
            boolean useLike = select && attr.attribute.getClassName() != null
                    && attr.attribute.getClassName().endsWith("String");
            String name = (columnNames.containsKey(attr.tableName)) ? columnNames.get(attr.tableName).get(
                    attr.attributeName) : null;
            if (name == null)
                name = attr.attribute.getName();
            else
                name = columnToCamelCase(name);
            buffer.append("\n    {& ");
            if (useLike)
                buffer.append("UPPER(%");
            else
                buffer.append("%");
            if (prefix != null)
                buffer.append(prefix).append(".");
            buffer.append(pentry.getKey());
            if (useLike) {
                buffer.append(") like :+");
            } else {
                buffer.append(" = :");
            }
            buffer.append(name);
            if (attr.attribute.getPkTable() != null) {
                buffer.append(".").append(columnToCamelCase(attr.attribute.getPkColumn()));
            }
            if (metaTypes(buffer, attr.tableName, attr.attributeName, statementName, true))
                buffer.append(")");
            buffer.append(" }");
            first = false;
        }
        return first;
    }

    boolean wherePrimaryKeys(StringBuilder buffer, String pojo, boolean first, String statementName) {
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            Attribute attr = getStatementAttribute(pojo, pentry.getKey(), pentry.getValue(), false);
            if (attr == null)
                continue;
            if (!attr.attribute.isPrimaryKey() && !attr.attribute.isVersion())
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
            if (!metaTypes(buffer, attr.tableName, attr.attributeName, statementName, true))
                buffer.append("(notnull)");

            else
                buffer.append(")");
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
            Attribute attr = getStatementAttribute(pojo, pentry.getKey(), pentry.getValue(), false);
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
            if (attr.attribute.isVersion()) {
                buffer.append(" = %").append(pentry.getKey()).append(" + 1");
            } else {
                buffer.append(" = :").append(name);
                if (attr.attribute.getPkTable() != null) {
                    buffer.append(".").append(columnToCamelCase(attr.attribute.getPkColumn()));
                }
                boolean hasMetaType = metaTypes(buffer, attr.tableName, attr.attributeName, statementName, true);
                if (isDef) {
                    if (!hasMetaType)
                        buffer.append("(");
                    else
                        buffer.append(",");
                    buffer.append("call=isDef)");
                }
            }
            buffer.append(" }");
            first = false;
        }
        return first;
    }

    boolean indexColumns(StringBuilder buffer, String pojo, boolean first, String statementName, String prefix) {
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            Attribute attr = getStatementAttribute(pojo, pentry.getKey(), pentry.getValue(), false);
            if (attr == null || attr.attribute.getIndex() == null)
                continue;
            buffer.append("\n  {#").append(attr.attribute.getIndex()).append(" order by %");
            if (prefix != null)
                buffer.append(prefix).append(".");
            buffer.append(pentry.getKey());
            buffer.append(" }");
            first = false;
        }
        return first;
    }

    boolean index2Columns(StringBuilder buffer, String pojo, boolean first, String statementName, String prefix) {
        List<Map<PojoAttribute, Boolean>> mainList = indexes.get(pojo);
        for (int i = 0, l = mainList.size(); i < l; i++) {
            buffer.append("\n  {#").append(i + 1).append(" order by");
            boolean firstcol = true;
            for (Entry<PojoAttribute, Boolean> entry : mainList.get(i).entrySet()) {
                if (firstcol)
                    firstcol = false;
                else
                    buffer.append(",");
                buffer.append(" %");
                if (prefix != null)
                    buffer.append(prefix).append(".");
                buffer.append(entry.getKey().getDbName());
                if (entry.getValue())
                    buffer.append(" DESC");
            }
            buffer.append(" }");
            first = false;
        }
        return first;
    }

    boolean metaTypes(StringBuilder buffer, String tableName, String attributeName, String statementName, boolean first) {
        if (metaColumnsMetaTypes.containsKey(tableName)
                && metaColumnsMetaTypes.get(tableName).containsKey(attributeName)) {
            PairValues metaType = metaColumnsMetaTypes.get(tableName).get(attributeName);
            if (first)
                buffer.append("(");
            else
                buffer.append(",");
            if (!"null".equalsIgnoreCase(metaType.value1))
                buffer.append("type=").append(metaType.value1);
            if (metaType.value2 != null) {
                buffer.append(",").append(metaType.value2);
            }
            return true;
        } else if (metaStatementsMetaTypes.containsKey(statementName)
                && metaStatementsMetaTypes.get(statementName).containsKey(attributeName)) {
            PairValues metaType = metaStatementsMetaTypes.get(statementName).get(attributeName);
            if (first)
                buffer.append("(");
            else
                buffer.append(",");
            if (!"null".equalsIgnoreCase(metaType.value1))
                buffer.append("type=").append(metaType.value1);
            if (metaType.value2 != null) {
                buffer.append(",").append(metaType.value2);
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
        boolean toInit;
        boolean one2many;
        boolean many2many;
        String discriminator;
        String inheritance;

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

        @Override
        public String toString() {
            return "Table [tableName=" + tableName + ", realTableName=" + realTableName + ", tablePrefix="
                    + tablePrefix + ", primaryKey=" + primaryKey + ", tableKey=" + tableKey + ", attrName=" + attrName
                    + ", oppositePrefix=" + oppositePrefix + ", toInit=" + toInit + "]";
        }
    }

    class Header {
        Table table = new Table();
        Table extendTable = new Table();
        String statementName;
        Map<String, Table> assocTables = new HashMap<String, Table>();
        Map<String, Table> m2mTables = new HashMap<String, Table>();
        Map<String, Table> discrTables = new HashMap<String, Table>();
        Map<String, List<Table>> inherTables = new HashMap<String, List<Table>>();
        String version;
    }

    Header getStatementHeader(String pojo, StringBuilder buffer, StatementType type, String suffix) {
        if (debug && (type == StatementType.GET || type == StatementType.SELECT))
            System.out.println("\n--- " + pojo + " " + suffix);
        Header header = new Header();
        Set<String> prefixes = new HashSet<String>();
        header.table.setNames(pojo);
        if (pojoDiscriminators.containsKey(header.table.tableName)) {
            header.table.realTableName = pojoExtends.get(header.table.tableName);
            if (debug && (type == StatementType.GET || type == StatementType.SELECT))
                System.out.println("000 " + pojo + " " + header.table.realTableName);
        } else if (pojoExtends.containsKey(header.table.realTableName)
                && pojoInheritanceSimple.containsKey(pojoExtends.get(header.table.realTableName))) {
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
            if (debug && (type == StatementType.GET || type == StatementType.SELECT))
                System.out.println("001 " + pojo + " " + header.extendTable.realTableName);
        }
        if (debug && (type == StatementType.GET || type == StatementType.SELECT))
            System.out.println("111 " + pojo + " " + header.table);
        if (debug && (type == StatementType.GET || type == StatementType.SELECT))
            System.out.println("222 " + pojo + " " + header.extendTable);
        if (type == StatementType.GET || type == StatementType.SELECT) {
            for (Map.Entry<String, PojoAttribute> pentry : pojos.get(header.table.realTableName).entrySet()) {
                PojoAttribute attr = pentry.getValue();
                if (attr.isVersion() && header.version == null)
                    header.version = attr.getName();
                if (attr.getPkTable() != null) {
                    if (header.table.tablePrefix == null)
                        header.table.tablePrefix = newPrefix(prefixes, header.table);
                    Table table = new Table();
                    table.setNames(attr.getPkTable());
                    table.primaryKey = pentry.getKey();
                    table.tableKey = attr.getPkColumn();
                    table.tablePrefix = newPrefix(prefixes, table);
                    table.attrName = attrName(pojo, pentry.getKey(), attr);
                    table.oppositePrefix = header.table.tablePrefix;
                    table.toInit = attr.toInit();
                    if (inheritanceColumns.containsKey(pentry.getKey())) {
                        table.discriminator = inheritanceColumns.get(pentry.getKey());
                        header.discrTables.put(table.realTableName, table);
                    }
                    header.assocTables.put(pentry.getKey(), table);
                    if (debug && (type == StatementType.GET || type == StatementType.SELECT))
                        System.out.println("333 " + pentry.getKey() + " " + table + " " + attr);
                    if (pojoInheritanceSimple.containsKey(table.realTableName)) {
                        header.inherTables.put(pentry.getKey(), new ArrayList<Table>());
                        for (String name : pojoInheritanceSimple.get(table.realTableName)) {
                            Table table2 = new Table();
                            table2.setNames(name);
                            // inheritImports {MOVIE={MEDIA_ID={MEDIA=ID}}, BOOK={MEDIA_ID={MEDIA=ID}}}
                            String[] kk = findInheritanceKeysName(name, pentry.getKey());
                            table2.primaryKey = kk[1];
                            table2.tableKey = kk[0];
                            table2.tablePrefix = newPrefix(prefixes, table2);
                            table2.attrName = attrName(pojo, pentry.getKey(), attr);
                            table2.oppositePrefix = table.tablePrefix;
                            table2.discriminator = kk[0];
                            table2.inheritance = table2.realTableName.toLowerCase();
                            header.inherTables.get(pentry.getKey()).add(table2);
                        }
                    }
                    if (debug && (type == StatementType.GET || type == StatementType.SELECT))
                        System.out.println("333b " + header.inherTables);
                } else if (attr.getOneToManyColumn() != null) {
                    PojoAttribute attr1 = pojos.get(header.table.realTableName).get(attr.getOneToManyColumn());
                    if (header.table.tablePrefix == null)
                        header.table.tablePrefix = newPrefix(prefixes, header.table);
                    Table table = new Table();
                    table.setNames(attr.getOneToManyTable());
                    table.primaryKey = attr.getOneToManyColumn();
                    table.tableKey = attr1.getFkColumns().get(attr.getOneToManyTable());
                    table.tablePrefix = newPrefix(prefixes, table);
                    table.attrName = attrName(pojo, pentry.getKey(), attr);
                    table.oppositePrefix = header.table.tablePrefix;
                    table.toInit = attr.toInit();
                    table.one2many = true;
                    if (inheritanceColumns.containsKey(pentry.getKey())) {
                        table.discriminator = inheritanceColumns.get(pentry.getKey());
                        header.discrTables.put(table.realTableName, table);
                    }
                    header.assocTables.put(pentry.getKey(), table);
                    if (debug && (type == StatementType.GET || type == StatementType.SELECT))
                        System.out.println("444 " + pentry.getKey() + " " + table + " " + attr + " " + attr1);
                    if (pojoInheritanceSimple.containsKey(table.realTableName)) {
                        header.inherTables.put(pentry.getKey(), new ArrayList<Table>());
                        for (String name : pojoInheritanceSimple.get(table.realTableName)) {
                            Table table2 = new Table();
                            table2.setNames(name);
                            // inheritImports {MOVIE={MEDIA_ID={MEDIA=ID}}, BOOK={MEDIA_ID={MEDIA=ID}}}
                            String[] kk = findInheritanceKeysName(name, table.realTableName);
                            table2.primaryKey = kk[1];
                            table2.tableKey = kk[0];
                            table2.tablePrefix = newPrefix(prefixes, table2);
                            table2.attrName = attrName(pojo, pentry.getKey(), attr);
                            table2.oppositePrefix = table.tablePrefix;
                            table2.discriminator = kk[0];
                            table2.inheritance = table2.realTableName.toLowerCase();
                            header.inherTables.get(pentry.getKey()).add(table2);
                        }
                    }
                    if (debug && (type == StatementType.GET || type == StatementType.SELECT))
                        System.out.println("444b " + header.inherTables);
                } else if (attr.getManyToManyColumn() != null) {
                    PojoAttribute attr1 = pojos.get(header.table.realTableName).get(attr.getManyToManyColumn());
                    if (header.table.tablePrefix == null)
                        header.table.tablePrefix = newPrefix(prefixes, header.table);
                    Table table = new Table();
                    table.setNames(attr1.getM2Tables().get(attr.getManyToManyTable()));
                    table.primaryKey = attr.getManyToManyColumn();
                    table.tableKey = findM2mKeyName(table.realTableName, header.table.realTableName);
                    if (table.tableKey == null) {
                        System.out.println("Error for findM2mKeyName " + table.realTableName + " "
                                + header.table.realTableName);
                        continue;
                    }
                    table.tablePrefix = newPrefix(prefixes, table);
                    table.attrName = attrName(pojo, pentry.getKey(), attr);
                    table.oppositePrefix = header.table.tablePrefix;
                    table.toInit = attr.toInit();
                    table.many2many = true;
                    header.assocTables.put(pentry.getKey(), table);
                    Table table12 = new Table();
                    table12.setNames(attr.getManyToManyTable());
                    table12.tableKey = findPKeyName(table.realTableName);
                    table12.primaryKey = findM2mKeyName(table.realTableName, table12.realTableName);
                    if (table12.tableKey == null) {
                        System.out.println("Error for findM2mKeyName " + table12.realTableName + " "
                                + table.realTableName);
                        continue;
                    }
                    table12.tablePrefix = newPrefix(prefixes, table12);
                    table12.attrName = null;
                    table12.oppositePrefix = table.tablePrefix;
                    header.m2mTables.put(pentry.getKey(), table12);
                    if (debug && (type == StatementType.GET || type == StatementType.SELECT))
                        System.out.println("555 " + pentry.getKey() + " " + table + " " + attr + " " + attr1 + " "
                                + table12);
                    if (pojoInheritanceSimple.containsKey(table12.realTableName)) {
                        header.inherTables.put(pentry.getKey(), new ArrayList<Table>());
                        for (String name : pojoInheritanceSimple.get(table12.realTableName)) {
                            Table table2 = new Table();
                            table2.setNames(name);
                            // inheritImports {MOVIE={MEDIA_ID={MEDIA=ID}}, BOOK={MEDIA_ID={MEDIA=ID}}}
                            String[] kk = findInheritanceKeysName(name, table12.realTableName);
                            table2.primaryKey = kk[1];
                            table2.tableKey = kk[0];
                            table2.tablePrefix = newPrefix(prefixes, table2);
                            table2.attrName = attrName(pojo, pentry.getKey(), attr);
                            table2.oppositePrefix = table12.tablePrefix;
                            table2.discriminator = kk[0];
                            table2.inheritance = table2.realTableName.toLowerCase();
                            header.inherTables.get(pentry.getKey()).add(table2);
                        }
                    }
                    if (debug && (type == StatementType.GET || type == StatementType.SELECT))
                        System.out.println("555b " + header.inherTables);
                }
            }
            if (header.extendTable.tableName != null) {
                for (Map.Entry<String, PojoAttribute> pentry : pojos.get(header.extendTable.realTableName).entrySet()) {
                    PojoAttribute attr = pentry.getValue();
                    if (attr.isVersion() && header.version == null)
                        header.version = attr.getName();
                    if (attr.getPkTable() != null) {
                        if (header.extendTable.tablePrefix == null)
                            header.extendTable.tablePrefix = newPrefix(prefixes, header.extendTable);
                        Table table = new Table();
                        table.setNames(attr.getPkTable());
                        table.primaryKey = pentry.getKey();
                        table.tableKey = attr.getPkColumn();
                        table.tablePrefix = newPrefix(prefixes, table);
                        table.attrName = attrName(pojo, pentry.getKey(), attr);
                        table.oppositePrefix = header.extendTable.tablePrefix;
                        table.toInit = attr.toInit();
                        if (inheritanceColumns.containsKey(pentry.getKey())) {
                            table.discriminator = inheritanceColumns.get(pentry.getKey());
                            header.discrTables.put(table.realTableName, table);
                        }
                        header.assocTables.put(pentry.getKey(), table);
                        if (debug && (type == StatementType.GET || type == StatementType.SELECT))
                            System.out.println("666 " + pentry.getKey() + " " + table + " " + attr);
                        if (pojoInheritanceSimple.containsKey(table.realTableName)) {
                            header.inherTables.put(pentry.getKey(), new ArrayList<Table>());
                            for (String name : pojoInheritanceSimple.get(table.realTableName)) {
                                Table table2 = new Table();
                                table2.setNames(name);
                                // inheritImports {MOVIE={MEDIA_ID={MEDIA=ID}}, BOOK={MEDIA_ID={MEDIA=ID}}}
                                String[] kk = findInheritanceKeysName(name, pentry.getKey());
                                table2.primaryKey = kk[1];
                                table2.tableKey = kk[0];
                                table2.tablePrefix = newPrefix(prefixes, table2);
                                table2.attrName = attrName(pojo, pentry.getKey(), attr);
                                table2.oppositePrefix = table.tablePrefix;
                                table2.discriminator = kk[0];
                                table2.inheritance = table2.realTableName.toLowerCase();
                                header.inherTables.get(pentry.getKey()).add(table2);
                            }
                        }
                        if (debug && (type == StatementType.GET || type == StatementType.SELECT))
                            System.out.println("666b " + header.inherTables);
                    } else if (attr.getOneToManyColumn() != null) {
                        PojoAttribute attr1 = pojos.get(header.extendTable.realTableName)
                                .get(attr.getOneToManyColumn());
                        if (header.extendTable.tablePrefix == null)
                            header.extendTable.tablePrefix = newPrefix(prefixes, header.extendTable);
                        Table table = new Table();
                        table.setNames(attr.getOneToManyTable());
                        table.primaryKey = attr.getOneToManyColumn();
                        table.tableKey = attr1.getFkColumns().get(attr.getOneToManyTable());
                        table.tablePrefix = newPrefix(prefixes, table);
                        table.attrName = attrName(pojo, pentry.getKey(), attr);
                        table.oppositePrefix = header.extendTable.tablePrefix;
                        table.toInit = attr.toInit();
                        table.one2many = true;
                        if (inheritanceColumns.containsKey(pentry.getKey())) {
                            table.discriminator = inheritanceColumns.get(pentry.getKey());
                            header.discrTables.put(table.realTableName, table);
                        }
                        header.assocTables.put(pentry.getKey(), table);
                        if (debug && (type == StatementType.GET || type == StatementType.SELECT))
                            System.out.println("777 " + pentry.getKey() + " " + table + " " + attr + " " + attr1);
                        if (pojoInheritanceSimple.containsKey(table.realTableName)) {
                            header.inherTables.put(pentry.getKey(), new ArrayList<Table>());
                            for (String name : pojoInheritanceSimple.get(table.realTableName)) {
                                Table table2 = new Table();
                                table2.setNames(name);
                                // inheritImports {MOVIE={MEDIA_ID={MEDIA=ID}}, BOOK={MEDIA_ID={MEDIA=ID}}}
                                String[] kk = findInheritanceKeysName(name, table.realTableName);
                                table2.primaryKey = kk[1];
                                table2.tableKey = kk[0];
                                table2.tablePrefix = newPrefix(prefixes, table2);
                                table2.attrName = attrName(pojo, pentry.getKey(), attr);
                                table2.oppositePrefix = table.tablePrefix;
                                table2.discriminator = kk[0];
                                table2.inheritance = table2.realTableName.toLowerCase();
                                header.inherTables.get(pentry.getKey()).add(table2);
                            }
                        }
                        if (debug && (type == StatementType.GET || type == StatementType.SELECT))
                            System.out.println("777b " + header.inherTables);
                    } else if (attr.getManyToManyColumn() != null) {
                        PojoAttribute attr1 = pojos.get(header.extendTable.realTableName).get(
                                attr.getManyToManyColumn());
                        if (header.extendTable.tablePrefix == null)
                            header.extendTable.tablePrefix = newPrefix(prefixes, header.extendTable);
                        Table table = new Table();
                        table.setNames(attr1.getM2Tables().get(attr.getManyToManyTable()));
                        table.primaryKey = attr.getManyToManyColumn();
                        table.tableKey = findM2mKeyName(table.realTableName, header.extendTable.realTableName);
                        if (table.tableKey == null) {
                            System.out.println("Error for findM2mKeyName " + table.realTableName + " "
                                    + header.extendTable.realTableName);
                            continue;
                        }
                        table.tablePrefix = newPrefix(prefixes, table);
                        table.attrName = attrName(pojo, pentry.getKey(), attr);
                        table.oppositePrefix = header.extendTable.tablePrefix;
                        table.toInit = attr.toInit();
                        table.many2many = true;
                        header.assocTables.put(pentry.getKey(), table);
                        Table table12 = new Table();
                        table12.setNames(attr.getManyToManyTable());
                        table12.tableKey = findPKeyName(table.realTableName);
                        table12.primaryKey = findM2mKeyName(table12.realTableName, table.realTableName);
                        if (table12.tableKey == null) {
                            System.out.println("Error for findM2mKeyName " + table12.realTableName + " "
                                    + table.realTableName);
                            continue;
                        }
                        table12.tablePrefix = newPrefix(prefixes, table12);
                        table12.attrName = null;
                        table12.oppositePrefix = table.tablePrefix;
                        header.m2mTables.put(pentry.getKey(), table12);
                        if (debug && (type == StatementType.GET || type == StatementType.SELECT))
                            System.out.println("888 " + pentry.getKey() + " " + table + " " + attr + " " + attr1 + " "
                                    + table12);
                        if (pojoInheritanceSimple.containsKey(table12.realTableName)) {
                            header.inherTables.put(pentry.getKey(), new ArrayList<Table>());
                            for (String name : pojoInheritanceSimple.get(table12.realTableName)) {
                                Table table2 = new Table();
                                table2.setNames(name);
                                // inheritImports {MOVIE={MEDIA_ID={MEDIA=ID}}, BOOK={MEDIA_ID={MEDIA=ID}}}
                                String[] kk = findInheritanceKeysName(name, table12.realTableName);
                                table2.primaryKey = kk[1];
                                table2.tableKey = kk[0];
                                table2.tablePrefix = newPrefix(prefixes, table2);
                                table2.attrName = attrName(pojo, pentry.getKey(), attr);
                                table2.oppositePrefix = table12.tablePrefix;
                                table2.discriminator = kk[0];
                                table2.inheritance = table2.realTableName.toLowerCase();
                                header.inherTables.get(pentry.getKey()).add(table2);
                            }
                        }
                        if (debug && (type == StatementType.GET || type == StatementType.SELECT))
                            System.out.println("888b " + header.inherTables);
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
        if (finalMetas.contains(header.statementName))
            return null;
        buffer.append("\n").append(header.statementName);
        if (type == StatementType.SELECT)
            buffer.append("(QRY,");
        else
            buffer.append("(CRUD,");
        if (metaMakeItFinal)
            buffer.append("final=,");
        buffer.append(Constants.IDENTIFIER_USAGE_EXTENDED).append("=").append(tableToCamelCase(header.table.tableName));
        buffer.append(",").append(Constants.COLUMN_USAGE_EXTENDED).append("=")
                .append(tableToCamelCase(header.table.tableName));
        buffer.append(",").append(Constants.TABLE_USAGE).append("=");
        buffer.append(header.table.getTableName());

        if (header.table.tablePrefix != null && (type == StatementType.GET || type == StatementType.SELECT)) {
            buffer.append("=").append(header.table.tablePrefix);
            if (header.extendTable.tableName != null) {
                buffer.append(",").append(Constants.TABLE_USAGE).append("=");
                buffer.append(header.extendTable.getTableName());
                buffer.append("=").append(header.extendTable.tablePrefix);
            }
            if (!header.assocTables.isEmpty()) {
                for (Entry<String, Table> entry : header.assocTables.entrySet()) {
                    Table table = entry.getValue();
                    buffer.append(",").append(Constants.TABLE_USAGE).append("=");
                    buffer.append(table.getTableName());
                    buffer.append("=").append(table.tablePrefix);
                    if (header.m2mTables.containsKey(entry.getKey())) {
                        Table table2 = header.m2mTables.get(entry.getKey());
                        buffer.append(",").append(Constants.TABLE_USAGE).append("=");
                        buffer.append(table2.getTableName());
                        buffer.append("=").append(table2.tablePrefix);
                    }
                    if (header.inherTables.containsKey(entry.getKey())) {
                        for (Table table2 : header.inherTables.get(entry.getKey())) {
                            buffer.append(",").append(Constants.TABLE_USAGE).append("=");
                            buffer.append(table2.getTableName());
                            buffer.append("=").append(table2.tablePrefix);
                        }
                    }
                }
            }
        }
        buffer.append(")=");
        return header;
    }

    String findPKeyName(String pojo) {
        if (!pojos.containsKey(pojo))
            return null;
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            PojoAttribute attr = pentry.getValue();
            if (attr.isPrimaryKey())
                return pentry.getKey();
        }
        return null;
    }

    String findM2mKeyName(String pojo, String tablename) {
        if (!pojos.containsKey(pojo))
            return null;
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            PojoAttribute attr = pentry.getValue();
            if (attr.getM2mTable() != null && attr.getM2mTable().equals(tablename))
                return pentry.getKey();
        }
        return null;
    }

    String attrName(String pojo, String colname, PojoAttribute attr) {
        String name = (columnNames.containsKey(pojo)) ? columnNames.get(pojo).get(colname) : null;
        if (name == null)
            name = attr.getName();
        else
            name = columnToCamelCase(name);
        return name;
    }

    String[] findInheritanceKeysName(String name1, String name2) {
        // inheritImports {MOVIE={MEDIA_ID={MEDIA=ID}}, BOOK={MEDIA_ID={MEDIA=ID}}}
        String[] result = new String[2];
        if (!inheritImports.containsKey(name1))
            return null;
        for (Entry<String, Map<String, String>> entry : inheritImports.get(name1).entrySet()) {
            if (entry.getValue().containsKey(name2)) {
                result[0] = entry.getKey();
                result[1] = entry.getValue().get(name2);
                return result;
            }
        }
        return null;
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

    Attribute getStatementAttribute(String pojo, String colname, PojoAttribute colattr, boolean checkIdentity) {
        Attribute attr = new Attribute();
        if (createColumns.containsKey(pojo) && createColumns.get(pojo).containsKey(colname))
            return null;
        if (checkIdentity) {
            if (getIdentity(pojo, colattr) != null)
                return null;
            attr.sequence = getSequence(pojo, colattr);
        }
        attr.tableName = null;
        attr.attributeName = null;
        attr.attribute = null;
        if (ignoreColumns.containsKey(pojo) && ignoreColumns.get(pojo).contains(colname)) {
            boolean ignore = true;
            if (inheritImports.containsKey(pojo) && inheritImports.get(pojo).containsKey(colname)) {
                ignore = false;
                for (Map.Entry<String, String> pentry2 : inheritImports.get(pojo).get(colname).entrySet()) {
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
            attr.attributeName = colname;
        if (attr.attribute == null)
            attr.attribute = colattr;
        if (attr.attribute.getClassName().startsWith(COLLECTION_LIST))
            return null;
        return attr;
    }

    PairValues getIdentity(String pojo, PojoAttribute attribute) {
        if (attribute.isPrimaryKey()) {
            if (metaTablesIdentity.containsKey(pojo))
                return metaTablesIdentity.get(pojo);
            else if (metaGlobalIdentity != null)
                return metaGlobalIdentity;
        }
        return null;
    }

    PairValues getSequence(String pojo, PojoAttribute attribute) {
        if (attribute.isPrimaryKey()) {
            if (metaTablesSequence.containsKey(pojo))
                return metaTablesSequence.get(pojo);
            else if (metaGlobalSequence != null)
                return metaGlobalSequence;
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
