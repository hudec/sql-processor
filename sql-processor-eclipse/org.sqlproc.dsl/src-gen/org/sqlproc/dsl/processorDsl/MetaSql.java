/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Sql</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.MetaSql#getIfs <em>Ifs</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.MetaSql#getType <em>Type</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.MetaSql#getCond <em>Cond</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.MetaSql#getFtype <em>Ftype</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.MetaSql#getOrd <em>Ord</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMetaSql()
 * @model
 * @generated
 */
public interface MetaSql extends EObject
{
  /**
   * Returns the value of the '<em><b>Ifs</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.IfSql}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifs</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMetaSql_Ifs()
   * @model containment="true"
   * @generated
   */
  EList<IfSql> getIfs();

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
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMetaSql_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.MetaSql#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

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
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMetaSql_Cond()
   * @model containment="true"
   * @generated
   */
  IfSqlCond getCond();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.MetaSql#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(IfSqlCond value);

  /**
   * Returns the value of the '<em><b>Ftype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ftype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ftype</em>' attribute.
   * @see #setFtype(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMetaSql_Ftype()
   * @model
   * @generated
   */
  String getFtype();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.MetaSql#getFtype <em>Ftype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ftype</em>' attribute.
   * @see #getFtype()
   * @generated
   */
  void setFtype(String value);

  /**
   * Returns the value of the '<em><b>Ord</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ord</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ord</em>' containment reference.
   * @see #setOrd(OrdSql)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMetaSql_Ord()
   * @model containment="true"
   * @generated
   */
  OrdSql getOrd();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.MetaSql#getOrd <em>Ord</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ord</em>' containment reference.
   * @see #getOrd()
   * @generated
   */
  void setOrd(OrdSql value);

} // MetaSql
