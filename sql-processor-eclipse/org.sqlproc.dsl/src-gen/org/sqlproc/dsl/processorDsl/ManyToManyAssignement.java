/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Many To Many Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.ManyToManyAssignement#getPkColumn <em>Pk Column</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.ManyToManyAssignement#getPkTable <em>Pk Table</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.ManyToManyAssignement#getFkColumn <em>Fk Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getManyToManyAssignement()
 * @model
 * @generated
 */
public interface ManyToManyAssignement extends EObject
{
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
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getManyToManyAssignement_PkColumn()
   * @model
   * @generated
   */
  String getPkColumn();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.ManyToManyAssignement#getPkColumn <em>Pk Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pk Column</em>' attribute.
   * @see #getPkColumn()
   * @generated
   */
  void setPkColumn(String value);

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
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getManyToManyAssignement_PkTable()
   * @model
   * @generated
   */
  String getPkTable();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.ManyToManyAssignement#getPkTable <em>Pk Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pk Table</em>' attribute.
   * @see #getPkTable()
   * @generated
   */
  void setPkTable(String value);

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
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getManyToManyAssignement_FkColumn()
   * @model
   * @generated
   */
  String getFkColumn();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.ManyToManyAssignement#getFkColumn <em>Fk Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fk Column</em>' attribute.
   * @see #getFkColumn()
   * @generated
   */
  void setFkColumn(String value);

} // ManyToManyAssignement
