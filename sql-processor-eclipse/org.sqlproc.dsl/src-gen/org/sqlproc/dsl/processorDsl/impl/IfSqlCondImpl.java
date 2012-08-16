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
import org.eclipse.emf.ecore.util.InternalEList;

import org.sqlproc.dsl.processorDsl.IfSqlBool;
import org.sqlproc.dsl.processorDsl.IfSqlCond;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Sql Cond</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.IfSqlCondImpl#getBool1 <em>Bool1</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.IfSqlCondImpl#getOper <em>Oper</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.IfSqlCondImpl#getBool2 <em>Bool2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfSqlCondImpl extends MinimalEObjectImpl.Container implements IfSqlCond
{
  /**
   * The cached value of the '{@link #getBool1() <em>Bool1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBool1()
   * @generated
   * @ordered
   */
  protected IfSqlBool bool1;

  /**
   * The cached value of the '{@link #getOper() <em>Oper</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOper()
   * @generated
   * @ordered
   */
  protected EList<String> oper;

  /**
   * The cached value of the '{@link #getBool2() <em>Bool2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBool2()
   * @generated
   * @ordered
   */
  protected EList<IfSqlBool> bool2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfSqlCondImpl()
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
    return ProcessorDslPackage.Literals.IF_SQL_COND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfSqlBool getBool1()
  {
    return bool1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBool1(IfSqlBool newBool1, NotificationChain msgs)
  {
    IfSqlBool oldBool1 = bool1;
    bool1 = newBool1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_COND__BOOL1, oldBool1, newBool1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBool1(IfSqlBool newBool1)
  {
    if (newBool1 != bool1)
    {
      NotificationChain msgs = null;
      if (bool1 != null)
        msgs = ((InternalEObject)bool1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.IF_SQL_COND__BOOL1, null, msgs);
      if (newBool1 != null)
        msgs = ((InternalEObject)newBool1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.IF_SQL_COND__BOOL1, null, msgs);
      msgs = basicSetBool1(newBool1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_COND__BOOL1, newBool1, newBool1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getOper()
  {
    if (oper == null)
    {
      oper = new EDataTypeEList<String>(String.class, this, ProcessorDslPackage.IF_SQL_COND__OPER);
    }
    return oper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IfSqlBool> getBool2()
  {
    if (bool2 == null)
    {
      bool2 = new EObjectContainmentEList<IfSqlBool>(IfSqlBool.class, this, ProcessorDslPackage.IF_SQL_COND__BOOL2);
    }
    return bool2;
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
      case ProcessorDslPackage.IF_SQL_COND__BOOL1:
        return basicSetBool1(null, msgs);
      case ProcessorDslPackage.IF_SQL_COND__BOOL2:
        return ((InternalEList<?>)getBool2()).basicRemove(otherEnd, msgs);
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
      case ProcessorDslPackage.IF_SQL_COND__BOOL1:
        return getBool1();
      case ProcessorDslPackage.IF_SQL_COND__OPER:
        return getOper();
      case ProcessorDslPackage.IF_SQL_COND__BOOL2:
        return getBool2();
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
      case ProcessorDslPackage.IF_SQL_COND__BOOL1:
        setBool1((IfSqlBool)newValue);
        return;
      case ProcessorDslPackage.IF_SQL_COND__OPER:
        getOper().clear();
        getOper().addAll((Collection<? extends String>)newValue);
        return;
      case ProcessorDslPackage.IF_SQL_COND__BOOL2:
        getBool2().clear();
        getBool2().addAll((Collection<? extends IfSqlBool>)newValue);
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
      case ProcessorDslPackage.IF_SQL_COND__BOOL1:
        setBool1((IfSqlBool)null);
        return;
      case ProcessorDslPackage.IF_SQL_COND__OPER:
        getOper().clear();
        return;
      case ProcessorDslPackage.IF_SQL_COND__BOOL2:
        getBool2().clear();
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
      case ProcessorDslPackage.IF_SQL_COND__BOOL1:
        return bool1 != null;
      case ProcessorDslPackage.IF_SQL_COND__OPER:
        return oper != null && !oper.isEmpty();
      case ProcessorDslPackage.IF_SQL_COND__BOOL2:
        return bool2 != null && !bool2.isEmpty();
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
    result.append(" (oper: ");
    result.append(oper);
    result.append(')');
    return result.toString();
  }

} //IfSqlCondImpl
