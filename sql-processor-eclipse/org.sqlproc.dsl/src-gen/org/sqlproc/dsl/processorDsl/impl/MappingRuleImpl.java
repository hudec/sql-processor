/**
 * <copyright>
 * </copyright>
 *

 */
package org.sqlproc.dsl.processorDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.sqlproc.dsl.processorDsl.MAPPING_TYPE;
import org.sqlproc.dsl.processorDsl.Mapping;
import org.sqlproc.dsl.processorDsl.MappingRule;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.MappingRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.MappingRuleImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.MappingRuleImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.MappingRuleImpl#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingRuleImpl extends MinimalEObjectImpl.Container implements MappingRule
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final MAPPING_TYPE TYPE_EDEFAULT = MAPPING_TYPE.OUT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected MAPPING_TYPE type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getFilters() <em>Filters</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilters()
   * @generated
   * @ordered
   */
  protected EList<String> filters;

  /**
   * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapping()
   * @generated
   * @ordered
   */
  protected Mapping mapping;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingRuleImpl()
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
    return ProcessorDslPackage.Literals.MAPPING_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.MAPPING_RULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MAPPING_TYPE getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(MAPPING_TYPE newType)
  {
    MAPPING_TYPE oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.MAPPING_RULE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getFilters()
  {
    if (filters == null)
    {
      filters = new EDataTypeEList<String>(String.class, this, ProcessorDslPackage.MAPPING_RULE__FILTERS);
    }
    return filters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping getMapping()
  {
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMapping(Mapping newMapping, NotificationChain msgs)
  {
    Mapping oldMapping = mapping;
    mapping = newMapping;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.MAPPING_RULE__MAPPING, oldMapping, newMapping);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapping(Mapping newMapping)
  {
    if (newMapping != mapping)
    {
      NotificationChain msgs = null;
      if (mapping != null)
        msgs = ((InternalEObject)mapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.MAPPING_RULE__MAPPING, null, msgs);
      if (newMapping != null)
        msgs = ((InternalEObject)newMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.MAPPING_RULE__MAPPING, null, msgs);
      msgs = basicSetMapping(newMapping, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.MAPPING_RULE__MAPPING, newMapping, newMapping));
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
      case ProcessorDslPackage.MAPPING_RULE__MAPPING:
        return basicSetMapping(null, msgs);
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
      case ProcessorDslPackage.MAPPING_RULE__NAME:
        return getName();
      case ProcessorDslPackage.MAPPING_RULE__TYPE:
        return getType();
      case ProcessorDslPackage.MAPPING_RULE__FILTERS:
        return getFilters();
      case ProcessorDslPackage.MAPPING_RULE__MAPPING:
        return getMapping();
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
      case ProcessorDslPackage.MAPPING_RULE__NAME:
        setName((String)newValue);
        return;
      case ProcessorDslPackage.MAPPING_RULE__TYPE:
        setType((MAPPING_TYPE)newValue);
        return;
      case ProcessorDslPackage.MAPPING_RULE__FILTERS:
        getFilters().clear();
        getFilters().addAll((Collection<? extends String>)newValue);
        return;
      case ProcessorDslPackage.MAPPING_RULE__MAPPING:
        setMapping((Mapping)newValue);
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
      case ProcessorDslPackage.MAPPING_RULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProcessorDslPackage.MAPPING_RULE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case ProcessorDslPackage.MAPPING_RULE__FILTERS:
        getFilters().clear();
        return;
      case ProcessorDslPackage.MAPPING_RULE__MAPPING:
        setMapping((Mapping)null);
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
      case ProcessorDslPackage.MAPPING_RULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProcessorDslPackage.MAPPING_RULE__TYPE:
        return type != TYPE_EDEFAULT;
      case ProcessorDslPackage.MAPPING_RULE__FILTERS:
        return filters != null && !filters.isEmpty();
      case ProcessorDslPackage.MAPPING_RULE__MAPPING:
        return mapping != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", type: ");
    result.append(type);
    result.append(", filters: ");
    result.append(filters);
    result.append(')');
    return result.toString();
  }

} //MappingRuleImpl
