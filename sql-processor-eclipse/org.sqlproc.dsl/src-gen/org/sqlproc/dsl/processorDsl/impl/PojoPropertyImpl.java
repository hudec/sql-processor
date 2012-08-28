/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmType;

import org.sqlproc.dsl.processorDsl.PojoEntity;
import org.sqlproc.dsl.processorDsl.PojoProperty;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pojo Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoPropertyImpl#getNative <em>Native</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoPropertyImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoPropertyImpl#getGref <em>Gref</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoPropertyImpl#getGtype <em>Gtype</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoPropertyImpl#isArray <em>Array</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoPropertyImpl#isRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PojoPropertyImpl extends MinimalEObjectImpl.Container implements PojoProperty
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
   * The default value of the '{@link #getNative() <em>Native</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNative()
   * @generated
   * @ordered
   */
  protected static final String NATIVE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNative() <em>Native</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNative()
   * @generated
   * @ordered
   */
  protected String native_ = NATIVE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected PojoEntity ref;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JvmType type;

  /**
   * The cached value of the '{@link #getGref() <em>Gref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGref()
   * @generated
   * @ordered
   */
  protected PojoEntity gref;

  /**
   * The cached value of the '{@link #getGtype() <em>Gtype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGtype()
   * @generated
   * @ordered
   */
  protected JvmType gtype;

  /**
   * The default value of the '{@link #isArray() <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isArray()
   * @generated
   * @ordered
   */
  protected static final boolean ARRAY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isArray() <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isArray()
   * @generated
   * @ordered
   */
  protected boolean array = ARRAY_EDEFAULT;

  /**
   * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequired()
   * @generated
   * @ordered
   */
  protected static final boolean REQUIRED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequired()
   * @generated
   * @ordered
   */
  protected boolean required = REQUIRED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PojoPropertyImpl()
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
    return ProcessorDslPackage.Literals.POJO_PROPERTY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJO_PROPERTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNative()
  {
    return native_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNative(String newNative)
  {
    String oldNative = native_;
    native_ = newNative;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJO_PROPERTY__NATIVE, oldNative, native_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoEntity getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (PojoEntity)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorDslPackage.POJO_PROPERTY__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoEntity basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(PojoEntity newRef)
  {
    PojoEntity oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJO_PROPERTY__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (JvmType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorDslPackage.POJO_PROPERTY__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(JvmType newType)
  {
    JvmType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJO_PROPERTY__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoEntity getGref()
  {
    if (gref != null && gref.eIsProxy())
    {
      InternalEObject oldGref = (InternalEObject)gref;
      gref = (PojoEntity)eResolveProxy(oldGref);
      if (gref != oldGref)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorDslPackage.POJO_PROPERTY__GREF, oldGref, gref));
      }
    }
    return gref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoEntity basicGetGref()
  {
    return gref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGref(PojoEntity newGref)
  {
    PojoEntity oldGref = gref;
    gref = newGref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJO_PROPERTY__GREF, oldGref, gref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType getGtype()
  {
    if (gtype != null && gtype.eIsProxy())
    {
      InternalEObject oldGtype = (InternalEObject)gtype;
      gtype = (JvmType)eResolveProxy(oldGtype);
      if (gtype != oldGtype)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorDslPackage.POJO_PROPERTY__GTYPE, oldGtype, gtype));
      }
    }
    return gtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetGtype()
  {
    return gtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGtype(JvmType newGtype)
  {
    JvmType oldGtype = gtype;
    gtype = newGtype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJO_PROPERTY__GTYPE, oldGtype, gtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isArray()
  {
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArray(boolean newArray)
  {
    boolean oldArray = array;
    array = newArray;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJO_PROPERTY__ARRAY, oldArray, array));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRequired()
  {
    return required;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequired(boolean newRequired)
  {
    boolean oldRequired = required;
    required = newRequired;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJO_PROPERTY__REQUIRED, oldRequired, required));
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
      case ProcessorDslPackage.POJO_PROPERTY__NAME:
        return getName();
      case ProcessorDslPackage.POJO_PROPERTY__NATIVE:
        return getNative();
      case ProcessorDslPackage.POJO_PROPERTY__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case ProcessorDslPackage.POJO_PROPERTY__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case ProcessorDslPackage.POJO_PROPERTY__GREF:
        if (resolve) return getGref();
        return basicGetGref();
      case ProcessorDslPackage.POJO_PROPERTY__GTYPE:
        if (resolve) return getGtype();
        return basicGetGtype();
      case ProcessorDslPackage.POJO_PROPERTY__ARRAY:
        return isArray();
      case ProcessorDslPackage.POJO_PROPERTY__REQUIRED:
        return isRequired();
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
      case ProcessorDslPackage.POJO_PROPERTY__NAME:
        setName((String)newValue);
        return;
      case ProcessorDslPackage.POJO_PROPERTY__NATIVE:
        setNative((String)newValue);
        return;
      case ProcessorDslPackage.POJO_PROPERTY__REF:
        setRef((PojoEntity)newValue);
        return;
      case ProcessorDslPackage.POJO_PROPERTY__TYPE:
        setType((JvmType)newValue);
        return;
      case ProcessorDslPackage.POJO_PROPERTY__GREF:
        setGref((PojoEntity)newValue);
        return;
      case ProcessorDslPackage.POJO_PROPERTY__GTYPE:
        setGtype((JvmType)newValue);
        return;
      case ProcessorDslPackage.POJO_PROPERTY__ARRAY:
        setArray((Boolean)newValue);
        return;
      case ProcessorDslPackage.POJO_PROPERTY__REQUIRED:
        setRequired((Boolean)newValue);
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
      case ProcessorDslPackage.POJO_PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProcessorDslPackage.POJO_PROPERTY__NATIVE:
        setNative(NATIVE_EDEFAULT);
        return;
      case ProcessorDslPackage.POJO_PROPERTY__REF:
        setRef((PojoEntity)null);
        return;
      case ProcessorDslPackage.POJO_PROPERTY__TYPE:
        setType((JvmType)null);
        return;
      case ProcessorDslPackage.POJO_PROPERTY__GREF:
        setGref((PojoEntity)null);
        return;
      case ProcessorDslPackage.POJO_PROPERTY__GTYPE:
        setGtype((JvmType)null);
        return;
      case ProcessorDslPackage.POJO_PROPERTY__ARRAY:
        setArray(ARRAY_EDEFAULT);
        return;
      case ProcessorDslPackage.POJO_PROPERTY__REQUIRED:
        setRequired(REQUIRED_EDEFAULT);
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
      case ProcessorDslPackage.POJO_PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProcessorDslPackage.POJO_PROPERTY__NATIVE:
        return NATIVE_EDEFAULT == null ? native_ != null : !NATIVE_EDEFAULT.equals(native_);
      case ProcessorDslPackage.POJO_PROPERTY__REF:
        return ref != null;
      case ProcessorDslPackage.POJO_PROPERTY__TYPE:
        return type != null;
      case ProcessorDslPackage.POJO_PROPERTY__GREF:
        return gref != null;
      case ProcessorDslPackage.POJO_PROPERTY__GTYPE:
        return gtype != null;
      case ProcessorDslPackage.POJO_PROPERTY__ARRAY:
        return array != ARRAY_EDEFAULT;
      case ProcessorDslPackage.POJO_PROPERTY__REQUIRED:
        return required != REQUIRED_EDEFAULT;
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
    result.append(", native: ");
    result.append(native_);
    result.append(", array: ");
    result.append(array);
    result.append(", required: ");
    result.append(required);
    result.append(')');
    return result.toString();
  }

} //PojoPropertyImpl
