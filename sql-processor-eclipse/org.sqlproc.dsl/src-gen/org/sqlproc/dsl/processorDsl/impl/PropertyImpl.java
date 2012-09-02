/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.dsl.processorDsl.PojoType;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;
import org.sqlproc.dsl.processorDsl.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDoResolvePojo <em>Do Resolve Pojo</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDoResolveDb <em>Do Resolve Db</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDbUrl <em>Db Url</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDbUsername <em>Db Username</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDbPassword <em>Db Password</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDbSchema <em>Db Schema</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDbDriver <em>Db Driver</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDbTable <em>Db Table</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDbColumn <em>Db Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property
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
   * The default value of the '{@link #getDoResolvePojo() <em>Do Resolve Pojo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoResolvePojo()
   * @generated
   * @ordered
   */
  protected static final String DO_RESOLVE_POJO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDoResolvePojo() <em>Do Resolve Pojo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoResolvePojo()
   * @generated
   * @ordered
   */
  protected String doResolvePojo = DO_RESOLVE_POJO_EDEFAULT;

  /**
   * The default value of the '{@link #getDoResolveDb() <em>Do Resolve Db</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoResolveDb()
   * @generated
   * @ordered
   */
  protected static final String DO_RESOLVE_DB_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDoResolveDb() <em>Do Resolve Db</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoResolveDb()
   * @generated
   * @ordered
   */
  protected String doResolveDb = DO_RESOLVE_DB_EDEFAULT;

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
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected PojoType type;

  /**
   * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeName()
   * @generated
   * @ordered
   */
  protected static final String TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeName()
   * @generated
   * @ordered
   */
  protected String typeName = TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDbTable() <em>Db Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbTable()
   * @generated
   * @ordered
   */
  protected static final String DB_TABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbTable() <em>Db Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbTable()
   * @generated
   * @ordered
   */
  protected String dbTable = DB_TABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getDbColumn() <em>Db Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbColumn()
   * @generated
   * @ordered
   */
  protected static final String DB_COLUMN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbColumn() <em>Db Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbColumn()
   * @generated
   * @ordered
   */
  protected String dbColumn = DB_COLUMN_EDEFAULT;

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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDoResolvePojo()
  {
    return doResolvePojo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoResolvePojo(String newDoResolvePojo)
  {
    String oldDoResolvePojo = doResolvePojo;
    doResolvePojo = newDoResolvePojo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__DO_RESOLVE_POJO, oldDoResolvePojo, doResolvePojo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDoResolveDb()
  {
    return doResolveDb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoResolveDb(String newDoResolveDb)
  {
    String oldDoResolveDb = doResolveDb;
    doResolveDb = newDoResolveDb;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__DO_RESOLVE_DB, oldDoResolveDb, doResolveDb));
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
  public PojoType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(PojoType newType, NotificationChain msgs)
  {
    PojoType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(PojoType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.PROPERTY__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.PROPERTY__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTypeName()
  {
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeName(String newTypeName)
  {
    String oldTypeName = typeName;
    typeName = newTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__TYPE_NAME, oldTypeName, typeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbTable()
  {
    return dbTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbTable(String newDbTable)
  {
    String oldDbTable = dbTable;
    dbTable = newDbTable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__DB_TABLE, oldDbTable, dbTable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbColumn()
  {
    return dbColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbColumn(String newDbColumn)
  {
    String oldDbColumn = dbColumn;
    dbColumn = newDbColumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__DB_COLUMN, oldDbColumn, dbColumn));
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
      case ProcessorDslPackage.PROPERTY__TYPE:
        return basicSetType(null, msgs);
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
      case ProcessorDslPackage.PROPERTY__NAME:
        return getName();
      case ProcessorDslPackage.PROPERTY__DO_RESOLVE_POJO:
        return getDoResolvePojo();
      case ProcessorDslPackage.PROPERTY__DO_RESOLVE_DB:
        return getDoResolveDb();
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
      case ProcessorDslPackage.PROPERTY__TYPE:
        return getType();
      case ProcessorDslPackage.PROPERTY__TYPE_NAME:
        return getTypeName();
      case ProcessorDslPackage.PROPERTY__DB_TABLE:
        return getDbTable();
      case ProcessorDslPackage.PROPERTY__DB_COLUMN:
        return getDbColumn();
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
      case ProcessorDslPackage.PROPERTY__NAME:
        setName((String)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__DO_RESOLVE_POJO:
        setDoResolvePojo((String)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__DO_RESOLVE_DB:
        setDoResolveDb((String)newValue);
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
      case ProcessorDslPackage.PROPERTY__TYPE:
        setType((PojoType)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__TYPE_NAME:
        setTypeName((String)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__DB_TABLE:
        setDbTable((String)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__DB_COLUMN:
        setDbColumn((String)newValue);
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
      case ProcessorDslPackage.PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProcessorDslPackage.PROPERTY__DO_RESOLVE_POJO:
        setDoResolvePojo(DO_RESOLVE_POJO_EDEFAULT);
        return;
      case ProcessorDslPackage.PROPERTY__DO_RESOLVE_DB:
        setDoResolveDb(DO_RESOLVE_DB_EDEFAULT);
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
      case ProcessorDslPackage.PROPERTY__TYPE:
        setType((PojoType)null);
        return;
      case ProcessorDslPackage.PROPERTY__TYPE_NAME:
        setTypeName(TYPE_NAME_EDEFAULT);
        return;
      case ProcessorDslPackage.PROPERTY__DB_TABLE:
        setDbTable(DB_TABLE_EDEFAULT);
        return;
      case ProcessorDslPackage.PROPERTY__DB_COLUMN:
        setDbColumn(DB_COLUMN_EDEFAULT);
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
      case ProcessorDslPackage.PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProcessorDslPackage.PROPERTY__DO_RESOLVE_POJO:
        return DO_RESOLVE_POJO_EDEFAULT == null ? doResolvePojo != null : !DO_RESOLVE_POJO_EDEFAULT.equals(doResolvePojo);
      case ProcessorDslPackage.PROPERTY__DO_RESOLVE_DB:
        return DO_RESOLVE_DB_EDEFAULT == null ? doResolveDb != null : !DO_RESOLVE_DB_EDEFAULT.equals(doResolveDb);
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
      case ProcessorDslPackage.PROPERTY__TYPE:
        return type != null;
      case ProcessorDslPackage.PROPERTY__TYPE_NAME:
        return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
      case ProcessorDslPackage.PROPERTY__DB_TABLE:
        return DB_TABLE_EDEFAULT == null ? dbTable != null : !DB_TABLE_EDEFAULT.equals(dbTable);
      case ProcessorDslPackage.PROPERTY__DB_COLUMN:
        return DB_COLUMN_EDEFAULT == null ? dbColumn != null : !DB_COLUMN_EDEFAULT.equals(dbColumn);
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
    result.append(", doResolvePojo: ");
    result.append(doResolvePojo);
    result.append(", doResolveDb: ");
    result.append(doResolveDb);
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
    result.append(", typeName: ");
    result.append(typeName);
    result.append(", dbTable: ");
    result.append(dbTable);
    result.append(", dbColumn: ");
    result.append(dbColumn);
    result.append(')');
    return result.toString();
  }

} //PropertyImpl
