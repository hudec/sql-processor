package org.sqlproc.dsl.serializer;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.sqlproc.dsl.services.ProcessorDslGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractProcessorDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ProcessorDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Artifacts_WSTerminalRuleCall_0_p;
	protected AbstractElementAlias match_Artifacts_WSTerminalRuleCall_1_0_1_p;
	protected AbstractElementAlias match_Artifacts_WSTerminalRuleCall_1_1_1_p;
	protected AbstractElementAlias match_Artifacts_WSTerminalRuleCall_1_2_1_p;
	protected AbstractElementAlias match_Artifacts_WSTerminalRuleCall_1_3_1_p;
	protected AbstractElementAlias match_Artifacts_WSTerminalRuleCall_1_4_1_p;
	protected AbstractElementAlias match_Artifacts_WSTerminalRuleCall_1_6_1_p;
	protected AbstractElementAlias match_Artifacts_WSTerminalRuleCall_1_7_1_p;
	protected AbstractElementAlias match_IfSqlCond_WSTerminalRuleCall_0_p;
	protected AbstractElementAlias match_IfSqlCond_WSTerminalRuleCall_2_a;
	protected AbstractElementAlias match_IfSqlCond_WSTerminalRuleCall_3_3_a;
	protected AbstractElementAlias match_Mapping_WSTerminalRuleCall_2_0_p;
	protected AbstractElementAlias match_MetaSql_WSTerminalRuleCall_4_1_a;
	protected AbstractElementAlias match_Property_WSTerminalRuleCall_0_0_1_p;
	protected AbstractElementAlias match_Property_WSTerminalRuleCall_0_1_1_p;
	protected AbstractElementAlias match_Property_WSTerminalRuleCall_0_2_1_p;
	protected AbstractElementAlias match_Property_WSTerminalRuleCall_0_3_1_p;
	protected AbstractElementAlias match_Property_WSTerminalRuleCall_0_4_1_p;
	protected AbstractElementAlias match_Property_WSTerminalRuleCall_0_5_1_p;
	protected AbstractElementAlias match_Property_WSTerminalRuleCall_0_6_1_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ProcessorDslGrammarAccess) access;
		match_Artifacts_WSTerminalRuleCall_0_p = new TokenAlias(false, true, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_0());
		match_Artifacts_WSTerminalRuleCall_1_0_1_p = new TokenAlias(false, true, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_0_1());
		match_Artifacts_WSTerminalRuleCall_1_1_1_p = new TokenAlias(false, true, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_1_1());
		match_Artifacts_WSTerminalRuleCall_1_2_1_p = new TokenAlias(false, true, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_2_1());
		match_Artifacts_WSTerminalRuleCall_1_3_1_p = new TokenAlias(false, true, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_3_1());
		match_Artifacts_WSTerminalRuleCall_1_4_1_p = new TokenAlias(false, true, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_4_1());
		match_Artifacts_WSTerminalRuleCall_1_6_1_p = new TokenAlias(false, true, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_6_1());
		match_Artifacts_WSTerminalRuleCall_1_7_1_p = new TokenAlias(false, true, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_7_1());
		match_IfSqlCond_WSTerminalRuleCall_0_p = new TokenAlias(false, true, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_0());
		match_IfSqlCond_WSTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_2());
		match_IfSqlCond_WSTerminalRuleCall_3_3_a = new TokenAlias(true, true, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_3_3());
		match_Mapping_WSTerminalRuleCall_2_0_p = new TokenAlias(false, true, grammarAccess.getMappingAccess().getWSTerminalRuleCall_2_0());
		match_MetaSql_WSTerminalRuleCall_4_1_a = new TokenAlias(true, true, grammarAccess.getMetaSqlAccess().getWSTerminalRuleCall_4_1());
		match_Property_WSTerminalRuleCall_0_0_1_p = new TokenAlias(false, true, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_0_1());
		match_Property_WSTerminalRuleCall_0_1_1_p = new TokenAlias(false, true, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_1_1());
		match_Property_WSTerminalRuleCall_0_2_1_p = new TokenAlias(false, true, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_2_1());
		match_Property_WSTerminalRuleCall_0_3_1_p = new TokenAlias(false, true, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_3_1());
		match_Property_WSTerminalRuleCall_0_4_1_p = new TokenAlias(false, true, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_4_1());
		match_Property_WSTerminalRuleCall_0_5_1_p = new TokenAlias(false, true, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_5_1());
		match_Property_WSTerminalRuleCall_0_6_1_p = new TokenAlias(false, true, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_6_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getATRule())
			return getATToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getBORRule())
			return getBORToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCARETRule())
			return getCARETToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOLONRule())
			return getCOLONToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEQUALSRule())
			return getEQUALSToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLBRACERule())
			return getLBRACEToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLPARENRule())
			return getLPARENToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNUMBERRule())
			return getNUMBERToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPERCENTRule())
			return getPERCENTToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRBRACERule())
			return getRBRACEToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRPARENRule())
			return getRPARENToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSEMICOLONRule())
			return getSEMICOLONToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(ruleCall, node);
		return "";
	}
	
	protected String getATToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "@";
	}
	protected String getBORToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "|";
	}
	protected String getCARETToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "^";
	}
	protected String getCOLONToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	protected String getCOMMAToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	protected String getEQUALSToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	protected String getLBRACEToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	protected String getLPARENToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	protected String getNUMBERToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	protected String getPERCENTToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%";
	}
	protected String getRBRACEToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	protected String getRPARENToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	protected String getSEMICOLONToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	protected String getSTRINGToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "$";
	}
	protected String getWSToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (!transition.isSyntacticallyAmbiguous())
			return;
		if(match_Artifacts_WSTerminalRuleCall_0_p.equals(transition.getAmbiguousSyntax()))
			emit_Artifacts_WSTerminalRuleCall_0_p(semanticObject, transition, fromNode, toNode);
		else if(match_Artifacts_WSTerminalRuleCall_1_0_1_p.equals(transition.getAmbiguousSyntax()))
			emit_Artifacts_WSTerminalRuleCall_1_0_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_Artifacts_WSTerminalRuleCall_1_1_1_p.equals(transition.getAmbiguousSyntax()))
			emit_Artifacts_WSTerminalRuleCall_1_1_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_Artifacts_WSTerminalRuleCall_1_2_1_p.equals(transition.getAmbiguousSyntax()))
			emit_Artifacts_WSTerminalRuleCall_1_2_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_Artifacts_WSTerminalRuleCall_1_3_1_p.equals(transition.getAmbiguousSyntax()))
			emit_Artifacts_WSTerminalRuleCall_1_3_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_Artifacts_WSTerminalRuleCall_1_4_1_p.equals(transition.getAmbiguousSyntax()))
			emit_Artifacts_WSTerminalRuleCall_1_4_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_Artifacts_WSTerminalRuleCall_1_6_1_p.equals(transition.getAmbiguousSyntax()))
			emit_Artifacts_WSTerminalRuleCall_1_6_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_Artifacts_WSTerminalRuleCall_1_7_1_p.equals(transition.getAmbiguousSyntax()))
			emit_Artifacts_WSTerminalRuleCall_1_7_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_IfSqlCond_WSTerminalRuleCall_0_p.equals(transition.getAmbiguousSyntax()))
			emit_IfSqlCond_WSTerminalRuleCall_0_p(semanticObject, transition, fromNode, toNode);
		else if(match_IfSqlCond_WSTerminalRuleCall_2_a.equals(transition.getAmbiguousSyntax()))
			emit_IfSqlCond_WSTerminalRuleCall_2_a(semanticObject, transition, fromNode, toNode);
		else if(match_IfSqlCond_WSTerminalRuleCall_3_3_a.equals(transition.getAmbiguousSyntax()))
			emit_IfSqlCond_WSTerminalRuleCall_3_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_Mapping_WSTerminalRuleCall_2_0_p.equals(transition.getAmbiguousSyntax()))
			emit_Mapping_WSTerminalRuleCall_2_0_p(semanticObject, transition, fromNode, toNode);
		else if(match_MetaSql_WSTerminalRuleCall_4_1_a.equals(transition.getAmbiguousSyntax()))
			emit_MetaSql_WSTerminalRuleCall_4_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_Property_WSTerminalRuleCall_0_0_1_p.equals(transition.getAmbiguousSyntax()))
			emit_Property_WSTerminalRuleCall_0_0_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_Property_WSTerminalRuleCall_0_1_1_p.equals(transition.getAmbiguousSyntax()))
			emit_Property_WSTerminalRuleCall_0_1_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_Property_WSTerminalRuleCall_0_2_1_p.equals(transition.getAmbiguousSyntax()))
			emit_Property_WSTerminalRuleCall_0_2_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_Property_WSTerminalRuleCall_0_3_1_p.equals(transition.getAmbiguousSyntax()))
			emit_Property_WSTerminalRuleCall_0_3_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_Property_WSTerminalRuleCall_0_4_1_p.equals(transition.getAmbiguousSyntax()))
			emit_Property_WSTerminalRuleCall_0_4_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_Property_WSTerminalRuleCall_0_5_1_p.equals(transition.getAmbiguousSyntax()))
			emit_Property_WSTerminalRuleCall_0_5_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_Property_WSTerminalRuleCall_0_6_1_p.equals(transition.getAmbiguousSyntax()))
			emit_Property_WSTerminalRuleCall_0_6_1_p(semanticObject, transition, fromNode, toNode);
		else acceptNodes(transition, fromNode, toNode);
	}

	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Artifacts_WSTerminalRuleCall_0_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Artifacts_WSTerminalRuleCall_1_0_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Artifacts_WSTerminalRuleCall_1_1_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Artifacts_WSTerminalRuleCall_1_2_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Artifacts_WSTerminalRuleCall_1_3_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Artifacts_WSTerminalRuleCall_1_4_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Artifacts_WSTerminalRuleCall_1_6_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Artifacts_WSTerminalRuleCall_1_7_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_IfSqlCond_WSTerminalRuleCall_0_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_IfSqlCond_WSTerminalRuleCall_2_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_IfSqlCond_WSTerminalRuleCall_3_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Mapping_WSTerminalRuleCall_2_0_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_MetaSql_WSTerminalRuleCall_4_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Property_WSTerminalRuleCall_0_0_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Property_WSTerminalRuleCall_0_1_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Property_WSTerminalRuleCall_0_2_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Property_WSTerminalRuleCall_0_3_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Property_WSTerminalRuleCall_0_4_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Property_WSTerminalRuleCall_0_5_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Property_WSTerminalRuleCall_0_6_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
}
