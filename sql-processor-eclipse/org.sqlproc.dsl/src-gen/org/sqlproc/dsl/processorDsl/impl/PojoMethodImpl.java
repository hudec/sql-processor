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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sqlproc.dsl.processorDsl.PojoMethod;
import org.sqlproc.dsl.processorDsl.PojoMethodArg;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pojo Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoMethodImpl#getScaffold <em>Scaffold</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoMethodImpl#getToInits <em>To Inits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PojoMethodImpl extends MinimalEObjectImpl.Container implements PojoMethod
{
  /**
   * The default value of the '{@link #getScaffold() <em>Scaffold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScaffold()
   * @generated
   * @ordered
   */
  protected static final String SCAFFOLD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getScaffold() <em>Scaffold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScaffold()
   * @generated
   * @ordered
   */
  protected String scaffold = SCAFFOLD_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getToInits() <em>To Inits</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToInits()
   * @generated
   * @ordered
   */
  protected EList<PojoMethodArg> toInits;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PojoMethodImpl()
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
    return ProcessorDslPackage.Literals.POJO_METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getScaffold()
  {
    return scaffold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScaffold(String newScaffold)
  {
    String oldScaffold = scaffold;
    scaffold = newScaffold;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJO_METHOD__SCAFFOLD, oldScaffold, scaffold));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJO_METHOD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PojoMethodArg> getToInits()
  {
    if (toInits == null)
    {
      toInits = new EObjectContainmentEList<PojoMethodArg>(PojoMethodArg.class, this, ProcessorDslPackage.POJO_METHOD__TO_INITS);
    }
    return toInits;
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
      case ProcessorDslPackage.POJO_METHOD__TO_INITS:
        return ((InternalEList<?>)getToInits()).basicRemove(otherEnd, msgs);
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
      case ProcessorDslPackage.POJO_METHOD__SCAFFOLD:
        return getScaffold();
      case ProcessorDslPackage.POJO_METHOD__NAME:
        return getName();
      case ProcessorDslPackage.POJO_METHOD__TO_INITS:
        return getToInits();
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
      case ProcessorDslPackage.POJO_METHOD__SCAFFOLD:
        setScaffold((String)newValue);
        return;
      case ProcessorDslPackage.POJO_METHOD__NAME:
        setName((String)newValue);
        return;
      case ProcessorDslPackage.POJO_METHOD__TO_INITS:
        getToInits().clear();
        getToInits().addAll((Collection<? extends PojoMethodArg>)newValue);
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
      case ProcessorDslPackage.POJO_METHOD__SCAFFOLD:
        setScaffold(SCAFFOLD_EDEFAULT);
        return;
      case ProcessorDslPackage.POJO_METHOD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProcessorDslPackage.POJO_METHOD__TO_INITS:
        getToInits().clear();
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
      case ProcessorDslPackage.POJO_METHOD__SCAFFOLD:
        return SCAFFOLD_EDEFAULT == null ? scaffold != null : !SCAFFOLD_EDEFAULT.equals(scaffold);
      case ProcessorDslPackage.POJO_METHOD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProcessorDslPackage.POJO_METHOD__TO_INITS:
        return toInits != null && !toInits.isEmpty();
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
    result.append(" (scaffold: ");
    result.append(scaffold);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PojoMethodImpl
