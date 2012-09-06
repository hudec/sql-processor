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
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__FEATURES = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__STATEMENTS = 1;

  /**
   * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__MAPPINGS = 2;

  /**
   * The feature id for the '<em><b>Pojos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__POJOS = 3;

  /**
   * The feature id for the '<em><b>Usages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__USAGES = 4;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__PROPERTIES = 5;

  /**
   * The feature id for the '<em><b>Tables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__TABLES = 6;

  /**
   * The feature id for the '<em><b>Table Usages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__TABLE_USAGES = 7;

  /**
   * The feature id for the '<em><b>Pojo Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__POJO_PACKAGES = 8;

  /**
   * The feature id for the '<em><b>Usages Ext</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS__USAGES_EXT = 9;

  /**
   * The number of structural features of the '<em>Artifacts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACTS_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.SqlTypeAssignementImpl <em>Sql Type Assignement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.SqlTypeAssignementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getSqlTypeAssignement()
   * @generated
   */
  int SQL_TYPE_ASSIGNEMENT = 1;

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
  int COLUMN_TYPE_ASSIGNEMENT = 2;

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
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PropertyImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Do Resolve Pojo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DO_RESOLVE_POJO = 1;

  /**
   * The feature id for the '<em><b>Do Resolve Db</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DO_RESOLVE_DB = 2;

  /**
   * The feature id for the '<em><b>Db Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DB_URL = 3;

  /**
   * The feature id for the '<em><b>Db Username</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DB_USERNAME = 4;

  /**
   * The feature id for the '<em><b>Db Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DB_PASSWORD = 5;

  /**
   * The feature id for the '<em><b>Db Schema</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DB_SCHEMA = 6;

  /**
   * The feature id for the '<em><b>Db Driver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DB_DRIVER = 7;

  /**
   * The feature id for the '<em><b>Sql Type Assignements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__SQL_TYPE_ASSIGNEMENTS = 8;

  /**
   * The feature id for the '<em><b>Db Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DB_TABLE = 9;

  /**
   * The feature id for the '<em><b>Column Type Assignements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__COLUMN_TYPE_ASSIGNEMENTS = 10;

  /**
   * The feature id for the '<em><b>Db Tables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DB_TABLES = 11;

  /**
   * The feature id for the '<em><b>Db Columns</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DB_COLUMNS = 12;

  /**
   * The feature id for the '<em><b>New Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NEW_NAMES = 13;

  /**
   * The feature id for the '<em><b>Pk Tables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__PK_TABLES = 14;

  /**
   * The feature id for the '<em><b>Pk Columns</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__PK_COLUMNS = 15;

  /**
   * The feature id for the '<em><b>Fk Tables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__FK_TABLES = 16;

  /**
   * The feature id for the '<em><b>Fk Columns</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__FK_COLUMNS = 17;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 18;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoDefinitionImpl <em>Pojo Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PojoDefinitionImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoDefinition()
   * @generated
   */
  int POJO_DEFINITION = 4;

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
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoUsageImpl <em>Pojo Usage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PojoUsageImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoUsage()
   * @generated
   */
  int POJO_USAGE = 5;

  /**
   * The feature id for the '<em><b>Pojo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_USAGE__POJO = 0;

  /**
   * The number of structural features of the '<em>Pojo Usage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_USAGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ColumnUsageImpl <em>Column Usage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ColumnUsageImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getColumnUsage()
   * @generated
   */
  int COLUMN_USAGE = 6;

  /**
   * The feature id for the '<em><b>Pojo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_USAGE__POJO = POJO_USAGE__POJO;

  /**
   * The feature id for the '<em><b>Statement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_USAGE__STATEMENT = POJO_USAGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Column Usage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_USAGE_FEATURE_COUNT = POJO_USAGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.IdentifierUsageImpl <em>Identifier Usage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.IdentifierUsageImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getIdentifierUsage()
   * @generated
   */
  int IDENTIFIER_USAGE = 7;

  /**
   * The feature id for the '<em><b>Pojo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_USAGE__POJO = POJO_USAGE__POJO;

  /**
   * The feature id for the '<em><b>Statement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_USAGE__STATEMENT = POJO_USAGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Identifier Usage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_USAGE_FEATURE_COUNT = POJO_USAGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ConstantUsageImpl <em>Constant Usage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ConstantUsageImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getConstantUsage()
   * @generated
   */
  int CONSTANT_USAGE = 8;

  /**
   * The feature id for the '<em><b>Pojo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_USAGE__POJO = POJO_USAGE__POJO;

  /**
   * The feature id for the '<em><b>Statement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_USAGE__STATEMENT = POJO_USAGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constant Usage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_USAGE_FEATURE_COUNT = POJO_USAGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.MappingUsageImpl <em>Mapping Usage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.MappingUsageImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMappingUsage()
   * @generated
   */
  int MAPPING_USAGE = 9;

  /**
   * The feature id for the '<em><b>Pojo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_USAGE__POJO = POJO_USAGE__POJO;

  /**
   * The feature id for the '<em><b>Statement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_USAGE__STATEMENT = POJO_USAGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mapping Usage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_USAGE_FEATURE_COUNT = POJO_USAGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoUsageExtImpl <em>Pojo Usage Ext</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PojoUsageExtImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoUsageExt()
   * @generated
   */
  int POJO_USAGE_EXT = 10;

  /**
   * The feature id for the '<em><b>Pojo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_USAGE_EXT__POJO = 0;

  /**
   * The number of structural features of the '<em>Pojo Usage Ext</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_USAGE_EXT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ColumnUsageExtImpl <em>Column Usage Ext</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ColumnUsageExtImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getColumnUsageExt()
   * @generated
   */
  int COLUMN_USAGE_EXT = 11;

  /**
   * The feature id for the '<em><b>Pojo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_USAGE_EXT__POJO = POJO_USAGE_EXT__POJO;

  /**
   * The feature id for the '<em><b>Statement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_USAGE_EXT__STATEMENT = POJO_USAGE_EXT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Column Usage Ext</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_USAGE_EXT_FEATURE_COUNT = POJO_USAGE_EXT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.IdentifierUsageExtImpl <em>Identifier Usage Ext</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.IdentifierUsageExtImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getIdentifierUsageExt()
   * @generated
   */
  int IDENTIFIER_USAGE_EXT = 12;

  /**
   * The feature id for the '<em><b>Pojo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_USAGE_EXT__POJO = POJO_USAGE_EXT__POJO;

  /**
   * The feature id for the '<em><b>Statement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_USAGE_EXT__STATEMENT = POJO_USAGE_EXT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Identifier Usage Ext</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_USAGE_EXT_FEATURE_COUNT = POJO_USAGE_EXT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ConstantUsageExtImpl <em>Constant Usage Ext</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ConstantUsageExtImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getConstantUsageExt()
   * @generated
   */
  int CONSTANT_USAGE_EXT = 13;

  /**
   * The feature id for the '<em><b>Pojo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_USAGE_EXT__POJO = POJO_USAGE_EXT__POJO;

  /**
   * The feature id for the '<em><b>Statement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_USAGE_EXT__STATEMENT = POJO_USAGE_EXT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constant Usage Ext</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_USAGE_EXT_FEATURE_COUNT = POJO_USAGE_EXT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.MappingUsageExtImpl <em>Mapping Usage Ext</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.MappingUsageExtImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMappingUsageExt()
   * @generated
   */
  int MAPPING_USAGE_EXT = 14;

  /**
   * The feature id for the '<em><b>Pojo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_USAGE_EXT__POJO = POJO_USAGE_EXT__POJO;

  /**
   * The feature id for the '<em><b>Statement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_USAGE_EXT__STATEMENT = POJO_USAGE_EXT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mapping Usage Ext</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_USAGE_EXT_FEATURE_COUNT = POJO_USAGE_EXT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.TableDefinitionImpl <em>Table Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.TableDefinitionImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getTableDefinition()
   * @generated
   */
  int TABLE_DEFINITION = 15;

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
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.TableUsageImpl <em>Table Usage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.TableUsageImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getTableUsage()
   * @generated
   */
  int TABLE_USAGE = 16;

  /**
   * The feature id for the '<em><b>Statement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_USAGE__STATEMENT = 0;

  /**
   * The feature id for the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_USAGE__TABLE = 1;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_USAGE__PREFIX = 2;

  /**
   * The number of structural features of the '<em>Table Usage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_USAGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.MetaStatementImpl <em>Meta Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.MetaStatementImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMetaStatement()
   * @generated
   */
  int META_STATEMENT = 17;

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
   * The feature id for the '<em><b>Filters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_STATEMENT__FILTERS = 2;

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
  int SQL = 18;

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
  int SQL_FRAGMENT = 19;

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
  int META_SQL = 20;

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
  int IF_SQL = 21;

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
  int IF_SQL_FRAGMENT = 22;

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
  int IF_META_SQL = 23;

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
  int IF_SQL_COND = 24;

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
  int IF_SQL_BOOL = 25;

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
  int ORD_SQL = 26;

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
  int ORD_SQL2 = 27;

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
  int COLUMN = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__TYPE = 1;

  /**
   * The feature id for the '<em><b>Vals</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__VALS = 2;

  /**
   * The number of structural features of the '<em>Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ConstantImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 29;

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
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__TYPE = 2;

  /**
   * The feature id for the '<em><b>Vals</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__VALS = 3;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.IdentifierImpl <em>Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.IdentifierImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getIdentifier()
   * @generated
   */
  int IDENTIFIER = 30;

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
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__TYPE = 3;

  /**
   * The feature id for the '<em><b>Vals</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__VALS = 4;

  /**
   * The number of structural features of the '<em>Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.DatabaseColumnImpl <em>Database Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.DatabaseColumnImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getDatabaseColumn()
   * @generated
   */
  int DATABASE_COLUMN = 31;

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
  int DATABASE_TABLE = 32;

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
  int MAPPING_RULE = 33;

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
   * The feature id for the '<em><b>Filters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_RULE__FILTERS = 2;

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
  int MAPPING = 34;

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
  int MAPPING_ITEM = 35;

  /**
   * The feature id for the '<em><b>Col</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_ITEM__COL = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_ITEM__TYPE = 1;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_ITEM__ATTR = 2;

  /**
   * The number of structural features of the '<em>Mapping Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_ITEM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.MappingColumnImpl <em>Mapping Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.MappingColumnImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMappingColumn()
   * @generated
   */
  int MAPPING_COLUMN = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_COLUMN__NAME = 0;

  /**
   * The feature id for the '<em><b>Vals</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_COLUMN__VALS = 1;

  /**
   * The number of structural features of the '<em>Mapping Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_COLUMN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.OptionalFeatureImpl <em>Optional Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.OptionalFeatureImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getOptionalFeature()
   * @generated
   */
  int OPTIONAL_FEATURE = 37;

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
   * The feature id for the '<em><b>Filters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_FEATURE__FILTERS = 2;

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
  int POJO_TYPE = 38;

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
  int ABSTRACT_POJO_ENTITY = 40;

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
  int PACKAGE_DECLARATION = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__ELEMENTS = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.ImportImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 41;

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
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoEntityImpl <em>Pojo Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PojoEntityImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoEntity()
   * @generated
   */
  int POJO_ENTITY = 42;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY__ABSTRACT = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY__NAME = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_ENTITY__SUPER_TYPE = ABSTRACT_POJO_ENTITY_FEATURE_COUNT + 2;

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
   * The meta object id for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoPropertyImpl <em>Pojo Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sqlproc.dsl.processorDsl.impl.PojoPropertyImpl
   * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoProperty()
   * @generated
   */
  int POJO_PROPERTY = 43;

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
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY__REF = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY__TYPE = 3;

  /**
   * The feature id for the '<em><b>Gref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY__GREF = 4;

  /**
   * The feature id for the '<em><b>Gtype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY__GTYPE = 5;

  /**
   * The feature id for the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY__ARRAY = 6;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY__REQUIRED = 7;

  /**
   * The number of structural features of the '<em>Pojo Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POJO_PROPERTY_FEATURE_COUNT = 8;


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
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.Artifacts#getUsages <em>Usages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usages</em>'.
   * @see org.sqlproc.dsl.processorDsl.Artifacts#getUsages()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_Usages();

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
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.Artifacts#getTableUsages <em>Table Usages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Table Usages</em>'.
   * @see org.sqlproc.dsl.processorDsl.Artifacts#getTableUsages()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_TableUsages();

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
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.Artifacts#getUsagesExt <em>Usages Ext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usages Ext</em>'.
   * @see org.sqlproc.dsl.processorDsl.Artifacts#getUsagesExt()
   * @see #getArtifacts()
   * @generated
   */
  EReference getArtifacts_UsagesExt();

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
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.Property#getDoResolvePojo <em>Do Resolve Pojo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Do Resolve Pojo</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getDoResolvePojo()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_DoResolvePojo();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.Property#getDoResolveDb <em>Do Resolve Db</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Do Resolve Db</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getDoResolveDb()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_DoResolveDb();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.Property#getDbUrl <em>Db Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Url</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getDbUrl()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_DbUrl();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.Property#getDbUsername <em>Db Username</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Username</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getDbUsername()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_DbUsername();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.Property#getDbPassword <em>Db Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Password</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getDbPassword()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_DbPassword();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.Property#getDbSchema <em>Db Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Schema</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getDbSchema()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_DbSchema();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.Property#getDbDriver <em>Db Driver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Driver</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getDbDriver()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_DbDriver();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.Property#getSqlTypeAssignements <em>Sql Type Assignements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sql Type Assignements</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getSqlTypeAssignements()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_SqlTypeAssignements();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.Property#getDbTable <em>Db Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Db Table</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getDbTable()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_DbTable();

  /**
   * Returns the meta object for the containment reference list '{@link org.sqlproc.dsl.processorDsl.Property#getColumnTypeAssignements <em>Column Type Assignements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Column Type Assignements</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getColumnTypeAssignements()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_ColumnTypeAssignements();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.Property#getDbTables <em>Db Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Tables</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getDbTables()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_DbTables();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.Property#getDbColumns <em>Db Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Db Columns</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getDbColumns()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_DbColumns();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.Property#getNewNames <em>New Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>New Names</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getNewNames()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_NewNames();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.Property#getPkTables <em>Pk Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Pk Tables</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getPkTables()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_PkTables();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.Property#getPkColumns <em>Pk Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Pk Columns</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getPkColumns()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_PkColumns();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.Property#getFkTables <em>Fk Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Fk Tables</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getFkTables()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_FkTables();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.Property#getFkColumns <em>Fk Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Fk Columns</em>'.
   * @see org.sqlproc.dsl.processorDsl.Property#getFkColumns()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_FkColumns();

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
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.PojoUsage <em>Pojo Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Usage</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoUsage
   * @generated
   */
  EClass getPojoUsage();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.PojoUsage#getPojo <em>Pojo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pojo</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoUsage#getPojo()
   * @see #getPojoUsage()
   * @generated
   */
  EReference getPojoUsage_Pojo();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.ColumnUsage <em>Column Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Usage</em>'.
   * @see org.sqlproc.dsl.processorDsl.ColumnUsage
   * @generated
   */
  EClass getColumnUsage();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.ColumnUsage#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Statement</em>'.
   * @see org.sqlproc.dsl.processorDsl.ColumnUsage#getStatement()
   * @see #getColumnUsage()
   * @generated
   */
  EReference getColumnUsage_Statement();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.IdentifierUsage <em>Identifier Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifier Usage</em>'.
   * @see org.sqlproc.dsl.processorDsl.IdentifierUsage
   * @generated
   */
  EClass getIdentifierUsage();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.IdentifierUsage#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Statement</em>'.
   * @see org.sqlproc.dsl.processorDsl.IdentifierUsage#getStatement()
   * @see #getIdentifierUsage()
   * @generated
   */
  EReference getIdentifierUsage_Statement();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.ConstantUsage <em>Constant Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Usage</em>'.
   * @see org.sqlproc.dsl.processorDsl.ConstantUsage
   * @generated
   */
  EClass getConstantUsage();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.ConstantUsage#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Statement</em>'.
   * @see org.sqlproc.dsl.processorDsl.ConstantUsage#getStatement()
   * @see #getConstantUsage()
   * @generated
   */
  EReference getConstantUsage_Statement();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.MappingUsage <em>Mapping Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Usage</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingUsage
   * @generated
   */
  EClass getMappingUsage();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.MappingUsage#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Statement</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingUsage#getStatement()
   * @see #getMappingUsage()
   * @generated
   */
  EReference getMappingUsage_Statement();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.PojoUsageExt <em>Pojo Usage Ext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Usage Ext</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoUsageExt
   * @generated
   */
  EClass getPojoUsageExt();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.PojoUsageExt#getPojo <em>Pojo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pojo</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoUsageExt#getPojo()
   * @see #getPojoUsageExt()
   * @generated
   */
  EReference getPojoUsageExt_Pojo();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.ColumnUsageExt <em>Column Usage Ext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Usage Ext</em>'.
   * @see org.sqlproc.dsl.processorDsl.ColumnUsageExt
   * @generated
   */
  EClass getColumnUsageExt();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.ColumnUsageExt#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Statement</em>'.
   * @see org.sqlproc.dsl.processorDsl.ColumnUsageExt#getStatement()
   * @see #getColumnUsageExt()
   * @generated
   */
  EReference getColumnUsageExt_Statement();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.IdentifierUsageExt <em>Identifier Usage Ext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifier Usage Ext</em>'.
   * @see org.sqlproc.dsl.processorDsl.IdentifierUsageExt
   * @generated
   */
  EClass getIdentifierUsageExt();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.IdentifierUsageExt#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Statement</em>'.
   * @see org.sqlproc.dsl.processorDsl.IdentifierUsageExt#getStatement()
   * @see #getIdentifierUsageExt()
   * @generated
   */
  EReference getIdentifierUsageExt_Statement();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.ConstantUsageExt <em>Constant Usage Ext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Usage Ext</em>'.
   * @see org.sqlproc.dsl.processorDsl.ConstantUsageExt
   * @generated
   */
  EClass getConstantUsageExt();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.ConstantUsageExt#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Statement</em>'.
   * @see org.sqlproc.dsl.processorDsl.ConstantUsageExt#getStatement()
   * @see #getConstantUsageExt()
   * @generated
   */
  EReference getConstantUsageExt_Statement();

  /**
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.MappingUsageExt <em>Mapping Usage Ext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Usage Ext</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingUsageExt
   * @generated
   */
  EClass getMappingUsageExt();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.MappingUsageExt#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Statement</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingUsageExt#getStatement()
   * @see #getMappingUsageExt()
   * @generated
   */
  EReference getMappingUsageExt_Statement();

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
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.TableUsage <em>Table Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Usage</em>'.
   * @see org.sqlproc.dsl.processorDsl.TableUsage
   * @generated
   */
  EClass getTableUsage();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.TableUsage#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Statement</em>'.
   * @see org.sqlproc.dsl.processorDsl.TableUsage#getStatement()
   * @see #getTableUsage()
   * @generated
   */
  EReference getTableUsage_Statement();

  /**
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.TableUsage#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Table</em>'.
   * @see org.sqlproc.dsl.processorDsl.TableUsage#getTable()
   * @see #getTableUsage()
   * @generated
   */
  EReference getTableUsage_Table();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.TableUsage#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix</em>'.
   * @see org.sqlproc.dsl.processorDsl.TableUsage#getPrefix()
   * @see #getTableUsage()
   * @generated
   */
  EAttribute getTableUsage_Prefix();

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
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.MetaStatement#getFilters <em>Filters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Filters</em>'.
   * @see org.sqlproc.dsl.processorDsl.MetaStatement#getFilters()
   * @see #getMetaStatement()
   * @generated
   */
  EAttribute getMetaStatement_Filters();

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
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.Column#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.Column#getName()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Name();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.Column#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.Column#getType()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Type();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.Column#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Vals</em>'.
   * @see org.sqlproc.dsl.processorDsl.Column#getVals()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Vals();

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
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.Constant#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.Constant#getType()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Type();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.Constant#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Vals</em>'.
   * @see org.sqlproc.dsl.processorDsl.Constant#getVals()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Vals();

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
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.Identifier#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.Identifier#getType()
   * @see #getIdentifier()
   * @generated
   */
  EAttribute getIdentifier_Type();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.Identifier#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Vals</em>'.
   * @see org.sqlproc.dsl.processorDsl.Identifier#getVals()
   * @see #getIdentifier()
   * @generated
   */
  EAttribute getIdentifier_Vals();

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
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.MappingRule#getFilters <em>Filters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Filters</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingRule#getFilters()
   * @see #getMappingRule()
   * @generated
   */
  EAttribute getMappingRule_Filters();

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
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MappingItem#getCol <em>Col</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Col</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingItem#getCol()
   * @see #getMappingItem()
   * @generated
   */
  EAttribute getMappingItem_Col();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MappingItem#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingItem#getType()
   * @see #getMappingItem()
   * @generated
   */
  EAttribute getMappingItem_Type();

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
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.MappingColumn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingColumn#getName()
   * @see #getMappingColumn()
   * @generated
   */
  EAttribute getMappingColumn_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.MappingColumn#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Vals</em>'.
   * @see org.sqlproc.dsl.processorDsl.MappingColumn#getVals()
   * @see #getMappingColumn()
   * @generated
   */
  EAttribute getMappingColumn_Vals();

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
   * Returns the meta object for the attribute list '{@link org.sqlproc.dsl.processorDsl.OptionalFeature#getFilters <em>Filters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Filters</em>'.
   * @see org.sqlproc.dsl.processorDsl.OptionalFeature#getFilters()
   * @see #getOptionalFeature()
   * @generated
   */
  EAttribute getOptionalFeature_Filters();

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
   * Returns the meta object for class '{@link org.sqlproc.dsl.processorDsl.PojoEntity <em>Pojo Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pojo Entity</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoEntity
   * @generated
   */
  EClass getPojoEntity();

  /**
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoEntity#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoEntity#isAbstract()
   * @see #getPojoEntity()
   * @generated
   */
  EAttribute getPojoEntity_Abstract();

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
   * Returns the meta object for the reference '{@link org.sqlproc.dsl.processorDsl.PojoEntity#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoEntity#getSuperType()
   * @see #getPojoEntity()
   * @generated
   */
  EReference getPojoEntity_SuperType();

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
   * Returns the meta object for the attribute '{@link org.sqlproc.dsl.processorDsl.PojoProperty#isRequired <em>Required</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Required</em>'.
   * @see org.sqlproc.dsl.processorDsl.PojoProperty#isRequired()
   * @see #getPojoProperty()
   * @generated
   */
  EAttribute getPojoProperty_Required();

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
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__FEATURES = eINSTANCE.getArtifacts_Features();

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
     * The meta object literal for the '<em><b>Pojos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__POJOS = eINSTANCE.getArtifacts_Pojos();

    /**
     * The meta object literal for the '<em><b>Usages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__USAGES = eINSTANCE.getArtifacts_Usages();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__PROPERTIES = eINSTANCE.getArtifacts_Properties();

    /**
     * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__TABLES = eINSTANCE.getArtifacts_Tables();

    /**
     * The meta object literal for the '<em><b>Table Usages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__TABLE_USAGES = eINSTANCE.getArtifacts_TableUsages();

    /**
     * The meta object literal for the '<em><b>Pojo Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__POJO_PACKAGES = eINSTANCE.getArtifacts_PojoPackages();

    /**
     * The meta object literal for the '<em><b>Usages Ext</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACTS__USAGES_EXT = eINSTANCE.getArtifacts_UsagesExt();

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
     * The meta object literal for the '<em><b>Do Resolve Pojo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__DO_RESOLVE_POJO = eINSTANCE.getProperty_DoResolvePojo();

    /**
     * The meta object literal for the '<em><b>Do Resolve Db</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__DO_RESOLVE_DB = eINSTANCE.getProperty_DoResolveDb();

    /**
     * The meta object literal for the '<em><b>Db Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__DB_URL = eINSTANCE.getProperty_DbUrl();

    /**
     * The meta object literal for the '<em><b>Db Username</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__DB_USERNAME = eINSTANCE.getProperty_DbUsername();

    /**
     * The meta object literal for the '<em><b>Db Password</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__DB_PASSWORD = eINSTANCE.getProperty_DbPassword();

    /**
     * The meta object literal for the '<em><b>Db Schema</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__DB_SCHEMA = eINSTANCE.getProperty_DbSchema();

    /**
     * The meta object literal for the '<em><b>Db Driver</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__DB_DRIVER = eINSTANCE.getProperty_DbDriver();

    /**
     * The meta object literal for the '<em><b>Sql Type Assignements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__SQL_TYPE_ASSIGNEMENTS = eINSTANCE.getProperty_SqlTypeAssignements();

    /**
     * The meta object literal for the '<em><b>Db Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__DB_TABLE = eINSTANCE.getProperty_DbTable();

    /**
     * The meta object literal for the '<em><b>Column Type Assignements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__COLUMN_TYPE_ASSIGNEMENTS = eINSTANCE.getProperty_ColumnTypeAssignements();

    /**
     * The meta object literal for the '<em><b>Db Tables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__DB_TABLES = eINSTANCE.getProperty_DbTables();

    /**
     * The meta object literal for the '<em><b>Db Columns</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__DB_COLUMNS = eINSTANCE.getProperty_DbColumns();

    /**
     * The meta object literal for the '<em><b>New Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NEW_NAMES = eINSTANCE.getProperty_NewNames();

    /**
     * The meta object literal for the '<em><b>Pk Tables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__PK_TABLES = eINSTANCE.getProperty_PkTables();

    /**
     * The meta object literal for the '<em><b>Pk Columns</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__PK_COLUMNS = eINSTANCE.getProperty_PkColumns();

    /**
     * The meta object literal for the '<em><b>Fk Tables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__FK_TABLES = eINSTANCE.getProperty_FkTables();

    /**
     * The meta object literal for the '<em><b>Fk Columns</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__FK_COLUMNS = eINSTANCE.getProperty_FkColumns();

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
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoUsageImpl <em>Pojo Usage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.PojoUsageImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoUsage()
     * @generated
     */
    EClass POJO_USAGE = eINSTANCE.getPojoUsage();

    /**
     * The meta object literal for the '<em><b>Pojo</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_USAGE__POJO = eINSTANCE.getPojoUsage_Pojo();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ColumnUsageImpl <em>Column Usage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ColumnUsageImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getColumnUsage()
     * @generated
     */
    EClass COLUMN_USAGE = eINSTANCE.getColumnUsage();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_USAGE__STATEMENT = eINSTANCE.getColumnUsage_Statement();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.IdentifierUsageImpl <em>Identifier Usage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.IdentifierUsageImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getIdentifierUsage()
     * @generated
     */
    EClass IDENTIFIER_USAGE = eINSTANCE.getIdentifierUsage();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTIFIER_USAGE__STATEMENT = eINSTANCE.getIdentifierUsage_Statement();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ConstantUsageImpl <em>Constant Usage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ConstantUsageImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getConstantUsage()
     * @generated
     */
    EClass CONSTANT_USAGE = eINSTANCE.getConstantUsage();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_USAGE__STATEMENT = eINSTANCE.getConstantUsage_Statement();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.MappingUsageImpl <em>Mapping Usage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.MappingUsageImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMappingUsage()
     * @generated
     */
    EClass MAPPING_USAGE = eINSTANCE.getMappingUsage();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_USAGE__STATEMENT = eINSTANCE.getMappingUsage_Statement();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoUsageExtImpl <em>Pojo Usage Ext</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.PojoUsageExtImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoUsageExt()
     * @generated
     */
    EClass POJO_USAGE_EXT = eINSTANCE.getPojoUsageExt();

    /**
     * The meta object literal for the '<em><b>Pojo</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_USAGE_EXT__POJO = eINSTANCE.getPojoUsageExt_Pojo();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ColumnUsageExtImpl <em>Column Usage Ext</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ColumnUsageExtImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getColumnUsageExt()
     * @generated
     */
    EClass COLUMN_USAGE_EXT = eINSTANCE.getColumnUsageExt();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_USAGE_EXT__STATEMENT = eINSTANCE.getColumnUsageExt_Statement();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.IdentifierUsageExtImpl <em>Identifier Usage Ext</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.IdentifierUsageExtImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getIdentifierUsageExt()
     * @generated
     */
    EClass IDENTIFIER_USAGE_EXT = eINSTANCE.getIdentifierUsageExt();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTIFIER_USAGE_EXT__STATEMENT = eINSTANCE.getIdentifierUsageExt_Statement();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.ConstantUsageExtImpl <em>Constant Usage Ext</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.ConstantUsageExtImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getConstantUsageExt()
     * @generated
     */
    EClass CONSTANT_USAGE_EXT = eINSTANCE.getConstantUsageExt();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_USAGE_EXT__STATEMENT = eINSTANCE.getConstantUsageExt_Statement();

    /**
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.MappingUsageExtImpl <em>Mapping Usage Ext</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.MappingUsageExtImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getMappingUsageExt()
     * @generated
     */
    EClass MAPPING_USAGE_EXT = eINSTANCE.getMappingUsageExt();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_USAGE_EXT__STATEMENT = eINSTANCE.getMappingUsageExt_Statement();

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
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.TableUsageImpl <em>Table Usage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.TableUsageImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getTableUsage()
     * @generated
     */
    EClass TABLE_USAGE = eINSTANCE.getTableUsage();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_USAGE__STATEMENT = eINSTANCE.getTableUsage_Statement();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_USAGE__TABLE = eINSTANCE.getTableUsage_Table();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_USAGE__PREFIX = eINSTANCE.getTableUsage_Prefix();

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
     * The meta object literal for the '<em><b>Filters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_STATEMENT__FILTERS = eINSTANCE.getMetaStatement_Filters();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__VALS = eINSTANCE.getColumn_Vals();

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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__TYPE = eINSTANCE.getConstant_Type();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__VALS = eINSTANCE.getConstant_Vals();

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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFIER__TYPE = eINSTANCE.getIdentifier_Type();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFIER__VALS = eINSTANCE.getIdentifier_Vals();

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
     * The meta object literal for the '<em><b>Filters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_RULE__FILTERS = eINSTANCE.getMappingRule_Filters();

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
     * The meta object literal for the '<em><b>Col</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_ITEM__COL = eINSTANCE.getMappingItem_Col();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_ITEM__TYPE = eINSTANCE.getMappingItem_Type();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_COLUMN__NAME = eINSTANCE.getMappingColumn_Name();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_COLUMN__VALS = eINSTANCE.getMappingColumn_Vals();

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
     * The meta object literal for the '<em><b>Filters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTIONAL_FEATURE__FILTERS = eINSTANCE.getOptionalFeature_Filters();

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
     * The meta object literal for the '{@link org.sqlproc.dsl.processorDsl.impl.PojoEntityImpl <em>Pojo Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sqlproc.dsl.processorDsl.impl.PojoEntityImpl
     * @see org.sqlproc.dsl.processorDsl.impl.ProcessorDslPackageImpl#getPojoEntity()
     * @generated
     */
    EClass POJO_ENTITY = eINSTANCE.getPojoEntity();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_ENTITY__ABSTRACT = eINSTANCE.getPojoEntity_Abstract();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_ENTITY__NAME = eINSTANCE.getPojoEntity_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_ENTITY__SUPER_TYPE = eINSTANCE.getPojoEntity_SuperType();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POJO_ENTITY__FEATURES = eINSTANCE.getPojoEntity_Features();

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
     * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POJO_PROPERTY__REQUIRED = eINSTANCE.getPojoProperty_Required();

  }

} //ProcessorDslPackage
