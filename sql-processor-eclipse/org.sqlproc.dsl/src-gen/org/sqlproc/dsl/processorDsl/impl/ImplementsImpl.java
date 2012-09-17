/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmType;

import org.sqlproc.dsl.processorDsl.Implements;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.ImplementsImpl#getImplements <em>Implements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementsImpl extends AbstractPojoEntityImpl implements Implements
{
  /**
   * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplements()
   * @generated
   * @ordered
   */
  protected JvmType implements_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImplementsImpl()
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
    return ProcessorDslPackage.Literals.IMPLEMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType getImplements()
  {
    if (implements_ != null && implements_.eIsProxy())
    {
      InternalEObject oldImplements = (InternalEObject)implements_;
      implements_ = (JvmType)eResolveProxy(oldImplements);
      if (implements_ != oldImplements)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorDslPackage.IMPLEMENTS__IMPLEMENTS, oldImplements, implements_));
      }
    }
    return implements_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetImplements()
  {
    return implements_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplements(JvmType newImplements)
  {
    JvmType oldImplements = implements_;
    implements_ = newImplements;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IMPLEMENTS__IMPLEMENTS, oldImplements, implements_));
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
      case ProcessorDslPackage.IMPLEMENTS__IMPLEMENTS:
        if (resolve) return getImplements();
        return basicGetImplements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProcessorDslPackage.IMPLEMENTS__IMPLEMENTS:
        setImplements((JvmType)newValue);
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
      case ProcessorDslPackage.IMPLEMENTS__IMPLEMENTS:
        setImplements((JvmType)null);
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
      case ProcessorDslPackage.IMPLEMENTS__IMPLEMENTS:
        return implements_ != null;
    }
    return super.eIsSet(featureID);
  }

} //ImplementsImpl
