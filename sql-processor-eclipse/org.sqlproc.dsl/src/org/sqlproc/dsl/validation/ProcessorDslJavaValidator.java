package org.sqlproc.dsl.validation;

import static org.sqlproc.dsl.util.Constants.COLUMN_USAGE;
import static org.sqlproc.dsl.util.Constants.COLUMN_USAGE_EXTENDED;
import static org.sqlproc.dsl.util.Constants.CONSTANT_USAGE;
import static org.sqlproc.dsl.util.Constants.CONSTANT_USAGE_EXTENDED;
import static org.sqlproc.dsl.util.Constants.IDENTIFIER_USAGE;
import static org.sqlproc.dsl.util.Constants.IDENTIFIER_USAGE_EXTENDED;
import static org.sqlproc.dsl.util.Constants.MAPPING_USAGE;
import static org.sqlproc.dsl.util.Constants.MAPPING_USAGE_EXTENDED;
import static org.sqlproc.dsl.util.Constants.TABLE_USAGE;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.validation.Check;
import org.sqlproc.dsl.processorDsl.AbstractPojoEntity;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.processorDsl.Column;
import org.sqlproc.dsl.processorDsl.Constant;
import org.sqlproc.dsl.processorDsl.DatabaseColumn;
import org.sqlproc.dsl.processorDsl.DatabaseTable;
import org.sqlproc.dsl.processorDsl.FunctionDefinition;
import org.sqlproc.dsl.processorDsl.Identifier;
import org.sqlproc.dsl.processorDsl.MappingColumn;
import org.sqlproc.dsl.processorDsl.MappingRule;
import org.sqlproc.dsl.processorDsl.MetaSql;
import org.sqlproc.dsl.processorDsl.MetaStatement;
import org.sqlproc.dsl.processorDsl.OptionalFeature;
import org.sqlproc.dsl.processorDsl.PackageDeclaration;
import org.sqlproc.dsl.processorDsl.PojoDao;
import org.sqlproc.dsl.processorDsl.PojoDefinition;
import org.sqlproc.dsl.processorDsl.PojoEntity;
import org.sqlproc.dsl.processorDsl.PojoProperty;
import org.sqlproc.dsl.processorDsl.ProcedureDefinition;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;
import org.sqlproc.dsl.processorDsl.Property;
import org.sqlproc.dsl.processorDsl.TableDefinition;
import org.sqlproc.dsl.property.ModelProperty;
import org.sqlproc.dsl.resolver.DbResolver;
import org.sqlproc.dsl.resolver.PojoResolverFactory;
import org.sqlproc.dsl.util.Utils;

import com.google.inject.Inject;

public class ProcessorDslJavaValidator extends AbstractProcessorDslJavaValidator {

    @Inject
    PojoResolverFactory pojoResolverFactory;

    @Inject
    DbResolver dbResolver;

    @Inject
    IScopeProvider scopeProvider;

    @Inject
    IQualifiedNameConverter qualifiedNameConverter;

    @Inject
    ModelProperty modelProperty;

    public enum ValidationResult {
        OK, WARNING, ERROR;
    }

    private static final List<String> F_TYPES = Collections.unmodifiableList(Arrays.asList(new String[] { "set",
            "update", "values", "where", "set=opt", "where=opt" }));

    @Check
    public void checkMetaSqlFtype(MetaSql metaSql) {
        if (metaSql.getFtype() == null)
            return;
        if (!findInListIgnoreCase(F_TYPES, metaSql.getFtype())) {
            error("Invalid ftype : " + metaSql.getFtype(), ProcessorDslPackage.Literals.META_SQL__FTYPE);
        }
    }

    private boolean findInListIgnoreCase(List<String> list, String value) {
        if (list == null)
            return false;
        for (String item : list) {
            if (item.equalsIgnoreCase(value))
                return true;
        }
        return false;
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
        if (isResolvePojo(pojoDefinition) && !checkClass(pojoDefinition.getClass_()))
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
            if (pojoDefinition.getName().equals(definition.getName())) {
                error("Duplicate name : " + pojoDefinition.getName(),
                        ProcessorDslPackage.Literals.POJO_DEFINITION__NAME);
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
        if (statement1.getName().equals(statement2.getName()) && statement1.getType().equals(statement2.getType())) {
            return equalsModifiers(statement1.getModifiers(), statement2.getModifiers());
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
        if (rule1.getName().equals(rule2.getName()) && rule1.getType().equals(rule2.getType())) {
            return equalsModifiers(rule1.getModifiers(), rule2.getModifiers());
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
        if (feature1.getName().equals(feature2.getName()) && feature1.getType().equals(feature2.getType())) {
            return equalsModifiers(feature1.getModifiers(), feature2.getModifiers());
        }
        return false;
    }

    protected boolean equalsModifiers(List<String> modifiers1, List<String> modifiers2) {
        List<String> filteredModifiers1 = filteredModifiers(modifiers1);
        List<String> filteredModifiers2 = filteredModifiers(modifiers2);
        if (filteredModifiers1 == null && filteredModifiers2 == null)
            return true;
        if (filteredModifiers1 == null)
            return false;
        if (filteredModifiers2 == null)
            return false;
        if (filteredModifiers1.isEmpty() && filteredModifiers2.isEmpty())
            return true;
        // Filtry musi byt disjunktni, pro jednu shodu je vysledek komparace kladny
        for (String modifier1 : filteredModifiers1)
            for (String modifier2 : filteredModifiers2)
                if (modifier1.equals(modifier2))
                    return true;
        return false;
    }

    protected List<String> filteredModifiers(List<String> modifiers) {
        if (modifiers == null)
            return null;
        List<String> filteredModifiers = new ArrayList<String>();
        for (String modifier : modifiers) {
            if (modifier.indexOf('=') < 0)
                filteredModifiers.add(modifier);
        }
        return filteredModifiers;
    }

    protected boolean checkClass(String className) {
        if (className == null || pojoResolverFactory.getPojoResolver() == null)
            return true;

        Class<?> clazz = pojoResolverFactory.getPojoResolver().loadClass(className);
        return clazz != null;
    }

    @Check
    public void checkColumn(Column column) {
        if (!isResolvePojo(column))
            return;
        String columnName = Utils.getName(column);
        if (Utils.isNumber(columnName))
            return;
        MetaStatement statement = EcoreUtil2.getContainerOfType(column, MetaStatement.class);
        Artifacts artifacts = EcoreUtil2.getContainerOfType(statement, Artifacts.class);

        String entityName = Utils.getTokenFromModifier(statement, COLUMN_USAGE_EXTENDED);
        PojoEntity entity = (entityName != null) ? Utils.findEntity(qualifiedNameConverter, artifacts,
                scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__POJO_PACKAGES), entityName)
                : null;
        if (entity != null) {
            switch (checkEntityProperty(entity, columnName)) {
            case WARNING:
                warning("Problem property : " + columnName + "[" + entity.getName() + "]",
                        ProcessorDslPackage.Literals.COLUMN__COLUMNS);
                break;
            case ERROR:
                error("Cannot find property : " + columnName + "[" + entity.getName() + "]",
                        ProcessorDslPackage.Literals.COLUMN__COLUMNS);
                break;
            }
            return;
        }

        String pojoName = Utils.getTokenFromModifier(statement, COLUMN_USAGE);
        PojoDefinition pojo = (pojoName != null) ? Utils.findPojo(qualifiedNameConverter, artifacts,
                scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__POJOS), pojoName) : null;
        String columnUsageClass = (pojo != null) ? pojo.getClass_() : null;
        if (columnUsageClass != null) {
            switch (checkClassProperty(columnUsageClass, columnName)) {
            case WARNING:
                warning("Problem property : " + columnName + "[" + columnUsageClass + "]",
                        ProcessorDslPackage.Literals.COLUMN__COLUMNS);
                break;
            case ERROR:
                error("Cannot find property : " + columnName + "[" + columnUsageClass + "]",
                        ProcessorDslPackage.Literals.COLUMN__COLUMNS);
                break;
            }
            return;
        }

        if (pojoResolverFactory.getPojoResolver() != null) {
            error("Cannot check result class attribute : " + columnName, ProcessorDslPackage.Literals.COLUMN__COLUMNS);
        }
    }

    @Check
    public void checkIdentifier(Identifier identifier) {
        if (!isResolvePojo(identifier))
            return;
        String identifierName = identifier.getName();
        MetaStatement statement = EcoreUtil2.getContainerOfType(identifier, MetaStatement.class);
        Artifacts artifacts = EcoreUtil2.getContainerOfType(statement, Artifacts.class);

        String entityName = Utils.getTokenFromModifier(statement, IDENTIFIER_USAGE_EXTENDED);
        PojoEntity entity = (entityName != null) ? Utils.findEntity(qualifiedNameConverter, artifacts,
                scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__POJO_PACKAGES), entityName)
                : null;
        if (entity != null) {
            switch (checkEntityProperty(entity, identifierName)) {
            case WARNING:
                warning("Problem property : " + identifierName + "[" + entity.getName() + "]",
                        ProcessorDslPackage.Literals.IDENTIFIER__NAME);
                break;
            case ERROR:
                error("Cannot find property : " + identifierName + "[" + entity.getName() + "]",
                        ProcessorDslPackage.Literals.IDENTIFIER__NAME);
                break;
            }
            return;
        }

        String pojoName = Utils.getTokenFromModifier(statement, IDENTIFIER_USAGE);
        PojoDefinition pojo = (pojoName != null) ? Utils.findPojo(qualifiedNameConverter, artifacts,
                scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__POJOS), pojoName) : null;
        String identifierUsageClass = (pojo != null) ? pojo.getClass_() : null;
        if (identifierUsageClass != null) {
            switch (checkClassProperty(identifierUsageClass, identifierName)) {
            case WARNING:
                warning("Problem property : " + identifierName + "[" + identifierUsageClass + "]",
                        ProcessorDslPackage.Literals.IDENTIFIER__NAME);
                break;
            case ERROR:
                error("Cannot find property : " + identifierName + "[" + identifierUsageClass + "]",
                        ProcessorDslPackage.Literals.IDENTIFIER__NAME);
                break;
            }
            return;
        }

        if (pojoResolverFactory.getPojoResolver() != null) {
            error("Cannot check input form attribute : " + identifierName,
                    ProcessorDslPackage.Literals.IDENTIFIER__NAME);
        }
    }

    @Check
    public void checkConstant(Constant constant) {
        if (!isResolvePojo(constant))
            return;
        MetaStatement statement = EcoreUtil2.getContainerOfType(constant, MetaStatement.class);
        Artifacts artifacts = EcoreUtil2.getContainerOfType(statement, Artifacts.class);

        String entityName = Utils.getTokenFromModifier(statement, CONSTANT_USAGE_EXTENDED);
        PojoEntity entity = (entityName != null) ? Utils.findEntity(qualifiedNameConverter, artifacts,
                scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__POJO_PACKAGES), entityName)
                : null;
        if (entity != null) {
            switch (checkEntityProperty(entity, constant.getName())) {
            case WARNING:
                warning("Problem property : " + constant.getName() + "[" + entity.getName() + "]",
                        ProcessorDslPackage.Literals.CONSTANT__NAME);
                break;
            case ERROR:
                error("Cannot find property : " + constant.getName() + "[" + entity.getName() + "]",
                        ProcessorDslPackage.Literals.CONSTANT__NAME);
                break;
            }
            return;
        }

        String pojoName = Utils.getTokenFromModifier(statement, CONSTANT_USAGE);
        PojoDefinition pojo = (pojoName != null) ? Utils.findPojo(qualifiedNameConverter, artifacts,
                scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__POJOS), pojoName) : null;
        String constantUsageClass = (pojo != null) ? pojo.getClass_() : null;
        if (constantUsageClass != null) {
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
            return;
        }

        if (pojoResolverFactory.getPojoResolver() != null) {
            error("Cannot check constant form attribute : " + constant.getName(),
                    ProcessorDslPackage.Literals.CONSTANT__NAME);
        }
    }

    @Check
    public void checkMappingColumn(MappingColumn column) {
        if (!isResolvePojo(column))
            return;
        String columnName = Utils.getName(column);
        if (Utils.isNumber(columnName))
            return;
        MappingRule rule = EcoreUtil2.getContainerOfType(column, MappingRule.class);
        Artifacts artifacts = EcoreUtil2.getContainerOfType(rule, Artifacts.class);

        String entityName = Utils.getTokenFromModifier(rule, MAPPING_USAGE_EXTENDED);
        PojoEntity entity = (entityName != null) ? Utils.findEntity(qualifiedNameConverter, artifacts,
                scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__POJO_PACKAGES), entityName)
                : null;
        if (entity != null) {
            switch (checkEntityProperty(entity, columnName)) {
            case WARNING:
                warning("Problem property : " + columnName + "[" + entity.getName() + "]",
                        ProcessorDslPackage.Literals.MAPPING_COLUMN__ITEMS);
                break;
            case ERROR:
                error("Cannot find property : " + columnName + "[" + entity.getName() + "]",
                        ProcessorDslPackage.Literals.MAPPING_COLUMN__ITEMS);
                break;
            }
            return;
        }

        String pojoName = Utils.getTokenFromModifier(rule, MAPPING_USAGE);
        PojoDefinition pojo = (pojoName != null) ? Utils.findPojo(qualifiedNameConverter, artifacts,
                scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__POJOS), pojoName) : null;
        String mappingUsageClass = (pojo != null) ? pojo.getClass_() : null;
        if (mappingUsageClass != null) {
            switch (checkClassProperty(mappingUsageClass, columnName)) {
            case WARNING:
                warning("Problem property : " + columnName + "[" + mappingUsageClass + "]",
                        ProcessorDslPackage.Literals.MAPPING_COLUMN__ITEMS);
                break;
            case ERROR:
                error("Cannot find property : " + columnName + "[" + mappingUsageClass + "]",
                        ProcessorDslPackage.Literals.MAPPING_COLUMN__ITEMS);
                break;

            }
            return;
        }

        if (pojoResolverFactory.getPojoResolver() != null) {
            error("Cannot check result class attribute : " + columnName,
                    ProcessorDslPackage.Literals.MAPPING_COLUMN__ITEMS);
        }
    }

    @Check
    public void checkMetaStatement(MetaStatement statement) {
        Artifacts artifacts = EcoreUtil2.getContainerOfType(statement, Artifacts.class);

        if (statement.getModifiers() == null || statement.getModifiers().isEmpty())
            return;

        int index = 0;
        for (String modifier : statement.getModifiers()) {
            int ix = modifier.indexOf('=');
            if (ix <= 0)
                continue;
            String key = modifier.substring(0, ix);
            String val = modifier.substring(ix + 1);
            if (IDENTIFIER_USAGE_EXTENDED.equals(key)) {
                PojoEntity entity = Utils.findEntity(qualifiedNameConverter, artifacts,
                        scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__POJO_PACKAGES), val);
                if (entity == null) {
                    error("Cannot find entity : " + val + "[" + IDENTIFIER_USAGE_EXTENDED + "]",
                            ProcessorDslPackage.Literals.META_STATEMENT__MODIFIERS, index);
                }
            } else if (IDENTIFIER_USAGE.equals(key)) {
                PojoDefinition pojo = Utils.findPojo(qualifiedNameConverter, artifacts,
                        scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__POJOS), val);
                if (pojo == null) {
                    error("Cannot find pojo : " + val + "[" + IDENTIFIER_USAGE + "]",
                            ProcessorDslPackage.Literals.META_STATEMENT__MODIFIERS, index);
                }
            } else if (COLUMN_USAGE_EXTENDED.equals(key)) {
                PojoEntity entity = Utils.findEntity(qualifiedNameConverter, artifacts,
                        scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__POJO_PACKAGES), val);
                if (entity == null) {
                    error("Cannot find entity : " + val + "[" + COLUMN_USAGE_EXTENDED + "]",
                            ProcessorDslPackage.Literals.META_STATEMENT__MODIFIERS, index);
                }
            } else if (COLUMN_USAGE.equals(key)) {
                PojoDefinition pojo = Utils.findPojo(qualifiedNameConverter, artifacts,
                        scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__POJOS), val);
                if (pojo == null) {
                    error("Cannot find pojo : " + val + "[" + COLUMN_USAGE + "]",
                            ProcessorDslPackage.Literals.META_STATEMENT__MODIFIERS, index);
                }
            } else if (CONSTANT_USAGE_EXTENDED.equals(key)) {
                PojoEntity entity = Utils.findEntity(qualifiedNameConverter, artifacts,
                        scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__POJO_PACKAGES), val);
                if (entity == null) {
                    error("Cannot find entity : " + val + "[" + CONSTANT_USAGE_EXTENDED + "]",
                            ProcessorDslPackage.Literals.META_STATEMENT__MODIFIERS, index);
                }
            } else if (CONSTANT_USAGE.equals(key)) {
                PojoDefinition pojo = Utils.findPojo(qualifiedNameConverter, artifacts,
                        scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__POJOS), val);
                if (pojo == null) {
                    error("Cannot find pojo : " + val + "[" + CONSTANT_USAGE + "]",
                            ProcessorDslPackage.Literals.META_STATEMENT__MODIFIERS, index);
                }
            } else if (TABLE_USAGE.equals(key)) {
                int ix1 = val.indexOf('=');
                if (ix1 >= 0)
                    val = val.substring(0, ix1);
                TableDefinition table = Utils.findTable(qualifiedNameConverter, artifacts,
                        scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__TABLES), val);
                if (table == null) {
                    error("Cannot find table : " + val + "[" + TABLE_USAGE + "]",
                            ProcessorDslPackage.Literals.META_STATEMENT__MODIFIERS, index);
                }
            }
            index++;
        }
    }

    @Check
    public void checkMappingRule(MappingRule rule) {
        Artifacts artifacts = EcoreUtil2.getContainerOfType(rule, Artifacts.class);

        if (rule.getModifiers() == null || rule.getModifiers().isEmpty())
            return;

        int index = 0;
        for (String modifier : rule.getModifiers()) {
            int ix = modifier.indexOf('=');
            if (ix <= 0)
                continue;
            String key = modifier.substring(0, ix);
            String val = modifier.substring(ix + 1);
            if (MAPPING_USAGE_EXTENDED.equals(key)) {
                PojoEntity entity = Utils.findEntity(qualifiedNameConverter, artifacts,
                        scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__POJO_PACKAGES), val);
                if (entity == null) {
                    error("Cannot find entity : " + val + "[" + MAPPING_USAGE_EXTENDED + "]",
                            ProcessorDslPackage.Literals.MAPPING_RULE__MODIFIERS, index);
                }
            } else if (MAPPING_USAGE.equals(key)) {
                PojoDefinition pojo = Utils.findPojo(qualifiedNameConverter, artifacts,
                        scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__POJOS), val);
                if (pojo == null) {
                    error("Cannot find pojo : " + val + "[" + MAPPING_USAGE + "]",
                            ProcessorDslPackage.Literals.MAPPING_RULE__MODIFIERS, index);
                }
            }
            index++;
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

    protected ValidationResult checkClassProperty(String className, String property) {
        if (property == null || isNumber(property) || pojoResolverFactory.getPojoResolver() == null)
            return ValidationResult.OK;
        if (className == null)
            return ValidationResult.ERROR;
        PropertyDescriptor[] descriptors = pojoResolverFactory.getPojoResolver().getPropertyDescriptors(className);
        if (descriptors == null) {
            return ValidationResult.WARNING;
        }
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

    protected ValidationResult checkEntityProperty(PojoEntity entity, String property) {
        if (property == null || isNumber(property))
            return ValidationResult.OK;
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

        for (PojoProperty pojoProperty : entity.getFeatures()) {
            if (pojoProperty.getName().equals(checkProperty)) {
                if (innerProperty == null)
                    return ValidationResult.OK;
                if (pojoProperty.getRef() != null)
                    return checkEntityProperty(pojoProperty.getRef(), innerProperty);
                if (pojoProperty.getGref() != null)
                    return checkEntityProperty(pojoProperty.getGref(), innerProperty);
                return ValidationResult.ERROR;
            }
        }
        PojoEntity superType = Utils.getSuperType(entity);
        if (superType != null) {
            ValidationResult result = checkEntityProperty(superType, property);
            if (result == ValidationResult.WARNING || result == ValidationResult.OK)
                return result;
        }
        if (Utils.isAbstract(entity))
            return ValidationResult.WARNING;
        else {
            Set<String> suppressedAbstracts = modelProperty.getNotAbstractTables(entity);
            // System.out.println("AAAAAAAA " + entity + "->" + suppressedAbstracts + "->" + property + "->"
            // + Utils.dbName(entity));
            if (suppressedAbstracts != null && suppressedAbstracts.contains(Utils.dbName(entity)))
                return ValidationResult.WARNING;
            else
                return ValidationResult.ERROR;
        }
    }

    @Check
    public void checkUniqueProperty(Property property) {
        Artifacts artifacts;
        EObject object = EcoreUtil.getRootContainer(property);
        if (!(object instanceof Artifacts))
            return;
        artifacts = (Artifacts) object;
        for (Property prop : artifacts.getProperties()) {
            if (prop == null || prop == property)
                continue;
            if (prop.getName().equals(property.getName()) && !prop.getName().startsWith("pojogen")
                    && !prop.getName().startsWith("database") && !prop.getName().startsWith("metagen")
                    && !prop.getName().startsWith("daogen")) {
                error("Duplicate name : " + property.getName(), ProcessorDslPackage.Literals.PROPERTY__NAME);
                return;
            }
        }
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
            if (tableDefinition.getName().equals(table.getName())) {
                error("Duplicate name : " + tableDefinition.getName() + "[table]",
                        ProcessorDslPackage.Literals.TABLE_DEFINITION__NAME);
                return;
            }
        }
        if (isResolveDb(tableDefinition) && !dbResolver.checkTable(tableDefinition, tableDefinition.getTable())) {
            error("Cannot find table in DB : " + tableDefinition.getTable(),
                    ProcessorDslPackage.Literals.TABLE_DEFINITION__TABLE);
        }
    }

    @Check
    public void checkProcedureDefinition(ProcedureDefinition procedureDefinition) {
        Artifacts artifacts;
        EObject object = EcoreUtil.getRootContainer(procedureDefinition);
        if (!(object instanceof Artifacts))
            return;
        artifacts = (Artifacts) object;
        for (ProcedureDefinition procedure : artifacts.getProcedures()) {
            if (procedure == null || procedure == procedureDefinition)
                continue;
            if (procedureDefinition.getName().equals(procedure.getName())) {
                error("Duplicate name : " + procedureDefinition.getName() + "[procedure]",
                        ProcessorDslPackage.Literals.PROCEDURE_DEFINITION__NAME);
                return;
            }
        }
        if (isResolveDb(procedureDefinition)
                && !dbResolver.checkProcedure(procedureDefinition, procedureDefinition.getTable())) {
            error("Cannot find procedure in DB : " + procedureDefinition.getTable(),
                    ProcessorDslPackage.Literals.PROCEDURE_DEFINITION__NAME);
        }
    }

    @Check
    public void checkFunctionDefinition(FunctionDefinition functionDefinition) {
        Artifacts artifacts;
        EObject object = EcoreUtil.getRootContainer(functionDefinition);
        if (!(object instanceof Artifacts))
            return;
        artifacts = (Artifacts) object;
        for (FunctionDefinition function : artifacts.getFunctions()) {
            if (function == null || function == functionDefinition)
                continue;
            if (functionDefinition.getName().equals(function.getName())) {
                error("Duplicate name : " + functionDefinition.getName() + "[function]",
                        ProcessorDslPackage.Literals.FUNCTION_DEFINITION__NAME);
                return;
            }
        }
    }

    @Check
    public void checkDatabaseColumn(DatabaseColumn databaseColumn) {
        if (!isResolveDb(databaseColumn))
            return;
        String prefix = databaseColumn.getName();
        String columnName = null;
        int pos = prefix.indexOf('.');
        if (pos > 0) {
            prefix = databaseColumn.getName().substring(0, pos);
            columnName = databaseColumn.getName().substring(pos + 1);
        } else {
            prefix = null;
            columnName = databaseColumn.getName();
        }
        MetaStatement statement = EcoreUtil2.getContainerOfType(databaseColumn, MetaStatement.class);
        Artifacts artifacts = EcoreUtil2.getContainerOfType(statement, Artifacts.class);

        String val = Utils.getTokenFromModifier(statement, TABLE_USAGE, prefix);
        TableDefinition tableDefinition = (val != null) ? Utils.findTable(qualifiedNameConverter, artifacts,
                scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__TABLES), val) : null;
        String tableName = tableDefinition != null ? tableDefinition.getTable() : null;
        if (tableName == null || !dbResolver.checkColumn(databaseColumn, tableName, columnName)) {
            error("Cannot find column in DB : " + databaseColumn.getName() + "[" + tableName + "]",
                    ProcessorDslPackage.Literals.DATABASE_COLUMN__NAME);
        }
    }

    @Check
    public void checkDatabaseTable(DatabaseTable databaseTable) {
        if (!isResolveDb(databaseTable))
            return;
        String tableName = databaseTable.getName();
        MetaStatement statement = EcoreUtil2.getContainerOfType(databaseTable, MetaStatement.class);
        Artifacts artifacts = EcoreUtil2.getContainerOfType(statement, Artifacts.class);

        TableDefinition tableDefinition = null;
        List<String> vals = Utils.getTokensFromModifier(statement, TABLE_USAGE);
        for (String val : vals) {
            tableDefinition = Utils.findTable(qualifiedNameConverter, artifacts,
                    scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__TABLES), val);
            if (tableDefinition != null)
                break;
        }
        if (tableDefinition == null || !dbResolver.checkTable(databaseTable, tableName)) {
            error("Cannot find table in DB : " + tableName, ProcessorDslPackage.Literals.DATABASE_TABLE__NAME);
        }
    }

    protected boolean isResolvePojo(EObject model) {
        if (pojoResolverFactory.getPojoResolver() == null
                || !pojoResolverFactory.getPojoResolver().isResolvePojo(model))
            return false;
        return true;

    }

    protected boolean isResolveDb(EObject model) {
        return dbResolver.isResolveDb(model);
    }

    @Check
    public void checkUniquePojoEntity(PojoEntity pojoEntity) {
        Artifacts artifacts;
        EObject object = EcoreUtil.getRootContainer(pojoEntity);
        if (!(object instanceof Artifacts))
            return;
        artifacts = (Artifacts) object;
        for (PackageDeclaration pkg : artifacts.getPojoPackages()) {
            if (pkg == null)
                continue;
            for (AbstractPojoEntity entity : pkg.getElements()) {
                if (entity == null || !(entity instanceof PojoEntity))
                    continue;
                PojoEntity pentity = (PojoEntity) entity;
                if (pentity == pojoEntity)
                    continue;
                if (pojoEntity.getName().equals(pentity.getName())) {
                    error("Duplicate name : " + pojoEntity.getName(), ProcessorDslPackage.Literals.POJO_ENTITY__NAME);
                    return;
                }
            }
        }
    }

    @Check
    public void checkUniquePojoProperty(PojoProperty pojoProperty) {
        PojoEntity entity = EcoreUtil2.getContainerOfType(pojoProperty, PojoEntity.class);
        for (PojoProperty property : entity.getFeatures()) {
            if (property == null || property == pojoProperty)
                continue;
            if (pojoProperty.getName().equals(property.getName())) {
                error("Duplicate name : " + pojoProperty.getName(), ProcessorDslPackage.Literals.POJO_PROPERTY__NAME);
                return;
            }
        }
    }

    @Check
    public void checkUniquePojoDao(PojoDao pojoDao) {
        Artifacts artifacts;
        EObject object = EcoreUtil.getRootContainer(pojoDao);
        if (!(object instanceof Artifacts))
            return;
        artifacts = (Artifacts) object;
        for (PackageDeclaration pkg : artifacts.getPojoPackages()) {
            if (pkg == null)
                continue;
            for (AbstractPojoEntity dao : pkg.getElements()) {
                if (dao == null || !(dao instanceof PojoDao))
                    continue;
                PojoDao pdao = (PojoDao) dao;
                if (pdao == pojoDao)
                    continue;
                if (pojoDao.getName().equals(pdao.getName())) {
                    error("Duplicate name : " + pojoDao.getName(), ProcessorDslPackage.Literals.POJO_DAO__NAME);
                    return;
                }
            }
        }
    }
}
