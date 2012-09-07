/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.ColumnAssignement#getDbColumn <em>Db Column</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.ColumnAssignement#getNewName <em>New Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getColumnAssignement()
 * @model
 * @generated
 */
public interface ColumnAssignement extends EObject
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
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getColumnAssignement_DbColumn()
   * @model
   * @generated
   */
  String getDbColumn();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.ColumnAssignement#getDbColumn <em>Db Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Column</em>' attribute.
   * @see #getDbColumn()
   * @generated
   */
  void setDbColumn(String value);

  /**
   * Returns the value of the '<em><b>New Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Name</em>' attribute.
   * @see #setNewName(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getColumnAssignement_NewName()
   * @model
   * @generated
   */
  String getNewName();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.ColumnAssignement#getNewName <em>New Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Name</em>' attribute.
   * @see #getNewName()
   * @generated
   */
  void setNewName(String value);

} // ColumnAssignement
