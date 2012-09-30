/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pojo Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.PojoProperty#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.PojoProperty#getNative <em>Native</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.PojoProperty#getAttrs <em>Attrs</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.PojoProperty#getRef <em>Ref</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.PojoProperty#getType <em>Type</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.PojoProperty#getGref <em>Gref</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.PojoProperty#getGtype <em>Gtype</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.PojoProperty#isArray <em>Array</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.PojoProperty#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getPojoProperty()
 * @model
 * @generated
 */
public interface PojoProperty extends EObject
{
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
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getPojoProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.PojoProperty#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Native</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Native</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Native</em>' attribute.
   * @see #setNative(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getPojoProperty_Native()
   * @model
   * @generated
   */
  String getNative();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.PojoProperty#getNative <em>Native</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Native</em>' attribute.
   * @see #getNative()
   * @generated
   */
  void setNative(String value);

  /**
   * Returns the value of the '<em><b>Attrs</b></em>' reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.PojoProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attrs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attrs</em>' reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getPojoProperty_Attrs()
   * @model
   * @generated
   */
  EList<PojoProperty> getAttrs();

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(PojoEntity)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getPojoProperty_Ref()
   * @model
   * @generated
   */
  PojoEntity getRef();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.PojoProperty#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(PojoEntity value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(JvmType)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getPojoProperty_Type()
   * @model
   * @generated
   */
  JvmType getType();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.PojoProperty#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmType value);

  /**
   * Returns the value of the '<em><b>Gref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gref</em>' reference.
   * @see #setGref(PojoEntity)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getPojoProperty_Gref()
   * @model
   * @generated
   */
  PojoEntity getGref();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.PojoProperty#getGref <em>Gref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gref</em>' reference.
   * @see #getGref()
   * @generated
   */
  void setGref(PojoEntity value);

  /**
   * Returns the value of the '<em><b>Gtype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gtype</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gtype</em>' reference.
   * @see #setGtype(JvmType)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getPojoProperty_Gtype()
   * @model
   * @generated
   */
  JvmType getGtype();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.PojoProperty#getGtype <em>Gtype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gtype</em>' reference.
   * @see #getGtype()
   * @generated
   */
  void setGtype(JvmType value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' attribute.
   * @see #setArray(boolean)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getPojoProperty_Array()
   * @model
   * @generated
   */
  boolean isArray();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.PojoProperty#isArray <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' attribute.
   * @see #isArray()
   * @generated
   */
  void setArray(boolean value);

  /**
   * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.PojoPropertyModifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getPojoProperty_Modifiers()
   * @model containment="true"
   * @generated
   */
  EList<PojoPropertyModifier> getModifiers();

} // PojoProperty
