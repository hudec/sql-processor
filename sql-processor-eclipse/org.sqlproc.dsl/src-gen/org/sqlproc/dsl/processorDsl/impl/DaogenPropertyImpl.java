/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.xtext.common.types.JvmType;

import org.sqlproc.dsl.processorDsl.DaogenProperty;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Daogen Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DaogenPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DaogenPropertyImpl#getDbTables <em>Db Tables</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DaogenPropertyImpl#getImplPackage <em>Impl Package</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DaogenPropertyImpl#getControlClass <em>Control Class</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DaogenPropertyImpl#getToImplements <em>To Implements</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.DaogenPropertyImpl#getToExtends <em>To Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DaogenPropertyImpl extends MinimalEObjectImpl.Container implements DaogenProperty
{
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
   * The cached value of the '{@link #getDbTables() <em>Db Tables</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbTables()
   * @generated
   * @ordered
   */
  protected EList<String> dbTables;

  /**
   * The default value of the '{@link #getImplPackage() <em>Impl Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplPackage()
   * @generated
   * @ordered
   */
  protected static final String IMPL_PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImplPackage() <em>Impl Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplPackage()
   * @generated
   * @ordered
   */
  protected String implPackage = IMPL_PACKAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getControlClass() <em>Control Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlClass()
   * @generated
   * @ordered
   */
  protected JvmType controlClass;

  /**
   * The cached value of the '{@link #getToImplements() <em>To Implements</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToImplements()
   * @generated
   * @ordered
   */
  protected EList<JvmType> toImplements;

  /**
   * The cached value of the '{@link #getToExtends() <em>To Extends</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToExtends()
   * @generated
   * @ordered
   */
  protected JvmType toExtends;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DaogenPropertyImpl()
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
    return ProcessorDslPackage.Literals.DAOGEN_PROPERTY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DAOGEN_PROPERTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDbTables()
  {
    if (dbTables == null)
    {
      dbTables = new EDataTypeEList<String>(String.class, this, ProcessorDslPackage.DAOGEN_PROPERTY__DB_TABLES);
    }
    return dbTables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImplPackage()
  {
    return implPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplPackage(String newImplPackage)
  {
    String oldImplPackage = implPackage;
    implPackage = newImplPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DAOGEN_PROPERTY__IMPL_PACKAGE, oldImplPackage, implPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType getControlClass()
  {
    if (controlClass != null && controlClass.eIsProxy())
    {
      InternalEObject oldControlClass = (InternalEObject)controlClass;
      controlClass = (JvmType)eResolveProxy(oldControlClass);
      if (controlClass != oldControlClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorDslPackage.DAOGEN_PROPERTY__CONTROL_CLASS, oldControlClass, controlClass));
      }
    }
    return controlClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetControlClass()
  {
    return controlClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControlClass(JvmType newControlClass)
  {
    JvmType oldControlClass = controlClass;
    controlClass = newControlClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DAOGEN_PROPERTY__CONTROL_CLASS, oldControlClass, controlClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JvmType> getToImplements()
  {
    if (toImplements == null)
    {
      toImplements = new EObjectResolvingEList<JvmType>(JvmType.class, this, ProcessorDslPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS);
    }
    return toImplements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType getToExtends()
  {
    if (toExtends != null && toExtends.eIsProxy())
    {
      InternalEObject oldToExtends = (InternalEObject)toExtends;
      toExtends = (JvmType)eResolveProxy(oldToExtends);
      if (toExtends != oldToExtends)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorDslPackage.DAOGEN_PROPERTY__TO_EXTENDS, oldToExtends, toExtends));
      }
    }
    return toExtends;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetToExtends()
  {
    return toExtends;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToExtends(JvmType newToExtends)
  {
    JvmType oldToExtends = toExtends;
    toExtends = newToExtends;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.DAOGEN_PROPERTY__TO_EXTENDS, oldToExtends, toExtends));
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
      case ProcessorDslPackage.DAOGEN_PROPERTY__NAME:
        return getName();
      case ProcessorDslPackage.DAOGEN_PROPERTY__DB_TABLES:
        return getDbTables();
      case ProcessorDslPackage.DAOGEN_PROPERTY__IMPL_PACKAGE:
        return getImplPackage();
      case ProcessorDslPackage.DAOGEN_PROPERTY__CONTROL_CLASS:
        if (resolve) return getControlClass();
        return basicGetControlClass();
      case ProcessorDslPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS:
        return getToImplements();
      case ProcessorDslPackage.DAOGEN_PROPERTY__TO_EXTENDS:
        if (resolve) return getToExtends();
        return basicGetToExtends();
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
      case ProcessorDslPackage.DAOGEN_PROPERTY__NAME:
        setName((String)newValue);
        return;
      case ProcessorDslPackage.DAOGEN_PROPERTY__DB_TABLES:
        getDbTables().clear();
        getDbTables().addAll((Collection<? extends String>)newValue);
        return;
      case ProcessorDslPackage.DAOGEN_PROPERTY__IMPL_PACKAGE:
        setImplPackage((String)newValue);
        return;
      case ProcessorDslPackage.DAOGEN_PROPERTY__CONTROL_CLASS:
        setControlClass((JvmType)newValue);
        return;
      case ProcessorDslPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS:
        getToImplements().clear();
        getToImplements().addAll((Collection<? extends JvmType>)newValue);
        return;
      case ProcessorDslPackage.DAOGEN_PROPERTY__TO_EXTENDS:
        setToExtends((JvmType)newValue);
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
      case ProcessorDslPackage.DAOGEN_PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProcessorDslPackage.DAOGEN_PROPERTY__DB_TABLES:
        getDbTables().clear();
        return;
      case ProcessorDslPackage.DAOGEN_PROPERTY__IMPL_PACKAGE:
        setImplPackage(IMPL_PACKAGE_EDEFAULT);
        return;
      case ProcessorDslPackage.DAOGEN_PROPERTY__CONTROL_CLASS:
        setControlClass((JvmType)null);
        return;
      case ProcessorDslPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS:
        getToImplements().clear();
        return;
      case ProcessorDslPackage.DAOGEN_PROPERTY__TO_EXTENDS:
        setToExtends((JvmType)null);
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
      case ProcessorDslPackage.DAOGEN_PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProcessorDslPackage.DAOGEN_PROPERTY__DB_TABLES:
        return dbTables != null && !dbTables.isEmpty();
      case ProcessorDslPackage.DAOGEN_PROPERTY__IMPL_PACKAGE:
        return IMPL_PACKAGE_EDEFAULT == null ? implPackage != null : !IMPL_PACKAGE_EDEFAULT.equals(implPackage);
      case ProcessorDslPackage.DAOGEN_PROPERTY__CONTROL_CLASS:
        return controlClass != null;
      case ProcessorDslPackage.DAOGEN_PROPERTY__TO_IMPLEMENTS:
        return toImplements != null && !toImplements.isEmpty();
      case ProcessorDslPackage.DAOGEN_PROPERTY__TO_EXTENDS:
        return toExtends != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", dbTables: ");
    result.append(dbTables);
    result.append(", implPackage: ");
    result.append(implPackage);
    result.append(')');
    return result.toString();
  }

} //DaogenPropertyImpl
