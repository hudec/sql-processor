/**
 * <copyright>
 * </copyright>
 *
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

import org.sqlproc.dsl.processorDsl.Artifact;
import org.sqlproc.dsl.processorDsl.MappingRule;
import org.sqlproc.dsl.processorDsl.MetaStatement;
import org.sqlproc.dsl.processorDsl.OptionalFeature;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.ArtifactImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.ArtifactImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.ArtifactImpl#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactImpl extends MinimalEObjectImpl.Container implements Artifact
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArtifactImpl()
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
    return ProcessorDslPackage.Literals.ARTIFACT;
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
      features = new EObjectContainmentEList<OptionalFeature>(OptionalFeature.class, this, ProcessorDslPackage.ARTIFACT__FEATURES);
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
      statements = new EObjectContainmentEList<MetaStatement>(MetaStatement.class, this, ProcessorDslPackage.ARTIFACT__STATEMENTS);
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
      mappings = new EObjectContainmentEList<MappingRule>(MappingRule.class, this, ProcessorDslPackage.ARTIFACT__MAPPINGS);
    }
    return mappings;
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
      case ProcessorDslPackage.ARTIFACT__FEATURES:
        return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.ARTIFACT__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.ARTIFACT__MAPPINGS:
        return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
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
      case ProcessorDslPackage.ARTIFACT__FEATURES:
        return getFeatures();
      case ProcessorDslPackage.ARTIFACT__STATEMENTS:
        return getStatements();
      case ProcessorDslPackage.ARTIFACT__MAPPINGS:
        return getMappings();
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
      case ProcessorDslPackage.ARTIFACT__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends OptionalFeature>)newValue);
        return;
      case ProcessorDslPackage.ARTIFACT__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends MetaStatement>)newValue);
        return;
      case ProcessorDslPackage.ARTIFACT__MAPPINGS:
        getMappings().clear();
        getMappings().addAll((Collection<? extends MappingRule>)newValue);
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
      case ProcessorDslPackage.ARTIFACT__FEATURES:
        getFeatures().clear();
        return;
      case ProcessorDslPackage.ARTIFACT__STATEMENTS:
        getStatements().clear();
        return;
      case ProcessorDslPackage.ARTIFACT__MAPPINGS:
        getMappings().clear();
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
      case ProcessorDslPackage.ARTIFACT__FEATURES:
        return features != null && !features.isEmpty();
      case ProcessorDslPackage.ARTIFACT__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case ProcessorDslPackage.ARTIFACT__MAPPINGS:
        return mappings != null && !mappings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArtifactImpl
