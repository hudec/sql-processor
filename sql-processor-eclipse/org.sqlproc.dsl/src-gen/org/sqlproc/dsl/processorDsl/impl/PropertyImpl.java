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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sqlproc.dsl.processorDsl.ColumnTypeAssignement;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;
import org.sqlproc.dsl.processorDsl.Property;
import org.sqlproc.dsl.processorDsl.SqlTypeAssignement;

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
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getSqlTypeAssignements <em>Sql Type Assignements</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDbTable <em>Db Table</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getColumnTypeAssignements <em>Column Type Assignements</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDbTables <em>Db Tables</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDbColumns <em>Db Columns</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getNewNames <em>New Names</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getPkTables <em>Pk Tables</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getPkColumns <em>Pk Columns</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getFkTables <em>Fk Tables</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getFkColumns <em>Fk Columns</em>}</li>
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
   * The cached value of the '{@link #getSqlTypeAssignements() <em>Sql Type Assignements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSqlTypeAssignements()
   * @generated
   * @ordered
   */
  protected EList<SqlTypeAssignement> sqlTypeAssignements;

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
   * The cached value of the '{@link #getColumnTypeAssignements() <em>Column Type Assignements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnTypeAssignements()
   * @generated
   * @ordered
   */
  protected EList<ColumnTypeAssignement> columnTypeAssignements;

  /**
   * The cached value of the '{@link #getDbTables() <em>Db Tables</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbTables()
   * @generated
   * @ordered
   */
  protected EList<String> dbTables;

  /**
   * The cached value of the '{@link #getDbColumns() <em>Db Columns</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbColumns()
   * @generated
   * @ordered
   */
  protected EList<String> dbColumns;

  /**
   * The cached value of the '{@link #getNewNames() <em>New Names</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewNames()
   * @generated
   * @ordered
   */
  protected EList<String> newNames;

  /**
   * The cached value of the '{@link #getPkTables() <em>Pk Tables</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPkTables()
   * @generated
   * @ordered
   */
  protected EList<String> pkTables;

  /**
   * The cached value of the '{@link #getPkColumns() <em>Pk Columns</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPkColumns()
   * @generated
   * @ordered
   */
  protected EList<String> pkColumns;

  /**
   * The cached value of the '{@link #getFkTables() <em>Fk Tables</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFkTables()
   * @generated
   * @ordered
   */
  protected EList<String> fkTables;

  /**
   * The cached value of the '{@link #getFkColumns() <em>Fk Columns</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFkColumns()
   * @generated
   * @ordered
   */
  protected EList<String> fkColumns;

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
  public EList<SqlTypeAssignement> getSqlTypeAssignements()
  {
    if (sqlTypeAssignements == null)
    {
      sqlTypeAssignements = new EObjectContainmentEList<SqlTypeAssignement>(SqlTypeAssignement.class, this, ProcessorDslPackage.PROPERTY__SQL_TYPE_ASSIGNEMENTS);
    }
    return sqlTypeAssignements;
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
  public EList<ColumnTypeAssignement> getColumnTypeAssignements()
  {
    if (columnTypeAssignements == null)
    {
      columnTypeAssignements = new EObjectContainmentEList<ColumnTypeAssignement>(ColumnTypeAssignement.class, this, ProcessorDslPackage.PROPERTY__COLUMN_TYPE_ASSIGNEMENTS);
    }
    return columnTypeAssignements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDbTables()
  {
    if (dbTables == null)
    {
      dbTables = new EDataTypeEList<String>(String.class, this, ProcessorDslPackage.PROPERTY__DB_TABLES);
    }
    return dbTables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDbColumns()
  {
    if (dbColumns == null)
    {
      dbColumns = new EDataTypeEList<String>(String.class, this, ProcessorDslPackage.PROPERTY__DB_COLUMNS);
    }
    return dbColumns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getNewNames()
  {
    if (newNames == null)
    {
      newNames = new EDataTypeEList<String>(String.class, this, ProcessorDslPackage.PROPERTY__NEW_NAMES);
    }
    return newNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPkTables()
  {
    if (pkTables == null)
    {
      pkTables = new EDataTypeEList<String>(String.class, this, ProcessorDslPackage.PROPERTY__PK_TABLES);
    }
    return pkTables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPkColumns()
  {
    if (pkColumns == null)
    {
      pkColumns = new EDataTypeEList<String>(String.class, this, ProcessorDslPackage.PROPERTY__PK_COLUMNS);
    }
    return pkColumns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getFkTables()
  {
    if (fkTables == null)
    {
      fkTables = new EDataTypeEList<String>(String.class, this, ProcessorDslPackage.PROPERTY__FK_TABLES);
    }
    return fkTables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getFkColumns()
  {
    if (fkColumns == null)
    {
      fkColumns = new EDataTypeEList<String>(String.class, this, ProcessorDslPackage.PROPERTY__FK_COLUMNS);
    }
    return fkColumns;
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
      case ProcessorDslPackage.PROPERTY__SQL_TYPE_ASSIGNEMENTS:
        return ((InternalEList<?>)getSqlTypeAssignements()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.PROPERTY__COLUMN_TYPE_ASSIGNEMENTS:
        return ((InternalEList<?>)getColumnTypeAssignements()).basicRemove(otherEnd, msgs);
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
      case ProcessorDslPackage.PROPERTY__SQL_TYPE_ASSIGNEMENTS:
        return getSqlTypeAssignements();
      case ProcessorDslPackage.PROPERTY__DB_TABLE:
        return getDbTable();
      case ProcessorDslPackage.PROPERTY__COLUMN_TYPE_ASSIGNEMENTS:
        return getColumnTypeAssignements();
      case ProcessorDslPackage.PROPERTY__DB_TABLES:
        return getDbTables();
      case ProcessorDslPackage.PROPERTY__DB_COLUMNS:
        return getDbColumns();
      case ProcessorDslPackage.PROPERTY__NEW_NAMES:
        return getNewNames();
      case ProcessorDslPackage.PROPERTY__PK_TABLES:
        return getPkTables();
      case ProcessorDslPackage.PROPERTY__PK_COLUMNS:
        return getPkColumns();
      case ProcessorDslPackage.PROPERTY__FK_TABLES:
        return getFkTables();
      case ProcessorDslPackage.PROPERTY__FK_COLUMNS:
        return getFkColumns();
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
      case ProcessorDslPackage.PROPERTY__SQL_TYPE_ASSIGNEMENTS:
        getSqlTypeAssignements().clear();
        getSqlTypeAssignements().addAll((Collection<? extends SqlTypeAssignement>)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__DB_TABLE:
        setDbTable((String)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__COLUMN_TYPE_ASSIGNEMENTS:
        getColumnTypeAssignements().clear();
        getColumnTypeAssignements().addAll((Collection<? extends ColumnTypeAssignement>)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__DB_TABLES:
        getDbTables().clear();
        getDbTables().addAll((Collection<? extends String>)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__DB_COLUMNS:
        getDbColumns().clear();
        getDbColumns().addAll((Collection<? extends String>)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__NEW_NAMES:
        getNewNames().clear();
        getNewNames().addAll((Collection<? extends String>)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__PK_TABLES:
        getPkTables().clear();
        getPkTables().addAll((Collection<? extends String>)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__PK_COLUMNS:
        getPkColumns().clear();
        getPkColumns().addAll((Collection<? extends String>)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__FK_TABLES:
        getFkTables().clear();
        getFkTables().addAll((Collection<? extends String>)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__FK_COLUMNS:
        getFkColumns().clear();
        getFkColumns().addAll((Collection<? extends String>)newValue);
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
      case ProcessorDslPackage.PROPERTY__SQL_TYPE_ASSIGNEMENTS:
        getSqlTypeAssignements().clear();
        return;
      case ProcessorDslPackage.PROPERTY__DB_TABLE:
        setDbTable(DB_TABLE_EDEFAULT);
        return;
      case ProcessorDslPackage.PROPERTY__COLUMN_TYPE_ASSIGNEMENTS:
        getColumnTypeAssignements().clear();
        return;
      case ProcessorDslPackage.PROPERTY__DB_TABLES:
        getDbTables().clear();
        return;
      case ProcessorDslPackage.PROPERTY__DB_COLUMNS:
        getDbColumns().clear();
        return;
      case ProcessorDslPackage.PROPERTY__NEW_NAMES:
        getNewNames().clear();
        return;
      case ProcessorDslPackage.PROPERTY__PK_TABLES:
        getPkTables().clear();
        return;
      case ProcessorDslPackage.PROPERTY__PK_COLUMNS:
        getPkColumns().clear();
        return;
      case ProcessorDslPackage.PROPERTY__FK_TABLES:
        getFkTables().clear();
        return;
      case ProcessorDslPackage.PROPERTY__FK_COLUMNS:
        getFkColumns().clear();
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
      case ProcessorDslPackage.PROPERTY__SQL_TYPE_ASSIGNEMENTS:
        return sqlTypeAssignements != null && !sqlTypeAssignements.isEmpty();
      case ProcessorDslPackage.PROPERTY__DB_TABLE:
        return DB_TABLE_EDEFAULT == null ? dbTable != null : !DB_TABLE_EDEFAULT.equals(dbTable);
      case ProcessorDslPackage.PROPERTY__COLUMN_TYPE_ASSIGNEMENTS:
        return columnTypeAssignements != null && !columnTypeAssignements.isEmpty();
      case ProcessorDslPackage.PROPERTY__DB_TABLES:
        return dbTables != null && !dbTables.isEmpty();
      case ProcessorDslPackage.PROPERTY__DB_COLUMNS:
        return dbColumns != null && !dbColumns.isEmpty();
      case ProcessorDslPackage.PROPERTY__NEW_NAMES:
        return newNames != null && !newNames.isEmpty();
      case ProcessorDslPackage.PROPERTY__PK_TABLES:
        return pkTables != null && !pkTables.isEmpty();
      case ProcessorDslPackage.PROPERTY__PK_COLUMNS:
        return pkColumns != null && !pkColumns.isEmpty();
      case ProcessorDslPackage.PROPERTY__FK_TABLES:
        return fkTables != null && !fkTables.isEmpty();
      case ProcessorDslPackage.PROPERTY__FK_COLUMNS:
        return fkColumns != null && !fkColumns.isEmpty();
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
    result.append(", dbTable: ");
    result.append(dbTable);
    result.append(", dbTables: ");
    result.append(dbTables);
    result.append(", dbColumns: ");
    result.append(dbColumns);
    result.append(", newNames: ");
    result.append(newNames);
    result.append(", pkTables: ");
    result.append(pkTables);
    result.append(", pkColumns: ");
    result.append(pkColumns);
    result.append(", fkTables: ");
    result.append(fkTables);
    result.append(", fkColumns: ");
    result.append(fkColumns);
    result.append(')');
    return result.toString();
  }

} //PropertyImpl
