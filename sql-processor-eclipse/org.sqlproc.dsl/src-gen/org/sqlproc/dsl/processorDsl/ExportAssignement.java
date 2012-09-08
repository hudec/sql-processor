/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.ExportAssignement#getDbColumn <em>Db Column</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.ExportAssignement#getFkTable <em>Fk Table</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.ExportAssignement#getFkColumn <em>Fk Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getExportAssignement()
 * @model
 * @generated
 */
public interface ExportAssignement extends EObject
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
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getExportAssignement_DbColumn()
   * @model
   * @generated
   */
  String getDbColumn();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.ExportAssignement#getDbColumn <em>Db Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Column</em>' attribute.
   * @see #getDbColumn()
   * @generated
   */
  void setDbColumn(String value);

  /**
   * Returns the value of the '<em><b>Fk Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fk Table</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fk Table</em>' attribute.
   * @see #setFkTable(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getExportAssignement_FkTable()
   * @model
   * @generated
   */
  String getFkTable();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.ExportAssignement#getFkTable <em>Fk Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fk Table</em>' attribute.
   * @see #getFkTable()
   * @generated
   */
  void setFkTable(String value);

  /**
   * Returns the value of the '<em><b>Fk Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fk Column</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fk Column</em>' attribute.
   * @see #setFkColumn(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getExportAssignement_FkColumn()
   * @model
   * @generated
   */
  String getFkColumn();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.ExportAssignement#getFkColumn <em>Fk Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fk Column</em>' attribute.
   * @see #getFkColumn()
   * @generated
   */
  void setFkColumn(String value);

} // ExportAssignement
