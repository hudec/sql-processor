/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.dsl.processorDsl.ExportAssignement;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Export Assignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.ExportAssignementImpl#getDbColumn <em>Db Column</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.ExportAssignementImpl#getFkTable <em>Fk Table</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.ExportAssignementImpl#getFkColumn <em>Fk Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExportAssignementImpl extends MinimalEObjectImpl.Container implements ExportAssignement
{
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
   * The default value of the '{@link #getFkTable() <em>Fk Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFkTable()
   * @generated
   * @ordered
   */
  protected static final String FK_TABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFkTable() <em>Fk Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFkTable()
   * @generated
   * @ordered
   */
  protected String fkTable = FK_TABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getFkColumn() <em>Fk Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFkColumn()
   * @generated
   * @ordered
   */
  protected static final String FK_COLUMN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFkColumn() <em>Fk Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFkColumn()
   * @generated
   * @ordered
   */
  protected String fkColumn = FK_COLUMN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExportAssignementImpl()
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
    return ProcessorDslPackage.Literals.EXPORT_ASSIGNEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.EXPORT_ASSIGNEMENT__DB_COLUMN, oldDbColumn, dbColumn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFkTable()
  {
    return fkTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFkTable(String newFkTable)
  {
    String oldFkTable = fkTable;
    fkTable = newFkTable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.EXPORT_ASSIGNEMENT__FK_TABLE, oldFkTable, fkTable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFkColumn()
  {
    return fkColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFkColumn(String newFkColumn)
  {
    String oldFkColumn = fkColumn;
    fkColumn = newFkColumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.EXPORT_ASSIGNEMENT__FK_COLUMN, oldFkColumn, fkColumn));
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
      case ProcessorDslPackage.EXPORT_ASSIGNEMENT__DB_COLUMN:
        return getDbColumn();
      case ProcessorDslPackage.EXPORT_ASSIGNEMENT__FK_TABLE:
        return getFkTable();
      case ProcessorDslPackage.EXPORT_ASSIGNEMENT__FK_COLUMN:
        return getFkColumn();
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
      case ProcessorDslPackage.EXPORT_ASSIGNEMENT__DB_COLUMN:
        setDbColumn((String)newValue);
        return;
      case ProcessorDslPackage.EXPORT_ASSIGNEMENT__FK_TABLE:
        setFkTable((String)newValue);
        return;
      case ProcessorDslPackage.EXPORT_ASSIGNEMENT__FK_COLUMN:
        setFkColumn((String)newValue);
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
      case ProcessorDslPackage.EXPORT_ASSIGNEMENT__DB_COLUMN:
        setDbColumn(DB_COLUMN_EDEFAULT);
        return;
      case ProcessorDslPackage.EXPORT_ASSIGNEMENT__FK_TABLE:
        setFkTable(FK_TABLE_EDEFAULT);
        return;
      case ProcessorDslPackage.EXPORT_ASSIGNEMENT__FK_COLUMN:
        setFkColumn(FK_COLUMN_EDEFAULT);
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
      case ProcessorDslPackage.EXPORT_ASSIGNEMENT__DB_COLUMN:
        return DB_COLUMN_EDEFAULT == null ? dbColumn != null : !DB_COLUMN_EDEFAULT.equals(dbColumn);
      case ProcessorDslPackage.EXPORT_ASSIGNEMENT__FK_TABLE:
        return FK_TABLE_EDEFAULT == null ? fkTable != null : !FK_TABLE_EDEFAULT.equals(fkTable);
      case ProcessorDslPackage.EXPORT_ASSIGNEMENT__FK_COLUMN:
        return FK_COLUMN_EDEFAULT == null ? fkColumn != null : !FK_COLUMN_EDEFAULT.equals(fkColumn);
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
    result.append(" (dbColumn: ");
    result.append(dbColumn);
    result.append(", fkTable: ");
    result.append(fkTable);
    result.append(", fkColumn: ");
    result.append(fkColumn);
    result.append(')');
    return result.toString();
  }

} //ExportAssignementImpl
