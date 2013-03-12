/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver Method Output Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DriverMethodOutputAssignement#getDriverMethod <em>Driver Method</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DriverMethodOutputAssignement#getCallOutput <em>Call Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDriverMethodOutputAssignement()
 * @model
 * @generated
 */
public interface DriverMethodOutputAssignement extends EObject
{
  /**
   * Returns the value of the '<em><b>Driver Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Driver Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Driver Method</em>' attribute.
   * @see #setDriverMethod(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDriverMethodOutputAssignement_DriverMethod()
   * @model
   * @generated
   */
  String getDriverMethod();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DriverMethodOutputAssignement#getDriverMethod <em>Driver Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Driver Method</em>' attribute.
   * @see #getDriverMethod()
   * @generated
   */
  void setDriverMethod(String value);

  /**
   * Returns the value of the '<em><b>Call Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Call Output</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Call Output</em>' attribute.
   * @see #setCallOutput(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDriverMethodOutputAssignement_CallOutput()
   * @model
   * @generated
   */
  String getCallOutput();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DriverMethodOutputAssignement#getCallOutput <em>Call Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Call Output</em>' attribute.
   * @see #getCallOutput()
   * @generated
   */
  void setCallOutput(String value);

} // DriverMethodOutputAssignement
