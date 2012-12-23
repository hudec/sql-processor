/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.dsl.processorDsl.DaogenProperty;
import org.sqlproc.dsl.processorDsl.DatabaseProperty;
import org.sqlproc.dsl.processorDsl.MetagenProperty;
import org.sqlproc.dsl.processorDsl.PojogenProperty;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;
import org.sqlproc.dsl.processorDsl.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getPojogen <em>Pojogen</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getMetagen <em>Metagen</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl#getDaogen <em>Daogen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property
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
   * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabase()
   * @generated
   * @ordered
   */
  protected DatabaseProperty database;

  /**
   * The cached value of the '{@link #getPojogen() <em>Pojogen</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPojogen()
   * @generated
   * @ordered
   */
  protected PojogenProperty pojogen;

  /**
   * The cached value of the '{@link #getMetagen() <em>Metagen</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetagen()
   * @generated
   * @ordered
   */
  protected MetagenProperty metagen;

  /**
   * The cached value of the '{@link #getDaogen() <em>Daogen</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDaogen()
   * @generated
   * @ordered
   */
  protected DaogenProperty daogen;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyImpl()
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
    return ProcessorDslPackage.Literals.PROPERTY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseProperty getDatabase()
  {
    return database;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatabase(DatabaseProperty newDatabase, NotificationChain msgs)
  {
    DatabaseProperty oldDatabase = database;
    database = newDatabase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__DATABASE, oldDatabase, newDatabase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatabase(DatabaseProperty newDatabase)
  {
    if (newDatabase != database)
    {
      NotificationChain msgs = null;
      if (database != null)
        msgs = ((InternalEObject)database).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.PROPERTY__DATABASE, null, msgs);
      if (newDatabase != null)
        msgs = ((InternalEObject)newDatabase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.PROPERTY__DATABASE, null, msgs);
      msgs = basicSetDatabase(newDatabase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__DATABASE, newDatabase, newDatabase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojogenProperty getPojogen()
  {
    return pojogen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPojogen(PojogenProperty newPojogen, NotificationChain msgs)
  {
    PojogenProperty oldPojogen = pojogen;
    pojogen = newPojogen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__POJOGEN, oldPojogen, newPojogen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPojogen(PojogenProperty newPojogen)
  {
    if (newPojogen != pojogen)
    {
      NotificationChain msgs = null;
      if (pojogen != null)
        msgs = ((InternalEObject)pojogen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.PROPERTY__POJOGEN, null, msgs);
      if (newPojogen != null)
        msgs = ((InternalEObject)newPojogen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.PROPERTY__POJOGEN, null, msgs);
      msgs = basicSetPojogen(newPojogen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__POJOGEN, newPojogen, newPojogen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetagenProperty getMetagen()
  {
    return metagen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetagen(MetagenProperty newMetagen, NotificationChain msgs)
  {
    MetagenProperty oldMetagen = metagen;
    metagen = newMetagen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__METAGEN, oldMetagen, newMetagen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetagen(MetagenProperty newMetagen)
  {
    if (newMetagen != metagen)
    {
      NotificationChain msgs = null;
      if (metagen != null)
        msgs = ((InternalEObject)metagen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.PROPERTY__METAGEN, null, msgs);
      if (newMetagen != null)
        msgs = ((InternalEObject)newMetagen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.PROPERTY__METAGEN, null, msgs);
      msgs = basicSetMetagen(newMetagen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__METAGEN, newMetagen, newMetagen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DaogenProperty getDaogen()
  {
    return daogen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDaogen(DaogenProperty newDaogen, NotificationChain msgs)
  {
    DaogenProperty oldDaogen = daogen;
    daogen = newDaogen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__DAOGEN, oldDaogen, newDaogen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDaogen(DaogenProperty newDaogen)
  {
    if (newDaogen != daogen)
    {
      NotificationChain msgs = null;
      if (daogen != null)
        msgs = ((InternalEObject)daogen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.PROPERTY__DAOGEN, null, msgs);
      if (newDaogen != null)
        msgs = ((InternalEObject)newDaogen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.PROPERTY__DAOGEN, null, msgs);
      msgs = basicSetDaogen(newDaogen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.PROPERTY__DAOGEN, newDaogen, newDaogen));
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
      case ProcessorDslPackage.PROPERTY__DATABASE:
        return basicSetDatabase(null, msgs);
      case ProcessorDslPackage.PROPERTY__POJOGEN:
        return basicSetPojogen(null, msgs);
      case ProcessorDslPackage.PROPERTY__METAGEN:
        return basicSetMetagen(null, msgs);
      case ProcessorDslPackage.PROPERTY__DAOGEN:
        return basicSetDaogen(null, msgs);
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
      case ProcessorDslPackage.PROPERTY__NAME:
        return getName();
      case ProcessorDslPackage.PROPERTY__DATABASE:
        return getDatabase();
      case ProcessorDslPackage.PROPERTY__POJOGEN:
        return getPojogen();
      case ProcessorDslPackage.PROPERTY__METAGEN:
        return getMetagen();
      case ProcessorDslPackage.PROPERTY__DAOGEN:
        return getDaogen();
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
      case ProcessorDslPackage.PROPERTY__NAME:
        setName((String)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__DATABASE:
        setDatabase((DatabaseProperty)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__POJOGEN:
        setPojogen((PojogenProperty)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__METAGEN:
        setMetagen((MetagenProperty)newValue);
        return;
      case ProcessorDslPackage.PROPERTY__DAOGEN:
        setDaogen((DaogenProperty)newValue);
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
      case ProcessorDslPackage.PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProcessorDslPackage.PROPERTY__DATABASE:
        setDatabase((DatabaseProperty)null);
        return;
      case ProcessorDslPackage.PROPERTY__POJOGEN:
        setPojogen((PojogenProperty)null);
        return;
      case ProcessorDslPackage.PROPERTY__METAGEN:
        setMetagen((MetagenProperty)null);
        return;
      case ProcessorDslPackage.PROPERTY__DAOGEN:
        setDaogen((DaogenProperty)null);
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
      case ProcessorDslPackage.PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProcessorDslPackage.PROPERTY__DATABASE:
        return database != null;
      case ProcessorDslPackage.PROPERTY__POJOGEN:
        return pojogen != null;
      case ProcessorDslPackage.PROPERTY__METAGEN:
        return metagen != null;
      case ProcessorDslPackage.PROPERTY__DAOGEN:
        return daogen != null;
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
    result.append(')');
    return result.toString();
  }

} //PropertyImpl
