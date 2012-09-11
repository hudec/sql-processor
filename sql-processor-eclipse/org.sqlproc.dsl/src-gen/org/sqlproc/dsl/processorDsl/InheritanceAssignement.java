/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.InheritanceAssignement#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.InheritanceAssignement#getDbTable <em>Db Table</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.InheritanceAssignement#getDbColumns <em>Db Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getInheritanceAssignement()
 * @model
 * @generated
 */
public interface InheritanceAssignement extends EObject
{
  /**
   * Returns the value of the '<em><b>Discriminator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discriminator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discriminator</em>' attribute.
   * @see #setDiscriminator(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getInheritanceAssignement_Discriminator()
   * @model
   * @generated
   */
  String getDiscriminator();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.InheritanceAssignement#getDiscriminator <em>Discriminator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Discriminator</em>' attribute.
   * @see #getDiscriminator()
   * @generated
   */
  void setDiscriminator(String value);

  /**
   * Returns the value of the '<em><b>Db Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Table</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Table</em>' attribute.
   * @see #setDbTable(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getInheritanceAssignement_DbTable()
   * @model
   * @generated
   */
  String getDbTable();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.InheritanceAssignement#getDbTable <em>Db Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Table</em>' attribute.
   * @see #getDbTable()
   * @generated
   */
  void setDbTable(String value);

  /**
   * Returns the value of the '<em><b>Db Columns</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Columns</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Columns</em>' attribute list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getInheritanceAssignement_DbColumns()
   * @model unique="false"
   * @generated
   */
  EList<String> getDbColumns();

} // InheritanceAssignement
