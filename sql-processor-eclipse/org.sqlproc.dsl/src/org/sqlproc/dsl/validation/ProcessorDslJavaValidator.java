package org.sqlproc.dsl.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.validation.Check;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.processorDsl.ColumnUsage;
import org.sqlproc.dsl.processorDsl.ConstantUsage;
import org.sqlproc.dsl.processorDsl.IdentifierUsage;
import org.sqlproc.dsl.processorDsl.MappingRule;
import org.sqlproc.dsl.processorDsl.MappingUsage;
import org.sqlproc.dsl.processorDsl.MetaStatement;
import org.sqlproc.dsl.processorDsl.OptionalFeature;
import org.sqlproc.dsl.processorDsl.PojoDefinition;
import org.sqlproc.dsl.processorDsl.PojoUsage;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

public class ProcessorDslJavaValidator extends AbstractProcessorDslJavaValidator {

    @Check
    public void checkUniqueMetaStatement(MetaStatement metaStatement) {
        Artifacts artifacts;
        EObject object = EcoreUtil.getRootContainer(metaStatement);
        if (!(object instanceof Artifacts))
            return;
        artifacts = (Artifacts) object;

        for (MetaStatement metaStmt : artifacts.getStatements()) {
            if (metaStmt == null || metaStmt == metaStatement)
                continue;
            if (equalsStatement(metaStatement, metaStmt)) {
                error("Duplicate name : " + metaStatement.getName() + "[" + metaStatement.getType() + "]",
                        ProcessorDslPackage.Literals.META_STATEMENT__NAME);
                return;
            }
        }
    }

    @Check
    public void checkUniqueMappingRule(MappingRule mappingRule) {
        Artifacts artifacts;
        EObject object = EcoreUtil.getRootContainer(mappingRule);
        if (!(object instanceof Artifacts))
            return;
        artifacts = (Artifacts) object;

        for (MappingRule rule : artifacts.getMappings()) {
            if (rule == null || rule == mappingRule)
                continue;
            if (equalsRule(mappingRule, rule)) {
                error("Duplicate name : " + mappingRule.getName() + "[" + mappingRule.getType() + "]",
                        ProcessorDslPackage.Literals.MAPPING_RULE__NAME);
                return;
            }
        }
    }

    @Check
    public void checkUniqueOptionalFeature(OptionalFeature optionalFeature) {
        Artifacts artifacts;
        EObject object = EcoreUtil.getRootContainer(optionalFeature);
        if (!(object instanceof Artifacts))
            return;
        artifacts = (Artifacts) object;

        for (OptionalFeature feature : artifacts.getFeatures()) {
            if (feature == null || feature == optionalFeature)
                continue;
            if (equalsFeature(optionalFeature, feature)) {
                error("Duplicate name : " + optionalFeature.getName() + "[" + optionalFeature.getType() + "]",
                        ProcessorDslPackage.Literals.OPTIONAL_FEATURE__NAME);
                return;
            }
        }
    }

    @Check
    public void checkUniquePojoDefinition(PojoDefinition pojoDefinition) {
        // if (!checkClass(pojoDefinition.getClass_()))
        // error("Class name : " + pojoDefinition.getClass_() + " not exists",
        // ProcessorDslPackage.Literals.POJO_DEFINITION__NAME);
        Artifacts artifacts;
        EObject object = EcoreUtil.getRootContainer(pojoDefinition);
        if (!(object instanceof Artifacts))
            return;
        artifacts = (Artifacts) object;
        for (PojoDefinition definition : artifacts.getPojos()) {
            if (definition == null || definition == pojoDefinition)
                continue;
            if (pojoDefinition.getName().equalsIgnoreCase(definition.getName())) {
                error("Duplicate name : " + pojoDefinition.getName(),
                        ProcessorDslPackage.Literals.POJO_DEFINITION__NAME);
                return;
            }
        }
    }

    @Check
    public void checkUniqueColumnUsage(ColumnUsage columnUsage) {
        Artifacts artifacts;
        EObject object = EcoreUtil.getRootContainer(columnUsage);
        if (!(object instanceof Artifacts))
            return;
        artifacts = (Artifacts) object;
        for (PojoUsage usage : artifacts.getUsages()) {
            if (usage == null || usage == columnUsage || !(usage instanceof ColumnUsage))
                continue;
            ColumnUsage column = (ColumnUsage) usage;
            if (column.getStatement() == null)
                continue;
            if (columnUsage.getStatement().getName().equalsIgnoreCase(column.getStatement().getName())) {
                error("Duplicate name : " + columnUsage.getStatement().getName() + "[col]",
                        ProcessorDslPackage.Literals.COLUMN_USAGE__STATEMENT);
                return;
            }
        }
    }

    @Check
    public void checkUniqueIdentifierUsage(IdentifierUsage identifierUsage) {
        Artifacts artifacts;
        EObject object = EcoreUtil.getRootContainer(identifierUsage);
        if (!(object instanceof Artifacts))
            return;
        artifacts = (Artifacts) object;
        for (PojoUsage usage : artifacts.getUsages()) {
            if (usage == null || usage == identifierUsage || !(usage instanceof IdentifierUsage))
                continue;
            IdentifierUsage ident = (IdentifierUsage) usage;
            if (ident.getStatement() == null)
                continue;
            if (identifierUsage.getStatement().getName().equalsIgnoreCase(ident.getStatement().getName())) {
                error("Duplicate name : " + identifierUsage.getStatement().getName() + "[ident]",
                        ProcessorDslPackage.Literals.IDENTIFIER_USAGE__STATEMENT);
                return;
            }
        }
    }

    @Check
    public void checkUniqueConstantUsage(ConstantUsage constantUsage) {
        Artifacts artifacts;
        EObject object = EcoreUtil.getRootContainer(constantUsage);
        if (!(object instanceof Artifacts))
            return;
        artifacts = (Artifacts) object;
        for (PojoUsage usage : artifacts.getUsages()) {
            if (usage == null || usage == constantUsage || !(usage instanceof ConstantUsage))
                continue;
            ConstantUsage constant = (ConstantUsage) usage;
            if (constant.getStatement() == null)
                continue;
            if (constantUsage.getStatement().getName().equalsIgnoreCase(constant.getStatement().getName())) {
                error("Duplicate name : " + constantUsage.getStatement().getName() + "[const]",
                        ProcessorDslPackage.Literals.CONSTANT_USAGE__STATEMENT);
                return;
            }
        }
    }

    @Check
    public void checkUniqueMappingUsage(MappingUsage mappingUsage) {
        Artifacts artifacts;
        EObject object = EcoreUtil.getRootContainer(mappingUsage);
        if (!(object instanceof Artifacts))
            return;
        artifacts = (Artifacts) object;
        for (PojoUsage usage : artifacts.getUsages()) {
            if (usage == null || usage == mappingUsage || !(usage instanceof MappingUsage))
                continue;
            MappingUsage mapping = (MappingUsage) usage;
            if (mapping.getStatement() == null)
                continue;
            if (mappingUsage.getStatement().getName().equalsIgnoreCase(mapping.getStatement().getName())) {
                error("Duplicate name : " + mappingUsage.getStatement().getName() + "[col]",
                        ProcessorDslPackage.Literals.MAPPING_USAGE__STATEMENT);
                return;
            }
        }
    }

    private boolean equalsStatement(MetaStatement statement1, MetaStatement statement2) {
        if (statement1 == null && statement2 == null)
            return true;
        if (statement1 == null || statement1.getName() == null)
            return false;
        if (statement2 == null || statement2.getName() == null)
            return false;
        if (statement1.getName().equalsIgnoreCase(statement2.getName()) && statement1.getType() == statement2.getType()) {
            if (statement1.getFilters() == null && statement2.getFilters() == null)
                return true;
            if (statement1.getFilters() == null)
                return false;
            if (statement2.getFilters() == null)
                return false;
            if (statement1.getFilters().isEmpty() && statement2.getFilters().isEmpty())
                return true;
            // Filtry musi byt disjunktni, pro jednu shodu je vysledek komparace kladny
            for (String filter1 : statement1.getFilters())
                for (String filter2 : statement2.getFilters())
                    if (filter1.equalsIgnoreCase(filter2))
                        return true;
        }
        return false;
    }

    private boolean equalsRule(MappingRule rule1, MappingRule rule2) {
        if (rule1 == null && rule2 == null)
            return true;
        if (rule1 == null || rule1.getName() == null)
            return false;
        if (rule2 == null || rule2.getName() == null)
            return false;
        if (rule1.getName().equalsIgnoreCase(rule2.getName()) && rule1.getType() == rule2.getType()) {
            if (rule1.getFilters() == null && rule2.getFilters() == null)
                return true;
            if (rule1.getFilters() == null)
                return false;
            if (rule2.getFilters() == null)
                return false;
            if (rule1.getFilters().isEmpty() && rule2.getFilters().isEmpty())
                return true;
            // Filtry musi byt disjunktni, pro jednu shodu je vysledek komparace kladny
            for (String filter1 : rule1.getFilters())
                for (String filter2 : rule2.getFilters())
                    if (filter1.equalsIgnoreCase(filter2))
                        return true;
        }
        return false;
    }

    private boolean equalsFeature(OptionalFeature feature1, OptionalFeature feature2) {
        if (feature1 == null && feature2 == null)
            return true;
        if (feature1 == null || feature1.getName() == null)
            return false;
        if (feature2 == null || feature2.getName() == null)
            return false;
        if (feature1.getName().equalsIgnoreCase(feature2.getName()) && feature1.getType() == feature2.getType()) {
            if (feature1.getFilters() == null && feature2.getFilters() == null)
                return true;
            if (feature1.getFilters() == null)
                return false;
            if (feature2.getFilters() == null)
                return false;
            if (feature1.getFilters().isEmpty() && feature2.getFilters().isEmpty())
                return true;
            // Filtry musi byt disjunktni, pro jednu shodu je vysledek komparace kladny
            for (String filter1 : feature1.getFilters())
                for (String filter2 : feature2.getFilters())
                    if (filter1.equalsIgnoreCase(filter2))
                        return true;
        }
        return false;
    }

    private boolean checkClass(String className) {
        if (className == null)
            return true;
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}