/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jdbc Meta Info Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.JdbcMetaInfoAssignement#getDbJdbcInfo <em>Db Jdbc Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getJdbcMetaInfoAssignement()
 * @model
 * @generated
 */
public interface JdbcMetaInfoAssignement extends EObject
{
  /**
   * Returns the value of the '<em><b>Db Jdbc Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Jdbc Info</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Jdbc Info</em>' attribute.
   * @see #setDbJdbcInfo(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getJdbcMetaInfoAssignement_DbJdbcInfo()
   * @model
   * @generated
   */
  String getDbJdbcInfo();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.JdbcMetaInfoAssignement#getDbJdbcInfo <em>Db Jdbc Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Jdbc Info</em>' attribute.
   * @see #getDbJdbcInfo()
   * @generated
   */
  void setDbJdbcInfo(String value);

} // JdbcMetaInfoAssignement
