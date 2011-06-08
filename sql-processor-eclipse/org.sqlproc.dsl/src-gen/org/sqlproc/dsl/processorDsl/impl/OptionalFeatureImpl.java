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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sqlproc.dsl.processorDsl.Filter;
import org.sqlproc.dsl.processorDsl.Name;
import org.sqlproc.dsl.processorDsl.OPTION_TYPE;
import org.sqlproc.dsl.processorDsl.OptionalFeature;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optional Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.OptionalFeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.OptionalFeatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.OptionalFeatureImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.OptionalFeatureImpl#getOption <em>Option</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OptionalFeatureImpl extends MinimalEObjectImpl.Container implements OptionalFeature
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Name name;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final OPTION_TYPE TYPE_EDEFAULT = OPTION_TYPE.OPT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected OPTION_TYPE type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilters()
   * @generated
   * @ordered
   */
  protected EList<Filter> filters;

  /**
   * The default value of the '{@link #getOption() <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOption()
   * @generated
   * @ordered
   */
  protected static final String OPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOption() <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOption()
   * @generated
   * @ordered
   */
  protected String option = OPTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptionalFeatureImpl()
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
    return ProcessorDslPackage.Literals.OPTIONAL_FEATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(Name newName, NotificationChain msgs)
  {
    Name oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.OPTIONAL_FEATURE__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Name newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.OPTIONAL_FEATURE__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.OPTIONAL_FEATURE__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.OPTIONAL_FEATURE__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OPTION_TYPE getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(OPTION_TYPE newType)
  {
    OPTION_TYPE oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.OPTIONAL_FEATURE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Filter> getFilters()
  {
    if (filters == null)
    {
      filters = new EObjectContainmentEList<Filter>(Filter.class, this, ProcessorDslPackage.OPTIONAL_FEATURE__FILTERS);
    }
    return filters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOption()
  {
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOption(String newOption)
  {
    String oldOption = option;
    option = newOption;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.OPTIONAL_FEATURE__OPTION, oldOption, option));
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
      case ProcessorDslPackage.OPTIONAL_FEATURE__NAME:
        return basicSetName(null, msgs);
      case ProcessorDslPackage.OPTIONAL_FEATURE__FILTERS:
        return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
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
      case ProcessorDslPackage.OPTIONAL_FEATURE__NAME:
        return getName();
      case ProcessorDslPackage.OPTIONAL_FEATURE__TYPE:
        return getType();
      case ProcessorDslPackage.OPTIONAL_FEATURE__FILTERS:
        return getFilters();
      case ProcessorDslPackage.OPTIONAL_FEATURE__OPTION:
        return getOption();
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
      case ProcessorDslPackage.OPTIONAL_FEATURE__NAME:
        setName((Name)newValue);
        return;
      case ProcessorDslPackage.OPTIONAL_FEATURE__TYPE:
        setType((OPTION_TYPE)newValue);
        return;
      case ProcessorDslPackage.OPTIONAL_FEATURE__FILTERS:
        getFilters().clear();
        getFilters().addAll((Collection<? extends Filter>)newValue);
        return;
      case ProcessorDslPackage.OPTIONAL_FEATURE__OPTION:
        setOption((String)newValue);
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
      case ProcessorDslPackage.OPTIONAL_FEATURE__NAME:
        setName((Name)null);
        return;
      case ProcessorDslPackage.OPTIONAL_FEATURE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case ProcessorDslPackage.OPTIONAL_FEATURE__FILTERS:
        getFilters().clear();
        return;
      case ProcessorDslPackage.OPTIONAL_FEATURE__OPTION:
        setOption(OPTION_EDEFAULT);
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
      case ProcessorDslPackage.OPTIONAL_FEATURE__NAME:
        return name != null;
      case ProcessorDslPackage.OPTIONAL_FEATURE__TYPE:
        return type != TYPE_EDEFAULT;
      case ProcessorDslPackage.OPTIONAL_FEATURE__FILTERS:
        return filters != null && !filters.isEmpty();
      case ProcessorDslPackage.OPTIONAL_FEATURE__OPTION:
        return OPTION_EDEFAULT == null ? option != null : !OPTION_EDEFAULT.equals(option);
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
    result.append(" (type: ");
    result.append(type);
    result.append(", option: ");
    result.append(option);
    result.append(')');
    return result.toString();
  }

} //OptionalFeatureImpl
