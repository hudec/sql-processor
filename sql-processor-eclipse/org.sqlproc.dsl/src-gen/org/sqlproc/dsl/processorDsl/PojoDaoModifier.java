/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pojo Dao Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.PojoDaoModifier#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.PojoDaoModifier#getSernum <em>Sernum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getPojoDaoModifier()
 * @model
 * @generated
 */
public interface PojoDaoModifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(PojoDao)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getPojoDaoModifier_SuperType()
   * @model
   * @generated
   */
  PojoDao getSuperType();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.PojoDaoModifier#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(PojoDao value);

  /**
   * Returns the value of the '<em><b>Sernum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sernum</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sernum</em>' attribute.
   * @see #setSernum(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getPojoDaoModifier_Sernum()
   * @model
   * @generated
   */
  String getSernum();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.PojoDaoModifier#getSernum <em>Sernum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sernum</em>' attribute.
   * @see #getSernum()
   * @generated
   */
  void setSernum(String value);

} // PojoDaoModifier
