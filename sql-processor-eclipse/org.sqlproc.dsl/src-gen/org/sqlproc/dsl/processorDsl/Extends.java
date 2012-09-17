/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extends</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Extends#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getExtends()
 * @model
 * @generated
 */
public interface Extends extends AbstractPojoEntity
{
  /**
   * Returns the value of the '<em><b>Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' reference.
   * @see #setExtends(JvmType)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getExtends_Extends()
   * @model
   * @generated
   */
  JvmType getExtends();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Extends#getExtends <em>Extends</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends</em>' reference.
   * @see #getExtends()
   * @generated
   */
  void setExtends(JvmType value);

} // Extends
