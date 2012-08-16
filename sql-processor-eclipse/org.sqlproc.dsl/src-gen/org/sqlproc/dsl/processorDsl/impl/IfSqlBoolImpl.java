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
import org.sqlproc.dsl.processorDsl.Identifier;
import org.sqlproc.dsl.processorDsl.IfSqlBool;
import org.sqlproc.dsl.processorDsl.IfSqlCond;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Sql Bool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.IfSqlBoolImpl#isNot <em>Not</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.IfSqlBoolImpl#getCnst <em>Cnst</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.IfSqlBoolImpl#getIdent <em>Ident</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.IfSqlBoolImpl#getCond <em>Cond</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfSqlBoolImpl extends MinimalEObjectImpl.Container implements IfSqlBool
{
  /**
   * The default value of the '{@link #isNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot()
   * @generated
   * @ordered
   */
  protected static final boolean NOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot()
   * @generated
   * @ordered
   */
  protected boolean not = NOT_EDEFAULT;

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
   * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected IfSqlCond cond;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfSqlBoolImpl()
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
    return ProcessorDslPackage.Literals.IF_SQL_BOOL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNot()
  {
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNot(boolean newNot)
  {
    boolean oldNot = not;
    not = newNot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_BOOL__NOT, oldNot, not));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_BOOL__CNST, oldCnst, newCnst);
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
        msgs = ((InternalEObject)cnst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.IF_SQL_BOOL__CNST, null, msgs);
      if (newCnst != null)
        msgs = ((InternalEObject)newCnst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.IF_SQL_BOOL__CNST, null, msgs);
      msgs = basicSetCnst(newCnst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_BOOL__CNST, newCnst, newCnst));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_BOOL__IDENT, oldIdent, newIdent);
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
        msgs = ((InternalEObject)ident).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.IF_SQL_BOOL__IDENT, null, msgs);
      if (newIdent != null)
        msgs = ((InternalEObject)newIdent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.IF_SQL_BOOL__IDENT, null, msgs);
      msgs = basicSetIdent(newIdent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_BOOL__IDENT, newIdent, newIdent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfSqlCond getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCond(IfSqlCond newCond, NotificationChain msgs)
  {
    IfSqlCond oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_BOOL__COND, oldCond, newCond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCond(IfSqlCond newCond)
  {
    if (newCond != cond)
    {
      NotificationChain msgs = null;
      if (cond != null)
        msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.IF_SQL_BOOL__COND, null, msgs);
      if (newCond != null)
        msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.IF_SQL_BOOL__COND, null, msgs);
      msgs = basicSetCond(newCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_BOOL__COND, newCond, newCond));
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
      case ProcessorDslPackage.IF_SQL_BOOL__CNST:
        return basicSetCnst(null, msgs);
      case ProcessorDslPackage.IF_SQL_BOOL__IDENT:
        return basicSetIdent(null, msgs);
      case ProcessorDslPackage.IF_SQL_BOOL__COND:
        return basicSetCond(null, msgs);
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
      case ProcessorDslPackage.IF_SQL_BOOL__NOT:
        return isNot();
      case ProcessorDslPackage.IF_SQL_BOOL__CNST:
        return getCnst();
      case ProcessorDslPackage.IF_SQL_BOOL__IDENT:
        return getIdent();
      case ProcessorDslPackage.IF_SQL_BOOL__COND:
        return getCond();
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
      case ProcessorDslPackage.IF_SQL_BOOL__NOT:
        setNot((Boolean)newValue);
        return;
      case ProcessorDslPackage.IF_SQL_BOOL__CNST:
        setCnst((Constant)newValue);
        return;
      case ProcessorDslPackage.IF_SQL_BOOL__IDENT:
        setIdent((Identifier)newValue);
        return;
      case ProcessorDslPackage.IF_SQL_BOOL__COND:
        setCond((IfSqlCond)newValue);
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
      case ProcessorDslPackage.IF_SQL_BOOL__NOT:
        setNot(NOT_EDEFAULT);
        return;
      case ProcessorDslPackage.IF_SQL_BOOL__CNST:
        setCnst((Constant)null);
        return;
      case ProcessorDslPackage.IF_SQL_BOOL__IDENT:
        setIdent((Identifier)null);
        return;
      case ProcessorDslPackage.IF_SQL_BOOL__COND:
        setCond((IfSqlCond)null);
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
      case ProcessorDslPackage.IF_SQL_BOOL__NOT:
        return not != NOT_EDEFAULT;
      case ProcessorDslPackage.IF_SQL_BOOL__CNST:
        return cnst != null;
      case ProcessorDslPackage.IF_SQL_BOOL__IDENT:
        return ident != null;
      case ProcessorDslPackage.IF_SQL_BOOL__COND:
        return cond != null;
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
    result.append(" (not: ");
    result.append(not);
    result.append(')');
    return result.toString();
  }

} //IfSqlBoolImpl
