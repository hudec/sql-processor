/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Type Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.MetaTypeAssignement#getDbColumn <em>Db Column</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.MetaTypeAssignement#getType <em>Type</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.MetaTypeAssignement#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMetaTypeAssignement()
 * @model
 * @generated
 */
public interface MetaTypeAssignement extends EObject
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
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMetaTypeAssignement_DbColumn()
   * @model
   * @generated
   */
  String getDbColumn();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.MetaTypeAssignement#getDbColumn <em>Db Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Column</em>' attribute.
   * @see #getDbColumn()
   * @generated
   */
  void setDbColumn(String value);

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
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMetaTypeAssignement_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.MetaTypeAssignement#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extension</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extension</em>' attribute.
   * @see #setExtension(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMetaTypeAssignement_Extension()
   * @model
   * @generated
   */
  String getExtension();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.MetaTypeAssignement#getExtension <em>Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extension</em>' attribute.
   * @see #getExtension()
   * @generated
   */
  void setExtension(String value);

} // MetaTypeAssignement
