package org.sqlproc.dsl.validation;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.validation.Check;
import org.sqlproc.dsl.processorDsl.Filter;
import org.sqlproc.dsl.processorDsl.MappingRule;
import org.sqlproc.dsl.processorDsl.MetaStatement;
import org.sqlproc.dsl.processorDsl.Name;
import org.sqlproc.dsl.processorDsl.OptionalFeature;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

import com.google.inject.Inject;

public class ProcessorDslJavaValidator extends AbstractProcessorDslJavaValidator {

    @Inject
    private IResourceServiceProvider.Registry resourceServiceProviderRegistry = IResourceServiceProvider.Registry.INSTANCE;

    @Check
    public void checkDuplicityMetaStatement(MetaStatement metaStatement) {
        Resource resource = metaStatement.eResource();
        if (resource == null) {
            return;
        }
        IResourceServiceProvider resourceServiceProvider = resourceServiceProviderRegistry
                .getResourceServiceProvider(resource.getURI());
        if (resourceServiceProvider == null) {
            return;
        }
        IResourceDescription.Manager manager = resourceServiceProvider.getResourceDescriptionManager();
        if (manager != null) {
            IResourceDescription description = manager.getResourceDescription(resource);
            if (description != null) {
                Iterable<IEObjectDescription> descriptions = description.getExportedObjects();
                Iterator<IEObjectDescription> iterator = descriptions.iterator();
                int count = 0;
                while (iterator.hasNext()) {
                    IEObjectDescription descr = iterator.next();
                    EObject object = descr.getEObjectOrProxy();
                    if (object instanceof Name && object.eContainer() instanceof MetaStatement) {
                        MetaStatement statement = (MetaStatement) object.eContainer();
                        if (equalsStatement(metaStatement, statement)) {
                            count++;
                        }
                    }
                }
                if (count > 1) {
                    error("Name duplicity in MetaStatement", ProcessorDslPackage.Literals.META_STATEMENT__NAME);
                }
            }
        }
    }

    @Check
    public void checkDuplicityMappingRule(MappingRule mappingRule) {
        Resource resource = mappingRule.eResource();
        if (resource == null) {
            return;
        }
        IResourceServiceProvider resourceServiceProvider = resourceServiceProviderRegistry
                .getResourceServiceProvider(resource.getURI());
        if (resourceServiceProvider == null) {
            return;
        }
        IResourceDescription.Manager manager = resourceServiceProvider.getResourceDescriptionManager();
        if (manager != null) {
            IResourceDescription description = manager.getResourceDescription(resource);
            if (description != null) {
                Iterable<IEObjectDescription> descriptions = description.getExportedObjects();
                Iterator<IEObjectDescription> iterator = descriptions.iterator();
                int count = 0;
                while (iterator.hasNext()) {
                    IEObjectDescription descr = iterator.next();
                    EObject object = descr.getEObjectOrProxy();
                    if (object instanceof Name && object.eContainer() instanceof MappingRule) {
                        MappingRule rule = (MappingRule) object.eContainer();
                        if (equalsRule(mappingRule, rule)) {
                            count++;
                        }
                    }
                }
                if (count > 1) {
                    error("Name duplicity in MappingRule", ProcessorDslPackage.Literals.MAPPING_RULE__NAME);
                }
            }
        }
    }

    @Check
    public void checkDuplicityOptionalFeature(OptionalFeature optionalFeature) {
        Resource resource = optionalFeature.eResource();
        if (resource == null) {
            return;
        }
        IResourceServiceProvider resourceServiceProvider = resourceServiceProviderRegistry
                .getResourceServiceProvider(resource.getURI());
        if (resourceServiceProvider == null) {
            return;
        }
        IResourceDescription.Manager manager = resourceServiceProvider.getResourceDescriptionManager();
        if (manager != null) {
            IResourceDescription description = manager.getResourceDescription(resource);
            if (description != null) {
                Iterable<IEObjectDescription> descriptions = description.getExportedObjects();
                Iterator<IEObjectDescription> iterator = descriptions.iterator();
                int count = 0;
                while (iterator.hasNext()) {
                    IEObjectDescription descr = iterator.next();
                    EObject object = descr.getEObjectOrProxy();
                    if (object instanceof Name && object.eContainer() instanceof OptionalFeature) {
                        OptionalFeature feature = (OptionalFeature) object.eContainer();
                        if (equalsFeature(optionalFeature, feature)) {
                            count++;
                        }
                    }
                }
                if (count > 1) {
                    error("Name duplicity in OptionalFeature", ProcessorDslPackage.Literals.OPTIONAL_FEATURE__NAME);
                }
            }
        }
    }

    private boolean equalsStatement(MetaStatement statement1, MetaStatement statement2) {
        if (statement1 == null && statement2 == null) {
            return true;
        }
        if (statement1 == null || statement2.getName() == null || statement2.getName().getName() == null) {
            return false;
        }
        if (statement2 == null || statement1.getName() == null || statement1.getName().getName() == null) {
            return false;
        }
        if (statement1.getName().getName().equalsIgnoreCase(statement2.getName().getName())
                && statement1.getType() == statement2.getType()) {
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
            if (statement1.getFilters().size() != statement2.getFilters().size()) {
                return false;
            }
            int count = 0;
            for (Filter filter1 : statement1.getFilters()) {
                for (Filter filter2 : statement2.getFilters()) {
                    if (filter1.getName().equalsIgnoreCase(filter2.getName())) {
                        count++;
                        break;
                    }
                }
                if (statement1.getFilters().size() == count) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private boolean equalsRule(MappingRule rule1, MappingRule rule2) {
        if (rule1 == null && rule2 == null) {
            return true;
        }
        if (rule1 == null || rule2.getName() == null || rule2.getName().getName() == null) {
            return false;
        }
        if (rule2 == null || rule1.getName() == null || rule1.getName().getName() == null) {
            return false;
        }
        if (rule1.getName().getName().equalsIgnoreCase(rule2.getName().getName()) && rule1.getType() == rule2.getType()) {
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
            if (rule1.getFilters().size() != rule2.getFilters().size()) {
                return false;
            }
            int count = 0;
            for (Filter filter1 : rule1.getFilters()) {
                for (Filter filter2 : rule2.getFilters()) {
                    if (filter1.getName().equalsIgnoreCase(filter2.getName())) {
                        count++;
                        break;
                    }
                }
                if (rule1.getFilters().size() == count) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private boolean equalsFeature(OptionalFeature feature1, OptionalFeature feature2) {
        if (feature1 == null && feature2 == null) {
            return true;
        }
        if (feature1 == null || feature2.getName() == null) {
            return false;
        }
        if (feature2 == null || feature1.getName() == null) {
            return false;
        }
        if (feature1.getName().getName().equalsIgnoreCase(feature2.getName().getName())
                && feature1.getType() == feature2.getType()) {
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
            if (feature1.getFilters().size() != feature2.getFilters().size()) {
                return false;
            }
            int count = 0;
            for (Filter filter1 : feature1.getFilters()) {
                for (Filter filter2 : feature2.getFilters()) {
                    if (filter1.getName().equalsIgnoreCase(filter2.getName())) {
                        count++;
                        break;
                    }
                }
                if (feature1.getFilters().size() == count) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}