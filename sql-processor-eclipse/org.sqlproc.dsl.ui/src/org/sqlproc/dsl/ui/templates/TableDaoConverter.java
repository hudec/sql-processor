package org.sqlproc.dsl.ui.templates;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.property.ModelProperty;

public class TableDaoConverter extends TableMetaConverter {

    private boolean debug = false;

    protected Set<String> daoIgnoreTables = new HashSet<String>();
    protected Set<String> daoOnlyTables = new HashSet<String>();
    protected Map<String, Set<String>> daoImplementsInterfaces;
    protected JvmType daoControlClass;

    public TableDaoConverter() {
        super();
    }

    public TableDaoConverter(ModelProperty modelProperty, Artifacts artifacts, IScopeProvider scopeProvider) {
        super(modelProperty, artifacts, null);

        Set<String> daoIgnoreTables = modelProperty.getDaoIgnoreTables(artifacts);
        if (daoIgnoreTables != null) {
            this.daoIgnoreTables.addAll(daoIgnoreTables);
        }
        Set<String> daoOnlyTables = modelProperty.getDaoOnlyTables(artifacts);
        if (daoOnlyTables != null) {
            this.daoOnlyTables.addAll(daoOnlyTables);
        }
        Map<String, Set<String>> daoImplementsInterfaces = modelProperty.getDaoImplementsInterfaces(artifacts);
        if (daoImplementsInterfaces != null) {
            this.daoImplementsInterfaces.putAll(daoImplementsInterfaces);
        }
        this.daoControlClass = modelProperty.getDaoControlClass(artifacts);

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
