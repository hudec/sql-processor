/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.sqlproc.dsl.processorDsl.InheritanceAssignement;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inheritance Assignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.InheritanceAssignementImpl#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.InheritanceAssignementImpl#getDbTable <em>Db Table</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.InheritanceAssignementImpl#getDbColumns <em>Db Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InheritanceAssignementImpl extends MinimalEObjectImpl.Container implements InheritanceAssignement
{
  /**
   * The default value of the '{@link #getDiscriminator() <em>Discriminator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscriminator()
   * @generated
   * @ordered
   */
  protected static final String DISCRIMINATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDiscriminator() <em>Discriminator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscriminator()
   * @generated
   * @ordered
   */
  protected String discriminator = DISCRIMINATOR_EDEFAULT;

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
   * The cached value of the '{@link #getDbColumns() <em>Db Columns</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbColumns()
   * @generated
   * @ordered
   */
  protected EList<String> dbColumns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InheritanceAssignementImpl()
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
    return ProcessorDslPackage.Literals.INHERITANCE_ASSIGNEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDiscriminator()
  {
    return discriminator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiscriminator(String newDiscriminator)
  {
    String oldDiscriminator = discriminator;
    discriminator = newDiscriminator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.INHERITANCE_ASSIGNEMENT__DISCRIMINATOR, oldDiscriminator, discriminator));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.INHERITANCE_ASSIGNEMENT__DB_TABLE, oldDbTable, dbTable));
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
      dbColumns = new EDataTypeEList<String>(String.class, this, ProcessorDslPackage.INHERITANCE_ASSIGNEMENT__DB_COLUMNS);
    }
    return dbColumns;
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
      case ProcessorDslPackage.INHERITANCE_ASSIGNEMENT__DISCRIMINATOR:
        return getDiscriminator();
      case ProcessorDslPackage.INHERITANCE_ASSIGNEMENT__DB_TABLE:
        return getDbTable();
      case ProcessorDslPackage.INHERITANCE_ASSIGNEMENT__DB_COLUMNS:
        return getDbColumns();
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
      case ProcessorDslPackage.INHERITANCE_ASSIGNEMENT__DISCRIMINATOR:
        setDiscriminator((String)newValue);
        return;
      case ProcessorDslPackage.INHERITANCE_ASSIGNEMENT__DB_TABLE:
        setDbTable((String)newValue);
        return;
      case ProcessorDslPackage.INHERITANCE_ASSIGNEMENT__DB_COLUMNS:
        getDbColumns().clear();
        getDbColumns().addAll((Collection<? extends String>)newValue);
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
      case ProcessorDslPackage.INHERITANCE_ASSIGNEMENT__DISCRIMINATOR:
        setDiscriminator(DISCRIMINATOR_EDEFAULT);
        return;
      case ProcessorDslPackage.INHERITANCE_ASSIGNEMENT__DB_TABLE:
        setDbTable(DB_TABLE_EDEFAULT);
        return;
      case ProcessorDslPackage.INHERITANCE_ASSIGNEMENT__DB_COLUMNS:
        getDbColumns().clear();
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
      case ProcessorDslPackage.INHERITANCE_ASSIGNEMENT__DISCRIMINATOR:
        return DISCRIMINATOR_EDEFAULT == null ? discriminator != null : !DISCRIMINATOR_EDEFAULT.equals(discriminator);
      case ProcessorDslPackage.INHERITANCE_ASSIGNEMENT__DB_TABLE:
        return DB_TABLE_EDEFAULT == null ? dbTable != null : !DB_TABLE_EDEFAULT.equals(dbTable);
      case ProcessorDslPackage.INHERITANCE_ASSIGNEMENT__DB_COLUMNS:
        return dbColumns != null && !dbColumns.isEmpty();
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
    result.append(" (discriminator: ");
    result.append(discriminator);
    result.append(", dbTable: ");
    result.append(dbTable);
    result.append(", dbColumns: ");
    result.append(dbColumns);
    result.append(')');
    return result.toString();
  }

} //InheritanceAssignementImpl
