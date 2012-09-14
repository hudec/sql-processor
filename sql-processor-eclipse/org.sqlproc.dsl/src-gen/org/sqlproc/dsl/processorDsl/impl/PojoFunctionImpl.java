/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.dsl.processorDsl.PojoFunction;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pojo Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoFunctionImpl#isToString <em>To String</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoFunctionImpl#isEquals <em>Equals</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoFunctionImpl#isHashCode <em>Hash Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PojoFunctionImpl extends MinimalEObjectImpl.Container implements PojoFunction
{
  /**
   * The default value of the '{@link #isToString() <em>To String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isToString()
   * @generated
   * @ordered
   */
  protected static final boolean TO_STRING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isToString() <em>To String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isToString()
   * @generated
   * @ordered
   */
  protected boolean toString = TO_STRING_EDEFAULT;

  /**
   * The default value of the '{@link #isEquals() <em>Equals</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEquals()
   * @generated
   * @ordered
   */
  protected static final boolean EQUALS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEquals() <em>Equals</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEquals()
   * @generated
   * @ordered
   */
  protected boolean equals = EQUALS_EDEFAULT;

  /**
   * The default value of the '{@link #isHashCode() <em>Hash Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHashCode()
   * @generated
   * @ordered
   */
  protected static final boolean HASH_CODE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHashCode() <em>Hash Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHashCode()
   * @generated
   * @ordered
   */
  protected boolean hashCode = HASH_CODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PojoFunctionImpl()
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
    return ProcessorDslPackage.Literals.POJO_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isToString()
  {
    return toString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToString(boolean newToString)
  {
    boolean oldToString = toString;
    toString = newToString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJO_FUNCTION__TO_STRING, oldToString, toString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEquals()
  {
    return equals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEquals(boolean newEquals)
  {
    boolean oldEquals = equals;
    equals = newEquals;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJO_FUNCTION__EQUALS, oldEquals, equals));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHashCode()
  {
    return hashCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHashCode(boolean newHashCode)
  {
    boolean oldHashCode = hashCode;
    hashCode = newHashCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJO_FUNCTION__HASH_CODE, oldHashCode, hashCode));
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
      case ProcessorDslPackage.POJO_FUNCTION__TO_STRING:
        return isToString();
      case ProcessorDslPackage.POJO_FUNCTION__EQUALS:
        return isEquals();
      case ProcessorDslPackage.POJO_FUNCTION__HASH_CODE:
        return isHashCode();
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
      case ProcessorDslPackage.POJO_FUNCTION__TO_STRING:
        setToString((Boolean)newValue);
        return;
      case ProcessorDslPackage.POJO_FUNCTION__EQUALS:
        setEquals((Boolean)newValue);
        return;
      case ProcessorDslPackage.POJO_FUNCTION__HASH_CODE:
        setHashCode((Boolean)newValue);
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
      case ProcessorDslPackage.POJO_FUNCTION__TO_STRING:
        setToString(TO_STRING_EDEFAULT);
        return;
      case ProcessorDslPackage.POJO_FUNCTION__EQUALS:
        setEquals(EQUALS_EDEFAULT);
        return;
      case ProcessorDslPackage.POJO_FUNCTION__HASH_CODE:
        setHashCode(HASH_CODE_EDEFAULT);
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
      case ProcessorDslPackage.POJO_FUNCTION__TO_STRING:
        return toString != TO_STRING_EDEFAULT;
      case ProcessorDslPackage.POJO_FUNCTION__EQUALS:
        return equals != EQUALS_EDEFAULT;
      case ProcessorDslPackage.POJO_FUNCTION__HASH_CODE:
        return hashCode != HASH_CODE_EDEFAULT;
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
    result.append(" (toString: ");
    result.append(toString);
    result.append(", equals: ");
    result.append(equals);
    result.append(", hashCode: ");
    result.append(hashCode);
    result.append(')');
    return result.toString();
  }

} //PojoFunctionImpl
