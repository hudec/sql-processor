/**
 * <copyright>
 * </copyright>
 *
 */
package org.sqlproc.dsl.processorDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.sqlproc.dsl.processorDsl.Artifact;
import org.sqlproc.dsl.processorDsl.Column;
import org.sqlproc.dsl.processorDsl.Constant;
import org.sqlproc.dsl.processorDsl.Filter;
import org.sqlproc.dsl.processorDsl.Identifier;
import org.sqlproc.dsl.processorDsl.IfMetaSql;
import org.sqlproc.dsl.processorDsl.IfSql;
import org.sqlproc.dsl.processorDsl.IfSqlBool;
import org.sqlproc.dsl.processorDsl.IfSqlCond;
import org.sqlproc.dsl.processorDsl.IfSqlFragment;
import org.sqlproc.dsl.processorDsl.Mapping;
import org.sqlproc.dsl.processorDsl.MappingIdentifier;
import org.sqlproc.dsl.processorDsl.MappingItem;
import org.sqlproc.dsl.processorDsl.MappingRule;
import org.sqlproc.dsl.processorDsl.MetaSql;
import org.sqlproc.dsl.processorDsl.MetaStatement;
import org.sqlproc.dsl.processorDsl.Name;
import org.sqlproc.dsl.processorDsl.OptionalFeature;
import org.sqlproc.dsl.processorDsl.OrdSql;
import org.sqlproc.dsl.processorDsl.OrdSql2;
import org.sqlproc.dsl.processorDsl.ProcessorDslFactory;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;
import org.sqlproc.dsl.processorDsl.Sql;
import org.sqlproc.dsl.processorDsl.SqlFragment;

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
  private EClass artifactEClass = null;

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
  private EClass mappingIdentifierEClass = null;

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
  private EClass nameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum statemeN_TYPEEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum mappinG_TYPEEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum optioN_TYPEEEnum = null;

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
  public EClass getArtifact()
  {
    return artifactEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifact_Features()
  {
    return (EReference)artifactEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifact_Statements()
  {
    return (EReference)artifactEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArtifact_Mappings()
  {
    return (EReference)artifactEClass.getEStructuralFeatures().get(2);
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
  public EReference getMetaStatement_Name()
  {
    return (EReference)metaStatementEClass.getEStructuralFeatures().get(0);
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
  public EReference getMetaStatement_Filters()
  {
    return (EReference)metaStatementEClass.getEStructuralFeatures().get(2);
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
  public EReference getIfSqlFragment_Meta()
  {
    return (EReference)ifSqlFragmentEClass.getEStructuralFeatures().get(4);
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
  public EClass getMappingRule()
  {
    return mappingRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingRule_Name()
  {
    return (EReference)mappingRuleEClass.getEStructuralFeatures().get(0);
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
  public EReference getMappingRule_Filters()
  {
    return (EReference)mappingRuleEClass.getEStructuralFeatures().get(2);
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
  public EClass getMappingIdentifier()
  {
    return mappingIdentifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingIdentifier_Name()
  {
    return (EAttribute)mappingIdentifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingIdentifier_Vals()
  {
    return (EAttribute)mappingIdentifierEClass.getEStructuralFeatures().get(1);
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
  public EReference getOptionalFeature_Name()
  {
    return (EReference)optionalFeatureEClass.getEStructuralFeatures().get(0);
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
  public EReference getOptionalFeature_Filters()
  {
    return (EReference)optionalFeatureEClass.getEStructuralFeatures().get(2);
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
  public EClass getName_()
  {
    return nameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getName_Name()
  {
    return (EAttribute)nameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilter()
  {
    return filterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFilter_Name()
  {
    return (EAttribute)filterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSTATEMEN_TYPE()
  {
    return statemeN_TYPEEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMAPPING_TYPE()
  {
    return mappinG_TYPEEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOPTION_TYPE()
  {
    return optioN_TYPEEEnum;
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
    artifactEClass = createEClass(ARTIFACT);
    createEReference(artifactEClass, ARTIFACT__FEATURES);
    createEReference(artifactEClass, ARTIFACT__STATEMENTS);
    createEReference(artifactEClass, ARTIFACT__MAPPINGS);

    metaStatementEClass = createEClass(META_STATEMENT);
    createEReference(metaStatementEClass, META_STATEMENT__NAME);
    createEAttribute(metaStatementEClass, META_STATEMENT__TYPE);
    createEReference(metaStatementEClass, META_STATEMENT__FILTERS);
    createEReference(metaStatementEClass, META_STATEMENT__STATEMENT);

    sqlEClass = createEClass(SQL);
    createEReference(sqlEClass, SQL__SQLS);

    sqlFragmentEClass = createEClass(SQL_FRAGMENT);
    createEAttribute(sqlFragmentEClass, SQL_FRAGMENT__VALUE);
    createEReference(sqlFragmentEClass, SQL_FRAGMENT__COL);
    createEReference(sqlFragmentEClass, SQL_FRAGMENT__CNST);
    createEReference(sqlFragmentEClass, SQL_FRAGMENT__IDENT);
    createEReference(sqlFragmentEClass, SQL_FRAGMENT__META);

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

    mappingRuleEClass = createEClass(MAPPING_RULE);
    createEReference(mappingRuleEClass, MAPPING_RULE__NAME);
    createEAttribute(mappingRuleEClass, MAPPING_RULE__TYPE);
    createEReference(mappingRuleEClass, MAPPING_RULE__FILTERS);
    createEReference(mappingRuleEClass, MAPPING_RULE__MAPPING);

    mappingEClass = createEClass(MAPPING);
    createEReference(mappingEClass, MAPPING__MAPPING_ITEMS);

    mappingItemEClass = createEClass(MAPPING_ITEM);
    createEAttribute(mappingItemEClass, MAPPING_ITEM__COL);
    createEAttribute(mappingItemEClass, MAPPING_ITEM__TYPE);
    createEReference(mappingItemEClass, MAPPING_ITEM__ATTR);

    mappingIdentifierEClass = createEClass(MAPPING_IDENTIFIER);
    createEAttribute(mappingIdentifierEClass, MAPPING_IDENTIFIER__NAME);
    createEAttribute(mappingIdentifierEClass, MAPPING_IDENTIFIER__VALS);

    optionalFeatureEClass = createEClass(OPTIONAL_FEATURE);
    createEReference(optionalFeatureEClass, OPTIONAL_FEATURE__NAME);
    createEAttribute(optionalFeatureEClass, OPTIONAL_FEATURE__TYPE);
    createEReference(optionalFeatureEClass, OPTIONAL_FEATURE__FILTERS);
    createEAttribute(optionalFeatureEClass, OPTIONAL_FEATURE__OPTION);

    nameEClass = createEClass(NAME);
    createEAttribute(nameEClass, NAME__NAME);

    filterEClass = createEClass(FILTER);
    createEAttribute(filterEClass, FILTER__NAME);

    // Create enums
    statemeN_TYPEEEnum = createEEnum(STATEMEN_TYPE);
    mappinG_TYPEEEnum = createEEnum(MAPPING_TYPE);
    optioN_TYPEEEnum = createEEnum(OPTION_TYPE);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArtifact_Features(), this.getOptionalFeature(), null, "features", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifact_Statements(), this.getMetaStatement(), null, "statements", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArtifact_Mappings(), this.getMappingRule(), null, "mappings", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaStatementEClass, MetaStatement.class, "MetaStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMetaStatement_Name(), this.getName_(), null, "name", null, 0, 1, MetaStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaStatement_Type(), this.getSTATEMEN_TYPE(), "type", null, 0, 1, MetaStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaStatement_Filters(), this.getFilter(), null, "filters", null, 0, -1, MetaStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaStatement_Statement(), this.getSql(), null, "statement", null, 0, 1, MetaStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sqlEClass, Sql.class, "Sql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSql_Sqls(), this.getSqlFragment(), null, "sqls", null, 0, -1, Sql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sqlFragmentEClass, SqlFragment.class, "SqlFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSqlFragment_Value(), ecorePackage.getEString(), "value", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSqlFragment_Col(), this.getColumn(), null, "col", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSqlFragment_Cnst(), this.getConstant(), null, "cnst", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSqlFragment_Ident(), this.getIdentifier(), null, "ident", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSqlFragment_Meta(), this.getMetaSql(), null, "meta", null, 0, 1, SqlFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

    initEClass(mappingRuleEClass, MappingRule.class, "MappingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMappingRule_Name(), this.getName_(), null, "name", null, 0, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMappingRule_Type(), this.getMAPPING_TYPE(), "type", null, 0, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingRule_Filters(), this.getFilter(), null, "filters", null, 0, -1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingRule_Mapping(), this.getMapping(), null, "mapping", null, 0, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMapping_MappingItems(), this.getMappingItem(), null, "mappingItems", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingItemEClass, MappingItem.class, "MappingItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMappingItem_Col(), ecorePackage.getEString(), "col", null, 0, 1, MappingItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMappingItem_Type(), ecorePackage.getEString(), "type", null, 0, 1, MappingItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingItem_Attr(), this.getMappingIdentifier(), null, "attr", null, 0, 1, MappingItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingIdentifierEClass, MappingIdentifier.class, "MappingIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMappingIdentifier_Name(), ecorePackage.getEString(), "name", null, 0, 1, MappingIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMappingIdentifier_Vals(), ecorePackage.getEString(), "vals", null, 0, -1, MappingIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionalFeatureEClass, OptionalFeature.class, "OptionalFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOptionalFeature_Name(), this.getName_(), null, "name", null, 0, 1, OptionalFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOptionalFeature_Type(), this.getOPTION_TYPE(), "type", null, 0, 1, OptionalFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOptionalFeature_Filters(), this.getFilter(), null, "filters", null, 0, -1, OptionalFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOptionalFeature_Option(), ecorePackage.getEString(), "option", null, 0, 1, OptionalFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameEClass, Name.class, "Name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getName_Name(), ecorePackage.getEString(), "name", null, 0, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFilter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(statemeN_TYPEEEnum, org.sqlproc.dsl.processorDsl.STATEMEN_TYPE.class, "STATEMEN_TYPE");
    addEEnumLiteral(statemeN_TYPEEEnum, org.sqlproc.dsl.processorDsl.STATEMEN_TYPE.QRY);
    addEEnumLiteral(statemeN_TYPEEEnum, org.sqlproc.dsl.processorDsl.STATEMEN_TYPE.CRUD);
    addEEnumLiteral(statemeN_TYPEEEnum, org.sqlproc.dsl.processorDsl.STATEMEN_TYPE.CALL);

    initEEnum(mappinG_TYPEEEnum, org.sqlproc.dsl.processorDsl.MAPPING_TYPE.class, "MAPPING_TYPE");
    addEEnumLiteral(mappinG_TYPEEEnum, org.sqlproc.dsl.processorDsl.MAPPING_TYPE.OUT);

    initEEnum(optioN_TYPEEEnum, org.sqlproc.dsl.processorDsl.OPTION_TYPE.class, "OPTION_TYPE");
    addEEnumLiteral(optioN_TYPEEEnum, org.sqlproc.dsl.processorDsl.OPTION_TYPE.OPT);
    addEEnumLiteral(optioN_TYPEEEnum, org.sqlproc.dsl.processorDsl.OPTION_TYPE.LOPT);
    addEEnumLiteral(optioN_TYPEEEnum, org.sqlproc.dsl.processorDsl.OPTION_TYPE.IOPT);
    addEEnumLiteral(optioN_TYPEEEnum, org.sqlproc.dsl.processorDsl.OPTION_TYPE.SOPT);
    addEEnumLiteral(optioN_TYPEEEnum, org.sqlproc.dsl.processorDsl.OPTION_TYPE.BOPT);

    // Create resource
    createResource(eNS_URI);
  }

} //ProcessorDslPackageImpl
