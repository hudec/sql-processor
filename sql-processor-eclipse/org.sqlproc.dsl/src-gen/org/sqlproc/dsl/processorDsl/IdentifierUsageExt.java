/**
 */
package org.sqlproc.dsl.processorDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier Usage Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.IdentifierUsageExt#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIdentifierUsageExt()
 * @model
 * @generated
 */
public interface IdentifierUsageExt extends PojoUsageExt
{
  /**
   * Returns the value of the '<em><b>Statement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' reference.
   * @see #setStatement(MetaStatement)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIdentifierUsageExt_Statement()
   * @model
   * @generated
   */
  MetaStatement getStatement();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.IdentifierUsageExt#getStatement <em>Statement</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(MetaStatement value);

} // IdentifierUsageExt
