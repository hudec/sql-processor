package org.sqlproc.dsl.ui.templates;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

import org.eclipse.xtext.scoping.IScopeProvider;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.property.ModelProperty;

public class TableDaoConverter extends TableMetaConverter {

    private boolean debug = false;

    public TableDaoConverter() {
        super();
    }

    public TableDaoConverter(ModelProperty modelProperty, Artifacts artifacts, IScopeProvider scopeProvider) {
        super(modelProperty, artifacts, null);
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
