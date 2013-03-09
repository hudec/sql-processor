/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.dsl.processorDsl.DatabaseMetaInfoAssignement;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Meta Info Assignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabaseMetaInfoAssignementImpl#getDbMetaInfo <em>Db Meta Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseMetaInfoAssignementImpl extends MinimalEObjectImpl.Container implements DatabaseMetaInfoAssignement
{
  /**
   * The default value of the '{@link #getDbMetaInfo() <em>Db Meta Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbMetaInfo()
   * @generated
   * @ordered
   */
  protected static final String DB_META_INFO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbMetaInfo() <em>Db Meta Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbMetaInfo()
   * @generated
   * @ordered
   */
  protected String dbMetaInfo = DB_META_INFO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatabaseMetaInfoAssignementImpl()
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
    return ProcessorDslPackage.Literals.DATABASE_META_INFO_ASSIGNEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbMetaInfo()
  {
    return dbMetaInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbMetaInfo(String newDbMetaInfo)
  {
    String oldDbMetaInfo = dbMetaInfo;
    dbMetaInfo = newDbMetaInfo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_META_INFO_ASSIGNEMENT__DB_META_INFO, oldDbMetaInfo, dbMetaInfo));
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
      case ProcessorDslPackage.DATABASE_META_INFO_ASSIGNEMENT__DB_META_INFO:
        return getDbMetaInfo();
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
      case ProcessorDslPackage.DATABASE_META_INFO_ASSIGNEMENT__DB_META_INFO:
        setDbMetaInfo((String)newValue);
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
      case ProcessorDslPackage.DATABASE_META_INFO_ASSIGNEMENT__DB_META_INFO:
        setDbMetaInfo(DB_META_INFO_EDEFAULT);
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
      case ProcessorDslPackage.DATABASE_META_INFO_ASSIGNEMENT__DB_META_INFO:
        return DB_META_INFO_EDEFAULT == null ? dbMetaInfo != null : !DB_META_INFO_EDEFAULT.equals(dbMetaInfo);
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
    result.append(" (dbMetaInfo: ");
    result.append(dbMetaInfo);
    result.append(')');
    return result.toString();
  }

} //DatabaseMetaInfoAssignementImpl
