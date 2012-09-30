/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.dsl.processorDsl.PojoPropertyModifier;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pojo Property Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoPropertyModifierImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoPropertyModifierImpl#isDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PojoPropertyModifierImpl#isPrimaryKey <em>Primary Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PojoPropertyModifierImpl extends MinimalEObjectImpl.Container implements PojoPropertyModifier
{
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
   * The default value of the '{@link #isDiscriminator() <em>Discriminator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDiscriminator()
   * @generated
   * @ordered
   */
  protected static final boolean DISCRIMINATOR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDiscriminator() <em>Discriminator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDiscriminator()
   * @generated
   * @ordered
   */
  protected boolean discriminator = DISCRIMINATOR_EDEFAULT;

  /**
   * The default value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrimaryKey()
   * @generated
   * @ordered
   */
  protected static final boolean PRIMARY_KEY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrimaryKey()
   * @generated
   * @ordered
   */
  protected boolean primaryKey = PRIMARY_KEY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PojoPropertyModifierImpl()
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
    return ProcessorDslPackage.Literals.POJO_PROPERTY_MODIFIER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJO_PROPERTY_MODIFIER__REQUIRED, oldRequired, required));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDiscriminator()
  {
    return discriminator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiscriminator(boolean newDiscriminator)
  {
    boolean oldDiscriminator = discriminator;
    discriminator = newDiscriminator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJO_PROPERTY_MODIFIER__DISCRIMINATOR, oldDiscriminator, discriminator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPrimaryKey()
  {
    return primaryKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryKey(boolean newPrimaryKey)
  {
    boolean oldPrimaryKey = primaryKey;
    primaryKey = newPrimaryKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.POJO_PROPERTY_MODIFIER__PRIMARY_KEY, oldPrimaryKey, primaryKey));
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
      case ProcessorDslPackage.POJO_PROPERTY_MODIFIER__REQUIRED:
        return isRequired();
      case ProcessorDslPackage.POJO_PROPERTY_MODIFIER__DISCRIMINATOR:
        return isDiscriminator();
      case ProcessorDslPackage.POJO_PROPERTY_MODIFIER__PRIMARY_KEY:
        return isPrimaryKey();
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
      case ProcessorDslPackage.POJO_PROPERTY_MODIFIER__REQUIRED:
        setRequired((Boolean)newValue);
        return;
      case ProcessorDslPackage.POJO_PROPERTY_MODIFIER__DISCRIMINATOR:
        setDiscriminator((Boolean)newValue);
        return;
      case ProcessorDslPackage.POJO_PROPERTY_MODIFIER__PRIMARY_KEY:
        setPrimaryKey((Boolean)newValue);
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
      case ProcessorDslPackage.POJO_PROPERTY_MODIFIER__REQUIRED:
        setRequired(REQUIRED_EDEFAULT);
        return;
      case ProcessorDslPackage.POJO_PROPERTY_MODIFIER__DISCRIMINATOR:
        setDiscriminator(DISCRIMINATOR_EDEFAULT);
        return;
      case ProcessorDslPackage.POJO_PROPERTY_MODIFIER__PRIMARY_KEY:
        setPrimaryKey(PRIMARY_KEY_EDEFAULT);
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
      case ProcessorDslPackage.POJO_PROPERTY_MODIFIER__REQUIRED:
        return required != REQUIRED_EDEFAULT;
      case ProcessorDslPackage.POJO_PROPERTY_MODIFIER__DISCRIMINATOR:
        return discriminator != DISCRIMINATOR_EDEFAULT;
      case ProcessorDslPackage.POJO_PROPERTY_MODIFIER__PRIMARY_KEY:
        return primaryKey != PRIMARY_KEY_EDEFAULT;
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
    result.append(" (required: ");
    result.append(required);
    result.append(", discriminator: ");
    result.append(discriminator);
    result.append(", primaryKey: ");
    result.append(primaryKey);
    result.append(')');
    return result.toString();
  }

} //PojoPropertyModifierImpl
