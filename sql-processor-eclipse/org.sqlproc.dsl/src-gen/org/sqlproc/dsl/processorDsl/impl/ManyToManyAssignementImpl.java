/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.dsl.processorDsl.ManyToManyAssignement;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Many To Many Assignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.ManyToManyAssignementImpl#getPkColumn <em>Pk Column</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.ManyToManyAssignementImpl#getPkTable <em>Pk Table</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.ManyToManyAssignementImpl#getFkColumn <em>Fk Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManyToManyAssignementImpl extends MinimalEObjectImpl.Container implements ManyToManyAssignement
{
  /**
   * The default value of the '{@link #getPkColumn() <em>Pk Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPkColumn()
   * @generated
   * @ordered
   */
  protected static final String PK_COLUMN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPkColumn() <em>Pk Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPkColumn()
   * @generated
   * @ordered
   */
  protected String pkColumn = PK_COLUMN_EDEFAULT;

  /**
   * The default value of the '{@link #getPkTable() <em>Pk Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPkTable()
   * @generated
   * @ordered
   */
  protected static final String PK_TABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPkTable() <em>Pk Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPkTable()
   * @generated
   * @ordered
   */
  protected String pkTable = PK_TABLE_EDEFAULT;

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
  protected ManyToManyAssignementImpl()
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
    return ProcessorDslPackage.Literals.MANY_TO_MANY_ASSIGNEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPkColumn()
  {
    return pkColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPkColumn(String newPkColumn)
  {
    String oldPkColumn = pkColumn;
    pkColumn = newPkColumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.MANY_TO_MANY_ASSIGNEMENT__PK_COLUMN, oldPkColumn, pkColumn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPkTable()
  {
    return pkTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPkTable(String newPkTable)
  {
    String oldPkTable = pkTable;
    pkTable = newPkTable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.MANY_TO_MANY_ASSIGNEMENT__PK_TABLE, oldPkTable, pkTable));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.MANY_TO_MANY_ASSIGNEMENT__FK_COLUMN, oldFkColumn, fkColumn));
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
      case ProcessorDslPackage.MANY_TO_MANY_ASSIGNEMENT__PK_COLUMN:
        return getPkColumn();
      case ProcessorDslPackage.MANY_TO_MANY_ASSIGNEMENT__PK_TABLE:
        return getPkTable();
      case ProcessorDslPackage.MANY_TO_MANY_ASSIGNEMENT__FK_COLUMN:
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
      case ProcessorDslPackage.MANY_TO_MANY_ASSIGNEMENT__PK_COLUMN:
        setPkColumn((String)newValue);
        return;
      case ProcessorDslPackage.MANY_TO_MANY_ASSIGNEMENT__PK_TABLE:
        setPkTable((String)newValue);
        return;
      case ProcessorDslPackage.MANY_TO_MANY_ASSIGNEMENT__FK_COLUMN:
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
      case ProcessorDslPackage.MANY_TO_MANY_ASSIGNEMENT__PK_COLUMN:
        setPkColumn(PK_COLUMN_EDEFAULT);
        return;
      case ProcessorDslPackage.MANY_TO_MANY_ASSIGNEMENT__PK_TABLE:
        setPkTable(PK_TABLE_EDEFAULT);
        return;
      case ProcessorDslPackage.MANY_TO_MANY_ASSIGNEMENT__FK_COLUMN:
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
      case ProcessorDslPackage.MANY_TO_MANY_ASSIGNEMENT__PK_COLUMN:
        return PK_COLUMN_EDEFAULT == null ? pkColumn != null : !PK_COLUMN_EDEFAULT.equals(pkColumn);
      case ProcessorDslPackage.MANY_TO_MANY_ASSIGNEMENT__PK_TABLE:
        return PK_TABLE_EDEFAULT == null ? pkTable != null : !PK_TABLE_EDEFAULT.equals(pkTable);
      case ProcessorDslPackage.MANY_TO_MANY_ASSIGNEMENT__FK_COLUMN:
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
    result.append(" (pkColumn: ");
    result.append(pkColumn);
    result.append(", pkTable: ");
    result.append(pkTable);
    result.append(", fkColumn: ");
    result.append(fkColumn);
    result.append(')');
    return result.toString();
  }

} //ManyToManyAssignementImpl
