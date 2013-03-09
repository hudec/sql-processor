/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Meta Info Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseMetaInfoAssignement#getDbMetaInfo <em>Db Meta Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseMetaInfoAssignement()
 * @model
 * @generated
 */
public interface DatabaseMetaInfoAssignement extends EObject
{
  /**
   * Returns the value of the '<em><b>Db Meta Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Meta Info</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Meta Info</em>' attribute.
   * @see #setDbMetaInfo(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseMetaInfoAssignement_DbMetaInfo()
   * @model
   * @generated
   */
  String getDbMetaInfo();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseMetaInfoAssignement#getDbMetaInfo <em>Db Meta Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Meta Info</em>' attribute.
   * @see #getDbMetaInfo()
   * @generated
   */
  void setDbMetaInfo(String value);

} // DatabaseMetaInfoAssignement
