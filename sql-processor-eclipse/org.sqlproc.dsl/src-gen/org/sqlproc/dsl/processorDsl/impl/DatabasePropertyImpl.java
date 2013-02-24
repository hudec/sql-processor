/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.dsl.processorDsl.DatabaseProperty;
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
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getDbSchema <em>Db Schema</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getDbDriver <em>Db Driver</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getDbExecuteBefore <em>Db Execute Before</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getDbExecuteAfter <em>Db Execute After</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getDbIndexTypes <em>Db Index Types</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl#getDbType <em>Db Type</em>}</li>
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
   * The default value of the '{@link #getDbSchema() <em>Db Schema</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbSchema()
   * @generated
   * @ordered
   */
  protected static final String DB_SCHEMA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbSchema() <em>Db Schema</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbSchema()
   * @generated
   * @ordered
   */
  protected String dbSchema = DB_SCHEMA_EDEFAULT;

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
   * The default value of the '{@link #getDbType() <em>Db Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbType()
   * @generated
   * @ordered
   */
  protected static final String DB_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbType() <em>Db Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbType()
   * @generated
   * @ordered
   */
  protected String dbType = DB_TYPE_EDEFAULT;

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
  public String getDbSchema()
  {
    return dbSchema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbSchema(String newDbSchema)
  {
    String oldDbSchema = dbSchema;
    dbSchema = newDbSchema;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DB_SCHEMA, oldDbSchema, dbSchema));
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
  public String getDbType()
  {
    return dbType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbType(String newDbType)
  {
    String oldDbType = dbType;
    dbType = newDbType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_PROPERTY__DB_TYPE, oldDbType, dbType));
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
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
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
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_SCHEMA:
        setDbSchema((String)newValue);
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
        setDbType((String)newValue);
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
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_SCHEMA:
        setDbSchema(DB_SCHEMA_EDEFAULT);
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
        setDbType(DB_TYPE_EDEFAULT);
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
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_SCHEMA:
        return DB_SCHEMA_EDEFAULT == null ? dbSchema != null : !DB_SCHEMA_EDEFAULT.equals(dbSchema);
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_DRIVER:
        return DB_DRIVER_EDEFAULT == null ? dbDriver != null : !DB_DRIVER_EDEFAULT.equals(dbDriver);
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_EXECUTE_BEFORE:
        return DB_EXECUTE_BEFORE_EDEFAULT == null ? dbExecuteBefore != null : !DB_EXECUTE_BEFORE_EDEFAULT.equals(dbExecuteBefore);
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_EXECUTE_AFTER:
        return DB_EXECUTE_AFTER_EDEFAULT == null ? dbExecuteAfter != null : !DB_EXECUTE_AFTER_EDEFAULT.equals(dbExecuteAfter);
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_INDEX_TYPES:
        return DB_INDEX_TYPES_EDEFAULT == null ? dbIndexTypes != null : !DB_INDEX_TYPES_EDEFAULT.equals(dbIndexTypes);
      case ProcessorDslPackage.DATABASE_PROPERTY__DB_TYPE:
        return DB_TYPE_EDEFAULT == null ? dbType != null : !DB_TYPE_EDEFAULT.equals(dbType);
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
    result.append(", dbSchema: ");
    result.append(dbSchema);
    result.append(", dbDriver: ");
    result.append(dbDriver);
    result.append(", dbExecuteBefore: ");
    result.append(dbExecuteBefore);
    result.append(", dbExecuteAfter: ");
    result.append(dbExecuteAfter);
    result.append(", dbIndexTypes: ");
    result.append(dbIndexTypes);
    result.append(", dbType: ");
    result.append(dbType);
    result.append(')');
    return result.toString();
  }

} //DatabasePropertyImpl
