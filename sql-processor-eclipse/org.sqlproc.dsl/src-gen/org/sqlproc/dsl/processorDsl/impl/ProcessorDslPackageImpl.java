/**
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.sqlproc.dsl.processorDsl.AbstractPojoEntity;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.processorDsl.Column;
import org.sqlproc.dsl.processorDsl.ColumnAssignement;
import org.sqlproc.dsl.processorDsl.ColumnTypeAssignement;
import org.sqlproc.dsl.processorDsl.ColumnUsage;
import org.sqlproc.dsl.processorDsl.ColumnUsageExt;
import org.sqlproc.dsl.processorDsl.Constant;
import org.sqlproc.dsl.processorDsl.ConstantUsage;
import org.sqlproc.dsl.processorDsl.ConstantUsageExt;
import org.sqlproc.dsl.processorDsl.DatabaseColumn;
import org.sqlproc.dsl.processorDsl.DatabaseProperty;
import org.sqlproc.dsl.processorDsl.DatabaseTable;
import org.sqlproc.dsl.processorDsl.ExportAssignement;
import org.sqlproc.dsl.processorDsl.Extends;
import org.sqlproc.dsl.processorDsl.Identifier;
import org.sqlproc.dsl.processorDsl.IdentifierUsage;
import org.sqlproc.dsl.processorDsl.IdentifierUsageExt;
import org.sqlproc.dsl.processorDsl.IfMetaSql;
import org.sqlproc.dsl.processorDsl.IfSql;
import org.sqlproc.dsl.processorDsl.IfSqlBool;
import org.sqlproc.dsl.processorDsl.IfSqlCond;
import org.sqlproc.dsl.processorDsl.IfSqlFragment;
import org.sqlproc.dsl.processorDsl.Implements;
import org.sqlproc.dsl.processorDsl.Import;
import org.sqlproc.dsl.processorDsl.ImportAssignement;
import org.sqlproc.dsl.processorDsl.InheritanceAssignement;
import org.sqlproc.dsl.processorDsl.JoinTableAssignement;
import org.sqlproc.dsl.processorDsl.ManyToManyAssignement;
import org.sqlproc.dsl.processorDsl.Mapping;
import org.sqlproc.dsl.processorDsl.MappingColumn;
import org.sqlproc.dsl.processorDsl.MappingItem;
import org.sqlproc.dsl.processorDsl.MappingRule;
import org.sqlproc.dsl.processorDsl.MappingUsage;
import org.sqlproc.dsl.processorDsl.MappingUsageExt;
import org.sqlproc.dsl.processorDsl.MetaSql;
import org.sqlproc.dsl.processorDsl.MetaStatement;
import org.sqlproc.dsl.processorDsl.MetaTypeAssignement;
import org.sqlproc.dsl.processorDsl.MetagenProperty;
import org.sqlproc.dsl.processorDsl.OptionalFeature;
import org.sqlproc.dsl.processorDsl.OrdSql;
import org.sqlproc.dsl.processorDsl.OrdSql2;
import org.sqlproc.dsl.processorDsl.PackageDeclaration;
import org.sqlproc.dsl.processorDsl.PojoDefinition;
import org.sqlproc.dsl.processorDsl.PojoEntity;
import org.sqlproc.dsl.processorDsl.PojoEntityModifier1;
import org.sqlproc.dsl.processorDsl.PojoEntityModifier2;
import org.sqlproc.dsl.processorDsl.PojoProperty;
import org.sqlproc.dsl.processorDsl.PojoPropertyModifier;
import org.sqlproc.dsl.processorDsl.PojoType;
import org.sqlproc.dsl.processorDsl.PojoUsage;
import org.sqlproc.dsl.processorDsl.PojoUsageExt;
import org.sqlproc.dsl.processorDsl.PojogenProperty;
import org.sqlproc.dsl.processorDsl.ProcessorDslFactory;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;
import org.sqlproc.dsl.processorDsl.Property;
import org.sqlproc.dsl.processorDsl.ShowColumnTypeAssignement;
import org.sqlproc.dsl.processorDsl.Sql;
import org.sqlproc.dsl.processorDsl.SqlFragment;
import org.sqlproc.dsl.processorDsl.SqlTypeAssignement;
import org.sqlproc.dsl.processorDsl.TableAssignement;
import org.sqlproc.dsl.processorDsl.TableDefinition;
import org.sqlproc.dsl.processorDsl.TableUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessorDslPackageImpl extends EPackageImpl implements ProcessorDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass artifactsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sqlTypeAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnTypeAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass showColumnTypeAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass joinTableAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exportAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inheritanceAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass manyToManyAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass databasePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojogenPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaTypeAssignementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metagenPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoUsageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnUsageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identifierUsageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantUsageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingUsageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoUsageExtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnUsageExtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identifierUsageExtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantUsageExtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingUsageExtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableUsageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sqlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sqlFragmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaSqlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifSqlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifSqlFragmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifMetaSqlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifSqlCondEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifSqlBoolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ordSqlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ordSql2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass databaseColumnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass databaseTableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingColumnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionalFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractPojoEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass implementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extendsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoEntityModifier1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoEntityModifier2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoPropertyModifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pojoPropertyEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ProcessorDslPackageImpl()
  {
    super(eNS_URI, ProcessorDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ProcessorDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ProcessorDslPackage init()
  {
    if (isInited) return (ProcessorDslPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessorDslPackage.eNS_URI);

    // Obtain or create and register package
    ProcessorDslPackageImpl theProcessorDslPackage = (ProcessorDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProcessorDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProcessorDslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    TypesPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theProcessorDslPackage.createPackageContents();

    // Initialize created meta-data
    theProcessorDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theProcessorDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ProcessorDslPackage.eNS_URI, theProcessorDslPackage);
    return theProcessorDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArtifacts()
  {
    return artifactsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_Features()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_Statements()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_Mappings()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_Pojos()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_Usages()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_Properties()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_Tables()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_TableUsages()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_PojoPackages()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifacts_UsagesExt()
  {
    return (EReference)artifactsEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSqlTypeAssignement()
  {
    return sqlTypeAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSqlTypeAssignement_TypeName()
  {
    return (EAttribute)sqlTypeAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSqlTypeAssignement_Size()
  {
    return (EAttribute)sqlTypeAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSqlTypeAssignement_Type()
  {
    return (EReference)sqlTypeAssignementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnTypeAssignement()
  {
    return columnTypeAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnTypeAssignement_DbColumn()
  {
    return (EAttribute)columnTypeAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnTypeAssignement_Type()
  {
    return (EReference)columnTypeAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShowColumnTypeAssignement()
  {
    return showColumnTypeAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getShowColumnTypeAssignement_DbColumn()
  {
    return (EAttribute)showColumnTypeAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getShowColumnTypeAssignement_Type()
  {
    return (EAttribute)showColumnTypeAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableAssignement()
  {
    return tableAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableAssignement_DbTable()
  {
    return (EAttribute)tableAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableAssignement_NewName()
  {
    return (EAttribute)tableAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJoinTableAssignement()
  {
    return joinTableAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinTableAssignement_DbTable()
  {
    return (EAttribute)joinTableAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinTableAssignement_DbTables()
  {
    return (EAttribute)joinTableAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnAssignement()
  {
    return columnAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnAssignement_DbColumn()
  {
    return (EAttribute)columnAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnAssignement_NewName()
  {
    return (EAttribute)columnAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportAssignement()
  {
    return importAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportAssignement_DbColumn()
  {
    return (EAttribute)importAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportAssignement_PkTable()
  {
    return (EAttribute)importAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportAssignement_PkColumn()
  {
    return (EAttribute)importAssignementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExportAssignement()
  {
    return exportAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExportAssignement_DbColumn()
  {
    return (EAttribute)exportAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExportAssignement_FkTable()
  {
    return (EAttribute)exportAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExportAssignement_FkColumn()
  {
    return (EAttribute)exportAssignementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInheritanceAssignement()
  {
    return inheritanceAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInheritanceAssignement_Discriminator()
  {
    return (EAttribute)inheritanceAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInheritanceAssignement_DbTable()
  {
    return (EAttribute)inheritanceAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInheritanceAssignement_DbColumns()
  {
    return (EAttribute)inheritanceAssignementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getManyToManyAssignement()
  {
    return manyToManyAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManyToManyAssignement_PkColumn()
  {
    return (EAttribute)manyToManyAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManyToManyAssignement_PkTable()
  {
    return (EAttribute)manyToManyAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManyToManyAssignement_FkColumn()
  {
    return (EAttribute)manyToManyAssignementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Name()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Database()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Pojogen()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Metagen()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatabaseProperty()
  {
    return databasePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseProperty_Name()
  {
    return (EAttribute)databasePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseProperty_DbUrl()
  {
    return (EAttribute)databasePropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseProperty_DbUsername()
  {
    return (EAttribute)databasePropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseProperty_DbPassword()
  {
    return (EAttribute)databasePropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseProperty_DbSchema()
  {
    return (EAttribute)databasePropertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseProperty_DbDriver()
  {
    return (EAttribute)databasePropertyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseProperty_DbExecuteBefore()
  {
    return (EAttribute)databasePropertyEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseProperty_DbExecuteAfter()
  {
    return (EAttribute)databasePropertyEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojogenProperty()
  {
    return pojogenPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_Name()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_SqlTypes()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_DbTable()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_ColumnTypes()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_ColumnType()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_DbTables()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_JoinTables()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_DbColumns()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_Tables()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_Columns()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_Exports()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_Imports()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_Many2s()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_DbColumn()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_Inheritance()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojogenProperty_Methods()
  {
    return (EAttribute)pojogenPropertyEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_ToImplements()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojogenProperty_ToExtends()
  {
    return (EReference)pojogenPropertyEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaTypeAssignement()
  {
    return metaTypeAssignementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaTypeAssignement_DbColumn()
  {
    return (EAttribute)metaTypeAssignementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaTypeAssignement_Type()
  {
    return (EAttribute)metaTypeAssignementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaTypeAssignement_Extension()
  {
    return (EAttribute)metaTypeAssignementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetagenProperty()
  {
    return metagenPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetagenProperty_Name()
  {
    return (EAttribute)metagenPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetagenProperty_Sequence()
  {
    return (EAttribute)metagenPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetagenProperty_Type()
  {
    return (EAttribute)metagenPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetagenProperty_DbTable()
  {
    return (EAttribute)metagenPropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetagenProperty_Identity()
  {
    return (EAttribute)metagenPropertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetagenProperty_MetaTypes()
  {
    return (EReference)metagenPropertyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetagenProperty_DbStatement()
  {
    return (EAttribute)metagenPropertyEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoDefinition()
  {
    return pojoDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoDefinition_Name()
  {
    return (EAttribute)pojoDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoDefinition_Class()
  {
    return (EAttribute)pojoDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoUsage()
  {
    return pojoUsageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoUsage_Pojo()
  {
    return (EReference)pojoUsageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnUsage()
  {
    return columnUsageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnUsage_Statement()
  {
    return (EReference)columnUsageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdentifierUsage()
  {
    return identifierUsageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdentifierUsage_Statement()
  {
    return (EReference)identifierUsageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantUsage()
  {
    return constantUsageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantUsage_Statement()
  {
    return (EReference)constantUsageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingUsage()
  {
    return mappingUsageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingUsage_Statement()
  {
    return (EReference)mappingUsageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoUsageExt()
  {
    return pojoUsageExtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoUsageExt_Pojo()
  {
    return (EReference)pojoUsageExtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnUsageExt()
  {
    return columnUsageExtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnUsageExt_Statement()
  {
    return (EReference)columnUsageExtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdentifierUsageExt()
  {
    return identifierUsageExtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdentifierUsageExt_Statement()
  {
    return (EReference)identifierUsageExtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantUsageExt()
  {
    return constantUsageExtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantUsageExt_Statement()
  {
    return (EReference)constantUsageExtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingUsageExt()
  {
    return mappingUsageExtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingUsageExt_Statement()
  {
    return (EReference)mappingUsageExtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableDefinition()
  {
    return tableDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableDefinition_Name()
  {
    return (EAttribute)tableDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableDefinition_Table()
  {
    return (EAttribute)tableDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableUsage()
  {
    return tableUsageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableUsage_Statement()
  {
    return (EReference)tableUsageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableUsage_Table()
  {
    return (EReference)tableUsageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableUsage_Prefix()
  {
    return (EAttribute)tableUsageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaStatement()
  {
    return metaStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaStatement_Name()
  {
    return (EAttribute)metaStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaStatement_Type()
  {
    return (EAttribute)metaStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaStatement_Filters()
  {
    return (EAttribute)metaStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaStatement_Statement()
  {
    return (EReference)metaStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSql()
  {
    return sqlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSql_Sqls()
  {
    return (EReference)sqlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSqlFragment()
  {
    return sqlFragmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSqlFragment_Value()
  {
    return (EAttribute)sqlFragmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSqlFragment_Col()
  {
    return (EReference)sqlFragmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSqlFragment_Cnst()
  {
    return (EReference)sqlFragmentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSqlFragment_Ident()
  {
    return (EReference)sqlFragmentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSqlFragment_Meta()
  {
    return (EReference)sqlFragmentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSqlFragment_Dbtab()
  {
    return (EReference)sqlFragmentEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSqlFragment_Dbcol()
  {
    return (EReference)sqlFragmentEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaSql()
  {
    return metaSqlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaSql_Ifs()
  {
    return (EReference)metaSqlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaSql_Type()
  {
    return (EAttribute)metaSqlEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaSql_Cond()
  {
    return (EReference)metaSqlEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaSql_Ftype()
  {
    return (EAttribute)metaSqlEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaSql_Ord()
  {
    return (EReference)metaSqlEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfSql()
  {
    return ifSqlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSql_Sqls()
  {
    return (EReference)ifSqlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfSqlFragment()
  {
    return ifSqlFragmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIfSqlFragment_Value()
  {
    return (EAttribute)ifSqlFragmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlFragment_Col()
  {
    return (EReference)ifSqlFragmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlFragment_Cnst()
  {
    return (EReference)ifSqlFragmentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlFragment_Ident()
  {
    return (EReference)ifSqlFragmentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlFragment_Dbtab()
  {
    return (EReference)ifSqlFragmentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlFragment_Dbcol()
  {
    return (EReference)ifSqlFragmentEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlFragment_Meta()
  {
    return (EReference)ifSqlFragmentEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfMetaSql()
  {
    return ifMetaSqlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfMetaSql_Ifs()
  {
    return (EReference)ifMetaSqlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIfMetaSql_Type()
  {
    return (EAttribute)ifMetaSqlEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfMetaSql_Cond()
  {
    return (EReference)ifMetaSqlEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfSqlCond()
  {
    return ifSqlCondEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlCond_Bool1()
  {
    return (EReference)ifSqlCondEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIfSqlCond_Oper()
  {
    return (EAttribute)ifSqlCondEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlCond_Bool2()
  {
    return (EReference)ifSqlCondEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfSqlBool()
  {
    return ifSqlBoolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIfSqlBool_Not()
  {
    return (EAttribute)ifSqlBoolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlBool_Cnst()
  {
    return (EReference)ifSqlBoolEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlBool_Ident()
  {
    return (EReference)ifSqlBoolEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSqlBool_Cond()
  {
    return (EReference)ifSqlBoolEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrdSql()
  {
    return ordSqlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrdSql_Sqls()
  {
    return (EReference)ordSqlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrdSql2()
  {
    return ordSql2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrdSql2_Value()
  {
    return (EAttribute)ordSql2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrdSql2_Cnst()
  {
    return (EReference)ordSql2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrdSql2_Ident()
  {
    return (EReference)ordSql2EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrdSql2_Dbcol()
  {
    return (EReference)ordSql2EClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumn()
  {
    return columnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumn_Name()
  {
    return (EAttribute)columnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumn_Type()
  {
    return (EAttribute)columnEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumn_Vals()
  {
    return (EAttribute)columnEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_Case()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_Name()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_Type()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_Vals()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdentifier()
  {
    return identifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifier_Mode()
  {
    return (EAttribute)identifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifier_Case()
  {
    return (EAttribute)identifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifier_Name()
  {
    return (EAttribute)identifierEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifier_Type()
  {
    return (EAttribute)identifierEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifier_Vals()
  {
    return (EAttribute)identifierEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatabaseColumn()
  {
    return databaseColumnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseColumn_Name()
  {
    return (EAttribute)databaseColumnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatabaseTable()
  {
    return databaseTableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseTable_Name()
  {
    return (EAttribute)databaseTableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingRule()
  {
    return mappingRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingRule_Name()
  {
    return (EAttribute)mappingRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingRule_Type()
  {
    return (EAttribute)mappingRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingRule_Filters()
  {
    return (EAttribute)mappingRuleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingRule_Mapping()
  {
    return (EReference)mappingRuleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMapping()
  {
    return mappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapping_MappingItems()
  {
    return (EReference)mappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingItem()
  {
    return mappingItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingItem_Col()
  {
    return (EAttribute)mappingItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingItem_Type()
  {
    return (EAttribute)mappingItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingItem_Attr()
  {
    return (EReference)mappingItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingColumn()
  {
    return mappingColumnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingColumn_Name()
  {
    return (EAttribute)mappingColumnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingColumn_Vals()
  {
    return (EAttribute)mappingColumnEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptionalFeature()
  {
    return optionalFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOptionalFeature_Name()
  {
    return (EAttribute)optionalFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOptionalFeature_Type()
  {
    return (EAttribute)optionalFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOptionalFeature_Filters()
  {
    return (EAttribute)optionalFeatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOptionalFeature_Option()
  {
    return (EAttribute)optionalFeatureEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoType()
  {
    return pojoTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoType_Native()
  {
    return (EAttribute)pojoTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoType_Ref()
  {
    return (EReference)pojoTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoType_Type()
  {
    return (EReference)pojoTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoType_Gref()
  {
    return (EReference)pojoTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoType_Gtype()
  {
    return (EReference)pojoTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoType_Array()
  {
    return (EAttribute)pojoTypeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageDeclaration()
  {
    return packageDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDeclaration_Name()
  {
    return (EAttribute)packageDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDeclaration_Suffix()
  {
    return (EAttribute)packageDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageDeclaration_Elements()
  {
    return (EReference)packageDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractPojoEntity()
  {
    return abstractPojoEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImplements()
  {
    return implementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplements_Implements()
  {
    return (EReference)implementsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtends()
  {
    return extendsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtends_Extends()
  {
    return (EReference)extendsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoEntityModifier1()
  {
    return pojoEntityModifier1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoEntityModifier1_Final()
  {
    return (EAttribute)pojoEntityModifier1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoEntityModifier1_Abstract()
  {
    return (EAttribute)pojoEntityModifier1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoEntityModifier2()
  {
    return pojoEntityModifier2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoEntityModifier2_SuperType()
  {
    return (EReference)pojoEntityModifier2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoEntityModifier2_Discriminator()
  {
    return (EAttribute)pojoEntityModifier2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoEntityModifier2_Sernum()
  {
    return (EAttribute)pojoEntityModifier2EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoEntity()
  {
    return pojoEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoEntity_Modifiers1()
  {
    return (EReference)pojoEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoEntity_Name()
  {
    return (EAttribute)pojoEntityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoEntity_Modifiers2()
  {
    return (EReference)pojoEntityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoEntity_Features()
  {
    return (EReference)pojoEntityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoPropertyModifier()
  {
    return pojoPropertyModifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoPropertyModifier_Required()
  {
    return (EAttribute)pojoPropertyModifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoPropertyModifier_Discriminator()
  {
    return (EAttribute)pojoPropertyModifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoPropertyModifier_PrimaryKey()
  {
    return (EAttribute)pojoPropertyModifierEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPojoProperty()
  {
    return pojoPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoProperty_Name()
  {
    return (EAttribute)pojoPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoProperty_Native()
  {
    return (EAttribute)pojoPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoProperty_Attrs()
  {
    return (EReference)pojoPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoProperty_Ref()
  {
    return (EReference)pojoPropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoProperty_Type()
  {
    return (EReference)pojoPropertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoProperty_Gref()
  {
    return (EReference)pojoPropertyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoProperty_Gtype()
  {
    return (EReference)pojoPropertyEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPojoProperty_Array()
  {
    return (EAttribute)pojoPropertyEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPojoProperty_Modifiers()
  {
    return (EReference)pojoPropertyEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessorDslFactory getProcessorDslFactory()
  {
    return (ProcessorDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    artifactsEClass = createEClass(ARTIFACTS);
    createEReference(artifactsEClass, ARTIFACTS__FEATURES);
    createEReference(artifactsEClass, ARTIFACTS__STATEMENTS);
    createEReference(artifactsEClass, ARTIFACTS__MAPPINGS);
    createEReference(artifactsEClass, ARTIFACTS__POJOS);
    createEReference(artifactsEClass, ARTIFACTS__USAGES);
    createEReference(artifactsEClass, ARTIFACTS__PROPERTIES);
    createEReference(artifactsEClass, ARTIFACTS__TABLES);
    createEReference(artifactsEClass, ARTIFACTS__TABLE_USAGES);
    createEReference(artifactsEClass, ARTIFACTS__POJO_PACKAGES);
    createEReference(artifactsEClass, ARTIFACTS__USAGES_EXT);

    sqlTypeAssignementEClass = createEClass(SQL_TYPE_ASSIGNEMENT);
    createEAttribute(sqlTypeAssignementEClass, SQL_TYPE_ASSIGNEMENT__TYPE_NAME);
    createEAttribute(sqlTypeAssignementEClass, SQL_TYPE_ASSIGNEMENT__SIZE);
    createEReference(sqlTypeAssignementEClass, SQL_TYPE_ASSIGNEMENT__TYPE);

    columnTypeAssignementEClass = createEClass(COLUMN_TYPE_ASSIGNEMENT);
    createEAttribute(columnTypeAssignementEClass, COLUMN_TYPE_ASSIGNEMENT__DB_COLUMN);
    createEReference(columnTypeAssignementEClass, COLUMN_TYPE_ASSIGNEMENT__TYPE);

    showColumnTypeAssignementEClass = createEClass(SHOW_COLUMN_TYPE_ASSIGNEMENT);
    createEAttribute(showColumnTypeAssignementEClass, SHOW_COLUMN_TYPE_ASSIGNEMENT__DB_COLUMN);
    createEAttribute(showColumnTypeAssignementEClass, SHOW_COLUMN_TYPE_ASSIGNEMENT__TYPE);

    tableAssignementEClass = createEClass(TABLE_ASSIGNEMENT);
    createEAttribute(tableAssignementEClass, TABLE_ASSIGNEMENT__DB_TABLE);
    createEAttribute(tableAssignementEClass, TABLE_ASSIGNEMENT__NEW_NAME);

    joinTableAssignementEClass = createEClass(JOIN_TABLE_ASSIGNEMENT);
    createEAttribute(joinTableAssignementEClass, JOIN_TABLE_ASSIGNEMENT__DB_TABLE);
    createEAttribute(joinTableAssignementEClass, JOIN_TABLE_ASSIGNEMENT__DB_TABLES);

    columnAssignementEClass = createEClass(COLUMN_ASSIGNEMENT);
    createEAttribute(columnAssignementEClass, COLUMN_ASSIGNEMENT__DB_COLUMN);
    createEAttribute(columnAssignementEClass, COLUMN_ASSIGNEMENT__NEW_NAME);

    importAssignementEClass = createEClass(IMPORT_ASSIGNEMENT);
    createEAttribute(importAssignementEClass, IMPORT_ASSIGNEMENT__DB_COLUMN);
    createEAttribute(importAssignementEClass, IMPORT_ASSIGNEMENT__PK_TABLE);
    createEAttribute(importAssignementEClass, IMPORT_ASSIGNEMENT__PK_COLUMN);

    exportAssignementEClass = createEClass(EXPORT_ASSIGNEMENT);
    createEAttribute(exportAssignementEClass, EXPORT_ASSIGNEMENT__DB_COLUMN);
    createEAttribute(exportAssignementEClass, EXPORT_ASSIGNEMENT__FK_TABLE);
    createEAttribute(exportAssignementEClass, EXPORT_ASSIGNEMENT__FK_COLUMN);

    inheritanceAssignementEClass = createEClass(INHERITANCE_ASSIGNEMENT);
    createEAttribute(inheritanceAssignementEClass, INHERITANCE_ASSIGNEMENT__DISCRIMINATOR);
    createEAttribute(inheritanceAssignementEClass, INHERITANCE_ASSIGNEMENT__DB_TABLE);
    createEAttribute(inheritanceAssignementEClass, INHERITANCE_ASSIGNEMENT__DB_COLUMNS);

    manyToManyAssignementEClass = createEClass(MANY_TO_MANY_ASSIGNEMENT);
    createEAttribute(manyToManyAssignementEClass, MANY_TO_MANY_ASSIGNEMENT__PK_COLUMN);
    createEAttribute(manyToManyAssignementEClass, MANY_TO_MANY_ASSIGNEMENT__PK_TABLE);
    createEAttribute(manyToManyAssignementEClass, MANY_TO_MANY_ASSIGNEMENT__FK_COLUMN);

    propertyEClass = createEClass(PROPERTY);
    createEAttribute(propertyEClass, PROPERTY__NAME);
    createEReference(propertyEClass, PROPERTY__DATABASE);
    createEReference(propertyEClass, PROPERTY__POJOGEN);
    createEReference(propertyEClass, PROPERTY__METAGEN);

    databasePropertyEClass = createEClass(DATABASE_PROPERTY);
    createEAttribute(databasePropertyEClass, DATABASE_PROPERTY__NAME);
    createEAttribute(databasePropertyEClass, DATABASE_PROPERTY__DB_URL);
    createEAttribute(databasePropertyEClass, DATABASE_PROPERTY__DB_USERNAME);
    createEAttribute(databasePropertyEClass, DATABASE_PROPERTY__DB_PASSWORD);
    createEAttribute(databasePropertyEClass, DATABASE_PROPERTY__DB_SCHEMA);
    createEAttribute(databasePropertyEClass, DATABASE_PROPERTY__DB_DRIVER);
    createEAttribute(databasePropertyEClass, DATABASE_PROPERTY__DB_EXECUTE_BEFORE);
    createEAttribute(databasePropertyEClass, DATABASE_PROPERTY__DB_EXECUTE_AFTER);

    pojogenPropertyEClass = createEClass(POJOGEN_PROPERTY);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__NAME);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__SQL_TYPES);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__DB_TABLE);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__COLUMN_TYPES);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__COLUMN_TYPE);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__DB_TABLES);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__JOIN_TABLES);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__DB_COLUMNS);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__TABLES);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__COLUMNS);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__EXPORTS);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__IMPORTS);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__MANY2S);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__DB_COLUMN);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__INHERITANCE);
    createEAttribute(pojogenPropertyEClass, POJOGEN_PROPERTY__METHODS);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__TO_IMPLEMENTS);
    createEReference(pojogenPropertyEClass, POJOGEN_PROPERTY__TO_EXTENDS);

    metaTypeAssignementEClass = createEClass(META_TYPE_ASSIGNEMENT);
    createEAttribute(metaTypeAssignementEClass, META_TYPE_ASSIGNEMENT__DB_COLUMN);
    createEAttribute(metaTypeAssignementEClass, META_TYPE_ASSIGNEMENT__TYPE);
    createEAttribute(metaTypeAssignementEClass, META_TYPE_ASSIGNEMENT__EXTENSION);

    metagenPropertyEClass = createEClass(METAGEN_PROPERTY);
    createEAttribute(metagenPropertyEClass, METAGEN_PROPERTY__NAME);
    createEAttribute(metagenPropertyEClass, METAGEN_PROPERTY__SEQUENCE);
    createEAttribute(metagenPropertyEClass, METAGEN_PROPERTY__TYPE);
    createEAttribute(metagenPropertyEClass, METAGEN_PROPERTY__DB_TABLE);
    createEAttribute(metagenPropertyEClass, METAGEN_PROPERTY__IDENTITY);
    createEReference(metagenPropertyEClass, METAGEN_PROPERTY__META_TYPES);
    createEAttribute(metagenPropertyEClass, METAGEN_PROPERTY__DB_STATEMENT);

    pojoDefinitionEClass = createEClass(POJO_DEFINITION);
    createEAttribute(pojoDefinitionEClass, POJO_DEFINITION__NAME);
    createEAttribute(pojoDefinitionEClass, POJO_DEFINITION__CLASS);

    pojoUsageEClass = createEClass(POJO_USAGE);
    createEReference(pojoUsageEClass, POJO_USAGE__POJO);

    columnUsageEClass = createEClass(COLUMN_USAGE);
    createEReference(columnUsageEClass, COLUMN_USAGE__STATEMENT);

    identifierUsageEClass = createEClass(IDENTIFIER_USAGE);
    createEReference(identifierUsageEClass, IDENTIFIER_USAGE__STATEMENT);

    constantUsageEClass = createEClass(CONSTANT_USAGE);
    createEReference(constantUsageEClass, CONSTANT_USAGE__STATEMENT);

    mappingUsageEClass = createEClass(MAPPING_USAGE);
    createEReference(mappingUsageEClass, MAPPING_USAGE__STATEMENT);

    pojoUsageExtEClass = createEClass(POJO_USAGE_EXT);
    createEReference(pojoUsageExtEClass, POJO_USAGE_EXT__POJO);

    columnUsageExtEClass = createEClass(COLUMN_USAGE_EXT);
    createEReference(columnUsageExtEClass, COLUMN_USAGE_EXT__STATEMENT);

    identifierUsageExtEClass = createEClass(IDENTIFIER_USAGE_EXT);
    createEReference(identifierUsageExtEClass, IDENTIFIER_USAGE_EXT__STATEMENT);

    constantUsageExtEClass = createEClass(CONSTANT_USAGE_EXT);
    createEReference(constantUsageExtEClass, CONSTANT_USAGE_EXT__STATEMENT);

    mappingUsageExtEClass = createEClass(MAPPING_USAGE_EXT);
    createEReference(mappingUsageExtEClass, MAPPING_USAGE_EXT__STATEMENT);

    tableDefinitionEClass = createEClass(TABLE_DEFINITION);
    createEAttribute(tableDefinitionEClass, TABLE_DEFINITION__NAME);
    createEAttribute(tableDefinitionEClass, TABLE_DEFINITION__TABLE);

    tableUsageEClass = createEClass(TABLE_USAGE);
    createEReference(tableUsageEClass, TABLE_USAGE__STATEMENT);
    createEReference(tableUsageEClass, TABLE_USAGE__TABLE);
    createEAttribute(tableUsageEClass, TABLE_USAGE__PREFIX);

    metaStatementEClass = createEClass(META_STATEMENT);
    createEAttribute(metaStatementEClass, META_STATEMENT__NAME);
    createEAttribute(metaStatementEClass, META_STATEMENT__TYPE);
    createEAttribute(metaStatementEClass, META_STATEMENT__FILTERS);
    createEReference(metaStatementEClass, META_STATEMENT__STATEMENT);

    sqlEClass = createEClass(SQL);
    createEReference(sqlEClass, SQL__SQLS);

    sqlFragmentEClass = createEClass(SQL_FRAGMENT);
    createEAttribute(sqlFragmentEClass, SQL_FRAGMENT__VALUE);
    createEReference(sqlFragmentEClass, SQL_FRAGMENT__COL);
    createEReference(sqlFragmentEClass, SQL_FRAGMENT__CNST);
    createEReference(sqlFragmentEClass, SQL_FRAGMENT__IDENT);
    createEReference(sqlFragmentEClass, SQL_FRAGMENT__META);
    createEReference(sqlFragmentEClass, SQL_FRAGMENT__DBTAB);
    createEReference(sqlFragmentEClass, SQL_FRAGMENT__DBCOL);

    metaSqlEClass = createEClass(META_SQL);
    createEReference(metaSqlEClass, META_SQL__IFS);
    createEAttribute(metaSqlEClass, META_SQL__TYPE);
    createEReference(metaSqlEClass, META_SQL__COND);
    createEAttribute(metaSqlEClass, META_SQL__FTYPE);
    createEReference(metaSqlEClass, META_SQL__ORD);

    ifSqlEClass = createEClass(IF_SQL);
    createEReference(ifSqlEClass, IF_SQL__SQLS);

    ifSqlFragmentEClass = createEClass(IF_SQL_FRAGMENT);
    createEAttribute(ifSqlFragmentEClass, IF_SQL_FRAGMENT__VALUE);
    createEReference(ifSqlFragmentEClass, IF_SQL_FRAGMENT__COL);
    createEReference(ifSqlFragmentEClass, IF_SQL_FRAGMENT__CNST);
    createEReference(ifSqlFragmentEClass, IF_SQL_FRAGMENT__IDENT);
    createEReference(ifSqlFragmentEClass, IF_SQL_FRAGMENT__DBTAB);
    createEReference(ifSqlFragmentEClass, IF_SQL_FRAGMENT__DBCOL);
    createEReference(ifSqlFragmentEClass, IF_SQL_FRAGMENT__META);

    ifMetaSqlEClass = createEClass(IF_META_SQL);
    createEReference(ifMetaSqlEClass, IF_META_SQL__IFS);
    createEAttribute(ifMetaSqlEClass, IF_META_SQL__TYPE);
    createEReference(ifMetaSqlEClass, IF_META_SQL__COND);

    ifSqlCondEClass = createEClass(IF_SQL_COND);
    createEReference(ifSqlCondEClass, IF_SQL_COND__BOOL1);
    createEAttribute(ifSqlCondEClass, IF_SQL_COND__OPER);
    createEReference(ifSqlCondEClass, IF_SQL_COND__BOOL2);

    ifSqlBoolEClass = createEClass(IF_SQL_BOOL);
    createEAttribute(ifSqlBoolEClass, IF_SQL_BOOL__NOT);
    createEReference(ifSqlBoolEClass, IF_SQL_BOOL__CNST);
    createEReference(ifSqlBoolEClass, IF_SQL_BOOL__IDENT);
    createEReference(ifSqlBoolEClass, IF_SQL_BOOL__COND);

    ordSqlEClass = createEClass(ORD_SQL);
    createEReference(ordSqlEClass, ORD_SQL__SQLS);

    ordSql2EClass = createEClass(ORD_SQL2);
    createEAttribute(ordSql2EClass, ORD_SQL2__VALUE);
    createEReference(ordSql2EClass, ORD_SQL2__CNST);
    createEReference(ordSql2EClass, ORD_SQL2__IDENT);
    createEReference(ordSql2EClass, ORD_SQL2__DBCOL);

    columnEClass = createEClass(COLUMN);
    createEAttribute(columnEClass, COLUMN__NAME);
    createEAttribute(columnEClass, COLUMN__TYPE);
    createEAttribute(columnEClass, COLUMN__VALS);

    constantEClass = createEClass(CONSTANT);
    createEAttribute(constantEClass, CONSTANT__CASE);
    createEAttribute(constantEClass, CONSTANT__NAME);
    createEAttribute(constantEClass, CONSTANT__TYPE);
    createEAttribute(constantEClass, CONSTANT__VALS);

    identifierEClass = createEClass(IDENTIFIER);
    createEAttribute(identifierEClass, IDENTIFIER__MODE);
    createEAttribute(identifierEClass, IDENTIFIER__CASE);
    createEAttribute(identifierEClass, IDENTIFIER__NAME);
    createEAttribute(identifierEClass, IDENTIFIER__TYPE);
    createEAttribute(identifierEClass, IDENTIFIER__VALS);

    databaseColumnEClass = createEClass(DATABASE_COLUMN);
    createEAttribute(databaseColumnEClass, DATABASE_COLUMN__NAME);

    databaseTableEClass = createEClass(DATABASE_TABLE);
    createEAttribute(databaseTableEClass, DATABASE_TABLE__NAME);

    mappingRuleEClass = createEClass(MAPPING_RULE);
    createEAttribute(mappingRuleEClass, MAPPING_RULE__NAME);
    createEAttribute(mappingRuleEClass, MAPPING_RULE__TYPE);
    createEAttribute(mappingRuleEClass, MAPPING_RULE__FILTERS);
    createEReference(mappingRuleEClass, MAPPING_RULE__MAPPING);

    mappingEClass = createEClass(MAPPING);
    createEReference(mappingEClass, MAPPING__MAPPING_ITEMS);

    mappingItemEClass = createEClass(MAPPING_ITEM);
    createEAttribute(mappingItemEClass, MAPPING_ITEM__COL);
    createEAttribute(mappingItemEClass, MAPPING_ITEM__TYPE);
    createEReference(mappingItemEClass, MAPPING_ITEM__ATTR);

    mappingColumnEClass = createEClass(MAPPING_COLUMN);
    createEAttribute(mappingColumnEClass, MAPPING_COLUMN__NAME);
    createEAttribute(mappingColumnEClass, MAPPING_COLUMN__VALS);

    optionalFeatureEClass = createEClass(OPTIONAL_FEATURE);
    createEAttribute(optionalFeatureEClass, OPTIONAL_FEATURE__NAME);
    createEAttribute(optionalFeatureEClass, OPTIONAL_FEATURE__TYPE);
    createEAttribute(optionalFeatureEClass, OPTIONAL_FEATURE__FILTERS);
    createEAttribute(optionalFeatureEClass, OPTIONAL_FEATURE__OPTION);

    pojoTypeEClass = createEClass(POJO_TYPE);
    createEAttribute(pojoTypeEClass, POJO_TYPE__NATIVE);
    createEReference(pojoTypeEClass, POJO_TYPE__REF);
    createEReference(pojoTypeEClass, POJO_TYPE__TYPE);
    createEReference(pojoTypeEClass, POJO_TYPE__GREF);
    createEReference(pojoTypeEClass, POJO_TYPE__GTYPE);
    createEAttribute(pojoTypeEClass, POJO_TYPE__ARRAY);

    packageDeclarationEClass = createEClass(PACKAGE_DECLARATION);
    createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__NAME);
    createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__SUFFIX);
    createEReference(packageDeclarationEClass, PACKAGE_DECLARATION__ELEMENTS);

    abstractPojoEntityEClass = createEClass(ABSTRACT_POJO_ENTITY);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    implementsEClass = createEClass(IMPLEMENTS);
    createEReference(implementsEClass, IMPLEMENTS__IMPLEMENTS);

    extendsEClass = createEClass(EXTENDS);
    createEReference(extendsEClass, EXTENDS__EXTENDS);

    pojoEntityModifier1EClass = createEClass(POJO_ENTITY_MODIFIER1);
    createEAttribute(pojoEntityModifier1EClass, POJO_ENTITY_MODIFIER1__FINAL);
    createEAttribute(pojoEntityModifier1EClass, POJO_ENTITY_MODIFIER1__ABSTRACT);

    pojoEntityModifier2EClass = createEClass(POJO_ENTITY_MODIFIER2);
    createEReference(pojoEntityModifier2EClass, POJO_ENTITY_MODIFIER2__SUPER_TYPE);
    createEAttribute(pojoEntityModifier2EClass, POJO_ENTITY_MODIFIER2__DISCRIMINATOR);
    createEAttribute(pojoEntityModifier2EClass, POJO_ENTITY_MODIFIER2__SERNUM);

    pojoEntityEClass = createEClass(POJO_ENTITY);
    createEReference(pojoEntityEClass, POJO_ENTITY__MODIFIERS1);
    createEAttribute(pojoEntityEClass, POJO_ENTITY__NAME);
    createEReference(pojoEntityEClass, POJO_ENTITY__MODIFIERS2);
    createEReference(pojoEntityEClass, POJO_ENTITY__FEATURES);

    pojoPropertyModifierEClass = createEClass(POJO_PROPERTY_MODIFIER);
    createEAttribute(pojoPropertyModifierEClass, POJO_PROPERTY_MODIFIER__REQUIRED);
    createEAttribute(pojoPropertyModifierEClass, POJO_PROPERTY_MODIFIER__DISCRIMINATOR);
    createEAttribute(pojoPropertyModifierEClass, POJO_PROPERTY_MODIFIER__PRIMARY_KEY);

    pojoPropertyEClass = createEClass(POJO_PROPERTY);
    createEAttribute(pojoPropertyEClass, POJO_PROPERTY__NAME);
    createEAttribute(pojoPropertyEClass, POJO_PROPERTY__NATIVE);
    createEReference(pojoPropertyEClass, POJO_PROPERTY__ATTRS);
    createEReference(pojoPropertyEClass, POJO_PROPERTY__REF);
    createEReference(pojoPropertyEClass, POJO_PROPERTY__TYPE);
    createEReference(pojoPropertyEClass, POJO_PROPERTY__GREF);
    createEReference(pojoPropertyEClass, POJO_PROPERTY__GTYPE);
    createEAttribute(pojoPropertyEClass, POJO_PROPERTY__ARRAY);
    createEReference(pojoPropertyEClass, POJO_PROPERTY__MODIFIERS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    columnUsageEClass.getESuperTypes().add(this.getPojoUsage());
    identifierUsageEClass.getESuperTypes().add(this.getPojoUsage());
    constantUsageEClass.getESuperTypes().add(this.getPojoUsage());
    mappingUsageEClass.getESuperTypes().add(this.getPojoUsage());
    columnUsageExtEClass.getESuperTypes().add(this.getPojoUsageExt());
    identifierUsageExtEClass.getESuperTypes().add(this.getPojoUsageExt());
    constantUsageExtEClass.getESuperTypes().add(this.getPojoUsageExt());
    mappingUsageExtEClass.getESuperTypes().add(this.getPojoUsageExt());
    packageDeclarationEClass.getESuperTypes().add(this.getAbstractPojoEntity());
    importEClass.getESuperTypes().add(this.getAbstractPojoEntity());
    implementsEClass.getESuperTypes().add(this.getAbstractPojoEntity());
    extendsEClass.getESuperTypes().add(this.getAbstractPojoEntity());
    pojoEntityEClass.getESuperTypes().add(this.getAbstractPojoEntity());

    // Initialize classes and features; add operations and parameters
    initEClass(artifactsEClass, Artifacts.class, "Artifacts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArtifacts_Features(), this.getOptionalFeature(), null, "features", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifacts_Statements(), this.getMetaStatement(), null, "statements", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifacts_Mappings(), this.getMappingRule(), null, "mappings", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifacts_Pojos(), this.getPojoDefinition(), null, "pojos", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifacts_Usages(), this.getPojoUsage(), null, "usages", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifacts_Properties(), this.getProperty(), null, "properties", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifacts_Tables(), this.getTableDefinition(), null, "tables", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifacts_TableUsages(), this.getTableUsage(), null, "tableUsages", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifacts_PojoPackages(), this.getPackageDeclaration(), null, "pojoPackages", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifacts_UsagesExt(), this.getPojoUsageExt(), null, "usagesExt", null, 0, -1, Artifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sqlTypeAssignementEClass, SqlTypeAssignement.class, "SqlTypeAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSqlTypeAssignement_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, SqlTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSqlTypeAssignement_Size(), ecorePackage.getEString(), "size", null, 0, 1, SqlTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSqlTypeAssignement_Type(), this.getPojoType(), null, "type", null, 0, 1, SqlTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnTypeAssignementEClass, ColumnTypeAssignement.class, "ColumnTypeAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColumnTypeAssignement_DbColumn(), ecorePackage.getEString(), "dbColumn", null, 0, 1, ColumnTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColumnTypeAssignement_Type(), this.getPojoType(), null, "type", null, 0, 1, ColumnTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(showColumnTypeAssignementEClass, ShowColumnTypeAssignement.class, "ShowColumnTypeAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getShowColumnTypeAssignement_DbColumn(), ecorePackage.getEString(), "dbColumn", null, 0, 1, ShowColumnTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getShowColumnTypeAssignement_Type(), ecorePackage.getEString(), "type", null, 0, 1, ShowColumnTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableAssignementEClass, TableAssignement.class, "TableAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTableAssignement_DbTable(), ecorePackage.getEString(), "dbTable", null, 0, 1, TableAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTableAssignement_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, TableAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(joinTableAssignementEClass, JoinTableAssignement.class, "JoinTableAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJoinTableAssignement_DbTable(), ecorePackage.getEString(), "dbTable", null, 0, 1, JoinTableAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJoinTableAssignement_DbTables(), ecorePackage.getEString(), "dbTables", null, 0, -1, JoinTableAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnAssignementEClass, ColumnAssignement.class, "ColumnAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColumnAssignement_DbColumn(), ecorePackage.getEString(), "dbColumn", null, 0, 1, ColumnAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumnAssignement_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, ColumnAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importAssignementEClass, ImportAssignement.class, "ImportAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportAssignement_DbColumn(), ecorePackage.getEString(), "dbColumn", null, 0, 1, ImportAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportAssignement_PkTable(), ecorePackage.getEString(), "pkTable", null, 0, 1, ImportAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportAssignement_PkColumn(), ecorePackage.getEString(), "pkColumn", null, 0, 1, ImportAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exportAssignementEClass, ExportAssignement.class, "ExportAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExportAssignement_DbColumn(), ecorePackage.getEString(), "dbColumn", null, 0, 1, ExportAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExportAssignement_FkTable(), ecorePackage.getEString(), "fkTable", null, 0, 1, ExportAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExportAssignement_FkColumn(), ecorePackage.getEString(), "fkColumn", null, 0, 1, ExportAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inheritanceAssignementEClass, InheritanceAssignement.class, "InheritanceAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInheritanceAssignement_Discriminator(), ecorePackage.getEString(), "discriminator", null, 0, 1, InheritanceAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInheritanceAssignement_DbTable(), ecorePackage.getEString(), "dbTable", null, 0, 1, InheritanceAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInheritanceAssignement_DbColumns(), ecorePackage.getEString(), "dbColumns", null, 0, -1, InheritanceAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(manyToManyAssignementEClass, ManyToManyAssignement.class, "ManyToManyAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getManyToManyAssignement_PkColumn(), ecorePackage.getEString(), "pkColumn", null, 0, 1, ManyToManyAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getManyToManyAssignement_PkTable(), ecorePackage.getEString(), "pkTable", null, 0, 1, ManyToManyAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getManyToManyAssignement_FkColumn(), ecorePackage.getEString(), "fkColumn", null, 0, 1, ManyToManyAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Database(), this.getDatabaseProperty(), null, "database", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Pojogen(), this.getPojogenProperty(), null, "pojogen", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Metagen(), this.getMetagenProperty(), null, "metagen", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(databasePropertyEClass, DatabaseProperty.class, "DatabaseProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatabaseProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabaseProperty_DbUrl(), ecorePackage.getEString(), "dbUrl", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabaseProperty_DbUsername(), ecorePackage.getEString(), "dbUsername", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabaseProperty_DbPassword(), ecorePackage.getEString(), "dbPassword", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabaseProperty_DbSchema(), ecorePackage.getEString(), "dbSchema", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabaseProperty_DbDriver(), ecorePackage.getEString(), "dbDriver", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabaseProperty_DbExecuteBefore(), ecorePackage.getEString(), "dbExecuteBefore", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabaseProperty_DbExecuteAfter(), ecorePackage.getEString(), "dbExecuteAfter", null, 0, 1, DatabaseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojogenPropertyEClass, PojogenProperty.class, "PojogenProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPojogenProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_SqlTypes(), this.getSqlTypeAssignement(), null, "sqlTypes", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojogenProperty_DbTable(), ecorePackage.getEString(), "dbTable", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_ColumnTypes(), this.getColumnTypeAssignement(), null, "columnTypes", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_ColumnType(), this.getShowColumnTypeAssignement(), null, "columnType", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojogenProperty_DbTables(), ecorePackage.getEString(), "dbTables", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_JoinTables(), this.getJoinTableAssignement(), null, "joinTables", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojogenProperty_DbColumns(), ecorePackage.getEString(), "dbColumns", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_Tables(), this.getTableAssignement(), null, "tables", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_Columns(), this.getColumnAssignement(), null, "columns", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_Exports(), this.getExportAssignement(), null, "exports", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_Imports(), this.getImportAssignement(), null, "imports", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_Many2s(), this.getManyToManyAssignement(), null, "many2s", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojogenProperty_DbColumn(), ecorePackage.getEString(), "dbColumn", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_Inheritance(), this.getInheritanceAssignement(), null, "inheritance", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojogenProperty_Methods(), ecorePackage.getEString(), "methods", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_ToImplements(), theTypesPackage.getJvmType(), null, "toImplements", null, 0, -1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojogenProperty_ToExtends(), theTypesPackage.getJvmType(), null, "toExtends", null, 0, 1, PojogenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaTypeAssignementEClass, MetaTypeAssignement.class, "MetaTypeAssignement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetaTypeAssignement_DbColumn(), ecorePackage.getEString(), "dbColumn", null, 0, 1, MetaTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaTypeAssignement_Type(), ecorePackage.getEString(), "type", null, 0, 1, MetaTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaTypeAssignement_Extension(), ecorePackage.getEString(), "extension", null, 0, 1, MetaTypeAssignement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metagenPropertyEClass, MetagenProperty.class, "MetagenProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetagenProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetagenProperty_Sequence(), ecorePackage.getEString(), "sequence", null, 0, 1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetagenProperty_Type(), ecorePackage.getEString(), "type", null, 0, 1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetagenProperty_DbTable(), ecorePackage.getEString(), "dbTable", null, 0, 1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetagenProperty_Identity(), ecorePackage.getEString(), "identity", null, 0, 1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetagenProperty_MetaTypes(), this.getMetaTypeAssignement(), null, "metaTypes", null, 0, -1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetagenProperty_DbStatement(), ecorePackage.getEString(), "dbStatement", null, 0, 1, MetagenProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoDefinitionEClass, PojoDefinition.class, "PojoDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPojoDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, PojoDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoDefinition_Class(), ecorePackage.getEString(), "class", null, 0, 1, PojoDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoUsageEClass, PojoUsage.class, "PojoUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPojoUsage_Pojo(), this.getPojoDefinition(), null, "pojo", null, 0, 1, PojoUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnUsageEClass, ColumnUsage.class, "ColumnUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getColumnUsage_Statement(), this.getMetaStatement(), null, "statement", null, 0, 1, ColumnUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(identifierUsageEClass, IdentifierUsage.class, "IdentifierUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIdentifierUsage_Statement(), this.getMetaStatement(), null, "statement", null, 0, 1, IdentifierUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantUsageEClass, ConstantUsage.class, "ConstantUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantUsage_Statement(), this.getMetaStatement(), null, "statement", null, 0, 1, ConstantUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingUsageEClass, MappingUsage.class, "MappingUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMappingUsage_Statement(), this.getMappingRule(), null, "statement", null, 0, 1, MappingUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoUsageExtEClass, PojoUsageExt.class, "PojoUsageExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPojoUsageExt_Pojo(), this.getPojoEntity(), null, "pojo", null, 0, 1, PojoUsageExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnUsageExtEClass, ColumnUsageExt.class, "ColumnUsageExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getColumnUsageExt_Statement(), this.getMetaStatement(), null, "statement", null, 0, 1, ColumnUsageExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(identifierUsageExtEClass, IdentifierUsageExt.class, "IdentifierUsageExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIdentifierUsageExt_Statement(), this.getMetaStatement(), null, "statement", null, 0, 1, IdentifierUsageExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantUsageExtEClass, ConstantUsageExt.class, "ConstantUsageExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantUsageExt_Statement(), this.getMetaStatement(), null, "statement", null, 0, 1, ConstantUsageExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingUsageExtEClass, MappingUsageExt.class, "MappingUsageExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMappingUsageExt_Statement(), this.getMappingRule(), null, "statement", null, 0, 1, MappingUsageExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableDefinitionEClass, TableDefinition.class, "TableDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTableDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, TableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTableDefinition_Table(), ecorePackage.getEString(), "table", null, 0, 1, TableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableUsageEClass, TableUsage.class, "TableUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTableUsage_Statement(), this.getMetaStatement(), null, "statement", null, 0, 1, TableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableUsage_Table(), this.getTableDefinition(), null, "table", null, 0, 1, TableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTableUsage_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, TableUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaStatementEClass, MetaStatement.class, "MetaStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetaStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetaStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaStatement_Type(), ecorePackage.getEString(), "type", null, 0, 1, MetaStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaStatement_Filters(), ecorePackage.getEString(), "filters", null, 0, -1, MetaStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaStatement_Statement(), this.getSql(), null, "statement", null, 0, 1, MetaStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sqlEClass, Sql.class, "Sql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSql_Sqls(), this.getSqlFragment(), null, "sqls", null, 0, -1, Sql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sqlFragmentEClass, SqlFragment.class, "SqlFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSqlFragment_Value(), ecorePackage.getEString(), "value", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSqlFragment_Col(), this.getColumn(), null, "col", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSqlFragment_Cnst(), this.getConstant(), null, "cnst", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSqlFragment_Ident(), this.getIdentifier(), null, "ident", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSqlFragment_Meta(), this.getMetaSql(), null, "meta", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSqlFragment_Dbtab(), this.getDatabaseTable(), null, "dbtab", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSqlFragment_Dbcol(), this.getDatabaseColumn(), null, "dbcol", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaSqlEClass, MetaSql.class, "MetaSql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMetaSql_Ifs(), this.getIfSql(), null, "ifs", null, 0, -1, MetaSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaSql_Type(), ecorePackage.getEString(), "type", null, 0, 1, MetaSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaSql_Cond(), this.getIfSqlCond(), null, "cond", null, 0, 1, MetaSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaSql_Ftype(), ecorePackage.getEString(), "ftype", null, 0, 1, MetaSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaSql_Ord(), this.getOrdSql(), null, "ord", null, 0, 1, MetaSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifSqlEClass, IfSql.class, "IfSql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfSql_Sqls(), this.getIfSqlFragment(), null, "sqls", null, 0, -1, IfSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifSqlFragmentEClass, IfSqlFragment.class, "IfSqlFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIfSqlFragment_Value(), ecorePackage.getEString(), "value", null, 0, 1, IfSqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlFragment_Col(), this.getColumn(), null, "col", null, 0, 1, IfSqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlFragment_Cnst(), this.getConstant(), null, "cnst", null, 0, 1, IfSqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlFragment_Ident(), this.getIdentifier(), null, "ident", null, 0, 1, IfSqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlFragment_Dbtab(), this.getDatabaseTable(), null, "dbtab", null, 0, 1, IfSqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlFragment_Dbcol(), this.getDatabaseColumn(), null, "dbcol", null, 0, 1, IfSqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlFragment_Meta(), this.getIfMetaSql(), null, "meta", null, 0, 1, IfSqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifMetaSqlEClass, IfMetaSql.class, "IfMetaSql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfMetaSql_Ifs(), this.getIfSql(), null, "ifs", null, 0, -1, IfMetaSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIfMetaSql_Type(), ecorePackage.getEString(), "type", null, 0, 1, IfMetaSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfMetaSql_Cond(), this.getIfSqlCond(), null, "cond", null, 0, 1, IfMetaSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifSqlCondEClass, IfSqlCond.class, "IfSqlCond", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfSqlCond_Bool1(), this.getIfSqlBool(), null, "bool1", null, 0, 1, IfSqlCond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIfSqlCond_Oper(), ecorePackage.getEString(), "oper", null, 0, -1, IfSqlCond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlCond_Bool2(), this.getIfSqlBool(), null, "bool2", null, 0, -1, IfSqlCond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifSqlBoolEClass, IfSqlBool.class, "IfSqlBool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIfSqlBool_Not(), ecorePackage.getEBoolean(), "not", null, 0, 1, IfSqlBool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlBool_Cnst(), this.getConstant(), null, "cnst", null, 0, 1, IfSqlBool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlBool_Ident(), this.getIdentifier(), null, "ident", null, 0, 1, IfSqlBool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSqlBool_Cond(), this.getIfSqlCond(), null, "cond", null, 0, 1, IfSqlBool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ordSqlEClass, OrdSql.class, "OrdSql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrdSql_Sqls(), this.getOrdSql2(), null, "sqls", null, 0, -1, OrdSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ordSql2EClass, OrdSql2.class, "OrdSql2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOrdSql2_Value(), ecorePackage.getEString(), "value", null, 0, 1, OrdSql2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrdSql2_Cnst(), this.getConstant(), null, "cnst", null, 0, 1, OrdSql2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrdSql2_Ident(), this.getIdentifier(), null, "ident", null, 0, 1, OrdSql2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrdSql2_Dbcol(), this.getDatabaseColumn(), null, "dbcol", null, 0, 1, OrdSql2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColumn_Name(), ecorePackage.getEString(), "name", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumn_Type(), ecorePackage.getEString(), "type", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumn_Vals(), ecorePackage.getEString(), "vals", null, 0, -1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstant_Case(), ecorePackage.getEString(), "case", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstant_Name(), ecorePackage.getEString(), "name", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstant_Type(), ecorePackage.getEString(), "type", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstant_Vals(), ecorePackage.getEString(), "vals", null, 0, -1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(identifierEClass, Identifier.class, "Identifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIdentifier_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIdentifier_Case(), ecorePackage.getEString(), "case", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIdentifier_Name(), ecorePackage.getEString(), "name", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIdentifier_Type(), ecorePackage.getEString(), "type", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIdentifier_Vals(), ecorePackage.getEString(), "vals", null, 0, -1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(databaseColumnEClass, DatabaseColumn.class, "DatabaseColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatabaseColumn_Name(), ecorePackage.getEString(), "name", null, 0, 1, DatabaseColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(databaseTableEClass, DatabaseTable.class, "DatabaseTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatabaseTable_Name(), ecorePackage.getEString(), "name", null, 0, 1, DatabaseTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingRuleEClass, MappingRule.class, "MappingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMappingRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMappingRule_Type(), ecorePackage.getEString(), "type", null, 0, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMappingRule_Filters(), ecorePackage.getEString(), "filters", null, 0, -1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingRule_Mapping(), this.getMapping(), null, "mapping", null, 0, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMapping_MappingItems(), this.getMappingItem(), null, "mappingItems", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingItemEClass, MappingItem.class, "MappingItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMappingItem_Col(), ecorePackage.getEString(), "col", null, 0, 1, MappingItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMappingItem_Type(), ecorePackage.getEString(), "type", null, 0, 1, MappingItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingItem_Attr(), this.getMappingColumn(), null, "attr", null, 0, 1, MappingItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingColumnEClass, MappingColumn.class, "MappingColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMappingColumn_Name(), ecorePackage.getEString(), "name", null, 0, 1, MappingColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMappingColumn_Vals(), ecorePackage.getEString(), "vals", null, 0, -1, MappingColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionalFeatureEClass, OptionalFeature.class, "OptionalFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOptionalFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, OptionalFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOptionalFeature_Type(), ecorePackage.getEString(), "type", null, 0, 1, OptionalFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOptionalFeature_Filters(), ecorePackage.getEString(), "filters", null, 0, -1, OptionalFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOptionalFeature_Option(), ecorePackage.getEString(), "option", null, 0, 1, OptionalFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoTypeEClass, PojoType.class, "PojoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPojoType_Native(), ecorePackage.getEString(), "native", null, 0, 1, PojoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoType_Ref(), this.getPojoEntity(), null, "ref", null, 0, 1, PojoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoType_Type(), theTypesPackage.getJvmType(), null, "type", null, 0, 1, PojoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoType_Gref(), this.getPojoEntity(), null, "gref", null, 0, 1, PojoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoType_Gtype(), theTypesPackage.getJvmType(), null, "gtype", null, 0, 1, PojoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoType_Array(), ecorePackage.getEBoolean(), "array", null, 0, 1, PojoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageDeclarationEClass, PackageDeclaration.class, "PackageDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPackageDeclaration_Suffix(), ecorePackage.getEString(), "suffix", null, 0, 1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageDeclaration_Elements(), this.getAbstractPojoEntity(), null, "elements", null, 0, -1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractPojoEntityEClass, AbstractPojoEntity.class, "AbstractPojoEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(implementsEClass, Implements.class, "Implements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImplements_Implements(), theTypesPackage.getJvmType(), null, "implements", null, 0, 1, Implements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extendsEClass, Extends.class, "Extends", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExtends_Extends(), theTypesPackage.getJvmType(), null, "extends", null, 0, 1, Extends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoEntityModifier1EClass, PojoEntityModifier1.class, "PojoEntityModifier1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPojoEntityModifier1_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, PojoEntityModifier1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoEntityModifier1_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, PojoEntityModifier1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoEntityModifier2EClass, PojoEntityModifier2.class, "PojoEntityModifier2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPojoEntityModifier2_SuperType(), this.getPojoEntity(), null, "superType", null, 0, 1, PojoEntityModifier2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoEntityModifier2_Discriminator(), ecorePackage.getEString(), "discriminator", null, 0, 1, PojoEntityModifier2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoEntityModifier2_Sernum(), ecorePackage.getEString(), "sernum", null, 0, 1, PojoEntityModifier2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoEntityEClass, PojoEntity.class, "PojoEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPojoEntity_Modifiers1(), this.getPojoEntityModifier1(), null, "modifiers1", null, 0, -1, PojoEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, PojoEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoEntity_Modifiers2(), this.getPojoEntityModifier2(), null, "modifiers2", null, 0, -1, PojoEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoEntity_Features(), this.getPojoProperty(), null, "features", null, 0, -1, PojoEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoPropertyModifierEClass, PojoPropertyModifier.class, "PojoPropertyModifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPojoPropertyModifier_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, PojoPropertyModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoPropertyModifier_Discriminator(), ecorePackage.getEBoolean(), "discriminator", null, 0, 1, PojoPropertyModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoPropertyModifier_PrimaryKey(), ecorePackage.getEBoolean(), "primaryKey", null, 0, 1, PojoPropertyModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pojoPropertyEClass, PojoProperty.class, "PojoProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPojoProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, PojoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoProperty_Native(), ecorePackage.getEString(), "native", null, 0, 1, PojoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoProperty_Attrs(), this.getPojoProperty(), null, "attrs", null, 0, -1, PojoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoProperty_Ref(), this.getPojoEntity(), null, "ref", null, 0, 1, PojoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoProperty_Type(), theTypesPackage.getJvmType(), null, "type", null, 0, 1, PojoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoProperty_Gref(), this.getPojoEntity(), null, "gref", null, 0, 1, PojoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoProperty_Gtype(), theTypesPackage.getJvmType(), null, "gtype", null, 0, 1, PojoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPojoProperty_Array(), ecorePackage.getEBoolean(), "array", null, 0, 1, PojoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPojoProperty_Modifiers(), this.getPojoPropertyModifier(), null, "modifiers", null, 0, -1, PojoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ProcessorDslPackageImpl
