/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Sql Bool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.IfSqlBool#isNot <em>Not</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.IfSqlBool#getCnst <em>Cnst</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.IfSqlBool#getIdent <em>Ident</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.IfSqlBool#getCond <em>Cond</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIfSqlBool()
 * @model
 * @generated
 */
public interface IfSqlBool extends EObject
{
  /**
   * Returns the value of the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not</em>' attribute.
   * @see #setNot(boolean)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIfSqlBool_Not()
   * @model
   * @generated
   */
  boolean isNot();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.IfSqlBool#isNot <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not</em>' attribute.
   * @see #isNot()
   * @generated
   */
  void setNot(boolean value);

  /**
   * Returns the value of the '<em><b>Cnst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cnst</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cnst</em>' containment reference.
   * @see #setCnst(Constant)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIfSqlBool_Cnst()
   * @model containment="true"
   * @generated
   */
  Constant getCnst();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.IfSqlBool#getCnst <em>Cnst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cnst</em>' containment reference.
   * @see #getCnst()
   * @generated
   */
  void setCnst(Constant value);

  /**
   * Returns the value of the '<em><b>Ident</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ident</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ident</em>' containment reference.
   * @see #setIdent(Identifier)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIfSqlBool_Ident()
   * @model containment="true"
   * @generated
   */
  Identifier getIdent();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.IfSqlBool#getIdent <em>Ident</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ident</em>' containment reference.
   * @see #getIdent()
   * @generated
   */
  void setIdent(Identifier value);

  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(IfSqlCond)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIfSqlBool_Cond()
   * @model containment="true"
   * @generated
   */
  IfSqlCond getCond();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.IfSqlBool#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(IfSqlCond value);

} // IfSqlBool
