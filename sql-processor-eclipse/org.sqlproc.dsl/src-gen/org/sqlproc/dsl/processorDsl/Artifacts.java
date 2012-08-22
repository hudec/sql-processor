/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifacts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Artifacts#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Artifacts#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Artifacts#getMappings <em>Mappings</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Artifacts#getPojos <em>Pojos</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Artifacts#getUsages <em>Usages</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Artifacts#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Artifacts#getTables <em>Tables</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Artifacts#getTableUsages <em>Table Usages</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Artifacts#getPojoPackages <em>Pojo Packages</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.Artifacts#getUsagesExt <em>Usages Ext</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getArtifacts()
 * @model
 * @generated
 */
public interface Artifacts extends EObject
{
  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.OptionalFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getArtifacts_Features()
   * @model containment="true"
   * @generated
   */
  EList<OptionalFeature> getFeatures();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.MetaStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getArtifacts_Statements()
   * @model containment="true"
   * @generated
   */
  EList<MetaStatement> getStatements();

  /**
   * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.MappingRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappings</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getArtifacts_Mappings()
   * @model containment="true"
   * @generated
   */
  EList<MappingRule> getMappings();

  /**
   * Returns the value of the '<em><b>Pojos</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.PojoDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pojos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pojos</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getArtifacts_Pojos()
   * @model containment="true"
   * @generated
   */
  EList<PojoDefinition> getPojos();

  /**
   * Returns the value of the '<em><b>Usages</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.PojoUsage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usages</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getArtifacts_Usages()
   * @model containment="true"
   * @generated
   */
  EList<PojoUsage> getUsages();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getArtifacts_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.TableDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tables</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getArtifacts_Tables()
   * @model containment="true"
   * @generated
   */
  EList<TableDefinition> getTables();

  /**
   * Returns the value of the '<em><b>Table Usages</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.TableUsage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Usages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table Usages</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getArtifacts_TableUsages()
   * @model containment="true"
   * @generated
   */
  EList<TableUsage> getTableUsages();

  /**
   * Returns the value of the '<em><b>Pojo Packages</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.PackageDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pojo Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pojo Packages</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getArtifacts_PojoPackages()
   * @model containment="true"
   * @generated
   */
  EList<PackageDeclaration> getPojoPackages();

  /**
   * Returns the value of the '<em><b>Usages Ext</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.PojoUsageExt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usages Ext</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usages Ext</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getArtifacts_UsagesExt()
   * @model containment="true"
   * @generated
   */
  EList<PojoUsageExt> getUsagesExt();

} // Artifacts
