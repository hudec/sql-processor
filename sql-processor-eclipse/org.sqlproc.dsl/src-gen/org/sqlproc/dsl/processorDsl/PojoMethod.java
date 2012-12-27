/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pojo Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.PojoMethod#getScaffold <em>Scaffold</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.PojoMethod#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.PojoMethod#getToInits <em>To Inits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getPojoMethod()
 * @model
 * @generated
 */
public interface PojoMethod extends EObject
{
  /**
   * Returns the value of the '<em><b>Scaffold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scaffold</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scaffold</em>' attribute.
   * @see #setScaffold(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getPojoMethod_Scaffold()
   * @model
   * @generated
   */
  String getScaffold();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.PojoMethod#getScaffold <em>Scaffold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scaffold</em>' attribute.
   * @see #getScaffold()
   * @generated
   */
  void setScaffold(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getPojoMethod_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.PojoMethod#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>To Inits</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.PojoMethodArg}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Inits</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Inits</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getPojoMethod_ToInits()
   * @model containment="true"
   * @generated
   */
  EList<PojoMethodArg> getToInits();

} // PojoMethod
