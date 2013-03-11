/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.dsl.processorDsl.DatabaseCatalogAssignement;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Catalog Assignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DatabaseCatalogAssignementImpl#getDbCatalog <em>Db Catalog</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseCatalogAssignementImpl extends MinimalEObjectImpl.Container implements DatabaseCatalogAssignement
{
  /**
   * The default value of the '{@link #getDbCatalog() <em>Db Catalog</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbCatalog()
   * @generated
   * @ordered
   */
  protected static final String DB_CATALOG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbCatalog() <em>Db Catalog</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbCatalog()
   * @generated
   * @ordered
   */
  protected String dbCatalog = DB_CATALOG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatabaseCatalogAssignementImpl()
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
    return ProcessorDslPackage.Literals.DATABASE_CATALOG_ASSIGNEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbCatalog()
  {
    return dbCatalog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbCatalog(String newDbCatalog)
  {
    String oldDbCatalog = dbCatalog;
    dbCatalog = newDbCatalog;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DATABASE_CATALOG_ASSIGNEMENT__DB_CATALOG, oldDbCatalog, dbCatalog));
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
      case ProcessorDslPackage.DATABASE_CATALOG_ASSIGNEMENT__DB_CATALOG:
        return getDbCatalog();
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
      case ProcessorDslPackage.DATABASE_CATALOG_ASSIGNEMENT__DB_CATALOG:
        setDbCatalog((String)newValue);
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
      case ProcessorDslPackage.DATABASE_CATALOG_ASSIGNEMENT__DB_CATALOG:
        setDbCatalog(DB_CATALOG_EDEFAULT);
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
      case ProcessorDslPackage.DATABASE_CATALOG_ASSIGNEMENT__DB_CATALOG:
        return DB_CATALOG_EDEFAULT == null ? dbCatalog != null : !DB_CATALOG_EDEFAULT.equals(dbCatalog);
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
    result.append(" (dbCatalog: ");
    result.append(dbCatalog);
    result.append(')');
    return result.toString();
  }

} //DatabaseCatalogAssignementImpl
