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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_SEMICOLON", "RULE_REST", "RULE_IDENT_DOT", "RULE_IDENT", "RULE_NUMBER", "RULE_COLON", "RULE_STRING", "RULE_COMMA", "RULE_MINUS", "RULE_PLUS", "RULE_LPAREN", "RULE_RPAREN", "RULE_LBRACE", "RULE_RBRACE", "RULE_QUESTI", "RULE_NOT", "RULE_BAND", "RULE_BOR", "RULE_HASH", "RULE_AT", "RULE_CARET", "RULE_EQUALS", "RULE_LESS_THAN", "RULE_MORE_THAN", "RULE_PERCENT", "RULE_AND", "RULE_OR", "RULE_ESC_CHAR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'resolve references'", "'database online'", "'database url'", "'database username'", "'database password'", "'database schema'", "'database driver'", "'pojo'", "'col'", "'ident'", "'const'", "'out'", "'table'", "'dbcol'", "'prefix'", "'QRY'", "'CRUD'", "'CALL'", "'OUT'", "'OPT'", "'LOPT'", "'IOPT'", "'SOPT'", "'BOPT'"
    };
    public static final int RULE_SEMICOLON=5;
    public static final int RULE_OR=31;
    public static final int RULE_PERCENT=29;
    public static final int RULE_AND=30;
    public static final int EOF=-1;
    public static final int RULE_NOT=20;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
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
    public static final int RULE_BAND=21;
    public static final int T__43=43;
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
    public static final int RULE_SL_COMMENT=34;
    public static final int RULE_QUESTI=19;
    public static final int RULE_ML_COMMENT=33;
    public static final int RULE_COLON=10;
    public static final int RULE_MINUS=13;
    public static final int RULE_STRING=11;
    public static final int T__35=35;
    public static final int RULE_ESC_CHAR=32;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:77:1: ruleArtifacts returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* ) | ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* ) | ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* ) | ( ( (lv_pojos_7_0= rulePojoDefinition ) ) (this_WS_8= RULE_WS )* ) | ( ( (lv_usages_9_0= rulePojoUsage ) ) (this_WS_10= RULE_WS )* ) | ( ( (lv_properties_11_0= ruleProperty ) ) (this_WS_12= RULE_WS )* ) | ( ( (lv_tables_13_0= ruleTableDefinition ) ) (this_WS_14= RULE_WS )* ) | ( ( (lv_tableUsages_15_0= ruleTableUsage ) ) (this_WS_16= RULE_WS )* ) )+ ) ;
    public final EObject ruleArtifacts() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        Token this_WS_6=null;
        Token this_WS_8=null;
        Token this_WS_10=null;
        Token this_WS_12=null;
        Token this_WS_14=null;
        Token this_WS_16=null;
        EObject lv_features_1_0 = null;

        EObject lv_statements_3_0 = null;

        EObject lv_mappings_5_0 = null;

        EObject lv_pojos_7_0 = null;

        EObject lv_usages_9_0 = null;

        EObject lv_properties_11_0 = null;

        EObject lv_tables_13_0 = null;

        EObject lv_tableUsages_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:80:28: ( ( (this_WS_0= RULE_WS )* ( ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* ) | ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* ) | ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* ) | ( ( (lv_pojos_7_0= rulePojoDefinition ) ) (this_WS_8= RULE_WS )* ) | ( ( (lv_usages_9_0= rulePojoUsage ) ) (this_WS_10= RULE_WS )* ) | ( ( (lv_properties_11_0= ruleProperty ) ) (this_WS_12= RULE_WS )* ) | ( ( (lv_tables_13_0= ruleTableDefinition ) ) (this_WS_14= RULE_WS )* ) | ( ( (lv_tableUsages_15_0= ruleTableUsage ) ) (this_WS_16= RULE_WS )* ) )+ ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:81:1: ( (this_WS_0= RULE_WS )* ( ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* ) | ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* ) | ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* ) | ( ( (lv_pojos_7_0= rulePojoDefinition ) ) (this_WS_8= RULE_WS )* ) | ( ( (lv_usages_9_0= rulePojoUsage ) ) (this_WS_10= RULE_WS )* ) | ( ( (lv_properties_11_0= ruleProperty ) ) (this_WS_12= RULE_WS )* ) | ( ( (lv_tables_13_0= ruleTableDefinition ) ) (this_WS_14= RULE_WS )* ) | ( ( (lv_tableUsages_15_0= ruleTableUsage ) ) (this_WS_16= RULE_WS )* ) )+ )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:81:1: ( (this_WS_0= RULE_WS )* ( ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* ) | ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* ) | ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* ) | ( ( (lv_pojos_7_0= rulePojoDefinition ) ) (this_WS_8= RULE_WS )* ) | ( ( (lv_usages_9_0= rulePojoUsage ) ) (this_WS_10= RULE_WS )* ) | ( ( (lv_properties_11_0= ruleProperty ) ) (this_WS_12= RULE_WS )* ) | ( ( (lv_tables_13_0= ruleTableDefinition ) ) (this_WS_14= RULE_WS )* ) | ( ( (lv_tableUsages_15_0= ruleTableUsage ) ) (this_WS_16= RULE_WS )* ) )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:81:2: (this_WS_0= RULE_WS )* ( ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* ) | ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* ) | ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* ) | ( ( (lv_pojos_7_0= rulePojoDefinition ) ) (this_WS_8= RULE_WS )* ) | ( ( (lv_usages_9_0= rulePojoUsage ) ) (this_WS_10= RULE_WS )* ) | ( ( (lv_properties_11_0= ruleProperty ) ) (this_WS_12= RULE_WS )* ) | ( ( (lv_tables_13_0= ruleTableDefinition ) ) (this_WS_14= RULE_WS )* ) | ( ( (lv_tableUsages_15_0= ruleTableUsage ) ) (this_WS_16= RULE_WS )* ) )+
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:85:3: ( ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* ) | ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* ) | ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* ) | ( ( (lv_pojos_7_0= rulePojoDefinition ) ) (this_WS_8= RULE_WS )* ) | ( ( (lv_usages_9_0= rulePojoUsage ) ) (this_WS_10= RULE_WS )* ) | ( ( (lv_properties_11_0= ruleProperty ) ) (this_WS_12= RULE_WS )* ) | ( ( (lv_tables_13_0= ruleTableDefinition ) ) (this_WS_14= RULE_WS )* ) | ( ( (lv_tableUsages_15_0= ruleTableUsage ) ) (this_WS_16= RULE_WS )* ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=9;
                alt10 = dfa10.predict(input);
                switch (alt10) {
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
            	case 7 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:223:6: ( ( (lv_tables_13_0= ruleTableDefinition ) ) (this_WS_14= RULE_WS )* )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:223:6: ( ( (lv_tables_13_0= ruleTableDefinition ) ) (this_WS_14= RULE_WS )* )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:223:7: ( (lv_tables_13_0= ruleTableDefinition ) ) (this_WS_14= RULE_WS )*
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:223:7: ( (lv_tables_13_0= ruleTableDefinition ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:224:1: (lv_tables_13_0= ruleTableDefinition )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:224:1: (lv_tables_13_0= ruleTableDefinition )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:225:3: lv_tables_13_0= ruleTableDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArtifactsAccess().getTablesTableDefinitionParserRuleCall_1_6_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTableDefinition_in_ruleArtifacts398);
            	    lv_tables_13_0=ruleTableDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArtifactsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"tables",
            	              		lv_tables_13_0, 
            	              		"TableDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:241:2: (this_WS_14= RULE_WS )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==RULE_WS) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:241:3: this_WS_14= RULE_WS
            	    	    {
            	    	    this_WS_14=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleArtifacts410); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_14, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_6_1()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:246:6: ( ( (lv_tableUsages_15_0= ruleTableUsage ) ) (this_WS_16= RULE_WS )* )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:246:6: ( ( (lv_tableUsages_15_0= ruleTableUsage ) ) (this_WS_16= RULE_WS )* )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:246:7: ( (lv_tableUsages_15_0= ruleTableUsage ) ) (this_WS_16= RULE_WS )*
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:246:7: ( (lv_tableUsages_15_0= ruleTableUsage ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:247:1: (lv_tableUsages_15_0= ruleTableUsage )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:247:1: (lv_tableUsages_15_0= ruleTableUsage )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:248:3: lv_tableUsages_15_0= ruleTableUsage
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArtifactsAccess().getTableUsagesTableUsageParserRuleCall_1_7_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTableUsage_in_ruleArtifacts440);
            	    lv_tableUsages_15_0=ruleTableUsage();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArtifactsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"tableUsages",
            	              		lv_tableUsages_15_0, 
            	              		"TableUsage");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:264:2: (this_WS_16= RULE_WS )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==RULE_WS) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:264:3: this_WS_16= RULE_WS
            	    	    {
            	    	    this_WS_16=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleArtifacts452); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_16, grammarAccess.getArtifactsAccess().getWSTerminalRuleCall_1_7_1()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);


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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:276:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:277:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:278:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty492);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty502); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:285:1: ruleProperty returns [EObject current=null] : ( ( ( (lv_name_0_0= 'resolve references' ) ) | ( (lv_name_1_0= 'database online' ) ) | ( ( (lv_name_2_0= 'database url' ) ) (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) ) | ( ( (lv_name_5_0= 'database username' ) ) (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) ) | ( ( (lv_name_8_0= 'database password' ) ) (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) ) | ( ( (lv_name_11_0= 'database schema' ) ) (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) ) | ( ( (lv_name_14_0= 'database driver' ) ) (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) ) ) this_SEMICOLON_17= RULE_SEMICOLON ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token this_WS_3=null;
        Token lv_name_5_0=null;
        Token this_WS_6=null;
        Token lv_name_8_0=null;
        Token this_WS_9=null;
        Token lv_name_11_0=null;
        Token this_WS_12=null;
        Token lv_name_14_0=null;
        Token this_WS_15=null;
        Token this_SEMICOLON_17=null;
        AntlrDatatypeRuleToken lv_dbUrl_4_0 = null;

        AntlrDatatypeRuleToken lv_dbUsername_7_0 = null;

        AntlrDatatypeRuleToken lv_dbPassword_10_0 = null;

        AntlrDatatypeRuleToken lv_dbSchema_13_0 = null;

        AntlrDatatypeRuleToken lv_dbDriver_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:288:28: ( ( ( ( (lv_name_0_0= 'resolve references' ) ) | ( (lv_name_1_0= 'database online' ) ) | ( ( (lv_name_2_0= 'database url' ) ) (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) ) | ( ( (lv_name_5_0= 'database username' ) ) (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) ) | ( ( (lv_name_8_0= 'database password' ) ) (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) ) | ( ( (lv_name_11_0= 'database schema' ) ) (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) ) | ( ( (lv_name_14_0= 'database driver' ) ) (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) ) ) this_SEMICOLON_17= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:1: ( ( ( (lv_name_0_0= 'resolve references' ) ) | ( (lv_name_1_0= 'database online' ) ) | ( ( (lv_name_2_0= 'database url' ) ) (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) ) | ( ( (lv_name_5_0= 'database username' ) ) (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) ) | ( ( (lv_name_8_0= 'database password' ) ) (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) ) | ( ( (lv_name_11_0= 'database schema' ) ) (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) ) | ( ( (lv_name_14_0= 'database driver' ) ) (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) ) ) this_SEMICOLON_17= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:1: ( ( ( (lv_name_0_0= 'resolve references' ) ) | ( (lv_name_1_0= 'database online' ) ) | ( ( (lv_name_2_0= 'database url' ) ) (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) ) | ( ( (lv_name_5_0= 'database username' ) ) (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) ) | ( ( (lv_name_8_0= 'database password' ) ) (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) ) | ( ( (lv_name_11_0= 'database schema' ) ) (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) ) | ( ( (lv_name_14_0= 'database driver' ) ) (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) ) ) this_SEMICOLON_17= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:2: ( ( (lv_name_0_0= 'resolve references' ) ) | ( (lv_name_1_0= 'database online' ) ) | ( ( (lv_name_2_0= 'database url' ) ) (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) ) | ( ( (lv_name_5_0= 'database username' ) ) (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) ) | ( ( (lv_name_8_0= 'database password' ) ) (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) ) | ( ( (lv_name_11_0= 'database schema' ) ) (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) ) | ( ( (lv_name_14_0= 'database driver' ) ) (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) ) ) this_SEMICOLON_17= RULE_SEMICOLON
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:2: ( ( (lv_name_0_0= 'resolve references' ) ) | ( (lv_name_1_0= 'database online' ) ) | ( ( (lv_name_2_0= 'database url' ) ) (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) ) | ( ( (lv_name_5_0= 'database username' ) ) (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) ) | ( ( (lv_name_8_0= 'database password' ) ) (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) ) | ( ( (lv_name_11_0= 'database schema' ) ) (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) ) | ( ( (lv_name_14_0= 'database driver' ) ) (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) ) )
            int alt16=7;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt16=1;
                }
                break;
            case 36:
                {
                alt16=2;
                }
                break;
            case 37:
                {
                alt16=3;
                }
                break;
            case 38:
                {
                alt16=4;
                }
                break;
            case 39:
                {
                alt16=5;
                }
                break;
            case 40:
                {
                alt16=6;
                }
                break;
            case 41:
                {
                alt16=7;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:3: ( (lv_name_0_0= 'resolve references' ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:3: ( (lv_name_0_0= 'resolve references' ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:290:1: (lv_name_0_0= 'resolve references' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:290:1: (lv_name_0_0= 'resolve references' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:291:3: lv_name_0_0= 'resolve references'
                    {
                    lv_name_0_0=(Token)match(input,35,FOLLOW_35_in_ruleProperty546); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccess().getNameResolveReferencesKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_0, "resolve references");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:305:6: ( (lv_name_1_0= 'database online' ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:305:6: ( (lv_name_1_0= 'database online' ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:306:1: (lv_name_1_0= 'database online' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:306:1: (lv_name_1_0= 'database online' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:307:3: lv_name_1_0= 'database online'
                    {
                    lv_name_1_0=(Token)match(input,36,FOLLOW_36_in_ruleProperty583); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_0, grammarAccess.getPropertyAccess().getNameDatabaseOnlineKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_0, "database online");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:321:6: ( ( (lv_name_2_0= 'database url' ) ) (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:321:6: ( ( (lv_name_2_0= 'database url' ) ) (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:321:7: ( (lv_name_2_0= 'database url' ) ) (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:321:7: ( (lv_name_2_0= 'database url' ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:322:1: (lv_name_2_0= 'database url' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:322:1: (lv_name_2_0= 'database url' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:323:3: lv_name_2_0= 'database url'
                    {
                    lv_name_2_0=(Token)match(input,37,FOLLOW_37_in_ruleProperty621); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_2_0, grammarAccess.getPropertyAccess().getNameDatabaseUrlKeyword_0_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_2_0, "database url");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:336:2: (this_WS_3= RULE_WS )+
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
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:336:3: this_WS_3= RULE_WS
                    	    {
                    	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty646); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_3, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_2_1()); 
                    	          
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:340:3: ( (lv_dbUrl_4_0= rulePropertyValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:341:1: (lv_dbUrl_4_0= rulePropertyValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:341:1: (lv_dbUrl_4_0= rulePropertyValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:342:3: lv_dbUrl_4_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getDbUrlPropertyValueParserRuleCall_0_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty668);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:359:6: ( ( (lv_name_5_0= 'database username' ) ) (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:359:6: ( ( (lv_name_5_0= 'database username' ) ) (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:359:7: ( (lv_name_5_0= 'database username' ) ) (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:359:7: ( (lv_name_5_0= 'database username' ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:360:1: (lv_name_5_0= 'database username' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:360:1: (lv_name_5_0= 'database username' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:361:3: lv_name_5_0= 'database username'
                    {
                    lv_name_5_0=(Token)match(input,38,FOLLOW_38_in_ruleProperty694); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_5_0, grammarAccess.getPropertyAccess().getNameDatabaseUsernameKeyword_0_3_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_5_0, "database username");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:374:2: (this_WS_6= RULE_WS )+
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
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:374:3: this_WS_6= RULE_WS
                    	    {
                    	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty719); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_6, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_3_1()); 
                    	          
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:378:3: ( (lv_dbUsername_7_0= rulePropertyValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:379:1: (lv_dbUsername_7_0= rulePropertyValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:379:1: (lv_dbUsername_7_0= rulePropertyValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:380:3: lv_dbUsername_7_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getDbUsernamePropertyValueParserRuleCall_0_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty741);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:397:6: ( ( (lv_name_8_0= 'database password' ) ) (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:397:6: ( ( (lv_name_8_0= 'database password' ) ) (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:397:7: ( (lv_name_8_0= 'database password' ) ) (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:397:7: ( (lv_name_8_0= 'database password' ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:398:1: (lv_name_8_0= 'database password' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:398:1: (lv_name_8_0= 'database password' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:399:3: lv_name_8_0= 'database password'
                    {
                    lv_name_8_0=(Token)match(input,39,FOLLOW_39_in_ruleProperty767); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_8_0, grammarAccess.getPropertyAccess().getNameDatabasePasswordKeyword_0_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_8_0, "database password");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:412:2: (this_WS_9= RULE_WS )+
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
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:412:3: this_WS_9= RULE_WS
                    	    {
                    	    this_WS_9=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty792); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_9, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_4_1()); 
                    	          
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:416:3: ( (lv_dbPassword_10_0= rulePropertyValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:417:1: (lv_dbPassword_10_0= rulePropertyValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:417:1: (lv_dbPassword_10_0= rulePropertyValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:418:3: lv_dbPassword_10_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getDbPasswordPropertyValueParserRuleCall_0_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty814);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:435:6: ( ( (lv_name_11_0= 'database schema' ) ) (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:435:6: ( ( (lv_name_11_0= 'database schema' ) ) (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:435:7: ( (lv_name_11_0= 'database schema' ) ) (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:435:7: ( (lv_name_11_0= 'database schema' ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:436:1: (lv_name_11_0= 'database schema' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:436:1: (lv_name_11_0= 'database schema' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:437:3: lv_name_11_0= 'database schema'
                    {
                    lv_name_11_0=(Token)match(input,40,FOLLOW_40_in_ruleProperty840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_11_0, grammarAccess.getPropertyAccess().getNameDatabaseSchemaKeyword_0_5_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_11_0, "database schema");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:450:2: (this_WS_12= RULE_WS )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_WS) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:450:3: this_WS_12= RULE_WS
                    	    {
                    	    this_WS_12=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty865); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_12, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_5_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:454:3: ( (lv_dbSchema_13_0= rulePropertyValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:455:1: (lv_dbSchema_13_0= rulePropertyValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:455:1: (lv_dbSchema_13_0= rulePropertyValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:456:3: lv_dbSchema_13_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getDbSchemaPropertyValueParserRuleCall_0_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty887);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:473:6: ( ( (lv_name_14_0= 'database driver' ) ) (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:473:6: ( ( (lv_name_14_0= 'database driver' ) ) (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:473:7: ( (lv_name_14_0= 'database driver' ) ) (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:473:7: ( (lv_name_14_0= 'database driver' ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:474:1: (lv_name_14_0= 'database driver' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:474:1: (lv_name_14_0= 'database driver' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:475:3: lv_name_14_0= 'database driver'
                    {
                    lv_name_14_0=(Token)match(input,41,FOLLOW_41_in_ruleProperty913); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_14_0, grammarAccess.getPropertyAccess().getNameDatabaseDriverKeyword_0_6_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_14_0, "database driver");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:488:2: (this_WS_15= RULE_WS )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_WS) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:488:3: this_WS_15= RULE_WS
                    	    {
                    	    this_WS_15=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty938); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_15, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_6_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:492:3: ( (lv_dbDriver_16_0= rulePropertyValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:493:1: (lv_dbDriver_16_0= rulePropertyValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:493:1: (lv_dbDriver_16_0= rulePropertyValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:494:3: lv_dbDriver_16_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getDbDriverPropertyValueParserRuleCall_0_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty960);
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

            this_SEMICOLON_17=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleProperty973); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:522:1: entryRulePropertyValue returns [String current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final String entryRulePropertyValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:523:2: (iv_rulePropertyValue= rulePropertyValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:524:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValueRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValue_in_entryRulePropertyValue1009);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValue1020); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:531:1: rulePropertyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN | this_PERCENT_23= RULE_PERCENT | this_AND_24= RULE_AND | this_OR_25= RULE_OR | this_ESC_CHAR_26= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )* ) ;
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
        Token this_PERCENT_23=null;
        Token this_AND_24=null;
        Token this_OR_25=null;
        Token this_ESC_CHAR_26=null;
        Token this_REST_27=null;
        Token this_IDENT_DOT_28=null;
        Token this_IDENT_29=null;
        Token this_NUMBER_30=null;
        Token this_WS_31=null;
        Token this_COLON_32=null;
        Token this_STRING_33=null;
        Token this_COMMA_34=null;
        Token this_MINUS_35=null;
        Token this_PLUS_36=null;
        Token this_LPAREN_37=null;
        Token this_RPAREN_38=null;
        Token this_LBRACE_39=null;
        Token this_RBRACE_40=null;
        Token this_QUESTI_41=null;
        Token this_NOT_42=null;
        Token this_BAND_43=null;
        Token this_BOR_44=null;
        Token this_HASH_45=null;
        Token this_AT_46=null;
        Token this_CARET_47=null;
        Token this_EQUALS_48=null;
        Token this_LESS_THAN_49=null;
        Token this_MORE_THAN_50=null;
        Token this_PERCENT_51=null;
        Token this_AND_52=null;
        Token this_OR_53=null;
        Token this_ESC_CHAR_54=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:534:28: ( ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN | this_PERCENT_23= RULE_PERCENT | this_AND_24= RULE_AND | this_OR_25= RULE_OR | this_ESC_CHAR_26= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:535:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN | this_PERCENT_23= RULE_PERCENT | this_AND_24= RULE_AND | this_OR_25= RULE_OR | this_ESC_CHAR_26= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:535:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN | this_PERCENT_23= RULE_PERCENT | this_AND_24= RULE_AND | this_OR_25= RULE_OR | this_ESC_CHAR_26= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:535:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN | this_PERCENT_23= RULE_PERCENT | this_AND_24= RULE_AND | this_OR_25= RULE_OR | this_ESC_CHAR_26= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:535:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN | this_PERCENT_23= RULE_PERCENT | this_AND_24= RULE_AND | this_OR_25= RULE_OR | this_ESC_CHAR_26= RULE_ESC_CHAR )
            int alt17=27;
            switch ( input.LA(1) ) {
            case RULE_REST:
                {
                alt17=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt17=2;
                }
                break;
            case RULE_IDENT:
                {
                alt17=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt17=4;
                }
                break;
            case RULE_COLON:
                {
                alt17=5;
                }
                break;
            case RULE_STRING:
                {
                alt17=6;
                }
                break;
            case RULE_COMMA:
                {
                alt17=7;
                }
                break;
            case RULE_MINUS:
                {
                alt17=8;
                }
                break;
            case RULE_PLUS:
                {
                alt17=9;
                }
                break;
            case RULE_LPAREN:
                {
                alt17=10;
                }
                break;
            case RULE_RPAREN:
                {
                alt17=11;
                }
                break;
            case RULE_LBRACE:
                {
                alt17=12;
                }
                break;
            case RULE_RBRACE:
                {
                alt17=13;
                }
                break;
            case RULE_QUESTI:
                {
                alt17=14;
                }
                break;
            case RULE_NOT:
                {
                alt17=15;
                }
                break;
            case RULE_BAND:
                {
                alt17=16;
                }
                break;
            case RULE_BOR:
                {
                alt17=17;
                }
                break;
            case RULE_HASH:
                {
                alt17=18;
                }
                break;
            case RULE_AT:
                {
                alt17=19;
                }
                break;
            case RULE_CARET:
                {
                alt17=20;
                }
                break;
            case RULE_EQUALS:
                {
                alt17=21;
                }
                break;
            case RULE_LESS_THAN:
                {
                alt17=22;
                }
                break;
            case RULE_MORE_THAN:
                {
                alt17=23;
                }
                break;
            case RULE_PERCENT:
                {
                alt17=24;
                }
                break;
            case RULE_AND:
                {
                alt17=25;
                }
                break;
            case RULE_OR:
                {
                alt17=26;
                }
                break;
            case RULE_ESC_CHAR:
                {
                alt17=27;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:535:7: this_REST_0= RULE_REST
                    {
                    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_rulePropertyValue1061); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REST_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REST_0, grammarAccess.getPropertyValueAccess().getRESTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:543:10: this_IDENT_DOT_1= RULE_IDENT_DOT
                    {
                    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_rulePropertyValue1087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_DOT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_DOT_1, grammarAccess.getPropertyValueAccess().getIDENT_DOTTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:551:10: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePropertyValue1113); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_2, grammarAccess.getPropertyValueAccess().getIDENTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:559:10: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rulePropertyValue1139); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_3, grammarAccess.getPropertyValueAccess().getNUMBERTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:567:10: this_COLON_4= RULE_COLON
                    {
                    this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulePropertyValue1165); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COLON_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_4, grammarAccess.getPropertyValueAccess().getCOLONTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:575:10: this_STRING_5= RULE_STRING
                    {
                    this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertyValue1191); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_5, grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:583:10: this_COMMA_6= RULE_COMMA
                    {
                    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulePropertyValue1217); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_6, grammarAccess.getPropertyValueAccess().getCOMMATerminalRuleCall_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:591:10: this_MINUS_7= RULE_MINUS
                    {
                    this_MINUS_7=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_rulePropertyValue1243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_7, grammarAccess.getPropertyValueAccess().getMINUSTerminalRuleCall_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:599:10: this_PLUS_8= RULE_PLUS
                    {
                    this_PLUS_8=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rulePropertyValue1269); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_8, grammarAccess.getPropertyValueAccess().getPLUSTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:607:10: this_LPAREN_9= RULE_LPAREN
                    {
                    this_LPAREN_9=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rulePropertyValue1295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LPAREN_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_9, grammarAccess.getPropertyValueAccess().getLPARENTerminalRuleCall_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:615:10: this_RPAREN_10= RULE_RPAREN
                    {
                    this_RPAREN_10=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rulePropertyValue1321); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RPAREN_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_10, grammarAccess.getPropertyValueAccess().getRPARENTerminalRuleCall_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:623:10: this_LBRACE_11= RULE_LBRACE
                    {
                    this_LBRACE_11=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rulePropertyValue1347); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LBRACE_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACE_11, grammarAccess.getPropertyValueAccess().getLBRACETerminalRuleCall_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:631:10: this_RBRACE_12= RULE_RBRACE
                    {
                    this_RBRACE_12=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rulePropertyValue1373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RBRACE_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RBRACE_12, grammarAccess.getPropertyValueAccess().getRBRACETerminalRuleCall_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:639:10: this_QUESTI_13= RULE_QUESTI
                    {
                    this_QUESTI_13=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_rulePropertyValue1399); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUESTI_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUESTI_13, grammarAccess.getPropertyValueAccess().getQUESTITerminalRuleCall_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:647:10: this_NOT_14= RULE_NOT
                    {
                    this_NOT_14=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_rulePropertyValue1425); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_14, grammarAccess.getPropertyValueAccess().getNOTTerminalRuleCall_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:655:10: this_BAND_15= RULE_BAND
                    {
                    this_BAND_15=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_rulePropertyValue1451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BAND_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BAND_15, grammarAccess.getPropertyValueAccess().getBANDTerminalRuleCall_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:663:10: this_BOR_16= RULE_BOR
                    {
                    this_BOR_16=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_rulePropertyValue1477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOR_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_16, grammarAccess.getPropertyValueAccess().getBORTerminalRuleCall_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:671:10: this_HASH_17= RULE_HASH
                    {
                    this_HASH_17=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rulePropertyValue1503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASH_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASH_17, grammarAccess.getPropertyValueAccess().getHASHTerminalRuleCall_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:679:10: this_AT_18= RULE_AT
                    {
                    this_AT_18=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_rulePropertyValue1529); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AT_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_18, grammarAccess.getPropertyValueAccess().getATTerminalRuleCall_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:687:10: this_CARET_19= RULE_CARET
                    {
                    this_CARET_19=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_rulePropertyValue1555); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CARET_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_19, grammarAccess.getPropertyValueAccess().getCARETTerminalRuleCall_0_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:695:10: this_EQUALS_20= RULE_EQUALS
                    {
                    this_EQUALS_20=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rulePropertyValue1581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUALS_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_20, grammarAccess.getPropertyValueAccess().getEQUALSTerminalRuleCall_0_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:703:10: this_LESS_THAN_21= RULE_LESS_THAN
                    {
                    this_LESS_THAN_21=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_rulePropertyValue1607); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LESS_THAN_21);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LESS_THAN_21, grammarAccess.getPropertyValueAccess().getLESS_THANTerminalRuleCall_0_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:711:10: this_MORE_THAN_22= RULE_MORE_THAN
                    {
                    this_MORE_THAN_22=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_rulePropertyValue1633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MORE_THAN_22);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MORE_THAN_22, grammarAccess.getPropertyValueAccess().getMORE_THANTerminalRuleCall_0_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:719:10: this_PERCENT_23= RULE_PERCENT
                    {
                    this_PERCENT_23=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_rulePropertyValue1659); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PERCENT_23);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PERCENT_23, grammarAccess.getPropertyValueAccess().getPERCENTTerminalRuleCall_0_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:727:10: this_AND_24= RULE_AND
                    {
                    this_AND_24=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_rulePropertyValue1685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AND_24);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AND_24, grammarAccess.getPropertyValueAccess().getANDTerminalRuleCall_0_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:735:10: this_OR_25= RULE_OR
                    {
                    this_OR_25=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_rulePropertyValue1711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_OR_25);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OR_25, grammarAccess.getPropertyValueAccess().getORTerminalRuleCall_0_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:743:10: this_ESC_CHAR_26= RULE_ESC_CHAR
                    {
                    this_ESC_CHAR_26=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_rulePropertyValue1737); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESC_CHAR_26);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESC_CHAR_26, grammarAccess.getPropertyValueAccess().getESC_CHARTerminalRuleCall_0_26()); 
                          
                    }

                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:750:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:750:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:777:23: (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR )
            	    int alt18=28;
            	    switch ( input.LA(1) ) {
            	    case RULE_REST:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case RULE_IDENT_DOT:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case RULE_IDENT:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    case RULE_NUMBER:
            	        {
            	        alt18=4;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt18=5;
            	        }
            	        break;
            	    case RULE_COLON:
            	        {
            	        alt18=6;
            	        }
            	        break;
            	    case RULE_STRING:
            	        {
            	        alt18=7;
            	        }
            	        break;
            	    case RULE_COMMA:
            	        {
            	        alt18=8;
            	        }
            	        break;
            	    case RULE_MINUS:
            	        {
            	        alt18=9;
            	        }
            	        break;
            	    case RULE_PLUS:
            	        {
            	        alt18=10;
            	        }
            	        break;
            	    case RULE_LPAREN:
            	        {
            	        alt18=11;
            	        }
            	        break;
            	    case RULE_RPAREN:
            	        {
            	        alt18=12;
            	        }
            	        break;
            	    case RULE_LBRACE:
            	        {
            	        alt18=13;
            	        }
            	        break;
            	    case RULE_RBRACE:
            	        {
            	        alt18=14;
            	        }
            	        break;
            	    case RULE_QUESTI:
            	        {
            	        alt18=15;
            	        }
            	        break;
            	    case RULE_NOT:
            	        {
            	        alt18=16;
            	        }
            	        break;
            	    case RULE_BAND:
            	        {
            	        alt18=17;
            	        }
            	        break;
            	    case RULE_BOR:
            	        {
            	        alt18=18;
            	        }
            	        break;
            	    case RULE_HASH:
            	        {
            	        alt18=19;
            	        }
            	        break;
            	    case RULE_AT:
            	        {
            	        alt18=20;
            	        }
            	        break;
            	    case RULE_CARET:
            	        {
            	        alt18=21;
            	        }
            	        break;
            	    case RULE_EQUALS:
            	        {
            	        alt18=22;
            	        }
            	        break;
            	    case RULE_LESS_THAN:
            	        {
            	        alt18=23;
            	        }
            	        break;
            	    case RULE_MORE_THAN:
            	        {
            	        alt18=24;
            	        }
            	        break;
            	    case RULE_PERCENT:
            	        {
            	        alt18=25;
            	        }
            	        break;
            	    case RULE_AND:
            	        {
            	        alt18=26;
            	        }
            	        break;
            	    case RULE_OR:
            	        {
            	        alt18=27;
            	        }
            	        break;
            	    case RULE_ESC_CHAR:
            	        {
            	        alt18=28;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:777:28: this_REST_27= RULE_REST
            	            {
            	            this_REST_27=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_rulePropertyValue1955); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REST_27);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REST_27, grammarAccess.getPropertyValueAccess().getRESTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:785:10: this_IDENT_DOT_28= RULE_IDENT_DOT
            	            {
            	            this_IDENT_DOT_28=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_rulePropertyValue1981); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_DOT_28);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_DOT_28, grammarAccess.getPropertyValueAccess().getIDENT_DOTTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:793:10: this_IDENT_29= RULE_IDENT
            	            {
            	            this_IDENT_29=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePropertyValue2007); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_29);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_29, grammarAccess.getPropertyValueAccess().getIDENTTerminalRuleCall_1_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:801:10: this_NUMBER_30= RULE_NUMBER
            	            {
            	            this_NUMBER_30=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rulePropertyValue2033); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NUMBER_30);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NUMBER_30, grammarAccess.getPropertyValueAccess().getNUMBERTerminalRuleCall_1_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:809:10: this_WS_31= RULE_WS
            	            {
            	            this_WS_31=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulePropertyValue2059); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_WS_31);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_WS_31, grammarAccess.getPropertyValueAccess().getWSTerminalRuleCall_1_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:817:10: this_COLON_32= RULE_COLON
            	            {
            	            this_COLON_32=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulePropertyValue2085); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COLON_32);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COLON_32, grammarAccess.getPropertyValueAccess().getCOLONTerminalRuleCall_1_0_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:825:10: this_STRING_33= RULE_STRING
            	            {
            	            this_STRING_33=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertyValue2111); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_STRING_33);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_STRING_33, grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_1_0_6()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:833:10: this_COMMA_34= RULE_COMMA
            	            {
            	            this_COMMA_34=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulePropertyValue2137); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COMMA_34);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COMMA_34, grammarAccess.getPropertyValueAccess().getCOMMATerminalRuleCall_1_0_7()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:841:10: this_MINUS_35= RULE_MINUS
            	            {
            	            this_MINUS_35=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_rulePropertyValue2163); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MINUS_35);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MINUS_35, grammarAccess.getPropertyValueAccess().getMINUSTerminalRuleCall_1_0_8()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:849:10: this_PLUS_36= RULE_PLUS
            	            {
            	            this_PLUS_36=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rulePropertyValue2189); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PLUS_36);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PLUS_36, grammarAccess.getPropertyValueAccess().getPLUSTerminalRuleCall_1_0_9()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:857:10: this_LPAREN_37= RULE_LPAREN
            	            {
            	            this_LPAREN_37=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rulePropertyValue2215); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LPAREN_37);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LPAREN_37, grammarAccess.getPropertyValueAccess().getLPARENTerminalRuleCall_1_0_10()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:865:10: this_RPAREN_38= RULE_RPAREN
            	            {
            	            this_RPAREN_38=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rulePropertyValue2241); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RPAREN_38);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RPAREN_38, grammarAccess.getPropertyValueAccess().getRPARENTerminalRuleCall_1_0_11()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 13 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:873:10: this_LBRACE_39= RULE_LBRACE
            	            {
            	            this_LBRACE_39=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rulePropertyValue2267); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LBRACE_39);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LBRACE_39, grammarAccess.getPropertyValueAccess().getLBRACETerminalRuleCall_1_0_12()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 14 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:881:10: this_RBRACE_40= RULE_RBRACE
            	            {
            	            this_RBRACE_40=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rulePropertyValue2293); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RBRACE_40);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RBRACE_40, grammarAccess.getPropertyValueAccess().getRBRACETerminalRuleCall_1_0_13()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 15 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:889:10: this_QUESTI_41= RULE_QUESTI
            	            {
            	            this_QUESTI_41=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_rulePropertyValue2319); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_QUESTI_41);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_QUESTI_41, grammarAccess.getPropertyValueAccess().getQUESTITerminalRuleCall_1_0_14()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 16 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:897:10: this_NOT_42= RULE_NOT
            	            {
            	            this_NOT_42=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_rulePropertyValue2345); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NOT_42);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NOT_42, grammarAccess.getPropertyValueAccess().getNOTTerminalRuleCall_1_0_15()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 17 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:905:10: this_BAND_43= RULE_BAND
            	            {
            	            this_BAND_43=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_rulePropertyValue2371); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BAND_43);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BAND_43, grammarAccess.getPropertyValueAccess().getBANDTerminalRuleCall_1_0_16()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 18 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:913:10: this_BOR_44= RULE_BOR
            	            {
            	            this_BOR_44=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_rulePropertyValue2397); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BOR_44);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BOR_44, grammarAccess.getPropertyValueAccess().getBORTerminalRuleCall_1_0_17()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 19 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:921:10: this_HASH_45= RULE_HASH
            	            {
            	            this_HASH_45=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rulePropertyValue2423); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_HASH_45);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_HASH_45, grammarAccess.getPropertyValueAccess().getHASHTerminalRuleCall_1_0_18()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 20 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:929:10: this_AT_46= RULE_AT
            	            {
            	            this_AT_46=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_rulePropertyValue2449); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AT_46);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AT_46, grammarAccess.getPropertyValueAccess().getATTerminalRuleCall_1_0_19()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 21 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:937:10: this_CARET_47= RULE_CARET
            	            {
            	            this_CARET_47=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_rulePropertyValue2475); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_CARET_47);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_CARET_47, grammarAccess.getPropertyValueAccess().getCARETTerminalRuleCall_1_0_20()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 22 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:945:10: this_EQUALS_48= RULE_EQUALS
            	            {
            	            this_EQUALS_48=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rulePropertyValue2501); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_EQUALS_48);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_EQUALS_48, grammarAccess.getPropertyValueAccess().getEQUALSTerminalRuleCall_1_0_21()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 23 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:953:10: this_LESS_THAN_49= RULE_LESS_THAN
            	            {
            	            this_LESS_THAN_49=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_rulePropertyValue2527); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LESS_THAN_49);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LESS_THAN_49, grammarAccess.getPropertyValueAccess().getLESS_THANTerminalRuleCall_1_0_22()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 24 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:961:10: this_MORE_THAN_50= RULE_MORE_THAN
            	            {
            	            this_MORE_THAN_50=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_rulePropertyValue2553); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MORE_THAN_50);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MORE_THAN_50, grammarAccess.getPropertyValueAccess().getMORE_THANTerminalRuleCall_1_0_23()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 25 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:969:10: this_PERCENT_51= RULE_PERCENT
            	            {
            	            this_PERCENT_51=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_rulePropertyValue2579); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PERCENT_51);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PERCENT_51, grammarAccess.getPropertyValueAccess().getPERCENTTerminalRuleCall_1_0_24()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 26 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:977:10: this_AND_52= RULE_AND
            	            {
            	            this_AND_52=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_rulePropertyValue2605); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AND_52);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AND_52, grammarAccess.getPropertyValueAccess().getANDTerminalRuleCall_1_0_25()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 27 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:985:10: this_OR_53= RULE_OR
            	            {
            	            this_OR_53=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_rulePropertyValue2631); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_OR_53);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_OR_53, grammarAccess.getPropertyValueAccess().getORTerminalRuleCall_1_0_26()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 28 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:993:10: this_ESC_CHAR_54= RULE_ESC_CHAR
            	            {
            	            this_ESC_CHAR_54=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_rulePropertyValue2657); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ESC_CHAR_54);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ESC_CHAR_54, grammarAccess.getPropertyValueAccess().getESC_CHARTerminalRuleCall_1_0_27()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1008:1: entryRulePojoDefinition returns [EObject current=null] : iv_rulePojoDefinition= rulePojoDefinition EOF ;
    public final EObject entryRulePojoDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePojoDefinition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1012:2: (iv_rulePojoDefinition= rulePojoDefinition EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1013:2: iv_rulePojoDefinition= rulePojoDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPojoDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePojoDefinition_in_entryRulePojoDefinition2711);
            iv_rulePojoDefinition=rulePojoDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePojoDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePojoDefinition2721); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1023:1: rulePojoDefinition returns [EObject current=null] : (otherlv_0= 'pojo' ( (lv_name_1_0= RULE_IDENT ) ) ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1027:28: ( (otherlv_0= 'pojo' ( (lv_name_1_0= RULE_IDENT ) ) ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1028:1: (otherlv_0= 'pojo' ( (lv_name_1_0= RULE_IDENT ) ) ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1028:1: (otherlv_0= 'pojo' ( (lv_name_1_0= RULE_IDENT ) ) ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1028:3: otherlv_0= 'pojo' ( (lv_name_1_0= RULE_IDENT ) ) ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_rulePojoDefinition2762); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPojoDefinitionAccess().getPojoKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1032:1: ( (lv_name_1_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1033:1: (lv_name_1_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1033:1: (lv_name_1_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1034:3: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePojoDefinition2779); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1050:2: ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1051:1: ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1051:1: ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1052:1: (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1052:1: (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_IDENT) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_IDENT_DOT) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1053:3: lv_class_2_1= RULE_IDENT
                    {
                    lv_class_2_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePojoDefinition2803); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1068:8: lv_class_2_2= RULE_IDENT_DOT
                    {
                    lv_class_2_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_rulePojoDefinition2823); if (state.failed) return current;
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

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulePojoDefinition2842); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1101:1: entryRulePojoUsage returns [EObject current=null] : iv_rulePojoUsage= rulePojoUsage EOF ;
    public final EObject entryRulePojoUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePojoUsage = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1102:2: (iv_rulePojoUsage= rulePojoUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1103:2: iv_rulePojoUsage= rulePojoUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPojoUsageRule()); 
            }
            pushFollow(FOLLOW_rulePojoUsage_in_entryRulePojoUsage2881);
            iv_rulePojoUsage=rulePojoUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePojoUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePojoUsage2891); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1110:1: rulePojoUsage returns [EObject current=null] : (this_ColumnUsage_0= ruleColumnUsage | this_IdentifierUsage_1= ruleIdentifierUsage | this_ConstantUsage_2= ruleConstantUsage | this_MappingUsage_3= ruleMappingUsage ) ;
    public final EObject rulePojoUsage() throws RecognitionException {
        EObject current = null;

        EObject this_ColumnUsage_0 = null;

        EObject this_IdentifierUsage_1 = null;

        EObject this_ConstantUsage_2 = null;

        EObject this_MappingUsage_3 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1113:28: ( (this_ColumnUsage_0= ruleColumnUsage | this_IdentifierUsage_1= ruleIdentifierUsage | this_ConstantUsage_2= ruleConstantUsage | this_MappingUsage_3= ruleMappingUsage ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1114:1: (this_ColumnUsage_0= ruleColumnUsage | this_IdentifierUsage_1= ruleIdentifierUsage | this_ConstantUsage_2= ruleConstantUsage | this_MappingUsage_3= ruleMappingUsage )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1114:1: (this_ColumnUsage_0= ruleColumnUsage | this_IdentifierUsage_1= ruleIdentifierUsage | this_ConstantUsage_2= ruleConstantUsage | this_MappingUsage_3= ruleMappingUsage )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt21=1;
                }
                break;
            case 44:
                {
                alt21=2;
                }
                break;
            case 45:
                {
                alt21=3;
                }
                break;
            case 46:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1115:5: this_ColumnUsage_0= ruleColumnUsage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPojoUsageAccess().getColumnUsageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleColumnUsage_in_rulePojoUsage2938);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1125:5: this_IdentifierUsage_1= ruleIdentifierUsage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPojoUsageAccess().getIdentifierUsageParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdentifierUsage_in_rulePojoUsage2965);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1135:5: this_ConstantUsage_2= ruleConstantUsage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPojoUsageAccess().getConstantUsageParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantUsage_in_rulePojoUsage2992);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1145:5: this_MappingUsage_3= ruleMappingUsage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPojoUsageAccess().getMappingUsageParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMappingUsage_in_rulePojoUsage3019);
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1161:1: entryRuleColumnUsage returns [EObject current=null] : iv_ruleColumnUsage= ruleColumnUsage EOF ;
    public final EObject entryRuleColumnUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnUsage = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1165:2: (iv_ruleColumnUsage= ruleColumnUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1166:2: iv_ruleColumnUsage= ruleColumnUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnUsageRule()); 
            }
            pushFollow(FOLLOW_ruleColumnUsage_in_entryRuleColumnUsage3060);
            iv_ruleColumnUsage=ruleColumnUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnUsage3070); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1176:1: ruleColumnUsage returns [EObject current=null] : (otherlv_0= 'col' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleColumnUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1180:28: ( (otherlv_0= 'col' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1181:1: (otherlv_0= 'col' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1181:1: (otherlv_0= 'col' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1181:3: otherlv_0= 'col' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleColumnUsage3111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getColumnUsageAccess().getColKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1185:1: ( (otherlv_1= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1186:1: (otherlv_1= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1186:1: (otherlv_1= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1187:3: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getColumnUsageRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumnUsage3131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getColumnUsageAccess().getStatementMetaStatementCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1198:2: ( (otherlv_2= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1199:1: (otherlv_2= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1199:1: (otherlv_2= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1200:3: otherlv_2= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getColumnUsageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumnUsage3151); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getColumnUsageAccess().getPojoPojoDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleColumnUsage3162); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1226:1: entryRuleIdentifierUsage returns [EObject current=null] : iv_ruleIdentifierUsage= ruleIdentifierUsage EOF ;
    public final EObject entryRuleIdentifierUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifierUsage = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1230:2: (iv_ruleIdentifierUsage= ruleIdentifierUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1231:2: iv_ruleIdentifierUsage= ruleIdentifierUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierUsageRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifierUsage_in_entryRuleIdentifierUsage3207);
            iv_ruleIdentifierUsage=ruleIdentifierUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifierUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifierUsage3217); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1241:1: ruleIdentifierUsage returns [EObject current=null] : (otherlv_0= 'ident' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleIdentifierUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1245:28: ( (otherlv_0= 'ident' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1246:1: (otherlv_0= 'ident' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1246:1: (otherlv_0= 'ident' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1246:3: otherlv_0= 'ident' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleIdentifierUsage3258); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIdentifierUsageAccess().getIdentKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1250:1: ( (otherlv_1= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1251:1: (otherlv_1= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1251:1: (otherlv_1= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1252:3: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIdentifierUsageRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifierUsage3278); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getIdentifierUsageAccess().getStatementMetaStatementCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1263:2: ( (otherlv_2= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1264:1: (otherlv_2= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1264:1: (otherlv_2= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1265:3: otherlv_2= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIdentifierUsageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifierUsage3298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getIdentifierUsageAccess().getPojoPojoDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleIdentifierUsage3309); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1291:1: entryRuleConstantUsage returns [EObject current=null] : iv_ruleConstantUsage= ruleConstantUsage EOF ;
    public final EObject entryRuleConstantUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantUsage = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1295:2: (iv_ruleConstantUsage= ruleConstantUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1296:2: iv_ruleConstantUsage= ruleConstantUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantUsageRule()); 
            }
            pushFollow(FOLLOW_ruleConstantUsage_in_entryRuleConstantUsage3354);
            iv_ruleConstantUsage=ruleConstantUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantUsage3364); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1306:1: ruleConstantUsage returns [EObject current=null] : (otherlv_0= 'const' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleConstantUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1310:28: ( (otherlv_0= 'const' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1311:1: (otherlv_0= 'const' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1311:1: (otherlv_0= 'const' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1311:3: otherlv_0= 'const' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleConstantUsage3405); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantUsageAccess().getConstKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1315:1: ( (otherlv_1= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1316:1: (otherlv_1= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1316:1: (otherlv_1= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1317:3: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantUsageRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstantUsage3425); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getConstantUsageAccess().getStatementMetaStatementCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1328:2: ( (otherlv_2= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1329:1: (otherlv_2= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1329:1: (otherlv_2= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1330:3: otherlv_2= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantUsageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstantUsage3445); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getConstantUsageAccess().getPojoPojoDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleConstantUsage3456); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1356:1: entryRuleMappingUsage returns [EObject current=null] : iv_ruleMappingUsage= ruleMappingUsage EOF ;
    public final EObject entryRuleMappingUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingUsage = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1360:2: (iv_ruleMappingUsage= ruleMappingUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1361:2: iv_ruleMappingUsage= ruleMappingUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingUsageRule()); 
            }
            pushFollow(FOLLOW_ruleMappingUsage_in_entryRuleMappingUsage3501);
            iv_ruleMappingUsage=ruleMappingUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingUsage3511); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1371:1: ruleMappingUsage returns [EObject current=null] : (otherlv_0= 'out' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleMappingUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1375:28: ( (otherlv_0= 'out' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1376:1: (otherlv_0= 'out' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1376:1: (otherlv_0= 'out' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1376:3: otherlv_0= 'out' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleMappingUsage3552); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMappingUsageAccess().getOutKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1380:1: ( (otherlv_1= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1381:1: (otherlv_1= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1381:1: (otherlv_1= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1382:3: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMappingUsageRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingUsage3572); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getMappingUsageAccess().getStatementMappingRuleCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1393:2: ( (otherlv_2= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1394:1: (otherlv_2= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1394:1: (otherlv_2= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1395:3: otherlv_2= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMappingUsageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingUsage3592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getMappingUsageAccess().getPojoPojoDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleMappingUsage3603); if (state.failed) return current;
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


    // $ANTLR start "entryRuleTableDefinition"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1421:1: entryRuleTableDefinition returns [EObject current=null] : iv_ruleTableDefinition= ruleTableDefinition EOF ;
    public final EObject entryRuleTableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableDefinition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1425:2: (iv_ruleTableDefinition= ruleTableDefinition EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1426:2: iv_ruleTableDefinition= ruleTableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition3648);
            iv_ruleTableDefinition=ruleTableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableDefinition3658); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTableDefinition"


    // $ANTLR start "ruleTableDefinition"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1436:1: ruleTableDefinition returns [EObject current=null] : (otherlv_0= 'table' ( (lv_name_1_0= RULE_IDENT ) ) ( (lv_table_2_0= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleTableDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_table_2_0=null;
        Token this_SEMICOLON_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1440:28: ( (otherlv_0= 'table' ( (lv_name_1_0= RULE_IDENT ) ) ( (lv_table_2_0= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1441:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_IDENT ) ) ( (lv_table_2_0= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1441:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_IDENT ) ) ( (lv_table_2_0= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1441:3: otherlv_0= 'table' ( (lv_name_1_0= RULE_IDENT ) ) ( (lv_table_2_0= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleTableDefinition3699); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTableDefinitionAccess().getTableKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1445:1: ( (lv_name_1_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1446:1: (lv_name_1_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1446:1: (lv_name_1_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1447:3: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTableDefinition3716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getTableDefinitionAccess().getNameIDENTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTableDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"IDENT");
              	    
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1463:2: ( (lv_table_2_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1464:1: (lv_table_2_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1464:1: (lv_table_2_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1465:3: lv_table_2_0= RULE_IDENT
            {
            lv_table_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTableDefinition3738); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_table_2_0, grammarAccess.getTableDefinitionAccess().getTableIDENTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTableDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"table",
                      		lv_table_2_0, 
                      		"IDENT");
              	    
            }

            }


            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleTableDefinition3754); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_3, grammarAccess.getTableDefinitionAccess().getSEMICOLONTerminalRuleCall_3()); 
                  
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
    // $ANTLR end "ruleTableDefinition"


    // $ANTLR start "entryRuleTableUsage"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1496:1: entryRuleTableUsage returns [EObject current=null] : iv_ruleTableUsage= ruleTableUsage EOF ;
    public final EObject entryRuleTableUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableUsage = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1500:2: (iv_ruleTableUsage= ruleTableUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1501:2: iv_ruleTableUsage= ruleTableUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableUsageRule()); 
            }
            pushFollow(FOLLOW_ruleTableUsage_in_entryRuleTableUsage3799);
            iv_ruleTableUsage=ruleTableUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableUsage3809); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTableUsage"


    // $ANTLR start "ruleTableUsage"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1511:1: ruleTableUsage returns [EObject current=null] : (otherlv_0= 'dbcol' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_IDENT ) ) this_SEMICOLON_5= RULE_SEMICOLON ) ;
    public final EObject ruleTableUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_prefix_4_0=null;
        Token this_SEMICOLON_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1515:28: ( (otherlv_0= 'dbcol' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_IDENT ) ) this_SEMICOLON_5= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1516:1: (otherlv_0= 'dbcol' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_IDENT ) ) this_SEMICOLON_5= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1516:1: (otherlv_0= 'dbcol' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_IDENT ) ) this_SEMICOLON_5= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1516:3: otherlv_0= 'dbcol' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_IDENT ) ) this_SEMICOLON_5= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleTableUsage3850); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTableUsageAccess().getDbcolKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1520:1: ( (otherlv_1= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1521:1: (otherlv_1= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1521:1: (otherlv_1= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1522:3: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTableUsageRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTableUsage3870); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getTableUsageAccess().getStatementMetaStatementCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1533:2: ( (otherlv_2= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1534:1: (otherlv_2= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1534:1: (otherlv_2= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1535:3: otherlv_2= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTableUsageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTableUsage3890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getTableUsageAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleTableUsage3902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTableUsageAccess().getPrefixKeyword_3());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1550:1: ( (lv_prefix_4_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1551:1: (lv_prefix_4_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1551:1: (lv_prefix_4_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1552:3: lv_prefix_4_0= RULE_IDENT
            {
            lv_prefix_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTableUsage3919); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_prefix_4_0, grammarAccess.getTableUsageAccess().getPrefixIDENTTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTableUsageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"prefix",
                      		lv_prefix_4_0, 
                      		"IDENT");
              	    
            }

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleTableUsage3935); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_5, grammarAccess.getTableUsageAccess().getSEMICOLONTerminalRuleCall_5()); 
                  
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
    // $ANTLR end "ruleTableUsage"


    // $ANTLR start "entryRuleMetaStatement"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1583:1: entryRuleMetaStatement returns [EObject current=null] : iv_ruleMetaStatement= ruleMetaStatement EOF ;
    public final EObject entryRuleMetaStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaStatement = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1584:2: (iv_ruleMetaStatement= ruleMetaStatement EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1585:2: iv_ruleMetaStatement= ruleMetaStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaStatementRule()); 
            }
            pushFollow(FOLLOW_ruleMetaStatement_in_entryRuleMetaStatement3974);
            iv_ruleMetaStatement=ruleMetaStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaStatement3984); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1592:1: ruleMetaStatement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1595:28: ( ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1596:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1596:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1596:2: ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1596:2: ( (lv_name_0_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1597:1: (lv_name_0_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1597:1: (lv_name_0_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1598:3: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMetaStatement4026); if (state.failed) return current;
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

            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleMetaStatement4042); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_1, grammarAccess.getMetaStatementAccess().getLPARENTerminalRuleCall_1()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1618:1: ( (lv_type_2_0= ruleSTATEMEN_TYPE ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1619:1: (lv_type_2_0= ruleSTATEMEN_TYPE )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1619:1: (lv_type_2_0= ruleSTATEMEN_TYPE )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1620:3: lv_type_2_0= ruleSTATEMEN_TYPE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMetaStatementAccess().getTypeSTATEMEN_TYPEEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSTATEMEN_TYPE_in_ruleMetaStatement4062);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1636:2: (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1636:3: this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleMetaStatement4074); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getMetaStatementAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1640:1: ( (lv_filters_4_0= RULE_IDENT ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1641:1: (lv_filters_4_0= RULE_IDENT )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1641:1: (lv_filters_4_0= RULE_IDENT )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1642:3: lv_filters_4_0= RULE_IDENT
            	    {
            	    lv_filters_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMetaStatement4090); if (state.failed) return current;
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
            	    break loop22;
                }
            } while (true);

            this_RPAREN_5=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleMetaStatement4108); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_5, grammarAccess.getMetaStatementAccess().getRPARENTerminalRuleCall_4()); 
                  
            }
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleMetaStatement4118); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUALS_6, grammarAccess.getMetaStatementAccess().getEQUALSTerminalRuleCall_5()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1666:1: ( (lv_statement_7_0= ruleSql ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1667:1: (lv_statement_7_0= ruleSql )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1667:1: (lv_statement_7_0= ruleSql )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1668:3: lv_statement_7_0= ruleSql
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMetaStatementAccess().getStatementSqlParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSql_in_ruleMetaStatement4138);
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

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleMetaStatement4149); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1696:1: entryRuleSql returns [EObject current=null] : iv_ruleSql= ruleSql EOF ;
    public final EObject entryRuleSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1697:2: (iv_ruleSql= ruleSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1698:2: iv_ruleSql= ruleSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlRule()); 
            }
            pushFollow(FOLLOW_ruleSql_in_entryRuleSql4184);
            iv_ruleSql=ruleSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSql4194); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1705:1: ruleSql returns [EObject current=null] : ( (lv_sqls_0_0= ruleSqlFragment ) )+ ;
    public final EObject ruleSql() throws RecognitionException {
        EObject current = null;

        EObject lv_sqls_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1708:28: ( ( (lv_sqls_0_0= ruleSqlFragment ) )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1709:1: ( (lv_sqls_0_0= ruleSqlFragment ) )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1709:1: ( (lv_sqls_0_0= ruleSqlFragment ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_WS||(LA23_0>=RULE_REST && LA23_0<=RULE_ESC_CHAR)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1710:1: (lv_sqls_0_0= ruleSqlFragment )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1710:1: (lv_sqls_0_0= ruleSqlFragment )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1711:3: lv_sqls_0_0= ruleSqlFragment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSqlAccess().getSqlsSqlFragmentParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSqlFragment_in_ruleSql4239);
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
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1735:1: entryRuleSqlFragment returns [EObject current=null] : iv_ruleSqlFragment= ruleSqlFragment EOF ;
    public final EObject entryRuleSqlFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqlFragment = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1736:2: (iv_ruleSqlFragment= ruleSqlFragment EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1737:2: iv_ruleSqlFragment= ruleSqlFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleSqlFragment_in_entryRuleSqlFragment4275);
            iv_ruleSqlFragment=ruleSqlFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqlFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlFragment4285); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1744:1: ruleSqlFragment returns [EObject current=null] : ( ( (lv_value_0_0= ruleSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) | (this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) ) ) ) ;
    public final EObject ruleSqlFragment() throws RecognitionException {
        EObject current = null;

        Token this_AT_1=null;
        Token this_STRING_3=null;
        Token this_COLON_5=null;
        Token this_LBRACE_7=null;
        Token this_RBRACE_9=null;
        Token this_PERCENT_10=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject lv_col_2_0 = null;

        EObject lv_cnst_4_0 = null;

        EObject lv_ident_6_0 = null;

        EObject lv_meta_8_0 = null;

        EObject lv_dbcol_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1747:28: ( ( ( (lv_value_0_0= ruleSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) | (this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) ) ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1748:1: ( ( (lv_value_0_0= ruleSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) | (this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) ) ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1748:1: ( ( (lv_value_0_0= ruleSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) | (this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) ) ) )
            int alt24=6;
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
            case RULE_AND:
            case RULE_OR:
            case RULE_ESC_CHAR:
                {
                alt24=1;
                }
                break;
            case RULE_AT:
                {
                alt24=2;
                }
                break;
            case RULE_STRING:
                {
                alt24=3;
                }
                break;
            case RULE_COLON:
                {
                alt24=4;
                }
                break;
            case RULE_LBRACE:
                {
                alt24=5;
                }
                break;
            case RULE_PERCENT:
                {
                alt24=6;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1748:2: ( (lv_value_0_0= ruleSqlValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1748:2: ( (lv_value_0_0= ruleSqlValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1749:1: (lv_value_0_0= ruleSqlValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1749:1: (lv_value_0_0= ruleSqlValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1750:3: lv_value_0_0= ruleSqlValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getValueSqlValueParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlValue_in_ruleSqlFragment4331);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1767:6: (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1767:6: (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1767:7: this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) )
                    {
                    this_AT_1=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleSqlFragment4349); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_1, grammarAccess.getSqlFragmentAccess().getATTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1771:1: ( (lv_col_2_0= ruleColumn ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1772:1: (lv_col_2_0= ruleColumn )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1772:1: (lv_col_2_0= ruleColumn )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1773:3: lv_col_2_0= ruleColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getColColumnParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleColumn_in_ruleSqlFragment4369);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1790:6: (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1790:6: (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1790:7: this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) )
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSqlFragment4388); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getSqlFragmentAccess().getSTRINGTerminalRuleCall_2_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1794:1: ( (lv_cnst_4_0= ruleConstant ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1795:1: (lv_cnst_4_0= ruleConstant )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1795:1: (lv_cnst_4_0= ruleConstant )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1796:3: lv_cnst_4_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getCnstConstantParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleSqlFragment4408);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1813:6: (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1813:6: (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1813:7: this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) )
                    {
                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleSqlFragment4427); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_5, grammarAccess.getSqlFragmentAccess().getCOLONTerminalRuleCall_3_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1817:1: ( (lv_ident_6_0= ruleIdentifier ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1818:1: (lv_ident_6_0= ruleIdentifier )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1818:1: (lv_ident_6_0= ruleIdentifier )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1819:3: lv_ident_6_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getIdentIdentifierParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleSqlFragment4447);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1836:6: (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1836:6: (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1836:7: this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE
                    {
                    this_LBRACE_7=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleSqlFragment4466); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACE_7, grammarAccess.getSqlFragmentAccess().getLBRACETerminalRuleCall_4_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1840:1: ( (lv_meta_8_0= ruleMetaSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1841:1: (lv_meta_8_0= ruleMetaSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1841:1: (lv_meta_8_0= ruleMetaSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1842:3: lv_meta_8_0= ruleMetaSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getMetaMetaSqlParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMetaSql_in_ruleSqlFragment4486);
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

                    this_RBRACE_9=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleSqlFragment4497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RBRACE_9, grammarAccess.getSqlFragmentAccess().getRBRACETerminalRuleCall_4_2()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1863:6: (this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1863:6: (this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1863:7: this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) )
                    {
                    this_PERCENT_10=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleSqlFragment4515); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PERCENT_10, grammarAccess.getSqlFragmentAccess().getPERCENTTerminalRuleCall_5_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1867:1: ( (lv_dbcol_11_0= ruleDatabaseColumn ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1868:1: (lv_dbcol_11_0= ruleDatabaseColumn )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1868:1: (lv_dbcol_11_0= ruleDatabaseColumn )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1869:3: lv_dbcol_11_0= ruleDatabaseColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getDbcolDatabaseColumnParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDatabaseColumn_in_ruleSqlFragment4535);
                    lv_dbcol_11_0=ruleDatabaseColumn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSqlFragmentRule());
                      	        }
                             		set(
                             			current, 
                             			"dbcol",
                              		lv_dbcol_11_0, 
                              		"DatabaseColumn");
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
    // $ANTLR end "ruleSqlFragment"


    // $ANTLR start "entryRuleSqlValue"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1893:1: entryRuleSqlValue returns [String current=null] : iv_ruleSqlValue= ruleSqlValue EOF ;
    public final String entryRuleSqlValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSqlValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1894:2: (iv_ruleSqlValue= ruleSqlValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1895:2: iv_ruleSqlValue= ruleSqlValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlValueRule()); 
            }
            pushFollow(FOLLOW_ruleSqlValue_in_entryRuleSqlValue4573);
            iv_ruleSqlValue=ruleSqlValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqlValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlValue4584); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1902:1: ruleSqlValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_AND_20= RULE_AND | this_OR_21= RULE_OR | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )* ) ;
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
        Token this_AND_20=null;
        Token this_OR_21=null;
        Token this_ESC_CHAR_22=null;
        Token this_REST_23=null;
        Token this_IDENT_DOT_24=null;
        Token this_IDENT_25=null;
        Token this_NUMBER_26=null;
        Token this_WS_27=null;
        Token this_COMMA_28=null;
        Token this_MINUS_29=null;
        Token this_PLUS_30=null;
        Token this_LPAREN_31=null;
        Token this_RPAREN_32=null;
        Token this_RBRACE_33=null;
        Token this_QUESTI_34=null;
        Token this_NOT_35=null;
        Token this_BAND_36=null;
        Token this_BOR_37=null;
        Token this_HASH_38=null;
        Token this_CARET_39=null;
        Token this_EQUALS_40=null;
        Token this_LESS_THAN_41=null;
        Token this_MORE_THAN_42=null;
        Token this_AND_43=null;
        Token this_OR_44=null;
        Token this_ESC_CHAR_45=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1905:28: ( ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_AND_20= RULE_AND | this_OR_21= RULE_OR | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1906:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_AND_20= RULE_AND | this_OR_21= RULE_OR | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1906:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_AND_20= RULE_AND | this_OR_21= RULE_OR | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1906:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_AND_20= RULE_AND | this_OR_21= RULE_OR | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1906:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_AND_20= RULE_AND | this_OR_21= RULE_OR | this_ESC_CHAR_22= RULE_ESC_CHAR )
            int alt25=23;
            switch ( input.LA(1) ) {
            case RULE_REST:
                {
                alt25=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt25=2;
                }
                break;
            case RULE_IDENT:
                {
                alt25=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt25=4;
                }
                break;
            case RULE_WS:
                {
                alt25=5;
                }
                break;
            case RULE_COMMA:
                {
                alt25=6;
                }
                break;
            case RULE_MINUS:
                {
                alt25=7;
                }
                break;
            case RULE_PLUS:
                {
                alt25=8;
                }
                break;
            case RULE_LPAREN:
                {
                alt25=9;
                }
                break;
            case RULE_RPAREN:
                {
                alt25=10;
                }
                break;
            case RULE_RBRACE:
                {
                alt25=11;
                }
                break;
            case RULE_QUESTI:
                {
                alt25=12;
                }
                break;
            case RULE_NOT:
                {
                alt25=13;
                }
                break;
            case RULE_BAND:
                {
                alt25=14;
                }
                break;
            case RULE_BOR:
                {
                alt25=15;
                }
                break;
            case RULE_HASH:
                {
                alt25=16;
                }
                break;
            case RULE_CARET:
                {
                alt25=17;
                }
                break;
            case RULE_EQUALS:
                {
                alt25=18;
                }
                break;
            case RULE_LESS_THAN:
                {
                alt25=19;
                }
                break;
            case RULE_MORE_THAN:
                {
                alt25=20;
                }
                break;
            case RULE_AND:
                {
                alt25=21;
                }
                break;
            case RULE_OR:
                {
                alt25=22;
                }
                break;
            case RULE_ESC_CHAR:
                {
                alt25=23;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1906:7: this_REST_0= RULE_REST
                    {
                    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleSqlValue4625); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REST_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REST_0, grammarAccess.getSqlValueAccess().getRESTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1914:10: this_IDENT_DOT_1= RULE_IDENT_DOT
                    {
                    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleSqlValue4651); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_DOT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_DOT_1, grammarAccess.getSqlValueAccess().getIDENT_DOTTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1922:10: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleSqlValue4677); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_2, grammarAccess.getSqlValueAccess().getIDENTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1930:10: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSqlValue4703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_3, grammarAccess.getSqlValueAccess().getNUMBERTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1938:10: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSqlValue4729); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WS_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_4, grammarAccess.getSqlValueAccess().getWSTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1946:10: this_COMMA_5= RULE_COMMA
                    {
                    this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleSqlValue4755); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_5, grammarAccess.getSqlValueAccess().getCOMMATerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1954:10: this_MINUS_6= RULE_MINUS
                    {
                    this_MINUS_6=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleSqlValue4781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_6, grammarAccess.getSqlValueAccess().getMINUSTerminalRuleCall_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1962:10: this_PLUS_7= RULE_PLUS
                    {
                    this_PLUS_7=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleSqlValue4807); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_7, grammarAccess.getSqlValueAccess().getPLUSTerminalRuleCall_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1970:10: this_LPAREN_8= RULE_LPAREN
                    {
                    this_LPAREN_8=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleSqlValue4833); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LPAREN_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_8, grammarAccess.getSqlValueAccess().getLPARENTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1978:10: this_RPAREN_9= RULE_RPAREN
                    {
                    this_RPAREN_9=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleSqlValue4859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RPAREN_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_9, grammarAccess.getSqlValueAccess().getRPARENTerminalRuleCall_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1986:10: this_RBRACE_10= RULE_RBRACE
                    {
                    this_RBRACE_10=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleSqlValue4885); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RBRACE_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RBRACE_10, grammarAccess.getSqlValueAccess().getRBRACETerminalRuleCall_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1994:10: this_QUESTI_11= RULE_QUESTI
                    {
                    this_QUESTI_11=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleSqlValue4911); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUESTI_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUESTI_11, grammarAccess.getSqlValueAccess().getQUESTITerminalRuleCall_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2002:10: this_NOT_12= RULE_NOT
                    {
                    this_NOT_12=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleSqlValue4937); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_12, grammarAccess.getSqlValueAccess().getNOTTerminalRuleCall_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2010:10: this_BAND_13= RULE_BAND
                    {
                    this_BAND_13=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleSqlValue4963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BAND_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BAND_13, grammarAccess.getSqlValueAccess().getBANDTerminalRuleCall_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2018:10: this_BOR_14= RULE_BOR
                    {
                    this_BOR_14=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleSqlValue4989); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOR_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_14, grammarAccess.getSqlValueAccess().getBORTerminalRuleCall_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2026:10: this_HASH_15= RULE_HASH
                    {
                    this_HASH_15=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleSqlValue5015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASH_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASH_15, grammarAccess.getSqlValueAccess().getHASHTerminalRuleCall_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2034:10: this_CARET_16= RULE_CARET
                    {
                    this_CARET_16=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleSqlValue5041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CARET_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_16, grammarAccess.getSqlValueAccess().getCARETTerminalRuleCall_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2042:10: this_EQUALS_17= RULE_EQUALS
                    {
                    this_EQUALS_17=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleSqlValue5067); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUALS_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_17, grammarAccess.getSqlValueAccess().getEQUALSTerminalRuleCall_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2050:10: this_LESS_THAN_18= RULE_LESS_THAN
                    {
                    this_LESS_THAN_18=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleSqlValue5093); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LESS_THAN_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LESS_THAN_18, grammarAccess.getSqlValueAccess().getLESS_THANTerminalRuleCall_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2058:10: this_MORE_THAN_19= RULE_MORE_THAN
                    {
                    this_MORE_THAN_19=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleSqlValue5119); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MORE_THAN_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MORE_THAN_19, grammarAccess.getSqlValueAccess().getMORE_THANTerminalRuleCall_0_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2066:10: this_AND_20= RULE_AND
                    {
                    this_AND_20=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleSqlValue5145); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AND_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AND_20, grammarAccess.getSqlValueAccess().getANDTerminalRuleCall_0_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2074:10: this_OR_21= RULE_OR
                    {
                    this_OR_21=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleSqlValue5171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_OR_21);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OR_21, grammarAccess.getSqlValueAccess().getORTerminalRuleCall_0_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2082:10: this_ESC_CHAR_22= RULE_ESC_CHAR
                    {
                    this_ESC_CHAR_22=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleSqlValue5197); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESC_CHAR_22);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESC_CHAR_22, grammarAccess.getSqlValueAccess().getESC_CHARTerminalRuleCall_0_22()); 
                          
                    }

                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2089:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )*
            loop27:
            do {
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2089:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2111:23: (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR )
            	    int alt26=23;
            	    switch ( input.LA(1) ) {
            	    case RULE_REST:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case RULE_IDENT_DOT:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case RULE_IDENT:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    case RULE_NUMBER:
            	        {
            	        alt26=4;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt26=5;
            	        }
            	        break;
            	    case RULE_COMMA:
            	        {
            	        alt26=6;
            	        }
            	        break;
            	    case RULE_MINUS:
            	        {
            	        alt26=7;
            	        }
            	        break;
            	    case RULE_PLUS:
            	        {
            	        alt26=8;
            	        }
            	        break;
            	    case RULE_LPAREN:
            	        {
            	        alt26=9;
            	        }
            	        break;
            	    case RULE_RPAREN:
            	        {
            	        alt26=10;
            	        }
            	        break;
            	    case RULE_RBRACE:
            	        {
            	        alt26=11;
            	        }
            	        break;
            	    case RULE_QUESTI:
            	        {
            	        alt26=12;
            	        }
            	        break;
            	    case RULE_NOT:
            	        {
            	        alt26=13;
            	        }
            	        break;
            	    case RULE_BAND:
            	        {
            	        alt26=14;
            	        }
            	        break;
            	    case RULE_BOR:
            	        {
            	        alt26=15;
            	        }
            	        break;
            	    case RULE_HASH:
            	        {
            	        alt26=16;
            	        }
            	        break;
            	    case RULE_CARET:
            	        {
            	        alt26=17;
            	        }
            	        break;
            	    case RULE_EQUALS:
            	        {
            	        alt26=18;
            	        }
            	        break;
            	    case RULE_LESS_THAN:
            	        {
            	        alt26=19;
            	        }
            	        break;
            	    case RULE_MORE_THAN:
            	        {
            	        alt26=20;
            	        }
            	        break;
            	    case RULE_AND:
            	        {
            	        alt26=21;
            	        }
            	        break;
            	    case RULE_OR:
            	        {
            	        alt26=22;
            	        }
            	        break;
            	    case RULE_ESC_CHAR:
            	        {
            	        alt26=23;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2111:28: this_REST_23= RULE_REST
            	            {
            	            this_REST_23=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleSqlValue5380); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REST_23);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REST_23, grammarAccess.getSqlValueAccess().getRESTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2119:10: this_IDENT_DOT_24= RULE_IDENT_DOT
            	            {
            	            this_IDENT_DOT_24=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleSqlValue5406); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_DOT_24);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_DOT_24, grammarAccess.getSqlValueAccess().getIDENT_DOTTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2127:10: this_IDENT_25= RULE_IDENT
            	            {
            	            this_IDENT_25=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleSqlValue5432); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_25);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_25, grammarAccess.getSqlValueAccess().getIDENTTerminalRuleCall_1_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2135:10: this_NUMBER_26= RULE_NUMBER
            	            {
            	            this_NUMBER_26=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSqlValue5458); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NUMBER_26);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NUMBER_26, grammarAccess.getSqlValueAccess().getNUMBERTerminalRuleCall_1_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2143:10: this_WS_27= RULE_WS
            	            {
            	            this_WS_27=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSqlValue5484); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_WS_27);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_WS_27, grammarAccess.getSqlValueAccess().getWSTerminalRuleCall_1_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2151:10: this_COMMA_28= RULE_COMMA
            	            {
            	            this_COMMA_28=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleSqlValue5510); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COMMA_28);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COMMA_28, grammarAccess.getSqlValueAccess().getCOMMATerminalRuleCall_1_0_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2159:10: this_MINUS_29= RULE_MINUS
            	            {
            	            this_MINUS_29=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleSqlValue5536); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MINUS_29);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MINUS_29, grammarAccess.getSqlValueAccess().getMINUSTerminalRuleCall_1_0_6()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2167:10: this_PLUS_30= RULE_PLUS
            	            {
            	            this_PLUS_30=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleSqlValue5562); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PLUS_30);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PLUS_30, grammarAccess.getSqlValueAccess().getPLUSTerminalRuleCall_1_0_7()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2175:10: this_LPAREN_31= RULE_LPAREN
            	            {
            	            this_LPAREN_31=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleSqlValue5588); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LPAREN_31);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LPAREN_31, grammarAccess.getSqlValueAccess().getLPARENTerminalRuleCall_1_0_8()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2183:10: this_RPAREN_32= RULE_RPAREN
            	            {
            	            this_RPAREN_32=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleSqlValue5614); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RPAREN_32);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RPAREN_32, grammarAccess.getSqlValueAccess().getRPARENTerminalRuleCall_1_0_9()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2191:10: this_RBRACE_33= RULE_RBRACE
            	            {
            	            this_RBRACE_33=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleSqlValue5640); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RBRACE_33);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RBRACE_33, grammarAccess.getSqlValueAccess().getRBRACETerminalRuleCall_1_0_10()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2199:10: this_QUESTI_34= RULE_QUESTI
            	            {
            	            this_QUESTI_34=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleSqlValue5666); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_QUESTI_34);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_QUESTI_34, grammarAccess.getSqlValueAccess().getQUESTITerminalRuleCall_1_0_11()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 13 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2207:10: this_NOT_35= RULE_NOT
            	            {
            	            this_NOT_35=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleSqlValue5692); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NOT_35);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NOT_35, grammarAccess.getSqlValueAccess().getNOTTerminalRuleCall_1_0_12()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 14 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2215:10: this_BAND_36= RULE_BAND
            	            {
            	            this_BAND_36=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleSqlValue5718); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BAND_36);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BAND_36, grammarAccess.getSqlValueAccess().getBANDTerminalRuleCall_1_0_13()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 15 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2223:10: this_BOR_37= RULE_BOR
            	            {
            	            this_BOR_37=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleSqlValue5744); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BOR_37);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BOR_37, grammarAccess.getSqlValueAccess().getBORTerminalRuleCall_1_0_14()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 16 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2231:10: this_HASH_38= RULE_HASH
            	            {
            	            this_HASH_38=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleSqlValue5770); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_HASH_38);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_HASH_38, grammarAccess.getSqlValueAccess().getHASHTerminalRuleCall_1_0_15()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 17 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2239:10: this_CARET_39= RULE_CARET
            	            {
            	            this_CARET_39=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleSqlValue5796); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_CARET_39);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_CARET_39, grammarAccess.getSqlValueAccess().getCARETTerminalRuleCall_1_0_16()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 18 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2247:10: this_EQUALS_40= RULE_EQUALS
            	            {
            	            this_EQUALS_40=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleSqlValue5822); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_EQUALS_40);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_EQUALS_40, grammarAccess.getSqlValueAccess().getEQUALSTerminalRuleCall_1_0_17()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 19 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2255:10: this_LESS_THAN_41= RULE_LESS_THAN
            	            {
            	            this_LESS_THAN_41=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleSqlValue5848); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LESS_THAN_41);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LESS_THAN_41, grammarAccess.getSqlValueAccess().getLESS_THANTerminalRuleCall_1_0_18()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 20 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2263:10: this_MORE_THAN_42= RULE_MORE_THAN
            	            {
            	            this_MORE_THAN_42=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleSqlValue5874); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MORE_THAN_42);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MORE_THAN_42, grammarAccess.getSqlValueAccess().getMORE_THANTerminalRuleCall_1_0_19()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 21 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2271:10: this_AND_43= RULE_AND
            	            {
            	            this_AND_43=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleSqlValue5900); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AND_43);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AND_43, grammarAccess.getSqlValueAccess().getANDTerminalRuleCall_1_0_20()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 22 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2279:10: this_OR_44= RULE_OR
            	            {
            	            this_OR_44=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleSqlValue5926); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_OR_44);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_OR_44, grammarAccess.getSqlValueAccess().getORTerminalRuleCall_1_0_21()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 23 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2287:10: this_ESC_CHAR_45= RULE_ESC_CHAR
            	            {
            	            this_ESC_CHAR_45=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleSqlValue5952); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ESC_CHAR_45);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ESC_CHAR_45, grammarAccess.getSqlValueAccess().getESC_CHARTerminalRuleCall_1_0_22()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2302:1: entryRuleMetaSql returns [EObject current=null] : iv_ruleMetaSql= ruleMetaSql EOF ;
    public final EObject entryRuleMetaSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2303:2: (iv_ruleMetaSql= ruleMetaSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2304:2: iv_ruleMetaSql= ruleMetaSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaSqlRule()); 
            }
            pushFollow(FOLLOW_ruleMetaSql_in_entryRuleMetaSql6000);
            iv_ruleMetaSql=ruleMetaSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaSql6010); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2311:1: ruleMetaSql returns [EObject current=null] : ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) | ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) ) | ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) ) ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2314:28: ( ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) | ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) ) | ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2315:1: ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) | ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) ) | ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2315:1: ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) | ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) ) | ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) ) )
            int alt33=6;
            switch ( input.LA(1) ) {
            case RULE_WS:
                {
                alt33=1;
                }
                break;
            case RULE_QUESTI:
                {
                alt33=2;
                }
                break;
            case RULE_BAND:
                {
                alt33=3;
                }
                break;
            case RULE_BOR:
                {
                alt33=4;
                }
                break;
            case RULE_EQUALS:
                {
                alt33=5;
                }
                break;
            case RULE_HASH:
                {
                alt33=6;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2315:2: (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2315:2: (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2315:3: this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )*
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMetaSql6047); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_0, grammarAccess.getMetaSqlAccess().getWSTerminalRuleCall_0_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2319:1: ( (lv_ifs_1_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2320:1: (lv_ifs_1_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2320:1: (lv_ifs_1_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2321:3: lv_ifs_1_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6067);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2337:2: (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_BOR) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2337:3: this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_2=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql6079); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_2, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_0_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2341:1: ( (lv_ifs_3_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2342:1: (lv_ifs_3_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2342:1: (lv_ifs_3_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2343:3: lv_ifs_3_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6099);
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
                    	    break loop28;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2360:6: ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2360:6: ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2360:7: ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2360:7: ( (lv_type_4_0= RULE_QUESTI ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2361:1: (lv_type_4_0= RULE_QUESTI )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2361:1: (lv_type_4_0= RULE_QUESTI )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2362:3: lv_type_4_0= RULE_QUESTI
                    {
                    lv_type_4_0=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleMetaSql6126); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2378:2: ( (lv_cond_5_0= ruleIfSqlCond ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2379:1: (lv_cond_5_0= ruleIfSqlCond )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2379:1: (lv_cond_5_0= ruleIfSqlCond )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2380:3: lv_cond_5_0= ruleIfSqlCond
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getCondIfSqlCondParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSqlCond_in_ruleMetaSql6152);
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

                    this_BOR_6=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql6163); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_6, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_1_2()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2400:1: ( (lv_ifs_7_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2401:1: (lv_ifs_7_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2401:1: (lv_ifs_7_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2402:3: lv_ifs_7_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6183);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2418:2: (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_BOR) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2418:3: this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_8=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql6195); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_8, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_1_4_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2422:1: ( (lv_ifs_9_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2423:1: (lv_ifs_9_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2423:1: (lv_ifs_9_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2424:3: lv_ifs_9_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_1_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6215);
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
                    	    break loop29;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2441:6: ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2441:6: ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2441:7: ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2441:7: ( (lv_type_10_0= RULE_BAND ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2442:1: (lv_type_10_0= RULE_BAND )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2442:1: (lv_type_10_0= RULE_BAND )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2443:3: lv_type_10_0= RULE_BAND
                    {
                    lv_type_10_0=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleMetaSql6242); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2459:2: ( (lv_ifs_11_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2460:1: (lv_ifs_11_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2460:1: (lv_ifs_11_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2461:3: lv_ifs_11_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6268);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2477:2: (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_BOR) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2477:3: this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_12=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql6280); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_12, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_2_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2481:1: ( (lv_ifs_13_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2482:1: (lv_ifs_13_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2482:1: (lv_ifs_13_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2483:3: lv_ifs_13_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6300);
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
                    	    break loop30;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2500:6: ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2500:6: ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2500:7: ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2500:7: ( (lv_type_14_0= RULE_BOR ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2501:1: (lv_type_14_0= RULE_BOR )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2501:1: (lv_type_14_0= RULE_BOR )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2502:3: lv_type_14_0= RULE_BOR
                    {
                    lv_type_14_0=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql6327); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2518:2: ( (lv_ifs_15_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2519:1: (lv_ifs_15_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2519:1: (lv_ifs_15_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2520:3: lv_ifs_15_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6353);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2536:2: (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_BOR) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2536:3: this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_16=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql6365); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_16, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_3_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2540:1: ( (lv_ifs_17_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2541:1: (lv_ifs_17_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2541:1: (lv_ifs_17_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2542:3: lv_ifs_17_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6385);
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
                    	    break loop31;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2559:6: ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2559:6: ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2559:7: ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2559:7: ( (lv_type_18_0= RULE_EQUALS ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2560:1: (lv_type_18_0= RULE_EQUALS )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2560:1: (lv_type_18_0= RULE_EQUALS )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2561:3: lv_type_18_0= RULE_EQUALS
                    {
                    lv_type_18_0=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleMetaSql6412); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2577:2: (this_WS_19= RULE_WS )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_WS) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2577:3: this_WS_19= RULE_WS
                    	    {
                    	    this_WS_19=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMetaSql6429); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_19, grammarAccess.getMetaSqlAccess().getWSTerminalRuleCall_4_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2581:3: ( (lv_ftype_20_0= RULE_IDENT ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2582:1: (lv_ftype_20_0= RULE_IDENT )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2582:1: (lv_ftype_20_0= RULE_IDENT )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2583:3: lv_ftype_20_0= RULE_IDENT
                    {
                    lv_ftype_20_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMetaSql6447); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2599:2: ( (lv_ifs_21_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2600:1: (lv_ifs_21_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2600:1: (lv_ifs_21_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2601:3: lv_ifs_21_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_4_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6473);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2618:6: ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2618:6: ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2618:7: ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2618:7: ( (lv_type_22_0= RULE_HASH ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2619:1: (lv_type_22_0= RULE_HASH )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2619:1: (lv_type_22_0= RULE_HASH )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2620:3: lv_type_22_0= RULE_HASH
                    {
                    lv_type_22_0=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleMetaSql6498); if (state.failed) return current;
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

                    this_NUMBER_23=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMetaSql6514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_23, grammarAccess.getMetaSqlAccess().getNUMBERTerminalRuleCall_5_1()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2640:1: ( (lv_ord_24_0= ruleOrdSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2641:1: (lv_ord_24_0= ruleOrdSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2641:1: (lv_ord_24_0= ruleOrdSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2642:3: lv_ord_24_0= ruleOrdSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getOrdOrdSqlParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrdSql_in_ruleMetaSql6534);
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2666:1: entryRuleIfSql returns [EObject current=null] : iv_ruleIfSql= ruleIfSql EOF ;
    public final EObject entryRuleIfSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2667:2: (iv_ruleIfSql= ruleIfSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2668:2: iv_ruleIfSql= ruleIfSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlRule()); 
            }
            pushFollow(FOLLOW_ruleIfSql_in_entryRuleIfSql6571);
            iv_ruleIfSql=ruleIfSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSql6581); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2675:1: ruleIfSql returns [EObject current=null] : ( (lv_sqls_0_0= ruleIfSqlFragment ) )+ ;
    public final EObject ruleIfSql() throws RecognitionException {
        EObject current = null;

        EObject lv_sqls_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2678:28: ( ( (lv_sqls_0_0= ruleIfSqlFragment ) )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2679:1: ( (lv_sqls_0_0= ruleIfSqlFragment ) )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2679:1: ( (lv_sqls_0_0= ruleIfSqlFragment ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_WS && LA34_0<=RULE_LBRACE)||(LA34_0>=RULE_QUESTI && LA34_0<=RULE_BAND)||(LA34_0>=RULE_HASH && LA34_0<=RULE_ESC_CHAR)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2680:1: (lv_sqls_0_0= ruleIfSqlFragment )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2680:1: (lv_sqls_0_0= ruleIfSqlFragment )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2681:3: lv_sqls_0_0= ruleIfSqlFragment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfSqlAccess().getSqlsIfSqlFragmentParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIfSqlFragment_in_ruleIfSql6626);
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
            	    if ( cnt34 >= 1 ) break loop34;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2705:1: entryRuleIfSqlFragment returns [EObject current=null] : iv_ruleIfSqlFragment= ruleIfSqlFragment EOF ;
    public final EObject entryRuleIfSqlFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSqlFragment = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2706:2: (iv_ruleIfSqlFragment= ruleIfSqlFragment EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2707:2: iv_ruleIfSqlFragment= ruleIfSqlFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleIfSqlFragment_in_entryRuleIfSqlFragment6662);
            iv_ruleIfSqlFragment=ruleIfSqlFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSqlFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSqlFragment6672); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2714:1: ruleIfSqlFragment returns [EObject current=null] : ( ( (lv_value_0_0= ruleIfSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) ) ) | (this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE ) ) ;
    public final EObject ruleIfSqlFragment() throws RecognitionException {
        EObject current = null;

        Token this_AT_1=null;
        Token this_STRING_3=null;
        Token this_COLON_5=null;
        Token this_PERCENT_7=null;
        Token this_LBRACE_9=null;
        Token this_RBRACE_11=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject lv_col_2_0 = null;

        EObject lv_cnst_4_0 = null;

        EObject lv_ident_6_0 = null;

        EObject lv_dbcol_8_0 = null;

        EObject lv_meta_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2717:28: ( ( ( (lv_value_0_0= ruleIfSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) ) ) | (this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2718:1: ( ( (lv_value_0_0= ruleIfSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) ) ) | (this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2718:1: ( ( (lv_value_0_0= ruleIfSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) ) ) | (this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE ) )
            int alt35=6;
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
            case RULE_AND:
            case RULE_OR:
            case RULE_ESC_CHAR:
                {
                alt35=1;
                }
                break;
            case RULE_AT:
                {
                alt35=2;
                }
                break;
            case RULE_STRING:
                {
                alt35=3;
                }
                break;
            case RULE_COLON:
                {
                alt35=4;
                }
                break;
            case RULE_PERCENT:
                {
                alt35=5;
                }
                break;
            case RULE_LBRACE:
                {
                alt35=6;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2718:2: ( (lv_value_0_0= ruleIfSqlValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2718:2: ( (lv_value_0_0= ruleIfSqlValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2719:1: (lv_value_0_0= ruleIfSqlValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2719:1: (lv_value_0_0= ruleIfSqlValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2720:3: lv_value_0_0= ruleIfSqlValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getValueIfSqlValueParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSqlValue_in_ruleIfSqlFragment6718);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2737:6: (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2737:6: (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2737:7: this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) )
                    {
                    this_AT_1=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleIfSqlFragment6736); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_1, grammarAccess.getIfSqlFragmentAccess().getATTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2741:1: ( (lv_col_2_0= ruleColumn ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2742:1: (lv_col_2_0= ruleColumn )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2742:1: (lv_col_2_0= ruleColumn )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2743:3: lv_col_2_0= ruleColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getColColumnParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleColumn_in_ruleIfSqlFragment6756);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2760:6: (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2760:6: (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2760:7: this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) )
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIfSqlFragment6775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getIfSqlFragmentAccess().getSTRINGTerminalRuleCall_2_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2764:1: ( (lv_cnst_4_0= ruleConstant ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2765:1: (lv_cnst_4_0= ruleConstant )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2765:1: (lv_cnst_4_0= ruleConstant )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2766:3: lv_cnst_4_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getCnstConstantParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleIfSqlFragment6795);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2783:6: (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2783:6: (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2783:7: this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) )
                    {
                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleIfSqlFragment6814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_5, grammarAccess.getIfSqlFragmentAccess().getCOLONTerminalRuleCall_3_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2787:1: ( (lv_ident_6_0= ruleIdentifier ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2788:1: (lv_ident_6_0= ruleIdentifier )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2788:1: (lv_ident_6_0= ruleIdentifier )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2789:3: lv_ident_6_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getIdentIdentifierParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleIfSqlFragment6834);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2806:6: (this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2806:6: (this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2806:7: this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) )
                    {
                    this_PERCENT_7=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleIfSqlFragment6853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PERCENT_7, grammarAccess.getIfSqlFragmentAccess().getPERCENTTerminalRuleCall_4_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2810:1: ( (lv_dbcol_8_0= ruleDatabaseColumn ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2811:1: (lv_dbcol_8_0= ruleDatabaseColumn )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2811:1: (lv_dbcol_8_0= ruleDatabaseColumn )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2812:3: lv_dbcol_8_0= ruleDatabaseColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getDbcolDatabaseColumnParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDatabaseColumn_in_ruleIfSqlFragment6873);
                    lv_dbcol_8_0=ruleDatabaseColumn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfSqlFragmentRule());
                      	        }
                             		set(
                             			current, 
                             			"dbcol",
                              		lv_dbcol_8_0, 
                              		"DatabaseColumn");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2829:6: (this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2829:6: (this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2829:7: this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE
                    {
                    this_LBRACE_9=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleIfSqlFragment6892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACE_9, grammarAccess.getIfSqlFragmentAccess().getLBRACETerminalRuleCall_5_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2833:1: ( (lv_meta_10_0= ruleIfMetaSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2834:1: (lv_meta_10_0= ruleIfMetaSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2834:1: (lv_meta_10_0= ruleIfMetaSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2835:3: lv_meta_10_0= ruleIfMetaSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getMetaIfMetaSqlParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfMetaSql_in_ruleIfSqlFragment6912);
                    lv_meta_10_0=ruleIfMetaSql();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfSqlFragmentRule());
                      	        }
                             		set(
                             			current, 
                             			"meta",
                              		lv_meta_10_0, 
                              		"IfMetaSql");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RBRACE_11=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleIfSqlFragment6923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RBRACE_11, grammarAccess.getIfSqlFragmentAccess().getRBRACETerminalRuleCall_5_2()); 
                          
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2863:1: entryRuleIfSqlValue returns [String current=null] : iv_ruleIfSqlValue= ruleIfSqlValue EOF ;
    public final String entryRuleIfSqlValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIfSqlValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2864:2: (iv_ruleIfSqlValue= ruleIfSqlValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2865:2: iv_ruleIfSqlValue= ruleIfSqlValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlValueRule()); 
            }
            pushFollow(FOLLOW_ruleIfSqlValue_in_entryRuleIfSqlValue6960);
            iv_ruleIfSqlValue=ruleIfSqlValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSqlValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSqlValue6971); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2872:1: ruleIfSqlValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_AND_19= RULE_AND | this_OR_20= RULE_OR | this_ESC_CHAR_21= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )* ) ;
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
        Token this_AND_19=null;
        Token this_OR_20=null;
        Token this_ESC_CHAR_21=null;
        Token this_REST_22=null;
        Token this_IDENT_DOT_23=null;
        Token this_IDENT_24=null;
        Token this_NUMBER_25=null;
        Token this_WS_26=null;
        Token this_SEMICOLON_27=null;
        Token this_COMMA_28=null;
        Token this_MINUS_29=null;
        Token this_PLUS_30=null;
        Token this_LPAREN_31=null;
        Token this_RPAREN_32=null;
        Token this_QUESTI_33=null;
        Token this_NOT_34=null;
        Token this_BAND_35=null;
        Token this_HASH_36=null;
        Token this_CARET_37=null;
        Token this_EQUALS_38=null;
        Token this_LESS_THAN_39=null;
        Token this_MORE_THAN_40=null;
        Token this_AND_41=null;
        Token this_OR_42=null;
        Token this_ESC_CHAR_43=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2875:28: ( ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_AND_19= RULE_AND | this_OR_20= RULE_OR | this_ESC_CHAR_21= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2876:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_AND_19= RULE_AND | this_OR_20= RULE_OR | this_ESC_CHAR_21= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2876:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_AND_19= RULE_AND | this_OR_20= RULE_OR | this_ESC_CHAR_21= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2876:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_AND_19= RULE_AND | this_OR_20= RULE_OR | this_ESC_CHAR_21= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2876:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_AND_19= RULE_AND | this_OR_20= RULE_OR | this_ESC_CHAR_21= RULE_ESC_CHAR )
            int alt36=22;
            switch ( input.LA(1) ) {
            case RULE_REST:
                {
                alt36=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt36=2;
                }
                break;
            case RULE_IDENT:
                {
                alt36=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt36=4;
                }
                break;
            case RULE_WS:
                {
                alt36=5;
                }
                break;
            case RULE_SEMICOLON:
                {
                alt36=6;
                }
                break;
            case RULE_COMMA:
                {
                alt36=7;
                }
                break;
            case RULE_MINUS:
                {
                alt36=8;
                }
                break;
            case RULE_PLUS:
                {
                alt36=9;
                }
                break;
            case RULE_LPAREN:
                {
                alt36=10;
                }
                break;
            case RULE_RPAREN:
                {
                alt36=11;
                }
                break;
            case RULE_QUESTI:
                {
                alt36=12;
                }
                break;
            case RULE_NOT:
                {
                alt36=13;
                }
                break;
            case RULE_BAND:
                {
                alt36=14;
                }
                break;
            case RULE_HASH:
                {
                alt36=15;
                }
                break;
            case RULE_CARET:
                {
                alt36=16;
                }
                break;
            case RULE_EQUALS:
                {
                alt36=17;
                }
                break;
            case RULE_LESS_THAN:
                {
                alt36=18;
                }
                break;
            case RULE_MORE_THAN:
                {
                alt36=19;
                }
                break;
            case RULE_AND:
                {
                alt36=20;
                }
                break;
            case RULE_OR:
                {
                alt36=21;
                }
                break;
            case RULE_ESC_CHAR:
                {
                alt36=22;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2876:7: this_REST_0= RULE_REST
                    {
                    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleIfSqlValue7012); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REST_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REST_0, grammarAccess.getIfSqlValueAccess().getRESTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2884:10: this_IDENT_DOT_1= RULE_IDENT_DOT
                    {
                    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleIfSqlValue7038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_DOT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_DOT_1, grammarAccess.getIfSqlValueAccess().getIDENT_DOTTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2892:10: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIfSqlValue7064); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_2, grammarAccess.getIfSqlValueAccess().getIDENTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2900:10: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIfSqlValue7090); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_3, grammarAccess.getIfSqlValueAccess().getNUMBERTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2908:10: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlValue7116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WS_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_4, grammarAccess.getIfSqlValueAccess().getWSTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2916:10: this_SEMICOLON_5= RULE_SEMICOLON
                    {
                    this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleIfSqlValue7142); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SEMICOLON_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_5, grammarAccess.getIfSqlValueAccess().getSEMICOLONTerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2924:10: this_COMMA_6= RULE_COMMA
                    {
                    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleIfSqlValue7168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_6, grammarAccess.getIfSqlValueAccess().getCOMMATerminalRuleCall_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2932:10: this_MINUS_7= RULE_MINUS
                    {
                    this_MINUS_7=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleIfSqlValue7194); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_7, grammarAccess.getIfSqlValueAccess().getMINUSTerminalRuleCall_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2940:10: this_PLUS_8= RULE_PLUS
                    {
                    this_PLUS_8=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleIfSqlValue7220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_8, grammarAccess.getIfSqlValueAccess().getPLUSTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2948:10: this_LPAREN_9= RULE_LPAREN
                    {
                    this_LPAREN_9=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleIfSqlValue7246); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LPAREN_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_9, grammarAccess.getIfSqlValueAccess().getLPARENTerminalRuleCall_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2956:10: this_RPAREN_10= RULE_RPAREN
                    {
                    this_RPAREN_10=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleIfSqlValue7272); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RPAREN_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_10, grammarAccess.getIfSqlValueAccess().getRPARENTerminalRuleCall_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2964:10: this_QUESTI_11= RULE_QUESTI
                    {
                    this_QUESTI_11=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleIfSqlValue7298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUESTI_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUESTI_11, grammarAccess.getIfSqlValueAccess().getQUESTITerminalRuleCall_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2972:10: this_NOT_12= RULE_NOT
                    {
                    this_NOT_12=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlValue7324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_12, grammarAccess.getIfSqlValueAccess().getNOTTerminalRuleCall_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2980:10: this_BAND_13= RULE_BAND
                    {
                    this_BAND_13=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleIfSqlValue7350); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BAND_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BAND_13, grammarAccess.getIfSqlValueAccess().getBANDTerminalRuleCall_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2988:10: this_HASH_14= RULE_HASH
                    {
                    this_HASH_14=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleIfSqlValue7376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASH_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASH_14, grammarAccess.getIfSqlValueAccess().getHASHTerminalRuleCall_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2996:10: this_CARET_15= RULE_CARET
                    {
                    this_CARET_15=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleIfSqlValue7402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CARET_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_15, grammarAccess.getIfSqlValueAccess().getCARETTerminalRuleCall_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3004:10: this_EQUALS_16= RULE_EQUALS
                    {
                    this_EQUALS_16=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleIfSqlValue7428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUALS_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_16, grammarAccess.getIfSqlValueAccess().getEQUALSTerminalRuleCall_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3012:10: this_LESS_THAN_17= RULE_LESS_THAN
                    {
                    this_LESS_THAN_17=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleIfSqlValue7454); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LESS_THAN_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LESS_THAN_17, grammarAccess.getIfSqlValueAccess().getLESS_THANTerminalRuleCall_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3020:10: this_MORE_THAN_18= RULE_MORE_THAN
                    {
                    this_MORE_THAN_18=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleIfSqlValue7480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MORE_THAN_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MORE_THAN_18, grammarAccess.getIfSqlValueAccess().getMORE_THANTerminalRuleCall_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3028:10: this_AND_19= RULE_AND
                    {
                    this_AND_19=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleIfSqlValue7506); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AND_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AND_19, grammarAccess.getIfSqlValueAccess().getANDTerminalRuleCall_0_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3036:10: this_OR_20= RULE_OR
                    {
                    this_OR_20=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleIfSqlValue7532); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_OR_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OR_20, grammarAccess.getIfSqlValueAccess().getORTerminalRuleCall_0_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3044:10: this_ESC_CHAR_21= RULE_ESC_CHAR
                    {
                    this_ESC_CHAR_21=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleIfSqlValue7558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESC_CHAR_21);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESC_CHAR_21, grammarAccess.getIfSqlValueAccess().getESC_CHARTerminalRuleCall_0_21()); 
                          
                    }

                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3051:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )*
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3051:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3072:23: (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR )
            	    int alt37=22;
            	    switch ( input.LA(1) ) {
            	    case RULE_REST:
            	        {
            	        alt37=1;
            	        }
            	        break;
            	    case RULE_IDENT_DOT:
            	        {
            	        alt37=2;
            	        }
            	        break;
            	    case RULE_IDENT:
            	        {
            	        alt37=3;
            	        }
            	        break;
            	    case RULE_NUMBER:
            	        {
            	        alt37=4;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt37=5;
            	        }
            	        break;
            	    case RULE_SEMICOLON:
            	        {
            	        alt37=6;
            	        }
            	        break;
            	    case RULE_COMMA:
            	        {
            	        alt37=7;
            	        }
            	        break;
            	    case RULE_MINUS:
            	        {
            	        alt37=8;
            	        }
            	        break;
            	    case RULE_PLUS:
            	        {
            	        alt37=9;
            	        }
            	        break;
            	    case RULE_LPAREN:
            	        {
            	        alt37=10;
            	        }
            	        break;
            	    case RULE_RPAREN:
            	        {
            	        alt37=11;
            	        }
            	        break;
            	    case RULE_QUESTI:
            	        {
            	        alt37=12;
            	        }
            	        break;
            	    case RULE_NOT:
            	        {
            	        alt37=13;
            	        }
            	        break;
            	    case RULE_BAND:
            	        {
            	        alt37=14;
            	        }
            	        break;
            	    case RULE_HASH:
            	        {
            	        alt37=15;
            	        }
            	        break;
            	    case RULE_CARET:
            	        {
            	        alt37=16;
            	        }
            	        break;
            	    case RULE_EQUALS:
            	        {
            	        alt37=17;
            	        }
            	        break;
            	    case RULE_LESS_THAN:
            	        {
            	        alt37=18;
            	        }
            	        break;
            	    case RULE_MORE_THAN:
            	        {
            	        alt37=19;
            	        }
            	        break;
            	    case RULE_AND:
            	        {
            	        alt37=20;
            	        }
            	        break;
            	    case RULE_OR:
            	        {
            	        alt37=21;
            	        }
            	        break;
            	    case RULE_ESC_CHAR:
            	        {
            	        alt37=22;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt37) {
            	        case 1 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3072:28: this_REST_22= RULE_REST
            	            {
            	            this_REST_22=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleIfSqlValue7734); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REST_22);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REST_22, grammarAccess.getIfSqlValueAccess().getRESTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3080:10: this_IDENT_DOT_23= RULE_IDENT_DOT
            	            {
            	            this_IDENT_DOT_23=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleIfSqlValue7760); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_DOT_23);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_DOT_23, grammarAccess.getIfSqlValueAccess().getIDENT_DOTTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3088:10: this_IDENT_24= RULE_IDENT
            	            {
            	            this_IDENT_24=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIfSqlValue7786); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_24);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_24, grammarAccess.getIfSqlValueAccess().getIDENTTerminalRuleCall_1_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3096:10: this_NUMBER_25= RULE_NUMBER
            	            {
            	            this_NUMBER_25=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIfSqlValue7812); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NUMBER_25);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NUMBER_25, grammarAccess.getIfSqlValueAccess().getNUMBERTerminalRuleCall_1_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3104:10: this_WS_26= RULE_WS
            	            {
            	            this_WS_26=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlValue7838); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_WS_26);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_WS_26, grammarAccess.getIfSqlValueAccess().getWSTerminalRuleCall_1_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3112:10: this_SEMICOLON_27= RULE_SEMICOLON
            	            {
            	            this_SEMICOLON_27=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleIfSqlValue7864); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_SEMICOLON_27);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_SEMICOLON_27, grammarAccess.getIfSqlValueAccess().getSEMICOLONTerminalRuleCall_1_0_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3120:10: this_COMMA_28= RULE_COMMA
            	            {
            	            this_COMMA_28=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleIfSqlValue7890); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COMMA_28);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COMMA_28, grammarAccess.getIfSqlValueAccess().getCOMMATerminalRuleCall_1_0_6()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3128:10: this_MINUS_29= RULE_MINUS
            	            {
            	            this_MINUS_29=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleIfSqlValue7916); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MINUS_29);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MINUS_29, grammarAccess.getIfSqlValueAccess().getMINUSTerminalRuleCall_1_0_7()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3136:10: this_PLUS_30= RULE_PLUS
            	            {
            	            this_PLUS_30=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleIfSqlValue7942); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PLUS_30);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PLUS_30, grammarAccess.getIfSqlValueAccess().getPLUSTerminalRuleCall_1_0_8()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3144:10: this_LPAREN_31= RULE_LPAREN
            	            {
            	            this_LPAREN_31=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleIfSqlValue7968); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LPAREN_31);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LPAREN_31, grammarAccess.getIfSqlValueAccess().getLPARENTerminalRuleCall_1_0_9()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3152:10: this_RPAREN_32= RULE_RPAREN
            	            {
            	            this_RPAREN_32=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleIfSqlValue7994); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RPAREN_32);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RPAREN_32, grammarAccess.getIfSqlValueAccess().getRPARENTerminalRuleCall_1_0_10()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3160:10: this_QUESTI_33= RULE_QUESTI
            	            {
            	            this_QUESTI_33=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleIfSqlValue8020); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_QUESTI_33);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_QUESTI_33, grammarAccess.getIfSqlValueAccess().getQUESTITerminalRuleCall_1_0_11()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 13 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3168:10: this_NOT_34= RULE_NOT
            	            {
            	            this_NOT_34=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlValue8046); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NOT_34);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NOT_34, grammarAccess.getIfSqlValueAccess().getNOTTerminalRuleCall_1_0_12()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 14 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3176:10: this_BAND_35= RULE_BAND
            	            {
            	            this_BAND_35=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleIfSqlValue8072); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BAND_35);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BAND_35, grammarAccess.getIfSqlValueAccess().getBANDTerminalRuleCall_1_0_13()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 15 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3184:10: this_HASH_36= RULE_HASH
            	            {
            	            this_HASH_36=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleIfSqlValue8098); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_HASH_36);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_HASH_36, grammarAccess.getIfSqlValueAccess().getHASHTerminalRuleCall_1_0_14()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 16 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3192:10: this_CARET_37= RULE_CARET
            	            {
            	            this_CARET_37=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleIfSqlValue8124); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_CARET_37);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_CARET_37, grammarAccess.getIfSqlValueAccess().getCARETTerminalRuleCall_1_0_15()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 17 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3200:10: this_EQUALS_38= RULE_EQUALS
            	            {
            	            this_EQUALS_38=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleIfSqlValue8150); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_EQUALS_38);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_EQUALS_38, grammarAccess.getIfSqlValueAccess().getEQUALSTerminalRuleCall_1_0_16()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 18 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3208:10: this_LESS_THAN_39= RULE_LESS_THAN
            	            {
            	            this_LESS_THAN_39=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleIfSqlValue8176); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LESS_THAN_39);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LESS_THAN_39, grammarAccess.getIfSqlValueAccess().getLESS_THANTerminalRuleCall_1_0_17()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 19 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3216:10: this_MORE_THAN_40= RULE_MORE_THAN
            	            {
            	            this_MORE_THAN_40=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleIfSqlValue8202); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MORE_THAN_40);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MORE_THAN_40, grammarAccess.getIfSqlValueAccess().getMORE_THANTerminalRuleCall_1_0_18()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 20 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3224:10: this_AND_41= RULE_AND
            	            {
            	            this_AND_41=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleIfSqlValue8228); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AND_41);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AND_41, grammarAccess.getIfSqlValueAccess().getANDTerminalRuleCall_1_0_19()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 21 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3232:10: this_OR_42= RULE_OR
            	            {
            	            this_OR_42=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleIfSqlValue8254); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_OR_42);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_OR_42, grammarAccess.getIfSqlValueAccess().getORTerminalRuleCall_1_0_20()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 22 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3240:10: this_ESC_CHAR_43= RULE_ESC_CHAR
            	            {
            	            this_ESC_CHAR_43=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleIfSqlValue8280); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ESC_CHAR_43);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ESC_CHAR_43, grammarAccess.getIfSqlValueAccess().getESC_CHARTerminalRuleCall_1_0_21()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3255:1: entryRuleIfMetaSql returns [EObject current=null] : iv_ruleIfMetaSql= ruleIfMetaSql EOF ;
    public final EObject entryRuleIfMetaSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfMetaSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3256:2: (iv_ruleIfMetaSql= ruleIfMetaSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3257:2: iv_ruleIfMetaSql= ruleIfMetaSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfMetaSqlRule()); 
            }
            pushFollow(FOLLOW_ruleIfMetaSql_in_entryRuleIfMetaSql8328);
            iv_ruleIfMetaSql=ruleIfMetaSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfMetaSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfMetaSql8338); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3264:1: ruleIfMetaSql returns [EObject current=null] : ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3267:28: ( ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3268:1: ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3268:1: ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) )
            int alt43=4;
            switch ( input.LA(1) ) {
            case RULE_WS:
                {
                alt43=1;
                }
                break;
            case RULE_QUESTI:
                {
                alt43=2;
                }
                break;
            case RULE_BAND:
                {
                alt43=3;
                }
                break;
            case RULE_BOR:
                {
                alt43=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3268:2: (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3268:2: (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3268:3: this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )*
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfMetaSql8375); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_0, grammarAccess.getIfMetaSqlAccess().getWSTerminalRuleCall_0_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3272:1: ( (lv_ifs_1_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3273:1: (lv_ifs_1_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3273:1: (lv_ifs_1_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3274:3: lv_ifs_1_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8395);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3290:2: (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_BOR) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3290:3: this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_2=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql8407); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_2, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_0_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3294:1: ( (lv_ifs_3_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3295:1: (lv_ifs_3_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3295:1: (lv_ifs_3_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3296:3: lv_ifs_3_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8427);
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
                    	    break loop39;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3313:6: ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3313:6: ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3313:7: ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3313:7: ( (lv_type_4_0= RULE_QUESTI ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3314:1: (lv_type_4_0= RULE_QUESTI )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3314:1: (lv_type_4_0= RULE_QUESTI )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3315:3: lv_type_4_0= RULE_QUESTI
                    {
                    lv_type_4_0=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleIfMetaSql8454); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3331:2: ( (lv_cond_5_0= ruleIfSqlCond ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3332:1: (lv_cond_5_0= ruleIfSqlCond )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3332:1: (lv_cond_5_0= ruleIfSqlCond )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3333:3: lv_cond_5_0= ruleIfSqlCond
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getCondIfSqlCondParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSqlCond_in_ruleIfMetaSql8480);
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

                    this_BOR_6=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql8491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_6, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_1_2()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3353:1: ( (lv_ifs_7_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3354:1: (lv_ifs_7_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3354:1: (lv_ifs_7_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3355:3: lv_ifs_7_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8511);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3371:2: (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==RULE_BOR) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3371:3: this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_8=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql8523); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_8, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_1_4_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3375:1: ( (lv_ifs_9_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3376:1: (lv_ifs_9_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3376:1: (lv_ifs_9_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3377:3: lv_ifs_9_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_1_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8543);
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
                    	    break loop40;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3394:6: ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3394:6: ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3394:7: ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3394:7: ( (lv_type_10_0= RULE_BAND ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3395:1: (lv_type_10_0= RULE_BAND )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3395:1: (lv_type_10_0= RULE_BAND )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3396:3: lv_type_10_0= RULE_BAND
                    {
                    lv_type_10_0=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleIfMetaSql8570); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3412:2: ( (lv_ifs_11_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3413:1: (lv_ifs_11_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3413:1: (lv_ifs_11_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3414:3: lv_ifs_11_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8596);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3430:2: (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_BOR) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3430:3: this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_12=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql8608); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_12, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_2_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3434:1: ( (lv_ifs_13_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3435:1: (lv_ifs_13_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3435:1: (lv_ifs_13_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3436:3: lv_ifs_13_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8628);
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
                    	    break loop41;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3453:6: ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3453:6: ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3453:7: ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3453:7: ( (lv_type_14_0= RULE_BOR ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3454:1: (lv_type_14_0= RULE_BOR )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3454:1: (lv_type_14_0= RULE_BOR )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3455:3: lv_type_14_0= RULE_BOR
                    {
                    lv_type_14_0=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql8655); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3471:2: ( (lv_ifs_15_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3472:1: (lv_ifs_15_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3472:1: (lv_ifs_15_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3473:3: lv_ifs_15_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8681);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3489:2: (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_BOR) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3489:3: this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_16=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql8693); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_16, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_3_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3493:1: ( (lv_ifs_17_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3494:1: (lv_ifs_17_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3494:1: (lv_ifs_17_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3495:3: lv_ifs_17_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8713);
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
                    	    break loop42;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3519:1: entryRuleIfSqlCond returns [EObject current=null] : iv_ruleIfSqlCond= ruleIfSqlCond EOF ;
    public final EObject entryRuleIfSqlCond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSqlCond = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3520:2: (iv_ruleIfSqlCond= ruleIfSqlCond EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3521:2: iv_ruleIfSqlCond= ruleIfSqlCond EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlCondRule()); 
            }
            pushFollow(FOLLOW_ruleIfSqlCond_in_entryRuleIfSqlCond8752);
            iv_ruleIfSqlCond=ruleIfSqlCond();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSqlCond; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSqlCond8762); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3528:1: ruleIfSqlCond returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )* ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3531:28: ( ( (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3532:1: ( (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3532:1: ( (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3532:2: (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3532:2: (this_WS_0= RULE_WS )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_WS) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3532:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlCond8799); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_0, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3536:3: ( (lv_bool1_1_0= ruleIfSqlBool ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3537:1: (lv_bool1_1_0= ruleIfSqlBool )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3537:1: (lv_bool1_1_0= ruleIfSqlBool )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3538:3: lv_bool1_1_0= ruleIfSqlBool
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfSqlCondAccess().getBool1IfSqlBoolParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIfSqlBool_in_ruleIfSqlCond8821);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3554:2: (this_WS_2= RULE_WS )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_WS) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3554:3: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlCond8833); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_2, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3558:3: ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_AND && LA49_0<=RULE_OR)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3558:4: ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )*
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3558:4: ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3559:1: ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3559:1: ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3560:1: (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3560:1: (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR )
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==RULE_AND) ) {
            	        alt46=1;
            	    }
            	    else if ( (LA46_0==RULE_OR) ) {
            	        alt46=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 46, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3561:3: lv_oper_3_1= RULE_AND
            	            {
            	            lv_oper_3_1=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleIfSqlCond8854); if (state.failed) return current;
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
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3576:8: lv_oper_3_2= RULE_OR
            	            {
            	            lv_oper_3_2=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleIfSqlCond8874); if (state.failed) return current;
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

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3594:2: (this_WS_4= RULE_WS )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==RULE_WS) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3594:3: this_WS_4= RULE_WS
            	    	    {
            	    	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlCond8894); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_4, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_3_1()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop47;
            	        }
            	    } while (true);

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3598:3: ( (lv_bool2_5_0= ruleIfSqlBool ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3599:1: (lv_bool2_5_0= ruleIfSqlBool )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3599:1: (lv_bool2_5_0= ruleIfSqlBool )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3600:3: lv_bool2_5_0= ruleIfSqlBool
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfSqlCondAccess().getBool2IfSqlBoolParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIfSqlBool_in_ruleIfSqlCond8916);
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

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3616:2: (this_WS_6= RULE_WS )*
            	    loop48:
            	    do {
            	        int alt48=2;
            	        int LA48_0 = input.LA(1);

            	        if ( (LA48_0==RULE_WS) ) {
            	            alt48=1;
            	        }


            	        switch (alt48) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3616:3: this_WS_6= RULE_WS
            	    	    {
            	    	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlCond8928); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_6, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_3_3()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop48;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3628:1: entryRuleIfSqlBool returns [EObject current=null] : iv_ruleIfSqlBool= ruleIfSqlBool EOF ;
    public final EObject entryRuleIfSqlBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSqlBool = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3629:2: (iv_ruleIfSqlBool= ruleIfSqlBool EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3630:2: iv_ruleIfSqlBool= ruleIfSqlBool EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlBoolRule()); 
            }
            pushFollow(FOLLOW_ruleIfSqlBool_in_entryRuleIfSqlBool8967);
            iv_ruleIfSqlBool=ruleIfSqlBool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSqlBool; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSqlBool8977); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3637:1: ruleIfSqlBool returns [EObject current=null] : ( ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) ) | ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN ) ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3640:28: ( ( ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) ) | ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3641:1: ( ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) ) | ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3641:1: ( ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) ) | ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN ) )
            int alt53=3;
            switch ( input.LA(1) ) {
            case RULE_NOT:
                {
                switch ( input.LA(2) ) {
                case RULE_LPAREN:
                    {
                    alt53=3;
                    }
                    break;
                case RULE_COLON:
                    {
                    alt53=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt53=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
                {
                alt53=1;
                }
                break;
            case RULE_COLON:
                {
                alt53=2;
                }
                break;
            case RULE_LPAREN:
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3641:2: ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3641:2: ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3641:3: ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3641:3: ( (lv_not_0_0= RULE_NOT ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_NOT) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3642:1: (lv_not_0_0= RULE_NOT )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3642:1: (lv_not_0_0= RULE_NOT )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3643:3: lv_not_0_0= RULE_NOT
                            {
                            lv_not_0_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlBool9020); if (state.failed) return current;
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

                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIfSqlBool9037); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getIfSqlBoolAccess().getSTRINGTerminalRuleCall_0_1()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3663:1: ( (lv_cnst_2_0= ruleConstant ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3664:1: (lv_cnst_2_0= ruleConstant )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3664:1: (lv_cnst_2_0= ruleConstant )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3665:3: lv_cnst_2_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlBoolAccess().getCnstConstantParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleIfSqlBool9057);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3682:6: ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3682:6: ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3682:7: ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3682:7: ( (lv_not_3_0= RULE_NOT ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==RULE_NOT) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3683:1: (lv_not_3_0= RULE_NOT )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3683:1: (lv_not_3_0= RULE_NOT )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3684:3: lv_not_3_0= RULE_NOT
                            {
                            lv_not_3_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlBool9082); if (state.failed) return current;
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

                    this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleIfSqlBool9099); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_4, grammarAccess.getIfSqlBoolAccess().getCOLONTerminalRuleCall_1_1()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3704:1: ( (lv_ident_5_0= ruleIdentifier ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3705:1: (lv_ident_5_0= ruleIdentifier )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3705:1: (lv_ident_5_0= ruleIdentifier )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3706:3: lv_ident_5_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlBoolAccess().getIdentIdentifierParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleIfSqlBool9119);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3723:6: ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3723:6: ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3723:7: ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3723:7: ( (lv_not_6_0= RULE_NOT ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_NOT) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3724:1: (lv_not_6_0= RULE_NOT )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3724:1: (lv_not_6_0= RULE_NOT )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3725:3: lv_not_6_0= RULE_NOT
                            {
                            lv_not_6_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlBool9144); if (state.failed) return current;
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

                    this_LPAREN_7=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleIfSqlBool9161); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_7, grammarAccess.getIfSqlBoolAccess().getLPARENTerminalRuleCall_2_1()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3745:1: ( (lv_cond_8_0= ruleIfSqlCond ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3746:1: (lv_cond_8_0= ruleIfSqlCond )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3746:1: (lv_cond_8_0= ruleIfSqlCond )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3747:3: lv_cond_8_0= ruleIfSqlCond
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlBoolAccess().getCondIfSqlCondParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSqlCond_in_ruleIfSqlBool9181);
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

                    this_RPAREN_9=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleIfSqlBool9192); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3775:1: entryRuleOrdSql returns [EObject current=null] : iv_ruleOrdSql= ruleOrdSql EOF ;
    public final EObject entryRuleOrdSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrdSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3776:2: (iv_ruleOrdSql= ruleOrdSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3777:2: iv_ruleOrdSql= ruleOrdSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrdSqlRule()); 
            }
            pushFollow(FOLLOW_ruleOrdSql_in_entryRuleOrdSql9228);
            iv_ruleOrdSql=ruleOrdSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrdSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrdSql9238); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3784:1: ruleOrdSql returns [EObject current=null] : ( (lv_sqls_0_0= ruleOrdSql2 ) )+ ;
    public final EObject ruleOrdSql() throws RecognitionException {
        EObject current = null;

        EObject lv_sqls_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3787:28: ( ( (lv_sqls_0_0= ruleOrdSql2 ) )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3788:1: ( (lv_sqls_0_0= ruleOrdSql2 ) )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3788:1: ( (lv_sqls_0_0= ruleOrdSql2 ) )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_WS && LA54_0<=RULE_LBRACE)||(LA54_0>=RULE_QUESTI && LA54_0<=RULE_ESC_CHAR)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3789:1: (lv_sqls_0_0= ruleOrdSql2 )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3789:1: (lv_sqls_0_0= ruleOrdSql2 )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3790:3: lv_sqls_0_0= ruleOrdSql2
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrdSqlAccess().getSqlsOrdSql2ParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrdSql2_in_ruleOrdSql9283);
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
            	    if ( cnt54 >= 1 ) break loop54;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3814:1: entryRuleOrdSql2 returns [EObject current=null] : iv_ruleOrdSql2= ruleOrdSql2 EOF ;
    public final EObject entryRuleOrdSql2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrdSql2 = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3815:2: (iv_ruleOrdSql2= ruleOrdSql2 EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3816:2: iv_ruleOrdSql2= ruleOrdSql2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrdSql2Rule()); 
            }
            pushFollow(FOLLOW_ruleOrdSql2_in_entryRuleOrdSql29319);
            iv_ruleOrdSql2=ruleOrdSql2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrdSql2; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrdSql29329); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3823:1: ruleOrdSql2 returns [EObject current=null] : ( ( (lv_value_0_0= ruleOrdSqlValue ) ) | (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) ) | (this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) ) ) ) ;
    public final EObject ruleOrdSql2() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;
        Token this_COLON_3=null;
        Token this_PERCENT_5=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject lv_cnst_2_0 = null;

        EObject lv_ident_4_0 = null;

        EObject lv_dbcol_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3826:28: ( ( ( (lv_value_0_0= ruleOrdSqlValue ) ) | (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) ) | (this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) ) ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3827:1: ( ( (lv_value_0_0= ruleOrdSqlValue ) ) | (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) ) | (this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) ) ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3827:1: ( ( (lv_value_0_0= ruleOrdSqlValue ) ) | (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) ) | (this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) ) ) )
            int alt55=4;
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
            case RULE_AND:
            case RULE_OR:
            case RULE_ESC_CHAR:
                {
                alt55=1;
                }
                break;
            case RULE_STRING:
                {
                alt55=2;
                }
                break;
            case RULE_COLON:
                {
                alt55=3;
                }
                break;
            case RULE_PERCENT:
                {
                alt55=4;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3827:2: ( (lv_value_0_0= ruleOrdSqlValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3827:2: ( (lv_value_0_0= ruleOrdSqlValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3828:1: (lv_value_0_0= ruleOrdSqlValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3828:1: (lv_value_0_0= ruleOrdSqlValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3829:3: lv_value_0_0= ruleOrdSqlValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrdSql2Access().getValueOrdSqlValueParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrdSqlValue_in_ruleOrdSql29375);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3846:6: (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3846:6: (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3846:7: this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) )
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOrdSql29393); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getOrdSql2Access().getSTRINGTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3850:1: ( (lv_cnst_2_0= ruleConstant ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3851:1: (lv_cnst_2_0= ruleConstant )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3851:1: (lv_cnst_2_0= ruleConstant )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3852:3: lv_cnst_2_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrdSql2Access().getCnstConstantParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleOrdSql29413);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3869:6: (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3869:6: (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3869:7: this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) )
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleOrdSql29432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_3, grammarAccess.getOrdSql2Access().getCOLONTerminalRuleCall_2_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3873:1: ( (lv_ident_4_0= ruleIdentifier ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3874:1: (lv_ident_4_0= ruleIdentifier )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3874:1: (lv_ident_4_0= ruleIdentifier )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3875:3: lv_ident_4_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrdSql2Access().getIdentIdentifierParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleOrdSql29452);
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
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3892:6: (this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3892:6: (this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3892:7: this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) )
                    {
                    this_PERCENT_5=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleOrdSql29471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PERCENT_5, grammarAccess.getOrdSql2Access().getPERCENTTerminalRuleCall_3_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3896:1: ( (lv_dbcol_6_0= ruleDatabaseColumn ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3897:1: (lv_dbcol_6_0= ruleDatabaseColumn )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3897:1: (lv_dbcol_6_0= ruleDatabaseColumn )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3898:3: lv_dbcol_6_0= ruleDatabaseColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrdSql2Access().getDbcolDatabaseColumnParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDatabaseColumn_in_ruleOrdSql29491);
                    lv_dbcol_6_0=ruleDatabaseColumn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOrdSql2Rule());
                      	        }
                             		set(
                             			current, 
                             			"dbcol",
                              		lv_dbcol_6_0, 
                              		"DatabaseColumn");
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3922:1: entryRuleOrdSqlValue returns [String current=null] : iv_ruleOrdSqlValue= ruleOrdSqlValue EOF ;
    public final String entryRuleOrdSqlValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrdSqlValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3923:2: (iv_ruleOrdSqlValue= ruleOrdSqlValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3924:2: iv_ruleOrdSqlValue= ruleOrdSqlValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrdSqlValueRule()); 
            }
            pushFollow(FOLLOW_ruleOrdSqlValue_in_entryRuleOrdSqlValue9529);
            iv_ruleOrdSqlValue=ruleOrdSqlValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrdSqlValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrdSqlValue9540); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3931:1: ruleOrdSqlValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_AND_22= RULE_AND | this_OR_23= RULE_OR | this_ESC_CHAR_24= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )* ) ;
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
        Token this_AND_22=null;
        Token this_OR_23=null;
        Token this_ESC_CHAR_24=null;
        Token this_REST_25=null;
        Token this_IDENT_DOT_26=null;
        Token this_IDENT_27=null;
        Token this_NUMBER_28=null;
        Token this_WS_29=null;
        Token this_SEMICOLON_30=null;
        Token this_COMMA_31=null;
        Token this_MINUS_32=null;
        Token this_PLUS_33=null;
        Token this_LPAREN_34=null;
        Token this_RPAREN_35=null;
        Token this_LBRACE_36=null;
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
        Token this_AND_47=null;
        Token this_OR_48=null;
        Token this_ESC_CHAR_49=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3934:28: ( ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_AND_22= RULE_AND | this_OR_23= RULE_OR | this_ESC_CHAR_24= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3935:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_AND_22= RULE_AND | this_OR_23= RULE_OR | this_ESC_CHAR_24= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3935:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_AND_22= RULE_AND | this_OR_23= RULE_OR | this_ESC_CHAR_24= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3935:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_AND_22= RULE_AND | this_OR_23= RULE_OR | this_ESC_CHAR_24= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3935:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_AND_22= RULE_AND | this_OR_23= RULE_OR | this_ESC_CHAR_24= RULE_ESC_CHAR )
            int alt56=25;
            switch ( input.LA(1) ) {
            case RULE_REST:
                {
                alt56=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt56=2;
                }
                break;
            case RULE_IDENT:
                {
                alt56=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt56=4;
                }
                break;
            case RULE_WS:
                {
                alt56=5;
                }
                break;
            case RULE_SEMICOLON:
                {
                alt56=6;
                }
                break;
            case RULE_COMMA:
                {
                alt56=7;
                }
                break;
            case RULE_MINUS:
                {
                alt56=8;
                }
                break;
            case RULE_PLUS:
                {
                alt56=9;
                }
                break;
            case RULE_LPAREN:
                {
                alt56=10;
                }
                break;
            case RULE_RPAREN:
                {
                alt56=11;
                }
                break;
            case RULE_LBRACE:
                {
                alt56=12;
                }
                break;
            case RULE_QUESTI:
                {
                alt56=13;
                }
                break;
            case RULE_NOT:
                {
                alt56=14;
                }
                break;
            case RULE_BAND:
                {
                alt56=15;
                }
                break;
            case RULE_BOR:
                {
                alt56=16;
                }
                break;
            case RULE_HASH:
                {
                alt56=17;
                }
                break;
            case RULE_AT:
                {
                alt56=18;
                }
                break;
            case RULE_CARET:
                {
                alt56=19;
                }
                break;
            case RULE_EQUALS:
                {
                alt56=20;
                }
                break;
            case RULE_LESS_THAN:
                {
                alt56=21;
                }
                break;
            case RULE_MORE_THAN:
                {
                alt56=22;
                }
                break;
            case RULE_AND:
                {
                alt56=23;
                }
                break;
            case RULE_OR:
                {
                alt56=24;
                }
                break;
            case RULE_ESC_CHAR:
                {
                alt56=25;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3935:7: this_REST_0= RULE_REST
                    {
                    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleOrdSqlValue9581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REST_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REST_0, grammarAccess.getOrdSqlValueAccess().getRESTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3943:10: this_IDENT_DOT_1= RULE_IDENT_DOT
                    {
                    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleOrdSqlValue9607); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_DOT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_DOT_1, grammarAccess.getOrdSqlValueAccess().getIDENT_DOTTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3951:10: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleOrdSqlValue9633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_2, grammarAccess.getOrdSqlValueAccess().getIDENTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3959:10: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleOrdSqlValue9659); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_3, grammarAccess.getOrdSqlValueAccess().getNUMBERTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3967:10: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleOrdSqlValue9685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WS_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_4, grammarAccess.getOrdSqlValueAccess().getWSTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3975:10: this_SEMICOLON_5= RULE_SEMICOLON
                    {
                    this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleOrdSqlValue9711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SEMICOLON_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_5, grammarAccess.getOrdSqlValueAccess().getSEMICOLONTerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3983:10: this_COMMA_6= RULE_COMMA
                    {
                    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleOrdSqlValue9737); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_6, grammarAccess.getOrdSqlValueAccess().getCOMMATerminalRuleCall_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3991:10: this_MINUS_7= RULE_MINUS
                    {
                    this_MINUS_7=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleOrdSqlValue9763); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_7, grammarAccess.getOrdSqlValueAccess().getMINUSTerminalRuleCall_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3999:10: this_PLUS_8= RULE_PLUS
                    {
                    this_PLUS_8=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleOrdSqlValue9789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_8, grammarAccess.getOrdSqlValueAccess().getPLUSTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4007:10: this_LPAREN_9= RULE_LPAREN
                    {
                    this_LPAREN_9=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOrdSqlValue9815); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LPAREN_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_9, grammarAccess.getOrdSqlValueAccess().getLPARENTerminalRuleCall_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4015:10: this_RPAREN_10= RULE_RPAREN
                    {
                    this_RPAREN_10=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOrdSqlValue9841); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RPAREN_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_10, grammarAccess.getOrdSqlValueAccess().getRPARENTerminalRuleCall_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4023:10: this_LBRACE_11= RULE_LBRACE
                    {
                    this_LBRACE_11=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleOrdSqlValue9867); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LBRACE_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACE_11, grammarAccess.getOrdSqlValueAccess().getLBRACETerminalRuleCall_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4031:10: this_QUESTI_12= RULE_QUESTI
                    {
                    this_QUESTI_12=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleOrdSqlValue9893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUESTI_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUESTI_12, grammarAccess.getOrdSqlValueAccess().getQUESTITerminalRuleCall_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4039:10: this_NOT_13= RULE_NOT
                    {
                    this_NOT_13=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleOrdSqlValue9919); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_13, grammarAccess.getOrdSqlValueAccess().getNOTTerminalRuleCall_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4047:10: this_BAND_14= RULE_BAND
                    {
                    this_BAND_14=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleOrdSqlValue9945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BAND_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BAND_14, grammarAccess.getOrdSqlValueAccess().getBANDTerminalRuleCall_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4055:10: this_BOR_15= RULE_BOR
                    {
                    this_BOR_15=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleOrdSqlValue9971); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOR_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_15, grammarAccess.getOrdSqlValueAccess().getBORTerminalRuleCall_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4063:10: this_HASH_16= RULE_HASH
                    {
                    this_HASH_16=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleOrdSqlValue9997); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASH_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASH_16, grammarAccess.getOrdSqlValueAccess().getHASHTerminalRuleCall_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4071:10: this_AT_17= RULE_AT
                    {
                    this_AT_17=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleOrdSqlValue10023); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AT_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_17, grammarAccess.getOrdSqlValueAccess().getATTerminalRuleCall_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4079:10: this_CARET_18= RULE_CARET
                    {
                    this_CARET_18=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleOrdSqlValue10049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CARET_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_18, grammarAccess.getOrdSqlValueAccess().getCARETTerminalRuleCall_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4087:10: this_EQUALS_19= RULE_EQUALS
                    {
                    this_EQUALS_19=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleOrdSqlValue10075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUALS_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_19, grammarAccess.getOrdSqlValueAccess().getEQUALSTerminalRuleCall_0_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4095:10: this_LESS_THAN_20= RULE_LESS_THAN
                    {
                    this_LESS_THAN_20=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleOrdSqlValue10101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LESS_THAN_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LESS_THAN_20, grammarAccess.getOrdSqlValueAccess().getLESS_THANTerminalRuleCall_0_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4103:10: this_MORE_THAN_21= RULE_MORE_THAN
                    {
                    this_MORE_THAN_21=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleOrdSqlValue10127); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MORE_THAN_21);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MORE_THAN_21, grammarAccess.getOrdSqlValueAccess().getMORE_THANTerminalRuleCall_0_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4111:10: this_AND_22= RULE_AND
                    {
                    this_AND_22=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleOrdSqlValue10153); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AND_22);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AND_22, grammarAccess.getOrdSqlValueAccess().getANDTerminalRuleCall_0_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4119:10: this_OR_23= RULE_OR
                    {
                    this_OR_23=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleOrdSqlValue10179); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_OR_23);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OR_23, grammarAccess.getOrdSqlValueAccess().getORTerminalRuleCall_0_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4127:10: this_ESC_CHAR_24= RULE_ESC_CHAR
                    {
                    this_ESC_CHAR_24=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleOrdSqlValue10205); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESC_CHAR_24);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESC_CHAR_24, grammarAccess.getOrdSqlValueAccess().getESC_CHARTerminalRuleCall_0_24()); 
                          
                    }

                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4134:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )*
            loop58:
            do {
                int alt58=2;
                alt58 = dfa58.predict(input);
                switch (alt58) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4134:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4158:23: (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR )
            	    int alt57=25;
            	    switch ( input.LA(1) ) {
            	    case RULE_REST:
            	        {
            	        alt57=1;
            	        }
            	        break;
            	    case RULE_IDENT_DOT:
            	        {
            	        alt57=2;
            	        }
            	        break;
            	    case RULE_IDENT:
            	        {
            	        alt57=3;
            	        }
            	        break;
            	    case RULE_NUMBER:
            	        {
            	        alt57=4;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt57=5;
            	        }
            	        break;
            	    case RULE_SEMICOLON:
            	        {
            	        alt57=6;
            	        }
            	        break;
            	    case RULE_COMMA:
            	        {
            	        alt57=7;
            	        }
            	        break;
            	    case RULE_MINUS:
            	        {
            	        alt57=8;
            	        }
            	        break;
            	    case RULE_PLUS:
            	        {
            	        alt57=9;
            	        }
            	        break;
            	    case RULE_LPAREN:
            	        {
            	        alt57=10;
            	        }
            	        break;
            	    case RULE_RPAREN:
            	        {
            	        alt57=11;
            	        }
            	        break;
            	    case RULE_LBRACE:
            	        {
            	        alt57=12;
            	        }
            	        break;
            	    case RULE_QUESTI:
            	        {
            	        alt57=13;
            	        }
            	        break;
            	    case RULE_NOT:
            	        {
            	        alt57=14;
            	        }
            	        break;
            	    case RULE_BAND:
            	        {
            	        alt57=15;
            	        }
            	        break;
            	    case RULE_BOR:
            	        {
            	        alt57=16;
            	        }
            	        break;
            	    case RULE_HASH:
            	        {
            	        alt57=17;
            	        }
            	        break;
            	    case RULE_AT:
            	        {
            	        alt57=18;
            	        }
            	        break;
            	    case RULE_CARET:
            	        {
            	        alt57=19;
            	        }
            	        break;
            	    case RULE_EQUALS:
            	        {
            	        alt57=20;
            	        }
            	        break;
            	    case RULE_LESS_THAN:
            	        {
            	        alt57=21;
            	        }
            	        break;
            	    case RULE_MORE_THAN:
            	        {
            	        alt57=22;
            	        }
            	        break;
            	    case RULE_AND:
            	        {
            	        alt57=23;
            	        }
            	        break;
            	    case RULE_OR:
            	        {
            	        alt57=24;
            	        }
            	        break;
            	    case RULE_ESC_CHAR:
            	        {
            	        alt57=25;
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
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4158:28: this_REST_25= RULE_REST
            	            {
            	            this_REST_25=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleOrdSqlValue10402); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REST_25);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REST_25, grammarAccess.getOrdSqlValueAccess().getRESTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4166:10: this_IDENT_DOT_26= RULE_IDENT_DOT
            	            {
            	            this_IDENT_DOT_26=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleOrdSqlValue10428); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_DOT_26);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_DOT_26, grammarAccess.getOrdSqlValueAccess().getIDENT_DOTTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4174:10: this_IDENT_27= RULE_IDENT
            	            {
            	            this_IDENT_27=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleOrdSqlValue10454); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_27);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_27, grammarAccess.getOrdSqlValueAccess().getIDENTTerminalRuleCall_1_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4182:10: this_NUMBER_28= RULE_NUMBER
            	            {
            	            this_NUMBER_28=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleOrdSqlValue10480); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NUMBER_28);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NUMBER_28, grammarAccess.getOrdSqlValueAccess().getNUMBERTerminalRuleCall_1_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4190:10: this_WS_29= RULE_WS
            	            {
            	            this_WS_29=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleOrdSqlValue10506); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_WS_29);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_WS_29, grammarAccess.getOrdSqlValueAccess().getWSTerminalRuleCall_1_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4198:10: this_SEMICOLON_30= RULE_SEMICOLON
            	            {
            	            this_SEMICOLON_30=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleOrdSqlValue10532); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_SEMICOLON_30);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_SEMICOLON_30, grammarAccess.getOrdSqlValueAccess().getSEMICOLONTerminalRuleCall_1_0_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4206:10: this_COMMA_31= RULE_COMMA
            	            {
            	            this_COMMA_31=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleOrdSqlValue10558); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COMMA_31);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COMMA_31, grammarAccess.getOrdSqlValueAccess().getCOMMATerminalRuleCall_1_0_6()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4214:10: this_MINUS_32= RULE_MINUS
            	            {
            	            this_MINUS_32=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleOrdSqlValue10584); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MINUS_32);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MINUS_32, grammarAccess.getOrdSqlValueAccess().getMINUSTerminalRuleCall_1_0_7()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4222:10: this_PLUS_33= RULE_PLUS
            	            {
            	            this_PLUS_33=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleOrdSqlValue10610); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PLUS_33);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PLUS_33, grammarAccess.getOrdSqlValueAccess().getPLUSTerminalRuleCall_1_0_8()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4230:10: this_LPAREN_34= RULE_LPAREN
            	            {
            	            this_LPAREN_34=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOrdSqlValue10636); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LPAREN_34);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LPAREN_34, grammarAccess.getOrdSqlValueAccess().getLPARENTerminalRuleCall_1_0_9()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4238:10: this_RPAREN_35= RULE_RPAREN
            	            {
            	            this_RPAREN_35=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOrdSqlValue10662); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RPAREN_35);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RPAREN_35, grammarAccess.getOrdSqlValueAccess().getRPARENTerminalRuleCall_1_0_10()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4246:10: this_LBRACE_36= RULE_LBRACE
            	            {
            	            this_LBRACE_36=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleOrdSqlValue10688); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LBRACE_36);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LBRACE_36, grammarAccess.getOrdSqlValueAccess().getLBRACETerminalRuleCall_1_0_11()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 13 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4254:10: this_QUESTI_37= RULE_QUESTI
            	            {
            	            this_QUESTI_37=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleOrdSqlValue10714); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_QUESTI_37);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_QUESTI_37, grammarAccess.getOrdSqlValueAccess().getQUESTITerminalRuleCall_1_0_12()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 14 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4262:10: this_NOT_38= RULE_NOT
            	            {
            	            this_NOT_38=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleOrdSqlValue10740); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NOT_38);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NOT_38, grammarAccess.getOrdSqlValueAccess().getNOTTerminalRuleCall_1_0_13()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 15 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4270:10: this_BAND_39= RULE_BAND
            	            {
            	            this_BAND_39=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleOrdSqlValue10766); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BAND_39);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BAND_39, grammarAccess.getOrdSqlValueAccess().getBANDTerminalRuleCall_1_0_14()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 16 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4278:10: this_BOR_40= RULE_BOR
            	            {
            	            this_BOR_40=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleOrdSqlValue10792); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BOR_40);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BOR_40, grammarAccess.getOrdSqlValueAccess().getBORTerminalRuleCall_1_0_15()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 17 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4286:10: this_HASH_41= RULE_HASH
            	            {
            	            this_HASH_41=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleOrdSqlValue10818); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_HASH_41);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_HASH_41, grammarAccess.getOrdSqlValueAccess().getHASHTerminalRuleCall_1_0_16()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 18 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4294:10: this_AT_42= RULE_AT
            	            {
            	            this_AT_42=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleOrdSqlValue10844); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AT_42);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AT_42, grammarAccess.getOrdSqlValueAccess().getATTerminalRuleCall_1_0_17()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 19 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4302:10: this_CARET_43= RULE_CARET
            	            {
            	            this_CARET_43=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleOrdSqlValue10870); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_CARET_43);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_CARET_43, grammarAccess.getOrdSqlValueAccess().getCARETTerminalRuleCall_1_0_18()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 20 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4310:10: this_EQUALS_44= RULE_EQUALS
            	            {
            	            this_EQUALS_44=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleOrdSqlValue10896); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_EQUALS_44);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_EQUALS_44, grammarAccess.getOrdSqlValueAccess().getEQUALSTerminalRuleCall_1_0_19()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 21 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4318:10: this_LESS_THAN_45= RULE_LESS_THAN
            	            {
            	            this_LESS_THAN_45=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleOrdSqlValue10922); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LESS_THAN_45);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LESS_THAN_45, grammarAccess.getOrdSqlValueAccess().getLESS_THANTerminalRuleCall_1_0_20()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 22 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4326:10: this_MORE_THAN_46= RULE_MORE_THAN
            	            {
            	            this_MORE_THAN_46=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleOrdSqlValue10948); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MORE_THAN_46);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MORE_THAN_46, grammarAccess.getOrdSqlValueAccess().getMORE_THANTerminalRuleCall_1_0_21()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 23 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4334:10: this_AND_47= RULE_AND
            	            {
            	            this_AND_47=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleOrdSqlValue10974); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AND_47);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AND_47, grammarAccess.getOrdSqlValueAccess().getANDTerminalRuleCall_1_0_22()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 24 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4342:10: this_OR_48= RULE_OR
            	            {
            	            this_OR_48=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleOrdSqlValue11000); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_OR_48);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_OR_48, grammarAccess.getOrdSqlValueAccess().getORTerminalRuleCall_1_0_23()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 25 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4350:10: this_ESC_CHAR_49= RULE_ESC_CHAR
            	            {
            	            this_ESC_CHAR_49=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleOrdSqlValue11026); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ESC_CHAR_49);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ESC_CHAR_49, grammarAccess.getOrdSqlValueAccess().getESC_CHARTerminalRuleCall_1_0_24()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4365:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4366:2: (iv_ruleColumn= ruleColumn EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4367:2: iv_ruleColumn= ruleColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnRule()); 
            }
            pushFollow(FOLLOW_ruleColumn_in_entryRuleColumn11074);
            iv_ruleColumn=ruleColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumn11084); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4374:1: ruleColumn returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )? ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4377:28: ( ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )? ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4378:1: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )? )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4378:1: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4378:2: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )?
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4378:2: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4379:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4379:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4380:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4380:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER )
            int alt59=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                alt59=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt59=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt59=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4381:3: lv_name_0_1= RULE_IDENT
                    {
                    lv_name_0_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumn11128); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4396:8: lv_name_0_2= RULE_IDENT_DOT
                    {
                    lv_name_0_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleColumn11148); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4411:8: lv_name_0_3= RULE_NUMBER
                    {
                    lv_name_0_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleColumn11168); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4429:2: ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_CARET) ) {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==RULE_IDENT) ) {
                    int LA62_3 = input.LA(3);

                    if ( (synpred5_InternalProcessorDsl()) ) {
                        alt62=1;
                    }
                }
            }
            switch (alt62) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4429:3: ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4429:3: ( ( RULE_CARET )=>this_CARET_1= RULE_CARET )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4429:4: ( RULE_CARET )=>this_CARET_1= RULE_CARET
                    {
                    this_CARET_1=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleColumn11194); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_1, grammarAccess.getColumnAccess().getCARETTerminalRuleCall_1_0()); 
                          
                    }

                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4433:2: ( (lv_type_2_0= RULE_IDENT ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4434:1: (lv_type_2_0= RULE_IDENT )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4434:1: (lv_type_2_0= RULE_IDENT )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4435:3: lv_type_2_0= RULE_IDENT
                    {
                    lv_type_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumn11211); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4451:2: ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==RULE_CARET) ) {
                            int LA61_2 = input.LA(2);

                            if ( (LA61_2==RULE_IDENT) ) {
                                int LA61_3 = input.LA(3);

                                if ( (synpred6_InternalProcessorDsl()) ) {
                                    alt61=1;
                                }


                            }
                            else if ( (LA61_2==RULE_NUMBER) ) {
                                int LA61_4 = input.LA(3);

                                if ( (synpred6_InternalProcessorDsl()) ) {
                                    alt61=1;
                                }


                            }


                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4451:3: ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4451:3: ( ( RULE_CARET )=>this_CARET_3= RULE_CARET )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4451:4: ( RULE_CARET )=>this_CARET_3= RULE_CARET
                    	    {
                    	    this_CARET_3=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleColumn11234); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_CARET_3, grammarAccess.getColumnAccess().getCARETTerminalRuleCall_1_2_0()); 
                    	          
                    	    }

                    	    }

                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4455:2: ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4456:1: ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4456:1: ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4457:1: (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4457:1: (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER )
                    	    int alt60=2;
                    	    int LA60_0 = input.LA(1);

                    	    if ( (LA60_0==RULE_IDENT) ) {
                    	        alt60=1;
                    	    }
                    	    else if ( (LA60_0==RULE_NUMBER) ) {
                    	        alt60=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 60, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt60) {
                    	        case 1 :
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4458:3: lv_vals_4_1= RULE_IDENT
                    	            {
                    	            lv_vals_4_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumn11253); if (state.failed) return current;
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
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4473:8: lv_vals_4_2= RULE_NUMBER
                    	            {
                    	            lv_vals_4_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleColumn11273); if (state.failed) return current;
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
                    	    break loop61;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4499:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4500:2: (iv_ruleConstant= ruleConstant EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4501:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant11321);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant11331); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4508:1: ruleConstant returns [EObject current=null] : ( ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )? ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4511:28: ( ( ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )? ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4512:1: ( ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )? )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4512:1: ( ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4512:2: ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )?
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4512:2: ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_MINUS && LA64_0<=RULE_PLUS)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4513:1: ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4513:1: ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4514:1: (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4514:1: (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_PLUS) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==RULE_MINUS) ) {
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4515:3: lv_case_0_1= RULE_PLUS
                            {
                            lv_case_0_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleConstant11375); if (state.failed) return current;
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4530:8: lv_case_0_2= RULE_MINUS
                            {
                            lv_case_0_2=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleConstant11395); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4548:3: ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4549:1: ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4549:1: ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4550:1: (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4550:1: (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_IDENT) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_IDENT_DOT) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4551:3: lv_name_1_1= RULE_IDENT
                    {
                    lv_name_1_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstant11423); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4566:8: lv_name_1_2= RULE_IDENT_DOT
                    {
                    lv_name_1_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleConstant11443); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4584:2: ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_CARET) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==RULE_IDENT) ) {
                    int LA68_3 = input.LA(3);

                    if ( (synpred7_InternalProcessorDsl()) ) {
                        alt68=1;
                    }
                }
            }
            switch (alt68) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4584:3: ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4584:3: ( ( RULE_CARET )=>this_CARET_2= RULE_CARET )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4584:4: ( RULE_CARET )=>this_CARET_2= RULE_CARET
                    {
                    this_CARET_2=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleConstant11469); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_2, grammarAccess.getConstantAccess().getCARETTerminalRuleCall_2_0()); 
                          
                    }

                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4588:2: ( (lv_type_3_0= RULE_IDENT ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4589:1: (lv_type_3_0= RULE_IDENT )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4589:1: (lv_type_3_0= RULE_IDENT )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4590:3: lv_type_3_0= RULE_IDENT
                    {
                    lv_type_3_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstant11486); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4606:2: ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==RULE_CARET) ) {
                            int LA67_2 = input.LA(2);

                            if ( (LA67_2==RULE_IDENT) ) {
                                int LA67_3 = input.LA(3);

                                if ( (synpred8_InternalProcessorDsl()) ) {
                                    alt67=1;
                                }


                            }
                            else if ( (LA67_2==RULE_NUMBER) ) {
                                int LA67_4 = input.LA(3);

                                if ( (synpred8_InternalProcessorDsl()) ) {
                                    alt67=1;
                                }


                            }


                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4606:3: ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4606:3: ( ( RULE_CARET )=>this_CARET_4= RULE_CARET )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4606:4: ( RULE_CARET )=>this_CARET_4= RULE_CARET
                    	    {
                    	    this_CARET_4=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleConstant11509); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_CARET_4, grammarAccess.getConstantAccess().getCARETTerminalRuleCall_2_2_0()); 
                    	          
                    	    }

                    	    }

                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4610:2: ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4611:1: ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4611:1: ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4612:1: (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4612:1: (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER )
                    	    int alt66=2;
                    	    int LA66_0 = input.LA(1);

                    	    if ( (LA66_0==RULE_IDENT) ) {
                    	        alt66=1;
                    	    }
                    	    else if ( (LA66_0==RULE_NUMBER) ) {
                    	        alt66=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 66, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt66) {
                    	        case 1 :
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4613:3: lv_vals_5_1= RULE_IDENT
                    	            {
                    	            lv_vals_5_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstant11528); if (state.failed) return current;
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
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4628:8: lv_vals_5_2= RULE_NUMBER
                    	            {
                    	            lv_vals_5_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleConstant11548); if (state.failed) return current;
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
                    	    break loop67;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4654:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4655:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4656:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier11596);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier11606); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4663:1: ruleIdentifier returns [EObject current=null] : ( ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )? ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4666:28: ( ( ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )? ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4667:1: ( ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )? )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4667:1: ( ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4667:2: ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )?
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4667:2: ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=RULE_EQUALS && LA70_0<=RULE_MORE_THAN)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4668:1: ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4668:1: ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4669:1: (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4669:1: (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN )
                    int alt69=3;
                    switch ( input.LA(1) ) {
                    case RULE_EQUALS:
                        {
                        alt69=1;
                        }
                        break;
                    case RULE_LESS_THAN:
                        {
                        alt69=2;
                        }
                        break;
                    case RULE_MORE_THAN:
                        {
                        alt69=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }

                    switch (alt69) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4670:3: lv_mode_0_1= RULE_EQUALS
                            {
                            lv_mode_0_1=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleIdentifier11650); if (state.failed) return current;
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4685:8: lv_mode_0_2= RULE_LESS_THAN
                            {
                            lv_mode_0_2=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleIdentifier11670); if (state.failed) return current;
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4700:8: lv_mode_0_3= RULE_MORE_THAN
                            {
                            lv_mode_0_3=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleIdentifier11690); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4718:3: ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=RULE_MINUS && LA72_0<=RULE_PLUS)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4719:1: ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4719:1: ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4720:1: (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4720:1: (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==RULE_PLUS) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==RULE_MINUS) ) {
                        alt71=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4721:3: lv_case_1_1= RULE_PLUS
                            {
                            lv_case_1_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleIdentifier11718); if (state.failed) return current;
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4736:8: lv_case_1_2= RULE_MINUS
                            {
                            lv_case_1_2=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleIdentifier11738); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4754:3: ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4755:1: ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4755:1: ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4756:1: (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4756:1: (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER )
            int alt73=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                alt73=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt73=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt73=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4757:3: lv_name_2_1= RULE_IDENT
                    {
                    lv_name_2_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifier11766); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4772:8: lv_name_2_2= RULE_IDENT_DOT
                    {
                    lv_name_2_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleIdentifier11786); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4787:8: lv_name_2_3= RULE_NUMBER
                    {
                    lv_name_2_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIdentifier11806); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4805:2: ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_CARET) ) {
                int LA76_1 = input.LA(2);

                if ( (LA76_1==RULE_IDENT) ) {
                    int LA76_3 = input.LA(3);

                    if ( (synpred9_InternalProcessorDsl()) ) {
                        alt76=1;
                    }
                }
            }
            switch (alt76) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4805:3: ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4805:3: ( ( RULE_CARET )=>this_CARET_3= RULE_CARET )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4805:4: ( RULE_CARET )=>this_CARET_3= RULE_CARET
                    {
                    this_CARET_3=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleIdentifier11832); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_3, grammarAccess.getIdentifierAccess().getCARETTerminalRuleCall_3_0()); 
                          
                    }

                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4809:2: ( (lv_type_4_0= RULE_IDENT ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4810:1: (lv_type_4_0= RULE_IDENT )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4810:1: (lv_type_4_0= RULE_IDENT )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4811:3: lv_type_4_0= RULE_IDENT
                    {
                    lv_type_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifier11849); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4827:2: ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==RULE_CARET) ) {
                            int LA75_2 = input.LA(2);

                            if ( (LA75_2==RULE_IDENT) ) {
                                int LA75_3 = input.LA(3);

                                if ( (synpred10_InternalProcessorDsl()) ) {
                                    alt75=1;
                                }


                            }
                            else if ( (LA75_2==RULE_NUMBER) ) {
                                int LA75_4 = input.LA(3);

                                if ( (synpred10_InternalProcessorDsl()) ) {
                                    alt75=1;
                                }


                            }


                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4827:3: ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4827:3: ( ( RULE_CARET )=>this_CARET_5= RULE_CARET )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4827:4: ( RULE_CARET )=>this_CARET_5= RULE_CARET
                    	    {
                    	    this_CARET_5=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleIdentifier11872); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_CARET_5, grammarAccess.getIdentifierAccess().getCARETTerminalRuleCall_3_2_0()); 
                    	          
                    	    }

                    	    }

                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4831:2: ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4832:1: ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4832:1: ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4833:1: (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4833:1: (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER )
                    	    int alt74=2;
                    	    int LA74_0 = input.LA(1);

                    	    if ( (LA74_0==RULE_IDENT) ) {
                    	        alt74=1;
                    	    }
                    	    else if ( (LA74_0==RULE_NUMBER) ) {
                    	        alt74=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 74, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt74) {
                    	        case 1 :
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4834:3: lv_vals_6_1= RULE_IDENT
                    	            {
                    	            lv_vals_6_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifier11891); if (state.failed) return current;
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
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4849:8: lv_vals_6_2= RULE_NUMBER
                    	            {
                    	            lv_vals_6_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIdentifier11911); if (state.failed) return current;
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
                    	    break loop75;
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


    // $ANTLR start "entryRuleDatabaseColumn"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4875:1: entryRuleDatabaseColumn returns [EObject current=null] : iv_ruleDatabaseColumn= ruleDatabaseColumn EOF ;
    public final EObject entryRuleDatabaseColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabaseColumn = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4876:2: (iv_ruleDatabaseColumn= ruleDatabaseColumn EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4877:2: iv_ruleDatabaseColumn= ruleDatabaseColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDatabaseColumnRule()); 
            }
            pushFollow(FOLLOW_ruleDatabaseColumn_in_entryRuleDatabaseColumn11959);
            iv_ruleDatabaseColumn=ruleDatabaseColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDatabaseColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatabaseColumn11969); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDatabaseColumn"


    // $ANTLR start "ruleDatabaseColumn"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4884:1: ruleDatabaseColumn returns [EObject current=null] : ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) ;
    public final EObject ruleDatabaseColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4887:28: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4888:1: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4888:1: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4889:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4889:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4890:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4890:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_IDENT) ) {
                alt77=1;
            }
            else if ( (LA77_0==RULE_IDENT_DOT) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4891:3: lv_name_0_1= RULE_IDENT
                    {
                    lv_name_0_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleDatabaseColumn12012); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_1, grammarAccess.getDatabaseColumnAccess().getNameIDENTTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDatabaseColumnRule());
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4906:8: lv_name_0_2= RULE_IDENT_DOT
                    {
                    lv_name_0_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleDatabaseColumn12032); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_2, grammarAccess.getDatabaseColumnAccess().getNameIDENT_DOTTerminalRuleCall_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDatabaseColumnRule());
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
    // $ANTLR end "ruleDatabaseColumn"


    // $ANTLR start "entryRuleMappingRule"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4932:1: entryRuleMappingRule returns [EObject current=null] : iv_ruleMappingRule= ruleMappingRule EOF ;
    public final EObject entryRuleMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingRule = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4933:2: (iv_ruleMappingRule= ruleMappingRule EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4934:2: iv_ruleMappingRule= ruleMappingRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingRuleRule()); 
            }
            pushFollow(FOLLOW_ruleMappingRule_in_entryRuleMappingRule12075);
            iv_ruleMappingRule=ruleMappingRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingRule12085); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4941:1: ruleMappingRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4944:28: ( ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4945:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4945:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4945:2: ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4945:2: ( (lv_name_0_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4946:1: (lv_name_0_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4946:1: (lv_name_0_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4947:3: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingRule12127); if (state.failed) return current;
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

            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleMappingRule12143); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_1, grammarAccess.getMappingRuleAccess().getLPARENTerminalRuleCall_1()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4967:1: ( (lv_type_2_0= ruleMAPPING_TYPE ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4968:1: (lv_type_2_0= ruleMAPPING_TYPE )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4968:1: (lv_type_2_0= ruleMAPPING_TYPE )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4969:3: lv_type_2_0= ruleMAPPING_TYPE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingRuleAccess().getTypeMAPPING_TYPEEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMAPPING_TYPE_in_ruleMappingRule12163);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4985:2: (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==RULE_COMMA) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4985:3: this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleMappingRule12175); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getMappingRuleAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4989:1: ( (lv_filters_4_0= RULE_IDENT ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4990:1: (lv_filters_4_0= RULE_IDENT )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4990:1: (lv_filters_4_0= RULE_IDENT )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4991:3: lv_filters_4_0= RULE_IDENT
            	    {
            	    lv_filters_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingRule12191); if (state.failed) return current;
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
            	    break loop78;
                }
            } while (true);

            this_RPAREN_5=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleMappingRule12209); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_5, grammarAccess.getMappingRuleAccess().getRPARENTerminalRuleCall_4()); 
                  
            }
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleMappingRule12219); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUALS_6, grammarAccess.getMappingRuleAccess().getEQUALSTerminalRuleCall_5()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5015:1: ( (lv_mapping_7_0= ruleMapping ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5016:1: (lv_mapping_7_0= ruleMapping )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5016:1: (lv_mapping_7_0= ruleMapping )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5017:3: lv_mapping_7_0= ruleMapping
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingRuleAccess().getMappingMappingParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMapping_in_ruleMappingRule12239);
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

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleMappingRule12250); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5045:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5046:2: (iv_ruleMapping= ruleMapping EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5047:2: iv_ruleMapping= ruleMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingRule()); 
            }
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping12285);
            iv_ruleMapping=ruleMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping12295); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5054:1: ruleMapping returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )* ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        EObject lv_mappingItems_1_0 = null;

        EObject lv_mappingItems_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5057:28: ( ( (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5058:1: ( (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5058:1: ( (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5058:2: (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5058:2: (this_WS_0= RULE_WS )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_WS) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5058:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMapping12332); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_0, grammarAccess.getMappingAccess().getWSTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5062:3: ( (lv_mappingItems_1_0= ruleMappingItem ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5063:1: (lv_mappingItems_1_0= ruleMappingItem )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5063:1: (lv_mappingItems_1_0= ruleMappingItem )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5064:3: lv_mappingItems_1_0= ruleMappingItem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingAccess().getMappingItemsMappingItemParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMappingItem_in_ruleMapping12354);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5080:2: ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )*
            loop81:
            do {
                int alt81=2;
                alt81 = dfa81.predict(input);
                switch (alt81) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5080:3: (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5080:3: (this_WS_2= RULE_WS )+
            	    int cnt80=0;
            	    loop80:
            	    do {
            	        int alt80=2;
            	        int LA80_0 = input.LA(1);

            	        if ( (LA80_0==RULE_WS) ) {
            	            alt80=1;
            	        }


            	        switch (alt80) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5080:4: this_WS_2= RULE_WS
            	    	    {
            	    	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMapping12367); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_2, grammarAccess.getMappingAccess().getWSTerminalRuleCall_2_0()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt80 >= 1 ) break loop80;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(80, input);
            	                throw eee;
            	        }
            	        cnt80++;
            	    } while (true);

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5084:3: ( (lv_mappingItems_3_0= ruleMappingItem ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5085:1: (lv_mappingItems_3_0= ruleMappingItem )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5085:1: (lv_mappingItems_3_0= ruleMappingItem )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5086:3: lv_mappingItems_3_0= ruleMappingItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMappingAccess().getMappingItemsMappingItemParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMappingItem_in_ruleMapping12389);
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
            	    break loop81;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5102:4: (this_WS_4= RULE_WS )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==RULE_WS) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5102:5: this_WS_4= RULE_WS
            	    {
            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMapping12403); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_4, grammarAccess.getMappingAccess().getWSTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop82;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5114:1: entryRuleMappingItem returns [EObject current=null] : iv_ruleMappingItem= ruleMappingItem EOF ;
    public final EObject entryRuleMappingItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingItem = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5115:2: (iv_ruleMappingItem= ruleMappingItem EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5116:2: iv_ruleMappingItem= ruleMappingItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingItemRule()); 
            }
            pushFollow(FOLLOW_ruleMappingItem_in_entryRuleMappingItem12440);
            iv_ruleMappingItem=ruleMappingItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingItem12450); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5123:1: ruleMappingItem returns [EObject current=null] : ( ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )? ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5126:28: ( ( ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )? ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5127:1: ( ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )? )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5127:1: ( ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5127:2: ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )?
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5127:2: ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5128:1: ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5128:1: ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5129:1: (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5129:1: (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_IDENT) ) {
                alt83=1;
            }
            else if ( (LA83_0==RULE_NUMBER) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5130:3: lv_col_0_1= RULE_IDENT
                    {
                    lv_col_0_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingItem12494); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5145:8: lv_col_0_2= RULE_NUMBER
                    {
                    lv_col_0_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMappingItem12514); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5163:2: (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_STRING) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5163:3: this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )?
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMappingItem12534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getMappingItemAccess().getSTRINGTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5167:1: ( (lv_type_2_0= RULE_IDENT ) )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==RULE_IDENT) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5168:1: (lv_type_2_0= RULE_IDENT )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5168:1: (lv_type_2_0= RULE_IDENT )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5169:3: lv_type_2_0= RULE_IDENT
                            {
                            lv_type_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingItem12550); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5185:3: (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==RULE_STRING) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5185:4: this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) )
                            {
                            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMappingItem12568); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_STRING_3, grammarAccess.getMappingItemAccess().getSTRINGTerminalRuleCall_1_2_0()); 
                                  
                            }
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5189:1: ( (lv_attr_4_0= ruleMappingColumn ) )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5190:1: (lv_attr_4_0= ruleMappingColumn )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5190:1: (lv_attr_4_0= ruleMappingColumn )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5191:3: lv_attr_4_0= ruleMappingColumn
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getMappingItemAccess().getAttrMappingColumnParserRuleCall_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMappingColumn_in_ruleMappingItem12588);
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5215:1: entryRuleMappingColumn returns [EObject current=null] : iv_ruleMappingColumn= ruleMappingColumn EOF ;
    public final EObject entryRuleMappingColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingColumn = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5216:2: (iv_ruleMappingColumn= ruleMappingColumn EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5217:2: iv_ruleMappingColumn= ruleMappingColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingColumnRule()); 
            }
            pushFollow(FOLLOW_ruleMappingColumn_in_entryRuleMappingColumn12628);
            iv_ruleMappingColumn=ruleMappingColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingColumn12638); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5224:1: ruleMappingColumn returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )* ) ;
    public final EObject ruleMappingColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token this_CARET_1=null;
        Token lv_vals_2_1=null;
        Token lv_vals_2_2=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5227:28: ( ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5228:1: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5228:1: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5228:2: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5228:2: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5229:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5229:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5230:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5230:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_IDENT) ) {
                alt87=1;
            }
            else if ( (LA87_0==RULE_IDENT_DOT) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5231:3: lv_name_0_1= RULE_IDENT
                    {
                    lv_name_0_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingColumn12682); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5246:8: lv_name_0_2= RULE_IDENT_DOT
                    {
                    lv_name_0_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleMappingColumn12702); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5264:2: (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==RULE_CARET) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5264:3: this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) )
            	    {
            	    this_CARET_1=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleMappingColumn12722); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_CARET_1, grammarAccess.getMappingColumnAccess().getCARETTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5268:1: ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5269:1: ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5269:1: ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5270:1: (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5270:1: (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER )
            	    int alt88=2;
            	    int LA88_0 = input.LA(1);

            	    if ( (LA88_0==RULE_IDENT) ) {
            	        alt88=1;
            	    }
            	    else if ( (LA88_0==RULE_NUMBER) ) {
            	        alt88=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 88, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt88) {
            	        case 1 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5271:3: lv_vals_2_1= RULE_IDENT
            	            {
            	            lv_vals_2_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingColumn12740); if (state.failed) return current;
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
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5286:8: lv_vals_2_2= RULE_NUMBER
            	            {
            	            lv_vals_2_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMappingColumn12760); if (state.failed) return current;
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
            	    break loop89;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5312:1: entryRuleOptionalFeature returns [EObject current=null] : iv_ruleOptionalFeature= ruleOptionalFeature EOF ;
    public final EObject entryRuleOptionalFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalFeature = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5313:2: (iv_ruleOptionalFeature= ruleOptionalFeature EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5314:2: iv_ruleOptionalFeature= ruleOptionalFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionalFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleOptionalFeature_in_entryRuleOptionalFeature12806);
            iv_ruleOptionalFeature=ruleOptionalFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptionalFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalFeature12816); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5321:1: ruleOptionalFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5324:28: ( ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5325:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5325:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5325:2: ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5325:2: ( (lv_name_0_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5326:1: (lv_name_0_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5326:1: (lv_name_0_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5327:3: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleOptionalFeature12858); if (state.failed) return current;
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

            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOptionalFeature12874); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_1, grammarAccess.getOptionalFeatureAccess().getLPARENTerminalRuleCall_1()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5347:1: ( (lv_type_2_0= ruleOPTION_TYPE ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5348:1: (lv_type_2_0= ruleOPTION_TYPE )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5348:1: (lv_type_2_0= ruleOPTION_TYPE )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5349:3: lv_type_2_0= ruleOPTION_TYPE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionalFeatureAccess().getTypeOPTION_TYPEEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOPTION_TYPE_in_ruleOptionalFeature12894);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5365:2: (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==RULE_COMMA) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5365:3: this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleOptionalFeature12906); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getOptionalFeatureAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5369:1: ( (lv_filters_4_0= RULE_IDENT ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5370:1: (lv_filters_4_0= RULE_IDENT )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5370:1: (lv_filters_4_0= RULE_IDENT )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5371:3: lv_filters_4_0= RULE_IDENT
            	    {
            	    lv_filters_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleOptionalFeature12922); if (state.failed) return current;
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
            	    break loop90;
                }
            } while (true);

            this_RPAREN_5=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOptionalFeature12940); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_5, grammarAccess.getOptionalFeatureAccess().getRPARENTerminalRuleCall_4()); 
                  
            }
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleOptionalFeature12950); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUALS_6, grammarAccess.getOptionalFeatureAccess().getEQUALSTerminalRuleCall_5()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5395:1: ( (lv_option_7_0= ruleFeatureValue ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5396:1: (lv_option_7_0= ruleFeatureValue )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5396:1: (lv_option_7_0= ruleFeatureValue )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5397:3: lv_option_7_0= ruleFeatureValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionalFeatureAccess().getOptionFeatureValueParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureValue_in_ruleOptionalFeature12970);
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

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleOptionalFeature12981); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5425:1: entryRuleFeatureValue returns [String current=null] : iv_ruleFeatureValue= ruleFeatureValue EOF ;
    public final String entryRuleFeatureValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5426:2: (iv_ruleFeatureValue= ruleFeatureValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5427:2: iv_ruleFeatureValue= ruleFeatureValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureValueRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureValue_in_entryRuleFeatureValue13017);
            iv_ruleFeatureValue=ruleFeatureValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureValue13028); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5434:1: ruleFeatureValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COLON_5= RULE_COLON | this_STRING_6= RULE_STRING | this_COMMA_7= RULE_COMMA | this_MINUS_8= RULE_MINUS | this_PLUS_9= RULE_PLUS | this_LPAREN_10= RULE_LPAREN | this_RPAREN_11= RULE_RPAREN | this_LBRACE_12= RULE_LBRACE | this_RBRACE_13= RULE_RBRACE | this_QUESTI_14= RULE_QUESTI | this_NOT_15= RULE_NOT | this_BAND_16= RULE_BAND | this_BOR_17= RULE_BOR | this_HASH_18= RULE_HASH | this_AT_19= RULE_AT | this_CARET_20= RULE_CARET | this_EQUALS_21= RULE_EQUALS | this_LESS_THAN_22= RULE_LESS_THAN | this_MORE_THAN_23= RULE_MORE_THAN | this_PERCENT_24= RULE_PERCENT | this_AND_25= RULE_AND | this_OR_26= RULE_OR | this_ESC_CHAR_27= RULE_ESC_CHAR )+ ;
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
        Token this_PERCENT_24=null;
        Token this_AND_25=null;
        Token this_OR_26=null;
        Token this_ESC_CHAR_27=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5437:28: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COLON_5= RULE_COLON | this_STRING_6= RULE_STRING | this_COMMA_7= RULE_COMMA | this_MINUS_8= RULE_MINUS | this_PLUS_9= RULE_PLUS | this_LPAREN_10= RULE_LPAREN | this_RPAREN_11= RULE_RPAREN | this_LBRACE_12= RULE_LBRACE | this_RBRACE_13= RULE_RBRACE | this_QUESTI_14= RULE_QUESTI | this_NOT_15= RULE_NOT | this_BAND_16= RULE_BAND | this_BOR_17= RULE_BOR | this_HASH_18= RULE_HASH | this_AT_19= RULE_AT | this_CARET_20= RULE_CARET | this_EQUALS_21= RULE_EQUALS | this_LESS_THAN_22= RULE_LESS_THAN | this_MORE_THAN_23= RULE_MORE_THAN | this_PERCENT_24= RULE_PERCENT | this_AND_25= RULE_AND | this_OR_26= RULE_OR | this_ESC_CHAR_27= RULE_ESC_CHAR )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5438:1: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COLON_5= RULE_COLON | this_STRING_6= RULE_STRING | this_COMMA_7= RULE_COMMA | this_MINUS_8= RULE_MINUS | this_PLUS_9= RULE_PLUS | this_LPAREN_10= RULE_LPAREN | this_RPAREN_11= RULE_RPAREN | this_LBRACE_12= RULE_LBRACE | this_RBRACE_13= RULE_RBRACE | this_QUESTI_14= RULE_QUESTI | this_NOT_15= RULE_NOT | this_BAND_16= RULE_BAND | this_BOR_17= RULE_BOR | this_HASH_18= RULE_HASH | this_AT_19= RULE_AT | this_CARET_20= RULE_CARET | this_EQUALS_21= RULE_EQUALS | this_LESS_THAN_22= RULE_LESS_THAN | this_MORE_THAN_23= RULE_MORE_THAN | this_PERCENT_24= RULE_PERCENT | this_AND_25= RULE_AND | this_OR_26= RULE_OR | this_ESC_CHAR_27= RULE_ESC_CHAR )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5438:1: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COLON_5= RULE_COLON | this_STRING_6= RULE_STRING | this_COMMA_7= RULE_COMMA | this_MINUS_8= RULE_MINUS | this_PLUS_9= RULE_PLUS | this_LPAREN_10= RULE_LPAREN | this_RPAREN_11= RULE_RPAREN | this_LBRACE_12= RULE_LBRACE | this_RBRACE_13= RULE_RBRACE | this_QUESTI_14= RULE_QUESTI | this_NOT_15= RULE_NOT | this_BAND_16= RULE_BAND | this_BOR_17= RULE_BOR | this_HASH_18= RULE_HASH | this_AT_19= RULE_AT | this_CARET_20= RULE_CARET | this_EQUALS_21= RULE_EQUALS | this_LESS_THAN_22= RULE_LESS_THAN | this_MORE_THAN_23= RULE_MORE_THAN | this_PERCENT_24= RULE_PERCENT | this_AND_25= RULE_AND | this_OR_26= RULE_OR | this_ESC_CHAR_27= RULE_ESC_CHAR )+
            int cnt91=0;
            loop91:
            do {
                int alt91=29;
                switch ( input.LA(1) ) {
                case RULE_REST:
                    {
                    alt91=1;
                    }
                    break;
                case RULE_IDENT_DOT:
                    {
                    alt91=2;
                    }
                    break;
                case RULE_IDENT:
                    {
                    alt91=3;
                    }
                    break;
                case RULE_NUMBER:
                    {
                    alt91=4;
                    }
                    break;
                case RULE_WS:
                    {
                    alt91=5;
                    }
                    break;
                case RULE_COLON:
                    {
                    alt91=6;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt91=7;
                    }
                    break;
                case RULE_COMMA:
                    {
                    alt91=8;
                    }
                    break;
                case RULE_MINUS:
                    {
                    alt91=9;
                    }
                    break;
                case RULE_PLUS:
                    {
                    alt91=10;
                    }
                    break;
                case RULE_LPAREN:
                    {
                    alt91=11;
                    }
                    break;
                case RULE_RPAREN:
                    {
                    alt91=12;
                    }
                    break;
                case RULE_LBRACE:
                    {
                    alt91=13;
                    }
                    break;
                case RULE_RBRACE:
                    {
                    alt91=14;
                    }
                    break;
                case RULE_QUESTI:
                    {
                    alt91=15;
                    }
                    break;
                case RULE_NOT:
                    {
                    alt91=16;
                    }
                    break;
                case RULE_BAND:
                    {
                    alt91=17;
                    }
                    break;
                case RULE_BOR:
                    {
                    alt91=18;
                    }
                    break;
                case RULE_HASH:
                    {
                    alt91=19;
                    }
                    break;
                case RULE_AT:
                    {
                    alt91=20;
                    }
                    break;
                case RULE_CARET:
                    {
                    alt91=21;
                    }
                    break;
                case RULE_EQUALS:
                    {
                    alt91=22;
                    }
                    break;
                case RULE_LESS_THAN:
                    {
                    alt91=23;
                    }
                    break;
                case RULE_MORE_THAN:
                    {
                    alt91=24;
                    }
                    break;
                case RULE_PERCENT:
                    {
                    alt91=25;
                    }
                    break;
                case RULE_AND:
                    {
                    alt91=26;
                    }
                    break;
                case RULE_OR:
                    {
                    alt91=27;
                    }
                    break;
                case RULE_ESC_CHAR:
                    {
                    alt91=28;
                    }
                    break;

                }

                switch (alt91) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5438:6: this_REST_0= RULE_REST
            	    {
            	    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleFeatureValue13068); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_REST_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_REST_0, grammarAccess.getFeatureValueAccess().getRESTTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5446:10: this_IDENT_DOT_1= RULE_IDENT_DOT
            	    {
            	    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleFeatureValue13094); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_IDENT_DOT_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_IDENT_DOT_1, grammarAccess.getFeatureValueAccess().getIDENT_DOTTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5454:10: this_IDENT_2= RULE_IDENT
            	    {
            	    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleFeatureValue13120); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_IDENT_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_IDENT_2, grammarAccess.getFeatureValueAccess().getIDENTTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5462:10: this_NUMBER_3= RULE_NUMBER
            	    {
            	    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleFeatureValue13146); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_NUMBER_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_NUMBER_3, grammarAccess.getFeatureValueAccess().getNUMBERTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5470:10: this_WS_4= RULE_WS
            	    {
            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleFeatureValue13172); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WS_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_4, grammarAccess.getFeatureValueAccess().getWSTerminalRuleCall_4()); 
            	          
            	    }

            	    }
            	    break;
            	case 6 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5478:10: this_COLON_5= RULE_COLON
            	    {
            	    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleFeatureValue13198); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COLON_5);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COLON_5, grammarAccess.getFeatureValueAccess().getCOLONTerminalRuleCall_5()); 
            	          
            	    }

            	    }
            	    break;
            	case 7 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5486:10: this_STRING_6= RULE_STRING
            	    {
            	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureValue13224); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_STRING_6);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_STRING_6, grammarAccess.getFeatureValueAccess().getSTRINGTerminalRuleCall_6()); 
            	          
            	    }

            	    }
            	    break;
            	case 8 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5494:10: this_COMMA_7= RULE_COMMA
            	    {
            	    this_COMMA_7=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleFeatureValue13250); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COMMA_7);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_7, grammarAccess.getFeatureValueAccess().getCOMMATerminalRuleCall_7()); 
            	          
            	    }

            	    }
            	    break;
            	case 9 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5502:10: this_MINUS_8= RULE_MINUS
            	    {
            	    this_MINUS_8=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleFeatureValue13276); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_MINUS_8);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_MINUS_8, grammarAccess.getFeatureValueAccess().getMINUSTerminalRuleCall_8()); 
            	          
            	    }

            	    }
            	    break;
            	case 10 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5510:10: this_PLUS_9= RULE_PLUS
            	    {
            	    this_PLUS_9=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleFeatureValue13302); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PLUS_9);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_PLUS_9, grammarAccess.getFeatureValueAccess().getPLUSTerminalRuleCall_9()); 
            	          
            	    }

            	    }
            	    break;
            	case 11 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5518:10: this_LPAREN_10= RULE_LPAREN
            	    {
            	    this_LPAREN_10=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleFeatureValue13328); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LPAREN_10);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LPAREN_10, grammarAccess.getFeatureValueAccess().getLPARENTerminalRuleCall_10()); 
            	          
            	    }

            	    }
            	    break;
            	case 12 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5526:10: this_RPAREN_11= RULE_RPAREN
            	    {
            	    this_RPAREN_11=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleFeatureValue13354); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_RPAREN_11);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_RPAREN_11, grammarAccess.getFeatureValueAccess().getRPARENTerminalRuleCall_11()); 
            	          
            	    }

            	    }
            	    break;
            	case 13 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5534:10: this_LBRACE_12= RULE_LBRACE
            	    {
            	    this_LBRACE_12=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleFeatureValue13380); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LBRACE_12);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LBRACE_12, grammarAccess.getFeatureValueAccess().getLBRACETerminalRuleCall_12()); 
            	          
            	    }

            	    }
            	    break;
            	case 14 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5542:10: this_RBRACE_13= RULE_RBRACE
            	    {
            	    this_RBRACE_13=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleFeatureValue13406); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_RBRACE_13);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_RBRACE_13, grammarAccess.getFeatureValueAccess().getRBRACETerminalRuleCall_13()); 
            	          
            	    }

            	    }
            	    break;
            	case 15 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5550:10: this_QUESTI_14= RULE_QUESTI
            	    {
            	    this_QUESTI_14=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleFeatureValue13432); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_QUESTI_14);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_QUESTI_14, grammarAccess.getFeatureValueAccess().getQUESTITerminalRuleCall_14()); 
            	          
            	    }

            	    }
            	    break;
            	case 16 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5558:10: this_NOT_15= RULE_NOT
            	    {
            	    this_NOT_15=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleFeatureValue13458); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_NOT_15);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_NOT_15, grammarAccess.getFeatureValueAccess().getNOTTerminalRuleCall_15()); 
            	          
            	    }

            	    }
            	    break;
            	case 17 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5566:10: this_BAND_16= RULE_BAND
            	    {
            	    this_BAND_16=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleFeatureValue13484); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_BAND_16);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_BAND_16, grammarAccess.getFeatureValueAccess().getBANDTerminalRuleCall_16()); 
            	          
            	    }

            	    }
            	    break;
            	case 18 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5574:10: this_BOR_17= RULE_BOR
            	    {
            	    this_BOR_17=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleFeatureValue13510); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_BOR_17);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_BOR_17, grammarAccess.getFeatureValueAccess().getBORTerminalRuleCall_17()); 
            	          
            	    }

            	    }
            	    break;
            	case 19 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5582:10: this_HASH_18= RULE_HASH
            	    {
            	    this_HASH_18=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleFeatureValue13536); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_HASH_18);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_HASH_18, grammarAccess.getFeatureValueAccess().getHASHTerminalRuleCall_18()); 
            	          
            	    }

            	    }
            	    break;
            	case 20 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5590:10: this_AT_19= RULE_AT
            	    {
            	    this_AT_19=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleFeatureValue13562); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_AT_19);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_AT_19, grammarAccess.getFeatureValueAccess().getATTerminalRuleCall_19()); 
            	          
            	    }

            	    }
            	    break;
            	case 21 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5598:10: this_CARET_20= RULE_CARET
            	    {
            	    this_CARET_20=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleFeatureValue13588); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_CARET_20);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_CARET_20, grammarAccess.getFeatureValueAccess().getCARETTerminalRuleCall_20()); 
            	          
            	    }

            	    }
            	    break;
            	case 22 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5606:10: this_EQUALS_21= RULE_EQUALS
            	    {
            	    this_EQUALS_21=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleFeatureValue13614); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_EQUALS_21);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_EQUALS_21, grammarAccess.getFeatureValueAccess().getEQUALSTerminalRuleCall_21()); 
            	          
            	    }

            	    }
            	    break;
            	case 23 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5614:10: this_LESS_THAN_22= RULE_LESS_THAN
            	    {
            	    this_LESS_THAN_22=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleFeatureValue13640); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LESS_THAN_22);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LESS_THAN_22, grammarAccess.getFeatureValueAccess().getLESS_THANTerminalRuleCall_22()); 
            	          
            	    }

            	    }
            	    break;
            	case 24 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5622:10: this_MORE_THAN_23= RULE_MORE_THAN
            	    {
            	    this_MORE_THAN_23=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleFeatureValue13666); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_MORE_THAN_23);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_MORE_THAN_23, grammarAccess.getFeatureValueAccess().getMORE_THANTerminalRuleCall_23()); 
            	          
            	    }

            	    }
            	    break;
            	case 25 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5630:10: this_PERCENT_24= RULE_PERCENT
            	    {
            	    this_PERCENT_24=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleFeatureValue13692); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PERCENT_24);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_PERCENT_24, grammarAccess.getFeatureValueAccess().getPERCENTTerminalRuleCall_24()); 
            	          
            	    }

            	    }
            	    break;
            	case 26 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5638:10: this_AND_25= RULE_AND
            	    {
            	    this_AND_25=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleFeatureValue13718); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_AND_25);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_AND_25, grammarAccess.getFeatureValueAccess().getANDTerminalRuleCall_25()); 
            	          
            	    }

            	    }
            	    break;
            	case 27 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5646:10: this_OR_26= RULE_OR
            	    {
            	    this_OR_26=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleFeatureValue13744); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_OR_26);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_OR_26, grammarAccess.getFeatureValueAccess().getORTerminalRuleCall_26()); 
            	          
            	    }

            	    }
            	    break;
            	case 28 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5654:10: this_ESC_CHAR_27= RULE_ESC_CHAR
            	    {
            	    this_ESC_CHAR_27=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleFeatureValue13770); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ESC_CHAR_27);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ESC_CHAR_27, grammarAccess.getFeatureValueAccess().getESC_CHARTerminalRuleCall_27()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt91 >= 1 ) break loop91;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(91, input);
                        throw eee;
                }
                cnt91++;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5669:1: ruleSTATEMEN_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'QRY' ) | (enumLiteral_1= 'CRUD' ) | (enumLiteral_2= 'CALL' ) ) ;
    public final Enumerator ruleSTATEMEN_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5671:28: ( ( (enumLiteral_0= 'QRY' ) | (enumLiteral_1= 'CRUD' ) | (enumLiteral_2= 'CALL' ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5672:1: ( (enumLiteral_0= 'QRY' ) | (enumLiteral_1= 'CRUD' ) | (enumLiteral_2= 'CALL' ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5672:1: ( (enumLiteral_0= 'QRY' ) | (enumLiteral_1= 'CRUD' ) | (enumLiteral_2= 'CALL' ) )
            int alt92=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt92=1;
                }
                break;
            case 51:
                {
                alt92=2;
                }
                break;
            case 52:
                {
                alt92=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5672:2: (enumLiteral_0= 'QRY' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5672:2: (enumLiteral_0= 'QRY' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5672:4: enumLiteral_0= 'QRY'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_50_in_ruleSTATEMEN_TYPE13830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSTATEMEN_TYPEAccess().getQRYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSTATEMEN_TYPEAccess().getQRYEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5678:6: (enumLiteral_1= 'CRUD' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5678:6: (enumLiteral_1= 'CRUD' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5678:8: enumLiteral_1= 'CRUD'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_51_in_ruleSTATEMEN_TYPE13847); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSTATEMEN_TYPEAccess().getCRUDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSTATEMEN_TYPEAccess().getCRUDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5684:6: (enumLiteral_2= 'CALL' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5684:6: (enumLiteral_2= 'CALL' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5684:8: enumLiteral_2= 'CALL'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_52_in_ruleSTATEMEN_TYPE13864); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5694:1: ruleMAPPING_TYPE returns [Enumerator current=null] : (enumLiteral_0= 'OUT' ) ;
    public final Enumerator ruleMAPPING_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5696:28: ( (enumLiteral_0= 'OUT' ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5697:1: (enumLiteral_0= 'OUT' )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5697:1: (enumLiteral_0= 'OUT' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5697:3: enumLiteral_0= 'OUT'
            {
            enumLiteral_0=(Token)match(input,53,FOLLOW_53_in_ruleMAPPING_TYPE13908); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5707:1: ruleOPTION_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'OPT' ) | (enumLiteral_1= 'LOPT' ) | (enumLiteral_2= 'IOPT' ) | (enumLiteral_3= 'SOPT' ) | (enumLiteral_4= 'BOPT' ) ) ;
    public final Enumerator ruleOPTION_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5709:28: ( ( (enumLiteral_0= 'OPT' ) | (enumLiteral_1= 'LOPT' ) | (enumLiteral_2= 'IOPT' ) | (enumLiteral_3= 'SOPT' ) | (enumLiteral_4= 'BOPT' ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5710:1: ( (enumLiteral_0= 'OPT' ) | (enumLiteral_1= 'LOPT' ) | (enumLiteral_2= 'IOPT' ) | (enumLiteral_3= 'SOPT' ) | (enumLiteral_4= 'BOPT' ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5710:1: ( (enumLiteral_0= 'OPT' ) | (enumLiteral_1= 'LOPT' ) | (enumLiteral_2= 'IOPT' ) | (enumLiteral_3= 'SOPT' ) | (enumLiteral_4= 'BOPT' ) )
            int alt93=5;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt93=1;
                }
                break;
            case 55:
                {
                alt93=2;
                }
                break;
            case 56:
                {
                alt93=3;
                }
                break;
            case 57:
                {
                alt93=4;
                }
                break;
            case 58:
                {
                alt93=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5710:2: (enumLiteral_0= 'OPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5710:2: (enumLiteral_0= 'OPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5710:4: enumLiteral_0= 'OPT'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleOPTION_TYPE13952); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getOPTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOPTION_TYPEAccess().getOPTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5716:6: (enumLiteral_1= 'LOPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5716:6: (enumLiteral_1= 'LOPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5716:8: enumLiteral_1= 'LOPT'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_55_in_ruleOPTION_TYPE13969); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getLOPTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOPTION_TYPEAccess().getLOPTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5722:6: (enumLiteral_2= 'IOPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5722:6: (enumLiteral_2= 'IOPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5722:8: enumLiteral_2= 'IOPT'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_56_in_ruleOPTION_TYPE13986); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getIOPTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOPTION_TYPEAccess().getIOPTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5728:6: (enumLiteral_3= 'SOPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5728:6: (enumLiteral_3= 'SOPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5728:8: enumLiteral_3= 'SOPT'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_57_in_ruleOPTION_TYPE14003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getSOPTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getOPTION_TYPEAccess().getSOPTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5734:6: (enumLiteral_4= 'BOPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5734:6: (enumLiteral_4= 'BOPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5734:8: enumLiteral_4= 'BOPT'
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_58_in_ruleOPTION_TYPE14020); if (state.failed) return current;
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
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:750:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:750:4: ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR )
        {
        if ( input.LA(1)==RULE_WS||(input.LA(1)>=RULE_REST && input.LA(1)<=RULE_ESC_CHAR) ) {
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
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2089:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2089:4: ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR )
        {
        if ( input.LA(1)==RULE_WS||(input.LA(1)>=RULE_REST && input.LA(1)<=RULE_NUMBER)||(input.LA(1)>=RULE_COMMA && input.LA(1)<=RULE_RPAREN)||(input.LA(1)>=RULE_RBRACE && input.LA(1)<=RULE_HASH)||(input.LA(1)>=RULE_CARET && input.LA(1)<=RULE_MORE_THAN)||(input.LA(1)>=RULE_AND && input.LA(1)<=RULE_ESC_CHAR) ) {
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
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3051:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3051:4: ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR )
        {
        if ( (input.LA(1)>=RULE_WS && input.LA(1)<=RULE_NUMBER)||(input.LA(1)>=RULE_COMMA && input.LA(1)<=RULE_RPAREN)||(input.LA(1)>=RULE_QUESTI && input.LA(1)<=RULE_BAND)||input.LA(1)==RULE_HASH||(input.LA(1)>=RULE_CARET && input.LA(1)<=RULE_MORE_THAN)||(input.LA(1)>=RULE_AND && input.LA(1)<=RULE_ESC_CHAR) ) {
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
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4134:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4134:4: ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR )
        {
        if ( (input.LA(1)>=RULE_WS && input.LA(1)<=RULE_NUMBER)||(input.LA(1)>=RULE_COMMA && input.LA(1)<=RULE_LBRACE)||(input.LA(1)>=RULE_QUESTI && input.LA(1)<=RULE_MORE_THAN)||(input.LA(1)>=RULE_AND && input.LA(1)<=RULE_ESC_CHAR) ) {
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
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4429:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4429:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred5_InternalProcessorDsl11189); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalProcessorDsl

    // $ANTLR start synpred6_InternalProcessorDsl
    public final void synpred6_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4451:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4451:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred6_InternalProcessorDsl11229); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalProcessorDsl

    // $ANTLR start synpred7_InternalProcessorDsl
    public final void synpred7_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4584:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4584:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred7_InternalProcessorDsl11464); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalProcessorDsl

    // $ANTLR start synpred8_InternalProcessorDsl
    public final void synpred8_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4606:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4606:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred8_InternalProcessorDsl11504); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalProcessorDsl

    // $ANTLR start synpred9_InternalProcessorDsl
    public final void synpred9_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4805:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4805:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred9_InternalProcessorDsl11827); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalProcessorDsl

    // $ANTLR start synpred10_InternalProcessorDsl
    public final void synpred10_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4827:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4827:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred10_InternalProcessorDsl11867); if (state.failed) return ;

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


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA81 dfa81 = new DFA81(this);
    static final String DFA10_eotS =
        "\14\uffff";
    static final String DFA10_eofS =
        "\1\1\13\uffff";
    static final String DFA10_minS =
        "\1\10\1\uffff\1\17\5\uffff\1\62\3\uffff";
    static final String DFA10_maxS =
        "\1\60\1\uffff\1\17\5\uffff\1\72\3\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\11\1\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\1\3\1\1\1\2";
    static final String DFA10_specialS =
        "\14\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\32\uffff\7\5\1\3\4\4\1\6\1\7",
            "",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "\3\13\1\11\5\12",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "()+ loopback of 85:3: ( ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* ) | ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* ) | ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* ) | ( ( (lv_pojos_7_0= rulePojoDefinition ) ) (this_WS_8= RULE_WS )* ) | ( ( (lv_usages_9_0= rulePojoUsage ) ) (this_WS_10= RULE_WS )* ) | ( ( (lv_properties_11_0= ruleProperty ) ) (this_WS_12= RULE_WS )* ) | ( ( (lv_tables_13_0= ruleTableDefinition ) ) (this_WS_14= RULE_WS )* ) | ( ( (lv_tableUsages_15_0= ruleTableUsage ) ) (this_WS_16= RULE_WS )* ) )+";
        }
    }
    static final String DFA19_eotS =
        "\36\uffff";
    static final String DFA19_eofS =
        "\1\1\35\uffff";
    static final String DFA19_minS =
        "\1\4\35\uffff";
    static final String DFA19_maxS =
        "\1\40\35\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\2\34\1";
    static final String DFA19_specialS =
        "\1\0\35\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\6\1\1\1\2\1\3\1\4\1\5\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
            "\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
            "\32\1\33\1\34\1\35",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "()* loopback of 750:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_0 = input.LA(1);

                         
                        int index19_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_0==EOF||LA19_0==RULE_SEMICOLON) ) {s = 1;}

                        else if ( (LA19_0==RULE_REST) && (synpred1_InternalProcessorDsl())) {s = 2;}

                        else if ( (LA19_0==RULE_IDENT_DOT) && (synpred1_InternalProcessorDsl())) {s = 3;}

                        else if ( (LA19_0==RULE_IDENT) && (synpred1_InternalProcessorDsl())) {s = 4;}

                        else if ( (LA19_0==RULE_NUMBER) && (synpred1_InternalProcessorDsl())) {s = 5;}

                        else if ( (LA19_0==RULE_WS) && (synpred1_InternalProcessorDsl())) {s = 6;}

                        else if ( (LA19_0==RULE_COLON) && (synpred1_InternalProcessorDsl())) {s = 7;}

                        else if ( (LA19_0==RULE_STRING) && (synpred1_InternalProcessorDsl())) {s = 8;}

                        else if ( (LA19_0==RULE_COMMA) && (synpred1_InternalProcessorDsl())) {s = 9;}

                        else if ( (LA19_0==RULE_MINUS) && (synpred1_InternalProcessorDsl())) {s = 10;}

                        else if ( (LA19_0==RULE_PLUS) && (synpred1_InternalProcessorDsl())) {s = 11;}

                        else if ( (LA19_0==RULE_LPAREN) && (synpred1_InternalProcessorDsl())) {s = 12;}

                        else if ( (LA19_0==RULE_RPAREN) && (synpred1_InternalProcessorDsl())) {s = 13;}

                        else if ( (LA19_0==RULE_LBRACE) && (synpred1_InternalProcessorDsl())) {s = 14;}

                        else if ( (LA19_0==RULE_RBRACE) && (synpred1_InternalProcessorDsl())) {s = 15;}

                        else if ( (LA19_0==RULE_QUESTI) && (synpred1_InternalProcessorDsl())) {s = 16;}

                        else if ( (LA19_0==RULE_NOT) && (synpred1_InternalProcessorDsl())) {s = 17;}

                        else if ( (LA19_0==RULE_BAND) && (synpred1_InternalProcessorDsl())) {s = 18;}

                        else if ( (LA19_0==RULE_BOR) && (synpred1_InternalProcessorDsl())) {s = 19;}

                        else if ( (LA19_0==RULE_HASH) && (synpred1_InternalProcessorDsl())) {s = 20;}

                        else if ( (LA19_0==RULE_AT) && (synpred1_InternalProcessorDsl())) {s = 21;}

                        else if ( (LA19_0==RULE_CARET) && (synpred1_InternalProcessorDsl())) {s = 22;}

                        else if ( (LA19_0==RULE_EQUALS) && (synpred1_InternalProcessorDsl())) {s = 23;}

                        else if ( (LA19_0==RULE_LESS_THAN) && (synpred1_InternalProcessorDsl())) {s = 24;}

                        else if ( (LA19_0==RULE_MORE_THAN) && (synpred1_InternalProcessorDsl())) {s = 25;}

                        else if ( (LA19_0==RULE_PERCENT) && (synpred1_InternalProcessorDsl())) {s = 26;}

                        else if ( (LA19_0==RULE_AND) && (synpred1_InternalProcessorDsl())) {s = 27;}

                        else if ( (LA19_0==RULE_OR) && (synpred1_InternalProcessorDsl())) {s = 28;}

                        else if ( (LA19_0==RULE_ESC_CHAR) && (synpred1_InternalProcessorDsl())) {s = 29;}

                         
                        input.seek(index19_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\32\uffff";
    static final String DFA27_eofS =
        "\1\1\31\uffff";
    static final String DFA27_minS =
        "\1\4\1\uffff\27\0\1\uffff";
    static final String DFA27_maxS =
        "\1\40\1\uffff\27\0\1\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\2\27\uffff\1\1";
    static final String DFA27_specialS =
        "\2\uffff\1\17\1\1\1\24\1\10\1\23\1\5\1\7\1\21\1\6\1\22\1\4\1\15"+
        "\1\25\1\12\1\0\1\16\1\2\1\14\1\11\1\13\1\3\1\20\1\26\1\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\6\1\1\1\2\1\3\1\4\1\5\2\1\1\7\1\10\1\11\1\12\1\13\1\1\1\14"+
            "\1\15\1\16\1\17\1\20\1\21\1\1\1\22\1\23\1\24\1\25\1\1\1\26\1"+
            "\27\1\30",
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

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "()* loopback of 2089:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_16 = input.LA(1);

                         
                        int index27_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_3 = input.LA(1);

                         
                        int index27_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_18 = input.LA(1);

                         
                        int index27_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_18);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_22 = input.LA(1);

                         
                        int index27_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_22);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA27_12 = input.LA(1);

                         
                        int index27_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA27_7 = input.LA(1);

                         
                        int index27_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA27_10 = input.LA(1);

                         
                        int index27_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA27_8 = input.LA(1);

                         
                        int index27_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA27_5 = input.LA(1);

                         
                        int index27_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_5);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA27_20 = input.LA(1);

                         
                        int index27_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_20);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA27_15 = input.LA(1);

                         
                        int index27_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_15);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA27_21 = input.LA(1);

                         
                        int index27_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_21);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA27_19 = input.LA(1);

                         
                        int index27_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_19);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA27_13 = input.LA(1);

                         
                        int index27_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_13);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA27_17 = input.LA(1);

                         
                        int index27_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_17);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA27_2 = input.LA(1);

                         
                        int index27_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_2);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA27_23 = input.LA(1);

                         
                        int index27_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_23);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA27_9 = input.LA(1);

                         
                        int index27_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_9);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA27_11 = input.LA(1);

                         
                        int index27_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_11);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA27_6 = input.LA(1);

                         
                        int index27_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_6);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA27_4 = input.LA(1);

                         
                        int index27_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_4);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA27_14 = input.LA(1);

                         
                        int index27_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_14);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA27_24 = input.LA(1);

                         
                        int index27_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA38_eotS =
        "\31\uffff";
    static final String DFA38_eofS =
        "\1\1\30\uffff";
    static final String DFA38_minS =
        "\1\4\1\uffff\26\0\1\uffff";
    static final String DFA38_maxS =
        "\1\40\1\uffff\26\0\1\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\2\26\uffff\1\1";
    static final String DFA38_specialS =
        "\2\uffff\1\0\1\17\1\6\1\21\1\7\1\14\1\22\1\12\1\24\1\10\1\13\1\3"+
        "\1\11\1\25\1\16\1\5\1\15\1\1\1\23\1\2\1\20\1\4\1\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\6\1\7\1\2\1\3\1\4\1\5\2\1\1\10\1\11\1\12\1\13\1\14\2\1\1"+
            "\15\1\16\1\17\1\1\1\20\1\1\1\21\1\22\1\23\1\24\1\1\1\25\1\26"+
            "\1\27",
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
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "()* loopback of 3051:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_2 = input.LA(1);

                         
                        int index38_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_19 = input.LA(1);

                         
                        int index38_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_19);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_21 = input.LA(1);

                         
                        int index38_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_21);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA38_13 = input.LA(1);

                         
                        int index38_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA38_23 = input.LA(1);

                         
                        int index38_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_23);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA38_17 = input.LA(1);

                         
                        int index38_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_17);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA38_4 = input.LA(1);

                         
                        int index38_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA38_6 = input.LA(1);

                         
                        int index38_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_6);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA38_11 = input.LA(1);

                         
                        int index38_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_11);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA38_14 = input.LA(1);

                         
                        int index38_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_14);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA38_9 = input.LA(1);

                         
                        int index38_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_9);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA38_12 = input.LA(1);

                         
                        int index38_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA38_7 = input.LA(1);

                         
                        int index38_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_7);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA38_18 = input.LA(1);

                         
                        int index38_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_18);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA38_16 = input.LA(1);

                         
                        int index38_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA38_3 = input.LA(1);

                         
                        int index38_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_3);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA38_22 = input.LA(1);

                         
                        int index38_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_22);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA38_5 = input.LA(1);

                         
                        int index38_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_5);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA38_8 = input.LA(1);

                         
                        int index38_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_8);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA38_20 = input.LA(1);

                         
                        int index38_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA38_10 = input.LA(1);

                         
                        int index38_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_10);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA38_15 = input.LA(1);

                         
                        int index38_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\34\uffff";
    static final String DFA58_eofS =
        "\1\1\33\uffff";
    static final String DFA58_minS =
        "\1\4\1\uffff\31\0\1\uffff";
    static final String DFA58_maxS =
        "\1\40\1\uffff\31\0\1\uffff";
    static final String DFA58_acceptS =
        "\1\uffff\1\2\31\uffff\1\1";
    static final String DFA58_specialS =
        "\2\uffff\1\11\1\23\1\20\1\4\1\6\1\24\1\3\1\17\1\2\1\21\1\25\1\5"+
        "\1\14\1\1\1\30\1\7\1\26\1\12\1\27\1\13\1\22\1\10\1\15\1\0\1\16\1"+
        "\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\6\1\7\1\2\1\3\1\4\1\5\2\1\1\10\1\11\1\12\1\13\1\14\1\15\1"+
            "\1\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\1\1\30"+
            "\1\31\1\32",
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
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "()* loopback of 4134:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_25 = input.LA(1);

                         
                        int index58_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_25);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA58_15 = input.LA(1);

                         
                        int index58_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA58_10 = input.LA(1);

                         
                        int index58_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_10);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA58_8 = input.LA(1);

                         
                        int index58_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA58_5 = input.LA(1);

                         
                        int index58_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA58_13 = input.LA(1);

                         
                        int index58_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_13);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA58_6 = input.LA(1);

                         
                        int index58_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA58_17 = input.LA(1);

                         
                        int index58_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_17);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA58_23 = input.LA(1);

                         
                        int index58_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_23);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA58_2 = input.LA(1);

                         
                        int index58_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_2);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA58_19 = input.LA(1);

                         
                        int index58_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_19);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA58_21 = input.LA(1);

                         
                        int index58_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_21);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA58_14 = input.LA(1);

                         
                        int index58_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA58_24 = input.LA(1);

                         
                        int index58_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_24);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA58_26 = input.LA(1);

                         
                        int index58_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_26);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA58_9 = input.LA(1);

                         
                        int index58_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_9);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA58_4 = input.LA(1);

                         
                        int index58_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_4);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA58_11 = input.LA(1);

                         
                        int index58_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_11);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA58_22 = input.LA(1);

                         
                        int index58_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_22);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA58_3 = input.LA(1);

                         
                        int index58_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_3);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA58_7 = input.LA(1);

                         
                        int index58_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_7);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA58_12 = input.LA(1);

                         
                        int index58_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_12);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA58_18 = input.LA(1);

                         
                        int index58_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_18);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA58_20 = input.LA(1);

                         
                        int index58_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_20);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA58_16 = input.LA(1);

                         
                        int index58_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA81_eotS =
        "\4\uffff";
    static final String DFA81_eofS =
        "\2\2\2\uffff";
    static final String DFA81_minS =
        "\2\4\2\uffff";
    static final String DFA81_maxS =
        "\1\5\1\11\2\uffff";
    static final String DFA81_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA81_specialS =
        "\4\uffff}>";
    static final String[] DFA81_transitionS = {
            "\1\1\1\2",
            "\1\1\1\2\2\uffff\2\3",
            "",
            ""
    };

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "()* loopback of 5080:2: ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleArtifacts_in_entryRuleArtifacts75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtifacts85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts122 = new BitSet(new long[]{0x0001FFF800000110L});
    public static final BitSet FOLLOW_ruleOptionalFeature_in_ruleArtifacts146 = new BitSet(new long[]{0x0001FFF800000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts158 = new BitSet(new long[]{0x0001FFF800000112L});
    public static final BitSet FOLLOW_ruleMetaStatement_in_ruleArtifacts188 = new BitSet(new long[]{0x0001FFF800000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts200 = new BitSet(new long[]{0x0001FFF800000112L});
    public static final BitSet FOLLOW_ruleMappingRule_in_ruleArtifacts230 = new BitSet(new long[]{0x0001FFF800000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts242 = new BitSet(new long[]{0x0001FFF800000112L});
    public static final BitSet FOLLOW_rulePojoDefinition_in_ruleArtifacts272 = new BitSet(new long[]{0x0001FFF800000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts284 = new BitSet(new long[]{0x0001FFF800000112L});
    public static final BitSet FOLLOW_rulePojoUsage_in_ruleArtifacts314 = new BitSet(new long[]{0x0001FFF800000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts326 = new BitSet(new long[]{0x0001FFF800000112L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleArtifacts356 = new BitSet(new long[]{0x0001FFF800000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts368 = new BitSet(new long[]{0x0001FFF800000112L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_ruleArtifacts398 = new BitSet(new long[]{0x0001FFF800000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts410 = new BitSet(new long[]{0x0001FFF800000112L});
    public static final BitSet FOLLOW_ruleTableUsage_in_ruleArtifacts440 = new BitSet(new long[]{0x0001FFF800000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts452 = new BitSet(new long[]{0x0001FFF800000112L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleProperty546 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_36_in_ruleProperty583 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_37_in_ruleProperty621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty646 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty668 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_38_in_ruleProperty694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty719 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty741 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_39_in_ruleProperty767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty792 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty814 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_40_in_ruleProperty840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty865 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty887 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_41_in_ruleProperty913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty938 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty960 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleProperty973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValue_in_entryRulePropertyValue1009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValue1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_rulePropertyValue1061 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_rulePropertyValue1087 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePropertyValue1113 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rulePropertyValue1139 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulePropertyValue1165 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyValue1191 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rulePropertyValue1217 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_rulePropertyValue1243 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rulePropertyValue1269 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rulePropertyValue1295 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rulePropertyValue1321 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rulePropertyValue1347 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rulePropertyValue1373 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_rulePropertyValue1399 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_NOT_in_rulePropertyValue1425 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_BAND_in_rulePropertyValue1451 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_BOR_in_rulePropertyValue1477 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_HASH_in_rulePropertyValue1503 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_AT_in_rulePropertyValue1529 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_CARET_in_rulePropertyValue1555 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_rulePropertyValue1581 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_rulePropertyValue1607 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_rulePropertyValue1633 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_rulePropertyValue1659 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_AND_in_rulePropertyValue1685 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_OR_in_rulePropertyValue1711 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_rulePropertyValue1737 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_REST_in_rulePropertyValue1955 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_rulePropertyValue1981 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePropertyValue2007 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rulePropertyValue2033 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_WS_in_rulePropertyValue2059 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulePropertyValue2085 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyValue2111 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rulePropertyValue2137 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_rulePropertyValue2163 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rulePropertyValue2189 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rulePropertyValue2215 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rulePropertyValue2241 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rulePropertyValue2267 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rulePropertyValue2293 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_rulePropertyValue2319 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_NOT_in_rulePropertyValue2345 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_BAND_in_rulePropertyValue2371 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_BOR_in_rulePropertyValue2397 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_HASH_in_rulePropertyValue2423 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_AT_in_rulePropertyValue2449 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_CARET_in_rulePropertyValue2475 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_rulePropertyValue2501 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_rulePropertyValue2527 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_rulePropertyValue2553 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_rulePropertyValue2579 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_AND_in_rulePropertyValue2605 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_OR_in_rulePropertyValue2631 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_rulePropertyValue2657 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_rulePojoDefinition_in_entryRulePojoDefinition2711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePojoDefinition2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePojoDefinition2762 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePojoDefinition2779 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePojoDefinition2803 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_rulePojoDefinition2823 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulePojoDefinition2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePojoUsage_in_entryRulePojoUsage2881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePojoUsage2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnUsage_in_rulePojoUsage2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierUsage_in_rulePojoUsage2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantUsage_in_rulePojoUsage2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingUsage_in_rulePojoUsage3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnUsage_in_entryRuleColumnUsage3060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnUsage3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleColumnUsage3111 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumnUsage3131 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumnUsage3151 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleColumnUsage3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierUsage_in_entryRuleIdentifierUsage3207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifierUsage3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleIdentifierUsage3258 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifierUsage3278 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifierUsage3298 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleIdentifierUsage3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantUsage_in_entryRuleConstantUsage3354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantUsage3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleConstantUsage3405 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstantUsage3425 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstantUsage3445 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleConstantUsage3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingUsage_in_entryRuleMappingUsage3501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingUsage3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleMappingUsage3552 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingUsage3572 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingUsage3592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleMappingUsage3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition3648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableDefinition3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTableDefinition3699 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTableDefinition3716 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTableDefinition3738 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleTableDefinition3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableUsage_in_entryRuleTableUsage3799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableUsage3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTableUsage3850 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTableUsage3870 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTableUsage3890 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleTableUsage3902 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTableUsage3919 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleTableUsage3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaStatement_in_entryRuleMetaStatement3974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaStatement3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMetaStatement4026 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleMetaStatement4042 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_ruleSTATEMEN_TYPE_in_ruleMetaStatement4062 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleMetaStatement4074 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMetaStatement4090 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleMetaStatement4108 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMetaStatement4118 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_ruleSql_in_ruleMetaStatement4138 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleMetaStatement4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSql_in_entryRuleSql4184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSql4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlFragment_in_ruleSql4239 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_ruleSqlFragment_in_entryRuleSqlFragment4275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlFragment4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlValue_in_ruleSqlFragment4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleSqlFragment4349 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_ruleColumn_in_ruleSqlFragment4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSqlFragment4388 = new BitSet(new long[]{0x0000000000006180L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleSqlFragment4408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleSqlFragment4427 = new BitSet(new long[]{0x000000001C006380L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleSqlFragment4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleSqlFragment4466 = new BitSet(new long[]{0x0000000004E80010L});
    public static final BitSet FOLLOW_ruleMetaSql_in_ruleSqlFragment4486 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleSqlFragment4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleSqlFragment4515 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleDatabaseColumn_in_ruleSqlFragment4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlValue_in_entryRuleSqlValue4573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlValue4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleSqlValue4625 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleSqlValue4651 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleSqlValue4677 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSqlValue4703 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSqlValue4729 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleSqlValue4755 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleSqlValue4781 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleSqlValue4807 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleSqlValue4833 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleSqlValue4859 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleSqlValue4885 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleSqlValue4911 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleSqlValue4937 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleSqlValue4963 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleSqlValue4989 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleSqlValue5015 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleSqlValue5041 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleSqlValue5067 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleSqlValue5093 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleSqlValue5119 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleSqlValue5145 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleSqlValue5171 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleSqlValue5197 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleSqlValue5380 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleSqlValue5406 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleSqlValue5432 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSqlValue5458 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSqlValue5484 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleSqlValue5510 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleSqlValue5536 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleSqlValue5562 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleSqlValue5588 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleSqlValue5614 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleSqlValue5640 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleSqlValue5666 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleSqlValue5692 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleSqlValue5718 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleSqlValue5744 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleSqlValue5770 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleSqlValue5796 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleSqlValue5822 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleSqlValue5848 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleSqlValue5874 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleSqlValue5900 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleSqlValue5926 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleSqlValue5952 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_ruleMetaSql_in_entryRuleMetaSql6000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaSql6010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMetaSql6047 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6067 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql6079 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6099 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleMetaSql6126 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_ruleIfSqlCond_in_ruleMetaSql6152 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql6163 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6183 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql6195 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6215 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleMetaSql6242 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6268 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql6280 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6300 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql6327 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6353 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql6365 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6385 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMetaSql6412 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMetaSql6429 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMetaSql6447 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleMetaSql6498 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMetaSql6514 = new BitSet(new long[]{0x00000001FFFBFFF0L});
    public static final BitSet FOLLOW_ruleOrdSql_in_ruleMetaSql6534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSql_in_entryRuleIfSql6571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSql6581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSqlFragment_in_ruleIfSql6626 = new BitSet(new long[]{0x00000001FFBBFFF2L});
    public static final BitSet FOLLOW_ruleIfSqlFragment_in_entryRuleIfSqlFragment6662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSqlFragment6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSqlValue_in_ruleIfSqlFragment6718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleIfSqlFragment6736 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_ruleColumn_in_ruleIfSqlFragment6756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIfSqlFragment6775 = new BitSet(new long[]{0x0000000000006180L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleIfSqlFragment6795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleIfSqlFragment6814 = new BitSet(new long[]{0x000000001C006380L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleIfSqlFragment6834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleIfSqlFragment6853 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleDatabaseColumn_in_ruleIfSqlFragment6873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleIfSqlFragment6892 = new BitSet(new long[]{0x0000000000680010L});
    public static final BitSet FOLLOW_ruleIfMetaSql_in_ruleIfSqlFragment6912 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleIfSqlFragment6923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSqlValue_in_entryRuleIfSqlValue6960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSqlValue6971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleIfSqlValue7012 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleIfSqlValue7038 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIfSqlValue7064 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIfSqlValue7090 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlValue7116 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleIfSqlValue7142 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleIfSqlValue7168 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleIfSqlValue7194 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleIfSqlValue7220 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleIfSqlValue7246 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleIfSqlValue7272 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleIfSqlValue7298 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlValue7324 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleIfSqlValue7350 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleIfSqlValue7376 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleIfSqlValue7402 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleIfSqlValue7428 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleIfSqlValue7454 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleIfSqlValue7480 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleIfSqlValue7506 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleIfSqlValue7532 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleIfSqlValue7558 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleIfSqlValue7734 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleIfSqlValue7760 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIfSqlValue7786 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIfSqlValue7812 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlValue7838 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleIfSqlValue7864 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleIfSqlValue7890 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleIfSqlValue7916 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleIfSqlValue7942 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleIfSqlValue7968 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleIfSqlValue7994 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleIfSqlValue8020 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlValue8046 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleIfSqlValue8072 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleIfSqlValue8098 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleIfSqlValue8124 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleIfSqlValue8150 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleIfSqlValue8176 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleIfSqlValue8202 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleIfSqlValue8228 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleIfSqlValue8254 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleIfSqlValue8280 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_ruleIfMetaSql_in_entryRuleIfMetaSql8328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfMetaSql8338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfMetaSql8375 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8395 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql8407 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8427 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleIfMetaSql8454 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_ruleIfSqlCond_in_ruleIfMetaSql8480 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql8491 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8511 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql8523 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8543 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleIfMetaSql8570 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8596 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql8608 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8628 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql8655 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8681 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql8693 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8713 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleIfSqlCond_in_entryRuleIfSqlCond8752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSqlCond8762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlCond8799 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_ruleIfSqlBool_in_ruleIfSqlCond8821 = new BitSet(new long[]{0x00000000C0000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlCond8833 = new BitSet(new long[]{0x00000000C0000012L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleIfSqlCond8854 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleIfSqlCond8874 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlCond8894 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_ruleIfSqlBool_in_ruleIfSqlCond8916 = new BitSet(new long[]{0x00000000C0000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlCond8928 = new BitSet(new long[]{0x00000000C0000012L});
    public static final BitSet FOLLOW_ruleIfSqlBool_in_entryRuleIfSqlBool8967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSqlBool8977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlBool9020 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIfSqlBool9037 = new BitSet(new long[]{0x0000000000006180L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleIfSqlBool9057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlBool9082 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleIfSqlBool9099 = new BitSet(new long[]{0x000000001C006380L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleIfSqlBool9119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlBool9144 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleIfSqlBool9161 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_ruleIfSqlCond_in_ruleIfSqlBool9181 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleIfSqlBool9192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrdSql_in_entryRuleOrdSql9228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrdSql9238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrdSql2_in_ruleOrdSql9283 = new BitSet(new long[]{0x00000001FFFBFFF2L});
    public static final BitSet FOLLOW_ruleOrdSql2_in_entryRuleOrdSql29319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrdSql29329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrdSqlValue_in_ruleOrdSql29375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOrdSql29393 = new BitSet(new long[]{0x0000000000006180L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleOrdSql29413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleOrdSql29432 = new BitSet(new long[]{0x000000001C006380L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleOrdSql29452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleOrdSql29471 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleDatabaseColumn_in_ruleOrdSql29491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrdSqlValue_in_entryRuleOrdSqlValue9529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrdSqlValue9540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleOrdSqlValue9581 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleOrdSqlValue9607 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleOrdSqlValue9633 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleOrdSqlValue9659 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleOrdSqlValue9685 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleOrdSqlValue9711 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleOrdSqlValue9737 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleOrdSqlValue9763 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleOrdSqlValue9789 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOrdSqlValue9815 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOrdSqlValue9841 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleOrdSqlValue9867 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleOrdSqlValue9893 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleOrdSqlValue9919 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleOrdSqlValue9945 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleOrdSqlValue9971 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleOrdSqlValue9997 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleOrdSqlValue10023 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleOrdSqlValue10049 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleOrdSqlValue10075 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleOrdSqlValue10101 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleOrdSqlValue10127 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleOrdSqlValue10153 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleOrdSqlValue10179 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleOrdSqlValue10205 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleOrdSqlValue10402 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleOrdSqlValue10428 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleOrdSqlValue10454 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleOrdSqlValue10480 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleOrdSqlValue10506 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleOrdSqlValue10532 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleOrdSqlValue10558 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleOrdSqlValue10584 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleOrdSqlValue10610 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOrdSqlValue10636 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOrdSqlValue10662 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleOrdSqlValue10688 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleOrdSqlValue10714 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleOrdSqlValue10740 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleOrdSqlValue10766 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleOrdSqlValue10792 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleOrdSqlValue10818 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleOrdSqlValue10844 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleOrdSqlValue10870 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleOrdSqlValue10896 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleOrdSqlValue10922 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleOrdSqlValue10948 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleOrdSqlValue10974 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleOrdSqlValue11000 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleOrdSqlValue11026 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn11074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumn11084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumn11128 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleColumn11148 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleColumn11168 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleColumn11194 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumn11211 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleColumn11234 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumn11253 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleColumn11273 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant11321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant11331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleConstant11375 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleConstant11395 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstant11423 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleConstant11443 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleConstant11469 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstant11486 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleConstant11509 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstant11528 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleConstant11548 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier11596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier11606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleIdentifier11650 = new BitSet(new long[]{0x0000000000006380L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleIdentifier11670 = new BitSet(new long[]{0x0000000000006380L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleIdentifier11690 = new BitSet(new long[]{0x0000000000006380L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleIdentifier11718 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleIdentifier11738 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifier11766 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleIdentifier11786 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIdentifier11806 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleIdentifier11832 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifier11849 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleIdentifier11872 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifier11891 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIdentifier11911 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleDatabaseColumn_in_entryRuleDatabaseColumn11959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatabaseColumn11969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleDatabaseColumn12012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleDatabaseColumn12032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingRule_in_entryRuleMappingRule12075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingRule12085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingRule12127 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleMappingRule12143 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleMAPPING_TYPE_in_ruleMappingRule12163 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleMappingRule12175 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingRule12191 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleMappingRule12209 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMappingRule12219 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleMappingRule12239 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleMappingRule12250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping12285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping12295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMapping12332 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_ruleMappingItem_in_ruleMapping12354 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMapping12367 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_ruleMappingItem_in_ruleMapping12389 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMapping12403 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleMappingItem_in_entryRuleMappingItem12440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingItem12450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingItem12494 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMappingItem12514 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMappingItem12534 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingItem12550 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMappingItem12568 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleMappingColumn_in_ruleMappingItem12588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingColumn_in_entryRuleMappingColumn12628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingColumn12638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingColumn12682 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleMappingColumn12702 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleMappingColumn12722 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingColumn12740 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMappingColumn12760 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOptionalFeature_in_entryRuleOptionalFeature12806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalFeature12816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleOptionalFeature12858 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOptionalFeature12874 = new BitSet(new long[]{0x07C0000000000000L});
    public static final BitSet FOLLOW_ruleOPTION_TYPE_in_ruleOptionalFeature12894 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleOptionalFeature12906 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleOptionalFeature12922 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOptionalFeature12940 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleOptionalFeature12950 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_ruleFeatureValue_in_ruleOptionalFeature12970 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleOptionalFeature12981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureValue_in_entryRuleFeatureValue13017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureValue13028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleFeatureValue13068 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleFeatureValue13094 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleFeatureValue13120 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleFeatureValue13146 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleFeatureValue13172 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleFeatureValue13198 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureValue13224 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleFeatureValue13250 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleFeatureValue13276 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleFeatureValue13302 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleFeatureValue13328 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleFeatureValue13354 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleFeatureValue13380 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleFeatureValue13406 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleFeatureValue13432 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleFeatureValue13458 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleFeatureValue13484 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleFeatureValue13510 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleFeatureValue13536 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleFeatureValue13562 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleFeatureValue13588 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleFeatureValue13614 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleFeatureValue13640 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleFeatureValue13666 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleFeatureValue13692 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleFeatureValue13718 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleFeatureValue13744 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleFeatureValue13770 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_50_in_ruleSTATEMEN_TYPE13830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleSTATEMEN_TYPE13847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleSTATEMEN_TYPE13864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleMAPPING_TYPE13908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleOPTION_TYPE13952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleOPTION_TYPE13969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOPTION_TYPE13986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleOPTION_TYPE14003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOPTION_TYPE14020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred1_InternalProcessorDsl1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred2_InternalProcessorDsl5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred3_InternalProcessorDsl7575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred4_InternalProcessorDsl10222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred5_InternalProcessorDsl11189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred6_InternalProcessorDsl11229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred7_InternalProcessorDsl11464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred8_InternalProcessorDsl11504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred9_InternalProcessorDsl11827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred10_InternalProcessorDsl11867 = new BitSet(new long[]{0x0000000000000002L});

}