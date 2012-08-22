/**
 */
package org.sqlproc.dsl.processorDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Usage Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.MappingUsageExt#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMappingUsageExt()
 * @model
 * @generated
 */
public interface MappingUsageExt extends PojoUsageExt
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
   * @see #setStatement(MappingRule)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMappingUsageExt_Statement()
   * @model
   * @generated
   */
  MappingRule getStatement();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.MappingUsageExt#getStatement <em>Statement</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(MappingRule value);

} // MappingUsageExt
