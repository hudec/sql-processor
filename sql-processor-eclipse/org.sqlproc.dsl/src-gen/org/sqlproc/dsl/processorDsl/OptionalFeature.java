/**
 * <copyright>
 * </copyright>
 *

 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optional Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.OptionalFeature#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.OptionalFeature#getType <em>Type</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.OptionalFeature#getFilters <em>Filters</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.OptionalFeature#getOption <em>Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getOptionalFeature()
 * @model
 * @generated
 */
public interface OptionalFeature extends EObject
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
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getOptionalFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.OptionalFeature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.sqlproc.dsl.processorDsl.OPTION_TYPE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.sqlproc.dsl.processorDsl.OPTION_TYPE
   * @see #setType(OPTION_TYPE)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getOptionalFeature_Type()
   * @model
   * @generated
   */
  OPTION_TYPE getType();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.OptionalFeature#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.sqlproc.dsl.processorDsl.OPTION_TYPE
   * @see #getType()
   * @generated
   */
  void setType(OPTION_TYPE value);

  /**
   * Returns the value of the '<em><b>Filters</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filters</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filters</em>' attribute list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getOptionalFeature_Filters()
   * @model unique="false"
   * @generated
   */
  EList<String> getFilters();

  /**
   * Returns the value of the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option</em>' attribute.
   * @see #setOption(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getOptionalFeature_Option()
   * @model
   * @generated
   */
  String getOption();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.OptionalFeature#getOption <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option</em>' attribute.
   * @see #getOption()
   * @generated
   */
  void setOption(String value);

} // OptionalFeature
