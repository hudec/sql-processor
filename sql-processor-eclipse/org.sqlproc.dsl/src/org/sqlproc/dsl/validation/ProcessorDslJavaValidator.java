package org.sqlproc.dsl.validation;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.validation.Check;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.processorDsl.Column;
import org.sqlproc.dsl.processorDsl.ColumnUsage;
import org.sqlproc.dsl.processorDsl.Constant;
import org.sqlproc.dsl.processorDsl.ConstantUsage;
import org.sqlproc.dsl.processorDsl.Identifier;
import org.sqlproc.dsl.processorDsl.IdentifierUsage;
import org.sqlproc.dsl.processorDsl.MappingColumn;
import org.sqlproc.dsl.processorDsl.MappingItem;
import org.sqlproc.dsl.processorDsl.MappingRule;
import org.sqlproc.dsl.processorDsl.MappingUsage;
import org.sqlproc.dsl.processorDsl.MetaStatement;
import org.sqlproc.dsl.processorDsl.OptionalFeature;
import org.sqlproc.dsl.processorDsl.PojoDefinition;
import org.sqlproc.dsl.processorDsl.PojoUsage;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;
import org.sqlproc.dsl.processorDsl.TableDefinition;
import org.sqlproc.dsl.processorDsl.TableUsage;
import org.sqlproc.dsl.resolver.DbResolver;
import org.sqlproc.dsl.resolver.PojoResolverFactory;

import com.google.inject.Inject;

public class ProcessorDslJavaValidator extends AbstractProcessorDslJavaValidator {

    @Inject
    PojoResolverFactory pojoResolverFactory;

    @Inject
    DbResolver dbResolver;

    @Inject
    IScopeProvider scopeProvider;

    public enum ValidationResult {
        OK, WARNING, ERROR;
    }

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
        if (isResolvePojo() && !checkClass(pojoDefinition.getClass_()))
            error("Class name : " + pojoDefinition.getClass_() + " not exists",
                    ProcessorDslPackage.Literals.POJO_DEFINITION__NAME);
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

    protected boolean equalsStatement(MetaStatement statement1, MetaStatement statement2) {
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

    protected boolean equalsRule(MappingRule rule1, MappingRule rule2) {
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

    protected boolean equalsFeature(OptionalFeature feature1, OptionalFeature feature2) {
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

    protected boolean checkClass(String className) {
        if (className == null || pojoResolverFactory.getPojoResolver() == null)
            return true;

        Class<?> clazz = pojoResolverFactory.getPojoResolver().loadClass(className);
        return clazz != null;
    }

    @Check
    public void checkColumn(Column column) {
        if (!isResolvePojo())
            return;
        String columnUsageClass = null;
        MappingUsage mappingUsage = null;
        MetaStatement statement = EcoreUtil2.getContainerOfType(column, MetaStatement.class);
        Artifacts artifacts = EcoreUtil2.getContainerOfType(statement, Artifacts.class);
        IScope scope = scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__USAGES);
        Iterable<IEObjectDescription> iterable = scope.getAllElements();
        for (Iterator<IEObjectDescription> iter = iterable.iterator(); iter.hasNext();) {
            IEObjectDescription description = iter.next();
            if (QualifiedName.create(statement.getName()).equals(description.getName())) {
                PojoUsage pojoUsage = (PojoUsage) artifacts.eResource().getResourceSet()
                        .getEObject(description.getEObjectURI(), true);
                if (pojoUsage instanceof ColumnUsage) {
                    columnUsageClass = ((ColumnUsage) pojoUsage).getPojo().getClass_();
                }
                if (pojoUsage instanceof MappingUsage) {
                    mappingUsage = (MappingUsage) pojoUsage;
                }
            }
        }
        if (mappingUsage != null && mappingUsage.getStatement() != null
                && mappingUsage.getStatement().getMapping() != null
                && mappingUsage.getStatement().getMapping().getMappingItems() != null) {
            for (MappingItem mappingItem : mappingUsage.getStatement().getMapping().getMappingItems()) {
                if (mappingItem.getCol().equals(column.getName()))
                    return;
            }
        }
        switch (checkClassProperty(columnUsageClass, column.getName())) {
        case WARNING:
            warning("Problem property : " + column.getName() + "[" + columnUsageClass + "]",
                    ProcessorDslPackage.Literals.COLUMN__NAME);
            break;
        case ERROR:
            error("Cannot find property : " + column.getName() + "[" + columnUsageClass + "]",
                    ProcessorDslPackage.Literals.COLUMN__NAME);
            break;
        }
    }

    @Check
    public void checkIdentifier(Identifier identifier) {
        if (!isResolvePojo())
            return;
        String identifierUsageClass = null;
        MetaStatement statement = EcoreUtil2.getContainerOfType(identifier, MetaStatement.class);
        Artifacts artifacts = EcoreUtil2.getContainerOfType(statement, Artifacts.class);
        IScope scope = scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__USAGES);
        Iterable<IEObjectDescription> iterable = scope.getAllElements();
        for (Iterator<IEObjectDescription> iter = iterable.iterator(); iter.hasNext();) {
            IEObjectDescription description = iter.next();
            if (QualifiedName.create(statement.getName()).equals(description.getName())) {
                PojoUsage pojoUsage = (PojoUsage) artifacts.eResource().getResourceSet()
                        .getEObject(description.getEObjectURI(), true);
                if (pojoUsage instanceof IdentifierUsage) {
                    identifierUsageClass = ((IdentifierUsage) pojoUsage).getPojo().getClass_();
                    break;
                }
            }
        }
        switch (checkClassProperty(identifierUsageClass, identifier.getName())) {
        case WARNING:
            warning("Problem property : " + identifier.getName() + "[" + identifierUsageClass + "]",
                    ProcessorDslPackage.Literals.IDENTIFIER__NAME);
            break;
        case ERROR:
            error("Cannot find property : " + identifier.getName() + "[" + identifierUsageClass + "]",
                    ProcessorDslPackage.Literals.IDENTIFIER__NAME);
            break;
        }
    }

    @Check
    public void checkConstant(Constant constant) {
        if (!isResolvePojo())
            return;
        String constantUsageClass = null;
        MetaStatement statement = EcoreUtil2.getContainerOfType(constant, MetaStatement.class);
        Artifacts artifacts = EcoreUtil2.getContainerOfType(statement, Artifacts.class);
        IScope scope = scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__USAGES);
        Iterable<IEObjectDescription> iterable = scope.getAllElements();
        for (Iterator<IEObjectDescription> iter = iterable.iterator(); iter.hasNext();) {
            IEObjectDescription description = iter.next();
            if (QualifiedName.create(statement.getName()).equals(description.getName())) {
                PojoUsage pojoUsage = (PojoUsage) artifacts.eResource().getResourceSet()
                        .getEObject(description.getEObjectURI(), true);
                if (pojoUsage instanceof ConstantUsage) {
                    constantUsageClass = ((ConstantUsage) pojoUsage).getPojo().getClass_();
                    break;
                }
            }
        }
        switch (checkClassProperty(constantUsageClass, constant.getName())) {
        case WARNING:
            warning("Problem property : " + constant.getName() + "[" + constantUsageClass + "]",
                    ProcessorDslPackage.Literals.CONSTANT__NAME);
            break;
        case ERROR:
            error("Cannot find property : " + constant.getName() + "[" + constantUsageClass + "]",
                    ProcessorDslPackage.Literals.CONSTANT__NAME);
            break;
        }
    }

    @Check
    public void checkMappingColumn(MappingColumn identifier) {
        if (!isResolvePojo())
            return;
        String mappingUsageClass = null;
        MappingRule rule = EcoreUtil2.getContainerOfType(identifier, MappingRule.class);
        Artifacts artifacts = EcoreUtil2.getContainerOfType(rule, Artifacts.class);
        IScope scope = scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__USAGES);
        Iterable<IEObjectDescription> iterable = scope.getAllElements();
        for (Iterator<IEObjectDescription> iter = iterable.iterator(); iter.hasNext();) {
            IEObjectDescription description = iter.next();
            if (QualifiedName.create(rule.getName()).equals(description.getName())) {
                PojoUsage pojoUsage = (PojoUsage) artifacts.eResource().getResourceSet()
                        .getEObject(description.getEObjectURI(), true);
                if (pojoUsage instanceof MappingUsage) {
                    mappingUsageClass = ((MappingUsage) pojoUsage).getPojo().getClass_();
                    break;
                }
            }
        }
        switch (checkClassProperty(mappingUsageClass, identifier.getName())) {
        case WARNING:
            warning("Problem property : " + identifier.getName() + "[" + mappingUsageClass + "]",
                    ProcessorDslPackage.Literals.MAPPING_COLUMN__NAME);
            break;
        case ERROR:
            error("Cannot find property : " + identifier.getName() + "[" + mappingUsageClass + "]",
                    ProcessorDslPackage.Literals.MAPPING_COLUMN__NAME);
            break;

        }
    }

    protected boolean isNumber(String param) {
        if (param == null)
            return false;
        for (int i = param.length() - 1; i >= 0; i--) {
            if (!Character.isDigit(param.charAt(i)))
                return false;
        }
        return true;
    }

    protected boolean isPrimitive(Class<?> clazz) {
        if (clazz == null)
            return true;
        if (clazz.isPrimitive())
            return true;
        if (clazz == String.class)
            return true;
        if (clazz == java.util.Date.class)
            return true;
        if (clazz == java.sql.Date.class)
            return true;
        if (clazz == java.sql.Time.class)
            return true;
        if (clazz == java.sql.Timestamp.class)
            return true;
        if (clazz == java.sql.Blob.class)
            return true;
        if (clazz == java.sql.Clob.class)
            return true;
        if (clazz == java.math.BigDecimal.class)
            return true;
        if (clazz == java.math.BigInteger.class)
            return true;
        return false;
    }

    /**
     * Validation property of class
     * 
     * @param className
     * @param property
     * @return validation result
     */
    protected ValidationResult checkClassProperty(String className, String property) {
        if (property == null || isNumber(property) || pojoResolverFactory.getPojoResolver() == null)
            return ValidationResult.OK;
        if (className == null)
            return ValidationResult.ERROR;
        PropertyDescriptor[] descriptors = pojoResolverFactory.getPojoResolver().getPropertyDescriptors(className);
        if (descriptors == null)
            return ValidationResult.WARNING;
        String checkProperty = property;
        int pos1 = checkProperty.indexOf('=');
        if (pos1 > 0) {
            int pos2 = checkProperty.indexOf('.', pos1);
            if (pos2 > pos1)
                checkProperty = checkProperty.substring(0, pos1) + checkProperty.substring(pos2);
        }
        String innerProperty = null;
        pos1 = checkProperty.indexOf('.');
        if (pos1 > 0) {
            innerProperty = checkProperty.substring(pos1 + 1);
            checkProperty = checkProperty.substring(0, pos1);
        }
        PropertyDescriptor innerDesriptor = null;
        for (PropertyDescriptor descriptor : descriptors) {
            if (descriptor.getName().equals(checkProperty)) {
                innerDesriptor = descriptor;
                break;
            }
        }
        if (innerDesriptor == null) {
            Class<?> clazz = pojoResolverFactory.getPojoResolver().loadClass(className);
            if (clazz != null && Modifier.isAbstract(clazz.getModifiers()))
                return ValidationResult.WARNING;
            return ValidationResult.ERROR;
        }
        if (innerProperty != null) {
            Class<?> innerClass = innerDesriptor.getPropertyType();
            if (innerClass.isArray()) {
                ParameterizedType type = (ParameterizedType) innerDesriptor.getReadMethod().getGenericReturnType();
                if (type.getActualTypeArguments() == null || type.getActualTypeArguments().length == 0)
                    return ValidationResult.WARNING;
                innerClass = (Class<?>) type.getActualTypeArguments()[0];
                if (isPrimitive(innerClass))
                    return ValidationResult.ERROR;
                return checkClassProperty(innerClass.getName(), innerProperty);
            } else if (Collection.class.isAssignableFrom(innerClass)) {
                ParameterizedType type = (ParameterizedType) innerDesriptor.getReadMethod().getGenericReturnType();
                if (type.getActualTypeArguments() == null || type.getActualTypeArguments().length == 0)
                    return ValidationResult.WARNING;
                innerClass = (Class<?>) type.getActualTypeArguments()[0];
                if (isPrimitive(innerClass))
                    return ValidationResult.ERROR;
                return checkClassProperty(innerClass.getName(), innerProperty);
            } else {
                if (isPrimitive(innerClass))
                    return ValidationResult.ERROR;
                return checkClassProperty(innerClass.getName(), innerProperty);
            }
        }
        return ValidationResult.OK;
    }

    @Check
    public void checkTableDefinition(TableDefinition tableDefinition) {
        Artifacts artifacts;
        EObject object = EcoreUtil.getRootContainer(tableDefinition);
        if (!(object instanceof Artifacts))
            return;
        artifacts = (Artifacts) object;
        for (TableDefinition table : artifacts.getTables()) {
            if (table == null || table == tableDefinition)
                continue;
            if (tableDefinition.getName().equalsIgnoreCase(table.getName())) {
                error("Duplicate name : " + tableDefinition.getName() + "[table]",
                        ProcessorDslPackage.Literals.TABLE_DEFINITION__NAME);
                return;
            }
        }
        if (isResolveDb() && !dbResolver.checkTable(tableDefinition.getName())) {
            error("Cannot find table in DB : " + tableDefinition.getName(),
                    ProcessorDslPackage.Literals.TABLE_DEFINITION__NAME);
        }
    }

    @Check
    public void checkTableUsage(TableUsage tableUsage) {
        Artifacts artifacts;
        EObject object = EcoreUtil.getRootContainer(tableUsage);
        if (!(object instanceof Artifacts))
            return;
        artifacts = (Artifacts) object;
        for (TableUsage usage : artifacts.getTableUsages()) {
            if (usage == null || usage == tableUsage)
                continue;
            if (tableUsage.getStatement().getName().equalsIgnoreCase(usage.getStatement().getName())
                    && tableUsage.getTable().getName().equalsIgnoreCase(usage.getTable().getName())
                    && tableUsage.getPrefix().equalsIgnoreCase(usage.getPrefix())) {
                error("Duplicate name : " + tableUsage.getStatement().getName() + "[" + tableUsage.getTable().getName()
                        + ":" + tableUsage.getPrefix() + "][dbcol]", ProcessorDslPackage.Literals.TABLE_USAGE__PREFIX);
                return;
            }
        }
    }

    protected boolean isResolvePojo() {
        if (pojoResolverFactory.getPojoResolver() == null || !pojoResolverFactory.getPojoResolver().isResolvePojo())
            return false;
        return true;

    }

    protected boolean isResolveDb() {
        return dbResolver.isResolveDb();
    }
}