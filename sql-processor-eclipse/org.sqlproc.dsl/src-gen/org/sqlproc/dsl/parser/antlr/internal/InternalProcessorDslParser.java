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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:285:1: ruleProperty returns [EObject current=null] : ( ( ( (lv_pojo_0_0= 'resolve references' ) ) | ( (lv_database_1_0= 'database online' ) ) | (otherlv_2= 'database url' (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) ) | (otherlv_5= 'database username' (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) ) | (otherlv_8= 'database password' (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) ) | (otherlv_11= 'database schema' (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) ) | (otherlv_14= 'database driver' (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) ) ) this_SEMICOLON_17= RULE_SEMICOLON ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:288:28: ( ( ( ( (lv_pojo_0_0= 'resolve references' ) ) | ( (lv_database_1_0= 'database online' ) ) | (otherlv_2= 'database url' (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) ) | (otherlv_5= 'database username' (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) ) | (otherlv_8= 'database password' (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) ) | (otherlv_11= 'database schema' (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) ) | (otherlv_14= 'database driver' (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) ) ) this_SEMICOLON_17= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:1: ( ( ( (lv_pojo_0_0= 'resolve references' ) ) | ( (lv_database_1_0= 'database online' ) ) | (otherlv_2= 'database url' (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) ) | (otherlv_5= 'database username' (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) ) | (otherlv_8= 'database password' (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) ) | (otherlv_11= 'database schema' (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) ) | (otherlv_14= 'database driver' (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) ) ) this_SEMICOLON_17= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:1: ( ( ( (lv_pojo_0_0= 'resolve references' ) ) | ( (lv_database_1_0= 'database online' ) ) | (otherlv_2= 'database url' (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) ) | (otherlv_5= 'database username' (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) ) | (otherlv_8= 'database password' (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) ) | (otherlv_11= 'database schema' (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) ) | (otherlv_14= 'database driver' (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) ) ) this_SEMICOLON_17= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:2: ( ( (lv_pojo_0_0= 'resolve references' ) ) | ( (lv_database_1_0= 'database online' ) ) | (otherlv_2= 'database url' (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) ) | (otherlv_5= 'database username' (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) ) | (otherlv_8= 'database password' (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) ) | (otherlv_11= 'database schema' (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) ) | (otherlv_14= 'database driver' (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) ) ) this_SEMICOLON_17= RULE_SEMICOLON
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:2: ( ( (lv_pojo_0_0= 'resolve references' ) ) | ( (lv_database_1_0= 'database online' ) ) | (otherlv_2= 'database url' (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) ) | (otherlv_5= 'database username' (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) ) | (otherlv_8= 'database password' (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) ) | (otherlv_11= 'database schema' (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) ) | (otherlv_14= 'database driver' (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) ) )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:3: ( (lv_pojo_0_0= 'resolve references' ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:3: ( (lv_pojo_0_0= 'resolve references' ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:290:1: (lv_pojo_0_0= 'resolve references' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:290:1: (lv_pojo_0_0= 'resolve references' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:291:3: lv_pojo_0_0= 'resolve references'
                    {
                    lv_pojo_0_0=(Token)match(input,35,FOLLOW_35_in_ruleProperty546); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:305:6: ( (lv_database_1_0= 'database online' ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:305:6: ( (lv_database_1_0= 'database online' ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:306:1: (lv_database_1_0= 'database online' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:306:1: (lv_database_1_0= 'database online' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:307:3: lv_database_1_0= 'database online'
                    {
                    lv_database_1_0=(Token)match(input,36,FOLLOW_36_in_ruleProperty583); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:321:6: (otherlv_2= 'database url' (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:321:6: (otherlv_2= 'database url' (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:321:8: otherlv_2= 'database url' (this_WS_3= RULE_WS )+ ( (lv_dbUrl_4_0= rulePropertyValue ) )
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleProperty615); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getDatabaseUrlKeyword_0_2_0());
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:325:1: (this_WS_3= RULE_WS )+
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
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:325:2: this_WS_3= RULE_WS
                    	    {
                    	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty627); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:329:3: ( (lv_dbUrl_4_0= rulePropertyValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:330:1: (lv_dbUrl_4_0= rulePropertyValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:330:1: (lv_dbUrl_4_0= rulePropertyValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:331:3: lv_dbUrl_4_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getDbUrlPropertyValueParserRuleCall_0_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty649);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:348:6: (otherlv_5= 'database username' (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:348:6: (otherlv_5= 'database username' (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:348:8: otherlv_5= 'database username' (this_WS_6= RULE_WS )+ ( (lv_dbUsername_7_0= rulePropertyValue ) )
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleProperty669); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getDatabaseUsernameKeyword_0_3_0());
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:352:1: (this_WS_6= RULE_WS )+
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
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:352:2: this_WS_6= RULE_WS
                    	    {
                    	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty681); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:356:3: ( (lv_dbUsername_7_0= rulePropertyValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:357:1: (lv_dbUsername_7_0= rulePropertyValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:357:1: (lv_dbUsername_7_0= rulePropertyValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:358:3: lv_dbUsername_7_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getDbUsernamePropertyValueParserRuleCall_0_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty703);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:375:6: (otherlv_8= 'database password' (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:375:6: (otherlv_8= 'database password' (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:375:8: otherlv_8= 'database password' (this_WS_9= RULE_WS )+ ( (lv_dbPassword_10_0= rulePropertyValue ) )
                    {
                    otherlv_8=(Token)match(input,39,FOLLOW_39_in_ruleProperty723); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getDatabasePasswordKeyword_0_4_0());
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:379:1: (this_WS_9= RULE_WS )+
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
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:379:2: this_WS_9= RULE_WS
                    	    {
                    	    this_WS_9=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty735); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:383:3: ( (lv_dbPassword_10_0= rulePropertyValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:384:1: (lv_dbPassword_10_0= rulePropertyValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:384:1: (lv_dbPassword_10_0= rulePropertyValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:385:3: lv_dbPassword_10_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getDbPasswordPropertyValueParserRuleCall_0_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty757);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:402:6: (otherlv_11= 'database schema' (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:402:6: (otherlv_11= 'database schema' (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:402:8: otherlv_11= 'database schema' (this_WS_12= RULE_WS )+ ( (lv_dbSchema_13_0= rulePropertyValue ) )
                    {
                    otherlv_11=(Token)match(input,40,FOLLOW_40_in_ruleProperty777); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getPropertyAccess().getDatabaseSchemaKeyword_0_5_0());
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:406:1: (this_WS_12= RULE_WS )+
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
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:406:2: this_WS_12= RULE_WS
                    	    {
                    	    this_WS_12=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty789); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:410:3: ( (lv_dbSchema_13_0= rulePropertyValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:411:1: (lv_dbSchema_13_0= rulePropertyValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:411:1: (lv_dbSchema_13_0= rulePropertyValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:412:3: lv_dbSchema_13_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getDbSchemaPropertyValueParserRuleCall_0_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty811);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:429:6: (otherlv_14= 'database driver' (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:429:6: (otherlv_14= 'database driver' (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:429:8: otherlv_14= 'database driver' (this_WS_15= RULE_WS )+ ( (lv_dbDriver_16_0= rulePropertyValue ) )
                    {
                    otherlv_14=(Token)match(input,41,FOLLOW_41_in_ruleProperty831); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getPropertyAccess().getDatabaseDriverKeyword_0_6_0());
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:433:1: (this_WS_15= RULE_WS )+
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
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:433:2: this_WS_15= RULE_WS
                    	    {
                    	    this_WS_15=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty843); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:437:3: ( (lv_dbDriver_16_0= rulePropertyValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:438:1: (lv_dbDriver_16_0= rulePropertyValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:438:1: (lv_dbDriver_16_0= rulePropertyValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:439:3: lv_dbDriver_16_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getDbDriverPropertyValueParserRuleCall_0_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty865);
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

            this_SEMICOLON_17=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleProperty878); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:467:1: entryRulePropertyValue returns [String current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final String entryRulePropertyValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:468:2: (iv_rulePropertyValue= rulePropertyValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:469:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValueRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValue_in_entryRulePropertyValue914);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValue925); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:476:1: rulePropertyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN | this_PERCENT_23= RULE_PERCENT | this_AND_24= RULE_AND | this_OR_25= RULE_OR | this_ESC_CHAR_26= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )* ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:479:28: ( ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN | this_PERCENT_23= RULE_PERCENT | this_AND_24= RULE_AND | this_OR_25= RULE_OR | this_ESC_CHAR_26= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:480:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN | this_PERCENT_23= RULE_PERCENT | this_AND_24= RULE_AND | this_OR_25= RULE_OR | this_ESC_CHAR_26= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:480:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN | this_PERCENT_23= RULE_PERCENT | this_AND_24= RULE_AND | this_OR_25= RULE_OR | this_ESC_CHAR_26= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:480:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN | this_PERCENT_23= RULE_PERCENT | this_AND_24= RULE_AND | this_OR_25= RULE_OR | this_ESC_CHAR_26= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:480:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN | this_PERCENT_23= RULE_PERCENT | this_AND_24= RULE_AND | this_OR_25= RULE_OR | this_ESC_CHAR_26= RULE_ESC_CHAR )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:480:7: this_REST_0= RULE_REST
                    {
                    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_rulePropertyValue966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REST_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REST_0, grammarAccess.getPropertyValueAccess().getRESTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:488:10: this_IDENT_DOT_1= RULE_IDENT_DOT
                    {
                    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_rulePropertyValue992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_DOT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_DOT_1, grammarAccess.getPropertyValueAccess().getIDENT_DOTTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:496:10: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePropertyValue1018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_2, grammarAccess.getPropertyValueAccess().getIDENTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:504:10: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rulePropertyValue1044); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_3, grammarAccess.getPropertyValueAccess().getNUMBERTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:512:10: this_COLON_4= RULE_COLON
                    {
                    this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulePropertyValue1070); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COLON_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_4, grammarAccess.getPropertyValueAccess().getCOLONTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:520:10: this_STRING_5= RULE_STRING
                    {
                    this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertyValue1096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_5, grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:528:10: this_COMMA_6= RULE_COMMA
                    {
                    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulePropertyValue1122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_6, grammarAccess.getPropertyValueAccess().getCOMMATerminalRuleCall_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:536:10: this_MINUS_7= RULE_MINUS
                    {
                    this_MINUS_7=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_rulePropertyValue1148); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_7, grammarAccess.getPropertyValueAccess().getMINUSTerminalRuleCall_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:544:10: this_PLUS_8= RULE_PLUS
                    {
                    this_PLUS_8=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rulePropertyValue1174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_8, grammarAccess.getPropertyValueAccess().getPLUSTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:552:10: this_LPAREN_9= RULE_LPAREN
                    {
                    this_LPAREN_9=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rulePropertyValue1200); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LPAREN_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_9, grammarAccess.getPropertyValueAccess().getLPARENTerminalRuleCall_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:560:10: this_RPAREN_10= RULE_RPAREN
                    {
                    this_RPAREN_10=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rulePropertyValue1226); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RPAREN_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_10, grammarAccess.getPropertyValueAccess().getRPARENTerminalRuleCall_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:568:10: this_LBRACE_11= RULE_LBRACE
                    {
                    this_LBRACE_11=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rulePropertyValue1252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LBRACE_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACE_11, grammarAccess.getPropertyValueAccess().getLBRACETerminalRuleCall_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:576:10: this_RBRACE_12= RULE_RBRACE
                    {
                    this_RBRACE_12=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rulePropertyValue1278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RBRACE_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RBRACE_12, grammarAccess.getPropertyValueAccess().getRBRACETerminalRuleCall_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:584:10: this_QUESTI_13= RULE_QUESTI
                    {
                    this_QUESTI_13=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_rulePropertyValue1304); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUESTI_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUESTI_13, grammarAccess.getPropertyValueAccess().getQUESTITerminalRuleCall_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:592:10: this_NOT_14= RULE_NOT
                    {
                    this_NOT_14=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_rulePropertyValue1330); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_14, grammarAccess.getPropertyValueAccess().getNOTTerminalRuleCall_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:600:10: this_BAND_15= RULE_BAND
                    {
                    this_BAND_15=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_rulePropertyValue1356); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BAND_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BAND_15, grammarAccess.getPropertyValueAccess().getBANDTerminalRuleCall_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:608:10: this_BOR_16= RULE_BOR
                    {
                    this_BOR_16=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_rulePropertyValue1382); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOR_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_16, grammarAccess.getPropertyValueAccess().getBORTerminalRuleCall_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:616:10: this_HASH_17= RULE_HASH
                    {
                    this_HASH_17=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rulePropertyValue1408); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASH_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASH_17, grammarAccess.getPropertyValueAccess().getHASHTerminalRuleCall_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:624:10: this_AT_18= RULE_AT
                    {
                    this_AT_18=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_rulePropertyValue1434); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AT_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_18, grammarAccess.getPropertyValueAccess().getATTerminalRuleCall_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:632:10: this_CARET_19= RULE_CARET
                    {
                    this_CARET_19=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_rulePropertyValue1460); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CARET_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_19, grammarAccess.getPropertyValueAccess().getCARETTerminalRuleCall_0_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:640:10: this_EQUALS_20= RULE_EQUALS
                    {
                    this_EQUALS_20=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rulePropertyValue1486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUALS_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_20, grammarAccess.getPropertyValueAccess().getEQUALSTerminalRuleCall_0_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:648:10: this_LESS_THAN_21= RULE_LESS_THAN
                    {
                    this_LESS_THAN_21=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_rulePropertyValue1512); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LESS_THAN_21);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LESS_THAN_21, grammarAccess.getPropertyValueAccess().getLESS_THANTerminalRuleCall_0_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:656:10: this_MORE_THAN_22= RULE_MORE_THAN
                    {
                    this_MORE_THAN_22=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_rulePropertyValue1538); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MORE_THAN_22);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MORE_THAN_22, grammarAccess.getPropertyValueAccess().getMORE_THANTerminalRuleCall_0_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:664:10: this_PERCENT_23= RULE_PERCENT
                    {
                    this_PERCENT_23=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_rulePropertyValue1564); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PERCENT_23);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PERCENT_23, grammarAccess.getPropertyValueAccess().getPERCENTTerminalRuleCall_0_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:672:10: this_AND_24= RULE_AND
                    {
                    this_AND_24=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_rulePropertyValue1590); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AND_24);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AND_24, grammarAccess.getPropertyValueAccess().getANDTerminalRuleCall_0_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:680:10: this_OR_25= RULE_OR
                    {
                    this_OR_25=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_rulePropertyValue1616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_OR_25);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OR_25, grammarAccess.getPropertyValueAccess().getORTerminalRuleCall_0_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:688:10: this_ESC_CHAR_26= RULE_ESC_CHAR
                    {
                    this_ESC_CHAR_26=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_rulePropertyValue1642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESC_CHAR_26);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESC_CHAR_26, grammarAccess.getPropertyValueAccess().getESC_CHARTerminalRuleCall_0_26()); 
                          
                    }

                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:695:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:695:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:722:23: (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR )
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
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:722:28: this_REST_27= RULE_REST
            	            {
            	            this_REST_27=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_rulePropertyValue1860); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REST_27);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REST_27, grammarAccess.getPropertyValueAccess().getRESTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:730:10: this_IDENT_DOT_28= RULE_IDENT_DOT
            	            {
            	            this_IDENT_DOT_28=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_rulePropertyValue1886); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_DOT_28);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_DOT_28, grammarAccess.getPropertyValueAccess().getIDENT_DOTTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:738:10: this_IDENT_29= RULE_IDENT
            	            {
            	            this_IDENT_29=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePropertyValue1912); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_29);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_29, grammarAccess.getPropertyValueAccess().getIDENTTerminalRuleCall_1_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:746:10: this_NUMBER_30= RULE_NUMBER
            	            {
            	            this_NUMBER_30=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rulePropertyValue1938); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NUMBER_30);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NUMBER_30, grammarAccess.getPropertyValueAccess().getNUMBERTerminalRuleCall_1_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:754:10: this_WS_31= RULE_WS
            	            {
            	            this_WS_31=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulePropertyValue1964); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_WS_31);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_WS_31, grammarAccess.getPropertyValueAccess().getWSTerminalRuleCall_1_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:762:10: this_COLON_32= RULE_COLON
            	            {
            	            this_COLON_32=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulePropertyValue1990); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COLON_32);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COLON_32, grammarAccess.getPropertyValueAccess().getCOLONTerminalRuleCall_1_0_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:770:10: this_STRING_33= RULE_STRING
            	            {
            	            this_STRING_33=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertyValue2016); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_STRING_33);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_STRING_33, grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_1_0_6()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:778:10: this_COMMA_34= RULE_COMMA
            	            {
            	            this_COMMA_34=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulePropertyValue2042); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COMMA_34);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COMMA_34, grammarAccess.getPropertyValueAccess().getCOMMATerminalRuleCall_1_0_7()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:786:10: this_MINUS_35= RULE_MINUS
            	            {
            	            this_MINUS_35=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_rulePropertyValue2068); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MINUS_35);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MINUS_35, grammarAccess.getPropertyValueAccess().getMINUSTerminalRuleCall_1_0_8()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:794:10: this_PLUS_36= RULE_PLUS
            	            {
            	            this_PLUS_36=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rulePropertyValue2094); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PLUS_36);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PLUS_36, grammarAccess.getPropertyValueAccess().getPLUSTerminalRuleCall_1_0_9()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:802:10: this_LPAREN_37= RULE_LPAREN
            	            {
            	            this_LPAREN_37=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rulePropertyValue2120); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LPAREN_37);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LPAREN_37, grammarAccess.getPropertyValueAccess().getLPARENTerminalRuleCall_1_0_10()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:810:10: this_RPAREN_38= RULE_RPAREN
            	            {
            	            this_RPAREN_38=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rulePropertyValue2146); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RPAREN_38);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RPAREN_38, grammarAccess.getPropertyValueAccess().getRPARENTerminalRuleCall_1_0_11()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 13 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:818:10: this_LBRACE_39= RULE_LBRACE
            	            {
            	            this_LBRACE_39=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rulePropertyValue2172); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LBRACE_39);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LBRACE_39, grammarAccess.getPropertyValueAccess().getLBRACETerminalRuleCall_1_0_12()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 14 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:826:10: this_RBRACE_40= RULE_RBRACE
            	            {
            	            this_RBRACE_40=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rulePropertyValue2198); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RBRACE_40);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RBRACE_40, grammarAccess.getPropertyValueAccess().getRBRACETerminalRuleCall_1_0_13()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 15 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:834:10: this_QUESTI_41= RULE_QUESTI
            	            {
            	            this_QUESTI_41=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_rulePropertyValue2224); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_QUESTI_41);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_QUESTI_41, grammarAccess.getPropertyValueAccess().getQUESTITerminalRuleCall_1_0_14()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 16 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:842:10: this_NOT_42= RULE_NOT
            	            {
            	            this_NOT_42=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_rulePropertyValue2250); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NOT_42);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NOT_42, grammarAccess.getPropertyValueAccess().getNOTTerminalRuleCall_1_0_15()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 17 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:850:10: this_BAND_43= RULE_BAND
            	            {
            	            this_BAND_43=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_rulePropertyValue2276); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BAND_43);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BAND_43, grammarAccess.getPropertyValueAccess().getBANDTerminalRuleCall_1_0_16()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 18 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:858:10: this_BOR_44= RULE_BOR
            	            {
            	            this_BOR_44=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_rulePropertyValue2302); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BOR_44);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BOR_44, grammarAccess.getPropertyValueAccess().getBORTerminalRuleCall_1_0_17()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 19 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:866:10: this_HASH_45= RULE_HASH
            	            {
            	            this_HASH_45=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rulePropertyValue2328); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_HASH_45);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_HASH_45, grammarAccess.getPropertyValueAccess().getHASHTerminalRuleCall_1_0_18()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 20 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:874:10: this_AT_46= RULE_AT
            	            {
            	            this_AT_46=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_rulePropertyValue2354); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AT_46);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AT_46, grammarAccess.getPropertyValueAccess().getATTerminalRuleCall_1_0_19()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 21 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:882:10: this_CARET_47= RULE_CARET
            	            {
            	            this_CARET_47=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_rulePropertyValue2380); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_CARET_47);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_CARET_47, grammarAccess.getPropertyValueAccess().getCARETTerminalRuleCall_1_0_20()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 22 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:890:10: this_EQUALS_48= RULE_EQUALS
            	            {
            	            this_EQUALS_48=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rulePropertyValue2406); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_EQUALS_48);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_EQUALS_48, grammarAccess.getPropertyValueAccess().getEQUALSTerminalRuleCall_1_0_21()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 23 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:898:10: this_LESS_THAN_49= RULE_LESS_THAN
            	            {
            	            this_LESS_THAN_49=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_rulePropertyValue2432); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LESS_THAN_49);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LESS_THAN_49, grammarAccess.getPropertyValueAccess().getLESS_THANTerminalRuleCall_1_0_22()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 24 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:906:10: this_MORE_THAN_50= RULE_MORE_THAN
            	            {
            	            this_MORE_THAN_50=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_rulePropertyValue2458); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MORE_THAN_50);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MORE_THAN_50, grammarAccess.getPropertyValueAccess().getMORE_THANTerminalRuleCall_1_0_23()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 25 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:914:10: this_PERCENT_51= RULE_PERCENT
            	            {
            	            this_PERCENT_51=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_rulePropertyValue2484); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PERCENT_51);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PERCENT_51, grammarAccess.getPropertyValueAccess().getPERCENTTerminalRuleCall_1_0_24()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 26 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:922:10: this_AND_52= RULE_AND
            	            {
            	            this_AND_52=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_rulePropertyValue2510); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AND_52);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AND_52, grammarAccess.getPropertyValueAccess().getANDTerminalRuleCall_1_0_25()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 27 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:930:10: this_OR_53= RULE_OR
            	            {
            	            this_OR_53=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_rulePropertyValue2536); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_OR_53);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_OR_53, grammarAccess.getPropertyValueAccess().getORTerminalRuleCall_1_0_26()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 28 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:938:10: this_ESC_CHAR_54= RULE_ESC_CHAR
            	            {
            	            this_ESC_CHAR_54=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_rulePropertyValue2562); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:953:1: entryRulePojoDefinition returns [EObject current=null] : iv_rulePojoDefinition= rulePojoDefinition EOF ;
    public final EObject entryRulePojoDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePojoDefinition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:957:2: (iv_rulePojoDefinition= rulePojoDefinition EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:958:2: iv_rulePojoDefinition= rulePojoDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPojoDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePojoDefinition_in_entryRulePojoDefinition2616);
            iv_rulePojoDefinition=rulePojoDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePojoDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePojoDefinition2626); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:968:1: rulePojoDefinition returns [EObject current=null] : (otherlv_0= 'pojo' ( (lv_name_1_0= RULE_IDENT ) ) ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:972:28: ( (otherlv_0= 'pojo' ( (lv_name_1_0= RULE_IDENT ) ) ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:973:1: (otherlv_0= 'pojo' ( (lv_name_1_0= RULE_IDENT ) ) ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:973:1: (otherlv_0= 'pojo' ( (lv_name_1_0= RULE_IDENT ) ) ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:973:3: otherlv_0= 'pojo' ( (lv_name_1_0= RULE_IDENT ) ) ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_rulePojoDefinition2667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPojoDefinitionAccess().getPojoKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:977:1: ( (lv_name_1_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:978:1: (lv_name_1_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:978:1: (lv_name_1_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:979:3: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePojoDefinition2684); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:995:2: ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:996:1: ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:996:1: ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:997:1: (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:997:1: (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:998:3: lv_class_2_1= RULE_IDENT
                    {
                    lv_class_2_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePojoDefinition2708); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1013:8: lv_class_2_2= RULE_IDENT_DOT
                    {
                    lv_class_2_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_rulePojoDefinition2728); if (state.failed) return current;
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

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulePojoDefinition2747); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1046:1: entryRulePojoUsage returns [EObject current=null] : iv_rulePojoUsage= rulePojoUsage EOF ;
    public final EObject entryRulePojoUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePojoUsage = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1047:2: (iv_rulePojoUsage= rulePojoUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1048:2: iv_rulePojoUsage= rulePojoUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPojoUsageRule()); 
            }
            pushFollow(FOLLOW_rulePojoUsage_in_entryRulePojoUsage2786);
            iv_rulePojoUsage=rulePojoUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePojoUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePojoUsage2796); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1055:1: rulePojoUsage returns [EObject current=null] : (this_ColumnUsage_0= ruleColumnUsage | this_IdentifierUsage_1= ruleIdentifierUsage | this_ConstantUsage_2= ruleConstantUsage | this_MappingUsage_3= ruleMappingUsage ) ;
    public final EObject rulePojoUsage() throws RecognitionException {
        EObject current = null;

        EObject this_ColumnUsage_0 = null;

        EObject this_IdentifierUsage_1 = null;

        EObject this_ConstantUsage_2 = null;

        EObject this_MappingUsage_3 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1058:28: ( (this_ColumnUsage_0= ruleColumnUsage | this_IdentifierUsage_1= ruleIdentifierUsage | this_ConstantUsage_2= ruleConstantUsage | this_MappingUsage_3= ruleMappingUsage ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1059:1: (this_ColumnUsage_0= ruleColumnUsage | this_IdentifierUsage_1= ruleIdentifierUsage | this_ConstantUsage_2= ruleConstantUsage | this_MappingUsage_3= ruleMappingUsage )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1059:1: (this_ColumnUsage_0= ruleColumnUsage | this_IdentifierUsage_1= ruleIdentifierUsage | this_ConstantUsage_2= ruleConstantUsage | this_MappingUsage_3= ruleMappingUsage )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1060:5: this_ColumnUsage_0= ruleColumnUsage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPojoUsageAccess().getColumnUsageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleColumnUsage_in_rulePojoUsage2843);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1070:5: this_IdentifierUsage_1= ruleIdentifierUsage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPojoUsageAccess().getIdentifierUsageParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdentifierUsage_in_rulePojoUsage2870);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1080:5: this_ConstantUsage_2= ruleConstantUsage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPojoUsageAccess().getConstantUsageParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantUsage_in_rulePojoUsage2897);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1090:5: this_MappingUsage_3= ruleMappingUsage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPojoUsageAccess().getMappingUsageParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMappingUsage_in_rulePojoUsage2924);
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1106:1: entryRuleColumnUsage returns [EObject current=null] : iv_ruleColumnUsage= ruleColumnUsage EOF ;
    public final EObject entryRuleColumnUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnUsage = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1110:2: (iv_ruleColumnUsage= ruleColumnUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1111:2: iv_ruleColumnUsage= ruleColumnUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnUsageRule()); 
            }
            pushFollow(FOLLOW_ruleColumnUsage_in_entryRuleColumnUsage2965);
            iv_ruleColumnUsage=ruleColumnUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnUsage2975); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1121:1: ruleColumnUsage returns [EObject current=null] : (otherlv_0= 'col' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleColumnUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1125:28: ( (otherlv_0= 'col' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1126:1: (otherlv_0= 'col' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1126:1: (otherlv_0= 'col' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1126:3: otherlv_0= 'col' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleColumnUsage3016); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getColumnUsageAccess().getColKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1130:1: ( (otherlv_1= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1131:1: (otherlv_1= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1131:1: (otherlv_1= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1132:3: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getColumnUsageRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumnUsage3036); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getColumnUsageAccess().getStatementMetaStatementCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1143:2: ( (otherlv_2= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1144:1: (otherlv_2= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1144:1: (otherlv_2= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1145:3: otherlv_2= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getColumnUsageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumnUsage3056); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getColumnUsageAccess().getPojoPojoDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleColumnUsage3067); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1171:1: entryRuleIdentifierUsage returns [EObject current=null] : iv_ruleIdentifierUsage= ruleIdentifierUsage EOF ;
    public final EObject entryRuleIdentifierUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifierUsage = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1175:2: (iv_ruleIdentifierUsage= ruleIdentifierUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1176:2: iv_ruleIdentifierUsage= ruleIdentifierUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierUsageRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifierUsage_in_entryRuleIdentifierUsage3112);
            iv_ruleIdentifierUsage=ruleIdentifierUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifierUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifierUsage3122); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1186:1: ruleIdentifierUsage returns [EObject current=null] : (otherlv_0= 'ident' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleIdentifierUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1190:28: ( (otherlv_0= 'ident' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1191:1: (otherlv_0= 'ident' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1191:1: (otherlv_0= 'ident' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1191:3: otherlv_0= 'ident' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleIdentifierUsage3163); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIdentifierUsageAccess().getIdentKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1195:1: ( (otherlv_1= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1196:1: (otherlv_1= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1196:1: (otherlv_1= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1197:3: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIdentifierUsageRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifierUsage3183); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getIdentifierUsageAccess().getStatementMetaStatementCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1208:2: ( (otherlv_2= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1209:1: (otherlv_2= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1209:1: (otherlv_2= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1210:3: otherlv_2= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIdentifierUsageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifierUsage3203); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getIdentifierUsageAccess().getPojoPojoDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleIdentifierUsage3214); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1236:1: entryRuleConstantUsage returns [EObject current=null] : iv_ruleConstantUsage= ruleConstantUsage EOF ;
    public final EObject entryRuleConstantUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantUsage = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1240:2: (iv_ruleConstantUsage= ruleConstantUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1241:2: iv_ruleConstantUsage= ruleConstantUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantUsageRule()); 
            }
            pushFollow(FOLLOW_ruleConstantUsage_in_entryRuleConstantUsage3259);
            iv_ruleConstantUsage=ruleConstantUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantUsage3269); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1251:1: ruleConstantUsage returns [EObject current=null] : (otherlv_0= 'const' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleConstantUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1255:28: ( (otherlv_0= 'const' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1256:1: (otherlv_0= 'const' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1256:1: (otherlv_0= 'const' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1256:3: otherlv_0= 'const' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleConstantUsage3310); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantUsageAccess().getConstKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1260:1: ( (otherlv_1= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1261:1: (otherlv_1= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1261:1: (otherlv_1= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1262:3: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantUsageRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstantUsage3330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getConstantUsageAccess().getStatementMetaStatementCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1273:2: ( (otherlv_2= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1274:1: (otherlv_2= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1274:1: (otherlv_2= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1275:3: otherlv_2= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantUsageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstantUsage3350); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getConstantUsageAccess().getPojoPojoDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleConstantUsage3361); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1301:1: entryRuleMappingUsage returns [EObject current=null] : iv_ruleMappingUsage= ruleMappingUsage EOF ;
    public final EObject entryRuleMappingUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingUsage = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1305:2: (iv_ruleMappingUsage= ruleMappingUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1306:2: iv_ruleMappingUsage= ruleMappingUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingUsageRule()); 
            }
            pushFollow(FOLLOW_ruleMappingUsage_in_entryRuleMappingUsage3406);
            iv_ruleMappingUsage=ruleMappingUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingUsage3416); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1316:1: ruleMappingUsage returns [EObject current=null] : (otherlv_0= 'out' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleMappingUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1320:28: ( (otherlv_0= 'out' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1321:1: (otherlv_0= 'out' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1321:1: (otherlv_0= 'out' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1321:3: otherlv_0= 'out' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleMappingUsage3457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMappingUsageAccess().getOutKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1325:1: ( (otherlv_1= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1326:1: (otherlv_1= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1326:1: (otherlv_1= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1327:3: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMappingUsageRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingUsage3477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getMappingUsageAccess().getStatementMappingRuleCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1338:2: ( (otherlv_2= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1339:1: (otherlv_2= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1339:1: (otherlv_2= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1340:3: otherlv_2= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMappingUsageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingUsage3497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getMappingUsageAccess().getPojoPojoDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleMappingUsage3508); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1366:1: entryRuleTableDefinition returns [EObject current=null] : iv_ruleTableDefinition= ruleTableDefinition EOF ;
    public final EObject entryRuleTableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableDefinition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1370:2: (iv_ruleTableDefinition= ruleTableDefinition EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1371:2: iv_ruleTableDefinition= ruleTableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition3553);
            iv_ruleTableDefinition=ruleTableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableDefinition3563); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1381:1: ruleTableDefinition returns [EObject current=null] : (otherlv_0= 'table' ( (lv_name_1_0= RULE_IDENT ) ) ( (lv_table_2_0= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleTableDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_table_2_0=null;
        Token this_SEMICOLON_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1385:28: ( (otherlv_0= 'table' ( (lv_name_1_0= RULE_IDENT ) ) ( (lv_table_2_0= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1386:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_IDENT ) ) ( (lv_table_2_0= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1386:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_IDENT ) ) ( (lv_table_2_0= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1386:3: otherlv_0= 'table' ( (lv_name_1_0= RULE_IDENT ) ) ( (lv_table_2_0= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleTableDefinition3604); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTableDefinitionAccess().getTableKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1390:1: ( (lv_name_1_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1391:1: (lv_name_1_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1391:1: (lv_name_1_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1392:3: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTableDefinition3621); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1408:2: ( (lv_table_2_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1409:1: (lv_table_2_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1409:1: (lv_table_2_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1410:3: lv_table_2_0= RULE_IDENT
            {
            lv_table_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTableDefinition3643); if (state.failed) return current;
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

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleTableDefinition3659); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1441:1: entryRuleTableUsage returns [EObject current=null] : iv_ruleTableUsage= ruleTableUsage EOF ;
    public final EObject entryRuleTableUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableUsage = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1445:2: (iv_ruleTableUsage= ruleTableUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1446:2: iv_ruleTableUsage= ruleTableUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableUsageRule()); 
            }
            pushFollow(FOLLOW_ruleTableUsage_in_entryRuleTableUsage3704);
            iv_ruleTableUsage=ruleTableUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableUsage3714); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1456:1: ruleTableUsage returns [EObject current=null] : (otherlv_0= 'dbcol' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_IDENT ) ) this_SEMICOLON_5= RULE_SEMICOLON ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1460:28: ( (otherlv_0= 'dbcol' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_IDENT ) ) this_SEMICOLON_5= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1461:1: (otherlv_0= 'dbcol' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_IDENT ) ) this_SEMICOLON_5= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1461:1: (otherlv_0= 'dbcol' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_IDENT ) ) this_SEMICOLON_5= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1461:3: otherlv_0= 'dbcol' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_IDENT ) ) this_SEMICOLON_5= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleTableUsage3755); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTableUsageAccess().getDbcolKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1465:1: ( (otherlv_1= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1466:1: (otherlv_1= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1466:1: (otherlv_1= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1467:3: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTableUsageRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTableUsage3775); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getTableUsageAccess().getStatementMetaStatementCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1478:2: ( (otherlv_2= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1479:1: (otherlv_2= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1479:1: (otherlv_2= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1480:3: otherlv_2= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTableUsageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTableUsage3795); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getTableUsageAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleTableUsage3807); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTableUsageAccess().getPrefixKeyword_3());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1495:1: ( (lv_prefix_4_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1496:1: (lv_prefix_4_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1496:1: (lv_prefix_4_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1497:3: lv_prefix_4_0= RULE_IDENT
            {
            lv_prefix_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTableUsage3824); if (state.failed) return current;
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

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleTableUsage3840); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1528:1: entryRuleMetaStatement returns [EObject current=null] : iv_ruleMetaStatement= ruleMetaStatement EOF ;
    public final EObject entryRuleMetaStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaStatement = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1529:2: (iv_ruleMetaStatement= ruleMetaStatement EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1530:2: iv_ruleMetaStatement= ruleMetaStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaStatementRule()); 
            }
            pushFollow(FOLLOW_ruleMetaStatement_in_entryRuleMetaStatement3879);
            iv_ruleMetaStatement=ruleMetaStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaStatement3889); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1537:1: ruleMetaStatement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1540:28: ( ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1541:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1541:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1541:2: ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1541:2: ( (lv_name_0_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1542:1: (lv_name_0_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1542:1: (lv_name_0_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1543:3: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMetaStatement3931); if (state.failed) return current;
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

            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleMetaStatement3947); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_1, grammarAccess.getMetaStatementAccess().getLPARENTerminalRuleCall_1()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1563:1: ( (lv_type_2_0= ruleSTATEMEN_TYPE ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1564:1: (lv_type_2_0= ruleSTATEMEN_TYPE )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1564:1: (lv_type_2_0= ruleSTATEMEN_TYPE )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1565:3: lv_type_2_0= ruleSTATEMEN_TYPE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMetaStatementAccess().getTypeSTATEMEN_TYPEEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSTATEMEN_TYPE_in_ruleMetaStatement3967);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1581:2: (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1581:3: this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleMetaStatement3979); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getMetaStatementAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1585:1: ( (lv_filters_4_0= RULE_IDENT ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1586:1: (lv_filters_4_0= RULE_IDENT )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1586:1: (lv_filters_4_0= RULE_IDENT )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1587:3: lv_filters_4_0= RULE_IDENT
            	    {
            	    lv_filters_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMetaStatement3995); if (state.failed) return current;
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

            this_RPAREN_5=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleMetaStatement4013); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_5, grammarAccess.getMetaStatementAccess().getRPARENTerminalRuleCall_4()); 
                  
            }
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleMetaStatement4023); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUALS_6, grammarAccess.getMetaStatementAccess().getEQUALSTerminalRuleCall_5()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1611:1: ( (lv_statement_7_0= ruleSql ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1612:1: (lv_statement_7_0= ruleSql )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1612:1: (lv_statement_7_0= ruleSql )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1613:3: lv_statement_7_0= ruleSql
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMetaStatementAccess().getStatementSqlParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSql_in_ruleMetaStatement4043);
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

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleMetaStatement4054); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1641:1: entryRuleSql returns [EObject current=null] : iv_ruleSql= ruleSql EOF ;
    public final EObject entryRuleSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1642:2: (iv_ruleSql= ruleSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1643:2: iv_ruleSql= ruleSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlRule()); 
            }
            pushFollow(FOLLOW_ruleSql_in_entryRuleSql4089);
            iv_ruleSql=ruleSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSql4099); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1650:1: ruleSql returns [EObject current=null] : ( (lv_sqls_0_0= ruleSqlFragment ) )+ ;
    public final EObject ruleSql() throws RecognitionException {
        EObject current = null;

        EObject lv_sqls_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1653:28: ( ( (lv_sqls_0_0= ruleSqlFragment ) )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1654:1: ( (lv_sqls_0_0= ruleSqlFragment ) )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1654:1: ( (lv_sqls_0_0= ruleSqlFragment ) )+
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
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1655:1: (lv_sqls_0_0= ruleSqlFragment )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1655:1: (lv_sqls_0_0= ruleSqlFragment )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1656:3: lv_sqls_0_0= ruleSqlFragment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSqlAccess().getSqlsSqlFragmentParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSqlFragment_in_ruleSql4144);
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1680:1: entryRuleSqlFragment returns [EObject current=null] : iv_ruleSqlFragment= ruleSqlFragment EOF ;
    public final EObject entryRuleSqlFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqlFragment = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1681:2: (iv_ruleSqlFragment= ruleSqlFragment EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1682:2: iv_ruleSqlFragment= ruleSqlFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleSqlFragment_in_entryRuleSqlFragment4180);
            iv_ruleSqlFragment=ruleSqlFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqlFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlFragment4190); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1689:1: ruleSqlFragment returns [EObject current=null] : ( ( (lv_value_0_0= ruleSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) | (this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) ) ) ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1692:28: ( ( ( (lv_value_0_0= ruleSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) | (this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) ) ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1693:1: ( ( (lv_value_0_0= ruleSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) | (this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) ) ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1693:1: ( ( (lv_value_0_0= ruleSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) | (this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) ) ) )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1693:2: ( (lv_value_0_0= ruleSqlValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1693:2: ( (lv_value_0_0= ruleSqlValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1694:1: (lv_value_0_0= ruleSqlValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1694:1: (lv_value_0_0= ruleSqlValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1695:3: lv_value_0_0= ruleSqlValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getValueSqlValueParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlValue_in_ruleSqlFragment4236);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1712:6: (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1712:6: (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1712:7: this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) )
                    {
                    this_AT_1=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleSqlFragment4254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_1, grammarAccess.getSqlFragmentAccess().getATTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1716:1: ( (lv_col_2_0= ruleColumn ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1717:1: (lv_col_2_0= ruleColumn )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1717:1: (lv_col_2_0= ruleColumn )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1718:3: lv_col_2_0= ruleColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getColColumnParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleColumn_in_ruleSqlFragment4274);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1735:6: (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1735:6: (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1735:7: this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) )
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSqlFragment4293); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getSqlFragmentAccess().getSTRINGTerminalRuleCall_2_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1739:1: ( (lv_cnst_4_0= ruleConstant ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1740:1: (lv_cnst_4_0= ruleConstant )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1740:1: (lv_cnst_4_0= ruleConstant )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1741:3: lv_cnst_4_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getCnstConstantParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleSqlFragment4313);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1758:6: (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1758:6: (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1758:7: this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) )
                    {
                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleSqlFragment4332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_5, grammarAccess.getSqlFragmentAccess().getCOLONTerminalRuleCall_3_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1762:1: ( (lv_ident_6_0= ruleIdentifier ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1763:1: (lv_ident_6_0= ruleIdentifier )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1763:1: (lv_ident_6_0= ruleIdentifier )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1764:3: lv_ident_6_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getIdentIdentifierParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleSqlFragment4352);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1781:6: (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1781:6: (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1781:7: this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE
                    {
                    this_LBRACE_7=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleSqlFragment4371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACE_7, grammarAccess.getSqlFragmentAccess().getLBRACETerminalRuleCall_4_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1785:1: ( (lv_meta_8_0= ruleMetaSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1786:1: (lv_meta_8_0= ruleMetaSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1786:1: (lv_meta_8_0= ruleMetaSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1787:3: lv_meta_8_0= ruleMetaSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getMetaMetaSqlParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMetaSql_in_ruleSqlFragment4391);
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

                    this_RBRACE_9=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleSqlFragment4402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RBRACE_9, grammarAccess.getSqlFragmentAccess().getRBRACETerminalRuleCall_4_2()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1808:6: (this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1808:6: (this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1808:7: this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) )
                    {
                    this_PERCENT_10=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleSqlFragment4420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PERCENT_10, grammarAccess.getSqlFragmentAccess().getPERCENTTerminalRuleCall_5_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1812:1: ( (lv_dbcol_11_0= ruleDatabaseColumn ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1813:1: (lv_dbcol_11_0= ruleDatabaseColumn )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1813:1: (lv_dbcol_11_0= ruleDatabaseColumn )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1814:3: lv_dbcol_11_0= ruleDatabaseColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getDbcolDatabaseColumnParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDatabaseColumn_in_ruleSqlFragment4440);
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1838:1: entryRuleSqlValue returns [String current=null] : iv_ruleSqlValue= ruleSqlValue EOF ;
    public final String entryRuleSqlValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSqlValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1839:2: (iv_ruleSqlValue= ruleSqlValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1840:2: iv_ruleSqlValue= ruleSqlValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlValueRule()); 
            }
            pushFollow(FOLLOW_ruleSqlValue_in_entryRuleSqlValue4478);
            iv_ruleSqlValue=ruleSqlValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqlValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlValue4489); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1847:1: ruleSqlValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_AND_20= RULE_AND | this_OR_21= RULE_OR | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )* ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1850:28: ( ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_AND_20= RULE_AND | this_OR_21= RULE_OR | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1851:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_AND_20= RULE_AND | this_OR_21= RULE_OR | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1851:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_AND_20= RULE_AND | this_OR_21= RULE_OR | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1851:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_AND_20= RULE_AND | this_OR_21= RULE_OR | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1851:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_AND_20= RULE_AND | this_OR_21= RULE_OR | this_ESC_CHAR_22= RULE_ESC_CHAR )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1851:7: this_REST_0= RULE_REST
                    {
                    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleSqlValue4530); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REST_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REST_0, grammarAccess.getSqlValueAccess().getRESTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1859:10: this_IDENT_DOT_1= RULE_IDENT_DOT
                    {
                    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleSqlValue4556); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_DOT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_DOT_1, grammarAccess.getSqlValueAccess().getIDENT_DOTTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1867:10: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleSqlValue4582); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_2, grammarAccess.getSqlValueAccess().getIDENTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1875:10: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSqlValue4608); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_3, grammarAccess.getSqlValueAccess().getNUMBERTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1883:10: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSqlValue4634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WS_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_4, grammarAccess.getSqlValueAccess().getWSTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1891:10: this_COMMA_5= RULE_COMMA
                    {
                    this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleSqlValue4660); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_5, grammarAccess.getSqlValueAccess().getCOMMATerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1899:10: this_MINUS_6= RULE_MINUS
                    {
                    this_MINUS_6=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleSqlValue4686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_6, grammarAccess.getSqlValueAccess().getMINUSTerminalRuleCall_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1907:10: this_PLUS_7= RULE_PLUS
                    {
                    this_PLUS_7=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleSqlValue4712); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_7, grammarAccess.getSqlValueAccess().getPLUSTerminalRuleCall_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1915:10: this_LPAREN_8= RULE_LPAREN
                    {
                    this_LPAREN_8=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleSqlValue4738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LPAREN_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_8, grammarAccess.getSqlValueAccess().getLPARENTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1923:10: this_RPAREN_9= RULE_RPAREN
                    {
                    this_RPAREN_9=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleSqlValue4764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RPAREN_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_9, grammarAccess.getSqlValueAccess().getRPARENTerminalRuleCall_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1931:10: this_RBRACE_10= RULE_RBRACE
                    {
                    this_RBRACE_10=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleSqlValue4790); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RBRACE_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RBRACE_10, grammarAccess.getSqlValueAccess().getRBRACETerminalRuleCall_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1939:10: this_QUESTI_11= RULE_QUESTI
                    {
                    this_QUESTI_11=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleSqlValue4816); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUESTI_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUESTI_11, grammarAccess.getSqlValueAccess().getQUESTITerminalRuleCall_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1947:10: this_NOT_12= RULE_NOT
                    {
                    this_NOT_12=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleSqlValue4842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_12, grammarAccess.getSqlValueAccess().getNOTTerminalRuleCall_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1955:10: this_BAND_13= RULE_BAND
                    {
                    this_BAND_13=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleSqlValue4868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BAND_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BAND_13, grammarAccess.getSqlValueAccess().getBANDTerminalRuleCall_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1963:10: this_BOR_14= RULE_BOR
                    {
                    this_BOR_14=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleSqlValue4894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOR_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_14, grammarAccess.getSqlValueAccess().getBORTerminalRuleCall_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1971:10: this_HASH_15= RULE_HASH
                    {
                    this_HASH_15=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleSqlValue4920); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASH_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASH_15, grammarAccess.getSqlValueAccess().getHASHTerminalRuleCall_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1979:10: this_CARET_16= RULE_CARET
                    {
                    this_CARET_16=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleSqlValue4946); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CARET_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_16, grammarAccess.getSqlValueAccess().getCARETTerminalRuleCall_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1987:10: this_EQUALS_17= RULE_EQUALS
                    {
                    this_EQUALS_17=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleSqlValue4972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUALS_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_17, grammarAccess.getSqlValueAccess().getEQUALSTerminalRuleCall_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1995:10: this_LESS_THAN_18= RULE_LESS_THAN
                    {
                    this_LESS_THAN_18=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleSqlValue4998); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LESS_THAN_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LESS_THAN_18, grammarAccess.getSqlValueAccess().getLESS_THANTerminalRuleCall_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2003:10: this_MORE_THAN_19= RULE_MORE_THAN
                    {
                    this_MORE_THAN_19=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleSqlValue5024); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MORE_THAN_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MORE_THAN_19, grammarAccess.getSqlValueAccess().getMORE_THANTerminalRuleCall_0_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2011:10: this_AND_20= RULE_AND
                    {
                    this_AND_20=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleSqlValue5050); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AND_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AND_20, grammarAccess.getSqlValueAccess().getANDTerminalRuleCall_0_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2019:10: this_OR_21= RULE_OR
                    {
                    this_OR_21=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleSqlValue5076); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_OR_21);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OR_21, grammarAccess.getSqlValueAccess().getORTerminalRuleCall_0_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2027:10: this_ESC_CHAR_22= RULE_ESC_CHAR
                    {
                    this_ESC_CHAR_22=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleSqlValue5102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESC_CHAR_22);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESC_CHAR_22, grammarAccess.getSqlValueAccess().getESC_CHARTerminalRuleCall_0_22()); 
                          
                    }

                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2034:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )*
            loop27:
            do {
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2034:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2056:23: (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR )
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
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2056:28: this_REST_23= RULE_REST
            	            {
            	            this_REST_23=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleSqlValue5285); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REST_23);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REST_23, grammarAccess.getSqlValueAccess().getRESTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2064:10: this_IDENT_DOT_24= RULE_IDENT_DOT
            	            {
            	            this_IDENT_DOT_24=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleSqlValue5311); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_DOT_24);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_DOT_24, grammarAccess.getSqlValueAccess().getIDENT_DOTTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2072:10: this_IDENT_25= RULE_IDENT
            	            {
            	            this_IDENT_25=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleSqlValue5337); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_25);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_25, grammarAccess.getSqlValueAccess().getIDENTTerminalRuleCall_1_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2080:10: this_NUMBER_26= RULE_NUMBER
            	            {
            	            this_NUMBER_26=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSqlValue5363); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NUMBER_26);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NUMBER_26, grammarAccess.getSqlValueAccess().getNUMBERTerminalRuleCall_1_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2088:10: this_WS_27= RULE_WS
            	            {
            	            this_WS_27=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSqlValue5389); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_WS_27);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_WS_27, grammarAccess.getSqlValueAccess().getWSTerminalRuleCall_1_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2096:10: this_COMMA_28= RULE_COMMA
            	            {
            	            this_COMMA_28=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleSqlValue5415); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COMMA_28);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COMMA_28, grammarAccess.getSqlValueAccess().getCOMMATerminalRuleCall_1_0_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2104:10: this_MINUS_29= RULE_MINUS
            	            {
            	            this_MINUS_29=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleSqlValue5441); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MINUS_29);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MINUS_29, grammarAccess.getSqlValueAccess().getMINUSTerminalRuleCall_1_0_6()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2112:10: this_PLUS_30= RULE_PLUS
            	            {
            	            this_PLUS_30=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleSqlValue5467); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PLUS_30);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PLUS_30, grammarAccess.getSqlValueAccess().getPLUSTerminalRuleCall_1_0_7()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2120:10: this_LPAREN_31= RULE_LPAREN
            	            {
            	            this_LPAREN_31=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleSqlValue5493); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LPAREN_31);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LPAREN_31, grammarAccess.getSqlValueAccess().getLPARENTerminalRuleCall_1_0_8()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2128:10: this_RPAREN_32= RULE_RPAREN
            	            {
            	            this_RPAREN_32=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleSqlValue5519); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RPAREN_32);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RPAREN_32, grammarAccess.getSqlValueAccess().getRPARENTerminalRuleCall_1_0_9()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2136:10: this_RBRACE_33= RULE_RBRACE
            	            {
            	            this_RBRACE_33=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleSqlValue5545); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RBRACE_33);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RBRACE_33, grammarAccess.getSqlValueAccess().getRBRACETerminalRuleCall_1_0_10()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2144:10: this_QUESTI_34= RULE_QUESTI
            	            {
            	            this_QUESTI_34=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleSqlValue5571); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_QUESTI_34);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_QUESTI_34, grammarAccess.getSqlValueAccess().getQUESTITerminalRuleCall_1_0_11()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 13 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2152:10: this_NOT_35= RULE_NOT
            	            {
            	            this_NOT_35=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleSqlValue5597); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NOT_35);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NOT_35, grammarAccess.getSqlValueAccess().getNOTTerminalRuleCall_1_0_12()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 14 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2160:10: this_BAND_36= RULE_BAND
            	            {
            	            this_BAND_36=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleSqlValue5623); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BAND_36);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BAND_36, grammarAccess.getSqlValueAccess().getBANDTerminalRuleCall_1_0_13()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 15 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2168:10: this_BOR_37= RULE_BOR
            	            {
            	            this_BOR_37=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleSqlValue5649); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BOR_37);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BOR_37, grammarAccess.getSqlValueAccess().getBORTerminalRuleCall_1_0_14()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 16 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2176:10: this_HASH_38= RULE_HASH
            	            {
            	            this_HASH_38=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleSqlValue5675); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_HASH_38);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_HASH_38, grammarAccess.getSqlValueAccess().getHASHTerminalRuleCall_1_0_15()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 17 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2184:10: this_CARET_39= RULE_CARET
            	            {
            	            this_CARET_39=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleSqlValue5701); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_CARET_39);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_CARET_39, grammarAccess.getSqlValueAccess().getCARETTerminalRuleCall_1_0_16()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 18 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2192:10: this_EQUALS_40= RULE_EQUALS
            	            {
            	            this_EQUALS_40=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleSqlValue5727); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_EQUALS_40);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_EQUALS_40, grammarAccess.getSqlValueAccess().getEQUALSTerminalRuleCall_1_0_17()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 19 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2200:10: this_LESS_THAN_41= RULE_LESS_THAN
            	            {
            	            this_LESS_THAN_41=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleSqlValue5753); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LESS_THAN_41);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LESS_THAN_41, grammarAccess.getSqlValueAccess().getLESS_THANTerminalRuleCall_1_0_18()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 20 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2208:10: this_MORE_THAN_42= RULE_MORE_THAN
            	            {
            	            this_MORE_THAN_42=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleSqlValue5779); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MORE_THAN_42);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MORE_THAN_42, grammarAccess.getSqlValueAccess().getMORE_THANTerminalRuleCall_1_0_19()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 21 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2216:10: this_AND_43= RULE_AND
            	            {
            	            this_AND_43=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleSqlValue5805); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AND_43);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AND_43, grammarAccess.getSqlValueAccess().getANDTerminalRuleCall_1_0_20()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 22 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2224:10: this_OR_44= RULE_OR
            	            {
            	            this_OR_44=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleSqlValue5831); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_OR_44);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_OR_44, grammarAccess.getSqlValueAccess().getORTerminalRuleCall_1_0_21()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 23 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2232:10: this_ESC_CHAR_45= RULE_ESC_CHAR
            	            {
            	            this_ESC_CHAR_45=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleSqlValue5857); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2247:1: entryRuleMetaSql returns [EObject current=null] : iv_ruleMetaSql= ruleMetaSql EOF ;
    public final EObject entryRuleMetaSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2248:2: (iv_ruleMetaSql= ruleMetaSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2249:2: iv_ruleMetaSql= ruleMetaSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaSqlRule()); 
            }
            pushFollow(FOLLOW_ruleMetaSql_in_entryRuleMetaSql5905);
            iv_ruleMetaSql=ruleMetaSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaSql5915); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2256:1: ruleMetaSql returns [EObject current=null] : ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) | ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) ) | ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) ) ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2259:28: ( ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) | ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) ) | ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2260:1: ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) | ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) ) | ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2260:1: ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) | ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) ) | ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) ) )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2260:2: (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2260:2: (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2260:3: this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )*
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMetaSql5952); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_0, grammarAccess.getMetaSqlAccess().getWSTerminalRuleCall_0_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2264:1: ( (lv_ifs_1_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2265:1: (lv_ifs_1_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2265:1: (lv_ifs_1_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2266:3: lv_ifs_1_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql5972);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2282:2: (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_BOR) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2282:3: this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_2=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql5984); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_2, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_0_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2286:1: ( (lv_ifs_3_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2287:1: (lv_ifs_3_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2287:1: (lv_ifs_3_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2288:3: lv_ifs_3_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6004);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2305:6: ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2305:6: ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2305:7: ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2305:7: ( (lv_type_4_0= RULE_QUESTI ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2306:1: (lv_type_4_0= RULE_QUESTI )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2306:1: (lv_type_4_0= RULE_QUESTI )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2307:3: lv_type_4_0= RULE_QUESTI
                    {
                    lv_type_4_0=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleMetaSql6031); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2323:2: ( (lv_cond_5_0= ruleIfSqlCond ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2324:1: (lv_cond_5_0= ruleIfSqlCond )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2324:1: (lv_cond_5_0= ruleIfSqlCond )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2325:3: lv_cond_5_0= ruleIfSqlCond
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getCondIfSqlCondParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSqlCond_in_ruleMetaSql6057);
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

                    this_BOR_6=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql6068); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_6, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_1_2()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2345:1: ( (lv_ifs_7_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2346:1: (lv_ifs_7_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2346:1: (lv_ifs_7_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2347:3: lv_ifs_7_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6088);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2363:2: (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_BOR) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2363:3: this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_8=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql6100); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_8, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_1_4_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2367:1: ( (lv_ifs_9_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2368:1: (lv_ifs_9_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2368:1: (lv_ifs_9_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2369:3: lv_ifs_9_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_1_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6120);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2386:6: ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2386:6: ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2386:7: ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2386:7: ( (lv_type_10_0= RULE_BAND ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2387:1: (lv_type_10_0= RULE_BAND )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2387:1: (lv_type_10_0= RULE_BAND )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2388:3: lv_type_10_0= RULE_BAND
                    {
                    lv_type_10_0=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleMetaSql6147); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2404:2: ( (lv_ifs_11_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2405:1: (lv_ifs_11_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2405:1: (lv_ifs_11_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2406:3: lv_ifs_11_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6173);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2422:2: (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_BOR) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2422:3: this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_12=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql6185); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_12, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_2_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2426:1: ( (lv_ifs_13_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2427:1: (lv_ifs_13_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2427:1: (lv_ifs_13_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2428:3: lv_ifs_13_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6205);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2445:6: ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2445:6: ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2445:7: ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2445:7: ( (lv_type_14_0= RULE_BOR ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2446:1: (lv_type_14_0= RULE_BOR )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2446:1: (lv_type_14_0= RULE_BOR )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2447:3: lv_type_14_0= RULE_BOR
                    {
                    lv_type_14_0=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql6232); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2463:2: ( (lv_ifs_15_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2464:1: (lv_ifs_15_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2464:1: (lv_ifs_15_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2465:3: lv_ifs_15_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6258);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2481:2: (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_BOR) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2481:3: this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_16=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql6270); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_16, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_3_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2485:1: ( (lv_ifs_17_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2486:1: (lv_ifs_17_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2486:1: (lv_ifs_17_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2487:3: lv_ifs_17_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6290);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2504:6: ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2504:6: ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2504:7: ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2504:7: ( (lv_type_18_0= RULE_EQUALS ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2505:1: (lv_type_18_0= RULE_EQUALS )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2505:1: (lv_type_18_0= RULE_EQUALS )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2506:3: lv_type_18_0= RULE_EQUALS
                    {
                    lv_type_18_0=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleMetaSql6317); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2522:2: (this_WS_19= RULE_WS )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_WS) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2522:3: this_WS_19= RULE_WS
                    	    {
                    	    this_WS_19=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMetaSql6334); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_19, grammarAccess.getMetaSqlAccess().getWSTerminalRuleCall_4_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2526:3: ( (lv_ftype_20_0= RULE_IDENT ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2527:1: (lv_ftype_20_0= RULE_IDENT )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2527:1: (lv_ftype_20_0= RULE_IDENT )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2528:3: lv_ftype_20_0= RULE_IDENT
                    {
                    lv_ftype_20_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMetaSql6352); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2544:2: ( (lv_ifs_21_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2545:1: (lv_ifs_21_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2545:1: (lv_ifs_21_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2546:3: lv_ifs_21_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_4_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6378);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2563:6: ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2563:6: ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2563:7: ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2563:7: ( (lv_type_22_0= RULE_HASH ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2564:1: (lv_type_22_0= RULE_HASH )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2564:1: (lv_type_22_0= RULE_HASH )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2565:3: lv_type_22_0= RULE_HASH
                    {
                    lv_type_22_0=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleMetaSql6403); if (state.failed) return current;
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

                    this_NUMBER_23=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMetaSql6419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_23, grammarAccess.getMetaSqlAccess().getNUMBERTerminalRuleCall_5_1()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2585:1: ( (lv_ord_24_0= ruleOrdSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2586:1: (lv_ord_24_0= ruleOrdSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2586:1: (lv_ord_24_0= ruleOrdSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2587:3: lv_ord_24_0= ruleOrdSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getOrdOrdSqlParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrdSql_in_ruleMetaSql6439);
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2611:1: entryRuleIfSql returns [EObject current=null] : iv_ruleIfSql= ruleIfSql EOF ;
    public final EObject entryRuleIfSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2612:2: (iv_ruleIfSql= ruleIfSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2613:2: iv_ruleIfSql= ruleIfSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlRule()); 
            }
            pushFollow(FOLLOW_ruleIfSql_in_entryRuleIfSql6476);
            iv_ruleIfSql=ruleIfSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSql6486); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2620:1: ruleIfSql returns [EObject current=null] : ( (lv_sqls_0_0= ruleIfSqlFragment ) )+ ;
    public final EObject ruleIfSql() throws RecognitionException {
        EObject current = null;

        EObject lv_sqls_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2623:28: ( ( (lv_sqls_0_0= ruleIfSqlFragment ) )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2624:1: ( (lv_sqls_0_0= ruleIfSqlFragment ) )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2624:1: ( (lv_sqls_0_0= ruleIfSqlFragment ) )+
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
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2625:1: (lv_sqls_0_0= ruleIfSqlFragment )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2625:1: (lv_sqls_0_0= ruleIfSqlFragment )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2626:3: lv_sqls_0_0= ruleIfSqlFragment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfSqlAccess().getSqlsIfSqlFragmentParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIfSqlFragment_in_ruleIfSql6531);
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2650:1: entryRuleIfSqlFragment returns [EObject current=null] : iv_ruleIfSqlFragment= ruleIfSqlFragment EOF ;
    public final EObject entryRuleIfSqlFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSqlFragment = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2651:2: (iv_ruleIfSqlFragment= ruleIfSqlFragment EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2652:2: iv_ruleIfSqlFragment= ruleIfSqlFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleIfSqlFragment_in_entryRuleIfSqlFragment6567);
            iv_ruleIfSqlFragment=ruleIfSqlFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSqlFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSqlFragment6577); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2659:1: ruleIfSqlFragment returns [EObject current=null] : ( ( (lv_value_0_0= ruleIfSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) ) ) | (this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE ) ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2662:28: ( ( ( (lv_value_0_0= ruleIfSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) ) ) | (this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2663:1: ( ( (lv_value_0_0= ruleIfSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) ) ) | (this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2663:1: ( ( (lv_value_0_0= ruleIfSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) ) ) | (this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE ) )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2663:2: ( (lv_value_0_0= ruleIfSqlValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2663:2: ( (lv_value_0_0= ruleIfSqlValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2664:1: (lv_value_0_0= ruleIfSqlValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2664:1: (lv_value_0_0= ruleIfSqlValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2665:3: lv_value_0_0= ruleIfSqlValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getValueIfSqlValueParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSqlValue_in_ruleIfSqlFragment6623);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2682:6: (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2682:6: (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2682:7: this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) )
                    {
                    this_AT_1=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleIfSqlFragment6641); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_1, grammarAccess.getIfSqlFragmentAccess().getATTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2686:1: ( (lv_col_2_0= ruleColumn ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2687:1: (lv_col_2_0= ruleColumn )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2687:1: (lv_col_2_0= ruleColumn )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2688:3: lv_col_2_0= ruleColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getColColumnParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleColumn_in_ruleIfSqlFragment6661);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2705:6: (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2705:6: (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2705:7: this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) )
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIfSqlFragment6680); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getIfSqlFragmentAccess().getSTRINGTerminalRuleCall_2_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2709:1: ( (lv_cnst_4_0= ruleConstant ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2710:1: (lv_cnst_4_0= ruleConstant )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2710:1: (lv_cnst_4_0= ruleConstant )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2711:3: lv_cnst_4_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getCnstConstantParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleIfSqlFragment6700);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2728:6: (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2728:6: (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2728:7: this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) )
                    {
                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleIfSqlFragment6719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_5, grammarAccess.getIfSqlFragmentAccess().getCOLONTerminalRuleCall_3_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2732:1: ( (lv_ident_6_0= ruleIdentifier ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2733:1: (lv_ident_6_0= ruleIdentifier )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2733:1: (lv_ident_6_0= ruleIdentifier )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2734:3: lv_ident_6_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getIdentIdentifierParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleIfSqlFragment6739);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2751:6: (this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2751:6: (this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2751:7: this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) )
                    {
                    this_PERCENT_7=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleIfSqlFragment6758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PERCENT_7, grammarAccess.getIfSqlFragmentAccess().getPERCENTTerminalRuleCall_4_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2755:1: ( (lv_dbcol_8_0= ruleDatabaseColumn ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2756:1: (lv_dbcol_8_0= ruleDatabaseColumn )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2756:1: (lv_dbcol_8_0= ruleDatabaseColumn )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2757:3: lv_dbcol_8_0= ruleDatabaseColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getDbcolDatabaseColumnParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDatabaseColumn_in_ruleIfSqlFragment6778);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2774:6: (this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2774:6: (this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2774:7: this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE
                    {
                    this_LBRACE_9=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleIfSqlFragment6797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACE_9, grammarAccess.getIfSqlFragmentAccess().getLBRACETerminalRuleCall_5_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2778:1: ( (lv_meta_10_0= ruleIfMetaSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2779:1: (lv_meta_10_0= ruleIfMetaSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2779:1: (lv_meta_10_0= ruleIfMetaSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2780:3: lv_meta_10_0= ruleIfMetaSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getMetaIfMetaSqlParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfMetaSql_in_ruleIfSqlFragment6817);
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

                    this_RBRACE_11=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleIfSqlFragment6828); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2808:1: entryRuleIfSqlValue returns [String current=null] : iv_ruleIfSqlValue= ruleIfSqlValue EOF ;
    public final String entryRuleIfSqlValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIfSqlValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2809:2: (iv_ruleIfSqlValue= ruleIfSqlValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2810:2: iv_ruleIfSqlValue= ruleIfSqlValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlValueRule()); 
            }
            pushFollow(FOLLOW_ruleIfSqlValue_in_entryRuleIfSqlValue6865);
            iv_ruleIfSqlValue=ruleIfSqlValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSqlValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSqlValue6876); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2817:1: ruleIfSqlValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_AND_19= RULE_AND | this_OR_20= RULE_OR | this_ESC_CHAR_21= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )* ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2820:28: ( ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_AND_19= RULE_AND | this_OR_20= RULE_OR | this_ESC_CHAR_21= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2821:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_AND_19= RULE_AND | this_OR_20= RULE_OR | this_ESC_CHAR_21= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2821:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_AND_19= RULE_AND | this_OR_20= RULE_OR | this_ESC_CHAR_21= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2821:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_AND_19= RULE_AND | this_OR_20= RULE_OR | this_ESC_CHAR_21= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2821:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_AND_19= RULE_AND | this_OR_20= RULE_OR | this_ESC_CHAR_21= RULE_ESC_CHAR )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2821:7: this_REST_0= RULE_REST
                    {
                    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleIfSqlValue6917); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REST_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REST_0, grammarAccess.getIfSqlValueAccess().getRESTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2829:10: this_IDENT_DOT_1= RULE_IDENT_DOT
                    {
                    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleIfSqlValue6943); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_DOT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_DOT_1, grammarAccess.getIfSqlValueAccess().getIDENT_DOTTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2837:10: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIfSqlValue6969); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_2, grammarAccess.getIfSqlValueAccess().getIDENTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2845:10: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIfSqlValue6995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_3, grammarAccess.getIfSqlValueAccess().getNUMBERTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2853:10: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlValue7021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WS_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_4, grammarAccess.getIfSqlValueAccess().getWSTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2861:10: this_SEMICOLON_5= RULE_SEMICOLON
                    {
                    this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleIfSqlValue7047); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SEMICOLON_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_5, grammarAccess.getIfSqlValueAccess().getSEMICOLONTerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2869:10: this_COMMA_6= RULE_COMMA
                    {
                    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleIfSqlValue7073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_6, grammarAccess.getIfSqlValueAccess().getCOMMATerminalRuleCall_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2877:10: this_MINUS_7= RULE_MINUS
                    {
                    this_MINUS_7=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleIfSqlValue7099); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_7, grammarAccess.getIfSqlValueAccess().getMINUSTerminalRuleCall_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2885:10: this_PLUS_8= RULE_PLUS
                    {
                    this_PLUS_8=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleIfSqlValue7125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_8, grammarAccess.getIfSqlValueAccess().getPLUSTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2893:10: this_LPAREN_9= RULE_LPAREN
                    {
                    this_LPAREN_9=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleIfSqlValue7151); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LPAREN_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_9, grammarAccess.getIfSqlValueAccess().getLPARENTerminalRuleCall_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2901:10: this_RPAREN_10= RULE_RPAREN
                    {
                    this_RPAREN_10=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleIfSqlValue7177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RPAREN_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_10, grammarAccess.getIfSqlValueAccess().getRPARENTerminalRuleCall_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2909:10: this_QUESTI_11= RULE_QUESTI
                    {
                    this_QUESTI_11=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleIfSqlValue7203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUESTI_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUESTI_11, grammarAccess.getIfSqlValueAccess().getQUESTITerminalRuleCall_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2917:10: this_NOT_12= RULE_NOT
                    {
                    this_NOT_12=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlValue7229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_12, grammarAccess.getIfSqlValueAccess().getNOTTerminalRuleCall_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2925:10: this_BAND_13= RULE_BAND
                    {
                    this_BAND_13=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleIfSqlValue7255); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BAND_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BAND_13, grammarAccess.getIfSqlValueAccess().getBANDTerminalRuleCall_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2933:10: this_HASH_14= RULE_HASH
                    {
                    this_HASH_14=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleIfSqlValue7281); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASH_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASH_14, grammarAccess.getIfSqlValueAccess().getHASHTerminalRuleCall_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2941:10: this_CARET_15= RULE_CARET
                    {
                    this_CARET_15=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleIfSqlValue7307); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CARET_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_15, grammarAccess.getIfSqlValueAccess().getCARETTerminalRuleCall_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2949:10: this_EQUALS_16= RULE_EQUALS
                    {
                    this_EQUALS_16=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleIfSqlValue7333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUALS_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_16, grammarAccess.getIfSqlValueAccess().getEQUALSTerminalRuleCall_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2957:10: this_LESS_THAN_17= RULE_LESS_THAN
                    {
                    this_LESS_THAN_17=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleIfSqlValue7359); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LESS_THAN_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LESS_THAN_17, grammarAccess.getIfSqlValueAccess().getLESS_THANTerminalRuleCall_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2965:10: this_MORE_THAN_18= RULE_MORE_THAN
                    {
                    this_MORE_THAN_18=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleIfSqlValue7385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MORE_THAN_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MORE_THAN_18, grammarAccess.getIfSqlValueAccess().getMORE_THANTerminalRuleCall_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2973:10: this_AND_19= RULE_AND
                    {
                    this_AND_19=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleIfSqlValue7411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AND_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AND_19, grammarAccess.getIfSqlValueAccess().getANDTerminalRuleCall_0_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2981:10: this_OR_20= RULE_OR
                    {
                    this_OR_20=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleIfSqlValue7437); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_OR_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OR_20, grammarAccess.getIfSqlValueAccess().getORTerminalRuleCall_0_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2989:10: this_ESC_CHAR_21= RULE_ESC_CHAR
                    {
                    this_ESC_CHAR_21=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleIfSqlValue7463); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESC_CHAR_21);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESC_CHAR_21, grammarAccess.getIfSqlValueAccess().getESC_CHARTerminalRuleCall_0_21()); 
                          
                    }

                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2996:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )*
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2996:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3017:23: (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR )
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
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3017:28: this_REST_22= RULE_REST
            	            {
            	            this_REST_22=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleIfSqlValue7639); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REST_22);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REST_22, grammarAccess.getIfSqlValueAccess().getRESTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3025:10: this_IDENT_DOT_23= RULE_IDENT_DOT
            	            {
            	            this_IDENT_DOT_23=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleIfSqlValue7665); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_DOT_23);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_DOT_23, grammarAccess.getIfSqlValueAccess().getIDENT_DOTTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3033:10: this_IDENT_24= RULE_IDENT
            	            {
            	            this_IDENT_24=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIfSqlValue7691); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_24);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_24, grammarAccess.getIfSqlValueAccess().getIDENTTerminalRuleCall_1_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3041:10: this_NUMBER_25= RULE_NUMBER
            	            {
            	            this_NUMBER_25=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIfSqlValue7717); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NUMBER_25);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NUMBER_25, grammarAccess.getIfSqlValueAccess().getNUMBERTerminalRuleCall_1_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3049:10: this_WS_26= RULE_WS
            	            {
            	            this_WS_26=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlValue7743); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_WS_26);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_WS_26, grammarAccess.getIfSqlValueAccess().getWSTerminalRuleCall_1_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3057:10: this_SEMICOLON_27= RULE_SEMICOLON
            	            {
            	            this_SEMICOLON_27=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleIfSqlValue7769); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_SEMICOLON_27);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_SEMICOLON_27, grammarAccess.getIfSqlValueAccess().getSEMICOLONTerminalRuleCall_1_0_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3065:10: this_COMMA_28= RULE_COMMA
            	            {
            	            this_COMMA_28=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleIfSqlValue7795); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COMMA_28);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COMMA_28, grammarAccess.getIfSqlValueAccess().getCOMMATerminalRuleCall_1_0_6()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3073:10: this_MINUS_29= RULE_MINUS
            	            {
            	            this_MINUS_29=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleIfSqlValue7821); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MINUS_29);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MINUS_29, grammarAccess.getIfSqlValueAccess().getMINUSTerminalRuleCall_1_0_7()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3081:10: this_PLUS_30= RULE_PLUS
            	            {
            	            this_PLUS_30=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleIfSqlValue7847); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PLUS_30);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PLUS_30, grammarAccess.getIfSqlValueAccess().getPLUSTerminalRuleCall_1_0_8()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3089:10: this_LPAREN_31= RULE_LPAREN
            	            {
            	            this_LPAREN_31=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleIfSqlValue7873); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LPAREN_31);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LPAREN_31, grammarAccess.getIfSqlValueAccess().getLPARENTerminalRuleCall_1_0_9()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3097:10: this_RPAREN_32= RULE_RPAREN
            	            {
            	            this_RPAREN_32=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleIfSqlValue7899); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RPAREN_32);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RPAREN_32, grammarAccess.getIfSqlValueAccess().getRPARENTerminalRuleCall_1_0_10()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3105:10: this_QUESTI_33= RULE_QUESTI
            	            {
            	            this_QUESTI_33=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleIfSqlValue7925); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_QUESTI_33);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_QUESTI_33, grammarAccess.getIfSqlValueAccess().getQUESTITerminalRuleCall_1_0_11()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 13 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3113:10: this_NOT_34= RULE_NOT
            	            {
            	            this_NOT_34=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlValue7951); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NOT_34);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NOT_34, grammarAccess.getIfSqlValueAccess().getNOTTerminalRuleCall_1_0_12()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 14 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3121:10: this_BAND_35= RULE_BAND
            	            {
            	            this_BAND_35=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleIfSqlValue7977); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BAND_35);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BAND_35, grammarAccess.getIfSqlValueAccess().getBANDTerminalRuleCall_1_0_13()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 15 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3129:10: this_HASH_36= RULE_HASH
            	            {
            	            this_HASH_36=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleIfSqlValue8003); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_HASH_36);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_HASH_36, grammarAccess.getIfSqlValueAccess().getHASHTerminalRuleCall_1_0_14()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 16 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3137:10: this_CARET_37= RULE_CARET
            	            {
            	            this_CARET_37=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleIfSqlValue8029); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_CARET_37);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_CARET_37, grammarAccess.getIfSqlValueAccess().getCARETTerminalRuleCall_1_0_15()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 17 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3145:10: this_EQUALS_38= RULE_EQUALS
            	            {
            	            this_EQUALS_38=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleIfSqlValue8055); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_EQUALS_38);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_EQUALS_38, grammarAccess.getIfSqlValueAccess().getEQUALSTerminalRuleCall_1_0_16()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 18 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3153:10: this_LESS_THAN_39= RULE_LESS_THAN
            	            {
            	            this_LESS_THAN_39=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleIfSqlValue8081); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LESS_THAN_39);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LESS_THAN_39, grammarAccess.getIfSqlValueAccess().getLESS_THANTerminalRuleCall_1_0_17()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 19 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3161:10: this_MORE_THAN_40= RULE_MORE_THAN
            	            {
            	            this_MORE_THAN_40=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleIfSqlValue8107); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MORE_THAN_40);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MORE_THAN_40, grammarAccess.getIfSqlValueAccess().getMORE_THANTerminalRuleCall_1_0_18()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 20 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3169:10: this_AND_41= RULE_AND
            	            {
            	            this_AND_41=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleIfSqlValue8133); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AND_41);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AND_41, grammarAccess.getIfSqlValueAccess().getANDTerminalRuleCall_1_0_19()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 21 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3177:10: this_OR_42= RULE_OR
            	            {
            	            this_OR_42=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleIfSqlValue8159); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_OR_42);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_OR_42, grammarAccess.getIfSqlValueAccess().getORTerminalRuleCall_1_0_20()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 22 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3185:10: this_ESC_CHAR_43= RULE_ESC_CHAR
            	            {
            	            this_ESC_CHAR_43=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleIfSqlValue8185); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3200:1: entryRuleIfMetaSql returns [EObject current=null] : iv_ruleIfMetaSql= ruleIfMetaSql EOF ;
    public final EObject entryRuleIfMetaSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfMetaSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3201:2: (iv_ruleIfMetaSql= ruleIfMetaSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3202:2: iv_ruleIfMetaSql= ruleIfMetaSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfMetaSqlRule()); 
            }
            pushFollow(FOLLOW_ruleIfMetaSql_in_entryRuleIfMetaSql8233);
            iv_ruleIfMetaSql=ruleIfMetaSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfMetaSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfMetaSql8243); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3209:1: ruleIfMetaSql returns [EObject current=null] : ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3212:28: ( ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3213:1: ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3213:1: ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3213:2: (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3213:2: (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3213:3: this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )*
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfMetaSql8280); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_0, grammarAccess.getIfMetaSqlAccess().getWSTerminalRuleCall_0_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3217:1: ( (lv_ifs_1_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3218:1: (lv_ifs_1_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3218:1: (lv_ifs_1_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3219:3: lv_ifs_1_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8300);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3235:2: (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_BOR) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3235:3: this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_2=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql8312); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_2, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_0_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3239:1: ( (lv_ifs_3_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3240:1: (lv_ifs_3_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3240:1: (lv_ifs_3_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3241:3: lv_ifs_3_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8332);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3258:6: ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3258:6: ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3258:7: ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3258:7: ( (lv_type_4_0= RULE_QUESTI ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3259:1: (lv_type_4_0= RULE_QUESTI )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3259:1: (lv_type_4_0= RULE_QUESTI )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3260:3: lv_type_4_0= RULE_QUESTI
                    {
                    lv_type_4_0=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleIfMetaSql8359); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3276:2: ( (lv_cond_5_0= ruleIfSqlCond ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3277:1: (lv_cond_5_0= ruleIfSqlCond )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3277:1: (lv_cond_5_0= ruleIfSqlCond )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3278:3: lv_cond_5_0= ruleIfSqlCond
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getCondIfSqlCondParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSqlCond_in_ruleIfMetaSql8385);
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

                    this_BOR_6=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql8396); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_6, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_1_2()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3298:1: ( (lv_ifs_7_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3299:1: (lv_ifs_7_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3299:1: (lv_ifs_7_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3300:3: lv_ifs_7_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8416);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3316:2: (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==RULE_BOR) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3316:3: this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_8=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql8428); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_8, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_1_4_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3320:1: ( (lv_ifs_9_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3321:1: (lv_ifs_9_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3321:1: (lv_ifs_9_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3322:3: lv_ifs_9_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_1_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8448);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3339:6: ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3339:6: ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3339:7: ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3339:7: ( (lv_type_10_0= RULE_BAND ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3340:1: (lv_type_10_0= RULE_BAND )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3340:1: (lv_type_10_0= RULE_BAND )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3341:3: lv_type_10_0= RULE_BAND
                    {
                    lv_type_10_0=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleIfMetaSql8475); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3357:2: ( (lv_ifs_11_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3358:1: (lv_ifs_11_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3358:1: (lv_ifs_11_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3359:3: lv_ifs_11_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8501);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3375:2: (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_BOR) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3375:3: this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_12=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql8513); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_12, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_2_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3379:1: ( (lv_ifs_13_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3380:1: (lv_ifs_13_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3380:1: (lv_ifs_13_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3381:3: lv_ifs_13_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8533);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3398:6: ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3398:6: ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3398:7: ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3398:7: ( (lv_type_14_0= RULE_BOR ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3399:1: (lv_type_14_0= RULE_BOR )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3399:1: (lv_type_14_0= RULE_BOR )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3400:3: lv_type_14_0= RULE_BOR
                    {
                    lv_type_14_0=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql8560); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3416:2: ( (lv_ifs_15_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3417:1: (lv_ifs_15_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3417:1: (lv_ifs_15_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3418:3: lv_ifs_15_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8586);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3434:2: (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_BOR) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3434:3: this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_16=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql8598); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_16, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_3_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3438:1: ( (lv_ifs_17_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3439:1: (lv_ifs_17_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3439:1: (lv_ifs_17_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3440:3: lv_ifs_17_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8618);
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3464:1: entryRuleIfSqlCond returns [EObject current=null] : iv_ruleIfSqlCond= ruleIfSqlCond EOF ;
    public final EObject entryRuleIfSqlCond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSqlCond = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3465:2: (iv_ruleIfSqlCond= ruleIfSqlCond EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3466:2: iv_ruleIfSqlCond= ruleIfSqlCond EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlCondRule()); 
            }
            pushFollow(FOLLOW_ruleIfSqlCond_in_entryRuleIfSqlCond8657);
            iv_ruleIfSqlCond=ruleIfSqlCond();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSqlCond; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSqlCond8667); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3473:1: ruleIfSqlCond returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )* ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3476:28: ( ( (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3477:1: ( (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3477:1: ( (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3477:2: (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3477:2: (this_WS_0= RULE_WS )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_WS) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3477:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlCond8704); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_0, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3481:3: ( (lv_bool1_1_0= ruleIfSqlBool ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3482:1: (lv_bool1_1_0= ruleIfSqlBool )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3482:1: (lv_bool1_1_0= ruleIfSqlBool )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3483:3: lv_bool1_1_0= ruleIfSqlBool
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfSqlCondAccess().getBool1IfSqlBoolParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIfSqlBool_in_ruleIfSqlCond8726);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3499:2: (this_WS_2= RULE_WS )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_WS) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3499:3: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlCond8738); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_2, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3503:3: ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_AND && LA49_0<=RULE_OR)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3503:4: ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )*
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3503:4: ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3504:1: ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3504:1: ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3505:1: (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3505:1: (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR )
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
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3506:3: lv_oper_3_1= RULE_AND
            	            {
            	            lv_oper_3_1=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleIfSqlCond8759); if (state.failed) return current;
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
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3521:8: lv_oper_3_2= RULE_OR
            	            {
            	            lv_oper_3_2=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleIfSqlCond8779); if (state.failed) return current;
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

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3539:2: (this_WS_4= RULE_WS )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==RULE_WS) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3539:3: this_WS_4= RULE_WS
            	    	    {
            	    	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlCond8799); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_4, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_3_1()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop47;
            	        }
            	    } while (true);

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3543:3: ( (lv_bool2_5_0= ruleIfSqlBool ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3544:1: (lv_bool2_5_0= ruleIfSqlBool )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3544:1: (lv_bool2_5_0= ruleIfSqlBool )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3545:3: lv_bool2_5_0= ruleIfSqlBool
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfSqlCondAccess().getBool2IfSqlBoolParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIfSqlBool_in_ruleIfSqlCond8821);
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

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3561:2: (this_WS_6= RULE_WS )*
            	    loop48:
            	    do {
            	        int alt48=2;
            	        int LA48_0 = input.LA(1);

            	        if ( (LA48_0==RULE_WS) ) {
            	            alt48=1;
            	        }


            	        switch (alt48) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3561:3: this_WS_6= RULE_WS
            	    	    {
            	    	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlCond8833); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3573:1: entryRuleIfSqlBool returns [EObject current=null] : iv_ruleIfSqlBool= ruleIfSqlBool EOF ;
    public final EObject entryRuleIfSqlBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSqlBool = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3574:2: (iv_ruleIfSqlBool= ruleIfSqlBool EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3575:2: iv_ruleIfSqlBool= ruleIfSqlBool EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlBoolRule()); 
            }
            pushFollow(FOLLOW_ruleIfSqlBool_in_entryRuleIfSqlBool8872);
            iv_ruleIfSqlBool=ruleIfSqlBool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSqlBool; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSqlBool8882); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3582:1: ruleIfSqlBool returns [EObject current=null] : ( ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) ) | ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN ) ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3585:28: ( ( ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) ) | ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3586:1: ( ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) ) | ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3586:1: ( ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) ) | ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN ) )
            int alt53=3;
            switch ( input.LA(1) ) {
            case RULE_NOT:
                {
                switch ( input.LA(2) ) {
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3586:2: ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3586:2: ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3586:3: ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3586:3: ( (lv_not_0_0= RULE_NOT ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_NOT) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3587:1: (lv_not_0_0= RULE_NOT )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3587:1: (lv_not_0_0= RULE_NOT )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3588:3: lv_not_0_0= RULE_NOT
                            {
                            lv_not_0_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlBool8925); if (state.failed) return current;
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

                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIfSqlBool8942); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getIfSqlBoolAccess().getSTRINGTerminalRuleCall_0_1()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3608:1: ( (lv_cnst_2_0= ruleConstant ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3609:1: (lv_cnst_2_0= ruleConstant )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3609:1: (lv_cnst_2_0= ruleConstant )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3610:3: lv_cnst_2_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlBoolAccess().getCnstConstantParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleIfSqlBool8962);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3627:6: ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3627:6: ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3627:7: ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3627:7: ( (lv_not_3_0= RULE_NOT ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==RULE_NOT) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3628:1: (lv_not_3_0= RULE_NOT )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3628:1: (lv_not_3_0= RULE_NOT )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3629:3: lv_not_3_0= RULE_NOT
                            {
                            lv_not_3_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlBool8987); if (state.failed) return current;
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

                    this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleIfSqlBool9004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_4, grammarAccess.getIfSqlBoolAccess().getCOLONTerminalRuleCall_1_1()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3649:1: ( (lv_ident_5_0= ruleIdentifier ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3650:1: (lv_ident_5_0= ruleIdentifier )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3650:1: (lv_ident_5_0= ruleIdentifier )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3651:3: lv_ident_5_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlBoolAccess().getIdentIdentifierParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleIfSqlBool9024);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3668:6: ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3668:6: ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3668:7: ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3668:7: ( (lv_not_6_0= RULE_NOT ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_NOT) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3669:1: (lv_not_6_0= RULE_NOT )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3669:1: (lv_not_6_0= RULE_NOT )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3670:3: lv_not_6_0= RULE_NOT
                            {
                            lv_not_6_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlBool9049); if (state.failed) return current;
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

                    this_LPAREN_7=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleIfSqlBool9066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_7, grammarAccess.getIfSqlBoolAccess().getLPARENTerminalRuleCall_2_1()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3690:1: ( (lv_cond_8_0= ruleIfSqlCond ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3691:1: (lv_cond_8_0= ruleIfSqlCond )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3691:1: (lv_cond_8_0= ruleIfSqlCond )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3692:3: lv_cond_8_0= ruleIfSqlCond
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlBoolAccess().getCondIfSqlCondParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSqlCond_in_ruleIfSqlBool9086);
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

                    this_RPAREN_9=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleIfSqlBool9097); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3720:1: entryRuleOrdSql returns [EObject current=null] : iv_ruleOrdSql= ruleOrdSql EOF ;
    public final EObject entryRuleOrdSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrdSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3721:2: (iv_ruleOrdSql= ruleOrdSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3722:2: iv_ruleOrdSql= ruleOrdSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrdSqlRule()); 
            }
            pushFollow(FOLLOW_ruleOrdSql_in_entryRuleOrdSql9133);
            iv_ruleOrdSql=ruleOrdSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrdSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrdSql9143); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3729:1: ruleOrdSql returns [EObject current=null] : ( (lv_sqls_0_0= ruleOrdSql2 ) )+ ;
    public final EObject ruleOrdSql() throws RecognitionException {
        EObject current = null;

        EObject lv_sqls_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3732:28: ( ( (lv_sqls_0_0= ruleOrdSql2 ) )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3733:1: ( (lv_sqls_0_0= ruleOrdSql2 ) )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3733:1: ( (lv_sqls_0_0= ruleOrdSql2 ) )+
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
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3734:1: (lv_sqls_0_0= ruleOrdSql2 )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3734:1: (lv_sqls_0_0= ruleOrdSql2 )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3735:3: lv_sqls_0_0= ruleOrdSql2
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrdSqlAccess().getSqlsOrdSql2ParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrdSql2_in_ruleOrdSql9188);
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3759:1: entryRuleOrdSql2 returns [EObject current=null] : iv_ruleOrdSql2= ruleOrdSql2 EOF ;
    public final EObject entryRuleOrdSql2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrdSql2 = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3760:2: (iv_ruleOrdSql2= ruleOrdSql2 EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3761:2: iv_ruleOrdSql2= ruleOrdSql2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrdSql2Rule()); 
            }
            pushFollow(FOLLOW_ruleOrdSql2_in_entryRuleOrdSql29224);
            iv_ruleOrdSql2=ruleOrdSql2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrdSql2; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrdSql29234); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3768:1: ruleOrdSql2 returns [EObject current=null] : ( ( (lv_value_0_0= ruleOrdSqlValue ) ) | (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) ) | (this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) ) ) ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3771:28: ( ( ( (lv_value_0_0= ruleOrdSqlValue ) ) | (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) ) | (this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) ) ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3772:1: ( ( (lv_value_0_0= ruleOrdSqlValue ) ) | (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) ) | (this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) ) ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3772:1: ( ( (lv_value_0_0= ruleOrdSqlValue ) ) | (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) ) | (this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) ) ) )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3772:2: ( (lv_value_0_0= ruleOrdSqlValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3772:2: ( (lv_value_0_0= ruleOrdSqlValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3773:1: (lv_value_0_0= ruleOrdSqlValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3773:1: (lv_value_0_0= ruleOrdSqlValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3774:3: lv_value_0_0= ruleOrdSqlValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrdSql2Access().getValueOrdSqlValueParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrdSqlValue_in_ruleOrdSql29280);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3791:6: (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3791:6: (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3791:7: this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) )
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOrdSql29298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getOrdSql2Access().getSTRINGTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3795:1: ( (lv_cnst_2_0= ruleConstant ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3796:1: (lv_cnst_2_0= ruleConstant )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3796:1: (lv_cnst_2_0= ruleConstant )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3797:3: lv_cnst_2_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrdSql2Access().getCnstConstantParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleOrdSql29318);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3814:6: (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3814:6: (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3814:7: this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) )
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleOrdSql29337); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_3, grammarAccess.getOrdSql2Access().getCOLONTerminalRuleCall_2_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3818:1: ( (lv_ident_4_0= ruleIdentifier ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3819:1: (lv_ident_4_0= ruleIdentifier )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3819:1: (lv_ident_4_0= ruleIdentifier )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3820:3: lv_ident_4_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrdSql2Access().getIdentIdentifierParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleOrdSql29357);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3837:6: (this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3837:6: (this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3837:7: this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) )
                    {
                    this_PERCENT_5=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleOrdSql29376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PERCENT_5, grammarAccess.getOrdSql2Access().getPERCENTTerminalRuleCall_3_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3841:1: ( (lv_dbcol_6_0= ruleDatabaseColumn ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3842:1: (lv_dbcol_6_0= ruleDatabaseColumn )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3842:1: (lv_dbcol_6_0= ruleDatabaseColumn )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3843:3: lv_dbcol_6_0= ruleDatabaseColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrdSql2Access().getDbcolDatabaseColumnParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDatabaseColumn_in_ruleOrdSql29396);
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3867:1: entryRuleOrdSqlValue returns [String current=null] : iv_ruleOrdSqlValue= ruleOrdSqlValue EOF ;
    public final String entryRuleOrdSqlValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrdSqlValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3868:2: (iv_ruleOrdSqlValue= ruleOrdSqlValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3869:2: iv_ruleOrdSqlValue= ruleOrdSqlValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrdSqlValueRule()); 
            }
            pushFollow(FOLLOW_ruleOrdSqlValue_in_entryRuleOrdSqlValue9434);
            iv_ruleOrdSqlValue=ruleOrdSqlValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrdSqlValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrdSqlValue9445); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3876:1: ruleOrdSqlValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_AND_22= RULE_AND | this_OR_23= RULE_OR | this_ESC_CHAR_24= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )* ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3879:28: ( ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_AND_22= RULE_AND | this_OR_23= RULE_OR | this_ESC_CHAR_24= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3880:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_AND_22= RULE_AND | this_OR_23= RULE_OR | this_ESC_CHAR_24= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3880:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_AND_22= RULE_AND | this_OR_23= RULE_OR | this_ESC_CHAR_24= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3880:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_AND_22= RULE_AND | this_OR_23= RULE_OR | this_ESC_CHAR_24= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3880:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_AND_22= RULE_AND | this_OR_23= RULE_OR | this_ESC_CHAR_24= RULE_ESC_CHAR )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3880:7: this_REST_0= RULE_REST
                    {
                    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleOrdSqlValue9486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REST_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REST_0, grammarAccess.getOrdSqlValueAccess().getRESTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3888:10: this_IDENT_DOT_1= RULE_IDENT_DOT
                    {
                    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleOrdSqlValue9512); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_DOT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_DOT_1, grammarAccess.getOrdSqlValueAccess().getIDENT_DOTTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3896:10: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleOrdSqlValue9538); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_2, grammarAccess.getOrdSqlValueAccess().getIDENTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3904:10: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleOrdSqlValue9564); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_3, grammarAccess.getOrdSqlValueAccess().getNUMBERTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3912:10: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleOrdSqlValue9590); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WS_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_4, grammarAccess.getOrdSqlValueAccess().getWSTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3920:10: this_SEMICOLON_5= RULE_SEMICOLON
                    {
                    this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleOrdSqlValue9616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SEMICOLON_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_5, grammarAccess.getOrdSqlValueAccess().getSEMICOLONTerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3928:10: this_COMMA_6= RULE_COMMA
                    {
                    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleOrdSqlValue9642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_6, grammarAccess.getOrdSqlValueAccess().getCOMMATerminalRuleCall_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3936:10: this_MINUS_7= RULE_MINUS
                    {
                    this_MINUS_7=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleOrdSqlValue9668); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_7, grammarAccess.getOrdSqlValueAccess().getMINUSTerminalRuleCall_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3944:10: this_PLUS_8= RULE_PLUS
                    {
                    this_PLUS_8=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleOrdSqlValue9694); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_8, grammarAccess.getOrdSqlValueAccess().getPLUSTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3952:10: this_LPAREN_9= RULE_LPAREN
                    {
                    this_LPAREN_9=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOrdSqlValue9720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LPAREN_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_9, grammarAccess.getOrdSqlValueAccess().getLPARENTerminalRuleCall_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3960:10: this_RPAREN_10= RULE_RPAREN
                    {
                    this_RPAREN_10=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOrdSqlValue9746); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RPAREN_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_10, grammarAccess.getOrdSqlValueAccess().getRPARENTerminalRuleCall_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3968:10: this_LBRACE_11= RULE_LBRACE
                    {
                    this_LBRACE_11=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleOrdSqlValue9772); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LBRACE_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACE_11, grammarAccess.getOrdSqlValueAccess().getLBRACETerminalRuleCall_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3976:10: this_QUESTI_12= RULE_QUESTI
                    {
                    this_QUESTI_12=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleOrdSqlValue9798); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUESTI_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUESTI_12, grammarAccess.getOrdSqlValueAccess().getQUESTITerminalRuleCall_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3984:10: this_NOT_13= RULE_NOT
                    {
                    this_NOT_13=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleOrdSqlValue9824); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_13, grammarAccess.getOrdSqlValueAccess().getNOTTerminalRuleCall_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3992:10: this_BAND_14= RULE_BAND
                    {
                    this_BAND_14=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleOrdSqlValue9850); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BAND_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BAND_14, grammarAccess.getOrdSqlValueAccess().getBANDTerminalRuleCall_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4000:10: this_BOR_15= RULE_BOR
                    {
                    this_BOR_15=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleOrdSqlValue9876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOR_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_15, grammarAccess.getOrdSqlValueAccess().getBORTerminalRuleCall_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4008:10: this_HASH_16= RULE_HASH
                    {
                    this_HASH_16=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleOrdSqlValue9902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASH_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASH_16, grammarAccess.getOrdSqlValueAccess().getHASHTerminalRuleCall_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4016:10: this_AT_17= RULE_AT
                    {
                    this_AT_17=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleOrdSqlValue9928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AT_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_17, grammarAccess.getOrdSqlValueAccess().getATTerminalRuleCall_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4024:10: this_CARET_18= RULE_CARET
                    {
                    this_CARET_18=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleOrdSqlValue9954); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CARET_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_18, grammarAccess.getOrdSqlValueAccess().getCARETTerminalRuleCall_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4032:10: this_EQUALS_19= RULE_EQUALS
                    {
                    this_EQUALS_19=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleOrdSqlValue9980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUALS_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_19, grammarAccess.getOrdSqlValueAccess().getEQUALSTerminalRuleCall_0_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4040:10: this_LESS_THAN_20= RULE_LESS_THAN
                    {
                    this_LESS_THAN_20=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleOrdSqlValue10006); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LESS_THAN_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LESS_THAN_20, grammarAccess.getOrdSqlValueAccess().getLESS_THANTerminalRuleCall_0_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4048:10: this_MORE_THAN_21= RULE_MORE_THAN
                    {
                    this_MORE_THAN_21=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleOrdSqlValue10032); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MORE_THAN_21);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MORE_THAN_21, grammarAccess.getOrdSqlValueAccess().getMORE_THANTerminalRuleCall_0_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4056:10: this_AND_22= RULE_AND
                    {
                    this_AND_22=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleOrdSqlValue10058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AND_22);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AND_22, grammarAccess.getOrdSqlValueAccess().getANDTerminalRuleCall_0_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4064:10: this_OR_23= RULE_OR
                    {
                    this_OR_23=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleOrdSqlValue10084); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_OR_23);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OR_23, grammarAccess.getOrdSqlValueAccess().getORTerminalRuleCall_0_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4072:10: this_ESC_CHAR_24= RULE_ESC_CHAR
                    {
                    this_ESC_CHAR_24=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleOrdSqlValue10110); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESC_CHAR_24);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESC_CHAR_24, grammarAccess.getOrdSqlValueAccess().getESC_CHARTerminalRuleCall_0_24()); 
                          
                    }

                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4079:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )*
            loop58:
            do {
                int alt58=2;
                alt58 = dfa58.predict(input);
                switch (alt58) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4079:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4103:23: (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR )
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
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4103:28: this_REST_25= RULE_REST
            	            {
            	            this_REST_25=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleOrdSqlValue10307); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REST_25);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REST_25, grammarAccess.getOrdSqlValueAccess().getRESTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4111:10: this_IDENT_DOT_26= RULE_IDENT_DOT
            	            {
            	            this_IDENT_DOT_26=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleOrdSqlValue10333); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_DOT_26);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_DOT_26, grammarAccess.getOrdSqlValueAccess().getIDENT_DOTTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4119:10: this_IDENT_27= RULE_IDENT
            	            {
            	            this_IDENT_27=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleOrdSqlValue10359); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_27);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_27, grammarAccess.getOrdSqlValueAccess().getIDENTTerminalRuleCall_1_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4127:10: this_NUMBER_28= RULE_NUMBER
            	            {
            	            this_NUMBER_28=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleOrdSqlValue10385); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NUMBER_28);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NUMBER_28, grammarAccess.getOrdSqlValueAccess().getNUMBERTerminalRuleCall_1_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4135:10: this_WS_29= RULE_WS
            	            {
            	            this_WS_29=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleOrdSqlValue10411); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_WS_29);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_WS_29, grammarAccess.getOrdSqlValueAccess().getWSTerminalRuleCall_1_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4143:10: this_SEMICOLON_30= RULE_SEMICOLON
            	            {
            	            this_SEMICOLON_30=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleOrdSqlValue10437); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_SEMICOLON_30);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_SEMICOLON_30, grammarAccess.getOrdSqlValueAccess().getSEMICOLONTerminalRuleCall_1_0_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4151:10: this_COMMA_31= RULE_COMMA
            	            {
            	            this_COMMA_31=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleOrdSqlValue10463); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COMMA_31);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COMMA_31, grammarAccess.getOrdSqlValueAccess().getCOMMATerminalRuleCall_1_0_6()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4159:10: this_MINUS_32= RULE_MINUS
            	            {
            	            this_MINUS_32=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleOrdSqlValue10489); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MINUS_32);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MINUS_32, grammarAccess.getOrdSqlValueAccess().getMINUSTerminalRuleCall_1_0_7()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4167:10: this_PLUS_33= RULE_PLUS
            	            {
            	            this_PLUS_33=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleOrdSqlValue10515); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PLUS_33);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PLUS_33, grammarAccess.getOrdSqlValueAccess().getPLUSTerminalRuleCall_1_0_8()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4175:10: this_LPAREN_34= RULE_LPAREN
            	            {
            	            this_LPAREN_34=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOrdSqlValue10541); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LPAREN_34);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LPAREN_34, grammarAccess.getOrdSqlValueAccess().getLPARENTerminalRuleCall_1_0_9()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4183:10: this_RPAREN_35= RULE_RPAREN
            	            {
            	            this_RPAREN_35=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOrdSqlValue10567); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RPAREN_35);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RPAREN_35, grammarAccess.getOrdSqlValueAccess().getRPARENTerminalRuleCall_1_0_10()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4191:10: this_LBRACE_36= RULE_LBRACE
            	            {
            	            this_LBRACE_36=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleOrdSqlValue10593); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LBRACE_36);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LBRACE_36, grammarAccess.getOrdSqlValueAccess().getLBRACETerminalRuleCall_1_0_11()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 13 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4199:10: this_QUESTI_37= RULE_QUESTI
            	            {
            	            this_QUESTI_37=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleOrdSqlValue10619); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_QUESTI_37);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_QUESTI_37, grammarAccess.getOrdSqlValueAccess().getQUESTITerminalRuleCall_1_0_12()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 14 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4207:10: this_NOT_38= RULE_NOT
            	            {
            	            this_NOT_38=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleOrdSqlValue10645); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NOT_38);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NOT_38, grammarAccess.getOrdSqlValueAccess().getNOTTerminalRuleCall_1_0_13()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 15 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4215:10: this_BAND_39= RULE_BAND
            	            {
            	            this_BAND_39=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleOrdSqlValue10671); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BAND_39);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BAND_39, grammarAccess.getOrdSqlValueAccess().getBANDTerminalRuleCall_1_0_14()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 16 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4223:10: this_BOR_40= RULE_BOR
            	            {
            	            this_BOR_40=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleOrdSqlValue10697); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BOR_40);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BOR_40, grammarAccess.getOrdSqlValueAccess().getBORTerminalRuleCall_1_0_15()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 17 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4231:10: this_HASH_41= RULE_HASH
            	            {
            	            this_HASH_41=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleOrdSqlValue10723); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_HASH_41);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_HASH_41, grammarAccess.getOrdSqlValueAccess().getHASHTerminalRuleCall_1_0_16()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 18 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4239:10: this_AT_42= RULE_AT
            	            {
            	            this_AT_42=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleOrdSqlValue10749); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AT_42);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AT_42, grammarAccess.getOrdSqlValueAccess().getATTerminalRuleCall_1_0_17()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 19 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4247:10: this_CARET_43= RULE_CARET
            	            {
            	            this_CARET_43=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleOrdSqlValue10775); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_CARET_43);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_CARET_43, grammarAccess.getOrdSqlValueAccess().getCARETTerminalRuleCall_1_0_18()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 20 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4255:10: this_EQUALS_44= RULE_EQUALS
            	            {
            	            this_EQUALS_44=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleOrdSqlValue10801); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_EQUALS_44);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_EQUALS_44, grammarAccess.getOrdSqlValueAccess().getEQUALSTerminalRuleCall_1_0_19()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 21 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4263:10: this_LESS_THAN_45= RULE_LESS_THAN
            	            {
            	            this_LESS_THAN_45=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleOrdSqlValue10827); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LESS_THAN_45);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LESS_THAN_45, grammarAccess.getOrdSqlValueAccess().getLESS_THANTerminalRuleCall_1_0_20()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 22 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4271:10: this_MORE_THAN_46= RULE_MORE_THAN
            	            {
            	            this_MORE_THAN_46=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleOrdSqlValue10853); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MORE_THAN_46);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MORE_THAN_46, grammarAccess.getOrdSqlValueAccess().getMORE_THANTerminalRuleCall_1_0_21()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 23 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4279:10: this_AND_47= RULE_AND
            	            {
            	            this_AND_47=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleOrdSqlValue10879); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AND_47);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AND_47, grammarAccess.getOrdSqlValueAccess().getANDTerminalRuleCall_1_0_22()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 24 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4287:10: this_OR_48= RULE_OR
            	            {
            	            this_OR_48=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleOrdSqlValue10905); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_OR_48);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_OR_48, grammarAccess.getOrdSqlValueAccess().getORTerminalRuleCall_1_0_23()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 25 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4295:10: this_ESC_CHAR_49= RULE_ESC_CHAR
            	            {
            	            this_ESC_CHAR_49=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleOrdSqlValue10931); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4310:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4311:2: (iv_ruleColumn= ruleColumn EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4312:2: iv_ruleColumn= ruleColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnRule()); 
            }
            pushFollow(FOLLOW_ruleColumn_in_entryRuleColumn10979);
            iv_ruleColumn=ruleColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumn10989); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4319:1: ruleColumn returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )? ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4322:28: ( ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )? ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4323:1: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )? )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4323:1: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4323:2: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )?
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4323:2: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4324:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4324:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4325:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4325:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4326:3: lv_name_0_1= RULE_IDENT
                    {
                    lv_name_0_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumn11033); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4341:8: lv_name_0_2= RULE_IDENT_DOT
                    {
                    lv_name_0_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleColumn11053); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4356:8: lv_name_0_3= RULE_NUMBER
                    {
                    lv_name_0_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleColumn11073); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4374:2: ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )?
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4374:3: ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4374:3: ( ( RULE_CARET )=>this_CARET_1= RULE_CARET )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4374:4: ( RULE_CARET )=>this_CARET_1= RULE_CARET
                    {
                    this_CARET_1=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleColumn11099); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_1, grammarAccess.getColumnAccess().getCARETTerminalRuleCall_1_0()); 
                          
                    }

                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4378:2: ( (lv_type_2_0= RULE_IDENT ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4379:1: (lv_type_2_0= RULE_IDENT )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4379:1: (lv_type_2_0= RULE_IDENT )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4380:3: lv_type_2_0= RULE_IDENT
                    {
                    lv_type_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumn11116); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4396:2: ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )*
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
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4396:3: ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4396:3: ( ( RULE_CARET )=>this_CARET_3= RULE_CARET )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4396:4: ( RULE_CARET )=>this_CARET_3= RULE_CARET
                    	    {
                    	    this_CARET_3=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleColumn11139); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_CARET_3, grammarAccess.getColumnAccess().getCARETTerminalRuleCall_1_2_0()); 
                    	          
                    	    }

                    	    }

                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4400:2: ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4401:1: ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4401:1: ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4402:1: (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4402:1: (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER )
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
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4403:3: lv_vals_4_1= RULE_IDENT
                    	            {
                    	            lv_vals_4_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumn11158); if (state.failed) return current;
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
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4418:8: lv_vals_4_2= RULE_NUMBER
                    	            {
                    	            lv_vals_4_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleColumn11178); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4444:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4445:2: (iv_ruleConstant= ruleConstant EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4446:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant11226);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant11236); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4453:1: ruleConstant returns [EObject current=null] : ( ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )? ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4456:28: ( ( ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )? ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4457:1: ( ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )? )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4457:1: ( ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4457:2: ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )?
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4457:2: ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_MINUS && LA64_0<=RULE_PLUS)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4458:1: ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4458:1: ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4459:1: (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4459:1: (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS )
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4460:3: lv_case_0_1= RULE_PLUS
                            {
                            lv_case_0_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleConstant11280); if (state.failed) return current;
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4475:8: lv_case_0_2= RULE_MINUS
                            {
                            lv_case_0_2=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleConstant11300); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4493:3: ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4494:1: ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4494:1: ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4495:1: (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4495:1: (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4496:3: lv_name_1_1= RULE_IDENT
                    {
                    lv_name_1_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstant11328); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4511:8: lv_name_1_2= RULE_IDENT_DOT
                    {
                    lv_name_1_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleConstant11348); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4529:2: ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )?
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4529:3: ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4529:3: ( ( RULE_CARET )=>this_CARET_2= RULE_CARET )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4529:4: ( RULE_CARET )=>this_CARET_2= RULE_CARET
                    {
                    this_CARET_2=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleConstant11374); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_2, grammarAccess.getConstantAccess().getCARETTerminalRuleCall_2_0()); 
                          
                    }

                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4533:2: ( (lv_type_3_0= RULE_IDENT ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4534:1: (lv_type_3_0= RULE_IDENT )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4534:1: (lv_type_3_0= RULE_IDENT )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4535:3: lv_type_3_0= RULE_IDENT
                    {
                    lv_type_3_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstant11391); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4551:2: ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )*
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
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4551:3: ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4551:3: ( ( RULE_CARET )=>this_CARET_4= RULE_CARET )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4551:4: ( RULE_CARET )=>this_CARET_4= RULE_CARET
                    	    {
                    	    this_CARET_4=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleConstant11414); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_CARET_4, grammarAccess.getConstantAccess().getCARETTerminalRuleCall_2_2_0()); 
                    	          
                    	    }

                    	    }

                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4555:2: ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4556:1: ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4556:1: ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4557:1: (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4557:1: (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER )
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
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4558:3: lv_vals_5_1= RULE_IDENT
                    	            {
                    	            lv_vals_5_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstant11433); if (state.failed) return current;
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
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4573:8: lv_vals_5_2= RULE_NUMBER
                    	            {
                    	            lv_vals_5_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleConstant11453); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4599:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4600:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4601:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier11501);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier11511); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4608:1: ruleIdentifier returns [EObject current=null] : ( ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )? ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4611:28: ( ( ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )? ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4612:1: ( ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )? )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4612:1: ( ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4612:2: ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )?
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4612:2: ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=RULE_EQUALS && LA70_0<=RULE_MORE_THAN)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4613:1: ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4613:1: ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4614:1: (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4614:1: (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN )
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4615:3: lv_mode_0_1= RULE_EQUALS
                            {
                            lv_mode_0_1=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleIdentifier11555); if (state.failed) return current;
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4630:8: lv_mode_0_2= RULE_LESS_THAN
                            {
                            lv_mode_0_2=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleIdentifier11575); if (state.failed) return current;
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4645:8: lv_mode_0_3= RULE_MORE_THAN
                            {
                            lv_mode_0_3=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleIdentifier11595); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4663:3: ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=RULE_MINUS && LA72_0<=RULE_PLUS)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4664:1: ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4664:1: ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4665:1: (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4665:1: (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS )
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4666:3: lv_case_1_1= RULE_PLUS
                            {
                            lv_case_1_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleIdentifier11623); if (state.failed) return current;
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4681:8: lv_case_1_2= RULE_MINUS
                            {
                            lv_case_1_2=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleIdentifier11643); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4699:3: ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4700:1: ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4700:1: ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4701:1: (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4701:1: (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4702:3: lv_name_2_1= RULE_IDENT
                    {
                    lv_name_2_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifier11671); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4717:8: lv_name_2_2= RULE_IDENT_DOT
                    {
                    lv_name_2_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleIdentifier11691); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4732:8: lv_name_2_3= RULE_NUMBER
                    {
                    lv_name_2_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIdentifier11711); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4750:2: ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )?
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4750:3: ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4750:3: ( ( RULE_CARET )=>this_CARET_3= RULE_CARET )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4750:4: ( RULE_CARET )=>this_CARET_3= RULE_CARET
                    {
                    this_CARET_3=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleIdentifier11737); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_3, grammarAccess.getIdentifierAccess().getCARETTerminalRuleCall_3_0()); 
                          
                    }

                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4754:2: ( (lv_type_4_0= RULE_IDENT ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4755:1: (lv_type_4_0= RULE_IDENT )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4755:1: (lv_type_4_0= RULE_IDENT )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4756:3: lv_type_4_0= RULE_IDENT
                    {
                    lv_type_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifier11754); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4772:2: ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )*
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
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4772:3: ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4772:3: ( ( RULE_CARET )=>this_CARET_5= RULE_CARET )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4772:4: ( RULE_CARET )=>this_CARET_5= RULE_CARET
                    	    {
                    	    this_CARET_5=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleIdentifier11777); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_CARET_5, grammarAccess.getIdentifierAccess().getCARETTerminalRuleCall_3_2_0()); 
                    	          
                    	    }

                    	    }

                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4776:2: ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4777:1: ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4777:1: ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4778:1: (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4778:1: (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER )
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
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4779:3: lv_vals_6_1= RULE_IDENT
                    	            {
                    	            lv_vals_6_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifier11796); if (state.failed) return current;
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
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4794:8: lv_vals_6_2= RULE_NUMBER
                    	            {
                    	            lv_vals_6_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIdentifier11816); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4820:1: entryRuleDatabaseColumn returns [EObject current=null] : iv_ruleDatabaseColumn= ruleDatabaseColumn EOF ;
    public final EObject entryRuleDatabaseColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabaseColumn = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4821:2: (iv_ruleDatabaseColumn= ruleDatabaseColumn EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4822:2: iv_ruleDatabaseColumn= ruleDatabaseColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDatabaseColumnRule()); 
            }
            pushFollow(FOLLOW_ruleDatabaseColumn_in_entryRuleDatabaseColumn11864);
            iv_ruleDatabaseColumn=ruleDatabaseColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDatabaseColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatabaseColumn11874); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4829:1: ruleDatabaseColumn returns [EObject current=null] : ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) ;
    public final EObject ruleDatabaseColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4832:28: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4833:1: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4833:1: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4834:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4834:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4835:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4835:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4836:3: lv_name_0_1= RULE_IDENT
                    {
                    lv_name_0_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleDatabaseColumn11917); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4851:8: lv_name_0_2= RULE_IDENT_DOT
                    {
                    lv_name_0_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleDatabaseColumn11937); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4877:1: entryRuleMappingRule returns [EObject current=null] : iv_ruleMappingRule= ruleMappingRule EOF ;
    public final EObject entryRuleMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingRule = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4878:2: (iv_ruleMappingRule= ruleMappingRule EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4879:2: iv_ruleMappingRule= ruleMappingRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingRuleRule()); 
            }
            pushFollow(FOLLOW_ruleMappingRule_in_entryRuleMappingRule11980);
            iv_ruleMappingRule=ruleMappingRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingRule11990); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4886:1: ruleMappingRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4889:28: ( ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4890:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4890:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4890:2: ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4890:2: ( (lv_name_0_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4891:1: (lv_name_0_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4891:1: (lv_name_0_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4892:3: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingRule12032); if (state.failed) return current;
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

            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleMappingRule12048); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_1, grammarAccess.getMappingRuleAccess().getLPARENTerminalRuleCall_1()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4912:1: ( (lv_type_2_0= ruleMAPPING_TYPE ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4913:1: (lv_type_2_0= ruleMAPPING_TYPE )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4913:1: (lv_type_2_0= ruleMAPPING_TYPE )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4914:3: lv_type_2_0= ruleMAPPING_TYPE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingRuleAccess().getTypeMAPPING_TYPEEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMAPPING_TYPE_in_ruleMappingRule12068);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4930:2: (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==RULE_COMMA) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4930:3: this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleMappingRule12080); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getMappingRuleAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4934:1: ( (lv_filters_4_0= RULE_IDENT ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4935:1: (lv_filters_4_0= RULE_IDENT )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4935:1: (lv_filters_4_0= RULE_IDENT )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4936:3: lv_filters_4_0= RULE_IDENT
            	    {
            	    lv_filters_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingRule12096); if (state.failed) return current;
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

            this_RPAREN_5=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleMappingRule12114); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_5, grammarAccess.getMappingRuleAccess().getRPARENTerminalRuleCall_4()); 
                  
            }
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleMappingRule12124); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUALS_6, grammarAccess.getMappingRuleAccess().getEQUALSTerminalRuleCall_5()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4960:1: ( (lv_mapping_7_0= ruleMapping ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4961:1: (lv_mapping_7_0= ruleMapping )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4961:1: (lv_mapping_7_0= ruleMapping )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4962:3: lv_mapping_7_0= ruleMapping
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingRuleAccess().getMappingMappingParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMapping_in_ruleMappingRule12144);
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

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleMappingRule12155); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4990:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4991:2: (iv_ruleMapping= ruleMapping EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4992:2: iv_ruleMapping= ruleMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingRule()); 
            }
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping12190);
            iv_ruleMapping=ruleMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping12200); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4999:1: ruleMapping returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )* ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        EObject lv_mappingItems_1_0 = null;

        EObject lv_mappingItems_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5002:28: ( ( (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5003:1: ( (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5003:1: ( (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5003:2: (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5003:2: (this_WS_0= RULE_WS )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_WS) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5003:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMapping12237); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_0, grammarAccess.getMappingAccess().getWSTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5007:3: ( (lv_mappingItems_1_0= ruleMappingItem ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5008:1: (lv_mappingItems_1_0= ruleMappingItem )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5008:1: (lv_mappingItems_1_0= ruleMappingItem )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5009:3: lv_mappingItems_1_0= ruleMappingItem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingAccess().getMappingItemsMappingItemParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMappingItem_in_ruleMapping12259);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5025:2: ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )*
            loop81:
            do {
                int alt81=2;
                alt81 = dfa81.predict(input);
                switch (alt81) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5025:3: (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5025:3: (this_WS_2= RULE_WS )+
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
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5025:4: this_WS_2= RULE_WS
            	    	    {
            	    	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMapping12272); if (state.failed) return current;
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

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5029:3: ( (lv_mappingItems_3_0= ruleMappingItem ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5030:1: (lv_mappingItems_3_0= ruleMappingItem )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5030:1: (lv_mappingItems_3_0= ruleMappingItem )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5031:3: lv_mappingItems_3_0= ruleMappingItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMappingAccess().getMappingItemsMappingItemParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMappingItem_in_ruleMapping12294);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5047:4: (this_WS_4= RULE_WS )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==RULE_WS) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5047:5: this_WS_4= RULE_WS
            	    {
            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMapping12308); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5059:1: entryRuleMappingItem returns [EObject current=null] : iv_ruleMappingItem= ruleMappingItem EOF ;
    public final EObject entryRuleMappingItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingItem = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5060:2: (iv_ruleMappingItem= ruleMappingItem EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5061:2: iv_ruleMappingItem= ruleMappingItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingItemRule()); 
            }
            pushFollow(FOLLOW_ruleMappingItem_in_entryRuleMappingItem12345);
            iv_ruleMappingItem=ruleMappingItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingItem12355); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5068:1: ruleMappingItem returns [EObject current=null] : ( ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )? ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5071:28: ( ( ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )? ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5072:1: ( ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )? )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5072:1: ( ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5072:2: ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )?
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5072:2: ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5073:1: ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5073:1: ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5074:1: (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5074:1: (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5075:3: lv_col_0_1= RULE_IDENT
                    {
                    lv_col_0_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingItem12399); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5090:8: lv_col_0_2= RULE_NUMBER
                    {
                    lv_col_0_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMappingItem12419); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5108:2: (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_STRING) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5108:3: this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )?
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMappingItem12439); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getMappingItemAccess().getSTRINGTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5112:1: ( (lv_type_2_0= RULE_IDENT ) )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==RULE_IDENT) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5113:1: (lv_type_2_0= RULE_IDENT )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5113:1: (lv_type_2_0= RULE_IDENT )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5114:3: lv_type_2_0= RULE_IDENT
                            {
                            lv_type_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingItem12455); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5130:3: (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==RULE_STRING) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5130:4: this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) )
                            {
                            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMappingItem12473); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_STRING_3, grammarAccess.getMappingItemAccess().getSTRINGTerminalRuleCall_1_2_0()); 
                                  
                            }
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5134:1: ( (lv_attr_4_0= ruleMappingColumn ) )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5135:1: (lv_attr_4_0= ruleMappingColumn )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5135:1: (lv_attr_4_0= ruleMappingColumn )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5136:3: lv_attr_4_0= ruleMappingColumn
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getMappingItemAccess().getAttrMappingColumnParserRuleCall_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMappingColumn_in_ruleMappingItem12493);
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5160:1: entryRuleMappingColumn returns [EObject current=null] : iv_ruleMappingColumn= ruleMappingColumn EOF ;
    public final EObject entryRuleMappingColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingColumn = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5161:2: (iv_ruleMappingColumn= ruleMappingColumn EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5162:2: iv_ruleMappingColumn= ruleMappingColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingColumnRule()); 
            }
            pushFollow(FOLLOW_ruleMappingColumn_in_entryRuleMappingColumn12533);
            iv_ruleMappingColumn=ruleMappingColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingColumn12543); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5169:1: ruleMappingColumn returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )* ) ;
    public final EObject ruleMappingColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token this_CARET_1=null;
        Token lv_vals_2_1=null;
        Token lv_vals_2_2=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5172:28: ( ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5173:1: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5173:1: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5173:2: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5173:2: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5174:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5174:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5175:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5175:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5176:3: lv_name_0_1= RULE_IDENT
                    {
                    lv_name_0_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingColumn12587); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5191:8: lv_name_0_2= RULE_IDENT_DOT
                    {
                    lv_name_0_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleMappingColumn12607); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5209:2: (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==RULE_CARET) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5209:3: this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) )
            	    {
            	    this_CARET_1=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleMappingColumn12627); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_CARET_1, grammarAccess.getMappingColumnAccess().getCARETTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5213:1: ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5214:1: ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5214:1: ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5215:1: (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5215:1: (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER )
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
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5216:3: lv_vals_2_1= RULE_IDENT
            	            {
            	            lv_vals_2_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingColumn12645); if (state.failed) return current;
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
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5231:8: lv_vals_2_2= RULE_NUMBER
            	            {
            	            lv_vals_2_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMappingColumn12665); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5257:1: entryRuleOptionalFeature returns [EObject current=null] : iv_ruleOptionalFeature= ruleOptionalFeature EOF ;
    public final EObject entryRuleOptionalFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalFeature = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5258:2: (iv_ruleOptionalFeature= ruleOptionalFeature EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5259:2: iv_ruleOptionalFeature= ruleOptionalFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionalFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleOptionalFeature_in_entryRuleOptionalFeature12711);
            iv_ruleOptionalFeature=ruleOptionalFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptionalFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalFeature12721); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5266:1: ruleOptionalFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5269:28: ( ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5270:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5270:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5270:2: ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5270:2: ( (lv_name_0_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5271:1: (lv_name_0_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5271:1: (lv_name_0_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5272:3: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleOptionalFeature12763); if (state.failed) return current;
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

            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOptionalFeature12779); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_1, grammarAccess.getOptionalFeatureAccess().getLPARENTerminalRuleCall_1()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5292:1: ( (lv_type_2_0= ruleOPTION_TYPE ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5293:1: (lv_type_2_0= ruleOPTION_TYPE )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5293:1: (lv_type_2_0= ruleOPTION_TYPE )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5294:3: lv_type_2_0= ruleOPTION_TYPE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionalFeatureAccess().getTypeOPTION_TYPEEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOPTION_TYPE_in_ruleOptionalFeature12799);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5310:2: (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==RULE_COMMA) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5310:3: this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleOptionalFeature12811); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getOptionalFeatureAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5314:1: ( (lv_filters_4_0= RULE_IDENT ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5315:1: (lv_filters_4_0= RULE_IDENT )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5315:1: (lv_filters_4_0= RULE_IDENT )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5316:3: lv_filters_4_0= RULE_IDENT
            	    {
            	    lv_filters_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleOptionalFeature12827); if (state.failed) return current;
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

            this_RPAREN_5=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOptionalFeature12845); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_5, grammarAccess.getOptionalFeatureAccess().getRPARENTerminalRuleCall_4()); 
                  
            }
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleOptionalFeature12855); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUALS_6, grammarAccess.getOptionalFeatureAccess().getEQUALSTerminalRuleCall_5()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5340:1: ( (lv_option_7_0= ruleFeatureValue ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5341:1: (lv_option_7_0= ruleFeatureValue )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5341:1: (lv_option_7_0= ruleFeatureValue )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5342:3: lv_option_7_0= ruleFeatureValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionalFeatureAccess().getOptionFeatureValueParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureValue_in_ruleOptionalFeature12875);
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

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleOptionalFeature12886); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5370:1: entryRuleFeatureValue returns [String current=null] : iv_ruleFeatureValue= ruleFeatureValue EOF ;
    public final String entryRuleFeatureValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5371:2: (iv_ruleFeatureValue= ruleFeatureValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5372:2: iv_ruleFeatureValue= ruleFeatureValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureValueRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureValue_in_entryRuleFeatureValue12922);
            iv_ruleFeatureValue=ruleFeatureValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureValue12933); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5379:1: ruleFeatureValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COLON_5= RULE_COLON | this_STRING_6= RULE_STRING | this_COMMA_7= RULE_COMMA | this_MINUS_8= RULE_MINUS | this_PLUS_9= RULE_PLUS | this_LPAREN_10= RULE_LPAREN | this_RPAREN_11= RULE_RPAREN | this_LBRACE_12= RULE_LBRACE | this_RBRACE_13= RULE_RBRACE | this_QUESTI_14= RULE_QUESTI | this_NOT_15= RULE_NOT | this_BAND_16= RULE_BAND | this_BOR_17= RULE_BOR | this_HASH_18= RULE_HASH | this_AT_19= RULE_AT | this_CARET_20= RULE_CARET | this_EQUALS_21= RULE_EQUALS | this_LESS_THAN_22= RULE_LESS_THAN | this_MORE_THAN_23= RULE_MORE_THAN | this_PERCENT_24= RULE_PERCENT | this_AND_25= RULE_AND | this_OR_26= RULE_OR | this_ESC_CHAR_27= RULE_ESC_CHAR )+ ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5382:28: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COLON_5= RULE_COLON | this_STRING_6= RULE_STRING | this_COMMA_7= RULE_COMMA | this_MINUS_8= RULE_MINUS | this_PLUS_9= RULE_PLUS | this_LPAREN_10= RULE_LPAREN | this_RPAREN_11= RULE_RPAREN | this_LBRACE_12= RULE_LBRACE | this_RBRACE_13= RULE_RBRACE | this_QUESTI_14= RULE_QUESTI | this_NOT_15= RULE_NOT | this_BAND_16= RULE_BAND | this_BOR_17= RULE_BOR | this_HASH_18= RULE_HASH | this_AT_19= RULE_AT | this_CARET_20= RULE_CARET | this_EQUALS_21= RULE_EQUALS | this_LESS_THAN_22= RULE_LESS_THAN | this_MORE_THAN_23= RULE_MORE_THAN | this_PERCENT_24= RULE_PERCENT | this_AND_25= RULE_AND | this_OR_26= RULE_OR | this_ESC_CHAR_27= RULE_ESC_CHAR )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5383:1: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COLON_5= RULE_COLON | this_STRING_6= RULE_STRING | this_COMMA_7= RULE_COMMA | this_MINUS_8= RULE_MINUS | this_PLUS_9= RULE_PLUS | this_LPAREN_10= RULE_LPAREN | this_RPAREN_11= RULE_RPAREN | this_LBRACE_12= RULE_LBRACE | this_RBRACE_13= RULE_RBRACE | this_QUESTI_14= RULE_QUESTI | this_NOT_15= RULE_NOT | this_BAND_16= RULE_BAND | this_BOR_17= RULE_BOR | this_HASH_18= RULE_HASH | this_AT_19= RULE_AT | this_CARET_20= RULE_CARET | this_EQUALS_21= RULE_EQUALS | this_LESS_THAN_22= RULE_LESS_THAN | this_MORE_THAN_23= RULE_MORE_THAN | this_PERCENT_24= RULE_PERCENT | this_AND_25= RULE_AND | this_OR_26= RULE_OR | this_ESC_CHAR_27= RULE_ESC_CHAR )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5383:1: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COLON_5= RULE_COLON | this_STRING_6= RULE_STRING | this_COMMA_7= RULE_COMMA | this_MINUS_8= RULE_MINUS | this_PLUS_9= RULE_PLUS | this_LPAREN_10= RULE_LPAREN | this_RPAREN_11= RULE_RPAREN | this_LBRACE_12= RULE_LBRACE | this_RBRACE_13= RULE_RBRACE | this_QUESTI_14= RULE_QUESTI | this_NOT_15= RULE_NOT | this_BAND_16= RULE_BAND | this_BOR_17= RULE_BOR | this_HASH_18= RULE_HASH | this_AT_19= RULE_AT | this_CARET_20= RULE_CARET | this_EQUALS_21= RULE_EQUALS | this_LESS_THAN_22= RULE_LESS_THAN | this_MORE_THAN_23= RULE_MORE_THAN | this_PERCENT_24= RULE_PERCENT | this_AND_25= RULE_AND | this_OR_26= RULE_OR | this_ESC_CHAR_27= RULE_ESC_CHAR )+
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
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5383:6: this_REST_0= RULE_REST
            	    {
            	    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleFeatureValue12973); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_REST_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_REST_0, grammarAccess.getFeatureValueAccess().getRESTTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5391:10: this_IDENT_DOT_1= RULE_IDENT_DOT
            	    {
            	    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleFeatureValue12999); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_IDENT_DOT_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_IDENT_DOT_1, grammarAccess.getFeatureValueAccess().getIDENT_DOTTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5399:10: this_IDENT_2= RULE_IDENT
            	    {
            	    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleFeatureValue13025); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_IDENT_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_IDENT_2, grammarAccess.getFeatureValueAccess().getIDENTTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5407:10: this_NUMBER_3= RULE_NUMBER
            	    {
            	    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleFeatureValue13051); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_NUMBER_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_NUMBER_3, grammarAccess.getFeatureValueAccess().getNUMBERTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5415:10: this_WS_4= RULE_WS
            	    {
            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleFeatureValue13077); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WS_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_4, grammarAccess.getFeatureValueAccess().getWSTerminalRuleCall_4()); 
            	          
            	    }

            	    }
            	    break;
            	case 6 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5423:10: this_COLON_5= RULE_COLON
            	    {
            	    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleFeatureValue13103); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COLON_5);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COLON_5, grammarAccess.getFeatureValueAccess().getCOLONTerminalRuleCall_5()); 
            	          
            	    }

            	    }
            	    break;
            	case 7 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5431:10: this_STRING_6= RULE_STRING
            	    {
            	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureValue13129); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_STRING_6);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_STRING_6, grammarAccess.getFeatureValueAccess().getSTRINGTerminalRuleCall_6()); 
            	          
            	    }

            	    }
            	    break;
            	case 8 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5439:10: this_COMMA_7= RULE_COMMA
            	    {
            	    this_COMMA_7=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleFeatureValue13155); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COMMA_7);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_7, grammarAccess.getFeatureValueAccess().getCOMMATerminalRuleCall_7()); 
            	          
            	    }

            	    }
            	    break;
            	case 9 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5447:10: this_MINUS_8= RULE_MINUS
            	    {
            	    this_MINUS_8=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleFeatureValue13181); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_MINUS_8);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_MINUS_8, grammarAccess.getFeatureValueAccess().getMINUSTerminalRuleCall_8()); 
            	          
            	    }

            	    }
            	    break;
            	case 10 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5455:10: this_PLUS_9= RULE_PLUS
            	    {
            	    this_PLUS_9=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleFeatureValue13207); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PLUS_9);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_PLUS_9, grammarAccess.getFeatureValueAccess().getPLUSTerminalRuleCall_9()); 
            	          
            	    }

            	    }
            	    break;
            	case 11 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5463:10: this_LPAREN_10= RULE_LPAREN
            	    {
            	    this_LPAREN_10=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleFeatureValue13233); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LPAREN_10);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LPAREN_10, grammarAccess.getFeatureValueAccess().getLPARENTerminalRuleCall_10()); 
            	          
            	    }

            	    }
            	    break;
            	case 12 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5471:10: this_RPAREN_11= RULE_RPAREN
            	    {
            	    this_RPAREN_11=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleFeatureValue13259); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_RPAREN_11);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_RPAREN_11, grammarAccess.getFeatureValueAccess().getRPARENTerminalRuleCall_11()); 
            	          
            	    }

            	    }
            	    break;
            	case 13 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5479:10: this_LBRACE_12= RULE_LBRACE
            	    {
            	    this_LBRACE_12=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleFeatureValue13285); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LBRACE_12);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LBRACE_12, grammarAccess.getFeatureValueAccess().getLBRACETerminalRuleCall_12()); 
            	          
            	    }

            	    }
            	    break;
            	case 14 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5487:10: this_RBRACE_13= RULE_RBRACE
            	    {
            	    this_RBRACE_13=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleFeatureValue13311); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_RBRACE_13);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_RBRACE_13, grammarAccess.getFeatureValueAccess().getRBRACETerminalRuleCall_13()); 
            	          
            	    }

            	    }
            	    break;
            	case 15 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5495:10: this_QUESTI_14= RULE_QUESTI
            	    {
            	    this_QUESTI_14=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleFeatureValue13337); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_QUESTI_14);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_QUESTI_14, grammarAccess.getFeatureValueAccess().getQUESTITerminalRuleCall_14()); 
            	          
            	    }

            	    }
            	    break;
            	case 16 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5503:10: this_NOT_15= RULE_NOT
            	    {
            	    this_NOT_15=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleFeatureValue13363); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_NOT_15);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_NOT_15, grammarAccess.getFeatureValueAccess().getNOTTerminalRuleCall_15()); 
            	          
            	    }

            	    }
            	    break;
            	case 17 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5511:10: this_BAND_16= RULE_BAND
            	    {
            	    this_BAND_16=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleFeatureValue13389); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_BAND_16);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_BAND_16, grammarAccess.getFeatureValueAccess().getBANDTerminalRuleCall_16()); 
            	          
            	    }

            	    }
            	    break;
            	case 18 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5519:10: this_BOR_17= RULE_BOR
            	    {
            	    this_BOR_17=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleFeatureValue13415); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_BOR_17);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_BOR_17, grammarAccess.getFeatureValueAccess().getBORTerminalRuleCall_17()); 
            	          
            	    }

            	    }
            	    break;
            	case 19 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5527:10: this_HASH_18= RULE_HASH
            	    {
            	    this_HASH_18=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleFeatureValue13441); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_HASH_18);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_HASH_18, grammarAccess.getFeatureValueAccess().getHASHTerminalRuleCall_18()); 
            	          
            	    }

            	    }
            	    break;
            	case 20 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5535:10: this_AT_19= RULE_AT
            	    {
            	    this_AT_19=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleFeatureValue13467); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_AT_19);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_AT_19, grammarAccess.getFeatureValueAccess().getATTerminalRuleCall_19()); 
            	          
            	    }

            	    }
            	    break;
            	case 21 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5543:10: this_CARET_20= RULE_CARET
            	    {
            	    this_CARET_20=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleFeatureValue13493); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_CARET_20);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_CARET_20, grammarAccess.getFeatureValueAccess().getCARETTerminalRuleCall_20()); 
            	          
            	    }

            	    }
            	    break;
            	case 22 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5551:10: this_EQUALS_21= RULE_EQUALS
            	    {
            	    this_EQUALS_21=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleFeatureValue13519); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_EQUALS_21);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_EQUALS_21, grammarAccess.getFeatureValueAccess().getEQUALSTerminalRuleCall_21()); 
            	          
            	    }

            	    }
            	    break;
            	case 23 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5559:10: this_LESS_THAN_22= RULE_LESS_THAN
            	    {
            	    this_LESS_THAN_22=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleFeatureValue13545); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LESS_THAN_22);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LESS_THAN_22, grammarAccess.getFeatureValueAccess().getLESS_THANTerminalRuleCall_22()); 
            	          
            	    }

            	    }
            	    break;
            	case 24 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5567:10: this_MORE_THAN_23= RULE_MORE_THAN
            	    {
            	    this_MORE_THAN_23=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleFeatureValue13571); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_MORE_THAN_23);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_MORE_THAN_23, grammarAccess.getFeatureValueAccess().getMORE_THANTerminalRuleCall_23()); 
            	          
            	    }

            	    }
            	    break;
            	case 25 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5575:10: this_PERCENT_24= RULE_PERCENT
            	    {
            	    this_PERCENT_24=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleFeatureValue13597); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PERCENT_24);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_PERCENT_24, grammarAccess.getFeatureValueAccess().getPERCENTTerminalRuleCall_24()); 
            	          
            	    }

            	    }
            	    break;
            	case 26 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5583:10: this_AND_25= RULE_AND
            	    {
            	    this_AND_25=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleFeatureValue13623); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_AND_25);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_AND_25, grammarAccess.getFeatureValueAccess().getANDTerminalRuleCall_25()); 
            	          
            	    }

            	    }
            	    break;
            	case 27 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5591:10: this_OR_26= RULE_OR
            	    {
            	    this_OR_26=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleFeatureValue13649); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_OR_26);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_OR_26, grammarAccess.getFeatureValueAccess().getORTerminalRuleCall_26()); 
            	          
            	    }

            	    }
            	    break;
            	case 28 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5599:10: this_ESC_CHAR_27= RULE_ESC_CHAR
            	    {
            	    this_ESC_CHAR_27=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleFeatureValue13675); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5614:1: ruleSTATEMEN_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'QRY' ) | (enumLiteral_1= 'CRUD' ) | (enumLiteral_2= 'CALL' ) ) ;
    public final Enumerator ruleSTATEMEN_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5616:28: ( ( (enumLiteral_0= 'QRY' ) | (enumLiteral_1= 'CRUD' ) | (enumLiteral_2= 'CALL' ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5617:1: ( (enumLiteral_0= 'QRY' ) | (enumLiteral_1= 'CRUD' ) | (enumLiteral_2= 'CALL' ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5617:1: ( (enumLiteral_0= 'QRY' ) | (enumLiteral_1= 'CRUD' ) | (enumLiteral_2= 'CALL' ) )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5617:2: (enumLiteral_0= 'QRY' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5617:2: (enumLiteral_0= 'QRY' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5617:4: enumLiteral_0= 'QRY'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_50_in_ruleSTATEMEN_TYPE13735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSTATEMEN_TYPEAccess().getQRYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSTATEMEN_TYPEAccess().getQRYEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5623:6: (enumLiteral_1= 'CRUD' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5623:6: (enumLiteral_1= 'CRUD' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5623:8: enumLiteral_1= 'CRUD'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_51_in_ruleSTATEMEN_TYPE13752); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSTATEMEN_TYPEAccess().getCRUDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSTATEMEN_TYPEAccess().getCRUDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5629:6: (enumLiteral_2= 'CALL' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5629:6: (enumLiteral_2= 'CALL' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5629:8: enumLiteral_2= 'CALL'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_52_in_ruleSTATEMEN_TYPE13769); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5639:1: ruleMAPPING_TYPE returns [Enumerator current=null] : (enumLiteral_0= 'OUT' ) ;
    public final Enumerator ruleMAPPING_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5641:28: ( (enumLiteral_0= 'OUT' ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5642:1: (enumLiteral_0= 'OUT' )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5642:1: (enumLiteral_0= 'OUT' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5642:3: enumLiteral_0= 'OUT'
            {
            enumLiteral_0=(Token)match(input,53,FOLLOW_53_in_ruleMAPPING_TYPE13813); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5652:1: ruleOPTION_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'OPT' ) | (enumLiteral_1= 'LOPT' ) | (enumLiteral_2= 'IOPT' ) | (enumLiteral_3= 'SOPT' ) | (enumLiteral_4= 'BOPT' ) ) ;
    public final Enumerator ruleOPTION_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5654:28: ( ( (enumLiteral_0= 'OPT' ) | (enumLiteral_1= 'LOPT' ) | (enumLiteral_2= 'IOPT' ) | (enumLiteral_3= 'SOPT' ) | (enumLiteral_4= 'BOPT' ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5655:1: ( (enumLiteral_0= 'OPT' ) | (enumLiteral_1= 'LOPT' ) | (enumLiteral_2= 'IOPT' ) | (enumLiteral_3= 'SOPT' ) | (enumLiteral_4= 'BOPT' ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5655:1: ( (enumLiteral_0= 'OPT' ) | (enumLiteral_1= 'LOPT' ) | (enumLiteral_2= 'IOPT' ) | (enumLiteral_3= 'SOPT' ) | (enumLiteral_4= 'BOPT' ) )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5655:2: (enumLiteral_0= 'OPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5655:2: (enumLiteral_0= 'OPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5655:4: enumLiteral_0= 'OPT'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleOPTION_TYPE13857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getOPTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOPTION_TYPEAccess().getOPTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5661:6: (enumLiteral_1= 'LOPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5661:6: (enumLiteral_1= 'LOPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5661:8: enumLiteral_1= 'LOPT'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_55_in_ruleOPTION_TYPE13874); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getLOPTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOPTION_TYPEAccess().getLOPTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5667:6: (enumLiteral_2= 'IOPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5667:6: (enumLiteral_2= 'IOPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5667:8: enumLiteral_2= 'IOPT'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_56_in_ruleOPTION_TYPE13891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getIOPTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOPTION_TYPEAccess().getIOPTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5673:6: (enumLiteral_3= 'SOPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5673:6: (enumLiteral_3= 'SOPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5673:8: enumLiteral_3= 'SOPT'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_57_in_ruleOPTION_TYPE13908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getSOPTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getOPTION_TYPEAccess().getSOPTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5679:6: (enumLiteral_4= 'BOPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5679:6: (enumLiteral_4= 'BOPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5679:8: enumLiteral_4= 'BOPT'
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_58_in_ruleOPTION_TYPE13925); if (state.failed) return current;
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
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:695:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:695:4: ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR )
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
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2034:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2034:4: ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR )
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
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2996:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2996:4: ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR )
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
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4079:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4079:4: ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR )
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
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4374:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4374:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred5_InternalProcessorDsl11094); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalProcessorDsl

    // $ANTLR start synpred6_InternalProcessorDsl
    public final void synpred6_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4396:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4396:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred6_InternalProcessorDsl11134); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalProcessorDsl

    // $ANTLR start synpred7_InternalProcessorDsl
    public final void synpred7_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4529:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4529:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred7_InternalProcessorDsl11369); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalProcessorDsl

    // $ANTLR start synpred8_InternalProcessorDsl
    public final void synpred8_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4551:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4551:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred8_InternalProcessorDsl11409); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalProcessorDsl

    // $ANTLR start synpred9_InternalProcessorDsl
    public final void synpred9_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4750:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4750:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred9_InternalProcessorDsl11732); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalProcessorDsl

    // $ANTLR start synpred10_InternalProcessorDsl
    public final void synpred10_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4772:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4772:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred10_InternalProcessorDsl11772); if (state.failed) return ;

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
        "\1\uffff\1\11\1\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\1\2\1\3\1\1";
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
            "\3\11\1\12\5\13",
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
            return "()* loopback of 695:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )*";
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
        "\2\uffff\1\12\1\22\1\17\1\3\1\7\1\20\1\2\1\16\1\4\1\15\1\21\1\1"+
        "\1\14\1\0\1\25\1\5\1\26\1\10\1\24\1\11\1\23\1\6\1\13\1\uffff}>";
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
            return "()* loopback of 2034:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_15 = input.LA(1);

                         
                        int index27_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_15);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_13 = input.LA(1);

                         
                        int index27_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_8 = input.LA(1);

                         
                        int index27_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_5 = input.LA(1);

                         
                        int index27_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA27_10 = input.LA(1);

                         
                        int index27_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA27_17 = input.LA(1);

                         
                        int index27_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_17);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA27_23 = input.LA(1);

                         
                        int index27_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_23);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA27_6 = input.LA(1);

                         
                        int index27_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_6);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA27_19 = input.LA(1);

                         
                        int index27_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_19);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA27_21 = input.LA(1);

                         
                        int index27_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_21);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA27_2 = input.LA(1);

                         
                        int index27_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_2);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA27_24 = input.LA(1);

                         
                        int index27_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_24);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA27_14 = input.LA(1);

                         
                        int index27_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA27_11 = input.LA(1);

                         
                        int index27_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_11);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA27_9 = input.LA(1);

                         
                        int index27_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_9);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA27_4 = input.LA(1);

                         
                        int index27_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_4);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA27_7 = input.LA(1);

                         
                        int index27_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_7);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA27_12 = input.LA(1);

                         
                        int index27_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_12);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA27_3 = input.LA(1);

                         
                        int index27_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_3);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA27_22 = input.LA(1);

                         
                        int index27_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_22);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA27_20 = input.LA(1);

                         
                        int index27_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_20);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA27_16 = input.LA(1);

                         
                        int index27_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_16);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA27_18 = input.LA(1);

                         
                        int index27_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_18);
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
        "\2\uffff\1\4\1\14\1\24\1\11\1\16\1\2\1\21\1\6\1\17\1\10\1\3\1\1"+
        "\1\15\1\0\1\23\1\5\1\25\1\12\1\13\1\22\1\7\1\20\1\uffff}>";
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
            return "()* loopback of 2996:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_15 = input.LA(1);

                         
                        int index38_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_15);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_13 = input.LA(1);

                         
                        int index38_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_7 = input.LA(1);

                         
                        int index38_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA38_12 = input.LA(1);

                         
                        int index38_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_12);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA38_2 = input.LA(1);

                         
                        int index38_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_2);
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
                        int LA38_9 = input.LA(1);

                         
                        int index38_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA38_22 = input.LA(1);

                         
                        int index38_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_22);
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
                        int LA38_5 = input.LA(1);

                         
                        int index38_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_5);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA38_19 = input.LA(1);

                         
                        int index38_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_19);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA38_20 = input.LA(1);

                         
                        int index38_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_20);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA38_3 = input.LA(1);

                         
                        int index38_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_3);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA38_14 = input.LA(1);

                         
                        int index38_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA38_6 = input.LA(1);

                         
                        int index38_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_6);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA38_10 = input.LA(1);

                         
                        int index38_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_10);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA38_23 = input.LA(1);

                         
                        int index38_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_23);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA38_8 = input.LA(1);

                         
                        int index38_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_8);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA38_21 = input.LA(1);

                         
                        int index38_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_21);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA38_16 = input.LA(1);

                         
                        int index38_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_16);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA38_4 = input.LA(1);

                         
                        int index38_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_4);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA38_18 = input.LA(1);

                         
                        int index38_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index38_18);
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
        "\2\uffff\1\12\1\15\1\27\1\11\1\26\1\13\1\16\1\1\1\7\1\23\1\20\1"+
        "\0\1\21\1\5\1\24\1\4\1\17\1\3\1\6\1\25\1\10\1\30\1\14\1\2\1\22\1"+
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
            return "()* loopback of 4079:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_13 = input.LA(1);

                         
                        int index58_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA58_9 = input.LA(1);

                         
                        int index58_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA58_25 = input.LA(1);

                         
                        int index58_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_25);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA58_19 = input.LA(1);

                         
                        int index58_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_19);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA58_17 = input.LA(1);

                         
                        int index58_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_17);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA58_15 = input.LA(1);

                         
                        int index58_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_15);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA58_20 = input.LA(1);

                         
                        int index58_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_20);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA58_10 = input.LA(1);

                         
                        int index58_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_10);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA58_22 = input.LA(1);

                         
                        int index58_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_22);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA58_5 = input.LA(1);

                         
                        int index58_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_5);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA58_2 = input.LA(1);

                         
                        int index58_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_2);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA58_7 = input.LA(1);

                         
                        int index58_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_7);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA58_24 = input.LA(1);

                         
                        int index58_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_24);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA58_3 = input.LA(1);

                         
                        int index58_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_3);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA58_8 = input.LA(1);

                         
                        int index58_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_8);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA58_18 = input.LA(1);

                         
                        int index58_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_18);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA58_12 = input.LA(1);

                         
                        int index58_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_12);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA58_14 = input.LA(1);

                         
                        int index58_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_14);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA58_26 = input.LA(1);

                         
                        int index58_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_26);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA58_11 = input.LA(1);

                         
                        int index58_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_11);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA58_16 = input.LA(1);

                         
                        int index58_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_16);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA58_21 = input.LA(1);

                         
                        int index58_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_21);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA58_6 = input.LA(1);

                         
                        int index58_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_6);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA58_4 = input.LA(1);

                         
                        int index58_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_4);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA58_23 = input.LA(1);

                         
                        int index58_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_23);
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
            return "()* loopback of 5025:2: ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )*";
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
    public static final BitSet FOLLOW_37_in_ruleProperty615 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty627 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty649 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_38_in_ruleProperty669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty681 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty703 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_39_in_ruleProperty723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty735 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty757 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_40_in_ruleProperty777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty789 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty811 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_41_in_ruleProperty831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty843 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty865 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleProperty878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValue_in_entryRulePropertyValue914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValue925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_rulePropertyValue966 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_rulePropertyValue992 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePropertyValue1018 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rulePropertyValue1044 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulePropertyValue1070 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyValue1096 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rulePropertyValue1122 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_rulePropertyValue1148 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rulePropertyValue1174 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rulePropertyValue1200 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rulePropertyValue1226 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rulePropertyValue1252 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rulePropertyValue1278 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_rulePropertyValue1304 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_NOT_in_rulePropertyValue1330 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_BAND_in_rulePropertyValue1356 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_BOR_in_rulePropertyValue1382 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_HASH_in_rulePropertyValue1408 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_AT_in_rulePropertyValue1434 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_CARET_in_rulePropertyValue1460 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_rulePropertyValue1486 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_rulePropertyValue1512 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_rulePropertyValue1538 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_rulePropertyValue1564 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_AND_in_rulePropertyValue1590 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_OR_in_rulePropertyValue1616 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_rulePropertyValue1642 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_REST_in_rulePropertyValue1860 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_rulePropertyValue1886 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePropertyValue1912 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rulePropertyValue1938 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_WS_in_rulePropertyValue1964 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulePropertyValue1990 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyValue2016 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rulePropertyValue2042 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_rulePropertyValue2068 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rulePropertyValue2094 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rulePropertyValue2120 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rulePropertyValue2146 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rulePropertyValue2172 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rulePropertyValue2198 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_rulePropertyValue2224 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_NOT_in_rulePropertyValue2250 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_BAND_in_rulePropertyValue2276 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_BOR_in_rulePropertyValue2302 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_HASH_in_rulePropertyValue2328 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_AT_in_rulePropertyValue2354 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_CARET_in_rulePropertyValue2380 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_rulePropertyValue2406 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_rulePropertyValue2432 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_rulePropertyValue2458 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_rulePropertyValue2484 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_AND_in_rulePropertyValue2510 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_OR_in_rulePropertyValue2536 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_rulePropertyValue2562 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_rulePojoDefinition_in_entryRulePojoDefinition2616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePojoDefinition2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePojoDefinition2667 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePojoDefinition2684 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePojoDefinition2708 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_rulePojoDefinition2728 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulePojoDefinition2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePojoUsage_in_entryRulePojoUsage2786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePojoUsage2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnUsage_in_rulePojoUsage2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierUsage_in_rulePojoUsage2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantUsage_in_rulePojoUsage2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingUsage_in_rulePojoUsage2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnUsage_in_entryRuleColumnUsage2965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnUsage2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleColumnUsage3016 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumnUsage3036 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumnUsage3056 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleColumnUsage3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierUsage_in_entryRuleIdentifierUsage3112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifierUsage3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleIdentifierUsage3163 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifierUsage3183 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifierUsage3203 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleIdentifierUsage3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantUsage_in_entryRuleConstantUsage3259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantUsage3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleConstantUsage3310 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstantUsage3330 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstantUsage3350 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleConstantUsage3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingUsage_in_entryRuleMappingUsage3406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingUsage3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleMappingUsage3457 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingUsage3477 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingUsage3497 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleMappingUsage3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition3553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableDefinition3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTableDefinition3604 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTableDefinition3621 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTableDefinition3643 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleTableDefinition3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableUsage_in_entryRuleTableUsage3704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableUsage3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTableUsage3755 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTableUsage3775 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTableUsage3795 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleTableUsage3807 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTableUsage3824 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleTableUsage3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaStatement_in_entryRuleMetaStatement3879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaStatement3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMetaStatement3931 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleMetaStatement3947 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_ruleSTATEMEN_TYPE_in_ruleMetaStatement3967 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleMetaStatement3979 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMetaStatement3995 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleMetaStatement4013 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMetaStatement4023 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_ruleSql_in_ruleMetaStatement4043 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleMetaStatement4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSql_in_entryRuleSql4089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSql4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlFragment_in_ruleSql4144 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_ruleSqlFragment_in_entryRuleSqlFragment4180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlFragment4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlValue_in_ruleSqlFragment4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleSqlFragment4254 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_ruleColumn_in_ruleSqlFragment4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSqlFragment4293 = new BitSet(new long[]{0x0000000000006180L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleSqlFragment4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleSqlFragment4332 = new BitSet(new long[]{0x000000001C006380L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleSqlFragment4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleSqlFragment4371 = new BitSet(new long[]{0x0000000004E80010L});
    public static final BitSet FOLLOW_ruleMetaSql_in_ruleSqlFragment4391 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleSqlFragment4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleSqlFragment4420 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleDatabaseColumn_in_ruleSqlFragment4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlValue_in_entryRuleSqlValue4478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlValue4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleSqlValue4530 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleSqlValue4556 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleSqlValue4582 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSqlValue4608 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSqlValue4634 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleSqlValue4660 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleSqlValue4686 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleSqlValue4712 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleSqlValue4738 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleSqlValue4764 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleSqlValue4790 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleSqlValue4816 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleSqlValue4842 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleSqlValue4868 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleSqlValue4894 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleSqlValue4920 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleSqlValue4946 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleSqlValue4972 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleSqlValue4998 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleSqlValue5024 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleSqlValue5050 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleSqlValue5076 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleSqlValue5102 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleSqlValue5285 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleSqlValue5311 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleSqlValue5337 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSqlValue5363 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSqlValue5389 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleSqlValue5415 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleSqlValue5441 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleSqlValue5467 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleSqlValue5493 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleSqlValue5519 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleSqlValue5545 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleSqlValue5571 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleSqlValue5597 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleSqlValue5623 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleSqlValue5649 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleSqlValue5675 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleSqlValue5701 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleSqlValue5727 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleSqlValue5753 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleSqlValue5779 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleSqlValue5805 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleSqlValue5831 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleSqlValue5857 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_ruleMetaSql_in_entryRuleMetaSql5905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaSql5915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMetaSql5952 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql5972 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql5984 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6004 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleMetaSql6031 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_ruleIfSqlCond_in_ruleMetaSql6057 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql6068 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6088 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql6100 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6120 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleMetaSql6147 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6173 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql6185 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6205 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql6232 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6258 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql6270 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6290 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMetaSql6317 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMetaSql6334 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMetaSql6352 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleMetaSql6403 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMetaSql6419 = new BitSet(new long[]{0x00000001FFFBFFF0L});
    public static final BitSet FOLLOW_ruleOrdSql_in_ruleMetaSql6439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSql_in_entryRuleIfSql6476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSql6486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSqlFragment_in_ruleIfSql6531 = new BitSet(new long[]{0x00000001FFBBFFF2L});
    public static final BitSet FOLLOW_ruleIfSqlFragment_in_entryRuleIfSqlFragment6567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSqlFragment6577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSqlValue_in_ruleIfSqlFragment6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleIfSqlFragment6641 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_ruleColumn_in_ruleIfSqlFragment6661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIfSqlFragment6680 = new BitSet(new long[]{0x0000000000006180L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleIfSqlFragment6700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleIfSqlFragment6719 = new BitSet(new long[]{0x000000001C006380L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleIfSqlFragment6739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleIfSqlFragment6758 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleDatabaseColumn_in_ruleIfSqlFragment6778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleIfSqlFragment6797 = new BitSet(new long[]{0x0000000000680010L});
    public static final BitSet FOLLOW_ruleIfMetaSql_in_ruleIfSqlFragment6817 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleIfSqlFragment6828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSqlValue_in_entryRuleIfSqlValue6865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSqlValue6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleIfSqlValue6917 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleIfSqlValue6943 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIfSqlValue6969 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIfSqlValue6995 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlValue7021 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleIfSqlValue7047 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleIfSqlValue7073 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleIfSqlValue7099 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleIfSqlValue7125 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleIfSqlValue7151 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleIfSqlValue7177 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleIfSqlValue7203 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlValue7229 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleIfSqlValue7255 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleIfSqlValue7281 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleIfSqlValue7307 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleIfSqlValue7333 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleIfSqlValue7359 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleIfSqlValue7385 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleIfSqlValue7411 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleIfSqlValue7437 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleIfSqlValue7463 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleIfSqlValue7639 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleIfSqlValue7665 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIfSqlValue7691 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIfSqlValue7717 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlValue7743 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleIfSqlValue7769 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleIfSqlValue7795 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleIfSqlValue7821 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleIfSqlValue7847 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleIfSqlValue7873 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleIfSqlValue7899 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleIfSqlValue7925 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlValue7951 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleIfSqlValue7977 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleIfSqlValue8003 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleIfSqlValue8029 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleIfSqlValue8055 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleIfSqlValue8081 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleIfSqlValue8107 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleIfSqlValue8133 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleIfSqlValue8159 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleIfSqlValue8185 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_ruleIfMetaSql_in_entryRuleIfMetaSql8233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfMetaSql8243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfMetaSql8280 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8300 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql8312 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8332 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleIfMetaSql8359 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_ruleIfSqlCond_in_ruleIfMetaSql8385 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql8396 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8416 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql8428 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8448 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleIfMetaSql8475 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8501 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql8513 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8533 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql8560 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8586 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql8598 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8618 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleIfSqlCond_in_entryRuleIfSqlCond8657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSqlCond8667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlCond8704 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_ruleIfSqlBool_in_ruleIfSqlCond8726 = new BitSet(new long[]{0x00000000C0000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlCond8738 = new BitSet(new long[]{0x00000000C0000012L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleIfSqlCond8759 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleIfSqlCond8779 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlCond8799 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_ruleIfSqlBool_in_ruleIfSqlCond8821 = new BitSet(new long[]{0x00000000C0000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlCond8833 = new BitSet(new long[]{0x00000000C0000012L});
    public static final BitSet FOLLOW_ruleIfSqlBool_in_entryRuleIfSqlBool8872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSqlBool8882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlBool8925 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIfSqlBool8942 = new BitSet(new long[]{0x0000000000006180L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleIfSqlBool8962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlBool8987 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleIfSqlBool9004 = new BitSet(new long[]{0x000000001C006380L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleIfSqlBool9024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlBool9049 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleIfSqlBool9066 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_ruleIfSqlCond_in_ruleIfSqlBool9086 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleIfSqlBool9097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrdSql_in_entryRuleOrdSql9133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrdSql9143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrdSql2_in_ruleOrdSql9188 = new BitSet(new long[]{0x00000001FFFBFFF2L});
    public static final BitSet FOLLOW_ruleOrdSql2_in_entryRuleOrdSql29224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrdSql29234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrdSqlValue_in_ruleOrdSql29280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOrdSql29298 = new BitSet(new long[]{0x0000000000006180L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleOrdSql29318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleOrdSql29337 = new BitSet(new long[]{0x000000001C006380L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleOrdSql29357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleOrdSql29376 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleDatabaseColumn_in_ruleOrdSql29396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrdSqlValue_in_entryRuleOrdSqlValue9434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrdSqlValue9445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleOrdSqlValue9486 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleOrdSqlValue9512 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleOrdSqlValue9538 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleOrdSqlValue9564 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleOrdSqlValue9590 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleOrdSqlValue9616 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleOrdSqlValue9642 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleOrdSqlValue9668 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleOrdSqlValue9694 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOrdSqlValue9720 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOrdSqlValue9746 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleOrdSqlValue9772 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleOrdSqlValue9798 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleOrdSqlValue9824 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleOrdSqlValue9850 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleOrdSqlValue9876 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleOrdSqlValue9902 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleOrdSqlValue9928 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleOrdSqlValue9954 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleOrdSqlValue9980 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleOrdSqlValue10006 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleOrdSqlValue10032 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleOrdSqlValue10058 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleOrdSqlValue10084 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleOrdSqlValue10110 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleOrdSqlValue10307 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleOrdSqlValue10333 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleOrdSqlValue10359 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleOrdSqlValue10385 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleOrdSqlValue10411 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleOrdSqlValue10437 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleOrdSqlValue10463 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleOrdSqlValue10489 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleOrdSqlValue10515 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOrdSqlValue10541 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOrdSqlValue10567 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleOrdSqlValue10593 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleOrdSqlValue10619 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleOrdSqlValue10645 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleOrdSqlValue10671 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleOrdSqlValue10697 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleOrdSqlValue10723 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleOrdSqlValue10749 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleOrdSqlValue10775 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleOrdSqlValue10801 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleOrdSqlValue10827 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleOrdSqlValue10853 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleOrdSqlValue10879 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleOrdSqlValue10905 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleOrdSqlValue10931 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn10979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumn10989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumn11033 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleColumn11053 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleColumn11073 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleColumn11099 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumn11116 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleColumn11139 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumn11158 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleColumn11178 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant11226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant11236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleConstant11280 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleConstant11300 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstant11328 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleConstant11348 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleConstant11374 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstant11391 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleConstant11414 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstant11433 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleConstant11453 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier11501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier11511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleIdentifier11555 = new BitSet(new long[]{0x0000000000006380L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleIdentifier11575 = new BitSet(new long[]{0x0000000000006380L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleIdentifier11595 = new BitSet(new long[]{0x0000000000006380L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleIdentifier11623 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleIdentifier11643 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifier11671 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleIdentifier11691 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIdentifier11711 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleIdentifier11737 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifier11754 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleIdentifier11777 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifier11796 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIdentifier11816 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleDatabaseColumn_in_entryRuleDatabaseColumn11864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatabaseColumn11874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleDatabaseColumn11917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleDatabaseColumn11937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingRule_in_entryRuleMappingRule11980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingRule11990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingRule12032 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleMappingRule12048 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleMAPPING_TYPE_in_ruleMappingRule12068 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleMappingRule12080 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingRule12096 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleMappingRule12114 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMappingRule12124 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleMappingRule12144 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleMappingRule12155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping12190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping12200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMapping12237 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_ruleMappingItem_in_ruleMapping12259 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMapping12272 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_ruleMappingItem_in_ruleMapping12294 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMapping12308 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleMappingItem_in_entryRuleMappingItem12345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingItem12355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingItem12399 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMappingItem12419 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMappingItem12439 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingItem12455 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMappingItem12473 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleMappingColumn_in_ruleMappingItem12493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingColumn_in_entryRuleMappingColumn12533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingColumn12543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingColumn12587 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleMappingColumn12607 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleMappingColumn12627 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingColumn12645 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMappingColumn12665 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOptionalFeature_in_entryRuleOptionalFeature12711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalFeature12721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleOptionalFeature12763 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOptionalFeature12779 = new BitSet(new long[]{0x07C0000000000000L});
    public static final BitSet FOLLOW_ruleOPTION_TYPE_in_ruleOptionalFeature12799 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleOptionalFeature12811 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleOptionalFeature12827 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOptionalFeature12845 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleOptionalFeature12855 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_ruleFeatureValue_in_ruleOptionalFeature12875 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleOptionalFeature12886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureValue_in_entryRuleFeatureValue12922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureValue12933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleFeatureValue12973 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleFeatureValue12999 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleFeatureValue13025 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleFeatureValue13051 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleFeatureValue13077 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleFeatureValue13103 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureValue13129 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleFeatureValue13155 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleFeatureValue13181 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleFeatureValue13207 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleFeatureValue13233 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleFeatureValue13259 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleFeatureValue13285 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleFeatureValue13311 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleFeatureValue13337 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleFeatureValue13363 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleFeatureValue13389 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleFeatureValue13415 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleFeatureValue13441 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleFeatureValue13467 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleFeatureValue13493 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleFeatureValue13519 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleFeatureValue13545 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleFeatureValue13571 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleFeatureValue13597 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleFeatureValue13623 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleFeatureValue13649 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleFeatureValue13675 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_50_in_ruleSTATEMEN_TYPE13735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleSTATEMEN_TYPE13752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleSTATEMEN_TYPE13769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleMAPPING_TYPE13813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleOPTION_TYPE13857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleOPTION_TYPE13874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOPTION_TYPE13891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleOPTION_TYPE13908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOPTION_TYPE13925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred1_InternalProcessorDsl1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred2_InternalProcessorDsl5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred3_InternalProcessorDsl7480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred4_InternalProcessorDsl10127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred5_InternalProcessorDsl11094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred6_InternalProcessorDsl11134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred7_InternalProcessorDsl11369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred8_InternalProcessorDsl11409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred9_InternalProcessorDsl11732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred10_InternalProcessorDsl11772 = new BitSet(new long[]{0x0000000000000002L});

}