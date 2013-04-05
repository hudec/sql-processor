/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sqlproc.dsl.processorDsl.DatabaseCatalogAssignement;
import org.sqlproc.dsl.processorDsl.DatabaseMetaInfoAssignement;
import org.sqlproc.dsl.processorDsl.DatabaseProperty;
import org.sqlproc.dsl.processorDsl.DatabaseSchemaAssignement;
import org.sqlproc.dsl.processorDsl.DatabaseTypeAssignement;
import org.sqlproc.dsl.processorDsl.DebugLevelAssignement;
import org.sqlproc.dsl.processorDsl.DriverMetaInfoAssignement;
import org.sqlproc.dsl.processorDsl.DriverMethodOutputAssignement;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getDbUrl <em>Db Url</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getDbUsername <em>Db Username</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getDbPassword <em>Db Password</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getDbCatalog <em>Db Catalog</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getDbSchema <em>Db Schema</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getDbDriver <em>Db Driver</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getDbExecuteBefore <em>Db Execute Before</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getDbExecuteAfter <em>Db Execute After</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getDbIndexTypes <em>Db Index Types</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getDbType <em>Db Type</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getDbMetaInfo <em>Db Meta Info</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getDbDriverInfo <em>Db Driver Info</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getDbMethodsCalls <em>Db Methods Calls</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getDebug <em>Debug</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabasePropertyImpl extends MinimalEObjectImpl.Container implements DatabaseProperty
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDbUrl() <em>Db Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbUrl()
   * @generated
   * @ordered
   */
  protected static final String DB_URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbUrl() <em>Db Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbUrl()
   * @generated
   * @ordered
   */
  protected String dbUrl = DB_URL_EDEFAULT;

  /**
   * The default value of the '{@link #getDbUsername() <em>Db Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbUsername()
   * @generated
   * @ordered
   */
  protected static final String DB_USERNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbUsername() <em>Db Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbUsername()
   * @generated
   * @ordered
   */
  protected String dbUsername = DB_USERNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDbPassword() <em>Db Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbPassword()
   * @generated
   * @ordered
   */
  protected static final String DB_PASSWORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbPassword() <em>Db Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbPassword()
   * @generated
   * @ordered
   */
  protected String dbPassword = DB_PASSWORD_EDEFAULT;

  /**
   * The cached value of the '{@link #getDbCatalog() <em>Db Catalog</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbCatalog()
   * @generated
   * @ordered
   */
  protected DatabaseCatalogAssignement dbCatalog;

  /**
   * The cached value of the '{@link #getDbSchema() <em>Db Schema</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbSchema()
   * @generated
   * @ordered
   */
  protected DatabaseSchemaAssignement dbSchema;

  /**
   * The default value of the '{@link #getDbDriver() <em>Db Driver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbDriver()
   * @generated
   * @ordered
   */
  protected static final String DB_DRIVER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbDriver() <em>Db Driver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbDriver()
   * @generated
   * @ordered
   */
  protected String dbDriver = DB_DRIVER_EDEFAULT;

  /**
   * The default value of the '{@link #getDbExecuteBefore() <em>Db Execute Before</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbExecuteBefore()
   * @generated
   * @ordered
   */
  protected static final String DB_EXECUTE_BEFORE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbExecuteBefore() <em>Db Execute Before</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbExecuteBefore()
   * @generated
   * @ordered
   */
  protected String dbExecuteBefore = DB_EXECUTE_BEFORE_EDEFAULT;

  /**
   * The default value of the '{@link #getDbExecuteAfter() <em>Db Execute After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbExecuteAfter()
   * @generated
   * @ordered
   */
  protected static final String DB_EXECUTE_AFTER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbExecuteAfter() <em>Db Execute After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbExecuteAfter()
   * @generated
   * @ordered
   */
  protected String dbExecuteAfter = DB_EXECUTE_AFTER_EDEFAULT;

  /**
   * The default value of the '{@link #getDbIndexTypes() <em>Db Index Types</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbIndexTypes()
   * @generated
   * @ordered
   */
  protected static final String DB_INDEX_TYPES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbIndexTypes() <em>Db Index Types</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbIndexTypes()
   * @generated
   * @ordered
   */
  protected String dbIndexTypes = DB_INDEX_TYPES_EDEFAULT;

  /**
   * The cached value of the '{@link #getDbType() <em>Db Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbType()
   * @generated
   * @ordered
   */
  protected DatabaseTypeAssignement dbType;

  /**
   * The cached value of the '{@link #getDbMetaInfo() <em>Db Meta Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbMetaInfo()
   * @generated
   * @ordered
   */
  protected DatabaseMetaInfoAssignement dbMetaInfo;

  /**
   * The cached value of the '{@link #getDbDriverInfo() <em>Db Driver Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbDriverInfo()
   * @generated
   * @ordered
   */
  protected DriverMetaInfoAssignement dbDriverInfo;

  /**
   * The cached value of the '{@link #getDbMethodsCalls() <em>Db Methods Calls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbMethodsCalls()
   * @generated
   * @ordered
   */
  protected EList<DriverMethodOutputAssignement> dbMethodsCalls;

  /**
   * The cached value of the '{@link #getDebug() <em>Debug</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDebug()
   * @generated
   * @ordered
   */
  protected DebugLevelAssignement debug;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatabasePropertyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ProcessorDslPackage.Literals.DATABASE_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbUrl()
  {
    return dbUrl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbUrl(String newDbUrl)
  {
    String oldDbUrl = dbUrl;
    dbUrl = newDbUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DB_URL, oldDbUrl, dbUrl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbUsername()
  {
    return dbUsername;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbUsername(String newDbUsername)
  {
    String oldDbUsername = dbUsername;
    dbUsername = newDbUsername;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DB_USERNAME, oldDbUsername, dbUsername));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbPassword()
  {
    return dbPassword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbPassword(String newDbPassword)
  {
    String oldDbPassword = dbPassword;
    dbPassword = newDbPassword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DB_PASSWORD, oldDbPassword, dbPassword));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseCatalogAssignement getDbCatalog()
  {
    return dbCatalog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbCatalog(DatabaseCatalogAssignement newDbCatalog, NotificationChain msgs)
  {
    DatabaseCatalogAssignement oldDbCatalog = dbCatalog;
    dbCatalog = newDbCatalog;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DB_CATALOG, oldDbCatalog, newDbCatalog);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbCatalog(DatabaseCatalogAssignement newDbCatalog)
  {
    if (newDbCatalog != dbCatalog)
    {
      NotificationChain msgs = null;
      if (dbCatalog != null)
        msgs = ((InternalEObject)dbCatalog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.DATABASE_PROPERTY__DB_CATALOG, null, msgs);
      if (newDbCatalog != null)
        msgs = ((InternalEObject)newDbCatalog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.DATABASE_PROPERTY__DB_CATALOG, null, msgs);
      msgs = basicSetDbCatalog(newDbCatalog, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DB_CATALOG, newDbCatalog, newDbCatalog));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseSchemaAssignement getDbSchema()
  {
    return dbSchema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbSchema(DatabaseSchemaAssignement newDbSchema, NotificationChain msgs)
  {
    DatabaseSchemaAssignement oldDbSchema = dbSchema;
    dbSchema = newDbSchema;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DB_SCHEMA, oldDbSchema, newDbSchema);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbSchema(DatabaseSchemaAssignement newDbSchema)
  {
    if (newDbSchema != dbSchema)
    {
      NotificationChain msgs = null;
      if (dbSchema != null)
        msgs = ((InternalEObject)dbSchema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.DATABASE_PROPERTY__DB_SCHEMA, null, msgs);
      if (newDbSchema != null)
        msgs = ((InternalEObject)newDbSchema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.DATABASE_PROPERTY__DB_SCHEMA, null, msgs);
      msgs = basicSetDbSchema(newDbSchema, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DB_SCHEMA, newDbSchema, newDbSchema));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbDriver()
  {
    return dbDriver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbDriver(String newDbDriver)
  {
    String oldDbDriver = dbDriver;
    dbDriver = newDbDriver;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DB_DRIVER, oldDbDriver, dbDriver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbExecuteBefore()
  {
    return dbExecuteBefore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbExecuteBefore(String newDbExecuteBefore)
  {
    String oldDbExecuteBefore = dbExecuteBefore;
    dbExecuteBefore = newDbExecuteBefore;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DB_EXECUTE_BEFORE, oldDbExecuteBefore, dbExecuteBefore));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbExecuteAfter()
  {
    return dbExecuteAfter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbExecuteAfter(String newDbExecuteAfter)
  {
    String oldDbExecuteAfter = dbExecuteAfter;
    dbExecuteAfter = newDbExecuteAfter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DB_EXECUTE_AFTER, oldDbExecuteAfter, dbExecuteAfter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbIndexTypes()
  {
    return dbIndexTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbIndexTypes(String newDbIndexTypes)
  {
    String oldDbIndexTypes = dbIndexTypes;
    dbIndexTypes = newDbIndexTypes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DB_INDEX_TYPES, oldDbIndexTypes, dbIndexTypes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseTypeAssignement getDbType()
  {
    return dbType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbType(DatabaseTypeAssignement newDbType, NotificationChain msgs)
  {
    DatabaseTypeAssignement oldDbType = dbType;
    dbType = newDbType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DB_TYPE, oldDbType, newDbType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbType(DatabaseTypeAssignement newDbType)
  {
    if (newDbType != dbType)
    {
      NotificationChain msgs = null;
      if (dbType != null)
        msgs = ((InternalEObject)dbType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.DATABASE_PROPERTY__DB_TYPE, null, msgs);
      if (newDbType != null)
        msgs = ((InternalEObject)newDbType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.DATABASE_PROPERTY__DB_TYPE, null, msgs);
      msgs = basicSetDbType(newDbType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DB_TYPE, newDbType, newDbType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseMetaInfoAssignement getDbMetaInfo()
  {
    return dbMetaInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbMetaInfo(DatabaseMetaInfoAssignement newDbMetaInfo, NotificationChain msgs)
  {
    DatabaseMetaInfoAssignement oldDbMetaInfo = dbMetaInfo;
    dbMetaInfo = newDbMetaInfo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DB_META_INFO, oldDbMetaInfo, newDbMetaInfo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbMetaInfo(DatabaseMetaInfoAssignement newDbMetaInfo)
  {
    if (newDbMetaInfo != dbMetaInfo)
    {
      NotificationChain msgs = null;
      if (dbMetaInfo != null)
        msgs = ((InternalEObject)dbMetaInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.DATABASE_PROPERTY__DB_META_INFO, null, msgs);
      if (newDbMetaInfo != null)
        msgs = ((InternalEObject)newDbMetaInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.DATABASE_PROPERTY__DB_META_INFO, null, msgs);
      msgs = basicSetDbMetaInfo(newDbMetaInfo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DB_META_INFO, newDbMetaInfo, newDbMetaInfo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DriverMetaInfoAssignement getDbDriverInfo()
  {
    return dbDriverInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbDriverInfo(DriverMetaInfoAssignement newDbDriverInfo, NotificationChain msgs)
  {
    DriverMetaInfoAssignement oldDbDriverInfo = dbDriverInfo;
    dbDriverInfo = newDbDriverInfo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DB_DRIVER_INFO, oldDbDriverInfo, newDbDriverInfo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbDriverInfo(DriverMetaInfoAssignement newDbDriverInfo)
  {
    if (newDbDriverInfo != dbDriverInfo)
    {
      NotificationChain msgs = null;
      if (dbDriverInfo != null)
        msgs = ((InternalEObject)dbDriverInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.DATABASE_PROPERTY__DB_DRIVER_INFO, null, msgs);
      if (newDbDriverInfo != null)
        msgs = ((InternalEObject)newDbDriverInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.DATABASE_PROPERTY__DB_DRIVER_INFO, null, msgs);
      msgs = basicSetDbDriverInfo(newDbDriverInfo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DB_DRIVER_INFO, newDbDriverInfo, newDbDriverInfo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DriverMethodOutputAssignement> getDbMethodsCalls()
  {
    if (dbMethodsCalls == null)
    {
      dbMethodsCalls = new EObjectContainmentEList<DriverMethodOutputAssignement>(DriverMethodOutputAssignement.class, this, ProcessorDslPackage.DATABASE_PROPERTY__DB_METHODS_CALLS);
    }
    return dbMethodsCalls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DebugLevelAssignement getDebug()
  {
    return debug;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDebug(DebugLevelAssignement newDebug, NotificationChain msgs)
  {
    DebugLevelAssignement oldDebug = debug;
    debug = newDebug;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DEBUG, oldDebug, newDebug);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDebug(DebugLevelAssignement newDebug)
  {
    if (newDebug != debug)
    {
      NotificationChain msgs = null;
      if (debug != null)
        msgs = ((InternalEObject)debug).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.DATABASE_PROPERTY__DEBUG, null, msgs);
      if (newDebug != null)
        msgs = ((InternalEObject)newDebug).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.DATABASE_PROPERTY__DEBUG, null, msgs);
      msgs = basicSetDebug(newDebug, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DEBUG, newDebug, newDebug));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_CATALOG:
        return basicSetDbCatalog(null, msgs);
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_SCHEMA:
        return basicSetDbSchema(null, msgs);
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_TYPE:
        return basicSetDbType(null, msgs);
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_META_INFO:
        return basicSetDbMetaInfo(null, msgs);
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_DRIVER_INFO:
        return basicSetDbDriverInfo(null, msgs);
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_METHODS_CALLS:
        return ((InternalEList<?>)getDbMethodsCalls()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.DATABASE_PROPERTY__DEBUG:
        return basicSetDebug(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ProcessorDslPackage.DATABASE_PROPERTY__NAME:
        return getName();
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_URL:
        return getDbUrl();
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_USERNAME:
        return getDbUsername();
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_PASSWORD:
        return getDbPassword();
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_CATALOG:
        return getDbCatalog();
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_SCHEMA:
        return getDbSchema();
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_DRIVER:
        return getDbDriver();
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_EXECUTE_BEFORE:
        return getDbExecuteBefore();
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_EXECUTE_AFTER:
        return getDbExecuteAfter();
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_INDEX_TYPES:
        return getDbIndexTypes();
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_TYPE:
        return getDbType();
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_META_INFO:
        return getDbMetaInfo();
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_DRIVER_INFO:
        return getDbDriverInfo();
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_METHODS_CALLS:
        return getDbMethodsCalls();
      case ProcessorDslPackage.DATABASE_PROPERTY__DEBUG:
        return getDebug();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProcessorDslPackage.DATABASE_PROPERTY__NAME:
        setName((String)newValue);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_URL:
        setDbUrl((String)newValue);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_USERNAME:
        setDbUsername((String)newValue);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_PASSWORD:
        setDbPassword((String)newValue);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_CATALOG:
        setDbCatalog((DatabaseCatalogAssignement)newValue);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_SCHEMA:
        setDbSchema((DatabaseSchemaAssignement)newValue);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_DRIVER:
        setDbDriver((String)newValue);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_EXECUTE_BEFORE:
        setDbExecuteBefore((String)newValue);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_EXECUTE_AFTER:
        setDbExecuteAfter((String)newValue);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_INDEX_TYPES:
        setDbIndexTypes((String)newValue);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_TYPE:
        setDbType((DatabaseTypeAssignement)newValue);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_META_INFO:
        setDbMetaInfo((DatabaseMetaInfoAssignement)newValue);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_DRIVER_INFO:
        setDbDriverInfo((DriverMetaInfoAssignement)newValue);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_METHODS_CALLS:
        getDbMethodsCalls().clear();
        getDbMethodsCalls().addAll((Collection<? extends DriverMethodOutputAssignement>)newValue);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DEBUG:
        setDebug((DebugLevelAssignement)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ProcessorDslPackage.DATABASE_PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_URL:
        setDbUrl(DB_URL_EDEFAULT);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_USERNAME:
        setDbUsername(DB_USERNAME_EDEFAULT);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_PASSWORD:
        setDbPassword(DB_PASSWORD_EDEFAULT);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_CATALOG:
        setDbCatalog((DatabaseCatalogAssignement)null);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_SCHEMA:
        setDbSchema((DatabaseSchemaAssignement)null);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_DRIVER:
        setDbDriver(DB_DRIVER_EDEFAULT);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_EXECUTE_BEFORE:
        setDbExecuteBefore(DB_EXECUTE_BEFORE_EDEFAULT);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_EXECUTE_AFTER:
        setDbExecuteAfter(DB_EXECUTE_AFTER_EDEFAULT);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_INDEX_TYPES:
        setDbIndexTypes(DB_INDEX_TYPES_EDEFAULT);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_TYPE:
        setDbType((DatabaseTypeAssignement)null);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_META_INFO:
        setDbMetaInfo((DatabaseMetaInfoAssignement)null);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_DRIVER_INFO:
        setDbDriverInfo((DriverMetaInfoAssignement)null);
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_METHODS_CALLS:
        getDbMethodsCalls().clear();
        return;
      case ProcessorDslPackage.DATABASE_PROPERTY__DEBUG:
        setDebug((DebugLevelAssignement)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ProcessorDslPackage.DATABASE_PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_URL:
        return DB_URL_EDEFAULT == null ? dbUrl != null : !DB_URL_EDEFAULT.equals(dbUrl);
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_USERNAME:
        return DB_USERNAME_EDEFAULT == null ? dbUsername != null : !DB_USERNAME_EDEFAULT.equals(dbUsername);
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_PASSWORD:
        return DB_PASSWORD_EDEFAULT == null ? dbPassword != null : !DB_PASSWORD_EDEFAULT.equals(dbPassword);
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_CATALOG:
        return dbCatalog != null;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_SCHEMA:
        return dbSchema != null;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_DRIVER:
        return DB_DRIVER_EDEFAULT == null ? dbDriver != null : !DB_DRIVER_EDEFAULT.equals(dbDriver);
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_EXECUTE_BEFORE:
        return DB_EXECUTE_BEFORE_EDEFAULT == null ? dbExecuteBefore != null : !DB_EXECUTE_BEFORE_EDEFAULT.equals(dbExecuteBefore);
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_EXECUTE_AFTER:
        return DB_EXECUTE_AFTER_EDEFAULT == null ? dbExecuteAfter != null : !DB_EXECUTE_AFTER_EDEFAULT.equals(dbExecuteAfter);
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_INDEX_TYPES:
        return DB_INDEX_TYPES_EDEFAULT == null ? dbIndexTypes != null : !DB_INDEX_TYPES_EDEFAULT.equals(dbIndexTypes);
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_TYPE:
        return dbType != null;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_META_INFO:
        return dbMetaInfo != null;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_DRIVER_INFO:
        return dbDriverInfo != null;
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_METHODS_CALLS:
        return dbMethodsCalls != null && !dbMethodsCalls.isEmpty();
      case ProcessorDslPackage.DATABASE_PROPERTY__DEBUG:
        return debug != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", dbUrl: ");
    result.append(dbUrl);
    result.append(", dbUsername: ");
    result.append(dbUsername);
    result.append(", dbPassword: ");
    result.append(dbPassword);
    result.append(", dbDriver: ");
    result.append(dbDriver);
    result.append(", dbExecuteBefore: ");
    result.append(dbExecuteBefore);
    result.append(", dbExecuteAfter: ");
    result.append(dbExecuteAfter);
    result.append(", dbIndexTypes: ");
    result.append(dbIndexTypes);
    result.append(')');
    return result.toString();
  }

} //DatabasePropertyImpl
