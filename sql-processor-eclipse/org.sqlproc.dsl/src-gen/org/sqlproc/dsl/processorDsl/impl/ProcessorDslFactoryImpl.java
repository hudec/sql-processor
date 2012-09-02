/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sqlproc.dsl.processorDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessorDslFactoryImpl extends EFactoryImpl implements ProcessorDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ProcessorDslFactory init()
  {
    try
    {
      ProcessorDslFactory theProcessorDslFactory = (ProcessorDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sqlproc.org/dsl/ProcessorDsl"); 
      if (theProcessorDslFactory != null)
      {
        return theProcessorDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ProcessorDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessorDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ProcessorDslPackage.ARTIFACTS: return createArtifacts();
      case ProcessorDslPackage.PROPERTY: return createProperty();
      case ProcessorDslPackage.POJO_DEFINITION: return createPojoDefinition();
      case ProcessorDslPackage.POJO_USAGE: return createPojoUsage();
      case ProcessorDslPackage.COLUMN_USAGE: return createColumnUsage();
      case ProcessorDslPackage.IDENTIFIER_USAGE: return createIdentifierUsage();
      case ProcessorDslPackage.CONSTANT_USAGE: return createConstantUsage();
      case ProcessorDslPackage.MAPPING_USAGE: return createMappingUsage();
      case ProcessorDslPackage.POJO_USAGE_EXT: return createPojoUsageExt();
      case ProcessorDslPackage.COLUMN_USAGE_EXT: return createColumnUsageExt();
      case ProcessorDslPackage.IDENTIFIER_USAGE_EXT: return createIdentifierUsageExt();
      case ProcessorDslPackage.CONSTANT_USAGE_EXT: return createConstantUsageExt();
      case ProcessorDslPackage.MAPPING_USAGE_EXT: return createMappingUsageExt();
      case ProcessorDslPackage.TABLE_DEFINITION: return createTableDefinition();
      case ProcessorDslPackage.TABLE_USAGE: return createTableUsage();
      case ProcessorDslPackage.META_STATEMENT: return createMetaStatement();
      case ProcessorDslPackage.SQL: return createSql();
      case ProcessorDslPackage.SQL_FRAGMENT: return createSqlFragment();
      case ProcessorDslPackage.META_SQL: return createMetaSql();
      case ProcessorDslPackage.IF_SQL: return createIfSql();
      case ProcessorDslPackage.IF_SQL_FRAGMENT: return createIfSqlFragment();
      case ProcessorDslPackage.IF_META_SQL: return createIfMetaSql();
      case ProcessorDslPackage.IF_SQL_COND: return createIfSqlCond();
      case ProcessorDslPackage.IF_SQL_BOOL: return createIfSqlBool();
      case ProcessorDslPackage.ORD_SQL: return createOrdSql();
      case ProcessorDslPackage.ORD_SQL2: return createOrdSql2();
      case ProcessorDslPackage.COLUMN: return createColumn();
      case ProcessorDslPackage.CONSTANT: return createConstant();
      case ProcessorDslPackage.IDENTIFIER: return createIdentifier();
      case ProcessorDslPackage.DATABASE_COLUMN: return createDatabaseColumn();
      case ProcessorDslPackage.DATABASE_TABLE: return createDatabaseTable();
      case ProcessorDslPackage.MAPPING_RULE: return createMappingRule();
      case ProcessorDslPackage.MAPPING: return createMapping();
      case ProcessorDslPackage.MAPPING_ITEM: return createMappingItem();
      case ProcessorDslPackage.MAPPING_COLUMN: return createMappingColumn();
      case ProcessorDslPackage.OPTIONAL_FEATURE: return createOptionalFeature();
      case ProcessorDslPackage.POJO_TYPE: return createPojoType();
      case ProcessorDslPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case ProcessorDslPackage.ABSTRACT_POJO_ENTITY: return createAbstractPojoEntity();
      case ProcessorDslPackage.IMPORT: return createImport();
      case ProcessorDslPackage.POJO_ENTITY: return createPojoEntity();
      case ProcessorDslPackage.POJO_PROPERTY: return createPojoProperty();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Artifacts createArtifacts()
  {
    ArtifactsImpl artifacts = new ArtifactsImpl();
    return artifacts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoDefinition createPojoDefinition()
  {
    PojoDefinitionImpl pojoDefinition = new PojoDefinitionImpl();
    return pojoDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoUsage createPojoUsage()
  {
    PojoUsageImpl pojoUsage = new PojoUsageImpl();
    return pojoUsage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnUsage createColumnUsage()
  {
    ColumnUsageImpl columnUsage = new ColumnUsageImpl();
    return columnUsage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierUsage createIdentifierUsage()
  {
    IdentifierUsageImpl identifierUsage = new IdentifierUsageImpl();
    return identifierUsage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantUsage createConstantUsage()
  {
    ConstantUsageImpl constantUsage = new ConstantUsageImpl();
    return constantUsage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingUsage createMappingUsage()
  {
    MappingUsageImpl mappingUsage = new MappingUsageImpl();
    return mappingUsage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoUsageExt createPojoUsageExt()
  {
    PojoUsageExtImpl pojoUsageExt = new PojoUsageExtImpl();
    return pojoUsageExt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnUsageExt createColumnUsageExt()
  {
    ColumnUsageExtImpl columnUsageExt = new ColumnUsageExtImpl();
    return columnUsageExt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierUsageExt createIdentifierUsageExt()
  {
    IdentifierUsageExtImpl identifierUsageExt = new IdentifierUsageExtImpl();
    return identifierUsageExt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantUsageExt createConstantUsageExt()
  {
    ConstantUsageExtImpl constantUsageExt = new ConstantUsageExtImpl();
    return constantUsageExt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingUsageExt createMappingUsageExt()
  {
    MappingUsageExtImpl mappingUsageExt = new MappingUsageExtImpl();
    return mappingUsageExt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableDefinition createTableDefinition()
  {
    TableDefinitionImpl tableDefinition = new TableDefinitionImpl();
    return tableDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableUsage createTableUsage()
  {
    TableUsageImpl tableUsage = new TableUsageImpl();
    return tableUsage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaStatement createMetaStatement()
  {
    MetaStatementImpl metaStatement = new MetaStatementImpl();
    return metaStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sql createSql()
  {
    SqlImpl sql = new SqlImpl();
    return sql;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqlFragment createSqlFragment()
  {
    SqlFragmentImpl sqlFragment = new SqlFragmentImpl();
    return sqlFragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaSql createMetaSql()
  {
    MetaSqlImpl metaSql = new MetaSqlImpl();
    return metaSql;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfSql createIfSql()
  {
    IfSqlImpl ifSql = new IfSqlImpl();
    return ifSql;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfSqlFragment createIfSqlFragment()
  {
    IfSqlFragmentImpl ifSqlFragment = new IfSqlFragmentImpl();
    return ifSqlFragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfMetaSql createIfMetaSql()
  {
    IfMetaSqlImpl ifMetaSql = new IfMetaSqlImpl();
    return ifMetaSql;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfSqlCond createIfSqlCond()
  {
    IfSqlCondImpl ifSqlCond = new IfSqlCondImpl();
    return ifSqlCond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfSqlBool createIfSqlBool()
  {
    IfSqlBoolImpl ifSqlBool = new IfSqlBoolImpl();
    return ifSqlBool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrdSql createOrdSql()
  {
    OrdSqlImpl ordSql = new OrdSqlImpl();
    return ordSql;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrdSql2 createOrdSql2()
  {
    OrdSql2Impl ordSql2 = new OrdSql2Impl();
    return ordSql2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Column createColumn()
  {
    ColumnImpl column = new ColumnImpl();
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Identifier createIdentifier()
  {
    IdentifierImpl identifier = new IdentifierImpl();
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseColumn createDatabaseColumn()
  {
    DatabaseColumnImpl databaseColumn = new DatabaseColumnImpl();
    return databaseColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseTable createDatabaseTable()
  {
    DatabaseTableImpl databaseTable = new DatabaseTableImpl();
    return databaseTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingRule createMappingRule()
  {
    MappingRuleImpl mappingRule = new MappingRuleImpl();
    return mappingRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping createMapping()
  {
    MappingImpl mapping = new MappingImpl();
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingItem createMappingItem()
  {
    MappingItemImpl mappingItem = new MappingItemImpl();
    return mappingItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingColumn createMappingColumn()
  {
    MappingColumnImpl mappingColumn = new MappingColumnImpl();
    return mappingColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionalFeature createOptionalFeature()
  {
    OptionalFeatureImpl optionalFeature = new OptionalFeatureImpl();
    return optionalFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoType createPojoType()
  {
    PojoTypeImpl pojoType = new PojoTypeImpl();
    return pojoType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractPojoEntity createAbstractPojoEntity()
  {
    AbstractPojoEntityImpl abstractPojoEntity = new AbstractPojoEntityImpl();
    return abstractPojoEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoEntity createPojoEntity()
  {
    PojoEntityImpl pojoEntity = new PojoEntityImpl();
    return pojoEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoProperty createPojoProperty()
  {
    PojoPropertyImpl pojoProperty = new PojoPropertyImpl();
    return pojoProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessorDslPackage getProcessorDslPackage()
  {
    return (ProcessorDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ProcessorDslPackage getPackage()
  {
    return ProcessorDslPackage.eINSTANCE;
  }

} //ProcessorDslFactoryImpl
