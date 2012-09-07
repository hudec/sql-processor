/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;
import org.sqlproc.dsl.processorDsl.TableAssignement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Assignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.TableAssignementImpl#getDbTable <em>Db Table</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.TableAssignementImpl#getNewName <em>New Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableAssignementImpl extends MinimalEObjectImpl.Container implements TableAssignement
{
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
   * The default value of the '{@link #getNewName() <em>New Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewName()
   * @generated
   * @ordered
   */
  protected static final String NEW_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNewName() <em>New Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewName()
   * @generated
   * @ordered
   */
  protected String newName = NEW_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TableAssignementImpl()
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
    return ProcessorDslPackage.Literals.TABLE_ASSIGNEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.TABLE_ASSIGNEMENT__DB_TABLE, oldDbTable, dbTable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNewName()
  {
    return newName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNewName(String newNewName)
  {
    String oldNewName = newName;
    newName = newNewName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.TABLE_ASSIGNEMENT__NEW_NAME, oldNewName, newName));
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
      case ProcessorDslPackage.TABLE_ASSIGNEMENT__DB_TABLE:
        return getDbTable();
      case ProcessorDslPackage.TABLE_ASSIGNEMENT__NEW_NAME:
        return getNewName();
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
      case ProcessorDslPackage.TABLE_ASSIGNEMENT__DB_TABLE:
        setDbTable((String)newValue);
        return;
      case ProcessorDslPackage.TABLE_ASSIGNEMENT__NEW_NAME:
        setNewName((String)newValue);
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
      case ProcessorDslPackage.TABLE_ASSIGNEMENT__DB_TABLE:
        setDbTable(DB_TABLE_EDEFAULT);
        return;
      case ProcessorDslPackage.TABLE_ASSIGNEMENT__NEW_NAME:
        setNewName(NEW_NAME_EDEFAULT);
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
      case ProcessorDslPackage.TABLE_ASSIGNEMENT__DB_TABLE:
        return DB_TABLE_EDEFAULT == null ? dbTable != null : !DB_TABLE_EDEFAULT.equals(dbTable);
      case ProcessorDslPackage.TABLE_ASSIGNEMENT__NEW_NAME:
        return NEW_NAME_EDEFAULT == null ? newName != null : !NEW_NAME_EDEFAULT.equals(newName);
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
    result.append(" (dbTable: ");
    result.append(dbTable);
    result.append(", newName: ");
    result.append(newName);
    result.append(')');
    return result.toString();
  }

} //TableAssignementImpl
