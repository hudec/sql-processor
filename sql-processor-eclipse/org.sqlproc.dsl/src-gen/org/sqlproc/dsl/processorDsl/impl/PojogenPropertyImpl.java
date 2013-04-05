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
import org.sqlproc.dsl.processorDsl.DebugLevelAssignement;
import org.sqlproc.dsl.processorDsl.ExportAssignement;
import org.sqlproc.dsl.processorDsl.ImportAssignement;
import org.sqlproc.dsl.processorDsl.InheritanceAssignement;
import org.sqlproc.dsl.processorDsl.JoinTableAssignement;
import org.sqlproc.dsl.processorDsl.ManyToManyAssignement;
import org.sqlproc.dsl.processorDsl.PojogenProperty;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;
import org.sqlproc.dsl.processorDsl.ShowColumnTypeAssignement;
import org.sqlproc.dsl.processorDsl.SqlTypeAssignement;
import org.sqlproc.dsl.processorDsl.TableAssignement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pojogen Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getSqlTypes <em>Sql Types</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getDbTable <em>Db Table</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getColumnTypes <em>Column Types</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getColumnType <em>Column Type</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getDbTables <em>Db Tables</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getJoinTables <em>Join Tables</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getDbColumns <em>Db Columns</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getExports <em>Exports</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getMany2s <em>Many2s</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getDbColumn <em>Db Column</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getToImplements <em>To Implements</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getToExtends <em>To Extends</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getImplPackage <em>Impl Package</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl#getDebug <em>Debug</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PojogenPropertyImpl extends MinimalEObjectImpl.Container implements PojogenProperty
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
   * The cached value of the '{@link #getColumnType() <em>Column Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnType()
   * @generated
   * @ordered
   */
  protected ShowColumnTypeAssignement columnType;

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
   * The cached value of the '{@link #getJoinTables() <em>Join Tables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoinTables()
   * @generated
   * @ordered
   */
  protected EList<JoinTableAssignement> joinTables;

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
   * The cached value of the '{@link #getMany2s() <em>Many2s</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMany2s()
   * @generated
   * @ordered
   */
  protected EList<ManyToManyAssignement> many2s;

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
   * The default value of the '{@link #getImplPackage() <em>Impl Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplPackage()
   * @generated
   * @ordered
   */
  protected static final String IMPL_PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImplPackage() <em>Impl Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplPackage()
   * @generated
   * @ordered
   */
  protected String implPackage = IMPL_PACKAGE_EDEFAULT;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

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
  protected PojogenPropertyImpl()
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
    return ProcessorDslPackage.Literals.POJOGEN_PROPERTY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJOGEN_PROPERTY__NAME, oldName, name));
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
      sqlTypes = new EObjectContainmentEList<SqlTypeAssignement>(SqlTypeAssignement.class, this, ProcessorDslPackage.POJOGEN_PROPERTY__SQL_TYPES);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJOGEN_PROPERTY__DB_TABLE, oldDbTable, dbTable));
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
      columnTypes = new EObjectContainmentEList<ColumnTypeAssignement>(ColumnTypeAssignement.class, this, ProcessorDslPackage.POJOGEN_PROPERTY__COLUMN_TYPES);
    }
    return columnTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShowColumnTypeAssignement getColumnType()
  {
    return columnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColumnType(ShowColumnTypeAssignement newColumnType, NotificationChain msgs)
  {
    ShowColumnTypeAssignement oldColumnType = columnType;
    columnType = newColumnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJOGEN_PROPERTY__COLUMN_TYPE, oldColumnType, newColumnType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumnType(ShowColumnTypeAssignement newColumnType)
  {
    if (newColumnType != columnType)
    {
      NotificationChain msgs = null;
      if (columnType != null)
        msgs = ((InternalEObject)columnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.POJOGEN_PROPERTY__COLUMN_TYPE, null, msgs);
      if (newColumnType != null)
        msgs = ((InternalEObject)newColumnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.POJOGEN_PROPERTY__COLUMN_TYPE, null, msgs);
      msgs = basicSetColumnType(newColumnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJOGEN_PROPERTY__COLUMN_TYPE, newColumnType, newColumnType));
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
      dbTables = new EDataTypeEList<String>(String.class, this, ProcessorDslPackage.POJOGEN_PROPERTY__DB_TABLES);
    }
    return dbTables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JoinTableAssignement> getJoinTables()
  {
    if (joinTables == null)
    {
      joinTables = new EObjectContainmentEList<JoinTableAssignement>(JoinTableAssignement.class, this, ProcessorDslPackage.POJOGEN_PROPERTY__JOIN_TABLES);
    }
    return joinTables;
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
      dbColumns = new EDataTypeEList<String>(String.class, this, ProcessorDslPackage.POJOGEN_PROPERTY__DB_COLUMNS);
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
      tables = new EObjectContainmentEList<TableAssignement>(TableAssignement.class, this, ProcessorDslPackage.POJOGEN_PROPERTY__TABLES);
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
      columns = new EObjectContainmentEList<ColumnAssignement>(ColumnAssignement.class, this, ProcessorDslPackage.POJOGEN_PROPERTY__COLUMNS);
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
      exports = new EObjectContainmentEList<ExportAssignement>(ExportAssignement.class, this, ProcessorDslPackage.POJOGEN_PROPERTY__EXPORTS);
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
      imports = new EObjectContainmentEList<ImportAssignement>(ImportAssignement.class, this, ProcessorDslPackage.POJOGEN_PROPERTY__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ManyToManyAssignement> getMany2s()
  {
    if (many2s == null)
    {
      many2s = new EObjectContainmentEList<ManyToManyAssignement>(ManyToManyAssignement.class, this, ProcessorDslPackage.POJOGEN_PROPERTY__MANY2S);
    }
    return many2s;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJOGEN_PROPERTY__DB_COLUMN, oldDbColumn, dbColumn));
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
      inheritance = new EObjectContainmentEList<InheritanceAssignement>(InheritanceAssignement.class, this, ProcessorDslPackage.POJOGEN_PROPERTY__INHERITANCE);
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
      methods = new EDataTypeEList<String>(String.class, this, ProcessorDslPackage.POJOGEN_PROPERTY__METHODS);
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
      toImplements = new EObjectResolvingEList<JvmType>(JvmType.class, this, ProcessorDslPackage.POJOGEN_PROPERTY__TO_IMPLEMENTS);
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorDslPackage.POJOGEN_PROPERTY__TO_EXTENDS, oldToExtends, toExtends));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJOGEN_PROPERTY__TO_EXTENDS, oldToExtends, toExtends));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImplPackage()
  {
    return implPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplPackage(String newImplPackage)
  {
    String oldImplPackage = implPackage;
    implPackage = newImplPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJOGEN_PROPERTY__IMPL_PACKAGE, oldImplPackage, implPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJOGEN_PROPERTY__VERSION, oldVersion, version));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJOGEN_PROPERTY__DEBUG, oldDebug, newDebug);
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
        msgs = ((InternalEObject)debug).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.POJOGEN_PROPERTY__DEBUG, null, msgs);
      if (newDebug != null)
        msgs = ((InternalEObject)newDebug).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.POJOGEN_PROPERTY__DEBUG, null, msgs);
      msgs = basicSetDebug(newDebug, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJOGEN_PROPERTY__DEBUG, newDebug, newDebug));
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
      case ProcessorDslPackage.POJOGEN_PROPERTY__SQL_TYPES:
        return ((InternalEList<?>)getSqlTypes()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.POJOGEN_PROPERTY__COLUMN_TYPES:
        return ((InternalEList<?>)getColumnTypes()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.POJOGEN_PROPERTY__COLUMN_TYPE:
        return basicSetColumnType(null, msgs);
      case ProcessorDslPackage.POJOGEN_PROPERTY__JOIN_TABLES:
        return ((InternalEList<?>)getJoinTables()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.POJOGEN_PROPERTY__TABLES:
        return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.POJOGEN_PROPERTY__COLUMNS:
        return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.POJOGEN_PROPERTY__EXPORTS:
        return ((InternalEList<?>)getExports()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.POJOGEN_PROPERTY__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.POJOGEN_PROPERTY__MANY2S:
        return ((InternalEList<?>)getMany2s()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.POJOGEN_PROPERTY__INHERITANCE:
        return ((InternalEList<?>)getInheritance()).basicRemove(otherEnd, msgs);
      case ProcessorDslPackage.POJOGEN_PROPERTY__DEBUG:
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
      case ProcessorDslPackage.POJOGEN_PROPERTY__NAME:
        return getName();
      case ProcessorDslPackage.POJOGEN_PROPERTY__SQL_TYPES:
        return getSqlTypes();
      case ProcessorDslPackage.POJOGEN_PROPERTY__DB_TABLE:
        return getDbTable();
      case ProcessorDslPackage.POJOGEN_PROPERTY__COLUMN_TYPES:
        return getColumnTypes();
      case ProcessorDslPackage.POJOGEN_PROPERTY__COLUMN_TYPE:
        return getColumnType();
      case ProcessorDslPackage.POJOGEN_PROPERTY__DB_TABLES:
        return getDbTables();
      case ProcessorDslPackage.POJOGEN_PROPERTY__JOIN_TABLES:
        return getJoinTables();
      case ProcessorDslPackage.POJOGEN_PROPERTY__DB_COLUMNS:
        return getDbColumns();
      case ProcessorDslPackage.POJOGEN_PROPERTY__TABLES:
        return getTables();
      case ProcessorDslPackage.POJOGEN_PROPERTY__COLUMNS:
        return getColumns();
      case ProcessorDslPackage.POJOGEN_PROPERTY__EXPORTS:
        return getExports();
      case ProcessorDslPackage.POJOGEN_PROPERTY__IMPORTS:
        return getImports();
      case ProcessorDslPackage.POJOGEN_PROPERTY__MANY2S:
        return getMany2s();
      case ProcessorDslPackage.POJOGEN_PROPERTY__DB_COLUMN:
        return getDbColumn();
      case ProcessorDslPackage.POJOGEN_PROPERTY__INHERITANCE:
        return getInheritance();
      case ProcessorDslPackage.POJOGEN_PROPERTY__METHODS:
        return getMethods();
      case ProcessorDslPackage.POJOGEN_PROPERTY__TO_IMPLEMENTS:
        return getToImplements();
      case ProcessorDslPackage.POJOGEN_PROPERTY__TO_EXTENDS:
        if (resolve) return getToExtends();
        return basicGetToExtends();
      case ProcessorDslPackage.POJOGEN_PROPERTY__IMPL_PACKAGE:
        return getImplPackage();
      case ProcessorDslPackage.POJOGEN_PROPERTY__VERSION:
        return getVersion();
      case ProcessorDslPackage.POJOGEN_PROPERTY__DEBUG:
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
      case ProcessorDslPackage.POJOGEN_PROPERTY__NAME:
        setName((String)newValue);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__SQL_TYPES:
        getSqlTypes().clear();
        getSqlTypes().addAll((Collection<? extends SqlTypeAssignement>)newValue);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__DB_TABLE:
        setDbTable((String)newValue);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__COLUMN_TYPES:
        getColumnTypes().clear();
        getColumnTypes().addAll((Collection<? extends ColumnTypeAssignement>)newValue);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__COLUMN_TYPE:
        setColumnType((ShowColumnTypeAssignement)newValue);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__DB_TABLES:
        getDbTables().clear();
        getDbTables().addAll((Collection<? extends String>)newValue);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__JOIN_TABLES:
        getJoinTables().clear();
        getJoinTables().addAll((Collection<? extends JoinTableAssignement>)newValue);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__DB_COLUMNS:
        getDbColumns().clear();
        getDbColumns().addAll((Collection<? extends String>)newValue);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__TABLES:
        getTables().clear();
        getTables().addAll((Collection<? extends TableAssignement>)newValue);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends ColumnAssignement>)newValue);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__EXPORTS:
        getExports().clear();
        getExports().addAll((Collection<? extends ExportAssignement>)newValue);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportAssignement>)newValue);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__MANY2S:
        getMany2s().clear();
        getMany2s().addAll((Collection<? extends ManyToManyAssignement>)newValue);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__DB_COLUMN:
        setDbColumn((String)newValue);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__INHERITANCE:
        getInheritance().clear();
        getInheritance().addAll((Collection<? extends InheritanceAssignement>)newValue);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends String>)newValue);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__TO_IMPLEMENTS:
        getToImplements().clear();
        getToImplements().addAll((Collection<? extends JvmType>)newValue);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__TO_EXTENDS:
        setToExtends((JvmType)newValue);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__IMPL_PACKAGE:
        setImplPackage((String)newValue);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__VERSION:
        setVersion((String)newValue);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__DEBUG:
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
      case ProcessorDslPackage.POJOGEN_PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__SQL_TYPES:
        getSqlTypes().clear();
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__DB_TABLE:
        setDbTable(DB_TABLE_EDEFAULT);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__COLUMN_TYPES:
        getColumnTypes().clear();
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__COLUMN_TYPE:
        setColumnType((ShowColumnTypeAssignement)null);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__DB_TABLES:
        getDbTables().clear();
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__JOIN_TABLES:
        getJoinTables().clear();
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__DB_COLUMNS:
        getDbColumns().clear();
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__TABLES:
        getTables().clear();
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__COLUMNS:
        getColumns().clear();
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__EXPORTS:
        getExports().clear();
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__IMPORTS:
        getImports().clear();
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__MANY2S:
        getMany2s().clear();
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__DB_COLUMN:
        setDbColumn(DB_COLUMN_EDEFAULT);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__INHERITANCE:
        getInheritance().clear();
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__METHODS:
        getMethods().clear();
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__TO_IMPLEMENTS:
        getToImplements().clear();
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__TO_EXTENDS:
        setToExtends((JvmType)null);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__IMPL_PACKAGE:
        setImplPackage(IMPL_PACKAGE_EDEFAULT);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case ProcessorDslPackage.POJOGEN_PROPERTY__DEBUG:
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
      case ProcessorDslPackage.POJOGEN_PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProcessorDslPackage.POJOGEN_PROPERTY__SQL_TYPES:
        return sqlTypes != null && !sqlTypes.isEmpty();
      case ProcessorDslPackage.POJOGEN_PROPERTY__DB_TABLE:
        return DB_TABLE_EDEFAULT == null ? dbTable != null : !DB_TABLE_EDEFAULT.equals(dbTable);
      case ProcessorDslPackage.POJOGEN_PROPERTY__COLUMN_TYPES:
        return columnTypes != null && !columnTypes.isEmpty();
      case ProcessorDslPackage.POJOGEN_PROPERTY__COLUMN_TYPE:
        return columnType != null;
      case ProcessorDslPackage.POJOGEN_PROPERTY__DB_TABLES:
        return dbTables != null && !dbTables.isEmpty();
      case ProcessorDslPackage.POJOGEN_PROPERTY__JOIN_TABLES:
        return joinTables != null && !joinTables.isEmpty();
      case ProcessorDslPackage.POJOGEN_PROPERTY__DB_COLUMNS:
        return dbColumns != null && !dbColumns.isEmpty();
      case ProcessorDslPackage.POJOGEN_PROPERTY__TABLES:
        return tables != null && !tables.isEmpty();
      case ProcessorDslPackage.POJOGEN_PROPERTY__COLUMNS:
        return columns != null && !columns.isEmpty();
      case ProcessorDslPackage.POJOGEN_PROPERTY__EXPORTS:
        return exports != null && !exports.isEmpty();
      case ProcessorDslPackage.POJOGEN_PROPERTY__IMPORTS:
        return imports != null && !imports.isEmpty();
      case ProcessorDslPackage.POJOGEN_PROPERTY__MANY2S:
        return many2s != null && !many2s.isEmpty();
      case ProcessorDslPackage.POJOGEN_PROPERTY__DB_COLUMN:
        return DB_COLUMN_EDEFAULT == null ? dbColumn != null : !DB_COLUMN_EDEFAULT.equals(dbColumn);
      case ProcessorDslPackage.POJOGEN_PROPERTY__INHERITANCE:
        return inheritance != null && !inheritance.isEmpty();
      case ProcessorDslPackage.POJOGEN_PROPERTY__METHODS:
        return methods != null && !methods.isEmpty();
      case ProcessorDslPackage.POJOGEN_PROPERTY__TO_IMPLEMENTS:
        return toImplements != null && !toImplements.isEmpty();
      case ProcessorDslPackage.POJOGEN_PROPERTY__TO_EXTENDS:
        return toExtends != null;
      case ProcessorDslPackage.POJOGEN_PROPERTY__IMPL_PACKAGE:
        return IMPL_PACKAGE_EDEFAULT == null ? implPackage != null : !IMPL_PACKAGE_EDEFAULT.equals(implPackage);
      case ProcessorDslPackage.POJOGEN_PROPERTY__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case ProcessorDslPackage.POJOGEN_PROPERTY__DEBUG:
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
    result.append(", implPackage: ");
    result.append(implPackage);
    result.append(", version: ");
    result.append(version);
    result.append(')');
    return result.toString();
  }

} //PojogenPropertyImpl
