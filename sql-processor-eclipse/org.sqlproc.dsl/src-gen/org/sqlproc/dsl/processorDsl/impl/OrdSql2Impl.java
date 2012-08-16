/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.dsl.processorDsl.Constant;
import org.sqlproc.dsl.processorDsl.DatabaseColumn;
import org.sqlproc.dsl.processorDsl.Identifier;
import org.sqlproc.dsl.processorDsl.OrdSql2;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ord Sql2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.OrdSql2Impl#getValue <em>Value</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.OrdSql2Impl#getCnst <em>Cnst</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.OrdSql2Impl#getIdent <em>Ident</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.OrdSql2Impl#getDbcol <em>Dbcol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrdSql2Impl extends MinimalEObjectImpl.Container implements OrdSql2
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCnst() <em>Cnst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCnst()
   * @generated
   * @ordered
   */
  protected Constant cnst;

  /**
   * The cached value of the '{@link #getIdent() <em>Ident</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdent()
   * @generated
   * @ordered
   */
  protected Identifier ident;

  /**
   * The cached value of the '{@link #getDbcol() <em>Dbcol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbcol()
   * @generated
   * @ordered
   */
  protected DatabaseColumn dbcol;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrdSql2Impl()
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
    return ProcessorDslPackage.Literals.ORD_SQL2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.ORD_SQL2__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant getCnst()
  {
    return cnst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCnst(Constant newCnst, NotificationChain msgs)
  {
    Constant oldCnst = cnst;
    cnst = newCnst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.ORD_SQL2__CNST, oldCnst, newCnst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCnst(Constant newCnst)
  {
    if (newCnst != cnst)
    {
      NotificationChain msgs = null;
      if (cnst != null)
        msgs = ((InternalEObject)cnst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.ORD_SQL2__CNST, null, msgs);
      if (newCnst != null)
        msgs = ((InternalEObject)newCnst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.ORD_SQL2__CNST, null, msgs);
      msgs = basicSetCnst(newCnst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.ORD_SQL2__CNST, newCnst, newCnst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Identifier getIdent()
  {
    return ident;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdent(Identifier newIdent, NotificationChain msgs)
  {
    Identifier oldIdent = ident;
    ident = newIdent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.ORD_SQL2__IDENT, oldIdent, newIdent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdent(Identifier newIdent)
  {
    if (newIdent != ident)
    {
      NotificationChain msgs = null;
      if (ident != null)
        msgs = ((InternalEObject)ident).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.ORD_SQL2__IDENT, null, msgs);
      if (newIdent != null)
        msgs = ((InternalEObject)newIdent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.ORD_SQL2__IDENT, null, msgs);
      msgs = basicSetIdent(newIdent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.ORD_SQL2__IDENT, newIdent, newIdent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseColumn getDbcol()
  {
    return dbcol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbcol(DatabaseColumn newDbcol, NotificationChain msgs)
  {
    DatabaseColumn oldDbcol = dbcol;
    dbcol = newDbcol;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.ORD_SQL2__DBCOL, oldDbcol, newDbcol);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbcol(DatabaseColumn newDbcol)
  {
    if (newDbcol != dbcol)
    {
      NotificationChain msgs = null;
      if (dbcol != null)
        msgs = ((InternalEObject)dbcol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.ORD_SQL2__DBCOL, null, msgs);
      if (newDbcol != null)
        msgs = ((InternalEObject)newDbcol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.ORD_SQL2__DBCOL, null, msgs);
      msgs = basicSetDbcol(newDbcol, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.ORD_SQL2__DBCOL, newDbcol, newDbcol));
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
      case ProcessorDslPackage.ORD_SQL2__CNST:
        return basicSetCnst(null, msgs);
      case ProcessorDslPackage.ORD_SQL2__IDENT:
        return basicSetIdent(null, msgs);
      case ProcessorDslPackage.ORD_SQL2__DBCOL:
        return basicSetDbcol(null, msgs);
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
      case ProcessorDslPackage.ORD_SQL2__VALUE:
        return getValue();
      case ProcessorDslPackage.ORD_SQL2__CNST:
        return getCnst();
      case ProcessorDslPackage.ORD_SQL2__IDENT:
        return getIdent();
      case ProcessorDslPackage.ORD_SQL2__DBCOL:
        return getDbcol();
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
      case ProcessorDslPackage.ORD_SQL2__VALUE:
        setValue((String)newValue);
        return;
      case ProcessorDslPackage.ORD_SQL2__CNST:
        setCnst((Constant)newValue);
        return;
      case ProcessorDslPackage.ORD_SQL2__IDENT:
        setIdent((Identifier)newValue);
        return;
      case ProcessorDslPackage.ORD_SQL2__DBCOL:
        setDbcol((DatabaseColumn)newValue);
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
      case ProcessorDslPackage.ORD_SQL2__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case ProcessorDslPackage.ORD_SQL2__CNST:
        setCnst((Constant)null);
        return;
      case ProcessorDslPackage.ORD_SQL2__IDENT:
        setIdent((Identifier)null);
        return;
      case ProcessorDslPackage.ORD_SQL2__DBCOL:
        setDbcol((DatabaseColumn)null);
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
      case ProcessorDslPackage.ORD_SQL2__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case ProcessorDslPackage.ORD_SQL2__CNST:
        return cnst != null;
      case ProcessorDslPackage.ORD_SQL2__IDENT:
        return ident != null;
      case ProcessorDslPackage.ORD_SQL2__DBCOL:
        return dbcol != null;
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
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //OrdSql2Impl
