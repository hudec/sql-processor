/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Meta Sql</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.IfMetaSql#getIfs <em>Ifs</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.IfMetaSql#getType <em>Type</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.IfMetaSql#getCond <em>Cond</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIfMetaSql()
 * @model
 * @generated
 */
public interface IfMetaSql extends EObject
{
  /**
   * Returns the value of the '<em><b>Ifs</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.IfSql}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifs</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIfMetaSql_Ifs()
   * @model containment="true"
   * @generated
   */
  EList<IfSql> getIfs();

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIfMetaSql_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.IfMetaSql#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(IfSqlCond)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIfMetaSql_Cond()
   * @model containment="true"
   * @generated
   */
  IfSqlCond getCond();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.IfMetaSql#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(IfSqlCond value);

} // IfMetaSql
