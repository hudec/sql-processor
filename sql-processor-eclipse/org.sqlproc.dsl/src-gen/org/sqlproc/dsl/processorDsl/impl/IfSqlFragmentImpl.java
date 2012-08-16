/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.dsl.processorDsl.Column;
import org.sqlproc.dsl.processorDsl.Constant;
import org.sqlproc.dsl.processorDsl.DatabaseColumn;
import org.sqlproc.dsl.processorDsl.DatabaseTable;
import org.sqlproc.dsl.processorDsl.Identifier;
import org.sqlproc.dsl.processorDsl.IfMetaSql;
import org.sqlproc.dsl.processorDsl.IfSqlFragment;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Sql Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.IfSqlFragmentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.IfSqlFragmentImpl#getCol <em>Col</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.IfSqlFragmentImpl#getCnst <em>Cnst</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.IfSqlFragmentImpl#getIdent <em>Ident</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.IfSqlFragmentImpl#getDbtab <em>Dbtab</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.IfSqlFragmentImpl#getDbcol <em>Dbcol</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.impl.IfSqlFragmentImpl#getMeta <em>Meta</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfSqlFragmentImpl extends MinimalEObjectImpl.Container implements IfSqlFragment
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
   * The cached value of the '{@link #getCol() <em>Col</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCol()
   * @generated
   * @ordered
   */
  protected Column col;

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
   * The cached value of the '{@link #getDbtab() <em>Dbtab</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbtab()
   * @generated
   * @ordered
   */
  protected DatabaseTable dbtab;

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
   * The cached value of the '{@link #getMeta() <em>Meta</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeta()
   * @generated
   * @ordered
   */
  protected IfMetaSql meta;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfSqlFragmentImpl()
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
    return ProcessorDslPackage.Literals.IF_SQL_FRAGMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_FRAGMENT__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Column getCol()
  {
    return col;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCol(Column newCol, NotificationChain msgs)
  {
    Column oldCol = col;
    col = newCol;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_FRAGMENT__COL, oldCol, newCol);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCol(Column newCol)
  {
    if (newCol != col)
    {
      NotificationChain msgs = null;
      if (col != null)
        msgs = ((InternalEObject)col).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.IF_SQL_FRAGMENT__COL, null, msgs);
      if (newCol != null)
        msgs = ((InternalEObject)newCol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.IF_SQL_FRAGMENT__COL, null, msgs);
      msgs = basicSetCol(newCol, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_FRAGMENT__COL, newCol, newCol));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_FRAGMENT__CNST, oldCnst, newCnst);
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
        msgs = ((InternalEObject)cnst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.IF_SQL_FRAGMENT__CNST, null, msgs);
      if (newCnst != null)
        msgs = ((InternalEObject)newCnst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.IF_SQL_FRAGMENT__CNST, null, msgs);
      msgs = basicSetCnst(newCnst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_FRAGMENT__CNST, newCnst, newCnst));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_FRAGMENT__IDENT, oldIdent, newIdent);
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
        msgs = ((InternalEObject)ident).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.IF_SQL_FRAGMENT__IDENT, null, msgs);
      if (newIdent != null)
        msgs = ((InternalEObject)newIdent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.IF_SQL_FRAGMENT__IDENT, null, msgs);
      msgs = basicSetIdent(newIdent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_FRAGMENT__IDENT, newIdent, newIdent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseTable getDbtab()
  {
    return dbtab;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbtab(DatabaseTable newDbtab, NotificationChain msgs)
  {
    DatabaseTable oldDbtab = dbtab;
    dbtab = newDbtab;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_FRAGMENT__DBTAB, oldDbtab, newDbtab);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbtab(DatabaseTable newDbtab)
  {
    if (newDbtab != dbtab)
    {
      NotificationChain msgs = null;
      if (dbtab != null)
        msgs = ((InternalEObject)dbtab).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.IF_SQL_FRAGMENT__DBTAB, null, msgs);
      if (newDbtab != null)
        msgs = ((InternalEObject)newDbtab).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.IF_SQL_FRAGMENT__DBTAB, null, msgs);
      msgs = basicSetDbtab(newDbtab, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_FRAGMENT__DBTAB, newDbtab, newDbtab));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_FRAGMENT__DBCOL, oldDbcol, newDbcol);
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
        msgs = ((InternalEObject)dbcol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.IF_SQL_FRAGMENT__DBCOL, null, msgs);
      if (newDbcol != null)
        msgs = ((InternalEObject)newDbcol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.IF_SQL_FRAGMENT__DBCOL, null, msgs);
      msgs = basicSetDbcol(newDbcol, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_FRAGMENT__DBCOL, newDbcol, newDbcol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfMetaSql getMeta()
  {
    return meta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMeta(IfMetaSql newMeta, NotificationChain msgs)
  {
    IfMetaSql oldMeta = meta;
    meta = newMeta;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_FRAGMENT__META, oldMeta, newMeta);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMeta(IfMetaSql newMeta)
  {
    if (newMeta != meta)
    {
      NotificationChain msgs = null;
      if (meta != null)
        msgs = ((InternalEObject)meta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.IF_SQL_FRAGMENT__META, null, msgs);
      if (newMeta != null)
        msgs = ((InternalEObject)newMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorDslPackage.IF_SQL_FRAGMENT__META, null, msgs);
      msgs = basicSetMeta(newMeta, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorDslPackage.IF_SQL_FRAGMENT__META, newMeta, newMeta));
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
      case ProcessorDslPackage.IF_SQL_FRAGMENT__COL:
        return basicSetCol(null, msgs);
      case ProcessorDslPackage.IF_SQL_FRAGMENT__CNST:
        return basicSetCnst(null, msgs);
      case ProcessorDslPackage.IF_SQL_FRAGMENT__IDENT:
        return basicSetIdent(null, msgs);
      case ProcessorDslPackage.IF_SQL_FRAGMENT__DBTAB:
        return basicSetDbtab(null, msgs);
      case ProcessorDslPackage.IF_SQL_FRAGMENT__DBCOL:
        return basicSetDbcol(null, msgs);
      case ProcessorDslPackage.IF_SQL_FRAGMENT__META:
        return basicSetMeta(null, msgs);
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
      case ProcessorDslPackage.IF_SQL_FRAGMENT__VALUE:
        return getValue();
      case ProcessorDslPackage.IF_SQL_FRAGMENT__COL:
        return getCol();
      case ProcessorDslPackage.IF_SQL_FRAGMENT__CNST:
        return getCnst();
      case ProcessorDslPackage.IF_SQL_FRAGMENT__IDENT:
        return getIdent();
      case ProcessorDslPackage.IF_SQL_FRAGMENT__DBTAB:
        return getDbtab();
      case ProcessorDslPackage.IF_SQL_FRAGMENT__DBCOL:
        return getDbcol();
      case ProcessorDslPackage.IF_SQL_FRAGMENT__META:
        return getMeta();
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
      case ProcessorDslPackage.IF_SQL_FRAGMENT__VALUE:
        setValue((String)newValue);
        return;
      case ProcessorDslPackage.IF_SQL_FRAGMENT__COL:
        setCol((Column)newValue);
        return;
      case ProcessorDslPackage.IF_SQL_FRAGMENT__CNST:
        setCnst((Constant)newValue);
        return;
      case ProcessorDslPackage.IF_SQL_FRAGMENT__IDENT:
        setIdent((Identifier)newValue);
        return;
      case ProcessorDslPackage.IF_SQL_FRAGMENT__DBTAB:
        setDbtab((DatabaseTable)newValue);
        return;
      case ProcessorDslPackage.IF_SQL_FRAGMENT__DBCOL:
        setDbcol((DatabaseColumn)newValue);
        return;
      case ProcessorDslPackage.IF_SQL_FRAGMENT__META:
        setMeta((IfMetaSql)newValue);
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
      case ProcessorDslPackage.IF_SQL_FRAGMENT__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case ProcessorDslPackage.IF_SQL_FRAGMENT__COL:
        setCol((Column)null);
        return;
      case ProcessorDslPackage.IF_SQL_FRAGMENT__CNST:
        setCnst((Constant)null);
        return;
      case ProcessorDslPackage.IF_SQL_FRAGMENT__IDENT:
        setIdent((Identifier)null);
        return;
      case ProcessorDslPackage.IF_SQL_FRAGMENT__DBTAB:
        setDbtab((DatabaseTable)null);
        return;
      case ProcessorDslPackage.IF_SQL_FRAGMENT__DBCOL:
        setDbcol((DatabaseColumn)null);
        return;
      case ProcessorDslPackage.IF_SQL_FRAGMENT__META:
        setMeta((IfMetaSql)null);
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
      case ProcessorDslPackage.IF_SQL_FRAGMENT__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case ProcessorDslPackage.IF_SQL_FRAGMENT__COL:
        return col != null;
      case ProcessorDslPackage.IF_SQL_FRAGMENT__CNST:
        return cnst != null;
      case ProcessorDslPackage.IF_SQL_FRAGMENT__IDENT:
        return ident != null;
      case ProcessorDslPackage.IF_SQL_FRAGMENT__DBTAB:
        return dbtab != null;
      case ProcessorDslPackage.IF_SQL_FRAGMENT__DBCOL:
        return dbcol != null;
      case ProcessorDslPackage.IF_SQL_FRAGMENT__META:
        return meta != null;
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

} //IfSqlFragmentImpl
