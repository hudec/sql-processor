/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sqlproc.dsl.processorDsl.PojoEntity;
import org.sqlproc.dsl.processorDsl.PojoEntityModifier1;
import org.sqlproc.dsl.processorDsl.PojoEntityModifier2;
import org.sqlproc.dsl.processorDsl.PojoProperty;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pojo Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoEntityImpl#getModifiers1 <em>Modifiers1</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoEntityImpl#getModifiers2 <em>Modifiers2</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoEntityImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PojoEntityImpl extends AbstractPojoEntityImpl implements PojoEntity
{
  /**
   * The cached value of the '{@link #getModifiers1() <em>Modifiers1</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiers1()
   * @generated
   * @ordered
   */
  protected EList<PojoEntityModifier1> modifiers1;

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
   * The cached value of the '{@link #getModifiers2() <em>Modifiers2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiers2()
   * @generated
   * @ordered
   */
  protected EList<PojoEntityModifier2> modifiers2;

  /**
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected EList<PojoProperty> features;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PojoEntityImpl()
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
    return ProcessorDslPackage.Literals.POJO_ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PojoEntityModifier1> getModifiers1()
  {
    if (modifiers1 == null)
    {
      modifiers1 = new EObjectContainmentEList<PojoEntityModifier1>(PojoEntityModifier1.class, this, ProcessorDslPackage.POJO_ENTITY__MODIFIERS1);
    }
    return modifiers1;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJO_ENTITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PojoEntityModifier2> getModifiers2()
  {
    if (modifiers2 == null)
    {
      modifiers2 = new EObjectContainmentEList<PojoEntityModifier2>(PojoEntityModifier2.class, this, ProcessorDslPackage.POJO_ENTITY__MODIFIERS2);
    }
    return modifiers2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PojoProperty> getFeatures()
  {
    if (features == null)
    {
      features = new EObjectContainmentEList<PojoProperty>(PojoProperty.class, this, ProcessorDslPackage.POJO_ENTITY__FEATURES);
    }
    return features;
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
      case ProcessorDslPackage.POJO_ENTITY__MODIFIERS1:
        return ((InternalEList<?>)getModifiers1()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.POJO_ENTITY__MODIFIERS2:
        return ((InternalEList<?>)getModifiers2()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.POJO_ENTITY__FEATURES:
        return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
      case ProcessorDslPackage.POJO_ENTITY__MODIFIERS1:
        return getModifiers1();
      case ProcessorDslPackage.POJO_ENTITY__NAME:
        return getName();
      case ProcessorDslPackage.POJO_ENTITY__MODIFIERS2:
        return getModifiers2();
      case ProcessorDslPackage.POJO_ENTITY__FEATURES:
        return getFeatures();
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
      case ProcessorDslPackage.POJO_ENTITY__MODIFIERS1:
        getModifiers1().clear();
        getModifiers1().addAll((Collection<? extends PojoEntityModifier1>)newValue);
        return;
      case ProcessorDslPackage.POJO_ENTITY__NAME:
        setName((String)newValue);
        return;
      case ProcessorDslPackage.POJO_ENTITY__MODIFIERS2:
        getModifiers2().clear();
        getModifiers2().addAll((Collection<? extends PojoEntityModifier2>)newValue);
        return;
      case ProcessorDslPackage.POJO_ENTITY__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends PojoProperty>)newValue);
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
      case ProcessorDslPackage.POJO_ENTITY__MODIFIERS1:
        getModifiers1().clear();
        return;
      case ProcessorDslPackage.POJO_ENTITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProcessorDslPackage.POJO_ENTITY__MODIFIERS2:
        getModifiers2().clear();
        return;
      case ProcessorDslPackage.POJO_ENTITY__FEATURES:
        getFeatures().clear();
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
      case ProcessorDslPackage.POJO_ENTITY__MODIFIERS1:
        return modifiers1 != null && !modifiers1.isEmpty();
      case ProcessorDslPackage.POJO_ENTITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProcessorDslPackage.POJO_ENTITY__MODIFIERS2:
        return modifiers2 != null && !modifiers2.isEmpty();
      case ProcessorDslPackage.POJO_ENTITY__FEATURES:
        return features != null && !features.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //PojoEntityImpl
