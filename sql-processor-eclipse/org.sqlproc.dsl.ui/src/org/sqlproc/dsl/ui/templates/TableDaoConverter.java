package org.sqlproc.dsl.ui.templates;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.property.ModelProperty;

public class TableDaoConverter extends TableMetaConverter {

    private boolean debug = false;

    protected Set<String> finalDaos;
    protected Set<String> daoIgnoreTables = new HashSet<String>();
    protected Set<String> daoOnlyTables = new HashSet<String>();
    protected Map<String, String> daoImplementsInterfaces = new HashMap<String, String>();
    protected JvmType daoControlClass;
    protected Map<String, JvmType> daoToImplements = new HashMap<String, JvmType>();
    protected JvmType daoToExtends = null;

    public TableDaoConverter() {
        super();
    }

    public TableDaoConverter(ModelProperty modelProperty, Artifacts artifacts, IScopeProvider scopeProvider,
            Set<String> finalDaos) {
        super(modelProperty, artifacts, null);

        this.finalDaos = finalDaos;

        Set<String> daoIgnoreTables = modelProperty.getDaoIgnoreTables(artifacts);
        if (daoIgnoreTables != null) {
            this.daoIgnoreTables.addAll(daoIgnoreTables);
        }
        Set<String> daoOnlyTables = modelProperty.getDaoOnlyTables(artifacts);
        if (daoOnlyTables != null) {
            this.daoOnlyTables.addAll(daoOnlyTables);
        }
        Map<String, String> daoImplementsInterfaces = modelProperty.getDaoImplementsInterfaces(artifacts);
        if (daoImplementsInterfaces != null) {
            this.daoImplementsInterfaces.putAll(daoImplementsInterfaces);
        }
        this.daoControlClass = modelProperty.getDaoControlParameter(artifacts);
        Map<String, JvmType> daoToImplements = modelProperty.getDaoToImplements(artifacts);
        if (daoToImplements != null) {
            this.daoToImplements.putAll(daoToImplements);
        }
        this.daoToExtends = modelProperty.getDaoToExtends(artifacts);

        if (debug) {
            System.out.println("daoIgnoreTables " + this.daoIgnoreTables);
            System.out.println("daoOnlyTables " + this.daoOnlyTables);
            System.out.println("daoImplementsInterfaces " + this.daoImplementsInterfaces);
            System.out.println("daoControlClass " + this.daoControlClass);
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
            }

            StringBuilder buffer = new StringBuilder();
            boolean isSerializable = false;
            if (!daoToImplements.isEmpty()) {
                for (JvmType type : daoToImplements.values()) {
                    if (type.getIdentifier().endsWith("Serializable")) {
                        isSerializable = true;
                        continue;
                    }
                    buffer.append("\n  implements ").append(type.getIdentifier());
                }
            }
            if (daoToExtends != null) {
                buffer.append("\n  extends ").append(daoToExtends.getIdentifier());
            }
            if (!daoToImplements.isEmpty() || daoToExtends != null) {
                buffer.append("\n");
            }
            for (String pojo : pojos.keySet()) {
                // System.out.println("QQQQQ " + pojo);
                if (!daoOnlyTables.isEmpty() && !daoOnlyTables.contains(pojo))
                    continue;
                if (daoIgnoreTables.contains(pojo))
                    continue;
                if (finalDaos.contains(tableToCamelCase(pojo)))
                    continue;
                String pojoName = tableNames.get(pojo);
                if (pojoName == null)
                    pojoName = pojo;
                if (pojoInheritanceDiscriminator.containsKey(pojo) || pojoInheritanceSimple.containsKey(pojo)) {
                    if (!notAbstractTables.contains(pojo))
                        continue;
                }
                buffer.append("\n  ");
                buffer.append("dao ");
                buffer.append(tableToCamelCase(pojoName)).append("Dao");
                buffer.append(" :: ").append(tableToCamelCase(pojoName));
                if (daoImplementsInterfaces.containsKey(pojo))
                    buffer.append(" implementation package ").append(daoImplementsInterfaces.get(pojo));
                if (isSerializable)
                    buffer.append(" serializable 1 ");
                buffer.append(" {");
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
}
