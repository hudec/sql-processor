/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.dsl.processorDsl.DriverMethodOutputAssignement;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver Method Output Assignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DriverMethodOutputAssignementImpl#getDriverMethod <em>Driver Method</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DriverMethodOutputAssignementImpl#getCallOutput <em>Call Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DriverMethodOutputAssignementImpl extends MinimalEObjectImpl.Container implements DriverMethodOutputAssignement
{
  /**
   * The default value of the '{@link #getDriverMethod() <em>Driver Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDriverMethod()
   * @generated
   * @ordered
   */
  protected static final String DRIVER_METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDriverMethod() <em>Driver Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDriverMethod()
   * @generated
   * @ordered
   */
  protected String driverMethod = DRIVER_METHOD_EDEFAULT;

  /**
   * The default value of the '{@link #getCallOutput() <em>Call Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCallOutput()
   * @generated
   * @ordered
   */
  protected static final String CALL_OUTPUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCallOutput() <em>Call Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCallOutput()
   * @generated
   * @ordered
   */
  protected String callOutput = CALL_OUTPUT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DriverMethodOutputAssignementImpl()
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
    return ProcessorDslPackage.Literals.DRIVER_METHOD_OUTPUT_ASSIGNEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDriverMethod()
  {
    return driverMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDriverMethod(String newDriverMethod)
  {
    String oldDriverMethod = driverMethod;
    driverMethod = newDriverMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__DRIVER_METHOD, oldDriverMethod, driverMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCallOutput()
  {
    return callOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCallOutput(String newCallOutput)
  {
    String oldCallOutput = callOutput;
    callOutput = newCallOutput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__CALL_OUTPUT, oldCallOutput, callOutput));
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
      case ProcessorDslPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__DRIVER_METHOD:
        return getDriverMethod();
      case ProcessorDslPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__CALL_OUTPUT:
        return getCallOutput();
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
      case ProcessorDslPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__DRIVER_METHOD:
        setDriverMethod((String)newValue);
        return;
      case ProcessorDslPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__CALL_OUTPUT:
        setCallOutput((String)newValue);
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
      case ProcessorDslPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__DRIVER_METHOD:
        setDriverMethod(DRIVER_METHOD_EDEFAULT);
        return;
      case ProcessorDslPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__CALL_OUTPUT:
        setCallOutput(CALL_OUTPUT_EDEFAULT);
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
      case ProcessorDslPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__DRIVER_METHOD:
        return DRIVER_METHOD_EDEFAULT == null ? driverMethod != null : !DRIVER_METHOD_EDEFAULT.equals(driverMethod);
      case ProcessorDslPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT__CALL_OUTPUT:
        return CALL_OUTPUT_EDEFAULT == null ? callOutput != null : !CALL_OUTPUT_EDEFAULT.equals(callOutput);
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
    result.append(" (driverMethod: ");
    result.append(driverMethod);
    result.append(", callOutput: ");
    result.append(callOutput);
    result.append(')');
    return result.toString();
  }

} //DriverMethodOutputAssignementImpl
