/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.dsl.processorDsl.JdbcMetaInfoAssignement;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jdbc Meta Info Assignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.JdbcMetaInfoAssignementImpl#getDbJdbcInfo <em>Db Jdbc Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JdbcMetaInfoAssignementImpl extends MinimalEObjectImpl.Container implements JdbcMetaInfoAssignement
{
  /**
   * The default value of the '{@link #getDbJdbcInfo() <em>Db Jdbc Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbJdbcInfo()
   * @generated
   * @ordered
   */
  protected static final String DB_JDBC_INFO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbJdbcInfo() <em>Db Jdbc Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbJdbcInfo()
   * @generated
   * @ordered
   */
  protected String dbJdbcInfo = DB_JDBC_INFO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JdbcMetaInfoAssignementImpl()
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
    return ProcessorDslPackage.Literals.JDBC_META_INFO_ASSIGNEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbJdbcInfo()
  {
    return dbJdbcInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbJdbcInfo(String newDbJdbcInfo)
  {
    String oldDbJdbcInfo = dbJdbcInfo;
    dbJdbcInfo = newDbJdbcInfo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.JDBC_META_INFO_ASSIGNEMENT__DB_JDBC_INFO, oldDbJdbcInfo, dbJdbcInfo));
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
      case ProcessorDslPackage.JDBC_META_INFO_ASSIGNEMENT__DB_JDBC_INFO:
        return getDbJdbcInfo();
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
      case ProcessorDslPackage.JDBC_META_INFO_ASSIGNEMENT__DB_JDBC_INFO:
        setDbJdbcInfo((String)newValue);
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
      case ProcessorDslPackage.JDBC_META_INFO_ASSIGNEMENT__DB_JDBC_INFO:
        setDbJdbcInfo(DB_JDBC_INFO_EDEFAULT);
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
      case ProcessorDslPackage.JDBC_META_INFO_ASSIGNEMENT__DB_JDBC_INFO:
        return DB_JDBC_INFO_EDEFAULT == null ? dbJdbcInfo != null : !DB_JDBC_INFO_EDEFAULT.equals(dbJdbcInfo);
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
    result.append(" (dbJdbcInfo: ");
    result.append(dbJdbcInfo);
    result.append(')');
    return result.toString();
  }

} //JdbcMetaInfoAssignementImpl
