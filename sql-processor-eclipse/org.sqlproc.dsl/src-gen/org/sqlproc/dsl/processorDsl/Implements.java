/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Implements#getImplements <em>Implements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getImplements()
 * @model
 * @generated
 */
public interface Implements extends AbstractPojoEntity
{
  /**
   * Returns the value of the '<em><b>Implements</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implements</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implements</em>' reference.
   * @see #setImplements(JvmType)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getImplements_Implements()
   * @model
   * @generated
   */
  JvmType getImplements();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Implements#getImplements <em>Implements</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implements</em>' reference.
   * @see #getImplements()
   * @generated
   */
  void setImplements(JvmType value);

} // Implements
