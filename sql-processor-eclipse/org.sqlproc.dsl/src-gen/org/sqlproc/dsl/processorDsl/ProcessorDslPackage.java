/**
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslFactory
 * @model kind="package"
 * @generated
 */
public interface ProcessorDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "processorDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sqlproc.org/dsl/ProcessorDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "processorDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProcessorDslPackage eINSTANCE = org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ArtifactsImpl <em>Artifacts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ArtifactsImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getArtifacts()
   * @generated
   */
  int ARTIFACTS = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__PROPERTIES = 0;

  /**
   * The feature id for the '<em><b>Pojos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__POJOS = 1;

  /**
   * The feature id for the '<em><b>Tables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__TABLES = 2;

  /**
   * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__PROCEDURES = 3;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__FUNCTIONS = 4;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__STATEMENTS = 5;

  /**
   * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__MAPPINGS = 6;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__FEATURES = 7;

  /**
   * The feature id for the '<em><b>Pojo Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__POJO_PACKAGES = 8;

  /**
   * The number of structural features of the '<em>Artifacts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.DatabaseCatalogAssignementImpl <em>Database Catalog Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.DatabaseCatalogAssignementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDatabaseCatalogAssignement()
   * @generated
   */
  int DATABASE_CATALOG_ASSIGNEMENT = 1;

  /**
   * The feature id for the '<em><b>Db Catalog</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_CATALOG_ASSIGNEMENT__DB_CATALOG = 0;

  /**
   * The number of structural features of the '<em>Database Catalog Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_CATALOG_ASSIGNEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.DatabaseSchemaAssignementImpl <em>Database Schema Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.DatabaseSchemaAssignementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDatabaseSchemaAssignement()
   * @generated
   */
  int DATABASE_SCHEMA_ASSIGNEMENT = 2;

  /**
   * The feature id for the '<em><b>Db Schema</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_SCHEMA_ASSIGNEMENT__DB_SCHEMA = 0;

  /**
   * The number of structural features of the '<em>Database Schema Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_SCHEMA_ASSIGNEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.DatabaseTypeAssignementImpl <em>Database Type Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.DatabaseTypeAssignementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDatabaseTypeAssignement()
   * @generated
   */
  int DATABASE_TYPE_ASSIGNEMENT = 3;

  /**
   * The feature id for the '<em><b>Db Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_TYPE_ASSIGNEMENT__DB_TYPE = 0;

  /**
   * The number of structural features of the '<em>Database Type Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_TYPE_ASSIGNEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.DatabaseMetaInfoAssignementImpl <em>Database Meta Info Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.DatabaseMetaInfoAssignementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDatabaseMetaInfoAssignement()
   * @generated
   */
  int DATABASE_META_INFO_ASSIGNEMENT = 4;

  /**
   * The feature id for the '<em><b>Db Meta Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_META_INFO_ASSIGNEMENT__DB_META_INFO = 0;

  /**
   * The number of structural features of the '<em>Database Meta Info Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_META_INFO_ASSIGNEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.DriverMetaInfoAssignementImpl <em>Driver Meta Info Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.DriverMetaInfoAssignementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDriverMetaInfoAssignement()
   * @generated
   */
  int DRIVER_META_INFO_ASSIGNEMENT = 5;

  /**
   * The feature id for the '<em><b>Db Driver Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVER_META_INFO_ASSIGNEMENT__DB_DRIVER_INFO = 0;

  /**
   * The number of structural features of the '<em>Driver Meta Info Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVER_META_INFO_ASSIGNEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.DriverMethodOutputAssignementImpl <em>Driver Method Output Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.DriverMethodOutputAssignementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDriverMethodOutputAssignement()
   * @generated
   */
  int DRIVER_METHOD_OUTPUT_ASSIGNEMENT = 6;

  /**
   * The feature id for the '<em><b>Driver Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVER_METHOD_OUTPUT_ASSIGNEMENT__DRIVER_METHOD = 0;

  /**
   * The feature id for the '<em><b>Call Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVER_METHOD_OUTPUT_ASSIGNEMENT__CALL_OUTPUT = 1;

  /**
   * The number of structural features of the '<em>Driver Method Output Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVER_METHOD_OUTPUT_ASSIGNEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.SqlTypeAssignementImpl <em>Sql Type Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.SqlTypeAssignementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getSqlTypeAssignement()
   * @generated
   */
  int SQL_TYPE_ASSIGNEMENT = 7;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_TYPE_ASSIGNEMENT__TYPE_NAME = 0;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_TYPE_ASSIGNEMENT__SIZE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_TYPE_ASSIGNEMENT__TYPE = 2;

  /**
   * The number of structural features of the '<em>Sql Type Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_TYPE_ASSIGNEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ColumnTypeAssignementImpl <em>Column Type Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ColumnTypeAssignementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getColumnTypeAssignement()
   * @generated
   */
  int COLUMN_TYPE_ASSIGNEMENT = 8;

  /**
   * The feature id for the '<em><b>Db Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_TYPE_ASSIGNEMENT__DB_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_TYPE_ASSIGNEMENT__TYPE = 1;

  /**
   * The number of structural features of the '<em>Column Type Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_TYPE_ASSIGNEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ShowColumnTypeAssignementImpl <em>Show Column Type Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ShowColumnTypeAssignementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getShowColumnTypeAssignement()
   * @generated
   */
  int SHOW_COLUMN_TYPE_ASSIGNEMENT = 9;

  /**
   * The feature id for the '<em><b>Db Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_COLUMN_TYPE_ASSIGNEMENT__DB_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_COLUMN_TYPE_ASSIGNEMENT__TYPE = 1;

  /**
   * The number of structural features of the '<em>Show Column Type Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_COLUMN_TYPE_ASSIGNEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.TableAssignementImpl <em>Table Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.TableAssignementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getTableAssignement()
   * @generated
   */
  int TABLE_ASSIGNEMENT = 10;

  /**
   * The feature id for the '<em><b>Db Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ASSIGNEMENT__DB_TABLE = 0;

  /**
   * The feature id for the '<em><b>New Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ASSIGNEMENT__NEW_NAME = 1;

  /**
   * The number of structural features of the '<em>Table Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ASSIGNEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.JoinTableAssignementImpl <em>Join Table Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.JoinTableAssignementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getJoinTableAssignement()
   * @generated
   */
  int JOIN_TABLE_ASSIGNEMENT = 11;

  /**
   * The feature id for the '<em><b>Db Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TABLE_ASSIGNEMENT__DB_TABLE = 0;

  /**
   * The feature id for the '<em><b>Db Tables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TABLE_ASSIGNEMENT__DB_TABLES = 1;

  /**
   * The number of structural features of the '<em>Join Table Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TABLE_ASSIGNEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ColumnAssignementImpl <em>Column Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ColumnAssignementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getColumnAssignement()
   * @generated
   */
  int COLUMN_ASSIGNEMENT = 12;

  /**
   * The feature id for the '<em><b>Db Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_ASSIGNEMENT__DB_COLUMN = 0;

  /**
   * The feature id for the '<em><b>New Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_ASSIGNEMENT__NEW_NAME = 1;

  /**
   * The number of structural features of the '<em>Column Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_ASSIGNEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ImportAssignementImpl <em>Import Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ImportAssignementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getImportAssignement()
   * @generated
   */
  int IMPORT_ASSIGNEMENT = 13;

  /**
   * The feature id for the '<em><b>Db Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_ASSIGNEMENT__DB_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Pk Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_ASSIGNEMENT__PK_TABLE = 1;

  /**
   * The feature id for the '<em><b>Pk Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_ASSIGNEMENT__PK_COLUMN = 2;

  /**
   * The number of structural features of the '<em>Import Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_ASSIGNEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ExportAssignementImpl <em>Export Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ExportAssignementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getExportAssignement()
   * @generated
   */
  int EXPORT_ASSIGNEMENT = 14;

  /**
   * The feature id for the '<em><b>Db Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_ASSIGNEMENT__DB_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Fk Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_ASSIGNEMENT__FK_TABLE = 1;

  /**
   * The feature id for the '<em><b>Fk Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_ASSIGNEMENT__FK_COLUMN = 2;

  /**
   * The number of structural features of the '<em>Export Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_ASSIGNEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.InheritanceAssignementImpl <em>Inheritance Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.InheritanceAssignementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getInheritanceAssignement()
   * @generated
   */
  int INHERITANCE_ASSIGNEMENT = 15;

  /**
   * The feature id for the '<em><b>Discriminator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_ASSIGNEMENT__DISCRIMINATOR = 0;

  /**
   * The feature id for the '<em><b>Db Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_ASSIGNEMENT__DB_TABLE = 1;

  /**
   * The feature id for the '<em><b>Db Columns</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_ASSIGNEMENT__DB_COLUMNS = 2;

  /**
   * The number of structural features of the '<em>Inheritance Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_ASSIGNEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ManyToManyAssignementImpl <em>Many To Many Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ManyToManyAssignementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getManyToManyAssignement()
   * @generated
   */
  int MANY_TO_MANY_ASSIGNEMENT = 16;

  /**
   * The feature id for the '<em><b>Pk Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY_ASSIGNEMENT__PK_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Pk Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY_ASSIGNEMENT__PK_TABLE = 1;

  /**
   * The feature id for the '<em><b>Fk Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY_ASSIGNEMENT__FK_COLUMN = 2;

  /**
   * The number of structural features of the '<em>Many To Many Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY_ASSIGNEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.DebugLevelAssignementImpl <em>Debug Level Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.DebugLevelAssignementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDebugLevelAssignement()
   * @generated
   */
  int DEBUG_LEVEL_ASSIGNEMENT = 17;

  /**
   * The feature id for the '<em><b>Debug</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBUG_LEVEL_ASSIGNEMENT__DEBUG = 0;

  /**
   * The number of structural features of the '<em>Debug Level Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEBUG_LEVEL_ASSIGNEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PropertyImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Database</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DATABASE = 1;

  /**
   * The feature id for the '<em><b>Pojogen</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__POJOGEN = 2;

  /**
   * The feature id for the '<em><b>Metagen</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__METAGEN = 3;

  /**
   * The feature id for the '<em><b>Daogen</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DAOGEN = 4;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl <em>Database Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDatabaseProperty()
   * @generated
   */
  int DATABASE_PROPERTY = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Db Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_URL = 1;

  /**
   * The feature id for the '<em><b>Db Username</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_USERNAME = 2;

  /**
   * The feature id for the '<em><b>Db Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_PASSWORD = 3;

  /**
   * The feature id for the '<em><b>Db Catalog</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_CATALOG = 4;

  /**
   * The feature id for the '<em><b>Db Schema</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_SCHEMA = 5;

  /**
   * The feature id for the '<em><b>Db Driver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_DRIVER = 6;

  /**
   * The feature id for the '<em><b>Db Execute Before</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_EXECUTE_BEFORE = 7;

  /**
   * The feature id for the '<em><b>Db Execute After</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_EXECUTE_AFTER = 8;

  /**
   * The feature id for the '<em><b>Db Index Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_INDEX_TYPES = 9;

  /**
   * The feature id for the '<em><b>Db Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_TYPE = 10;

  /**
   * The feature id for the '<em><b>Db Meta Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_META_INFO = 11;

  /**
   * The feature id for the '<em><b>Db Driver Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_DRIVER_INFO = 12;

  /**
   * The feature id for the '<em><b>Db Methods Calls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DB_METHODS_CALLS = 13;

  /**
   * The feature id for the '<em><b>Debug</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY__DEBUG = 14;

  /**
   * The number of structural features of the '<em>Database Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_PROPERTY_FEATURE_COUNT = 15;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl <em>Pojogen Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojogenProperty()
   * @generated
   */
  int POJOGEN_PROPERTY = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Sql Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__SQL_TYPES = 1;

  /**
   * The feature id for the '<em><b>Db Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__DB_TABLE = 2;

  /**
   * The feature id for the '<em><b>Column Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__COLUMN_TYPES = 3;

  /**
   * The feature id for the '<em><b>Column Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__COLUMN_TYPE = 4;

  /**
   * The feature id for the '<em><b>Db Tables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__DB_TABLES = 5;

  /**
   * The feature id for the '<em><b>Join Tables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__JOIN_TABLES = 6;

  /**
   * The feature id for the '<em><b>Db Columns</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__DB_COLUMNS = 7;

  /**
   * The feature id for the '<em><b>Tables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__TABLES = 8;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__COLUMNS = 9;

  /**
   * The feature id for the '<em><b>Exports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__EXPORTS = 10;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__IMPORTS = 11;

  /**
   * The feature id for the '<em><b>Many2s</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__MANY2S = 12;

  /**
   * The feature id for the '<em><b>Db Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__DB_COLUMN = 13;

  /**
   * The feature id for the '<em><b>Inheritance</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__INHERITANCE = 14;

  /**
   * The feature id for the '<em><b>Methods</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__METHODS = 15;

  /**
   * The feature id for the '<em><b>To Implements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__TO_IMPLEMENTS = 16;

  /**
   * The feature id for the '<em><b>To Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__TO_EXTENDS = 17;

  /**
   * The feature id for the '<em><b>Impl Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__IMPL_PACKAGE = 18;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__VERSION = 19;

  /**
   * The feature id for the '<em><b>Debug</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY__DEBUG = 20;

  /**
   * The number of structural features of the '<em>Pojogen Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJOGEN_PROPERTY_FEATURE_COUNT = 21;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.MetaTypeAssignementImpl <em>Meta Type Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.MetaTypeAssignementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMetaTypeAssignement()
   * @generated
   */
  int META_TYPE_ASSIGNEMENT = 21;

  /**
   * The feature id for the '<em><b>Db Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_TYPE_ASSIGNEMENT__DB_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_TYPE_ASSIGNEMENT__TYPE = 1;

  /**
   * The feature id for the '<em><b>Extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_TYPE_ASSIGNEMENT__EXTENSION = 2;

  /**
   * The number of structural features of the '<em>Meta Type Assignement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_TYPE_ASSIGNEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.MetagenPropertyImpl <em>Metagen Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.MetagenPropertyImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMetagenProperty()
   * @generated
   */
  int METAGEN_PROPERTY = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Sequence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__SEQUENCE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__TYPE = 2;

  /**
   * The feature id for the '<em><b>Db Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__DB_TABLE = 3;

  /**
   * The feature id for the '<em><b>Identity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__IDENTITY = 4;

  /**
   * The feature id for the '<em><b>Meta Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__META_TYPES = 5;

  /**
   * The feature id for the '<em><b>Db Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__DB_STATEMENT = 6;

  /**
   * The feature id for the '<em><b>Db Columns</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__DB_COLUMNS = 7;

  /**
   * The feature id for the '<em><b>Db Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__DB_FUNCTION = 8;

  /**
   * The feature id for the '<em><b>Db Procedure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__DB_PROCEDURE = 9;

  /**
   * The feature id for the '<em><b>Debug</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY__DEBUG = 10;

  /**
   * The number of structural features of the '<em>Metagen Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAGEN_PROPERTY_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.DaogenPropertyImpl <em>Daogen Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.DaogenPropertyImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDaogenProperty()
   * @generated
   */
  int DAOGEN_PROPERTY = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Db Tables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY__DB_TABLES = 1;

  /**
   * The feature id for the '<em><b>Impl Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY__IMPL_PACKAGE = 2;

  /**
   * The feature id for the '<em><b>To Implements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY__TO_IMPLEMENTS = 3;

  /**
   * The feature id for the '<em><b>To Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY__TO_EXTENDS = 4;

  /**
   * The feature id for the '<em><b>Db Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY__DB_FUNCTION = 5;

  /**
   * The feature id for the '<em><b>Result Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY__RESULT_TYPE = 6;

  /**
   * The feature id for the '<em><b>Debug</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY__DEBUG = 7;

  /**
   * The number of structural features of the '<em>Daogen Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAOGEN_PROPERTY_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoDefinitionImpl <em>Pojo Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PojoDefinitionImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoDefinition()
   * @generated
   */
  int POJO_DEFINITION = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DEFINITION__CLASS = 1;

  /**
   * The number of structural features of the '<em>Pojo Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.TableDefinitionImpl <em>Table Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.TableDefinitionImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getTableDefinition()
   * @generated
   */
  int TABLE_DEFINITION = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DEFINITION__TABLE = 1;

  /**
   * The number of structural features of the '<em>Table Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ProcedureDefinitionImpl <em>Procedure Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ProcedureDefinitionImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getProcedureDefinition()
   * @generated
   */
  int PROCEDURE_DEFINITION = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DEFINITION__TABLE = 1;

  /**
   * The number of structural features of the '<em>Procedure Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.FunctionDefinitionImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getFunctionDefinition()
   * @generated
   */
  int FUNCTION_DEFINITION = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__TABLE = 1;

  /**
   * The number of structural features of the '<em>Function Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.MetaStatementImpl <em>Meta Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.MetaStatementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMetaStatement()
   * @generated
   */
  int META_STATEMENT = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_STATEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_STATEMENT__TYPE = 1;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_STATEMENT__MODIFIERS = 2;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_STATEMENT__STATEMENT = 3;

  /**
   * The number of structural features of the '<em>Meta Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_STATEMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.SqlImpl <em>Sql</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.SqlImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getSql()
   * @generated
   */
  int SQL = 29;

  /**
   * The feature id for the '<em><b>Sqls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL__SQLS = 0;

  /**
   * The number of structural features of the '<em>Sql</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.SqlFragmentImpl <em>Sql Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.SqlFragmentImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getSqlFragment()
   * @generated
   */
  int SQL_FRAGMENT = 30;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_FRAGMENT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Col</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_FRAGMENT__COL = 1;

  /**
   * The feature id for the '<em><b>Cnst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_FRAGMENT__CNST = 2;

  /**
   * The feature id for the '<em><b>Ident</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_FRAGMENT__IDENT = 3;

  /**
   * The feature id for the '<em><b>Meta</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_FRAGMENT__META = 4;

  /**
   * The feature id for the '<em><b>Dbtab</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_FRAGMENT__DBTAB = 5;

  /**
   * The feature id for the '<em><b>Dbcol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_FRAGMENT__DBCOL = 6;

  /**
   * The number of structural features of the '<em>Sql Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_FRAGMENT_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.MetaSqlImpl <em>Meta Sql</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.MetaSqlImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMetaSql()
   * @generated
   */
  int META_SQL = 31;

  /**
   * The feature id for the '<em><b>Ifs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_SQL__IFS = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_SQL__TYPE = 1;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_SQL__COND = 2;

  /**
   * The feature id for the '<em><b>Ftype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_SQL__FTYPE = 3;

  /**
   * The feature id for the '<em><b>Ord</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_SQL__ORD = 4;

  /**
   * The number of structural features of the '<em>Meta Sql</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_SQL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.IfSqlImpl <em>If Sql</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.IfSqlImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getIfSql()
   * @generated
   */
  int IF_SQL = 32;

  /**
   * The feature id for the '<em><b>Sqls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SQL__SQLS = 0;

  /**
   * The number of structural features of the '<em>If Sql</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SQL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.IfSqlFragmentImpl <em>If Sql Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.IfSqlFragmentImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getIfSqlFragment()
   * @generated
   */
  int IF_SQL_FRAGMENT = 33;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SQL_FRAGMENT__VALUE = 0;

  /**
   * The feature id for the '<em><b>Col</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SQL_FRAGMENT__COL = 1;

  /**
   * The feature id for the '<em><b>Cnst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SQL_FRAGMENT__CNST = 2;

  /**
   * The feature id for the '<em><b>Ident</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SQL_FRAGMENT__IDENT = 3;

  /**
   * The feature id for the '<em><b>Dbtab</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SQL_FRAGMENT__DBTAB = 4;

  /**
   * The feature id for the '<em><b>Dbcol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SQL_FRAGMENT__DBCOL = 5;

  /**
   * The feature id for the '<em><b>Meta</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SQL_FRAGMENT__META = 6;

  /**
   * The number of structural features of the '<em>If Sql Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SQL_FRAGMENT_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.IfMetaSqlImpl <em>If Meta Sql</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.IfMetaSqlImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getIfMetaSql()
   * @generated
   */
  int IF_META_SQL = 34;

  /**
   * The feature id for the '<em><b>Ifs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_META_SQL__IFS = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_META_SQL__TYPE = 1;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_META_SQL__COND = 2;

  /**
   * The number of structural features of the '<em>If Meta Sql</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_META_SQL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.IfSqlCondImpl <em>If Sql Cond</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.IfSqlCondImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getIfSqlCond()
   * @generated
   */
  int IF_SQL_COND = 35;

  /**
   * The feature id for the '<em><b>Bool1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SQL_COND__BOOL1 = 0;

  /**
   * The feature id for the '<em><b>Oper</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SQL_COND__OPER = 1;

  /**
   * The feature id for the '<em><b>Bool2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SQL_COND__BOOL2 = 2;

  /**
   * The number of structural features of the '<em>If Sql Cond</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SQL_COND_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.IfSqlBoolImpl <em>If Sql Bool</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.IfSqlBoolImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getIfSqlBool()
   * @generated
   */
  int IF_SQL_BOOL = 36;

  /**
   * The feature id for the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SQL_BOOL__NOT = 0;

  /**
   * The feature id for the '<em><b>Cnst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SQL_BOOL__CNST = 1;

  /**
   * The feature id for the '<em><b>Ident</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SQL_BOOL__IDENT = 2;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SQL_BOOL__COND = 3;

  /**
   * The number of structural features of the '<em>If Sql Bool</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SQL_BOOL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.OrdSqlImpl <em>Ord Sql</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.OrdSqlImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getOrdSql()
   * @generated
   */
  int ORD_SQL = 37;

  /**
   * The feature id for the '<em><b>Sqls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORD_SQL__SQLS = 0;

  /**
   * The number of structural features of the '<em>Ord Sql</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORD_SQL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.OrdSql2Impl <em>Ord Sql2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.OrdSql2Impl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getOrdSql2()
   * @generated
   */
  int ORD_SQL2 = 38;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORD_SQL2__VALUE = 0;

  /**
   * The feature id for the '<em><b>Cnst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORD_SQL2__CNST = 1;

  /**
   * The feature id for the '<em><b>Ident</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORD_SQL2__IDENT = 2;

  /**
   * The feature id for the '<em><b>Dbcol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORD_SQL2__DBCOL = 3;

  /**
   * The number of structural features of the '<em>Ord Sql2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORD_SQL2_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ColumnImpl <em>Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ColumnImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getColumn()
   * @generated
   */
  int COLUMN = 39;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__COLUMNS = 0;

  /**
   * The number of structural features of the '<em>Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ExtendedColumnImpl <em>Extended Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ExtendedColumnImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getExtendedColumn()
   * @generated
   */
  int EXTENDED_COLUMN = 40;

  /**
   * The feature id for the '<em><b>Col</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_COLUMN__COL = 0;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_COLUMN__MODIFIERS = 1;

  /**
   * The number of structural features of the '<em>Extended Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_COLUMN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ExtendedColumnNameImpl <em>Extended Column Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ExtendedColumnNameImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getExtendedColumnName()
   * @generated
   */
  int EXTENDED_COLUMN_NAME = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_COLUMN_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Extended Column Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_COLUMN_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ConstantImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 42;

  /**
   * The feature id for the '<em><b>Case</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__CASE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NAME = 1;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__MODIFIERS = 2;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.IdentifierImpl <em>Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.IdentifierImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getIdentifier()
   * @generated
   */
  int IDENTIFIER = 43;

  /**
   * The feature id for the '<em><b>Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__MODE = 0;

  /**
   * The feature id for the '<em><b>Case</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__CASE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__NAME = 2;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__MODIFIERS = 3;

  /**
   * The number of structural features of the '<em>Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.DatabaseColumnImpl <em>Database Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.DatabaseColumnImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDatabaseColumn()
   * @generated
   */
  int DATABASE_COLUMN = 44;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_COLUMN__NAME = 0;

  /**
   * The number of structural features of the '<em>Database Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_COLUMN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.DatabaseTableImpl <em>Database Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.DatabaseTableImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDatabaseTable()
   * @generated
   */
  int DATABASE_TABLE = 45;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_TABLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Database Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_TABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.MappingRuleImpl <em>Mapping Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.MappingRuleImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMappingRule()
   * @generated
   */
  int MAPPING_RULE = 46;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_RULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_RULE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_RULE__MODIFIERS = 2;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_RULE__MAPPING = 3;

  /**
   * The number of structural features of the '<em>Mapping Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_RULE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.MappingImpl <em>Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.MappingImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMapping()
   * @generated
   */
  int MAPPING = 47;

  /**
   * The feature id for the '<em><b>Mapping Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__MAPPING_ITEMS = 0;

  /**
   * The number of structural features of the '<em>Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.MappingItemImpl <em>Mapping Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.MappingItemImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMappingItem()
   * @generated
   */
  int MAPPING_ITEM = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_ITEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_ITEM__ATTR = 1;

  /**
   * The number of structural features of the '<em>Mapping Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.MappingColumnImpl <em>Mapping Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.MappingColumnImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMappingColumn()
   * @generated
   */
  int MAPPING_COLUMN = 49;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_COLUMN__ITEMS = 0;

  /**
   * The number of structural features of the '<em>Mapping Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_COLUMN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ExtendedMappingItemImpl <em>Extended Mapping Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ExtendedMappingItemImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getExtendedMappingItem()
   * @generated
   */
  int EXTENDED_MAPPING_ITEM = 50;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_MAPPING_ITEM__ATTR = 0;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_MAPPING_ITEM__MODIFIERS = 1;

  /**
   * The number of structural features of the '<em>Extended Mapping Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_MAPPING_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.MappingColumnNameImpl <em>Mapping Column Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.MappingColumnNameImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMappingColumnName()
   * @generated
   */
  int MAPPING_COLUMN_NAME = 51;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_COLUMN_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Mapping Column Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_COLUMN_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.OptionalFeatureImpl <em>Optional Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.OptionalFeatureImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getOptionalFeature()
   * @generated
   */
  int OPTIONAL_FEATURE = 52;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_FEATURE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_FEATURE__MODIFIERS = 2;

  /**
   * The feature id for the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_FEATURE__OPTION = 3;

  /**
   * The number of structural features of the '<em>Optional Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_FEATURE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoTypeImpl <em>Pojo Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PojoTypeImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoType()
   * @generated
   */
  int POJO_TYPE = 53;

  /**
   * The feature id for the '<em><b>Native</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_TYPE__NATIVE = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_TYPE__REF = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_TYPE__TYPE = 2;

  /**
   * The feature id for the '<em><b>Gref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_TYPE__GREF = 3;

  /**
   * The feature id for the '<em><b>Gtype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_TYPE__GTYPE = 4;

  /**
   * The feature id for the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_TYPE__ARRAY = 5;

  /**
   * The number of structural features of the '<em>Pojo Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_TYPE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.AbstractPojoEntityImpl <em>Abstract Pojo Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.AbstractPojoEntityImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getAbstractPojoEntity()
   * @generated
   */
  int ABSTRACT_POJO_ENTITY = 55;

  /**
   * The number of structural features of the '<em>Abstract Pojo Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_POJO_ENTITY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PackageDeclarationImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 54;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__SUFFIX = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__ELEMENTS = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ImportImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 56;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ImplementsImpl <em>Implements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ImplementsImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getImplements()
   * @generated
   */
  int IMPLEMENTS = 57;

  /**
   * The feature id for the '<em><b>Implements</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS__IMPLEMENTS = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Implements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTS_FEATURE_COUNT = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ExtendsImpl <em>Extends</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ExtendsImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getExtends()
   * @generated
   */
  int EXTENDS = 58;

  /**
   * The feature id for the '<em><b>Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS__EXTENDS = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Extends</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_FEATURE_COUNT = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ImplPackageImpl <em>Impl Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ImplPackageImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getImplPackage()
   * @generated
   */
  int IMPL_PACKAGE = 59;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPL_PACKAGE__NAME = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Impl Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPL_PACKAGE_FEATURE_COUNT = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoEntityModifier1Impl <em>Pojo Entity Modifier1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PojoEntityModifier1Impl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoEntityModifier1()
   * @generated
   */
  int POJO_ENTITY_MODIFIER1 = 60;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY_MODIFIER1__FINAL = 0;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY_MODIFIER1__ABSTRACT = 1;

  /**
   * The number of structural features of the '<em>Pojo Entity Modifier1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY_MODIFIER1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoEntityModifier2Impl <em>Pojo Entity Modifier2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PojoEntityModifier2Impl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoEntityModifier2()
   * @generated
   */
  int POJO_ENTITY_MODIFIER2 = 61;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY_MODIFIER2__SUPER_TYPE = 0;

  /**
   * The feature id for the '<em><b>Discriminator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY_MODIFIER2__DISCRIMINATOR = 1;

  /**
   * The feature id for the '<em><b>Sernum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY_MODIFIER2__SERNUM = 2;

  /**
   * The number of structural features of the '<em>Pojo Entity Modifier2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY_MODIFIER2_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoEntityImpl <em>Pojo Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PojoEntityImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoEntity()
   * @generated
   */
  int POJO_ENTITY = 62;

  /**
   * The feature id for the '<em><b>Modifiers1</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY__MODIFIERS1 = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY__NAME = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Modifiers2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY__MODIFIERS2 = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY__FEATURES = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Pojo Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY_FEATURE_COUNT = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoPropertyModifierImpl <em>Pojo Property Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PojoPropertyModifierImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoPropertyModifier()
   * @generated
   */
  int POJO_PROPERTY_MODIFIER = 63;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY_MODIFIER__REQUIRED = 0;

  /**
   * The feature id for the '<em><b>Discriminator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY_MODIFIER__DISCRIMINATOR = 1;

  /**
   * The feature id for the '<em><b>Primary Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY_MODIFIER__PRIMARY_KEY = 2;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY_MODIFIER__INDEX = 3;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY_MODIFIER__VERSION = 4;

  /**
   * The number of structural features of the '<em>Pojo Property Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY_MODIFIER_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoPropertyImpl <em>Pojo Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PojoPropertyImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoProperty()
   * @generated
   */
  int POJO_PROPERTY = 64;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Native</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY__NATIVE = 1;

  /**
   * The feature id for the '<em><b>Attrs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY__ATTRS = 2;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY__REF = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY__TYPE = 4;

  /**
   * The feature id for the '<em><b>Gref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY__GREF = 5;

  /**
   * The feature id for the '<em><b>Gtype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY__GTYPE = 6;

  /**
   * The feature id for the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY__ARRAY = 7;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY__MODIFIERS = 8;

  /**
   * The number of structural features of the '<em>Pojo Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoDaoModifierImpl <em>Pojo Dao Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PojoDaoModifierImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoDaoModifier()
   * @generated
   */
  int POJO_DAO_MODIFIER = 65;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DAO_MODIFIER__SUPER_TYPE = 0;

  /**
   * The feature id for the '<em><b>Sernum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DAO_MODIFIER__SERNUM = 1;

  /**
   * The number of structural features of the '<em>Pojo Dao Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DAO_MODIFIER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoDaoImpl <em>Pojo Dao</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PojoDaoImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoDao()
   * @generated
   */
  int POJO_DAO = 66;

  /**
   * The feature id for the '<em><b>Modifiers1</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DAO__MODIFIERS1 = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DAO__NAME = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Pojo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DAO__POJO = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Modifiers2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DAO__MODIFIERS2 = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DAO__METHODS = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>To Inits</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DAO__TO_INITS = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Pojo Dao</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_DAO_FEATURE_COUNT = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoMethodModifierImpl <em>Pojo Method Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PojoMethodModifierImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoMethodModifier()
   * @generated
   */
  int POJO_METHOD_MODIFIER = 67;

  /**
   * The feature id for the '<em><b>Call Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_METHOD_MODIFIER__CALL_FUNCTION = 0;

  /**
   * The feature id for the '<em><b>Call Update</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_METHOD_MODIFIER__CALL_UPDATE = 1;

  /**
   * The feature id for the '<em><b>Call Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_METHOD_MODIFIER__CALL_QUERY = 2;

  /**
   * The feature id for the '<em><b>Call Query Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_METHOD_MODIFIER__CALL_QUERY_FUNCTION = 3;

  /**
   * The feature id for the '<em><b>Call Select Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_METHOD_MODIFIER__CALL_SELECT_FUNCTION = 4;

  /**
   * The number of structural features of the '<em>Pojo Method Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_METHOD_MODIFIER_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoMethodImpl <em>Pojo Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PojoMethodImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoMethod()
   * @generated
   */
  int POJO_METHOD = 68;

  /**
   * The feature id for the '<em><b>Modifiers1</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_METHOD__MODIFIERS1 = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_METHOD__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_METHOD__TYPE = 2;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_METHOD__ARGS = 3;

  /**
   * The number of structural features of the '<em>Pojo Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_METHOD_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ToInitMethodImpl <em>To Init Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ToInitMethodImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getToInitMethod()
   * @generated
   */
  int TO_INIT_METHOD = 69;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO_INIT_METHOD__NAME = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO_INIT_METHOD__ARGS = 1;

  /**
   * The number of structural features of the '<em>To Init Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO_INIT_METHOD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoMethodArgImpl <em>Pojo Method Arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PojoMethodArgImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoMethodArg()
   * @generated
   */
  int POJO_METHOD_ARG = 70;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_METHOD_ARG__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_METHOD_ARG__TYPE = 1;

  /**
   * The number of structural features of the '<em>Pojo Method Arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_METHOD_ARG_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.Artifacts <em>Artifacts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifacts</em>'.
   * @see org.sqlproc.dsl.processorDsl.Artifacts
   * @generated
   */
  EClass getArtifacts();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.Artifacts#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.sqlproc.dsl.processorDsl.Artifacts#getProperties()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.Artifacts#getPojos <em>Pojos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pojos</em>'.
   * @see org.sqlproc.dsl.processorDsl.Artifacts#getPojos()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_Pojos();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.Artifacts#getTables <em>Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tables</em>'.
   * @see org.sqlproc.dsl.processorDsl.Artifacts#getTables()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_Tables();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.Artifacts#getProcedures <em>Procedures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Procedures</em>'.
   * @see org.sqlproc.dsl.processorDsl.Artifacts#getProcedures()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_Procedures();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.Artifacts#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.sqlproc.dsl.processorDsl.Artifacts#getFunctions()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_Functions();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.Artifacts#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.sqlproc.dsl.processorDsl.Artifacts#getStatements()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_Statements();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.Artifacts#getMappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappings</em>'.
   * @see org.sqlproc.dsl.processorDsl.Artifacts#getMappings()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_Mappings();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.Artifacts#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.sqlproc.dsl.processorDsl.Artifacts#getFeatures()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_Features();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.Artifacts#getPojoPackages <em>Pojo Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pojo Packages</em>'.
   * @see org.sqlproc.dsl.processorDsl.Artifacts#getPojoPackages()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_PojoPackages();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.DatabaseCatalogAssignement <em>Database Catalog Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database Catalog Assignement</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseCatalogAssignement
   * @generated
   */
  EClass getDatabaseCatalogAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DatabaseCatalogAssignement#getDbCatalog <em>Db Catalog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Catalog</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseCatalogAssignement#getDbCatalog()
   * @see #getDatabaseCatalogAssignement()
   * @generated
   */
  EAttribute getDatabaseCatalogAssignement_DbCatalog();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.DatabaseSchemaAssignement <em>Database Schema Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database Schema Assignement</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseSchemaAssignement
   * @generated
   */
  EClass getDatabaseSchemaAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DatabaseSchemaAssignement#getDbSchema <em>Db Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Schema</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseSchemaAssignement#getDbSchema()
   * @see #getDatabaseSchemaAssignement()
   * @generated
   */
  EAttribute getDatabaseSchemaAssignement_DbSchema();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.DatabaseTypeAssignement <em>Database Type Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database Type Assignement</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseTypeAssignement
   * @generated
   */
  EClass getDatabaseTypeAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DatabaseTypeAssignement#getDbType <em>Db Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseTypeAssignement#getDbType()
   * @see #getDatabaseTypeAssignement()
   * @generated
   */
  EAttribute getDatabaseTypeAssignement_DbType();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.DatabaseMetaInfoAssignement <em>Database Meta Info Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database Meta Info Assignement</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseMetaInfoAssignement
   * @generated
   */
  EClass getDatabaseMetaInfoAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DatabaseMetaInfoAssignement#getDbMetaInfo <em>Db Meta Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Meta Info</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseMetaInfoAssignement#getDbMetaInfo()
   * @see #getDatabaseMetaInfoAssignement()
   * @generated
   */
  EAttribute getDatabaseMetaInfoAssignement_DbMetaInfo();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.DriverMetaInfoAssignement <em>Driver Meta Info Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Driver Meta Info Assignement</em>'.
   * @see org.sqlproc.dsl.processorDsl.DriverMetaInfoAssignement
   * @generated
   */
  EClass getDriverMetaInfoAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DriverMetaInfoAssignement#getDbDriverInfo <em>Db Driver Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Driver Info</em>'.
   * @see org.sqlproc.dsl.processorDsl.DriverMetaInfoAssignement#getDbDriverInfo()
   * @see #getDriverMetaInfoAssignement()
   * @generated
   */
  EAttribute getDriverMetaInfoAssignement_DbDriverInfo();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.DriverMethodOutputAssignement <em>Driver Method Output Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Driver Method Output Assignement</em>'.
   * @see org.sqlproc.dsl.processorDsl.DriverMethodOutputAssignement
   * @generated
   */
  EClass getDriverMethodOutputAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DriverMethodOutputAssignement#getDriverMethod <em>Driver Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Driver Method</em>'.
   * @see org.sqlproc.dsl.processorDsl.DriverMethodOutputAssignement#getDriverMethod()
   * @see #getDriverMethodOutputAssignement()
   * @generated
   */
  EAttribute getDriverMethodOutputAssignement_DriverMethod();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DriverMethodOutputAssignement#getCallOutput <em>Call Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Call Output</em>'.
   * @see org.sqlproc.dsl.processorDsl.DriverMethodOutputAssignement#getCallOutput()
   * @see #getDriverMethodOutputAssignement()
   * @generated
   */
  EAttribute getDriverMethodOutputAssignement_CallOutput();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.SqlTypeAssignement <em>Sql Type Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sql Type Assignement</em>'.
   * @see org.sqlproc.dsl.processorDsl.SqlTypeAssignement
   * @generated
   */
  EClass getSqlTypeAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.SqlTypeAssignement#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.SqlTypeAssignement#getTypeName()
   * @see #getSqlTypeAssignement()
   * @generated
   */
  EAttribute getSqlTypeAssignement_TypeName();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.SqlTypeAssignement#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.sqlproc.dsl.processorDsl.SqlTypeAssignement#getSize()
   * @see #getSqlTypeAssignement()
   * @generated
   */
  EAttribute getSqlTypeAssignement_Size();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.SqlTypeAssignement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.SqlTypeAssignement#getType()
   * @see #getSqlTypeAssignement()
   * @generated
   */
  EReference getSqlTypeAssignement_Type();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.ColumnTypeAssignement <em>Column Type Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Type Assignement</em>'.
   * @see org.sqlproc.dsl.processorDsl.ColumnTypeAssignement
   * @generated
   */
  EClass getColumnTypeAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.ColumnTypeAssignement#getDbColumn <em>Db Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Column</em>'.
   * @see org.sqlproc.dsl.processorDsl.ColumnTypeAssignement#getDbColumn()
   * @see #getColumnTypeAssignement()
   * @generated
   */
  EAttribute getColumnTypeAssignement_DbColumn();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.ColumnTypeAssignement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.ColumnTypeAssignement#getType()
   * @see #getColumnTypeAssignement()
   * @generated
   */
  EReference getColumnTypeAssignement_Type();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.ShowColumnTypeAssignement <em>Show Column Type Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Show Column Type Assignement</em>'.
   * @see org.sqlproc.dsl.processorDsl.ShowColumnTypeAssignement
   * @generated
   */
  EClass getShowColumnTypeAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.ShowColumnTypeAssignement#getDbColumn <em>Db Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Column</em>'.
   * @see org.sqlproc.dsl.processorDsl.ShowColumnTypeAssignement#getDbColumn()
   * @see #getShowColumnTypeAssignement()
   * @generated
   */
  EAttribute getShowColumnTypeAssignement_DbColumn();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.ShowColumnTypeAssignement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.ShowColumnTypeAssignement#getType()
   * @see #getShowColumnTypeAssignement()
   * @generated
   */
  EAttribute getShowColumnTypeAssignement_Type();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.TableAssignement <em>Table Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Assignement</em>'.
   * @see org.sqlproc.dsl.processorDsl.TableAssignement
   * @generated
   */
  EClass getTableAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.TableAssignement#getDbTable <em>Db Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Table</em>'.
   * @see org.sqlproc.dsl.processorDsl.TableAssignement#getDbTable()
   * @see #getTableAssignement()
   * @generated
   */
  EAttribute getTableAssignement_DbTable();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.TableAssignement#getNewName <em>New Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.TableAssignement#getNewName()
   * @see #getTableAssignement()
   * @generated
   */
  EAttribute getTableAssignement_NewName();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.JoinTableAssignement <em>Join Table Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join Table Assignement</em>'.
   * @see org.sqlproc.dsl.processorDsl.JoinTableAssignement
   * @generated
   */
  EClass getJoinTableAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.JoinTableAssignement#getDbTable <em>Db Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Table</em>'.
   * @see org.sqlproc.dsl.processorDsl.JoinTableAssignement#getDbTable()
   * @see #getJoinTableAssignement()
   * @generated
   */
  EAttribute getJoinTableAssignement_DbTable();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.JoinTableAssignement#getDbTables <em>Db Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Tables</em>'.
   * @see org.sqlproc.dsl.processorDsl.JoinTableAssignement#getDbTables()
   * @see #getJoinTableAssignement()
   * @generated
   */
  EAttribute getJoinTableAssignement_DbTables();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.ColumnAssignement <em>Column Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Assignement</em>'.
   * @see org.sqlproc.dsl.processorDsl.ColumnAssignement
   * @generated
   */
  EClass getColumnAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.ColumnAssignement#getDbColumn <em>Db Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Column</em>'.
   * @see org.sqlproc.dsl.processorDsl.ColumnAssignement#getDbColumn()
   * @see #getColumnAssignement()
   * @generated
   */
  EAttribute getColumnAssignement_DbColumn();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.ColumnAssignement#getNewName <em>New Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.ColumnAssignement#getNewName()
   * @see #getColumnAssignement()
   * @generated
   */
  EAttribute getColumnAssignement_NewName();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.ImportAssignement <em>Import Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Assignement</em>'.
   * @see org.sqlproc.dsl.processorDsl.ImportAssignement
   * @generated
   */
  EClass getImportAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.ImportAssignement#getDbColumn <em>Db Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Column</em>'.
   * @see org.sqlproc.dsl.processorDsl.ImportAssignement#getDbColumn()
   * @see #getImportAssignement()
   * @generated
   */
  EAttribute getImportAssignement_DbColumn();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.ImportAssignement#getPkTable <em>Pk Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pk Table</em>'.
   * @see org.sqlproc.dsl.processorDsl.ImportAssignement#getPkTable()
   * @see #getImportAssignement()
   * @generated
   */
  EAttribute getImportAssignement_PkTable();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.ImportAssignement#getPkColumn <em>Pk Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pk Column</em>'.
   * @see org.sqlproc.dsl.processorDsl.ImportAssignement#getPkColumn()
   * @see #getImportAssignement()
   * @generated
   */
  EAttribute getImportAssignement_PkColumn();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.ExportAssignement <em>Export Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Export Assignement</em>'.
   * @see org.sqlproc.dsl.processorDsl.ExportAssignement
   * @generated
   */
  EClass getExportAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.ExportAssignement#getDbColumn <em>Db Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Column</em>'.
   * @see org.sqlproc.dsl.processorDsl.ExportAssignement#getDbColumn()
   * @see #getExportAssignement()
   * @generated
   */
  EAttribute getExportAssignement_DbColumn();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.ExportAssignement#getFkTable <em>Fk Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fk Table</em>'.
   * @see org.sqlproc.dsl.processorDsl.ExportAssignement#getFkTable()
   * @see #getExportAssignement()
   * @generated
   */
  EAttribute getExportAssignement_FkTable();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.ExportAssignement#getFkColumn <em>Fk Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fk Column</em>'.
   * @see org.sqlproc.dsl.processorDsl.ExportAssignement#getFkColumn()
   * @see #getExportAssignement()
   * @generated
   */
  EAttribute getExportAssignement_FkColumn();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.InheritanceAssignement <em>Inheritance Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inheritance Assignement</em>'.
   * @see org.sqlproc.dsl.processorDsl.InheritanceAssignement
   * @generated
   */
  EClass getInheritanceAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.InheritanceAssignement#getDiscriminator <em>Discriminator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Discriminator</em>'.
   * @see org.sqlproc.dsl.processorDsl.InheritanceAssignement#getDiscriminator()
   * @see #getInheritanceAssignement()
   * @generated
   */
  EAttribute getInheritanceAssignement_Discriminator();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.InheritanceAssignement#getDbTable <em>Db Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Table</em>'.
   * @see org.sqlproc.dsl.processorDsl.InheritanceAssignement#getDbTable()
   * @see #getInheritanceAssignement()
   * @generated
   */
  EAttribute getInheritanceAssignement_DbTable();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.InheritanceAssignement#getDbColumns <em>Db Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Columns</em>'.
   * @see org.sqlproc.dsl.processorDsl.InheritanceAssignement#getDbColumns()
   * @see #getInheritanceAssignement()
   * @generated
   */
  EAttribute getInheritanceAssignement_DbColumns();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.ManyToManyAssignement <em>Many To Many Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Many To Many Assignement</em>'.
   * @see org.sqlproc.dsl.processorDsl.ManyToManyAssignement
   * @generated
   */
  EClass getManyToManyAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.ManyToManyAssignement#getPkColumn <em>Pk Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pk Column</em>'.
   * @see org.sqlproc.dsl.processorDsl.ManyToManyAssignement#getPkColumn()
   * @see #getManyToManyAssignement()
   * @generated
   */
  EAttribute getManyToManyAssignement_PkColumn();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.ManyToManyAssignement#getPkTable <em>Pk Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pk Table</em>'.
   * @see org.sqlproc.dsl.processorDsl.ManyToManyAssignement#getPkTable()
   * @see #getManyToManyAssignement()
   * @generated
   */
  EAttribute getManyToManyAssignement_PkTable();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.ManyToManyAssignement#getFkColumn <em>Fk Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fk Column</em>'.
   * @see org.sqlproc.dsl.processorDsl.ManyToManyAssignement#getFkColumn()
   * @see #getManyToManyAssignement()
   * @generated
   */
  EAttribute getManyToManyAssignement_FkColumn();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.DebugLevelAssignement <em>Debug Level Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Debug Level Assignement</em>'.
   * @see org.sqlproc.dsl.processorDsl.DebugLevelAssignement
   * @generated
   */
  EClass getDebugLevelAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DebugLevelAssignement#getDebug <em>Debug</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Debug</em>'.
   * @see org.sqlproc.dsl.processorDsl.DebugLevelAssignement#getDebug()
   * @see #getDebugLevelAssignement()
   * @generated
   */
  EAttribute getDebugLevelAssignement_Debug();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.Property#getDatabase <em>Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Database</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getDatabase()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Database();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.Property#getPojogen <em>Pojogen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pojogen</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getPojogen()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Pojogen();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.Property#getMetagen <em>Metagen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Metagen</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getMetagen()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Metagen();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.Property#getDaogen <em>Daogen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Daogen</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getDaogen()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Daogen();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty <em>Database Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database Property</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseProperty
   * @generated
   */
  EClass getDatabaseProperty();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseProperty#getName()
   * @see #getDatabaseProperty()
   * @generated
   */
  EAttribute getDatabaseProperty_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbUrl <em>Db Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Url</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbUrl()
   * @see #getDatabaseProperty()
   * @generated
   */
  EAttribute getDatabaseProperty_DbUrl();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbUsername <em>Db Username</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Username</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbUsername()
   * @see #getDatabaseProperty()
   * @generated
   */
  EAttribute getDatabaseProperty_DbUsername();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbPassword <em>Db Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Password</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbPassword()
   * @see #getDatabaseProperty()
   * @generated
   */
  EAttribute getDatabaseProperty_DbPassword();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbCatalog <em>Db Catalog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db Catalog</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbCatalog()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_DbCatalog();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbSchema <em>Db Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db Schema</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbSchema()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_DbSchema();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbDriver <em>Db Driver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Driver</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbDriver()
   * @see #getDatabaseProperty()
   * @generated
   */
  EAttribute getDatabaseProperty_DbDriver();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbExecuteBefore <em>Db Execute Before</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Execute Before</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbExecuteBefore()
   * @see #getDatabaseProperty()
   * @generated
   */
  EAttribute getDatabaseProperty_DbExecuteBefore();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbExecuteAfter <em>Db Execute After</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Execute After</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbExecuteAfter()
   * @see #getDatabaseProperty()
   * @generated
   */
  EAttribute getDatabaseProperty_DbExecuteAfter();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbIndexTypes <em>Db Index Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Index Types</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbIndexTypes()
   * @see #getDatabaseProperty()
   * @generated
   */
  EAttribute getDatabaseProperty_DbIndexTypes();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbType <em>Db Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbType()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_DbType();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbMetaInfo <em>Db Meta Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db Meta Info</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbMetaInfo()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_DbMetaInfo();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbDriverInfo <em>Db Driver Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Db Driver Info</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbDriverInfo()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_DbDriverInfo();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbMethodsCalls <em>Db Methods Calls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Db Methods Calls</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseProperty#getDbMethodsCalls()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_DbMethodsCalls();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.DatabaseProperty#getDebug <em>Debug</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Debug</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseProperty#getDebug()
   * @see #getDatabaseProperty()
   * @generated
   */
  EReference getDatabaseProperty_Debug();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.PojogenProperty <em>Pojogen Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojogen Property</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty
   * @generated
   */
  EClass getPojogenProperty();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getName()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getSqlTypes <em>Sql Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sql Types</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getSqlTypes()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_SqlTypes();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getDbTable <em>Db Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Table</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getDbTable()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_DbTable();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getColumnTypes <em>Column Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Column Types</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getColumnTypes()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_ColumnTypes();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getColumnType <em>Column Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Column Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getColumnType()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_ColumnType();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getDbTables <em>Db Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Tables</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getDbTables()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_DbTables();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getJoinTables <em>Join Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Join Tables</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getJoinTables()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_JoinTables();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getDbColumns <em>Db Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Columns</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getDbColumns()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_DbColumns();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getTables <em>Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tables</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getTables()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_Tables();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getColumns()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_Columns();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getExports <em>Exports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exports</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getExports()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_Exports();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getImports()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getMany2s <em>Many2s</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Many2s</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getMany2s()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_Many2s();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getDbColumn <em>Db Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Column</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getDbColumn()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_DbColumn();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getInheritance <em>Inheritance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inheritance</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getInheritance()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_Inheritance();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Methods</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getMethods()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_Methods();

  /**
   * Returns the meta object for the reference list '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getToImplements <em>To Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>To Implements</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getToImplements()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_ToImplements();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getToExtends <em>To Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To Extends</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getToExtends()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_ToExtends();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getImplPackage <em>Impl Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Package</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getImplPackage()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_ImplPackage();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getVersion()
   * @see #getPojogenProperty()
   * @generated
   */
  EAttribute getPojogenProperty_Version();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.PojogenProperty#getDebug <em>Debug</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Debug</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojogenProperty#getDebug()
   * @see #getPojogenProperty()
   * @generated
   */
  EReference getPojogenProperty_Debug();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.MetaTypeAssignement <em>Meta Type Assignement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta Type Assignement</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetaTypeAssignement
   * @generated
   */
  EClass getMetaTypeAssignement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MetaTypeAssignement#getDbColumn <em>Db Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Column</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetaTypeAssignement#getDbColumn()
   * @see #getMetaTypeAssignement()
   * @generated
   */
  EAttribute getMetaTypeAssignement_DbColumn();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MetaTypeAssignement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetaTypeAssignement#getType()
   * @see #getMetaTypeAssignement()
   * @generated
   */
  EAttribute getMetaTypeAssignement_Type();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MetaTypeAssignement#getExtension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extension</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetaTypeAssignement#getExtension()
   * @see #getMetaTypeAssignement()
   * @generated
   */
  EAttribute getMetaTypeAssignement_Extension();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.MetagenProperty <em>Metagen Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metagen Property</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetagenProperty
   * @generated
   */
  EClass getMetagenProperty();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MetagenProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetagenProperty#getName()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MetagenProperty#getSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sequence</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetagenProperty#getSequence()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_Sequence();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MetagenProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetagenProperty#getType()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_Type();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MetagenProperty#getDbTable <em>Db Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Table</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetagenProperty#getDbTable()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_DbTable();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MetagenProperty#getIdentity <em>Identity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identity</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetagenProperty#getIdentity()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_Identity();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.MetagenProperty#getMetaTypes <em>Meta Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meta Types</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetagenProperty#getMetaTypes()
   * @see #getMetagenProperty()
   * @generated
   */
  EReference getMetagenProperty_MetaTypes();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MetagenProperty#getDbStatement <em>Db Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Statement</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetagenProperty#getDbStatement()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_DbStatement();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.MetagenProperty#getDbColumns <em>Db Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Columns</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetagenProperty#getDbColumns()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_DbColumns();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MetagenProperty#getDbFunction <em>Db Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Function</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetagenProperty#getDbFunction()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_DbFunction();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MetagenProperty#getDbProcedure <em>Db Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Procedure</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetagenProperty#getDbProcedure()
   * @see #getMetagenProperty()
   * @generated
   */
  EAttribute getMetagenProperty_DbProcedure();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.MetagenProperty#getDebug <em>Debug</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Debug</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetagenProperty#getDebug()
   * @see #getMetagenProperty()
   * @generated
   */
  EReference getMetagenProperty_Debug();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.DaogenProperty <em>Daogen Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Daogen Property</em>'.
   * @see org.sqlproc.dsl.processorDsl.DaogenProperty
   * @generated
   */
  EClass getDaogenProperty();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DaogenProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.DaogenProperty#getName()
   * @see #getDaogenProperty()
   * @generated
   */
  EAttribute getDaogenProperty_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.DaogenProperty#getDbTables <em>Db Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Tables</em>'.
   * @see org.sqlproc.dsl.processorDsl.DaogenProperty#getDbTables()
   * @see #getDaogenProperty()
   * @generated
   */
  EAttribute getDaogenProperty_DbTables();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DaogenProperty#getImplPackage <em>Impl Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Impl Package</em>'.
   * @see org.sqlproc.dsl.processorDsl.DaogenProperty#getImplPackage()
   * @see #getDaogenProperty()
   * @generated
   */
  EAttribute getDaogenProperty_ImplPackage();

  /**
   * Returns the meta object for the reference list '{@link org.sqlproc.dsl.processorDsl.DaogenProperty#getToImplements <em>To Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>To Implements</em>'.
   * @see org.sqlproc.dsl.processorDsl.DaogenProperty#getToImplements()
   * @see #getDaogenProperty()
   * @generated
   */
  EReference getDaogenProperty_ToImplements();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.DaogenProperty#getToExtends <em>To Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To Extends</em>'.
   * @see org.sqlproc.dsl.processorDsl.DaogenProperty#getToExtends()
   * @see #getDaogenProperty()
   * @generated
   */
  EReference getDaogenProperty_ToExtends();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DaogenProperty#getDbFunction <em>Db Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Function</em>'.
   * @see org.sqlproc.dsl.processorDsl.DaogenProperty#getDbFunction()
   * @see #getDaogenProperty()
   * @generated
   */
  EAttribute getDaogenProperty_DbFunction();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.DaogenProperty#getResultType <em>Result Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.DaogenProperty#getResultType()
   * @see #getDaogenProperty()
   * @generated
   */
  EReference getDaogenProperty_ResultType();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.DaogenProperty#getDebug <em>Debug</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Debug</em>'.
   * @see org.sqlproc.dsl.processorDsl.DaogenProperty#getDebug()
   * @see #getDaogenProperty()
   * @generated
   */
  EReference getDaogenProperty_Debug();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.PojoDefinition <em>Pojo Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Definition</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoDefinition
   * @generated
   */
  EClass getPojoDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoDefinition#getName()
   * @see #getPojoDefinition()
   * @generated
   */
  EAttribute getPojoDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoDefinition#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoDefinition#getClass_()
   * @see #getPojoDefinition()
   * @generated
   */
  EAttribute getPojoDefinition_Class();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.TableDefinition <em>Table Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Definition</em>'.
   * @see org.sqlproc.dsl.processorDsl.TableDefinition
   * @generated
   */
  EClass getTableDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.TableDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.TableDefinition#getName()
   * @see #getTableDefinition()
   * @generated
   */
  EAttribute getTableDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.TableDefinition#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table</em>'.
   * @see org.sqlproc.dsl.processorDsl.TableDefinition#getTable()
   * @see #getTableDefinition()
   * @generated
   */
  EAttribute getTableDefinition_Table();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.ProcedureDefinition <em>Procedure Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Definition</em>'.
   * @see org.sqlproc.dsl.processorDsl.ProcedureDefinition
   * @generated
   */
  EClass getProcedureDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.ProcedureDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.ProcedureDefinition#getName()
   * @see #getProcedureDefinition()
   * @generated
   */
  EAttribute getProcedureDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.ProcedureDefinition#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table</em>'.
   * @see org.sqlproc.dsl.processorDsl.ProcedureDefinition#getTable()
   * @see #getProcedureDefinition()
   * @generated
   */
  EAttribute getProcedureDefinition_Table();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.FunctionDefinition <em>Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Definition</em>'.
   * @see org.sqlproc.dsl.processorDsl.FunctionDefinition
   * @generated
   */
  EClass getFunctionDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.FunctionDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.FunctionDefinition#getName()
   * @see #getFunctionDefinition()
   * @generated
   */
  EAttribute getFunctionDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.FunctionDefinition#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table</em>'.
   * @see org.sqlproc.dsl.processorDsl.FunctionDefinition#getTable()
   * @see #getFunctionDefinition()
   * @generated
   */
  EAttribute getFunctionDefinition_Table();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.MetaStatement <em>Meta Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta Statement</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetaStatement
   * @generated
   */
  EClass getMetaStatement();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MetaStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetaStatement#getName()
   * @see #getMetaStatement()
   * @generated
   */
  EAttribute getMetaStatement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MetaStatement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetaStatement#getType()
   * @see #getMetaStatement()
   * @generated
   */
  EAttribute getMetaStatement_Type();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.MetaStatement#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetaStatement#getModifiers()
   * @see #getMetaStatement()
   * @generated
   */
  EAttribute getMetaStatement_Modifiers();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.MetaStatement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetaStatement#getStatement()
   * @see #getMetaStatement()
   * @generated
   */
  EReference getMetaStatement_Statement();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.Sql <em>Sql</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sql</em>'.
   * @see org.sqlproc.dsl.processorDsl.Sql
   * @generated
   */
  EClass getSql();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.Sql#getSqls <em>Sqls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sqls</em>'.
   * @see org.sqlproc.dsl.processorDsl.Sql#getSqls()
   * @see #getSql()
   * @generated
   */
  EReference getSql_Sqls();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.SqlFragment <em>Sql Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sql Fragment</em>'.
   * @see org.sqlproc.dsl.processorDsl.SqlFragment
   * @generated
   */
  EClass getSqlFragment();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.SqlFragment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.sqlproc.dsl.processorDsl.SqlFragment#getValue()
   * @see #getSqlFragment()
   * @generated
   */
  EAttribute getSqlFragment_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.SqlFragment#getCol <em>Col</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Col</em>'.
   * @see org.sqlproc.dsl.processorDsl.SqlFragment#getCol()
   * @see #getSqlFragment()
   * @generated
   */
  EReference getSqlFragment_Col();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.SqlFragment#getCnst <em>Cnst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cnst</em>'.
   * @see org.sqlproc.dsl.processorDsl.SqlFragment#getCnst()
   * @see #getSqlFragment()
   * @generated
   */
  EReference getSqlFragment_Cnst();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.SqlFragment#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ident</em>'.
   * @see org.sqlproc.dsl.processorDsl.SqlFragment#getIdent()
   * @see #getSqlFragment()
   * @generated
   */
  EReference getSqlFragment_Ident();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.SqlFragment#getMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Meta</em>'.
   * @see org.sqlproc.dsl.processorDsl.SqlFragment#getMeta()
   * @see #getSqlFragment()
   * @generated
   */
  EReference getSqlFragment_Meta();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.SqlFragment#getDbtab <em>Dbtab</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dbtab</em>'.
   * @see org.sqlproc.dsl.processorDsl.SqlFragment#getDbtab()
   * @see #getSqlFragment()
   * @generated
   */
  EReference getSqlFragment_Dbtab();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.SqlFragment#getDbcol <em>Dbcol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dbcol</em>'.
   * @see org.sqlproc.dsl.processorDsl.SqlFragment#getDbcol()
   * @see #getSqlFragment()
   * @generated
   */
  EReference getSqlFragment_Dbcol();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.MetaSql <em>Meta Sql</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta Sql</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetaSql
   * @generated
   */
  EClass getMetaSql();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.MetaSql#getIfs <em>Ifs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ifs</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetaSql#getIfs()
   * @see #getMetaSql()
   * @generated
   */
  EReference getMetaSql_Ifs();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MetaSql#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetaSql#getType()
   * @see #getMetaSql()
   * @generated
   */
  EAttribute getMetaSql_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.MetaSql#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetaSql#getCond()
   * @see #getMetaSql()
   * @generated
   */
  EReference getMetaSql_Cond();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MetaSql#getFtype <em>Ftype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ftype</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetaSql#getFtype()
   * @see #getMetaSql()
   * @generated
   */
  EAttribute getMetaSql_Ftype();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.MetaSql#getOrd <em>Ord</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ord</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetaSql#getOrd()
   * @see #getMetaSql()
   * @generated
   */
  EReference getMetaSql_Ord();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.IfSql <em>If Sql</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Sql</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfSql
   * @generated
   */
  EClass getIfSql();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.IfSql#getSqls <em>Sqls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sqls</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfSql#getSqls()
   * @see #getIfSql()
   * @generated
   */
  EReference getIfSql_Sqls();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.IfSqlFragment <em>If Sql Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Sql Fragment</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfSqlFragment
   * @generated
   */
  EClass getIfSqlFragment();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.IfSqlFragment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfSqlFragment#getValue()
   * @see #getIfSqlFragment()
   * @generated
   */
  EAttribute getIfSqlFragment_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.IfSqlFragment#getCol <em>Col</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Col</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfSqlFragment#getCol()
   * @see #getIfSqlFragment()
   * @generated
   */
  EReference getIfSqlFragment_Col();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.IfSqlFragment#getCnst <em>Cnst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cnst</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfSqlFragment#getCnst()
   * @see #getIfSqlFragment()
   * @generated
   */
  EReference getIfSqlFragment_Cnst();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.IfSqlFragment#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ident</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfSqlFragment#getIdent()
   * @see #getIfSqlFragment()
   * @generated
   */
  EReference getIfSqlFragment_Ident();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.IfSqlFragment#getDbtab <em>Dbtab</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dbtab</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfSqlFragment#getDbtab()
   * @see #getIfSqlFragment()
   * @generated
   */
  EReference getIfSqlFragment_Dbtab();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.IfSqlFragment#getDbcol <em>Dbcol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dbcol</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfSqlFragment#getDbcol()
   * @see #getIfSqlFragment()
   * @generated
   */
  EReference getIfSqlFragment_Dbcol();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.IfSqlFragment#getMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Meta</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfSqlFragment#getMeta()
   * @see #getIfSqlFragment()
   * @generated
   */
  EReference getIfSqlFragment_Meta();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.IfMetaSql <em>If Meta Sql</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Meta Sql</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfMetaSql
   * @generated
   */
  EClass getIfMetaSql();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.IfMetaSql#getIfs <em>Ifs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ifs</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfMetaSql#getIfs()
   * @see #getIfMetaSql()
   * @generated
   */
  EReference getIfMetaSql_Ifs();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.IfMetaSql#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfMetaSql#getType()
   * @see #getIfMetaSql()
   * @generated
   */
  EAttribute getIfMetaSql_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.IfMetaSql#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfMetaSql#getCond()
   * @see #getIfMetaSql()
   * @generated
   */
  EReference getIfMetaSql_Cond();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.IfSqlCond <em>If Sql Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Sql Cond</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfSqlCond
   * @generated
   */
  EClass getIfSqlCond();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.IfSqlCond#getBool1 <em>Bool1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bool1</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfSqlCond#getBool1()
   * @see #getIfSqlCond()
   * @generated
   */
  EReference getIfSqlCond_Bool1();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.IfSqlCond#getOper <em>Oper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Oper</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfSqlCond#getOper()
   * @see #getIfSqlCond()
   * @generated
   */
  EAttribute getIfSqlCond_Oper();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.IfSqlCond#getBool2 <em>Bool2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bool2</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfSqlCond#getBool2()
   * @see #getIfSqlCond()
   * @generated
   */
  EReference getIfSqlCond_Bool2();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.IfSqlBool <em>If Sql Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Sql Bool</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfSqlBool
   * @generated
   */
  EClass getIfSqlBool();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.IfSqlBool#isNot <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfSqlBool#isNot()
   * @see #getIfSqlBool()
   * @generated
   */
  EAttribute getIfSqlBool_Not();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.IfSqlBool#getCnst <em>Cnst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cnst</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfSqlBool#getCnst()
   * @see #getIfSqlBool()
   * @generated
   */
  EReference getIfSqlBool_Cnst();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.IfSqlBool#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ident</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfSqlBool#getIdent()
   * @see #getIfSqlBool()
   * @generated
   */
  EReference getIfSqlBool_Ident();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.IfSqlBool#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see org.sqlproc.dsl.processorDsl.IfSqlBool#getCond()
   * @see #getIfSqlBool()
   * @generated
   */
  EReference getIfSqlBool_Cond();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.OrdSql <em>Ord Sql</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ord Sql</em>'.
   * @see org.sqlproc.dsl.processorDsl.OrdSql
   * @generated
   */
  EClass getOrdSql();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.OrdSql#getSqls <em>Sqls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sqls</em>'.
   * @see org.sqlproc.dsl.processorDsl.OrdSql#getSqls()
   * @see #getOrdSql()
   * @generated
   */
  EReference getOrdSql_Sqls();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.OrdSql2 <em>Ord Sql2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ord Sql2</em>'.
   * @see org.sqlproc.dsl.processorDsl.OrdSql2
   * @generated
   */
  EClass getOrdSql2();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.OrdSql2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.sqlproc.dsl.processorDsl.OrdSql2#getValue()
   * @see #getOrdSql2()
   * @generated
   */
  EAttribute getOrdSql2_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.OrdSql2#getCnst <em>Cnst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cnst</em>'.
   * @see org.sqlproc.dsl.processorDsl.OrdSql2#getCnst()
   * @see #getOrdSql2()
   * @generated
   */
  EReference getOrdSql2_Cnst();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.OrdSql2#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ident</em>'.
   * @see org.sqlproc.dsl.processorDsl.OrdSql2#getIdent()
   * @see #getOrdSql2()
   * @generated
   */
  EReference getOrdSql2_Ident();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.OrdSql2#getDbcol <em>Dbcol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dbcol</em>'.
   * @see org.sqlproc.dsl.processorDsl.OrdSql2#getDbcol()
   * @see #getOrdSql2()
   * @generated
   */
  EReference getOrdSql2_Dbcol();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column</em>'.
   * @see org.sqlproc.dsl.processorDsl.Column
   * @generated
   */
  EClass getColumn();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.Column#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see org.sqlproc.dsl.processorDsl.Column#getColumns()
   * @see #getColumn()
   * @generated
   */
  EReference getColumn_Columns();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.ExtendedColumn <em>Extended Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extended Column</em>'.
   * @see org.sqlproc.dsl.processorDsl.ExtendedColumn
   * @generated
   */
  EClass getExtendedColumn();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.ExtendedColumn#getCol <em>Col</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Col</em>'.
   * @see org.sqlproc.dsl.processorDsl.ExtendedColumn#getCol()
   * @see #getExtendedColumn()
   * @generated
   */
  EReference getExtendedColumn_Col();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.ExtendedColumn#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers</em>'.
   * @see org.sqlproc.dsl.processorDsl.ExtendedColumn#getModifiers()
   * @see #getExtendedColumn()
   * @generated
   */
  EAttribute getExtendedColumn_Modifiers();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.ExtendedColumnName <em>Extended Column Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extended Column Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.ExtendedColumnName
   * @generated
   */
  EClass getExtendedColumnName();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.ExtendedColumnName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.ExtendedColumnName#getName()
   * @see #getExtendedColumnName()
   * @generated
   */
  EAttribute getExtendedColumnName_Name();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see org.sqlproc.dsl.processorDsl.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.Constant#getCase <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Case</em>'.
   * @see org.sqlproc.dsl.processorDsl.Constant#getCase()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Case();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.Constant#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.Constant#getName()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.Constant#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers</em>'.
   * @see org.sqlproc.dsl.processorDsl.Constant#getModifiers()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Modifiers();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.Identifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifier</em>'.
   * @see org.sqlproc.dsl.processorDsl.Identifier
   * @generated
   */
  EClass getIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.Identifier#getMode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mode</em>'.
   * @see org.sqlproc.dsl.processorDsl.Identifier#getMode()
   * @see #getIdentifier()
   * @generated
   */
  EAttribute getIdentifier_Mode();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.Identifier#getCase <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Case</em>'.
   * @see org.sqlproc.dsl.processorDsl.Identifier#getCase()
   * @see #getIdentifier()
   * @generated
   */
  EAttribute getIdentifier_Case();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.Identifier#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.Identifier#getName()
   * @see #getIdentifier()
   * @generated
   */
  EAttribute getIdentifier_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.Identifier#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers</em>'.
   * @see org.sqlproc.dsl.processorDsl.Identifier#getModifiers()
   * @see #getIdentifier()
   * @generated
   */
  EAttribute getIdentifier_Modifiers();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.DatabaseColumn <em>Database Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database Column</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseColumn
   * @generated
   */
  EClass getDatabaseColumn();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DatabaseColumn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseColumn#getName()
   * @see #getDatabaseColumn()
   * @generated
   */
  EAttribute getDatabaseColumn_Name();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.DatabaseTable <em>Database Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database Table</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseTable
   * @generated
   */
  EClass getDatabaseTable();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.DatabaseTable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.DatabaseTable#getName()
   * @see #getDatabaseTable()
   * @generated
   */
  EAttribute getDatabaseTable_Name();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.MappingRule <em>Mapping Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Rule</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingRule
   * @generated
   */
  EClass getMappingRule();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MappingRule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingRule#getName()
   * @see #getMappingRule()
   * @generated
   */
  EAttribute getMappingRule_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MappingRule#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingRule#getType()
   * @see #getMappingRule()
   * @generated
   */
  EAttribute getMappingRule_Type();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.MappingRule#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingRule#getModifiers()
   * @see #getMappingRule()
   * @generated
   */
  EAttribute getMappingRule_Modifiers();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.MappingRule#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingRule#getMapping()
   * @see #getMappingRule()
   * @generated
   */
  EReference getMappingRule_Mapping();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping</em>'.
   * @see org.sqlproc.dsl.processorDsl.Mapping
   * @generated
   */
  EClass getMapping();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.Mapping#getMappingItems <em>Mapping Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mapping Items</em>'.
   * @see org.sqlproc.dsl.processorDsl.Mapping#getMappingItems()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_MappingItems();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.MappingItem <em>Mapping Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Item</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingItem
   * @generated
   */
  EClass getMappingItem();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MappingItem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingItem#getName()
   * @see #getMappingItem()
   * @generated
   */
  EAttribute getMappingItem_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.MappingItem#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingItem#getAttr()
   * @see #getMappingItem()
   * @generated
   */
  EReference getMappingItem_Attr();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.MappingColumn <em>Mapping Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Column</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingColumn
   * @generated
   */
  EClass getMappingColumn();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.MappingColumn#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingColumn#getItems()
   * @see #getMappingColumn()
   * @generated
   */
  EReference getMappingColumn_Items();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.ExtendedMappingItem <em>Extended Mapping Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extended Mapping Item</em>'.
   * @see org.sqlproc.dsl.processorDsl.ExtendedMappingItem
   * @generated
   */
  EClass getExtendedMappingItem();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.ExtendedMappingItem#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see org.sqlproc.dsl.processorDsl.ExtendedMappingItem#getAttr()
   * @see #getExtendedMappingItem()
   * @generated
   */
  EReference getExtendedMappingItem_Attr();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.ExtendedMappingItem#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers</em>'.
   * @see org.sqlproc.dsl.processorDsl.ExtendedMappingItem#getModifiers()
   * @see #getExtendedMappingItem()
   * @generated
   */
  EAttribute getExtendedMappingItem_Modifiers();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.MappingColumnName <em>Mapping Column Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Column Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingColumnName
   * @generated
   */
  EClass getMappingColumnName();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MappingColumnName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingColumnName#getName()
   * @see #getMappingColumnName()
   * @generated
   */
  EAttribute getMappingColumnName_Name();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.OptionalFeature <em>Optional Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optional Feature</em>'.
   * @see org.sqlproc.dsl.processorDsl.OptionalFeature
   * @generated
   */
  EClass getOptionalFeature();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.OptionalFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.OptionalFeature#getName()
   * @see #getOptionalFeature()
   * @generated
   */
  EAttribute getOptionalFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.OptionalFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.OptionalFeature#getType()
   * @see #getOptionalFeature()
   * @generated
   */
  EAttribute getOptionalFeature_Type();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.OptionalFeature#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers</em>'.
   * @see org.sqlproc.dsl.processorDsl.OptionalFeature#getModifiers()
   * @see #getOptionalFeature()
   * @generated
   */
  EAttribute getOptionalFeature_Modifiers();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.OptionalFeature#getOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Option</em>'.
   * @see org.sqlproc.dsl.processorDsl.OptionalFeature#getOption()
   * @see #getOptionalFeature()
   * @generated
   */
  EAttribute getOptionalFeature_Option();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.PojoType <em>Pojo Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoType
   * @generated
   */
  EClass getPojoType();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoType#getNative <em>Native</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Native</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoType#getNative()
   * @see #getPojoType()
   * @generated
   */
  EAttribute getPojoType_Native();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.PojoType#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoType#getRef()
   * @see #getPojoType()
   * @generated
   */
  EReference getPojoType_Ref();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.PojoType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoType#getType()
   * @see #getPojoType()
   * @generated
   */
  EReference getPojoType_Type();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.PojoType#getGref <em>Gref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Gref</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoType#getGref()
   * @see #getPojoType()
   * @generated
   */
  EReference getPojoType_Gref();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.PojoType#getGtype <em>Gtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Gtype</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoType#getGtype()
   * @see #getPojoType()
   * @generated
   */
  EReference getPojoType_Gtype();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoType#isArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Array</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoType#isArray()
   * @see #getPojoType()
   * @generated
   */
  EAttribute getPojoType_Array();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see org.sqlproc.dsl.processorDsl.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PackageDeclaration#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Suffix</em>'.
   * @see org.sqlproc.dsl.processorDsl.PackageDeclaration#getSuffix()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Suffix();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.PackageDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.sqlproc.dsl.processorDsl.PackageDeclaration#getElements()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Elements();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.AbstractPojoEntity <em>Abstract Pojo Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Pojo Entity</em>'.
   * @see org.sqlproc.dsl.processorDsl.AbstractPojoEntity
   * @generated
   */
  EClass getAbstractPojoEntity();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.sqlproc.dsl.processorDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.sqlproc.dsl.processorDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.Implements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implements</em>'.
   * @see org.sqlproc.dsl.processorDsl.Implements
   * @generated
   */
  EClass getImplements();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.Implements#getImplements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Implements</em>'.
   * @see org.sqlproc.dsl.processorDsl.Implements#getImplements()
   * @see #getImplements()
   * @generated
   */
  EReference getImplements_Implements();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.Extends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extends</em>'.
   * @see org.sqlproc.dsl.processorDsl.Extends
   * @generated
   */
  EClass getExtends();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.Extends#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extends</em>'.
   * @see org.sqlproc.dsl.processorDsl.Extends#getExtends()
   * @see #getExtends()
   * @generated
   */
  EReference getExtends_Extends();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.ImplPackage <em>Impl Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Impl Package</em>'.
   * @see org.sqlproc.dsl.processorDsl.ImplPackage
   * @generated
   */
  EClass getImplPackage();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.ImplPackage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.ImplPackage#getName()
   * @see #getImplPackage()
   * @generated
   */
  EAttribute getImplPackage_Name();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.PojoEntityModifier1 <em>Pojo Entity Modifier1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Entity Modifier1</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoEntityModifier1
   * @generated
   */
  EClass getPojoEntityModifier1();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoEntityModifier1#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoEntityModifier1#isFinal()
   * @see #getPojoEntityModifier1()
   * @generated
   */
  EAttribute getPojoEntityModifier1_Final();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoEntityModifier1#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoEntityModifier1#isAbstract()
   * @see #getPojoEntityModifier1()
   * @generated
   */
  EAttribute getPojoEntityModifier1_Abstract();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.PojoEntityModifier2 <em>Pojo Entity Modifier2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Entity Modifier2</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoEntityModifier2
   * @generated
   */
  EClass getPojoEntityModifier2();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.PojoEntityModifier2#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoEntityModifier2#getSuperType()
   * @see #getPojoEntityModifier2()
   * @generated
   */
  EReference getPojoEntityModifier2_SuperType();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoEntityModifier2#getDiscriminator <em>Discriminator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Discriminator</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoEntityModifier2#getDiscriminator()
   * @see #getPojoEntityModifier2()
   * @generated
   */
  EAttribute getPojoEntityModifier2_Discriminator();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoEntityModifier2#getSernum <em>Sernum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sernum</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoEntityModifier2#getSernum()
   * @see #getPojoEntityModifier2()
   * @generated
   */
  EAttribute getPojoEntityModifier2_Sernum();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.PojoEntity <em>Pojo Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Entity</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoEntity
   * @generated
   */
  EClass getPojoEntity();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.PojoEntity#getModifiers1 <em>Modifiers1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modifiers1</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoEntity#getModifiers1()
   * @see #getPojoEntity()
   * @generated
   */
  EReference getPojoEntity_Modifiers1();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoEntity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoEntity#getName()
   * @see #getPojoEntity()
   * @generated
   */
  EAttribute getPojoEntity_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.PojoEntity#getModifiers2 <em>Modifiers2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modifiers2</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoEntity#getModifiers2()
   * @see #getPojoEntity()
   * @generated
   */
  EReference getPojoEntity_Modifiers2();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.PojoEntity#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoEntity#getFeatures()
   * @see #getPojoEntity()
   * @generated
   */
  EReference getPojoEntity_Features();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.PojoPropertyModifier <em>Pojo Property Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Property Modifier</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoPropertyModifier
   * @generated
   */
  EClass getPojoPropertyModifier();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoPropertyModifier#isRequired <em>Required</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Required</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoPropertyModifier#isRequired()
   * @see #getPojoPropertyModifier()
   * @generated
   */
  EAttribute getPojoPropertyModifier_Required();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoPropertyModifier#isDiscriminator <em>Discriminator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Discriminator</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoPropertyModifier#isDiscriminator()
   * @see #getPojoPropertyModifier()
   * @generated
   */
  EAttribute getPojoPropertyModifier_Discriminator();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoPropertyModifier#isPrimaryKey <em>Primary Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Primary Key</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoPropertyModifier#isPrimaryKey()
   * @see #getPojoPropertyModifier()
   * @generated
   */
  EAttribute getPojoPropertyModifier_PrimaryKey();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoPropertyModifier#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoPropertyModifier#getIndex()
   * @see #getPojoPropertyModifier()
   * @generated
   */
  EAttribute getPojoPropertyModifier_Index();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoPropertyModifier#isVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoPropertyModifier#isVersion()
   * @see #getPojoPropertyModifier()
   * @generated
   */
  EAttribute getPojoPropertyModifier_Version();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.PojoProperty <em>Pojo Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Property</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoProperty
   * @generated
   */
  EClass getPojoProperty();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoProperty#getName()
   * @see #getPojoProperty()
   * @generated
   */
  EAttribute getPojoProperty_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoProperty#getNative <em>Native</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Native</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoProperty#getNative()
   * @see #getPojoProperty()
   * @generated
   */
  EAttribute getPojoProperty_Native();

  /**
   * Returns the meta object for the reference list '{@link org.sqlproc.dsl.processorDsl.PojoProperty#getAttrs <em>Attrs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Attrs</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoProperty#getAttrs()
   * @see #getPojoProperty()
   * @generated
   */
  EReference getPojoProperty_Attrs();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.PojoProperty#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoProperty#getRef()
   * @see #getPojoProperty()
   * @generated
   */
  EReference getPojoProperty_Ref();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.PojoProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoProperty#getType()
   * @see #getPojoProperty()
   * @generated
   */
  EReference getPojoProperty_Type();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.PojoProperty#getGref <em>Gref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Gref</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoProperty#getGref()
   * @see #getPojoProperty()
   * @generated
   */
  EReference getPojoProperty_Gref();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.PojoProperty#getGtype <em>Gtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Gtype</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoProperty#getGtype()
   * @see #getPojoProperty()
   * @generated
   */
  EReference getPojoProperty_Gtype();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoProperty#isArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Array</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoProperty#isArray()
   * @see #getPojoProperty()
   * @generated
   */
  EAttribute getPojoProperty_Array();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.PojoProperty#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modifiers</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoProperty#getModifiers()
   * @see #getPojoProperty()
   * @generated
   */
  EReference getPojoProperty_Modifiers();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.PojoDaoModifier <em>Pojo Dao Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Dao Modifier</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoDaoModifier
   * @generated
   */
  EClass getPojoDaoModifier();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.PojoDaoModifier#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoDaoModifier#getSuperType()
   * @see #getPojoDaoModifier()
   * @generated
   */
  EReference getPojoDaoModifier_SuperType();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoDaoModifier#getSernum <em>Sernum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sernum</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoDaoModifier#getSernum()
   * @see #getPojoDaoModifier()
   * @generated
   */
  EAttribute getPojoDaoModifier_Sernum();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.PojoDao <em>Pojo Dao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Dao</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoDao
   * @generated
   */
  EClass getPojoDao();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.PojoDao#getModifiers1 <em>Modifiers1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modifiers1</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoDao#getModifiers1()
   * @see #getPojoDao()
   * @generated
   */
  EReference getPojoDao_Modifiers1();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoDao#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoDao#getName()
   * @see #getPojoDao()
   * @generated
   */
  EAttribute getPojoDao_Name();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.PojoDao#getPojo <em>Pojo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pojo</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoDao#getPojo()
   * @see #getPojoDao()
   * @generated
   */
  EReference getPojoDao_Pojo();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.PojoDao#getModifiers2 <em>Modifiers2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modifiers2</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoDao#getModifiers2()
   * @see #getPojoDao()
   * @generated
   */
  EReference getPojoDao_Modifiers2();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.PojoDao#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoDao#getMethods()
   * @see #getPojoDao()
   * @generated
   */
  EReference getPojoDao_Methods();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.PojoDao#getToInits <em>To Inits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>To Inits</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoDao#getToInits()
   * @see #getPojoDao()
   * @generated
   */
  EReference getPojoDao_ToInits();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.PojoMethodModifier <em>Pojo Method Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Method Modifier</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoMethodModifier
   * @generated
   */
  EClass getPojoMethodModifier();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoMethodModifier#isCallFunction <em>Call Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Call Function</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoMethodModifier#isCallFunction()
   * @see #getPojoMethodModifier()
   * @generated
   */
  EAttribute getPojoMethodModifier_CallFunction();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoMethodModifier#isCallUpdate <em>Call Update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Call Update</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoMethodModifier#isCallUpdate()
   * @see #getPojoMethodModifier()
   * @generated
   */
  EAttribute getPojoMethodModifier_CallUpdate();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoMethodModifier#isCallQuery <em>Call Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Call Query</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoMethodModifier#isCallQuery()
   * @see #getPojoMethodModifier()
   * @generated
   */
  EAttribute getPojoMethodModifier_CallQuery();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoMethodModifier#isCallQueryFunction <em>Call Query Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Call Query Function</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoMethodModifier#isCallQueryFunction()
   * @see #getPojoMethodModifier()
   * @generated
   */
  EAttribute getPojoMethodModifier_CallQueryFunction();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoMethodModifier#isCallSelectFunction <em>Call Select Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Call Select Function</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoMethodModifier#isCallSelectFunction()
   * @see #getPojoMethodModifier()
   * @generated
   */
  EAttribute getPojoMethodModifier_CallSelectFunction();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.PojoMethod <em>Pojo Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Method</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoMethod
   * @generated
   */
  EClass getPojoMethod();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.PojoMethod#getModifiers1 <em>Modifiers1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modifiers1</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoMethod#getModifiers1()
   * @see #getPojoMethod()
   * @generated
   */
  EReference getPojoMethod_Modifiers1();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoMethod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoMethod#getName()
   * @see #getPojoMethod()
   * @generated
   */
  EAttribute getPojoMethod_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.PojoMethod#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoMethod#getType()
   * @see #getPojoMethod()
   * @generated
   */
  EReference getPojoMethod_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.PojoMethod#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoMethod#getArgs()
   * @see #getPojoMethod()
   * @generated
   */
  EReference getPojoMethod_Args();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.ToInitMethod <em>To Init Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>To Init Method</em>'.
   * @see org.sqlproc.dsl.processorDsl.ToInitMethod
   * @generated
   */
  EClass getToInitMethod();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.ToInitMethod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.ToInitMethod#getName()
   * @see #getToInitMethod()
   * @generated
   */
  EAttribute getToInitMethod_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.ToInitMethod#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.sqlproc.dsl.processorDsl.ToInitMethod#getArgs()
   * @see #getToInitMethod()
   * @generated
   */
  EReference getToInitMethod_Args();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.PojoMethodArg <em>Pojo Method Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Method Arg</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoMethodArg
   * @generated
   */
  EClass getPojoMethodArg();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoMethodArg#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoMethodArg#getName()
   * @see #getPojoMethodArg()
   * @generated
   */
  EAttribute getPojoMethodArg_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.sqlproc.dsl.processorDsl.PojoMethodArg#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoMethodArg#getType()
   * @see #getPojoMethodArg()
   * @generated
   */
  EReference getPojoMethodArg_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ProcessorDslFactory getProcessorDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ArtifactsImpl <em>Artifacts</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ArtifactsImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getArtifacts()
     * @generated
     */
    EClass ARTIFACTS = eINSTANCE.getArtifacts();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__PROPERTIES = eINSTANCE.getArtifacts_Properties();

    /**
     * The meta object literal for the '<em><b>Pojos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__POJOS = eINSTANCE.getArtifacts_Pojos();

    /**
     * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__TABLES = eINSTANCE.getArtifacts_Tables();

    /**
     * The meta object literal for the '<em><b>Procedures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__PROCEDURES = eINSTANCE.getArtifacts_Procedures();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__FUNCTIONS = eINSTANCE.getArtifacts_Functions();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__STATEMENTS = eINSTANCE.getArtifacts_Statements();

    /**
     * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__MAPPINGS = eINSTANCE.getArtifacts_Mappings();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__FEATURES = eINSTANCE.getArtifacts_Features();

    /**
     * The meta object literal for the '<em><b>Pojo Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__POJO_PACKAGES = eINSTANCE.getArtifacts_PojoPackages();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.DatabaseCatalogAssignementImpl <em>Database Catalog Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.DatabaseCatalogAssignementImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDatabaseCatalogAssignement()
     * @generated
     */
    EClass DATABASE_CATALOG_ASSIGNEMENT = eINSTANCE.getDatabaseCatalogAssignement();

    /**
     * The meta object literal for the '<em><b>Db Catalog</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_CATALOG_ASSIGNEMENT__DB_CATALOG = eINSTANCE.getDatabaseCatalogAssignement_DbCatalog();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.DatabaseSchemaAssignementImpl <em>Database Schema Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.DatabaseSchemaAssignementImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDatabaseSchemaAssignement()
     * @generated
     */
    EClass DATABASE_SCHEMA_ASSIGNEMENT = eINSTANCE.getDatabaseSchemaAssignement();

    /**
     * The meta object literal for the '<em><b>Db Schema</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_SCHEMA_ASSIGNEMENT__DB_SCHEMA = eINSTANCE.getDatabaseSchemaAssignement_DbSchema();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.DatabaseTypeAssignementImpl <em>Database Type Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.DatabaseTypeAssignementImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDatabaseTypeAssignement()
     * @generated
     */
    EClass DATABASE_TYPE_ASSIGNEMENT = eINSTANCE.getDatabaseTypeAssignement();

    /**
     * The meta object literal for the '<em><b>Db Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_TYPE_ASSIGNEMENT__DB_TYPE = eINSTANCE.getDatabaseTypeAssignement_DbType();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.DatabaseMetaInfoAssignementImpl <em>Database Meta Info Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.DatabaseMetaInfoAssignementImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDatabaseMetaInfoAssignement()
     * @generated
     */
    EClass DATABASE_META_INFO_ASSIGNEMENT = eINSTANCE.getDatabaseMetaInfoAssignement();

    /**
     * The meta object literal for the '<em><b>Db Meta Info</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_META_INFO_ASSIGNEMENT__DB_META_INFO = eINSTANCE.getDatabaseMetaInfoAssignement_DbMetaInfo();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.DriverMetaInfoAssignementImpl <em>Driver Meta Info Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.DriverMetaInfoAssignementImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDriverMetaInfoAssignement()
     * @generated
     */
    EClass DRIVER_META_INFO_ASSIGNEMENT = eINSTANCE.getDriverMetaInfoAssignement();

    /**
     * The meta object literal for the '<em><b>Db Driver Info</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DRIVER_META_INFO_ASSIGNEMENT__DB_DRIVER_INFO = eINSTANCE.getDriverMetaInfoAssignement_DbDriverInfo();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.DriverMethodOutputAssignementImpl <em>Driver Method Output Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.DriverMethodOutputAssignementImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDriverMethodOutputAssignement()
     * @generated
     */
    EClass DRIVER_METHOD_OUTPUT_ASSIGNEMENT = eINSTANCE.getDriverMethodOutputAssignement();

    /**
     * The meta object literal for the '<em><b>Driver Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DRIVER_METHOD_OUTPUT_ASSIGNEMENT__DRIVER_METHOD = eINSTANCE.getDriverMethodOutputAssignement_DriverMethod();

    /**
     * The meta object literal for the '<em><b>Call Output</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DRIVER_METHOD_OUTPUT_ASSIGNEMENT__CALL_OUTPUT = eINSTANCE.getDriverMethodOutputAssignement_CallOutput();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.SqlTypeAssignementImpl <em>Sql Type Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.SqlTypeAssignementImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getSqlTypeAssignement()
     * @generated
     */
    EClass SQL_TYPE_ASSIGNEMENT = eINSTANCE.getSqlTypeAssignement();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SQL_TYPE_ASSIGNEMENT__TYPE_NAME = eINSTANCE.getSqlTypeAssignement_TypeName();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SQL_TYPE_ASSIGNEMENT__SIZE = eINSTANCE.getSqlTypeAssignement_Size();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQL_TYPE_ASSIGNEMENT__TYPE = eINSTANCE.getSqlTypeAssignement_Type();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ColumnTypeAssignementImpl <em>Column Type Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ColumnTypeAssignementImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getColumnTypeAssignement()
     * @generated
     */
    EClass COLUMN_TYPE_ASSIGNEMENT = eINSTANCE.getColumnTypeAssignement();

    /**
     * The meta object literal for the '<em><b>Db Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_TYPE_ASSIGNEMENT__DB_COLUMN = eINSTANCE.getColumnTypeAssignement_DbColumn();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_TYPE_ASSIGNEMENT__TYPE = eINSTANCE.getColumnTypeAssignement_Type();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ShowColumnTypeAssignementImpl <em>Show Column Type Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ShowColumnTypeAssignementImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getShowColumnTypeAssignement()
     * @generated
     */
    EClass SHOW_COLUMN_TYPE_ASSIGNEMENT = eINSTANCE.getShowColumnTypeAssignement();

    /**
     * The meta object literal for the '<em><b>Db Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHOW_COLUMN_TYPE_ASSIGNEMENT__DB_COLUMN = eINSTANCE.getShowColumnTypeAssignement_DbColumn();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHOW_COLUMN_TYPE_ASSIGNEMENT__TYPE = eINSTANCE.getShowColumnTypeAssignement_Type();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.TableAssignementImpl <em>Table Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.TableAssignementImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getTableAssignement()
     * @generated
     */
    EClass TABLE_ASSIGNEMENT = eINSTANCE.getTableAssignement();

    /**
     * The meta object literal for the '<em><b>Db Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_ASSIGNEMENT__DB_TABLE = eINSTANCE.getTableAssignement_DbTable();

    /**
     * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_ASSIGNEMENT__NEW_NAME = eINSTANCE.getTableAssignement_NewName();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.JoinTableAssignementImpl <em>Join Table Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.JoinTableAssignementImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getJoinTableAssignement()
     * @generated
     */
    EClass JOIN_TABLE_ASSIGNEMENT = eINSTANCE.getJoinTableAssignement();

    /**
     * The meta object literal for the '<em><b>Db Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOIN_TABLE_ASSIGNEMENT__DB_TABLE = eINSTANCE.getJoinTableAssignement_DbTable();

    /**
     * The meta object literal for the '<em><b>Db Tables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOIN_TABLE_ASSIGNEMENT__DB_TABLES = eINSTANCE.getJoinTableAssignement_DbTables();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ColumnAssignementImpl <em>Column Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ColumnAssignementImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getColumnAssignement()
     * @generated
     */
    EClass COLUMN_ASSIGNEMENT = eINSTANCE.getColumnAssignement();

    /**
     * The meta object literal for the '<em><b>Db Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_ASSIGNEMENT__DB_COLUMN = eINSTANCE.getColumnAssignement_DbColumn();

    /**
     * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_ASSIGNEMENT__NEW_NAME = eINSTANCE.getColumnAssignement_NewName();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ImportAssignementImpl <em>Import Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ImportAssignementImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getImportAssignement()
     * @generated
     */
    EClass IMPORT_ASSIGNEMENT = eINSTANCE.getImportAssignement();

    /**
     * The meta object literal for the '<em><b>Db Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_ASSIGNEMENT__DB_COLUMN = eINSTANCE.getImportAssignement_DbColumn();

    /**
     * The meta object literal for the '<em><b>Pk Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_ASSIGNEMENT__PK_TABLE = eINSTANCE.getImportAssignement_PkTable();

    /**
     * The meta object literal for the '<em><b>Pk Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_ASSIGNEMENT__PK_COLUMN = eINSTANCE.getImportAssignement_PkColumn();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ExportAssignementImpl <em>Export Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ExportAssignementImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getExportAssignement()
     * @generated
     */
    EClass EXPORT_ASSIGNEMENT = eINSTANCE.getExportAssignement();

    /**
     * The meta object literal for the '<em><b>Db Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPORT_ASSIGNEMENT__DB_COLUMN = eINSTANCE.getExportAssignement_DbColumn();

    /**
     * The meta object literal for the '<em><b>Fk Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPORT_ASSIGNEMENT__FK_TABLE = eINSTANCE.getExportAssignement_FkTable();

    /**
     * The meta object literal for the '<em><b>Fk Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPORT_ASSIGNEMENT__FK_COLUMN = eINSTANCE.getExportAssignement_FkColumn();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.InheritanceAssignementImpl <em>Inheritance Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.InheritanceAssignementImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getInheritanceAssignement()
     * @generated
     */
    EClass INHERITANCE_ASSIGNEMENT = eINSTANCE.getInheritanceAssignement();

    /**
     * The meta object literal for the '<em><b>Discriminator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INHERITANCE_ASSIGNEMENT__DISCRIMINATOR = eINSTANCE.getInheritanceAssignement_Discriminator();

    /**
     * The meta object literal for the '<em><b>Db Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INHERITANCE_ASSIGNEMENT__DB_TABLE = eINSTANCE.getInheritanceAssignement_DbTable();

    /**
     * The meta object literal for the '<em><b>Db Columns</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INHERITANCE_ASSIGNEMENT__DB_COLUMNS = eINSTANCE.getInheritanceAssignement_DbColumns();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ManyToManyAssignementImpl <em>Many To Many Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ManyToManyAssignementImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getManyToManyAssignement()
     * @generated
     */
    EClass MANY_TO_MANY_ASSIGNEMENT = eINSTANCE.getManyToManyAssignement();

    /**
     * The meta object literal for the '<em><b>Pk Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANY_TO_MANY_ASSIGNEMENT__PK_COLUMN = eINSTANCE.getManyToManyAssignement_PkColumn();

    /**
     * The meta object literal for the '<em><b>Pk Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANY_TO_MANY_ASSIGNEMENT__PK_TABLE = eINSTANCE.getManyToManyAssignement_PkTable();

    /**
     * The meta object literal for the '<em><b>Fk Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANY_TO_MANY_ASSIGNEMENT__FK_COLUMN = eINSTANCE.getManyToManyAssignement_FkColumn();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.DebugLevelAssignementImpl <em>Debug Level Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.DebugLevelAssignementImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDebugLevelAssignement()
     * @generated
     */
    EClass DEBUG_LEVEL_ASSIGNEMENT = eINSTANCE.getDebugLevelAssignement();

    /**
     * The meta object literal for the '<em><b>Debug</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEBUG_LEVEL_ASSIGNEMENT__DEBUG = eINSTANCE.getDebugLevelAssignement_Debug();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.PropertyImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Database</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__DATABASE = eINSTANCE.getProperty_Database();

    /**
     * The meta object literal for the '<em><b>Pojogen</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__POJOGEN = eINSTANCE.getProperty_Pojogen();

    /**
     * The meta object literal for the '<em><b>Metagen</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__METAGEN = eINSTANCE.getProperty_Metagen();

    /**
     * The meta object literal for the '<em><b>Daogen</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__DAOGEN = eINSTANCE.getProperty_Daogen();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl <em>Database Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.DatabasePropertyImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDatabaseProperty()
     * @generated
     */
    EClass DATABASE_PROPERTY = eINSTANCE.getDatabaseProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_PROPERTY__NAME = eINSTANCE.getDatabaseProperty_Name();

    /**
     * The meta object literal for the '<em><b>Db Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_PROPERTY__DB_URL = eINSTANCE.getDatabaseProperty_DbUrl();

    /**
     * The meta object literal for the '<em><b>Db Username</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_PROPERTY__DB_USERNAME = eINSTANCE.getDatabaseProperty_DbUsername();

    /**
     * The meta object literal for the '<em><b>Db Password</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_PROPERTY__DB_PASSWORD = eINSTANCE.getDatabaseProperty_DbPassword();

    /**
     * The meta object literal for the '<em><b>Db Catalog</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DB_CATALOG = eINSTANCE.getDatabaseProperty_DbCatalog();

    /**
     * The meta object literal for the '<em><b>Db Schema</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DB_SCHEMA = eINSTANCE.getDatabaseProperty_DbSchema();

    /**
     * The meta object literal for the '<em><b>Db Driver</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_PROPERTY__DB_DRIVER = eINSTANCE.getDatabaseProperty_DbDriver();

    /**
     * The meta object literal for the '<em><b>Db Execute Before</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_PROPERTY__DB_EXECUTE_BEFORE = eINSTANCE.getDatabaseProperty_DbExecuteBefore();

    /**
     * The meta object literal for the '<em><b>Db Execute After</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_PROPERTY__DB_EXECUTE_AFTER = eINSTANCE.getDatabaseProperty_DbExecuteAfter();

    /**
     * The meta object literal for the '<em><b>Db Index Types</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_PROPERTY__DB_INDEX_TYPES = eINSTANCE.getDatabaseProperty_DbIndexTypes();

    /**
     * The meta object literal for the '<em><b>Db Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DB_TYPE = eINSTANCE.getDatabaseProperty_DbType();

    /**
     * The meta object literal for the '<em><b>Db Meta Info</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DB_META_INFO = eINSTANCE.getDatabaseProperty_DbMetaInfo();

    /**
     * The meta object literal for the '<em><b>Db Driver Info</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DB_DRIVER_INFO = eINSTANCE.getDatabaseProperty_DbDriverInfo();

    /**
     * The meta object literal for the '<em><b>Db Methods Calls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DB_METHODS_CALLS = eINSTANCE.getDatabaseProperty_DbMethodsCalls();

    /**
     * The meta object literal for the '<em><b>Debug</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_PROPERTY__DEBUG = eINSTANCE.getDatabaseProperty_Debug();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl <em>Pojogen Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.PojogenPropertyImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojogenProperty()
     * @generated
     */
    EClass POJOGEN_PROPERTY = eINSTANCE.getPojogenProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__NAME = eINSTANCE.getPojogenProperty_Name();

    /**
     * The meta object literal for the '<em><b>Sql Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__SQL_TYPES = eINSTANCE.getPojogenProperty_SqlTypes();

    /**
     * The meta object literal for the '<em><b>Db Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__DB_TABLE = eINSTANCE.getPojogenProperty_DbTable();

    /**
     * The meta object literal for the '<em><b>Column Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__COLUMN_TYPES = eINSTANCE.getPojogenProperty_ColumnTypes();

    /**
     * The meta object literal for the '<em><b>Column Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__COLUMN_TYPE = eINSTANCE.getPojogenProperty_ColumnType();

    /**
     * The meta object literal for the '<em><b>Db Tables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__DB_TABLES = eINSTANCE.getPojogenProperty_DbTables();

    /**
     * The meta object literal for the '<em><b>Join Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__JOIN_TABLES = eINSTANCE.getPojogenProperty_JoinTables();

    /**
     * The meta object literal for the '<em><b>Db Columns</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__DB_COLUMNS = eINSTANCE.getPojogenProperty_DbColumns();

    /**
     * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__TABLES = eINSTANCE.getPojogenProperty_Tables();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__COLUMNS = eINSTANCE.getPojogenProperty_Columns();

    /**
     * The meta object literal for the '<em><b>Exports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__EXPORTS = eINSTANCE.getPojogenProperty_Exports();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__IMPORTS = eINSTANCE.getPojogenProperty_Imports();

    /**
     * The meta object literal for the '<em><b>Many2s</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__MANY2S = eINSTANCE.getPojogenProperty_Many2s();

    /**
     * The meta object literal for the '<em><b>Db Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__DB_COLUMN = eINSTANCE.getPojogenProperty_DbColumn();

    /**
     * The meta object literal for the '<em><b>Inheritance</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__INHERITANCE = eINSTANCE.getPojogenProperty_Inheritance();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__METHODS = eINSTANCE.getPojogenProperty_Methods();

    /**
     * The meta object literal for the '<em><b>To Implements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__TO_IMPLEMENTS = eINSTANCE.getPojogenProperty_ToImplements();

    /**
     * The meta object literal for the '<em><b>To Extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__TO_EXTENDS = eINSTANCE.getPojogenProperty_ToExtends();

    /**
     * The meta object literal for the '<em><b>Impl Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__IMPL_PACKAGE = eINSTANCE.getPojogenProperty_ImplPackage();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJOGEN_PROPERTY__VERSION = eINSTANCE.getPojogenProperty_Version();

    /**
     * The meta object literal for the '<em><b>Debug</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJOGEN_PROPERTY__DEBUG = eINSTANCE.getPojogenProperty_Debug();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.MetaTypeAssignementImpl <em>Meta Type Assignement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.MetaTypeAssignementImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMetaTypeAssignement()
     * @generated
     */
    EClass META_TYPE_ASSIGNEMENT = eINSTANCE.getMetaTypeAssignement();

    /**
     * The meta object literal for the '<em><b>Db Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_TYPE_ASSIGNEMENT__DB_COLUMN = eINSTANCE.getMetaTypeAssignement_DbColumn();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_TYPE_ASSIGNEMENT__TYPE = eINSTANCE.getMetaTypeAssignement_Type();

    /**
     * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_TYPE_ASSIGNEMENT__EXTENSION = eINSTANCE.getMetaTypeAssignement_Extension();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.MetagenPropertyImpl <em>Metagen Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.MetagenPropertyImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMetagenProperty()
     * @generated
     */
    EClass METAGEN_PROPERTY = eINSTANCE.getMetagenProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__NAME = eINSTANCE.getMetagenProperty_Name();

    /**
     * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__SEQUENCE = eINSTANCE.getMetagenProperty_Sequence();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__TYPE = eINSTANCE.getMetagenProperty_Type();

    /**
     * The meta object literal for the '<em><b>Db Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__DB_TABLE = eINSTANCE.getMetagenProperty_DbTable();

    /**
     * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__IDENTITY = eINSTANCE.getMetagenProperty_Identity();

    /**
     * The meta object literal for the '<em><b>Meta Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METAGEN_PROPERTY__META_TYPES = eINSTANCE.getMetagenProperty_MetaTypes();

    /**
     * The meta object literal for the '<em><b>Db Statement</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__DB_STATEMENT = eINSTANCE.getMetagenProperty_DbStatement();

    /**
     * The meta object literal for the '<em><b>Db Columns</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__DB_COLUMNS = eINSTANCE.getMetagenProperty_DbColumns();

    /**
     * The meta object literal for the '<em><b>Db Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__DB_FUNCTION = eINSTANCE.getMetagenProperty_DbFunction();

    /**
     * The meta object literal for the '<em><b>Db Procedure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAGEN_PROPERTY__DB_PROCEDURE = eINSTANCE.getMetagenProperty_DbProcedure();

    /**
     * The meta object literal for the '<em><b>Debug</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METAGEN_PROPERTY__DEBUG = eINSTANCE.getMetagenProperty_Debug();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.DaogenPropertyImpl <em>Daogen Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.DaogenPropertyImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDaogenProperty()
     * @generated
     */
    EClass DAOGEN_PROPERTY = eINSTANCE.getDaogenProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAOGEN_PROPERTY__NAME = eINSTANCE.getDaogenProperty_Name();

    /**
     * The meta object literal for the '<em><b>Db Tables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAOGEN_PROPERTY__DB_TABLES = eINSTANCE.getDaogenProperty_DbTables();

    /**
     * The meta object literal for the '<em><b>Impl Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAOGEN_PROPERTY__IMPL_PACKAGE = eINSTANCE.getDaogenProperty_ImplPackage();

    /**
     * The meta object literal for the '<em><b>To Implements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAOGEN_PROPERTY__TO_IMPLEMENTS = eINSTANCE.getDaogenProperty_ToImplements();

    /**
     * The meta object literal for the '<em><b>To Extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAOGEN_PROPERTY__TO_EXTENDS = eINSTANCE.getDaogenProperty_ToExtends();

    /**
     * The meta object literal for the '<em><b>Db Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DAOGEN_PROPERTY__DB_FUNCTION = eINSTANCE.getDaogenProperty_DbFunction();

    /**
     * The meta object literal for the '<em><b>Result Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAOGEN_PROPERTY__RESULT_TYPE = eINSTANCE.getDaogenProperty_ResultType();

    /**
     * The meta object literal for the '<em><b>Debug</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAOGEN_PROPERTY__DEBUG = eINSTANCE.getDaogenProperty_Debug();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoDefinitionImpl <em>Pojo Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.PojoDefinitionImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoDefinition()
     * @generated
     */
    EClass POJO_DEFINITION = eINSTANCE.getPojoDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_DEFINITION__NAME = eINSTANCE.getPojoDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_DEFINITION__CLASS = eINSTANCE.getPojoDefinition_Class();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.TableDefinitionImpl <em>Table Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.TableDefinitionImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getTableDefinition()
     * @generated
     */
    EClass TABLE_DEFINITION = eINSTANCE.getTableDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_DEFINITION__NAME = eINSTANCE.getTableDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_DEFINITION__TABLE = eINSTANCE.getTableDefinition_Table();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ProcedureDefinitionImpl <em>Procedure Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ProcedureDefinitionImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getProcedureDefinition()
     * @generated
     */
    EClass PROCEDURE_DEFINITION = eINSTANCE.getProcedureDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE_DEFINITION__NAME = eINSTANCE.getProcedureDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE_DEFINITION__TABLE = eINSTANCE.getProcedureDefinition_Table();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.FunctionDefinitionImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getFunctionDefinition()
     * @generated
     */
    EClass FUNCTION_DEFINITION = eINSTANCE.getFunctionDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DEFINITION__NAME = eINSTANCE.getFunctionDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DEFINITION__TABLE = eINSTANCE.getFunctionDefinition_Table();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.MetaStatementImpl <em>Meta Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.MetaStatementImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMetaStatement()
     * @generated
     */
    EClass META_STATEMENT = eINSTANCE.getMetaStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_STATEMENT__NAME = eINSTANCE.getMetaStatement_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_STATEMENT__TYPE = eINSTANCE.getMetaStatement_Type();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_STATEMENT__MODIFIERS = eINSTANCE.getMetaStatement_Modifiers();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_STATEMENT__STATEMENT = eINSTANCE.getMetaStatement_Statement();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.SqlImpl <em>Sql</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.SqlImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getSql()
     * @generated
     */
    EClass SQL = eINSTANCE.getSql();

    /**
     * The meta object literal for the '<em><b>Sqls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQL__SQLS = eINSTANCE.getSql_Sqls();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.SqlFragmentImpl <em>Sql Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.SqlFragmentImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getSqlFragment()
     * @generated
     */
    EClass SQL_FRAGMENT = eINSTANCE.getSqlFragment();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SQL_FRAGMENT__VALUE = eINSTANCE.getSqlFragment_Value();

    /**
     * The meta object literal for the '<em><b>Col</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQL_FRAGMENT__COL = eINSTANCE.getSqlFragment_Col();

    /**
     * The meta object literal for the '<em><b>Cnst</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQL_FRAGMENT__CNST = eINSTANCE.getSqlFragment_Cnst();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQL_FRAGMENT__IDENT = eINSTANCE.getSqlFragment_Ident();

    /**
     * The meta object literal for the '<em><b>Meta</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQL_FRAGMENT__META = eINSTANCE.getSqlFragment_Meta();

    /**
     * The meta object literal for the '<em><b>Dbtab</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQL_FRAGMENT__DBTAB = eINSTANCE.getSqlFragment_Dbtab();

    /**
     * The meta object literal for the '<em><b>Dbcol</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQL_FRAGMENT__DBCOL = eINSTANCE.getSqlFragment_Dbcol();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.MetaSqlImpl <em>Meta Sql</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.MetaSqlImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMetaSql()
     * @generated
     */
    EClass META_SQL = eINSTANCE.getMetaSql();

    /**
     * The meta object literal for the '<em><b>Ifs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_SQL__IFS = eINSTANCE.getMetaSql_Ifs();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_SQL__TYPE = eINSTANCE.getMetaSql_Type();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_SQL__COND = eINSTANCE.getMetaSql_Cond();

    /**
     * The meta object literal for the '<em><b>Ftype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_SQL__FTYPE = eINSTANCE.getMetaSql_Ftype();

    /**
     * The meta object literal for the '<em><b>Ord</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META_SQL__ORD = eINSTANCE.getMetaSql_Ord();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.IfSqlImpl <em>If Sql</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.IfSqlImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getIfSql()
     * @generated
     */
    EClass IF_SQL = eINSTANCE.getIfSql();

    /**
     * The meta object literal for the '<em><b>Sqls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_SQL__SQLS = eINSTANCE.getIfSql_Sqls();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.IfSqlFragmentImpl <em>If Sql Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.IfSqlFragmentImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getIfSqlFragment()
     * @generated
     */
    EClass IF_SQL_FRAGMENT = eINSTANCE.getIfSqlFragment();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_SQL_FRAGMENT__VALUE = eINSTANCE.getIfSqlFragment_Value();

    /**
     * The meta object literal for the '<em><b>Col</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_SQL_FRAGMENT__COL = eINSTANCE.getIfSqlFragment_Col();

    /**
     * The meta object literal for the '<em><b>Cnst</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_SQL_FRAGMENT__CNST = eINSTANCE.getIfSqlFragment_Cnst();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_SQL_FRAGMENT__IDENT = eINSTANCE.getIfSqlFragment_Ident();

    /**
     * The meta object literal for the '<em><b>Dbtab</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_SQL_FRAGMENT__DBTAB = eINSTANCE.getIfSqlFragment_Dbtab();

    /**
     * The meta object literal for the '<em><b>Dbcol</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_SQL_FRAGMENT__DBCOL = eINSTANCE.getIfSqlFragment_Dbcol();

    /**
     * The meta object literal for the '<em><b>Meta</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_SQL_FRAGMENT__META = eINSTANCE.getIfSqlFragment_Meta();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.IfMetaSqlImpl <em>If Meta Sql</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.IfMetaSqlImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getIfMetaSql()
     * @generated
     */
    EClass IF_META_SQL = eINSTANCE.getIfMetaSql();

    /**
     * The meta object literal for the '<em><b>Ifs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_META_SQL__IFS = eINSTANCE.getIfMetaSql_Ifs();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_META_SQL__TYPE = eINSTANCE.getIfMetaSql_Type();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_META_SQL__COND = eINSTANCE.getIfMetaSql_Cond();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.IfSqlCondImpl <em>If Sql Cond</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.IfSqlCondImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getIfSqlCond()
     * @generated
     */
    EClass IF_SQL_COND = eINSTANCE.getIfSqlCond();

    /**
     * The meta object literal for the '<em><b>Bool1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_SQL_COND__BOOL1 = eINSTANCE.getIfSqlCond_Bool1();

    /**
     * The meta object literal for the '<em><b>Oper</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_SQL_COND__OPER = eINSTANCE.getIfSqlCond_Oper();

    /**
     * The meta object literal for the '<em><b>Bool2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_SQL_COND__BOOL2 = eINSTANCE.getIfSqlCond_Bool2();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.IfSqlBoolImpl <em>If Sql Bool</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.IfSqlBoolImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getIfSqlBool()
     * @generated
     */
    EClass IF_SQL_BOOL = eINSTANCE.getIfSqlBool();

    /**
     * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_SQL_BOOL__NOT = eINSTANCE.getIfSqlBool_Not();

    /**
     * The meta object literal for the '<em><b>Cnst</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_SQL_BOOL__CNST = eINSTANCE.getIfSqlBool_Cnst();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_SQL_BOOL__IDENT = eINSTANCE.getIfSqlBool_Ident();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_SQL_BOOL__COND = eINSTANCE.getIfSqlBool_Cond();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.OrdSqlImpl <em>Ord Sql</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.OrdSqlImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getOrdSql()
     * @generated
     */
    EClass ORD_SQL = eINSTANCE.getOrdSql();

    /**
     * The meta object literal for the '<em><b>Sqls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORD_SQL__SQLS = eINSTANCE.getOrdSql_Sqls();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.OrdSql2Impl <em>Ord Sql2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.OrdSql2Impl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getOrdSql2()
     * @generated
     */
    EClass ORD_SQL2 = eINSTANCE.getOrdSql2();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORD_SQL2__VALUE = eINSTANCE.getOrdSql2_Value();

    /**
     * The meta object literal for the '<em><b>Cnst</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORD_SQL2__CNST = eINSTANCE.getOrdSql2_Cnst();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORD_SQL2__IDENT = eINSTANCE.getOrdSql2_Ident();

    /**
     * The meta object literal for the '<em><b>Dbcol</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORD_SQL2__DBCOL = eINSTANCE.getOrdSql2_Dbcol();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ColumnImpl <em>Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ColumnImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getColumn()
     * @generated
     */
    EClass COLUMN = eINSTANCE.getColumn();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN__COLUMNS = eINSTANCE.getColumn_Columns();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ExtendedColumnImpl <em>Extended Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ExtendedColumnImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getExtendedColumn()
     * @generated
     */
    EClass EXTENDED_COLUMN = eINSTANCE.getExtendedColumn();

    /**
     * The meta object literal for the '<em><b>Col</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTENDED_COLUMN__COL = eINSTANCE.getExtendedColumn_Col();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENDED_COLUMN__MODIFIERS = eINSTANCE.getExtendedColumn_Modifiers();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ExtendedColumnNameImpl <em>Extended Column Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ExtendedColumnNameImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getExtendedColumnName()
     * @generated
     */
    EClass EXTENDED_COLUMN_NAME = eINSTANCE.getExtendedColumnName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENDED_COLUMN_NAME__NAME = eINSTANCE.getExtendedColumnName_Name();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ConstantImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Case</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__CASE = eINSTANCE.getConstant_Case();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__NAME = eINSTANCE.getConstant_Name();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__MODIFIERS = eINSTANCE.getConstant_Modifiers();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.IdentifierImpl <em>Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.IdentifierImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getIdentifier()
     * @generated
     */
    EClass IDENTIFIER = eINSTANCE.getIdentifier();

    /**
     * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFIER__MODE = eINSTANCE.getIdentifier_Mode();

    /**
     * The meta object literal for the '<em><b>Case</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFIER__CASE = eINSTANCE.getIdentifier_Case();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFIER__NAME = eINSTANCE.getIdentifier_Name();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFIER__MODIFIERS = eINSTANCE.getIdentifier_Modifiers();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.DatabaseColumnImpl <em>Database Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.DatabaseColumnImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDatabaseColumn()
     * @generated
     */
    EClass DATABASE_COLUMN = eINSTANCE.getDatabaseColumn();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_COLUMN__NAME = eINSTANCE.getDatabaseColumn_Name();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.DatabaseTableImpl <em>Database Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.DatabaseTableImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDatabaseTable()
     * @generated
     */
    EClass DATABASE_TABLE = eINSTANCE.getDatabaseTable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_TABLE__NAME = eINSTANCE.getDatabaseTable_Name();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.MappingRuleImpl <em>Mapping Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.MappingRuleImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMappingRule()
     * @generated
     */
    EClass MAPPING_RULE = eINSTANCE.getMappingRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_RULE__NAME = eINSTANCE.getMappingRule_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_RULE__TYPE = eINSTANCE.getMappingRule_Type();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_RULE__MODIFIERS = eINSTANCE.getMappingRule_Modifiers();

    /**
     * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_RULE__MAPPING = eINSTANCE.getMappingRule_Mapping();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.MappingImpl <em>Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.MappingImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMapping()
     * @generated
     */
    EClass MAPPING = eINSTANCE.getMapping();

    /**
     * The meta object literal for the '<em><b>Mapping Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__MAPPING_ITEMS = eINSTANCE.getMapping_MappingItems();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.MappingItemImpl <em>Mapping Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.MappingItemImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMappingItem()
     * @generated
     */
    EClass MAPPING_ITEM = eINSTANCE.getMappingItem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_ITEM__NAME = eINSTANCE.getMappingItem_Name();

    /**
     * The meta object literal for the '<em><b>Attr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_ITEM__ATTR = eINSTANCE.getMappingItem_Attr();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.MappingColumnImpl <em>Mapping Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.MappingColumnImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMappingColumn()
     * @generated
     */
    EClass MAPPING_COLUMN = eINSTANCE.getMappingColumn();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_COLUMN__ITEMS = eINSTANCE.getMappingColumn_Items();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ExtendedMappingItemImpl <em>Extended Mapping Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ExtendedMappingItemImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getExtendedMappingItem()
     * @generated
     */
    EClass EXTENDED_MAPPING_ITEM = eINSTANCE.getExtendedMappingItem();

    /**
     * The meta object literal for the '<em><b>Attr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTENDED_MAPPING_ITEM__ATTR = eINSTANCE.getExtendedMappingItem_Attr();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENDED_MAPPING_ITEM__MODIFIERS = eINSTANCE.getExtendedMappingItem_Modifiers();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.MappingColumnNameImpl <em>Mapping Column Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.MappingColumnNameImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMappingColumnName()
     * @generated
     */
    EClass MAPPING_COLUMN_NAME = eINSTANCE.getMappingColumnName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_COLUMN_NAME__NAME = eINSTANCE.getMappingColumnName_Name();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.OptionalFeatureImpl <em>Optional Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.OptionalFeatureImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getOptionalFeature()
     * @generated
     */
    EClass OPTIONAL_FEATURE = eINSTANCE.getOptionalFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTIONAL_FEATURE__NAME = eINSTANCE.getOptionalFeature_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTIONAL_FEATURE__TYPE = eINSTANCE.getOptionalFeature_Type();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTIONAL_FEATURE__MODIFIERS = eINSTANCE.getOptionalFeature_Modifiers();

    /**
     * The meta object literal for the '<em><b>Option</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTIONAL_FEATURE__OPTION = eINSTANCE.getOptionalFeature_Option();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoTypeImpl <em>Pojo Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.PojoTypeImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoType()
     * @generated
     */
    EClass POJO_TYPE = eINSTANCE.getPojoType();

    /**
     * The meta object literal for the '<em><b>Native</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_TYPE__NATIVE = eINSTANCE.getPojoType_Native();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_TYPE__REF = eINSTANCE.getPojoType_Ref();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_TYPE__TYPE = eINSTANCE.getPojoType_Type();

    /**
     * The meta object literal for the '<em><b>Gref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_TYPE__GREF = eINSTANCE.getPojoType_Gref();

    /**
     * The meta object literal for the '<em><b>Gtype</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_TYPE__GTYPE = eINSTANCE.getPojoType_Gtype();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_TYPE__ARRAY = eINSTANCE.getPojoType_Array();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.PackageDeclarationImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__SUFFIX = eINSTANCE.getPackageDeclaration_Suffix();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__ELEMENTS = eINSTANCE.getPackageDeclaration_Elements();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.AbstractPojoEntityImpl <em>Abstract Pojo Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.AbstractPojoEntityImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getAbstractPojoEntity()
     * @generated
     */
    EClass ABSTRACT_POJO_ENTITY = eINSTANCE.getAbstractPojoEntity();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ImportImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ImplementsImpl <em>Implements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ImplementsImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getImplements()
     * @generated
     */
    EClass IMPLEMENTS = eINSTANCE.getImplements();

    /**
     * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTS__IMPLEMENTS = eINSTANCE.getImplements_Implements();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ExtendsImpl <em>Extends</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ExtendsImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getExtends()
     * @generated
     */
    EClass EXTENDS = eINSTANCE.getExtends();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTENDS__EXTENDS = eINSTANCE.getExtends_Extends();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ImplPackageImpl <em>Impl Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ImplPackageImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getImplPackage()
     * @generated
     */
    EClass IMPL_PACKAGE = eINSTANCE.getImplPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPL_PACKAGE__NAME = eINSTANCE.getImplPackage_Name();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoEntityModifier1Impl <em>Pojo Entity Modifier1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.PojoEntityModifier1Impl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoEntityModifier1()
     * @generated
     */
    EClass POJO_ENTITY_MODIFIER1 = eINSTANCE.getPojoEntityModifier1();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_ENTITY_MODIFIER1__FINAL = eINSTANCE.getPojoEntityModifier1_Final();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_ENTITY_MODIFIER1__ABSTRACT = eINSTANCE.getPojoEntityModifier1_Abstract();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoEntityModifier2Impl <em>Pojo Entity Modifier2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.PojoEntityModifier2Impl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoEntityModifier2()
     * @generated
     */
    EClass POJO_ENTITY_MODIFIER2 = eINSTANCE.getPojoEntityModifier2();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_ENTITY_MODIFIER2__SUPER_TYPE = eINSTANCE.getPojoEntityModifier2_SuperType();

    /**
     * The meta object literal for the '<em><b>Discriminator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_ENTITY_MODIFIER2__DISCRIMINATOR = eINSTANCE.getPojoEntityModifier2_Discriminator();

    /**
     * The meta object literal for the '<em><b>Sernum</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_ENTITY_MODIFIER2__SERNUM = eINSTANCE.getPojoEntityModifier2_Sernum();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoEntityImpl <em>Pojo Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.PojoEntityImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoEntity()
     * @generated
     */
    EClass POJO_ENTITY = eINSTANCE.getPojoEntity();

    /**
     * The meta object literal for the '<em><b>Modifiers1</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_ENTITY__MODIFIERS1 = eINSTANCE.getPojoEntity_Modifiers1();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_ENTITY__NAME = eINSTANCE.getPojoEntity_Name();

    /**
     * The meta object literal for the '<em><b>Modifiers2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_ENTITY__MODIFIERS2 = eINSTANCE.getPojoEntity_Modifiers2();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_ENTITY__FEATURES = eINSTANCE.getPojoEntity_Features();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoPropertyModifierImpl <em>Pojo Property Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.PojoPropertyModifierImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoPropertyModifier()
     * @generated
     */
    EClass POJO_PROPERTY_MODIFIER = eINSTANCE.getPojoPropertyModifier();

    /**
     * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_PROPERTY_MODIFIER__REQUIRED = eINSTANCE.getPojoPropertyModifier_Required();

    /**
     * The meta object literal for the '<em><b>Discriminator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_PROPERTY_MODIFIER__DISCRIMINATOR = eINSTANCE.getPojoPropertyModifier_Discriminator();

    /**
     * The meta object literal for the '<em><b>Primary Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_PROPERTY_MODIFIER__PRIMARY_KEY = eINSTANCE.getPojoPropertyModifier_PrimaryKey();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_PROPERTY_MODIFIER__INDEX = eINSTANCE.getPojoPropertyModifier_Index();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_PROPERTY_MODIFIER__VERSION = eINSTANCE.getPojoPropertyModifier_Version();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoPropertyImpl <em>Pojo Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.PojoPropertyImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoProperty()
     * @generated
     */
    EClass POJO_PROPERTY = eINSTANCE.getPojoProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_PROPERTY__NAME = eINSTANCE.getPojoProperty_Name();

    /**
     * The meta object literal for the '<em><b>Native</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_PROPERTY__NATIVE = eINSTANCE.getPojoProperty_Native();

    /**
     * The meta object literal for the '<em><b>Attrs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_PROPERTY__ATTRS = eINSTANCE.getPojoProperty_Attrs();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_PROPERTY__REF = eINSTANCE.getPojoProperty_Ref();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_PROPERTY__TYPE = eINSTANCE.getPojoProperty_Type();

    /**
     * The meta object literal for the '<em><b>Gref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_PROPERTY__GREF = eINSTANCE.getPojoProperty_Gref();

    /**
     * The meta object literal for the '<em><b>Gtype</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_PROPERTY__GTYPE = eINSTANCE.getPojoProperty_Gtype();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_PROPERTY__ARRAY = eINSTANCE.getPojoProperty_Array();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_PROPERTY__MODIFIERS = eINSTANCE.getPojoProperty_Modifiers();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoDaoModifierImpl <em>Pojo Dao Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.PojoDaoModifierImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoDaoModifier()
     * @generated
     */
    EClass POJO_DAO_MODIFIER = eINSTANCE.getPojoDaoModifier();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_DAO_MODIFIER__SUPER_TYPE = eINSTANCE.getPojoDaoModifier_SuperType();

    /**
     * The meta object literal for the '<em><b>Sernum</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_DAO_MODIFIER__SERNUM = eINSTANCE.getPojoDaoModifier_Sernum();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoDaoImpl <em>Pojo Dao</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.PojoDaoImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoDao()
     * @generated
     */
    EClass POJO_DAO = eINSTANCE.getPojoDao();

    /**
     * The meta object literal for the '<em><b>Modifiers1</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_DAO__MODIFIERS1 = eINSTANCE.getPojoDao_Modifiers1();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_DAO__NAME = eINSTANCE.getPojoDao_Name();

    /**
     * The meta object literal for the '<em><b>Pojo</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_DAO__POJO = eINSTANCE.getPojoDao_Pojo();

    /**
     * The meta object literal for the '<em><b>Modifiers2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_DAO__MODIFIERS2 = eINSTANCE.getPojoDao_Modifiers2();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_DAO__METHODS = eINSTANCE.getPojoDao_Methods();

    /**
     * The meta object literal for the '<em><b>To Inits</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_DAO__TO_INITS = eINSTANCE.getPojoDao_ToInits();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoMethodModifierImpl <em>Pojo Method Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.PojoMethodModifierImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoMethodModifier()
     * @generated
     */
    EClass POJO_METHOD_MODIFIER = eINSTANCE.getPojoMethodModifier();

    /**
     * The meta object literal for the '<em><b>Call Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_METHOD_MODIFIER__CALL_FUNCTION = eINSTANCE.getPojoMethodModifier_CallFunction();

    /**
     * The meta object literal for the '<em><b>Call Update</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_METHOD_MODIFIER__CALL_UPDATE = eINSTANCE.getPojoMethodModifier_CallUpdate();

    /**
     * The meta object literal for the '<em><b>Call Query</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_METHOD_MODIFIER__CALL_QUERY = eINSTANCE.getPojoMethodModifier_CallQuery();

    /**
     * The meta object literal for the '<em><b>Call Query Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_METHOD_MODIFIER__CALL_QUERY_FUNCTION = eINSTANCE.getPojoMethodModifier_CallQueryFunction();

    /**
     * The meta object literal for the '<em><b>Call Select Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_METHOD_MODIFIER__CALL_SELECT_FUNCTION = eINSTANCE.getPojoMethodModifier_CallSelectFunction();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoMethodImpl <em>Pojo Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.PojoMethodImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoMethod()
     * @generated
     */
    EClass POJO_METHOD = eINSTANCE.getPojoMethod();

    /**
     * The meta object literal for the '<em><b>Modifiers1</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_METHOD__MODIFIERS1 = eINSTANCE.getPojoMethod_Modifiers1();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_METHOD__NAME = eINSTANCE.getPojoMethod_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_METHOD__TYPE = eINSTANCE.getPojoMethod_Type();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_METHOD__ARGS = eINSTANCE.getPojoMethod_Args();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ToInitMethodImpl <em>To Init Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ToInitMethodImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getToInitMethod()
     * @generated
     */
    EClass TO_INIT_METHOD = eINSTANCE.getToInitMethod();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TO_INIT_METHOD__NAME = eINSTANCE.getToInitMethod_Name();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TO_INIT_METHOD__ARGS = eINSTANCE.getToInitMethod_Args();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoMethodArgImpl <em>Pojo Method Arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.PojoMethodArgImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoMethodArg()
     * @generated
     */
    EClass POJO_METHOD_ARG = eINSTANCE.getPojoMethodArg();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_METHOD_ARG__NAME = eINSTANCE.getPojoMethodArg_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_METHOD_ARG__TYPE = eINSTANCE.getPojoMethodArg_Type();

  }

} //ProcessorDslPackage
