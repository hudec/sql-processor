/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.MappingItem#getCol <em>Col</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.MappingItem#getAttr <em>Attr</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.MappingItem#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMappingItem()
 * @model
 * @generated
 */
public interface MappingItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Col</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Col</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Col</em>' attribute.
   * @see #setCol(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMappingItem_Col()
   * @model
   * @generated
   */
  String getCol();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.MappingItem#getCol <em>Col</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Col</em>' attribute.
   * @see #getCol()
   * @generated
   */
  void setCol(String value);

  /**
   * Returns the value of the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr</em>' containment reference.
   * @see #setAttr(MappingColumn)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMappingItem_Attr()
   * @model containment="true"
   * @generated
   */
  MappingColumn getAttr();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.MappingItem#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(MappingColumn value);

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
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMappingItem_Modifiers()
   * @model unique="false"
   * @generated
   */
  EList<String> getModifiers();

} // MappingItem
