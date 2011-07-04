package org.sqlproc.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.processorDsl.Column;
import org.sqlproc.dsl.processorDsl.ColumnUsage;
import org.sqlproc.dsl.processorDsl.Constant;
import org.sqlproc.dsl.processorDsl.ConstantUsage;
import org.sqlproc.dsl.processorDsl.DatabaseColumn;
import org.sqlproc.dsl.processorDsl.DatabaseTable;
import org.sqlproc.dsl.processorDsl.Identifier;
import org.sqlproc.dsl.processorDsl.IdentifierUsage;
import org.sqlproc.dsl.processorDsl.IfMetaSql;
import org.sqlproc.dsl.processorDsl.IfSql;
import org.sqlproc.dsl.processorDsl.IfSqlBool;
import org.sqlproc.dsl.processorDsl.IfSqlCond;
import org.sqlproc.dsl.processorDsl.IfSqlFragment;
import org.sqlproc.dsl.processorDsl.Mapping;
import org.sqlproc.dsl.processorDsl.MappingColumn;
import org.sqlproc.dsl.processorDsl.MappingItem;
import org.sqlproc.dsl.processorDsl.MappingRule;
import org.sqlproc.dsl.processorDsl.MappingUsage;
import org.sqlproc.dsl.processorDsl.MetaSql;
import org.sqlproc.dsl.processorDsl.MetaStatement;
import org.sqlproc.dsl.processorDsl.OptionalFeature;
import org.sqlproc.dsl.processorDsl.OrdSql;
import org.sqlproc.dsl.processorDsl.OrdSql2;
import org.sqlproc.dsl.processorDsl.PojoDefinition;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;
import org.sqlproc.dsl.processorDsl.Property;
import org.sqlproc.dsl.processorDsl.Sql;
import org.sqlproc.dsl.processorDsl.SqlFragment;
import org.sqlproc.dsl.processorDsl.TableDefinition;
import org.sqlproc.dsl.processorDsl.TableUsage;
import org.sqlproc.dsl.services.ProcessorDslGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractProcessorDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected ProcessorDslGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ProcessorDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ProcessorDslPackage.ARTIFACTS:
				if(context == grammarAccess.getArtifactsRule()) {
					sequence_Artifacts_Artifacts(context, (Artifacts) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.COLUMN:
				if(context == grammarAccess.getColumnRule()) {
					sequence_Column_Column(context, (Column) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.COLUMN_USAGE:
				if(context == grammarAccess.getPojoUsageRule() ||
				   context == grammarAccess.getColumnUsageRule()) {
					sequence_ColumnUsage_ColumnUsage(context, (ColumnUsage) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.CONSTANT:
				if(context == grammarAccess.getConstantRule()) {
					sequence_Constant_Constant(context, (Constant) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.CONSTANT_USAGE:
				if(context == grammarAccess.getPojoUsageRule() ||
				   context == grammarAccess.getConstantUsageRule()) {
					sequence_ConstantUsage_ConstantUsage(context, (ConstantUsage) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.DATABASE_COLUMN:
				if(context == grammarAccess.getDatabaseColumnRule()) {
					sequence_DatabaseColumn_DatabaseColumn(context, (DatabaseColumn) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.DATABASE_TABLE:
				if(context == grammarAccess.getDatabaseTableRule()) {
					sequence_DatabaseTable_DatabaseTable(context, (DatabaseTable) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.IDENTIFIER:
				if(context == grammarAccess.getIdentifierRule()) {
					sequence_Identifier_Identifier(context, (Identifier) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.IDENTIFIER_USAGE:
				if(context == grammarAccess.getPojoUsageRule() ||
				   context == grammarAccess.getIdentifierUsageRule()) {
					sequence_IdentifierUsage_IdentifierUsage(context, (IdentifierUsage) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.IF_META_SQL:
				if(context == grammarAccess.getIfMetaSqlRule()) {
					sequence_IfMetaSql_IfMetaSql(context, (IfMetaSql) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.IF_SQL:
				if(context == grammarAccess.getIfSqlRule()) {
					sequence_IfSql_IfSql(context, (IfSql) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.IF_SQL_BOOL:
				if(context == grammarAccess.getIfSqlBoolRule()) {
					sequence_IfSqlBool_IfSqlBool(context, (IfSqlBool) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.IF_SQL_COND:
				if(context == grammarAccess.getIfSqlCondRule()) {
					sequence_IfSqlCond_IfSqlCond(context, (IfSqlCond) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.IF_SQL_FRAGMENT:
				if(context == grammarAccess.getIfSqlFragmentRule()) {
					sequence_IfSqlFragment_IfSqlFragment(context, (IfSqlFragment) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.MAPPING:
				if(context == grammarAccess.getMappingRule()) {
					sequence_Mapping_Mapping(context, (Mapping) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.MAPPING_COLUMN:
				if(context == grammarAccess.getMappingColumnRule()) {
					sequence_MappingColumn_MappingColumn(context, (MappingColumn) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.MAPPING_ITEM:
				if(context == grammarAccess.getMappingItemRule()) {
					sequence_MappingItem_MappingItem(context, (MappingItem) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.MAPPING_RULE:
				if(context == grammarAccess.getMappingRuleRule()) {
					sequence_MappingRule_MappingRule(context, (MappingRule) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.MAPPING_USAGE:
				if(context == grammarAccess.getPojoUsageRule() ||
				   context == grammarAccess.getMappingUsageRule()) {
					sequence_MappingUsage_MappingUsage(context, (MappingUsage) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.META_SQL:
				if(context == grammarAccess.getMetaSqlRule()) {
					sequence_MetaSql_MetaSql(context, (MetaSql) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.META_STATEMENT:
				if(context == grammarAccess.getMetaStatementRule()) {
					sequence_MetaStatement_MetaStatement(context, (MetaStatement) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.OPTIONAL_FEATURE:
				if(context == grammarAccess.getOptionalFeatureRule()) {
					sequence_OptionalFeature_OptionalFeature(context, (OptionalFeature) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.ORD_SQL:
				if(context == grammarAccess.getOrdSqlRule()) {
					sequence_OrdSql_OrdSql(context, (OrdSql) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.ORD_SQL2:
				if(context == grammarAccess.getOrdSql2Rule()) {
					sequence_OrdSql2_OrdSql2(context, (OrdSql2) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.POJO_DEFINITION:
				if(context == grammarAccess.getPojoDefinitionRule()) {
					sequence_PojoDefinition_PojoDefinition(context, (PojoDefinition) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule()) {
					sequence_Property_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.SQL:
				if(context == grammarAccess.getSqlRule()) {
					sequence_Sql_Sql(context, (Sql) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.SQL_FRAGMENT:
				if(context == grammarAccess.getSqlFragmentRule()) {
					sequence_SqlFragment_SqlFragment(context, (SqlFragment) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.TABLE_DEFINITION:
				if(context == grammarAccess.getTableDefinitionRule()) {
					sequence_TableDefinition_TableDefinition(context, (TableDefinition) semanticObject); 
					return; 
				}
				else break;
			case ProcessorDslPackage.TABLE_USAGE:
				if(context == grammarAccess.getTableUsageRule()) {
					sequence_TableUsage_TableUsage(context, (TableUsage) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         features+=OptionalFeature | 
	 *         statements+=MetaStatement | 
	 *         mappings+=MappingRule | 
	 *         pojos+=PojoDefinition | 
	 *         usages+=PojoUsage | 
	 *         properties+=Property | 
	 *         tables+=TableDefinition | 
	 *         tableUsages+=TableUsage
	 *     )+
	 *
	 * Features:
	 *    features[0, *]
	 *    statements[0, *]
	 *    mappings[0, *]
	 *    pojos[0, *]
	 *    usages[0, *]
	 *    properties[0, *]
	 *    tables[0, *]
	 *    tableUsages[0, *]
	 */
	protected void sequence_Artifacts_Artifacts(EObject context, Artifacts semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statement=[MetaStatement|IDENT] pojo=[PojoDefinition|IDENT])
	 *
	 * Features:
	 *    pojo[1, 1]
	 *    statement[1, 1]
	 */
	protected void sequence_ColumnUsage_ColumnUsage(EObject context, ColumnUsage semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProcessorDslPackage.Literals.POJO_USAGE__POJO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProcessorDslPackage.Literals.POJO_USAGE__POJO));
			if(transientValues.isValueTransient(semanticObject, ProcessorDslPackage.Literals.COLUMN_USAGE__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProcessorDslPackage.Literals.COLUMN_USAGE__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColumnUsageAccess().getStatementMetaStatementIDENTTerminalRuleCall_1_0_1(), semanticObject.getStatement());
		feeder.accept(grammarAccess.getColumnUsageAccess().getPojoPojoDefinitionIDENTTerminalRuleCall_2_0_1(), semanticObject.getPojo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((name=IDENT | name=IDENT_DOT | name=NUMBER) (type=IDENT (vals+=IDENT | vals+=NUMBER)*)?)
	 *
	 * Features:
	 *    name[0, 3]
	 *    type[0, 1]
	 *         MANDATORY_IF_SET vals
	 *         MANDATORY_IF_SET vals
	 *    vals[0, *]
	 *         EXCLUDE_IF_UNSET type
	 */
	protected void sequence_Column_Column(EObject context, Column semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statement=[MetaStatement|IDENT] pojo=[PojoDefinition|IDENT])
	 *
	 * Features:
	 *    pojo[1, 1]
	 *    statement[1, 1]
	 */
	protected void sequence_ConstantUsage_ConstantUsage(EObject context, ConstantUsage semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProcessorDslPackage.Literals.POJO_USAGE__POJO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProcessorDslPackage.Literals.POJO_USAGE__POJO));
			if(transientValues.isValueTransient(semanticObject, ProcessorDslPackage.Literals.CONSTANT_USAGE__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProcessorDslPackage.Literals.CONSTANT_USAGE__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantUsageAccess().getStatementMetaStatementIDENTTerminalRuleCall_1_0_1(), semanticObject.getStatement());
		feeder.accept(grammarAccess.getConstantUsageAccess().getPojoPojoDefinitionIDENTTerminalRuleCall_2_0_1(), semanticObject.getPojo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((case=PLUS | case=MINUS)? (name=IDENT | name=IDENT_DOT) (type=IDENT (vals+=IDENT | vals+=NUMBER)*)?)
	 *
	 * Features:
	 *    case[0, 2]
	 *    name[0, 2]
	 *    type[0, 1]
	 *         MANDATORY_IF_SET vals
	 *         MANDATORY_IF_SET vals
	 *    vals[0, *]
	 *         EXCLUDE_IF_UNSET type
	 */
	protected void sequence_Constant_Constant(EObject context, Constant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENT | name=IDENT_DOT)
	 *
	 * Features:
	 *    name[0, 2]
	 */
	protected void sequence_DatabaseColumn_DatabaseColumn(EObject context, DatabaseColumn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENT | name=IDENT_DOT)
	 *
	 * Features:
	 *    name[0, 2]
	 */
	protected void sequence_DatabaseTable_DatabaseTable(EObject context, DatabaseTable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statement=[MetaStatement|IDENT] pojo=[PojoDefinition|IDENT])
	 *
	 * Features:
	 *    pojo[1, 1]
	 *    statement[1, 1]
	 */
	protected void sequence_IdentifierUsage_IdentifierUsage(EObject context, IdentifierUsage semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProcessorDslPackage.Literals.POJO_USAGE__POJO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProcessorDslPackage.Literals.POJO_USAGE__POJO));
			if(transientValues.isValueTransient(semanticObject, ProcessorDslPackage.Literals.IDENTIFIER_USAGE__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProcessorDslPackage.Literals.IDENTIFIER_USAGE__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIdentifierUsageAccess().getStatementMetaStatementIDENTTerminalRuleCall_1_0_1(), semanticObject.getStatement());
		feeder.accept(grammarAccess.getIdentifierUsageAccess().getPojoPojoDefinitionIDENTTerminalRuleCall_2_0_1(), semanticObject.getPojo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (mode=EQUALS | mode=LESS_THAN | mode=MORE_THAN)? 
	 *         (case=PLUS | case=MINUS)? 
	 *         (name=IDENT | name=IDENT_DOT | name=NUMBER) 
	 *         (type=IDENT (vals+=IDENT | vals+=NUMBER)*)?
	 *     )
	 *
	 * Features:
	 *    mode[0, 3]
	 *    case[0, 2]
	 *    name[0, 3]
	 *    type[0, 1]
	 *         MANDATORY_IF_SET vals
	 *         MANDATORY_IF_SET vals
	 *    vals[0, *]
	 *         EXCLUDE_IF_UNSET type
	 */
	protected void sequence_Identifier_Identifier(EObject context, Identifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (ifs+=IfSql ifs+=IfSql*) | 
	 *         (type=QUESTI cond=IfSqlCond ifs+=IfSql ifs+=IfSql*) | 
	 *         (type=BAND ifs+=IfSql ifs+=IfSql*) | 
	 *         (type=BOR ifs+=IfSql ifs+=IfSql*)
	 *     )
	 *
	 * Features:
	 *    ifs[4, *]
	 *    type[3, 3]
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET ifs
	 *    cond[1, 1]
	 *         EXCLUDE_IF_UNSET type
	 *         MANDATORY_IF_SET type
	 *         EXCLUDE_IF_UNSET ifs
	 *         MANDATORY_IF_SET ifs
	 *         MANDATORY_IF_SET ifs
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET ifs
	 */
	protected void sequence_IfMetaSql_IfMetaSql(EObject context, IfMetaSql semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((not?=NOT? cnst=Constant) | (not?=NOT? ident=Identifier) | (not?=NOT? cond=IfSqlCond))
	 *
	 * Features:
	 *    not[0, 3]
	 *    cnst[1, 1]
	 *         MANDATORY_IF_SET not
	 *         EXCLUDE_IF_SET not
	 *         EXCLUDE_IF_SET ident
	 *         EXCLUDE_IF_SET not
	 *         EXCLUDE_IF_SET cond
	 *    ident[1, 1]
	 *         MANDATORY_IF_SET not
	 *         EXCLUDE_IF_SET not
	 *         EXCLUDE_IF_SET cnst
	 *         EXCLUDE_IF_SET not
	 *         EXCLUDE_IF_SET cond
	 *    cond[1, 1]
	 *         MANDATORY_IF_SET not
	 *         EXCLUDE_IF_SET not
	 *         EXCLUDE_IF_SET cnst
	 *         EXCLUDE_IF_SET not
	 *         EXCLUDE_IF_SET ident
	 */
	protected void sequence_IfSqlBool_IfSqlBool(EObject context, IfSqlBool semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bool1=IfSqlBool ((oper+=AND | oper+=OR) bool2+=IfSqlBool)*)
	 *
	 * Features:
	 *    bool1[1, 1]
	 *    oper[0, 2]
	 *         SAME_OR_LESS bool2
	 *    bool2[0, *]
	 *         SAME_OR_MORE oper
	 *         SAME_OR_MORE oper
	 */
	protected void sequence_IfSqlCond_IfSqlCond(EObject context, IfSqlCond semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value=IfSqlValue | 
	 *         col=Column | 
	 *         cnst=Constant | 
	 *         ident=Identifier | 
	 *         dbtab=DatabaseTable | 
	 *         dbcol=DatabaseColumn | 
	 *         meta=IfMetaSql
	 *     )
	 *
	 * Features:
	 *    value[0, 1]
	 *         EXCLUDE_IF_SET col
	 *         EXCLUDE_IF_SET cnst
	 *         EXCLUDE_IF_SET ident
	 *         EXCLUDE_IF_SET dbtab
	 *         EXCLUDE_IF_SET dbcol
	 *         EXCLUDE_IF_SET meta
	 *    col[0, 1]
	 *         EXCLUDE_IF_SET value
	 *         EXCLUDE_IF_SET cnst
	 *         EXCLUDE_IF_SET ident
	 *         EXCLUDE_IF_SET dbtab
	 *         EXCLUDE_IF_SET dbcol
	 *         EXCLUDE_IF_SET meta
	 *    cnst[0, 1]
	 *         EXCLUDE_IF_SET value
	 *         EXCLUDE_IF_SET col
	 *         EXCLUDE_IF_SET ident
	 *         EXCLUDE_IF_SET dbtab
	 *         EXCLUDE_IF_SET dbcol
	 *         EXCLUDE_IF_SET meta
	 *    ident[0, 1]
	 *         EXCLUDE_IF_SET value
	 *         EXCLUDE_IF_SET col
	 *         EXCLUDE_IF_SET cnst
	 *         EXCLUDE_IF_SET dbtab
	 *         EXCLUDE_IF_SET dbcol
	 *         EXCLUDE_IF_SET meta
	 *    dbtab[0, 1]
	 *         EXCLUDE_IF_SET value
	 *         EXCLUDE_IF_SET col
	 *         EXCLUDE_IF_SET cnst
	 *         EXCLUDE_IF_SET ident
	 *         EXCLUDE_IF_SET dbcol
	 *         EXCLUDE_IF_SET meta
	 *    dbcol[0, 1]
	 *         EXCLUDE_IF_SET value
	 *         EXCLUDE_IF_SET col
	 *         EXCLUDE_IF_SET cnst
	 *         EXCLUDE_IF_SET ident
	 *         EXCLUDE_IF_SET dbtab
	 *         EXCLUDE_IF_SET meta
	 *    meta[0, 1]
	 *         EXCLUDE_IF_SET value
	 *         EXCLUDE_IF_SET col
	 *         EXCLUDE_IF_SET cnst
	 *         EXCLUDE_IF_SET ident
	 *         EXCLUDE_IF_SET dbtab
	 *         EXCLUDE_IF_SET dbcol
	 */
	protected void sequence_IfSqlFragment_IfSqlFragment(EObject context, IfSqlFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     sqls+=IfSqlFragment+
	 *
	 * Features:
	 *    sqls[1, *]
	 */
	protected void sequence_IfSql_IfSql(EObject context, IfSql semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=IDENT | name=IDENT_DOT) (vals+=IDENT | vals+=NUMBER)*)
	 *
	 * Features:
	 *    name[0, 2]
	 *    vals[0, *]
	 */
	protected void sequence_MappingColumn_MappingColumn(EObject context, MappingColumn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((col=IDENT | col=NUMBER) (type=IDENT? attr=MappingColumn?)?)
	 *
	 * Features:
	 *    col[0, 2]
	 *    type[0, 1]
	 *    attr[0, 1]
	 */
	protected void sequence_MappingItem_MappingItem(EObject context, MappingItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENT type=MAPPING_TYPE filters+=IDENT* mapping=Mapping)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 *    filters[0, *]
	 *    mapping[1, 1]
	 */
	protected void sequence_MappingRule_MappingRule(EObject context, MappingRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statement=[MappingRule|IDENT] pojo=[PojoDefinition|IDENT])
	 *
	 * Features:
	 *    pojo[1, 1]
	 *    statement[1, 1]
	 */
	protected void sequence_MappingUsage_MappingUsage(EObject context, MappingUsage semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProcessorDslPackage.Literals.POJO_USAGE__POJO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProcessorDslPackage.Literals.POJO_USAGE__POJO));
			if(transientValues.isValueTransient(semanticObject, ProcessorDslPackage.Literals.MAPPING_USAGE__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProcessorDslPackage.Literals.MAPPING_USAGE__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMappingUsageAccess().getStatementMappingRuleIDENTTerminalRuleCall_1_0_1(), semanticObject.getStatement());
		feeder.accept(grammarAccess.getMappingUsageAccess().getPojoPojoDefinitionIDENTTerminalRuleCall_2_0_1(), semanticObject.getPojo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (mappingItems+=MappingItem mappingItems+=MappingItem*)
	 *
	 * Features:
	 *    mappingItems[1, *]
	 */
	protected void sequence_Mapping_Mapping(EObject context, Mapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (ifs+=IfSql ifs+=IfSql*) | 
	 *         (type=QUESTI cond=IfSqlCond ifs+=IfSql ifs+=IfSql*) | 
	 *         (type=BAND ifs+=IfSql ifs+=IfSql*) | 
	 *         (type=BOR ifs+=IfSql ifs+=IfSql*) | 
	 *         (type=EQUALS ftype=IDENT ifs+=IfSql) | 
	 *         (type=HASH ord=OrdSql)
	 *     )
	 *
	 * Features:
	 *    ifs[5, *]
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET ord
	 *    type[5, 5]
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET ifs
	 *    cond[1, 1]
	 *         EXCLUDE_IF_UNSET type
	 *         MANDATORY_IF_SET type
	 *         EXCLUDE_IF_UNSET ifs
	 *         MANDATORY_IF_SET ifs
	 *         MANDATORY_IF_SET ifs
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET ftype
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET ord
	 *    ftype[1, 1]
	 *         EXCLUDE_IF_UNSET type
	 *         MANDATORY_IF_SET type
	 *         EXCLUDE_IF_UNSET ifs
	 *         MANDATORY_IF_SET ifs
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET cond
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET ord
	 *    ord[1, 1]
	 *         EXCLUDE_IF_UNSET type
	 *         MANDATORY_IF_SET type
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET cond
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET ifs
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET ftype
	 *         EXCLUDE_IF_SET ifs
	 */
	protected void sequence_MetaSql_MetaSql(EObject context, MetaSql semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENT type=STATEMEN_TYPE filters+=IDENT* statement=Sql)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 *    filters[0, *]
	 *    statement[1, 1]
	 */
	protected void sequence_MetaStatement_MetaStatement(EObject context, MetaStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENT type=OPTION_TYPE filters+=IDENT* option=FeatureValue)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 *    filters[0, *]
	 *    option[1, 1]
	 */
	protected void sequence_OptionalFeature_OptionalFeature(EObject context, OptionalFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=OrdSqlValue | cnst=Constant | ident=Identifier | dbcol=DatabaseColumn)
	 *
	 * Features:
	 *    value[0, 1]
	 *         EXCLUDE_IF_SET cnst
	 *         EXCLUDE_IF_SET ident
	 *         EXCLUDE_IF_SET dbcol
	 *    cnst[0, 1]
	 *         EXCLUDE_IF_SET value
	 *         EXCLUDE_IF_SET ident
	 *         EXCLUDE_IF_SET dbcol
	 *    ident[0, 1]
	 *         EXCLUDE_IF_SET value
	 *         EXCLUDE_IF_SET cnst
	 *         EXCLUDE_IF_SET dbcol
	 *    dbcol[0, 1]
	 *         EXCLUDE_IF_SET value
	 *         EXCLUDE_IF_SET cnst
	 *         EXCLUDE_IF_SET ident
	 */
	protected void sequence_OrdSql2_OrdSql2(EObject context, OrdSql2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     sqls+=OrdSql2+
	 *
	 * Features:
	 *    sqls[1, *]
	 */
	protected void sequence_OrdSql_OrdSql(EObject context, OrdSql semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENT (class=IDENT | class=IDENT_DOT))
	 *
	 * Features:
	 *    name[1, 1]
	 *    class[0, 2]
	 */
	protected void sequence_PojoDefinition_PojoDefinition(EObject context, PojoDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (name='resolve references' doResolvePojo=ON_OFF) | 
	 *         (name='database online' doResolveDb=ON_OFF) | 
	 *         (name='database url' dbUrl=PropertyValue) | 
	 *         (name='database username' dbUsername=PropertyValue) | 
	 *         (name='database password' dbPassword=PropertyValue) | 
	 *         (name='database schema' dbSchema=PropertyValue) | 
	 *         (name='database driver' dbDriver=PropertyValue)
	 *     )
	 *
	 * Features:
	 *    name[7, 7]
	 *    doResolvePojo[1, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET doResolveDb
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbUrl
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbUsername
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbPassword
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbSchema
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbDriver
	 *    doResolveDb[1, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET doResolvePojo
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbUrl
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbUsername
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbPassword
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbSchema
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbDriver
	 *    dbUrl[1, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET doResolvePojo
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET doResolveDb
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbUsername
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbPassword
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbSchema
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbDriver
	 *    dbUsername[1, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET doResolvePojo
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET doResolveDb
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbUrl
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbPassword
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbSchema
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbDriver
	 *    dbPassword[1, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET doResolvePojo
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET doResolveDb
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbUrl
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbUsername
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbSchema
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbDriver
	 *    dbSchema[1, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET doResolvePojo
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET doResolveDb
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbUrl
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbUsername
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbPassword
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbDriver
	 *    dbDriver[1, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET doResolvePojo
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET doResolveDb
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbUrl
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbUsername
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbPassword
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET dbSchema
	 */
	protected void sequence_Property_Property(EObject context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value=SqlValue | 
	 *         col=Column | 
	 *         cnst=Constant | 
	 *         ident=Identifier | 
	 *         meta=MetaSql | 
	 *         dbtab=DatabaseTable | 
	 *         dbcol=DatabaseColumn
	 *     )
	 *
	 * Features:
	 *    value[0, 1]
	 *         EXCLUDE_IF_SET col
	 *         EXCLUDE_IF_SET cnst
	 *         EXCLUDE_IF_SET ident
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET dbtab
	 *         EXCLUDE_IF_SET dbcol
	 *    col[0, 1]
	 *         EXCLUDE_IF_SET value
	 *         EXCLUDE_IF_SET cnst
	 *         EXCLUDE_IF_SET ident
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET dbtab
	 *         EXCLUDE_IF_SET dbcol
	 *    cnst[0, 1]
	 *         EXCLUDE_IF_SET value
	 *         EXCLUDE_IF_SET col
	 *         EXCLUDE_IF_SET ident
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET dbtab
	 *         EXCLUDE_IF_SET dbcol
	 *    ident[0, 1]
	 *         EXCLUDE_IF_SET value
	 *         EXCLUDE_IF_SET col
	 *         EXCLUDE_IF_SET cnst
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET dbtab
	 *         EXCLUDE_IF_SET dbcol
	 *    meta[0, 1]
	 *         EXCLUDE_IF_SET value
	 *         EXCLUDE_IF_SET col
	 *         EXCLUDE_IF_SET cnst
	 *         EXCLUDE_IF_SET ident
	 *         EXCLUDE_IF_SET dbtab
	 *         EXCLUDE_IF_SET dbcol
	 *    dbtab[0, 1]
	 *         EXCLUDE_IF_SET value
	 *         EXCLUDE_IF_SET col
	 *         EXCLUDE_IF_SET cnst
	 *         EXCLUDE_IF_SET ident
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET dbcol
	 *    dbcol[0, 1]
	 *         EXCLUDE_IF_SET value
	 *         EXCLUDE_IF_SET col
	 *         EXCLUDE_IF_SET cnst
	 *         EXCLUDE_IF_SET ident
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET dbtab
	 */
	protected void sequence_SqlFragment_SqlFragment(EObject context, SqlFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     sqls+=SqlFragment+
	 *
	 * Features:
	 *    sqls[1, *]
	 */
	protected void sequence_Sql_Sql(EObject context, Sql semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENT table=IDENT)
	 *
	 * Features:
	 *    name[1, 1]
	 *    table[1, 1]
	 */
	protected void sequence_TableDefinition_TableDefinition(EObject context, TableDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProcessorDslPackage.Literals.TABLE_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProcessorDslPackage.Literals.TABLE_DEFINITION__NAME));
			if(transientValues.isValueTransient(semanticObject, ProcessorDslPackage.Literals.TABLE_DEFINITION__TABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProcessorDslPackage.Literals.TABLE_DEFINITION__TABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTableDefinitionAccess().getNameIDENTTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTableDefinitionAccess().getTableIDENTTerminalRuleCall_2_0(), semanticObject.getTable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (statement=[MetaStatement|IDENT] table=[TableDefinition|IDENT] prefix=IDENT?)
	 *
	 * Features:
	 *    statement[1, 1]
	 *    table[1, 1]
	 *    prefix[0, 1]
	 */
	protected void sequence_TableUsage_TableUsage(EObject context, TableUsage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
