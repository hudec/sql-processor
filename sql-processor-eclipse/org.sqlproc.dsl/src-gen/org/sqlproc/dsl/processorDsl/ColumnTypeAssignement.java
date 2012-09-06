/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Type Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.ColumnTypeAssignement#getDbColumn <em>Db Column</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.ColumnTypeAssignement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getColumnTypeAssignement()
 * @model
 * @generated
 */
public interface ColumnTypeAssignement extends EObject
{
  /**
   * Returns the value of the '<em><b>Db Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Column</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Column</em>' attribute.
   * @see #setDbColumn(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getColumnTypeAssignement_DbColumn()
   * @model
   * @generated
   */
  String getDbColumn();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.ColumnTypeAssignement#getDbColumn <em>Db Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Column</em>' attribute.
   * @see #getDbColumn()
   * @generated
   */
  void setDbColumn(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(PojoType)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getColumnTypeAssignement_Type()
   * @model containment="true"
   * @generated
   */
  PojoType getType();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.ColumnTypeAssignement#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(PojoType value);

} // ColumnTypeAssignement
