/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbUrl <em>Db Url</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbUsername <em>Db Username</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbPassword <em>Db Password</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbCatalog <em>Db Catalog</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbSchema <em>Db Schema</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbDriver <em>Db Driver</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbExecuteBefore <em>Db Execute Before</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbExecuteAfter <em>Db Execute After</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbIndexTypes <em>Db Index Types</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbType <em>Db Type</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbMetaInfo <em>Db Meta Info</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbDriverInfo <em>Db Driver Info</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbMethodsCalls <em>Db Methods Calls</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDebug <em>Debug</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty()
 * @model
 * @generated
 */
public interface DatabaseProperty extends EObject
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
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_DbUrl()
   * @model
   * @generated
   */
  String getDbUrl();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbUrl <em>Db Url</em>}' attribute.
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
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_DbUsername()
   * @model
   * @generated
   */
  String getDbUsername();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbUsername <em>Db Username</em>}' attribute.
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
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_DbPassword()
   * @model
   * @generated
   */
  String getDbPassword();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbPassword <em>Db Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Password</em>' attribute.
   * @see #getDbPassword()
   * @generated
   */
  void setDbPassword(String value);

  /**
   * Returns the value of the '<em><b>Db Catalog</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Catalog</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Catalog</em>' containment reference.
   * @see #setDbCatalog(DatabaseCatalogAssignement)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_DbCatalog()
   * @model containment="true"
   * @generated
   */
  DatabaseCatalogAssignement getDbCatalog();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbCatalog <em>Db Catalog</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Catalog</em>' containment reference.
   * @see #getDbCatalog()
   * @generated
   */
  void setDbCatalog(DatabaseCatalogAssignement value);

  /**
   * Returns the value of the '<em><b>Db Schema</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Schema</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Schema</em>' containment reference.
   * @see #setDbSchema(DatabaseSchemaAssignement)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_DbSchema()
   * @model containment="true"
   * @generated
   */
  DatabaseSchemaAssignement getDbSchema();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbSchema <em>Db Schema</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Schema</em>' containment reference.
   * @see #getDbSchema()
   * @generated
   */
  void setDbSchema(DatabaseSchemaAssignement value);

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
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_DbDriver()
   * @model
   * @generated
   */
  String getDbDriver();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbDriver <em>Db Driver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Driver</em>' attribute.
   * @see #getDbDriver()
   * @generated
   */
  void setDbDriver(String value);

  /**
   * Returns the value of the '<em><b>Db Execute Before</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Execute Before</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Execute Before</em>' attribute.
   * @see #setDbExecuteBefore(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_DbExecuteBefore()
   * @model
   * @generated
   */
  String getDbExecuteBefore();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbExecuteBefore <em>Db Execute Before</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Execute Before</em>' attribute.
   * @see #getDbExecuteBefore()
   * @generated
   */
  void setDbExecuteBefore(String value);

  /**
   * Returns the value of the '<em><b>Db Execute After</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Execute After</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Execute After</em>' attribute.
   * @see #setDbExecuteAfter(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_DbExecuteAfter()
   * @model
   * @generated
   */
  String getDbExecuteAfter();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbExecuteAfter <em>Db Execute After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Execute After</em>' attribute.
   * @see #getDbExecuteAfter()
   * @generated
   */
  void setDbExecuteAfter(String value);

  /**
   * Returns the value of the '<em><b>Db Index Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Index Types</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Index Types</em>' attribute.
   * @see #setDbIndexTypes(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_DbIndexTypes()
   * @model
   * @generated
   */
  String getDbIndexTypes();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbIndexTypes <em>Db Index Types</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Index Types</em>' attribute.
   * @see #getDbIndexTypes()
   * @generated
   */
  void setDbIndexTypes(String value);

  /**
   * Returns the value of the '<em><b>Db Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Type</em>' containment reference.
   * @see #setDbType(DatabaseTypeAssignement)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_DbType()
   * @model containment="true"
   * @generated
   */
  DatabaseTypeAssignement getDbType();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbType <em>Db Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Type</em>' containment reference.
   * @see #getDbType()
   * @generated
   */
  void setDbType(DatabaseTypeAssignement value);

  /**
   * Returns the value of the '<em><b>Db Meta Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Meta Info</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Meta Info</em>' containment reference.
   * @see #setDbMetaInfo(DatabaseMetaInfoAssignement)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_DbMetaInfo()
   * @model containment="true"
   * @generated
   */
  DatabaseMetaInfoAssignement getDbMetaInfo();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbMetaInfo <em>Db Meta Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Meta Info</em>' containment reference.
   * @see #getDbMetaInfo()
   * @generated
   */
  void setDbMetaInfo(DatabaseMetaInfoAssignement value);

  /**
   * Returns the value of the '<em><b>Db Driver Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Driver Info</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Driver Info</em>' containment reference.
   * @see #setDbDriverInfo(DriverMetaInfoAssignement)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_DbDriverInfo()
   * @model containment="true"
   * @generated
   */
  DriverMetaInfoAssignement getDbDriverInfo();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbDriverInfo <em>Db Driver Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Driver Info</em>' containment reference.
   * @see #getDbDriverInfo()
   * @generated
   */
  void setDbDriverInfo(DriverMetaInfoAssignement value);

  /**
   * Returns the value of the '<em><b>Db Methods Calls</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.DriverMethodOutputAssignement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Methods Calls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Methods Calls</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_DbMethodsCalls()
   * @model containment="true"
   * @generated
   */
  EList<DriverMethodOutputAssignement> getDbMethodsCalls();

  /**
   * Returns the value of the '<em><b>Debug</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Debug</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Debug</em>' containment reference.
   * @see #setDebug(DebugLevelAssignement)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getDatabaseProperty_Debug()
   * @model containment="true"
   * @generated
   */
  DebugLevelAssignement getDebug();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDebug <em>Debug</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Debug</em>' containment reference.
   * @see #getDebug()
   * @generated
   */
  void setDebug(DebugLevelAssignement value);

} // DatabaseProperty
