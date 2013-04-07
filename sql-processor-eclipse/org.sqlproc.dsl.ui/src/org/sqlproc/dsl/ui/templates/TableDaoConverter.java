package org.sqlproc.dsl.ui.templates;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Level;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.processorDsl.PojoType;
import org.sqlproc.dsl.property.ModelProperty;
import org.sqlproc.dsl.property.PojoAttribute;
import org.sqlproc.dsl.resolver.DbResolver.DbType;

public class TableDaoConverter extends TableMetaConverter {

    private boolean debug = false;

    protected Set<String> finalDaos;
    protected Set<String> daoIgnoreTables = new HashSet<String>();
    protected Set<String> daoOnlyTables = new HashSet<String>();
    protected String daoImplementationPackage;
    protected Map<String, JvmType> daoToImplements = new HashMap<String, JvmType>();
    protected JvmType daoToExtends = null;
    protected boolean daoMakeItFinal;
    protected Map<String, PojoType> daoFunctionsResult = new HashMap<String, PojoType>();

    public TableDaoConverter() {
        super();
    }

    public TableDaoConverter(ModelProperty modelProperty, Artifacts artifacts, String suffix,
            IScopeProvider scopeProvider, Set<String> finalDaos, List<String> dbSequences, DbType dbType) {
        super(modelProperty, artifacts, null, Collections.<String> emptySet(), dbSequences, dbType);

        if (modelProperty.getDaoDebugLevel(artifacts) != null
                && modelProperty.getDaoDebugLevel(artifacts).isGreaterOrEqual(Level.DEBUG)) {
            debug = true;
        } else {
            debug = false;
        }

        this.suffix = (suffix != null) ? suffix : "";
        this.finalDaos = finalDaos;

        Set<String> daoIgnoreTables = modelProperty.getDaoIgnoreTables(artifacts);
        if (daoIgnoreTables != null) {
            this.daoIgnoreTables.addAll(daoIgnoreTables);
        }
        Set<String> daoOnlyTables = modelProperty.getDaoOnlyTables(artifacts);
        if (daoOnlyTables != null) {
            this.daoOnlyTables.addAll(daoOnlyTables);
        }
        this.daoImplementationPackage = modelProperty.getDaoImplementationPackage(artifacts);
        Map<String, JvmType> daoToImplements = modelProperty.getDaoToImplements(artifacts);
        if (daoToImplements != null) {
            this.daoToImplements.putAll(daoToImplements);
        }
        this.daoToExtends = modelProperty.getDaoToExtends(artifacts);
        this.daoMakeItFinal = modelProperty.isDaoMakeItFinal(artifacts);
        Map<String, PojoType> daoFunctionsResult = modelProperty.getDaoFunctionsResult(artifacts);
        if (daoFunctionsResult != null) {
            this.daoFunctionsResult.putAll(daoFunctionsResult);
        }

        if (debug) {
            System.out.println("finalDaos " + this.finalDaos);
            System.out.println("daoIgnoreTables " + this.daoIgnoreTables);
            System.out.println("daoOnlyTables " + this.daoOnlyTables);
            System.out.println("daoImplementationPackage " + this.daoImplementationPackage);
            System.out.println("daoToImplements " + this.daoToImplements);
            System.out.println("daoToExtends " + this.daoToExtends);
            System.out.println("daoFunctionsResult " + this.daoFunctionsResult);
        }
    }

    public String getDaoDefinitions() {
        try {
            if (debug) {
                System.out.println("pojos " + this.pojos);
                System.out.println("pojoExtends " + this.pojoExtends);
                System.out.println("pojoInheritanceDiscriminator " + this.pojoInheritanceDiscriminator);
                System.out.println("pojoInheritanceSimple " + this.pojoInheritanceSimple);
                System.out.println("pojoDiscriminators " + this.pojoDiscriminators);
                System.out.println("indexes " + this.indexes);
                System.out.println("procedures " + this.procedures);
                System.out.println("functions " + this.functions);
            }

            StringBuilder buffer = new StringBuilder();
            boolean isSerializable = false;
            boolean oneMoreLine = false;
            if (!daoToImplements.isEmpty()) {
                for (JvmType type : daoToImplements.values()) {
                    if (type.getIdentifier().endsWith("Serializable")) {
                        isSerializable = true;
                        continue;
                    }
                    buffer.append("\n  implements ").append(type.getIdentifier());
                }
                oneMoreLine = true;
            }
            if (daoToExtends != null) {
                buffer.append("\n  extends ").append(daoToExtends.getIdentifier());
                oneMoreLine = true;
            }
            if (daoImplementationPackage != null) {
                buffer.append("\n  implementation-package ").append(daoImplementationPackage);
                oneMoreLine = true;
            }
            if (oneMoreLine) {
                buffer.append("\n");
            }
            for (String pojo : pojos.keySet()) {
                // System.out.println("QQQQQ " + pojo);
                if (!daoOnlyTables.isEmpty() && !daoOnlyTables.contains(pojo))
                    continue;
                if (daoIgnoreTables.contains(pojo))
                    continue;
                String pojoName = tableNames.get(pojo);
                if (pojoName == null)
                    pojoName = pojo;
                String daoName = tableToCamelCase(pojoName) + "Dao";
                if (finalDaos.contains(daoName))
                    continue;
                if (pojoInheritanceDiscriminator.containsKey(pojo) || pojoInheritanceSimple.containsKey(pojo)) {
                    if (!notAbstractTables.contains(pojo))
                        continue;
                }
                buffer.append("\n  ");
                if (daoMakeItFinal)
                    buffer.append("final ");
                buffer.append("dao ");
                buffer.append(daoName);
                buffer.append(" :: ").append(tableToCamelCase(pojoName));
                if (isSerializable)
                    buffer.append(" serializable 1 ");
                buffer.append(" {");
                buffer.append("\n    scaffold");
                Map<String, String> toInit = new LinkedHashMap<String, String>();
                toInits(pojo, toInit);
                for (Entry<String, String> entry : toInit.entrySet()) {
                    buffer.append("\n    ").append(entry.getKey()).append(" :::");
                    // pojoExtends {BANK_ACCOUNT=BILLING_DETAILS, MOVIE=MEDIA, CREDIT_CARD=BILLING_DETAILS,
                    // BOOK=MEDIA}
                    // pojoInheritanceDiscriminator {BILLING_DETAILS=[BANK_ACCOUNT, CREDIT_CARD]}
                    // pojoInheritanceSimple {MEDIA=[MOVIE, BOOK]}
                    // pojoDiscriminators {BANK_ACCOUNT=BA, CREDIT_CARD=CC}
                    if (pojoInheritanceSimple.containsKey(entry.getValue())) {
                        for (String pojo2 : pojoInheritanceSimple.get(entry.getValue())) {
                            buffer.append(" ").append(columnToCamelCase(pojo2));
                            String pojoName2 = tableNames.get(pojo2);
                            if (pojoName2 == null)
                                pojoName2 = pojo2;
                            buffer.append(" ::").append(tableToCamelCase(pojoName2));
                        }
                    } else {
                        for (String pojo2 : pojoInheritanceDiscriminator.get(entry.getValue())) {
                            buffer.append(" ").append(pojoDiscriminators.get(pojo2));
                            String pojoName2 = tableNames.get(pojo2);
                            if (pojoName2 == null)
                                pojoName2 = pojo2;
                            buffer.append(" ::").append(tableToCamelCase(pojoName2));
                        }
                    }
                }
                buffer.append("\n  }\n");
            }
            boolean hasProcedures = false;
            for (String pojo : procedures.keySet()) {
                // System.out.println("QQQQQ " + pojo);
                if (!daoOnlyTables.isEmpty() && !daoOnlyTables.contains(pojo))
                    continue;
                if (daoIgnoreTables.contains(pojo))
                    continue;
                boolean isFunction = functions.containsKey(pojo);
                if (!isFunction) {
                    hasProcedures = true;
                    break;
                }
            }
            if (hasProcedures && !finalDaos.contains("ProceduresDao")) {
                buffer.append("\n  ");
                if (daoMakeItFinal)
                    buffer.append("final ");
                buffer.append("dao ProceduresDao");
                if (isSerializable)
                    buffer.append(" serializable 1 ");
                buffer.append(" {");
                for (String procedure : procedures.keySet()) {
                    // System.out.println("QQQQQ " + pojo);
                    if (!daoOnlyTables.isEmpty() && !daoOnlyTables.contains(procedure))
                        continue;
                    if (daoIgnoreTables.contains(procedure))
                        continue;
                    boolean isFunction = functions.containsKey(procedure);
                    if (isFunction)
                        continue;
                    buffer.append("\n    ");
                    String pojoName = tableNames.get(procedure);
                    if (pojoName == null)
                        pojoName = procedure;
                    pojoName = tableToCamelCase(pojoName);
                    String procedureName = lowerFirstChar(pojoName);
                    Map<String, PojoAttribute> attributes = procedures.get(procedure);
                    if (metaProceduresResultSet.containsKey(procedure)) {
                        buffer.append("callQuery ").append(procedureName).append(" :java.util.List<:")
                                .append(tableToCamelCase(metaProceduresResultSet.get(procedure))).append(">");
                    } else {
                        PojoAttribute returnAttribute = (attributes.containsKey(FAKE_FUN_PROC_COLUMN_NAME)) ? attributes
                                .get(FAKE_FUN_PROC_COLUMN_NAME) : null;
                        if (returnAttribute != null && dbType != DbType.POSTGRESQL) {
                            buffer.append("callQuery ").append(procedureName).append(" :")
                                    .append(returnAttribute.getClassName());
                        } else {
                            buffer.append("callUpdate ").append(procedureName).append(" _void");
                        }
                    }
                    buffer.append(" ::: ").append(lowerFirstChar(pojoName)).append(" ::").append(pojoName);
                }
                buffer.append("\n  }\n");
            }
            boolean hasFunctions = false;
            for (String pojo : procedures.keySet()) {
                // System.out.println("QQQQQ " + pojo);
                if (!daoOnlyTables.isEmpty() && !daoOnlyTables.contains(pojo))
                    continue;
                if (daoIgnoreTables.contains(pojo))
                    continue;
                boolean isFunction = functions.containsKey(pojo);
                if (isFunction) {
                    hasFunctions = true;
                    break;
                }
            }
            if (hasFunctions && !finalDaos.contains("FunctionsDao")) {
                buffer.append("\n  ");
                if (daoMakeItFinal)
                    buffer.append("final ");
                buffer.append("dao FunctionsDao");
                if (isSerializable)
                    buffer.append(" serializable 1 ");
                buffer.append(" {");
                for (String procedure : procedures.keySet()) {
                    // System.out.println("QQQQQ " + pojo);
                    if (!daoOnlyTables.isEmpty() && !daoOnlyTables.contains(procedure))
                        continue;
                    if (daoIgnoreTables.contains(procedure))
                        continue;
                    boolean isFunction = functions.containsKey(procedure);
                    if (!isFunction)
                        continue;
                    buffer.append("\n    ");
                    String pojoName = tableNames.get(procedure);
                    if (pojoName == null)
                        pojoName = procedure;
                    pojoName = tableToCamelCase(pojoName);
                    String procedureName = lowerFirstChar(pojoName);
                    Map<String, PojoAttribute> attributes = procedures.get(procedure);
                    if (metaFunctionsResultSet.containsKey(procedure)) {
                        buffer.append("callQueryFunction ").append(procedureName).append(" :java.util.List<:")
                                .append(tableToCamelCase(metaFunctionsResultSet.get(procedure))).append(">");
                    } else if (metaFunctionsResult.containsKey(procedure)) {
                        buffer.append("callFunction ").append(procedureName).append(" :")
                                .append(metaType2className(metaFunctionsResult.get(procedure)));
                    } else {
                        PojoAttribute returnAttribute = (attributes.containsKey(FAKE_FUN_PROC_COLUMN_NAME)) ? attributes
                                .get(FAKE_FUN_PROC_COLUMN_NAME) : null;
                        if (returnAttribute != null) {
                            buffer.append("callQueryFunction ").append(procedureName).append(" :")
                                    .append(returnAttribute.getClassName());
                        } else {
                            buffer.append("callUpdateFunction ").append(procedureName).append(" _void");
                        }
                    }
                    buffer.append(" ::: ").append(lowerFirstChar(pojoName)).append(" ::").append(pojoName);
                }
                buffer.append("\n  }\n");
            }
            hasFunctions = false;
            for (String pojo : functions.keySet()) {
                // System.out.println("QQQQQ " + pojo);
                if (!daoOnlyTables.isEmpty() && !daoOnlyTables.contains(pojo))
                    continue;
                if (daoIgnoreTables.contains(pojo))
                    continue;
                boolean isProcedure = procedures.containsKey(pojo);
                if (!isProcedure) {
                    hasFunctions = true;
                    break;
                }
            }
            if (hasFunctions && !finalDaos.contains("FunctionsDao")) {
                buffer.append("\n  ");
                if (daoMakeItFinal)
                    buffer.append("final ");
                buffer.append("dao FunctionsDao");
                if (isSerializable)
                    buffer.append(" serializable 1 ");
                buffer.append(" {");
                for (String function : functions.keySet()) {
                    // System.out.println("QQQQQ " + pojo);
                    if (!daoOnlyTables.isEmpty() && !daoOnlyTables.contains(function))
                        continue;
                    if (daoIgnoreTables.contains(function))
                        continue;
                    boolean isProcedure = procedures.containsKey(function);
                    if (isProcedure)
                        continue;
                    buffer.append("\n    ");
                    String pojoName = tableNames.get(function);
                    if (pojoName == null)
                        pojoName = function;
                    pojoName = tableToCamelCase(pojoName);
                    String functionName = lowerFirstChar(pojoName);
                    Map<String, PojoAttribute> attributes = functions.get(function);
                    if (metaFunctionsResultSet.containsKey(function)) {
                        buffer.append("callQueryFunction ").append(functionName).append(" :java.util.List<:")
                                .append(tableToCamelCase(metaFunctionsResultSet.get(function))).append(">");
                    } else if (metaFunctionsResult.containsKey(function) && dbType == DbType.DB2) {
                        buffer.append("callSelectFunction ").append(functionName).append(" :")
                                .append(metaType2className(metaFunctionsResult.get(function)));
                    } else if (metaFunctionsResult.containsKey(function)) {
                        buffer.append("callFunction ").append(functionName).append(" :")
                                .append(metaType2className(metaFunctionsResult.get(function)));
                    } else {
                        PojoAttribute returnAttribute = (attributes.containsKey(FAKE_FUN_PROC_COLUMN_NAME)) ? attributes
                                .get(FAKE_FUN_PROC_COLUMN_NAME) : null;
                        if (returnAttribute != null) {
                            buffer.append("callQueryFunction ").append(functionName).append(" :")
                                    .append(returnAttribute.getClassName());
                        } else {
                            buffer.append("callUpdateFunction ").append(functionName).append(" _void");
                        }
                    }
                    buffer.append(" ::: ").append(lowerFirstChar(pojoName)).append(" ::").append(pojoName);
                }
                buffer.append("\n  }\n");
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

    protected void toInits(String pojo, Map<String, String> toInit) {
        for (Map.Entry<String, PojoAttribute> pentry : pojos.get(pojo).entrySet()) {
            if (ignoreColumns.containsKey(pojo) && ignoreColumns.get(pojo).contains(pentry.getKey()))
                continue;
            PojoAttribute attribute = pentry.getValue();
            String name = (columnNames.containsKey(pojo)) ? columnNames.get(pojo).get(pentry.getKey()) : null;
            if (name == null)
                name = attribute.getName();
            else
                name = columnToCamelCase(name);
            if (attribute.toInit()) {
                if (attribute.getRef() != null) {
                    if (pojoInheritanceDiscriminator.containsKey(attribute.getRef())
                            || pojoInheritanceSimple.containsKey(attribute.getRef())) {
                        toInit.put(name, attribute.getRef());
                        // System.out.println("AAAAAAAAA " + " " + pojo + " " + attribute.getRef() + " " + name);
                    }
                }
            }
        }
        if (pojoExtends.containsKey(pojo)) {
            toInits(pojoExtends.get(pojo), toInit);
        }
    }
}
