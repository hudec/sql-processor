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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmType;

import org.sqlproc.dsl.processorDsl.ColumnAssignement;
import org.sqlproc.dsl.processorDsl.ColumnTypeAssignement;
import org.sqlproc.dsl.processorDsl.ExportAssignement;
import org.sqlproc.dsl.processorDsl.ImportAssignement;
import org.sqlproc.dsl.processorDsl.InheritanceAssignement;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;
import org.sqlproc.dsl.processorDsl.Property;
import org.sqlproc.dsl.processorDsl.SqlTypeAssignement;
import org.sqlproc.dsl.processorDsl.TableAssignement;

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
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getSqlTypes <em>Sql Types</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDbTable <em>Db Table</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getColumnTypes <em>Column Types</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDbTables <em>Db Tables</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDbColumns <em>Db Columns</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getExports <em>Exports</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDbColumn <em>Db Column</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getToImplements <em>To Implements</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getToExtends <em>To Extends</em>}</li>
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
   * The cached value of the '{@link #getSqlTypes() <em>Sql Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSqlTypes()
   * @generated
   * @ordered
   */
  protected EList<SqlTypeAssignement> sqlTypes;

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
   * The cached value of the '{@link #getColumnTypes() <em>Column Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnTypes()
   * @generated
   * @ordered
   */
  protected EList<ColumnTypeAssignement> columnTypes;

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
   * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTables()
   * @generated
   * @ordered
   */
  protected EList<TableAssignement> tables;

  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<ColumnAssignement> columns;

  /**
   * The cached value of the '{@link #getExports() <em>Exports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExports()
   * @generated
   * @ordered
   */
  protected EList<ExportAssignement> exports;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ImportAssignement> imports;

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
   * The cached value of the '{@link #getInheritance() <em>Inheritance</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInheritance()
   * @generated
   * @ordered
   */
  protected EList<InheritanceAssignement> inheritance;

  /**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<String> methods;

  /**
   * The cached value of the '{@link #getToImplements() <em>To Implements</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToImplements()
   * @generated
   * @ordered
   */
  protected EList<JvmType> toImplements;

  /**
   * The cached value of the '{@link #getToExtends() <em>To Extends</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToExtends()
   * @generated
   * @ordered
   */
  protected JvmType toExtends;

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
  public EList<SqlTypeAssignement> getSqlTypes()
  {
    if (sqlTypes == null)
    {
      sqlTypes = new EObjectContainmentEList<SqlTypeAssignement>(SqlTypeAssignement.class, this, ProcessorDslPackage.PROPERTY__SQL_TYPES);
    }
    return sqlTypes;
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
  public EList<ColumnTypeAssignement> getColumnTypes()
  {
    if (columnTypes == null)
    {
      columnTypes = new EObjectContainmentEList<ColumnTypeAssignement>(ColumnTypeAssignement.class, this, ProcessorDslPackage.PROPERTY__COLUMN_TYPES);
    }
    return columnTypes;
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
  public EList<TableAssignement> getTables()
  {
    if (tables == null)
    {
      tables = new EObjectContainmentEList<TableAssignement>(TableAssignement.class, this, ProcessorDslPackage.PROPERTY__TABLES);
    }
    return tables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ColumnAssignement> getColumns()
  {
    if (columns == null)
    {
      columns = new EObjectContainmentEList<ColumnAssignement>(ColumnAssignement.class, this, ProcessorDslPackage.PROPERTY__COLUMNS);
    }
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExportAssignement> getExports()
  {
    if (exports == null)
    {
      exports = new EObjectContainmentEList<ExportAssignement>(ExportAssignement.class, this, ProcessorDslPackage.PROPERTY__EXPORTS);
    }
    return exports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportAssignement> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ImportAssignement>(ImportAssignement.class, this, ProcessorDslPackage.PROPERTY__IMPORTS);
    }
    return imports;
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
  public EList<InheritanceAssignement> getInheritance()
  {
    if (inheritance == null)
    {
      inheritance = new EObjectContainmentEList<InheritanceAssignement>(InheritanceAssignement.class, this, ProcessorDslPackage.PROPERTY__INHERITANCE);
    }
    return inheritance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getMethods()
  {
    if (methods == null)
    {
      methods = new EDataTypeEList<String>(String.class, this, ProcessorDslPackage.PROPERTY__METHODS);
    }
    return methods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JvmType> getToImplements()
  {
    if (toImplements == null)
    {
      toImplements = new EObjectResolvingEList<JvmType>(JvmType.class, this, ProcessorDslPackage.PROPERTY__TO_IMPLEMENTS);
    }
    return toImplements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType getToExtends()
  {
    if (toExtends != null && toExtends.eIsProxy())
    {
      InternalEObject oldToExtends = (InternalEObject)toExtends;
      toExtends = (JvmType)eResolveProxy(oldToExtends);
      if (toExtends != oldToExtends)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorDslPackage.PROPERTY__TO_EXTENDS, oldToExtends, toExtends));
      }
    }
    return toExtends;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetToExtends()
  {
    return toExtends;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToExtends(JvmType newToExtends)
  {
    JvmType oldToExtends = toExtends;
    toExtends = newToExtends;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__TO_EXTENDS, oldToExtends, toExtends));
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
      case ProcessorDslPackage.PROPERTY__SQL_TYPES:
        return ((InternalEList<?>)getSqlTypes()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.PROPERTY__COLUMN_TYPES:
        return ((InternalEList<?>)getColumnTypes()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.PROPERTY__TABLES:
        return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.PROPERTY__COLUMNS:
        return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.PROPERTY__EXPORTS:
        return ((InternalEList<?>)getExports()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.PROPERTY__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.PROPERTY__INHERITANCE:
        return ((InternalEList<?>)getInheritance()).basicRemove(otherEnd, msgs);
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
      case ProcessorDslPackage.PROPERTY__SQL_TYPES:
        return getSqlTypes();
      case ProcessorDslPackage.PROPERTY__DB_TABLE:
        return getDbTable();
      case ProcessorDslPackage.PROPERTY__COLUMN_TYPES:
        return getColumnTypes();
      case ProcessorDslPackage.PROPERTY__DB_TABLES:
        return getDbTables();
      case ProcessorDslPackage.PROPERTY__DB_COLUMNS:
        return getDbColumns();
      case ProcessorDslPackage.PROPERTY__TABLES:
        return getTables();
      case ProcessorDslPackage.PROPERTY__COLUMNS:
        return getColumns();
      case ProcessorDslPackage.PROPERTY__EXPORTS:
        return getExports();
      case ProcessorDslPackage.PROPERTY__IMPORTS:
        return getImports();
      case ProcessorDslPackage.PROPERTY__DB_COLUMN:
        return getDbColumn();
      case ProcessorDslPackage.PROPERTY__INHERITANCE:
        return getInheritance();
      case ProcessorDslPackage.PROPERTY__METHODS:
        return getMethods();
      case ProcessorDslPackage.PROPERTY__TO_IMPLEMENTS:
        return getToImplements();
      case ProcessorDslPackage.PROPERTY__TO_EXTENDS:
        if (resolve) return getToExtends();
        return basicGetToExtends();
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
      case ProcessorDslPackage.PROPERTY__SQL_TYPES:
        getSqlTypes().clear();
        getSqlTypes().addAll((Collection<? extends SqlTypeAssignement>)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__DB_TABLE:
        setDbTable((String)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__COLUMN_TYPES:
        getColumnTypes().clear();
        getColumnTypes().addAll((Collection<? extends ColumnTypeAssignement>)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__DB_TABLES:
        getDbTables().clear();
        getDbTables().addAll((Collection<? extends String>)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__DB_COLUMNS:
        getDbColumns().clear();
        getDbColumns().addAll((Collection<? extends String>)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__TABLES:
        getTables().clear();
        getTables().addAll((Collection<? extends TableAssignement>)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends ColumnAssignement>)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__EXPORTS:
        getExports().clear();
        getExports().addAll((Collection<? extends ExportAssignement>)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportAssignement>)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__DB_COLUMN:
        setDbColumn((String)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__INHERITANCE:
        getInheritance().clear();
        getInheritance().addAll((Collection<? extends InheritanceAssignement>)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends String>)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__TO_IMPLEMENTS:
        getToImplements().clear();
        getToImplements().addAll((Collection<? extends JvmType>)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__TO_EXTENDS:
        setToExtends((JvmType)newValue);
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
      case ProcessorDslPackage.PROPERTY__SQL_TYPES:
        getSqlTypes().clear();
        return;
      case ProcessorDslPackage.PROPERTY__DB_TABLE:
        setDbTable(DB_TABLE_EDEFAULT);
        return;
      case ProcessorDslPackage.PROPERTY__COLUMN_TYPES:
        getColumnTypes().clear();
        return;
      case ProcessorDslPackage.PROPERTY__DB_TABLES:
        getDbTables().clear();
        return;
      case ProcessorDslPackage.PROPERTY__DB_COLUMNS:
        getDbColumns().clear();
        return;
      case ProcessorDslPackage.PROPERTY__TABLES:
        getTables().clear();
        return;
      case ProcessorDslPackage.PROPERTY__COLUMNS:
        getColumns().clear();
        return;
      case ProcessorDslPackage.PROPERTY__EXPORTS:
        getExports().clear();
        return;
      case ProcessorDslPackage.PROPERTY__IMPORTS:
        getImports().clear();
        return;
      case ProcessorDslPackage.PROPERTY__DB_COLUMN:
        setDbColumn(DB_COLUMN_EDEFAULT);
        return;
      case ProcessorDslPackage.PROPERTY__INHERITANCE:
        getInheritance().clear();
        return;
      case ProcessorDslPackage.PROPERTY__METHODS:
        getMethods().clear();
        return;
      case ProcessorDslPackage.PROPERTY__TO_IMPLEMENTS:
        getToImplements().clear();
        return;
      case ProcessorDslPackage.PROPERTY__TO_EXTENDS:
        setToExtends((JvmType)null);
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
      case ProcessorDslPackage.PROPERTY__SQL_TYPES:
        return sqlTypes != null && !sqlTypes.isEmpty();
      case ProcessorDslPackage.PROPERTY__DB_TABLE:
        return DB_TABLE_EDEFAULT == null ? dbTable != null : !DB_TABLE_EDEFAULT.equals(dbTable);
      case ProcessorDslPackage.PROPERTY__COLUMN_TYPES:
        return columnTypes != null && !columnTypes.isEmpty();
      case ProcessorDslPackage.PROPERTY__DB_TABLES:
        return dbTables != null && !dbTables.isEmpty();
      case ProcessorDslPackage.PROPERTY__DB_COLUMNS:
        return dbColumns != null && !dbColumns.isEmpty();
      case ProcessorDslPackage.PROPERTY__TABLES:
        return tables != null && !tables.isEmpty();
      case ProcessorDslPackage.PROPERTY__COLUMNS:
        return columns != null && !columns.isEmpty();
      case ProcessorDslPackage.PROPERTY__EXPORTS:
        return exports != null && !exports.isEmpty();
      case ProcessorDslPackage.PROPERTY__IMPORTS:
        return imports != null && !imports.isEmpty();
      case ProcessorDslPackage.PROPERTY__DB_COLUMN:
        return DB_COLUMN_EDEFAULT == null ? dbColumn != null : !DB_COLUMN_EDEFAULT.equals(dbColumn);
      case ProcessorDslPackage.PROPERTY__INHERITANCE:
        return inheritance != null && !inheritance.isEmpty();
      case ProcessorDslPackage.PROPERTY__METHODS:
        return methods != null && !methods.isEmpty();
      case ProcessorDslPackage.PROPERTY__TO_IMPLEMENTS:
        return toImplements != null && !toImplements.isEmpty();
      case ProcessorDslPackage.PROPERTY__TO_EXTENDS:
        return toExtends != null;
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
    result.append(", dbColumn: ");
    result.append(dbColumn);
    result.append(", methods: ");
    result.append(methods);
    result.append(')');
    return result.toString();
  }

} //PropertyImpl
