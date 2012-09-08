/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.ImportAssignement#getDbColumn <em>Db Column</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.ImportAssignement#getPkTable <em>Pk Table</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.ImportAssignement#getPkColumn <em>Pk Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getImportAssignement()
 * @model
 * @generated
 */
public interface ImportAssignement extends EObject
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
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getImportAssignement_DbColumn()
   * @model
   * @generated
   */
  String getDbColumn();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.ImportAssignement#getDbColumn <em>Db Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Column</em>' attribute.
   * @see #getDbColumn()
   * @generated
   */
  void setDbColumn(String value);

  /**
   * Returns the value of the '<em><b>Pk Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pk Table</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pk Table</em>' attribute.
   * @see #setPkTable(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getImportAssignement_PkTable()
   * @model
   * @generated
   */
  String getPkTable();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.ImportAssignement#getPkTable <em>Pk Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pk Table</em>' attribute.
   * @see #getPkTable()
   * @generated
   */
  void setPkTable(String value);

  /**
   * Returns the value of the '<em><b>Pk Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pk Column</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pk Column</em>' attribute.
   * @see #setPkColumn(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getImportAssignement_PkColumn()
   * @model
   * @generated
   */
  String getPkColumn();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.ImportAssignement#getPkColumn <em>Pk Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pk Column</em>' attribute.
   * @see #getPkColumn()
   * @generated
   */
  void setPkColumn(String value);

} // ImportAssignement
