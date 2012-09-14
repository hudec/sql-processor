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
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getSqlTypes <em>Sql Types</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDbTable <em>Db Table</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getColumnTypes <em>Column Types</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDbTables <em>Db Tables</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDbColumns <em>Db Columns</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getTables <em>Tables</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getExports <em>Exports</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getImports <em>Imports</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDbColumn <em>Db Column</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getFunction <em>Function</em>}</li>
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
   * Returns the value of the '<em><b>Sql Types</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.SqlTypeAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sql Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sql Types</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_SqlTypes()
   * @model containment="true"
   * @generated
   */
  EList<SqlTypeAssignement> getSqlTypes();

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
   * Returns the value of the '<em><b>Column Types</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.ColumnTypeAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Types</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_ColumnTypes()
   * @model containment="true"
   * @generated
   */
  EList<ColumnTypeAssignement> getColumnTypes();

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
   * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.TableAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tables</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_Tables()
   * @model containment="true"
   * @generated
   */
  EList<TableAssignement> getTables();

  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.ColumnAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_Columns()
   * @model containment="true"
   * @generated
   */
  EList<ColumnAssignement> getColumns();

  /**
   * Returns the value of the '<em><b>Exports</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.ExportAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exports</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_Exports()
   * @model containment="true"
   * @generated
   */
  EList<ExportAssignement> getExports();

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.ImportAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportAssignement> getImports();

  /**
   * Returns the value of the '<em><b>Db Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Column</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Column</em>' attribute.
   * @see #setDbColumn(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_DbColumn()
   * @model
   * @generated
   */
  String getDbColumn();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Property#getDbColumn <em>Db Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Column</em>' attribute.
   * @see #getDbColumn()
   * @generated
   */
  void setDbColumn(String value);

  /**
   * Returns the value of the '<em><b>Inheritance</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.InheritanceAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inheritance</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inheritance</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_Inheritance()
   * @model containment="true"
   * @generated
   */
  EList<InheritanceAssignement> getInheritance();

  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.PojoFunction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_Function()
   * @model containment="true"
   * @generated
   */
  EList<PojoFunction> getFunction();

} // Property
