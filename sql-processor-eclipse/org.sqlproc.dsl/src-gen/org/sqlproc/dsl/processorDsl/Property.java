/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getPojogen <em>Pojogen</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getMetagen <em>Metagen</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Property#getDaogen <em>Daogen</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Database</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Database</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Database</em>' containment reference.
   * @see #setDatabase(DatabaseProperty)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_Database()
   * @model containment="true"
   * @generated
   */
  DatabaseProperty getDatabase();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Property#getDatabase <em>Database</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Database</em>' containment reference.
   * @see #getDatabase()
   * @generated
   */
  void setDatabase(DatabaseProperty value);

  /**
   * Returns the value of the '<em><b>Pojogen</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pojogen</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pojogen</em>' containment reference.
   * @see #setPojogen(PojogenProperty)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_Pojogen()
   * @model containment="true"
   * @generated
   */
  PojogenProperty getPojogen();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Property#getPojogen <em>Pojogen</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pojogen</em>' containment reference.
   * @see #getPojogen()
   * @generated
   */
  void setPojogen(PojogenProperty value);

  /**
   * Returns the value of the '<em><b>Metagen</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metagen</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metagen</em>' containment reference.
   * @see #setMetagen(MetagenProperty)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_Metagen()
   * @model containment="true"
   * @generated
   */
  MetagenProperty getMetagen();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Property#getMetagen <em>Metagen</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metagen</em>' containment reference.
   * @see #getMetagen()
   * @generated
   */
  void setMetagen(MetagenProperty value);

  /**
   * Returns the value of the '<em><b>Daogen</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Daogen</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Daogen</em>' containment reference.
   * @see #setDaogen(DaogenProperty)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getProperty_Daogen()
   * @model containment="true"
   * @generated
   */
  DaogenProperty getDaogen();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.Property#getDaogen <em>Daogen</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Daogen</em>' containment reference.
   * @see #getDaogen()
   * @generated
   */
  void setDaogen(DaogenProperty value);

} // Property
