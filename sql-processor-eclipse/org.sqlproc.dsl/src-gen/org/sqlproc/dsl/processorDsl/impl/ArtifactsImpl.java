/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.processorDsl.MappingRule;
import org.sqlproc.dsl.processorDsl.MetaStatement;
import org.sqlproc.dsl.processorDsl.OptionalFeature;
import org.sqlproc.dsl.processorDsl.PojoDefinition;
import org.sqlproc.dsl.processorDsl.PojoUsage;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;
import org.sqlproc.dsl.processorDsl.Property;
import org.sqlproc.dsl.processorDsl.TableDefinition;
import org.sqlproc.dsl.processorDsl.TableUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifacts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.ArtifactsImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.ArtifactsImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.ArtifactsImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.ArtifactsImpl#getPojos <em>Pojos</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.ArtifactsImpl#getUsages <em>Usages</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.ArtifactsImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.ArtifactsImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.ArtifactsImpl#getTableUsages <em>Table Usages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactsImpl extends MinimalEObjectImpl.Container implements Artifacts
{
  /**
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected EList<OptionalFeature> features;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<MetaStatement> statements;

  /**
   * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappings()
   * @generated
   * @ordered
   */
  protected EList<MappingRule> mappings;

  /**
   * The cached value of the '{@link #getPojos() <em>Pojos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPojos()
   * @generated
   * @ordered
   */
  protected EList<PojoDefinition> pojos;

  /**
   * The cached value of the '{@link #getUsages() <em>Usages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsages()
   * @generated
   * @ordered
   */
  protected EList<PojoUsage> usages;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTables()
   * @generated
   * @ordered
   */
  protected EList<TableDefinition> tables;

  /**
   * The cached value of the '{@link #getTableUsages() <em>Table Usages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTableUsages()
   * @generated
   * @ordered
   */
  protected EList<TableUsage> tableUsages;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArtifactsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ProcessorDslPackage.Literals.ARTIFACTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OptionalFeature> getFeatures()
  {
    if (features == null)
    {
      features = new EObjectContainmentEList<OptionalFeature>(OptionalFeature.class, this, ProcessorDslPackage.ARTIFACTS__FEATURES);
    }
    return features;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MetaStatement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<MetaStatement>(MetaStatement.class, this, ProcessorDslPackage.ARTIFACTS__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MappingRule> getMappings()
  {
    if (mappings == null)
    {
      mappings = new EObjectContainmentEList<MappingRule>(MappingRule.class, this, ProcessorDslPackage.ARTIFACTS__MAPPINGS);
    }
    return mappings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PojoDefinition> getPojos()
  {
    if (pojos == null)
    {
      pojos = new EObjectContainmentEList<PojoDefinition>(PojoDefinition.class, this, ProcessorDslPackage.ARTIFACTS__POJOS);
    }
    return pojos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PojoUsage> getUsages()
  {
    if (usages == null)
    {
      usages = new EObjectContainmentEList<PojoUsage>(PojoUsage.class, this, ProcessorDslPackage.ARTIFACTS__USAGES);
    }
    return usages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, ProcessorDslPackage.ARTIFACTS__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TableDefinition> getTables()
  {
    if (tables == null)
    {
      tables = new EObjectContainmentEList<TableDefinition>(TableDefinition.class, this, ProcessorDslPackage.ARTIFACTS__TABLES);
    }
    return tables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TableUsage> getTableUsages()
  {
    if (tableUsages == null)
    {
      tableUsages = new EObjectContainmentEList<TableUsage>(TableUsage.class, this, ProcessorDslPackage.ARTIFACTS__TABLE_USAGES);
    }
    return tableUsages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ProcessorDslPackage.ARTIFACTS__FEATURES:
        return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.ARTIFACTS__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.ARTIFACTS__MAPPINGS:
        return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.ARTIFACTS__POJOS:
        return ((InternalEList<?>)getPojos()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.ARTIFACTS__USAGES:
        return ((InternalEList<?>)getUsages()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.ARTIFACTS__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.ARTIFACTS__TABLES:
        return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.ARTIFACTS__TABLE_USAGES:
        return ((InternalEList<?>)getTableUsages()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ProcessorDslPackage.ARTIFACTS__FEATURES:
        return getFeatures();
      case ProcessorDslPackage.ARTIFACTS__STATEMENTS:
        return getStatements();
      case ProcessorDslPackage.ARTIFACTS__MAPPINGS:
        return getMappings();
      case ProcessorDslPackage.ARTIFACTS__POJOS:
        return getPojos();
      case ProcessorDslPackage.ARTIFACTS__USAGES:
        return getUsages();
      case ProcessorDslPackage.ARTIFACTS__PROPERTIES:
        return getProperties();
      case ProcessorDslPackage.ARTIFACTS__TABLES:
        return getTables();
      case ProcessorDslPackage.ARTIFACTS__TABLE_USAGES:
        return getTableUsages();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProcessorDslPackage.ARTIFACTS__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends OptionalFeature>)newValue);
        return;
      case ProcessorDslPackage.ARTIFACTS__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends MetaStatement>)newValue);
        return;
      case ProcessorDslPackage.ARTIFACTS__MAPPINGS:
        getMappings().clear();
        getMappings().addAll((Collection<? extends MappingRule>)newValue);
        return;
      case ProcessorDslPackage.ARTIFACTS__POJOS:
        getPojos().clear();
        getPojos().addAll((Collection<? extends PojoDefinition>)newValue);
        return;
      case ProcessorDslPackage.ARTIFACTS__USAGES:
        getUsages().clear();
        getUsages().addAll((Collection<? extends PojoUsage>)newValue);
        return;
      case ProcessorDslPackage.ARTIFACTS__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case ProcessorDslPackage.ARTIFACTS__TABLES:
        getTables().clear();
        getTables().addAll((Collection<? extends TableDefinition>)newValue);
        return;
      case ProcessorDslPackage.ARTIFACTS__TABLE_USAGES:
        getTableUsages().clear();
        getTableUsages().addAll((Collection<? extends TableUsage>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ProcessorDslPackage.ARTIFACTS__FEATURES:
        getFeatures().clear();
        return;
      case ProcessorDslPackage.ARTIFACTS__STATEMENTS:
        getStatements().clear();
        return;
      case ProcessorDslPackage.ARTIFACTS__MAPPINGS:
        getMappings().clear();
        return;
      case ProcessorDslPackage.ARTIFACTS__POJOS:
        getPojos().clear();
        return;
      case ProcessorDslPackage.ARTIFACTS__USAGES:
        getUsages().clear();
        return;
      case ProcessorDslPackage.ARTIFACTS__PROPERTIES:
        getProperties().clear();
        return;
      case ProcessorDslPackage.ARTIFACTS__TABLES:
        getTables().clear();
        return;
      case ProcessorDslPackage.ARTIFACTS__TABLE_USAGES:
        getTableUsages().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ProcessorDslPackage.ARTIFACTS__FEATURES:
        return features != null && !features.isEmpty();
      case ProcessorDslPackage.ARTIFACTS__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case ProcessorDslPackage.ARTIFACTS__MAPPINGS:
        return mappings != null && !mappings.isEmpty();
      case ProcessorDslPackage.ARTIFACTS__POJOS:
        return pojos != null && !pojos.isEmpty();
      case ProcessorDslPackage.ARTIFACTS__USAGES:
        return usages != null && !usages.isEmpty();
      case ProcessorDslPackage.ARTIFACTS__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case ProcessorDslPackage.ARTIFACTS__TABLES:
        return tables != null && !tables.isEmpty();
      case ProcessorDslPackage.ARTIFACTS__TABLE_USAGES:
        return tableUsages != null && !tableUsages.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArtifactsImpl
