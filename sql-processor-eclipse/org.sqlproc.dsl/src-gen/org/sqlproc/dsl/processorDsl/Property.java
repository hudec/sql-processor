/**
 * <copyright>
 * </copyright>
 *
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#isPojo <em>Pojo</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#isDatabase <em>Database</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDbUrl <em>Db Url</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDbUsername <em>Db Username</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDbPassword <em>Db Password</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDbSchema <em>Db Schema</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDbDriver <em>Db Driver</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
{
  /**
   * Returns the value of the '<em><b>Pojo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pojo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pojo</em>' attribute.
   * @see #setPojo(boolean)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_Pojo()
   * @model
   * @generated
   */
  boolean isPojo();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Property#isPojo <em>Pojo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pojo</em>' attribute.
   * @see #isPojo()
   * @generated
   */
  void setPojo(boolean value);

  /**
   * Returns the value of the '<em><b>Database</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Database</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Database</em>' attribute.
   * @see #setDatabase(boolean)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_Database()
   * @model
   * @generated
   */
  boolean isDatabase();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Property#isDatabase <em>Database</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Database</em>' attribute.
   * @see #isDatabase()
   * @generated
   */
  void setDatabase(boolean value);

  /**
   * Returns the value of the '<em><b>Db Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Url</em>' attribute.
   * @see #setDbUrl(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_DbUrl()
   * @model
   * @generated
   */
  String getDbUrl();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Property#getDbUrl <em>Db Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Url</em>' attribute.
   * @see #getDbUrl()
   * @generated
   */
  void setDbUrl(String value);

  /**
   * Returns the value of the '<em><b>Db Username</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Username</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Username</em>' attribute.
   * @see #setDbUsername(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_DbUsername()
   * @model
   * @generated
   */
  String getDbUsername();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Property#getDbUsername <em>Db Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Username</em>' attribute.
   * @see #getDbUsername()
   * @generated
   */
  void setDbUsername(String value);

  /**
   * Returns the value of the '<em><b>Db Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Password</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Password</em>' attribute.
   * @see #setDbPassword(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_DbPassword()
   * @model
   * @generated
   */
  String getDbPassword();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Property#getDbPassword <em>Db Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Password</em>' attribute.
   * @see #getDbPassword()
   * @generated
   */
  void setDbPassword(String value);

  /**
   * Returns the value of the '<em><b>Db Schema</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Schema</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Schema</em>' attribute.
   * @see #setDbSchema(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_DbSchema()
   * @model
   * @generated
   */
  String getDbSchema();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Property#getDbSchema <em>Db Schema</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Schema</em>' attribute.
   * @see #getDbSchema()
   * @generated
   */
  void setDbSchema(String value);

  /**
   * Returns the value of the '<em><b>Db Driver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Driver</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Driver</em>' attribute.
   * @see #setDbDriver(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_DbDriver()
   * @model
   * @generated
   */
  String getDbDriver();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Property#getDbDriver <em>Db Driver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Driver</em>' attribute.
   * @see #getDbDriver()
   * @generated
   */
  void setDbDriver(String value);

} // Property
