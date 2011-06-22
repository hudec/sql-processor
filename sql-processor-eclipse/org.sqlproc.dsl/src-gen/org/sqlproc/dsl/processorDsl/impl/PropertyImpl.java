/**
 * <copyright>
 * </copyright>
 *
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;
import org.sqlproc.dsl.processorDsl.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#isPojo <em>Pojo</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#isDatabase <em>Database</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDbUrl <em>Db Url</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDbUsername <em>Db Username</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDbPassword <em>Db Password</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDbSchema <em>Db Schema</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDbDriver <em>Db Driver</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property
{
  /**
   * The default value of the '{@link #isPojo() <em>Pojo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPojo()
   * @generated
   * @ordered
   */
  protected static final boolean POJO_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPojo() <em>Pojo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPojo()
   * @generated
   * @ordered
   */
  protected boolean pojo = POJO_EDEFAULT;

  /**
   * The default value of the '{@link #isDatabase() <em>Database</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDatabase()
   * @generated
   * @ordered
   */
  protected static final boolean DATABASE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDatabase() <em>Database</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDatabase()
   * @generated
   * @ordered
   */
  protected boolean database = DATABASE_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyImpl()
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
    return ProcessorDslPackage.Literals.PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPojo()
  {
    return pojo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPojo(boolean newPojo)
  {
    boolean oldPojo = pojo;
    pojo = newPojo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__POJO, oldPojo, pojo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDatabase()
  {
    return database;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatabase(boolean newDatabase)
  {
    boolean oldDatabase = database;
    database = newDatabase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__DATABASE, oldDatabase, database));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__DB_URL, oldDbUrl, dbUrl));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__DB_USERNAME, oldDbUsername, dbUsername));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__DB_PASSWORD, oldDbPassword, dbPassword));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__DB_SCHEMA, oldDbSchema, dbSchema));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__DB_DRIVER, oldDbDriver, dbDriver));
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
      case ProcessorDslPackage.PROPERTY__POJO:
        return isPojo();
      case ProcessorDslPackage.PROPERTY__DATABASE:
        return isDatabase();
      case ProcessorDslPackage.PROPERTY__DB_URL:
        return getDbUrl();
      case ProcessorDslPackage.PROPERTY__DB_USERNAME:
        return getDbUsername();
      case ProcessorDslPackage.PROPERTY__DB_PASSWORD:
        return getDbPassword();
      case ProcessorDslPackage.PROPERTY__DB_SCHEMA:
        return getDbSchema();
      case ProcessorDslPackage.PROPERTY__DB_DRIVER:
        return getDbDriver();
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
      case ProcessorDslPackage.PROPERTY__POJO:
        setPojo((Boolean)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__DATABASE:
        setDatabase((Boolean)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__DB_URL:
        setDbUrl((String)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__DB_USERNAME:
        setDbUsername((String)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__DB_PASSWORD:
        setDbPassword((String)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__DB_SCHEMA:
        setDbSchema((String)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__DB_DRIVER:
        setDbDriver((String)newValue);
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
      case ProcessorDslPackage.PROPERTY__POJO:
        setPojo(POJO_EDEFAULT);
        return;
      case ProcessorDslPackage.PROPERTY__DATABASE:
        setDatabase(DATABASE_EDEFAULT);
        return;
      case ProcessorDslPackage.PROPERTY__DB_URL:
        setDbUrl(DB_URL_EDEFAULT);
        return;
      case ProcessorDslPackage.PROPERTY__DB_USERNAME:
        setDbUsername(DB_USERNAME_EDEFAULT);
        return;
      case ProcessorDslPackage.PROPERTY__DB_PASSWORD:
        setDbPassword(DB_PASSWORD_EDEFAULT);
        return;
      case ProcessorDslPackage.PROPERTY__DB_SCHEMA:
        setDbSchema(DB_SCHEMA_EDEFAULT);
        return;
      case ProcessorDslPackage.PROPERTY__DB_DRIVER:
        setDbDriver(DB_DRIVER_EDEFAULT);
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
      case ProcessorDslPackage.PROPERTY__POJO:
        return pojo != POJO_EDEFAULT;
      case ProcessorDslPackage.PROPERTY__DATABASE:
        return database != DATABASE_EDEFAULT;
      case ProcessorDslPackage.PROPERTY__DB_URL:
        return DB_URL_EDEFAULT == null ? dbUrl != null : !DB_URL_EDEFAULT.equals(dbUrl);
      case ProcessorDslPackage.PROPERTY__DB_USERNAME:
        return DB_USERNAME_EDEFAULT == null ? dbUsername != null : !DB_USERNAME_EDEFAULT.equals(dbUsername);
      case ProcessorDslPackage.PROPERTY__DB_PASSWORD:
        return DB_PASSWORD_EDEFAULT == null ? dbPassword != null : !DB_PASSWORD_EDEFAULT.equals(dbPassword);
      case ProcessorDslPackage.PROPERTY__DB_SCHEMA:
        return DB_SCHEMA_EDEFAULT == null ? dbSchema != null : !DB_SCHEMA_EDEFAULT.equals(dbSchema);
      case ProcessorDslPackage.PROPERTY__DB_DRIVER:
        return DB_DRIVER_EDEFAULT == null ? dbDriver != null : !DB_DRIVER_EDEFAULT.equals(dbDriver);
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
    result.append(" (pojo: ");
    result.append(pojo);
    result.append(", database: ");
    result.append(database);
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
    result.append(')');
    return result.toString();
  }

} //PropertyImpl
