package org.sqlproc.dsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.sqlproc.dsl.services.ProcessorDslGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractProcessorDslSyntacticSequencer extends AbstractSyntacticSequencer {

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
		match_IfSqlCond_WSTerminalRuleCall_0_a = new TokenAlias(true, true, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_0());
		match_IfSqlCond_WSTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_2());
		match_IfSqlCond_WSTerminalRuleCall_3_1_a = new TokenAlias(true, true, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_3_1());
		match_IfSqlCond_WSTerminalRuleCall_3_3_a = new TokenAlias(true, true, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_3_3());
		match_MappingItem_STRINGTerminalRuleCall_1_0_q = new TokenAlias(true, false, grammarAccess.getMappingItemAccess().getSTRINGTerminalRuleCall_1_0());
		match_Mapping_WSTerminalRuleCall_0_a = new TokenAlias(true, true, grammarAccess.getMappingAccess().getWSTerminalRuleCall_0());
		match_Mapping_WSTerminalRuleCall_2_0_p = new TokenAlias(false, true, grammarAccess.getMappingAccess().getWSTerminalRuleCall_2_0());
		match_Mapping_WSTerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getMappingAccess().getWSTerminalRuleCall_3());
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
		else if(ruleCall.getRule() == grammarAccess.getNUMBERRule())
			return getNUMBERToken(semanticObject, ruleCall, node);
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
		return "";
	}
	
	protected String getATToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "@";
	}
	protected String getBORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "|";
	}
	protected String getCARETToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "^";
	}
	protected String getCOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	protected String getEQUALSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	protected String getLBRACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	protected String getLPARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	protected String getNUMBERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	protected String getPERCENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%";
	}
	protected String getRBRACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	protected String getRPARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	protected String getSEMICOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "$";
	}
	protected String getWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
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
	
}
