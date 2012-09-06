/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDoResolvePojo <em>Do Resolve Pojo</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDoResolveDb <em>Do Resolve Db</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDbUrl <em>Db Url</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDbUsername <em>Db Username</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDbPassword <em>Db Password</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDbSchema <em>Db Schema</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDbDriver <em>Db Driver</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getSqlTypeAssignements <em>Sql Type Assignements</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDbTable <em>Db Table</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getColumnTypeAssignements <em>Column Type Assignements</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDbTables <em>Db Tables</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDbColumns <em>Db Columns</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getNewNames <em>New Names</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getPkTables <em>Pk Tables</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getPkColumns <em>Pk Columns</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getFkTables <em>Fk Tables</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getFkColumns <em>Fk Columns</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Do Resolve Pojo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Do Resolve Pojo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Do Resolve Pojo</em>' attribute.
   * @see #setDoResolvePojo(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_DoResolvePojo()
   * @model
   * @generated
   */
  String getDoResolvePojo();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Property#getDoResolvePojo <em>Do Resolve Pojo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Do Resolve Pojo</em>' attribute.
   * @see #getDoResolvePojo()
   * @generated
   */
  void setDoResolvePojo(String value);

  /**
   * Returns the value of the '<em><b>Do Resolve Db</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Do Resolve Db</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Do Resolve Db</em>' attribute.
   * @see #setDoResolveDb(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_DoResolveDb()
   * @model
   * @generated
   */
  String getDoResolveDb();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Property#getDoResolveDb <em>Do Resolve Db</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Do Resolve Db</em>' attribute.
   * @see #getDoResolveDb()
   * @generated
   */
  void setDoResolveDb(String value);

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

  /**
   * Returns the value of the '<em><b>Sql Type Assignements</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.SqlTypeAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sql Type Assignements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sql Type Assignements</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_SqlTypeAssignements()
   * @model containment="true"
   * @generated
   */
  EList<SqlTypeAssignement> getSqlTypeAssignements();

  /**
   * Returns the value of the '<em><b>Db Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Table</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Table</em>' attribute.
   * @see #setDbTable(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_DbTable()
   * @model
   * @generated
   */
  String getDbTable();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Property#getDbTable <em>Db Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Table</em>' attribute.
   * @see #getDbTable()
   * @generated
   */
  void setDbTable(String value);

  /**
   * Returns the value of the '<em><b>Column Type Assignements</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.ColumnTypeAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Type Assignements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Type Assignements</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_ColumnTypeAssignements()
   * @model containment="true"
   * @generated
   */
  EList<ColumnTypeAssignement> getColumnTypeAssignements();

  /**
   * Returns the value of the '<em><b>Db Tables</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Tables</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Tables</em>' attribute list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_DbTables()
   * @model unique="false"
   * @generated
   */
  EList<String> getDbTables();

  /**
   * Returns the value of the '<em><b>Db Columns</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Columns</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Columns</em>' attribute list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_DbColumns()
   * @model unique="false"
   * @generated
   */
  EList<String> getDbColumns();

  /**
   * Returns the value of the '<em><b>New Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Names</em>' attribute list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_NewNames()
   * @model unique="false"
   * @generated
   */
  EList<String> getNewNames();

  /**
   * Returns the value of the '<em><b>Pk Tables</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pk Tables</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pk Tables</em>' attribute list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_PkTables()
   * @model unique="false"
   * @generated
   */
  EList<String> getPkTables();

  /**
   * Returns the value of the '<em><b>Pk Columns</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pk Columns</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pk Columns</em>' attribute list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_PkColumns()
   * @model unique="false"
   * @generated
   */
  EList<String> getPkColumns();

  /**
   * Returns the value of the '<em><b>Fk Tables</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fk Tables</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fk Tables</em>' attribute list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_FkTables()
   * @model unique="false"
   * @generated
   */
  EList<String> getFkTables();

  /**
   * Returns the value of the '<em><b>Fk Columns</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fk Columns</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fk Columns</em>' attribute list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_FkColumns()
   * @model unique="false"
   * @generated
   */
  EList<String> getFkColumns();

} // Property
