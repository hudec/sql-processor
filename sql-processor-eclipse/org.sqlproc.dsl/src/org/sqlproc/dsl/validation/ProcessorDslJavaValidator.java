package org.sqlproc.dsl.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.validation.Check;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.processorDsl.MappingRule;
import org.sqlproc.dsl.processorDsl.MetaStatement;
import org.sqlproc.dsl.processorDsl.OptionalFeature;
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
    public void checkOptionalFeature(OptionalFeature optionalFeature) {
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

    private boolean equalsStatement(MetaStatement statement1, MetaStatement statement2) {
        if (statement1 == null && statement2 == null) {
            return true;
        }
        if (statement1 == null || statement1.getName() == null) {
            return false;
        }
        if (statement2 == null || statement2.getName() == null) {
            return false;
        }
        if (statement1.getName().equalsIgnoreCase(statement2.getName()) && statement1.getType() == statement2.getType()) {
            if (statement1.getFilters() == null && statement2.getFilters() == null) {
                return true;
            }
            if (statement1.getFilters() == null) {
                return false;
            }
            if (statement2.getFilters() == null) {
                return false;
            }
            if (statement1.getFilters().isEmpty() && statement2.getFilters().isEmpty()) {
                return true;
            }
            // Filtry musi byt disjunktni, pro jednu shodu je vysledek komparace kladny
            for (String filter1 : statement1.getFilters()) {
                for (String filter2 : statement2.getFilters()) {
                    if (filter1.equalsIgnoreCase(filter2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean equalsRule(MappingRule rule1, MappingRule rule2) {
        if (rule1 == null && rule2 == null) {
            return true;
        }
        if (rule1 == null || rule1.getName() == null) {
            return false;
        }
        if (rule2 == null || rule2.getName() == null) {
            return false;
        }
        if (rule1.getName().equalsIgnoreCase(rule2.getName()) && rule1.getType() == rule2.getType()) {
            if (rule1.getFilters() == null && rule2.getFilters() == null) {
                return true;
            }
            if (rule1.getFilters() == null) {
                return false;
            }
            if (rule2.getFilters() == null) {
                return false;
            }
            if (rule1.getFilters().isEmpty() && rule2.getFilters().isEmpty()) {
                return true;
            }
            // Filtry musi byt disjunktni, pro jednu shodu je vysledek komparace kladny
            for (String filter1 : rule1.getFilters()) {
                for (String filter2 : rule2.getFilters()) {
                    if (filter1.equalsIgnoreCase(filter2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean equalsFeature(OptionalFeature feature1, OptionalFeature feature2) {
        if (feature1 == null && feature2 == null) {
            return true;
        }
        if (feature1 == null || feature1.getName() == null) {
            return false;
        }
        if (feature2 == null || feature2.getName() == null) {
            return false;
        }
        if (feature1.getName().equalsIgnoreCase(feature2.getName()) && feature1.getType() == feature2.getType()) {
            if (feature1.getFilters() == null && feature2.getFilters() == null) {
                return true;
            }
            if (feature1.getFilters() == null) {
                return false;
            }
            if (feature2.getFilters() == null) {
                return false;
            }
            if (feature1.getFilters().isEmpty() && feature2.getFilters().isEmpty()) {
                return true;
            }
            // Filtry musi byt disjunktni, pro jednu shodu je vysledek komparace kladny
            for (String filter1 : feature1.getFilters()) {
                for (String filter2 : feature2.getFilters()) {
                    if (filter1.equalsIgnoreCase(filter2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}