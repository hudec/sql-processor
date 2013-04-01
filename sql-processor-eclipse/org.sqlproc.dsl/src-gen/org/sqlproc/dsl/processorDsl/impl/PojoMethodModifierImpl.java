/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.dsl.processorDsl.PojoMethodModifier;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pojo Method Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoMethodModifierImpl#isCallFunction <em>Call Function</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoMethodModifierImpl#isCallUpdate <em>Call Update</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoMethodModifierImpl#isCallQuery <em>Call Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PojoMethodModifierImpl extends MinimalEObjectImpl.Container implements PojoMethodModifier
{
  /**
   * The default value of the '{@link #isCallFunction() <em>Call Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCallFunction()
   * @generated
   * @ordered
   */
  protected static final boolean CALL_FUNCTION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCallFunction() <em>Call Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCallFunction()
   * @generated
   * @ordered
   */
  protected boolean callFunction = CALL_FUNCTION_EDEFAULT;

  /**
   * The default value of the '{@link #isCallUpdate() <em>Call Update</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCallUpdate()
   * @generated
   * @ordered
   */
  protected static final boolean CALL_UPDATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCallUpdate() <em>Call Update</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCallUpdate()
   * @generated
   * @ordered
   */
  protected boolean callUpdate = CALL_UPDATE_EDEFAULT;

  /**
   * The default value of the '{@link #isCallQuery() <em>Call Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCallQuery()
   * @generated
   * @ordered
   */
  protected static final boolean CALL_QUERY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCallQuery() <em>Call Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCallQuery()
   * @generated
   * @ordered
   */
  protected boolean callQuery = CALL_QUERY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PojoMethodModifierImpl()
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
    return ProcessorDslPackage.Literals.POJO_METHOD_MODIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCallFunction()
  {
    return callFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCallFunction(boolean newCallFunction)
  {
    boolean oldCallFunction = callFunction;
    callFunction = newCallFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJO_METHOD_MODIFIER__CALL_FUNCTION, oldCallFunction, callFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCallUpdate()
  {
    return callUpdate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCallUpdate(boolean newCallUpdate)
  {
    boolean oldCallUpdate = callUpdate;
    callUpdate = newCallUpdate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJO_METHOD_MODIFIER__CALL_UPDATE, oldCallUpdate, callUpdate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCallQuery()
  {
    return callQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCallQuery(boolean newCallQuery)
  {
    boolean oldCallQuery = callQuery;
    callQuery = newCallQuery;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJO_METHOD_MODIFIER__CALL_QUERY, oldCallQuery, callQuery));
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
      case ProcessorDslPackage.POJO_METHOD_MODIFIER__CALL_FUNCTION:
        return isCallFunction();
      case ProcessorDslPackage.POJO_METHOD_MODIFIER__CALL_UPDATE:
        return isCallUpdate();
      case ProcessorDslPackage.POJO_METHOD_MODIFIER__CALL_QUERY:
        return isCallQuery();
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
      case ProcessorDslPackage.POJO_METHOD_MODIFIER__CALL_FUNCTION:
        setCallFunction((Boolean)newValue);
        return;
      case ProcessorDslPackage.POJO_METHOD_MODIFIER__CALL_UPDATE:
        setCallUpdate((Boolean)newValue);
        return;
      case ProcessorDslPackage.POJO_METHOD_MODIFIER__CALL_QUERY:
        setCallQuery((Boolean)newValue);
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
      case ProcessorDslPackage.POJO_METHOD_MODIFIER__CALL_FUNCTION:
        setCallFunction(CALL_FUNCTION_EDEFAULT);
        return;
      case ProcessorDslPackage.POJO_METHOD_MODIFIER__CALL_UPDATE:
        setCallUpdate(CALL_UPDATE_EDEFAULT);
        return;
      case ProcessorDslPackage.POJO_METHOD_MODIFIER__CALL_QUERY:
        setCallQuery(CALL_QUERY_EDEFAULT);
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
      case ProcessorDslPackage.POJO_METHOD_MODIFIER__CALL_FUNCTION:
        return callFunction != CALL_FUNCTION_EDEFAULT;
      case ProcessorDslPackage.POJO_METHOD_MODIFIER__CALL_UPDATE:
        return callUpdate != CALL_UPDATE_EDEFAULT;
      case ProcessorDslPackage.POJO_METHOD_MODIFIER__CALL_QUERY:
        return callQuery != CALL_QUERY_EDEFAULT;
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
    result.append(" (callFunction: ");
    result.append(callFunction);
    result.append(", callUpdate: ");
    result.append(callUpdate);
    result.append(", callQuery: ");
    result.append(callQuery);
    result.append(')');
    return result.toString();
  }

} //PojoMethodModifierImpl
