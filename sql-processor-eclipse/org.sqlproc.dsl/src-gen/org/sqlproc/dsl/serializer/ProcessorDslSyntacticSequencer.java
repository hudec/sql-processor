package org.sqlproc.dsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.sqlproc.dsl.services.ProcessorDslGrammarAccess;

@SuppressWarnings("all")
public class ProcessorDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ProcessorDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Artifacts_WSTerminalRuleCall_0_a;
	protected AbstractElementAlias match_Artifacts_WSTerminalRuleCall_1_0_1_a;
	protected AbstractElementAlias match_Artifacts_WSTerminalRuleCall_1_1_1_a;
	protected AbstractElementAlias match_Artifacts_WSTerminalRuleCall_1_2_1_a;
	protected AbstractElementAlias match_Artifacts_WSTerminalRuleCall_1_3_1_a;
	protected AbstractElementAlias match_Artifacts_WSTerminalRuleCall_1_4_1_a;
	protected AbstractElementAlias match_Artifacts_WSTerminalRuleCall_1_5_1_a;
	protected AbstractElementAlias match_Artifacts_WSTerminalRuleCall_1_6_1_a;
	protected AbstractElementAlias match_Artifacts_WSTerminalRuleCall_1_7_1_a;
	protected AbstractElementAlias match_Column_CARETTerminalRuleCall_1_0_q;
	protected AbstractElementAlias match_Constant_CARETTerminalRuleCall_2_0_q;
	protected AbstractElementAlias match_Identifier_CARETTerminalRuleCall_3_0_q;
	protected AbstractElementAlias match_IfSqlCond_WSTerminalRuleCall_0_a;
	protected AbstractElementAlias match_IfSqlCond_WSTerminalRuleCall_2_a;
	protected AbstractElementAlias match_IfSqlCond_WSTerminalRuleCall_3_1_a;
	protected AbstractElementAlias match_IfSqlCond_WSTerminalRuleCall_3_3_a;
	protected AbstractElementAlias match_MappingItem_STRINGTerminalRuleCall_1_0_q;
	protected AbstractElementAlias match_Mapping_WSTerminalRuleCall_0_a;
	protected AbstractElementAlias match_Mapping_WSTerminalRuleCall_2_0_p;
	protected AbstractElementAlias match_Mapping_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_MetaSql_WSTerminalRuleCall_4_1_a;
	protected AbstractElementAlias match_Property_WSTerminalRuleCall_0_0_1_p;
	protected AbstractElementAlias match_Property_WSTerminalRuleCall_0_1_1_p;
	protected AbstractElementAlias match_Property_WSTerminalRuleCall_0_2_1_p;
	protected AbstractElementAlias match_Property_WSTerminalRuleCall_0_3_1_p;
	protected AbstractElementAlias match_Property_WSTerminalRuleCall_0_4_1_p;
	protected AbstractElementAlias match_Property_WSTerminalRuleCall_0_5_1_p;
	protected AbstractElementAlias match_Property_WSTerminalRuleCall_0_6_1_p;
	protected AbstractElementAlias match_XBlockExpression_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q;
	protected AbstractElementAlias match_XExpressionInClosure_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ProcessorDslGrammarAccess) access;
		match_Artifacts_WSTerminalRuleCall_0_a = new TokenAlias(true, true, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_0());
		match_Artifacts_WSTerminalRuleCall_1_0_1_a = new TokenAlias(true, true, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_0_1());
		match_Artifacts_WSTerminalRuleCall_1_1_1_a = new TokenAlias(true, true, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_1_1());
		match_Artifacts_WSTerminalRuleCall_1_2_1_a = new TokenAlias(true, true, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_2_1());
		match_Artifacts_WSTerminalRuleCall_1_3_1_a = new TokenAlias(true, true, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_3_1());
		match_Artifacts_WSTerminalRuleCall_1_4_1_a = new TokenAlias(true, true, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_4_1());
		match_Artifacts_WSTerminalRuleCall_1_5_1_a = new TokenAlias(true, true, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_5_1());
		match_Artifacts_WSTerminalRuleCall_1_6_1_a = new TokenAlias(true, true, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_6_1());
		match_Artifacts_WSTerminalRuleCall_1_7_1_a = new TokenAlias(true, true, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_7_1());
		match_Column_CARETTerminalRuleCall_1_0_q = new TokenAlias(false, true, grammarAccess.getColumnAccess().getCARETTerminalRuleCall_1_0());
		match_Constant_CARETTerminalRuleCall_2_0_q = new TokenAlias(false, true, grammarAccess.getConstantAccess().getCARETTerminalRuleCall_2_0());
		match_Identifier_CARETTerminalRuleCall_3_0_q = new TokenAlias(false, true, grammarAccess.getIdentifierAccess().getCARETTerminalRuleCall_3_0());
		match_IfSqlCond_WSTerminalRuleCall_0_a = new TokenAlias(true, true, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_0());
		match_IfSqlCond_WSTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_2());
		match_IfSqlCond_WSTerminalRuleCall_3_1_a = new TokenAlias(true, true, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_3_1());
		match_IfSqlCond_WSTerminalRuleCall_3_3_a = new TokenAlias(true, true, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_3_3());
		match_MappingItem_STRINGTerminalRuleCall_1_0_q = new TokenAlias(false, true, grammarAccess.getMappingItemAccess().getSTRINGTerminalRuleCall_1_0());
		match_Mapping_WSTerminalRuleCall_0_a = new TokenAlias(true, true, grammarAccess.getMappingAccess().getWSTerminalRuleCall_0());
		match_Mapping_WSTerminalRuleCall_2_0_p = new TokenAlias(true, false, grammarAccess.getMappingAccess().getWSTerminalRuleCall_2_0());
		match_Mapping_WSTerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getMappingAccess().getWSTerminalRuleCall_3());
		match_MetaSql_WSTerminalRuleCall_4_1_a = new TokenAlias(true, true, grammarAccess.getMetaSqlAccess().getWSTerminalRuleCall_4_1());
		match_Property_WSTerminalRuleCall_0_0_1_p = new TokenAlias(true, false, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_0_1());
		match_Property_WSTerminalRuleCall_0_1_1_p = new TokenAlias(true, false, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_1_1());
		match_Property_WSTerminalRuleCall_0_2_1_p = new TokenAlias(true, false, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_2_1());
		match_Property_WSTerminalRuleCall_0_3_1_p = new TokenAlias(true, false, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_3_1());
		match_Property_WSTerminalRuleCall_0_4_1_p = new TokenAlias(true, false, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_4_1());
		match_Property_WSTerminalRuleCall_0_5_1_p = new TokenAlias(true, false, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_5_1());
		match_Property_WSTerminalRuleCall_0_6_1_p = new TokenAlias(true, false, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_6_1());
		match_XBlockExpression_SemicolonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
		match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2()));
		match_XExpressionInClosure_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
		match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()));
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getATRule())
			return getATToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getBORRule())
			return getBORToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCARETRule())
			return getCARETToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOLONRule())
			return getCOLONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEQUALSRule())
			return getEQUALSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLBRACERule())
			return getLBRACEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLPARENRule())
			return getLPARENToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNOTRule())
			return getNOTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpSingleAssignRule())
			return getOpSingleAssignToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPERCENTRule())
			return getPERCENTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRBRACERule())
			return getRBRACEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRPARENRule())
			return getRPARENToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSEMICOLONRule())
			return getSEMICOLONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.get_NUMBERRule())
			return get_NUMBERToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal AT:	   '@';
	 */
	protected String getATToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "@";
	}
	
	/**
	 * terminal BOR:      '|' ;
	 */
	protected String getBORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "|";
	}
	
	/**
	 * terminal CARET:    '^';
	 */
	protected String getCARETToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "^";
	}
	
	/**
	 * terminal COLON:    ':' ;
	 */
	protected String getCOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	/**
	 * terminal COMMA:    ',' ;
	 */
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal EQUALS:   '=' ;
	 */
	protected String getEQUALSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * terminal LBRACE:   '{' ;
	 */
	protected String getLBRACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal LPAREN:   '(' ;
	 */
	protected String getLPARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * terminal NOT:      '!' ;
	 */
	protected String getNOTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "!";
	}
	
	/**
	 * OpSingleAssign:
	 * 	'='
	 * ;
	 */
	protected String getOpSingleAssignToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * terminal PERCENT:  '%' ;
	 */
	protected String getPERCENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%";
	}
	
	/**
	 * terminal RBRACE:   '}' ;
	 */
	protected String getRBRACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal RPAREN:   ')' ;
	 */
	protected String getRPARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * terminal SEMICOLON:';' ;
	 */
	protected String getSEMICOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	/**
	 * terminal STRING:   '$' ;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "$";
	}
	
	/**
	 * terminal WS:    (' '|'\t'|'\n'|'\r')+ ;
	 */
	protected String getWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	/**
	 * terminal _NUMBER: ('0'..'9')+;
	 */
	protected String get_NUMBERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Artifacts_WSTerminalRuleCall_0_a.equals(syntax))
				emit_Artifacts_WSTerminalRuleCall_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Artifacts_WSTerminalRuleCall_1_0_1_a.equals(syntax))
				emit_Artifacts_WSTerminalRuleCall_1_0_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Artifacts_WSTerminalRuleCall_1_1_1_a.equals(syntax))
				emit_Artifacts_WSTerminalRuleCall_1_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Artifacts_WSTerminalRuleCall_1_2_1_a.equals(syntax))
				emit_Artifacts_WSTerminalRuleCall_1_2_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Artifacts_WSTerminalRuleCall_1_3_1_a.equals(syntax))
				emit_Artifacts_WSTerminalRuleCall_1_3_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Artifacts_WSTerminalRuleCall_1_4_1_a.equals(syntax))
				emit_Artifacts_WSTerminalRuleCall_1_4_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Artifacts_WSTerminalRuleCall_1_5_1_a.equals(syntax))
				emit_Artifacts_WSTerminalRuleCall_1_5_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Artifacts_WSTerminalRuleCall_1_6_1_a.equals(syntax))
				emit_Artifacts_WSTerminalRuleCall_1_6_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Artifacts_WSTerminalRuleCall_1_7_1_a.equals(syntax))
				emit_Artifacts_WSTerminalRuleCall_1_7_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Column_CARETTerminalRuleCall_1_0_q.equals(syntax))
				emit_Column_CARETTerminalRuleCall_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Constant_CARETTerminalRuleCall_2_0_q.equals(syntax))
				emit_Constant_CARETTerminalRuleCall_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Identifier_CARETTerminalRuleCall_3_0_q.equals(syntax))
				emit_Identifier_CARETTerminalRuleCall_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IfSqlCond_WSTerminalRuleCall_0_a.equals(syntax))
				emit_IfSqlCond_WSTerminalRuleCall_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IfSqlCond_WSTerminalRuleCall_2_a.equals(syntax))
				emit_IfSqlCond_WSTerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IfSqlCond_WSTerminalRuleCall_3_1_a.equals(syntax))
				emit_IfSqlCond_WSTerminalRuleCall_3_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IfSqlCond_WSTerminalRuleCall_3_3_a.equals(syntax))
				emit_IfSqlCond_WSTerminalRuleCall_3_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MappingItem_STRINGTerminalRuleCall_1_0_q.equals(syntax))
				emit_MappingItem_STRINGTerminalRuleCall_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Mapping_WSTerminalRuleCall_0_a.equals(syntax))
				emit_Mapping_WSTerminalRuleCall_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Mapping_WSTerminalRuleCall_2_0_p.equals(syntax))
				emit_Mapping_WSTerminalRuleCall_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Mapping_WSTerminalRuleCall_3_a.equals(syntax))
				emit_Mapping_WSTerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetaSql_WSTerminalRuleCall_4_1_a.equals(syntax))
				emit_MetaSql_WSTerminalRuleCall_4_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Property_WSTerminalRuleCall_0_0_1_p.equals(syntax))
				emit_Property_WSTerminalRuleCall_0_0_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Property_WSTerminalRuleCall_0_1_1_p.equals(syntax))
				emit_Property_WSTerminalRuleCall_0_1_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Property_WSTerminalRuleCall_0_2_1_p.equals(syntax))
				emit_Property_WSTerminalRuleCall_0_2_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Property_WSTerminalRuleCall_0_3_1_p.equals(syntax))
				emit_Property_WSTerminalRuleCall_0_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Property_WSTerminalRuleCall_0_4_1_p.equals(syntax))
				emit_Property_WSTerminalRuleCall_0_4_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Property_WSTerminalRuleCall_0_5_1_p.equals(syntax))
				emit_Property_WSTerminalRuleCall_0_5_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Property_WSTerminalRuleCall_0_6_1_p.equals(syntax))
				emit_Property_WSTerminalRuleCall_0_6_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XBlockExpression_SemicolonKeyword_2_1_q.equals(syntax))
				emit_XBlockExpression_SemicolonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q.equals(syntax))
				emit_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XExpressionInClosure_SemicolonKeyword_1_1_q.equals(syntax))
				emit_XExpressionInClosure_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q.equals(syntax))
				emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Artifacts_WSTerminalRuleCall_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Artifacts_WSTerminalRuleCall_1_0_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Artifacts_WSTerminalRuleCall_1_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Artifacts_WSTerminalRuleCall_1_2_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Artifacts_WSTerminalRuleCall_1_3_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Artifacts_WSTerminalRuleCall_1_4_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Artifacts_WSTerminalRuleCall_1_5_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Artifacts_WSTerminalRuleCall_1_6_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Artifacts_WSTerminalRuleCall_1_7_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     CARET?
	 */
	protected void emit_Column_CARETTerminalRuleCall_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     CARET?
	 */
	protected void emit_Constant_CARETTerminalRuleCall_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     CARET?
	 */
	protected void emit_Identifier_CARETTerminalRuleCall_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_IfSqlCond_WSTerminalRuleCall_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_IfSqlCond_WSTerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_IfSqlCond_WSTerminalRuleCall_3_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_IfSqlCond_WSTerminalRuleCall_3_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     STRING?
	 */
	protected void emit_MappingItem_STRINGTerminalRuleCall_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Mapping_WSTerminalRuleCall_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Mapping_WSTerminalRuleCall_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Mapping_WSTerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_MetaSql_WSTerminalRuleCall_4_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Property_WSTerminalRuleCall_0_0_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Property_WSTerminalRuleCall_0_1_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Property_WSTerminalRuleCall_0_2_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Property_WSTerminalRuleCall_0_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Property_WSTerminalRuleCall_0_4_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Property_WSTerminalRuleCall_0_5_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Property_WSTerminalRuleCall_0_6_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XBlockExpression_SemicolonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XExpressionInClosure_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
