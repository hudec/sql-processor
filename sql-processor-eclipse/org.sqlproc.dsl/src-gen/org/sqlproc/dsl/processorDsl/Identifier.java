/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Identifier#getMode <em>Mode</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Identifier#getCase <em>Case</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Identifier#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Identifier#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIdentifier()
 * @model
 * @generated
 */
public interface Identifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mode</em>' attribute.
   * @see #setMode(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIdentifier_Mode()
   * @model
   * @generated
   */
  String getMode();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Identifier#getMode <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' attribute.
   * @see #getMode()
   * @generated
   */
  void setMode(String value);

  /**
   * Returns the value of the '<em><b>Case</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case</em>' attribute.
   * @see #setCase(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIdentifier_Case()
   * @model
   * @generated
   */
  String getCase();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Identifier#getCase <em>Case</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case</em>' attribute.
   * @see #getCase()
   * @generated
   */
  void setCase(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIdentifier_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Identifier#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers</em>' attribute list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getIdentifier_Modifiers()
   * @model unique="false"
   * @generated
   */
  EList<String> getModifiers();

} // Identifier
