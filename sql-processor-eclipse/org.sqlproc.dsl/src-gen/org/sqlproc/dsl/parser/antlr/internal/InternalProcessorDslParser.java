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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_SEMICOLON", "RULE_REST", "RULE_IDENT_DOT", "RULE_IDENT", "RULE_NUMBER", "RULE_COLON", "RULE_STRING", "RULE_COMMA", "RULE_MINUS", "RULE_PLUS", "RULE_LPAREN", "RULE_RPAREN", "RULE_LBRACE", "RULE_RBRACE", "RULE_QUESTI", "RULE_NOT", "RULE_BAND", "RULE_BOR", "RULE_HASH", "RULE_AT", "RULE_CARET", "RULE_EQUALS", "RULE_LESS_THAN", "RULE_MORE_THAN", "RULE_PERCENT", "RULE_AND", "RULE_OR", "RULE_ESC_CHAR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'resolve references'", "'ON'", "'OFF'", "'database online'", "'database url'", "'database username'", "'database password'", "'database schema'", "'database driver'", "'pojo'", "'col'", "'ident'", "'const'", "'out'", "'table'", "'dbcol'", "'prefix'", "'QRY'", "'CRUD'", "'CALL'", "'OUT'", "'OPT'", "'LOPT'", "'IOPT'", "'SOPT'", "'BOPT'"
    };
    public static final int RULE_SEMICOLON=5;
    public static final int RULE_OR=31;
    public static final int RULE_PERCENT=29;
    public static final int RULE_AND=30;
    public static final int EOF=-1;
    public static final int T__60=60;
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
    public static final int T__59=59;
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
    public static final int RULE_RBRACE=18;
    public static final int T__47=47;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:285:1: ruleProperty returns [EObject current=null] : ( ( ( ( (lv_name_0_0= 'resolve references' ) ) (this_WS_1= RULE_WS )+ ( ( (lv_doResolvePojo_2_1= 'ON' | lv_doResolvePojo_2_2= 'OFF' ) ) ) ) | ( ( (lv_name_3_0= 'database online' ) ) (this_WS_4= RULE_WS )+ ( ( (lv_doResolveDb_5_1= 'ON' | lv_doResolveDb_5_2= 'OFF' ) ) ) ) | ( ( (lv_name_6_0= 'database url' ) ) (this_WS_7= RULE_WS )+ ( (lv_dbUrl_8_0= rulePropertyValue ) ) ) | ( ( (lv_name_9_0= 'database username' ) ) (this_WS_10= RULE_WS )+ ( (lv_dbUsername_11_0= rulePropertyValue ) ) ) | ( ( (lv_name_12_0= 'database password' ) ) (this_WS_13= RULE_WS )+ ( (lv_dbPassword_14_0= rulePropertyValue ) ) ) | ( ( (lv_name_15_0= 'database schema' ) ) (this_WS_16= RULE_WS )+ ( (lv_dbSchema_17_0= rulePropertyValue ) ) ) | ( ( (lv_name_18_0= 'database driver' ) ) (this_WS_19= RULE_WS )+ ( (lv_dbDriver_20_0= rulePropertyValue ) ) ) ) this_SEMICOLON_21= RULE_SEMICOLON ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_WS_1=null;
        Token lv_doResolvePojo_2_1=null;
        Token lv_doResolvePojo_2_2=null;
        Token lv_name_3_0=null;
        Token this_WS_4=null;
        Token lv_doResolveDb_5_1=null;
        Token lv_doResolveDb_5_2=null;
        Token lv_name_6_0=null;
        Token this_WS_7=null;
        Token lv_name_9_0=null;
        Token this_WS_10=null;
        Token lv_name_12_0=null;
        Token this_WS_13=null;
        Token lv_name_15_0=null;
        Token this_WS_16=null;
        Token lv_name_18_0=null;
        Token this_WS_19=null;
        Token this_SEMICOLON_21=null;
        AntlrDatatypeRuleToken lv_dbUrl_8_0 = null;

        AntlrDatatypeRuleToken lv_dbUsername_11_0 = null;

        AntlrDatatypeRuleToken lv_dbPassword_14_0 = null;

        AntlrDatatypeRuleToken lv_dbSchema_17_0 = null;

        AntlrDatatypeRuleToken lv_dbDriver_20_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:288:28: ( ( ( ( ( (lv_name_0_0= 'resolve references' ) ) (this_WS_1= RULE_WS )+ ( ( (lv_doResolvePojo_2_1= 'ON' | lv_doResolvePojo_2_2= 'OFF' ) ) ) ) | ( ( (lv_name_3_0= 'database online' ) ) (this_WS_4= RULE_WS )+ ( ( (lv_doResolveDb_5_1= 'ON' | lv_doResolveDb_5_2= 'OFF' ) ) ) ) | ( ( (lv_name_6_0= 'database url' ) ) (this_WS_7= RULE_WS )+ ( (lv_dbUrl_8_0= rulePropertyValue ) ) ) | ( ( (lv_name_9_0= 'database username' ) ) (this_WS_10= RULE_WS )+ ( (lv_dbUsername_11_0= rulePropertyValue ) ) ) | ( ( (lv_name_12_0= 'database password' ) ) (this_WS_13= RULE_WS )+ ( (lv_dbPassword_14_0= rulePropertyValue ) ) ) | ( ( (lv_name_15_0= 'database schema' ) ) (this_WS_16= RULE_WS )+ ( (lv_dbSchema_17_0= rulePropertyValue ) ) ) | ( ( (lv_name_18_0= 'database driver' ) ) (this_WS_19= RULE_WS )+ ( (lv_dbDriver_20_0= rulePropertyValue ) ) ) ) this_SEMICOLON_21= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:1: ( ( ( ( (lv_name_0_0= 'resolve references' ) ) (this_WS_1= RULE_WS )+ ( ( (lv_doResolvePojo_2_1= 'ON' | lv_doResolvePojo_2_2= 'OFF' ) ) ) ) | ( ( (lv_name_3_0= 'database online' ) ) (this_WS_4= RULE_WS )+ ( ( (lv_doResolveDb_5_1= 'ON' | lv_doResolveDb_5_2= 'OFF' ) ) ) ) | ( ( (lv_name_6_0= 'database url' ) ) (this_WS_7= RULE_WS )+ ( (lv_dbUrl_8_0= rulePropertyValue ) ) ) | ( ( (lv_name_9_0= 'database username' ) ) (this_WS_10= RULE_WS )+ ( (lv_dbUsername_11_0= rulePropertyValue ) ) ) | ( ( (lv_name_12_0= 'database password' ) ) (this_WS_13= RULE_WS )+ ( (lv_dbPassword_14_0= rulePropertyValue ) ) ) | ( ( (lv_name_15_0= 'database schema' ) ) (this_WS_16= RULE_WS )+ ( (lv_dbSchema_17_0= rulePropertyValue ) ) ) | ( ( (lv_name_18_0= 'database driver' ) ) (this_WS_19= RULE_WS )+ ( (lv_dbDriver_20_0= rulePropertyValue ) ) ) ) this_SEMICOLON_21= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:1: ( ( ( ( (lv_name_0_0= 'resolve references' ) ) (this_WS_1= RULE_WS )+ ( ( (lv_doResolvePojo_2_1= 'ON' | lv_doResolvePojo_2_2= 'OFF' ) ) ) ) | ( ( (lv_name_3_0= 'database online' ) ) (this_WS_4= RULE_WS )+ ( ( (lv_doResolveDb_5_1= 'ON' | lv_doResolveDb_5_2= 'OFF' ) ) ) ) | ( ( (lv_name_6_0= 'database url' ) ) (this_WS_7= RULE_WS )+ ( (lv_dbUrl_8_0= rulePropertyValue ) ) ) | ( ( (lv_name_9_0= 'database username' ) ) (this_WS_10= RULE_WS )+ ( (lv_dbUsername_11_0= rulePropertyValue ) ) ) | ( ( (lv_name_12_0= 'database password' ) ) (this_WS_13= RULE_WS )+ ( (lv_dbPassword_14_0= rulePropertyValue ) ) ) | ( ( (lv_name_15_0= 'database schema' ) ) (this_WS_16= RULE_WS )+ ( (lv_dbSchema_17_0= rulePropertyValue ) ) ) | ( ( (lv_name_18_0= 'database driver' ) ) (this_WS_19= RULE_WS )+ ( (lv_dbDriver_20_0= rulePropertyValue ) ) ) ) this_SEMICOLON_21= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:2: ( ( ( (lv_name_0_0= 'resolve references' ) ) (this_WS_1= RULE_WS )+ ( ( (lv_doResolvePojo_2_1= 'ON' | lv_doResolvePojo_2_2= 'OFF' ) ) ) ) | ( ( (lv_name_3_0= 'database online' ) ) (this_WS_4= RULE_WS )+ ( ( (lv_doResolveDb_5_1= 'ON' | lv_doResolveDb_5_2= 'OFF' ) ) ) ) | ( ( (lv_name_6_0= 'database url' ) ) (this_WS_7= RULE_WS )+ ( (lv_dbUrl_8_0= rulePropertyValue ) ) ) | ( ( (lv_name_9_0= 'database username' ) ) (this_WS_10= RULE_WS )+ ( (lv_dbUsername_11_0= rulePropertyValue ) ) ) | ( ( (lv_name_12_0= 'database password' ) ) (this_WS_13= RULE_WS )+ ( (lv_dbPassword_14_0= rulePropertyValue ) ) ) | ( ( (lv_name_15_0= 'database schema' ) ) (this_WS_16= RULE_WS )+ ( (lv_dbSchema_17_0= rulePropertyValue ) ) ) | ( ( (lv_name_18_0= 'database driver' ) ) (this_WS_19= RULE_WS )+ ( (lv_dbDriver_20_0= rulePropertyValue ) ) ) ) this_SEMICOLON_21= RULE_SEMICOLON
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:2: ( ( ( (lv_name_0_0= 'resolve references' ) ) (this_WS_1= RULE_WS )+ ( ( (lv_doResolvePojo_2_1= 'ON' | lv_doResolvePojo_2_2= 'OFF' ) ) ) ) | ( ( (lv_name_3_0= 'database online' ) ) (this_WS_4= RULE_WS )+ ( ( (lv_doResolveDb_5_1= 'ON' | lv_doResolveDb_5_2= 'OFF' ) ) ) ) | ( ( (lv_name_6_0= 'database url' ) ) (this_WS_7= RULE_WS )+ ( (lv_dbUrl_8_0= rulePropertyValue ) ) ) | ( ( (lv_name_9_0= 'database username' ) ) (this_WS_10= RULE_WS )+ ( (lv_dbUsername_11_0= rulePropertyValue ) ) ) | ( ( (lv_name_12_0= 'database password' ) ) (this_WS_13= RULE_WS )+ ( (lv_dbPassword_14_0= rulePropertyValue ) ) ) | ( ( (lv_name_15_0= 'database schema' ) ) (this_WS_16= RULE_WS )+ ( (lv_dbSchema_17_0= rulePropertyValue ) ) ) | ( ( (lv_name_18_0= 'database driver' ) ) (this_WS_19= RULE_WS )+ ( (lv_dbDriver_20_0= rulePropertyValue ) ) ) )
            int alt20=7;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt20=1;
                }
                break;
            case 38:
                {
                alt20=2;
                }
                break;
            case 39:
                {
                alt20=3;
                }
                break;
            case 40:
                {
                alt20=4;
                }
                break;
            case 41:
                {
                alt20=5;
                }
                break;
            case 42:
                {
                alt20=6;
                }
                break;
            case 43:
                {
                alt20=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:3: ( ( (lv_name_0_0= 'resolve references' ) ) (this_WS_1= RULE_WS )+ ( ( (lv_doResolvePojo_2_1= 'ON' | lv_doResolvePojo_2_2= 'OFF' ) ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:3: ( ( (lv_name_0_0= 'resolve references' ) ) (this_WS_1= RULE_WS )+ ( ( (lv_doResolvePojo_2_1= 'ON' | lv_doResolvePojo_2_2= 'OFF' ) ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:4: ( (lv_name_0_0= 'resolve references' ) ) (this_WS_1= RULE_WS )+ ( ( (lv_doResolvePojo_2_1= 'ON' | lv_doResolvePojo_2_2= 'OFF' ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:4: ( (lv_name_0_0= 'resolve references' ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:290:1: (lv_name_0_0= 'resolve references' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:290:1: (lv_name_0_0= 'resolve references' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:291:3: lv_name_0_0= 'resolve references'
                    {
                    lv_name_0_0=(Token)match(input,35,FOLLOW_35_in_ruleProperty547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccess().getNameResolveReferencesKeyword_0_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_0, "resolve references");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:304:2: (this_WS_1= RULE_WS )+
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
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:304:3: this_WS_1= RULE_WS
                    	    {
                    	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty572); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_1, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_0_1()); 
                    	          
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:308:3: ( ( (lv_doResolvePojo_2_1= 'ON' | lv_doResolvePojo_2_2= 'OFF' ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:309:1: ( (lv_doResolvePojo_2_1= 'ON' | lv_doResolvePojo_2_2= 'OFF' ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:309:1: ( (lv_doResolvePojo_2_1= 'ON' | lv_doResolvePojo_2_2= 'OFF' ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:310:1: (lv_doResolvePojo_2_1= 'ON' | lv_doResolvePojo_2_2= 'OFF' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:310:1: (lv_doResolvePojo_2_1= 'ON' | lv_doResolvePojo_2_2= 'OFF' )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==36) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==37) ) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:311:3: lv_doResolvePojo_2_1= 'ON'
                            {
                            lv_doResolvePojo_2_1=(Token)match(input,36,FOLLOW_36_in_ruleProperty593); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_doResolvePojo_2_1, grammarAccess.getPropertyAccess().getDoResolvePojoONKeyword_0_0_2_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPropertyRule());
                              	        }
                                     		setWithLastConsumed(current, "doResolvePojo", lv_doResolvePojo_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:323:8: lv_doResolvePojo_2_2= 'OFF'
                            {
                            lv_doResolvePojo_2_2=(Token)match(input,37,FOLLOW_37_in_ruleProperty622); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_doResolvePojo_2_2, grammarAccess.getPropertyAccess().getDoResolvePojoOFFKeyword_0_0_2_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPropertyRule());
                              	        }
                                     		setWithLastConsumed(current, "doResolvePojo", lv_doResolvePojo_2_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:339:6: ( ( (lv_name_3_0= 'database online' ) ) (this_WS_4= RULE_WS )+ ( ( (lv_doResolveDb_5_1= 'ON' | lv_doResolveDb_5_2= 'OFF' ) ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:339:6: ( ( (lv_name_3_0= 'database online' ) ) (this_WS_4= RULE_WS )+ ( ( (lv_doResolveDb_5_1= 'ON' | lv_doResolveDb_5_2= 'OFF' ) ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:339:7: ( (lv_name_3_0= 'database online' ) ) (this_WS_4= RULE_WS )+ ( ( (lv_doResolveDb_5_1= 'ON' | lv_doResolveDb_5_2= 'OFF' ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:339:7: ( (lv_name_3_0= 'database online' ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:340:1: (lv_name_3_0= 'database online' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:340:1: (lv_name_3_0= 'database online' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:341:3: lv_name_3_0= 'database online'
                    {
                    lv_name_3_0=(Token)match(input,38,FOLLOW_38_in_ruleProperty664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_3_0, grammarAccess.getPropertyAccess().getNameDatabaseOnlineKeyword_0_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_3_0, "database online");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:354:2: (this_WS_4= RULE_WS )+
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
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:354:3: this_WS_4= RULE_WS
                    	    {
                    	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty689); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_4, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_1_1()); 
                    	          
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:358:3: ( ( (lv_doResolveDb_5_1= 'ON' | lv_doResolveDb_5_2= 'OFF' ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:359:1: ( (lv_doResolveDb_5_1= 'ON' | lv_doResolveDb_5_2= 'OFF' ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:359:1: ( (lv_doResolveDb_5_1= 'ON' | lv_doResolveDb_5_2= 'OFF' ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:360:1: (lv_doResolveDb_5_1= 'ON' | lv_doResolveDb_5_2= 'OFF' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:360:1: (lv_doResolveDb_5_1= 'ON' | lv_doResolveDb_5_2= 'OFF' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==36) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==37) ) {
                        alt14=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:361:3: lv_doResolveDb_5_1= 'ON'
                            {
                            lv_doResolveDb_5_1=(Token)match(input,36,FOLLOW_36_in_ruleProperty710); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_doResolveDb_5_1, grammarAccess.getPropertyAccess().getDoResolveDbONKeyword_0_1_2_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPropertyRule());
                              	        }
                                     		setWithLastConsumed(current, "doResolveDb", lv_doResolveDb_5_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:373:8: lv_doResolveDb_5_2= 'OFF'
                            {
                            lv_doResolveDb_5_2=(Token)match(input,37,FOLLOW_37_in_ruleProperty739); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_doResolveDb_5_2, grammarAccess.getPropertyAccess().getDoResolveDbOFFKeyword_0_1_2_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPropertyRule());
                              	        }
                                     		setWithLastConsumed(current, "doResolveDb", lv_doResolveDb_5_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:389:6: ( ( (lv_name_6_0= 'database url' ) ) (this_WS_7= RULE_WS )+ ( (lv_dbUrl_8_0= rulePropertyValue ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:389:6: ( ( (lv_name_6_0= 'database url' ) ) (this_WS_7= RULE_WS )+ ( (lv_dbUrl_8_0= rulePropertyValue ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:389:7: ( (lv_name_6_0= 'database url' ) ) (this_WS_7= RULE_WS )+ ( (lv_dbUrl_8_0= rulePropertyValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:389:7: ( (lv_name_6_0= 'database url' ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:390:1: (lv_name_6_0= 'database url' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:390:1: (lv_name_6_0= 'database url' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:391:3: lv_name_6_0= 'database url'
                    {
                    lv_name_6_0=(Token)match(input,39,FOLLOW_39_in_ruleProperty781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_6_0, grammarAccess.getPropertyAccess().getNameDatabaseUrlKeyword_0_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_6_0, "database url");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:404:2: (this_WS_7= RULE_WS )+
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
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:404:3: this_WS_7= RULE_WS
                    	    {
                    	    this_WS_7=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty806); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_7, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_2_1()); 
                    	          
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:408:3: ( (lv_dbUrl_8_0= rulePropertyValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:409:1: (lv_dbUrl_8_0= rulePropertyValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:409:1: (lv_dbUrl_8_0= rulePropertyValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:410:3: lv_dbUrl_8_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getDbUrlPropertyValueParserRuleCall_0_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty828);
                    lv_dbUrl_8_0=rulePropertyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"dbUrl",
                              		lv_dbUrl_8_0, 
                              		"PropertyValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:427:6: ( ( (lv_name_9_0= 'database username' ) ) (this_WS_10= RULE_WS )+ ( (lv_dbUsername_11_0= rulePropertyValue ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:427:6: ( ( (lv_name_9_0= 'database username' ) ) (this_WS_10= RULE_WS )+ ( (lv_dbUsername_11_0= rulePropertyValue ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:427:7: ( (lv_name_9_0= 'database username' ) ) (this_WS_10= RULE_WS )+ ( (lv_dbUsername_11_0= rulePropertyValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:427:7: ( (lv_name_9_0= 'database username' ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:428:1: (lv_name_9_0= 'database username' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:428:1: (lv_name_9_0= 'database username' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:429:3: lv_name_9_0= 'database username'
                    {
                    lv_name_9_0=(Token)match(input,40,FOLLOW_40_in_ruleProperty854); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_9_0, grammarAccess.getPropertyAccess().getNameDatabaseUsernameKeyword_0_3_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_9_0, "database username");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:442:2: (this_WS_10= RULE_WS )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_WS) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:442:3: this_WS_10= RULE_WS
                    	    {
                    	    this_WS_10=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty879); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_10, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_3_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:446:3: ( (lv_dbUsername_11_0= rulePropertyValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:447:1: (lv_dbUsername_11_0= rulePropertyValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:447:1: (lv_dbUsername_11_0= rulePropertyValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:448:3: lv_dbUsername_11_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getDbUsernamePropertyValueParserRuleCall_0_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty901);
                    lv_dbUsername_11_0=rulePropertyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"dbUsername",
                              		lv_dbUsername_11_0, 
                              		"PropertyValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:465:6: ( ( (lv_name_12_0= 'database password' ) ) (this_WS_13= RULE_WS )+ ( (lv_dbPassword_14_0= rulePropertyValue ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:465:6: ( ( (lv_name_12_0= 'database password' ) ) (this_WS_13= RULE_WS )+ ( (lv_dbPassword_14_0= rulePropertyValue ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:465:7: ( (lv_name_12_0= 'database password' ) ) (this_WS_13= RULE_WS )+ ( (lv_dbPassword_14_0= rulePropertyValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:465:7: ( (lv_name_12_0= 'database password' ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:466:1: (lv_name_12_0= 'database password' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:466:1: (lv_name_12_0= 'database password' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:467:3: lv_name_12_0= 'database password'
                    {
                    lv_name_12_0=(Token)match(input,41,FOLLOW_41_in_ruleProperty927); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_12_0, grammarAccess.getPropertyAccess().getNameDatabasePasswordKeyword_0_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_12_0, "database password");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:480:2: (this_WS_13= RULE_WS )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_WS) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:480:3: this_WS_13= RULE_WS
                    	    {
                    	    this_WS_13=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty952); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_13, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_4_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:484:3: ( (lv_dbPassword_14_0= rulePropertyValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:485:1: (lv_dbPassword_14_0= rulePropertyValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:485:1: (lv_dbPassword_14_0= rulePropertyValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:486:3: lv_dbPassword_14_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getDbPasswordPropertyValueParserRuleCall_0_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty974);
                    lv_dbPassword_14_0=rulePropertyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"dbPassword",
                              		lv_dbPassword_14_0, 
                              		"PropertyValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:503:6: ( ( (lv_name_15_0= 'database schema' ) ) (this_WS_16= RULE_WS )+ ( (lv_dbSchema_17_0= rulePropertyValue ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:503:6: ( ( (lv_name_15_0= 'database schema' ) ) (this_WS_16= RULE_WS )+ ( (lv_dbSchema_17_0= rulePropertyValue ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:503:7: ( (lv_name_15_0= 'database schema' ) ) (this_WS_16= RULE_WS )+ ( (lv_dbSchema_17_0= rulePropertyValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:503:7: ( (lv_name_15_0= 'database schema' ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:504:1: (lv_name_15_0= 'database schema' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:504:1: (lv_name_15_0= 'database schema' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:505:3: lv_name_15_0= 'database schema'
                    {
                    lv_name_15_0=(Token)match(input,42,FOLLOW_42_in_ruleProperty1000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_15_0, grammarAccess.getPropertyAccess().getNameDatabaseSchemaKeyword_0_5_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_15_0, "database schema");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:518:2: (this_WS_16= RULE_WS )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_WS) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:518:3: this_WS_16= RULE_WS
                    	    {
                    	    this_WS_16=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty1025); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_16, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_5_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:522:3: ( (lv_dbSchema_17_0= rulePropertyValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:523:1: (lv_dbSchema_17_0= rulePropertyValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:523:1: (lv_dbSchema_17_0= rulePropertyValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:524:3: lv_dbSchema_17_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getDbSchemaPropertyValueParserRuleCall_0_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty1047);
                    lv_dbSchema_17_0=rulePropertyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"dbSchema",
                              		lv_dbSchema_17_0, 
                              		"PropertyValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:541:6: ( ( (lv_name_18_0= 'database driver' ) ) (this_WS_19= RULE_WS )+ ( (lv_dbDriver_20_0= rulePropertyValue ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:541:6: ( ( (lv_name_18_0= 'database driver' ) ) (this_WS_19= RULE_WS )+ ( (lv_dbDriver_20_0= rulePropertyValue ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:541:7: ( (lv_name_18_0= 'database driver' ) ) (this_WS_19= RULE_WS )+ ( (lv_dbDriver_20_0= rulePropertyValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:541:7: ( (lv_name_18_0= 'database driver' ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:542:1: (lv_name_18_0= 'database driver' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:542:1: (lv_name_18_0= 'database driver' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:543:3: lv_name_18_0= 'database driver'
                    {
                    lv_name_18_0=(Token)match(input,43,FOLLOW_43_in_ruleProperty1073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_18_0, grammarAccess.getPropertyAccess().getNameDatabaseDriverKeyword_0_6_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_18_0, "database driver");
                      	    
                    }

                    }


                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:556:2: (this_WS_19= RULE_WS )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_WS) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:556:3: this_WS_19= RULE_WS
                    	    {
                    	    this_WS_19=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleProperty1098); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_19, grammarAccess.getPropertyAccess().getWSTerminalRuleCall_0_6_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:560:3: ( (lv_dbDriver_20_0= rulePropertyValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:561:1: (lv_dbDriver_20_0= rulePropertyValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:561:1: (lv_dbDriver_20_0= rulePropertyValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:562:3: lv_dbDriver_20_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getDbDriverPropertyValueParserRuleCall_0_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty1120);
                    lv_dbDriver_20_0=rulePropertyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"dbDriver",
                              		lv_dbDriver_20_0, 
                              		"PropertyValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            this_SEMICOLON_21=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleProperty1133); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_21, grammarAccess.getPropertyAccess().getSEMICOLONTerminalRuleCall_1()); 
                  
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:590:1: entryRulePropertyValue returns [String current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final String entryRulePropertyValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:591:2: (iv_rulePropertyValue= rulePropertyValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:592:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValueRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValue_in_entryRulePropertyValue1169);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValue1180); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:599:1: rulePropertyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN | this_PERCENT_23= RULE_PERCENT | this_AND_24= RULE_AND | this_OR_25= RULE_OR | this_ESC_CHAR_26= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )* ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:602:28: ( ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN | this_PERCENT_23= RULE_PERCENT | this_AND_24= RULE_AND | this_OR_25= RULE_OR | this_ESC_CHAR_26= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:603:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN | this_PERCENT_23= RULE_PERCENT | this_AND_24= RULE_AND | this_OR_25= RULE_OR | this_ESC_CHAR_26= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:603:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN | this_PERCENT_23= RULE_PERCENT | this_AND_24= RULE_AND | this_OR_25= RULE_OR | this_ESC_CHAR_26= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:603:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN | this_PERCENT_23= RULE_PERCENT | this_AND_24= RULE_AND | this_OR_25= RULE_OR | this_ESC_CHAR_26= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:603:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_COLON_4= RULE_COLON | this_STRING_5= RULE_STRING | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_RBRACE_12= RULE_RBRACE | this_QUESTI_13= RULE_QUESTI | this_NOT_14= RULE_NOT | this_BAND_15= RULE_BAND | this_BOR_16= RULE_BOR | this_HASH_17= RULE_HASH | this_AT_18= RULE_AT | this_CARET_19= RULE_CARET | this_EQUALS_20= RULE_EQUALS | this_LESS_THAN_21= RULE_LESS_THAN | this_MORE_THAN_22= RULE_MORE_THAN | this_PERCENT_23= RULE_PERCENT | this_AND_24= RULE_AND | this_OR_25= RULE_OR | this_ESC_CHAR_26= RULE_ESC_CHAR )
            int alt21=27;
            switch ( input.LA(1) ) {
            case RULE_REST:
                {
                alt21=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt21=2;
                }
                break;
            case RULE_IDENT:
                {
                alt21=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt21=4;
                }
                break;
            case RULE_COLON:
                {
                alt21=5;
                }
                break;
            case RULE_STRING:
                {
                alt21=6;
                }
                break;
            case RULE_COMMA:
                {
                alt21=7;
                }
                break;
            case RULE_MINUS:
                {
                alt21=8;
                }
                break;
            case RULE_PLUS:
                {
                alt21=9;
                }
                break;
            case RULE_LPAREN:
                {
                alt21=10;
                }
                break;
            case RULE_RPAREN:
                {
                alt21=11;
                }
                break;
            case RULE_LBRACE:
                {
                alt21=12;
                }
                break;
            case RULE_RBRACE:
                {
                alt21=13;
                }
                break;
            case RULE_QUESTI:
                {
                alt21=14;
                }
                break;
            case RULE_NOT:
                {
                alt21=15;
                }
                break;
            case RULE_BAND:
                {
                alt21=16;
                }
                break;
            case RULE_BOR:
                {
                alt21=17;
                }
                break;
            case RULE_HASH:
                {
                alt21=18;
                }
                break;
            case RULE_AT:
                {
                alt21=19;
                }
                break;
            case RULE_CARET:
                {
                alt21=20;
                }
                break;
            case RULE_EQUALS:
                {
                alt21=21;
                }
                break;
            case RULE_LESS_THAN:
                {
                alt21=22;
                }
                break;
            case RULE_MORE_THAN:
                {
                alt21=23;
                }
                break;
            case RULE_PERCENT:
                {
                alt21=24;
                }
                break;
            case RULE_AND:
                {
                alt21=25;
                }
                break;
            case RULE_OR:
                {
                alt21=26;
                }
                break;
            case RULE_ESC_CHAR:
                {
                alt21=27;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:603:7: this_REST_0= RULE_REST
                    {
                    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_rulePropertyValue1221); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REST_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REST_0, grammarAccess.getPropertyValueAccess().getRESTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:611:10: this_IDENT_DOT_1= RULE_IDENT_DOT
                    {
                    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_rulePropertyValue1247); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_DOT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_DOT_1, grammarAccess.getPropertyValueAccess().getIDENT_DOTTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:619:10: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePropertyValue1273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_2, grammarAccess.getPropertyValueAccess().getIDENTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:627:10: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rulePropertyValue1299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_3, grammarAccess.getPropertyValueAccess().getNUMBERTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:635:10: this_COLON_4= RULE_COLON
                    {
                    this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulePropertyValue1325); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COLON_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_4, grammarAccess.getPropertyValueAccess().getCOLONTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:643:10: this_STRING_5= RULE_STRING
                    {
                    this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertyValue1351); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_5, grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:651:10: this_COMMA_6= RULE_COMMA
                    {
                    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulePropertyValue1377); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_6, grammarAccess.getPropertyValueAccess().getCOMMATerminalRuleCall_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:659:10: this_MINUS_7= RULE_MINUS
                    {
                    this_MINUS_7=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_rulePropertyValue1403); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_7, grammarAccess.getPropertyValueAccess().getMINUSTerminalRuleCall_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:667:10: this_PLUS_8= RULE_PLUS
                    {
                    this_PLUS_8=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rulePropertyValue1429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_8, grammarAccess.getPropertyValueAccess().getPLUSTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:675:10: this_LPAREN_9= RULE_LPAREN
                    {
                    this_LPAREN_9=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rulePropertyValue1455); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LPAREN_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_9, grammarAccess.getPropertyValueAccess().getLPARENTerminalRuleCall_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:683:10: this_RPAREN_10= RULE_RPAREN
                    {
                    this_RPAREN_10=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rulePropertyValue1481); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RPAREN_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_10, grammarAccess.getPropertyValueAccess().getRPARENTerminalRuleCall_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:691:10: this_LBRACE_11= RULE_LBRACE
                    {
                    this_LBRACE_11=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rulePropertyValue1507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LBRACE_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACE_11, grammarAccess.getPropertyValueAccess().getLBRACETerminalRuleCall_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:699:10: this_RBRACE_12= RULE_RBRACE
                    {
                    this_RBRACE_12=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rulePropertyValue1533); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RBRACE_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RBRACE_12, grammarAccess.getPropertyValueAccess().getRBRACETerminalRuleCall_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:707:10: this_QUESTI_13= RULE_QUESTI
                    {
                    this_QUESTI_13=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_rulePropertyValue1559); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUESTI_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUESTI_13, grammarAccess.getPropertyValueAccess().getQUESTITerminalRuleCall_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:715:10: this_NOT_14= RULE_NOT
                    {
                    this_NOT_14=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_rulePropertyValue1585); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_14, grammarAccess.getPropertyValueAccess().getNOTTerminalRuleCall_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:723:10: this_BAND_15= RULE_BAND
                    {
                    this_BAND_15=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_rulePropertyValue1611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BAND_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BAND_15, grammarAccess.getPropertyValueAccess().getBANDTerminalRuleCall_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:731:10: this_BOR_16= RULE_BOR
                    {
                    this_BOR_16=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_rulePropertyValue1637); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOR_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_16, grammarAccess.getPropertyValueAccess().getBORTerminalRuleCall_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:739:10: this_HASH_17= RULE_HASH
                    {
                    this_HASH_17=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rulePropertyValue1663); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASH_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASH_17, grammarAccess.getPropertyValueAccess().getHASHTerminalRuleCall_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:747:10: this_AT_18= RULE_AT
                    {
                    this_AT_18=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_rulePropertyValue1689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AT_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_18, grammarAccess.getPropertyValueAccess().getATTerminalRuleCall_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:755:10: this_CARET_19= RULE_CARET
                    {
                    this_CARET_19=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_rulePropertyValue1715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CARET_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_19, grammarAccess.getPropertyValueAccess().getCARETTerminalRuleCall_0_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:763:10: this_EQUALS_20= RULE_EQUALS
                    {
                    this_EQUALS_20=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rulePropertyValue1741); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUALS_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_20, grammarAccess.getPropertyValueAccess().getEQUALSTerminalRuleCall_0_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:771:10: this_LESS_THAN_21= RULE_LESS_THAN
                    {
                    this_LESS_THAN_21=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_rulePropertyValue1767); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LESS_THAN_21);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LESS_THAN_21, grammarAccess.getPropertyValueAccess().getLESS_THANTerminalRuleCall_0_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:779:10: this_MORE_THAN_22= RULE_MORE_THAN
                    {
                    this_MORE_THAN_22=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_rulePropertyValue1793); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MORE_THAN_22);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MORE_THAN_22, grammarAccess.getPropertyValueAccess().getMORE_THANTerminalRuleCall_0_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:787:10: this_PERCENT_23= RULE_PERCENT
                    {
                    this_PERCENT_23=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_rulePropertyValue1819); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PERCENT_23);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PERCENT_23, grammarAccess.getPropertyValueAccess().getPERCENTTerminalRuleCall_0_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:795:10: this_AND_24= RULE_AND
                    {
                    this_AND_24=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_rulePropertyValue1845); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AND_24);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AND_24, grammarAccess.getPropertyValueAccess().getANDTerminalRuleCall_0_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:803:10: this_OR_25= RULE_OR
                    {
                    this_OR_25=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_rulePropertyValue1871); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_OR_25);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OR_25, grammarAccess.getPropertyValueAccess().getORTerminalRuleCall_0_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:811:10: this_ESC_CHAR_26= RULE_ESC_CHAR
                    {
                    this_ESC_CHAR_26=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_rulePropertyValue1897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESC_CHAR_26);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESC_CHAR_26, grammarAccess.getPropertyValueAccess().getESC_CHARTerminalRuleCall_0_26()); 
                          
                    }

                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:818:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:818:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:845:23: (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR )
            	    int alt22=28;
            	    switch ( input.LA(1) ) {
            	    case RULE_REST:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case RULE_IDENT_DOT:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case RULE_IDENT:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    case RULE_NUMBER:
            	        {
            	        alt22=4;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt22=5;
            	        }
            	        break;
            	    case RULE_COLON:
            	        {
            	        alt22=6;
            	        }
            	        break;
            	    case RULE_STRING:
            	        {
            	        alt22=7;
            	        }
            	        break;
            	    case RULE_COMMA:
            	        {
            	        alt22=8;
            	        }
            	        break;
            	    case RULE_MINUS:
            	        {
            	        alt22=9;
            	        }
            	        break;
            	    case RULE_PLUS:
            	        {
            	        alt22=10;
            	        }
            	        break;
            	    case RULE_LPAREN:
            	        {
            	        alt22=11;
            	        }
            	        break;
            	    case RULE_RPAREN:
            	        {
            	        alt22=12;
            	        }
            	        break;
            	    case RULE_LBRACE:
            	        {
            	        alt22=13;
            	        }
            	        break;
            	    case RULE_RBRACE:
            	        {
            	        alt22=14;
            	        }
            	        break;
            	    case RULE_QUESTI:
            	        {
            	        alt22=15;
            	        }
            	        break;
            	    case RULE_NOT:
            	        {
            	        alt22=16;
            	        }
            	        break;
            	    case RULE_BAND:
            	        {
            	        alt22=17;
            	        }
            	        break;
            	    case RULE_BOR:
            	        {
            	        alt22=18;
            	        }
            	        break;
            	    case RULE_HASH:
            	        {
            	        alt22=19;
            	        }
            	        break;
            	    case RULE_AT:
            	        {
            	        alt22=20;
            	        }
            	        break;
            	    case RULE_CARET:
            	        {
            	        alt22=21;
            	        }
            	        break;
            	    case RULE_EQUALS:
            	        {
            	        alt22=22;
            	        }
            	        break;
            	    case RULE_LESS_THAN:
            	        {
            	        alt22=23;
            	        }
            	        break;
            	    case RULE_MORE_THAN:
            	        {
            	        alt22=24;
            	        }
            	        break;
            	    case RULE_PERCENT:
            	        {
            	        alt22=25;
            	        }
            	        break;
            	    case RULE_AND:
            	        {
            	        alt22=26;
            	        }
            	        break;
            	    case RULE_OR:
            	        {
            	        alt22=27;
            	        }
            	        break;
            	    case RULE_ESC_CHAR:
            	        {
            	        alt22=28;
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
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:845:28: this_REST_27= RULE_REST
            	            {
            	            this_REST_27=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_rulePropertyValue2115); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REST_27);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REST_27, grammarAccess.getPropertyValueAccess().getRESTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:853:10: this_IDENT_DOT_28= RULE_IDENT_DOT
            	            {
            	            this_IDENT_DOT_28=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_rulePropertyValue2141); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_DOT_28);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_DOT_28, grammarAccess.getPropertyValueAccess().getIDENT_DOTTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:861:10: this_IDENT_29= RULE_IDENT
            	            {
            	            this_IDENT_29=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePropertyValue2167); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_29);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_29, grammarAccess.getPropertyValueAccess().getIDENTTerminalRuleCall_1_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:869:10: this_NUMBER_30= RULE_NUMBER
            	            {
            	            this_NUMBER_30=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rulePropertyValue2193); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NUMBER_30);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NUMBER_30, grammarAccess.getPropertyValueAccess().getNUMBERTerminalRuleCall_1_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:877:10: this_WS_31= RULE_WS
            	            {
            	            this_WS_31=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulePropertyValue2219); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_WS_31);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_WS_31, grammarAccess.getPropertyValueAccess().getWSTerminalRuleCall_1_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:885:10: this_COLON_32= RULE_COLON
            	            {
            	            this_COLON_32=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulePropertyValue2245); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COLON_32);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COLON_32, grammarAccess.getPropertyValueAccess().getCOLONTerminalRuleCall_1_0_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:893:10: this_STRING_33= RULE_STRING
            	            {
            	            this_STRING_33=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertyValue2271); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_STRING_33);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_STRING_33, grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_1_0_6()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:901:10: this_COMMA_34= RULE_COMMA
            	            {
            	            this_COMMA_34=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulePropertyValue2297); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COMMA_34);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COMMA_34, grammarAccess.getPropertyValueAccess().getCOMMATerminalRuleCall_1_0_7()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:909:10: this_MINUS_35= RULE_MINUS
            	            {
            	            this_MINUS_35=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_rulePropertyValue2323); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MINUS_35);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MINUS_35, grammarAccess.getPropertyValueAccess().getMINUSTerminalRuleCall_1_0_8()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:917:10: this_PLUS_36= RULE_PLUS
            	            {
            	            this_PLUS_36=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rulePropertyValue2349); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PLUS_36);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PLUS_36, grammarAccess.getPropertyValueAccess().getPLUSTerminalRuleCall_1_0_9()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:925:10: this_LPAREN_37= RULE_LPAREN
            	            {
            	            this_LPAREN_37=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rulePropertyValue2375); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LPAREN_37);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LPAREN_37, grammarAccess.getPropertyValueAccess().getLPARENTerminalRuleCall_1_0_10()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:933:10: this_RPAREN_38= RULE_RPAREN
            	            {
            	            this_RPAREN_38=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rulePropertyValue2401); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RPAREN_38);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RPAREN_38, grammarAccess.getPropertyValueAccess().getRPARENTerminalRuleCall_1_0_11()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 13 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:941:10: this_LBRACE_39= RULE_LBRACE
            	            {
            	            this_LBRACE_39=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rulePropertyValue2427); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LBRACE_39);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LBRACE_39, grammarAccess.getPropertyValueAccess().getLBRACETerminalRuleCall_1_0_12()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 14 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:949:10: this_RBRACE_40= RULE_RBRACE
            	            {
            	            this_RBRACE_40=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rulePropertyValue2453); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RBRACE_40);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RBRACE_40, grammarAccess.getPropertyValueAccess().getRBRACETerminalRuleCall_1_0_13()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 15 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:957:10: this_QUESTI_41= RULE_QUESTI
            	            {
            	            this_QUESTI_41=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_rulePropertyValue2479); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_QUESTI_41);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_QUESTI_41, grammarAccess.getPropertyValueAccess().getQUESTITerminalRuleCall_1_0_14()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 16 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:965:10: this_NOT_42= RULE_NOT
            	            {
            	            this_NOT_42=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_rulePropertyValue2505); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NOT_42);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NOT_42, grammarAccess.getPropertyValueAccess().getNOTTerminalRuleCall_1_0_15()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 17 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:973:10: this_BAND_43= RULE_BAND
            	            {
            	            this_BAND_43=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_rulePropertyValue2531); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BAND_43);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BAND_43, grammarAccess.getPropertyValueAccess().getBANDTerminalRuleCall_1_0_16()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 18 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:981:10: this_BOR_44= RULE_BOR
            	            {
            	            this_BOR_44=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_rulePropertyValue2557); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BOR_44);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BOR_44, grammarAccess.getPropertyValueAccess().getBORTerminalRuleCall_1_0_17()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 19 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:989:10: this_HASH_45= RULE_HASH
            	            {
            	            this_HASH_45=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rulePropertyValue2583); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_HASH_45);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_HASH_45, grammarAccess.getPropertyValueAccess().getHASHTerminalRuleCall_1_0_18()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 20 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:997:10: this_AT_46= RULE_AT
            	            {
            	            this_AT_46=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_rulePropertyValue2609); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AT_46);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AT_46, grammarAccess.getPropertyValueAccess().getATTerminalRuleCall_1_0_19()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 21 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1005:10: this_CARET_47= RULE_CARET
            	            {
            	            this_CARET_47=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_rulePropertyValue2635); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_CARET_47);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_CARET_47, grammarAccess.getPropertyValueAccess().getCARETTerminalRuleCall_1_0_20()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 22 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1013:10: this_EQUALS_48= RULE_EQUALS
            	            {
            	            this_EQUALS_48=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rulePropertyValue2661); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_EQUALS_48);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_EQUALS_48, grammarAccess.getPropertyValueAccess().getEQUALSTerminalRuleCall_1_0_21()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 23 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1021:10: this_LESS_THAN_49= RULE_LESS_THAN
            	            {
            	            this_LESS_THAN_49=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_rulePropertyValue2687); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LESS_THAN_49);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LESS_THAN_49, grammarAccess.getPropertyValueAccess().getLESS_THANTerminalRuleCall_1_0_22()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 24 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1029:10: this_MORE_THAN_50= RULE_MORE_THAN
            	            {
            	            this_MORE_THAN_50=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_rulePropertyValue2713); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MORE_THAN_50);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MORE_THAN_50, grammarAccess.getPropertyValueAccess().getMORE_THANTerminalRuleCall_1_0_23()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 25 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1037:10: this_PERCENT_51= RULE_PERCENT
            	            {
            	            this_PERCENT_51=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_rulePropertyValue2739); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PERCENT_51);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PERCENT_51, grammarAccess.getPropertyValueAccess().getPERCENTTerminalRuleCall_1_0_24()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 26 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1045:10: this_AND_52= RULE_AND
            	            {
            	            this_AND_52=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_rulePropertyValue2765); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AND_52);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AND_52, grammarAccess.getPropertyValueAccess().getANDTerminalRuleCall_1_0_25()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 27 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1053:10: this_OR_53= RULE_OR
            	            {
            	            this_OR_53=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_rulePropertyValue2791); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_OR_53);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_OR_53, grammarAccess.getPropertyValueAccess().getORTerminalRuleCall_1_0_26()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 28 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1061:10: this_ESC_CHAR_54= RULE_ESC_CHAR
            	            {
            	            this_ESC_CHAR_54=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_rulePropertyValue2817); if (state.failed) return current;
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
            	    break loop23;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1076:1: entryRulePojoDefinition returns [EObject current=null] : iv_rulePojoDefinition= rulePojoDefinition EOF ;
    public final EObject entryRulePojoDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePojoDefinition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1080:2: (iv_rulePojoDefinition= rulePojoDefinition EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1081:2: iv_rulePojoDefinition= rulePojoDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPojoDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePojoDefinition_in_entryRulePojoDefinition2871);
            iv_rulePojoDefinition=rulePojoDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePojoDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePojoDefinition2881); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1091:1: rulePojoDefinition returns [EObject current=null] : (otherlv_0= 'pojo' ( (lv_name_1_0= RULE_IDENT ) ) ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1095:28: ( (otherlv_0= 'pojo' ( (lv_name_1_0= RULE_IDENT ) ) ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1096:1: (otherlv_0= 'pojo' ( (lv_name_1_0= RULE_IDENT ) ) ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1096:1: (otherlv_0= 'pojo' ( (lv_name_1_0= RULE_IDENT ) ) ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1096:3: otherlv_0= 'pojo' ( (lv_name_1_0= RULE_IDENT ) ) ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_rulePojoDefinition2922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPojoDefinitionAccess().getPojoKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1100:1: ( (lv_name_1_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1101:1: (lv_name_1_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1101:1: (lv_name_1_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1102:3: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePojoDefinition2939); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1118:2: ( ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1119:1: ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1119:1: ( (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1120:1: (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1120:1: (lv_class_2_1= RULE_IDENT | lv_class_2_2= RULE_IDENT_DOT )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_IDENT) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_IDENT_DOT) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1121:3: lv_class_2_1= RULE_IDENT
                    {
                    lv_class_2_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulePojoDefinition2963); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1136:8: lv_class_2_2= RULE_IDENT_DOT
                    {
                    lv_class_2_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_rulePojoDefinition2983); if (state.failed) return current;
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

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rulePojoDefinition3002); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1169:1: entryRulePojoUsage returns [EObject current=null] : iv_rulePojoUsage= rulePojoUsage EOF ;
    public final EObject entryRulePojoUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePojoUsage = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1170:2: (iv_rulePojoUsage= rulePojoUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1171:2: iv_rulePojoUsage= rulePojoUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPojoUsageRule()); 
            }
            pushFollow(FOLLOW_rulePojoUsage_in_entryRulePojoUsage3041);
            iv_rulePojoUsage=rulePojoUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePojoUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePojoUsage3051); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1178:1: rulePojoUsage returns [EObject current=null] : (this_ColumnUsage_0= ruleColumnUsage | this_IdentifierUsage_1= ruleIdentifierUsage | this_ConstantUsage_2= ruleConstantUsage | this_MappingUsage_3= ruleMappingUsage ) ;
    public final EObject rulePojoUsage() throws RecognitionException {
        EObject current = null;

        EObject this_ColumnUsage_0 = null;

        EObject this_IdentifierUsage_1 = null;

        EObject this_ConstantUsage_2 = null;

        EObject this_MappingUsage_3 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1181:28: ( (this_ColumnUsage_0= ruleColumnUsage | this_IdentifierUsage_1= ruleIdentifierUsage | this_ConstantUsage_2= ruleConstantUsage | this_MappingUsage_3= ruleMappingUsage ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1182:1: (this_ColumnUsage_0= ruleColumnUsage | this_IdentifierUsage_1= ruleIdentifierUsage | this_ConstantUsage_2= ruleConstantUsage | this_MappingUsage_3= ruleMappingUsage )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1182:1: (this_ColumnUsage_0= ruleColumnUsage | this_IdentifierUsage_1= ruleIdentifierUsage | this_ConstantUsage_2= ruleConstantUsage | this_MappingUsage_3= ruleMappingUsage )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt25=1;
                }
                break;
            case 46:
                {
                alt25=2;
                }
                break;
            case 47:
                {
                alt25=3;
                }
                break;
            case 48:
                {
                alt25=4;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1183:5: this_ColumnUsage_0= ruleColumnUsage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPojoUsageAccess().getColumnUsageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleColumnUsage_in_rulePojoUsage3098);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1193:5: this_IdentifierUsage_1= ruleIdentifierUsage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPojoUsageAccess().getIdentifierUsageParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdentifierUsage_in_rulePojoUsage3125);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1203:5: this_ConstantUsage_2= ruleConstantUsage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPojoUsageAccess().getConstantUsageParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantUsage_in_rulePojoUsage3152);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1213:5: this_MappingUsage_3= ruleMappingUsage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPojoUsageAccess().getMappingUsageParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMappingUsage_in_rulePojoUsage3179);
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1229:1: entryRuleColumnUsage returns [EObject current=null] : iv_ruleColumnUsage= ruleColumnUsage EOF ;
    public final EObject entryRuleColumnUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnUsage = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1233:2: (iv_ruleColumnUsage= ruleColumnUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1234:2: iv_ruleColumnUsage= ruleColumnUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnUsageRule()); 
            }
            pushFollow(FOLLOW_ruleColumnUsage_in_entryRuleColumnUsage3220);
            iv_ruleColumnUsage=ruleColumnUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnUsage3230); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1244:1: ruleColumnUsage returns [EObject current=null] : (otherlv_0= 'col' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleColumnUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1248:28: ( (otherlv_0= 'col' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1249:1: (otherlv_0= 'col' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1249:1: (otherlv_0= 'col' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1249:3: otherlv_0= 'col' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleColumnUsage3271); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getColumnUsageAccess().getColKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1253:1: ( (otherlv_1= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1254:1: (otherlv_1= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1254:1: (otherlv_1= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1255:3: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getColumnUsageRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumnUsage3291); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getColumnUsageAccess().getStatementMetaStatementCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1266:2: ( (otherlv_2= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1267:1: (otherlv_2= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1267:1: (otherlv_2= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1268:3: otherlv_2= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getColumnUsageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumnUsage3311); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getColumnUsageAccess().getPojoPojoDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleColumnUsage3322); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1294:1: entryRuleIdentifierUsage returns [EObject current=null] : iv_ruleIdentifierUsage= ruleIdentifierUsage EOF ;
    public final EObject entryRuleIdentifierUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifierUsage = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1298:2: (iv_ruleIdentifierUsage= ruleIdentifierUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1299:2: iv_ruleIdentifierUsage= ruleIdentifierUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierUsageRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifierUsage_in_entryRuleIdentifierUsage3367);
            iv_ruleIdentifierUsage=ruleIdentifierUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifierUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifierUsage3377); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1309:1: ruleIdentifierUsage returns [EObject current=null] : (otherlv_0= 'ident' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleIdentifierUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1313:28: ( (otherlv_0= 'ident' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1314:1: (otherlv_0= 'ident' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1314:1: (otherlv_0= 'ident' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1314:3: otherlv_0= 'ident' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleIdentifierUsage3418); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIdentifierUsageAccess().getIdentKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1318:1: ( (otherlv_1= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1319:1: (otherlv_1= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1319:1: (otherlv_1= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1320:3: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIdentifierUsageRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifierUsage3438); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getIdentifierUsageAccess().getStatementMetaStatementCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1331:2: ( (otherlv_2= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1332:1: (otherlv_2= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1332:1: (otherlv_2= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1333:3: otherlv_2= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIdentifierUsageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifierUsage3458); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getIdentifierUsageAccess().getPojoPojoDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleIdentifierUsage3469); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1359:1: entryRuleConstantUsage returns [EObject current=null] : iv_ruleConstantUsage= ruleConstantUsage EOF ;
    public final EObject entryRuleConstantUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantUsage = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1363:2: (iv_ruleConstantUsage= ruleConstantUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1364:2: iv_ruleConstantUsage= ruleConstantUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantUsageRule()); 
            }
            pushFollow(FOLLOW_ruleConstantUsage_in_entryRuleConstantUsage3514);
            iv_ruleConstantUsage=ruleConstantUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantUsage3524); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1374:1: ruleConstantUsage returns [EObject current=null] : (otherlv_0= 'const' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleConstantUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1378:28: ( (otherlv_0= 'const' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1379:1: (otherlv_0= 'const' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1379:1: (otherlv_0= 'const' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1379:3: otherlv_0= 'const' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleConstantUsage3565); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantUsageAccess().getConstKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1383:1: ( (otherlv_1= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1384:1: (otherlv_1= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1384:1: (otherlv_1= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1385:3: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantUsageRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstantUsage3585); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getConstantUsageAccess().getStatementMetaStatementCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1396:2: ( (otherlv_2= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1397:1: (otherlv_2= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1397:1: (otherlv_2= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1398:3: otherlv_2= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantUsageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstantUsage3605); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getConstantUsageAccess().getPojoPojoDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleConstantUsage3616); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1424:1: entryRuleMappingUsage returns [EObject current=null] : iv_ruleMappingUsage= ruleMappingUsage EOF ;
    public final EObject entryRuleMappingUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingUsage = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1428:2: (iv_ruleMappingUsage= ruleMappingUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1429:2: iv_ruleMappingUsage= ruleMappingUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingUsageRule()); 
            }
            pushFollow(FOLLOW_ruleMappingUsage_in_entryRuleMappingUsage3661);
            iv_ruleMappingUsage=ruleMappingUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingUsage3671); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1439:1: ruleMappingUsage returns [EObject current=null] : (otherlv_0= 'out' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleMappingUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1443:28: ( (otherlv_0= 'out' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1444:1: (otherlv_0= 'out' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1444:1: (otherlv_0= 'out' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1444:3: otherlv_0= 'out' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleMappingUsage3712); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMappingUsageAccess().getOutKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1448:1: ( (otherlv_1= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1449:1: (otherlv_1= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1449:1: (otherlv_1= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1450:3: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMappingUsageRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingUsage3732); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getMappingUsageAccess().getStatementMappingRuleCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1461:2: ( (otherlv_2= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1462:1: (otherlv_2= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1462:1: (otherlv_2= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1463:3: otherlv_2= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMappingUsageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingUsage3752); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getMappingUsageAccess().getPojoPojoDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleMappingUsage3763); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1489:1: entryRuleTableDefinition returns [EObject current=null] : iv_ruleTableDefinition= ruleTableDefinition EOF ;
    public final EObject entryRuleTableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableDefinition = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1493:2: (iv_ruleTableDefinition= ruleTableDefinition EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1494:2: iv_ruleTableDefinition= ruleTableDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition3808);
            iv_ruleTableDefinition=ruleTableDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableDefinition3818); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1504:1: ruleTableDefinition returns [EObject current=null] : (otherlv_0= 'table' ( (lv_name_1_0= RULE_IDENT ) ) ( (lv_table_2_0= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleTableDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_table_2_0=null;
        Token this_SEMICOLON_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1508:28: ( (otherlv_0= 'table' ( (lv_name_1_0= RULE_IDENT ) ) ( (lv_table_2_0= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1509:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_IDENT ) ) ( (lv_table_2_0= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1509:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_IDENT ) ) ( (lv_table_2_0= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1509:3: otherlv_0= 'table' ( (lv_name_1_0= RULE_IDENT ) ) ( (lv_table_2_0= RULE_IDENT ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleTableDefinition3859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTableDefinitionAccess().getTableKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1513:1: ( (lv_name_1_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1514:1: (lv_name_1_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1514:1: (lv_name_1_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1515:3: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTableDefinition3876); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1531:2: ( (lv_table_2_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1532:1: (lv_table_2_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1532:1: (lv_table_2_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1533:3: lv_table_2_0= RULE_IDENT
            {
            lv_table_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTableDefinition3898); if (state.failed) return current;
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

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleTableDefinition3914); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1564:1: entryRuleTableUsage returns [EObject current=null] : iv_ruleTableUsage= ruleTableUsage EOF ;
    public final EObject entryRuleTableUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableUsage = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS");
        	
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1568:2: (iv_ruleTableUsage= ruleTableUsage EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1569:2: iv_ruleTableUsage= ruleTableUsage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableUsageRule()); 
            }
            pushFollow(FOLLOW_ruleTableUsage_in_entryRuleTableUsage3959);
            iv_ruleTableUsage=ruleTableUsage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableUsage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableUsage3969); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1579:1: ruleTableUsage returns [EObject current=null] : (otherlv_0= 'dbcol' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_IDENT ) ) this_SEMICOLON_5= RULE_SEMICOLON ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1583:28: ( (otherlv_0= 'dbcol' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_IDENT ) ) this_SEMICOLON_5= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1584:1: (otherlv_0= 'dbcol' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_IDENT ) ) this_SEMICOLON_5= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1584:1: (otherlv_0= 'dbcol' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_IDENT ) ) this_SEMICOLON_5= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1584:3: otherlv_0= 'dbcol' ( (otherlv_1= RULE_IDENT ) ) ( (otherlv_2= RULE_IDENT ) ) otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_IDENT ) ) this_SEMICOLON_5= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleTableUsage4010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTableUsageAccess().getDbcolKeyword_0());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1588:1: ( (otherlv_1= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1589:1: (otherlv_1= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1589:1: (otherlv_1= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1590:3: otherlv_1= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTableUsageRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTableUsage4030); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getTableUsageAccess().getStatementMetaStatementCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1601:2: ( (otherlv_2= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1602:1: (otherlv_2= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1602:1: (otherlv_2= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1603:3: otherlv_2= RULE_IDENT
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTableUsageRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTableUsage4050); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getTableUsageAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleTableUsage4062); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTableUsageAccess().getPrefixKeyword_3());
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1618:1: ( (lv_prefix_4_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1619:1: (lv_prefix_4_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1619:1: (lv_prefix_4_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1620:3: lv_prefix_4_0= RULE_IDENT
            {
            lv_prefix_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleTableUsage4079); if (state.failed) return current;
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

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleTableUsage4095); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1651:1: entryRuleMetaStatement returns [EObject current=null] : iv_ruleMetaStatement= ruleMetaStatement EOF ;
    public final EObject entryRuleMetaStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaStatement = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1652:2: (iv_ruleMetaStatement= ruleMetaStatement EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1653:2: iv_ruleMetaStatement= ruleMetaStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaStatementRule()); 
            }
            pushFollow(FOLLOW_ruleMetaStatement_in_entryRuleMetaStatement4134);
            iv_ruleMetaStatement=ruleMetaStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaStatement4144); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1660:1: ruleMetaStatement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1663:28: ( ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1664:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1664:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1664:2: ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1664:2: ( (lv_name_0_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1665:1: (lv_name_0_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1665:1: (lv_name_0_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1666:3: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMetaStatement4186); if (state.failed) return current;
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

            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleMetaStatement4202); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_1, grammarAccess.getMetaStatementAccess().getLPARENTerminalRuleCall_1()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1686:1: ( (lv_type_2_0= ruleSTATEMEN_TYPE ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1687:1: (lv_type_2_0= ruleSTATEMEN_TYPE )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1687:1: (lv_type_2_0= ruleSTATEMEN_TYPE )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1688:3: lv_type_2_0= ruleSTATEMEN_TYPE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMetaStatementAccess().getTypeSTATEMEN_TYPEEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSTATEMEN_TYPE_in_ruleMetaStatement4222);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1704:2: (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_COMMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1704:3: this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleMetaStatement4234); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getMetaStatementAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1708:1: ( (lv_filters_4_0= RULE_IDENT ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1709:1: (lv_filters_4_0= RULE_IDENT )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1709:1: (lv_filters_4_0= RULE_IDENT )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1710:3: lv_filters_4_0= RULE_IDENT
            	    {
            	    lv_filters_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMetaStatement4250); if (state.failed) return current;
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
            	    break loop26;
                }
            } while (true);

            this_RPAREN_5=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleMetaStatement4268); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_5, grammarAccess.getMetaStatementAccess().getRPARENTerminalRuleCall_4()); 
                  
            }
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleMetaStatement4278); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUALS_6, grammarAccess.getMetaStatementAccess().getEQUALSTerminalRuleCall_5()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1734:1: ( (lv_statement_7_0= ruleSql ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1735:1: (lv_statement_7_0= ruleSql )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1735:1: (lv_statement_7_0= ruleSql )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1736:3: lv_statement_7_0= ruleSql
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMetaStatementAccess().getStatementSqlParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSql_in_ruleMetaStatement4298);
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

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleMetaStatement4309); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1764:1: entryRuleSql returns [EObject current=null] : iv_ruleSql= ruleSql EOF ;
    public final EObject entryRuleSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1765:2: (iv_ruleSql= ruleSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1766:2: iv_ruleSql= ruleSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlRule()); 
            }
            pushFollow(FOLLOW_ruleSql_in_entryRuleSql4344);
            iv_ruleSql=ruleSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSql4354); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1773:1: ruleSql returns [EObject current=null] : ( (lv_sqls_0_0= ruleSqlFragment ) )+ ;
    public final EObject ruleSql() throws RecognitionException {
        EObject current = null;

        EObject lv_sqls_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1776:28: ( ( (lv_sqls_0_0= ruleSqlFragment ) )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1777:1: ( (lv_sqls_0_0= ruleSqlFragment ) )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1777:1: ( (lv_sqls_0_0= ruleSqlFragment ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_WS||(LA27_0>=RULE_REST && LA27_0<=RULE_ESC_CHAR)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1778:1: (lv_sqls_0_0= ruleSqlFragment )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1778:1: (lv_sqls_0_0= ruleSqlFragment )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1779:3: lv_sqls_0_0= ruleSqlFragment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSqlAccess().getSqlsSqlFragmentParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSqlFragment_in_ruleSql4399);
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
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1803:1: entryRuleSqlFragment returns [EObject current=null] : iv_ruleSqlFragment= ruleSqlFragment EOF ;
    public final EObject entryRuleSqlFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqlFragment = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1804:2: (iv_ruleSqlFragment= ruleSqlFragment EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1805:2: iv_ruleSqlFragment= ruleSqlFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleSqlFragment_in_entryRuleSqlFragment4435);
            iv_ruleSqlFragment=ruleSqlFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqlFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlFragment4445); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1812:1: ruleSqlFragment returns [EObject current=null] : ( ( (lv_value_0_0= ruleSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) | (this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) ) ) ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1815:28: ( ( ( (lv_value_0_0= ruleSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) | (this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) ) ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1816:1: ( ( (lv_value_0_0= ruleSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) | (this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) ) ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1816:1: ( ( (lv_value_0_0= ruleSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) | (this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) ) ) )
            int alt28=6;
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
                alt28=1;
                }
                break;
            case RULE_AT:
                {
                alt28=2;
                }
                break;
            case RULE_STRING:
                {
                alt28=3;
                }
                break;
            case RULE_COLON:
                {
                alt28=4;
                }
                break;
            case RULE_LBRACE:
                {
                alt28=5;
                }
                break;
            case RULE_PERCENT:
                {
                alt28=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1816:2: ( (lv_value_0_0= ruleSqlValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1816:2: ( (lv_value_0_0= ruleSqlValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1817:1: (lv_value_0_0= ruleSqlValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1817:1: (lv_value_0_0= ruleSqlValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1818:3: lv_value_0_0= ruleSqlValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getValueSqlValueParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlValue_in_ruleSqlFragment4491);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1835:6: (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1835:6: (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1835:7: this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) )
                    {
                    this_AT_1=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleSqlFragment4509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_1, grammarAccess.getSqlFragmentAccess().getATTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1839:1: ( (lv_col_2_0= ruleColumn ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1840:1: (lv_col_2_0= ruleColumn )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1840:1: (lv_col_2_0= ruleColumn )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1841:3: lv_col_2_0= ruleColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getColColumnParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleColumn_in_ruleSqlFragment4529);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1858:6: (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1858:6: (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1858:7: this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) )
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSqlFragment4548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getSqlFragmentAccess().getSTRINGTerminalRuleCall_2_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1862:1: ( (lv_cnst_4_0= ruleConstant ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1863:1: (lv_cnst_4_0= ruleConstant )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1863:1: (lv_cnst_4_0= ruleConstant )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1864:3: lv_cnst_4_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getCnstConstantParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleSqlFragment4568);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1881:6: (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1881:6: (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1881:7: this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) )
                    {
                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleSqlFragment4587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_5, grammarAccess.getSqlFragmentAccess().getCOLONTerminalRuleCall_3_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1885:1: ( (lv_ident_6_0= ruleIdentifier ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1886:1: (lv_ident_6_0= ruleIdentifier )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1886:1: (lv_ident_6_0= ruleIdentifier )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1887:3: lv_ident_6_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getIdentIdentifierParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleSqlFragment4607);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1904:6: (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1904:6: (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1904:7: this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE
                    {
                    this_LBRACE_7=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleSqlFragment4626); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACE_7, grammarAccess.getSqlFragmentAccess().getLBRACETerminalRuleCall_4_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1908:1: ( (lv_meta_8_0= ruleMetaSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1909:1: (lv_meta_8_0= ruleMetaSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1909:1: (lv_meta_8_0= ruleMetaSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1910:3: lv_meta_8_0= ruleMetaSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getMetaMetaSqlParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMetaSql_in_ruleSqlFragment4646);
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

                    this_RBRACE_9=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleSqlFragment4657); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RBRACE_9, grammarAccess.getSqlFragmentAccess().getRBRACETerminalRuleCall_4_2()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1931:6: (this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1931:6: (this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1931:7: this_PERCENT_10= RULE_PERCENT ( (lv_dbcol_11_0= ruleDatabaseColumn ) )
                    {
                    this_PERCENT_10=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleSqlFragment4675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PERCENT_10, grammarAccess.getSqlFragmentAccess().getPERCENTTerminalRuleCall_5_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1935:1: ( (lv_dbcol_11_0= ruleDatabaseColumn ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1936:1: (lv_dbcol_11_0= ruleDatabaseColumn )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1936:1: (lv_dbcol_11_0= ruleDatabaseColumn )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1937:3: lv_dbcol_11_0= ruleDatabaseColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getDbcolDatabaseColumnParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDatabaseColumn_in_ruleSqlFragment4695);
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1961:1: entryRuleSqlValue returns [String current=null] : iv_ruleSqlValue= ruleSqlValue EOF ;
    public final String entryRuleSqlValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSqlValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1962:2: (iv_ruleSqlValue= ruleSqlValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1963:2: iv_ruleSqlValue= ruleSqlValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlValueRule()); 
            }
            pushFollow(FOLLOW_ruleSqlValue_in_entryRuleSqlValue4733);
            iv_ruleSqlValue=ruleSqlValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqlValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlValue4744); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1970:1: ruleSqlValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_AND_20= RULE_AND | this_OR_21= RULE_OR | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )* ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1973:28: ( ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_AND_20= RULE_AND | this_OR_21= RULE_OR | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1974:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_AND_20= RULE_AND | this_OR_21= RULE_OR | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1974:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_AND_20= RULE_AND | this_OR_21= RULE_OR | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1974:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_AND_20= RULE_AND | this_OR_21= RULE_OR | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1974:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_AND_20= RULE_AND | this_OR_21= RULE_OR | this_ESC_CHAR_22= RULE_ESC_CHAR )
            int alt29=23;
            switch ( input.LA(1) ) {
            case RULE_REST:
                {
                alt29=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt29=2;
                }
                break;
            case RULE_IDENT:
                {
                alt29=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt29=4;
                }
                break;
            case RULE_WS:
                {
                alt29=5;
                }
                break;
            case RULE_COMMA:
                {
                alt29=6;
                }
                break;
            case RULE_MINUS:
                {
                alt29=7;
                }
                break;
            case RULE_PLUS:
                {
                alt29=8;
                }
                break;
            case RULE_LPAREN:
                {
                alt29=9;
                }
                break;
            case RULE_RPAREN:
                {
                alt29=10;
                }
                break;
            case RULE_RBRACE:
                {
                alt29=11;
                }
                break;
            case RULE_QUESTI:
                {
                alt29=12;
                }
                break;
            case RULE_NOT:
                {
                alt29=13;
                }
                break;
            case RULE_BAND:
                {
                alt29=14;
                }
                break;
            case RULE_BOR:
                {
                alt29=15;
                }
                break;
            case RULE_HASH:
                {
                alt29=16;
                }
                break;
            case RULE_CARET:
                {
                alt29=17;
                }
                break;
            case RULE_EQUALS:
                {
                alt29=18;
                }
                break;
            case RULE_LESS_THAN:
                {
                alt29=19;
                }
                break;
            case RULE_MORE_THAN:
                {
                alt29=20;
                }
                break;
            case RULE_AND:
                {
                alt29=21;
                }
                break;
            case RULE_OR:
                {
                alt29=22;
                }
                break;
            case RULE_ESC_CHAR:
                {
                alt29=23;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1974:7: this_REST_0= RULE_REST
                    {
                    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleSqlValue4785); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REST_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REST_0, grammarAccess.getSqlValueAccess().getRESTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1982:10: this_IDENT_DOT_1= RULE_IDENT_DOT
                    {
                    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleSqlValue4811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_DOT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_DOT_1, grammarAccess.getSqlValueAccess().getIDENT_DOTTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1990:10: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleSqlValue4837); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_2, grammarAccess.getSqlValueAccess().getIDENTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1998:10: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSqlValue4863); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_3, grammarAccess.getSqlValueAccess().getNUMBERTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2006:10: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSqlValue4889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WS_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_4, grammarAccess.getSqlValueAccess().getWSTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2014:10: this_COMMA_5= RULE_COMMA
                    {
                    this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleSqlValue4915); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_5, grammarAccess.getSqlValueAccess().getCOMMATerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2022:10: this_MINUS_6= RULE_MINUS
                    {
                    this_MINUS_6=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleSqlValue4941); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_6, grammarAccess.getSqlValueAccess().getMINUSTerminalRuleCall_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2030:10: this_PLUS_7= RULE_PLUS
                    {
                    this_PLUS_7=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleSqlValue4967); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_7, grammarAccess.getSqlValueAccess().getPLUSTerminalRuleCall_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2038:10: this_LPAREN_8= RULE_LPAREN
                    {
                    this_LPAREN_8=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleSqlValue4993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LPAREN_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_8, grammarAccess.getSqlValueAccess().getLPARENTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2046:10: this_RPAREN_9= RULE_RPAREN
                    {
                    this_RPAREN_9=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleSqlValue5019); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RPAREN_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_9, grammarAccess.getSqlValueAccess().getRPARENTerminalRuleCall_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2054:10: this_RBRACE_10= RULE_RBRACE
                    {
                    this_RBRACE_10=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleSqlValue5045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RBRACE_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RBRACE_10, grammarAccess.getSqlValueAccess().getRBRACETerminalRuleCall_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2062:10: this_QUESTI_11= RULE_QUESTI
                    {
                    this_QUESTI_11=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleSqlValue5071); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUESTI_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUESTI_11, grammarAccess.getSqlValueAccess().getQUESTITerminalRuleCall_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2070:10: this_NOT_12= RULE_NOT
                    {
                    this_NOT_12=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleSqlValue5097); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_12, grammarAccess.getSqlValueAccess().getNOTTerminalRuleCall_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2078:10: this_BAND_13= RULE_BAND
                    {
                    this_BAND_13=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleSqlValue5123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BAND_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BAND_13, grammarAccess.getSqlValueAccess().getBANDTerminalRuleCall_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2086:10: this_BOR_14= RULE_BOR
                    {
                    this_BOR_14=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleSqlValue5149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOR_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_14, grammarAccess.getSqlValueAccess().getBORTerminalRuleCall_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2094:10: this_HASH_15= RULE_HASH
                    {
                    this_HASH_15=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleSqlValue5175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASH_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASH_15, grammarAccess.getSqlValueAccess().getHASHTerminalRuleCall_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2102:10: this_CARET_16= RULE_CARET
                    {
                    this_CARET_16=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleSqlValue5201); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CARET_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_16, grammarAccess.getSqlValueAccess().getCARETTerminalRuleCall_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2110:10: this_EQUALS_17= RULE_EQUALS
                    {
                    this_EQUALS_17=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleSqlValue5227); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUALS_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_17, grammarAccess.getSqlValueAccess().getEQUALSTerminalRuleCall_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2118:10: this_LESS_THAN_18= RULE_LESS_THAN
                    {
                    this_LESS_THAN_18=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleSqlValue5253); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LESS_THAN_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LESS_THAN_18, grammarAccess.getSqlValueAccess().getLESS_THANTerminalRuleCall_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2126:10: this_MORE_THAN_19= RULE_MORE_THAN
                    {
                    this_MORE_THAN_19=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleSqlValue5279); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MORE_THAN_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MORE_THAN_19, grammarAccess.getSqlValueAccess().getMORE_THANTerminalRuleCall_0_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2134:10: this_AND_20= RULE_AND
                    {
                    this_AND_20=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleSqlValue5305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AND_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AND_20, grammarAccess.getSqlValueAccess().getANDTerminalRuleCall_0_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2142:10: this_OR_21= RULE_OR
                    {
                    this_OR_21=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleSqlValue5331); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_OR_21);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OR_21, grammarAccess.getSqlValueAccess().getORTerminalRuleCall_0_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2150:10: this_ESC_CHAR_22= RULE_ESC_CHAR
                    {
                    this_ESC_CHAR_22=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleSqlValue5357); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESC_CHAR_22);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESC_CHAR_22, grammarAccess.getSqlValueAccess().getESC_CHARTerminalRuleCall_0_22()); 
                          
                    }

                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2157:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2157:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2179:23: (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR )
            	    int alt30=23;
            	    switch ( input.LA(1) ) {
            	    case RULE_REST:
            	        {
            	        alt30=1;
            	        }
            	        break;
            	    case RULE_IDENT_DOT:
            	        {
            	        alt30=2;
            	        }
            	        break;
            	    case RULE_IDENT:
            	        {
            	        alt30=3;
            	        }
            	        break;
            	    case RULE_NUMBER:
            	        {
            	        alt30=4;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt30=5;
            	        }
            	        break;
            	    case RULE_COMMA:
            	        {
            	        alt30=6;
            	        }
            	        break;
            	    case RULE_MINUS:
            	        {
            	        alt30=7;
            	        }
            	        break;
            	    case RULE_PLUS:
            	        {
            	        alt30=8;
            	        }
            	        break;
            	    case RULE_LPAREN:
            	        {
            	        alt30=9;
            	        }
            	        break;
            	    case RULE_RPAREN:
            	        {
            	        alt30=10;
            	        }
            	        break;
            	    case RULE_RBRACE:
            	        {
            	        alt30=11;
            	        }
            	        break;
            	    case RULE_QUESTI:
            	        {
            	        alt30=12;
            	        }
            	        break;
            	    case RULE_NOT:
            	        {
            	        alt30=13;
            	        }
            	        break;
            	    case RULE_BAND:
            	        {
            	        alt30=14;
            	        }
            	        break;
            	    case RULE_BOR:
            	        {
            	        alt30=15;
            	        }
            	        break;
            	    case RULE_HASH:
            	        {
            	        alt30=16;
            	        }
            	        break;
            	    case RULE_CARET:
            	        {
            	        alt30=17;
            	        }
            	        break;
            	    case RULE_EQUALS:
            	        {
            	        alt30=18;
            	        }
            	        break;
            	    case RULE_LESS_THAN:
            	        {
            	        alt30=19;
            	        }
            	        break;
            	    case RULE_MORE_THAN:
            	        {
            	        alt30=20;
            	        }
            	        break;
            	    case RULE_AND:
            	        {
            	        alt30=21;
            	        }
            	        break;
            	    case RULE_OR:
            	        {
            	        alt30=22;
            	        }
            	        break;
            	    case RULE_ESC_CHAR:
            	        {
            	        alt30=23;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt30) {
            	        case 1 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2179:28: this_REST_23= RULE_REST
            	            {
            	            this_REST_23=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleSqlValue5540); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REST_23);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REST_23, grammarAccess.getSqlValueAccess().getRESTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2187:10: this_IDENT_DOT_24= RULE_IDENT_DOT
            	            {
            	            this_IDENT_DOT_24=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleSqlValue5566); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_DOT_24);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_DOT_24, grammarAccess.getSqlValueAccess().getIDENT_DOTTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2195:10: this_IDENT_25= RULE_IDENT
            	            {
            	            this_IDENT_25=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleSqlValue5592); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_25);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_25, grammarAccess.getSqlValueAccess().getIDENTTerminalRuleCall_1_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2203:10: this_NUMBER_26= RULE_NUMBER
            	            {
            	            this_NUMBER_26=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSqlValue5618); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NUMBER_26);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NUMBER_26, grammarAccess.getSqlValueAccess().getNUMBERTerminalRuleCall_1_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2211:10: this_WS_27= RULE_WS
            	            {
            	            this_WS_27=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSqlValue5644); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_WS_27);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_WS_27, grammarAccess.getSqlValueAccess().getWSTerminalRuleCall_1_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2219:10: this_COMMA_28= RULE_COMMA
            	            {
            	            this_COMMA_28=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleSqlValue5670); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COMMA_28);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COMMA_28, grammarAccess.getSqlValueAccess().getCOMMATerminalRuleCall_1_0_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2227:10: this_MINUS_29= RULE_MINUS
            	            {
            	            this_MINUS_29=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleSqlValue5696); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MINUS_29);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MINUS_29, grammarAccess.getSqlValueAccess().getMINUSTerminalRuleCall_1_0_6()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2235:10: this_PLUS_30= RULE_PLUS
            	            {
            	            this_PLUS_30=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleSqlValue5722); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PLUS_30);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PLUS_30, grammarAccess.getSqlValueAccess().getPLUSTerminalRuleCall_1_0_7()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2243:10: this_LPAREN_31= RULE_LPAREN
            	            {
            	            this_LPAREN_31=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleSqlValue5748); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LPAREN_31);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LPAREN_31, grammarAccess.getSqlValueAccess().getLPARENTerminalRuleCall_1_0_8()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2251:10: this_RPAREN_32= RULE_RPAREN
            	            {
            	            this_RPAREN_32=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleSqlValue5774); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RPAREN_32);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RPAREN_32, grammarAccess.getSqlValueAccess().getRPARENTerminalRuleCall_1_0_9()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2259:10: this_RBRACE_33= RULE_RBRACE
            	            {
            	            this_RBRACE_33=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleSqlValue5800); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RBRACE_33);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RBRACE_33, grammarAccess.getSqlValueAccess().getRBRACETerminalRuleCall_1_0_10()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2267:10: this_QUESTI_34= RULE_QUESTI
            	            {
            	            this_QUESTI_34=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleSqlValue5826); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_QUESTI_34);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_QUESTI_34, grammarAccess.getSqlValueAccess().getQUESTITerminalRuleCall_1_0_11()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 13 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2275:10: this_NOT_35= RULE_NOT
            	            {
            	            this_NOT_35=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleSqlValue5852); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NOT_35);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NOT_35, grammarAccess.getSqlValueAccess().getNOTTerminalRuleCall_1_0_12()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 14 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2283:10: this_BAND_36= RULE_BAND
            	            {
            	            this_BAND_36=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleSqlValue5878); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BAND_36);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BAND_36, grammarAccess.getSqlValueAccess().getBANDTerminalRuleCall_1_0_13()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 15 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2291:10: this_BOR_37= RULE_BOR
            	            {
            	            this_BOR_37=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleSqlValue5904); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BOR_37);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BOR_37, grammarAccess.getSqlValueAccess().getBORTerminalRuleCall_1_0_14()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 16 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2299:10: this_HASH_38= RULE_HASH
            	            {
            	            this_HASH_38=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleSqlValue5930); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_HASH_38);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_HASH_38, grammarAccess.getSqlValueAccess().getHASHTerminalRuleCall_1_0_15()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 17 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2307:10: this_CARET_39= RULE_CARET
            	            {
            	            this_CARET_39=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleSqlValue5956); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_CARET_39);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_CARET_39, grammarAccess.getSqlValueAccess().getCARETTerminalRuleCall_1_0_16()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 18 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2315:10: this_EQUALS_40= RULE_EQUALS
            	            {
            	            this_EQUALS_40=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleSqlValue5982); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_EQUALS_40);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_EQUALS_40, grammarAccess.getSqlValueAccess().getEQUALSTerminalRuleCall_1_0_17()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 19 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2323:10: this_LESS_THAN_41= RULE_LESS_THAN
            	            {
            	            this_LESS_THAN_41=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleSqlValue6008); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LESS_THAN_41);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LESS_THAN_41, grammarAccess.getSqlValueAccess().getLESS_THANTerminalRuleCall_1_0_18()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 20 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2331:10: this_MORE_THAN_42= RULE_MORE_THAN
            	            {
            	            this_MORE_THAN_42=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleSqlValue6034); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MORE_THAN_42);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MORE_THAN_42, grammarAccess.getSqlValueAccess().getMORE_THANTerminalRuleCall_1_0_19()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 21 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2339:10: this_AND_43= RULE_AND
            	            {
            	            this_AND_43=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleSqlValue6060); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AND_43);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AND_43, grammarAccess.getSqlValueAccess().getANDTerminalRuleCall_1_0_20()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 22 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2347:10: this_OR_44= RULE_OR
            	            {
            	            this_OR_44=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleSqlValue6086); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_OR_44);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_OR_44, grammarAccess.getSqlValueAccess().getORTerminalRuleCall_1_0_21()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 23 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2355:10: this_ESC_CHAR_45= RULE_ESC_CHAR
            	            {
            	            this_ESC_CHAR_45=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleSqlValue6112); if (state.failed) return current;
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
            	    break loop31;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2370:1: entryRuleMetaSql returns [EObject current=null] : iv_ruleMetaSql= ruleMetaSql EOF ;
    public final EObject entryRuleMetaSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2371:2: (iv_ruleMetaSql= ruleMetaSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2372:2: iv_ruleMetaSql= ruleMetaSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaSqlRule()); 
            }
            pushFollow(FOLLOW_ruleMetaSql_in_entryRuleMetaSql6160);
            iv_ruleMetaSql=ruleMetaSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaSql6170); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2379:1: ruleMetaSql returns [EObject current=null] : ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) | ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) ) | ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) ) ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2382:28: ( ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) | ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) ) | ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2383:1: ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) | ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) ) | ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2383:1: ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) | ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) ) | ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) ) )
            int alt37=6;
            switch ( input.LA(1) ) {
            case RULE_WS:
                {
                alt37=1;
                }
                break;
            case RULE_QUESTI:
                {
                alt37=2;
                }
                break;
            case RULE_BAND:
                {
                alt37=3;
                }
                break;
            case RULE_BOR:
                {
                alt37=4;
                }
                break;
            case RULE_EQUALS:
                {
                alt37=5;
                }
                break;
            case RULE_HASH:
                {
                alt37=6;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2383:2: (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2383:2: (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2383:3: this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )*
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMetaSql6207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_0, grammarAccess.getMetaSqlAccess().getWSTerminalRuleCall_0_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2387:1: ( (lv_ifs_1_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2388:1: (lv_ifs_1_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2388:1: (lv_ifs_1_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2389:3: lv_ifs_1_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6227);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2405:2: (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_BOR) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2405:3: this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_2=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql6239); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_2, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_0_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2409:1: ( (lv_ifs_3_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2410:1: (lv_ifs_3_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2410:1: (lv_ifs_3_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2411:3: lv_ifs_3_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6259);
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
                    	    break loop32;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2428:6: ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2428:6: ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2428:7: ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2428:7: ( (lv_type_4_0= RULE_QUESTI ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2429:1: (lv_type_4_0= RULE_QUESTI )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2429:1: (lv_type_4_0= RULE_QUESTI )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2430:3: lv_type_4_0= RULE_QUESTI
                    {
                    lv_type_4_0=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleMetaSql6286); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2446:2: ( (lv_cond_5_0= ruleIfSqlCond ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2447:1: (lv_cond_5_0= ruleIfSqlCond )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2447:1: (lv_cond_5_0= ruleIfSqlCond )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2448:3: lv_cond_5_0= ruleIfSqlCond
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getCondIfSqlCondParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSqlCond_in_ruleMetaSql6312);
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

                    this_BOR_6=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql6323); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_6, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_1_2()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2468:1: ( (lv_ifs_7_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2469:1: (lv_ifs_7_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2469:1: (lv_ifs_7_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2470:3: lv_ifs_7_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6343);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2486:2: (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_BOR) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2486:3: this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_8=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql6355); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_8, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_1_4_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2490:1: ( (lv_ifs_9_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2491:1: (lv_ifs_9_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2491:1: (lv_ifs_9_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2492:3: lv_ifs_9_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_1_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6375);
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
                    	    break loop33;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2509:6: ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2509:6: ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2509:7: ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2509:7: ( (lv_type_10_0= RULE_BAND ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2510:1: (lv_type_10_0= RULE_BAND )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2510:1: (lv_type_10_0= RULE_BAND )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2511:3: lv_type_10_0= RULE_BAND
                    {
                    lv_type_10_0=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleMetaSql6402); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2527:2: ( (lv_ifs_11_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2528:1: (lv_ifs_11_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2528:1: (lv_ifs_11_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2529:3: lv_ifs_11_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6428);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2545:2: (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_BOR) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2545:3: this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_12=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql6440); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_12, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_2_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2549:1: ( (lv_ifs_13_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2550:1: (lv_ifs_13_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2550:1: (lv_ifs_13_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2551:3: lv_ifs_13_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6460);
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
                    	    break loop34;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2568:6: ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2568:6: ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2568:7: ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2568:7: ( (lv_type_14_0= RULE_BOR ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2569:1: (lv_type_14_0= RULE_BOR )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2569:1: (lv_type_14_0= RULE_BOR )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2570:3: lv_type_14_0= RULE_BOR
                    {
                    lv_type_14_0=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql6487); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2586:2: ( (lv_ifs_15_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2587:1: (lv_ifs_15_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2587:1: (lv_ifs_15_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2588:3: lv_ifs_15_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6513);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2604:2: (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_BOR) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2604:3: this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_16=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql6525); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_16, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_3_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2608:1: ( (lv_ifs_17_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2609:1: (lv_ifs_17_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2609:1: (lv_ifs_17_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2610:3: lv_ifs_17_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6545);
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
                    	    break loop35;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2627:6: ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2627:6: ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2627:7: ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2627:7: ( (lv_type_18_0= RULE_EQUALS ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2628:1: (lv_type_18_0= RULE_EQUALS )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2628:1: (lv_type_18_0= RULE_EQUALS )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2629:3: lv_type_18_0= RULE_EQUALS
                    {
                    lv_type_18_0=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleMetaSql6572); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2645:2: (this_WS_19= RULE_WS )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_WS) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2645:3: this_WS_19= RULE_WS
                    	    {
                    	    this_WS_19=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMetaSql6589); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_19, grammarAccess.getMetaSqlAccess().getWSTerminalRuleCall_4_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2649:3: ( (lv_ftype_20_0= RULE_IDENT ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2650:1: (lv_ftype_20_0= RULE_IDENT )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2650:1: (lv_ftype_20_0= RULE_IDENT )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2651:3: lv_ftype_20_0= RULE_IDENT
                    {
                    lv_ftype_20_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMetaSql6607); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2667:2: ( (lv_ifs_21_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2668:1: (lv_ifs_21_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2668:1: (lv_ifs_21_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2669:3: lv_ifs_21_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_4_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql6633);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2686:6: ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2686:6: ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2686:7: ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2686:7: ( (lv_type_22_0= RULE_HASH ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2687:1: (lv_type_22_0= RULE_HASH )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2687:1: (lv_type_22_0= RULE_HASH )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2688:3: lv_type_22_0= RULE_HASH
                    {
                    lv_type_22_0=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleMetaSql6658); if (state.failed) return current;
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

                    this_NUMBER_23=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMetaSql6674); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_23, grammarAccess.getMetaSqlAccess().getNUMBERTerminalRuleCall_5_1()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2708:1: ( (lv_ord_24_0= ruleOrdSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2709:1: (lv_ord_24_0= ruleOrdSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2709:1: (lv_ord_24_0= ruleOrdSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2710:3: lv_ord_24_0= ruleOrdSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getOrdOrdSqlParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrdSql_in_ruleMetaSql6694);
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2734:1: entryRuleIfSql returns [EObject current=null] : iv_ruleIfSql= ruleIfSql EOF ;
    public final EObject entryRuleIfSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2735:2: (iv_ruleIfSql= ruleIfSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2736:2: iv_ruleIfSql= ruleIfSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlRule()); 
            }
            pushFollow(FOLLOW_ruleIfSql_in_entryRuleIfSql6731);
            iv_ruleIfSql=ruleIfSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSql6741); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2743:1: ruleIfSql returns [EObject current=null] : ( (lv_sqls_0_0= ruleIfSqlFragment ) )+ ;
    public final EObject ruleIfSql() throws RecognitionException {
        EObject current = null;

        EObject lv_sqls_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2746:28: ( ( (lv_sqls_0_0= ruleIfSqlFragment ) )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2747:1: ( (lv_sqls_0_0= ruleIfSqlFragment ) )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2747:1: ( (lv_sqls_0_0= ruleIfSqlFragment ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_WS && LA38_0<=RULE_LBRACE)||(LA38_0>=RULE_QUESTI && LA38_0<=RULE_BAND)||(LA38_0>=RULE_HASH && LA38_0<=RULE_ESC_CHAR)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2748:1: (lv_sqls_0_0= ruleIfSqlFragment )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2748:1: (lv_sqls_0_0= ruleIfSqlFragment )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2749:3: lv_sqls_0_0= ruleIfSqlFragment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfSqlAccess().getSqlsIfSqlFragmentParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIfSqlFragment_in_ruleIfSql6786);
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
            	    if ( cnt38 >= 1 ) break loop38;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2773:1: entryRuleIfSqlFragment returns [EObject current=null] : iv_ruleIfSqlFragment= ruleIfSqlFragment EOF ;
    public final EObject entryRuleIfSqlFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSqlFragment = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2774:2: (iv_ruleIfSqlFragment= ruleIfSqlFragment EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2775:2: iv_ruleIfSqlFragment= ruleIfSqlFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleIfSqlFragment_in_entryRuleIfSqlFragment6822);
            iv_ruleIfSqlFragment=ruleIfSqlFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSqlFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSqlFragment6832); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2782:1: ruleIfSqlFragment returns [EObject current=null] : ( ( (lv_value_0_0= ruleIfSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) ) ) | (this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE ) ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2785:28: ( ( ( (lv_value_0_0= ruleIfSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) ) ) | (this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2786:1: ( ( (lv_value_0_0= ruleIfSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) ) ) | (this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2786:1: ( ( (lv_value_0_0= ruleIfSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) ) ) | (this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE ) )
            int alt39=6;
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
                alt39=1;
                }
                break;
            case RULE_AT:
                {
                alt39=2;
                }
                break;
            case RULE_STRING:
                {
                alt39=3;
                }
                break;
            case RULE_COLON:
                {
                alt39=4;
                }
                break;
            case RULE_PERCENT:
                {
                alt39=5;
                }
                break;
            case RULE_LBRACE:
                {
                alt39=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2786:2: ( (lv_value_0_0= ruleIfSqlValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2786:2: ( (lv_value_0_0= ruleIfSqlValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2787:1: (lv_value_0_0= ruleIfSqlValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2787:1: (lv_value_0_0= ruleIfSqlValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2788:3: lv_value_0_0= ruleIfSqlValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getValueIfSqlValueParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSqlValue_in_ruleIfSqlFragment6878);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2805:6: (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2805:6: (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2805:7: this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) )
                    {
                    this_AT_1=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleIfSqlFragment6896); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_1, grammarAccess.getIfSqlFragmentAccess().getATTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2809:1: ( (lv_col_2_0= ruleColumn ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2810:1: (lv_col_2_0= ruleColumn )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2810:1: (lv_col_2_0= ruleColumn )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2811:3: lv_col_2_0= ruleColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getColColumnParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleColumn_in_ruleIfSqlFragment6916);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2828:6: (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2828:6: (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2828:7: this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) )
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIfSqlFragment6935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getIfSqlFragmentAccess().getSTRINGTerminalRuleCall_2_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2832:1: ( (lv_cnst_4_0= ruleConstant ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2833:1: (lv_cnst_4_0= ruleConstant )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2833:1: (lv_cnst_4_0= ruleConstant )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2834:3: lv_cnst_4_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getCnstConstantParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleIfSqlFragment6955);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2851:6: (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2851:6: (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2851:7: this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) )
                    {
                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleIfSqlFragment6974); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_5, grammarAccess.getIfSqlFragmentAccess().getCOLONTerminalRuleCall_3_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2855:1: ( (lv_ident_6_0= ruleIdentifier ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2856:1: (lv_ident_6_0= ruleIdentifier )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2856:1: (lv_ident_6_0= ruleIdentifier )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2857:3: lv_ident_6_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getIdentIdentifierParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleIfSqlFragment6994);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2874:6: (this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2874:6: (this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2874:7: this_PERCENT_7= RULE_PERCENT ( (lv_dbcol_8_0= ruleDatabaseColumn ) )
                    {
                    this_PERCENT_7=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleIfSqlFragment7013); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PERCENT_7, grammarAccess.getIfSqlFragmentAccess().getPERCENTTerminalRuleCall_4_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2878:1: ( (lv_dbcol_8_0= ruleDatabaseColumn ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2879:1: (lv_dbcol_8_0= ruleDatabaseColumn )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2879:1: (lv_dbcol_8_0= ruleDatabaseColumn )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2880:3: lv_dbcol_8_0= ruleDatabaseColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getDbcolDatabaseColumnParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDatabaseColumn_in_ruleIfSqlFragment7033);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2897:6: (this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2897:6: (this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2897:7: this_LBRACE_9= RULE_LBRACE ( (lv_meta_10_0= ruleIfMetaSql ) ) this_RBRACE_11= RULE_RBRACE
                    {
                    this_LBRACE_9=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleIfSqlFragment7052); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACE_9, grammarAccess.getIfSqlFragmentAccess().getLBRACETerminalRuleCall_5_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2901:1: ( (lv_meta_10_0= ruleIfMetaSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2902:1: (lv_meta_10_0= ruleIfMetaSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2902:1: (lv_meta_10_0= ruleIfMetaSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2903:3: lv_meta_10_0= ruleIfMetaSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getMetaIfMetaSqlParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfMetaSql_in_ruleIfSqlFragment7072);
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

                    this_RBRACE_11=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleIfSqlFragment7083); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2931:1: entryRuleIfSqlValue returns [String current=null] : iv_ruleIfSqlValue= ruleIfSqlValue EOF ;
    public final String entryRuleIfSqlValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIfSqlValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2932:2: (iv_ruleIfSqlValue= ruleIfSqlValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2933:2: iv_ruleIfSqlValue= ruleIfSqlValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlValueRule()); 
            }
            pushFollow(FOLLOW_ruleIfSqlValue_in_entryRuleIfSqlValue7120);
            iv_ruleIfSqlValue=ruleIfSqlValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSqlValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSqlValue7131); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2940:1: ruleIfSqlValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_AND_19= RULE_AND | this_OR_20= RULE_OR | this_ESC_CHAR_21= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )* ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2943:28: ( ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_AND_19= RULE_AND | this_OR_20= RULE_OR | this_ESC_CHAR_21= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2944:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_AND_19= RULE_AND | this_OR_20= RULE_OR | this_ESC_CHAR_21= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2944:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_AND_19= RULE_AND | this_OR_20= RULE_OR | this_ESC_CHAR_21= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2944:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_AND_19= RULE_AND | this_OR_20= RULE_OR | this_ESC_CHAR_21= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2944:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_AND_19= RULE_AND | this_OR_20= RULE_OR | this_ESC_CHAR_21= RULE_ESC_CHAR )
            int alt40=22;
            switch ( input.LA(1) ) {
            case RULE_REST:
                {
                alt40=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt40=2;
                }
                break;
            case RULE_IDENT:
                {
                alt40=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt40=4;
                }
                break;
            case RULE_WS:
                {
                alt40=5;
                }
                break;
            case RULE_SEMICOLON:
                {
                alt40=6;
                }
                break;
            case RULE_COMMA:
                {
                alt40=7;
                }
                break;
            case RULE_MINUS:
                {
                alt40=8;
                }
                break;
            case RULE_PLUS:
                {
                alt40=9;
                }
                break;
            case RULE_LPAREN:
                {
                alt40=10;
                }
                break;
            case RULE_RPAREN:
                {
                alt40=11;
                }
                break;
            case RULE_QUESTI:
                {
                alt40=12;
                }
                break;
            case RULE_NOT:
                {
                alt40=13;
                }
                break;
            case RULE_BAND:
                {
                alt40=14;
                }
                break;
            case RULE_HASH:
                {
                alt40=15;
                }
                break;
            case RULE_CARET:
                {
                alt40=16;
                }
                break;
            case RULE_EQUALS:
                {
                alt40=17;
                }
                break;
            case RULE_LESS_THAN:
                {
                alt40=18;
                }
                break;
            case RULE_MORE_THAN:
                {
                alt40=19;
                }
                break;
            case RULE_AND:
                {
                alt40=20;
                }
                break;
            case RULE_OR:
                {
                alt40=21;
                }
                break;
            case RULE_ESC_CHAR:
                {
                alt40=22;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2944:7: this_REST_0= RULE_REST
                    {
                    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleIfSqlValue7172); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REST_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REST_0, grammarAccess.getIfSqlValueAccess().getRESTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2952:10: this_IDENT_DOT_1= RULE_IDENT_DOT
                    {
                    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleIfSqlValue7198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_DOT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_DOT_1, grammarAccess.getIfSqlValueAccess().getIDENT_DOTTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2960:10: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIfSqlValue7224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_2, grammarAccess.getIfSqlValueAccess().getIDENTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2968:10: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIfSqlValue7250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_3, grammarAccess.getIfSqlValueAccess().getNUMBERTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2976:10: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlValue7276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WS_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_4, grammarAccess.getIfSqlValueAccess().getWSTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2984:10: this_SEMICOLON_5= RULE_SEMICOLON
                    {
                    this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleIfSqlValue7302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SEMICOLON_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_5, grammarAccess.getIfSqlValueAccess().getSEMICOLONTerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2992:10: this_COMMA_6= RULE_COMMA
                    {
                    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleIfSqlValue7328); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_6, grammarAccess.getIfSqlValueAccess().getCOMMATerminalRuleCall_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3000:10: this_MINUS_7= RULE_MINUS
                    {
                    this_MINUS_7=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleIfSqlValue7354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_7, grammarAccess.getIfSqlValueAccess().getMINUSTerminalRuleCall_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3008:10: this_PLUS_8= RULE_PLUS
                    {
                    this_PLUS_8=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleIfSqlValue7380); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_8, grammarAccess.getIfSqlValueAccess().getPLUSTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3016:10: this_LPAREN_9= RULE_LPAREN
                    {
                    this_LPAREN_9=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleIfSqlValue7406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LPAREN_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_9, grammarAccess.getIfSqlValueAccess().getLPARENTerminalRuleCall_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3024:10: this_RPAREN_10= RULE_RPAREN
                    {
                    this_RPAREN_10=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleIfSqlValue7432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RPAREN_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_10, grammarAccess.getIfSqlValueAccess().getRPARENTerminalRuleCall_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3032:10: this_QUESTI_11= RULE_QUESTI
                    {
                    this_QUESTI_11=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleIfSqlValue7458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUESTI_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUESTI_11, grammarAccess.getIfSqlValueAccess().getQUESTITerminalRuleCall_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3040:10: this_NOT_12= RULE_NOT
                    {
                    this_NOT_12=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlValue7484); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_12, grammarAccess.getIfSqlValueAccess().getNOTTerminalRuleCall_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3048:10: this_BAND_13= RULE_BAND
                    {
                    this_BAND_13=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleIfSqlValue7510); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BAND_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BAND_13, grammarAccess.getIfSqlValueAccess().getBANDTerminalRuleCall_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3056:10: this_HASH_14= RULE_HASH
                    {
                    this_HASH_14=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleIfSqlValue7536); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASH_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASH_14, grammarAccess.getIfSqlValueAccess().getHASHTerminalRuleCall_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3064:10: this_CARET_15= RULE_CARET
                    {
                    this_CARET_15=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleIfSqlValue7562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CARET_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_15, grammarAccess.getIfSqlValueAccess().getCARETTerminalRuleCall_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3072:10: this_EQUALS_16= RULE_EQUALS
                    {
                    this_EQUALS_16=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleIfSqlValue7588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUALS_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_16, grammarAccess.getIfSqlValueAccess().getEQUALSTerminalRuleCall_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3080:10: this_LESS_THAN_17= RULE_LESS_THAN
                    {
                    this_LESS_THAN_17=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleIfSqlValue7614); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LESS_THAN_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LESS_THAN_17, grammarAccess.getIfSqlValueAccess().getLESS_THANTerminalRuleCall_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3088:10: this_MORE_THAN_18= RULE_MORE_THAN
                    {
                    this_MORE_THAN_18=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleIfSqlValue7640); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MORE_THAN_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MORE_THAN_18, grammarAccess.getIfSqlValueAccess().getMORE_THANTerminalRuleCall_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3096:10: this_AND_19= RULE_AND
                    {
                    this_AND_19=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleIfSqlValue7666); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AND_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AND_19, grammarAccess.getIfSqlValueAccess().getANDTerminalRuleCall_0_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3104:10: this_OR_20= RULE_OR
                    {
                    this_OR_20=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleIfSqlValue7692); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_OR_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OR_20, grammarAccess.getIfSqlValueAccess().getORTerminalRuleCall_0_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3112:10: this_ESC_CHAR_21= RULE_ESC_CHAR
                    {
                    this_ESC_CHAR_21=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleIfSqlValue7718); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESC_CHAR_21);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESC_CHAR_21, grammarAccess.getIfSqlValueAccess().getESC_CHARTerminalRuleCall_0_21()); 
                          
                    }

                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3119:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )*
            loop42:
            do {
                int alt42=2;
                alt42 = dfa42.predict(input);
                switch (alt42) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3119:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3140:23: (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR )
            	    int alt41=22;
            	    switch ( input.LA(1) ) {
            	    case RULE_REST:
            	        {
            	        alt41=1;
            	        }
            	        break;
            	    case RULE_IDENT_DOT:
            	        {
            	        alt41=2;
            	        }
            	        break;
            	    case RULE_IDENT:
            	        {
            	        alt41=3;
            	        }
            	        break;
            	    case RULE_NUMBER:
            	        {
            	        alt41=4;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt41=5;
            	        }
            	        break;
            	    case RULE_SEMICOLON:
            	        {
            	        alt41=6;
            	        }
            	        break;
            	    case RULE_COMMA:
            	        {
            	        alt41=7;
            	        }
            	        break;
            	    case RULE_MINUS:
            	        {
            	        alt41=8;
            	        }
            	        break;
            	    case RULE_PLUS:
            	        {
            	        alt41=9;
            	        }
            	        break;
            	    case RULE_LPAREN:
            	        {
            	        alt41=10;
            	        }
            	        break;
            	    case RULE_RPAREN:
            	        {
            	        alt41=11;
            	        }
            	        break;
            	    case RULE_QUESTI:
            	        {
            	        alt41=12;
            	        }
            	        break;
            	    case RULE_NOT:
            	        {
            	        alt41=13;
            	        }
            	        break;
            	    case RULE_BAND:
            	        {
            	        alt41=14;
            	        }
            	        break;
            	    case RULE_HASH:
            	        {
            	        alt41=15;
            	        }
            	        break;
            	    case RULE_CARET:
            	        {
            	        alt41=16;
            	        }
            	        break;
            	    case RULE_EQUALS:
            	        {
            	        alt41=17;
            	        }
            	        break;
            	    case RULE_LESS_THAN:
            	        {
            	        alt41=18;
            	        }
            	        break;
            	    case RULE_MORE_THAN:
            	        {
            	        alt41=19;
            	        }
            	        break;
            	    case RULE_AND:
            	        {
            	        alt41=20;
            	        }
            	        break;
            	    case RULE_OR:
            	        {
            	        alt41=21;
            	        }
            	        break;
            	    case RULE_ESC_CHAR:
            	        {
            	        alt41=22;
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
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3140:28: this_REST_22= RULE_REST
            	            {
            	            this_REST_22=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleIfSqlValue7894); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REST_22);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REST_22, grammarAccess.getIfSqlValueAccess().getRESTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3148:10: this_IDENT_DOT_23= RULE_IDENT_DOT
            	            {
            	            this_IDENT_DOT_23=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleIfSqlValue7920); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_DOT_23);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_DOT_23, grammarAccess.getIfSqlValueAccess().getIDENT_DOTTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3156:10: this_IDENT_24= RULE_IDENT
            	            {
            	            this_IDENT_24=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIfSqlValue7946); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_24);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_24, grammarAccess.getIfSqlValueAccess().getIDENTTerminalRuleCall_1_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3164:10: this_NUMBER_25= RULE_NUMBER
            	            {
            	            this_NUMBER_25=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIfSqlValue7972); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NUMBER_25);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NUMBER_25, grammarAccess.getIfSqlValueAccess().getNUMBERTerminalRuleCall_1_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3172:10: this_WS_26= RULE_WS
            	            {
            	            this_WS_26=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlValue7998); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_WS_26);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_WS_26, grammarAccess.getIfSqlValueAccess().getWSTerminalRuleCall_1_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3180:10: this_SEMICOLON_27= RULE_SEMICOLON
            	            {
            	            this_SEMICOLON_27=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleIfSqlValue8024); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_SEMICOLON_27);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_SEMICOLON_27, grammarAccess.getIfSqlValueAccess().getSEMICOLONTerminalRuleCall_1_0_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3188:10: this_COMMA_28= RULE_COMMA
            	            {
            	            this_COMMA_28=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleIfSqlValue8050); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COMMA_28);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COMMA_28, grammarAccess.getIfSqlValueAccess().getCOMMATerminalRuleCall_1_0_6()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3196:10: this_MINUS_29= RULE_MINUS
            	            {
            	            this_MINUS_29=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleIfSqlValue8076); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MINUS_29);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MINUS_29, grammarAccess.getIfSqlValueAccess().getMINUSTerminalRuleCall_1_0_7()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3204:10: this_PLUS_30= RULE_PLUS
            	            {
            	            this_PLUS_30=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleIfSqlValue8102); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PLUS_30);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PLUS_30, grammarAccess.getIfSqlValueAccess().getPLUSTerminalRuleCall_1_0_8()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3212:10: this_LPAREN_31= RULE_LPAREN
            	            {
            	            this_LPAREN_31=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleIfSqlValue8128); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LPAREN_31);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LPAREN_31, grammarAccess.getIfSqlValueAccess().getLPARENTerminalRuleCall_1_0_9()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3220:10: this_RPAREN_32= RULE_RPAREN
            	            {
            	            this_RPAREN_32=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleIfSqlValue8154); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RPAREN_32);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RPAREN_32, grammarAccess.getIfSqlValueAccess().getRPARENTerminalRuleCall_1_0_10()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3228:10: this_QUESTI_33= RULE_QUESTI
            	            {
            	            this_QUESTI_33=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleIfSqlValue8180); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_QUESTI_33);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_QUESTI_33, grammarAccess.getIfSqlValueAccess().getQUESTITerminalRuleCall_1_0_11()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 13 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3236:10: this_NOT_34= RULE_NOT
            	            {
            	            this_NOT_34=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlValue8206); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NOT_34);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NOT_34, grammarAccess.getIfSqlValueAccess().getNOTTerminalRuleCall_1_0_12()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 14 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3244:10: this_BAND_35= RULE_BAND
            	            {
            	            this_BAND_35=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleIfSqlValue8232); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BAND_35);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BAND_35, grammarAccess.getIfSqlValueAccess().getBANDTerminalRuleCall_1_0_13()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 15 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3252:10: this_HASH_36= RULE_HASH
            	            {
            	            this_HASH_36=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleIfSqlValue8258); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_HASH_36);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_HASH_36, grammarAccess.getIfSqlValueAccess().getHASHTerminalRuleCall_1_0_14()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 16 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3260:10: this_CARET_37= RULE_CARET
            	            {
            	            this_CARET_37=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleIfSqlValue8284); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_CARET_37);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_CARET_37, grammarAccess.getIfSqlValueAccess().getCARETTerminalRuleCall_1_0_15()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 17 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3268:10: this_EQUALS_38= RULE_EQUALS
            	            {
            	            this_EQUALS_38=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleIfSqlValue8310); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_EQUALS_38);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_EQUALS_38, grammarAccess.getIfSqlValueAccess().getEQUALSTerminalRuleCall_1_0_16()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 18 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3276:10: this_LESS_THAN_39= RULE_LESS_THAN
            	            {
            	            this_LESS_THAN_39=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleIfSqlValue8336); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LESS_THAN_39);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LESS_THAN_39, grammarAccess.getIfSqlValueAccess().getLESS_THANTerminalRuleCall_1_0_17()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 19 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3284:10: this_MORE_THAN_40= RULE_MORE_THAN
            	            {
            	            this_MORE_THAN_40=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleIfSqlValue8362); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MORE_THAN_40);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MORE_THAN_40, grammarAccess.getIfSqlValueAccess().getMORE_THANTerminalRuleCall_1_0_18()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 20 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3292:10: this_AND_41= RULE_AND
            	            {
            	            this_AND_41=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleIfSqlValue8388); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AND_41);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AND_41, grammarAccess.getIfSqlValueAccess().getANDTerminalRuleCall_1_0_19()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 21 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3300:10: this_OR_42= RULE_OR
            	            {
            	            this_OR_42=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleIfSqlValue8414); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_OR_42);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_OR_42, grammarAccess.getIfSqlValueAccess().getORTerminalRuleCall_1_0_20()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 22 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3308:10: this_ESC_CHAR_43= RULE_ESC_CHAR
            	            {
            	            this_ESC_CHAR_43=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleIfSqlValue8440); if (state.failed) return current;
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
            	    break loop42;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3323:1: entryRuleIfMetaSql returns [EObject current=null] : iv_ruleIfMetaSql= ruleIfMetaSql EOF ;
    public final EObject entryRuleIfMetaSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfMetaSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3324:2: (iv_ruleIfMetaSql= ruleIfMetaSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3325:2: iv_ruleIfMetaSql= ruleIfMetaSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfMetaSqlRule()); 
            }
            pushFollow(FOLLOW_ruleIfMetaSql_in_entryRuleIfMetaSql8488);
            iv_ruleIfMetaSql=ruleIfMetaSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfMetaSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfMetaSql8498); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3332:1: ruleIfMetaSql returns [EObject current=null] : ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3335:28: ( ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3336:1: ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3336:1: ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) )
            int alt47=4;
            switch ( input.LA(1) ) {
            case RULE_WS:
                {
                alt47=1;
                }
                break;
            case RULE_QUESTI:
                {
                alt47=2;
                }
                break;
            case RULE_BAND:
                {
                alt47=3;
                }
                break;
            case RULE_BOR:
                {
                alt47=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3336:2: (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3336:2: (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3336:3: this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )*
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfMetaSql8535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_0, grammarAccess.getIfMetaSqlAccess().getWSTerminalRuleCall_0_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3340:1: ( (lv_ifs_1_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3341:1: (lv_ifs_1_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3341:1: (lv_ifs_1_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3342:3: lv_ifs_1_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8555);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3358:2: (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==RULE_BOR) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3358:3: this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_2=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql8567); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_2, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_0_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3362:1: ( (lv_ifs_3_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3363:1: (lv_ifs_3_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3363:1: (lv_ifs_3_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3364:3: lv_ifs_3_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8587);
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
                    	    break loop43;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3381:6: ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3381:6: ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3381:7: ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3381:7: ( (lv_type_4_0= RULE_QUESTI ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3382:1: (lv_type_4_0= RULE_QUESTI )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3382:1: (lv_type_4_0= RULE_QUESTI )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3383:3: lv_type_4_0= RULE_QUESTI
                    {
                    lv_type_4_0=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleIfMetaSql8614); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3399:2: ( (lv_cond_5_0= ruleIfSqlCond ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3400:1: (lv_cond_5_0= ruleIfSqlCond )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3400:1: (lv_cond_5_0= ruleIfSqlCond )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3401:3: lv_cond_5_0= ruleIfSqlCond
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getCondIfSqlCondParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSqlCond_in_ruleIfMetaSql8640);
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

                    this_BOR_6=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql8651); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_6, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_1_2()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3421:1: ( (lv_ifs_7_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3422:1: (lv_ifs_7_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3422:1: (lv_ifs_7_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3423:3: lv_ifs_7_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8671);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3439:2: (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==RULE_BOR) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3439:3: this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_8=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql8683); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_8, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_1_4_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3443:1: ( (lv_ifs_9_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3444:1: (lv_ifs_9_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3444:1: (lv_ifs_9_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3445:3: lv_ifs_9_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_1_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8703);
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
                    	    break loop44;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3462:6: ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3462:6: ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3462:7: ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3462:7: ( (lv_type_10_0= RULE_BAND ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3463:1: (lv_type_10_0= RULE_BAND )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3463:1: (lv_type_10_0= RULE_BAND )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3464:3: lv_type_10_0= RULE_BAND
                    {
                    lv_type_10_0=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleIfMetaSql8730); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3480:2: ( (lv_ifs_11_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3481:1: (lv_ifs_11_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3481:1: (lv_ifs_11_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3482:3: lv_ifs_11_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8756);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3498:2: (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==RULE_BOR) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3498:3: this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_12=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql8768); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_12, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_2_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3502:1: ( (lv_ifs_13_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3503:1: (lv_ifs_13_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3503:1: (lv_ifs_13_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3504:3: lv_ifs_13_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8788);
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
                    	    break loop45;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3521:6: ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3521:6: ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3521:7: ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3521:7: ( (lv_type_14_0= RULE_BOR ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3522:1: (lv_type_14_0= RULE_BOR )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3522:1: (lv_type_14_0= RULE_BOR )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3523:3: lv_type_14_0= RULE_BOR
                    {
                    lv_type_14_0=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql8815); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3539:2: ( (lv_ifs_15_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3540:1: (lv_ifs_15_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3540:1: (lv_ifs_15_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3541:3: lv_ifs_15_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8841);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3557:2: (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==RULE_BOR) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3557:3: this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_16=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql8853); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_16, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_3_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3561:1: ( (lv_ifs_17_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3562:1: (lv_ifs_17_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3562:1: (lv_ifs_17_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3563:3: lv_ifs_17_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql8873);
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
                    	    break loop46;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3587:1: entryRuleIfSqlCond returns [EObject current=null] : iv_ruleIfSqlCond= ruleIfSqlCond EOF ;
    public final EObject entryRuleIfSqlCond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSqlCond = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3588:2: (iv_ruleIfSqlCond= ruleIfSqlCond EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3589:2: iv_ruleIfSqlCond= ruleIfSqlCond EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlCondRule()); 
            }
            pushFollow(FOLLOW_ruleIfSqlCond_in_entryRuleIfSqlCond8912);
            iv_ruleIfSqlCond=ruleIfSqlCond();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSqlCond; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSqlCond8922); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3596:1: ruleIfSqlCond returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )* ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3599:28: ( ( (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3600:1: ( (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3600:1: ( (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3600:2: (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3600:2: (this_WS_0= RULE_WS )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_WS) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3600:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlCond8959); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_0, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3604:3: ( (lv_bool1_1_0= ruleIfSqlBool ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3605:1: (lv_bool1_1_0= ruleIfSqlBool )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3605:1: (lv_bool1_1_0= ruleIfSqlBool )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3606:3: lv_bool1_1_0= ruleIfSqlBool
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfSqlCondAccess().getBool1IfSqlBoolParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIfSqlBool_in_ruleIfSqlCond8981);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3622:2: (this_WS_2= RULE_WS )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_WS) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3622:3: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlCond8993); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_2, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3626:3: ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=RULE_AND && LA53_0<=RULE_OR)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3626:4: ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )*
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3626:4: ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3627:1: ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3627:1: ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3628:1: (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3628:1: (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR )
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==RULE_AND) ) {
            	        alt50=1;
            	    }
            	    else if ( (LA50_0==RULE_OR) ) {
            	        alt50=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 50, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3629:3: lv_oper_3_1= RULE_AND
            	            {
            	            lv_oper_3_1=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleIfSqlCond9014); if (state.failed) return current;
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
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3644:8: lv_oper_3_2= RULE_OR
            	            {
            	            lv_oper_3_2=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleIfSqlCond9034); if (state.failed) return current;
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

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3662:2: (this_WS_4= RULE_WS )*
            	    loop51:
            	    do {
            	        int alt51=2;
            	        int LA51_0 = input.LA(1);

            	        if ( (LA51_0==RULE_WS) ) {
            	            alt51=1;
            	        }


            	        switch (alt51) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3662:3: this_WS_4= RULE_WS
            	    	    {
            	    	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlCond9054); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_4, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_3_1()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop51;
            	        }
            	    } while (true);

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3666:3: ( (lv_bool2_5_0= ruleIfSqlBool ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3667:1: (lv_bool2_5_0= ruleIfSqlBool )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3667:1: (lv_bool2_5_0= ruleIfSqlBool )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3668:3: lv_bool2_5_0= ruleIfSqlBool
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfSqlCondAccess().getBool2IfSqlBoolParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIfSqlBool_in_ruleIfSqlCond9076);
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

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3684:2: (this_WS_6= RULE_WS )*
            	    loop52:
            	    do {
            	        int alt52=2;
            	        int LA52_0 = input.LA(1);

            	        if ( (LA52_0==RULE_WS) ) {
            	            alt52=1;
            	        }


            	        switch (alt52) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3684:3: this_WS_6= RULE_WS
            	    	    {
            	    	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlCond9088); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_6, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_3_3()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop52;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3696:1: entryRuleIfSqlBool returns [EObject current=null] : iv_ruleIfSqlBool= ruleIfSqlBool EOF ;
    public final EObject entryRuleIfSqlBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSqlBool = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3697:2: (iv_ruleIfSqlBool= ruleIfSqlBool EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3698:2: iv_ruleIfSqlBool= ruleIfSqlBool EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlBoolRule()); 
            }
            pushFollow(FOLLOW_ruleIfSqlBool_in_entryRuleIfSqlBool9127);
            iv_ruleIfSqlBool=ruleIfSqlBool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSqlBool; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSqlBool9137); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3705:1: ruleIfSqlBool returns [EObject current=null] : ( ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) ) | ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN ) ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3708:28: ( ( ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) ) | ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3709:1: ( ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) ) | ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3709:1: ( ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) ) | ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN ) )
            int alt57=3;
            switch ( input.LA(1) ) {
            case RULE_NOT:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    alt57=1;
                    }
                    break;
                case RULE_LPAREN:
                    {
                    alt57=3;
                    }
                    break;
                case RULE_COLON:
                    {
                    alt57=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
                {
                alt57=1;
                }
                break;
            case RULE_COLON:
                {
                alt57=2;
                }
                break;
            case RULE_LPAREN:
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3709:2: ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3709:2: ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3709:3: ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3709:3: ( (lv_not_0_0= RULE_NOT ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_NOT) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3710:1: (lv_not_0_0= RULE_NOT )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3710:1: (lv_not_0_0= RULE_NOT )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3711:3: lv_not_0_0= RULE_NOT
                            {
                            lv_not_0_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlBool9180); if (state.failed) return current;
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

                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIfSqlBool9197); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getIfSqlBoolAccess().getSTRINGTerminalRuleCall_0_1()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3731:1: ( (lv_cnst_2_0= ruleConstant ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3732:1: (lv_cnst_2_0= ruleConstant )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3732:1: (lv_cnst_2_0= ruleConstant )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3733:3: lv_cnst_2_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlBoolAccess().getCnstConstantParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleIfSqlBool9217);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3750:6: ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3750:6: ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3750:7: ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3750:7: ( (lv_not_3_0= RULE_NOT ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==RULE_NOT) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3751:1: (lv_not_3_0= RULE_NOT )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3751:1: (lv_not_3_0= RULE_NOT )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3752:3: lv_not_3_0= RULE_NOT
                            {
                            lv_not_3_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlBool9242); if (state.failed) return current;
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

                    this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleIfSqlBool9259); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_4, grammarAccess.getIfSqlBoolAccess().getCOLONTerminalRuleCall_1_1()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3772:1: ( (lv_ident_5_0= ruleIdentifier ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3773:1: (lv_ident_5_0= ruleIdentifier )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3773:1: (lv_ident_5_0= ruleIdentifier )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3774:3: lv_ident_5_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlBoolAccess().getIdentIdentifierParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleIfSqlBool9279);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3791:6: ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3791:6: ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3791:7: ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3791:7: ( (lv_not_6_0= RULE_NOT ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_NOT) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3792:1: (lv_not_6_0= RULE_NOT )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3792:1: (lv_not_6_0= RULE_NOT )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3793:3: lv_not_6_0= RULE_NOT
                            {
                            lv_not_6_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlBool9304); if (state.failed) return current;
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

                    this_LPAREN_7=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleIfSqlBool9321); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_7, grammarAccess.getIfSqlBoolAccess().getLPARENTerminalRuleCall_2_1()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3813:1: ( (lv_cond_8_0= ruleIfSqlCond ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3814:1: (lv_cond_8_0= ruleIfSqlCond )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3814:1: (lv_cond_8_0= ruleIfSqlCond )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3815:3: lv_cond_8_0= ruleIfSqlCond
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlBoolAccess().getCondIfSqlCondParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSqlCond_in_ruleIfSqlBool9341);
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

                    this_RPAREN_9=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleIfSqlBool9352); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3843:1: entryRuleOrdSql returns [EObject current=null] : iv_ruleOrdSql= ruleOrdSql EOF ;
    public final EObject entryRuleOrdSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrdSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3844:2: (iv_ruleOrdSql= ruleOrdSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3845:2: iv_ruleOrdSql= ruleOrdSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrdSqlRule()); 
            }
            pushFollow(FOLLOW_ruleOrdSql_in_entryRuleOrdSql9388);
            iv_ruleOrdSql=ruleOrdSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrdSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrdSql9398); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3852:1: ruleOrdSql returns [EObject current=null] : ( (lv_sqls_0_0= ruleOrdSql2 ) )+ ;
    public final EObject ruleOrdSql() throws RecognitionException {
        EObject current = null;

        EObject lv_sqls_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3855:28: ( ( (lv_sqls_0_0= ruleOrdSql2 ) )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3856:1: ( (lv_sqls_0_0= ruleOrdSql2 ) )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3856:1: ( (lv_sqls_0_0= ruleOrdSql2 ) )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=RULE_WS && LA58_0<=RULE_LBRACE)||(LA58_0>=RULE_QUESTI && LA58_0<=RULE_ESC_CHAR)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3857:1: (lv_sqls_0_0= ruleOrdSql2 )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3857:1: (lv_sqls_0_0= ruleOrdSql2 )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3858:3: lv_sqls_0_0= ruleOrdSql2
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrdSqlAccess().getSqlsOrdSql2ParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrdSql2_in_ruleOrdSql9443);
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
            	    if ( cnt58 >= 1 ) break loop58;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3882:1: entryRuleOrdSql2 returns [EObject current=null] : iv_ruleOrdSql2= ruleOrdSql2 EOF ;
    public final EObject entryRuleOrdSql2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrdSql2 = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3883:2: (iv_ruleOrdSql2= ruleOrdSql2 EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3884:2: iv_ruleOrdSql2= ruleOrdSql2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrdSql2Rule()); 
            }
            pushFollow(FOLLOW_ruleOrdSql2_in_entryRuleOrdSql29479);
            iv_ruleOrdSql2=ruleOrdSql2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrdSql2; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrdSql29489); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3891:1: ruleOrdSql2 returns [EObject current=null] : ( ( (lv_value_0_0= ruleOrdSqlValue ) ) | (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) ) | (this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) ) ) ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3894:28: ( ( ( (lv_value_0_0= ruleOrdSqlValue ) ) | (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) ) | (this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) ) ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3895:1: ( ( (lv_value_0_0= ruleOrdSqlValue ) ) | (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) ) | (this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) ) ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3895:1: ( ( (lv_value_0_0= ruleOrdSqlValue ) ) | (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) ) | (this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) ) ) )
            int alt59=4;
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
                alt59=1;
                }
                break;
            case RULE_STRING:
                {
                alt59=2;
                }
                break;
            case RULE_COLON:
                {
                alt59=3;
                }
                break;
            case RULE_PERCENT:
                {
                alt59=4;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3895:2: ( (lv_value_0_0= ruleOrdSqlValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3895:2: ( (lv_value_0_0= ruleOrdSqlValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3896:1: (lv_value_0_0= ruleOrdSqlValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3896:1: (lv_value_0_0= ruleOrdSqlValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3897:3: lv_value_0_0= ruleOrdSqlValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrdSql2Access().getValueOrdSqlValueParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrdSqlValue_in_ruleOrdSql29535);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3914:6: (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3914:6: (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3914:7: this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) )
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOrdSql29553); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getOrdSql2Access().getSTRINGTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3918:1: ( (lv_cnst_2_0= ruleConstant ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3919:1: (lv_cnst_2_0= ruleConstant )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3919:1: (lv_cnst_2_0= ruleConstant )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3920:3: lv_cnst_2_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrdSql2Access().getCnstConstantParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleOrdSql29573);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3937:6: (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3937:6: (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3937:7: this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) )
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleOrdSql29592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_3, grammarAccess.getOrdSql2Access().getCOLONTerminalRuleCall_2_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3941:1: ( (lv_ident_4_0= ruleIdentifier ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3942:1: (lv_ident_4_0= ruleIdentifier )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3942:1: (lv_ident_4_0= ruleIdentifier )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3943:3: lv_ident_4_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrdSql2Access().getIdentIdentifierParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleOrdSql29612);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3960:6: (this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3960:6: (this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3960:7: this_PERCENT_5= RULE_PERCENT ( (lv_dbcol_6_0= ruleDatabaseColumn ) )
                    {
                    this_PERCENT_5=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleOrdSql29631); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PERCENT_5, grammarAccess.getOrdSql2Access().getPERCENTTerminalRuleCall_3_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3964:1: ( (lv_dbcol_6_0= ruleDatabaseColumn ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3965:1: (lv_dbcol_6_0= ruleDatabaseColumn )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3965:1: (lv_dbcol_6_0= ruleDatabaseColumn )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3966:3: lv_dbcol_6_0= ruleDatabaseColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrdSql2Access().getDbcolDatabaseColumnParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDatabaseColumn_in_ruleOrdSql29651);
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3990:1: entryRuleOrdSqlValue returns [String current=null] : iv_ruleOrdSqlValue= ruleOrdSqlValue EOF ;
    public final String entryRuleOrdSqlValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrdSqlValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3991:2: (iv_ruleOrdSqlValue= ruleOrdSqlValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3992:2: iv_ruleOrdSqlValue= ruleOrdSqlValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrdSqlValueRule()); 
            }
            pushFollow(FOLLOW_ruleOrdSqlValue_in_entryRuleOrdSqlValue9689);
            iv_ruleOrdSqlValue=ruleOrdSqlValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrdSqlValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrdSqlValue9700); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3999:1: ruleOrdSqlValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_AND_22= RULE_AND | this_OR_23= RULE_OR | this_ESC_CHAR_24= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )* ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4002:28: ( ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_AND_22= RULE_AND | this_OR_23= RULE_OR | this_ESC_CHAR_24= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4003:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_AND_22= RULE_AND | this_OR_23= RULE_OR | this_ESC_CHAR_24= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4003:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_AND_22= RULE_AND | this_OR_23= RULE_OR | this_ESC_CHAR_24= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4003:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_AND_22= RULE_AND | this_OR_23= RULE_OR | this_ESC_CHAR_24= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4003:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_AND_22= RULE_AND | this_OR_23= RULE_OR | this_ESC_CHAR_24= RULE_ESC_CHAR )
            int alt60=25;
            switch ( input.LA(1) ) {
            case RULE_REST:
                {
                alt60=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt60=2;
                }
                break;
            case RULE_IDENT:
                {
                alt60=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt60=4;
                }
                break;
            case RULE_WS:
                {
                alt60=5;
                }
                break;
            case RULE_SEMICOLON:
                {
                alt60=6;
                }
                break;
            case RULE_COMMA:
                {
                alt60=7;
                }
                break;
            case RULE_MINUS:
                {
                alt60=8;
                }
                break;
            case RULE_PLUS:
                {
                alt60=9;
                }
                break;
            case RULE_LPAREN:
                {
                alt60=10;
                }
                break;
            case RULE_RPAREN:
                {
                alt60=11;
                }
                break;
            case RULE_LBRACE:
                {
                alt60=12;
                }
                break;
            case RULE_QUESTI:
                {
                alt60=13;
                }
                break;
            case RULE_NOT:
                {
                alt60=14;
                }
                break;
            case RULE_BAND:
                {
                alt60=15;
                }
                break;
            case RULE_BOR:
                {
                alt60=16;
                }
                break;
            case RULE_HASH:
                {
                alt60=17;
                }
                break;
            case RULE_AT:
                {
                alt60=18;
                }
                break;
            case RULE_CARET:
                {
                alt60=19;
                }
                break;
            case RULE_EQUALS:
                {
                alt60=20;
                }
                break;
            case RULE_LESS_THAN:
                {
                alt60=21;
                }
                break;
            case RULE_MORE_THAN:
                {
                alt60=22;
                }
                break;
            case RULE_AND:
                {
                alt60=23;
                }
                break;
            case RULE_OR:
                {
                alt60=24;
                }
                break;
            case RULE_ESC_CHAR:
                {
                alt60=25;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4003:7: this_REST_0= RULE_REST
                    {
                    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleOrdSqlValue9741); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REST_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REST_0, grammarAccess.getOrdSqlValueAccess().getRESTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4011:10: this_IDENT_DOT_1= RULE_IDENT_DOT
                    {
                    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleOrdSqlValue9767); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_DOT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_DOT_1, grammarAccess.getOrdSqlValueAccess().getIDENT_DOTTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4019:10: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleOrdSqlValue9793); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_2, grammarAccess.getOrdSqlValueAccess().getIDENTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4027:10: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleOrdSqlValue9819); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_3, grammarAccess.getOrdSqlValueAccess().getNUMBERTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4035:10: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleOrdSqlValue9845); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WS_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_4, grammarAccess.getOrdSqlValueAccess().getWSTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4043:10: this_SEMICOLON_5= RULE_SEMICOLON
                    {
                    this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleOrdSqlValue9871); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SEMICOLON_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_5, grammarAccess.getOrdSqlValueAccess().getSEMICOLONTerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4051:10: this_COMMA_6= RULE_COMMA
                    {
                    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleOrdSqlValue9897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_6, grammarAccess.getOrdSqlValueAccess().getCOMMATerminalRuleCall_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4059:10: this_MINUS_7= RULE_MINUS
                    {
                    this_MINUS_7=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleOrdSqlValue9923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_7, grammarAccess.getOrdSqlValueAccess().getMINUSTerminalRuleCall_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4067:10: this_PLUS_8= RULE_PLUS
                    {
                    this_PLUS_8=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleOrdSqlValue9949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_8, grammarAccess.getOrdSqlValueAccess().getPLUSTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4075:10: this_LPAREN_9= RULE_LPAREN
                    {
                    this_LPAREN_9=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOrdSqlValue9975); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LPAREN_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_9, grammarAccess.getOrdSqlValueAccess().getLPARENTerminalRuleCall_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4083:10: this_RPAREN_10= RULE_RPAREN
                    {
                    this_RPAREN_10=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOrdSqlValue10001); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RPAREN_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_10, grammarAccess.getOrdSqlValueAccess().getRPARENTerminalRuleCall_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4091:10: this_LBRACE_11= RULE_LBRACE
                    {
                    this_LBRACE_11=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleOrdSqlValue10027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LBRACE_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACE_11, grammarAccess.getOrdSqlValueAccess().getLBRACETerminalRuleCall_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4099:10: this_QUESTI_12= RULE_QUESTI
                    {
                    this_QUESTI_12=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleOrdSqlValue10053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUESTI_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUESTI_12, grammarAccess.getOrdSqlValueAccess().getQUESTITerminalRuleCall_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4107:10: this_NOT_13= RULE_NOT
                    {
                    this_NOT_13=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleOrdSqlValue10079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_13, grammarAccess.getOrdSqlValueAccess().getNOTTerminalRuleCall_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4115:10: this_BAND_14= RULE_BAND
                    {
                    this_BAND_14=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleOrdSqlValue10105); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BAND_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BAND_14, grammarAccess.getOrdSqlValueAccess().getBANDTerminalRuleCall_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4123:10: this_BOR_15= RULE_BOR
                    {
                    this_BOR_15=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleOrdSqlValue10131); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOR_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_15, grammarAccess.getOrdSqlValueAccess().getBORTerminalRuleCall_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4131:10: this_HASH_16= RULE_HASH
                    {
                    this_HASH_16=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleOrdSqlValue10157); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASH_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASH_16, grammarAccess.getOrdSqlValueAccess().getHASHTerminalRuleCall_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4139:10: this_AT_17= RULE_AT
                    {
                    this_AT_17=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleOrdSqlValue10183); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AT_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_17, grammarAccess.getOrdSqlValueAccess().getATTerminalRuleCall_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4147:10: this_CARET_18= RULE_CARET
                    {
                    this_CARET_18=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleOrdSqlValue10209); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CARET_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_18, grammarAccess.getOrdSqlValueAccess().getCARETTerminalRuleCall_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4155:10: this_EQUALS_19= RULE_EQUALS
                    {
                    this_EQUALS_19=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleOrdSqlValue10235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUALS_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_19, grammarAccess.getOrdSqlValueAccess().getEQUALSTerminalRuleCall_0_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4163:10: this_LESS_THAN_20= RULE_LESS_THAN
                    {
                    this_LESS_THAN_20=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleOrdSqlValue10261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LESS_THAN_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LESS_THAN_20, grammarAccess.getOrdSqlValueAccess().getLESS_THANTerminalRuleCall_0_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4171:10: this_MORE_THAN_21= RULE_MORE_THAN
                    {
                    this_MORE_THAN_21=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleOrdSqlValue10287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MORE_THAN_21);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MORE_THAN_21, grammarAccess.getOrdSqlValueAccess().getMORE_THANTerminalRuleCall_0_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4179:10: this_AND_22= RULE_AND
                    {
                    this_AND_22=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleOrdSqlValue10313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AND_22);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AND_22, grammarAccess.getOrdSqlValueAccess().getANDTerminalRuleCall_0_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4187:10: this_OR_23= RULE_OR
                    {
                    this_OR_23=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleOrdSqlValue10339); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_OR_23);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OR_23, grammarAccess.getOrdSqlValueAccess().getORTerminalRuleCall_0_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4195:10: this_ESC_CHAR_24= RULE_ESC_CHAR
                    {
                    this_ESC_CHAR_24=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleOrdSqlValue10365); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESC_CHAR_24);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESC_CHAR_24, grammarAccess.getOrdSqlValueAccess().getESC_CHARTerminalRuleCall_0_24()); 
                          
                    }

                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4202:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )*
            loop62:
            do {
                int alt62=2;
                alt62 = dfa62.predict(input);
                switch (alt62) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4202:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4226:23: (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR )
            	    int alt61=25;
            	    switch ( input.LA(1) ) {
            	    case RULE_REST:
            	        {
            	        alt61=1;
            	        }
            	        break;
            	    case RULE_IDENT_DOT:
            	        {
            	        alt61=2;
            	        }
            	        break;
            	    case RULE_IDENT:
            	        {
            	        alt61=3;
            	        }
            	        break;
            	    case RULE_NUMBER:
            	        {
            	        alt61=4;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt61=5;
            	        }
            	        break;
            	    case RULE_SEMICOLON:
            	        {
            	        alt61=6;
            	        }
            	        break;
            	    case RULE_COMMA:
            	        {
            	        alt61=7;
            	        }
            	        break;
            	    case RULE_MINUS:
            	        {
            	        alt61=8;
            	        }
            	        break;
            	    case RULE_PLUS:
            	        {
            	        alt61=9;
            	        }
            	        break;
            	    case RULE_LPAREN:
            	        {
            	        alt61=10;
            	        }
            	        break;
            	    case RULE_RPAREN:
            	        {
            	        alt61=11;
            	        }
            	        break;
            	    case RULE_LBRACE:
            	        {
            	        alt61=12;
            	        }
            	        break;
            	    case RULE_QUESTI:
            	        {
            	        alt61=13;
            	        }
            	        break;
            	    case RULE_NOT:
            	        {
            	        alt61=14;
            	        }
            	        break;
            	    case RULE_BAND:
            	        {
            	        alt61=15;
            	        }
            	        break;
            	    case RULE_BOR:
            	        {
            	        alt61=16;
            	        }
            	        break;
            	    case RULE_HASH:
            	        {
            	        alt61=17;
            	        }
            	        break;
            	    case RULE_AT:
            	        {
            	        alt61=18;
            	        }
            	        break;
            	    case RULE_CARET:
            	        {
            	        alt61=19;
            	        }
            	        break;
            	    case RULE_EQUALS:
            	        {
            	        alt61=20;
            	        }
            	        break;
            	    case RULE_LESS_THAN:
            	        {
            	        alt61=21;
            	        }
            	        break;
            	    case RULE_MORE_THAN:
            	        {
            	        alt61=22;
            	        }
            	        break;
            	    case RULE_AND:
            	        {
            	        alt61=23;
            	        }
            	        break;
            	    case RULE_OR:
            	        {
            	        alt61=24;
            	        }
            	        break;
            	    case RULE_ESC_CHAR:
            	        {
            	        alt61=25;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 61, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt61) {
            	        case 1 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4226:28: this_REST_25= RULE_REST
            	            {
            	            this_REST_25=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleOrdSqlValue10562); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REST_25);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REST_25, grammarAccess.getOrdSqlValueAccess().getRESTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4234:10: this_IDENT_DOT_26= RULE_IDENT_DOT
            	            {
            	            this_IDENT_DOT_26=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleOrdSqlValue10588); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_DOT_26);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_DOT_26, grammarAccess.getOrdSqlValueAccess().getIDENT_DOTTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4242:10: this_IDENT_27= RULE_IDENT
            	            {
            	            this_IDENT_27=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleOrdSqlValue10614); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_27);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_27, grammarAccess.getOrdSqlValueAccess().getIDENTTerminalRuleCall_1_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4250:10: this_NUMBER_28= RULE_NUMBER
            	            {
            	            this_NUMBER_28=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleOrdSqlValue10640); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NUMBER_28);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NUMBER_28, grammarAccess.getOrdSqlValueAccess().getNUMBERTerminalRuleCall_1_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4258:10: this_WS_29= RULE_WS
            	            {
            	            this_WS_29=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleOrdSqlValue10666); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_WS_29);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_WS_29, grammarAccess.getOrdSqlValueAccess().getWSTerminalRuleCall_1_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4266:10: this_SEMICOLON_30= RULE_SEMICOLON
            	            {
            	            this_SEMICOLON_30=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleOrdSqlValue10692); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_SEMICOLON_30);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_SEMICOLON_30, grammarAccess.getOrdSqlValueAccess().getSEMICOLONTerminalRuleCall_1_0_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4274:10: this_COMMA_31= RULE_COMMA
            	            {
            	            this_COMMA_31=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleOrdSqlValue10718); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COMMA_31);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COMMA_31, grammarAccess.getOrdSqlValueAccess().getCOMMATerminalRuleCall_1_0_6()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4282:10: this_MINUS_32= RULE_MINUS
            	            {
            	            this_MINUS_32=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleOrdSqlValue10744); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MINUS_32);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MINUS_32, grammarAccess.getOrdSqlValueAccess().getMINUSTerminalRuleCall_1_0_7()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4290:10: this_PLUS_33= RULE_PLUS
            	            {
            	            this_PLUS_33=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleOrdSqlValue10770); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PLUS_33);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PLUS_33, grammarAccess.getOrdSqlValueAccess().getPLUSTerminalRuleCall_1_0_8()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4298:10: this_LPAREN_34= RULE_LPAREN
            	            {
            	            this_LPAREN_34=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOrdSqlValue10796); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LPAREN_34);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LPAREN_34, grammarAccess.getOrdSqlValueAccess().getLPARENTerminalRuleCall_1_0_9()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4306:10: this_RPAREN_35= RULE_RPAREN
            	            {
            	            this_RPAREN_35=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOrdSqlValue10822); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RPAREN_35);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RPAREN_35, grammarAccess.getOrdSqlValueAccess().getRPARENTerminalRuleCall_1_0_10()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4314:10: this_LBRACE_36= RULE_LBRACE
            	            {
            	            this_LBRACE_36=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleOrdSqlValue10848); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LBRACE_36);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LBRACE_36, grammarAccess.getOrdSqlValueAccess().getLBRACETerminalRuleCall_1_0_11()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 13 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4322:10: this_QUESTI_37= RULE_QUESTI
            	            {
            	            this_QUESTI_37=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleOrdSqlValue10874); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_QUESTI_37);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_QUESTI_37, grammarAccess.getOrdSqlValueAccess().getQUESTITerminalRuleCall_1_0_12()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 14 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4330:10: this_NOT_38= RULE_NOT
            	            {
            	            this_NOT_38=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleOrdSqlValue10900); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NOT_38);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NOT_38, grammarAccess.getOrdSqlValueAccess().getNOTTerminalRuleCall_1_0_13()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 15 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4338:10: this_BAND_39= RULE_BAND
            	            {
            	            this_BAND_39=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleOrdSqlValue10926); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BAND_39);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BAND_39, grammarAccess.getOrdSqlValueAccess().getBANDTerminalRuleCall_1_0_14()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 16 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4346:10: this_BOR_40= RULE_BOR
            	            {
            	            this_BOR_40=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleOrdSqlValue10952); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BOR_40);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BOR_40, grammarAccess.getOrdSqlValueAccess().getBORTerminalRuleCall_1_0_15()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 17 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4354:10: this_HASH_41= RULE_HASH
            	            {
            	            this_HASH_41=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleOrdSqlValue10978); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_HASH_41);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_HASH_41, grammarAccess.getOrdSqlValueAccess().getHASHTerminalRuleCall_1_0_16()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 18 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4362:10: this_AT_42= RULE_AT
            	            {
            	            this_AT_42=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleOrdSqlValue11004); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AT_42);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AT_42, grammarAccess.getOrdSqlValueAccess().getATTerminalRuleCall_1_0_17()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 19 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4370:10: this_CARET_43= RULE_CARET
            	            {
            	            this_CARET_43=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleOrdSqlValue11030); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_CARET_43);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_CARET_43, grammarAccess.getOrdSqlValueAccess().getCARETTerminalRuleCall_1_0_18()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 20 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4378:10: this_EQUALS_44= RULE_EQUALS
            	            {
            	            this_EQUALS_44=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleOrdSqlValue11056); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_EQUALS_44);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_EQUALS_44, grammarAccess.getOrdSqlValueAccess().getEQUALSTerminalRuleCall_1_0_19()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 21 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4386:10: this_LESS_THAN_45= RULE_LESS_THAN
            	            {
            	            this_LESS_THAN_45=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleOrdSqlValue11082); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LESS_THAN_45);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LESS_THAN_45, grammarAccess.getOrdSqlValueAccess().getLESS_THANTerminalRuleCall_1_0_20()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 22 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4394:10: this_MORE_THAN_46= RULE_MORE_THAN
            	            {
            	            this_MORE_THAN_46=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleOrdSqlValue11108); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MORE_THAN_46);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MORE_THAN_46, grammarAccess.getOrdSqlValueAccess().getMORE_THANTerminalRuleCall_1_0_21()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 23 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4402:10: this_AND_47= RULE_AND
            	            {
            	            this_AND_47=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleOrdSqlValue11134); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AND_47);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AND_47, grammarAccess.getOrdSqlValueAccess().getANDTerminalRuleCall_1_0_22()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 24 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4410:10: this_OR_48= RULE_OR
            	            {
            	            this_OR_48=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleOrdSqlValue11160); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_OR_48);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_OR_48, grammarAccess.getOrdSqlValueAccess().getORTerminalRuleCall_1_0_23()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 25 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4418:10: this_ESC_CHAR_49= RULE_ESC_CHAR
            	            {
            	            this_ESC_CHAR_49=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleOrdSqlValue11186); if (state.failed) return current;
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
            	    break loop62;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4433:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4434:2: (iv_ruleColumn= ruleColumn EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4435:2: iv_ruleColumn= ruleColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnRule()); 
            }
            pushFollow(FOLLOW_ruleColumn_in_entryRuleColumn11234);
            iv_ruleColumn=ruleColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumn11244); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4442:1: ruleColumn returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )? ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4445:28: ( ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )? ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4446:1: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )? )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4446:1: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4446:2: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )?
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4446:2: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4447:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4447:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4448:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4448:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER )
            int alt63=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                alt63=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt63=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt63=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4449:3: lv_name_0_1= RULE_IDENT
                    {
                    lv_name_0_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumn11288); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4464:8: lv_name_0_2= RULE_IDENT_DOT
                    {
                    lv_name_0_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleColumn11308); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4479:8: lv_name_0_3= RULE_NUMBER
                    {
                    lv_name_0_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleColumn11328); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4497:2: ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_CARET) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==RULE_IDENT) ) {
                    int LA66_3 = input.LA(3);

                    if ( (synpred5_InternalProcessorDsl()) ) {
                        alt66=1;
                    }
                }
            }
            switch (alt66) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4497:3: ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4497:3: ( ( RULE_CARET )=>this_CARET_1= RULE_CARET )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4497:4: ( RULE_CARET )=>this_CARET_1= RULE_CARET
                    {
                    this_CARET_1=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleColumn11354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_1, grammarAccess.getColumnAccess().getCARETTerminalRuleCall_1_0()); 
                          
                    }

                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4501:2: ( (lv_type_2_0= RULE_IDENT ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4502:1: (lv_type_2_0= RULE_IDENT )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4502:1: (lv_type_2_0= RULE_IDENT )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4503:3: lv_type_2_0= RULE_IDENT
                    {
                    lv_type_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumn11371); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4519:2: ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==RULE_CARET) ) {
                            int LA65_2 = input.LA(2);

                            if ( (LA65_2==RULE_IDENT) ) {
                                int LA65_3 = input.LA(3);

                                if ( (synpred6_InternalProcessorDsl()) ) {
                                    alt65=1;
                                }


                            }
                            else if ( (LA65_2==RULE_NUMBER) ) {
                                int LA65_4 = input.LA(3);

                                if ( (synpred6_InternalProcessorDsl()) ) {
                                    alt65=1;
                                }


                            }


                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4519:3: ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4519:3: ( ( RULE_CARET )=>this_CARET_3= RULE_CARET )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4519:4: ( RULE_CARET )=>this_CARET_3= RULE_CARET
                    	    {
                    	    this_CARET_3=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleColumn11394); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_CARET_3, grammarAccess.getColumnAccess().getCARETTerminalRuleCall_1_2_0()); 
                    	          
                    	    }

                    	    }

                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4523:2: ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4524:1: ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4524:1: ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4525:1: (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4525:1: (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER )
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
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4526:3: lv_vals_4_1= RULE_IDENT
                    	            {
                    	            lv_vals_4_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumn11413); if (state.failed) return current;
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
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4541:8: lv_vals_4_2= RULE_NUMBER
                    	            {
                    	            lv_vals_4_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleColumn11433); if (state.failed) return current;
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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleConstant"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4567:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4568:2: (iv_ruleConstant= ruleConstant EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4569:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant11481);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant11491); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4576:1: ruleConstant returns [EObject current=null] : ( ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )? ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4579:28: ( ( ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )? ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4580:1: ( ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )? )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4580:1: ( ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4580:2: ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )?
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4580:2: ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=RULE_MINUS && LA68_0<=RULE_PLUS)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4581:1: ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4581:1: ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4582:1: (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4582:1: (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==RULE_PLUS) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==RULE_MINUS) ) {
                        alt67=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4583:3: lv_case_0_1= RULE_PLUS
                            {
                            lv_case_0_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleConstant11535); if (state.failed) return current;
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4598:8: lv_case_0_2= RULE_MINUS
                            {
                            lv_case_0_2=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleConstant11555); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4616:3: ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4617:1: ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4617:1: ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4618:1: (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4618:1: (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_IDENT) ) {
                alt69=1;
            }
            else if ( (LA69_0==RULE_IDENT_DOT) ) {
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4619:3: lv_name_1_1= RULE_IDENT
                    {
                    lv_name_1_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstant11583); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4634:8: lv_name_1_2= RULE_IDENT_DOT
                    {
                    lv_name_1_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleConstant11603); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4652:2: ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_CARET) ) {
                int LA72_1 = input.LA(2);

                if ( (LA72_1==RULE_IDENT) ) {
                    int LA72_3 = input.LA(3);

                    if ( (synpred7_InternalProcessorDsl()) ) {
                        alt72=1;
                    }
                }
            }
            switch (alt72) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4652:3: ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4652:3: ( ( RULE_CARET )=>this_CARET_2= RULE_CARET )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4652:4: ( RULE_CARET )=>this_CARET_2= RULE_CARET
                    {
                    this_CARET_2=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleConstant11629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_2, grammarAccess.getConstantAccess().getCARETTerminalRuleCall_2_0()); 
                          
                    }

                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4656:2: ( (lv_type_3_0= RULE_IDENT ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4657:1: (lv_type_3_0= RULE_IDENT )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4657:1: (lv_type_3_0= RULE_IDENT )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4658:3: lv_type_3_0= RULE_IDENT
                    {
                    lv_type_3_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstant11646); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4674:2: ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==RULE_CARET) ) {
                            int LA71_2 = input.LA(2);

                            if ( (LA71_2==RULE_IDENT) ) {
                                int LA71_3 = input.LA(3);

                                if ( (synpred8_InternalProcessorDsl()) ) {
                                    alt71=1;
                                }


                            }
                            else if ( (LA71_2==RULE_NUMBER) ) {
                                int LA71_4 = input.LA(3);

                                if ( (synpred8_InternalProcessorDsl()) ) {
                                    alt71=1;
                                }


                            }


                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4674:3: ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4674:3: ( ( RULE_CARET )=>this_CARET_4= RULE_CARET )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4674:4: ( RULE_CARET )=>this_CARET_4= RULE_CARET
                    	    {
                    	    this_CARET_4=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleConstant11669); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_CARET_4, grammarAccess.getConstantAccess().getCARETTerminalRuleCall_2_2_0()); 
                    	          
                    	    }

                    	    }

                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4678:2: ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4679:1: ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4679:1: ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4680:1: (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4680:1: (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER )
                    	    int alt70=2;
                    	    int LA70_0 = input.LA(1);

                    	    if ( (LA70_0==RULE_IDENT) ) {
                    	        alt70=1;
                    	    }
                    	    else if ( (LA70_0==RULE_NUMBER) ) {
                    	        alt70=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 70, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt70) {
                    	        case 1 :
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4681:3: lv_vals_5_1= RULE_IDENT
                    	            {
                    	            lv_vals_5_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstant11688); if (state.failed) return current;
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
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4696:8: lv_vals_5_2= RULE_NUMBER
                    	            {
                    	            lv_vals_5_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleConstant11708); if (state.failed) return current;
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
                    	    break loop71;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4722:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4723:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4724:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier11756);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier11766); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4731:1: ruleIdentifier returns [EObject current=null] : ( ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )? ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4734:28: ( ( ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )? ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4735:1: ( ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )? )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4735:1: ( ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4735:2: ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )?
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4735:2: ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=RULE_EQUALS && LA74_0<=RULE_MORE_THAN)) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4736:1: ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4736:1: ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4737:1: (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4737:1: (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN )
                    int alt73=3;
                    switch ( input.LA(1) ) {
                    case RULE_EQUALS:
                        {
                        alt73=1;
                        }
                        break;
                    case RULE_LESS_THAN:
                        {
                        alt73=2;
                        }
                        break;
                    case RULE_MORE_THAN:
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4738:3: lv_mode_0_1= RULE_EQUALS
                            {
                            lv_mode_0_1=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleIdentifier11810); if (state.failed) return current;
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4753:8: lv_mode_0_2= RULE_LESS_THAN
                            {
                            lv_mode_0_2=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleIdentifier11830); if (state.failed) return current;
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4768:8: lv_mode_0_3= RULE_MORE_THAN
                            {
                            lv_mode_0_3=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleIdentifier11850); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4786:3: ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=RULE_MINUS && LA76_0<=RULE_PLUS)) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4787:1: ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4787:1: ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4788:1: (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4788:1: (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS )
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==RULE_PLUS) ) {
                        alt75=1;
                    }
                    else if ( (LA75_0==RULE_MINUS) ) {
                        alt75=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 0, input);

                        throw nvae;
                    }
                    switch (alt75) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4789:3: lv_case_1_1= RULE_PLUS
                            {
                            lv_case_1_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleIdentifier11878); if (state.failed) return current;
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4804:8: lv_case_1_2= RULE_MINUS
                            {
                            lv_case_1_2=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleIdentifier11898); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4822:3: ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4823:1: ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4823:1: ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4824:1: (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4824:1: (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER )
            int alt77=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                alt77=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt77=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt77=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4825:3: lv_name_2_1= RULE_IDENT
                    {
                    lv_name_2_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifier11926); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4840:8: lv_name_2_2= RULE_IDENT_DOT
                    {
                    lv_name_2_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleIdentifier11946); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4855:8: lv_name_2_3= RULE_NUMBER
                    {
                    lv_name_2_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIdentifier11966); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4873:2: ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_CARET) ) {
                int LA80_1 = input.LA(2);

                if ( (LA80_1==RULE_IDENT) ) {
                    int LA80_3 = input.LA(3);

                    if ( (synpred9_InternalProcessorDsl()) ) {
                        alt80=1;
                    }
                }
            }
            switch (alt80) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4873:3: ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4873:3: ( ( RULE_CARET )=>this_CARET_3= RULE_CARET )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4873:4: ( RULE_CARET )=>this_CARET_3= RULE_CARET
                    {
                    this_CARET_3=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleIdentifier11992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_3, grammarAccess.getIdentifierAccess().getCARETTerminalRuleCall_3_0()); 
                          
                    }

                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4877:2: ( (lv_type_4_0= RULE_IDENT ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4878:1: (lv_type_4_0= RULE_IDENT )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4878:1: (lv_type_4_0= RULE_IDENT )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4879:3: lv_type_4_0= RULE_IDENT
                    {
                    lv_type_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifier12009); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4895:2: ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==RULE_CARET) ) {
                            int LA79_2 = input.LA(2);

                            if ( (LA79_2==RULE_IDENT) ) {
                                int LA79_3 = input.LA(3);

                                if ( (synpred10_InternalProcessorDsl()) ) {
                                    alt79=1;
                                }


                            }
                            else if ( (LA79_2==RULE_NUMBER) ) {
                                int LA79_4 = input.LA(3);

                                if ( (synpred10_InternalProcessorDsl()) ) {
                                    alt79=1;
                                }


                            }


                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4895:3: ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4895:3: ( ( RULE_CARET )=>this_CARET_5= RULE_CARET )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4895:4: ( RULE_CARET )=>this_CARET_5= RULE_CARET
                    	    {
                    	    this_CARET_5=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleIdentifier12032); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_CARET_5, grammarAccess.getIdentifierAccess().getCARETTerminalRuleCall_3_2_0()); 
                    	          
                    	    }

                    	    }

                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4899:2: ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4900:1: ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4900:1: ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4901:1: (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4901:1: (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER )
                    	    int alt78=2;
                    	    int LA78_0 = input.LA(1);

                    	    if ( (LA78_0==RULE_IDENT) ) {
                    	        alt78=1;
                    	    }
                    	    else if ( (LA78_0==RULE_NUMBER) ) {
                    	        alt78=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 78, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt78) {
                    	        case 1 :
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4902:3: lv_vals_6_1= RULE_IDENT
                    	            {
                    	            lv_vals_6_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifier12051); if (state.failed) return current;
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
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4917:8: lv_vals_6_2= RULE_NUMBER
                    	            {
                    	            lv_vals_6_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIdentifier12071); if (state.failed) return current;
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
                    	    break loop79;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4943:1: entryRuleDatabaseColumn returns [EObject current=null] : iv_ruleDatabaseColumn= ruleDatabaseColumn EOF ;
    public final EObject entryRuleDatabaseColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabaseColumn = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4944:2: (iv_ruleDatabaseColumn= ruleDatabaseColumn EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4945:2: iv_ruleDatabaseColumn= ruleDatabaseColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDatabaseColumnRule()); 
            }
            pushFollow(FOLLOW_ruleDatabaseColumn_in_entryRuleDatabaseColumn12119);
            iv_ruleDatabaseColumn=ruleDatabaseColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDatabaseColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatabaseColumn12129); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4952:1: ruleDatabaseColumn returns [EObject current=null] : ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) ;
    public final EObject ruleDatabaseColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4955:28: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4956:1: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4956:1: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4957:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4957:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4958:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4958:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_IDENT) ) {
                alt81=1;
            }
            else if ( (LA81_0==RULE_IDENT_DOT) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4959:3: lv_name_0_1= RULE_IDENT
                    {
                    lv_name_0_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleDatabaseColumn12172); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4974:8: lv_name_0_2= RULE_IDENT_DOT
                    {
                    lv_name_0_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleDatabaseColumn12192); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5000:1: entryRuleMappingRule returns [EObject current=null] : iv_ruleMappingRule= ruleMappingRule EOF ;
    public final EObject entryRuleMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingRule = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5001:2: (iv_ruleMappingRule= ruleMappingRule EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5002:2: iv_ruleMappingRule= ruleMappingRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingRuleRule()); 
            }
            pushFollow(FOLLOW_ruleMappingRule_in_entryRuleMappingRule12235);
            iv_ruleMappingRule=ruleMappingRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingRule12245); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5009:1: ruleMappingRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5012:28: ( ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5013:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5013:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5013:2: ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5013:2: ( (lv_name_0_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5014:1: (lv_name_0_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5014:1: (lv_name_0_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5015:3: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingRule12287); if (state.failed) return current;
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

            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleMappingRule12303); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_1, grammarAccess.getMappingRuleAccess().getLPARENTerminalRuleCall_1()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5035:1: ( (lv_type_2_0= ruleMAPPING_TYPE ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5036:1: (lv_type_2_0= ruleMAPPING_TYPE )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5036:1: (lv_type_2_0= ruleMAPPING_TYPE )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5037:3: lv_type_2_0= ruleMAPPING_TYPE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingRuleAccess().getTypeMAPPING_TYPEEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMAPPING_TYPE_in_ruleMappingRule12323);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5053:2: (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==RULE_COMMA) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5053:3: this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleMappingRule12335); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getMappingRuleAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5057:1: ( (lv_filters_4_0= RULE_IDENT ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5058:1: (lv_filters_4_0= RULE_IDENT )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5058:1: (lv_filters_4_0= RULE_IDENT )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5059:3: lv_filters_4_0= RULE_IDENT
            	    {
            	    lv_filters_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingRule12351); if (state.failed) return current;
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
            	    break loop82;
                }
            } while (true);

            this_RPAREN_5=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleMappingRule12369); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_5, grammarAccess.getMappingRuleAccess().getRPARENTerminalRuleCall_4()); 
                  
            }
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleMappingRule12379); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUALS_6, grammarAccess.getMappingRuleAccess().getEQUALSTerminalRuleCall_5()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5083:1: ( (lv_mapping_7_0= ruleMapping ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5084:1: (lv_mapping_7_0= ruleMapping )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5084:1: (lv_mapping_7_0= ruleMapping )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5085:3: lv_mapping_7_0= ruleMapping
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingRuleAccess().getMappingMappingParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMapping_in_ruleMappingRule12399);
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

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleMappingRule12410); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5113:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5114:2: (iv_ruleMapping= ruleMapping EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5115:2: iv_ruleMapping= ruleMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingRule()); 
            }
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping12445);
            iv_ruleMapping=ruleMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping12455); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5122:1: ruleMapping returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )* ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        EObject lv_mappingItems_1_0 = null;

        EObject lv_mappingItems_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5125:28: ( ( (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5126:1: ( (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5126:1: ( (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5126:2: (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5126:2: (this_WS_0= RULE_WS )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==RULE_WS) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5126:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMapping12492); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_0, grammarAccess.getMappingAccess().getWSTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5130:3: ( (lv_mappingItems_1_0= ruleMappingItem ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5131:1: (lv_mappingItems_1_0= ruleMappingItem )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5131:1: (lv_mappingItems_1_0= ruleMappingItem )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5132:3: lv_mappingItems_1_0= ruleMappingItem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingAccess().getMappingItemsMappingItemParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMappingItem_in_ruleMapping12514);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5148:2: ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )*
            loop85:
            do {
                int alt85=2;
                alt85 = dfa85.predict(input);
                switch (alt85) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5148:3: (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5148:3: (this_WS_2= RULE_WS )+
            	    int cnt84=0;
            	    loop84:
            	    do {
            	        int alt84=2;
            	        int LA84_0 = input.LA(1);

            	        if ( (LA84_0==RULE_WS) ) {
            	            alt84=1;
            	        }


            	        switch (alt84) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5148:4: this_WS_2= RULE_WS
            	    	    {
            	    	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMapping12527); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_2, grammarAccess.getMappingAccess().getWSTerminalRuleCall_2_0()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt84 >= 1 ) break loop84;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(84, input);
            	                throw eee;
            	        }
            	        cnt84++;
            	    } while (true);

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5152:3: ( (lv_mappingItems_3_0= ruleMappingItem ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5153:1: (lv_mappingItems_3_0= ruleMappingItem )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5153:1: (lv_mappingItems_3_0= ruleMappingItem )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5154:3: lv_mappingItems_3_0= ruleMappingItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMappingAccess().getMappingItemsMappingItemParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMappingItem_in_ruleMapping12549);
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
            	    break loop85;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5170:4: (this_WS_4= RULE_WS )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==RULE_WS) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5170:5: this_WS_4= RULE_WS
            	    {
            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMapping12563); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_4, grammarAccess.getMappingAccess().getWSTerminalRuleCall_3()); 
            	          
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
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleMappingItem"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5182:1: entryRuleMappingItem returns [EObject current=null] : iv_ruleMappingItem= ruleMappingItem EOF ;
    public final EObject entryRuleMappingItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingItem = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5183:2: (iv_ruleMappingItem= ruleMappingItem EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5184:2: iv_ruleMappingItem= ruleMappingItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingItemRule()); 
            }
            pushFollow(FOLLOW_ruleMappingItem_in_entryRuleMappingItem12600);
            iv_ruleMappingItem=ruleMappingItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingItem12610); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5191:1: ruleMappingItem returns [EObject current=null] : ( ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )? ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5194:28: ( ( ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )? ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5195:1: ( ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )? )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5195:1: ( ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5195:2: ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )?
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5195:2: ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5196:1: ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5196:1: ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5197:1: (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5197:1: (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_IDENT) ) {
                alt87=1;
            }
            else if ( (LA87_0==RULE_NUMBER) ) {
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5198:3: lv_col_0_1= RULE_IDENT
                    {
                    lv_col_0_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingItem12654); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5213:8: lv_col_0_2= RULE_NUMBER
                    {
                    lv_col_0_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMappingItem12674); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5231:2: (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )? )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_STRING) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5231:3: this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )?
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMappingItem12694); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getMappingItemAccess().getSTRINGTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5235:1: ( (lv_type_2_0= RULE_IDENT ) )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==RULE_IDENT) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5236:1: (lv_type_2_0= RULE_IDENT )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5236:1: (lv_type_2_0= RULE_IDENT )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5237:3: lv_type_2_0= RULE_IDENT
                            {
                            lv_type_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingItem12710); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5253:3: (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) ) )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==RULE_STRING) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5253:4: this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingColumn ) )
                            {
                            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMappingItem12728); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_STRING_3, grammarAccess.getMappingItemAccess().getSTRINGTerminalRuleCall_1_2_0()); 
                                  
                            }
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5257:1: ( (lv_attr_4_0= ruleMappingColumn ) )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5258:1: (lv_attr_4_0= ruleMappingColumn )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5258:1: (lv_attr_4_0= ruleMappingColumn )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5259:3: lv_attr_4_0= ruleMappingColumn
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getMappingItemAccess().getAttrMappingColumnParserRuleCall_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMappingColumn_in_ruleMappingItem12748);
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5283:1: entryRuleMappingColumn returns [EObject current=null] : iv_ruleMappingColumn= ruleMappingColumn EOF ;
    public final EObject entryRuleMappingColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingColumn = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5284:2: (iv_ruleMappingColumn= ruleMappingColumn EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5285:2: iv_ruleMappingColumn= ruleMappingColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingColumnRule()); 
            }
            pushFollow(FOLLOW_ruleMappingColumn_in_entryRuleMappingColumn12788);
            iv_ruleMappingColumn=ruleMappingColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingColumn12798); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5292:1: ruleMappingColumn returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )* ) ;
    public final EObject ruleMappingColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token this_CARET_1=null;
        Token lv_vals_2_1=null;
        Token lv_vals_2_2=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5295:28: ( ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5296:1: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5296:1: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5296:2: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5296:2: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5297:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5297:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5298:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5298:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_IDENT) ) {
                alt91=1;
            }
            else if ( (LA91_0==RULE_IDENT_DOT) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5299:3: lv_name_0_1= RULE_IDENT
                    {
                    lv_name_0_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingColumn12842); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5314:8: lv_name_0_2= RULE_IDENT_DOT
                    {
                    lv_name_0_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleMappingColumn12862); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5332:2: (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==RULE_CARET) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5332:3: this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) )
            	    {
            	    this_CARET_1=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleMappingColumn12882); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_CARET_1, grammarAccess.getMappingColumnAccess().getCARETTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5336:1: ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5337:1: ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5337:1: ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5338:1: (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5338:1: (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER )
            	    int alt92=2;
            	    int LA92_0 = input.LA(1);

            	    if ( (LA92_0==RULE_IDENT) ) {
            	        alt92=1;
            	    }
            	    else if ( (LA92_0==RULE_NUMBER) ) {
            	        alt92=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 92, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt92) {
            	        case 1 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5339:3: lv_vals_2_1= RULE_IDENT
            	            {
            	            lv_vals_2_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingColumn12900); if (state.failed) return current;
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
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5354:8: lv_vals_2_2= RULE_NUMBER
            	            {
            	            lv_vals_2_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMappingColumn12920); if (state.failed) return current;
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
            	    break loop93;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5380:1: entryRuleOptionalFeature returns [EObject current=null] : iv_ruleOptionalFeature= ruleOptionalFeature EOF ;
    public final EObject entryRuleOptionalFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalFeature = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5381:2: (iv_ruleOptionalFeature= ruleOptionalFeature EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5382:2: iv_ruleOptionalFeature= ruleOptionalFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionalFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleOptionalFeature_in_entryRuleOptionalFeature12966);
            iv_ruleOptionalFeature=ruleOptionalFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptionalFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalFeature12976); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5389:1: ruleOptionalFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5392:28: ( ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5393:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5393:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5393:2: ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5393:2: ( (lv_name_0_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5394:1: (lv_name_0_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5394:1: (lv_name_0_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5395:3: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleOptionalFeature13018); if (state.failed) return current;
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

            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOptionalFeature13034); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_1, grammarAccess.getOptionalFeatureAccess().getLPARENTerminalRuleCall_1()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5415:1: ( (lv_type_2_0= ruleOPTION_TYPE ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5416:1: (lv_type_2_0= ruleOPTION_TYPE )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5416:1: (lv_type_2_0= ruleOPTION_TYPE )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5417:3: lv_type_2_0= ruleOPTION_TYPE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionalFeatureAccess().getTypeOPTION_TYPEEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOPTION_TYPE_in_ruleOptionalFeature13054);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5433:2: (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==RULE_COMMA) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5433:3: this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleOptionalFeature13066); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getOptionalFeatureAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5437:1: ( (lv_filters_4_0= RULE_IDENT ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5438:1: (lv_filters_4_0= RULE_IDENT )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5438:1: (lv_filters_4_0= RULE_IDENT )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5439:3: lv_filters_4_0= RULE_IDENT
            	    {
            	    lv_filters_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleOptionalFeature13082); if (state.failed) return current;
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
            	    break loop94;
                }
            } while (true);

            this_RPAREN_5=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOptionalFeature13100); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_5, grammarAccess.getOptionalFeatureAccess().getRPARENTerminalRuleCall_4()); 
                  
            }
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleOptionalFeature13110); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUALS_6, grammarAccess.getOptionalFeatureAccess().getEQUALSTerminalRuleCall_5()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5463:1: ( (lv_option_7_0= ruleFeatureValue ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5464:1: (lv_option_7_0= ruleFeatureValue )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5464:1: (lv_option_7_0= ruleFeatureValue )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5465:3: lv_option_7_0= ruleFeatureValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionalFeatureAccess().getOptionFeatureValueParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureValue_in_ruleOptionalFeature13130);
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

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleOptionalFeature13141); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5493:1: entryRuleFeatureValue returns [String current=null] : iv_ruleFeatureValue= ruleFeatureValue EOF ;
    public final String entryRuleFeatureValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5494:2: (iv_ruleFeatureValue= ruleFeatureValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5495:2: iv_ruleFeatureValue= ruleFeatureValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureValueRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureValue_in_entryRuleFeatureValue13177);
            iv_ruleFeatureValue=ruleFeatureValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureValue13188); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5502:1: ruleFeatureValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COLON_5= RULE_COLON | this_STRING_6= RULE_STRING | this_COMMA_7= RULE_COMMA | this_MINUS_8= RULE_MINUS | this_PLUS_9= RULE_PLUS | this_LPAREN_10= RULE_LPAREN | this_RPAREN_11= RULE_RPAREN | this_LBRACE_12= RULE_LBRACE | this_RBRACE_13= RULE_RBRACE | this_QUESTI_14= RULE_QUESTI | this_NOT_15= RULE_NOT | this_BAND_16= RULE_BAND | this_BOR_17= RULE_BOR | this_HASH_18= RULE_HASH | this_AT_19= RULE_AT | this_CARET_20= RULE_CARET | this_EQUALS_21= RULE_EQUALS | this_LESS_THAN_22= RULE_LESS_THAN | this_MORE_THAN_23= RULE_MORE_THAN | this_PERCENT_24= RULE_PERCENT | this_AND_25= RULE_AND | this_OR_26= RULE_OR | this_ESC_CHAR_27= RULE_ESC_CHAR )+ ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5505:28: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COLON_5= RULE_COLON | this_STRING_6= RULE_STRING | this_COMMA_7= RULE_COMMA | this_MINUS_8= RULE_MINUS | this_PLUS_9= RULE_PLUS | this_LPAREN_10= RULE_LPAREN | this_RPAREN_11= RULE_RPAREN | this_LBRACE_12= RULE_LBRACE | this_RBRACE_13= RULE_RBRACE | this_QUESTI_14= RULE_QUESTI | this_NOT_15= RULE_NOT | this_BAND_16= RULE_BAND | this_BOR_17= RULE_BOR | this_HASH_18= RULE_HASH | this_AT_19= RULE_AT | this_CARET_20= RULE_CARET | this_EQUALS_21= RULE_EQUALS | this_LESS_THAN_22= RULE_LESS_THAN | this_MORE_THAN_23= RULE_MORE_THAN | this_PERCENT_24= RULE_PERCENT | this_AND_25= RULE_AND | this_OR_26= RULE_OR | this_ESC_CHAR_27= RULE_ESC_CHAR )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5506:1: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COLON_5= RULE_COLON | this_STRING_6= RULE_STRING | this_COMMA_7= RULE_COMMA | this_MINUS_8= RULE_MINUS | this_PLUS_9= RULE_PLUS | this_LPAREN_10= RULE_LPAREN | this_RPAREN_11= RULE_RPAREN | this_LBRACE_12= RULE_LBRACE | this_RBRACE_13= RULE_RBRACE | this_QUESTI_14= RULE_QUESTI | this_NOT_15= RULE_NOT | this_BAND_16= RULE_BAND | this_BOR_17= RULE_BOR | this_HASH_18= RULE_HASH | this_AT_19= RULE_AT | this_CARET_20= RULE_CARET | this_EQUALS_21= RULE_EQUALS | this_LESS_THAN_22= RULE_LESS_THAN | this_MORE_THAN_23= RULE_MORE_THAN | this_PERCENT_24= RULE_PERCENT | this_AND_25= RULE_AND | this_OR_26= RULE_OR | this_ESC_CHAR_27= RULE_ESC_CHAR )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5506:1: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COLON_5= RULE_COLON | this_STRING_6= RULE_STRING | this_COMMA_7= RULE_COMMA | this_MINUS_8= RULE_MINUS | this_PLUS_9= RULE_PLUS | this_LPAREN_10= RULE_LPAREN | this_RPAREN_11= RULE_RPAREN | this_LBRACE_12= RULE_LBRACE | this_RBRACE_13= RULE_RBRACE | this_QUESTI_14= RULE_QUESTI | this_NOT_15= RULE_NOT | this_BAND_16= RULE_BAND | this_BOR_17= RULE_BOR | this_HASH_18= RULE_HASH | this_AT_19= RULE_AT | this_CARET_20= RULE_CARET | this_EQUALS_21= RULE_EQUALS | this_LESS_THAN_22= RULE_LESS_THAN | this_MORE_THAN_23= RULE_MORE_THAN | this_PERCENT_24= RULE_PERCENT | this_AND_25= RULE_AND | this_OR_26= RULE_OR | this_ESC_CHAR_27= RULE_ESC_CHAR )+
            int cnt95=0;
            loop95:
            do {
                int alt95=29;
                switch ( input.LA(1) ) {
                case RULE_REST:
                    {
                    alt95=1;
                    }
                    break;
                case RULE_IDENT_DOT:
                    {
                    alt95=2;
                    }
                    break;
                case RULE_IDENT:
                    {
                    alt95=3;
                    }
                    break;
                case RULE_NUMBER:
                    {
                    alt95=4;
                    }
                    break;
                case RULE_WS:
                    {
                    alt95=5;
                    }
                    break;
                case RULE_COLON:
                    {
                    alt95=6;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt95=7;
                    }
                    break;
                case RULE_COMMA:
                    {
                    alt95=8;
                    }
                    break;
                case RULE_MINUS:
                    {
                    alt95=9;
                    }
                    break;
                case RULE_PLUS:
                    {
                    alt95=10;
                    }
                    break;
                case RULE_LPAREN:
                    {
                    alt95=11;
                    }
                    break;
                case RULE_RPAREN:
                    {
                    alt95=12;
                    }
                    break;
                case RULE_LBRACE:
                    {
                    alt95=13;
                    }
                    break;
                case RULE_RBRACE:
                    {
                    alt95=14;
                    }
                    break;
                case RULE_QUESTI:
                    {
                    alt95=15;
                    }
                    break;
                case RULE_NOT:
                    {
                    alt95=16;
                    }
                    break;
                case RULE_BAND:
                    {
                    alt95=17;
                    }
                    break;
                case RULE_BOR:
                    {
                    alt95=18;
                    }
                    break;
                case RULE_HASH:
                    {
                    alt95=19;
                    }
                    break;
                case RULE_AT:
                    {
                    alt95=20;
                    }
                    break;
                case RULE_CARET:
                    {
                    alt95=21;
                    }
                    break;
                case RULE_EQUALS:
                    {
                    alt95=22;
                    }
                    break;
                case RULE_LESS_THAN:
                    {
                    alt95=23;
                    }
                    break;
                case RULE_MORE_THAN:
                    {
                    alt95=24;
                    }
                    break;
                case RULE_PERCENT:
                    {
                    alt95=25;
                    }
                    break;
                case RULE_AND:
                    {
                    alt95=26;
                    }
                    break;
                case RULE_OR:
                    {
                    alt95=27;
                    }
                    break;
                case RULE_ESC_CHAR:
                    {
                    alt95=28;
                    }
                    break;

                }

                switch (alt95) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5506:6: this_REST_0= RULE_REST
            	    {
            	    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleFeatureValue13228); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_REST_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_REST_0, grammarAccess.getFeatureValueAccess().getRESTTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5514:10: this_IDENT_DOT_1= RULE_IDENT_DOT
            	    {
            	    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleFeatureValue13254); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_IDENT_DOT_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_IDENT_DOT_1, grammarAccess.getFeatureValueAccess().getIDENT_DOTTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5522:10: this_IDENT_2= RULE_IDENT
            	    {
            	    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleFeatureValue13280); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_IDENT_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_IDENT_2, grammarAccess.getFeatureValueAccess().getIDENTTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5530:10: this_NUMBER_3= RULE_NUMBER
            	    {
            	    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleFeatureValue13306); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_NUMBER_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_NUMBER_3, grammarAccess.getFeatureValueAccess().getNUMBERTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5538:10: this_WS_4= RULE_WS
            	    {
            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleFeatureValue13332); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WS_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_4, grammarAccess.getFeatureValueAccess().getWSTerminalRuleCall_4()); 
            	          
            	    }

            	    }
            	    break;
            	case 6 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5546:10: this_COLON_5= RULE_COLON
            	    {
            	    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleFeatureValue13358); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COLON_5);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COLON_5, grammarAccess.getFeatureValueAccess().getCOLONTerminalRuleCall_5()); 
            	          
            	    }

            	    }
            	    break;
            	case 7 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5554:10: this_STRING_6= RULE_STRING
            	    {
            	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureValue13384); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_STRING_6);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_STRING_6, grammarAccess.getFeatureValueAccess().getSTRINGTerminalRuleCall_6()); 
            	          
            	    }

            	    }
            	    break;
            	case 8 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5562:10: this_COMMA_7= RULE_COMMA
            	    {
            	    this_COMMA_7=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleFeatureValue13410); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COMMA_7);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_7, grammarAccess.getFeatureValueAccess().getCOMMATerminalRuleCall_7()); 
            	          
            	    }

            	    }
            	    break;
            	case 9 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5570:10: this_MINUS_8= RULE_MINUS
            	    {
            	    this_MINUS_8=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleFeatureValue13436); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_MINUS_8);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_MINUS_8, grammarAccess.getFeatureValueAccess().getMINUSTerminalRuleCall_8()); 
            	          
            	    }

            	    }
            	    break;
            	case 10 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5578:10: this_PLUS_9= RULE_PLUS
            	    {
            	    this_PLUS_9=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleFeatureValue13462); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PLUS_9);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_PLUS_9, grammarAccess.getFeatureValueAccess().getPLUSTerminalRuleCall_9()); 
            	          
            	    }

            	    }
            	    break;
            	case 11 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5586:10: this_LPAREN_10= RULE_LPAREN
            	    {
            	    this_LPAREN_10=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleFeatureValue13488); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LPAREN_10);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LPAREN_10, grammarAccess.getFeatureValueAccess().getLPARENTerminalRuleCall_10()); 
            	          
            	    }

            	    }
            	    break;
            	case 12 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5594:10: this_RPAREN_11= RULE_RPAREN
            	    {
            	    this_RPAREN_11=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleFeatureValue13514); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_RPAREN_11);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_RPAREN_11, grammarAccess.getFeatureValueAccess().getRPARENTerminalRuleCall_11()); 
            	          
            	    }

            	    }
            	    break;
            	case 13 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5602:10: this_LBRACE_12= RULE_LBRACE
            	    {
            	    this_LBRACE_12=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleFeatureValue13540); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LBRACE_12);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LBRACE_12, grammarAccess.getFeatureValueAccess().getLBRACETerminalRuleCall_12()); 
            	          
            	    }

            	    }
            	    break;
            	case 14 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5610:10: this_RBRACE_13= RULE_RBRACE
            	    {
            	    this_RBRACE_13=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleFeatureValue13566); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_RBRACE_13);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_RBRACE_13, grammarAccess.getFeatureValueAccess().getRBRACETerminalRuleCall_13()); 
            	          
            	    }

            	    }
            	    break;
            	case 15 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5618:10: this_QUESTI_14= RULE_QUESTI
            	    {
            	    this_QUESTI_14=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleFeatureValue13592); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_QUESTI_14);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_QUESTI_14, grammarAccess.getFeatureValueAccess().getQUESTITerminalRuleCall_14()); 
            	          
            	    }

            	    }
            	    break;
            	case 16 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5626:10: this_NOT_15= RULE_NOT
            	    {
            	    this_NOT_15=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleFeatureValue13618); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_NOT_15);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_NOT_15, grammarAccess.getFeatureValueAccess().getNOTTerminalRuleCall_15()); 
            	          
            	    }

            	    }
            	    break;
            	case 17 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5634:10: this_BAND_16= RULE_BAND
            	    {
            	    this_BAND_16=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleFeatureValue13644); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_BAND_16);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_BAND_16, grammarAccess.getFeatureValueAccess().getBANDTerminalRuleCall_16()); 
            	          
            	    }

            	    }
            	    break;
            	case 18 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5642:10: this_BOR_17= RULE_BOR
            	    {
            	    this_BOR_17=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleFeatureValue13670); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_BOR_17);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_BOR_17, grammarAccess.getFeatureValueAccess().getBORTerminalRuleCall_17()); 
            	          
            	    }

            	    }
            	    break;
            	case 19 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5650:10: this_HASH_18= RULE_HASH
            	    {
            	    this_HASH_18=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleFeatureValue13696); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_HASH_18);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_HASH_18, grammarAccess.getFeatureValueAccess().getHASHTerminalRuleCall_18()); 
            	          
            	    }

            	    }
            	    break;
            	case 20 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5658:10: this_AT_19= RULE_AT
            	    {
            	    this_AT_19=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleFeatureValue13722); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_AT_19);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_AT_19, grammarAccess.getFeatureValueAccess().getATTerminalRuleCall_19()); 
            	          
            	    }

            	    }
            	    break;
            	case 21 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5666:10: this_CARET_20= RULE_CARET
            	    {
            	    this_CARET_20=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleFeatureValue13748); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_CARET_20);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_CARET_20, grammarAccess.getFeatureValueAccess().getCARETTerminalRuleCall_20()); 
            	          
            	    }

            	    }
            	    break;
            	case 22 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5674:10: this_EQUALS_21= RULE_EQUALS
            	    {
            	    this_EQUALS_21=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleFeatureValue13774); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_EQUALS_21);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_EQUALS_21, grammarAccess.getFeatureValueAccess().getEQUALSTerminalRuleCall_21()); 
            	          
            	    }

            	    }
            	    break;
            	case 23 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5682:10: this_LESS_THAN_22= RULE_LESS_THAN
            	    {
            	    this_LESS_THAN_22=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleFeatureValue13800); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LESS_THAN_22);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LESS_THAN_22, grammarAccess.getFeatureValueAccess().getLESS_THANTerminalRuleCall_22()); 
            	          
            	    }

            	    }
            	    break;
            	case 24 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5690:10: this_MORE_THAN_23= RULE_MORE_THAN
            	    {
            	    this_MORE_THAN_23=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleFeatureValue13826); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_MORE_THAN_23);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_MORE_THAN_23, grammarAccess.getFeatureValueAccess().getMORE_THANTerminalRuleCall_23()); 
            	          
            	    }

            	    }
            	    break;
            	case 25 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5698:10: this_PERCENT_24= RULE_PERCENT
            	    {
            	    this_PERCENT_24=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleFeatureValue13852); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PERCENT_24);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_PERCENT_24, grammarAccess.getFeatureValueAccess().getPERCENTTerminalRuleCall_24()); 
            	          
            	    }

            	    }
            	    break;
            	case 26 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5706:10: this_AND_25= RULE_AND
            	    {
            	    this_AND_25=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleFeatureValue13878); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_AND_25);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_AND_25, grammarAccess.getFeatureValueAccess().getANDTerminalRuleCall_25()); 
            	          
            	    }

            	    }
            	    break;
            	case 27 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5714:10: this_OR_26= RULE_OR
            	    {
            	    this_OR_26=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleFeatureValue13904); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_OR_26);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_OR_26, grammarAccess.getFeatureValueAccess().getORTerminalRuleCall_26()); 
            	          
            	    }

            	    }
            	    break;
            	case 28 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5722:10: this_ESC_CHAR_27= RULE_ESC_CHAR
            	    {
            	    this_ESC_CHAR_27=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleFeatureValue13930); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ESC_CHAR_27);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ESC_CHAR_27, grammarAccess.getFeatureValueAccess().getESC_CHARTerminalRuleCall_27()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt95 >= 1 ) break loop95;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(95, input);
                        throw eee;
                }
                cnt95++;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5737:1: ruleSTATEMEN_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'QRY' ) | (enumLiteral_1= 'CRUD' ) | (enumLiteral_2= 'CALL' ) ) ;
    public final Enumerator ruleSTATEMEN_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5739:28: ( ( (enumLiteral_0= 'QRY' ) | (enumLiteral_1= 'CRUD' ) | (enumLiteral_2= 'CALL' ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5740:1: ( (enumLiteral_0= 'QRY' ) | (enumLiteral_1= 'CRUD' ) | (enumLiteral_2= 'CALL' ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5740:1: ( (enumLiteral_0= 'QRY' ) | (enumLiteral_1= 'CRUD' ) | (enumLiteral_2= 'CALL' ) )
            int alt96=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt96=1;
                }
                break;
            case 53:
                {
                alt96=2;
                }
                break;
            case 54:
                {
                alt96=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5740:2: (enumLiteral_0= 'QRY' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5740:2: (enumLiteral_0= 'QRY' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5740:4: enumLiteral_0= 'QRY'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_52_in_ruleSTATEMEN_TYPE13990); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSTATEMEN_TYPEAccess().getQRYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSTATEMEN_TYPEAccess().getQRYEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5746:6: (enumLiteral_1= 'CRUD' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5746:6: (enumLiteral_1= 'CRUD' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5746:8: enumLiteral_1= 'CRUD'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_53_in_ruleSTATEMEN_TYPE14007); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSTATEMEN_TYPEAccess().getCRUDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSTATEMEN_TYPEAccess().getCRUDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5752:6: (enumLiteral_2= 'CALL' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5752:6: (enumLiteral_2= 'CALL' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5752:8: enumLiteral_2= 'CALL'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_54_in_ruleSTATEMEN_TYPE14024); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5762:1: ruleMAPPING_TYPE returns [Enumerator current=null] : (enumLiteral_0= 'OUT' ) ;
    public final Enumerator ruleMAPPING_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5764:28: ( (enumLiteral_0= 'OUT' ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5765:1: (enumLiteral_0= 'OUT' )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5765:1: (enumLiteral_0= 'OUT' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5765:3: enumLiteral_0= 'OUT'
            {
            enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleMAPPING_TYPE14068); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5775:1: ruleOPTION_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'OPT' ) | (enumLiteral_1= 'LOPT' ) | (enumLiteral_2= 'IOPT' ) | (enumLiteral_3= 'SOPT' ) | (enumLiteral_4= 'BOPT' ) ) ;
    public final Enumerator ruleOPTION_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5777:28: ( ( (enumLiteral_0= 'OPT' ) | (enumLiteral_1= 'LOPT' ) | (enumLiteral_2= 'IOPT' ) | (enumLiteral_3= 'SOPT' ) | (enumLiteral_4= 'BOPT' ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5778:1: ( (enumLiteral_0= 'OPT' ) | (enumLiteral_1= 'LOPT' ) | (enumLiteral_2= 'IOPT' ) | (enumLiteral_3= 'SOPT' ) | (enumLiteral_4= 'BOPT' ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5778:1: ( (enumLiteral_0= 'OPT' ) | (enumLiteral_1= 'LOPT' ) | (enumLiteral_2= 'IOPT' ) | (enumLiteral_3= 'SOPT' ) | (enumLiteral_4= 'BOPT' ) )
            int alt97=5;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt97=1;
                }
                break;
            case 57:
                {
                alt97=2;
                }
                break;
            case 58:
                {
                alt97=3;
                }
                break;
            case 59:
                {
                alt97=4;
                }
                break;
            case 60:
                {
                alt97=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5778:2: (enumLiteral_0= 'OPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5778:2: (enumLiteral_0= 'OPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5778:4: enumLiteral_0= 'OPT'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleOPTION_TYPE14112); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getOPTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOPTION_TYPEAccess().getOPTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5784:6: (enumLiteral_1= 'LOPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5784:6: (enumLiteral_1= 'LOPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5784:8: enumLiteral_1= 'LOPT'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_57_in_ruleOPTION_TYPE14129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getLOPTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOPTION_TYPEAccess().getLOPTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5790:6: (enumLiteral_2= 'IOPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5790:6: (enumLiteral_2= 'IOPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5790:8: enumLiteral_2= 'IOPT'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_58_in_ruleOPTION_TYPE14146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getIOPTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOPTION_TYPEAccess().getIOPTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5796:6: (enumLiteral_3= 'SOPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5796:6: (enumLiteral_3= 'SOPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5796:8: enumLiteral_3= 'SOPT'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_59_in_ruleOPTION_TYPE14163); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getSOPTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getOPTION_TYPEAccess().getSOPTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5802:6: (enumLiteral_4= 'BOPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5802:6: (enumLiteral_4= 'BOPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:5802:8: enumLiteral_4= 'BOPT'
                    {
                    enumLiteral_4=(Token)match(input,60,FOLLOW_60_in_ruleOPTION_TYPE14180); if (state.failed) return current;
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
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:818:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:818:4: ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR )
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
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2157:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2157:4: ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR )
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
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3119:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3119:4: ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR )
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
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4202:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4202:4: ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR )
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
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4497:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4497:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred5_InternalProcessorDsl11349); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalProcessorDsl

    // $ANTLR start synpred6_InternalProcessorDsl
    public final void synpred6_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4519:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4519:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred6_InternalProcessorDsl11389); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalProcessorDsl

    // $ANTLR start synpred7_InternalProcessorDsl
    public final void synpred7_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4652:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4652:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred7_InternalProcessorDsl11624); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalProcessorDsl

    // $ANTLR start synpred8_InternalProcessorDsl
    public final void synpred8_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4674:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4674:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred8_InternalProcessorDsl11664); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalProcessorDsl

    // $ANTLR start synpred9_InternalProcessorDsl
    public final void synpred9_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4873:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4873:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred9_InternalProcessorDsl11987); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalProcessorDsl

    // $ANTLR start synpred10_InternalProcessorDsl
    public final void synpred10_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4895:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4895:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred10_InternalProcessorDsl12027); if (state.failed) return ;

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
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA85 dfa85 = new DFA85(this);
    static final String DFA10_eotS =
        "\14\uffff";
    static final String DFA10_eofS =
        "\1\1\13\uffff";
    static final String DFA10_minS =
        "\1\10\1\uffff\1\17\5\uffff\1\64\3\uffff";
    static final String DFA10_maxS =
        "\1\62\1\uffff\1\17\5\uffff\1\74\3\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\11\1\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\1\3\1\1\1\2";
    static final String DFA10_specialS =
        "\14\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\32\uffff\1\5\2\uffff\6\5\1\3\4\4\1\6\1\7",
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
    static final String DFA23_eotS =
        "\36\uffff";
    static final String DFA23_eofS =
        "\1\1\35\uffff";
    static final String DFA23_minS =
        "\1\4\35\uffff";
    static final String DFA23_maxS =
        "\1\40\35\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\2\34\1";
    static final String DFA23_specialS =
        "\1\0\35\uffff}>";
    static final String[] DFA23_transitionS = {
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

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "()* loopback of 818:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_27= RULE_REST | this_IDENT_DOT_28= RULE_IDENT_DOT | this_IDENT_29= RULE_IDENT | this_NUMBER_30= RULE_NUMBER | this_WS_31= RULE_WS | this_COLON_32= RULE_COLON | this_STRING_33= RULE_STRING | this_COMMA_34= RULE_COMMA | this_MINUS_35= RULE_MINUS | this_PLUS_36= RULE_PLUS | this_LPAREN_37= RULE_LPAREN | this_RPAREN_38= RULE_RPAREN | this_LBRACE_39= RULE_LBRACE | this_RBRACE_40= RULE_RBRACE | this_QUESTI_41= RULE_QUESTI | this_NOT_42= RULE_NOT | this_BAND_43= RULE_BAND | this_BOR_44= RULE_BOR | this_HASH_45= RULE_HASH | this_AT_46= RULE_AT | this_CARET_47= RULE_CARET | this_EQUALS_48= RULE_EQUALS | this_LESS_THAN_49= RULE_LESS_THAN | this_MORE_THAN_50= RULE_MORE_THAN | this_PERCENT_51= RULE_PERCENT | this_AND_52= RULE_AND | this_OR_53= RULE_OR | this_ESC_CHAR_54= RULE_ESC_CHAR ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                         
                        int index23_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA23_0==EOF||LA23_0==RULE_SEMICOLON) ) {s = 1;}

                        else if ( (LA23_0==RULE_REST) && (synpred1_InternalProcessorDsl())) {s = 2;}

                        else if ( (LA23_0==RULE_IDENT_DOT) && (synpred1_InternalProcessorDsl())) {s = 3;}

                        else if ( (LA23_0==RULE_IDENT) && (synpred1_InternalProcessorDsl())) {s = 4;}

                        else if ( (LA23_0==RULE_NUMBER) && (synpred1_InternalProcessorDsl())) {s = 5;}

                        else if ( (LA23_0==RULE_WS) && (synpred1_InternalProcessorDsl())) {s = 6;}

                        else if ( (LA23_0==RULE_COLON) && (synpred1_InternalProcessorDsl())) {s = 7;}

                        else if ( (LA23_0==RULE_STRING) && (synpred1_InternalProcessorDsl())) {s = 8;}

                        else if ( (LA23_0==RULE_COMMA) && (synpred1_InternalProcessorDsl())) {s = 9;}

                        else if ( (LA23_0==RULE_MINUS) && (synpred1_InternalProcessorDsl())) {s = 10;}

                        else if ( (LA23_0==RULE_PLUS) && (synpred1_InternalProcessorDsl())) {s = 11;}

                        else if ( (LA23_0==RULE_LPAREN) && (synpred1_InternalProcessorDsl())) {s = 12;}

                        else if ( (LA23_0==RULE_RPAREN) && (synpred1_InternalProcessorDsl())) {s = 13;}

                        else if ( (LA23_0==RULE_LBRACE) && (synpred1_InternalProcessorDsl())) {s = 14;}

                        else if ( (LA23_0==RULE_RBRACE) && (synpred1_InternalProcessorDsl())) {s = 15;}

                        else if ( (LA23_0==RULE_QUESTI) && (synpred1_InternalProcessorDsl())) {s = 16;}

                        else if ( (LA23_0==RULE_NOT) && (synpred1_InternalProcessorDsl())) {s = 17;}

                        else if ( (LA23_0==RULE_BAND) && (synpred1_InternalProcessorDsl())) {s = 18;}

                        else if ( (LA23_0==RULE_BOR) && (synpred1_InternalProcessorDsl())) {s = 19;}

                        else if ( (LA23_0==RULE_HASH) && (synpred1_InternalProcessorDsl())) {s = 20;}

                        else if ( (LA23_0==RULE_AT) && (synpred1_InternalProcessorDsl())) {s = 21;}

                        else if ( (LA23_0==RULE_CARET) && (synpred1_InternalProcessorDsl())) {s = 22;}

                        else if ( (LA23_0==RULE_EQUALS) && (synpred1_InternalProcessorDsl())) {s = 23;}

                        else if ( (LA23_0==RULE_LESS_THAN) && (synpred1_InternalProcessorDsl())) {s = 24;}

                        else if ( (LA23_0==RULE_MORE_THAN) && (synpred1_InternalProcessorDsl())) {s = 25;}

                        else if ( (LA23_0==RULE_PERCENT) && (synpred1_InternalProcessorDsl())) {s = 26;}

                        else if ( (LA23_0==RULE_AND) && (synpred1_InternalProcessorDsl())) {s = 27;}

                        else if ( (LA23_0==RULE_OR) && (synpred1_InternalProcessorDsl())) {s = 28;}

                        else if ( (LA23_0==RULE_ESC_CHAR) && (synpred1_InternalProcessorDsl())) {s = 29;}

                         
                        input.seek(index23_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\32\uffff";
    static final String DFA31_eofS =
        "\1\1\31\uffff";
    static final String DFA31_minS =
        "\1\4\1\uffff\27\0\1\uffff";
    static final String DFA31_maxS =
        "\1\40\1\uffff\27\0\1\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\2\27\uffff\1\1";
    static final String DFA31_specialS =
        "\2\uffff\1\17\1\6\1\26\1\12\1\15\1\1\1\16\1\0\1\11\1\2\1\20\1\4"+
        "\1\24\1\13\1\22\1\7\1\10\1\23\1\14\1\25\1\5\1\21\1\3\1\uffff}>";
    static final String[] DFA31_transitionS = {
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

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "()* loopback of 2157:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_RBRACE_33= RULE_RBRACE | this_QUESTI_34= RULE_QUESTI | this_NOT_35= RULE_NOT | this_BAND_36= RULE_BAND | this_BOR_37= RULE_BOR | this_HASH_38= RULE_HASH | this_CARET_39= RULE_CARET | this_EQUALS_40= RULE_EQUALS | this_LESS_THAN_41= RULE_LESS_THAN | this_MORE_THAN_42= RULE_MORE_THAN | this_AND_43= RULE_AND | this_OR_44= RULE_OR | this_ESC_CHAR_45= RULE_ESC_CHAR ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_9 = input.LA(1);

                         
                        int index31_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_7 = input.LA(1);

                         
                        int index31_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_11 = input.LA(1);

                         
                        int index31_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_24 = input.LA(1);

                         
                        int index31_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_24);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_13 = input.LA(1);

                         
                        int index31_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_13);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_22 = input.LA(1);

                         
                        int index31_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_22);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_3 = input.LA(1);

                         
                        int index31_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_3);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA31_17 = input.LA(1);

                         
                        int index31_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_17);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA31_18 = input.LA(1);

                         
                        int index31_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_18);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA31_10 = input.LA(1);

                         
                        int index31_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA31_5 = input.LA(1);

                         
                        int index31_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_5);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA31_15 = input.LA(1);

                         
                        int index31_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_15);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA31_20 = input.LA(1);

                         
                        int index31_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_20);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA31_8 = input.LA(1);

                         
                        int index31_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_8);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA31_2 = input.LA(1);

                         
                        int index31_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_2);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA31_12 = input.LA(1);

                         
                        int index31_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_12);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA31_23 = input.LA(1);

                         
                        int index31_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_23);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA31_16 = input.LA(1);

                         
                        int index31_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_16);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA31_19 = input.LA(1);

                         
                        int index31_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_19);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA31_14 = input.LA(1);

                         
                        int index31_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_14);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA31_21 = input.LA(1);

                         
                        int index31_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_21);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA31_4 = input.LA(1);

                         
                        int index31_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA42_eotS =
        "\31\uffff";
    static final String DFA42_eofS =
        "\1\1\30\uffff";
    static final String DFA42_minS =
        "\1\4\1\uffff\26\0\1\uffff";
    static final String DFA42_maxS =
        "\1\40\1\uffff\26\0\1\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\2\26\uffff\1\1";
    static final String DFA42_specialS =
        "\2\uffff\1\6\1\25\1\10\1\22\1\0\1\13\1\4\1\20\1\14\1\1\1\15\1\3"+
        "\1\17\1\16\1\2\1\12\1\21\1\5\1\24\1\7\1\23\1\11\1\uffff}>";
    static final String[] DFA42_transitionS = {
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

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "()* loopback of 3119:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_22= RULE_REST | this_IDENT_DOT_23= RULE_IDENT_DOT | this_IDENT_24= RULE_IDENT | this_NUMBER_25= RULE_NUMBER | this_WS_26= RULE_WS | this_SEMICOLON_27= RULE_SEMICOLON | this_COMMA_28= RULE_COMMA | this_MINUS_29= RULE_MINUS | this_PLUS_30= RULE_PLUS | this_LPAREN_31= RULE_LPAREN | this_RPAREN_32= RULE_RPAREN | this_QUESTI_33= RULE_QUESTI | this_NOT_34= RULE_NOT | this_BAND_35= RULE_BAND | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_AND_41= RULE_AND | this_OR_42= RULE_OR | this_ESC_CHAR_43= RULE_ESC_CHAR ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_6 = input.LA(1);

                         
                        int index42_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_11 = input.LA(1);

                         
                        int index42_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA42_16 = input.LA(1);

                         
                        int index42_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA42_13 = input.LA(1);

                         
                        int index42_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA42_8 = input.LA(1);

                         
                        int index42_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA42_19 = input.LA(1);

                         
                        int index42_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_19);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA42_2 = input.LA(1);

                         
                        int index42_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_2);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA42_21 = input.LA(1);

                         
                        int index42_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_21);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA42_4 = input.LA(1);

                         
                        int index42_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_4);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA42_23 = input.LA(1);

                         
                        int index42_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_23);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA42_17 = input.LA(1);

                         
                        int index42_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_17);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA42_7 = input.LA(1);

                         
                        int index42_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_7);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA42_10 = input.LA(1);

                         
                        int index42_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_10);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA42_12 = input.LA(1);

                         
                        int index42_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_12);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA42_15 = input.LA(1);

                         
                        int index42_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA42_14 = input.LA(1);

                         
                        int index42_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_14);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA42_9 = input.LA(1);

                         
                        int index42_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_9);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA42_18 = input.LA(1);

                         
                        int index42_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA42_5 = input.LA(1);

                         
                        int index42_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_5);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA42_22 = input.LA(1);

                         
                        int index42_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_22);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA42_20 = input.LA(1);

                         
                        int index42_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_20);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA42_3 = input.LA(1);

                         
                        int index42_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA62_eotS =
        "\34\uffff";
    static final String DFA62_eofS =
        "\1\1\33\uffff";
    static final String DFA62_minS =
        "\1\4\1\uffff\31\0\1\uffff";
    static final String DFA62_maxS =
        "\1\40\1\uffff\31\0\1\uffff";
    static final String DFA62_acceptS =
        "\1\uffff\1\2\31\uffff\1\1";
    static final String DFA62_specialS =
        "\2\uffff\1\11\1\26\1\6\1\23\1\10\1\30\1\4\1\16\1\0\1\14\1\13\1\2"+
        "\1\15\1\1\1\27\1\12\1\22\1\17\1\24\1\5\1\21\1\7\1\20\1\3\1\25\1"+
        "\uffff}>";
    static final String[] DFA62_transitionS = {
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

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "()* loopback of 4202:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_AND | RULE_OR | RULE_ESC_CHAR ) )=> (this_REST_25= RULE_REST | this_IDENT_DOT_26= RULE_IDENT_DOT | this_IDENT_27= RULE_IDENT | this_NUMBER_28= RULE_NUMBER | this_WS_29= RULE_WS | this_SEMICOLON_30= RULE_SEMICOLON | this_COMMA_31= RULE_COMMA | this_MINUS_32= RULE_MINUS | this_PLUS_33= RULE_PLUS | this_LPAREN_34= RULE_LPAREN | this_RPAREN_35= RULE_RPAREN | this_LBRACE_36= RULE_LBRACE | this_QUESTI_37= RULE_QUESTI | this_NOT_38= RULE_NOT | this_BAND_39= RULE_BAND | this_BOR_40= RULE_BOR | this_HASH_41= RULE_HASH | this_AT_42= RULE_AT | this_CARET_43= RULE_CARET | this_EQUALS_44= RULE_EQUALS | this_LESS_THAN_45= RULE_LESS_THAN | this_MORE_THAN_46= RULE_MORE_THAN | this_AND_47= RULE_AND | this_OR_48= RULE_OR | this_ESC_CHAR_49= RULE_ESC_CHAR ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_10 = input.LA(1);

                         
                        int index62_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA62_15 = input.LA(1);

                         
                        int index62_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA62_13 = input.LA(1);

                         
                        int index62_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA62_25 = input.LA(1);

                         
                        int index62_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_25);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA62_8 = input.LA(1);

                         
                        int index62_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA62_21 = input.LA(1);

                         
                        int index62_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_21);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA62_4 = input.LA(1);

                         
                        int index62_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA62_23 = input.LA(1);

                         
                        int index62_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_23);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA62_6 = input.LA(1);

                         
                        int index62_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_6);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA62_2 = input.LA(1);

                         
                        int index62_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_2);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA62_17 = input.LA(1);

                         
                        int index62_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_17);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA62_12 = input.LA(1);

                         
                        int index62_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA62_11 = input.LA(1);

                         
                        int index62_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_11);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA62_14 = input.LA(1);

                         
                        int index62_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA62_9 = input.LA(1);

                         
                        int index62_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_9);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA62_19 = input.LA(1);

                         
                        int index62_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_19);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA62_24 = input.LA(1);

                         
                        int index62_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_24);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA62_22 = input.LA(1);

                         
                        int index62_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_22);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA62_18 = input.LA(1);

                         
                        int index62_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_18);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA62_5 = input.LA(1);

                         
                        int index62_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_5);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA62_20 = input.LA(1);

                         
                        int index62_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_20);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA62_26 = input.LA(1);

                         
                        int index62_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_26);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA62_3 = input.LA(1);

                         
                        int index62_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_3);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA62_16 = input.LA(1);

                         
                        int index62_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_16);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA62_7 = input.LA(1);

                         
                        int index62_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalProcessorDsl()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA85_eotS =
        "\4\uffff";
    static final String DFA85_eofS =
        "\2\2\2\uffff";
    static final String DFA85_minS =
        "\2\4\2\uffff";
    static final String DFA85_maxS =
        "\1\5\1\11\2\uffff";
    static final String DFA85_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA85_specialS =
        "\4\uffff}>";
    static final String[] DFA85_transitionS = {
            "\1\1\1\2",
            "\1\1\1\2\2\uffff\2\3",
            "",
            ""
    };

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "()* loopback of 5148:2: ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleArtifacts_in_entryRuleArtifacts75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtifacts85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts122 = new BitSet(new long[]{0x0007FFC800000110L});
    public static final BitSet FOLLOW_ruleOptionalFeature_in_ruleArtifacts146 = new BitSet(new long[]{0x0007FFC800000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts158 = new BitSet(new long[]{0x0007FFC800000112L});
    public static final BitSet FOLLOW_ruleMetaStatement_in_ruleArtifacts188 = new BitSet(new long[]{0x0007FFC800000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts200 = new BitSet(new long[]{0x0007FFC800000112L});
    public static final BitSet FOLLOW_ruleMappingRule_in_ruleArtifacts230 = new BitSet(new long[]{0x0007FFC800000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts242 = new BitSet(new long[]{0x0007FFC800000112L});
    public static final BitSet FOLLOW_rulePojoDefinition_in_ruleArtifacts272 = new BitSet(new long[]{0x0007FFC800000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts284 = new BitSet(new long[]{0x0007FFC800000112L});
    public static final BitSet FOLLOW_rulePojoUsage_in_ruleArtifacts314 = new BitSet(new long[]{0x0007FFC800000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts326 = new BitSet(new long[]{0x0007FFC800000112L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleArtifacts356 = new BitSet(new long[]{0x0007FFC800000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts368 = new BitSet(new long[]{0x0007FFC800000112L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_ruleArtifacts398 = new BitSet(new long[]{0x0007FFC800000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts410 = new BitSet(new long[]{0x0007FFC800000112L});
    public static final BitSet FOLLOW_ruleTableUsage_in_ruleArtifacts440 = new BitSet(new long[]{0x0007FFC800000112L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts452 = new BitSet(new long[]{0x0007FFC800000112L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleProperty547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty572 = new BitSet(new long[]{0x0000003000000010L});
    public static final BitSet FOLLOW_36_in_ruleProperty593 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_37_in_ruleProperty622 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_38_in_ruleProperty664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty689 = new BitSet(new long[]{0x0000003000000010L});
    public static final BitSet FOLLOW_36_in_ruleProperty710 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_37_in_ruleProperty739 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_39_in_ruleProperty781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty806 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty828 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_40_in_ruleProperty854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty879 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty901 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_41_in_ruleProperty927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty952 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty974 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_42_in_ruleProperty1000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty1025 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty1047 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_43_in_ruleProperty1073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleProperty1098 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty1120 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleProperty1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValue_in_entryRulePropertyValue1169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValue1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_rulePropertyValue1221 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_rulePropertyValue1247 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePropertyValue1273 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rulePropertyValue1299 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulePropertyValue1325 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyValue1351 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rulePropertyValue1377 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_rulePropertyValue1403 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rulePropertyValue1429 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rulePropertyValue1455 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rulePropertyValue1481 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rulePropertyValue1507 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rulePropertyValue1533 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_rulePropertyValue1559 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_NOT_in_rulePropertyValue1585 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_BAND_in_rulePropertyValue1611 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_BOR_in_rulePropertyValue1637 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_HASH_in_rulePropertyValue1663 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_AT_in_rulePropertyValue1689 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_CARET_in_rulePropertyValue1715 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_rulePropertyValue1741 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_rulePropertyValue1767 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_rulePropertyValue1793 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_rulePropertyValue1819 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_AND_in_rulePropertyValue1845 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_OR_in_rulePropertyValue1871 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_rulePropertyValue1897 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_REST_in_rulePropertyValue2115 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_rulePropertyValue2141 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePropertyValue2167 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rulePropertyValue2193 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_WS_in_rulePropertyValue2219 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulePropertyValue2245 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyValue2271 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rulePropertyValue2297 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_rulePropertyValue2323 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rulePropertyValue2349 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rulePropertyValue2375 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rulePropertyValue2401 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rulePropertyValue2427 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rulePropertyValue2453 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_rulePropertyValue2479 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_NOT_in_rulePropertyValue2505 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_BAND_in_rulePropertyValue2531 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_BOR_in_rulePropertyValue2557 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_HASH_in_rulePropertyValue2583 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_AT_in_rulePropertyValue2609 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_CARET_in_rulePropertyValue2635 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_rulePropertyValue2661 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_rulePropertyValue2687 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_rulePropertyValue2713 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_rulePropertyValue2739 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_AND_in_rulePropertyValue2765 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_OR_in_rulePropertyValue2791 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_rulePropertyValue2817 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_rulePojoDefinition_in_entryRulePojoDefinition2871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePojoDefinition2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePojoDefinition2922 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePojoDefinition2939 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulePojoDefinition2963 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_rulePojoDefinition2983 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_rulePojoDefinition3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePojoUsage_in_entryRulePojoUsage3041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePojoUsage3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnUsage_in_rulePojoUsage3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierUsage_in_rulePojoUsage3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantUsage_in_rulePojoUsage3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingUsage_in_rulePojoUsage3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnUsage_in_entryRuleColumnUsage3220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnUsage3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleColumnUsage3271 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumnUsage3291 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumnUsage3311 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleColumnUsage3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierUsage_in_entryRuleIdentifierUsage3367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifierUsage3377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleIdentifierUsage3418 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifierUsage3438 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifierUsage3458 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleIdentifierUsage3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantUsage_in_entryRuleConstantUsage3514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantUsage3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleConstantUsage3565 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstantUsage3585 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstantUsage3605 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleConstantUsage3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingUsage_in_entryRuleMappingUsage3661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingUsage3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleMappingUsage3712 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingUsage3732 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingUsage3752 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleMappingUsage3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDefinition_in_entryRuleTableDefinition3808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableDefinition3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTableDefinition3859 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTableDefinition3876 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTableDefinition3898 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleTableDefinition3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableUsage_in_entryRuleTableUsage3959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableUsage3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTableUsage4010 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTableUsage4030 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTableUsage4050 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleTableUsage4062 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleTableUsage4079 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleTableUsage4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaStatement_in_entryRuleMetaStatement4134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaStatement4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMetaStatement4186 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleMetaStatement4202 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_ruleSTATEMEN_TYPE_in_ruleMetaStatement4222 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleMetaStatement4234 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMetaStatement4250 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleMetaStatement4268 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMetaStatement4278 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_ruleSql_in_ruleMetaStatement4298 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleMetaStatement4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSql_in_entryRuleSql4344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSql4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlFragment_in_ruleSql4399 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_ruleSqlFragment_in_entryRuleSqlFragment4435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlFragment4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlValue_in_ruleSqlFragment4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleSqlFragment4509 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_ruleColumn_in_ruleSqlFragment4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSqlFragment4548 = new BitSet(new long[]{0x0000000000006180L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleSqlFragment4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleSqlFragment4587 = new BitSet(new long[]{0x000000001C006380L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleSqlFragment4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleSqlFragment4626 = new BitSet(new long[]{0x0000000004E80010L});
    public static final BitSet FOLLOW_ruleMetaSql_in_ruleSqlFragment4646 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleSqlFragment4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleSqlFragment4675 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleDatabaseColumn_in_ruleSqlFragment4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlValue_in_entryRuleSqlValue4733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlValue4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleSqlValue4785 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleSqlValue4811 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleSqlValue4837 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSqlValue4863 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSqlValue4889 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleSqlValue4915 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleSqlValue4941 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleSqlValue4967 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleSqlValue4993 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleSqlValue5019 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleSqlValue5045 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleSqlValue5071 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleSqlValue5097 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleSqlValue5123 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleSqlValue5149 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleSqlValue5175 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleSqlValue5201 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleSqlValue5227 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleSqlValue5253 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleSqlValue5279 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleSqlValue5305 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleSqlValue5331 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleSqlValue5357 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleSqlValue5540 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleSqlValue5566 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleSqlValue5592 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSqlValue5618 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSqlValue5644 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleSqlValue5670 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleSqlValue5696 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleSqlValue5722 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleSqlValue5748 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleSqlValue5774 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleSqlValue5800 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleSqlValue5826 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleSqlValue5852 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleSqlValue5878 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleSqlValue5904 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleSqlValue5930 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleSqlValue5956 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleSqlValue5982 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleSqlValue6008 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleSqlValue6034 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleSqlValue6060 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleSqlValue6086 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleSqlValue6112 = new BitSet(new long[]{0x00000001DEFDF3D2L});
    public static final BitSet FOLLOW_ruleMetaSql_in_entryRuleMetaSql6160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaSql6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMetaSql6207 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6227 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql6239 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6259 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleMetaSql6286 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_ruleIfSqlCond_in_ruleMetaSql6312 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql6323 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6343 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql6355 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6375 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleMetaSql6402 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6428 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql6440 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6460 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql6487 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6513 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql6525 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6545 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMetaSql6572 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMetaSql6589 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMetaSql6607 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql6633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleMetaSql6658 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMetaSql6674 = new BitSet(new long[]{0x00000001FFFBFFF0L});
    public static final BitSet FOLLOW_ruleOrdSql_in_ruleMetaSql6694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSql_in_entryRuleIfSql6731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSql6741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSqlFragment_in_ruleIfSql6786 = new BitSet(new long[]{0x00000001FFBBFFF2L});
    public static final BitSet FOLLOW_ruleIfSqlFragment_in_entryRuleIfSqlFragment6822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSqlFragment6832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSqlValue_in_ruleIfSqlFragment6878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleIfSqlFragment6896 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_ruleColumn_in_ruleIfSqlFragment6916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIfSqlFragment6935 = new BitSet(new long[]{0x0000000000006180L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleIfSqlFragment6955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleIfSqlFragment6974 = new BitSet(new long[]{0x000000001C006380L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleIfSqlFragment6994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleIfSqlFragment7013 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleDatabaseColumn_in_ruleIfSqlFragment7033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleIfSqlFragment7052 = new BitSet(new long[]{0x0000000000680010L});
    public static final BitSet FOLLOW_ruleIfMetaSql_in_ruleIfSqlFragment7072 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleIfSqlFragment7083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSqlValue_in_entryRuleIfSqlValue7120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSqlValue7131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleIfSqlValue7172 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleIfSqlValue7198 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIfSqlValue7224 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIfSqlValue7250 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlValue7276 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleIfSqlValue7302 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleIfSqlValue7328 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleIfSqlValue7354 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleIfSqlValue7380 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleIfSqlValue7406 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleIfSqlValue7432 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleIfSqlValue7458 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlValue7484 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleIfSqlValue7510 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleIfSqlValue7536 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleIfSqlValue7562 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleIfSqlValue7588 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleIfSqlValue7614 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleIfSqlValue7640 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleIfSqlValue7666 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleIfSqlValue7692 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleIfSqlValue7718 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleIfSqlValue7894 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleIfSqlValue7920 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIfSqlValue7946 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIfSqlValue7972 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlValue7998 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleIfSqlValue8024 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleIfSqlValue8050 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleIfSqlValue8076 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleIfSqlValue8102 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleIfSqlValue8128 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleIfSqlValue8154 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleIfSqlValue8180 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlValue8206 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleIfSqlValue8232 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleIfSqlValue8258 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleIfSqlValue8284 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleIfSqlValue8310 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleIfSqlValue8336 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleIfSqlValue8362 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleIfSqlValue8388 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleIfSqlValue8414 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleIfSqlValue8440 = new BitSet(new long[]{0x00000001DEB9F3F2L});
    public static final BitSet FOLLOW_ruleIfMetaSql_in_entryRuleIfMetaSql8488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfMetaSql8498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfMetaSql8535 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8555 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql8567 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8587 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleIfMetaSql8614 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_ruleIfSqlCond_in_ruleIfMetaSql8640 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql8651 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8671 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql8683 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8703 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleIfMetaSql8730 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8756 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql8768 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8788 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql8815 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8841 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql8853 = new BitSet(new long[]{0x00000001FFBBFFF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql8873 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleIfSqlCond_in_entryRuleIfSqlCond8912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSqlCond8922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlCond8959 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_ruleIfSqlBool_in_ruleIfSqlCond8981 = new BitSet(new long[]{0x00000000C0000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlCond8993 = new BitSet(new long[]{0x00000000C0000012L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleIfSqlCond9014 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleIfSqlCond9034 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlCond9054 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_ruleIfSqlBool_in_ruleIfSqlCond9076 = new BitSet(new long[]{0x00000000C0000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlCond9088 = new BitSet(new long[]{0x00000000C0000012L});
    public static final BitSet FOLLOW_ruleIfSqlBool_in_entryRuleIfSqlBool9127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSqlBool9137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlBool9180 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIfSqlBool9197 = new BitSet(new long[]{0x0000000000006180L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleIfSqlBool9217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlBool9242 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleIfSqlBool9259 = new BitSet(new long[]{0x000000001C006380L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleIfSqlBool9279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlBool9304 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleIfSqlBool9321 = new BitSet(new long[]{0x0000000000108C10L});
    public static final BitSet FOLLOW_ruleIfSqlCond_in_ruleIfSqlBool9341 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleIfSqlBool9352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrdSql_in_entryRuleOrdSql9388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrdSql9398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrdSql2_in_ruleOrdSql9443 = new BitSet(new long[]{0x00000001FFFBFFF2L});
    public static final BitSet FOLLOW_ruleOrdSql2_in_entryRuleOrdSql29479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrdSql29489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrdSqlValue_in_ruleOrdSql29535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOrdSql29553 = new BitSet(new long[]{0x0000000000006180L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleOrdSql29573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleOrdSql29592 = new BitSet(new long[]{0x000000001C006380L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleOrdSql29612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleOrdSql29631 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleDatabaseColumn_in_ruleOrdSql29651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrdSqlValue_in_entryRuleOrdSqlValue9689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrdSqlValue9700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleOrdSqlValue9741 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleOrdSqlValue9767 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleOrdSqlValue9793 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleOrdSqlValue9819 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleOrdSqlValue9845 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleOrdSqlValue9871 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleOrdSqlValue9897 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleOrdSqlValue9923 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleOrdSqlValue9949 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOrdSqlValue9975 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOrdSqlValue10001 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleOrdSqlValue10027 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleOrdSqlValue10053 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleOrdSqlValue10079 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleOrdSqlValue10105 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleOrdSqlValue10131 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleOrdSqlValue10157 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleOrdSqlValue10183 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleOrdSqlValue10209 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleOrdSqlValue10235 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleOrdSqlValue10261 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleOrdSqlValue10287 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleOrdSqlValue10313 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleOrdSqlValue10339 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleOrdSqlValue10365 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleOrdSqlValue10562 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleOrdSqlValue10588 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleOrdSqlValue10614 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleOrdSqlValue10640 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleOrdSqlValue10666 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleOrdSqlValue10692 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleOrdSqlValue10718 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleOrdSqlValue10744 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleOrdSqlValue10770 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOrdSqlValue10796 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOrdSqlValue10822 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleOrdSqlValue10848 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleOrdSqlValue10874 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleOrdSqlValue10900 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleOrdSqlValue10926 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleOrdSqlValue10952 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleOrdSqlValue10978 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleOrdSqlValue11004 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleOrdSqlValue11030 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleOrdSqlValue11056 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleOrdSqlValue11082 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleOrdSqlValue11108 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleOrdSqlValue11134 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleOrdSqlValue11160 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleOrdSqlValue11186 = new BitSet(new long[]{0x00000001DFFBF3F2L});
    public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn11234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumn11244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumn11288 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleColumn11308 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleColumn11328 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleColumn11354 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumn11371 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleColumn11394 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumn11413 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleColumn11433 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant11481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant11491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleConstant11535 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleConstant11555 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstant11583 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleConstant11603 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleConstant11629 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstant11646 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleConstant11669 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstant11688 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleConstant11708 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier11756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier11766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleIdentifier11810 = new BitSet(new long[]{0x0000000000006380L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleIdentifier11830 = new BitSet(new long[]{0x0000000000006380L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleIdentifier11850 = new BitSet(new long[]{0x0000000000006380L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleIdentifier11878 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleIdentifier11898 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifier11926 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleIdentifier11946 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIdentifier11966 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleIdentifier11992 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifier12009 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleIdentifier12032 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifier12051 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIdentifier12071 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleDatabaseColumn_in_entryRuleDatabaseColumn12119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatabaseColumn12129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleDatabaseColumn12172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleDatabaseColumn12192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingRule_in_entryRuleMappingRule12235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingRule12245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingRule12287 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleMappingRule12303 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ruleMAPPING_TYPE_in_ruleMappingRule12323 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleMappingRule12335 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingRule12351 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleMappingRule12369 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMappingRule12379 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleMappingRule12399 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleMappingRule12410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping12445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping12455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMapping12492 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_ruleMappingItem_in_ruleMapping12514 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMapping12527 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_ruleMappingItem_in_ruleMapping12549 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMapping12563 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleMappingItem_in_entryRuleMappingItem12600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingItem12610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingItem12654 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMappingItem12674 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMappingItem12694 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingItem12710 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMappingItem12728 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleMappingColumn_in_ruleMappingItem12748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingColumn_in_entryRuleMappingColumn12788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingColumn12798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingColumn12842 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleMappingColumn12862 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleMappingColumn12882 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingColumn12900 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMappingColumn12920 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOptionalFeature_in_entryRuleOptionalFeature12966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalFeature12976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleOptionalFeature13018 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOptionalFeature13034 = new BitSet(new long[]{0x1F00000000000000L});
    public static final BitSet FOLLOW_ruleOPTION_TYPE_in_ruleOptionalFeature13054 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleOptionalFeature13066 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleOptionalFeature13082 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOptionalFeature13100 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleOptionalFeature13110 = new BitSet(new long[]{0x00000001FFFFFFD0L});
    public static final BitSet FOLLOW_ruleFeatureValue_in_ruleOptionalFeature13130 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleOptionalFeature13141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureValue_in_entryRuleFeatureValue13177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureValue13188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleFeatureValue13228 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleFeatureValue13254 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleFeatureValue13280 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleFeatureValue13306 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleFeatureValue13332 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleFeatureValue13358 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureValue13384 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleFeatureValue13410 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleFeatureValue13436 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleFeatureValue13462 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleFeatureValue13488 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleFeatureValue13514 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleFeatureValue13540 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleFeatureValue13566 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleFeatureValue13592 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleFeatureValue13618 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleFeatureValue13644 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleFeatureValue13670 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleFeatureValue13696 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleFeatureValue13722 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleFeatureValue13748 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleFeatureValue13774 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleFeatureValue13800 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleFeatureValue13826 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleFeatureValue13852 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleFeatureValue13878 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleFeatureValue13904 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleFeatureValue13930 = new BitSet(new long[]{0x00000001FFFFFFD2L});
    public static final BitSet FOLLOW_52_in_ruleSTATEMEN_TYPE13990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleSTATEMEN_TYPE14007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleSTATEMEN_TYPE14024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleMAPPING_TYPE14068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOPTION_TYPE14112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleOPTION_TYPE14129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOPTION_TYPE14146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleOPTION_TYPE14163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleOPTION_TYPE14180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred1_InternalProcessorDsl1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred2_InternalProcessorDsl5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred3_InternalProcessorDsl7735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred4_InternalProcessorDsl10382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred5_InternalProcessorDsl11349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred6_InternalProcessorDsl11389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred7_InternalProcessorDsl11624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred8_InternalProcessorDsl11664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred9_InternalProcessorDsl11987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred10_InternalProcessorDsl12027 = new BitSet(new long[]{0x0000000000000002L});

}