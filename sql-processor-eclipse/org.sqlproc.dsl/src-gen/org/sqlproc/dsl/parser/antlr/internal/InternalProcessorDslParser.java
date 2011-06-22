package org.sqlproc.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.sqlproc.dsl.services.ProcessorDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalProcessorDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_SEMICOLON", "RULE_REST", "RULE_IDENT_DOT", "RULE_IDENT", "RULE_NUMBER", "RULE_COLON", "RULE_STRING", "RULE_COMMA", "RULE_MINUS", "RULE_PLUS", "RULE_LPAREN", "RULE_RPAREN", "RULE_LBRACE", "RULE_RBRACE", "RULE_QUESTI", "RULE_NOT", "RULE_BAND", "RULE_BOR", "RULE_HASH", "RULE_AT", "RULE_CARET", "RULE_EQUALS", "RULE_LESS_THAN", "RULE_MORE_THAN", "RULE_ESC_CHAR", "RULE_AND", "RULE_OR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'resolve references'", "'database online'", "'database url'", "'database username'", "'database password'", "'database schema'", "'database driver'", "'pojo'", "'col'", "'ident'", "'const'", "'out'", "'QRY'", "'CRUD'", "'CALL'", "'OUT'", "'OPT'", "'LOPT'", "'IOPT'", "'SOPT'", "'BOPT'"
    };
    public static final int RULE_SEMICOLON=5;
    public static final int RULE_OR=31;
    public static final int RULE_AND=30;
    public static final int EOF=-1;
    public static final int RULE_NOT=20;
    public static final int T__51=51;
    public static final int RULE_REST=6;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_NUMBER=9;
    public static final int RULE_LPAREN=15;
    public static final int RULE_LBRACE=17;
    public static final int RULE_BOR=22;
    public static final int RULE_IDENT_DOT=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_BAND=21;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_RBRACE=18;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_CARET=25;
    public static final int T__48=48;
    public static final int RULE_MORE_THAN=28;
    public static final int T__49=49;
    public static final int RULE_PLUS=14;
    public static final int RULE_HASH=23;
    public static final int RULE_COMMA=12;
    public static final int RULE_SL_COMMENT=33;
    public static final int RULE_QUESTI=19;
    public static final int RULE_ML_COMMENT=32;
    public static final int RULE_COLON=10;
    public static final int RULE_MINUS=13;
    public static final int RULE_STRING=11;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_ESC_CHAR=29;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_IDENT=8;
    public static final int T__39=39;
    public static final int RULE_EQUALS=26;
    public static final int RULE_RPAREN=16;
    public static final int RULE_LESS_THAN=27;
    public static final int RULE_WS=4;
    public static final int RULE_AT=24;

    // delegates
    // delegators


        public InternalProcessorDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProcessorDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProcessorDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g"; }



     	private ProcessorDslGrammarAccess grammarAccess;
     	
        public InternalProcessorDslParser(TokenStream input, ProcessorDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Artifacts";	
       	}
       	
       	@Override
       	protected ProcessorDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleArtifacts"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:68:1: entryRuleArtifacts returns [EObject current=null] : iv_ruleArtifacts= ruleArtifacts EOF ;
    public final EObject entryRuleArtifacts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifacts = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:69:2: (iv_ruleArtifacts= ruleArtifacts EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:70:2: iv_ruleArtifacts= ruleArtifacts EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArtifactsRule()); 
            }
            pushFollow(FOLLOW_ruleArtifacts_in_entryRuleArtifacts75);
            iv_ruleArtifacts=ruleArtifacts();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArtifacts; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtifacts85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArtifacts"


    // $ANTLR start "ruleArtifacts"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:77:1: ruleArtifacts returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* ) | ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* ) | ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* ) | ( ( (lv_pojos_7_0= rulePojoDefinition ) ) (this_WS_8= RULE_WS )* ) | ( ( (lv_usages_9_0= rulePojoUsage ) ) (this_WS_10= RULE_WS )* ) | ( ( (lv_properties_11_0= ruleProperty ) ) (this_WS_12= RULE_WS )* ) )+ ) ;
    public final EObject ruleArtifacts() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        Token this_WS_6=null;
        Token this_WS_8=null;
        Token this_WS_10=null;
        Token this_WS_12=null;
        EObject lv_features_1_0 = null;

        EObject lv_statements_3_0 = null;

        EObject lv_mappings_5_0 = null;

        EObject lv_pojos_7_0 = null;

        EObject lv_usages_9_0 = null;

        EObject lv_properties_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:80:28: ( ( (this_WS_0= RULE_WS )* ( ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* ) | ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* ) | ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* ) | ( ( (lv_pojos_7_0= rulePojoDefinition ) ) (this_WS_8= RULE_WS )* ) | ( ( (lv_usages_9_0= rulePojoUsage ) ) (this_WS_10= RULE_WS )* ) | ( ( (lv_properties_11_0= ruleProperty ) ) (this_WS_12= RULE_WS )* ) )+ ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:81:1: ( (this_WS_0= RULE_WS )* ( ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* ) | ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* ) | ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* ) | ( ( (lv_pojos_7_0= rulePojoDefinition ) ) (this_WS_8= RULE_WS )* ) | ( ( (lv_usages_9_0= rulePojoUsage ) ) (this_WS_10= RULE_WS )* ) | ( ( (lv_properties_11_0= ruleProperty ) ) (this_WS_12= RULE_WS )* ) )+ )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:81:1: ( (this_WS_0= RULE_WS )* ( ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* ) | ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* ) | ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* ) | ( ( (lv_pojos_7_0= rulePojoDefinition ) ) (this_WS_8= RULE_WS )* ) | ( ( (lv_usages_9_0= rulePojoUsage ) ) (this_WS_10= RULE_WS )* ) | ( ( (lv_properties_11_0= ruleProperty ) ) (this_WS_12= RULE_WS )* ) )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:81:2: (this_WS_0= RULE_WS )* ( ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* ) | ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* ) | ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* ) | ( ( (lv_pojos_7_0= rulePojoDefinition ) ) (this_WS_8= RULE_WS )* ) | ( ( (lv_usages_9_0= rulePojoUsage ) ) (this_WS_10= RULE_WS )* ) | ( ( (lv_properties_11_0= ruleProperty ) ) (this_WS_12= RULE_WS )* ) )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:81:2: (this_WS_0= RULE_WS )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_WS) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:81:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleArtifacts122); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_0, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:85:3: ( ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* ) | ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* ) | ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* ) | ( ( (lv_pojos_7_0= rulePojoDefinition ) ) (this_WS_8= RULE_WS )* ) | ( ( (lv_usages_9_0= rulePojoUsage ) ) (this_WS_10= RULE_WS )* ) | ( ( (lv_properties_11_0= ruleProperty ) ) (this_WS_12= RULE_WS )* ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=7;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:85:4: ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:85:4: ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:85:5: ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )*
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:85:5: ( (lv_features_1_0= ruleOptionalFeature ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:86:1: (lv_features_1_0= ruleOptionalFeature )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:86:1: (lv_features_1_0= ruleOptionalFeature )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:87:3: lv_features_1_0= ruleOptionalFeature
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArtifactsAccess().getFeaturesOptionalFeatureParserRuleCall_1_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOptionalFeature_in_ruleArtifacts146);
            	    lv_features_1_0=ruleOptionalFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArtifactsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"features",
            	              		lv_features_1_0, 
            	              		"OptionalFeature");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:103:2: (this_WS_2= RULE_WS )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==RULE_WS) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:103:3: this_WS_2= RULE_WS
            	    	    {
            	    	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleArtifacts158); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_2, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_0_1()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:108:6: ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:108:6: ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:108:7: ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )*
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:108:7: ( (lv_statements_3_0= ruleMetaStatement ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:109:1: (lv_statements_3_0= ruleMetaStatement )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:109:1: (lv_statements_3_0= ruleMetaStatement )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:110:3: lv_statements_3_0= ruleMetaStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArtifactsAccess().getStatementsMetaStatementParserRuleCall_1_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMetaStatement_in_ruleArtifacts188);
            	    lv_statements_3_0=ruleMetaStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArtifactsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_3_0, 
            	              		"MetaStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:126:2: (this_WS_4= RULE_WS )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==RULE_WS) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:126:3: this_WS_4= RULE_WS
            	    	    {
            	    	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleArtifacts200); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_4, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_1_1()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:131:6: ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:131:6: ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:131:7: ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )*
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:131:7: ( (lv_mappings_5_0= ruleMappingRule ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:132:1: (lv_mappings_5_0= ruleMappingRule )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:132:1: (lv_mappings_5_0= ruleMappingRule )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:133:3: lv_mappings_5_0= ruleMappingRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArtifactsAccess().getMappingsMappingRuleParserRuleCall_1_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMappingRule_in_ruleArtifacts230);
            	    lv_mappings_5_0=ruleMappingRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArtifactsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"mappings",
            	              		lv_mappings_5_0, 
            	              		"MappingRule");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:149:2: (this_WS_6= RULE_WS )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==RULE_WS) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:149:3: this_WS_6= RULE_WS
            	    	    {
            	    	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleArtifacts242); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_6, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_2_1()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:154:6: ( ( (lv_pojos_7_0= rulePojoDefinition ) ) (this_WS_8= RULE_WS )* )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:154:6: ( ( (lv_pojos_7_0= rulePojoDefinition ) ) (this_WS_8= RULE_WS )* )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:154:7: ( (lv_pojos_7_0= rulePojoDefinition ) ) (this_WS_8= RULE_WS )*
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:154:7: ( (lv_pojos_7_0= rulePojoDefinition ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:155:1: (lv_pojos_7_0= rulePojoDefinition )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:155:1: (lv_pojos_7_0= rulePojoDefinition )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:156:3: lv_pojos_7_0= rulePojoDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArtifactsAccess().getPojosPojoDefinitionParserRuleCall_1_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePojoDefinition_in_ruleArtifacts272);
            	    lv_pojos_7_0=rulePojoDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArtifactsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"pojos",
            	              		lv_pojos_7_0, 
            	              		"PojoDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:172:2: (this_WS_8= RULE_WS )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==RULE_WS) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:172:3: this_WS_8= RULE_WS
            	    	    {
            	    	    this_WS_8=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleArtifacts284); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_8, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_3_1()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:177:6: ( ( (lv_usages_9_0= rulePojoUsage ) ) (this_WS_10= RULE_WS )* )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:177:6: ( ( (lv_usages_9_0= rulePojoUsage ) ) (this_WS_10= RULE_WS )* )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:177:7: ( (lv_usages_9_0= rulePojoUsage ) ) (this_WS_10= RULE_WS )*
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:177:7: ( (lv_usages_9_0= rulePojoUsage ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:178:1: (lv_usages_9_0= rulePojoUsage )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:178:1: (lv_usages_9_0= rulePojoUsage )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:179:3: lv_usages_9_0= rulePojoUsage
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArtifactsAccess().getUsagesPojoUsageParserRuleCall_1_4_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePojoUsage_in_ruleArtifacts314);
            	    lv_usages_9_0=rulePojoUsage();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArtifactsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"usages",
            	              		lv_usages_9_0, 
            	              		"PojoUsage");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:195:2: (this_WS_10= RULE_WS )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==RULE_WS) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:195:3: this_WS_10= RULE_WS
            	    	    {
            	    	    this_WS_10=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleArtifacts326); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_10, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_4_1()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:200:6: ( ( (lv_properties_11_0= ruleProperty ) ) (this_WS_12= RULE_WS )* )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:200:6: ( ( (lv_properties_11_0= ruleProperty ) ) (this_WS_12= RULE_WS )* )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:200:7: ( (lv_properties_11_0= ruleProperty ) ) (this_WS_12= RULE_WS )*
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:200:7: ( (lv_properties_11_0= ruleProperty ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:201:1: (lv_properties_11_0= ruleProperty )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:201:1: (lv_properties_11_0= ruleProperty )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:202:3: lv_properties_11_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArtifactsAccess().getPropertiesPropertyParserRuleCall_1_5_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_ruleArtifacts356);
            	    lv_properties_11_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArtifactsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_11_0, 
            	              		"Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:218:2: (this_WS_12= RULE_WS )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==RULE_WS) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:218:3: this_WS_12= RULE_WS
            	    	    {
            	    	    this_WS_12=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleArtifacts368); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_12, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_5_1()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArtifacts"


    // $ANTLR start "entryRuleProperty"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:230:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:231:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:232:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty408);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty418); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:239:1: ruleProperty returns [EObject current=null] : ( ( ( (lv_pojo_0_0= 'resolve references' ) ) | ( (lv_database_1_0= 'database online' ) ) | (otherlv_2= 'database url' (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) ) | (otherlv_5= 'database username' (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) ) | (otherlv_8= 'database password' (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) ) | (otherlv_11= 'database schema' (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) ) | (otherlv_14= 'database driver' (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) ) ) this_SEMICOLON_17= RULE_SEMICOLON ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_pojo_0_0=null;
        Token lv_database_1_0=null;
        Token otherlv_2=null;
        Token this_WS_3=null;
        Token otherlv_5=null;
        Token this_WS_6=null;
        Token otherlv_8=null;
        Token this_WS_9=null;
        Token otherlv_11=null;
        Token this_WS_12=null;
        Token otherlv_14=null;
        Token this_WS_15=null;
        Token this_SEMICOLON_17=null;
        AntlrDatatypeRuleToken lv_dbUrl_4_0 = null;

        AntlrDatatypeRuleToken lv_dbUsername_7_0 = null;

        AntlrDatatypeRuleToken lv_dbPassword_10_0 = null;

        AntlrDatatypeRuleToken lv_dbSchema_13_0 = null;

        AntlrDatatypeRuleToken lv_dbDriver_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:242:28: ( ( ( ( (lv_pojo_0_0= 'resolve references' ) ) | ( (lv_database_1_0= 'database online' ) ) | (otherlv_2= 'database url' (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) ) | (otherlv_5= 'database username' (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) ) | (otherlv_8= 'database password' (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) ) | (otherlv_11= 'database schema' (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) ) | (otherlv_14= 'database driver' (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) ) ) this_SEMICOLON_17= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:243:1: ( ( ( (lv_pojo_0_0= 'resolve references' ) ) | ( (lv_database_1_0= 'database online' ) ) | (otherlv_2= 'database url' (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) ) | (otherlv_5= 'database username' (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) ) | (otherlv_8= 'database password' (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) ) | (otherlv_11= 'database schema' (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) ) | (otherlv_14= 'database driver' (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) ) ) this_SEMICOLON_17= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:243:1: ( ( ( (lv_pojo_0_0= 'resolve references' ) ) | ( (lv_database_1_0= 'database online' ) ) | (otherlv_2= 'database url' (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) ) | (otherlv_5= 'database username' (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) ) | (otherlv_8= 'database password' (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) ) | (otherlv_11= 'database schema' (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) ) | (otherlv_14= 'database driver' (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) ) ) this_SEMICOLON_17= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:243:2: ( ( (lv_pojo_0_0= 'resolve references' ) ) | ( (lv_database_1_0= 'database online' ) ) | (otherlv_2= 'database url' (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) ) | (otherlv_5= 'database username' (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) ) | (otherlv_8= 'database password' (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) ) | (otherlv_11= 'database schema' (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) ) | (otherlv_14= 'database driver' (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) ) ) this_SEMICOLON_17= RULE_SEMICOLON
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:243:2: ( ( (lv_pojo_0_0= 'resolve references' ) ) | ( (lv_database_1_0= 'database online' ) ) | (otherlv_2= 'database url' (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) ) | (otherlv_5= 'database username' (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) ) | (otherlv_8= 'database password' (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) ) | (otherlv_11= 'database schema' (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) ) | (otherlv_14= 'database driver' (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) ) )
            int alt14=7;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt14=1;
                }
                break;
            case 35:
                {
                alt14=2;
                }
                break;
            case 36:
                {
                alt14=3;
                }
                break;
            case 37:
                {
                alt14=4;
                }
                break;
            case 38:
                {
                alt14=5;
                }
                break;
            case 39:
                {
                alt14=6;
                }
                break;
            case 40:
                {
                alt14=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:243:3: ( (lv_pojo_0_0= 'resolve references' ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:243:3: ( (lv_pojo_0_0= 'resolve references' ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:244:1: (lv_pojo_0_0= 'resolve references' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:244:1: (lv_pojo_0_0= 'resolve references' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:245:3: lv_pojo_0_0= 'resolve references'
                    {
                    lv_pojo_0_0=(Token)match(input,34,FOLLOW_34_in_ruleProperty462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_pojo_0_0, grammarAccess.getPropertyAccess().getPojoResolveReferencesKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                             		setWithLastConsumed(current, "pojo", true, "resolve references");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:259:6: ( (lv_database_1_0= 'database online' ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:259:6: ( (lv_database_1_0= 'database online' ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:260:1: (lv_database_1_0= 'database online' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:260:1: (lv_database_1_0= 'database online' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:261:3: lv_database_1_0= 'database online'
                    {
                    lv_database_1_0=(Token)match(input,35,FOLLOW_35_in_ruleProperty499); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_database_1_0, grammarAccess.getPropertyAccess().getDatabaseDatabaseOnlineKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                             		setWithLastConsumed(current, "database", true, "database online");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:275:6: (otherlv_2= 'database url' (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:275:6: (otherlv_2= 'database url' (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:275:8: otherlv_2= 'database url' (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleProperty531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getDatabaseUrlKeyword_0_2_0());
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:279:1: (this_WS_3= RULE_WS )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_WS) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:279:2: this_WS_3= RULE_WS
                    	    {
                    	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty543); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_3, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_2_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:283:3: ( (lv_dbUrl_4_0= rulePropertyValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:284:1: (lv_dbUrl_4_0= rulePropertyValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:284:1: (lv_dbUrl_4_0= rulePropertyValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:285:3: lv_dbUrl_4_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getDbUrlPropertyValueParserRuleCall_0_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty565);
                    lv_dbUrl_4_0=rulePropertyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"dbUrl",
                              		lv_dbUrl_4_0, 
                              		"PropertyValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:302:6: (otherlv_5= 'database username' (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:302:6: (otherlv_5= 'database username' (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:302:8: otherlv_5= 'database username' (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleProperty585); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getDatabaseUsernameKeyword_0_3_0());
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:306:1: (this_WS_6= RULE_WS )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_WS) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:306:2: this_WS_6= RULE_WS
                    	    {
                    	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty597); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_6, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_3_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:310:3: ( (lv_dbUsername_7_0= rulePropertyValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:311:1: (lv_dbUsername_7_0= rulePropertyValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:311:1: (lv_dbUsername_7_0= rulePropertyValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:312:3: lv_dbUsername_7_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getDbUsernamePropertyValueParserRuleCall_0_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty619);
                    lv_dbUsername_7_0=rulePropertyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"dbUsername",
                              		lv_dbUsername_7_0, 
                              		"PropertyValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:329:6: (otherlv_8= 'database password' (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:329:6: (otherlv_8= 'database password' (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:329:8: otherlv_8= 'database password' (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleProperty639); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getDatabasePasswordKeyword_0_4_0());
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:333:1: (this_WS_9= RULE_WS )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_WS) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:333:2: this_WS_9= RULE_WS
                    	    {
                    	    this_WS_9=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty651); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_9, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_4_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:337:3: ( (lv_dbPassword_10_0= rulePropertyValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:338:1: (lv_dbPassword_10_0= rulePropertyValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:338:1: (lv_dbPassword_10_0= rulePropertyValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:339:3: lv_dbPassword_10_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getDbPasswordPropertyValueParserRuleCall_0_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty673);
                    lv_dbPassword_10_0=rulePropertyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"dbPassword",
                              		lv_dbPassword_10_0, 
                              		"PropertyValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:356:6: (otherlv_11= 'database schema' (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:356:6: (otherlv_11= 'database schema' (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:356:8: otherlv_11= 'database schema' (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) )
                    {
                    otherlv_11=(Token)match(input,39,FOLLOW_39_in_ruleProperty693); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getPropertyAccess().getDatabaseSchemaKeyword_0_5_0());
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:360:1: (this_WS_12= RULE_WS )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_WS) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:360:2: this_WS_12= RULE_WS
                    	    {
                    	    this_WS_12=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty705); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_12, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_5_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:364:3: ( (lv_dbSchema_13_0= rulePropertyValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:365:1: (lv_dbSchema_13_0= rulePropertyValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:365:1: (lv_dbSchema_13_0= rulePropertyValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:366:3: lv_dbSchema_13_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getDbSchemaPropertyValueParserRuleCall_0_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty727);
                    lv_dbSchema_13_0=rulePropertyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"dbSchema",
                              		lv_dbSchema_13_0, 
                              		"PropertyValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:383:6: (otherlv_14= 'database driver' (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:383:6: (otherlv_14= 'database driver' (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:383:8: otherlv_14= 'database driver' (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) )
                    {
                    otherlv_14=(Token)match(input,40,FOLLOW_40_in_ruleProperty747); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getPropertyAccess().getDatabaseDriverKeyword_0_6_0());
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:387:1: (this_WS_15= RULE_WS )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_WS) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:387:2: this_WS_15= RULE_WS
                    	    {
                    	    this_WS_15=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty759); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_15, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_6_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:391:3: ( (lv_dbDriver_16_0= rulePropertyValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:392:1: (lv_dbDriver_16_0= rulePropertyValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:392:1: (lv_dbDriver_16_0= rulePropertyValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:393:3: lv_dbDriver_16_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getDbDriverPropertyValueParserRuleCall_0_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty781);
                    lv_dbDriver_16_0=rulePropertyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"dbDriver",
                              		lv_dbDriver_16_0, 
                              		"PropertyValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            this_SEMICOLON_17=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleProperty794); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_17, grammarAccess.getPropertyAccess().getSEMICOLONTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePropertyValue"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:421:1: entryRulePropertyValue returns [String current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final String entryRulePropertyValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:422:2: (iv_rulePropertyValue= rulePropertyValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:423:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValueRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValue_in_entryRulePropertyValue830);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValue841); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:430:1: rulePropertyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COLON_28= RULE_COLON | this_STRING_29= RULE_STRING | this_COMMA_30= RULE_COMMA | this_MINUS_31= RULE_MINUS | this_PLUS_32= RULE_PLUS | this_LPAREN_33= RULE_LPAREN | this_RPAREN_34= RULE_RPAREN | this_LBRACE_35= RULE_LBRACE | this_RBRACE_36= RULE_RBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN ) )* ) ;
    public final AntlrDatatypeRuleToken rulePropertyValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_REST_0=null;
        Token this_IDENT_DOT_1=null;
        Token this_IDENT_2=null;
        Token this_NUMBER_3=null;
        Token this_COLON_4=null;
        Token this_STRING_5=null;
        Token this_COMMA_6=null;
        Token this_MINUS_7=null;
        Token this_PLUS_8=null;
        Token this_LPAREN_9=null;
        Token this_RPAREN_10=null;
        Token this_LBRACE_11=null;
        Token this_RBRACE_12=null;
        Token this_QUESTI_13=null;
        Token this_NOT_14=null;
        Token this_BAND_15=null;
        Token this_BOR_16=null;
        Token this_HASH_17=null;
        Token this_AT_18=null;
        Token this_CARET_19=null;
        Token this_EQUALS_20=null;
        Token this_LESS_THAN_21=null;
        Token this_MORE_THAN_22=null;
        Token this_REST_23=null;
        Token this_IDENT_DOT_24=null;
        Token this_IDENT_25=null;
        Token this_NUMBER_26=null;
        Token this_WS_27=null;
        Token this_COLON_28=null;
        Token this_STRING_29=null;
        Token this_COMMA_30=null;
        Token this_MINUS_31=null;
        Token this_PLUS_32=null;
        Token this_LPAREN_33=null;
        Token this_RPAREN_34=null;
        Token this_LBRACE_35=null;
        Token this_RBRACE_36=null;
        Token this_QUESTI_37=null;
        Token this_NOT_38=null;
        Token this_BAND_39=null;
        Token this_BOR_40=null;
        Token this_HASH_41=null;
        Token this_AT_42=null;
        Token this_CARET_43=null;
        Token this_EQUALS_44=null;
        Token this_LESS_THAN_45=null;
        Token this_MORE_THAN_46=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:433:28: ( ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COLON_28= RULE_COLON | this_STRING_29= RULE_STRING | this_COMMA_30= RULE_COMMA | this_MINUS_31= RULE_MINUS | this_PLUS_32= RULE_PLUS | this_LPAREN_33= RULE_LPAREN | this_RPAREN_34= RULE_RPAREN | this_LBRACE_35= RULE_LBRACE | this_RBRACE_36= RULE_RBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:434:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COLON_28= RULE_COLON | this_STRING_29= RULE_STRING | this_COMMA_30= RULE_COMMA | this_MINUS_31= RULE_MINUS | this_PLUS_32= RULE_PLUS | this_LPAREN_33= RULE_LPAREN | this_RPAREN_34= RULE_RPAREN | this_LBRACE_35= RULE_LBRACE | this_RBRACE_36= RULE_RBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:434:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COLON_28= RULE_COLON | this_STRING_29= RULE_STRING | this_COMMA_30= RULE_COMMA | this_MINUS_31= RULE_MINUS | this_PLUS_32= RULE_PLUS | this_LPAREN_33= RULE_LPAREN | this_RPAREN_34= RULE_RPAREN | this_LBRACE_35= RULE_LBRACE | this_RBRACE_36= RULE_RBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:434:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COLON_28= RULE_COLON | this_STRING_29= RULE_STRING | this_COMMA_30= RULE_COMMA | this_MINUS_31= RULE_MINUS | this_PLUS_32= RULE_PLUS | this_LPAREN_33= RULE_LPAREN | this_RPAREN_34= RULE_RPAREN | this_LBRACE_35= RULE_LBRACE | this_RBRACE_36= RULE_RBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:434:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN )
            int alt15=23;
            switch ( input.LA(1) ) {
            case RULE_REST:
                {
                alt15=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt15=2;
                }
                break;
            case RULE_IDENT:
                {
                alt15=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt15=4;
                }
                break;
            case RULE_COLON:
                {
                alt15=5;
                }
                break;
            case RULE_STRING:
                {
                alt15=6;
                }
                break;
            case RULE_COMMA:
                {
                alt15=7;
                }
                break;
            case RULE_MINUS:
                {
                alt15=8;
                }
                break;
            case RULE_PLUS:
                {
                alt15=9;
                }
                break;
            case RULE_LPAREN:
                {
                alt15=10;
                }
                break;
            case RULE_RPAREN:
                {
                alt15=11;
                }
                break;
            case RULE_LBRACE:
                {
                alt15=12;
                }
                break;
            case RULE_RBRACE:
                {
                alt15=13;
                }
                break;
            case RULE_QUESTI:
                {
                alt15=14;
                }
                break;
            case RULE_NOT:
                {
                alt15=15;
                }
                break;
            case RULE_BAND:
                {
                alt15=16;
                }
                break;
            case RULE_BOR:
                {
                alt15=17;
                }
                break;
            case RULE_HASH:
                {
                alt15=18;
                }
                break;
            case RULE_AT:
                {
                alt15=19;
                }
                break;
            case RULE_CARET:
                {
                alt15=20;
                }
                break;
            case RULE_EQUALS:
                {
                alt15=21;
                }
                break;
            case RULE_LESS_THAN:
                {
                alt15=22;
                }
                break;
            case RULE_MORE_THAN:
                {
                alt15=23;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:434:7: this_REST_0= RULE_REST
                    {
                    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_rulePropertyValue882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REST_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REST_0, grammarAccess.getPropertyValueAccess().getRESTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:442:10: this_IDENT_DOT_1= RULE_IDENT_DOT
                    {
                    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_rulePropertyValue908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_DOT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_DOT_1, grammarAccess.getPropertyValueAccess().getIDENT_DOTTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:450:10: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePropertyValue934); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_2, grammarAccess.getPropertyValueAccess().getIDENTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:458:10: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rulePropertyValue960); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_3, grammarAccess.getPropertyValueAccess().getNUMBERTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:466:10: this_COLON_4= RULE_COLON
                    {
                    this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulePropertyValue986); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COLON_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_4, grammarAccess.getPropertyValueAccess().getCOLONTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:474:10: this_STRING_5= RULE_STRING
                    {
                    this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertyValue1012); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_5, grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:482:10: this_COMMA_6= RULE_COMMA
                    {
                    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulePropertyValue1038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_6, grammarAccess.getPropertyValueAccess().getCOMMATerminalRuleCall_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:490:10: this_MINUS_7= RULE_MINUS
                    {
                    this_MINUS_7=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_rulePropertyValue1064); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_7, grammarAccess.getPropertyValueAccess().getMINUSTerminalRuleCall_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:498:10: this_PLUS_8= RULE_PLUS
                    {
                    this_PLUS_8=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rulePropertyValue1090); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_8, grammarAccess.getPropertyValueAccess().getPLUSTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:506:10: this_LPAREN_9= RULE_LPAREN
                    {
                    this_LPAREN_9=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rulePropertyValue1116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LPAREN_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_9, grammarAccess.getPropertyValueAccess().getLPARENTerminalRuleCall_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:514:10: this_RPAREN_10= RULE_RPAREN
                    {
                    this_RPAREN_10=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rulePropertyValue1142); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RPAREN_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_10, grammarAccess.getPropertyValueAccess().getRPARENTerminalRuleCall_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:522:10: this_LBRACE_11= RULE_LBRACE
                    {
                    this_LBRACE_11=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rulePropertyValue1168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LBRACE_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACE_11, grammarAccess.getPropertyValueAccess().getLBRACETerminalRuleCall_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:530:10: this_RBRACE_12= RULE_RBRACE
                    {
                    this_RBRACE_12=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rulePropertyValue1194); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RBRACE_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RBRACE_12, grammarAccess.getPropertyValueAccess().getRBRACETerminalRuleCall_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:538:10: this_QUESTI_13= RULE_QUESTI
                    {
                    this_QUESTI_13=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_rulePropertyValue1220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUESTI_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUESTI_13, grammarAccess.getPropertyValueAccess().getQUESTITerminalRuleCall_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:546:10: this_NOT_14= RULE_NOT
                    {
                    this_NOT_14=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_rulePropertyValue1246); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_14, grammarAccess.getPropertyValueAccess().getNOTTerminalRuleCall_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:554:10: this_BAND_15= RULE_BAND
                    {
                    this_BAND_15=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_rulePropertyValue1272); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BAND_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BAND_15, grammarAccess.getPropertyValueAccess().getBANDTerminalRuleCall_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:562:10: this_BOR_16= RULE_BOR
                    {
                    this_BOR_16=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_rulePropertyValue1298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOR_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_16, grammarAccess.getPropertyValueAccess().getBORTerminalRuleCall_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:570:10: this_HASH_17= RULE_HASH
                    {
                    this_HASH_17=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rulePropertyValue1324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASH_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASH_17, grammarAccess.getPropertyValueAccess().getHASHTerminalRuleCall_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:578:10: this_AT_18= RULE_AT
                    {
                    this_AT_18=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_rulePropertyValue1350); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AT_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_18, grammarAccess.getPropertyValueAccess().getATTerminalRuleCall_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:586:10: this_CARET_19= RULE_CARET
                    {
                    this_CARET_19=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_rulePropertyValue1376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CARET_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_19, grammarAccess.getPropertyValueAccess().getCARETTerminalRuleCall_0_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:594:10: this_EQUALS_20= RULE_EQUALS
                    {
                    this_EQUALS_20=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rulePropertyValue1402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUALS_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_20, grammarAccess.getPropertyValueAccess().getEQUALSTerminalRuleCall_0_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:602:10: this_LESS_THAN_21= RULE_LESS_THAN
                    {
                    this_LESS_THAN_21=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_rulePropertyValue1428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LESS_THAN_21);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LESS_THAN_21, grammarAccess.getPropertyValueAccess().getLESS_THANTerminalRuleCall_0_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:610:10: this_MORE_THAN_22= RULE_MORE_THAN
                    {
                    this_MORE_THAN_22=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_rulePropertyValue1454); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MORE_THAN_22);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MORE_THAN_22, grammarAccess.getPropertyValueAccess().getMORE_THANTerminalRuleCall_0_22()); 
                          
                    }

                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:617:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COLON_28= RULE_COLON | this_STRING_29= RULE_STRING | this_COMMA_30= RULE_COMMA | this_MINUS_31= RULE_MINUS | this_PLUS_32= RULE_PLUS | this_LPAREN_33= RULE_LPAREN | this_RPAREN_34= RULE_RPAREN | this_LBRACE_35= RULE_LBRACE | this_RBRACE_36= RULE_RBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN ) )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:617:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COLON_28= RULE_COLON | this_STRING_29= RULE_STRING | this_COMMA_30= RULE_COMMA | this_MINUS_31= RULE_MINUS | this_PLUS_32= RULE_PLUS | this_LPAREN_33= RULE_LPAREN | this_RPAREN_34= RULE_RPAREN | this_LBRACE_35= RULE_LBRACE | this_RBRACE_36= RULE_RBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:640:24: (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COLON_28= RULE_COLON | this_STRING_29= RULE_STRING | this_COMMA_30= RULE_COMMA | this_MINUS_31= RULE_MINUS | this_PLUS_32= RULE_PLUS | this_LPAREN_33= RULE_LPAREN | this_RPAREN_34= RULE_RPAREN | this_LBRACE_35= RULE_LBRACE | this_RBRACE_36= RULE_RBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN )
            	    int alt16=24;
            	    switch ( input.LA(1) ) {
            	    case RULE_REST:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case RULE_IDENT_DOT:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case RULE_IDENT:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    case RULE_NUMBER:
            	        {
            	        alt16=4;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt16=5;
            	        }
            	        break;
            	    case RULE_COLON:
            	        {
            	        alt16=6;
            	        }
            	        break;
            	    case RULE_STRING:
            	        {
            	        alt16=7;
            	        }
            	        break;
            	    case RULE_COMMA:
            	        {
            	        alt16=8;
            	        }
            	        break;
            	    case RULE_MINUS:
            	        {
            	        alt16=9;
            	        }
            	        break;
            	    case RULE_PLUS:
            	        {
            	        alt16=10;
            	        }
            	        break;
            	    case RULE_LPAREN:
            	        {
            	        alt16=11;
            	        }
            	        break;
            	    case RULE_RPAREN:
            	        {
            	        alt16=12;
            	        }
            	        break;
            	    case RULE_LBRACE:
            	        {
            	        alt16=13;
            	        }
            	        break;
            	    case RULE_RBRACE:
            	        {
            	        alt16=14;
            	        }
            	        break;
            	    case RULE_QUESTI:
            	        {
            	        alt16=15;
            	        }
            	        break;
            	    case RULE_NOT:
            	        {
            	        alt16=16;
            	        }
            	        break;
            	    case RULE_BAND:
            	        {
            	        alt16=17;
            	        }
            	        break;
            	    case RULE_BOR:
            	        {
            	        alt16=18;
            	        }
            	        break;
            	    case RULE_HASH:
            	        {
            	        alt16=19;
            	        }
            	        break;
            	    case RULE_AT:
            	        {
            	        alt16=20;
            	        }
            	        break;
            	    case RULE_CARET:
            	        {
            	        alt16=21;
            	        }
            	        break;
            	    case RULE_EQUALS:
            	        {
            	        alt16=22;
            	        }
            	        break;
            	    case RULE_LESS_THAN:
            	        {
            	        alt16=23;
            	        }
            	        break;
            	    case RULE_MORE_THAN:
            	        {
            	        alt16=24;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:640:29: this_REST_23= RULE_REST
            	            {
            	            this_REST_23=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_rulePropertyValue1644); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REST_23);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REST_23, grammarAccess.getPropertyValueAccess().getRESTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:648:10: this_IDENT_DOT_24= RULE_IDENT_DOT
            	            {
            	            this_IDENT_DOT_24=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_rulePropertyValue1670); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_DOT_24);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_DOT_24, grammarAccess.getPropertyValueAccess().getIDENT_DOTTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:656:10: this_IDENT_25= RULE_IDENT
            	            {
            	            this_IDENT_25=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePropertyValue1696); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_25);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_25, grammarAccess.getPropertyValueAccess().getIDENTTerminalRuleCall_1_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:664:10: this_NUMBER_26= RULE_NUMBER
            	            {
            	            this_NUMBER_26=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rulePropertyValue1722); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NUMBER_26);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NUMBER_26, grammarAccess.getPropertyValueAccess().getNUMBERTerminalRuleCall_1_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:672:10: this_WS_27= RULE_WS
            	            {
            	            this_WS_27=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulePropertyValue1748); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_WS_27);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_WS_27, grammarAccess.getPropertyValueAccess().getWSTerminalRuleCall_1_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:680:10: this_COLON_28= RULE_COLON
            	            {
            	            this_COLON_28=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulePropertyValue1774); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COLON_28);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COLON_28, grammarAccess.getPropertyValueAccess().getCOLONTerminalRuleCall_1_0_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:688:10: this_STRING_29= RULE_STRING
            	            {
            	            this_STRING_29=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertyValue1800); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_STRING_29);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_STRING_29, grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_1_0_6()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:696:10: this_COMMA_30= RULE_COMMA
            	            {
            	            this_COMMA_30=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulePropertyValue1826); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COMMA_30);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COMMA_30, grammarAccess.getPropertyValueAccess().getCOMMATerminalRuleCall_1_0_7()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:704:10: this_MINUS_31= RULE_MINUS
            	            {
            	            this_MINUS_31=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_rulePropertyValue1852); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MINUS_31);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MINUS_31, grammarAccess.getPropertyValueAccess().getMINUSTerminalRuleCall_1_0_8()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:712:10: this_PLUS_32= RULE_PLUS
            	            {
            	            this_PLUS_32=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rulePropertyValue1878); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PLUS_32);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PLUS_32, grammarAccess.getPropertyValueAccess().getPLUSTerminalRuleCall_1_0_9()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:720:10: this_LPAREN_33= RULE_LPAREN
            	            {
            	            this_LPAREN_33=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rulePropertyValue1904); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LPAREN_33);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LPAREN_33, grammarAccess.getPropertyValueAccess().getLPARENTerminalRuleCall_1_0_10()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:728:10: this_RPAREN_34= RULE_RPAREN
            	            {
            	            this_RPAREN_34=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rulePropertyValue1930); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RPAREN_34);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RPAREN_34, grammarAccess.getPropertyValueAccess().getRPARENTerminalRuleCall_1_0_11()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 13 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:736:10: this_LBRACE_35= RULE_LBRACE
            	            {
            	            this_LBRACE_35=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rulePropertyValue1956); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LBRACE_35);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LBRACE_35, grammarAccess.getPropertyValueAccess().getLBRACETerminalRuleCall_1_0_12()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 14 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:744:10: this_RBRACE_36= RULE_RBRACE
            	            {
            	            this_RBRACE_36=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rulePropertyValue1982); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RBRACE_36);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RBRACE_36, grammarAccess.getPropertyValueAccess().getRBRACETerminalRuleCall_1_0_13()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 15 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:752:10: this_QUESTI_37= RULE_QUESTI
            	            {
            	            this_QUESTI_37=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_rulePropertyValue2008); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_QUESTI_37);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_QUESTI_37, grammarAccess.getPropertyValueAccess().getQUESTITerminalRuleCall_1_0_14()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 16 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:760:10: this_NOT_38= RULE_NOT
            	            {
            	            this_NOT_38=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_rulePropertyValue2034); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NOT_38);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NOT_38, grammarAccess.getPropertyValueAccess().getNOTTerminalRuleCall_1_0_15()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 17 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:768:10: this_BAND_39= RULE_BAND
            	            {
            	            this_BAND_39=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_rulePropertyValue2060); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BAND_39);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BAND_39, grammarAccess.getPropertyValueAccess().getBANDTerminalRuleCall_1_0_16()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 18 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:776:10: this_BOR_40= RULE_BOR
            	            {
            	            this_BOR_40=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_rulePropertyValue2086); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BOR_40);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BOR_40, grammarAccess.getPropertyValueAccess().getBORTerminalRuleCall_1_0_17()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 19 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:784:10: this_HASH_41= RULE_HASH
            	            {
            	            this_HASH_41=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rulePropertyValue2112); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_HASH_41);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_HASH_41, grammarAccess.getPropertyValueAccess().getHASHTerminalRuleCall_1_0_18()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 20 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:792:10: this_AT_42= RULE_AT
            	            {
            	            this_AT_42=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_rulePropertyValue2138); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AT_42);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AT_42, grammarAccess.getPropertyValueAccess().getATTerminalRuleCall_1_0_19()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 21 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:800:10: this_CARET_43= RULE_CARET
            	            {
            	            this_CARET_43=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_rulePropertyValue2164); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_CARET_43);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_CARET_43, grammarAccess.getPropertyValueAccess().getCARETTerminalRuleCall_1_0_20()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 22 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:808:10: this_EQUALS_44= RULE_EQUALS
            	            {
            	            this_EQUALS_44=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rulePropertyValue2190); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_EQUALS_44);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_EQUALS_44, grammarAccess.getPropertyValueAccess().getEQUALSTerminalRuleCall_1_0_21()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 23 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:816:10: this_LESS_THAN_45= RULE_LESS_THAN
            	            {
            	            this_LESS_THAN_45=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_rulePropertyValue2216); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LESS_THAN_45);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LESS_THAN_45, grammarAccess.getPropertyValueAccess().getLESS_THANTerminalRuleCall_1_0_22()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 24 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:824:10: this_MORE_THAN_46= RULE_MORE_THAN
            	            {
            	            this_MORE_THAN_46=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_rulePropertyValue2242); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MORE_THAN_46);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MORE_THAN_46, grammarAccess.getPropertyValueAccess().getMORE_THANTerminalRuleCall_1_0_23()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRulePojoDefinition"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:839:1: entryRulePojoDefinition returns [EObject current=null] : iv_rulePojoDefinition= rulePojoDefinition EOF ;
    public final EObject entryRulePojoDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePojoDefinition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:843:2: (iv_rulePojoDefinition= rulePojoDefinition EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:844:2: iv_rulePojoDefinition= rulePojoDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPojoDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePojoDefinition_in_entryRulePojoDefinition2296);
            iv_rulePojoDefinition=rulePojoDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePojoDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePojoDefinition2306); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePojoDefinition"


    // $ANTLR start "rulePojoDefinition"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:854:1: rulePojoDefinition returns [EObject current=null] : (otherlv_0= 'pojo' ( (lv_name_1_0= RULE_IDENT ) ) ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject rulePojoDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_class_2_1=null;
        Token lv_class_2_2=null;
        Token this_SEMICOLON_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:858:28: ( (otherlv_0= 'pojo' ( (lv_name_1_0= RULE_IDENT ) ) ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:859:1: (otherlv_0= 'pojo' ( (lv_name_1_0= RULE_IDENT ) ) ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:859:1: (otherlv_0= 'pojo' ( (lv_name_1_0= RULE_IDENT ) ) ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:859:3: otherlv_0= 'pojo' ( (lv_name_1_0= RULE_IDENT ) ) ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_rulePojoDefinition2347); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPojoDefinitionAccess().getPojoKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:863:1: ( (lv_name_1_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:864:1: (lv_name_1_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:864:1: (lv_name_1_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:865:3: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePojoDefinition2364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getPojoDefinitionAccess().getNameIDENTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPojoDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"IDENT");
              	    
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:881:2: ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:882:1: ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:882:1: ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:883:1: (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:883:1: (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_IDENT) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_IDENT_DOT) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:884:3: lv_class_2_1= RULE_IDENT
                    {
                    lv_class_2_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePojoDefinition2388); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_class_2_1, grammarAccess.getPojoDefinitionAccess().getClassIDENTTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPojoDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"class",
                              		lv_class_2_1, 
                              		"IDENT");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:899:8: lv_class_2_2= RULE_IDENT_DOT
                    {
                    lv_class_2_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_rulePojoDefinition2408); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_class_2_2, grammarAccess.getPojoDefinitionAccess().getClassIDENT_DOTTerminalRuleCall_2_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPojoDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"class",
                              		lv_class_2_2, 
                              		"IDENT_DOT");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulePojoDefinition2427); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_3, grammarAccess.getPojoDefinitionAccess().getSEMICOLONTerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePojoDefinition"


    // $ANTLR start "entryRulePojoUsage"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:932:1: entryRulePojoUsage returns [EObject current=null] : iv_rulePojoUsage= rulePojoUsage EOF ;
    public final EObject entryRulePojoUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePojoUsage = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:933:2: (iv_rulePojoUsage= rulePojoUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:934:2: iv_rulePojoUsage= rulePojoUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPojoUsageRule()); 
            }
            pushFollow(FOLLOW_rulePojoUsage_in_entryRulePojoUsage2466);
            iv_rulePojoUsage=rulePojoUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePojoUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePojoUsage2476); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePojoUsage"


    // $ANTLR start "rulePojoUsage"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:941:1: rulePojoUsage returns [EObject current=null] : (this_ColumnUsage_0= ruleColumnUsage | this_IdentifierUsage_1= ruleIdentifierUsage | this_ConstantUsage_2= ruleConstantUsage | this_MappingUsage_3= ruleMappingUsage ) ;
    public final EObject rulePojoUsage() throws RecognitionException {
        EObject current = null;

        EObject this_ColumnUsage_0 = null;

        EObject this_IdentifierUsage_1 = null;

        EObject this_ConstantUsage_2 = null;

        EObject this_MappingUsage_3 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:944:28: ( (this_ColumnUsage_0= ruleColumnUsage | this_IdentifierUsage_1= ruleIdentifierUsage | this_ConstantUsage_2= ruleConstantUsage | this_MappingUsage_3= ruleMappingUsage ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:945:1: (this_ColumnUsage_0= ruleColumnUsage | this_IdentifierUsage_1= ruleIdentifierUsage | this_ConstantUsage_2= ruleConstantUsage | this_MappingUsage_3= ruleMappingUsage )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:945:1: (this_ColumnUsage_0= ruleColumnUsage | this_IdentifierUsage_1= ruleIdentifierUsage | this_ConstantUsage_2= ruleConstantUsage | this_MappingUsage_3= ruleMappingUsage )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt19=1;
                }
                break;
            case 43:
                {
                alt19=2;
                }
                break;
            case 44:
                {
                alt19=3;
                }
                break;
            case 45:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:946:5: this_ColumnUsage_0= ruleColumnUsage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPojoUsageAccess().getColumnUsageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleColumnUsage_in_rulePojoUsage2523);
                    this_ColumnUsage_0=ruleColumnUsage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ColumnUsage_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:956:5: this_IdentifierUsage_1= ruleIdentifierUsage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPojoUsageAccess().getIdentifierUsageParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdentifierUsage_in_rulePojoUsage2550);
                    this_IdentifierUsage_1=ruleIdentifierUsage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IdentifierUsage_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:966:5: this_ConstantUsage_2= ruleConstantUsage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPojoUsageAccess().getConstantUsageParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantUsage_in_rulePojoUsage2577);
                    this_ConstantUsage_2=ruleConstantUsage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantUsage_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:976:5: this_MappingUsage_3= ruleMappingUsage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPojoUsageAccess().getMappingUsageParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMappingUsage_in_rulePojoUsage2604);
                    this_MappingUsage_3=ruleMappingUsage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MappingUsage_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePojoUsage"


    // $ANTLR start "entryRuleColumnUsage"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:992:1: entryRuleColumnUsage returns [EObject current=null] : iv_ruleColumnUsage= ruleColumnUsage EOF ;
    public final EObject entryRuleColumnUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnUsage = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:996:2: (iv_ruleColumnUsage= ruleColumnUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:997:2: iv_ruleColumnUsage= ruleColumnUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnUsageRule()); 
            }
            pushFollow(FOLLOW_ruleColumnUsage_in_entryRuleColumnUsage2645);
            iv_ruleColumnUsage=ruleColumnUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnUsage2655); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleColumnUsage"


    // $ANTLR start "ruleColumnUsage"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1007:1: ruleColumnUsage returns [EObject current=null] : (otherlv_0= 'col' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleColumnUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1011:28: ( (otherlv_0= 'col' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1012:1: (otherlv_0= 'col' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1012:1: (otherlv_0= 'col' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1012:3: otherlv_0= 'col' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleColumnUsage2696); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getColumnUsageAccess().getColKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1016:1: ( (otherlv_1= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1017:1: (otherlv_1= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1017:1: (otherlv_1= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1018:3: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getColumnUsageRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumnUsage2716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getColumnUsageAccess().getStatementMetaStatementCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1029:2: ( (otherlv_2= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1030:1: (otherlv_2= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1030:1: (otherlv_2= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1031:3: otherlv_2= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getColumnUsageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumnUsage2736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getColumnUsageAccess().getPojoPojoDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleColumnUsage2747); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_3, grammarAccess.getColumnUsageAccess().getSEMICOLONTerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleColumnUsage"


    // $ANTLR start "entryRuleIdentifierUsage"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1057:1: entryRuleIdentifierUsage returns [EObject current=null] : iv_ruleIdentifierUsage= ruleIdentifierUsage EOF ;
    public final EObject entryRuleIdentifierUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifierUsage = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1061:2: (iv_ruleIdentifierUsage= ruleIdentifierUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1062:2: iv_ruleIdentifierUsage= ruleIdentifierUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierUsageRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifierUsage_in_entryRuleIdentifierUsage2792);
            iv_ruleIdentifierUsage=ruleIdentifierUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifierUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifierUsage2802); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifierUsage"


    // $ANTLR start "ruleIdentifierUsage"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1072:1: ruleIdentifierUsage returns [EObject current=null] : (otherlv_0= 'ident' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleIdentifierUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1076:28: ( (otherlv_0= 'ident' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1077:1: (otherlv_0= 'ident' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1077:1: (otherlv_0= 'ident' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1077:3: otherlv_0= 'ident' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleIdentifierUsage2843); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIdentifierUsageAccess().getIdentKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1081:1: ( (otherlv_1= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1082:1: (otherlv_1= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1082:1: (otherlv_1= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1083:3: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIdentifierUsageRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifierUsage2863); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getIdentifierUsageAccess().getStatementMetaStatementCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1094:2: ( (otherlv_2= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1095:1: (otherlv_2= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1095:1: (otherlv_2= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1096:3: otherlv_2= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIdentifierUsageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifierUsage2883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getIdentifierUsageAccess().getPojoPojoDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleIdentifierUsage2894); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_3, grammarAccess.getIdentifierUsageAccess().getSEMICOLONTerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleIdentifierUsage"


    // $ANTLR start "entryRuleConstantUsage"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1122:1: entryRuleConstantUsage returns [EObject current=null] : iv_ruleConstantUsage= ruleConstantUsage EOF ;
    public final EObject entryRuleConstantUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantUsage = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1126:2: (iv_ruleConstantUsage= ruleConstantUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1127:2: iv_ruleConstantUsage= ruleConstantUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantUsageRule()); 
            }
            pushFollow(FOLLOW_ruleConstantUsage_in_entryRuleConstantUsage2939);
            iv_ruleConstantUsage=ruleConstantUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantUsage2949); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleConstantUsage"


    // $ANTLR start "ruleConstantUsage"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1137:1: ruleConstantUsage returns [EObject current=null] : (otherlv_0= 'const' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleConstantUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1141:28: ( (otherlv_0= 'const' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1142:1: (otherlv_0= 'const' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1142:1: (otherlv_0= 'const' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1142:3: otherlv_0= 'const' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleConstantUsage2990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantUsageAccess().getConstKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1146:1: ( (otherlv_1= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1147:1: (otherlv_1= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1147:1: (otherlv_1= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1148:3: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantUsageRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstantUsage3010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getConstantUsageAccess().getStatementMetaStatementCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1159:2: ( (otherlv_2= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1160:1: (otherlv_2= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1160:1: (otherlv_2= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1161:3: otherlv_2= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantUsageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstantUsage3030); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getConstantUsageAccess().getPojoPojoDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleConstantUsage3041); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_3, grammarAccess.getConstantUsageAccess().getSEMICOLONTerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleConstantUsage"


    // $ANTLR start "entryRuleMappingUsage"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1187:1: entryRuleMappingUsage returns [EObject current=null] : iv_ruleMappingUsage= ruleMappingUsage EOF ;
    public final EObject entryRuleMappingUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingUsage = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1191:2: (iv_ruleMappingUsage= ruleMappingUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1192:2: iv_ruleMappingUsage= ruleMappingUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingUsageRule()); 
            }
            pushFollow(FOLLOW_ruleMappingUsage_in_entryRuleMappingUsage3086);
            iv_ruleMappingUsage=ruleMappingUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingUsage3096); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleMappingUsage"


    // $ANTLR start "ruleMappingUsage"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1202:1: ruleMappingUsage returns [EObject current=null] : (otherlv_0= 'out' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleMappingUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1206:28: ( (otherlv_0= 'out' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1207:1: (otherlv_0= 'out' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1207:1: (otherlv_0= 'out' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1207:3: otherlv_0= 'out' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleMappingUsage3137); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMappingUsageAccess().getOutKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1211:1: ( (otherlv_1= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1212:1: (otherlv_1= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1212:1: (otherlv_1= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1213:3: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMappingUsageRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingUsage3157); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getMappingUsageAccess().getStatementMappingRuleCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1224:2: ( (otherlv_2= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1225:1: (otherlv_2= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1225:1: (otherlv_2= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1226:3: otherlv_2= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMappingUsageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingUsage3177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getMappingUsageAccess().getPojoPojoDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleMappingUsage3188); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_3, grammarAccess.getMappingUsageAccess().getSEMICOLONTerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleMappingUsage"


    // $ANTLR start "entryRuleMetaStatement"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1252:1: entryRuleMetaStatement returns [EObject current=null] : iv_ruleMetaStatement= ruleMetaStatement EOF ;
    public final EObject entryRuleMetaStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaStatement = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1253:2: (iv_ruleMetaStatement= ruleMetaStatement EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1254:2: iv_ruleMetaStatement= ruleMetaStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaStatementRule()); 
            }
            pushFollow(FOLLOW_ruleMetaStatement_in_entryRuleMetaStatement3227);
            iv_ruleMetaStatement=ruleMetaStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaStatement3237); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetaStatement"


    // $ANTLR start "ruleMetaStatement"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1261:1: ruleMetaStatement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON ) ;
    public final EObject ruleMetaStatement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_LPAREN_1=null;
        Token this_COMMA_3=null;
        Token lv_filters_4_0=null;
        Token this_RPAREN_5=null;
        Token this_EQUALS_6=null;
        Token this_SEMICOLON_8=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_statement_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1264:28: ( ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1265:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1265:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1265:2: ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1265:2: ( (lv_name_0_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1266:1: (lv_name_0_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1266:1: (lv_name_0_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1267:3: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMetaStatement3279); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getMetaStatementAccess().getNameIDENTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMetaStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"IDENT");
              	    
            }

            }


            }

            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleMetaStatement3295); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_1, grammarAccess.getMetaStatementAccess().getLPARENTerminalRuleCall_1()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1287:1: ( (lv_type_2_0= ruleSTATEMEN_TYPE ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1288:1: (lv_type_2_0= ruleSTATEMEN_TYPE )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1288:1: (lv_type_2_0= ruleSTATEMEN_TYPE )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1289:3: lv_type_2_0= ruleSTATEMEN_TYPE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMetaStatementAccess().getTypeSTATEMEN_TYPEEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSTATEMEN_TYPE_in_ruleMetaStatement3315);
            lv_type_2_0=ruleSTATEMEN_TYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMetaStatementRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"STATEMEN_TYPE");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1305:2: (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1305:3: this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleMetaStatement3327); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getMetaStatementAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1309:1: ( (lv_filters_4_0= RULE_IDENT ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1310:1: (lv_filters_4_0= RULE_IDENT )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1310:1: (lv_filters_4_0= RULE_IDENT )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1311:3: lv_filters_4_0= RULE_IDENT
            	    {
            	    lv_filters_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMetaStatement3343); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_filters_4_0, grammarAccess.getMetaStatementAccess().getFiltersIDENTTerminalRuleCall_3_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMetaStatementRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"filters",
            	              		lv_filters_4_0, 
            	              		"IDENT");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            this_RPAREN_5=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleMetaStatement3361); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_5, grammarAccess.getMetaStatementAccess().getRPARENTerminalRuleCall_4()); 
                  
            }
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleMetaStatement3371); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUALS_6, grammarAccess.getMetaStatementAccess().getEQUALSTerminalRuleCall_5()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1335:1: ( (lv_statement_7_0= ruleSql ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1336:1: (lv_statement_7_0= ruleSql )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1336:1: (lv_statement_7_0= ruleSql )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1337:3: lv_statement_7_0= ruleSql
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMetaStatementAccess().getStatementSqlParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSql_in_ruleMetaStatement3391);
            lv_statement_7_0=ruleSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMetaStatementRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_7_0, 
                      		"Sql");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleMetaStatement3402); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_8, grammarAccess.getMetaStatementAccess().getSEMICOLONTerminalRuleCall_7()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetaStatement"


    // $ANTLR start "entryRuleSql"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1365:1: entryRuleSql returns [EObject current=null] : iv_ruleSql= ruleSql EOF ;
    public final EObject entryRuleSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1366:2: (iv_ruleSql= ruleSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1367:2: iv_ruleSql= ruleSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlRule()); 
            }
            pushFollow(FOLLOW_ruleSql_in_entryRuleSql3437);
            iv_ruleSql=ruleSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSql3447); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSql"


    // $ANTLR start "ruleSql"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1374:1: ruleSql returns [EObject current=null] : ( (lv_sqls_0_0= ruleSqlFragment ) )+ ;
    public final EObject ruleSql() throws RecognitionException {
        EObject current = null;

        EObject lv_sqls_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1377:28: ( ( (lv_sqls_0_0= ruleSqlFragment ) )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1378:1: ( (lv_sqls_0_0= ruleSqlFragment ) )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1378:1: ( (lv_sqls_0_0= ruleSqlFragment ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_WS||(LA21_0>=RULE_REST && LA21_0<=RULE_ESC_CHAR)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1379:1: (lv_sqls_0_0= ruleSqlFragment )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1379:1: (lv_sqls_0_0= ruleSqlFragment )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1380:3: lv_sqls_0_0= ruleSqlFragment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSqlAccess().getSqlsSqlFragmentParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSqlFragment_in_ruleSql3492);
            	    lv_sqls_0_0=ruleSqlFragment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSqlRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"sqls",
            	              		lv_sqls_0_0, 
            	              		"SqlFragment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSql"


    // $ANTLR start "entryRuleSqlFragment"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1404:1: entryRuleSqlFragment returns [EObject current=null] : iv_ruleSqlFragment= ruleSqlFragment EOF ;
    public final EObject entryRuleSqlFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqlFragment = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1405:2: (iv_ruleSqlFragment= ruleSqlFragment EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1406:2: iv_ruleSqlFragment= ruleSqlFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleSqlFragment_in_entryRuleSqlFragment3528);
            iv_ruleSqlFragment=ruleSqlFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqlFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlFragment3538); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSqlFragment"


    // $ANTLR start "ruleSqlFragment"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1413:1: ruleSqlFragment returns [EObject current=null] : ( ( (lv_value_0_0= ruleSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) ) ;
    public final EObject ruleSqlFragment() throws RecognitionException {
        EObject current = null;

        Token this_AT_1=null;
        Token this_STRING_3=null;
        Token this_COLON_5=null;
        Token this_LBRACE_7=null;
        Token this_RBRACE_9=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject lv_col_2_0 = null;

        EObject lv_cnst_4_0 = null;

        EObject lv_ident_6_0 = null;

        EObject lv_meta_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1416:28: ( ( ( (lv_value_0_0= ruleSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1417:1: ( ( (lv_value_0_0= ruleSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1417:1: ( ( (lv_value_0_0= ruleSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) )
            int alt22=5;
            switch ( input.LA(1) ) {
            case RULE_WS:
            case RULE_REST:
            case RULE_IDENT_DOT:
            case RULE_IDENT:
            case RULE_NUMBER:
            case RULE_COMMA:
            case RULE_MINUS:
            case RULE_PLUS:
            case RULE_LPAREN:
            case RULE_RPAREN:
            case RULE_RBRACE:
            case RULE_QUESTI:
            case RULE_NOT:
            case RULE_BAND:
            case RULE_BOR:
            case RULE_HASH:
            case RULE_CARET:
            case RULE_EQUALS:
            case RULE_LESS_THAN:
            case RULE_MORE_THAN:
            case RULE_ESC_CHAR:
                {
                alt22=1;
                }
                break;
            case RULE_AT:
                {
                alt22=2;
                }
                break;
            case RULE_STRING:
                {
                alt22=3;
                }
                break;
            case RULE_COLON:
                {
                alt22=4;
                }
                break;
            case RULE_LBRACE:
                {
                alt22=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1417:2: ( (lv_value_0_0= ruleSqlValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1417:2: ( (lv_value_0_0= ruleSqlValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1418:1: (lv_value_0_0= ruleSqlValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1418:1: (lv_value_0_0= ruleSqlValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1419:3: lv_value_0_0= ruleSqlValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getValueSqlValueParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlValue_in_ruleSqlFragment3584);
                    lv_value_0_0=ruleSqlValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSqlFragmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_0_0, 
                              		"SqlValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1436:6: (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1436:6: (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1436:7: this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) )
                    {
                    this_AT_1=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleSqlFragment3602); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_1, grammarAccess.getSqlFragmentAccess().getATTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1440:1: ( (lv_col_2_0= ruleColumn ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1441:1: (lv_col_2_0= ruleColumn )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1441:1: (lv_col_2_0= ruleColumn )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1442:3: lv_col_2_0= ruleColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getColColumnParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleColumn_in_ruleSqlFragment3622);
                    lv_col_2_0=ruleColumn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSqlFragmentRule());
                      	        }
                             		set(
                             			current, 
                             			"col",
                              		lv_col_2_0, 
                              		"Column");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1459:6: (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1459:6: (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1459:7: this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) )
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSqlFragment3641); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getSqlFragmentAccess().getSTRINGTerminalRuleCall_2_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1463:1: ( (lv_cnst_4_0= ruleConstant ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1464:1: (lv_cnst_4_0= ruleConstant )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1464:1: (lv_cnst_4_0= ruleConstant )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1465:3: lv_cnst_4_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getCnstConstantParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleSqlFragment3661);
                    lv_cnst_4_0=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSqlFragmentRule());
                      	        }
                             		set(
                             			current, 
                             			"cnst",
                              		lv_cnst_4_0, 
                              		"Constant");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1482:6: (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1482:6: (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1482:7: this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) )
                    {
                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleSqlFragment3680); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_5, grammarAccess.getSqlFragmentAccess().getCOLONTerminalRuleCall_3_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1486:1: ( (lv_ident_6_0= ruleIdentifier ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1487:1: (lv_ident_6_0= ruleIdentifier )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1487:1: (lv_ident_6_0= ruleIdentifier )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1488:3: lv_ident_6_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getIdentIdentifierParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleSqlFragment3700);
                    lv_ident_6_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSqlFragmentRule());
                      	        }
                             		set(
                             			current, 
                             			"ident",
                              		lv_ident_6_0, 
                              		"Identifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1505:6: (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1505:6: (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1505:7: this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE
                    {
                    this_LBRACE_7=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleSqlFragment3719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACE_7, grammarAccess.getSqlFragmentAccess().getLBRACETerminalRuleCall_4_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1509:1: ( (lv_meta_8_0= ruleMetaSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1510:1: (lv_meta_8_0= ruleMetaSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1510:1: (lv_meta_8_0= ruleMetaSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1511:3: lv_meta_8_0= ruleMetaSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getMetaMetaSqlParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMetaSql_in_ruleSqlFragment3739);
                    lv_meta_8_0=ruleMetaSql();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSqlFragmentRule());
                      	        }
                             		set(
                             			current, 
                             			"meta",
                              		lv_meta_8_0, 
                              		"MetaSql");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RBRACE_9=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleSqlFragment3750); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RBRACE_9, grammarAccess.getSqlFragmentAccess().getRBRACETerminalRuleCall_4_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSqlFragment"


    // $ANTLR start "entryRuleSqlValue"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1539:1: entryRuleSqlValue returns [String current=null] : iv_ruleSqlValue= ruleSqlValue EOF ;
    public final String entryRuleSqlValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSqlValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1540:2: (iv_ruleSqlValue= ruleSqlValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1541:2: iv_ruleSqlValue= ruleSqlValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlValueRule()); 
            }
            pushFollow(FOLLOW_ruleSqlValue_in_entryRuleSqlValue3787);
            iv_ruleSqlValue=ruleSqlValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqlValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlValue3798); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSqlValue"


    // $ANTLR start "ruleSqlValue"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1548:1: ruleSqlValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_ESC_CHAR_20= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_21= RULE_REST | this_IDENT_DOT_22= RULE_IDENT_DOT | this_IDENT_23= RULE_IDENT | this_NUMBER_24= RULE_NUMBER | this_WS_25= RULE_WS | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_RBRACE_31= RULE_RBRACE | this_QUESTI_32= RULE_QUESTI | this_NOT_33= RULE_NOT | this_BAND_34= RULE_BAND | this_BOR_35= RULE_BOR | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_ESC_CHAR_41= RULE_ESC_CHAR ) )* ) ;
    public final AntlrDatatypeRuleToken ruleSqlValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_REST_0=null;
        Token this_IDENT_DOT_1=null;
        Token this_IDENT_2=null;
        Token this_NUMBER_3=null;
        Token this_WS_4=null;
        Token this_COMMA_5=null;
        Token this_MINUS_6=null;
        Token this_PLUS_7=null;
        Token this_LPAREN_8=null;
        Token this_RPAREN_9=null;
        Token this_RBRACE_10=null;
        Token this_QUESTI_11=null;
        Token this_NOT_12=null;
        Token this_BAND_13=null;
        Token this_BOR_14=null;
        Token this_HASH_15=null;
        Token this_CARET_16=null;
        Token this_EQUALS_17=null;
        Token this_LESS_THAN_18=null;
        Token this_MORE_THAN_19=null;
        Token this_ESC_CHAR_20=null;
        Token this_REST_21=null;
        Token this_IDENT_DOT_22=null;
        Token this_IDENT_23=null;
        Token this_NUMBER_24=null;
        Token this_WS_25=null;
        Token this_COMMA_26=null;
        Token this_MINUS_27=null;
        Token this_PLUS_28=null;
        Token this_LPAREN_29=null;
        Token this_RPAREN_30=null;
        Token this_RBRACE_31=null;
        Token this_QUESTI_32=null;
        Token this_NOT_33=null;
        Token this_BAND_34=null;
        Token this_BOR_35=null;
        Token this_HASH_36=null;
        Token this_CARET_37=null;
        Token this_EQUALS_38=null;
        Token this_LESS_THAN_39=null;
        Token this_MORE_THAN_40=null;
        Token this_ESC_CHAR_41=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1551:28: ( ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_ESC_CHAR_20= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_21= RULE_REST | this_IDENT_DOT_22= RULE_IDENT_DOT | this_IDENT_23= RULE_IDENT | this_NUMBER_24= RULE_NUMBER | this_WS_25= RULE_WS | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_RBRACE_31= RULE_RBRACE | this_QUESTI_32= RULE_QUESTI | this_NOT_33= RULE_NOT | this_BAND_34= RULE_BAND | this_BOR_35= RULE_BOR | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_ESC_CHAR_41= RULE_ESC_CHAR ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1552:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_ESC_CHAR_20= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_21= RULE_REST | this_IDENT_DOT_22= RULE_IDENT_DOT | this_IDENT_23= RULE_IDENT | this_NUMBER_24= RULE_NUMBER | this_WS_25= RULE_WS | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_RBRACE_31= RULE_RBRACE | this_QUESTI_32= RULE_QUESTI | this_NOT_33= RULE_NOT | this_BAND_34= RULE_BAND | this_BOR_35= RULE_BOR | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_ESC_CHAR_41= RULE_ESC_CHAR ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1552:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_ESC_CHAR_20= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_21= RULE_REST | this_IDENT_DOT_22= RULE_IDENT_DOT | this_IDENT_23= RULE_IDENT | this_NUMBER_24= RULE_NUMBER | this_WS_25= RULE_WS | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_RBRACE_31= RULE_RBRACE | this_QUESTI_32= RULE_QUESTI | this_NOT_33= RULE_NOT | this_BAND_34= RULE_BAND | this_BOR_35= RULE_BOR | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_ESC_CHAR_41= RULE_ESC_CHAR ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1552:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_ESC_CHAR_20= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_21= RULE_REST | this_IDENT_DOT_22= RULE_IDENT_DOT | this_IDENT_23= RULE_IDENT | this_NUMBER_24= RULE_NUMBER | this_WS_25= RULE_WS | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_RBRACE_31= RULE_RBRACE | this_QUESTI_32= RULE_QUESTI | this_NOT_33= RULE_NOT | this_BAND_34= RULE_BAND | this_BOR_35= RULE_BOR | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_ESC_CHAR_41= RULE_ESC_CHAR ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1552:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_ESC_CHAR_20= RULE_ESC_CHAR )
            int alt23=21;
            switch ( input.LA(1) ) {
            case RULE_REST:
                {
                alt23=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt23=2;
                }
                break;
            case RULE_IDENT:
                {
                alt23=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt23=4;
                }
                break;
            case RULE_WS:
                {
                alt23=5;
                }
                break;
            case RULE_COMMA:
                {
                alt23=6;
                }
                break;
            case RULE_MINUS:
                {
                alt23=7;
                }
                break;
            case RULE_PLUS:
                {
                alt23=8;
                }
                break;
            case RULE_LPAREN:
                {
                alt23=9;
                }
                break;
            case RULE_RPAREN:
                {
                alt23=10;
                }
                break;
            case RULE_RBRACE:
                {
                alt23=11;
                }
                break;
            case RULE_QUESTI:
                {
                alt23=12;
                }
                break;
            case RULE_NOT:
                {
                alt23=13;
                }
                break;
            case RULE_BAND:
                {
                alt23=14;
                }
                break;
            case RULE_BOR:
                {
                alt23=15;
                }
                break;
            case RULE_HASH:
                {
                alt23=16;
                }
                break;
            case RULE_CARET:
                {
                alt23=17;
                }
                break;
            case RULE_EQUALS:
                {
                alt23=18;
                }
                break;
            case RULE_LESS_THAN:
                {
                alt23=19;
                }
                break;
            case RULE_MORE_THAN:
                {
                alt23=20;
                }
                break;
            case RULE_ESC_CHAR:
                {
                alt23=21;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1552:7: this_REST_0= RULE_REST
                    {
                    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleSqlValue3839); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REST_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REST_0, grammarAccess.getSqlValueAccess().getRESTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1560:10: this_IDENT_DOT_1= RULE_IDENT_DOT
                    {
                    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleSqlValue3865); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_DOT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_DOT_1, grammarAccess.getSqlValueAccess().getIDENT_DOTTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1568:10: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleSqlValue3891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_2, grammarAccess.getSqlValueAccess().getIDENTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1576:10: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSqlValue3917); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_3, grammarAccess.getSqlValueAccess().getNUMBERTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1584:10: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSqlValue3943); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WS_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_4, grammarAccess.getSqlValueAccess().getWSTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1592:10: this_COMMA_5= RULE_COMMA
                    {
                    this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleSqlValue3969); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_5, grammarAccess.getSqlValueAccess().getCOMMATerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1600:10: this_MINUS_6= RULE_MINUS
                    {
                    this_MINUS_6=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleSqlValue3995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_6, grammarAccess.getSqlValueAccess().getMINUSTerminalRuleCall_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1608:10: this_PLUS_7= RULE_PLUS
                    {
                    this_PLUS_7=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleSqlValue4021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_7, grammarAccess.getSqlValueAccess().getPLUSTerminalRuleCall_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1616:10: this_LPAREN_8= RULE_LPAREN
                    {
                    this_LPAREN_8=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleSqlValue4047); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LPAREN_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_8, grammarAccess.getSqlValueAccess().getLPARENTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1624:10: this_RPAREN_9= RULE_RPAREN
                    {
                    this_RPAREN_9=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleSqlValue4073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RPAREN_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_9, grammarAccess.getSqlValueAccess().getRPARENTerminalRuleCall_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1632:10: this_RBRACE_10= RULE_RBRACE
                    {
                    this_RBRACE_10=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleSqlValue4099); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RBRACE_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RBRACE_10, grammarAccess.getSqlValueAccess().getRBRACETerminalRuleCall_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1640:10: this_QUESTI_11= RULE_QUESTI
                    {
                    this_QUESTI_11=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleSqlValue4125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUESTI_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUESTI_11, grammarAccess.getSqlValueAccess().getQUESTITerminalRuleCall_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1648:10: this_NOT_12= RULE_NOT
                    {
                    this_NOT_12=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleSqlValue4151); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_12, grammarAccess.getSqlValueAccess().getNOTTerminalRuleCall_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1656:10: this_BAND_13= RULE_BAND
                    {
                    this_BAND_13=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleSqlValue4177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BAND_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BAND_13, grammarAccess.getSqlValueAccess().getBANDTerminalRuleCall_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1664:10: this_BOR_14= RULE_BOR
                    {
                    this_BOR_14=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleSqlValue4203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOR_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_14, grammarAccess.getSqlValueAccess().getBORTerminalRuleCall_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1672:10: this_HASH_15= RULE_HASH
                    {
                    this_HASH_15=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleSqlValue4229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASH_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASH_15, grammarAccess.getSqlValueAccess().getHASHTerminalRuleCall_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1680:10: this_CARET_16= RULE_CARET
                    {
                    this_CARET_16=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleSqlValue4255); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CARET_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_16, grammarAccess.getSqlValueAccess().getCARETTerminalRuleCall_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1688:10: this_EQUALS_17= RULE_EQUALS
                    {
                    this_EQUALS_17=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleSqlValue4281); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUALS_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_17, grammarAccess.getSqlValueAccess().getEQUALSTerminalRuleCall_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1696:10: this_LESS_THAN_18= RULE_LESS_THAN
                    {
                    this_LESS_THAN_18=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleSqlValue4307); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LESS_THAN_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LESS_THAN_18, grammarAccess.getSqlValueAccess().getLESS_THANTerminalRuleCall_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1704:10: this_MORE_THAN_19= RULE_MORE_THAN
                    {
                    this_MORE_THAN_19=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleSqlValue4333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MORE_THAN_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MORE_THAN_19, grammarAccess.getSqlValueAccess().getMORE_THANTerminalRuleCall_0_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1712:10: this_ESC_CHAR_20= RULE_ESC_CHAR
                    {
                    this_ESC_CHAR_20=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleSqlValue4359); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESC_CHAR_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESC_CHAR_20, grammarAccess.getSqlValueAccess().getESC_CHARTerminalRuleCall_0_20()); 
                          
                    }

                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1719:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_21= RULE_REST | this_IDENT_DOT_22= RULE_IDENT_DOT | this_IDENT_23= RULE_IDENT | this_NUMBER_24= RULE_NUMBER | this_WS_25= RULE_WS | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_RBRACE_31= RULE_RBRACE | this_QUESTI_32= RULE_QUESTI | this_NOT_33= RULE_NOT | this_BAND_34= RULE_BAND | this_BOR_35= RULE_BOR | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_ESC_CHAR_41= RULE_ESC_CHAR ) )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1719:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_21= RULE_REST | this_IDENT_DOT_22= RULE_IDENT_DOT | this_IDENT_23= RULE_IDENT | this_NUMBER_24= RULE_NUMBER | this_WS_25= RULE_WS | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_RBRACE_31= RULE_RBRACE | this_QUESTI_32= RULE_QUESTI | this_NOT_33= RULE_NOT | this_BAND_34= RULE_BAND | this_BOR_35= RULE_BOR | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_ESC_CHAR_41= RULE_ESC_CHAR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1739:23: (this_REST_21= RULE_REST | this_IDENT_DOT_22= RULE_IDENT_DOT | this_IDENT_23= RULE_IDENT | this_NUMBER_24= RULE_NUMBER | this_WS_25= RULE_WS | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_RBRACE_31= RULE_RBRACE | this_QUESTI_32= RULE_QUESTI | this_NOT_33= RULE_NOT | this_BAND_34= RULE_BAND | this_BOR_35= RULE_BOR | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_ESC_CHAR_41= RULE_ESC_CHAR )
            	    int alt24=21;
            	    switch ( input.LA(1) ) {
            	    case RULE_REST:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case RULE_IDENT_DOT:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case RULE_IDENT:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    case RULE_NUMBER:
            	        {
            	        alt24=4;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt24=5;
            	        }
            	        break;
            	    case RULE_COMMA:
            	        {
            	        alt24=6;
            	        }
            	        break;
            	    case RULE_MINUS:
            	        {
            	        alt24=7;
            	        }
            	        break;
            	    case RULE_PLUS:
            	        {
            	        alt24=8;
            	        }
            	        break;
            	    case RULE_LPAREN:
            	        {
            	        alt24=9;
            	        }
            	        break;
            	    case RULE_RPAREN:
            	        {
            	        alt24=10;
            	        }
            	        break;
            	    case RULE_RBRACE:
            	        {
            	        alt24=11;
            	        }
            	        break;
            	    case RULE_QUESTI:
            	        {
            	        alt24=12;
            	        }
            	        break;
            	    case RULE_NOT:
            	        {
            	        alt24=13;
            	        }
            	        break;
            	    case RULE_BAND:
            	        {
            	        alt24=14;
            	        }
            	        break;
            	    case RULE_BOR:
            	        {
            	        alt24=15;
            	        }
            	        break;
            	    case RULE_HASH:
            	        {
            	        alt24=16;
            	        }
            	        break;
            	    case RULE_CARET:
            	        {
            	        alt24=17;
            	        }
            	        break;
            	    case RULE_EQUALS:
            	        {
            	        alt24=18;
            	        }
            	        break;
            	    case RULE_LESS_THAN:
            	        {
            	        alt24=19;
            	        }
            	        break;
            	    case RULE_MORE_THAN:
            	        {
            	        alt24=20;
            	        }
            	        break;
            	    case RULE_ESC_CHAR:
            	        {
            	        alt24=21;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1739:28: this_REST_21= RULE_REST
            	            {
            	            this_REST_21=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleSqlValue4528); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REST_21);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REST_21, grammarAccess.getSqlValueAccess().getRESTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1747:10: this_IDENT_DOT_22= RULE_IDENT_DOT
            	            {
            	            this_IDENT_DOT_22=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleSqlValue4554); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_DOT_22);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_DOT_22, grammarAccess.getSqlValueAccess().getIDENT_DOTTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1755:10: this_IDENT_23= RULE_IDENT
            	            {
            	            this_IDENT_23=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleSqlValue4580); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_23);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_23, grammarAccess.getSqlValueAccess().getIDENTTerminalRuleCall_1_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1763:10: this_NUMBER_24= RULE_NUMBER
            	            {
            	            this_NUMBER_24=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSqlValue4606); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NUMBER_24);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NUMBER_24, grammarAccess.getSqlValueAccess().getNUMBERTerminalRuleCall_1_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1771:10: this_WS_25= RULE_WS
            	            {
            	            this_WS_25=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSqlValue4632); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_WS_25);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_WS_25, grammarAccess.getSqlValueAccess().getWSTerminalRuleCall_1_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1779:10: this_COMMA_26= RULE_COMMA
            	            {
            	            this_COMMA_26=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleSqlValue4658); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COMMA_26);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COMMA_26, grammarAccess.getSqlValueAccess().getCOMMATerminalRuleCall_1_0_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1787:10: this_MINUS_27= RULE_MINUS
            	            {
            	            this_MINUS_27=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleSqlValue4684); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MINUS_27);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MINUS_27, grammarAccess.getSqlValueAccess().getMINUSTerminalRuleCall_1_0_6()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1795:10: this_PLUS_28= RULE_PLUS
            	            {
            	            this_PLUS_28=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleSqlValue4710); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PLUS_28);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PLUS_28, grammarAccess.getSqlValueAccess().getPLUSTerminalRuleCall_1_0_7()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1803:10: this_LPAREN_29= RULE_LPAREN
            	            {
            	            this_LPAREN_29=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleSqlValue4736); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LPAREN_29);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LPAREN_29, grammarAccess.getSqlValueAccess().getLPARENTerminalRuleCall_1_0_8()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1811:10: this_RPAREN_30= RULE_RPAREN
            	            {
            	            this_RPAREN_30=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleSqlValue4762); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RPAREN_30);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RPAREN_30, grammarAccess.getSqlValueAccess().getRPARENTerminalRuleCall_1_0_9()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1819:10: this_RBRACE_31= RULE_RBRACE
            	            {
            	            this_RBRACE_31=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleSqlValue4788); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RBRACE_31);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RBRACE_31, grammarAccess.getSqlValueAccess().getRBRACETerminalRuleCall_1_0_10()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1827:10: this_QUESTI_32= RULE_QUESTI
            	            {
            	            this_QUESTI_32=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleSqlValue4814); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_QUESTI_32);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_QUESTI_32, grammarAccess.getSqlValueAccess().getQUESTITerminalRuleCall_1_0_11()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 13 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1835:10: this_NOT_33= RULE_NOT
            	            {
            	            this_NOT_33=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleSqlValue4840); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NOT_33);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NOT_33, grammarAccess.getSqlValueAccess().getNOTTerminalRuleCall_1_0_12()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 14 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1843:10: this_BAND_34= RULE_BAND
            	            {
            	            this_BAND_34=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleSqlValue4866); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BAND_34);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BAND_34, grammarAccess.getSqlValueAccess().getBANDTerminalRuleCall_1_0_13()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 15 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1851:10: this_BOR_35= RULE_BOR
            	            {
            	            this_BOR_35=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleSqlValue4892); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BOR_35);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BOR_35, grammarAccess.getSqlValueAccess().getBORTerminalRuleCall_1_0_14()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 16 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1859:10: this_HASH_36= RULE_HASH
            	            {
            	            this_HASH_36=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleSqlValue4918); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_HASH_36);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_HASH_36, grammarAccess.getSqlValueAccess().getHASHTerminalRuleCall_1_0_15()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 17 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1867:10: this_CARET_37= RULE_CARET
            	            {
            	            this_CARET_37=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleSqlValue4944); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_CARET_37);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_CARET_37, grammarAccess.getSqlValueAccess().getCARETTerminalRuleCall_1_0_16()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 18 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1875:10: this_EQUALS_38= RULE_EQUALS
            	            {
            	            this_EQUALS_38=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleSqlValue4970); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_EQUALS_38);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_EQUALS_38, grammarAccess.getSqlValueAccess().getEQUALSTerminalRuleCall_1_0_17()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 19 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1883:10: this_LESS_THAN_39= RULE_LESS_THAN
            	            {
            	            this_LESS_THAN_39=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleSqlValue4996); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LESS_THAN_39);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LESS_THAN_39, grammarAccess.getSqlValueAccess().getLESS_THANTerminalRuleCall_1_0_18()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 20 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1891:10: this_MORE_THAN_40= RULE_MORE_THAN
            	            {
            	            this_MORE_THAN_40=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleSqlValue5022); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MORE_THAN_40);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MORE_THAN_40, grammarAccess.getSqlValueAccess().getMORE_THANTerminalRuleCall_1_0_19()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 21 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1899:10: this_ESC_CHAR_41= RULE_ESC_CHAR
            	            {
            	            this_ESC_CHAR_41=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleSqlValue5048); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ESC_CHAR_41);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ESC_CHAR_41, grammarAccess.getSqlValueAccess().getESC_CHARTerminalRuleCall_1_0_20()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSqlValue"


    // $ANTLR start "entryRuleMetaSql"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1914:1: entryRuleMetaSql returns [EObject current=null] : iv_ruleMetaSql= ruleMetaSql EOF ;
    public final EObject entryRuleMetaSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1915:2: (iv_ruleMetaSql= ruleMetaSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1916:2: iv_ruleMetaSql= ruleMetaSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaSqlRule()); 
            }
            pushFollow(FOLLOW_ruleMetaSql_in_entryRuleMetaSql5096);
            iv_ruleMetaSql=ruleMetaSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaSql5106); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetaSql"


    // $ANTLR start "ruleMetaSql"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1923:1: ruleMetaSql returns [EObject current=null] : ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) | ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) ) | ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) ) ) ;
    public final EObject ruleMetaSql() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_BOR_2=null;
        Token lv_type_4_0=null;
        Token this_BOR_6=null;
        Token this_BOR_8=null;
        Token lv_type_10_0=null;
        Token this_BOR_12=null;
        Token lv_type_14_0=null;
        Token this_BOR_16=null;
        Token lv_type_18_0=null;
        Token this_WS_19=null;
        Token lv_ftype_20_0=null;
        Token lv_type_22_0=null;
        Token this_NUMBER_23=null;
        EObject lv_ifs_1_0 = null;

        EObject lv_ifs_3_0 = null;

        EObject lv_cond_5_0 = null;

        EObject lv_ifs_7_0 = null;

        EObject lv_ifs_9_0 = null;

        EObject lv_ifs_11_0 = null;

        EObject lv_ifs_13_0 = null;

        EObject lv_ifs_15_0 = null;

        EObject lv_ifs_17_0 = null;

        EObject lv_ifs_21_0 = null;

        EObject lv_ord_24_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1926:28: ( ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) | ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) ) | ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1927:1: ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) | ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) ) | ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1927:1: ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) | ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) ) | ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) ) )
            int alt31=6;
            switch ( input.LA(1) ) {
            case RULE_WS:
                {
                alt31=1;
                }
                break;
            case RULE_QUESTI:
                {
                alt31=2;
                }
                break;
            case RULE_BAND:
                {
                alt31=3;
                }
                break;
            case RULE_BOR:
                {
                alt31=4;
                }
                break;
            case RULE_EQUALS:
                {
                alt31=5;
                }
                break;
            case RULE_HASH:
                {
                alt31=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1927:2: (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1927:2: (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1927:3: this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )*
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMetaSql5143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_0, grammarAccess.getMetaSqlAccess().getWSTerminalRuleCall_0_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1931:1: ( (lv_ifs_1_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1932:1: (lv_ifs_1_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1932:1: (lv_ifs_1_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1933:3: lv_ifs_1_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql5163);
                    lv_ifs_1_0=ruleIfSql();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMetaSqlRule());
                      	        }
                             		add(
                             			current, 
                             			"ifs",
                              		lv_ifs_1_0, 
                              		"IfSql");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1949:2: (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_BOR) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1949:3: this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_2=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql5175); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_2, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_0_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1953:1: ( (lv_ifs_3_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1954:1: (lv_ifs_3_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1954:1: (lv_ifs_3_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1955:3: lv_ifs_3_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql5195);
                    	    lv_ifs_3_0=ruleIfSql();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMetaSqlRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ifs",
                    	              		lv_ifs_3_0, 
                    	              		"IfSql");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1972:6: ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1972:6: ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1972:7: ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1972:7: ( (lv_type_4_0= RULE_QUESTI ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1973:1: (lv_type_4_0= RULE_QUESTI )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1973:1: (lv_type_4_0= RULE_QUESTI )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1974:3: lv_type_4_0= RULE_QUESTI
                    {
                    lv_type_4_0=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleMetaSql5222); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_type_4_0, grammarAccess.getMetaSqlAccess().getTypeQUESTITerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMetaSqlRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"type",
                              		lv_type_4_0, 
                              		"QUESTI");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1990:2: ( (lv_cond_5_0= ruleIfSqlCond ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1991:1: (lv_cond_5_0= ruleIfSqlCond )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1991:1: (lv_cond_5_0= ruleIfSqlCond )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1992:3: lv_cond_5_0= ruleIfSqlCond
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getCondIfSqlCondParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSqlCond_in_ruleMetaSql5248);
                    lv_cond_5_0=ruleIfSqlCond();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMetaSqlRule());
                      	        }
                             		set(
                             			current, 
                             			"cond",
                              		lv_cond_5_0, 
                              		"IfSqlCond");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_BOR_6=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql5259); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_6, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_1_2()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2012:1: ( (lv_ifs_7_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2013:1: (lv_ifs_7_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2013:1: (lv_ifs_7_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2014:3: lv_ifs_7_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql5279);
                    lv_ifs_7_0=ruleIfSql();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMetaSqlRule());
                      	        }
                             		add(
                             			current, 
                             			"ifs",
                              		lv_ifs_7_0, 
                              		"IfSql");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2030:2: (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_BOR) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2030:3: this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_8=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql5291); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_8, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_1_4_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2034:1: ( (lv_ifs_9_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2035:1: (lv_ifs_9_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2035:1: (lv_ifs_9_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2036:3: lv_ifs_9_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_1_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql5311);
                    	    lv_ifs_9_0=ruleIfSql();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMetaSqlRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ifs",
                    	              		lv_ifs_9_0, 
                    	              		"IfSql");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2053:6: ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2053:6: ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2053:7: ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2053:7: ( (lv_type_10_0= RULE_BAND ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2054:1: (lv_type_10_0= RULE_BAND )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2054:1: (lv_type_10_0= RULE_BAND )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2055:3: lv_type_10_0= RULE_BAND
                    {
                    lv_type_10_0=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleMetaSql5338); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_type_10_0, grammarAccess.getMetaSqlAccess().getTypeBANDTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMetaSqlRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"type",
                              		lv_type_10_0, 
                              		"BAND");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2071:2: ( (lv_ifs_11_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2072:1: (lv_ifs_11_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2072:1: (lv_ifs_11_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2073:3: lv_ifs_11_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql5364);
                    lv_ifs_11_0=ruleIfSql();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMetaSqlRule());
                      	        }
                             		add(
                             			current, 
                             			"ifs",
                              		lv_ifs_11_0, 
                              		"IfSql");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2089:2: (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_BOR) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2089:3: this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_12=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql5376); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_12, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_2_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2093:1: ( (lv_ifs_13_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2094:1: (lv_ifs_13_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2094:1: (lv_ifs_13_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2095:3: lv_ifs_13_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql5396);
                    	    lv_ifs_13_0=ruleIfSql();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMetaSqlRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ifs",
                    	              		lv_ifs_13_0, 
                    	              		"IfSql");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2112:6: ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2112:6: ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2112:7: ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2112:7: ( (lv_type_14_0= RULE_BOR ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2113:1: (lv_type_14_0= RULE_BOR )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2113:1: (lv_type_14_0= RULE_BOR )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2114:3: lv_type_14_0= RULE_BOR
                    {
                    lv_type_14_0=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql5423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_type_14_0, grammarAccess.getMetaSqlAccess().getTypeBORTerminalRuleCall_3_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMetaSqlRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"type",
                              		lv_type_14_0, 
                              		"BOR");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2130:2: ( (lv_ifs_15_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2131:1: (lv_ifs_15_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2131:1: (lv_ifs_15_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2132:3: lv_ifs_15_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql5449);
                    lv_ifs_15_0=ruleIfSql();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMetaSqlRule());
                      	        }
                             		add(
                             			current, 
                             			"ifs",
                              		lv_ifs_15_0, 
                              		"IfSql");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2148:2: (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_BOR) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2148:3: this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_16=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql5461); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_16, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_3_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2152:1: ( (lv_ifs_17_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2153:1: (lv_ifs_17_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2153:1: (lv_ifs_17_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2154:3: lv_ifs_17_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql5481);
                    	    lv_ifs_17_0=ruleIfSql();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMetaSqlRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ifs",
                    	              		lv_ifs_17_0, 
                    	              		"IfSql");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2171:6: ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2171:6: ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2171:7: ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2171:7: ( (lv_type_18_0= RULE_EQUALS ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2172:1: (lv_type_18_0= RULE_EQUALS )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2172:1: (lv_type_18_0= RULE_EQUALS )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2173:3: lv_type_18_0= RULE_EQUALS
                    {
                    lv_type_18_0=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleMetaSql5508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_type_18_0, grammarAccess.getMetaSqlAccess().getTypeEQUALSTerminalRuleCall_4_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMetaSqlRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"type",
                              		lv_type_18_0, 
                              		"EQUALS");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2189:2: (this_WS_19= RULE_WS )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_WS) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2189:3: this_WS_19= RULE_WS
                    	    {
                    	    this_WS_19=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMetaSql5525); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_19, grammarAccess.getMetaSqlAccess().getWSTerminalRuleCall_4_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2193:3: ( (lv_ftype_20_0= RULE_IDENT ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2194:1: (lv_ftype_20_0= RULE_IDENT )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2194:1: (lv_ftype_20_0= RULE_IDENT )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2195:3: lv_ftype_20_0= RULE_IDENT
                    {
                    lv_ftype_20_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMetaSql5543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_ftype_20_0, grammarAccess.getMetaSqlAccess().getFtypeIDENTTerminalRuleCall_4_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMetaSqlRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"ftype",
                              		lv_ftype_20_0, 
                              		"IDENT");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2211:2: ( (lv_ifs_21_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2212:1: (lv_ifs_21_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2212:1: (lv_ifs_21_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2213:3: lv_ifs_21_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_4_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql5569);
                    lv_ifs_21_0=ruleIfSql();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMetaSqlRule());
                      	        }
                             		add(
                             			current, 
                             			"ifs",
                              		lv_ifs_21_0, 
                              		"IfSql");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2230:6: ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2230:6: ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2230:7: ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2230:7: ( (lv_type_22_0= RULE_HASH ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2231:1: (lv_type_22_0= RULE_HASH )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2231:1: (lv_type_22_0= RULE_HASH )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2232:3: lv_type_22_0= RULE_HASH
                    {
                    lv_type_22_0=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleMetaSql5594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_type_22_0, grammarAccess.getMetaSqlAccess().getTypeHASHTerminalRuleCall_5_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMetaSqlRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"type",
                              		lv_type_22_0, 
                              		"HASH");
                      	    
                    }

                    }


                    }

                    this_NUMBER_23=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMetaSql5610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_23, grammarAccess.getMetaSqlAccess().getNUMBERTerminalRuleCall_5_1()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2252:1: ( (lv_ord_24_0= ruleOrdSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2253:1: (lv_ord_24_0= ruleOrdSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2253:1: (lv_ord_24_0= ruleOrdSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2254:3: lv_ord_24_0= ruleOrdSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getOrdOrdSqlParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrdSql_in_ruleMetaSql5630);
                    lv_ord_24_0=ruleOrdSql();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMetaSqlRule());
                      	        }
                             		set(
                             			current, 
                             			"ord",
                              		lv_ord_24_0, 
                              		"OrdSql");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetaSql"


    // $ANTLR start "entryRuleIfSql"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2278:1: entryRuleIfSql returns [EObject current=null] : iv_ruleIfSql= ruleIfSql EOF ;
    public final EObject entryRuleIfSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2279:2: (iv_ruleIfSql= ruleIfSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2280:2: iv_ruleIfSql= ruleIfSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlRule()); 
            }
            pushFollow(FOLLOW_ruleIfSql_in_entryRuleIfSql5667);
            iv_ruleIfSql=ruleIfSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSql5677); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfSql"


    // $ANTLR start "ruleIfSql"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2287:1: ruleIfSql returns [EObject current=null] : ( (lv_sqls_0_0= ruleIfSqlFragment ) )+ ;
    public final EObject ruleIfSql() throws RecognitionException {
        EObject current = null;

        EObject lv_sqls_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2290:28: ( ( (lv_sqls_0_0= ruleIfSqlFragment ) )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2291:1: ( (lv_sqls_0_0= ruleIfSqlFragment ) )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2291:1: ( (lv_sqls_0_0= ruleIfSqlFragment ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_WS && LA32_0<=RULE_LBRACE)||(LA32_0>=RULE_QUESTI && LA32_0<=RULE_BAND)||(LA32_0>=RULE_HASH && LA32_0<=RULE_ESC_CHAR)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2292:1: (lv_sqls_0_0= ruleIfSqlFragment )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2292:1: (lv_sqls_0_0= ruleIfSqlFragment )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2293:3: lv_sqls_0_0= ruleIfSqlFragment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfSqlAccess().getSqlsIfSqlFragmentParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIfSqlFragment_in_ruleIfSql5722);
            	    lv_sqls_0_0=ruleIfSqlFragment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIfSqlRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"sqls",
            	              		lv_sqls_0_0, 
            	              		"IfSqlFragment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfSql"


    // $ANTLR start "entryRuleIfSqlFragment"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2317:1: entryRuleIfSqlFragment returns [EObject current=null] : iv_ruleIfSqlFragment= ruleIfSqlFragment EOF ;
    public final EObject entryRuleIfSqlFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSqlFragment = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2318:2: (iv_ruleIfSqlFragment= ruleIfSqlFragment EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2319:2: iv_ruleIfSqlFragment= ruleIfSqlFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleIfSqlFragment_in_entryRuleIfSqlFragment5758);
            iv_ruleIfSqlFragment=ruleIfSqlFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSqlFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSqlFragment5768); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfSqlFragment"


    // $ANTLR start "ruleIfSqlFragment"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2326:1: ruleIfSqlFragment returns [EObject current=null] : ( ( (lv_value_0_0= ruleIfSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleIfMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) ) ;
    public final EObject ruleIfSqlFragment() throws RecognitionException {
        EObject current = null;

        Token this_AT_1=null;
        Token this_STRING_3=null;
        Token this_COLON_5=null;
        Token this_LBRACE_7=null;
        Token this_RBRACE_9=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject lv_col_2_0 = null;

        EObject lv_cnst_4_0 = null;

        EObject lv_ident_6_0 = null;

        EObject lv_meta_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2329:28: ( ( ( (lv_value_0_0= ruleIfSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleIfMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2330:1: ( ( (lv_value_0_0= ruleIfSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleIfMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2330:1: ( ( (lv_value_0_0= ruleIfSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleIfMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) )
            int alt33=5;
            switch ( input.LA(1) ) {
            case RULE_WS:
            case RULE_SEMICOLON:
            case RULE_REST:
            case RULE_IDENT_DOT:
            case RULE_IDENT:
            case RULE_NUMBER:
            case RULE_COMMA:
            case RULE_MINUS:
            case RULE_PLUS:
            case RULE_LPAREN:
            case RULE_RPAREN:
            case RULE_QUESTI:
            case RULE_NOT:
            case RULE_BAND:
            case RULE_HASH:
            case RULE_CARET:
            case RULE_EQUALS:
            case RULE_LESS_THAN:
            case RULE_MORE_THAN:
            case RULE_ESC_CHAR:
                {
                alt33=1;
                }
                break;
            case RULE_AT:
                {
                alt33=2;
                }
                break;
            case RULE_STRING:
                {
                alt33=3;
                }
                break;
            case RULE_COLON:
                {
                alt33=4;
                }
                break;
            case RULE_LBRACE:
                {
                alt33=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2330:2: ( (lv_value_0_0= ruleIfSqlValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2330:2: ( (lv_value_0_0= ruleIfSqlValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2331:1: (lv_value_0_0= ruleIfSqlValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2331:1: (lv_value_0_0= ruleIfSqlValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2332:3: lv_value_0_0= ruleIfSqlValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getValueIfSqlValueParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSqlValue_in_ruleIfSqlFragment5814);
                    lv_value_0_0=ruleIfSqlValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfSqlFragmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_0_0, 
                              		"IfSqlValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2349:6: (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2349:6: (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2349:7: this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) )
                    {
                    this_AT_1=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleIfSqlFragment5832); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_1, grammarAccess.getIfSqlFragmentAccess().getATTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2353:1: ( (lv_col_2_0= ruleColumn ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2354:1: (lv_col_2_0= ruleColumn )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2354:1: (lv_col_2_0= ruleColumn )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2355:3: lv_col_2_0= ruleColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getColColumnParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleColumn_in_ruleIfSqlFragment5852);
                    lv_col_2_0=ruleColumn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfSqlFragmentRule());
                      	        }
                             		set(
                             			current, 
                             			"col",
                              		lv_col_2_0, 
                              		"Column");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2372:6: (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2372:6: (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2372:7: this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) )
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIfSqlFragment5871); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getIfSqlFragmentAccess().getSTRINGTerminalRuleCall_2_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2376:1: ( (lv_cnst_4_0= ruleConstant ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2377:1: (lv_cnst_4_0= ruleConstant )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2377:1: (lv_cnst_4_0= ruleConstant )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2378:3: lv_cnst_4_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getCnstConstantParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleIfSqlFragment5891);
                    lv_cnst_4_0=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfSqlFragmentRule());
                      	        }
                             		set(
                             			current, 
                             			"cnst",
                              		lv_cnst_4_0, 
                              		"Constant");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2395:6: (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2395:6: (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2395:7: this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) )
                    {
                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleIfSqlFragment5910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_5, grammarAccess.getIfSqlFragmentAccess().getCOLONTerminalRuleCall_3_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2399:1: ( (lv_ident_6_0= ruleIdentifier ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2400:1: (lv_ident_6_0= ruleIdentifier )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2400:1: (lv_ident_6_0= ruleIdentifier )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2401:3: lv_ident_6_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getIdentIdentifierParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleIfSqlFragment5930);
                    lv_ident_6_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfSqlFragmentRule());
                      	        }
                             		set(
                             			current, 
                             			"ident",
                              		lv_ident_6_0, 
                              		"Identifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2418:6: (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleIfMetaSql ) ) this_RBRACE_9= RULE_RBRACE )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2418:6: (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleIfMetaSql ) ) this_RBRACE_9= RULE_RBRACE )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2418:7: this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleIfMetaSql ) ) this_RBRACE_9= RULE_RBRACE
                    {
                    this_LBRACE_7=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleIfSqlFragment5949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACE_7, grammarAccess.getIfSqlFragmentAccess().getLBRACETerminalRuleCall_4_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2422:1: ( (lv_meta_8_0= ruleIfMetaSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2423:1: (lv_meta_8_0= ruleIfMetaSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2423:1: (lv_meta_8_0= ruleIfMetaSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2424:3: lv_meta_8_0= ruleIfMetaSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getMetaIfMetaSqlParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfMetaSql_in_ruleIfSqlFragment5969);
                    lv_meta_8_0=ruleIfMetaSql();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfSqlFragmentRule());
                      	        }
                             		set(
                             			current, 
                             			"meta",
                              		lv_meta_8_0, 
                              		"IfMetaSql");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RBRACE_9=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleIfSqlFragment5980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RBRACE_9, grammarAccess.getIfSqlFragmentAccess().getRBRACETerminalRuleCall_4_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfSqlFragment"


    // $ANTLR start "entryRuleIfSqlValue"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2452:1: entryRuleIfSqlValue returns [String current=null] : iv_ruleIfSqlValue= ruleIfSqlValue EOF ;
    public final String entryRuleIfSqlValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIfSqlValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2453:2: (iv_ruleIfSqlValue= ruleIfSqlValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2454:2: iv_ruleIfSqlValue= ruleIfSqlValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlValueRule()); 
            }
            pushFollow(FOLLOW_ruleIfSqlValue_in_entryRuleIfSqlValue6017);
            iv_ruleIfSqlValue=ruleIfSqlValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSqlValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSqlValue6028); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfSqlValue"


    // $ANTLR start "ruleIfSqlValue"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2461:1: ruleIfSqlValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_ESC_CHAR_19= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_20= RULE_REST | this_IDENT_DOT_21= RULE_IDENT_DOT | this_IDENT_22= RULE_IDENT | this_NUMBER_23= RULE_NUMBER | this_WS_24= RULE_WS | this_SEMICOLON_25= RULE_SEMICOLON | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_QUESTI_31= RULE_QUESTI | this_NOT_32= RULE_NOT | this_BAND_33= RULE_BAND | this_HASH_34= RULE_HASH | this_CARET_35= RULE_CARET | this_EQUALS_36= RULE_EQUALS | this_LESS_THAN_37= RULE_LESS_THAN | this_MORE_THAN_38= RULE_MORE_THAN | this_ESC_CHAR_39= RULE_ESC_CHAR ) )* ) ;
    public final AntlrDatatypeRuleToken ruleIfSqlValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_REST_0=null;
        Token this_IDENT_DOT_1=null;
        Token this_IDENT_2=null;
        Token this_NUMBER_3=null;
        Token this_WS_4=null;
        Token this_SEMICOLON_5=null;
        Token this_COMMA_6=null;
        Token this_MINUS_7=null;
        Token this_PLUS_8=null;
        Token this_LPAREN_9=null;
        Token this_RPAREN_10=null;
        Token this_QUESTI_11=null;
        Token this_NOT_12=null;
        Token this_BAND_13=null;
        Token this_HASH_14=null;
        Token this_CARET_15=null;
        Token this_EQUALS_16=null;
        Token this_LESS_THAN_17=null;
        Token this_MORE_THAN_18=null;
        Token this_ESC_CHAR_19=null;
        Token this_REST_20=null;
        Token this_IDENT_DOT_21=null;
        Token this_IDENT_22=null;
        Token this_NUMBER_23=null;
        Token this_WS_24=null;
        Token this_SEMICOLON_25=null;
        Token this_COMMA_26=null;
        Token this_MINUS_27=null;
        Token this_PLUS_28=null;
        Token this_LPAREN_29=null;
        Token this_RPAREN_30=null;
        Token this_QUESTI_31=null;
        Token this_NOT_32=null;
        Token this_BAND_33=null;
        Token this_HASH_34=null;
        Token this_CARET_35=null;
        Token this_EQUALS_36=null;
        Token this_LESS_THAN_37=null;
        Token this_MORE_THAN_38=null;
        Token this_ESC_CHAR_39=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2464:28: ( ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_ESC_CHAR_19= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_20= RULE_REST | this_IDENT_DOT_21= RULE_IDENT_DOT | this_IDENT_22= RULE_IDENT | this_NUMBER_23= RULE_NUMBER | this_WS_24= RULE_WS | this_SEMICOLON_25= RULE_SEMICOLON | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_QUESTI_31= RULE_QUESTI | this_NOT_32= RULE_NOT | this_BAND_33= RULE_BAND | this_HASH_34= RULE_HASH | this_CARET_35= RULE_CARET | this_EQUALS_36= RULE_EQUALS | this_LESS_THAN_37= RULE_LESS_THAN | this_MORE_THAN_38= RULE_MORE_THAN | this_ESC_CHAR_39= RULE_ESC_CHAR ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2465:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_ESC_CHAR_19= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_20= RULE_REST | this_IDENT_DOT_21= RULE_IDENT_DOT | this_IDENT_22= RULE_IDENT | this_NUMBER_23= RULE_NUMBER | this_WS_24= RULE_WS | this_SEMICOLON_25= RULE_SEMICOLON | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_QUESTI_31= RULE_QUESTI | this_NOT_32= RULE_NOT | this_BAND_33= RULE_BAND | this_HASH_34= RULE_HASH | this_CARET_35= RULE_CARET | this_EQUALS_36= RULE_EQUALS | this_LESS_THAN_37= RULE_LESS_THAN | this_MORE_THAN_38= RULE_MORE_THAN | this_ESC_CHAR_39= RULE_ESC_CHAR ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2465:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_ESC_CHAR_19= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_20= RULE_REST | this_IDENT_DOT_21= RULE_IDENT_DOT | this_IDENT_22= RULE_IDENT | this_NUMBER_23= RULE_NUMBER | this_WS_24= RULE_WS | this_SEMICOLON_25= RULE_SEMICOLON | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_QUESTI_31= RULE_QUESTI | this_NOT_32= RULE_NOT | this_BAND_33= RULE_BAND | this_HASH_34= RULE_HASH | this_CARET_35= RULE_CARET | this_EQUALS_36= RULE_EQUALS | this_LESS_THAN_37= RULE_LESS_THAN | this_MORE_THAN_38= RULE_MORE_THAN | this_ESC_CHAR_39= RULE_ESC_CHAR ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2465:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_ESC_CHAR_19= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_20= RULE_REST | this_IDENT_DOT_21= RULE_IDENT_DOT | this_IDENT_22= RULE_IDENT | this_NUMBER_23= RULE_NUMBER | this_WS_24= RULE_WS | this_SEMICOLON_25= RULE_SEMICOLON | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_QUESTI_31= RULE_QUESTI | this_NOT_32= RULE_NOT | this_BAND_33= RULE_BAND | this_HASH_34= RULE_HASH | this_CARET_35= RULE_CARET | this_EQUALS_36= RULE_EQUALS | this_LESS_THAN_37= RULE_LESS_THAN | this_MORE_THAN_38= RULE_MORE_THAN | this_ESC_CHAR_39= RULE_ESC_CHAR ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2465:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_ESC_CHAR_19= RULE_ESC_CHAR )
            int alt34=20;
            switch ( input.LA(1) ) {
            case RULE_REST:
                {
                alt34=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt34=2;
                }
                break;
            case RULE_IDENT:
                {
                alt34=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt34=4;
                }
                break;
            case RULE_WS:
                {
                alt34=5;
                }
                break;
            case RULE_SEMICOLON:
                {
                alt34=6;
                }
                break;
            case RULE_COMMA:
                {
                alt34=7;
                }
                break;
            case RULE_MINUS:
                {
                alt34=8;
                }
                break;
            case RULE_PLUS:
                {
                alt34=9;
                }
                break;
            case RULE_LPAREN:
                {
                alt34=10;
                }
                break;
            case RULE_RPAREN:
                {
                alt34=11;
                }
                break;
            case RULE_QUESTI:
                {
                alt34=12;
                }
                break;
            case RULE_NOT:
                {
                alt34=13;
                }
                break;
            case RULE_BAND:
                {
                alt34=14;
                }
                break;
            case RULE_HASH:
                {
                alt34=15;
                }
                break;
            case RULE_CARET:
                {
                alt34=16;
                }
                break;
            case RULE_EQUALS:
                {
                alt34=17;
                }
                break;
            case RULE_LESS_THAN:
                {
                alt34=18;
                }
                break;
            case RULE_MORE_THAN:
                {
                alt34=19;
                }
                break;
            case RULE_ESC_CHAR:
                {
                alt34=20;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2465:7: this_REST_0= RULE_REST
                    {
                    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleIfSqlValue6069); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REST_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REST_0, grammarAccess.getIfSqlValueAccess().getRESTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2473:10: this_IDENT_DOT_1= RULE_IDENT_DOT
                    {
                    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleIfSqlValue6095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_DOT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_DOT_1, grammarAccess.getIfSqlValueAccess().getIDENT_DOTTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2481:10: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIfSqlValue6121); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_2, grammarAccess.getIfSqlValueAccess().getIDENTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2489:10: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIfSqlValue6147); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_3, grammarAccess.getIfSqlValueAccess().getNUMBERTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2497:10: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlValue6173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WS_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_4, grammarAccess.getIfSqlValueAccess().getWSTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2505:10: this_SEMICOLON_5= RULE_SEMICOLON
                    {
                    this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleIfSqlValue6199); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SEMICOLON_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_5, grammarAccess.getIfSqlValueAccess().getSEMICOLONTerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2513:10: this_COMMA_6= RULE_COMMA
                    {
                    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleIfSqlValue6225); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_6, grammarAccess.getIfSqlValueAccess().getCOMMATerminalRuleCall_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2521:10: this_MINUS_7= RULE_MINUS
                    {
                    this_MINUS_7=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleIfSqlValue6251); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_7, grammarAccess.getIfSqlValueAccess().getMINUSTerminalRuleCall_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2529:10: this_PLUS_8= RULE_PLUS
                    {
                    this_PLUS_8=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleIfSqlValue6277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_8, grammarAccess.getIfSqlValueAccess().getPLUSTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2537:10: this_LPAREN_9= RULE_LPAREN
                    {
                    this_LPAREN_9=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleIfSqlValue6303); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LPAREN_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_9, grammarAccess.getIfSqlValueAccess().getLPARENTerminalRuleCall_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2545:10: this_RPAREN_10= RULE_RPAREN
                    {
                    this_RPAREN_10=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleIfSqlValue6329); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RPAREN_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_10, grammarAccess.getIfSqlValueAccess().getRPARENTerminalRuleCall_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2553:10: this_QUESTI_11= RULE_QUESTI
                    {
                    this_QUESTI_11=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleIfSqlValue6355); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUESTI_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUESTI_11, grammarAccess.getIfSqlValueAccess().getQUESTITerminalRuleCall_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2561:10: this_NOT_12= RULE_NOT
                    {
                    this_NOT_12=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlValue6381); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_12, grammarAccess.getIfSqlValueAccess().getNOTTerminalRuleCall_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2569:10: this_BAND_13= RULE_BAND
                    {
                    this_BAND_13=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleIfSqlValue6407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BAND_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BAND_13, grammarAccess.getIfSqlValueAccess().getBANDTerminalRuleCall_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2577:10: this_HASH_14= RULE_HASH
                    {
                    this_HASH_14=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleIfSqlValue6433); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASH_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASH_14, grammarAccess.getIfSqlValueAccess().getHASHTerminalRuleCall_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2585:10: this_CARET_15= RULE_CARET
                    {
                    this_CARET_15=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleIfSqlValue6459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CARET_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_15, grammarAccess.getIfSqlValueAccess().getCARETTerminalRuleCall_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2593:10: this_EQUALS_16= RULE_EQUALS
                    {
                    this_EQUALS_16=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleIfSqlValue6485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUALS_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_16, grammarAccess.getIfSqlValueAccess().getEQUALSTerminalRuleCall_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2601:10: this_LESS_THAN_17= RULE_LESS_THAN
                    {
                    this_LESS_THAN_17=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleIfSqlValue6511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LESS_THAN_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LESS_THAN_17, grammarAccess.getIfSqlValueAccess().getLESS_THANTerminalRuleCall_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2609:10: this_MORE_THAN_18= RULE_MORE_THAN
                    {
                    this_MORE_THAN_18=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleIfSqlValue6537); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MORE_THAN_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MORE_THAN_18, grammarAccess.getIfSqlValueAccess().getMORE_THANTerminalRuleCall_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2617:10: this_ESC_CHAR_19= RULE_ESC_CHAR
                    {
                    this_ESC_CHAR_19=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleIfSqlValue6563); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESC_CHAR_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESC_CHAR_19, grammarAccess.getIfSqlValueAccess().getESC_CHARTerminalRuleCall_0_19()); 
                          
                    }

                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2624:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_20= RULE_REST | this_IDENT_DOT_21= RULE_IDENT_DOT | this_IDENT_22= RULE_IDENT | this_NUMBER_23= RULE_NUMBER | this_WS_24= RULE_WS | this_SEMICOLON_25= RULE_SEMICOLON | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_QUESTI_31= RULE_QUESTI | this_NOT_32= RULE_NOT | this_BAND_33= RULE_BAND | this_HASH_34= RULE_HASH | this_CARET_35= RULE_CARET | this_EQUALS_36= RULE_EQUALS | this_LESS_THAN_37= RULE_LESS_THAN | this_MORE_THAN_38= RULE_MORE_THAN | this_ESC_CHAR_39= RULE_ESC_CHAR ) )*
            loop36:
            do {
                int alt36=2;
                alt36 = dfa36.predict(input);
                switch (alt36) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2624:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_20= RULE_REST | this_IDENT_DOT_21= RULE_IDENT_DOT | this_IDENT_22= RULE_IDENT | this_NUMBER_23= RULE_NUMBER | this_WS_24= RULE_WS | this_SEMICOLON_25= RULE_SEMICOLON | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_QUESTI_31= RULE_QUESTI | this_NOT_32= RULE_NOT | this_BAND_33= RULE_BAND | this_HASH_34= RULE_HASH | this_CARET_35= RULE_CARET | this_EQUALS_36= RULE_EQUALS | this_LESS_THAN_37= RULE_LESS_THAN | this_MORE_THAN_38= RULE_MORE_THAN | this_ESC_CHAR_39= RULE_ESC_CHAR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2643:23: (this_REST_20= RULE_REST | this_IDENT_DOT_21= RULE_IDENT_DOT | this_IDENT_22= RULE_IDENT | this_NUMBER_23= RULE_NUMBER | this_WS_24= RULE_WS | this_SEMICOLON_25= RULE_SEMICOLON | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_QUESTI_31= RULE_QUESTI | this_NOT_32= RULE_NOT | this_BAND_33= RULE_BAND | this_HASH_34= RULE_HASH | this_CARET_35= RULE_CARET | this_EQUALS_36= RULE_EQUALS | this_LESS_THAN_37= RULE_LESS_THAN | this_MORE_THAN_38= RULE_MORE_THAN | this_ESC_CHAR_39= RULE_ESC_CHAR )
            	    int alt35=20;
            	    switch ( input.LA(1) ) {
            	    case RULE_REST:
            	        {
            	        alt35=1;
            	        }
            	        break;
            	    case RULE_IDENT_DOT:
            	        {
            	        alt35=2;
            	        }
            	        break;
            	    case RULE_IDENT:
            	        {
            	        alt35=3;
            	        }
            	        break;
            	    case RULE_NUMBER:
            	        {
            	        alt35=4;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt35=5;
            	        }
            	        break;
            	    case RULE_SEMICOLON:
            	        {
            	        alt35=6;
            	        }
            	        break;
            	    case RULE_COMMA:
            	        {
            	        alt35=7;
            	        }
            	        break;
            	    case RULE_MINUS:
            	        {
            	        alt35=8;
            	        }
            	        break;
            	    case RULE_PLUS:
            	        {
            	        alt35=9;
            	        }
            	        break;
            	    case RULE_LPAREN:
            	        {
            	        alt35=10;
            	        }
            	        break;
            	    case RULE_RPAREN:
            	        {
            	        alt35=11;
            	        }
            	        break;
            	    case RULE_QUESTI:
            	        {
            	        alt35=12;
            	        }
            	        break;
            	    case RULE_NOT:
            	        {
            	        alt35=13;
            	        }
            	        break;
            	    case RULE_BAND:
            	        {
            	        alt35=14;
            	        }
            	        break;
            	    case RULE_HASH:
            	        {
            	        alt35=15;
            	        }
            	        break;
            	    case RULE_CARET:
            	        {
            	        alt35=16;
            	        }
            	        break;
            	    case RULE_EQUALS:
            	        {
            	        alt35=17;
            	        }
            	        break;
            	    case RULE_LESS_THAN:
            	        {
            	        alt35=18;
            	        }
            	        break;
            	    case RULE_MORE_THAN:
            	        {
            	        alt35=19;
            	        }
            	        break;
            	    case RULE_ESC_CHAR:
            	        {
            	        alt35=20;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt35) {
            	        case 1 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2643:28: this_REST_20= RULE_REST
            	            {
            	            this_REST_20=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleIfSqlValue6725); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REST_20);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REST_20, grammarAccess.getIfSqlValueAccess().getRESTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2651:10: this_IDENT_DOT_21= RULE_IDENT_DOT
            	            {
            	            this_IDENT_DOT_21=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleIfSqlValue6751); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_DOT_21);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_DOT_21, grammarAccess.getIfSqlValueAccess().getIDENT_DOTTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2659:10: this_IDENT_22= RULE_IDENT
            	            {
            	            this_IDENT_22=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIfSqlValue6777); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_22);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_22, grammarAccess.getIfSqlValueAccess().getIDENTTerminalRuleCall_1_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2667:10: this_NUMBER_23= RULE_NUMBER
            	            {
            	            this_NUMBER_23=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIfSqlValue6803); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NUMBER_23);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NUMBER_23, grammarAccess.getIfSqlValueAccess().getNUMBERTerminalRuleCall_1_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2675:10: this_WS_24= RULE_WS
            	            {
            	            this_WS_24=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlValue6829); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_WS_24);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_WS_24, grammarAccess.getIfSqlValueAccess().getWSTerminalRuleCall_1_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2683:10: this_SEMICOLON_25= RULE_SEMICOLON
            	            {
            	            this_SEMICOLON_25=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleIfSqlValue6855); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_SEMICOLON_25);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_SEMICOLON_25, grammarAccess.getIfSqlValueAccess().getSEMICOLONTerminalRuleCall_1_0_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2691:10: this_COMMA_26= RULE_COMMA
            	            {
            	            this_COMMA_26=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleIfSqlValue6881); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COMMA_26);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COMMA_26, grammarAccess.getIfSqlValueAccess().getCOMMATerminalRuleCall_1_0_6()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2699:10: this_MINUS_27= RULE_MINUS
            	            {
            	            this_MINUS_27=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleIfSqlValue6907); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MINUS_27);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MINUS_27, grammarAccess.getIfSqlValueAccess().getMINUSTerminalRuleCall_1_0_7()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2707:10: this_PLUS_28= RULE_PLUS
            	            {
            	            this_PLUS_28=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleIfSqlValue6933); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PLUS_28);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PLUS_28, grammarAccess.getIfSqlValueAccess().getPLUSTerminalRuleCall_1_0_8()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2715:10: this_LPAREN_29= RULE_LPAREN
            	            {
            	            this_LPAREN_29=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleIfSqlValue6959); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LPAREN_29);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LPAREN_29, grammarAccess.getIfSqlValueAccess().getLPARENTerminalRuleCall_1_0_9()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2723:10: this_RPAREN_30= RULE_RPAREN
            	            {
            	            this_RPAREN_30=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleIfSqlValue6985); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RPAREN_30);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RPAREN_30, grammarAccess.getIfSqlValueAccess().getRPARENTerminalRuleCall_1_0_10()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2731:10: this_QUESTI_31= RULE_QUESTI
            	            {
            	            this_QUESTI_31=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleIfSqlValue7011); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_QUESTI_31);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_QUESTI_31, grammarAccess.getIfSqlValueAccess().getQUESTITerminalRuleCall_1_0_11()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 13 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2739:10: this_NOT_32= RULE_NOT
            	            {
            	            this_NOT_32=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlValue7037); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NOT_32);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NOT_32, grammarAccess.getIfSqlValueAccess().getNOTTerminalRuleCall_1_0_12()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 14 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2747:10: this_BAND_33= RULE_BAND
            	            {
            	            this_BAND_33=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleIfSqlValue7063); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BAND_33);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BAND_33, grammarAccess.getIfSqlValueAccess().getBANDTerminalRuleCall_1_0_13()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 15 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2755:10: this_HASH_34= RULE_HASH
            	            {
            	            this_HASH_34=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleIfSqlValue7089); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_HASH_34);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_HASH_34, grammarAccess.getIfSqlValueAccess().getHASHTerminalRuleCall_1_0_14()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 16 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2763:10: this_CARET_35= RULE_CARET
            	            {
            	            this_CARET_35=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleIfSqlValue7115); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_CARET_35);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_CARET_35, grammarAccess.getIfSqlValueAccess().getCARETTerminalRuleCall_1_0_15()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 17 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2771:10: this_EQUALS_36= RULE_EQUALS
            	            {
            	            this_EQUALS_36=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleIfSqlValue7141); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_EQUALS_36);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_EQUALS_36, grammarAccess.getIfSqlValueAccess().getEQUALSTerminalRuleCall_1_0_16()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 18 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2779:10: this_LESS_THAN_37= RULE_LESS_THAN
            	            {
            	            this_LESS_THAN_37=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleIfSqlValue7167); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LESS_THAN_37);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LESS_THAN_37, grammarAccess.getIfSqlValueAccess().getLESS_THANTerminalRuleCall_1_0_17()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 19 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2787:10: this_MORE_THAN_38= RULE_MORE_THAN
            	            {
            	            this_MORE_THAN_38=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleIfSqlValue7193); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MORE_THAN_38);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MORE_THAN_38, grammarAccess.getIfSqlValueAccess().getMORE_THANTerminalRuleCall_1_0_18()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 20 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2795:10: this_ESC_CHAR_39= RULE_ESC_CHAR
            	            {
            	            this_ESC_CHAR_39=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleIfSqlValue7219); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ESC_CHAR_39);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ESC_CHAR_39, grammarAccess.getIfSqlValueAccess().getESC_CHARTerminalRuleCall_1_0_19()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfSqlValue"


    // $ANTLR start "entryRuleIfMetaSql"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2810:1: entryRuleIfMetaSql returns [EObject current=null] : iv_ruleIfMetaSql= ruleIfMetaSql EOF ;
    public final EObject entryRuleIfMetaSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfMetaSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2811:2: (iv_ruleIfMetaSql= ruleIfMetaSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2812:2: iv_ruleIfMetaSql= ruleIfMetaSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfMetaSqlRule()); 
            }
            pushFollow(FOLLOW_ruleIfMetaSql_in_entryRuleIfMetaSql7267);
            iv_ruleIfMetaSql=ruleIfMetaSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfMetaSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfMetaSql7277); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfMetaSql"


    // $ANTLR start "ruleIfMetaSql"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2819:1: ruleIfMetaSql returns [EObject current=null] : ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) ) ;
    public final EObject ruleIfMetaSql() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_BOR_2=null;
        Token lv_type_4_0=null;
        Token this_BOR_6=null;
        Token this_BOR_8=null;
        Token lv_type_10_0=null;
        Token this_BOR_12=null;
        Token lv_type_14_0=null;
        Token this_BOR_16=null;
        EObject lv_ifs_1_0 = null;

        EObject lv_ifs_3_0 = null;

        EObject lv_cond_5_0 = null;

        EObject lv_ifs_7_0 = null;

        EObject lv_ifs_9_0 = null;

        EObject lv_ifs_11_0 = null;

        EObject lv_ifs_13_0 = null;

        EObject lv_ifs_15_0 = null;

        EObject lv_ifs_17_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2822:28: ( ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2823:1: ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2823:1: ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) )
            int alt41=4;
            switch ( input.LA(1) ) {
            case RULE_WS:
                {
                alt41=1;
                }
                break;
            case RULE_QUESTI:
                {
                alt41=2;
                }
                break;
            case RULE_BAND:
                {
                alt41=3;
                }
                break;
            case RULE_BOR:
                {
                alt41=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2823:2: (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2823:2: (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2823:3: this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )*
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfMetaSql7314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_0, grammarAccess.getIfMetaSqlAccess().getWSTerminalRuleCall_0_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2827:1: ( (lv_ifs_1_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2828:1: (lv_ifs_1_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2828:1: (lv_ifs_1_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2829:3: lv_ifs_1_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql7334);
                    lv_ifs_1_0=ruleIfSql();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfMetaSqlRule());
                      	        }
                             		add(
                             			current, 
                             			"ifs",
                              		lv_ifs_1_0, 
                              		"IfSql");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2845:2: (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_BOR) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2845:3: this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_2=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql7346); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_2, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_0_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2849:1: ( (lv_ifs_3_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2850:1: (lv_ifs_3_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2850:1: (lv_ifs_3_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2851:3: lv_ifs_3_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql7366);
                    	    lv_ifs_3_0=ruleIfSql();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getIfMetaSqlRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ifs",
                    	              		lv_ifs_3_0, 
                    	              		"IfSql");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2868:6: ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2868:6: ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2868:7: ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2868:7: ( (lv_type_4_0= RULE_QUESTI ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2869:1: (lv_type_4_0= RULE_QUESTI )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2869:1: (lv_type_4_0= RULE_QUESTI )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2870:3: lv_type_4_0= RULE_QUESTI
                    {
                    lv_type_4_0=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleIfMetaSql7393); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_type_4_0, grammarAccess.getIfMetaSqlAccess().getTypeQUESTITerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIfMetaSqlRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"type",
                              		lv_type_4_0, 
                              		"QUESTI");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2886:2: ( (lv_cond_5_0= ruleIfSqlCond ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2887:1: (lv_cond_5_0= ruleIfSqlCond )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2887:1: (lv_cond_5_0= ruleIfSqlCond )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2888:3: lv_cond_5_0= ruleIfSqlCond
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getCondIfSqlCondParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSqlCond_in_ruleIfMetaSql7419);
                    lv_cond_5_0=ruleIfSqlCond();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfMetaSqlRule());
                      	        }
                             		set(
                             			current, 
                             			"cond",
                              		lv_cond_5_0, 
                              		"IfSqlCond");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_BOR_6=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql7430); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_6, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_1_2()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2908:1: ( (lv_ifs_7_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2909:1: (lv_ifs_7_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2909:1: (lv_ifs_7_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2910:3: lv_ifs_7_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql7450);
                    lv_ifs_7_0=ruleIfSql();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfMetaSqlRule());
                      	        }
                             		add(
                             			current, 
                             			"ifs",
                              		lv_ifs_7_0, 
                              		"IfSql");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2926:2: (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_BOR) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2926:3: this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_8=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql7462); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_8, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_1_4_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2930:1: ( (lv_ifs_9_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2931:1: (lv_ifs_9_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2931:1: (lv_ifs_9_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2932:3: lv_ifs_9_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_1_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql7482);
                    	    lv_ifs_9_0=ruleIfSql();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getIfMetaSqlRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ifs",
                    	              		lv_ifs_9_0, 
                    	              		"IfSql");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2949:6: ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2949:6: ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2949:7: ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2949:7: ( (lv_type_10_0= RULE_BAND ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2950:1: (lv_type_10_0= RULE_BAND )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2950:1: (lv_type_10_0= RULE_BAND )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2951:3: lv_type_10_0= RULE_BAND
                    {
                    lv_type_10_0=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleIfMetaSql7509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_type_10_0, grammarAccess.getIfMetaSqlAccess().getTypeBANDTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIfMetaSqlRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"type",
                              		lv_type_10_0, 
                              		"BAND");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2967:2: ( (lv_ifs_11_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2968:1: (lv_ifs_11_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2968:1: (lv_ifs_11_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2969:3: lv_ifs_11_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql7535);
                    lv_ifs_11_0=ruleIfSql();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfMetaSqlRule());
                      	        }
                             		add(
                             			current, 
                             			"ifs",
                              		lv_ifs_11_0, 
                              		"IfSql");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2985:2: (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_BOR) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2985:3: this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_12=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql7547); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_12, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_2_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2989:1: ( (lv_ifs_13_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2990:1: (lv_ifs_13_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2990:1: (lv_ifs_13_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2991:3: lv_ifs_13_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql7567);
                    	    lv_ifs_13_0=ruleIfSql();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getIfMetaSqlRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ifs",
                    	              		lv_ifs_13_0, 
                    	              		"IfSql");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3008:6: ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3008:6: ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3008:7: ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3008:7: ( (lv_type_14_0= RULE_BOR ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3009:1: (lv_type_14_0= RULE_BOR )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3009:1: (lv_type_14_0= RULE_BOR )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3010:3: lv_type_14_0= RULE_BOR
                    {
                    lv_type_14_0=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql7594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_type_14_0, grammarAccess.getIfMetaSqlAccess().getTypeBORTerminalRuleCall_3_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIfMetaSqlRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"type",
                              		lv_type_14_0, 
                              		"BOR");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3026:2: ( (lv_ifs_15_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3027:1: (lv_ifs_15_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3027:1: (lv_ifs_15_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3028:3: lv_ifs_15_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql7620);
                    lv_ifs_15_0=ruleIfSql();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfMetaSqlRule());
                      	        }
                             		add(
                             			current, 
                             			"ifs",
                              		lv_ifs_15_0, 
                              		"IfSql");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3044:2: (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==RULE_BOR) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3044:3: this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_16=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql7632); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_16, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_3_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3048:1: ( (lv_ifs_17_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3049:1: (lv_ifs_17_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3049:1: (lv_ifs_17_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3050:3: lv_ifs_17_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql7652);
                    	    lv_ifs_17_0=ruleIfSql();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getIfMetaSqlRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ifs",
                    	              		lv_ifs_17_0, 
                    	              		"IfSql");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfMetaSql"


    // $ANTLR start "entryRuleIfSqlCond"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3074:1: entryRuleIfSqlCond returns [EObject current=null] : iv_ruleIfSqlCond= ruleIfSqlCond EOF ;
    public final EObject entryRuleIfSqlCond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSqlCond = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3075:2: (iv_ruleIfSqlCond= ruleIfSqlCond EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3076:2: iv_ruleIfSqlCond= ruleIfSqlCond EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlCondRule()); 
            }
            pushFollow(FOLLOW_ruleIfSqlCond_in_entryRuleIfSqlCond7691);
            iv_ruleIfSqlCond=ruleIfSqlCond();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSqlCond; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSqlCond7701); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfSqlCond"


    // $ANTLR start "ruleIfSqlCond"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3083:1: ruleIfSqlCond returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )* ) ;
    public final EObject ruleIfSqlCond() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token lv_oper_3_1=null;
        Token lv_oper_3_2=null;
        Token this_WS_4=null;
        Token this_WS_6=null;
        EObject lv_bool1_1_0 = null;

        EObject lv_bool2_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3086:28: ( ( (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3087:1: ( (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3087:1: ( (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3087:2: (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3087:2: (this_WS_0= RULE_WS )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_WS) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3087:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlCond7738); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_0, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3091:3: ( (lv_bool1_1_0= ruleIfSqlBool ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3092:1: (lv_bool1_1_0= ruleIfSqlBool )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3092:1: (lv_bool1_1_0= ruleIfSqlBool )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3093:3: lv_bool1_1_0= ruleIfSqlBool
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfSqlCondAccess().getBool1IfSqlBoolParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIfSqlBool_in_ruleIfSqlCond7760);
            lv_bool1_1_0=ruleIfSqlBool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfSqlCondRule());
              	        }
                     		set(
                     			current, 
                     			"bool1",
                      		lv_bool1_1_0, 
                      		"IfSqlBool");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3109:2: (this_WS_2= RULE_WS )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_WS) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3109:3: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlCond7772); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_2, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3113:3: ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_AND && LA47_0<=RULE_OR)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3113:4: ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )*
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3113:4: ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3114:1: ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3114:1: ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3115:1: (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3115:1: (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==RULE_AND) ) {
            	        alt44=1;
            	    }
            	    else if ( (LA44_0==RULE_OR) ) {
            	        alt44=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3116:3: lv_oper_3_1= RULE_AND
            	            {
            	            lv_oper_3_1=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleIfSqlCond7793); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_oper_3_1, grammarAccess.getIfSqlCondAccess().getOperANDTerminalRuleCall_3_0_0_0()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getIfSqlCondRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"oper",
            	                      		lv_oper_3_1, 
            	                      		"AND");
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3131:8: lv_oper_3_2= RULE_OR
            	            {
            	            lv_oper_3_2=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleIfSqlCond7813); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_oper_3_2, grammarAccess.getIfSqlCondAccess().getOperORTerminalRuleCall_3_0_0_1()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getIfSqlCondRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"oper",
            	                      		lv_oper_3_2, 
            	                      		"OR");
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3149:2: (this_WS_4= RULE_WS )*
            	    loop45:
            	    do {
            	        int alt45=2;
            	        int LA45_0 = input.LA(1);

            	        if ( (LA45_0==RULE_WS) ) {
            	            alt45=1;
            	        }


            	        switch (alt45) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3149:3: this_WS_4= RULE_WS
            	    	    {
            	    	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlCond7833); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_4, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_3_1()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop45;
            	        }
            	    } while (true);

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3153:3: ( (lv_bool2_5_0= ruleIfSqlBool ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3154:1: (lv_bool2_5_0= ruleIfSqlBool )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3154:1: (lv_bool2_5_0= ruleIfSqlBool )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3155:3: lv_bool2_5_0= ruleIfSqlBool
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfSqlCondAccess().getBool2IfSqlBoolParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIfSqlBool_in_ruleIfSqlCond7855);
            	    lv_bool2_5_0=ruleIfSqlBool();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIfSqlCondRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"bool2",
            	              		lv_bool2_5_0, 
            	              		"IfSqlBool");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3171:2: (this_WS_6= RULE_WS )*
            	    loop46:
            	    do {
            	        int alt46=2;
            	        int LA46_0 = input.LA(1);

            	        if ( (LA46_0==RULE_WS) ) {
            	            alt46=1;
            	        }


            	        switch (alt46) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3171:3: this_WS_6= RULE_WS
            	    	    {
            	    	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlCond7867); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_6, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_3_3()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop46;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfSqlCond"


    // $ANTLR start "entryRuleIfSqlBool"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3183:1: entryRuleIfSqlBool returns [EObject current=null] : iv_ruleIfSqlBool= ruleIfSqlBool EOF ;
    public final EObject entryRuleIfSqlBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSqlBool = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3184:2: (iv_ruleIfSqlBool= ruleIfSqlBool EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3185:2: iv_ruleIfSqlBool= ruleIfSqlBool EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlBoolRule()); 
            }
            pushFollow(FOLLOW_ruleIfSqlBool_in_entryRuleIfSqlBool7906);
            iv_ruleIfSqlBool=ruleIfSqlBool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSqlBool; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSqlBool7916); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfSqlBool"


    // $ANTLR start "ruleIfSqlBool"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3192:1: ruleIfSqlBool returns [EObject current=null] : ( ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) ) | ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN ) ) ;
    public final EObject ruleIfSqlBool() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;
        Token this_STRING_1=null;
        Token lv_not_3_0=null;
        Token this_COLON_4=null;
        Token lv_not_6_0=null;
        Token this_LPAREN_7=null;
        Token this_RPAREN_9=null;
        EObject lv_cnst_2_0 = null;

        EObject lv_ident_5_0 = null;

        EObject lv_cond_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3195:28: ( ( ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) ) | ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3196:1: ( ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) ) | ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3196:1: ( ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) ) | ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case RULE_NOT:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    alt51=1;
                    }
                    break;
                case RULE_COLON:
                    {
                    alt51=2;
                    }
                    break;
                case RULE_LPAREN:
                    {
                    alt51=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
                {
                alt51=1;
                }
                break;
            case RULE_COLON:
                {
                alt51=2;
                }
                break;
            case RULE_LPAREN:
                {
                alt51=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3196:2: ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3196:2: ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3196:3: ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3196:3: ( (lv_not_0_0= RULE_NOT ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_NOT) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3197:1: (lv_not_0_0= RULE_NOT )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3197:1: (lv_not_0_0= RULE_NOT )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3198:3: lv_not_0_0= RULE_NOT
                            {
                            lv_not_0_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlBool7959); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_not_0_0, grammarAccess.getIfSqlBoolAccess().getNotNOTTerminalRuleCall_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getIfSqlBoolRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"not",
                                      		true, 
                                      		"NOT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIfSqlBool7976); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getIfSqlBoolAccess().getSTRINGTerminalRuleCall_0_1()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3218:1: ( (lv_cnst_2_0= ruleConstant ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3219:1: (lv_cnst_2_0= ruleConstant )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3219:1: (lv_cnst_2_0= ruleConstant )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3220:3: lv_cnst_2_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlBoolAccess().getCnstConstantParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleIfSqlBool7996);
                    lv_cnst_2_0=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfSqlBoolRule());
                      	        }
                             		set(
                             			current, 
                             			"cnst",
                              		lv_cnst_2_0, 
                              		"Constant");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3237:6: ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3237:6: ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3237:7: ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3237:7: ( (lv_not_3_0= RULE_NOT ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_NOT) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3238:1: (lv_not_3_0= RULE_NOT )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3238:1: (lv_not_3_0= RULE_NOT )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3239:3: lv_not_3_0= RULE_NOT
                            {
                            lv_not_3_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlBool8021); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_not_3_0, grammarAccess.getIfSqlBoolAccess().getNotNOTTerminalRuleCall_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getIfSqlBoolRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"not",
                                      		true, 
                                      		"NOT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleIfSqlBool8038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_4, grammarAccess.getIfSqlBoolAccess().getCOLONTerminalRuleCall_1_1()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3259:1: ( (lv_ident_5_0= ruleIdentifier ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3260:1: (lv_ident_5_0= ruleIdentifier )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3260:1: (lv_ident_5_0= ruleIdentifier )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3261:3: lv_ident_5_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlBoolAccess().getIdentIdentifierParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleIfSqlBool8058);
                    lv_ident_5_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfSqlBoolRule());
                      	        }
                             		set(
                             			current, 
                             			"ident",
                              		lv_ident_5_0, 
                              		"Identifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3278:6: ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3278:6: ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3278:7: ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3278:7: ( (lv_not_6_0= RULE_NOT ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_NOT) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3279:1: (lv_not_6_0= RULE_NOT )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3279:1: (lv_not_6_0= RULE_NOT )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3280:3: lv_not_6_0= RULE_NOT
                            {
                            lv_not_6_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlBool8083); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_not_6_0, grammarAccess.getIfSqlBoolAccess().getNotNOTTerminalRuleCall_2_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getIfSqlBoolRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"not",
                                      		true, 
                                      		"NOT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    this_LPAREN_7=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleIfSqlBool8100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_7, grammarAccess.getIfSqlBoolAccess().getLPARENTerminalRuleCall_2_1()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3300:1: ( (lv_cond_8_0= ruleIfSqlCond ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3301:1: (lv_cond_8_0= ruleIfSqlCond )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3301:1: (lv_cond_8_0= ruleIfSqlCond )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3302:3: lv_cond_8_0= ruleIfSqlCond
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlBoolAccess().getCondIfSqlCondParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSqlCond_in_ruleIfSqlBool8120);
                    lv_cond_8_0=ruleIfSqlCond();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfSqlBoolRule());
                      	        }
                             		set(
                             			current, 
                             			"cond",
                              		lv_cond_8_0, 
                              		"IfSqlCond");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RPAREN_9=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleIfSqlBool8131); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_9, grammarAccess.getIfSqlBoolAccess().getRPARENTerminalRuleCall_2_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfSqlBool"


    // $ANTLR start "entryRuleOrdSql"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3330:1: entryRuleOrdSql returns [EObject current=null] : iv_ruleOrdSql= ruleOrdSql EOF ;
    public final EObject entryRuleOrdSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrdSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3331:2: (iv_ruleOrdSql= ruleOrdSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3332:2: iv_ruleOrdSql= ruleOrdSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrdSqlRule()); 
            }
            pushFollow(FOLLOW_ruleOrdSql_in_entryRuleOrdSql8167);
            iv_ruleOrdSql=ruleOrdSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrdSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrdSql8177); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrdSql"


    // $ANTLR start "ruleOrdSql"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3339:1: ruleOrdSql returns [EObject current=null] : ( (lv_sqls_0_0= ruleOrdSql2 ) )+ ;
    public final EObject ruleOrdSql() throws RecognitionException {
        EObject current = null;

        EObject lv_sqls_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3342:28: ( ( (lv_sqls_0_0= ruleOrdSql2 ) )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3343:1: ( (lv_sqls_0_0= ruleOrdSql2 ) )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3343:1: ( (lv_sqls_0_0= ruleOrdSql2 ) )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=RULE_WS && LA52_0<=RULE_LBRACE)||(LA52_0>=RULE_QUESTI && LA52_0<=RULE_ESC_CHAR)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3344:1: (lv_sqls_0_0= ruleOrdSql2 )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3344:1: (lv_sqls_0_0= ruleOrdSql2 )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3345:3: lv_sqls_0_0= ruleOrdSql2
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrdSqlAccess().getSqlsOrdSql2ParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrdSql2_in_ruleOrdSql8222);
            	    lv_sqls_0_0=ruleOrdSql2();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrdSqlRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"sqls",
            	              		lv_sqls_0_0, 
            	              		"OrdSql2");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrdSql"


    // $ANTLR start "entryRuleOrdSql2"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3369:1: entryRuleOrdSql2 returns [EObject current=null] : iv_ruleOrdSql2= ruleOrdSql2 EOF ;
    public final EObject entryRuleOrdSql2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrdSql2 = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3370:2: (iv_ruleOrdSql2= ruleOrdSql2 EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3371:2: iv_ruleOrdSql2= ruleOrdSql2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrdSql2Rule()); 
            }
            pushFollow(FOLLOW_ruleOrdSql2_in_entryRuleOrdSql28258);
            iv_ruleOrdSql2=ruleOrdSql2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrdSql2; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrdSql28268); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrdSql2"


    // $ANTLR start "ruleOrdSql2"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3378:1: ruleOrdSql2 returns [EObject current=null] : ( ( (lv_value_0_0= ruleOrdSqlValue ) ) | (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) ) ) ;
    public final EObject ruleOrdSql2() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;
        Token this_COLON_3=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject lv_cnst_2_0 = null;

        EObject lv_ident_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3381:28: ( ( ( (lv_value_0_0= ruleOrdSqlValue ) ) | (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3382:1: ( ( (lv_value_0_0= ruleOrdSqlValue ) ) | (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3382:1: ( ( (lv_value_0_0= ruleOrdSqlValue ) ) | (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) ) )
            int alt53=3;
            switch ( input.LA(1) ) {
            case RULE_WS:
            case RULE_SEMICOLON:
            case RULE_REST:
            case RULE_IDENT_DOT:
            case RULE_IDENT:
            case RULE_NUMBER:
            case RULE_COMMA:
            case RULE_MINUS:
            case RULE_PLUS:
            case RULE_LPAREN:
            case RULE_RPAREN:
            case RULE_LBRACE:
            case RULE_QUESTI:
            case RULE_NOT:
            case RULE_BAND:
            case RULE_BOR:
            case RULE_HASH:
            case RULE_AT:
            case RULE_CARET:
            case RULE_EQUALS:
            case RULE_LESS_THAN:
            case RULE_MORE_THAN:
            case RULE_ESC_CHAR:
                {
                alt53=1;
                }
                break;
            case RULE_STRING:
                {
                alt53=2;
                }
                break;
            case RULE_COLON:
                {
                alt53=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3382:2: ( (lv_value_0_0= ruleOrdSqlValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3382:2: ( (lv_value_0_0= ruleOrdSqlValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3383:1: (lv_value_0_0= ruleOrdSqlValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3383:1: (lv_value_0_0= ruleOrdSqlValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3384:3: lv_value_0_0= ruleOrdSqlValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrdSql2Access().getValueOrdSqlValueParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrdSqlValue_in_ruleOrdSql28314);
                    lv_value_0_0=ruleOrdSqlValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOrdSql2Rule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_0_0, 
                              		"OrdSqlValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3401:6: (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3401:6: (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3401:7: this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) )
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOrdSql28332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getOrdSql2Access().getSTRINGTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3405:1: ( (lv_cnst_2_0= ruleConstant ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3406:1: (lv_cnst_2_0= ruleConstant )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3406:1: (lv_cnst_2_0= ruleConstant )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3407:3: lv_cnst_2_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrdSql2Access().getCnstConstantParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleOrdSql28352);
                    lv_cnst_2_0=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOrdSql2Rule());
                      	        }
                             		set(
                             			current, 
                             			"cnst",
                              		lv_cnst_2_0, 
                              		"Constant");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3424:6: (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3424:6: (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3424:7: this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) )
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleOrdSql28371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_3, grammarAccess.getOrdSql2Access().getCOLONTerminalRuleCall_2_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3428:1: ( (lv_ident_4_0= ruleIdentifier ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3429:1: (lv_ident_4_0= ruleIdentifier )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3429:1: (lv_ident_4_0= ruleIdentifier )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3430:3: lv_ident_4_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrdSql2Access().getIdentIdentifierParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleOrdSql28391);
                    lv_ident_4_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOrdSql2Rule());
                      	        }
                             		set(
                             			current, 
                             			"ident",
                              		lv_ident_4_0, 
                              		"Identifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrdSql2"


    // $ANTLR start "entryRuleOrdSqlValue"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3454:1: entryRuleOrdSqlValue returns [String current=null] : iv_ruleOrdSqlValue= ruleOrdSqlValue EOF ;
    public final String entryRuleOrdSqlValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrdSqlValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3455:2: (iv_ruleOrdSqlValue= ruleOrdSqlValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3456:2: iv_ruleOrdSqlValue= ruleOrdSqlValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrdSqlValueRule()); 
            }
            pushFollow(FOLLOW_ruleOrdSqlValue_in_entryRuleOrdSqlValue8429);
            iv_ruleOrdSqlValue=ruleOrdSqlValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrdSqlValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrdSqlValue8440); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrdSqlValue"


    // $ANTLR start "ruleOrdSqlValue"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3463:1: ruleOrdSqlValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_SEMICOLON_28= RULE_SEMICOLON | this_COMMA_29= RULE_COMMA | this_MINUS_30= RULE_MINUS | this_PLUS_31= RULE_PLUS | this_LPAREN_32= RULE_LPAREN | this_RPAREN_33= RULE_RPAREN | this_LBRACE_34= RULE_LBRACE | this_QUESTI_35= RULE_QUESTI | this_NOT_36= RULE_NOT | this_BAND_37= RULE_BAND | this_BOR_38= RULE_BOR | this_HASH_39= RULE_HASH | this_AT_40= RULE_AT | this_CARET_41= RULE_CARET | this_EQUALS_42= RULE_EQUALS | this_LESS_THAN_43= RULE_LESS_THAN | this_MORE_THAN_44= RULE_MORE_THAN | this_ESC_CHAR_45= RULE_ESC_CHAR ) )* ) ;
    public final AntlrDatatypeRuleToken ruleOrdSqlValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_REST_0=null;
        Token this_IDENT_DOT_1=null;
        Token this_IDENT_2=null;
        Token this_NUMBER_3=null;
        Token this_WS_4=null;
        Token this_SEMICOLON_5=null;
        Token this_COMMA_6=null;
        Token this_MINUS_7=null;
        Token this_PLUS_8=null;
        Token this_LPAREN_9=null;
        Token this_RPAREN_10=null;
        Token this_LBRACE_11=null;
        Token this_QUESTI_12=null;
        Token this_NOT_13=null;
        Token this_BAND_14=null;
        Token this_BOR_15=null;
        Token this_HASH_16=null;
        Token this_AT_17=null;
        Token this_CARET_18=null;
        Token this_EQUALS_19=null;
        Token this_LESS_THAN_20=null;
        Token this_MORE_THAN_21=null;
        Token this_ESC_CHAR_22=null;
        Token this_REST_23=null;
        Token this_IDENT_DOT_24=null;
        Token this_IDENT_25=null;
        Token this_NUMBER_26=null;
        Token this_WS_27=null;
        Token this_SEMICOLON_28=null;
        Token this_COMMA_29=null;
        Token this_MINUS_30=null;
        Token this_PLUS_31=null;
        Token this_LPAREN_32=null;
        Token this_RPAREN_33=null;
        Token this_LBRACE_34=null;
        Token this_QUESTI_35=null;
        Token this_NOT_36=null;
        Token this_BAND_37=null;
        Token this_BOR_38=null;
        Token this_HASH_39=null;
        Token this_AT_40=null;
        Token this_CARET_41=null;
        Token this_EQUALS_42=null;
        Token this_LESS_THAN_43=null;
        Token this_MORE_THAN_44=null;
        Token this_ESC_CHAR_45=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3466:28: ( ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_SEMICOLON_28= RULE_SEMICOLON | this_COMMA_29= RULE_COMMA | this_MINUS_30= RULE_MINUS | this_PLUS_31= RULE_PLUS | this_LPAREN_32= RULE_LPAREN | this_RPAREN_33= RULE_RPAREN | this_LBRACE_34= RULE_LBRACE | this_QUESTI_35= RULE_QUESTI | this_NOT_36= RULE_NOT | this_BAND_37= RULE_BAND | this_BOR_38= RULE_BOR | this_HASH_39= RULE_HASH | this_AT_40= RULE_AT | this_CARET_41= RULE_CARET | this_EQUALS_42= RULE_EQUALS | this_LESS_THAN_43= RULE_LESS_THAN | this_MORE_THAN_44= RULE_MORE_THAN | this_ESC_CHAR_45= RULE_ESC_CHAR ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3467:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_SEMICOLON_28= RULE_SEMICOLON | this_COMMA_29= RULE_COMMA | this_MINUS_30= RULE_MINUS | this_PLUS_31= RULE_PLUS | this_LPAREN_32= RULE_LPAREN | this_RPAREN_33= RULE_RPAREN | this_LBRACE_34= RULE_LBRACE | this_QUESTI_35= RULE_QUESTI | this_NOT_36= RULE_NOT | this_BAND_37= RULE_BAND | this_BOR_38= RULE_BOR | this_HASH_39= RULE_HASH | this_AT_40= RULE_AT | this_CARET_41= RULE_CARET | this_EQUALS_42= RULE_EQUALS | this_LESS_THAN_43= RULE_LESS_THAN | this_MORE_THAN_44= RULE_MORE_THAN | this_ESC_CHAR_45= RULE_ESC_CHAR ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3467:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_SEMICOLON_28= RULE_SEMICOLON | this_COMMA_29= RULE_COMMA | this_MINUS_30= RULE_MINUS | this_PLUS_31= RULE_PLUS | this_LPAREN_32= RULE_LPAREN | this_RPAREN_33= RULE_RPAREN | this_LBRACE_34= RULE_LBRACE | this_QUESTI_35= RULE_QUESTI | this_NOT_36= RULE_NOT | this_BAND_37= RULE_BAND | this_BOR_38= RULE_BOR | this_HASH_39= RULE_HASH | this_AT_40= RULE_AT | this_CARET_41= RULE_CARET | this_EQUALS_42= RULE_EQUALS | this_LESS_THAN_43= RULE_LESS_THAN | this_MORE_THAN_44= RULE_MORE_THAN | this_ESC_CHAR_45= RULE_ESC_CHAR ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3467:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_SEMICOLON_28= RULE_SEMICOLON | this_COMMA_29= RULE_COMMA | this_MINUS_30= RULE_MINUS | this_PLUS_31= RULE_PLUS | this_LPAREN_32= RULE_LPAREN | this_RPAREN_33= RULE_RPAREN | this_LBRACE_34= RULE_LBRACE | this_QUESTI_35= RULE_QUESTI | this_NOT_36= RULE_NOT | this_BAND_37= RULE_BAND | this_BOR_38= RULE_BOR | this_HASH_39= RULE_HASH | this_AT_40= RULE_AT | this_CARET_41= RULE_CARET | this_EQUALS_42= RULE_EQUALS | this_LESS_THAN_43= RULE_LESS_THAN | this_MORE_THAN_44= RULE_MORE_THAN | this_ESC_CHAR_45= RULE_ESC_CHAR ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3467:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_ESC_CHAR_22= RULE_ESC_CHAR )
            int alt54=23;
            switch ( input.LA(1) ) {
            case RULE_REST:
                {
                alt54=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt54=2;
                }
                break;
            case RULE_IDENT:
                {
                alt54=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt54=4;
                }
                break;
            case RULE_WS:
                {
                alt54=5;
                }
                break;
            case RULE_SEMICOLON:
                {
                alt54=6;
                }
                break;
            case RULE_COMMA:
                {
                alt54=7;
                }
                break;
            case RULE_MINUS:
                {
                alt54=8;
                }
                break;
            case RULE_PLUS:
                {
                alt54=9;
                }
                break;
            case RULE_LPAREN:
                {
                alt54=10;
                }
                break;
            case RULE_RPAREN:
                {
                alt54=11;
                }
                break;
            case RULE_LBRACE:
                {
                alt54=12;
                }
                break;
            case RULE_QUESTI:
                {
                alt54=13;
                }
                break;
            case RULE_NOT:
                {
                alt54=14;
                }
                break;
            case RULE_BAND:
                {
                alt54=15;
                }
                break;
            case RULE_BOR:
                {
                alt54=16;
                }
                break;
            case RULE_HASH:
                {
                alt54=17;
                }
                break;
            case RULE_AT:
                {
                alt54=18;
                }
                break;
            case RULE_CARET:
                {
                alt54=19;
                }
                break;
            case RULE_EQUALS:
                {
                alt54=20;
                }
                break;
            case RULE_LESS_THAN:
                {
                alt54=21;
                }
                break;
            case RULE_MORE_THAN:
                {
                alt54=22;
                }
                break;
            case RULE_ESC_CHAR:
                {
                alt54=23;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3467:7: this_REST_0= RULE_REST
                    {
                    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleOrdSqlValue8481); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REST_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REST_0, grammarAccess.getOrdSqlValueAccess().getRESTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3475:10: this_IDENT_DOT_1= RULE_IDENT_DOT
                    {
                    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleOrdSqlValue8507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_DOT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_DOT_1, grammarAccess.getOrdSqlValueAccess().getIDENT_DOTTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3483:10: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleOrdSqlValue8533); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_2, grammarAccess.getOrdSqlValueAccess().getIDENTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3491:10: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleOrdSqlValue8559); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_3, grammarAccess.getOrdSqlValueAccess().getNUMBERTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3499:10: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleOrdSqlValue8585); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WS_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_4, grammarAccess.getOrdSqlValueAccess().getWSTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3507:10: this_SEMICOLON_5= RULE_SEMICOLON
                    {
                    this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleOrdSqlValue8611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SEMICOLON_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_5, grammarAccess.getOrdSqlValueAccess().getSEMICOLONTerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3515:10: this_COMMA_6= RULE_COMMA
                    {
                    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleOrdSqlValue8637); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_6, grammarAccess.getOrdSqlValueAccess().getCOMMATerminalRuleCall_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3523:10: this_MINUS_7= RULE_MINUS
                    {
                    this_MINUS_7=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleOrdSqlValue8663); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_7, grammarAccess.getOrdSqlValueAccess().getMINUSTerminalRuleCall_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3531:10: this_PLUS_8= RULE_PLUS
                    {
                    this_PLUS_8=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleOrdSqlValue8689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_8, grammarAccess.getOrdSqlValueAccess().getPLUSTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3539:10: this_LPAREN_9= RULE_LPAREN
                    {
                    this_LPAREN_9=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOrdSqlValue8715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LPAREN_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_9, grammarAccess.getOrdSqlValueAccess().getLPARENTerminalRuleCall_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3547:10: this_RPAREN_10= RULE_RPAREN
                    {
                    this_RPAREN_10=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOrdSqlValue8741); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RPAREN_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_10, grammarAccess.getOrdSqlValueAccess().getRPARENTerminalRuleCall_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3555:10: this_LBRACE_11= RULE_LBRACE
                    {
                    this_LBRACE_11=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleOrdSqlValue8767); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LBRACE_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACE_11, grammarAccess.getOrdSqlValueAccess().getLBRACETerminalRuleCall_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3563:10: this_QUESTI_12= RULE_QUESTI
                    {
                    this_QUESTI_12=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleOrdSqlValue8793); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUESTI_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUESTI_12, grammarAccess.getOrdSqlValueAccess().getQUESTITerminalRuleCall_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3571:10: this_NOT_13= RULE_NOT
                    {
                    this_NOT_13=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleOrdSqlValue8819); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_13, grammarAccess.getOrdSqlValueAccess().getNOTTerminalRuleCall_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3579:10: this_BAND_14= RULE_BAND
                    {
                    this_BAND_14=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleOrdSqlValue8845); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BAND_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BAND_14, grammarAccess.getOrdSqlValueAccess().getBANDTerminalRuleCall_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3587:10: this_BOR_15= RULE_BOR
                    {
                    this_BOR_15=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleOrdSqlValue8871); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOR_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_15, grammarAccess.getOrdSqlValueAccess().getBORTerminalRuleCall_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3595:10: this_HASH_16= RULE_HASH
                    {
                    this_HASH_16=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleOrdSqlValue8897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASH_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASH_16, grammarAccess.getOrdSqlValueAccess().getHASHTerminalRuleCall_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3603:10: this_AT_17= RULE_AT
                    {
                    this_AT_17=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleOrdSqlValue8923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AT_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_17, grammarAccess.getOrdSqlValueAccess().getATTerminalRuleCall_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3611:10: this_CARET_18= RULE_CARET
                    {
                    this_CARET_18=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleOrdSqlValue8949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CARET_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_18, grammarAccess.getOrdSqlValueAccess().getCARETTerminalRuleCall_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3619:10: this_EQUALS_19= RULE_EQUALS
                    {
                    this_EQUALS_19=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleOrdSqlValue8975); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUALS_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_19, grammarAccess.getOrdSqlValueAccess().getEQUALSTerminalRuleCall_0_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3627:10: this_LESS_THAN_20= RULE_LESS_THAN
                    {
                    this_LESS_THAN_20=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleOrdSqlValue9001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LESS_THAN_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LESS_THAN_20, grammarAccess.getOrdSqlValueAccess().getLESS_THANTerminalRuleCall_0_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3635:10: this_MORE_THAN_21= RULE_MORE_THAN
                    {
                    this_MORE_THAN_21=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleOrdSqlValue9027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MORE_THAN_21);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MORE_THAN_21, grammarAccess.getOrdSqlValueAccess().getMORE_THANTerminalRuleCall_0_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3643:10: this_ESC_CHAR_22= RULE_ESC_CHAR
                    {
                    this_ESC_CHAR_22=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleOrdSqlValue9053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESC_CHAR_22);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESC_CHAR_22, grammarAccess.getOrdSqlValueAccess().getESC_CHARTerminalRuleCall_0_22()); 
                          
                    }

                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3650:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_SEMICOLON_28= RULE_SEMICOLON | this_COMMA_29= RULE_COMMA | this_MINUS_30= RULE_MINUS | this_PLUS_31= RULE_PLUS | this_LPAREN_32= RULE_LPAREN | this_RPAREN_33= RULE_RPAREN | this_LBRACE_34= RULE_LBRACE | this_QUESTI_35= RULE_QUESTI | this_NOT_36= RULE_NOT | this_BAND_37= RULE_BAND | this_BOR_38= RULE_BOR | this_HASH_39= RULE_HASH | this_AT_40= RULE_AT | this_CARET_41= RULE_CARET | this_EQUALS_42= RULE_EQUALS | this_LESS_THAN_43= RULE_LESS_THAN | this_MORE_THAN_44= RULE_MORE_THAN | this_ESC_CHAR_45= RULE_ESC_CHAR ) )*
            loop56:
            do {
                int alt56=2;
                alt56 = dfa56.predict(input);
                switch (alt56) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3650:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_SEMICOLON_28= RULE_SEMICOLON | this_COMMA_29= RULE_COMMA | this_MINUS_30= RULE_MINUS | this_PLUS_31= RULE_PLUS | this_LPAREN_32= RULE_LPAREN | this_RPAREN_33= RULE_RPAREN | this_LBRACE_34= RULE_LBRACE | this_QUESTI_35= RULE_QUESTI | this_NOT_36= RULE_NOT | this_BAND_37= RULE_BAND | this_BOR_38= RULE_BOR | this_HASH_39= RULE_HASH | this_AT_40= RULE_AT | this_CARET_41= RULE_CARET | this_EQUALS_42= RULE_EQUALS | this_LESS_THAN_43= RULE_LESS_THAN | this_MORE_THAN_44= RULE_MORE_THAN | this_ESC_CHAR_45= RULE_ESC_CHAR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3672:23: (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_SEMICOLON_28= RULE_SEMICOLON | this_COMMA_29= RULE_COMMA | this_MINUS_30= RULE_MINUS | this_PLUS_31= RULE_PLUS | this_LPAREN_32= RULE_LPAREN | this_RPAREN_33= RULE_RPAREN | this_LBRACE_34= RULE_LBRACE | this_QUESTI_35= RULE_QUESTI | this_NOT_36= RULE_NOT | this_BAND_37= RULE_BAND | this_BOR_38= RULE_BOR | this_HASH_39= RULE_HASH | this_AT_40= RULE_AT | this_CARET_41= RULE_CARET | this_EQUALS_42= RULE_EQUALS | this_LESS_THAN_43= RULE_LESS_THAN | this_MORE_THAN_44= RULE_MORE_THAN | this_ESC_CHAR_45= RULE_ESC_CHAR )
            	    int alt55=23;
            	    switch ( input.LA(1) ) {
            	    case RULE_REST:
            	        {
            	        alt55=1;
            	        }
            	        break;
            	    case RULE_IDENT_DOT:
            	        {
            	        alt55=2;
            	        }
            	        break;
            	    case RULE_IDENT:
            	        {
            	        alt55=3;
            	        }
            	        break;
            	    case RULE_NUMBER:
            	        {
            	        alt55=4;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt55=5;
            	        }
            	        break;
            	    case RULE_SEMICOLON:
            	        {
            	        alt55=6;
            	        }
            	        break;
            	    case RULE_COMMA:
            	        {
            	        alt55=7;
            	        }
            	        break;
            	    case RULE_MINUS:
            	        {
            	        alt55=8;
            	        }
            	        break;
            	    case RULE_PLUS:
            	        {
            	        alt55=9;
            	        }
            	        break;
            	    case RULE_LPAREN:
            	        {
            	        alt55=10;
            	        }
            	        break;
            	    case RULE_RPAREN:
            	        {
            	        alt55=11;
            	        }
            	        break;
            	    case RULE_LBRACE:
            	        {
            	        alt55=12;
            	        }
            	        break;
            	    case RULE_QUESTI:
            	        {
            	        alt55=13;
            	        }
            	        break;
            	    case RULE_NOT:
            	        {
            	        alt55=14;
            	        }
            	        break;
            	    case RULE_BAND:
            	        {
            	        alt55=15;
            	        }
            	        break;
            	    case RULE_BOR:
            	        {
            	        alt55=16;
            	        }
            	        break;
            	    case RULE_HASH:
            	        {
            	        alt55=17;
            	        }
            	        break;
            	    case RULE_AT:
            	        {
            	        alt55=18;
            	        }
            	        break;
            	    case RULE_CARET:
            	        {
            	        alt55=19;
            	        }
            	        break;
            	    case RULE_EQUALS:
            	        {
            	        alt55=20;
            	        }
            	        break;
            	    case RULE_LESS_THAN:
            	        {
            	        alt55=21;
            	        }
            	        break;
            	    case RULE_MORE_THAN:
            	        {
            	        alt55=22;
            	        }
            	        break;
            	    case RULE_ESC_CHAR:
            	        {
            	        alt55=23;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 55, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt55) {
            	        case 1 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3672:28: this_REST_23= RULE_REST
            	            {
            	            this_REST_23=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleOrdSqlValue9236); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REST_23);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REST_23, grammarAccess.getOrdSqlValueAccess().getRESTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3680:10: this_IDENT_DOT_24= RULE_IDENT_DOT
            	            {
            	            this_IDENT_DOT_24=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleOrdSqlValue9262); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_DOT_24);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_DOT_24, grammarAccess.getOrdSqlValueAccess().getIDENT_DOTTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3688:10: this_IDENT_25= RULE_IDENT
            	            {
            	            this_IDENT_25=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleOrdSqlValue9288); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_25);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_25, grammarAccess.getOrdSqlValueAccess().getIDENTTerminalRuleCall_1_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3696:10: this_NUMBER_26= RULE_NUMBER
            	            {
            	            this_NUMBER_26=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleOrdSqlValue9314); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NUMBER_26);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NUMBER_26, grammarAccess.getOrdSqlValueAccess().getNUMBERTerminalRuleCall_1_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3704:10: this_WS_27= RULE_WS
            	            {
            	            this_WS_27=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleOrdSqlValue9340); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_WS_27);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_WS_27, grammarAccess.getOrdSqlValueAccess().getWSTerminalRuleCall_1_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3712:10: this_SEMICOLON_28= RULE_SEMICOLON
            	            {
            	            this_SEMICOLON_28=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleOrdSqlValue9366); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_SEMICOLON_28);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_SEMICOLON_28, grammarAccess.getOrdSqlValueAccess().getSEMICOLONTerminalRuleCall_1_0_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3720:10: this_COMMA_29= RULE_COMMA
            	            {
            	            this_COMMA_29=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleOrdSqlValue9392); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COMMA_29);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COMMA_29, grammarAccess.getOrdSqlValueAccess().getCOMMATerminalRuleCall_1_0_6()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3728:10: this_MINUS_30= RULE_MINUS
            	            {
            	            this_MINUS_30=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleOrdSqlValue9418); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MINUS_30);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MINUS_30, grammarAccess.getOrdSqlValueAccess().getMINUSTerminalRuleCall_1_0_7()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3736:10: this_PLUS_31= RULE_PLUS
            	            {
            	            this_PLUS_31=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleOrdSqlValue9444); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PLUS_31);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PLUS_31, grammarAccess.getOrdSqlValueAccess().getPLUSTerminalRuleCall_1_0_8()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3744:10: this_LPAREN_32= RULE_LPAREN
            	            {
            	            this_LPAREN_32=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOrdSqlValue9470); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LPAREN_32);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LPAREN_32, grammarAccess.getOrdSqlValueAccess().getLPARENTerminalRuleCall_1_0_9()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3752:10: this_RPAREN_33= RULE_RPAREN
            	            {
            	            this_RPAREN_33=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOrdSqlValue9496); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RPAREN_33);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RPAREN_33, grammarAccess.getOrdSqlValueAccess().getRPARENTerminalRuleCall_1_0_10()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3760:10: this_LBRACE_34= RULE_LBRACE
            	            {
            	            this_LBRACE_34=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleOrdSqlValue9522); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LBRACE_34);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LBRACE_34, grammarAccess.getOrdSqlValueAccess().getLBRACETerminalRuleCall_1_0_11()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 13 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3768:10: this_QUESTI_35= RULE_QUESTI
            	            {
            	            this_QUESTI_35=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleOrdSqlValue9548); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_QUESTI_35);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_QUESTI_35, grammarAccess.getOrdSqlValueAccess().getQUESTITerminalRuleCall_1_0_12()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 14 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3776:10: this_NOT_36= RULE_NOT
            	            {
            	            this_NOT_36=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleOrdSqlValue9574); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NOT_36);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NOT_36, grammarAccess.getOrdSqlValueAccess().getNOTTerminalRuleCall_1_0_13()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 15 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3784:10: this_BAND_37= RULE_BAND
            	            {
            	            this_BAND_37=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleOrdSqlValue9600); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BAND_37);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BAND_37, grammarAccess.getOrdSqlValueAccess().getBANDTerminalRuleCall_1_0_14()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 16 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3792:10: this_BOR_38= RULE_BOR
            	            {
            	            this_BOR_38=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleOrdSqlValue9626); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BOR_38);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BOR_38, grammarAccess.getOrdSqlValueAccess().getBORTerminalRuleCall_1_0_15()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 17 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3800:10: this_HASH_39= RULE_HASH
            	            {
            	            this_HASH_39=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleOrdSqlValue9652); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_HASH_39);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_HASH_39, grammarAccess.getOrdSqlValueAccess().getHASHTerminalRuleCall_1_0_16()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 18 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3808:10: this_AT_40= RULE_AT
            	            {
            	            this_AT_40=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleOrdSqlValue9678); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AT_40);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AT_40, grammarAccess.getOrdSqlValueAccess().getATTerminalRuleCall_1_0_17()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 19 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3816:10: this_CARET_41= RULE_CARET
            	            {
            	            this_CARET_41=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleOrdSqlValue9704); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_CARET_41);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_CARET_41, grammarAccess.getOrdSqlValueAccess().getCARETTerminalRuleCall_1_0_18()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 20 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3824:10: this_EQUALS_42= RULE_EQUALS
            	            {
            	            this_EQUALS_42=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleOrdSqlValue9730); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_EQUALS_42);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_EQUALS_42, grammarAccess.getOrdSqlValueAccess().getEQUALSTerminalRuleCall_1_0_19()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 21 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3832:10: this_LESS_THAN_43= RULE_LESS_THAN
            	            {
            	            this_LESS_THAN_43=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleOrdSqlValue9756); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LESS_THAN_43);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LESS_THAN_43, grammarAccess.getOrdSqlValueAccess().getLESS_THANTerminalRuleCall_1_0_20()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 22 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3840:10: this_MORE_THAN_44= RULE_MORE_THAN
            	            {
            	            this_MORE_THAN_44=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleOrdSqlValue9782); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MORE_THAN_44);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MORE_THAN_44, grammarAccess.getOrdSqlValueAccess().getMORE_THANTerminalRuleCall_1_0_21()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 23 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3848:10: this_ESC_CHAR_45= RULE_ESC_CHAR
            	            {
            	            this_ESC_CHAR_45=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleOrdSqlValue9808); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ESC_CHAR_45);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ESC_CHAR_45, grammarAccess.getOrdSqlValueAccess().getESC_CHARTerminalRuleCall_1_0_22()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrdSqlValue"


    // $ANTLR start "entryRuleColumn"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3863:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3864:2: (iv_ruleColumn= ruleColumn EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3865:2: iv_ruleColumn= ruleColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnRule()); 
            }
            pushFollow(FOLLOW_ruleColumn_in_entryRuleColumn9856);
            iv_ruleColumn=ruleColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumn9866); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3872:1: ruleColumn returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )? ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token this_CARET_1=null;
        Token lv_type_2_0=null;
        Token this_CARET_3=null;
        Token lv_vals_4_1=null;
        Token lv_vals_4_2=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3875:28: ( ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )? ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3876:1: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )? )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3876:1: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3876:2: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )?
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3876:2: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3877:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3877:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3878:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3878:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER )
            int alt57=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                alt57=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt57=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt57=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3879:3: lv_name_0_1= RULE_IDENT
                    {
                    lv_name_0_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumn9910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_1, grammarAccess.getColumnAccess().getNameIDENTTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getColumnRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_1, 
                              		"IDENT");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3894:8: lv_name_0_2= RULE_IDENT_DOT
                    {
                    lv_name_0_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleColumn9930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_2, grammarAccess.getColumnAccess().getNameIDENT_DOTTerminalRuleCall_0_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getColumnRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_2, 
                              		"IDENT_DOT");
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3909:8: lv_name_0_3= RULE_NUMBER
                    {
                    lv_name_0_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleColumn9950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_3, grammarAccess.getColumnAccess().getNameNUMBERTerminalRuleCall_0_0_2()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getColumnRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_3, 
                              		"NUMBER");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3927:2: ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_CARET) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==RULE_IDENT) ) {
                    int LA60_3 = input.LA(3);

                    if ( (synpred5_InternalProcessorDsl()) ) {
                        alt60=1;
                    }
                }
            }
            switch (alt60) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3927:3: ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3927:3: ( ( RULE_CARET )=>this_CARET_1= RULE_CARET )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3927:4: ( RULE_CARET )=>this_CARET_1= RULE_CARET
                    {
                    this_CARET_1=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleColumn9976); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_1, grammarAccess.getColumnAccess().getCARETTerminalRuleCall_1_0()); 
                          
                    }

                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3931:2: ( (lv_type_2_0= RULE_IDENT ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3932:1: (lv_type_2_0= RULE_IDENT )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3932:1: (lv_type_2_0= RULE_IDENT )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3933:3: lv_type_2_0= RULE_IDENT
                    {
                    lv_type_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumn9993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_type_2_0, grammarAccess.getColumnAccess().getTypeIDENTTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getColumnRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"type",
                              		lv_type_2_0, 
                              		"IDENT");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3949:2: ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_CARET) ) {
                            int LA59_2 = input.LA(2);

                            if ( (LA59_2==RULE_IDENT) ) {
                                int LA59_3 = input.LA(3);

                                if ( (synpred6_InternalProcessorDsl()) ) {
                                    alt59=1;
                                }


                            }
                            else if ( (LA59_2==RULE_NUMBER) ) {
                                int LA59_4 = input.LA(3);

                                if ( (synpred6_InternalProcessorDsl()) ) {
                                    alt59=1;
                                }


                            }


                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3949:3: ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3949:3: ( ( RULE_CARET )=>this_CARET_3= RULE_CARET )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3949:4: ( RULE_CARET )=>this_CARET_3= RULE_CARET
                    	    {
                    	    this_CARET_3=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleColumn10016); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_CARET_3, grammarAccess.getColumnAccess().getCARETTerminalRuleCall_1_2_0()); 
                    	          
                    	    }

                    	    }

                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3953:2: ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3954:1: ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3954:1: ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3955:1: (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3955:1: (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER )
                    	    int alt58=2;
                    	    int LA58_0 = input.LA(1);

                    	    if ( (LA58_0==RULE_IDENT) ) {
                    	        alt58=1;
                    	    }
                    	    else if ( (LA58_0==RULE_NUMBER) ) {
                    	        alt58=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 58, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt58) {
                    	        case 1 :
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3956:3: lv_vals_4_1= RULE_IDENT
                    	            {
                    	            lv_vals_4_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumn10035); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              			newLeafNode(lv_vals_4_1, grammarAccess.getColumnAccess().getValsIDENTTerminalRuleCall_1_2_1_0_0()); 
                    	              		
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElement(grammarAccess.getColumnRule());
                    	              	        }
                    	                     		addWithLastConsumed(
                    	                     			current, 
                    	                     			"vals",
                    	                      		lv_vals_4_1, 
                    	                      		"IDENT");
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3971:8: lv_vals_4_2= RULE_NUMBER
                    	            {
                    	            lv_vals_4_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleColumn10055); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              			newLeafNode(lv_vals_4_2, grammarAccess.getColumnAccess().getValsNUMBERTerminalRuleCall_1_2_1_0_1()); 
                    	              		
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElement(grammarAccess.getColumnRule());
                    	              	        }
                    	                     		addWithLastConsumed(
                    	                     			current, 
                    	                     			"vals",
                    	                      		lv_vals_4_2, 
                    	                      		"NUMBER");
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleConstant"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3997:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3998:2: (iv_ruleConstant= ruleConstant EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3999:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant10103);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant10113); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4006:1: ruleConstant returns [EObject current=null] : ( ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )? ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_case_0_1=null;
        Token lv_case_0_2=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token this_CARET_2=null;
        Token lv_type_3_0=null;
        Token this_CARET_4=null;
        Token lv_vals_5_1=null;
        Token lv_vals_5_2=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4009:28: ( ( ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )? ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4010:1: ( ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )? )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4010:1: ( ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4010:2: ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )?
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4010:2: ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_MINUS && LA62_0<=RULE_PLUS)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4011:1: ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4011:1: ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4012:1: (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4012:1: (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_PLUS) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==RULE_MINUS) ) {
                        alt61=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4013:3: lv_case_0_1= RULE_PLUS
                            {
                            lv_case_0_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleConstant10157); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_case_0_1, grammarAccess.getConstantAccess().getCasePLUSTerminalRuleCall_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getConstantRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"case",
                                      		lv_case_0_1, 
                                      		"PLUS");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4028:8: lv_case_0_2= RULE_MINUS
                            {
                            lv_case_0_2=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleConstant10177); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_case_0_2, grammarAccess.getConstantAccess().getCaseMINUSTerminalRuleCall_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getConstantRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"case",
                                      		lv_case_0_2, 
                                      		"MINUS");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4046:3: ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4047:1: ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4047:1: ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4048:1: (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4048:1: (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_IDENT) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_IDENT_DOT) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4049:3: lv_name_1_1= RULE_IDENT
                    {
                    lv_name_1_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstant10205); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_1, grammarAccess.getConstantAccess().getNameIDENTTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConstantRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_1, 
                              		"IDENT");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4064:8: lv_name_1_2= RULE_IDENT_DOT
                    {
                    lv_name_1_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleConstant10225); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_2, grammarAccess.getConstantAccess().getNameIDENT_DOTTerminalRuleCall_1_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConstantRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_2, 
                              		"IDENT_DOT");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4082:2: ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_CARET) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==RULE_IDENT) ) {
                    int LA66_3 = input.LA(3);

                    if ( (synpred7_InternalProcessorDsl()) ) {
                        alt66=1;
                    }
                }
            }
            switch (alt66) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4082:3: ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4082:3: ( ( RULE_CARET )=>this_CARET_2= RULE_CARET )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4082:4: ( RULE_CARET )=>this_CARET_2= RULE_CARET
                    {
                    this_CARET_2=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleConstant10251); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_2, grammarAccess.getConstantAccess().getCARETTerminalRuleCall_2_0()); 
                          
                    }

                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4086:2: ( (lv_type_3_0= RULE_IDENT ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4087:1: (lv_type_3_0= RULE_IDENT )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4087:1: (lv_type_3_0= RULE_IDENT )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4088:3: lv_type_3_0= RULE_IDENT
                    {
                    lv_type_3_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstant10268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_type_3_0, grammarAccess.getConstantAccess().getTypeIDENTTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConstantRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"IDENT");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4104:2: ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==RULE_CARET) ) {
                            int LA65_2 = input.LA(2);

                            if ( (LA65_2==RULE_IDENT) ) {
                                int LA65_3 = input.LA(3);

                                if ( (synpred8_InternalProcessorDsl()) ) {
                                    alt65=1;
                                }


                            }
                            else if ( (LA65_2==RULE_NUMBER) ) {
                                int LA65_4 = input.LA(3);

                                if ( (synpred8_InternalProcessorDsl()) ) {
                                    alt65=1;
                                }


                            }


                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4104:3: ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4104:3: ( ( RULE_CARET )=>this_CARET_4= RULE_CARET )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4104:4: ( RULE_CARET )=>this_CARET_4= RULE_CARET
                    	    {
                    	    this_CARET_4=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleConstant10291); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_CARET_4, grammarAccess.getConstantAccess().getCARETTerminalRuleCall_2_2_0()); 
                    	          
                    	    }

                    	    }

                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4108:2: ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4109:1: ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4109:1: ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4110:1: (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4110:1: (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER )
                    	    int alt64=2;
                    	    int LA64_0 = input.LA(1);

                    	    if ( (LA64_0==RULE_IDENT) ) {
                    	        alt64=1;
                    	    }
                    	    else if ( (LA64_0==RULE_NUMBER) ) {
                    	        alt64=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 64, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt64) {
                    	        case 1 :
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4111:3: lv_vals_5_1= RULE_IDENT
                    	            {
                    	            lv_vals_5_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstant10310); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              			newLeafNode(lv_vals_5_1, grammarAccess.getConstantAccess().getValsIDENTTerminalRuleCall_2_2_1_0_0()); 
                    	              		
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElement(grammarAccess.getConstantRule());
                    	              	        }
                    	                     		addWithLastConsumed(
                    	                     			current, 
                    	                     			"vals",
                    	                      		lv_vals_5_1, 
                    	                      		"IDENT");
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4126:8: lv_vals_5_2= RULE_NUMBER
                    	            {
                    	            lv_vals_5_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleConstant10330); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              			newLeafNode(lv_vals_5_2, grammarAccess.getConstantAccess().getValsNUMBERTerminalRuleCall_2_2_1_0_1()); 
                    	              		
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElement(grammarAccess.getConstantRule());
                    	              	        }
                    	                     		addWithLastConsumed(
                    	                     			current, 
                    	                     			"vals",
                    	                      		lv_vals_5_2, 
                    	                      		"NUMBER");
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleIdentifier"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4152:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4153:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4154:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier10378);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier10388); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4161:1: ruleIdentifier returns [EObject current=null] : ( ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )? ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_mode_0_1=null;
        Token lv_mode_0_2=null;
        Token lv_mode_0_3=null;
        Token lv_case_1_1=null;
        Token lv_case_1_2=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token lv_name_2_3=null;
        Token this_CARET_3=null;
        Token lv_type_4_0=null;
        Token this_CARET_5=null;
        Token lv_vals_6_1=null;
        Token lv_vals_6_2=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4164:28: ( ( ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )? ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4165:1: ( ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )? )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4165:1: ( ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4165:2: ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )?
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4165:2: ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=RULE_EQUALS && LA68_0<=RULE_MORE_THAN)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4166:1: ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4166:1: ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4167:1: (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4167:1: (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN )
                    int alt67=3;
                    switch ( input.LA(1) ) {
                    case RULE_EQUALS:
                        {
                        alt67=1;
                        }
                        break;
                    case RULE_LESS_THAN:
                        {
                        alt67=2;
                        }
                        break;
                    case RULE_MORE_THAN:
                        {
                        alt67=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }

                    switch (alt67) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4168:3: lv_mode_0_1= RULE_EQUALS
                            {
                            lv_mode_0_1=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleIdentifier10432); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_mode_0_1, grammarAccess.getIdentifierAccess().getModeEQUALSTerminalRuleCall_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getIdentifierRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"mode",
                                      		lv_mode_0_1, 
                                      		"EQUALS");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4183:8: lv_mode_0_2= RULE_LESS_THAN
                            {
                            lv_mode_0_2=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleIdentifier10452); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_mode_0_2, grammarAccess.getIdentifierAccess().getModeLESS_THANTerminalRuleCall_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getIdentifierRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"mode",
                                      		lv_mode_0_2, 
                                      		"LESS_THAN");
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4198:8: lv_mode_0_3= RULE_MORE_THAN
                            {
                            lv_mode_0_3=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleIdentifier10472); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_mode_0_3, grammarAccess.getIdentifierAccess().getModeMORE_THANTerminalRuleCall_0_0_2()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getIdentifierRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"mode",
                                      		lv_mode_0_3, 
                                      		"MORE_THAN");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4216:3: ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=RULE_MINUS && LA70_0<=RULE_PLUS)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4217:1: ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4217:1: ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4218:1: (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4218:1: (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_PLUS) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==RULE_MINUS) ) {
                        alt69=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4219:3: lv_case_1_1= RULE_PLUS
                            {
                            lv_case_1_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleIdentifier10500); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_case_1_1, grammarAccess.getIdentifierAccess().getCasePLUSTerminalRuleCall_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getIdentifierRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"case",
                                      		lv_case_1_1, 
                                      		"PLUS");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4234:8: lv_case_1_2= RULE_MINUS
                            {
                            lv_case_1_2=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleIdentifier10520); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_case_1_2, grammarAccess.getIdentifierAccess().getCaseMINUSTerminalRuleCall_1_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getIdentifierRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"case",
                                      		lv_case_1_2, 
                                      		"MINUS");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4252:3: ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4253:1: ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4253:1: ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4254:1: (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4254:1: (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER )
            int alt71=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                alt71=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt71=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt71=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4255:3: lv_name_2_1= RULE_IDENT
                    {
                    lv_name_2_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifier10548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_1, grammarAccess.getIdentifierAccess().getNameIDENTTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIdentifierRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_1, 
                              		"IDENT");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4270:8: lv_name_2_2= RULE_IDENT_DOT
                    {
                    lv_name_2_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleIdentifier10568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_2, grammarAccess.getIdentifierAccess().getNameIDENT_DOTTerminalRuleCall_2_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIdentifierRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_2, 
                              		"IDENT_DOT");
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4285:8: lv_name_2_3= RULE_NUMBER
                    {
                    lv_name_2_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIdentifier10588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_3, grammarAccess.getIdentifierAccess().getNameNUMBERTerminalRuleCall_2_0_2()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIdentifierRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_3, 
                              		"NUMBER");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4303:2: ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_CARET) ) {
                int LA74_1 = input.LA(2);

                if ( (LA74_1==RULE_IDENT) ) {
                    int LA74_3 = input.LA(3);

                    if ( (synpred9_InternalProcessorDsl()) ) {
                        alt74=1;
                    }
                }
            }
            switch (alt74) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4303:3: ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4303:3: ( ( RULE_CARET )=>this_CARET_3= RULE_CARET )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4303:4: ( RULE_CARET )=>this_CARET_3= RULE_CARET
                    {
                    this_CARET_3=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleIdentifier10614); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_3, grammarAccess.getIdentifierAccess().getCARETTerminalRuleCall_3_0()); 
                          
                    }

                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4307:2: ( (lv_type_4_0= RULE_IDENT ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4308:1: (lv_type_4_0= RULE_IDENT )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4308:1: (lv_type_4_0= RULE_IDENT )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4309:3: lv_type_4_0= RULE_IDENT
                    {
                    lv_type_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifier10631); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_type_4_0, grammarAccess.getIdentifierAccess().getTypeIDENTTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIdentifierRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"type",
                              		lv_type_4_0, 
                              		"IDENT");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4325:2: ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==RULE_CARET) ) {
                            int LA73_2 = input.LA(2);

                            if ( (LA73_2==RULE_IDENT) ) {
                                int LA73_3 = input.LA(3);

                                if ( (synpred10_InternalProcessorDsl()) ) {
                                    alt73=1;
                                }


                            }
                            else if ( (LA73_2==RULE_NUMBER) ) {
                                int LA73_4 = input.LA(3);

                                if ( (synpred10_InternalProcessorDsl()) ) {
                                    alt73=1;
                                }


                            }


                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4325:3: ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4325:3: ( ( RULE_CARET )=>this_CARET_5= RULE_CARET )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4325:4: ( RULE_CARET )=>this_CARET_5= RULE_CARET
                    	    {
                    	    this_CARET_5=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleIdentifier10654); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_CARET_5, grammarAccess.getIdentifierAccess().getCARETTerminalRuleCall_3_2_0()); 
                    	          
                    	    }

                    	    }

                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4329:2: ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4330:1: ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4330:1: ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4331:1: (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4331:1: (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER )
                    	    int alt72=2;
                    	    int LA72_0 = input.LA(1);

                    	    if ( (LA72_0==RULE_IDENT) ) {
                    	        alt72=1;
                    	    }
                    	    else if ( (LA72_0==RULE_NUMBER) ) {
                    	        alt72=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 72, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt72) {
                    	        case 1 :
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4332:3: lv_vals_6_1= RULE_IDENT
                    	            {
                    	            lv_vals_6_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifier10673); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              			newLeafNode(lv_vals_6_1, grammarAccess.getIdentifierAccess().getValsIDENTTerminalRuleCall_3_2_1_0_0()); 
                    	              		
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElement(grammarAccess.getIdentifierRule());
                    	              	        }
                    	                     		addWithLastConsumed(
                    	                     			current, 
                    	                     			"vals",
                    	                      		lv_vals_6_1, 
                    	                      		"IDENT");
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4347:8: lv_vals_6_2= RULE_NUMBER
                    	            {
                    	            lv_vals_6_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIdentifier10693); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              			newLeafNode(lv_vals_6_2, grammarAccess.getIdentifierAccess().getValsNUMBERTerminalRuleCall_3_2_1_0_1()); 
                    	              		
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElement(grammarAccess.getIdentifierRule());
                    	              	        }
                    	                     		addWithLastConsumed(
                    	                     			current, 
                    	                     			"vals",
                    	                      		lv_vals_6_2, 
                    	                      		"NUMBER");
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleMappingRule"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4373:1: entryRuleMappingRule returns [EObject current=null] : iv_ruleMappingRule= ruleMappingRule EOF ;
    public final EObject entryRuleMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingRule = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4374:2: (iv_ruleMappingRule= ruleMappingRule EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4375:2: iv_ruleMappingRule= ruleMappingRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingRuleRule()); 
            }
            pushFollow(FOLLOW_ruleMappingRule_in_entryRuleMappingRule10741);
            iv_ruleMappingRule=ruleMappingRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingRule10751); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMappingRule"


    // $ANTLR start "ruleMappingRule"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4382:1: ruleMappingRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON ) ;
    public final EObject ruleMappingRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_LPAREN_1=null;
        Token this_COMMA_3=null;
        Token lv_filters_4_0=null;
        Token this_RPAREN_5=null;
        Token this_EQUALS_6=null;
        Token this_SEMICOLON_8=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_mapping_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4385:28: ( ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4386:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4386:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4386:2: ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4386:2: ( (lv_name_0_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4387:1: (lv_name_0_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4387:1: (lv_name_0_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4388:3: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingRule10793); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getMappingRuleAccess().getNameIDENTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMappingRuleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"IDENT");
              	    
            }

            }


            }

            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleMappingRule10809); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_1, grammarAccess.getMappingRuleAccess().getLPARENTerminalRuleCall_1()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4408:1: ( (lv_type_2_0= ruleMAPPING_TYPE ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4409:1: (lv_type_2_0= ruleMAPPING_TYPE )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4409:1: (lv_type_2_0= ruleMAPPING_TYPE )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4410:3: lv_type_2_0= ruleMAPPING_TYPE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingRuleAccess().getTypeMAPPING_TYPEEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMAPPING_TYPE_in_ruleMappingRule10829);
            lv_type_2_0=ruleMAPPING_TYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMappingRuleRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"MAPPING_TYPE");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4426:2: (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==RULE_COMMA) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4426:3: this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleMappingRule10841); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getMappingRuleAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4430:1: ( (lv_filters_4_0= RULE_IDENT ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4431:1: (lv_filters_4_0= RULE_IDENT )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4431:1: (lv_filters_4_0= RULE_IDENT )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4432:3: lv_filters_4_0= RULE_IDENT
            	    {
            	    lv_filters_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingRule10857); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_filters_4_0, grammarAccess.getMappingRuleAccess().getFiltersIDENTTerminalRuleCall_3_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMappingRuleRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"filters",
            	              		lv_filters_4_0, 
            	              		"IDENT");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            this_RPAREN_5=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleMappingRule10875); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_5, grammarAccess.getMappingRuleAccess().getRPARENTerminalRuleCall_4()); 
                  
            }
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleMappingRule10885); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUALS_6, grammarAccess.getMappingRuleAccess().getEQUALSTerminalRuleCall_5()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4456:1: ( (lv_mapping_7_0= ruleMapping ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4457:1: (lv_mapping_7_0= ruleMapping )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4457:1: (lv_mapping_7_0= ruleMapping )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4458:3: lv_mapping_7_0= ruleMapping
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingRuleAccess().getMappingMappingParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMapping_in_ruleMappingRule10905);
            lv_mapping_7_0=ruleMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMappingRuleRule());
              	        }
                     		set(
                     			current, 
                     			"mapping",
                      		lv_mapping_7_0, 
                      		"Mapping");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleMappingRule10916); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_8, grammarAccess.getMappingRuleAccess().getSEMICOLONTerminalRuleCall_7()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMappingRule"


    // $ANTLR start "entryRuleMapping"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4486:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4487:2: (iv_ruleMapping= ruleMapping EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4488:2: iv_ruleMapping= ruleMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingRule()); 
            }
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping10951);
            iv_ruleMapping=ruleMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping10961); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4495:1: ruleMapping returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )* ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        EObject lv_mappingItems_1_0 = null;

        EObject lv_mappingItems_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4498:28: ( ( (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4499:1: ( (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4499:1: ( (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4499:2: (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4499:2: (this_WS_0= RULE_WS )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==RULE_WS) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4499:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMapping10998); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_0, grammarAccess.getMappingAccess().getWSTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4503:3: ( (lv_mappingItems_1_0= ruleMappingItem ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4504:1: (lv_mappingItems_1_0= ruleMappingItem )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4504:1: (lv_mappingItems_1_0= ruleMappingItem )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4505:3: lv_mappingItems_1_0= ruleMappingItem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingAccess().getMappingItemsMappingItemParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMappingItem_in_ruleMapping11020);
            lv_mappingItems_1_0=ruleMappingItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMappingRule());
              	        }
                     		add(
                     			current, 
                     			"mappingItems",
                      		lv_mappingItems_1_0, 
                      		"MappingItem");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4521:2: ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )*
            loop78:
            do {
                int alt78=2;
                alt78 = dfa78.predict(input);
                switch (alt78) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4521:3: (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4521:3: (this_WS_2= RULE_WS )+
            	    int cnt77=0;
            	    loop77:
            	    do {
            	        int alt77=2;
            	        int LA77_0 = input.LA(1);

            	        if ( (LA77_0==RULE_WS) ) {
            	            alt77=1;
            	        }


            	        switch (alt77) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4521:4: this_WS_2= RULE_WS
            	    	    {
            	    	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMapping11033); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_2, grammarAccess.getMappingAccess().getWSTerminalRuleCall_2_0()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt77 >= 1 ) break loop77;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(77, input);
            	                throw eee;
            	        }
            	        cnt77++;
            	    } while (true);

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4525:3: ( (lv_mappingItems_3_0= ruleMappingItem ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4526:1: (lv_mappingItems_3_0= ruleMappingItem )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4526:1: (lv_mappingItems_3_0= ruleMappingItem )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4527:3: lv_mappingItems_3_0= ruleMappingItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMappingAccess().getMappingItemsMappingItemParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMappingItem_in_ruleMapping11055);
            	    lv_mappingItems_3_0=ruleMappingItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMappingRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"mappingItems",
            	              		lv_mappingItems_3_0, 
            	              		"MappingItem");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4543:4: (this_WS_4= RULE_WS )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_WS) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4543:5: this_WS_4= RULE_WS
            	    {
            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMapping11069); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_4, grammarAccess.getMappingAccess().getWSTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleMappingItem"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4555:1: entryRuleMappingItem returns [EObject current=null] : iv_ruleMappingItem= ruleMappingItem EOF ;
    public final EObject entryRuleMappingItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingItem = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4556:2: (iv_ruleMappingItem= ruleMappingItem EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4557:2: iv_ruleMappingItem= ruleMappingItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingItemRule()); 
            }
            pushFollow(FOLLOW_ruleMappingItem_in_entryRuleMappingItem11106);
            iv_ruleMappingItem=ruleMappingItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingItem11116); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMappingItem"


    // $ANTLR start "ruleMappingItem"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4564:1: ruleMappingItem returns [EObject current=null] : ( ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )? ) ;
    public final EObject ruleMappingItem() throws RecognitionException {
        EObject current = null;

        Token lv_col_0_1=null;
        Token lv_col_0_2=null;
        Token this_STRING_1=null;
        Token lv_type_2_0=null;
        Token this_STRING_3=null;
        EObject lv_attr_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4567:28: ( ( ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )? ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4568:1: ( ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )? )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4568:1: ( ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4568:2: ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )?
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4568:2: ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4569:1: ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4569:1: ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4570:1: (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4570:1: (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_IDENT) ) {
                alt80=1;
            }
            else if ( (LA80_0==RULE_NUMBER) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4571:3: lv_col_0_1= RULE_IDENT
                    {
                    lv_col_0_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingItem11160); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_col_0_1, grammarAccess.getMappingItemAccess().getColIDENTTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMappingItemRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"col",
                              		lv_col_0_1, 
                              		"IDENT");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4586:8: lv_col_0_2= RULE_NUMBER
                    {
                    lv_col_0_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMappingItem11180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_col_0_2, grammarAccess.getMappingItemAccess().getColNUMBERTerminalRuleCall_0_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMappingItemRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"col",
                              		lv_col_0_2, 
                              		"NUMBER");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4604:2: (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_STRING) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4604:3: this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )?
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMappingItem11200); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getMappingItemAccess().getSTRINGTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4608:1: ( (lv_type_2_0= RULE_IDENT ) )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==RULE_IDENT) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4609:1: (lv_type_2_0= RULE_IDENT )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4609:1: (lv_type_2_0= RULE_IDENT )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4610:3: lv_type_2_0= RULE_IDENT
                            {
                            lv_type_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingItem11216); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_type_2_0, grammarAccess.getMappingItemAccess().getTypeIDENTTerminalRuleCall_1_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getMappingItemRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"type",
                                      		lv_type_2_0, 
                                      		"IDENT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4626:3: (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==RULE_STRING) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4626:4: this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) )
                            {
                            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMappingItem11234); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_STRING_3, grammarAccess.getMappingItemAccess().getSTRINGTerminalRuleCall_1_2_0()); 
                                  
                            }
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4630:1: ( (lv_attr_4_0= ruleMappingColumn ) )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4631:1: (lv_attr_4_0= ruleMappingColumn )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4631:1: (lv_attr_4_0= ruleMappingColumn )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4632:3: lv_attr_4_0= ruleMappingColumn
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getMappingItemAccess().getAttrMappingColumnParserRuleCall_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMappingColumn_in_ruleMappingItem11254);
                            lv_attr_4_0=ruleMappingColumn();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getMappingItemRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"attr",
                                      		lv_attr_4_0, 
                                      		"MappingColumn");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMappingItem"


    // $ANTLR start "entryRuleMappingColumn"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4656:1: entryRuleMappingColumn returns [EObject current=null] : iv_ruleMappingColumn= ruleMappingColumn EOF ;
    public final EObject entryRuleMappingColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingColumn = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4657:2: (iv_ruleMappingColumn= ruleMappingColumn EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4658:2: iv_ruleMappingColumn= ruleMappingColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingColumnRule()); 
            }
            pushFollow(FOLLOW_ruleMappingColumn_in_entryRuleMappingColumn11294);
            iv_ruleMappingColumn=ruleMappingColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingColumn11304); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMappingColumn"


    // $ANTLR start "ruleMappingColumn"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4665:1: ruleMappingColumn returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )* ) ;
    public final EObject ruleMappingColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token this_CARET_1=null;
        Token lv_vals_2_1=null;
        Token lv_vals_2_2=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4668:28: ( ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4669:1: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4669:1: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4669:2: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4669:2: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4670:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4670:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4671:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4671:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_IDENT) ) {
                alt84=1;
            }
            else if ( (LA84_0==RULE_IDENT_DOT) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4672:3: lv_name_0_1= RULE_IDENT
                    {
                    lv_name_0_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingColumn11348); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_1, grammarAccess.getMappingColumnAccess().getNameIDENTTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMappingColumnRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_1, 
                              		"IDENT");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4687:8: lv_name_0_2= RULE_IDENT_DOT
                    {
                    lv_name_0_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleMappingColumn11368); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_2, grammarAccess.getMappingColumnAccess().getNameIDENT_DOTTerminalRuleCall_0_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMappingColumnRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_2, 
                              		"IDENT_DOT");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4705:2: (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==RULE_CARET) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4705:3: this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) )
            	    {
            	    this_CARET_1=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleMappingColumn11388); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_CARET_1, grammarAccess.getMappingColumnAccess().getCARETTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4709:1: ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4710:1: ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4710:1: ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4711:1: (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4711:1: (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER )
            	    int alt85=2;
            	    int LA85_0 = input.LA(1);

            	    if ( (LA85_0==RULE_IDENT) ) {
            	        alt85=1;
            	    }
            	    else if ( (LA85_0==RULE_NUMBER) ) {
            	        alt85=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 85, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt85) {
            	        case 1 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4712:3: lv_vals_2_1= RULE_IDENT
            	            {
            	            lv_vals_2_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingColumn11406); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_vals_2_1, grammarAccess.getMappingColumnAccess().getValsIDENTTerminalRuleCall_1_1_0_0()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMappingColumnRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"vals",
            	                      		lv_vals_2_1, 
            	                      		"IDENT");
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4727:8: lv_vals_2_2= RULE_NUMBER
            	            {
            	            lv_vals_2_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMappingColumn11426); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_vals_2_2, grammarAccess.getMappingColumnAccess().getValsNUMBERTerminalRuleCall_1_1_0_1()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMappingColumnRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"vals",
            	                      		lv_vals_2_2, 
            	                      		"NUMBER");
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMappingColumn"


    // $ANTLR start "entryRuleOptionalFeature"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4753:1: entryRuleOptionalFeature returns [EObject current=null] : iv_ruleOptionalFeature= ruleOptionalFeature EOF ;
    public final EObject entryRuleOptionalFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalFeature = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4754:2: (iv_ruleOptionalFeature= ruleOptionalFeature EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4755:2: iv_ruleOptionalFeature= ruleOptionalFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionalFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleOptionalFeature_in_entryRuleOptionalFeature11472);
            iv_ruleOptionalFeature=ruleOptionalFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptionalFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalFeature11482); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionalFeature"


    // $ANTLR start "ruleOptionalFeature"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4762:1: ruleOptionalFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON ) ;
    public final EObject ruleOptionalFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_LPAREN_1=null;
        Token this_COMMA_3=null;
        Token lv_filters_4_0=null;
        Token this_RPAREN_5=null;
        Token this_EQUALS_6=null;
        Token this_SEMICOLON_8=null;
        Enumerator lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_option_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4765:28: ( ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4766:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4766:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4766:2: ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4766:2: ( (lv_name_0_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4767:1: (lv_name_0_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4767:1: (lv_name_0_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4768:3: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleOptionalFeature11524); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getOptionalFeatureAccess().getNameIDENTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOptionalFeatureRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"IDENT");
              	    
            }

            }


            }

            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOptionalFeature11540); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_1, grammarAccess.getOptionalFeatureAccess().getLPARENTerminalRuleCall_1()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4788:1: ( (lv_type_2_0= ruleOPTION_TYPE ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4789:1: (lv_type_2_0= ruleOPTION_TYPE )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4789:1: (lv_type_2_0= ruleOPTION_TYPE )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4790:3: lv_type_2_0= ruleOPTION_TYPE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionalFeatureAccess().getTypeOPTION_TYPEEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOPTION_TYPE_in_ruleOptionalFeature11560);
            lv_type_2_0=ruleOPTION_TYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOptionalFeatureRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"OPTION_TYPE");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4806:2: (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==RULE_COMMA) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4806:3: this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleOptionalFeature11572); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getOptionalFeatureAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4810:1: ( (lv_filters_4_0= RULE_IDENT ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4811:1: (lv_filters_4_0= RULE_IDENT )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4811:1: (lv_filters_4_0= RULE_IDENT )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4812:3: lv_filters_4_0= RULE_IDENT
            	    {
            	    lv_filters_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleOptionalFeature11588); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_filters_4_0, grammarAccess.getOptionalFeatureAccess().getFiltersIDENTTerminalRuleCall_3_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getOptionalFeatureRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"filters",
            	              		lv_filters_4_0, 
            	              		"IDENT");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            this_RPAREN_5=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOptionalFeature11606); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_5, grammarAccess.getOptionalFeatureAccess().getRPARENTerminalRuleCall_4()); 
                  
            }
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleOptionalFeature11616); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUALS_6, grammarAccess.getOptionalFeatureAccess().getEQUALSTerminalRuleCall_5()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4836:1: ( (lv_option_7_0= ruleFeatureValue ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4837:1: (lv_option_7_0= ruleFeatureValue )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4837:1: (lv_option_7_0= ruleFeatureValue )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4838:3: lv_option_7_0= ruleFeatureValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionalFeatureAccess().getOptionFeatureValueParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureValue_in_ruleOptionalFeature11636);
            lv_option_7_0=ruleFeatureValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOptionalFeatureRule());
              	        }
                     		set(
                     			current, 
                     			"option",
                      		lv_option_7_0, 
                      		"FeatureValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleOptionalFeature11647); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_8, grammarAccess.getOptionalFeatureAccess().getSEMICOLONTerminalRuleCall_7()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionalFeature"


    // $ANTLR start "entryRuleFeatureValue"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4866:1: entryRuleFeatureValue returns [String current=null] : iv_ruleFeatureValue= ruleFeatureValue EOF ;
    public final String entryRuleFeatureValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4867:2: (iv_ruleFeatureValue= ruleFeatureValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4868:2: iv_ruleFeatureValue= ruleFeatureValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureValueRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureValue_in_entryRuleFeatureValue11683);
            iv_ruleFeatureValue=ruleFeatureValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureValue11694); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureValue"


    // $ANTLR start "ruleFeatureValue"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4875:1: ruleFeatureValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COLON_5= RULE_COLON | this_STRING_6= RULE_STRING | this_COMMA_7= RULE_COMMA | this_MINUS_8= RULE_MINUS | this_PLUS_9= RULE_PLUS | this_LPAREN_10= RULE_LPAREN | this_RPAREN_11= RULE_RPAREN | this_LBRACE_12= RULE_LBRACE | this_RBRACE_13= RULE_RBRACE | this_QUESTI_14= RULE_QUESTI | this_NOT_15= RULE_NOT | this_BAND_16= RULE_BAND | this_BOR_17= RULE_BOR | this_HASH_18= RULE_HASH | this_AT_19= RULE_AT | this_CARET_20= RULE_CARET | this_EQUALS_21= RULE_EQUALS | this_LESS_THAN_22= RULE_LESS_THAN | this_MORE_THAN_23= RULE_MORE_THAN | this_ESC_CHAR_24= RULE_ESC_CHAR )+ ;
    public final AntlrDatatypeRuleToken ruleFeatureValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_REST_0=null;
        Token this_IDENT_DOT_1=null;
        Token this_IDENT_2=null;
        Token this_NUMBER_3=null;
        Token this_WS_4=null;
        Token this_COLON_5=null;
        Token this_STRING_6=null;
        Token this_COMMA_7=null;
        Token this_MINUS_8=null;
        Token this_PLUS_9=null;
        Token this_LPAREN_10=null;
        Token this_RPAREN_11=null;
        Token this_LBRACE_12=null;
        Token this_RBRACE_13=null;
        Token this_QUESTI_14=null;
        Token this_NOT_15=null;
        Token this_BAND_16=null;
        Token this_BOR_17=null;
        Token this_HASH_18=null;
        Token this_AT_19=null;
        Token this_CARET_20=null;
        Token this_EQUALS_21=null;
        Token this_LESS_THAN_22=null;
        Token this_MORE_THAN_23=null;
        Token this_ESC_CHAR_24=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4878:28: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COLON_5= RULE_COLON | this_STRING_6= RULE_STRING | this_COMMA_7= RULE_COMMA | this_MINUS_8= RULE_MINUS | this_PLUS_9= RULE_PLUS | this_LPAREN_10= RULE_LPAREN | this_RPAREN_11= RULE_RPAREN | this_LBRACE_12= RULE_LBRACE | this_RBRACE_13= RULE_RBRACE | this_QUESTI_14= RULE_QUESTI | this_NOT_15= RULE_NOT | this_BAND_16= RULE_BAND | this_BOR_17= RULE_BOR | this_HASH_18= RULE_HASH | this_AT_19= RULE_AT | this_CARET_20= RULE_CARET | this_EQUALS_21= RULE_EQUALS | this_LESS_THAN_22= RULE_LESS_THAN | this_MORE_THAN_23= RULE_MORE_THAN | this_ESC_CHAR_24= RULE_ESC_CHAR )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4879:1: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COLON_5= RULE_COLON | this_STRING_6= RULE_STRING | this_COMMA_7= RULE_COMMA | this_MINUS_8= RULE_MINUS | this_PLUS_9= RULE_PLUS | this_LPAREN_10= RULE_LPAREN | this_RPAREN_11= RULE_RPAREN | this_LBRACE_12= RULE_LBRACE | this_RBRACE_13= RULE_RBRACE | this_QUESTI_14= RULE_QUESTI | this_NOT_15= RULE_NOT | this_BAND_16= RULE_BAND | this_BOR_17= RULE_BOR | this_HASH_18= RULE_HASH | this_AT_19= RULE_AT | this_CARET_20= RULE_CARET | this_EQUALS_21= RULE_EQUALS | this_LESS_THAN_22= RULE_LESS_THAN | this_MORE_THAN_23= RULE_MORE_THAN | this_ESC_CHAR_24= RULE_ESC_CHAR )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4879:1: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COLON_5= RULE_COLON | this_STRING_6= RULE_STRING | this_COMMA_7= RULE_COMMA | this_MINUS_8= RULE_MINUS | this_PLUS_9= RULE_PLUS | this_LPAREN_10= RULE_LPAREN | this_RPAREN_11= RULE_RPAREN | this_LBRACE_12= RULE_LBRACE | this_RBRACE_13= RULE_RBRACE | this_QUESTI_14= RULE_QUESTI | this_NOT_15= RULE_NOT | this_BAND_16= RULE_BAND | this_BOR_17= RULE_BOR | this_HASH_18= RULE_HASH | this_AT_19= RULE_AT | this_CARET_20= RULE_CARET | this_EQUALS_21= RULE_EQUALS | this_LESS_THAN_22= RULE_LESS_THAN | this_MORE_THAN_23= RULE_MORE_THAN | this_ESC_CHAR_24= RULE_ESC_CHAR )+
            int cnt88=0;
            loop88:
            do {
                int alt88=26;
                switch ( input.LA(1) ) {
                case RULE_REST:
                    {
                    alt88=1;
                    }
                    break;
                case RULE_IDENT_DOT:
                    {
                    alt88=2;
                    }
                    break;
                case RULE_IDENT:
                    {
                    alt88=3;
                    }
                    break;
                case RULE_NUMBER:
                    {
                    alt88=4;
                    }
                    break;
                case RULE_WS:
                    {
                    alt88=5;
                    }
                    break;
                case RULE_COLON:
                    {
                    alt88=6;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt88=7;
                    }
                    break;
                case RULE_COMMA:
                    {
                    alt88=8;
                    }
                    break;
                case RULE_MINUS:
                    {
                    alt88=9;
                    }
                    break;
                case RULE_PLUS:
                    {
                    alt88=10;
                    }
                    break;
                case RULE_LPAREN:
                    {
                    alt88=11;
                    }
                    break;
                case RULE_RPAREN:
                    {
                    alt88=12;
                    }
                    break;
                case RULE_LBRACE:
                    {
                    alt88=13;
                    }
                    break;
                case RULE_RBRACE:
                    {
                    alt88=14;
                    }
                    break;
                case RULE_QUESTI:
                    {
                    alt88=15;
                    }
                    break;
                case RULE_NOT:
                    {
                    alt88=16;
                    }
                    break;
                case RULE_BAND:
                    {
                    alt88=17;
                    }
                    break;
                case RULE_BOR:
                    {
                    alt88=18;
                    }
                    break;
                case RULE_HASH:
                    {
                    alt88=19;
                    }
                    break;
                case RULE_AT:
                    {
                    alt88=20;
                    }
                    break;
                case RULE_CARET:
                    {
                    alt88=21;
                    }
                    break;
                case RULE_EQUALS:
                    {
                    alt88=22;
                    }
                    break;
                case RULE_LESS_THAN:
                    {
                    alt88=23;
                    }
                    break;
                case RULE_MORE_THAN:
                    {
                    alt88=24;
                    }
                    break;
                case RULE_ESC_CHAR:
                    {
                    alt88=25;
                    }
                    break;

                }

                switch (alt88) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4879:6: this_REST_0= RULE_REST
            	    {
            	    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleFeatureValue11734); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_REST_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_REST_0, grammarAccess.getFeatureValueAccess().getRESTTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4887:10: this_IDENT_DOT_1= RULE_IDENT_DOT
            	    {
            	    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleFeatureValue11760); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_IDENT_DOT_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_IDENT_DOT_1, grammarAccess.getFeatureValueAccess().getIDENT_DOTTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4895:10: this_IDENT_2= RULE_IDENT
            	    {
            	    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleFeatureValue11786); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_IDENT_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_IDENT_2, grammarAccess.getFeatureValueAccess().getIDENTTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4903:10: this_NUMBER_3= RULE_NUMBER
            	    {
            	    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleFeatureValue11812); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_NUMBER_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_NUMBER_3, grammarAccess.getFeatureValueAccess().getNUMBERTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4911:10: this_WS_4= RULE_WS
            	    {
            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleFeatureValue11838); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WS_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_4, grammarAccess.getFeatureValueAccess().getWSTerminalRuleCall_4()); 
            	          
            	    }

            	    }
            	    break;
            	case 6 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4919:10: this_COLON_5= RULE_COLON
            	    {
            	    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleFeatureValue11864); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COLON_5);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COLON_5, grammarAccess.getFeatureValueAccess().getCOLONTerminalRuleCall_5()); 
            	          
            	    }

            	    }
            	    break;
            	case 7 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4927:10: this_STRING_6= RULE_STRING
            	    {
            	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureValue11890); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_STRING_6);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_STRING_6, grammarAccess.getFeatureValueAccess().getSTRINGTerminalRuleCall_6()); 
            	          
            	    }

            	    }
            	    break;
            	case 8 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4935:10: this_COMMA_7= RULE_COMMA
            	    {
            	    this_COMMA_7=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleFeatureValue11916); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COMMA_7);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_7, grammarAccess.getFeatureValueAccess().getCOMMATerminalRuleCall_7()); 
            	          
            	    }

            	    }
            	    break;
            	case 9 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4943:10: this_MINUS_8= RULE_MINUS
            	    {
            	    this_MINUS_8=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleFeatureValue11942); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_MINUS_8);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_MINUS_8, grammarAccess.getFeatureValueAccess().getMINUSTerminalRuleCall_8()); 
            	          
            	    }

            	    }
            	    break;
            	case 10 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4951:10: this_PLUS_9= RULE_PLUS
            	    {
            	    this_PLUS_9=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleFeatureValue11968); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PLUS_9);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_PLUS_9, grammarAccess.getFeatureValueAccess().getPLUSTerminalRuleCall_9()); 
            	          
            	    }

            	    }
            	    break;
            	case 11 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4959:10: this_LPAREN_10= RULE_LPAREN
            	    {
            	    this_LPAREN_10=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleFeatureValue11994); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LPAREN_10);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LPAREN_10, grammarAccess.getFeatureValueAccess().getLPARENTerminalRuleCall_10()); 
            	          
            	    }

            	    }
            	    break;
            	case 12 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4967:10: this_RPAREN_11= RULE_RPAREN
            	    {
            	    this_RPAREN_11=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleFeatureValue12020); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_RPAREN_11);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_RPAREN_11, grammarAccess.getFeatureValueAccess().getRPARENTerminalRuleCall_11()); 
            	          
            	    }

            	    }
            	    break;
            	case 13 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4975:10: this_LBRACE_12= RULE_LBRACE
            	    {
            	    this_LBRACE_12=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleFeatureValue12046); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LBRACE_12);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LBRACE_12, grammarAccess.getFeatureValueAccess().getLBRACETerminalRuleCall_12()); 
            	          
            	    }

            	    }
            	    break;
            	case 14 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4983:10: this_RBRACE_13= RULE_RBRACE
            	    {
            	    this_RBRACE_13=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleFeatureValue12072); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_RBRACE_13);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_RBRACE_13, grammarAccess.getFeatureValueAccess().getRBRACETerminalRuleCall_13()); 
            	          
            	    }

            	    }
            	    break;
            	case 15 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4991:10: this_QUESTI_14= RULE_QUESTI
            	    {
            	    this_QUESTI_14=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleFeatureValue12098); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_QUESTI_14);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_QUESTI_14, grammarAccess.getFeatureValueAccess().getQUESTITerminalRuleCall_14()); 
            	          
            	    }

            	    }
            	    break;
            	case 16 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4999:10: this_NOT_15= RULE_NOT
            	    {
            	    this_NOT_15=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleFeatureValue12124); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_NOT_15);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_NOT_15, grammarAccess.getFeatureValueAccess().getNOTTerminalRuleCall_15()); 
            	          
            	    }

            	    }
            	    break;
            	case 17 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5007:10: this_BAND_16= RULE_BAND
            	    {
            	    this_BAND_16=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleFeatureValue12150); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_BAND_16);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_BAND_16, grammarAccess.getFeatureValueAccess().getBANDTerminalRuleCall_16()); 
            	          
            	    }

            	    }
            	    break;
            	case 18 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5015:10: this_BOR_17= RULE_BOR
            	    {
            	    this_BOR_17=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleFeatureValue12176); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_BOR_17);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_BOR_17, grammarAccess.getFeatureValueAccess().getBORTerminalRuleCall_17()); 
            	          
            	    }

            	    }
            	    break;
            	case 19 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5023:10: this_HASH_18= RULE_HASH
            	    {
            	    this_HASH_18=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleFeatureValue12202); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_HASH_18);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_HASH_18, grammarAccess.getFeatureValueAccess().getHASHTerminalRuleCall_18()); 
            	          
            	    }

            	    }
            	    break;
            	case 20 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5031:10: this_AT_19= RULE_AT
            	    {
            	    this_AT_19=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleFeatureValue12228); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_AT_19);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_AT_19, grammarAccess.getFeatureValueAccess().getATTerminalRuleCall_19()); 
            	          
            	    }

            	    }
            	    break;
            	case 21 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5039:10: this_CARET_20= RULE_CARET
            	    {
            	    this_CARET_20=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleFeatureValue12254); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_CARET_20);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_CARET_20, grammarAccess.getFeatureValueAccess().getCARETTerminalRuleCall_20()); 
            	          
            	    }

            	    }
            	    break;
            	case 22 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5047:10: this_EQUALS_21= RULE_EQUALS
            	    {
            	    this_EQUALS_21=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleFeatureValue12280); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_EQUALS_21);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_EQUALS_21, grammarAccess.getFeatureValueAccess().getEQUALSTerminalRuleCall_21()); 
            	          
            	    }

            	    }
            	    break;
            	case 23 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5055:10: this_LESS_THAN_22= RULE_LESS_THAN
            	    {
            	    this_LESS_THAN_22=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleFeatureValue12306); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LESS_THAN_22);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LESS_THAN_22, grammarAccess.getFeatureValueAccess().getLESS_THANTerminalRuleCall_22()); 
            	          
            	    }

            	    }
            	    break;
            	case 24 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5063:10: this_MORE_THAN_23= RULE_MORE_THAN
            	    {
            	    this_MORE_THAN_23=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleFeatureValue12332); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_MORE_THAN_23);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_MORE_THAN_23, grammarAccess.getFeatureValueAccess().getMORE_THANTerminalRuleCall_23()); 
            	          
            	    }

            	    }
            	    break;
            	case 25 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5071:10: this_ESC_CHAR_24= RULE_ESC_CHAR
            	    {
            	    this_ESC_CHAR_24=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleFeatureValue12358); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ESC_CHAR_24);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ESC_CHAR_24, grammarAccess.getFeatureValueAccess().getESC_CHARTerminalRuleCall_24()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt88 >= 1 ) break loop88;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(88, input);
                        throw eee;
                }
                cnt88++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureValue"


    // $ANTLR start "ruleSTATEMEN_TYPE"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5086:1: ruleSTATEMEN_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'QRY' ) | (enumLiteral_1= 'CRUD' ) | (enumLiteral_2= 'CALL' ) ) ;
    public final Enumerator ruleSTATEMEN_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5088:28: ( ( (enumLiteral_0= 'QRY' ) | (enumLiteral_1= 'CRUD' ) | (enumLiteral_2= 'CALL' ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5089:1: ( (enumLiteral_0= 'QRY' ) | (enumLiteral_1= 'CRUD' ) | (enumLiteral_2= 'CALL' ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5089:1: ( (enumLiteral_0= 'QRY' ) | (enumLiteral_1= 'CRUD' ) | (enumLiteral_2= 'CALL' ) )
            int alt89=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt89=1;
                }
                break;
            case 47:
                {
                alt89=2;
                }
                break;
            case 48:
                {
                alt89=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5089:2: (enumLiteral_0= 'QRY' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5089:2: (enumLiteral_0= 'QRY' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5089:4: enumLiteral_0= 'QRY'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_ruleSTATEMEN_TYPE12418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSTATEMEN_TYPEAccess().getQRYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSTATEMEN_TYPEAccess().getQRYEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5095:6: (enumLiteral_1= 'CRUD' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5095:6: (enumLiteral_1= 'CRUD' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5095:8: enumLiteral_1= 'CRUD'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_47_in_ruleSTATEMEN_TYPE12435); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSTATEMEN_TYPEAccess().getCRUDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSTATEMEN_TYPEAccess().getCRUDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5101:6: (enumLiteral_2= 'CALL' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5101:6: (enumLiteral_2= 'CALL' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5101:8: enumLiteral_2= 'CALL'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_48_in_ruleSTATEMEN_TYPE12452); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSTATEMEN_TYPEAccess().getCALLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getSTATEMEN_TYPEAccess().getCALLEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSTATEMEN_TYPE"


    // $ANTLR start "ruleMAPPING_TYPE"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5111:1: ruleMAPPING_TYPE returns [Enumerator current=null] : (enumLiteral_0= 'OUT' ) ;
    public final Enumerator ruleMAPPING_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5113:28: ( (enumLiteral_0= 'OUT' ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5114:1: (enumLiteral_0= 'OUT' )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5114:1: (enumLiteral_0= 'OUT' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5114:3: enumLiteral_0= 'OUT'
            {
            enumLiteral_0=(Token)match(input,49,FOLLOW_49_in_ruleMAPPING_TYPE12496); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getMAPPING_TYPEAccess().getOUTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getMAPPING_TYPEAccess().getOUTEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMAPPING_TYPE"


    // $ANTLR start "ruleOPTION_TYPE"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5124:1: ruleOPTION_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'OPT' ) | (enumLiteral_1= 'LOPT' ) | (enumLiteral_2= 'IOPT' ) | (enumLiteral_3= 'SOPT' ) | (enumLiteral_4= 'BOPT' ) ) ;
    public final Enumerator ruleOPTION_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5126:28: ( ( (enumLiteral_0= 'OPT' ) | (enumLiteral_1= 'LOPT' ) | (enumLiteral_2= 'IOPT' ) | (enumLiteral_3= 'SOPT' ) | (enumLiteral_4= 'BOPT' ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5127:1: ( (enumLiteral_0= 'OPT' ) | (enumLiteral_1= 'LOPT' ) | (enumLiteral_2= 'IOPT' ) | (enumLiteral_3= 'SOPT' ) | (enumLiteral_4= 'BOPT' ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5127:1: ( (enumLiteral_0= 'OPT' ) | (enumLiteral_1= 'LOPT' ) | (enumLiteral_2= 'IOPT' ) | (enumLiteral_3= 'SOPT' ) | (enumLiteral_4= 'BOPT' ) )
            int alt90=5;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt90=1;
                }
                break;
            case 51:
                {
                alt90=2;
                }
                break;
            case 52:
                {
                alt90=3;
                }
                break;
            case 53:
                {
                alt90=4;
                }
                break;
            case 54:
                {
                alt90=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5127:2: (enumLiteral_0= 'OPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5127:2: (enumLiteral_0= 'OPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5127:4: enumLiteral_0= 'OPT'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_50_in_ruleOPTION_TYPE12540); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getOPTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOPTION_TYPEAccess().getOPTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5133:6: (enumLiteral_1= 'LOPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5133:6: (enumLiteral_1= 'LOPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5133:8: enumLiteral_1= 'LOPT'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_51_in_ruleOPTION_TYPE12557); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getLOPTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOPTION_TYPEAccess().getLOPTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5139:6: (enumLiteral_2= 'IOPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5139:6: (enumLiteral_2= 'IOPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5139:8: enumLiteral_2= 'IOPT'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_52_in_ruleOPTION_TYPE12574); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getIOPTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOPTION_TYPEAccess().getIOPTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5145:6: (enumLiteral_3= 'SOPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5145:6: (enumLiteral_3= 'SOPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5145:8: enumLiteral_3= 'SOPT'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_53_in_ruleOPTION_TYPE12591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getSOPTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getOPTION_TYPEAccess().getSOPTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5151:6: (enumLiteral_4= 'BOPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5151:6: (enumLiteral_4= 'BOPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5151:8: enumLiteral_4= 'BOPT'
                    {
                    enumLiteral_4=(Token)match(input,54,FOLLOW_54_in_ruleOPTION_TYPE12608); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getBOPTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getOPTION_TYPEAccess().getBOPTEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOPTION_TYPE"

    // $ANTLR start synpred1_InternalProcessorDsl
    public final void synpred1_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:617:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN ) )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:617:4: ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN )
        {
        if ( input.LA(1)==RULE_WS||(input.LA(1)>=RULE_REST && input.LA(1)<=RULE_MORE_THAN) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred1_InternalProcessorDsl

    // $ANTLR start synpred2_InternalProcessorDsl
    public final void synpred2_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1719:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1719:4: ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR )
        {
        if ( input.LA(1)==RULE_WS||(input.LA(1)>=RULE_REST && input.LA(1)<=RULE_NUMBER)||(input.LA(1)>=RULE_COMMA && input.LA(1)<=RULE_RPAREN)||(input.LA(1)>=RULE_RBRACE && input.LA(1)<=RULE_HASH)||(input.LA(1)>=RULE_CARET && input.LA(1)<=RULE_ESC_CHAR) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred2_InternalProcessorDsl

    // $ANTLR start synpred3_InternalProcessorDsl
    public final void synpred3_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2624:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2624:4: ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR )
        {
        if ( (input.LA(1)>=RULE_WS && input.LA(1)<=RULE_NUMBER)||(input.LA(1)>=RULE_COMMA && input.LA(1)<=RULE_RPAREN)||(input.LA(1)>=RULE_QUESTI && input.LA(1)<=RULE_BAND)||input.LA(1)==RULE_HASH||(input.LA(1)>=RULE_CARET && input.LA(1)<=RULE_ESC_CHAR) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred3_InternalProcessorDsl

    // $ANTLR start synpred4_InternalProcessorDsl
    public final void synpred4_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3650:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3650:4: ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR )
        {
        if ( (input.LA(1)>=RULE_WS && input.LA(1)<=RULE_NUMBER)||(input.LA(1)>=RULE_COMMA && input.LA(1)<=RULE_LBRACE)||(input.LA(1)>=RULE_QUESTI && input.LA(1)<=RULE_ESC_CHAR) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred4_InternalProcessorDsl

    // $ANTLR start synpred5_InternalProcessorDsl
    public final void synpred5_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3927:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3927:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred5_InternalProcessorDsl9971); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalProcessorDsl

    // $ANTLR start synpred6_InternalProcessorDsl
    public final void synpred6_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3949:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3949:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred6_InternalProcessorDsl10011); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalProcessorDsl

    // $ANTLR start synpred7_InternalProcessorDsl
    public final void synpred7_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4082:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4082:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred7_InternalProcessorDsl10246); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalProcessorDsl

    // $ANTLR start synpred8_InternalProcessorDsl
    public final void synpred8_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4104:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4104:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred8_InternalProcessorDsl10286); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalProcessorDsl

    // $ANTLR start synpred9_InternalProcessorDsl
    public final void synpred9_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4303:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4303:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred9_InternalProcessorDsl10609); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalProcessorDsl

    // $ANTLR start synpred10_InternalProcessorDsl
    public final void synpred10_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4325:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4325:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred10_InternalProcessorDsl10649); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalProcessorDsl

    // Delegated rules

    public final boolean synpred7_InternalProcessorDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalProcessorDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalProcessorDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalProcessorDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalProcessorDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalProcessorDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalProcessorDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalProcessorDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalProcessorDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalProcessorDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalProcessorDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalProcessorDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalProcessorDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalProcessorDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalProcessorDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalProcessorDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalProcessorDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalProcessorDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalProcessorDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalProcessorDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA78 dfa78 = new DFA78(this);
    static final String DFA8_eotS =
        "\12\uffff";
    static final String DFA8_eofS =
        "\1\1\11\uffff";
    static final String DFA8_minS =
        "\1\10\1\uffff\1\17\3\uffff\1\56\3\uffff";
    static final String DFA8_maxS =
        "\1\55\1\uffff\1\17\3\uffff\1\66\3\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\7\1\uffff\1\4\1\5\1\6\1\uffff\1\2\1\3\1\1";
    static final String DFA8_specialS =
        "\12\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\31\uffff\7\5\1\3\4\4",
            "",
            "\1\6",
            "",
            "",
            "",
            "\3\7\1\10\5\11",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "()+ loopback of 85:3: ( ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* ) | ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* ) | ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* ) | ( ( (lv_pojos_7_0= rulePojoDefinition ) ) (this_WS_8= RULE_WS )* ) | ( ( (lv_usages_9_0= rulePojoUsage ) ) (this_WS_10= RULE_WS )* ) | ( ( (lv_properties_11_0= ruleProperty ) ) (this_WS_12= RULE_WS )* ) )+";
        }
    }
    static final String DFA17_eotS =
        "\32\uffff";
    static final String DFA17_eofS =
        "\1\1\31\uffff";
    static final String DFA17_minS =
        "\1\4\31\uffff";
    static final String DFA17_maxS =
        "\1\34\31\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\2\30\1";
    static final String DFA17_specialS =
        "\1\0\31\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\6\1\1\1\2\1\3\1\4\1\5\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
            "\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()* loopback of 617:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COLON_28= RULE_COLON | this_STRING_29= RULE_STRING | this_COMMA_30= RULE_COMMA | this_MINUS_31= RULE_MINUS | this_PLUS_32= RULE_PLUS | this_LPAREN_33= RULE_LPAREN | this_RPAREN_34= RULE_RPAREN | this_LBRACE_35= RULE_LBRACE | this_RBRACE_36= RULE_RBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                         
                        int index17_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA17_0==EOF||LA17_0==RULE_SEMICOLON) ) {s = 1;}

                        else if ( (LA17_0==RULE_REST) && (synpred1_InternalProcessorDsl())) {s = 2;}

                        else if ( (LA17_0==RULE_IDENT_DOT) && (synpred1_InternalProcessorDsl())) {s = 3;}

                        else if ( (LA17_0==RULE_IDENT) && (synpred1_InternalProcessorDsl())) {s = 4;}

                        else if ( (LA17_0==RULE_NUMBER) && (synpred1_InternalProcessorDsl())) {s = 5;}

                        else if ( (LA17_0==RULE_WS) && (synpred1_InternalProcessorDsl())) {s = 6;}

                        else if ( (LA17_0==RULE_COLON) && (synpred1_InternalProcessorDsl())) {s = 7;}

                        else if ( (LA17_0==RULE_STRING) && (synpred1_InternalProcessorDsl())) {s = 8;}

                        else if ( (LA17_0==RULE_COMMA) && (synpred1_InternalProcessorDsl())) {s = 9;}

                        else if ( (LA17_0==RULE_MINUS) && (synpred1_InternalProcessorDsl())) {s = 10;}

                        else if ( (LA17_0==RULE_PLUS) && (synpred1_InternalProcessorDsl())) {s = 11;}

                        else if ( (LA17_0==RULE_LPAREN) && (synpred1_InternalProcessorDsl())) {s = 12;}

                        else if ( (LA17_0==RULE_RPAREN) && (synpred1_InternalProcessorDsl())) {s = 13;}

                        else if ( (LA17_0==RULE_LBRACE) && (synpred1_InternalProcessorDsl())) {s = 14;}

                        else if ( (LA17_0==RULE_RBRACE) && (synpred1_InternalProcessorDsl())) {s = 15;}

                        else if ( (LA17_0==RULE_QUESTI) && (synpred1_InternalProcessorDsl())) {s = 16;}

                        else if ( (LA17_0==RULE_NOT) && (synpred1_InternalProcessorDsl())) {s = 17;}

                        else if ( (LA17_0==RULE_BAND) && (synpred1_InternalProcessorDsl())) {s = 18;}

                        else if ( (LA17_0==RULE_BOR) && (synpred1_InternalProcessorDsl())) {s = 19;}

                        else if ( (LA17_0==RULE_HASH) && (synpred1_InternalProcessorDsl())) {s = 20;}

                        else if ( (LA17_0==RULE_AT) && (synpred1_InternalProcessorDsl())) {s = 21;}

                        else if ( (LA17_0==RULE_CARET) && (synpred1_InternalProcessorDsl())) {s = 22;}

                        else if ( (LA17_0==RULE_EQUALS) && (synpred1_InternalProcessorDsl())) {s = 23;}

                        else if ( (LA17_0==RULE_LESS_THAN) && (synpred1_InternalProcessorDsl())) {s = 24;}

                        else if ( (LA17_0==RULE_MORE_THAN) && (synpred1_InternalProcessorDsl())) {s = 25;}

                         
                        input.seek(index17_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA25_eotS =
        "\30\uffff";
    static final String DFA25_eofS =
        "\1\1\27\uffff";
    static final String DFA25_minS =
        "\1\4\1\uffff\25\0\1\uffff";
    static final String DFA25_maxS =
        "\1\35\1\uffff\25\0\1\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\2\25\uffff\1\1";
    static final String DFA25_specialS =
        "\2\uffff\1\14\1\12\1\24\1\16\1\7\1\5\1\3\1\22\1\1\1\2\1\4\1\0\1"+
        "\21\1\23\1\11\1\10\1\13\1\20\1\17\1\15\1\6\1\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\6\1\1\1\2\1\3\1\4\1\5\2\1\1\7\1\10\1\11\1\12\1\13\1\1\1\14"+
            "\1\15\1\16\1\17\1\20\1\21\1\1\1\22\1\23\1\24\1\25\1\26",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "()* loopback of 1719:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_21= RULE_REST | this_IDENT_DOT_22= RULE_IDENT_DOT | this_IDENT_23= RULE_IDENT | this_NUMBER_24= RULE_NUMBER | this_WS_25= RULE_WS | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_RBRACE_31= RULE_RBRACE | this_QUESTI_32= RULE_QUESTI | this_NOT_33= RULE_NOT | this_BAND_34= RULE_BAND | this_BOR_35= RULE_BOR | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_ESC_CHAR_41= RULE_ESC_CHAR ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_13 = input.LA(1);

                         
                        int index25_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_10 = input.LA(1);

                         
                        int index25_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_11 = input.LA(1);

                         
                        int index25_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA25_8 = input.LA(1);

                         
                        int index25_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA25_12 = input.LA(1);

                         
                        int index25_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA25_7 = input.LA(1);

                         
                        int index25_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA25_22 = input.LA(1);

                         
                        int index25_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_22);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA25_6 = input.LA(1);

                         
                        int index25_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_6);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA25_17 = input.LA(1);

                         
                        int index25_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_17);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA25_16 = input.LA(1);

                         
                        int index25_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_16);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA25_3 = input.LA(1);

                         
                        int index25_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_3);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA25_18 = input.LA(1);

                         
                        int index25_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_18);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA25_2 = input.LA(1);

                         
                        int index25_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_2);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA25_21 = input.LA(1);

                         
                        int index25_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_21);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA25_5 = input.LA(1);

                         
                        int index25_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_5);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA25_20 = input.LA(1);

                         
                        int index25_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_20);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA25_19 = input.LA(1);

                         
                        int index25_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_19);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA25_14 = input.LA(1);

                         
                        int index25_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_14);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA25_9 = input.LA(1);

                         
                        int index25_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_9);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA25_15 = input.LA(1);

                         
                        int index25_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_15);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA25_4 = input.LA(1);

                         
                        int index25_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA36_eotS =
        "\27\uffff";
    static final String DFA36_eofS =
        "\1\1\26\uffff";
    static final String DFA36_minS =
        "\1\4\1\uffff\24\0\1\uffff";
    static final String DFA36_maxS =
        "\1\35\1\uffff\24\0\1\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\2\24\uffff\1\1";
    static final String DFA36_specialS =
        "\2\uffff\1\4\1\12\1\14\1\15\1\1\1\16\1\22\1\21\1\20\1\0\1\2\1\3"+
        "\1\6\1\11\1\23\1\7\1\10\1\5\1\13\1\17\1\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\6\1\7\1\2\1\3\1\4\1\5\2\1\1\10\1\11\1\12\1\13\1\14\2\1\1"+
            "\15\1\16\1\17\1\1\1\20\1\1\1\21\1\22\1\23\1\24\1\25",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "()* loopback of 2624:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_20= RULE_REST | this_IDENT_DOT_21= RULE_IDENT_DOT | this_IDENT_22= RULE_IDENT | this_NUMBER_23= RULE_NUMBER | this_WS_24= RULE_WS | this_SEMICOLON_25= RULE_SEMICOLON | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_QUESTI_31= RULE_QUESTI | this_NOT_32= RULE_NOT | this_BAND_33= RULE_BAND | this_HASH_34= RULE_HASH | this_CARET_35= RULE_CARET | this_EQUALS_36= RULE_EQUALS | this_LESS_THAN_37= RULE_LESS_THAN | this_MORE_THAN_38= RULE_MORE_THAN | this_ESC_CHAR_39= RULE_ESC_CHAR ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_11 = input.LA(1);

                         
                        int index36_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_6 = input.LA(1);

                         
                        int index36_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_12 = input.LA(1);

                         
                        int index36_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA36_13 = input.LA(1);

                         
                        int index36_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA36_2 = input.LA(1);

                         
                        int index36_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA36_19 = input.LA(1);

                         
                        int index36_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_19);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA36_14 = input.LA(1);

                         
                        int index36_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA36_17 = input.LA(1);

                         
                        int index36_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_17);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA36_18 = input.LA(1);

                         
                        int index36_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_18);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA36_15 = input.LA(1);

                         
                        int index36_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_15);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA36_3 = input.LA(1);

                         
                        int index36_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_3);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA36_20 = input.LA(1);

                         
                        int index36_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_20);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA36_4 = input.LA(1);

                         
                        int index36_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_4);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA36_5 = input.LA(1);

                         
                        int index36_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_5);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA36_7 = input.LA(1);

                         
                        int index36_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_7);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA36_21 = input.LA(1);

                         
                        int index36_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_21);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA36_10 = input.LA(1);

                         
                        int index36_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_10);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA36_9 = input.LA(1);

                         
                        int index36_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_9);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA36_8 = input.LA(1);

                         
                        int index36_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_8);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA36_16 = input.LA(1);

                         
                        int index36_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\32\uffff";
    static final String DFA56_eofS =
        "\1\1\31\uffff";
    static final String DFA56_minS =
        "\1\4\1\uffff\27\0\1\uffff";
    static final String DFA56_maxS =
        "\1\35\1\uffff\27\0\1\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\1\2\27\uffff\1\1";
    static final String DFA56_specialS =
        "\2\uffff\1\10\1\23\1\12\1\26\1\24\1\11\1\21\1\6\1\15\1\1\1\17\1"+
        "\4\1\22\1\5\1\25\1\7\1\20\1\3\1\16\1\13\1\2\1\14\1\0\1\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\6\1\7\1\2\1\3\1\4\1\5\2\1\1\10\1\11\1\12\1\13\1\14\1\15\1"+
            "\1\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "()* loopback of 3650:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_SEMICOLON_28= RULE_SEMICOLON | this_COMMA_29= RULE_COMMA | this_MINUS_30= RULE_MINUS | this_PLUS_31= RULE_PLUS | this_LPAREN_32= RULE_LPAREN | this_RPAREN_33= RULE_RPAREN | this_LBRACE_34= RULE_LBRACE | this_QUESTI_35= RULE_QUESTI | this_NOT_36= RULE_NOT | this_BAND_37= RULE_BAND | this_BOR_38= RULE_BOR | this_HASH_39= RULE_HASH | this_AT_40= RULE_AT | this_CARET_41= RULE_CARET | this_EQUALS_42= RULE_EQUALS | this_LESS_THAN_43= RULE_LESS_THAN | this_MORE_THAN_44= RULE_MORE_THAN | this_ESC_CHAR_45= RULE_ESC_CHAR ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_24 = input.LA(1);

                         
                        int index56_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_24);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_11 = input.LA(1);

                         
                        int index56_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA56_22 = input.LA(1);

                         
                        int index56_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_22);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA56_19 = input.LA(1);

                         
                        int index56_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_19);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA56_13 = input.LA(1);

                         
                        int index56_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_13);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA56_15 = input.LA(1);

                         
                        int index56_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_15);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA56_9 = input.LA(1);

                         
                        int index56_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA56_17 = input.LA(1);

                         
                        int index56_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_17);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA56_2 = input.LA(1);

                         
                        int index56_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_2);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA56_7 = input.LA(1);

                         
                        int index56_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_7);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA56_4 = input.LA(1);

                         
                        int index56_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_4);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA56_21 = input.LA(1);

                         
                        int index56_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_21);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA56_23 = input.LA(1);

                         
                        int index56_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_23);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA56_10 = input.LA(1);

                         
                        int index56_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_10);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA56_20 = input.LA(1);

                         
                        int index56_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_20);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA56_12 = input.LA(1);

                         
                        int index56_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_12);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA56_18 = input.LA(1);

                         
                        int index56_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_18);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA56_8 = input.LA(1);

                         
                        int index56_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_8);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA56_14 = input.LA(1);

                         
                        int index56_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_14);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA56_3 = input.LA(1);

                         
                        int index56_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_3);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA56_6 = input.LA(1);

                         
                        int index56_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_6);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA56_16 = input.LA(1);

                         
                        int index56_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_16);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA56_5 = input.LA(1);

                         
                        int index56_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA78_eotS =
        "\4\uffff";
    static final String DFA78_eofS =
        "\2\2\2\uffff";
    static final String DFA78_minS =
        "\2\4\2\uffff";
    static final String DFA78_maxS =
        "\1\5\1\11\2\uffff";
    static final String DFA78_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA78_specialS =
        "\4\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\1\1\2",
            "\1\1\1\2\2\uffff\2\3",
            "",
            ""
    };

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "()* loopback of 4521:2: ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleArtifacts_in_entryRuleArtifacts75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtifacts85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts122 = new BitSet(new long[]{0x00003FFC00000110L});
    public static final BitSet FOLLOW_ruleOptionalFeature_in_ruleArtifacts146 = new BitSet(new long[]{0x00003FFC00000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts158 = new BitSet(new long[]{0x00003FFC00000112L});
    public static final BitSet FOLLOW_ruleMetaStatement_in_ruleArtifacts188 = new BitSet(new long[]{0x00003FFC00000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts200 = new BitSet(new long[]{0x00003FFC00000112L});
    public static final BitSet FOLLOW_ruleMappingRule_in_ruleArtifacts230 = new BitSet(new long[]{0x00003FFC00000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts242 = new BitSet(new long[]{0x00003FFC00000112L});
    public static final BitSet FOLLOW_rulePojoDefinition_in_ruleArtifacts272 = new BitSet(new long[]{0x00003FFC00000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts284 = new BitSet(new long[]{0x00003FFC00000112L});
    public static final BitSet FOLLOW_rulePojoUsage_in_ruleArtifacts314 = new BitSet(new long[]{0x00003FFC00000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts326 = new BitSet(new long[]{0x00003FFC00000112L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleArtifacts356 = new BitSet(new long[]{0x00003FFC00000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts368 = new BitSet(new long[]{0x00003FFC00000112L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleProperty462 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_35_in_ruleProperty499 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_36_in_ruleProperty531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty543 = new BitSet(new long[]{0x000000001FFFFFD0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty565 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_37_in_ruleProperty585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty597 = new BitSet(new long[]{0x000000001FFFFFD0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty619 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_38_in_ruleProperty639 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty651 = new BitSet(new long[]{0x000000001FFFFFD0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty673 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_39_in_ruleProperty693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty705 = new BitSet(new long[]{0x000000001FFFFFD0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty727 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_40_in_ruleProperty747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty759 = new BitSet(new long[]{0x000000001FFFFFD0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty781 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleProperty794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValue_in_entryRulePropertyValue830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValue841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_rulePropertyValue882 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_rulePropertyValue908 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePropertyValue934 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rulePropertyValue960 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulePropertyValue986 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyValue1012 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rulePropertyValue1038 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_rulePropertyValue1064 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rulePropertyValue1090 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rulePropertyValue1116 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rulePropertyValue1142 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rulePropertyValue1168 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rulePropertyValue1194 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_rulePropertyValue1220 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_NOT_in_rulePropertyValue1246 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_BAND_in_rulePropertyValue1272 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_BOR_in_rulePropertyValue1298 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_HASH_in_rulePropertyValue1324 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_AT_in_rulePropertyValue1350 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_CARET_in_rulePropertyValue1376 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_rulePropertyValue1402 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_rulePropertyValue1428 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_rulePropertyValue1454 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_REST_in_rulePropertyValue1644 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_rulePropertyValue1670 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePropertyValue1696 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rulePropertyValue1722 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_WS_in_rulePropertyValue1748 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulePropertyValue1774 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyValue1800 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rulePropertyValue1826 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_rulePropertyValue1852 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rulePropertyValue1878 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rulePropertyValue1904 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rulePropertyValue1930 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rulePropertyValue1956 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rulePropertyValue1982 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_rulePropertyValue2008 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_NOT_in_rulePropertyValue2034 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_BAND_in_rulePropertyValue2060 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_BOR_in_rulePropertyValue2086 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_HASH_in_rulePropertyValue2112 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_AT_in_rulePropertyValue2138 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_CARET_in_rulePropertyValue2164 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_rulePropertyValue2190 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_rulePropertyValue2216 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_rulePropertyValue2242 = new BitSet(new long[]{0x000000001FFFFFD2L});
    public static final BitSet FOLLOW_rulePojoDefinition_in_entryRulePojoDefinition2296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePojoDefinition2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulePojoDefinition2347 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePojoDefinition2364 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePojoDefinition2388 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_rulePojoDefinition2408 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulePojoDefinition2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePojoUsage_in_entryRulePojoUsage2466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePojoUsage2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnUsage_in_rulePojoUsage2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierUsage_in_rulePojoUsage2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantUsage_in_rulePojoUsage2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingUsage_in_rulePojoUsage2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnUsage_in_entryRuleColumnUsage2645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnUsage2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleColumnUsage2696 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumnUsage2716 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumnUsage2736 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleColumnUsage2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierUsage_in_entryRuleIdentifierUsage2792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifierUsage2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleIdentifierUsage2843 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifierUsage2863 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifierUsage2883 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleIdentifierUsage2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantUsage_in_entryRuleConstantUsage2939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantUsage2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleConstantUsage2990 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstantUsage3010 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstantUsage3030 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleConstantUsage3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingUsage_in_entryRuleMappingUsage3086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingUsage3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleMappingUsage3137 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingUsage3157 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingUsage3177 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleMappingUsage3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaStatement_in_entryRuleMetaStatement3227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaStatement3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMetaStatement3279 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleMetaStatement3295 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_ruleSTATEMEN_TYPE_in_ruleMetaStatement3315 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleMetaStatement3327 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMetaStatement3343 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleMetaStatement3361 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMetaStatement3371 = new BitSet(new long[]{0x000000003FFFFFD0L});
    public static final BitSet FOLLOW_ruleSql_in_ruleMetaStatement3391 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleMetaStatement3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSql_in_entryRuleSql3437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSql3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlFragment_in_ruleSql3492 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_ruleSqlFragment_in_entryRuleSqlFragment3528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlFragment3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlValue_in_ruleSqlFragment3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleSqlFragment3602 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_ruleColumn_in_ruleSqlFragment3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSqlFragment3641 = new BitSet(new long[]{0x0000000000006180L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleSqlFragment3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleSqlFragment3680 = new BitSet(new long[]{0x000000001C006380L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleSqlFragment3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleSqlFragment3719 = new BitSet(new long[]{0x0000000004E80010L});
    public static final BitSet FOLLOW_ruleMetaSql_in_ruleSqlFragment3739 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleSqlFragment3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlValue_in_entryRuleSqlValue3787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlValue3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleSqlValue3839 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleSqlValue3865 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleSqlValue3891 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSqlValue3917 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSqlValue3943 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleSqlValue3969 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleSqlValue3995 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleSqlValue4021 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleSqlValue4047 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleSqlValue4073 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleSqlValue4099 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleSqlValue4125 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleSqlValue4151 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleSqlValue4177 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleSqlValue4203 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleSqlValue4229 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleSqlValue4255 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleSqlValue4281 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleSqlValue4307 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleSqlValue4333 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleSqlValue4359 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleSqlValue4528 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleSqlValue4554 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleSqlValue4580 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSqlValue4606 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSqlValue4632 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleSqlValue4658 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleSqlValue4684 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleSqlValue4710 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleSqlValue4736 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleSqlValue4762 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleSqlValue4788 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleSqlValue4814 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleSqlValue4840 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleSqlValue4866 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleSqlValue4892 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleSqlValue4918 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleSqlValue4944 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleSqlValue4970 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleSqlValue4996 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleSqlValue5022 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleSqlValue5048 = new BitSet(new long[]{0x000000003EFDF3D2L});
    public static final BitSet FOLLOW_ruleMetaSql_in_entryRuleMetaSql5096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaSql5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMetaSql5143 = new BitSet(new long[]{0x000000003FBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql5163 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql5175 = new BitSet(new long[]{0x000000003FBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql5195 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleMetaSql5222 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_ruleIfSqlCond_in_ruleMetaSql5248 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql5259 = new BitSet(new long[]{0x000000003FBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql5279 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql5291 = new BitSet(new long[]{0x000000003FBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql5311 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleMetaSql5338 = new BitSet(new long[]{0x000000003FBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql5364 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql5376 = new BitSet(new long[]{0x000000003FBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql5396 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql5423 = new BitSet(new long[]{0x000000003FBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql5449 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql5461 = new BitSet(new long[]{0x000000003FBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql5481 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMetaSql5508 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMetaSql5525 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMetaSql5543 = new BitSet(new long[]{0x000000003FBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleMetaSql5594 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMetaSql5610 = new BitSet(new long[]{0x000000003FFBFFF0L});
    public static final BitSet FOLLOW_ruleOrdSql_in_ruleMetaSql5630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSql_in_entryRuleIfSql5667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSql5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSqlFragment_in_ruleIfSql5722 = new BitSet(new long[]{0x000000003FBBFFF2L});
    public static final BitSet FOLLOW_ruleIfSqlFragment_in_entryRuleIfSqlFragment5758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSqlFragment5768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSqlValue_in_ruleIfSqlFragment5814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleIfSqlFragment5832 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_ruleColumn_in_ruleIfSqlFragment5852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIfSqlFragment5871 = new BitSet(new long[]{0x0000000000006180L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleIfSqlFragment5891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleIfSqlFragment5910 = new BitSet(new long[]{0x000000001C006380L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleIfSqlFragment5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleIfSqlFragment5949 = new BitSet(new long[]{0x0000000000680010L});
    public static final BitSet FOLLOW_ruleIfMetaSql_in_ruleIfSqlFragment5969 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleIfSqlFragment5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSqlValue_in_entryRuleIfSqlValue6017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSqlValue6028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleIfSqlValue6069 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleIfSqlValue6095 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIfSqlValue6121 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIfSqlValue6147 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlValue6173 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleIfSqlValue6199 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleIfSqlValue6225 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleIfSqlValue6251 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleIfSqlValue6277 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleIfSqlValue6303 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleIfSqlValue6329 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleIfSqlValue6355 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlValue6381 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleIfSqlValue6407 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleIfSqlValue6433 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleIfSqlValue6459 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleIfSqlValue6485 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleIfSqlValue6511 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleIfSqlValue6537 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleIfSqlValue6563 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleIfSqlValue6725 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleIfSqlValue6751 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIfSqlValue6777 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIfSqlValue6803 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlValue6829 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleIfSqlValue6855 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleIfSqlValue6881 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleIfSqlValue6907 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleIfSqlValue6933 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleIfSqlValue6959 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleIfSqlValue6985 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleIfSqlValue7011 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlValue7037 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleIfSqlValue7063 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleIfSqlValue7089 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleIfSqlValue7115 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleIfSqlValue7141 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleIfSqlValue7167 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleIfSqlValue7193 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleIfSqlValue7219 = new BitSet(new long[]{0x000000003EB9F3F2L});
    public static final BitSet FOLLOW_ruleIfMetaSql_in_entryRuleIfMetaSql7267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfMetaSql7277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfMetaSql7314 = new BitSet(new long[]{0x000000003FBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql7334 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql7346 = new BitSet(new long[]{0x000000003FBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql7366 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleIfMetaSql7393 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_ruleIfSqlCond_in_ruleIfMetaSql7419 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql7430 = new BitSet(new long[]{0x000000003FBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql7450 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql7462 = new BitSet(new long[]{0x000000003FBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql7482 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleIfMetaSql7509 = new BitSet(new long[]{0x000000003FBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql7535 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql7547 = new BitSet(new long[]{0x000000003FBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql7567 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql7594 = new BitSet(new long[]{0x000000003FBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql7620 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql7632 = new BitSet(new long[]{0x000000003FBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql7652 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleIfSqlCond_in_entryRuleIfSqlCond7691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSqlCond7701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlCond7738 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_ruleIfSqlBool_in_ruleIfSqlCond7760 = new BitSet(new long[]{0x00000000C0000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlCond7772 = new BitSet(new long[]{0x00000000C0000012L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleIfSqlCond7793 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleIfSqlCond7813 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlCond7833 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_ruleIfSqlBool_in_ruleIfSqlCond7855 = new BitSet(new long[]{0x00000000C0000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlCond7867 = new BitSet(new long[]{0x00000000C0000012L});
    public static final BitSet FOLLOW_ruleIfSqlBool_in_entryRuleIfSqlBool7906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSqlBool7916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlBool7959 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIfSqlBool7976 = new BitSet(new long[]{0x0000000000006180L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleIfSqlBool7996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlBool8021 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleIfSqlBool8038 = new BitSet(new long[]{0x000000001C006380L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleIfSqlBool8058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlBool8083 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleIfSqlBool8100 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_ruleIfSqlCond_in_ruleIfSqlBool8120 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleIfSqlBool8131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrdSql_in_entryRuleOrdSql8167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrdSql8177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrdSql2_in_ruleOrdSql8222 = new BitSet(new long[]{0x000000003FFBFFF2L});
    public static final BitSet FOLLOW_ruleOrdSql2_in_entryRuleOrdSql28258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrdSql28268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrdSqlValue_in_ruleOrdSql28314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOrdSql28332 = new BitSet(new long[]{0x0000000000006180L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleOrdSql28352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleOrdSql28371 = new BitSet(new long[]{0x000000001C006380L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleOrdSql28391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrdSqlValue_in_entryRuleOrdSqlValue8429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrdSqlValue8440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleOrdSqlValue8481 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleOrdSqlValue8507 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleOrdSqlValue8533 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleOrdSqlValue8559 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleOrdSqlValue8585 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleOrdSqlValue8611 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleOrdSqlValue8637 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleOrdSqlValue8663 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleOrdSqlValue8689 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOrdSqlValue8715 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOrdSqlValue8741 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleOrdSqlValue8767 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleOrdSqlValue8793 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleOrdSqlValue8819 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleOrdSqlValue8845 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleOrdSqlValue8871 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleOrdSqlValue8897 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleOrdSqlValue8923 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleOrdSqlValue8949 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleOrdSqlValue8975 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleOrdSqlValue9001 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleOrdSqlValue9027 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleOrdSqlValue9053 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleOrdSqlValue9236 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleOrdSqlValue9262 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleOrdSqlValue9288 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleOrdSqlValue9314 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleOrdSqlValue9340 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleOrdSqlValue9366 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleOrdSqlValue9392 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleOrdSqlValue9418 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleOrdSqlValue9444 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOrdSqlValue9470 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOrdSqlValue9496 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleOrdSqlValue9522 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleOrdSqlValue9548 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleOrdSqlValue9574 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleOrdSqlValue9600 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleOrdSqlValue9626 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleOrdSqlValue9652 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleOrdSqlValue9678 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleOrdSqlValue9704 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleOrdSqlValue9730 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleOrdSqlValue9756 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleOrdSqlValue9782 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleOrdSqlValue9808 = new BitSet(new long[]{0x000000003FFBF3F2L});
    public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn9856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumn9866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumn9910 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleColumn9930 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleColumn9950 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleColumn9976 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumn9993 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleColumn10016 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumn10035 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleColumn10055 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant10103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant10113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleConstant10157 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleConstant10177 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstant10205 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleConstant10225 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleConstant10251 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstant10268 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleConstant10291 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstant10310 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleConstant10330 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier10378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier10388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleIdentifier10432 = new BitSet(new long[]{0x0000000000006380L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleIdentifier10452 = new BitSet(new long[]{0x0000000000006380L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleIdentifier10472 = new BitSet(new long[]{0x0000000000006380L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleIdentifier10500 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleIdentifier10520 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifier10548 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleIdentifier10568 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIdentifier10588 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleIdentifier10614 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifier10631 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleIdentifier10654 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifier10673 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIdentifier10693 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleMappingRule_in_entryRuleMappingRule10741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingRule10751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingRule10793 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleMappingRule10809 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleMAPPING_TYPE_in_ruleMappingRule10829 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleMappingRule10841 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingRule10857 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleMappingRule10875 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMappingRule10885 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleMappingRule10905 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleMappingRule10916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping10951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping10961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMapping10998 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_ruleMappingItem_in_ruleMapping11020 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMapping11033 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_ruleMappingItem_in_ruleMapping11055 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMapping11069 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleMappingItem_in_entryRuleMappingItem11106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingItem11116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingItem11160 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMappingItem11180 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMappingItem11200 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingItem11216 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMappingItem11234 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleMappingColumn_in_ruleMappingItem11254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingColumn_in_entryRuleMappingColumn11294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingColumn11304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingColumn11348 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleMappingColumn11368 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleMappingColumn11388 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingColumn11406 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMappingColumn11426 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOptionalFeature_in_entryRuleOptionalFeature11472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalFeature11482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleOptionalFeature11524 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOptionalFeature11540 = new BitSet(new long[]{0x007C000000000000L});
    public static final BitSet FOLLOW_ruleOPTION_TYPE_in_ruleOptionalFeature11560 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleOptionalFeature11572 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleOptionalFeature11588 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOptionalFeature11606 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleOptionalFeature11616 = new BitSet(new long[]{0x000000003FFFFFD0L});
    public static final BitSet FOLLOW_ruleFeatureValue_in_ruleOptionalFeature11636 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleOptionalFeature11647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureValue_in_entryRuleFeatureValue11683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureValue11694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleFeatureValue11734 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleFeatureValue11760 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleFeatureValue11786 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleFeatureValue11812 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleFeatureValue11838 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleFeatureValue11864 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureValue11890 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleFeatureValue11916 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleFeatureValue11942 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleFeatureValue11968 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleFeatureValue11994 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleFeatureValue12020 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleFeatureValue12046 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleFeatureValue12072 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleFeatureValue12098 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleFeatureValue12124 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleFeatureValue12150 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleFeatureValue12176 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleFeatureValue12202 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleFeatureValue12228 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleFeatureValue12254 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleFeatureValue12280 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleFeatureValue12306 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleFeatureValue12332 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleFeatureValue12358 = new BitSet(new long[]{0x000000003FFFFFD2L});
    public static final BitSet FOLLOW_46_in_ruleSTATEMEN_TYPE12418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleSTATEMEN_TYPE12435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSTATEMEN_TYPE12452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleMAPPING_TYPE12496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOPTION_TYPE12540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleOPTION_TYPE12557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleOPTION_TYPE12574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleOPTION_TYPE12591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleOPTION_TYPE12608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred1_InternalProcessorDsl1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred2_InternalProcessorDsl4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred3_InternalProcessorDsl6580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred4_InternalProcessorDsl9070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred5_InternalProcessorDsl9971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred6_InternalProcessorDsl10011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred7_InternalProcessorDsl10246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred8_InternalProcessorDsl10286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred9_InternalProcessorDsl10609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred10_InternalProcessorDsl10649 = new BitSet(new long[]{0x0000000000000002L});

}