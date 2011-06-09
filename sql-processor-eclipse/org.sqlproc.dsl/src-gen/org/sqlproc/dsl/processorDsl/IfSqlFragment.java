/**
 * <copyright>
 * </copyright>
 *

 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Sql Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.IfSqlFragment#getValue <em>Value</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.IfSqlFragment#getCol <em>Col</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.IfSqlFragment#getCnst <em>Cnst</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.IfSqlFragment#getIdent <em>Ident</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.IfSqlFragment#getMeta <em>Meta</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIfSqlFragment()
 * @model
 * @generated
 */
public interface IfSqlFragment extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIfSqlFragment_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.IfSqlFragment#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Col</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Col</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Col</em>' containment reference.
   * @see #setCol(Column)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIfSqlFragment_Col()
   * @model containment="true"
   * @generated
   */
  Column getCol();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.IfSqlFragment#getCol <em>Col</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Col</em>' containment reference.
   * @see #getCol()
   * @generated
   */
  void setCol(Column value);

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
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIfSqlFragment_Cnst()
   * @model containment="true"
   * @generated
   */
  Constant getCnst();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.IfSqlFragment#getCnst <em>Cnst</em>}' containment reference.
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
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIfSqlFragment_Ident()
   * @model containment="true"
   * @generated
   */
  Identifier getIdent();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.IfSqlFragment#getIdent <em>Ident</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ident</em>' containment reference.
   * @see #getIdent()
   * @generated
   */
  void setIdent(Identifier value);

  /**
   * Returns the value of the '<em><b>Meta</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta</em>' containment reference.
   * @see #setMeta(IfMetaSql)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIfSqlFragment_Meta()
   * @model containment="true"
   * @generated
   */
  IfMetaSql getMeta();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.IfSqlFragment#getMeta <em>Meta</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta</em>' containment reference.
   * @see #getMeta()
   * @generated
   */
  void setMeta(IfMetaSql value);

} // IfSqlFragment
