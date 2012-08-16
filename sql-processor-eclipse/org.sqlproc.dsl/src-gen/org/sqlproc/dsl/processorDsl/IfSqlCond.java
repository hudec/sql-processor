/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Sql Cond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.IfSqlCond#getBool1 <em>Bool1</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.IfSqlCond#getOper <em>Oper</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.IfSqlCond#getBool2 <em>Bool2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIfSqlCond()
 * @model
 * @generated
 */
public interface IfSqlCond extends EObject
{
  /**
   * Returns the value of the '<em><b>Bool1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool1</em>' containment reference.
   * @see #setBool1(IfSqlBool)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIfSqlCond_Bool1()
   * @model containment="true"
   * @generated
   */
  IfSqlBool getBool1();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.IfSqlCond#getBool1 <em>Bool1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool1</em>' containment reference.
   * @see #getBool1()
   * @generated
   */
  void setBool1(IfSqlBool value);

  /**
   * Returns the value of the '<em><b>Oper</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Oper</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Oper</em>' attribute list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIfSqlCond_Oper()
   * @model unique="false"
   * @generated
   */
  EList<String> getOper();

  /**
   * Returns the value of the '<em><b>Bool2</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.IfSqlBool}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool2</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIfSqlCond_Bool2()
   * @model containment="true"
   * @generated
   */
  EList<IfSqlBool> getBool2();

} // IfSqlCond
